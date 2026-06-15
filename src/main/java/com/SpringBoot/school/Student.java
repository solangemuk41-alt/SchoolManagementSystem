package com.SpringBoot.school;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String course) {
        super(name, age, name.toLowerCase().replace(" ", "") + "@student.rw");
        this.studentId = "STU" + (int)(Math.random() * 1000);
        this.course = course;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student : " + getName() + " | Age: " + getAge() + " | ID: " + studentId + " | Course: " + course);
    }
}