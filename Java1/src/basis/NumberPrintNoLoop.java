package basis;

public class NumberPrintNoLoop {

	public static void printNum(int i) {
		if(i<=100) {
			System.out.println(i);
			printNum(i+1);
			}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		printNum(num);
	}
		
		
		
	}


