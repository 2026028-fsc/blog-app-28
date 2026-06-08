package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {
    private final BlogService blogService;

    BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/blogs")
    public String blogs(Model model) {
        model.addAttribute("blogs", blogService.findAll());
        return "blogs";
    }

    @GetMapping("/new/blog")
    public String newblog(@ModelAttribute BlogForm blogForm) {
        return "new/blog";
    }

    @PostMapping("/blogs")
    public String POST(BlogForm blogForm) {
        blogService.add(blogForm);
        return "redirect:/blogs";
    }
        @PostMapping("/blogs/{id}/delete")
    public String delete(@PathVariable Long id) {
        blogService.deleteById(id);
        return "redirect:/blogs";
    }
}
