package Madeira.cs;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    private static Object Scanner;

    public static void main(String[] args) {

        //Challenge problem 1
        System.out.println("Type in your first number");
        Scanner myScanner = new Scanner(System.in);
        double myScannedInput1 = myScanner.nextDouble();
        System.out.println("Type in your second number.");
        Scanner myScanner1 = new Scanner(System.in);
        double myScannedInput2 = myScanner1.nextDouble();
        if (myScannedInput1 > myScannedInput2) {
            System.out.println("First number is greater");
        } else {
            System.out.println("Second number is greater");
        }

        //Challenge problem 2
        System.out.println("Please type in your favourite genre of music (capitalize your first letter)");
        String myString;
        Scanner myScanner3 = new Scanner(System.in);
        myString = myScanner3.nextLine();
        if (myString.equals("Popular music")) {
            System.out.println("Same!");
        } else {
            System.out.println("Lame");
        }

        //Challenge problem 3
        System.out.println("Number guessing game");
        System.out.println("Type in any number that is from 1 to 100, you have 10 tries");
        for (int i = 10; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                Scanner myScanner4 = new Scanner(System.in);
                String myScannedInput3 = myScanner4.nextLine();
                if (myScannedInput3.equals("7")) {
                    System.out.println("Congrats, you got it right!");
                    break;
                } else {
                    System.out.println("You are wrong, please try again");
                }
            }
            Scanner myScanner5 = new Scanner(System.in);
            String myScannedInput4 = myScanner5.nextLine();
            if (myScannedInput4.equals("7")) {
                System.out.println("Congrats, you got it right!");
                break;
            } else {
                System.out.println("You are out of tries");
            }
        }
        //I don't know how to make it stop when you typed in the correct number. Break didn't work.

        //Challenge problem 4
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Challenge problem 5
        for (int x = 4; x > 0; x--) {
            for (int z = 2; x > 0; x--) {
                if (x == 3) {
                    break;
                }
                for (int y = 0; y < x; y++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //Challenge problem 6
        System.out.println("number guessing game");
        System.out.println("Type in any number that is from 1 to 100");
        for (int i = 10; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                Scanner myScanner5 = new Scanner(in);
                String myScannedInput4 = myScanner5.nextLine();
                if (myScannedInput4.equals("7")) {
                    System.out.println("Congrats, you got it right!");
                } else {
                    System.out.println("You are wrong, please try again");
                }
                if (myScannedInput4.equals("5")) {
                    if (myScannedInput4.equals("6")) {
                        if (myScannedInput4.equals("8")) {
                            if (myScannedInput4.equals("9")) {
                                System.out.println("hot");
                            } else if (myScannedInput4.equals("3")) {
                                System.out.println("medium");
                            } else if (myScannedInput4.equals("11")) {
                                System.out.println("medium");
                            } else ;
                            System.out.println("Mild");


                        }
                    }
                }
            }

        }
        //No idea on how to subtract the number of guesses



        // write your code here
    }
}

