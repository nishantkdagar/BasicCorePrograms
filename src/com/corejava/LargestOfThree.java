package com.corejava;

import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int largest = 0;

        if (num1>largest){
            largest=num1;
        }
        if (num2>largest){
            largest=num2;
        }
        if (num3>largest){
            largest=num3;
        }

        System.out.println("The largest number is: "+largest);

    }
}
