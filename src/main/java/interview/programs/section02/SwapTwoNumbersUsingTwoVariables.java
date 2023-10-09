package interview.programs.section02;

import java.util.Scanner;

public class SwapTwoNumbersUsingTwoVariables {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter second number: ");
        int b = scanner.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("The value of a after swapping: " +  a);
        System.out.println("The value of b after swapping: " +  b);
    }
}
