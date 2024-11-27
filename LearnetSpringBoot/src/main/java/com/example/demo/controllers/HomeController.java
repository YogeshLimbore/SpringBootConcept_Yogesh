package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// It is test controller
@Controller
public class HomeController {
	
	@GetMapping("/")
    public String HomePage(Model model) {
        return "Home";
    }
}
