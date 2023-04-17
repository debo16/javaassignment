package com.practiceset2;

import java.util.Scanner;

public class CheckNumberPalindrome {
    public static void main(String[] args) {
        int n, rem; int orgval; int val = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        orgval = n;
        while (n > 0) {
            rem = n % 10;
            val = (val * 10)+ rem;
            n = n / 10;
        }
        if(orgval==val){
            System.out.println("number is palindrome");}
        else{
            System.out.println("is not palindrome");}
        }
    }


