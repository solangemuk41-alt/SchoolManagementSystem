package com.SpringBoot.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(SchoolConfig.class);

        System.out.println("============================================");
        System.out.println("        SCHOOL MANAGEMENT SYSTEM            ");
        System.out.println("============================================");


        Person person = (Person) context.getBean("person");
        System.out.println("\n--- PERSON ---");
        person.displayInfo();

        Teacher teacher = context.getBean(Teacher.class);
        System.out.println("\n--- TEACHER ---");
        teacher.displayInfo();

        Course course = context.getBean(Course.class);
        System.out.println("\n--- COURSE ---");
        course.displayInfo();

        Student student = (Student) context.getBean("student");
        System.out.println("\n--- STUDENT ---");
        student.displayInfo();

        Enrollment enrollment = context.getBean(Enrollment.class);
        System.out.println("\n--- ENROLLMENT ---");
        enrollment.enroll("Software Engineering");

        System.out.println("\n--- STUDENT CARD ---");
        enrollment.printStudentCard();

    }
}