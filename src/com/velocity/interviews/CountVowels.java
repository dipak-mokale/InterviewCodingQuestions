package com.velocity.interviews;

public class CountVowels {

	public static void main(String[] args) {
		
		String string = "Deepak Mokale";
		string= string.toUpperCase();
		
		int vowelCount = 0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='A' || string.charAt(i)=='E' || string.charAt(i)=='I' || string.charAt(i)=='O' || string.charAt(i)=='U' ) {
				vowelCount++;
			}
		}System.out.println("Number of vowels in given string : "+vowelCount);
		

	}

}
