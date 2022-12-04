package coffeeMachine;

import java.util.concurrent.atomic.AtomicLong;

public class CoffeeMachineDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.menu();
        UserInputClass userInputClass = new UserInputClass();
        coffeeMachine.menu(userInputClass);
    }
}