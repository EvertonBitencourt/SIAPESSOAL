package br.com.siapessoal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.siapessoal.domain.User;
import br.com.siapessoal.service.UserService;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String loginForm(){
		return "/login";
	}
	
	/*@RequestMapping("efetuaLogin")
	public String efetuaLogin(User usuario, HttpSession session){
		if(UserService().existeUsuario(usuario)){
			session.setAttribute("usuarioLogado", usuario);
		}
	}*/


}
