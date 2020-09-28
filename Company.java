package assignment1;

public class Company {
	

	private int wage_per_hour;
	private int days_per_month;
	private int hours_per_month;
	
	//Constructor
	public Company(int wage_per_hour, int days_per_month, int hours_per_month) {
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

	//Setters
	public void setWage_per_hour(int wage_per_hour) {
		this.wage_per_hour = wage_per_hour;
	}
	public void setDays_per_month(int days_per_month) {
		this.days_per_month = days_per_month;
	}
	public void setHours_per_month(int hours_per_month) {
		this.hours_per_month = hours_per_month;
	}
	
	public int calculateWage(int empHours, int WAGE_PER_HOUR, int HOURS_PER_MONTH, int DAYS_PER_MONTH) {
		int hoursWorked=0;
		int monthlyWage=0;
		int days=0;
		int dailyWage= WAGE_PER_HOUR * empHours;
		System.out.println("Wages\t Days\t Hours Worked");
		
		while((hoursWorked+empHours)<= HOURS_PER_MONTH && days<DAYS_PER_MONTH){		//Calculating till the nearest multiple of empHours less than 100
			monthlyWage += dailyWage;
			hoursWorked += empHours;
			days++;
			System.out.println(monthlyWage+"\t  "+days+"\t  "+hoursWorked);
		};
		if(hoursWorked!=HOURS_PER_MONTH && days<DAYS_PER_MONTH) {					//Calculating from nearest multiple of empHours to 100
			for(int i=hoursWorked;i<HOURS_PER_MONTH;i++) 
				monthlyWage += WAGE_PER_HOUR;
			System.out.println(monthlyWage+"\t  "+(++days)+"\t  "+HOURS_PER_MONTH);
		}
		return monthlyWage;
	}
}
