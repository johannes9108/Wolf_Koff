package ooProgramming_Class_Hierachies.veterinaryoffice;

public class Owl extends Pet implements Flyable, Nocturnal {

	
	
	
	public Owl(String diet) {
		super(diet);
		System.out.println("An owl was born");
	}

	@Override
	public void see() {
		System.out.println("I see with my little eye!");
	}

	@Override
	public void fly() {
		System.out.println("I'm taking off now!");
	}

}
