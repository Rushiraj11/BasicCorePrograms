package com.bridgelabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        //variables of harmonic expression starts with 1
        Float harmonicnumber = 1f;
        int number;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        //execute only if number >0
        if (number != 0) {
            for (int i = 2; i <= number; i++) {
                System.out.println("i value:" + i);
                harmonicnumber += (float) 1 / i;
                System.out.println(harmonicnumber);
            }
            System.out.println("Harmonic Value of Number:" + number + " is :  " + harmonicnumber);
        }
    }

}
