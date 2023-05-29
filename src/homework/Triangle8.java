package homework;
/**
 * Display right angle triangle of @ using nested for loops
 *         @
 *         @@
 *         @@@
 *         @@@@
 *         @@@@@
 */


public class Triangle8 {
    public static void printARightTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printARightTriangle();
    }
}
