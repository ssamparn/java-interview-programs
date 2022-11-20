package interview.programs.section01;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it is a Leap year: ");

        // A leap year is exactly divisible by 4 except for century years (years ending with 00).
        // The century year is a leap year only if it is perfectly divisible by 400.

        int year = scanner.nextInt();
        boolean isLeapYear;

        if (year > 0 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " is a Leap year");
        } else {
            System.out.println(year + " is not a Leap year");
        }

        scanner.close();
    }
}
