package week1.day3.assignment4;

import java.io.IOException;
import java.util.Scanner;

public class GradingMain {

	public static void main(String[] args) {

		Student student1 = inputStudent();
		student1.takeGrades();
		StudentResultProcessing.printResults(student1);
		
		Student student2 = inputStudent();
		student2.takeGrades();
		StudentResultProcessing.printResults(student2);
		
		Student student3 = inputStudent();
		student3.takeGrades();
		StudentResultProcessing.printResults(student3);
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		try {
			System.in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("resource") // We cannot close the scanner, no way to re-open input stream
	public static Student inputStudent() {
		Scanner in = new Scanner(System.in);
		Student dude = new Student();
		
		System.out.println("Provide student's name");
		String name = in.next();
		dude.setName(name);
		
		System.out.println("Provide student's course");
		dude.setCourse(in.next());
		
		System.out.println("Provide student's phone number");
		dude.setPhoneNumber(in.next());
		
		System.out.println("Provide student's roll number");
		dude.setRollNumber(in.nextInt());
		
		return dude;
	}
}
