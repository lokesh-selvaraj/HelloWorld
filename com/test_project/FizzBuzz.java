package com.test_project;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number : ");
        int number = scanner.nextInt();

        if(number%5==0 && number%3==0)
            System.out.println("FizzBuzz");
        else if(number%5==0)
            System.out.println("Fizz");
        else if(number%3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }


    // OPEN Terminal
    // cd till 'test_project' , type "javac FizzBuzz.java"
    // type "cd .." (till 'src' folder)
    // type "java com.test_project.FizzBuzz"
}
