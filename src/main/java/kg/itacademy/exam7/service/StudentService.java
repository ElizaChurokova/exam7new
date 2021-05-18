package kg.itacademy.exam7.service;

import kg.itacademy.exam7.entity.Student;
import kg.itacademy.exam7.model.StudentModel;

import java.util.List;

public interface StudentService {
    Student create(StudentModel studentModel);
    Student findById(Long studentId);
    List<Student> getAll();
    Student deleteById(Long id);


}
