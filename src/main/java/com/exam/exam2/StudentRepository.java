package com.exam.exam2;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository

public class StudentRepository {
    Map<Integer,Student>map=new HashMap<>();
    public void addRepository(Student student){
        int id= student.getRoll();
        map.put(id,student);
    }
    public Student getRepository(int id){
        return map.get(id);
    }
}
