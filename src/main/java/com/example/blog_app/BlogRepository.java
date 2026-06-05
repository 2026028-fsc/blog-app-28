package com.example.blog_app;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class BlogRepository {
    private final JdbcClient jdbcClient;

    public BlogRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void save(Blog blog) {
        jdbcClient.sql("INSERT INTO blogs (title, text) VALUES (?, ?)")
                .param(blog.getId())
                .param(blog.getTitle())
                .param(blog.getText())
                .param(blog.getDateTime())
                .update();
    }

    public List<Blog> findAll() {
        return jdbcClient.sql("SELECT title, text,id,datetime FROM blogs")
                .query(Blog.class)
                .list();
    }
}
