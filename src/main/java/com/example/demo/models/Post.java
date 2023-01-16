package com.example.demo.models;


import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    //private static long counter = 1000L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title, anons, full_text;

    private String author;

    private int views;

    public Post() {
    }

    public Post(String title, String anons, String full_text, String author ) {
        //this.id = ++counter;
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public Long getId() {
        return id;
    }
}
