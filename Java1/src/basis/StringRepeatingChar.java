package basis;

import java.util.HashMap;
import java.util.Scanner;

public class StringRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c=firstNonRepeatedCharacter(str);
		System.out.println(c);
		

	}

	private static char firstNonRepeatedCharacter(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm= new HashMap<>();
		 int i,length ;
	        Character c ;
	        length= str.length();  // Scan string and build hash table
	        for (i=0;i < length;i++) {
	        	c=str.charAt(i);
	        	if(hm.containsKey(c)) {
	        		hm.put(c, hm.get(c)+1);
	        	}
	        	else {
	        		hm.put(c, 1);
	        	}
		}
	        for (i =0 ; i < length ; i++ )
	        {
	            c= str.charAt(i);
	            if( hm.get(c)  == 1 )
	            return c;
	        }
		return 0;
	}

}
