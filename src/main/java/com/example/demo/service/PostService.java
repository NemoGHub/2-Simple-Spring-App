package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPosts(){
        return posts;
    }
    public void AddPosts(int number){
        List<Post> Posts = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Post Post = new Post(Long.valueOf(i),"Lorem Post " + i); // Конечно, id нужно генерировать иначе.
            posts.add(Post);
        }
    }

    public void create(String text) {
        posts.add(new Post(generateRandomLong(),text, new Date()));
    }

    public static long generateRandomLong() {
        Random random = new Random();
        return random.nextLong(100); // Генерация случайного Long значения
    }
}
