package hu.carinquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hu.carinquiry.service.CarService;

@Controller
public class CarController {
	@Autowired
	private CarService service;

	@GetMapping("")
	public String home(Model model) {
		
		model.addAttribute("make", service.findCarByMaked());
		return "home";
	}
}
