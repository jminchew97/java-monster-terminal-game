package org.example;

import java.util.Scanner;

public class Game {
    public void run_game(){
        Scanner scanner = new Scanner(System.in);

        Monster test_monster = new Monster("Bozar", 2,10);

        GameState gameState = GameState.MAIN_MENU;
        boolean end_game_loop = false;
        while (!end_game_loop) {

            switch(gameState){
                case MAIN_MENU ->{
                    System.out.print("""
                    Select your action.
                    1.Explore
                    2.Store
                    3.Fight
                    """);
                    String user_input = scanner.nextLine();

                    if (user_input.equals("explore")){
                        gameState = GameState.EXPLORE;
                    }
                }

                case EXPLORE -> {
                    System.out.println("EXPLORE");
                }
            }
    }



    }
}
