package basicprogram;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		int age =d.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}
		else
		{
		System.out.println("You are  not eligible to vote");
		}
		
	}

}
