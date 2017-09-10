package basis;

public class ThreeDigitUniqueNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for(int a=1; a<=4 ;a++) {
			for(int b=1; b<=4 ;b++) {
				for(int c=1; c<=4 ;c++) {
					if(c!=a&&c!=b&&a!=b) {
						System.out.println(a+""+b+""+c);
						count++;
					}
				}
			}	
		}
		System.out.println(count);
	}

}
