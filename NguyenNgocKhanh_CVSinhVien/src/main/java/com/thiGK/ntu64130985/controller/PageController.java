// controller/PageController.java
package com.thiGK.ntu64130985.controller;

import com.thiGK.ntu64130985.models.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/page")
public class PageController {
    private List<Page> pageList = new ArrayList<>();

 
    @GetMapping("/all")
    public String getAllPages(Model model) {
        model.addAttribute("pages", pageList);
        model.addAttribute("view", "page_list"); // chỉ định file con cần nhét vào layout
        return "layout";
    }

 
    @GetMapping("/new")
    public String addPageForm(Model model) {
        model.addAttribute("page", new Page());
        model.addAttribute("view", "page_addnew");
        return "layout";
    }


    @PostMapping("/save")
    public String savePage(@ModelAttribute Page page) {
        page.setId(pageList.size() + 1);
        pageList.add(page);
        return "redirect:/page/all";
    }

  
    @GetMapping("/view/{id}")
    public String viewPage(@PathVariable int id, Model model) {
        Page page = pageList.stream()
                            .filter(p -> p.getId() == id)
                            .findFirst()
                            .orElse(null);
        model.addAttribute("page", page);
        model.addAttribute("view", "page_view");
        return "layout";
    }

    
    @GetMapping("/delete/{id}")
    public String deletePage(@PathVariable int id) {
        pageList.removeIf(p -> p.getId() == id);
        return "redirect:/page/all";
    }
    
    
    
}
