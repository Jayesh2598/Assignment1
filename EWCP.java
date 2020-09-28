package assignment1;

import java.util.Scanner;

public class EWCP {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Employee Wage Computation Program!");

		System.out.println("Enter the company number (1/2/3):");									//Taking company number as input from user
		int number= Integer.parseInt(sc.nextLine());								
		while(number<1 || number>3) {
			System.out.println("Please enter a number between 1-3.");
			number=Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Enter the type of employee (Full time/ Part time/ Absent) :");			//Taking employee Type as input from user
		String empType= sc.nextLine().trim();
		while( !(empType.equalsIgnoreCase("full time") || empType.equalsIgnoreCase("part time") || empType.equalsIgnoreCase("absent"))) {
			System.out.println("Please enter a valid employee type.");
			empType=sc.nextLine().trim();
		}
		
		int empHours=0;		
		switch (empType.toUpperCase()) {						//Setting the daily work hours depending on the employee type defined by user
			case "FULL TIME":
				empHours=8;
				break;	
			case "PART TIME":
				empHours=4;
				break;
			case "ABESNT":
				empHours=0;
				break;
		}
		
		int monthlyWage=0;
		switch (number) {											//Initializing an object of class defined by user and calculating wage
			case 1:
				Company company1=new Company(20,20,100);
				System.out.println("Wage per hour:"+company1.getWage_per_hour()+"\nWorking days per month:"+company1.getDays_per_month()+"\nWorking hours per month:"+company1.getHours_per_month());
				monthlyWage= company1.calculateWage(empHours, company1.getWage_per_hour(), company1.getHours_per_month(), company1.getDays_per_month());
				break;
			case 2:
				Company company2=new Company(30,15,90);
				System.out.println("Wage per hour:"+company2.getWage_per_hour()+"\nWorking days per month:"+company2.getDays_per_month()+"\nWorking hours per month:"+company2.getHours_per_month());
				monthlyWage= company2.calculateWage(empHours, company2.getWage_per_hour(), company2.getHours_per_month(), company2.getDays_per_month());
				break;
			case 3:
				Company company3=new Company(25,22,120);
				System.out.println("Wage per hour:"+company3.getWage_per_hour()+"\nWorking days per month:"+company3.getDays_per_month()+"\nWorking hours per month:"+company3.getHours_per_month());
				monthlyWage= company3.calculateWage(empHours, company3.getWage_per_hour(), company3.getHours_per_month(), company3.getDays_per_month());
				break;
		}
		
		System.out.println("The monthly wage of a "+ empType.toLowerCase() +" employee in Company"+ number +" when the conditions are reached is : "+ monthlyWage);
		sc.close();
	}
}