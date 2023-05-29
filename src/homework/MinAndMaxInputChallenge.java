package homework;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void minMax() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            System.out.println("Enter Number : ");
            boolean anInt = sc.hasNextInt();
            if (anInt) {
                int n = sc.nextInt();
                if (n > max) {
                    max = n;
                    if (n < min) {
                        min = n;
                    }
                }
            } else {
                System.out.println("invalid Number");
                break;
            }
            sc.nextLine();
        }
        System.out.println("Max = "+max+ "and Min =  " +min);
        sc.close();
    }

    public static void main(String[] args) {
        minMax();
    }
}
