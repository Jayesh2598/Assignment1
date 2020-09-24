package assignment1;

public class EWCP {
	
	public static final int WAGE_PER_HOUR = 20;
	public static final int PART_TIME= 1;
	public static final int FULL_DAY= 2;
	public static final int DAYS_PER_MONTH= 20;
	public static final int HOURS_PER_MONTH= 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHours=0;
		int empType = (int) (Math.floor(Math.random() * 10) % 3);
		
		//Checking if employee is present and their type		
		switch (empType) {
			case FULL_DAY:
				System.out.println("Full time employee.");
				empHours=8;
				break;
				
			case PART_TIME:
				System.out.println("Part time employee.");
				empHours=4;
				break;
				
			default:
				System.out.println("Employee absent.");
				empHours=0;
				break;
		}
		
		//Calculating monthly wage
		int monthlyWage=0;
		int dailyWage= WAGE_PER_HOUR * empHours;
		
		if(empHours!=0 && (HOURS_PER_MONTH/empHours)<20)
			monthlyWage = HOURS_PER_MONTH * WAGE_PER_HOUR;
		else
			monthlyWage = dailyWage * DAYS_PER_MONTH;
		
		System.out.println("The monthly wage before the conditions are reached is : "+ monthlyWage);
	}

}