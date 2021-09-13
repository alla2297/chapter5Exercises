package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // pick a random number
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Indtast numbers between  1 to ?"); // her vælger du et nr. mellem O to ___
            int y = scanner.nextInt();

            System.out.println("Guess a number between 1 = " + y);
            int x = scanner.nextInt();                  // her gætter du et nr. mellem det de tal du valte tal for før

            Random random = new Random();
            int number = random.nextInt(y) + 1;

            System.out.println("pc number = " + number);
            System.out.println("Your Guess = " + x);
            //int

            if (x == number) {
                System.out.println("Your Guess is correct!!!! " + number);
                return;
            }
            if (x < number) {
                int between1 = number - x;
                System.out.println("Your Guess is not correct. you was " + between1 + " from");
            }
            if (x > number) {
                int between2 = x - number;
                System.out.println("\nYour Guess is not correct. you was " + between2 + " from the number.");

            }
        }
        System.out.println("Your Guess is incorrect 3 time. you loss :´(. \nterminate the program.");
    }

}




        //System.out.println("Your Guess is incorrect 3 time. you loss :´(. \nterminate the program.");

