package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public void botName() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello! My name is Gustavo");
            System.out.println("I was created in 2022");
            System.out.println("Please, remind me your name.");
            String name = scanner.nextLine();
            System.out.println("What a great name you have, " + name + "!");
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
            int rem3 = scanner.nextInt() % 3;
            int rem5 = scanner.nextInt() % 5;
            int rem7 = scanner.nextInt() % 7;
            int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
            System.out.println("Your age is " + age + "; that`s a good time to start programming!");
        }
    }
}
