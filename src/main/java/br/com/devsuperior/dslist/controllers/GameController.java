package br.com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsuperior.dslist.dto.GameMinDTO;
import br.com.devsuperior.dslist.services.GameService;

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

}
