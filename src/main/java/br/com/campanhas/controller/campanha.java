package br.com.campanhas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.campanhas.domain.campanha;


@RestController
@RequestMapping({"/campanha"})
public class campanha {
	
	private campanha campanha;
	
	campanha (campanha campanha){
		this.campanha = campanha;
	}
	
	// metodos crud
	@PostMapping
	@RequestMapping({"/campanha/cria"})
	public campanha cria(@RequestBody campanha campanha) {
		return repository.save(campanha);
		
	}
	
}
