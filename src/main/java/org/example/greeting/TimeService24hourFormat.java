package org.example.greeting;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TimeService24hourFormat implements TimeService{
    @Override
    public int getTime() {
        return LocalDateTime.now().getHour();
    }
}
