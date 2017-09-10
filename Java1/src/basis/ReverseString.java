package basis;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string");
		String s=sc.nextLine();
	/*	char[] letters = s.toCharArray();
		System.out.println(letters);
		for(int i=letters.length-1;i>=0;i--) {
			System.out.print(letters[i]);
		}
		//System.out.println("\n");
		*/
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		
	}
	
	

	
}
