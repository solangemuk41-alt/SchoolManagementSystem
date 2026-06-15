package com.SpringBoot.school;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String courseName;
    private String courseCode;
    private int credits;
    private Teacher teacher;

    public Course(String courseName, String courseCode, int credits, Teacher teacher) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void displayInfo() {
        System.out.println("Course  : " + courseName + " | Code: " + courseCode + " | Credits: " + credits);
        if (teacher != null) {
            System.out.println("Taught by → " + teacher.getName() + " (" + teacher.getSubject() + ")");
        }
    }
}