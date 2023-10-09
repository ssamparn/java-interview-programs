package interview.programs.section03;

public class ReverseAString2 {

    public static void main(String[] args) {
        String inputString = "I AM A BOY";
        String reversedString = "";

        char[] inputStringCharArray = inputString.toCharArray();

        for (int i = 0; i < inputStringCharArray.length; i++) {
            reversedString = inputStringCharArray[i] + reversedString;
        }
        System.out.println("Reversed String is: " + reversedString);
    }
}
