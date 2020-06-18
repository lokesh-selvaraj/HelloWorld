package com.test_project;

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


        //SHORTCUT KEY -> sout + Tab = System.out.println();
    }
}
