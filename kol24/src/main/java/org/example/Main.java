package org.example;

import static org.example.DigitalClock.Type.AMPM;
import static org.example.DigitalClock.Type.NORMAL;

public class Main {
    public static void main(String[] args) {


        DigitalClock clock1 = new DigitalClock(AMPM);
        DigitalClock clock2 = new DigitalClock(NORMAL);

        clock1.setTime(13,46,15);
        clock2.setCurrentTime();

        System.out.println(clock1.toString());
        System.out.println(clock2.toString());



    }
}