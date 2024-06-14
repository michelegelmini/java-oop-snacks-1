package org.lessons.java.snacks;

public class Studente {



	private String studentFirstName;
	private String studentLastName;
	private int studentAge;
	
	public Studente(String studentFristName, String studentLastName, int studentAge ) {
		this.studentFirstName = studentFristName;
		this.studentLastName = studentLastName;
		this.studentAge = studentAge;
	}
	
	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public String getFullStudentInfo() {
		String fullStudentInfo = this.studentFirstName + " " + this.studentLastName + ", " + this.studentAge + "anni";
		return fullStudentInfo;
	}
}
