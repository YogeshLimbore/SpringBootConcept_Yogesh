package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.models.AboutUsModel;

@Controller
public class AboutUsController {
	@Autowired
    private AboutUsModel aboutUsModel;

    @GetMapping("/aboutus")
    public String aboutusPage(Model model) {
        model.addAttribute("aboutUs", aboutUsModel);
        return "aboutus";
    }
}
