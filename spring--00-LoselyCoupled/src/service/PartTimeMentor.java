package service;

import implementation.Mentor;

public class PartTimeMentor implements Mentor {

    @Override
    public void creteAccount() {
        System.out.println("Part Time Mentor Account created");
    }
}