package Hangman;

import java.util.Scanner;

public class hangmanMenu {
    public void hangmanMenu(Scanner scanner, Hangman hangman) {
        System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
        String scannerAnswer = scanner.nextLine();
        if (scannerAnswer.equals("play")) {
            hangman.game();
        } else if (scannerAnswer.equals("exit")) {
            System.exit(0);
        } else {
            hangmanMenu(scanner, hangman);
        }
    }
}
