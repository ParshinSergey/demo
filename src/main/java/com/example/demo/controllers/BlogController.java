package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class BlogController {

    private final PostRepository postRepository;

    public BlogController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd() {
        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title,
                              @RequestParam String anons,
                              @RequestParam String full_text,
                              @RequestParam String author) {
        Post post = new Post(title, anons, full_text, author);
        postRepository.save(post);
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Post> byId = postRepository.findById(id);
        if (byId.isPresent()) {
            Post post = byId.get();
            post.setViews(post.getViews() + 1);
            model.addAttribute("post", post);
            postRepository.save(post);
            return "blog-details";
        }
        else return "404";
    }

    @GetMapping("/blog/{id}/edit")
    public String blogEdit(@PathVariable(value = "id") long id, Model model) {
        Optional<Post> byId = postRepository.findById(id);
        if (byId.isPresent()) {
            Post post = byId.get();
            model.addAttribute("post", post);
            return "blog-edit";
        }
        else return "404";
    }

    @PostMapping("/blog/{id}/edit")
    public String postUpdate(@PathVariable(value = "id") long id,
                             @RequestParam String title,
                             @RequestParam String anons,
                             @RequestParam String full_text,
                             @RequestParam String author,
                             @RequestParam int views) {

        Post post = new Post(title, anons, full_text, author);
        post.setId(id);
        post.setViews(views);
        postRepository.save(post);
        return "redirect:/blog";
    }

    @PostMapping("/blog/{id}/remove")
    public String postDelete(@PathVariable(value = "id") long id){
        postRepository.deleteById(id);
        return "redirect:/blog";
    }
}
