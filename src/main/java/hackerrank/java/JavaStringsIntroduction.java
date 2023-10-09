package hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringsIntroduction {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstString = bufferedReader.readLine().trim();
        String secondString = bufferedReader.readLine().trim();

        System.out.println(firstString.length() + secondString.length());

        if (firstString.compareTo(secondString) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s1 = firstString.substring(0, 1).toUpperCase();
        String s2 = firstString.substring(1);

        String s3 = secondString.substring(0, 1).toUpperCase();
        String s4 = secondString.substring(1);

        System.out.println(s1 + s2 + " " + s3 + s4);

        bufferedReader.close();
    }
}
