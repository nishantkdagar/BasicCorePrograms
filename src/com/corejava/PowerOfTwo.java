package com.corejava;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args){
        double result = 0;
        int start = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max power for 2");
        int max = sc.nextInt();
        while(result < Math.pow(2,max)){
            result = Math.pow(2, start);
            start += 1;
            System.out.println(result);
        }
    }
}
