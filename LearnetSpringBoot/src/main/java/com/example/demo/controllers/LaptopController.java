package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.LaptopModel;


@Controller
public class LaptopController {
	
	@Autowired
	private LaptopModel laptopModel;
	
	@GetMapping("/laptop-details")
	public String LaptopDetails(Model model)
	{
		model.addAttribute("laptopData", laptopModel);
		return "laptopDeatils";
	}

}
