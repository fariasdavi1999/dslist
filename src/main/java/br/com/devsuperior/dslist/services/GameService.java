package br.com.devsuperior.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.entities.Game;
import br.com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {

		List<Game> resultado = gameRepository.findAll();

		List<GameMinDTO> dto = resultado.stream()
				.map(game -> new GameMinDTO(game)).toList();

		return dto;

	}
	
//	public Optional<GameMinDTO> findById(Long id){
//		
//		Optional<Game> resultado = gameRepository.findById(id);
//		
//		Optional<GameMinDTO> dto = resultado
//		
//	}

}
