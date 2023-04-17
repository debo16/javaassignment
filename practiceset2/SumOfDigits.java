package com.practiceset2;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        int n, rem; int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        System.out.println(sum);
    }
}
