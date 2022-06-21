package com.corejava;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        int dividend , divisor;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        dividend=input.nextInt();
        System.out.println("Enter Divisor: ");
        divisor=input.nextInt();
        int quotient=dividend/divisor;
        int remainder=dividend%divisor;
        System.out.println(" Quotient: "+quotient);
        System.out.println(" Remainder: "+remainder);
    }
}
