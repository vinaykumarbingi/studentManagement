package com.example.studentManagement.entity;


import javax.persistence.*;

@Entity
public class Student {

    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Id
    private Long studentId;
    private String username;
    private String password;
    private String role;
    private String name;
    private String email;

}
