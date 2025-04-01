package com.thiGK.ntu64130985.controllers;

import com.thiGK.ntu64130985.models.Page;
import com.thiGK.ntu64130985.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("/page")
public class PageController {
	 @Autowired
	    private PageService pageService;

	    @GetMapping("/all")
	    public String listPages(Model model) {
	        model.addAttribute("pages", pageService.getAllPages());
	        return "page_list";
	    }

	    @GetMapping("/new")
	    public String addPageForm(Model model) {
	        model.addAttribute("page", new Page());
	        return "page_form";
	    }

	    @PostMapping("/save")
	    public String savePage(@ModelAttribute Page page) {
	        pageService.savePage(page);
	        return "redirect:/page/all";
	    }

	    @GetMapping("/delete/{id}")
	    public String deletePage(@PathVariable Long id) {
	        pageService.deletePage(id);
	        return "redirect:/page/all";
	    }
}
