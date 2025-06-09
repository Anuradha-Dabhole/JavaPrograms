package basicprogram;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a:");
		int a= sc.nextInt();
		System.out.println("Enter the b:");
		int b= sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of two numbres is:" +sum);

	}

}
