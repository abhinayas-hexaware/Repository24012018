package com.abhinaya;

import java.util.Scanner;

public class Division{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two num");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = division(a, b);
        
    }

    public static int division(int a,int b){
        int divQuotient=0;
        System.out.println("Performing Division : ");
        try{
            divQuotient = a/b;
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("The division of two numbers is : "+divQuotient);
        return divQuotient;
    }
}