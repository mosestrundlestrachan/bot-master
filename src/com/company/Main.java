package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {

    private static Object Card;

    public static void main(String[] args) {
        System.out.println("Welcome to THE OFFICIAL RANDOM DECK GENERATOR FOR CLASH ROYALE");
        System.out.println("Type 'g' to generate a deck");
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();

        if (Objects.equals(answer, "g")) {
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println(random());
            System.out.println("Enjoy your random deck!");
        }
        else{
            System.out.println("Your so silly!");
            System.out.println("Now go away!");
        }
    }
}
