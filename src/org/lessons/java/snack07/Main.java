package org.lessons.java.snack07;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<String> guests = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		String inputName;
		
		guests.add("Marietto");
		guests.add("Giovanni");
		guests.add("Sandra");
		guests.add("Paolo");
		guests.add("Ambra");
		guests.add("Elvira");
		guests.add("Antonio");
		guests.add("Benedetta");
		
		
		System.out.println("Chi vuoi cercare?");
		inputName = scanner.nextLine();
		
		
		System.out.println(findElement(inputName));

	}
	
	public static int findElement(String nameToSearch) {
		if (guests.contains(nameToSearch)) {
			return 1;
		} else {		
		return 0;
		}
		
	}

}
