package es.santatecla.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.*;


@SpringBootApplication
public class Application {
	@Autowired
	public UnitController unitcontroller;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		

	}

}
