package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your test score:");
        int score = keyboard.nextInt();
        char grade = 'F';//I'm not hopeful

        if (score > 89)
            grade = 'A';
        else if (score > 79)
            grade = 'B';
        else if (score > 69)
            grade = 'C';
        else
            grade = 'F';

        if (score > 89)
            System.out.println("A");
        if (score > 79)
            System.out.println("B");
        if (score > 69)
            System.out.println("C");
        else
            System.out.println("Drop the class!!!");

        }
    }

