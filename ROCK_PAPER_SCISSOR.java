package com.company.ch3;

import java.util.Random; // Importing the Random class to generate random numbers
import java.util.Scanner; // Importing the Scanner class to read input from the user

public class rpsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read user input
        Random rand = new Random(); // Creating a Random object to generate random choices for the computer
        int e = 1; // Variable to control the loop
        int computer = 0; // Variable to keep track of the computer's score
        int user = 0; // Variable to keep track of the user's score

        while (e > 0) { // Start of the game loop
            System.out.println("WELCOME TO THE GAME");
            System.out.println("0 for Rock");
            System.out.println("1 for Paper");
            System.out.println("2 for Scissor");
            System.out.println("3 to Quit");
            System.out.println("Enter your choice: ");
            int t = sc.nextInt(); // Read the user's choice
            int r = rand.nextInt(3); // Generate a random choice for the computer (0, 1, or 2)

            // Check if the match is a draw
            if (r == 0 && t == 0 || r == 1 && t == 1 || r == 2 && t == 2) {
                System.out.println("IT'S A DRAW");
            }
            // Check if the user wins the match
            else if (r == 0 && t == 1 || r == 1 && t == 2 || r == 2 && t == 0) {
                System.out.println("YOU WIN THE MATCH");
                user++; // Increment the user's score
            }
            // Check if the computer wins the match
            else if (r == 0 && t == 2 || r == 1 && t == 0 || r == 2 && t == 1) {
                System.out.println("COMPUTER WINS THE MATCH");
                computer++; // Increment the computer's score
            }
            // If the user chooses to quit the game
            if (t == 3) {
                System.out.println("Your score --> " + user);
                System.out.println("Computer score --> " + computer);

                // Determine and print the final winner
                if (user > computer) {
                    System.out.println("YOU ARE THE WINNER");
                } else if (computer > user) {
                    System.out.println("COMPUTER IS THE WINNER");
                } else {
                    System.out.println("It's a draw");
                }
                break; // Exit the loop
            }
        }
    }
}
