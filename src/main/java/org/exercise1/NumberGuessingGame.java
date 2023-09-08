package org.exercise1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final Random random = new Random();
    private static final Scanner scanner;

    public NumberGuessingGame() {
    }

    public static void main(String[] args) {
        System.out.println(" NUMBER GUESSING GAME ");
        System.out.println("----------------------");
        String s = "y";

        while(true) {
            do {
                if (!s.equals("y") && !s.equals("Y")) {
                    return;
                }

                System.out.print("Select the maximum number to guess: ");
                int maxNumber = Integer.parseInt(scanner.nextLine());
                int num = random.nextInt(maxNumber + 1);

                for(int i = 1; i < 5; ++i) {
                    System.out.print("Enter the number: ");
                    int inputNumber = Integer.parseInt(scanner.nextLine());
                    if (inputNumber == num) {
                        System.out.println("You win\nRandom number was: " + num);
                        break;
                    }

                    System.out.println("Is not the number, choise again " + (5 - i) + " times more");
                    if (num < inputNumber) {
                        System.out.println("The number entered is greater than");
                    } else {
                        System.out.println("The number entered is less than");
                    }
                }

                System.out.println("Do you want to play again? -press Y- ");
                s = scanner.nextLine();
            } while(s.equalsIgnoreCase("y") && s.equalsIgnoreCase("Y"));

            System.out.println("Good bye!");
        }
    }

    static {
        scanner = new Scanner(System.in);
    }
}