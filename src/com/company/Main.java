package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int counter = 1;
        while (counter <= 10)
        {
            sayHelloWorld();
            counter ++;
        }
    }

    private static void sayHelloWorld()
    {
        System.out.println("Hello, world.");
    }
}

