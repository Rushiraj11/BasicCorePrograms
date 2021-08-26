package com.bridgelabz;
import java.util.Scanner;
public class TwoPowerofN {
    // Constant variables
    static final int MAX_VALUE = 32;
    static final int MIN_VALUE = 0;

    public static void main(String[] args) {
        //Variables
        int number;
        int power;
        System.out.println("enter to number to Print 2 power Table");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        // checking the number from 0 to 32 range
        if (number >= MIN_VALUE && number < MAX_VALUE) {
            for (int i = 0; i < number; i++) {
                power = (int) Math.pow(2, i);
                System.out.println("2" + "^" + i + "=" + power);
            }
        }
    }

}
