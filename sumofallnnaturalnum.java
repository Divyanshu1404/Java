package javabasics;

import java.util.Scanner;

public class sumofallnnaturalnum {
	public static void main(String[] args) {
		int i;
		int sum=0;
	
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for (i=0;i<=n;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
