package br.com.campanhas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.campanhas.dao.campanhaDao;


@RestController
@RequestMapping({"/campanha"})
public class campanha {
	
	private campanhaDao campanha;
	
	campanha (campanhaDao campanha){
		this.campanha = campanha;
	}
	
	// metodos crud
	@PostMapping
	@RequestMapping({"/campanha/cria"})
	public campanha cria(@RequestBody campanhaDao campanha) {
		return repository.save(campanha);
		
	}
	
}
