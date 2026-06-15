package com.SpringBoot.school;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int age;
    private String course;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Unassigned";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Student: " + name + " | Age: " + age + " | Course: " + course);
    }
}
