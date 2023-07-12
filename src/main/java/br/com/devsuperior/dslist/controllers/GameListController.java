package br.com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsuperior.dslist.dto.GameListDTO;
import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.services.GameListService;
import br.com.devsuperior.dslist.services.GameService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping("")
	public List<GameListDTO> findAll() {

		List<GameListDTO> resultado = gameListService.findAll();

		return resultado;
	}

	@GetMapping("/{listId}/games")
	public List<GameMinDTO> findByList(@Valid @PathVariable Long listId) {

		List<GameMinDTO> resultado = gameService.findByList(listId);

		return resultado;
	}

}
