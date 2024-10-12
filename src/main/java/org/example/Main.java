package org.example;

import org.example.Task1.Book;
import org.example.Task2.Student;
import org.example.Task3.Point;
import org.example.Task4.Clock;
import org.example.Task5.Car;

public class Main {
    public static void main(String[] args) {

        // Task1
        Book book1 = new Book();
        book1.setName("Metro 2033");
        book1.setAuthor("Dmitry Alekseyevich Glukhovsky");
        book1.setYear(2015);
        book1.display();

        //Task2
        Student student1 = new Student();
        student1.setName("Anton Beglov");
        student1.setGbid(153423534);
        student1.setAvgscore(4.6);
        student1.print();

        //Task3
        Point point1 = new Point();
        point1.setX(3.34);
        point1.setY(34);
        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();

        //Task4
        Clock clock1 = new Clock();
        clock1.setHours(13);
        clock1.setMin(3);
        clock1.setSec(45);
        System.out.println("\nTask4\n");
        clock1.readTime(); //45 сек
        clock1.tick();
        clock1.readTime(); //46 сек
        clock1.tick();
        clock1.readTime(); //47 сек
        clock1.tick();

        //Task5
        Car car1 = new Car();
        car1.setBrand("Volvo");
        car1.setModel("XC90");
        car1.setYear(2002);
        car1.setPosition(0);
        car1.start();
        car1.drive(32.5);
        car1.stop();
    }
}

