package br.com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsuperior.dslist.dto.GameDTO;
import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.services.GameService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping("")
	public List<GameMinDTO> findAll() {

		List<GameMinDTO> resultado = gameService.findAll();

		return resultado;
	}

	@GetMapping("/{id}")
	public GameDTO findById(@Valid @PathVariable Long id) {

		GameDTO resultado = gameService.findById(id);

		return resultado;

	}

}
