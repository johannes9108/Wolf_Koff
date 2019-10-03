package ooProgramming_Class_Hierachies.PersonManagement;

public class HourlyEmployee extends Employee {

	private int hourlyRate;

	public HourlyEmployee(int hourlyRate, String jobTitle, String name, String socialsecurity, int age,
			GenderType gender) {
		super(jobTitle, name, socialsecurity, age, gender);
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourlyRate=" + hourlyRate + ", toString()=" + super.toString() + "]";
	}
	

}
