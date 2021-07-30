package GITS.technical_test;
import java.util.Scanner;


public class hello_world {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter the number you want :");
        int number = input.nextInt();

        for (int i = 1; i<= number; i++){
            if (i % 3 == 0) {
                System.out.println("Hello");
            }
            else if (i % 5 == 0) {
                System.out.println("World");
            }
            else if((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("Hello World");
            }
            
        }
        input.close();
    }
}
