package br.edu.ifms.dbf2.ProjetoN1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Teste {
	@GetMapping("/teste2")
	public String testarComBootstrap() {
		return "SegundoTeste";
	}
}