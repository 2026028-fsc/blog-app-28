package com.example.blog_app;

import java.time.LocalDateTime;

public class Blog {
    private String title;
    private String text;
    private Integer id;
    private LocalDateTime dateTime;

    public Blog(String title, String text, Integer id, LocalDateTime datetime) {
        this.title = title;
        this.text = text;
        this.id = id;
        this.dateTime = datetime;

    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
