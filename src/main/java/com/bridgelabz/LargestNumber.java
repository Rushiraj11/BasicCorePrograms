package com.bridgelabz;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args)
    {
        int x, y, z;
        //Create an object of scanner class
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        System.out.print("Enter the third number:");
        z = s.nextInt();
        if(x > y && x > z) //if x is greater the both y & z
        {
            System.out.println("Largest number is:"+x);
        }
        else if(y > z) // if y is greater then x and z enter in this loop
        {
            System.out.println("Largest number is:"+y);
        }
        else // if z is greater then x and y
        {
            System.out.println("Largest number is:"+z);
        }

    }
}
