package br.com.sartori.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sartori.dsmovie.dto.MovieDTO;
import br.com.sartori.dsmovie.dto.ScoreDTO;
import br.com.sartori.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	

	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		return service.saveScore(dto);
	}

}
