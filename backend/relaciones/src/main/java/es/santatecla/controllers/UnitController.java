package es.santatecla.controllers;

import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnitController {
	
	@RequestMapping("/index")
	public String unit(Model model) {
		
		int[] unitsArray = new int[4];
		for (int i = 0; i < unitsArray.length; i++) {
			unitsArray[i] = i;
		}
		model.addAttribute("units", unitsArray );
		
		return "index";
		
	}
	
	

}
