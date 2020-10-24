package cybertek.services;

import cybertek.interfaces.Course;
import cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    public int x;

    ExtraSessions extraSessions;


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours()));

    }
}
