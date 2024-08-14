package org.lessons.java.snack05;

import java.util.*;

public class Main {
	
	
	static HashMap<String, String> capitalCities = new HashMap<String, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		capitalCities.put("Italia", "Roma");
		capitalCities.put("Grecia", "Atene");
		capitalCities.put("Francia", "Parigi");
		capitalCities.put("Germania", "Berlino");
		
		System.out.println(capitalCities);
		
		checkDuplicate(capitalCities, "Italia");
		
		

	}
	
	
	public static boolean checkDuplicate(HashMap<String, String> newMap, String key) {
		//check if for every key exists one equal to the one i'm looking for
		boolean duplicatedFound = false;
		Set<String> keys = newMap.keySet();

		for (String currentKey : keys) {
			System.out.println(currentKey);
		
			if (currentKey.equals(key)) {
				duplicatedFound = true;
				break;
			}
		}
		
		return duplicatedFound;
	}
	
	// built-in method
//	public static boolean addElement(HashMap<String, String> newMap, String key) {
//		// boolean duplicatedFound = false;
//		
//		return newMap.containsKey(key);
//	}
	


}
