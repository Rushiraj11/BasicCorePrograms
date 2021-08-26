package com.bridgelabz;

import java.util.Random;

public class CoinFlipPercentage {
    private static final int TAILFLIP = 1;
    // flipping coin 10 times
    static final int COUNT = 10;

    public static void main(String[] args) {
        //Variables
        int coin;
        double tails = 0;
        double heads = 0;
        for (int i = 1; i <= COUNT; i++) {
            //for getting Random number between 0 or 1
            Random random = new Random();
            coin = random.nextInt(2);
            if (coin == TAILFLIP) {
                System.out.println("its Heads");
                tails += 1;
            } else {
                System.out.println("its Tails");
                heads += 1;
            }
        }
        System.out.println("percentage of Tails:" + ((tails / COUNT) * 100));
        System.out.println("percentage of Heads:" + ((heads / COUNT) * 100));
    }
}
