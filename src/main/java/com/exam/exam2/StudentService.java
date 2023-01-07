package com.exam.exam2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addService(Student student){
        studentRepository.addRepository(student);
    }
    public Student getService(int id){
        return studentRepository.getRepository(id);
    }
}
