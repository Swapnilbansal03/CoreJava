package basis;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseByWord {

	public static String reverse(String s) {
		Pattern p= Pattern.compile("\\s");
		String[] str=p.split(s);
		String result="";
		for(int i=0;i<str.length;i++) {
			if(i==str.length-1) 
				result= str[i]+result;
			else 
				result= " "+str[i]+result;
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String to reverse");
System.out.println(reverse(sc.nextLine()));
	}

}
