package com.cybertek.services;

import com.cybertek.interfaces.ExtraCourse;
import org.springframework.stereotype.Component;

@Component
public class InterviewPrep implements ExtraCourse {
    @Override
    public int getTeachingHours() {
        return 6;
    }
}
