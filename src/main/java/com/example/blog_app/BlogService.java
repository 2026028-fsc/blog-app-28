package com.example.blog_app;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public void add(BlogForm form) {
        blogRepository.save(new Blog(form.getTitle(), form.getText(), form.getId(), form.getDateTime()));
    }
}
