/*
 *@author - Chetali Mahore 
 */

package com.practice.arrays;

import java.util.*;

public class CheckPermutation {

	/*O(n) space complexity approach using Hashmap */
	
	public static boolean checkPermutation(String one, String two){
		if(one.length() != two.length()) {
			return false;
		}
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < one.length() ; i++) {
			int value;
			char key;
			key = one.charAt(i);
		     if(hmap.containsKey(key)) {
		    	value =  hmap.get(key);
		    	value++;
		    	hmap.put(key, value);
		     }
		     else {
		    	 hmap.put(key, 1);
		     }
		}
		
		for(int i = 0 ; i < two.length() ; i++) {
			int value;
			char key;
			key = two.charAt(i);
		     if(hmap.containsKey(key)) {
		    	value =  hmap.get(key);
		    	value--;
		    	if(value < 0) {
		    		return false;
		    	}else {
		    		hmap.put(key, value);
		    	}
		     }
		     else {
		    	return false;
		     }
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse - xsmkmsksncghdsca
		System.out.println(checkPermutation("acsdhgcnsksmkmsx","xsmkmsksncghdsca"));
	}

}
