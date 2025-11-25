package org.sakousa;

import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        double a, b;
        double value;
        System.out.println("Wellcome to our exam!");

        System.out.print("Enter your a:");

        a = input.nextDouble();
        System.out.print("Enter your b:");
        b = input.nextDouble();

//        value = a + b;
//        value = a - b;
//        value = a * b;
//        value = a / b;
//        value = a + b;
        a++;
        b++;

//        System.out.println("a = " + a + "and b = " + b + "So value: " + value);
        System.out.println(" A = "+a);
        System.out.println(" B = "+b);
    }
}