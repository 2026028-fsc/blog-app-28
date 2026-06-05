package com.example.blog_app;

import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepositry blogRepositry;

    public BlogService(BlogRepositry blogRepositry) {
        this.blogRepositry = blogRepositry;
    }
}
