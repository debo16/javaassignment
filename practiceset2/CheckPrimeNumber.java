package com.practiceset2;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        int n; int count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count = count+1;
            }
        }if(count==2){
            System.out.println("number is prime");
        }else{
            System.out.println("number is not prime");
        }
    }

}

