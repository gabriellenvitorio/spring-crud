package br.edu.ifms.dbf2.ProjetoN1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifms.dbf2.ProjetoN1.model.Carro;
import br.edu.ifms.dbf2.ProjetoN1.service.CarroService;

@Controller
public class CarroController {
	
	@Autowired
	private CarroService carroService;

	@GetMapping("/carros")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaCarros");
		
		modelAndView.addObject("carros", carroService.buscarTodos());
		modelAndView.addObject(new Carro());
		
		return modelAndView;
	}
	
	@PostMapping("/carros")
	public String salvar(Carro carro) {
		carroService.salvar(carro);
		return "redirect:/carros";
	}

	@GetMapping("/carro/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView("EditaCarro");
		
		modelAndView.addObject(carroService.procurar(id));
		
		return modelAndView;
	}
	
	@GetMapping("/carro/deletar/{id}")
	public String deletar(@PathVariable("id") Long id) {
		carroService.deletar(id);
		return "redirect:/carros";
	}
	
	@GetMapping("/")
	public String paginaPrincipal() {
		return "redirect:carros";
	}
}