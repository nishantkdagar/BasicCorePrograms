package com.corejava;

import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args){
        double Total_Flips;
        int flip;
        int head = 0;
        int tail = 0;
        Random rm = new Random();
        System.out.println("How may times do you need to flip?");
        Scanner scan = new Scanner(System.in);
        Total_Flips = scan.nextInt();
        for (int i=0; i<Total_Flips; i++) {
            flip = rm.nextInt(2);
            if (flip == 0){
                head += 1;
            }
            else {
                tail += 1;
            }
        }
        double head_percent = (head / Total_Flips) *100;
        double tail_percent = (tail / Total_Flips) *100;
        System.out.println("Total Heads were "+head+" which is "+head_percent+"%.");
        System.out.println("Total Tails were "+tail+" which is "+tail_percent+"%.");
    }
}
