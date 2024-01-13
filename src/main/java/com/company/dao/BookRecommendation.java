package com.company.dao;

public class BookRecommendation {
    private String title;
    private String author;

    public BookRecommendation(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String toString() {
        return "BookRecommendation{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }



    // Getters and setters
}