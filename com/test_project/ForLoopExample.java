package com.test_project;

public class ForLoopExample {
    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i=0;i<fruits.length;i++)
            System.out.println(fruits[i]);

        for (int j=fruits.length-1; j>0; j--)
            System.out.println(fruits[j]);

        for (String fruit: fruits)
            System.out.println(fruit);
    }

    // OPEN Terminal
    // cd till 'test_project' , type "javac ForLoopExample.java"
    // type "cd .." (till 'src' folder)
    // type "java com.test_project.ForLoopExample"
}
