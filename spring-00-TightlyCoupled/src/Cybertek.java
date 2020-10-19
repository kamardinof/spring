public class Cybertek {

    public static void main(String[] args) {
        FullTimeMentor fullTome = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTome, partTime);
        mentor.manageAccount();


    }
}
