package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")   // routing
	public String welcome(Model model)
	{
		String university ="ULT";
		String formateur = "Amine Mezghich";
		model.addAttribute("faculte", university);
		model.addAttribute("prof", formateur);
		ArrayList<String> names = new ArrayList<>();
		names.add("Maryem");
		names.add("Ines");
		names.add("Baha");
		names.add("Ayoub");
		model.addAttribute("names", names);
		return "home/welcome";  // view
	}

}
