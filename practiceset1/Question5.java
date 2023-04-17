package com.practiceset1;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        int totalcost; double amount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount");
        totalcost = sc.nextInt();
        if (totalcost<=2000){
            amount = totalcost -(2000*5/100);
        }
        else if(totalcost<=5000){
            amount = totalcost -(5000*25/100);
        }
        else if(totalcost<=10000){
            amount = totalcost -(10000*35/100);
        }
        else{
            amount = totalcost - (10000*50/100);
        }
        System.out.println(amount);
    }
}
