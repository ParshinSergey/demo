package com.example.demo.models;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    //private static long counter = 1000L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToOne(fetch = FetchType.LAZY)
   /* @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    //@JoinColumn(name="userId",referencedColumnName="user_id", insertable=false, updatable=false)
    @OnDelete(action = OnDeleteAction.CASCADE)*/
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
