package com.company;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 0, c = 0;
        //TODO if statement, kunne have været et while loop så dit program ikke lukker efter et fejl input.
        if (!scanner.hasNextInt()) {
            String word = scanner.next();
            System.err.println(word + " is not a number, restart the program.");
            System.exit(0);
        } else {
        //TODO else kunne være undladt og stadig få samme resultat. Dette gælder for alle inputs.
            a = scanner.nextInt();

        }
        if(!scanner.hasNextInt()){
            String word = scanner.next();
            System.err.println(word + " not a number, restart the program.");
            System.exit(0);
        } else {
            b = scanner.nextInt();
        }
        if(!scanner.hasNextInt()){
            String word = scanner.next();
            System.err.println(word + " not a number, restart the program.");
            System.exit(0);
        } else {
            c = scanner.nextInt();
        }
        if(a+b<=c || b+c<=a || a+c<=b){
            System.out.println(" It can never become Triangle \nIf any of the three lengths is greater than the sum of the other two, you cannot form a triangle ");
        } else {
            System.out.println(" It kan become a Triangle"); //TODO tjek println tekst.
        }

    }
}

// If any of the three lengths is greater than the sum of the other two, you cannot form a triangle
