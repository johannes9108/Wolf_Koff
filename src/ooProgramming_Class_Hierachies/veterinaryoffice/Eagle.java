package ooProgramming_Class_Hierachies.veterinaryoffice;

public class Eagle extends Pet implements Flyable {

	public Eagle(String diet) {
		super(diet);
		System.out.println("An eagle was born");
	}

	@Override
	public void fly() {
		System.out.println("To infinity and beyond!");
	}

}
