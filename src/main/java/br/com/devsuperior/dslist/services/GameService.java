package br.com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dslist.dto.GameDTO;
import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.entities.Game;
import br.com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {

		List<Game> resultado = gameRepository.findAll();

		List<GameMinDTO> dto = resultado.stream()
				.map(game -> new GameMinDTO(game)).toList();

		return dto;

	}

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {

		Game resultado = gameRepository.findById(id).get();

		return new GameDTO(resultado);

	}

}
