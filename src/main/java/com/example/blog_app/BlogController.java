package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/blogs")
    public String blogs() {
        return "/blogs";
    }

    @PostMapping("/new/blog")
    public String newblog() {

        return "new/blog";
    }

}
