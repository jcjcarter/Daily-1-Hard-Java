package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int guess = 50;
        int userNum = -1;
        String userDirection = "";

        Scanner userFeedback = new Scanner(System.in);

        System.out.println("Input your number, 0 - 100: ");
        userNum = Integer.parseInt(userFeedback.next());

        while (true) {

            if (guess == userNum) {
                System.out.println("Found your number, " + guess);
                break;
            }

            System.out.println("Is your number higher or lower than " + guess);
            userDirection = userFeedback.next();

            if (userDirection.equals("h")){
                // Guess lower.
                min = guess;
                guess = (min + max) / 2;
            }

            if (userDirection.equals("l")){
                // Guess higher.
                max = guess;
                guess = (min + max) / 2;
            }

        }
    }
}
