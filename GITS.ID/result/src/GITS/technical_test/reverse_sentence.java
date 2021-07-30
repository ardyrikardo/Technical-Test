package GITS.technical_test;
import java.util.Scanner;

public class reverse_sentence {
    public static void main(String args[]) {
        String alphabet, result = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence you want to reverse: ");
        alphabet = input.nextLine();

        int total = alphabet.length();
        int numberOfalphabet = total - 1;
        for (int i = 0; i < total; i++) {
          result = result + alphabet.charAt(numberOfalphabet);
          numberOfalphabet--;
        }
        System.out.println("Result after reverse: " + result);
        input.close();
      }
}
