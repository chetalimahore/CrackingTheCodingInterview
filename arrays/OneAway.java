
package com.practice.arrays;

import com.practice.dynamicProgramming.*;

public class OneAway {
	
	public static boolean oneAway(String word1, String word2) {
		EditDistance editDistance = new EditDistance();
		int distance = editDistance.initTable(word1, word2);
		if(distance > 1) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	public static void main(String [] args) {
		System.out.println(oneAway("pale", "bake"));
	}
	
}
