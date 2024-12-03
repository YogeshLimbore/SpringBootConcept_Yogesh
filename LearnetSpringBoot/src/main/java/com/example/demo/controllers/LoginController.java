package com.example.demo.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String Loginpage()
	{
		return "LoginPage";
		
	}
	
	
	@PostMapping("/loginsubmit")
	@ResponseBody //Convet html response into json format
	public Map<String, String> login(@RequestBody Map<String, String> loginData){
		String username = loginData.get("username");
		String password = loginData.get("password");
		
		String message;
		if("admin".equals(username) && "password123".equals(password)) {
			message="Welcome, " + username + "!";
		}else {
			message = "Invalid username or password!";
		}
		
		Map<String, String> response = new HashMap<>();
		response.put("message", message);
		return response;
	}
	

}


