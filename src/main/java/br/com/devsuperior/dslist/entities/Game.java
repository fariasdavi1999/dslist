package br.com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_game")
public class Game {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	@Column(name = "game_year")
	private Integer year;

	private String genre;

	private String platforms;

	private Double score;

	private String imgUrl;

	private String shortDescription;

	private String longDescription;

	// public Game() {
	// }
	//
	// public Game(Long id, String title, Integer year, String genre,
	// String platforms, Double score, String imgUrl,
	// String shortDescription, String longDescription) {
	// this.id = id;
	// this.title = title;
	// this.year = year;
	// this.genre = genre;
	// this.platforms = platforms;
	// Score = score;
	// this.imgUrl = imgUrl;
	// this.shortDescription = shortDescription;
	// this.longDescription = longDescription;
	// }

}
