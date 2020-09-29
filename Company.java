package assignment1;

public class Company {
	
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
}