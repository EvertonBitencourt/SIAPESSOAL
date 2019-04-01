package br.com.siapessoal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.siapessoal.domain.User;
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
	
	@GetMapping("/novoUsuario")
	public String formUser(Model model){
		model.addAttribute("user", new User());
		return "/novoUsuario";
	}
	
	@GetMapping("/editarUsuario/{id}")
	public String editUser(Model model, @PathVariable Long id){
		model.addAttribute("user", userService.getOne(id));
		return "/editarUsuario";
	}
	
	@GetMapping("/save")
	public String saveUser(@Valid User user){
		User userSaved = userService.save(user);
		return "redirect:/usuarios";
	}
}