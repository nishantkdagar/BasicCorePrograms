package com.corejava;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int num1, num2, temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = sc.nextInt();
        temp=num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping 1st number: "+num1);
        System.out.println("After swapping 2nd number: "+num2);
    }
}
