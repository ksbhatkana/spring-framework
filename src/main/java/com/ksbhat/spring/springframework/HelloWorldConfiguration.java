package com.ksbhat.spring.springframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) { }; //From JDK16, introduced to avoid creating
// unnecessary Getters, Setters and constructors. It is equivalent to class
record EmployeePerson(Person person) { };
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Hello World!";
    }

    @Bean
    public int age() {
        return 24;
    }

//    @Bean(name = "employee")
//    public Person person() {
//        return new Person(name(), age());
//    }

//    @Bean(name = "employee")
//    public Person person(String name, int age) {
//        return new Person(name, age);
//    }
    @Bean(name = "employee1")
    public Person person1() {
        return new Person("Ram", 20);
    }
//    @Bean(name = "employee2")
//    @Primary
//    public Person person2() {
//        return new Person("Rahim", 21);
//    }

    @Bean(name = "employee2")
    @Qualifier("qualifiedEmployee")
    public Person person2() {
        return new Person("Rahim", 21);
    }

    @Bean
    public EmployeePerson employeePerson(@Qualifier("qualifiedEmployee")Person person) {
        return new EmployeePerson(person);
    }
}
