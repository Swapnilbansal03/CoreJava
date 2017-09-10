package basis;

import java.util.Scanner;

public class SumOfDigit {

	public static int Add(int n) {
		int sum=0;
		while(n!=0) {
			//n=n%10;
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int i=sc.nextInt();
		System.out.println(Add(i));
		
	}
}
