package org.example.Task4;

public class Clock implements Readable {
    private int hours;
    private int min;
    private int sec;

    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMin() {
        return this.min;
    }
     public int getSec(){
        return this.sec;
     }

     public void tick() {
        sec = sec + 1;
        if (sec >= 60) {
            sec = 0;
            min = min + 1;
            if (min >= 60) {
                min = 0;
                hours = hours + 1;
                if (hours >= 24) {
                         hours = 0;
                     }
                 }
             }
         }

    @Override
    public void readTime() {
        System.out.println("Current time: "+ hours + " hours "+  min + " minutes " + sec + " seconds");
    }
}

