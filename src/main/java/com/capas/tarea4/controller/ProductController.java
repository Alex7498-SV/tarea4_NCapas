package com.capas.tarea4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
	
	@GetMapping("/producto")
	public String producto(){
		return "index";
	}

}
