package javabasics;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a == b) {
			System.out.println("Equal");
		}
		else if(a > b) {
			System.out.println("A is Greater");
		}
		else {
			System.out.println("A is Smaller");
		}
	}

}
