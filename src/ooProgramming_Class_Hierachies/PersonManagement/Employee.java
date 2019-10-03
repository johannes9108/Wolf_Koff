package ooProgramming_Class_Hierachies.PersonManagement;

public abstract class Employee extends Person {

	protected int test;
	private String jobTitle;
	public Employee(String jobTitle, String name, String socialsecurity, int age, GenderType gender) {
		super(name, socialsecurity, age, gender);
		this.jobTitle = jobTitle;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", toString()=" + super.toString() + "]";
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
