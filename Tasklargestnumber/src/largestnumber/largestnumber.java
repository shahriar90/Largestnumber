package largestnumber;

import java.util.Scanner;

public class largestnumber {

	public static void main(String[] args) {
		int a , b ,c , largest;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter any three numbers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		
		
		if (a > b && a > c)
		    largest = a;
		else if (b>a && b>c)
			largest = b;
		else 
			largest = c;
	System.out.printf("The largest number is \n");
	System.out.println(largest);
	
			
		

	}

}
