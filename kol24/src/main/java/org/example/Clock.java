package org.example;

import java.time.LocalTime;

public abstract class Clock {

    public int hours;
    public int minutes;
    public int seconds;
    private City city;

    protected Clock(City city) {
        this.city = city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setCurrentTime(){
        hours = LocalTime.now().getHour();
        minutes = LocalTime.now().getMinute();
        seconds = LocalTime.now().getSecond();
    }

    public void setTime(int h, int m, int s){
            if (h>24 || h<0){
                throw new IllegalArgumentException(String.format("Wrong format for hours: %d", h));
            }
            if (m>60 || m<0){
                throw new IllegalArgumentException(String.format("Wrong format for minutes: %d", m));
            }
            if (s>60 || s<0){
                throw new IllegalArgumentException(String.format("Wrong format for seconds: %d", s));
            }
            else {
                hours = h;
                minutes = m;
                seconds = s;
            }
    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        if (hours < 10){
            result.append("0").append(hours).append(":").append(minutes).append(":").append(seconds);
        }
        else {
            result.append(hours).append(":").append(minutes).append(":").append(seconds);
        }
        return result.toString();
    }




}
