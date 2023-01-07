package com.exam.exam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/addStudent3334")
    public ResponseEntity<String> addController(@RequestBody Student student){
        studentService.addService(student);
        return new ResponseEntity<>("Added Succesfully",HttpStatus.CREATED);
    }

    @GetMapping("/get-Student_new")
    public ResponseEntity<Student> getController(@RequestParam int id){
        Student ans=studentService.getService(id);
        return new ResponseEntity<>(ans, HttpStatus.CREATED);
    }

}
