package list_Collection_Framework.listOfHomework;

public class Term implements Comparable<Term> {

	private int exponent, coefficient;
	
	public Term(int coefficient, int exponent) {
		super();
		this.exponent = exponent;
		this.coefficient = coefficient;
	}

	@Override
	public int compareTo(Term o) {
		if(exponent>o.getExponent())
			return -1;
		else if(exponent<o.getExponent())
			return 1;
		else return 0;
	}

	public int getExponent() {
		return exponent;
	}

	public int getCoefficient() {
		return coefficient;
	}

	public void setExponent(int exponent) {
		this.exponent = exponent;
	}

	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}
	
	@Override
	public String toString() {
		return "" + coefficient + "x^" + exponent;
	}
}
