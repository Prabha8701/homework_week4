package homework;
/**
 * a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

import java.util.Scanner;

public class Triangle123 {
    public static void triangle() {
        int num = 10;
        Scanner in = new Scanner(System.in);
        System.out.println(" Input the number of raw:   ");
        num = in.nextInt();
        // loop for rows
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        triangle();
    }
}
