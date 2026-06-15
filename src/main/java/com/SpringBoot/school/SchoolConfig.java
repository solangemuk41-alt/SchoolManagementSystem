package com.SpringBoot.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {


    @Bean
    public com.SpringBoot.school.Student student() {
        return new com.SpringBoot.school.Student("Amina Uwase", 20, "Computer Science");
    }

    @Bean
    public com.SpringBoot.school.Enrollment enrollment() {
        return new com.SpringBoot.school.Enrollment(student());
    }
}
