package ooProgramming_Class_Hierachies.veterinaryoffice;

public class Spider extends Pet implements Poisonous {

	public Spider(String diet) {
		super(diet);
		System.out.println("A spider was born");
	}

	@Override
	public void bite() {
		System.out.println("You are now infected haha!");
	}

}
