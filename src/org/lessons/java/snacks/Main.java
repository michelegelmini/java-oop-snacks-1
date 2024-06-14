package org.lessons.java.snacks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Studente marietto = new Studente("Marietto", "Marietti", 23);
//		
//		System.out.println(marietto.getFullStudentInfo());
		
		ContoBancario user1 = new ContoBancario(1234);
		
		
		user1.depositCash(12);
		user1.getAccountBalance();
		

		user1.depositCash(8);
		user1.getAccountBalance();
		

		user1.whitdrawCash(10);
		user1.getAccountBalance();
		
		
	
	
	
	}

}
