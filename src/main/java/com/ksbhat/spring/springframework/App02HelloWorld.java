package com.ksbhat.spring.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorld {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean(EmployeePerson.class));
        }


//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }
}
