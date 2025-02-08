package com.denzel.SpringSecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    private List<Student> students = new ArrayList<>( List.of(
            new Student(1, "drake", 100),
            new Student(2, "null", 30)
    ));

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }
}
