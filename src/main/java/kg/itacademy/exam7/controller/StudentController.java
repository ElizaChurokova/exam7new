package kg.itacademy.exam7.controller;

import kg.itacademy.exam7.entity.Student;
import kg.itacademy.exam7.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    @RequestMapping("/all")
    public List<Student> getAll(Principal principal){
        principal.getName();
        return studentService.getAll();
    }
    @DeleteMapping("/api/{studentId}")
    public Student deleteById(@PathVariable Long studentId) {
        return studentService.deleteById(studentId);
    }

}
