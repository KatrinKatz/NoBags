package org.example.Task3;

public class Point implements Movable {
    private double x;
    private double y;

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public void moveUp() {
        System.out.println("\nTask3");
        x = this.getX();
        y = this.getY() * 2;
        System.out.println("\nAfter move to Up" + "\n" + "New position x: " + x + "\n" + "New position y: " + y);
    }

    @Override
    public void moveDown() {
        x = this.getX();
        y = this.getY() - 12;
        System.out.println("\nAfter move to Down" + "\n" + "New position x: " + x + "\n" + "New position y: " + y);

    }

    @Override
    public void moveLeft() {
        x = this.getX() + 1.3;
        y = this.getY() - 2.1;
        System.out.println("\nAfter move to Left" + "\n" + "New position x: " + x + "\n" + "New position y: " + y);

    }

    @Override
    public void moveRight() {
        x = this.getX() - 1.3;
        y = this.getY();
        System.out.println("\nAfter move to Right" + "\n" + "New position x: " + x + "\n" + "New position y: " + y);

    }
}
