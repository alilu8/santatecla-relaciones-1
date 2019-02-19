package es.santatecla.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.*;

@Controller
public class UnitController {
	
	@RequestMapping("/index")
	public String unit(Model model) {
		
		int[] unitsArray = new int[4];
		for (int i = 0; i < unitsArray.length; i++) {
			unitsArray[i] = i;
		}
		model.addAttribute("units", "holi");
		
		return "index";
		
	}
	
	public static void main(String[] args) {
		
	}
	
	

}
