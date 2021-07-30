package GITS.technical_test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class time_convert {
    public static String Time(String input)
        throws ParseException
    {
        DateFormat dateFormat
            = new SimpleDateFormat("hh:mm aa");
       
        
        DateFormat formate
            = new SimpleDateFormat("HH:mm");
        Date time = null;
        String output = "";
        
        time = dateFormat.parse(input);
       
        output = formate.format(time);
        return output;
    }
 
    // Driver Code
    public static void main(String[] arg)
        throws ParseException
    {
        // Hint
        // input with this format = HH:MM PM/AM
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time you want to convert : ");
        String time_before = input.nextLine();
        System.out.println("\n>>> Result <<<");
        System.out.println(Time(time_before));

        input.close();
    }
}
