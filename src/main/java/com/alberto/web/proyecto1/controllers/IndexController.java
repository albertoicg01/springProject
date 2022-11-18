package com.alberto.web.proyecto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


//notation - decorator
//It manages users requests
//A controller class is able to has too many methods
//every method is going to manage a different http request 
@Controller
@RequestMapping("/api")
public class IndexController {
	//A @RequestMapping belongs to a get http request
	//@GetMapping and @RequestMapping are equals
	@GetMapping(value={"/delete"})
	public String delete(Model model) {
		model.addAttribute("titulo","This part deletes info!");
		return "delete";
	}
	
	@GetMapping(value= {"/insert"})
	public String insert(Model model) {
		model.addAttribute("titulo","This part insert info!");
		return "insert";
		
	}
	
	@GetMapping(value= {"/update"})
	public String update(Model model) {
		model.addAttribute("titulo","This part updates info");
		return "update";
	}
	
}
