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
        jdbcClient.sql("INSERT INTO blogs (id,title, text,dateTime) values(:id, :title, :text, now())")
                .param("id", blog.getId())
                .param("title", blog.getTitle())
                .param("text", blog.getText())
                .param("dateTime", blog.getDateTime())
                .update();
    }

    public List<Blog> findAll() {
        return jdbcClient.sql("SELECT title, text,id,datetime FROM blogs")
                .query(Blog.class)
                .list();
    }

    public void deleteById(Long id) {
        jdbcClient.sql("DELETE FROM blogs WHERE id = :id")
                .param("id", id)
                .update();
    }
}
