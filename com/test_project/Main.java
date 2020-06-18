package com.test_project;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        //primitive types
        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);



        //reference types
        Date now = new Date();                 //java.util.Date
        long currTime = now.getTime();

        System.out.println(currTime);
        System.out.println(now);

        Point pt1 = new Point(1, 1);    //java.awt.*
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


        // xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //1-d arrays
        int[] numbers = new int[6];
        numbers[0] = 100;
        numbers[1] = 200;
        System.out.println(numbers); // returns [I@7b23ec81

        String properArray = Arrays.toString(numbers);                      //java.util.Arrays
        System.out.println(properArray); //returns [100, 200, 0, 0, 0, 0]

        //multi-dim arrays
        int[][] numbers_mulArr = new int[2][3];
        numbers_mulArr[0][0] = 1;
        System.out.println(Arrays.toString(numbers_mulArr)); //[[I@6acbcfc0, [I@5f184fc6]
        System.out.println(Arrays.deepToString(numbers_mulArr)); //[[1, 0, 0], [0, 0, 0]]

        //Other way
        int[][] numbers_mulArr1 = { {1,2,3}, {4,5,6}  };
        System.out.println(Arrays.deepToString(numbers_mulArr1));



        //SHORTCUT KEY -> sout + Tab = System.out.println();
        //When importing a class, use "option + enter" key in Mac
    }
}
