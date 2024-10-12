package org.example.Task2;

public class Student implements Printable{
    private String name;
    private long gbid;
    private double avgscore;

    public void setName(String name) {
        this.name = name;
    }

    public void setGbid (long gbid) {
        this.gbid = gbid;
    }

    public void setAvgscore (double avgscore) {
        this.avgscore = avgscore;
    }

    public String getName () {
        return this.name;
    }

    public long getGbid() {
        return this.gbid;
    }

    public double getAvgscore (){
        return this.avgscore;
    }

    @Override
    public void print() {
        System.out.println("\nTask2\n\nStudent's name: " + this.name);
        System.out.println("Student's Gradebook id: " + this.gbid);
        System.out.println("Student's Avarage score: " + this.avgscore);
    }
}
