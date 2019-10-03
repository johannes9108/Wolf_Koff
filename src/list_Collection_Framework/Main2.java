package list_Collection_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import list_Collection_Framework.listOfHomework.Term;

public class Main2 {

	public static void main(String[] args) {

		List<Term> polynomial = new LinkedList<Term>();
		polynomial.add(new Term(4, 1));
		polynomial.add(new Term(5, 2));
		polynomial.add(new Term(6, 3));
		polynomial.add(new Term(7, 4));
		polynomial.sort(null);

		List<Term> polynomial2 = new LinkedList<Term>();
		polynomial2.add(new Term(1, 3));
		polynomial2.add(new Term(2, 4));
		polynomial2.add(new Term(3, 5));
		polynomial2.add(new Term(4, 6));
		polynomial2.sort(null);

		for (Term t : polynomial)
			System.out.print(t + " ");
		System.out.println();
		for (Term t : polynomial2)
			System.out.print(t + " ");
		System.out.println();
		
		List<Term> result = addPolynomials(polynomial, polynomial2);
		
		for (Term t : result)
			System.out.print(t + " ");
	}

	public static List<Term> addPolynomials(List<Term> poly1, List<Term> poly2) {
		List<Term> first;
		List<Term> second;
		List<Term> result = new LinkedList<Term>();
		if (poly1.size() > poly2.size()) {
			first = poly1;
			second = poly2;

		} else {
			first = poly2;
			second = poly1;

		}
		Iterator<Term> firstItr = first.iterator();
		Iterator<Term> secondItr = second.iterator();

		Term t1 =null, t2 = null;
		int prevIteration = 0;

		while (firstItr.hasNext() && secondItr.hasNext()) {
			
			//Picking Right iterator
			if (prevIteration == 0) {
				t1 = firstItr.next();
				t2 = secondItr.next();
			}
			else if(prevIteration == -1) {
				t1 = firstItr.next();
			}
			else
				t2 = secondItr.next();
			
			//Comparing and saving decision
			
			if (t1.compareTo(t2) < 0) {
				result.add(t1);
				prevIteration = -1;
			} else if (t1.compareTo(t2) > 0) {
				result.add(t2);
				prevIteration = 1;
			} else {
				result.add(addTerms(t1, t2));
				prevIteration = 0;
			}
		}
		while (firstItr.hasNext())
			result.add(firstItr.next());
		while (secondItr.hasNext())
			result.add(secondItr.next());
		return result;
	}

	public static Term addTerms(Term t1, Term t2) {
		return new Term(t1.getCoefficient() + t2.getCoefficient(), t1.getExponent());
	}
}
