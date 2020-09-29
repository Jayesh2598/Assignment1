package assignment1;

import java.util.Random;

public class Company {
	
	public final int FULL_TIME=1;
	public final int PART_TIME=2;
	public final int ABSENT=0;
	
	private String company;
	private int wage_per_hour;
	private int days_per_month;
	private int hours_per_month;
	private int totalEmployeeWage;
	
	//Constructor
	public Company(String company, int wage_per_hour, int days_per_month, int hours_per_month) {
		this.company = company;
		this.wage_per_hour = wage_per_hour;
		this.days_per_month = days_per_month;
		this.hours_per_month = hours_per_month;
	}

	//Getters
	public int getWage_per_hour() {
		return wage_per_hour;
	}
	public int getDays_per_month() {
		return days_per_month;
	}
	public int getHours_per_month() {
		return hours_per_month;
	}
	
	//Setter
	public void setTotalEmployeeWage(int totalEmployeeWage) {
		this.totalEmployeeWage = totalEmployeeWage;
	}

	@Override
	public String toString() {
		return "The total employee wage for "+company+" is "+totalEmployeeWage;
	}
		
	public int calculateWage(Company company) {
		int hoursWorked=0;
		int empHours=0;
		int days=0;
		Random ran=new Random();
		System.out.println("Days\t Hours \t Total Hours Worked");
		
		while(hoursWorked< company.getHours_per_month() && days<company.getDays_per_month()){
			int empType = ran.nextInt(3);
			days++;
			
			switch(empType) {
				case FULL_TIME:
					empHours=8;
					break;	
				case PART_TIME:
					empHours=4;
					break;
				case ABSENT:
					empHours=0;
					break;
			}
			if((hoursWorked+empHours)<=company.getHours_per_month()) 
				hoursWorked += empHours;
			else {
				empHours=company.getHours_per_month()-hoursWorked;
				hoursWorked = company.getHours_per_month();
				
			}	
			System.out.println(days+"\t  "+empHours+"\t "+hoursWorked);

		};
		return hoursWorked*company.getWage_per_hour();
	}
}
