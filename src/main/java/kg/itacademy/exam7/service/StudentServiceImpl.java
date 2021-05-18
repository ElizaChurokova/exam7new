package kg.itacademy.exam7.service;

import kg.itacademy.exam7.entity.Student;
import kg.itacademy.exam7.entity.UserRole;
import kg.itacademy.exam7.model.StudentModel;
import kg.itacademy.exam7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public Student create(StudentModel studentModel) {
        Student student = new Student();
        student.setFullName(studentModel.getFullName());
        student.setLogin(studentModel.getLogin());
        student.setPassword(studentModel.getPassword());
        student.setRegistrationDate(LocalDateTime.now());
        student.setPaymentSum(studentModel.getPaymentSum());
        student.setCourse(studentModel.getCourse());
        Student savedStudent = studentRepository.save(student);
        userRoleService.create(new UserRole("ROLE_USER",savedStudent));
        return savedStudent;
    }

    @Override
    public Student findById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student deleteById(Long id) {
        Student student = findById(id);
        if(student != null) {
            studentRepository.delete(student);
            return student;
        }

        return null;
    }
}
