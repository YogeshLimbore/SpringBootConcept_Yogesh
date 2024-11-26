package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.models.PhoneModel;
@Controller
public class PhoneController {
	@Autowired
	private PhoneModel phoneModel;
	
	@GetMapping("/phone-details")
	public String PhoneDetails(Model model)
	{
		model.addAttribute("phoneData", phoneModel);
		return "phoneDeatils";
	}

}
