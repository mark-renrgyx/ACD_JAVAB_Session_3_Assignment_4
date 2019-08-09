package week1.day3.assignment4;

import java.util.Scanner;

public class Student {
	private String name;
	private String phoneNumber;
	private int rollNumber;
	private String course;
	private String outcome;
	
	public String getOutcome() {
		return outcome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	@SuppressWarnings("resource") // We can't close the Scanner, no way to re-open input stream
	public void takeGrades() {
		// Now we take three grades and give score
		Scanner in = new Scanner (System.in);
		float[] scores = new float[3];
		
		System.out.println("We will take three grades.");
		
		System.out.println("Physics score?");
		scores[0] = in.nextFloat();
		
		System.out.println("Chemistry score?");
		scores[1] = in.nextFloat();
		
		System.out.println("Math score?");
		scores[2] = in.nextFloat();
		
		this.outcome = result (scores[0], scores[1], scores[2]);
	}
	
	public String result (float grade1, float grade2, float grade3) {
		
		float average = (grade1 + grade2 + grade3) / 3;
		
		if (average > 70)
			return "passed";
		else
			return "failed";
	}
	
	public String toString () {
		String s = "";
		s = s + "Name: " + this.name + "\n";
		s = s + "Phone Number: " + this.phoneNumber + "\n";
		s = s + "Course: " + this.course + "\n";
		s = s + "Roll Number: " + this.rollNumber + "\n";
		s = s + "Outcome: " + this.outcome + "\n";
		
		return "\n" + s;
	}
}
