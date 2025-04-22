package com.thiGK.ntu64130985.controller;

import com.thiGK.ntu64130985.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/post")
public class PostController {
    private List<Post> postList = new ArrayList<>();

    public PostController() {
        postList.add(new Post(1, "Bài viết 1", "Nội dung 1", 100));
        postList.add(new Post(2, "Bài viết 2", "Nội dung 2", 101));
    }

    @GetMapping("/all")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postList);
        model.addAttribute("view", "post_list");
        return "layout";
    }

    @GetMapping("/new")
    public String addPostForm(Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("view", "post_addnew");
        return "layout";
    }

    @PostMapping("/save")
    public String savePost(@ModelAttribute Post post) {
        post.setId(postList.size() + 1);
        postList.add(post);
        return "redirect:/post/all";
    }

    @GetMapping("/view/{id}")
    public String viewPost(@PathVariable int id, Model model) {
        Post post = postList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        model.addAttribute("post", post);
        model.addAttribute("view", "post_view");
        return "layout";
    }

    @GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        postList.removeIf(p -> p.getId() == id);
        return "redirect:/post/all";
    }
}
