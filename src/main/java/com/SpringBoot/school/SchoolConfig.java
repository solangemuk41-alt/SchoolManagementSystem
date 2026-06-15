package com.SpringBoot.school;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolConfig {

    @Bean
    public Person person() {
        return new Person("Jean Pierre", 35, "jeanpierre@school.rw");
    }

    @Bean
    public Teacher teacher() {
        return new Teacher("Mr. Manzi", "Computer Science", 10);
    }

    @Bean
    public Course course() {
        return new Course("Software Engineering", "CS301", 4, teacher());
    }

    @Bean
    public Student student() {
        return new Student("teta Uwase", 20, "Software Engineering");
    }

    @Bean
    public Enrollment enrollment() {
        return new Enrollment(student());
    }
}
