package com.practiceset2;

import java.util.Scanner;
// Write a program in Java to find the sum of the series.
//S=1+a+a^2+a^3..........+a^10 , where a=2
public class PowerOf {
    public static void main(String[] args) {
        int a = 2;
        double sum = 0;
        double m;
        for (double n = 0; n <= 10; n++) { // 2^0 + 2^1 + 2^2
            m = Math.pow(a, n);
            sum= sum + m;
        }
        System.out.println(sum);
    }
}