package com.example.itbooks;

public class Book {
    private String name;
    private String description;

    public static final Book[] books = {
            new Book("Java", "About Java for beginner"),
            new Book("Java programming", "About Java SE"),
            new Book("Java for Android", "About Android OS and Java")
    };

    private Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return  this.name;
    }
}
