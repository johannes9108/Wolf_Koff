package ooProgramming_Class_Hierachies.PersonManagement;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(int annualSalary, String jobTitle, String name, String socialsecurity, int age, GenderType gender) {
		super(jobTitle, name, socialsecurity, age, gender);
		this.annualSalary = annualSalary;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [annualSalary=" + annualSalary + ", toString()=" + super.toString() + "]";
	}

	private int annualSalary;
	
	
}
