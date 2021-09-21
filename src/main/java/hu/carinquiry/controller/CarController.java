package hu.carinquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.carinquiry.service.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService service;

	@GetMapping("makes")
	public String home(Model model) {
		
		model.addAttribute("make", service.findCarByMaked());
		return "home";
	}
	@GetMapping("")
	public String welcomePage() {
		return "/index";
	}
	@RequestMapping("login")
	public String login() {
		return "home";
	}
}
