package com.SpringBoot.school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SchoolConfig.class);

        Enrollment enrollment = context.getBean(Enrollment.class);

        enrollment.enroll("Software Engineering");


        enrollment.printStudentCard();
    }
}
