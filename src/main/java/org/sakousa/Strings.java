package org.sakousa;

public class Strings {
    public static void main(String [] args){
        //Declare a variable of String
        String myString = "1.Sak Ousa";
        //Output length of myString variable
        System.out.println("Length of MyString: " + myString.length());
        //Output Value to "HELLO"
        System.out.println("MyString value in uppercase: " + myString.toUpperCase());
        //Output Value to "hello"
        System.out.println("MyString value in lowercase: " + myString.toLowerCase());
        //Modify Mystring value
        myString = "Hello world and Say Hello";
        //output index of the first occurrence of a specified text in a mystring value
        System.out.println("Index of World : " + myString.indexOf("World"));

    }
}
