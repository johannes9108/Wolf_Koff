package ooProgramming_Class_Hierachies.PersonManagement;

public abstract class Person {

	private String name;
	private String socialsecurity;
	private int age;
	private GenderType gender;
	
	
	
	public Person(String name, String socialsecurity, int age, GenderType gender) {
		super();
		this.name = name;
		this.socialsecurity = socialsecurity;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getSocialsecurity() {
		return socialsecurity;
	}
	public int getAge() {
		return age;
	}
	public GenderType getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSocialsecurity(String socialsecurity) {
		this.socialsecurity = socialsecurity;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", socialsecurity=" + socialsecurity + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	
}
