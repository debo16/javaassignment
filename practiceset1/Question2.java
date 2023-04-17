package com.practiceset1;

import java.util.Scanner;

public class Question2 { //Java program to count Digits in a Number
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {  // 1234
            n = n / 10; //123, 12, 1, 0
            count++; //2, 3, 4
        }
        System.out.println(count);
    }
}






