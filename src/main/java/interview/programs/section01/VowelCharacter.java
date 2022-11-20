package interview.programs.section01;

import java.util.List;
import java.util.Scanner;

public class VowelCharacter {

    public static void main(String[] args) {
        // Using Collection
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");

        String v = scanner.next();

        List<String> vowel = List.of("A", "E", "I", "O", "U", "a", "e", "i", "o", "u");

        if (vowel.contains(v)) {
            System.out.println(v + " is a vowel");
        } else {
            System.out.println(v + " is not a vowel");
        }

        scanner.close();

        // Using Switch

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter any character: ");
//
//        char v = scanner.next().charAt(0);
//        boolean isVowel = false;
//
//        switch (v) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//                isVowel = true;
//                break;
//        }
//
//        if (isVowel) {
//            System.out.println(v + " is a vowel");
//        } else {
//            System.out.println(v + " is not a vowel");
//        }
//
//        scanner.close();
    }
}
