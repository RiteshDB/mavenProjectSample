package org.example.greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.greeting");
        GreetingService greetingService = (GreetingService) context.getBean("englishGreetingService");

        greetingService.greet("Ritesh");

    }
}
