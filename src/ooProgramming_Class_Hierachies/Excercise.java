package ooProgramming_Class_Hierachies;

import java.util.ArrayList;

import ooProgramming_Class_Hierachies.PersonManagement.GenderType;
import ooProgramming_Class_Hierachies.PersonManagement.HourlyEmployee;
import ooProgramming_Class_Hierachies.PersonManagement.Person;
import ooProgramming_Class_Hierachies.PersonManagement.SalariedEmployee;
import ooProgramming_Class_Hierachies.PersonManagement.Student;
import ooProgramming_Class_Hierachies.veterinaryoffice.Eagle;
import ooProgramming_Class_Hierachies.veterinaryoffice.Owl;
import ooProgramming_Class_Hierachies.veterinaryoffice.Pet;
import ooProgramming_Class_Hierachies.veterinaryoffice.Poisonous;
import ooProgramming_Class_Hierachies.veterinaryoffice.Spider;

public class Excercise {

	public static void main(String[] args) {
//		ArrayList<Pet> animals = new ArrayList<>();
//		animals.add(new Eagle("Hares"));
//		animals.add(new Owl("Rats"));
//		animals.add(new Spider("Flies"));
//		
//		for(Pet animal: animals) {
//			if(animal instanceof Poisonous)
//				((Poisonous)animal).bite();
//		}
	
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(new Student(1,"Johannes", "112", 28, GenderType.MALE));
		people.add(new Student(1,"Lisa", "342", 38, GenderType.FEMALE));
		people.add(new HourlyEmployee(150,"Professional","Sarah", "342", 45, GenderType.FEMALE));
		people.add(new SalariedEmployee(60000,"Amateur","Matt", "342", 45, GenderType.OTHER));
		
		for(Person person: people) {
			System.out.println(person);
		}
	}

	
}
