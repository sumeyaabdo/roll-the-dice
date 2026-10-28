package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {

            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            }

            if (sum == 4) {
                fourCounter++;
            }

            if (sum == 6) {
                sixCounter++;
            }

            if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("Sum of 2: " + twoCounter);
        System.out.println("Sum of 4: " + fourCounter);
        System.out.println("Sum of 6: " + sixCounter);
        System.out.println("Sum of 7: " + sevenCounter);
    }
}
