package com.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea4.domain.Product;

@Controller
public class ProductController {
	
	@GetMapping("/product_reg")
	public ModelAndView producto(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("product", new Product());
		
		return mav;
	}
	
	@RequestMapping("/sproduct")
	public ModelAndView validar(@Valid @ModelAttribute Product p, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}
		else {
			mav.setViewName("resultado");
			mav.addObject("msg", "Producto "+ p.getpName()+ " guardado con exito");
		}
		
		
		return mav;
	}

}
