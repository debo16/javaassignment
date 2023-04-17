package com.practiceset1;

public class Question4 {  //reverse string
    public static void main(String[] args) {
        String s = "SQUARE";
        String a = "";
       int l=s.length();
       for (int i = l-1; i>=0; i--){  //l=6 indexing starts from 0, so l-1 = 5, 4, 3
           a = a + s.charAt(i); // E, R, A "+" means concatinating i.e adding of two value
       }
        System.out.println(a + "ball");
    }
}
