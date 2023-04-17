package com.practiceset2;
import java.util.Scanner;
// Write a program in Java to find the sum of the series
//S= 1+(1*2)+(1*2*3)+......... 10 terms
public class SumfOFactorial {  // 1+ 1*2 + 1*2*3 + 1*2*3*4...
    public static void main(String[] args) {
        int n; int fact = 1; int sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =1; i<=n; i++){  // n = 3
            fact = fact * i;
            sum = sum + fact;
        }
        System.out.println(fact);
        System.out.println(sum);
    }
}
