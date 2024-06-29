package org.lessons.java.snack04;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mario");
		list.add("Concetta");
		list.add("Luigi");
		list.add("Genoveffa");
		list.add("Claudia");
		list.add("Aldo");
		list.add("Giovanni");
		list.add("Giacomo");
		list.add("Luciana");
		
		System.out.println(list);
		
		//manual order
		
		//bubble swap
		
		
		int length = list.size();
		boolean swapped = false;
		
		do {
			swapped = false;
			
			for(int index = 1 ; index < length ; index ++) {
				String previousElement = list.get(index-1);
				String nextElement = list.get(index);
				if(previousElement.compareToIgnoreCase(nextElement) > 0 ) {
					//must swap elements
					list.set(index, previousElement);
					list.set(index - 1, nextElement);
					swapped = true;
					System.out.println(list);
				}
			
			
			}
			
		} while (swapped);

		
		//automatic order
		Collections.sort(list);

		System.out.println(list);
		
		
		
	
		}
		
	}


