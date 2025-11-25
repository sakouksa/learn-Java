package org.sakousa;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id;
        String name, sex;
        double salary;

        System.out.println("Enter Your Id:");
        id = input.nextInt(); // fixed method and variable
        input.nextLine(); // consume leftover newline

        System.out.println("Enter Your Name:");
        name = input.nextLine();

        System.out.println("Enter Your Sex:");
        sex = input.nextLine();

        System.out.println("Enter Your Salary:");
        salary = input.nextDouble(); // use nextDouble(), not nextLineDouble()

        // output the variables
        System.out.println("Your Id: " + id);
        System.out.println("Your Name: " + name);
        System.out.println("Your Sex: " + sex);
        System.out.println("Your Salary: " + salary + "$");

    }
}
