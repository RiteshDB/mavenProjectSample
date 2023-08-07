package org.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EnglishGreetingService implements GreetingService{

    //Dependency inject on field or property
    //@Autowired
    private TimeService timeService;

    //Dependency injection with the help of constructor.

    @Autowired
    public EnglishGreetingService(@Qualifier("timeService12hourFormat") TimeService timeService){
        this.timeService = timeService;
    }
    public TimeService getTimeService() {
        return timeService;
    }

    //setter dependency injection.
    //@Autowired
    public void setTimeService( TimeService timeService) {
        this.timeService = timeService;
    }


    @Override
    public void greet(String name) {
        System.out.println("Hello "+ name);
    }
}
