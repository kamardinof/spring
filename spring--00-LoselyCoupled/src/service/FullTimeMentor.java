package service;

import implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void creteAccount() {
        System.out.println("Full Time Mentor Account created");
    }
}
