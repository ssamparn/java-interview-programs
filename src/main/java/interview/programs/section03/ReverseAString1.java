package interview.programs.section03;

public class ReverseAString1 {

    public static void main(String[] args) {
        String inputString = "I AM A BOY";
        StringBuilder reversedString = new StringBuilder();

        char[] inputStringCharArray = inputString.toCharArray();

        for (int i = inputStringCharArray.length - 1; i >= 0; i--) {
            reversedString.append(inputStringCharArray[i]);
        }
        System.out.println("Reversed String is: " + reversedString);
    }
}
