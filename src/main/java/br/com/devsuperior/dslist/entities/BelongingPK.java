package br.com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable 
// encapsulando dois atributos em uma classe só (embeddable)
public class BelongingPK {

	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "game_id")
	private Game game;

	@EqualsAndHashCode.Include
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList gameList;

	public BelongingPK() {

	}

	public BelongingPK(Game game, GameList gameList) {
		this.game = game;
		this.gameList = gameList;
	}

}
