package com.dio.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {

	@Autowired
	JornadaTrabalhoRepository jornadaTrabalhoRepository;

	public JornadaTrabalho salvar(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

	public JornadaTrabalho alterar(JornadaTrabalho jornadaTrabalho) {
		return jornadaTrabalhoRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaTrabalhoRepository.findAll();
	}

	public JornadaTrabalho findById(Long id) {
		return jornadaTrabalhoRepository.findById(id).orElse(null);
	}

	public void apagar(JornadaTrabalho jornadaTrabalho) {
		  jornadaTrabalhoRepository.delete(jornadaTrabalho);
	}
}
