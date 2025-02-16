package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;


@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private int likes;
    private Date creationDate;

    public Post(Long id, String text, Date date) {
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }

    public Post() {
    }

    public int getLikes() {return likes;}
    public void setLikes(Integer likes) {this.likes = likes;}
    public String getText() {return text;}
    public Date getCreationDate() {return creationDate;}
    public Long getId() {return id;}
}