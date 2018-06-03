package com.app.cloud.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class AppController {
    

	

	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		//List<Produit> produit = service.findAllProduit();
		//model.addAttribute("produit", produit);
		return "Produit";
	}

	
}



