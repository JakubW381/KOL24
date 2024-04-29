package org.example;

public class DigitalClock extends Clock {

    public enum Type{NORMAL, AMPM};

    Type clockType;

    public DigitalClock(Type clockType) {
        super();
        this.clockType = clockType;
    }

    @Override
    public String toString() {
        if (clockType != Type.NORMAL && clockType !=Type.AMPM){
            throw new IllegalArgumentException("Wrong clock type");
        }
        if (clockType == Type.NORMAL){
        return super.toString();
        }
        else {
            StringBuilder result = new StringBuilder();
            if (hours > 12){
                hours -= 12;
                result.append(hours).append(":").append(minutes).append(":").append(seconds).append(" PM");
                return result.toString();
            }
            else {
                result.append(hours).append(":").append(minutes).append(":").append(seconds).append(" AM");
                return result.toString();
            }
        }
    }






}
