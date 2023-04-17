package com.practiceset1;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        int a[]= new int[5];int max;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
