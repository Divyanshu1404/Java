package javabasics;
import java.util.*;
public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Radius: ");
		int radius= sc.nextInt();
		int pi=22/7;
        int area=pi*radius*radius;
        System.out.print(area);
	}

}
