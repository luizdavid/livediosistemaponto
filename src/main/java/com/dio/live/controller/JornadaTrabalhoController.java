package com.dio.live.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.service.JornadaTrabalhoService;


@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

	
	@Autowired
	JornadaTrabalhoService jornadaTrabalhoService;
	
	
	@PostMapping
	public JornadaTrabalho criarJornada(
			@RequestBody JornadaTrabalho jornadaTrabalho) {		
		return jornadaTrabalhoService.salvar(jornadaTrabalho);
	}
	
	
	@GetMapping
	public List<JornadaTrabalho> getJornadaList() {		
		return jornadaTrabalhoService.findAll();
	}
	
	
	@GetMapping("/{id}")
	public  ResponseEntity<JornadaTrabalho>   getJornadaList(@PathVariable("id") Long id) throws Exception {	
		JornadaTrabalho jornadaTrabalho =jornadaTrabalhoService.findById(id);
		
		if (jornadaTrabalho ==null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(jornadaTrabalho, HttpStatus.OK); 
	}
	
	
	@PutMapping("/{id}")
	public  ResponseEntity<JornadaTrabalho>   alterar(@PathVariable("id") Long id) throws Exception {	
		JornadaTrabalho jornadaTrabalho =jornadaTrabalhoService.findById(id);
		
		if (jornadaTrabalho ==null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			jornadaTrabalho = jornadaTrabalhoService.alterar(jornadaTrabalho);
		}
		return new ResponseEntity<>(jornadaTrabalho, HttpStatus.OK); 
	}
	
	
	@DeleteMapping("/{id}")
	public  ResponseEntity    apagar(@PathVariable("id") Long id) throws Exception {	
		JornadaTrabalho jornadaTrabalho =jornadaTrabalhoService.findById(id);
		
		if (jornadaTrabalho ==null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		} else {
			jornadaTrabalhoService.apagar(jornadaTrabalho);
		}
		return new ResponseEntity<>(HttpStatus.OK); 
	}
}
