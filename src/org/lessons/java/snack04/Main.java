package org.lessons.java.snack04;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Mario");
		lista.add("Concetta");
		lista.add("Luigi");
		lista.add("Genoveffa");
		lista.add("Claudia");
		lista.add("Aldo");
		lista.add("Giovanni");
		lista.add("Giacomo");
		lista.add("Luciana");
		
		System.out.println(lista);
		
		//ordinamento manuale
		
		//???
		
		
		

		
		//ordinamento automatico
		Collections.sort(lista);

		System.out.println(lista);
	}

}
