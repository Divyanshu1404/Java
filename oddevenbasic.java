package javabasics;

import java.util.Scanner;

public class oddevenbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
