package org.example.greeting;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService12hourFormat implements TimeService{
    @Override
    public int getTime() {
        int hour = LocalDateTime.now().getHour();
        hour = hour>12? hour-12: hour;
        return hour;
    }
}
