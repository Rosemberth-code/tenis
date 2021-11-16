package com.pichincha.tenis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TenisApplication {

	public static void main(String[] args) {
		SpringApplication.run(TenisApplication.class, args);
		int pointsPlayerOne = 0;
		int pointsPlayerTwo = 0;
	}
	//Sumar puntos
	private int addPoints(int pointsPlayerOne) {
		return pointsPlayerOne + 1;
	}

	private String displayResult(String playerName, int playerMarker) {
		return playerName.concat(" ").concat(String.valueOf(playerMarker));
	}

	private String getMarker(int pointsPlayerOne, int pointsPlayerTwo) {
		if (pointsPlayerOne == pointsPlayerTwo) {
			return "Deuce";
		} else if (pointsPlayerOne > pointsPlayerTwo + 2) {
			return "Player One Wins";
		}  else if (pointsPlayerTwo > pointsPlayerOne + 2) {
			return "Player Two Wins";
		} else if (pointsPlayerOne == 4) {
			return "Advantage Player One";
		}  else if (pointsPlayerTwo == 4) {
			return "Advantage Player Two";
		}
		return null;
	}

	//Marcadores con un hashmap

}
