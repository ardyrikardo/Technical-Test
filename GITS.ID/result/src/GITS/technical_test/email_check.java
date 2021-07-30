package GITS.technical_test;

import java.util.regex.Pattern;
import java.util.Scanner;

public class email_check {
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
  
    /* driver function to check */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the email you want to check : ");
        String email = input.nextLine();

        System.out.println(">>> RESULT <<<");
        if (isValid(email)) {
            System.out.print("TRUE");
        }
        else {
            System.out.print("FALSE");
        }
            
        input.close();
    }
}

    
