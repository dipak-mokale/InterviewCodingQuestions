package com.velocity.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SortArray {
	public static void main(String[] args) {
//		Arrays.asList(1,9,8,20,8,3,71,32,81,1);
		
		List<Integer> list = Arrays.asList(1,9,8,20,8,3,71,32,81,1);
		ArrayList<Integer> sortedList = new ArrayList<Integer>();
		HashSet<Integer> removeDuplicates = new HashSet<>();
		
		for(Integer i:list) {
			if(!(removeDuplicates.contains(i))){
				removeDuplicates.add(i);
				sortedList.add(i);
				
			}
		}Collections.sort(sortedList);
		for(Integer i: sortedList) {
			System.out.println(i);
		}
	}

}

