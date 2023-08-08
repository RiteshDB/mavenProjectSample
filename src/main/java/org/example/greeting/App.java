package org.example.greeting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.greeting");
        EnglishGreetingService greetingService = (EnglishGreetingService) context.getBean("englishGreetingService");
        EnglishGreetingService greetingService1 = (EnglishGreetingService) context.getBean("englishGreetingService");
        greetingService.greet("Ritesh");
        System.out.println("the time of this log is "+ greetingService.getTimeService().getTime());
        System.out.println("Comparision of beans. "+(greetingService==greetingService1));


    }
}
