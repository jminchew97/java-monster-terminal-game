package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        boolean end_game_loop = false;

        while (!end_game_loop) {
            System.out.print("""
                    Select your action.
                    1.Explore
                    2.Store
                    3.Fight
                    
                    """);

            String user_input = scanner.nextLine();
           if (user_input.equals("end")){
               end_game_loop = true;
           }
        }

    }
}