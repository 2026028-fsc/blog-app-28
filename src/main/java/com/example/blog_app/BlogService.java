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

    public Blog find(Long id) {
        return blogRepository.find(id);
    }

    public void add(BlogForm form) {
        blogRepository.save(new Blog(form.getTitle(), form.getText(), form.getId(), form.getDateTime()));
    }

    public void deleteById(Long id) {
        blogRepository.deleteById(id);
    }
}
