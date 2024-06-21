package org.lessons.java.snacks;

public class RegistroStudenti {
	private Studente[] studentsLog;
	
	public RegistroStudenti() {
		this.studentsLog = new Studente[0];
	}
	
	public Studente[] getStudtentsLog() {
		return this.studentsLog;
	}
	
	public void addStudent(Studente newStudent) {
		
		// creo un nuovo array lungo un elemento in più di quello iniziale
		Studente[] newStudents = new Studente[this.studentsLog.length + 1];
		
		
		// conto gli elementi del vecchio array e aggiungo un posto alla fine
		for (int index = 0; index < this.studentsLog.length; index++) {
			newStudents[index] = this.studentsLog[index];
		}
		
		//aggiungo il nuovo studente nel posto rimasto vuoto in fondo all'array
		newStudents[newStudents.length - 1] = newStudent;
		
		//sovrascrivo il vecchio array con quello nuovo
		this.studentsLog = newStudents;
	}


}
	
