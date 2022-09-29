package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosAprendizagemController {
	@GetMapping
	public String objetivos() {
		return "Objetivos de Aprendizagem: <br>"
				+ "Me tornar uma desenvolvedora <br>"
				+ "Codar com tranquilidade no Java <br>"
				+ "Concluir o bootcamp com sucesso <br>"
				+ "Aprender outras linguagens";
	
	}
}
