package com.example.blog_app;

import java.time.LocalDateTime;

public class Blog {
    private String text;
    private String title;
    private Integer id;
    private LocalDateTime dateTime;

    public Blog(String text, String title,Integer id,LocalDateTime datetime) {
        this.text = text;
        this.title = title;
        this.id=id;
        this.dateTime=datetime;

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
