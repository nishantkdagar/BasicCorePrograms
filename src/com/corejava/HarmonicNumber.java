package com.corejava;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String args[]) {
        int N;
        double nthHarmonicValue = 1;
        System.out.println("Enter the Nth Harmonic Value: ");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        System.out.println("The harmonic series is: ");
        for(int i=1; i<=N; i++){
            System.out.print("1/"+i+" + ");
            nthHarmonicValue += (double)1/i;
        }
        System.out.println("\nThe Nth harmonic number is: "+nthHarmonicValue);
    }
}
