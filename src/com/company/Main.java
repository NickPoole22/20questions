package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 100;
        int targetNumber = rand.nextInt(upperbound);
        int x = 20;
        Scanner scan = new Scanner(System.in);
        System.out.println("This is 20 questions! Try to guess the number I've thought of between 0-100! You only have 20 lives!");
        System.out.println("What is your first guess?");
        int guess = scan.nextInt();
        while (true)
        {
            if(x == 0)
            {
                System.out.println("You are out of lives!");
                break;
            }
            else if (guess == targetNumber)
            {
                System.out.println("That's it!");
                break;
            }else if (guess > targetNumber)
            {
                System.out.println("That number is too high!");
                x--;
                System.out.println("You have " + x + " lives left!!!");
                System.out.println("What is your next guess?");
                guess = scan.nextInt();
                continue;
            } else if (guess < targetNumber)
            {
                System.out.println("That number is too low!");
                x--;
                System.out.println("You have " + x + " lives left!!!");
                System.out.println("What is your next guess?");
                guess = scan.nextInt();
                continue;
            }



            }



        }

    }
