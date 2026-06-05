package com.example.blog_app;

import java.time.LocalDateTime;

public class BlogForm {
    private String text;
    private String title;
    private int id;
    private LocalDateTime dateTime;

    public BlogForm(String text, String title, int id, LocalDateTime datetime) {
        this.text = text;
        this.title = title;
        this.id = id;
        this.dateTime = datetime;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getId() {
        return id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
