package br.com.sartori.dsmovie.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.sartori.dsmovie.dto.MovieDTO;
import br.com.sartori.dsmovie.entities.Movie;
import br.com.sartori.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> movies = repository.findAll(pageable);
		Page<MovieDTO> page = movies.map(movie -> new MovieDTO(movie));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> movieOpt = repository.findById(id);
		if(movieOpt.isPresent()) {
			return new MovieDTO(movieOpt.get());
		} 
		return null;
	}

}
