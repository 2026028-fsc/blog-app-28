package com.example.blog_app;

public class BlogForm {
    private String text;
    private String title;
    private Long id;

    public BlogForm(String text, String title, Long id) {
        this.text = text;
        this.title = title;
        this.id = id;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
