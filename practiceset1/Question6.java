package com.practiceset1;
//import java.io.BufferedReader;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {

        int n; int fact=1; int sum =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i =1; i<=n;i++){  //n = 3
            fact = fact*i;// 1*2*3
            sum = sum + fact;
        }
//        System.out.println(fact);
        System.out.println(sum);
    }
}
