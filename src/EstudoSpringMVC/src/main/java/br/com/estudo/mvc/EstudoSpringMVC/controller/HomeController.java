package br.com.estudo.mvc.EstudoSpringMVC.controller;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.estudo.mvc.EstudoSpringMVC.model.ProductOrder;
import java.util.List;

@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home(Model model) {

		Query query = entityManager.createQuery("select p from ProductOrder p", ProductOrder.class);
		List<ProductOrder> resultList = query.getResultList();
		
		model.addAttribute("products", resultList);
		return "home";
	}
}