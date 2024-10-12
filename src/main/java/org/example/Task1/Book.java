package org.example.Task1;

public class Book implements Displayable {
    private String name;
    private String author;
    private int year;

    public void setName (String name) {
        this.name = name;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }

    @Override
    public void display() {
        System.out.println("\nTask1\n\nBook's name: " + this.name);
        System.out.println("Book's author: " + this.author);
        System.out.println("Book's year: " + this.year);
    }

}
