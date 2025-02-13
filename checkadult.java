package javabasics;
import java.util.*;
public class checkadult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Under Age");
		}
	}

}
