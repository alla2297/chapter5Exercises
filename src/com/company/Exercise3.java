package com.company;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et tal: ");
        double a = scanner.nextDouble();
        System.out.println("Indtast et tal: ");
        double b = scanner.nextDouble();
        System.out.println("Indtast et tal: ");
        double c = scanner.nextDouble();
        System.out.println("Indtast et tal: ");
        double n = scanner.nextDouble();


        Fermat(a,b,c,n);

    }
    public static void Fermat (double a, double b, double c, double n) {

        System.out.println((Math.pow(a,n))+(Math.pow(b,n))==Math.pow(c,n));
    }
}

/*      System.out.println(Math.pow(a,n)+Math.pow(b,n)=Math.pow(c,n));
        System.out.println(Math.pow(a,n));
 */