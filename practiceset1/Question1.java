package com.practiceset1;
import java.util.Scanner;//WAP to accept three numbers from user and display the smallest number.
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && a<c){
            System.out.println(a);
        } else if(b<c) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
