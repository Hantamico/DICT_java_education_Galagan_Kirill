package Hangman;

import java.util.Scanner;

public class HangmanTest {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Hangman hangman = new Hangman();
        hangmanMenu menu = new hangmanMenu();
        menu.hangmanMenu(user, hangman);
    }
}
