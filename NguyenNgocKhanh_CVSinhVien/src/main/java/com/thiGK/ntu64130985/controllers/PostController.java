package com.thiGK.ntu64130985.controllers;

import com.thiGK.ntu64130985.models.Post;
import com.thiGK.ntu64130985.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post_list";
    }

    @GetMapping("/new")
    public String addPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post_form";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute Post post) {
        postService.savePost(post);
        return "redirect:/post/all";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/post/all";
    }
}
