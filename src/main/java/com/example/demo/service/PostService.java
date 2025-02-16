package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        return posts;
    }
    public void AddPosts(int number){
        List<Post> Posts = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Post Post = new Post("Lorem Post " + i);
            for (int j = 0; j < i; j++) Post.Like();
            posts.add(Post);
        }
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

}
