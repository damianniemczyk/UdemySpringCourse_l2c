package main.java.com.c4s.vanilla;


public class Main {

    public static void main(String[] args) {

        //create the object
        Coach theCoach = new TrackCoach();

        //use the object
        System.out.println(theCoach.getDailyWorkout());

    }

}







//        boolean keepGoing = true;
//        int count = 0;
//        int x = 3;
//        while (count++ < 3) {
//            int y = (1 + 2 * count) % 3;
//            switch (y) {
//                default:
//                case 0:
//                    x -= 1;
//                    break;
//                case 1:
//                    x += 5;
//            }
//        }
//        System.out.println(x);
