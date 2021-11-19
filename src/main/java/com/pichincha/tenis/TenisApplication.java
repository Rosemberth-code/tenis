package com.pichincha.tenis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class TenisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenisApplication.class, args);
        int pointsPlayerOne = 0;
        int pointsPlayerTwo = 0;
        pointsPlayerOne = addPoints(pointsPlayerOne);

        pointsPlayerTwo = addPoints(pointsPlayerTwo);
        pointsPlayerTwo = addPoints(pointsPlayerTwo);
        System.out.println(getMarker(pointsPlayerOne, pointsPlayerTwo));
    }

    //Sumar puntos Rosemberth Bone.
    private static int addPoints(int pointsPlayerOne) {
        return pointsPlayerOne + 1;
    }

    private static String displayResult(String playerName, int playerMarker) {
        Map<Integer, Integer> points = new HashMap<>();
        points.put(0, 0);
        points.put(1, 15);
        points.put(2, 30);
        points.put(3, 40);
        return playerName.concat(" ").concat(String.valueOf(points.get(playerMarker)));
    }

    private static String getMarker(int pointsPlayerOne, int pointsPlayerTwo) {
        if (pointsPlayerOne == pointsPlayerTwo) {
            return "Deuce";
        } else if (pointsPlayerOne > pointsPlayerTwo + 2) {
            return "Player One Wins";
        } else if (pointsPlayerTwo > pointsPlayerOne + 2) {
            return "Player Two Wins";
        } else if (pointsPlayerOne == 4) {
            return "Advantage Player One";
        } else if (pointsPlayerTwo == 4) {
            return "Advantage Player Two";
        } else {
            return displayResult("Player One", pointsPlayerOne).concat(" ").concat(displayResult("Player Two", pointsPlayerTwo));
        }
    }
}
