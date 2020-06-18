package com.test_project;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        //primitive types
        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);



        //reference types
        Date now = new Date();
        long currTime = now.getTime();

        System.out.println(currTime);
        System.out.println(now);

        Point pt1 = new Point(1, 1);
        Point pt2 = pt1;
        pt1.x = 2;
        System.out.println(pt1);
        System.out.println(pt2);


        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


        //Immutable example
        String message = "Hello World" + "!!";
        System.out.println(message.replace("!", "*"));
        System.out.println(message.toUpperCase());
        System.out.println(message);             // Means any method that modifies a string, will return a new copy of that string
                                                 // making the original version immutable i.e. non-changeable



        //SHORTCUT KEY -> sout + Tab = System.out.println();
        //When importing a class, use "option + enter" key in Mac
    }
}
