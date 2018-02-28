import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println ("Please enter your word ");
		Scanner scanner=new Scanner(System.in);
		String text=scanner.nextLine();
		System.out.println(Secondtolast(text));
		
	}
	
	public static String Secondtolast(String word) {
		
		char first=word.charAt(0);
		
		int index=word.length()-2;
		char almostlast=word.charAt(index);
		String firstAndLast=first+""+almostlast;
		return firstAndLast;
	}
	
	
	
		
		
		
		
		
		
		
		
	}


