package ooProgramming_Class_Hierachies.PersonManagement;

public class Student extends Person {
	
	private int GPA;

	public Student(int GPA, String name, String socialsecurity, int age, GenderType gender) {
		super(name, socialsecurity, age, gender);
		this.GPA = GPA;
	}

	public int getGPA() {
		return GPA;
	}

	public void setGPA(int gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [GPA=" + GPA + ", toString()=" + super.toString() + "]";
	}

}
