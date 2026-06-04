package com.example.blog_app;

public class Blog {
    private String text;
    private String title;
    private Long id;

    public Blog(String text, String title,Long id) {
        this.text = text;
        this.title = title;
        this.id=id;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
    public Long getId() {
        return id;
    }
}
