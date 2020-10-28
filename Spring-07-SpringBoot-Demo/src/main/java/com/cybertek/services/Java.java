package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraCourse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;

    private ExtraCourse extraCourse;

    public Java(ExtraCourse extraCourse) {
        this.extraCourse = extraCourse;
    }

    @Override
    public int getTeachingHours() {
        return 15 + extraCourse.getTeachingHours();
    }
}
