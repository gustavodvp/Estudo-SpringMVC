package br.com.estudo.mvc.EstudoSpringMVC.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/hello")
	public String hello( HttpServletRequest request) {
		request.setAttribute("nome", "Teste");
		return "hello";
	}
}