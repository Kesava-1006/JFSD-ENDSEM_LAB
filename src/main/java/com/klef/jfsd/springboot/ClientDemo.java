package com.klef.jfsd.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        // Use ApplicationConfig.class instead of ApplicationConfig.java
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Fetch and print Employee bean
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        // Fetch and print Course bean
        Course course = context.getBean(Course.class);
        System.out.println(course);
    }
}
