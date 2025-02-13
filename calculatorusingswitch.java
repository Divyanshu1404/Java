package javabasics;

import java.util.Scanner;

public class calculatorusingswitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int button=sc.nextInt();
	
	
		switch(button) {
		case 1: 
			System.out.println("january");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default :
			System.out.println("Invalid input");
		}
	}
}