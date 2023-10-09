package hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaEndOfFile {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        int i = 0;
        while (line != null) {
            System.out.println(++i + " " + line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
