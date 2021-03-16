package com.aprendizagemSemana.aprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizagem")
public class AprendizagemController {
	@GetMapping
	public String aprendizagem() {
		return "Dominar SpringBoot";
	}
}
