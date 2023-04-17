package com.practiceset1;
import java.util.Scanner;
public class Question7 {   //Fibonacci series
    public static void main(String[] args) {
        int a =0; int b = 1; int num; int c =0;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i = 1; i<=num;i++) { //i=2
            System.out.println(c);//0, 1, 1, 2,
            a=b; //1, 0, 1,
        b=c; //0, 1, 1
        c = a+b;// 1,1, 2


    }
}}
