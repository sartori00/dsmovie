package br.com.sartori.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sartori.dsmovie.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
