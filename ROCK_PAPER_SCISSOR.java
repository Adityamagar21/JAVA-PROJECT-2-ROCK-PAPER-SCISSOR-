package com.company.ch3;
import java.util.Random;
import java.util.Scanner;



public class rpsGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int e=1;
        int computer=0;
        int user=0;

        while(e>0){
            System.out.println("WELCOME TO THE GAME");
            System.out.println("0 for Rock");
            System.out.println("1 for Paper");
            System.out.println("2 for Scissor");
            System.out.println("3 for Quiet");
            System.out.println("Enter your choice: ");
            int t=sc.nextInt();
            int r= rand.nextInt(3);
            if (r==0 && t==0 || r==1 && t==1 || r==2 &&t==2){
                System.out.println("IT'S A DRAW");
            }
            else if (r==0 && t==1 || r==1 && t==2 || r==2 && t==0) {
                System.out.println("YOU WIN THE MATCH");
                user++;
            }
            else if (r==0 && t==2 || r==1 && t==0 || r==2 && t==1){
                System.out.println("COMPUTER WIN THE MATCH");
                computer++;
            }
            if (t==3){
                System.out.println("Your score-->"+user);
                System.out.println("Computer score-->"+computer);
                if (user>computer){
                    System.out.println("YOU ARE WINNER");
                }
                else if (computer>user) {
                    System.out.println("COMPUTER IS WINNER");
                }
                else {
                    System.out.println("It's a draw");
                }
                break;
            }



        }
    }
}
