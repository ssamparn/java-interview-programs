package interview.programs.section01;

import java.util.Scanner;

public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        double radius = scanner.nextDouble();

        if (radius > 0) {
            System.out.println("The Area of the circle is : " + Math.PI * radius * radius);
        }
    }

}
