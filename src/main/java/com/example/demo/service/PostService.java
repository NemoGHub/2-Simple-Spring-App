package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(int number){
        List<Post> Posts = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Post Post = new Post("Lorem Post " + i);
            for (int j = 0; j < i; j++) Post.Like();
            Posts.add(Post);
        }
        return Posts;
    }

    public Post[] listAllPostsAsArray(int number){
        Post[] Posts = new Post[3];
        for (int i = 0; i < number; i++) {
            Post Post = new Post("Lorem Post " + i);
            for (int j = 0; j < i; j++) Post.Like();
            Posts[i] = Post;
        }
        return Posts;
    }
}
