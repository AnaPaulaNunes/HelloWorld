package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {	
	@GetMapping	
	public String bsm() {
		return "As BSM's são: <br>"
				+ "<br> Mentalidades: <br>"
				+ "Responsabilidade pessoal <br>"
				+ "Orientação ao futuro <br>"
				+ "Mentalidade de crescimento <br>"
				+ "Mentalidade de persistência <br>"
				+ "<br> Competências comportamentais: <br>"
				+ "Comunicação <br>"
				+ "Proatividade <br>"
				+ "Orientação ao detalhe <br>"
				+ "Trabalho em equipe <br>";

}
}
