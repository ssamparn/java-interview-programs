package interview.programs.section01;

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number to check even or odd: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) System.out.println("Number entered is even");
        else System.out.println("Number entered is odd");

        scanner.close();
    }
}
