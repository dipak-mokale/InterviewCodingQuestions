package com.bhushangajeshwar.interview;

public class Interview7 {
		
		//count vowels and consonants in given string
		
		public static void main(String[] args) {
			String a = "bhushan";
			char y []=a.toCharArray();
			int size = a.length();
			int volcount = 0;
			int concount =0;
			int i =0;
			while(i!=size) {
				if(y[i]=='a'|| y[i]=='e'||y[i]=='i'||y[i]=='o'||y[i]=='u') {
					volcount++;
				}
				else{
					concount++;
				}
				i++;
			}
		System.out.println(volcount);
		System.out.println(concount);
		}
	}


