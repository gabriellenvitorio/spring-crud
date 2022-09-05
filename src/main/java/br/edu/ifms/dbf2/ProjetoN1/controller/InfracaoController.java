package br.edu.ifms.dbf2.ProjetoN1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifms.dbf2.ProjetoN1.model.Infracao;
import br.edu.ifms.dbf2.ProjetoN1.service.InfracaoService;

@Controller
public class InfracaoController{
	
	@Autowired
	private InfracaoService infracaoService;
	
	@GetMapping("/infracoes")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaInfracoes");
		
		modelAndView.addObject("infracoes", infracaoService.buscarTodos());
		modelAndView.addObject(new Infracao());
		
		return modelAndView;
	}
	
	@PostMapping("/infracoes")
	public String salvar(Infracao infracao) {
		infracaoService.salvar(infracao);
		return "redirect:/infracoes";
	}
	
	@GetMapping("/infracao/{id}")
	public ModelAndView editar(@PathVariable("id") Long id) {
		ModelAndView modelAndView = new ModelAndView("EditaInfracao");
		
		modelAndView.addObject(infracaoService.procurar(id));
		
		return modelAndView;
	}
	
	@GetMapping("/infracao/deletar/{id}")
	public String deletar(@PathVariable("id") Long id) {
		infracaoService.deletar(id);
		return "redirect:/infracoes";
	}
}