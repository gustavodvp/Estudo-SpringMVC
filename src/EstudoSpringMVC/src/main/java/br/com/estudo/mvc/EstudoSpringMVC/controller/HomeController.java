package br.com.estudo.mvc.EstudoSpringMVC.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.estudo.mvc.EstudoSpringMVC.model.ProductOrder;
import java.util.List;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home(Model model) {
		ProductOrder productOrder = new ProductOrder();
		productOrder.setProductName("Notebook Gamer Acer Nitro 5");
		productOrder.setProductDescription("Notebook da Acer");
		productOrder.setProductImage("https://m.media-amazon.com/images/I/81lO5pdJAbL._AC_SX450_.jpg");
		productOrder.setProductURL("https://www.amazon.com.br/dp/B09JVHNF4Q/ref=s9_acsd_hps_bw_c2_x_0_t?pf_rd_m=A3RN7G7QC5MWSZ&pf_rd_s=merchandised-search-8&pf_rd_r=MTNPMJ24XE4JJ1B72PPW&pf_rd_t=101&pf_rd_p=d151abd6-f44f-49ff-835f-36eb0c8da138&pf_rd_i=17923699011");
		
		List<ProductOrder> listProducts = Arrays.asList(productOrder);
		model.addAttribute("products", listProducts);
		
		return "home";
	}
}