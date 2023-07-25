package com.bhushangajeshwar.interview;
import java.util.Scanner;
public class Interview1 {
	
//print any no table using user input not hard coded
	
	public static void multiplication(int no) {
		for(int i=1;i<=10;i++) {
			int a = no * i;
			System.out.println(no+"*"+i+"="+a);
		}
	}
	public static void main (String[]args) {
		System.out.println("Enter the number whose table is to be print");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		System.out.println("value you entered :- "+x);
	multiplication(x);
	System.out.println("Abhay branch testing");
	}
}
