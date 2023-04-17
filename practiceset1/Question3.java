package com.practiceset1;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) { //number is a perfect square or not.
        int n =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
       for(int i = 1; i<n; i++){   //4
            if(i*i==n){
                System.out.println(n + " is the perfect square");
            }
//      double a = Math.sqrt(n);
//        System.out.println(a);
//        double b= a - (Math.floor(a));
//        if(b==0.0){
//            System.out.println(n+ "is a perfect square");
//        }else{
//            System.out.println(n + "is not a perfect square");
//        }

    }
}}
