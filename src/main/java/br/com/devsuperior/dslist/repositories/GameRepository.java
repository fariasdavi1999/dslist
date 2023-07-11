package br.com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
