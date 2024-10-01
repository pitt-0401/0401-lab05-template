/*
 * Created on 2026-09-24
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB05 template - CMPINF 0401, Fall 2026
// Condensed from the LAB04 sample solution.

import java.util.Scanner;

public class App {

    private static Scanner keyboard = new Scanner(System.in);

    private static String readUserText(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine();
    }

    // TODO 1: Make readUserNumber() robust
    // Typing a word instead of a number crashes the program
    // Handle the InputMismatchException and re-prompt
    // After 3 invalid attempts, use a default number
    private static int readUserNumber(String prompt, int min, int max) {
        System.out.print(prompt);
        int number = keyboard.nextInt();
        keyboard.nextLine(); // consume the leftover newline

        if (number < min || number > max) {
            int defaultNumber = (min + max) / 2;
            System.out.println("Error: value must be between " + min + " and " + max
                    + ". Defaulting to " + defaultNumber + ".");
            number = defaultNumber;
        }
        return number;
    }

    public static Cat promptForCat() {
        String name = readUserText("What is your cat's name? ");
        int age = readUserNumber("How old is " + name + "? ", 0, 30);
        String story = readUserText("Tell me a funny story about " + name + ": ");
        int energyLevel = readUserNumber("How energetic is " + name + "? ", 1, 10);
        return new Cat(name, age, story, energyLevel);
    }

    public static void main(String[] args) {
        Cat cat1 = promptForCat();
        Cat cat2 = promptForCat();
        System.out.println(cat1);
        System.out.println(cat2);

        // TODO 2.1: Create a new class Owner (Owner.java)
        // TODO 2.5: Read an owner's name, let the owner adopt a cat and play with it
        // TODO 2.6: Show that an adoption is refused if it is not allowed

        System.out.println(cat1);
        System.out.println(cat2);

        keyboard.close();
    }
}
