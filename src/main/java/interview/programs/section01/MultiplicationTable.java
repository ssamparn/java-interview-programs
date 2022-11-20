package interview.programs.section01;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number for its multiplication table: ");

        int num = scanner.nextInt();;

        if (num > 0) {
            IntStream.rangeClosed(1, 10)
                    .forEach((intConsumer) -> System.out.println(num + "x" + intConsumer + "=" + intConsumer * num));
        }

        scanner.close();
    }
}
