package GITS.technical_test;
import java.util.Scanner;

class palindrom_sentence {
	public static void main(String[] args){
        String text;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence you want to check :");
        text = input.next();

		new palindrom_sentence().palindrome(text);	
		input.close();	
	}
	
	private void palindrome(String teks){		
		String polinrome_text = "";					
		for(int i=teks.length()-1; i>-1; i--){
			char c = teks.charAt(i);			
			polinrome_text += String.valueOf(c);
		}
		System.out.println("\n>>> Palindrom Checker Result <<<");
		if(teks.equals(polinrome_text)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
	
}


