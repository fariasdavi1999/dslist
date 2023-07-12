package br.com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dslist.dto.GameListDTO;
import br.com.devsuperior.dslist.entities.GameList;
import br.com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {

		List<GameList> resultado = gameListRepository.findAll();

		// pega cada item da lista original e da um new no objeto, pegando o obj
		// gamelist e "transformando" no obj dto
		List<GameListDTO> dto = resultado.stream()
				.map(game -> new GameListDTO(game)).toList();

		return dto;

	}

}
