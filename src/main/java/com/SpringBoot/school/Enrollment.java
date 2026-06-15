package com.SpringBoot.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Enrollment {

    private final Student student;

    @Autowired
    public Enrollment(Student student) {
        this.student = student;
    }

    public void enroll(String courseName) {
        student.setCourse(courseName);
        System.out.println("------------------------------");
        System.out.println("Enrollment Successful!");
        student.displayInfo();
        System.out.println("Status: Enrolled in → " + courseName);
        System.out.println("------------------------------");
    }

    public void printStudentCard() {
        System.out.println("======= STUDENT CARD =======");
        System.out.println("Name   : " + student.getName());
        System.out.println("Age    : " + student.getAge());
        System.out.println("Course : " + student.getCourse());
        System.out.println("============================");
    }
}
