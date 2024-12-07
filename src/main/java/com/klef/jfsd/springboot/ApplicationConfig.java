package com.klef.jfsd.springboot;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Employee employee() {
        return new Employee(1, "Kesava", 50000.0, "IT", Arrays.asList("Java", "Spring", "Hibernate"));
    }

    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(101);
        instructor.setName("Krishna");
        instructor.setEmail("krishna@klef.com");
        instructor.setPhoneNumber("9876543210");
        return instructor;
    }

    @Bean
    public Course course(Instructor instructor) {
        Course course = new Course();
        course.setCourseId(501);
        course.setCourseName("Spring Framework");
        course.setCredits(3);
        course.setInstructor(instructor);
        return course;
    }
}