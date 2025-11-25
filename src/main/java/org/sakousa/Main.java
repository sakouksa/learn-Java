package org.sakousa;

import javax.swing.text.Style;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //Type Casting
        int a = 10;
        //Widening casting
        double b = a;
        System.out.println("Hello a : " + a);
        System.out.println("Hello b : " + b);

        //Narrowing Casting
        float c = 1.5f;
        short d = (short) c;
        System.out.println("Hello c : " + c);
        System.out.println("Hello d : " + d);

        //Primitive Data Types
        int myNumber = 1234;
        double myDouble = 1234.56789;
        boolean myBoolean = true;

        //Convert from int to String
        System.out.println("Convert Integer into String: "+ Integer.toString(myNumber));
        System.out.println("Convert Integer into String: " + String.valueOf(myNumber));

        //Convert Integer to Double
        System.out.println("Convert Integer into Double: " +(double)myNumber);
        System.out.println("Convert Double into Integer " + (int)myDouble);
    }

}

