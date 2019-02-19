package br.com.siapessoal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.siapessoal.service.UserService;

@Controller

public class UserController{

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/usuarios")
	public String index(Model model){
		model.addAttribute("users", userService.listAll());
		return "/usuarios";
	}
	
	/*@GetMapping("/new")
	public String formuser(Model model){
		model.addAttribute("user", new User());
		return "formuser";
	}*/

}