package com.bhushangajeshwar.interview;
import java.util.Scanner;

public class Interview3 {
	
	//print factors of given number
	
	public int getfactors(int num) {
		for (int a = 1; a<=num;a++) {
			if (num%a==0) {
				System.out.println("Factors of given number is :"+a);				
			}
		}
		return a;			
		}
	public static void main (String []Args) {
		Interview3 d = new Interview3();
		System.out.println("Enter the number whose factors is to be calculated");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		d.getfactors(c);
	}

}
