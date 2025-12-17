package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
@RestController 
public class StudentController {
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public  Student addStudent(@RequestBody Student st){
        
        return 
    }
}