package nyc.c4q.theaulait;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S;
        System.out.println("Please enter a word.");
        S = input.nextLine();
        System.out.println(UniqueChar(S));
    }
    // I test the original method with boolean but it kept returning true or false. So I tried a String and it worked.
    public static String UniqueChar(String input){
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (!result.contains(String.valueOf(input.charAt(i)))) { //If the value does not contains the character stored at i, add to result.
                result += String.valueOf(input.charAt(i));
                result = result.toLowerCase();
            }
        }
        return result;
        }
}
