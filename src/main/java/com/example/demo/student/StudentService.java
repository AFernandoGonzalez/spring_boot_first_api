package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Fernando Gonzalez",
                        "fer123@gmail.com",
                        LocalDate.of(2000, 11, 1),
                        21
                )
        ) ;
    }
}
