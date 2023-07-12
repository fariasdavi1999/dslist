package br.com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	@EqualsAndHashCode.Include
	private BelongingPK id = new BelongingPK();

	private Integer position;

	public Belonging() {

	}

	public Belonging(Game game, GameList gameList, Integer position) {
		id.setGame(game);
		id.setGameList(gameList);
		this.position = position;
	}

}
