package br.com.devsuperior.dslist.dto;

import org.springframework.beans.BeanUtils;

import br.com.devsuperior.dslist.entities.Game;
import lombok.Data;

@Data
public class GameDTO {

	private Long id;

	private String title;

	private Integer year;

	private String genre;

	private String platforms;

	private Double score;

	private String imgUrl;

	private String shortDescription;

	private String longDescription;

	public GameDTO() {

	}

//	copiando  tudo que ta na entidade para essa classe GameDTO (precisa de getters and setters)
	public GameDTO(Game game) {
		BeanUtils.copyProperties(game, this);
	}

}
