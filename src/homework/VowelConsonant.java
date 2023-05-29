package homework;
/**
 * e a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */

import java.util.Scanner;

public class VowelConsonant {
    public static void voCon() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char alpha = s.next().charAt(0);

        switch (alpha) {
            case 'a':
                System.out.println("Vowel....");
                break;
            case 'e':
                System.out.println("Vowel....");
                break;
            case 'i':
                System.out.println("Vowel....");
                break;
            case 'o':
                System.out.println("Vowel....");
                break;
            case 'u':
                System.out.println("Vowel....");
                break;
            case 'A':
                System.out.println("Vowel....");
                break;
            case 'E':
                System.out.println("Vowel....");
                break;
            case 'I':
                System.out.println("Vowel....");
                break;
            case 'O':
                System.out.println("Vowel....");
                break;
            case 'U':
                System.out.println("Vowel....");
                break;
            default:
                System.out.println("Consonants....");
        }
    }

    public static void main(String[] args) {
        voCon();
    }
}
