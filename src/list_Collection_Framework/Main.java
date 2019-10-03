package list_Collection_Framework;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

import list_Collection_Framework.listOfHomework.Assignment;

public class Main {
	public static void main(String[] args) {
		ArrayList<Assignment> assignments = new ArrayList<>();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		assignments.add(new Assignment("Math", LocalDate.parse("20010101", df)));
		assignments.add(new Assignment("Chemistry", LocalDate.parse("19520101", df)));
		assignments.add(new Assignment("Science", LocalDate.parse("20131003", df)));
		assignments.add(new Assignment("Social", LocalDate.parse("20030103", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		assignments.add(new Assignment("Math", LocalDate.parse("20010101", df)));
		assignments.add(new Assignment("Chemistry", LocalDate.parse("19520101", df)));
		assignments.add(new Assignment("Science", LocalDate.parse("20131003", df)));
		assignments.add(new Assignment("Social", LocalDate.parse("20030103", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		assignments.add(new Assignment("Math", LocalDate.parse("20010101", df)));
		assignments.add(new Assignment("Chemistry", LocalDate.parse("19520101", df)));
		assignments.add(new Assignment("Science", LocalDate.parse("20131003", df)));
		assignments.add(new Assignment("Social", LocalDate.parse("20030103", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		assignments.add(new Assignment("PE", LocalDate.parse("19320101", df)));
		while(true) {
			menu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.print("Enter a subject: ");
				String sub = sc.nextLine();
				System.out.print("Enter a date (yyyymmdd: )");
				String date = sc.nextLine();
				LocalDate lDate = LocalDate.parse(date, df);
				System.out.println(lDate);
				assignments.add(new Assignment(sub, lDate));
				break;
			case 2:
				System.out.print("Enter id for assignmnet removal: ");
				int id = sc.nextInt();
				sc.nextLine();
				for(Assignment a: assignments) {
					if(a.getId() == id) {
						System.out.println("Deleting " + a.toString());
						assignments.remove(a);
						break;
					}
				}
				System.out.println("");
				break;
			case 3:
				System.out.println("Displaying all assigments");
				System.out.println("-------------------------");
				for(Assignment a: assignments) {
					System.out.println(a);
				}
				System.out.println("");
				break;
			case 4:
				
				ArrayList<Assignment> tmp = (ArrayList<Assignment>) assignments.clone();
				Collections.sort(tmp, (o1,o2) -> (Year.from(o1.getDue_date()).getValue() - Year.from(o2.getDue_date()).getValue()));
				Assignment first = tmp.get(0);
				for(Assignment a: tmp) {
					if(!first.getDue_date().equals(a.getDue_date())) 
						break;
					 System.out.println(a);
				}
				
				
				break;
			case 5:
				
				break;
			default:
				System.out.println("Try again!");
				
			}
			
			
		}
		
		
		
	}
	
	public static void menu() {
		System.out.println("1 Add a new assignment");
		System.out.println("2 Remove an assignment");
		System.out.println("3 Display assignments in order they were assigned");
		System.out.println("4 Find assignments with earliest due date");
		System.out.println("5 Terminator!");
		
		
		
	}
}
