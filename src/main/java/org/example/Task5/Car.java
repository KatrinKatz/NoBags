package org.example.Task5;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;
    private double position;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void  setModel(String model) {
        this.model = model;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public String getBrand() {
        return this.brand;
    }
    public int getYear(){
        return this.year;
    }
    public String getModel(){
        return this.model;
    }
    public double getPosition(){
        return this.position;
    }

    @Override
    public void start() {
        System.out.println("\nTask5\n");
        System.out.println("Point of start: " + this.position);
    }

    @Override
    public void stop() {
        System.out.println("Point of stop: " + this.position);
    }

    @Override
    public double drive(double distance) {
        this.position = distance + 12.3;
        System.out.println("Car distance: " + distance);
        return distance;
    }
}
