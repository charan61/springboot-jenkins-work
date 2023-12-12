package com.spring.project.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("message", "welcome");
		return "welcome";
	}

}
