/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.simplemath;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String firstNum, secondNum;

        //Gets num 1
        Scanner numOne = new Scanner(System.in);
        System.out.print("Enter first number: ");
        firstNum = numOne.nextLine();
        int parseNumOne = Integer.parseInt(firstNum);

        //Gets num 2
        Scanner numTwo = new Scanner(System.in);
        System.out.print("Enter second number: ");
        secondNum = numTwo.nextLine();
        int parseNumTwo = Integer.parseInt(secondNum);

        //Math output
        System.out.print(parseNumOne + " + " + parseNumTwo + " = " + (parseNumOne+parseNumTwo));
        System.out.println("");
        System.out.print(parseNumOne + " - " + parseNumTwo + " = " + (parseNumOne-parseNumTwo));
        System.out.println("");
        System.out.print(parseNumOne + " * " + parseNumTwo + " = " + (parseNumOne*parseNumTwo));
        System.out.println("");
        System.out.print(parseNumOne + " / " + parseNumTwo + " = " + (parseNumOne/parseNumTwo));

    }
}
