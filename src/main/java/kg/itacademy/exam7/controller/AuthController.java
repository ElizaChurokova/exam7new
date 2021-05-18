package kg.itacademy.exam7.controller;

import kg.itacademy.exam7.entity.Student;
import kg.itacademy.exam7.model.StudentModel;
import kg.itacademy.exam7.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    @RequestMapping("/create")
    public Student createStudent(@RequestBody StudentModel studentModel){
        return studentService.create(studentModel);
    }
}
