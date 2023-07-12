package br.com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devsuperior.dslist.dto.GameListDTO;
import br.com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping("/api/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;

	@GetMapping("")
	public List<GameListDTO> findAll() {

		List<GameListDTO> resultado = gameListService.findAll();

		return resultado;
	}

}
