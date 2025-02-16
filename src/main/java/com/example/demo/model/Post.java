package com.example.demo.model;

import java.util.Calendar;
import java.util.Date;

public class Post {
    private String text;
    private int likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text){
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = new Date();
    }
    public Post(Long id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Long getId() {return id;}
    public String getText() {return text;}
    public int getLikes() {return likes;}
    public Date getCreationDate() {return creationDate;}

    public void setLikes(int likes){this.likes = likes;}
}
