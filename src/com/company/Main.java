package com.company;

public class Main {

    public static void main(String[] args) {

        calculateHighScorePosition();
        displayHighScorePosition("Ronaldo", 5,"Striker");


    }
    public static int displayHighScorePosition (String playerName,int highScoreTable,String positionPlayed ) {

        boolean isPlaying =true;
        if (isPlaying) {
            System.out.println(playerName + " managed to get into position, " + "he got " + positionPlayed + "& got the " + highScoreTable +"on the table");
        //    return displayHighScorePosition();
        }return -1;
    }

    public static int calculateHighScorePosition () {

        int playerScore = 900;

        if (playerScore > 1000) {
            return 1;
        }
        else if (playerScore >500 && playerScore <1000) {
            return 2;

        }
        else if ( playerScore >100 && playerScore <500) {
            return 3;

        }
        else {
            return 4;
        }






    }

}

