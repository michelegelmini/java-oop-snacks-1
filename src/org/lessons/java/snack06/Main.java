package org.lessons.java.snack06;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) {
	
		FileOpener fileToOpen = new FileOpener();
		try {
			String data = fileToOpen.readText("./wewei.txt");
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("C'è stato un errore " + " " + e.getMessage());
		}
		

	}

}
