package com.bhushangajeshwar.interview;

public class Interview2 {
	
	//reverse given string
	
	public static void main(String[] args) {
		String s = "bhushan";
		char [] b = s.toCharArray();
		int size = b.length;
		char [] a = new char[size];
		int i = 0;
		while (i!=size) {
			a[size-1-i]=b[i];
			i++;	
		}
		System.out.println(b);
		System.out.println(a);
	}
}

