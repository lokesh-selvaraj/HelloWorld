package com.test_project;

public class Weather {

    /*
    *  Suppose you define a 'main' method with 'args' of type 'String[]'
    *
    *  public static void main()
    *
    *  You get runtime error
    * ==========================
    *
    *  "Error: Main method not found in class com.test_project.Weather, please define the main method as:
           public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application"
    *
    */

    public static void main(String[] args) {
        int temp = 32;

        if(temp > 30) {
            System.out.println("Its a hot day");
            System.out.println("Drink Water !!");
        }
        else if (temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Its a cold day");
    }

    // OPEN Terminal
    // cd till 'test_project' , type "javac Weather.java"
    // type "cd .." (till 'src' folder)
    // type "java com.test_project.Weather"
}
