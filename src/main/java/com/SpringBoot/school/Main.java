package com.SpringBoot.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(com.SpringBoot.school.SchoolConfig.class);

        com.SpringBoot.school.Enrollment enrollment = context.getBean(com.SpringBoot.school.Enrollment.class);

        enrollment.enroll("Software Engineering");

       
        enrollment.printStudentCard();
    }
}
