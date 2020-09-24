package assignment1;

public class EWCP {
	
	public static final int WAGE_PER_HOUR= 20;
	public static final int PART_TIME= 1;
	public static final int FULL_DAY= 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHours=0;
		int empType = (int) (Math.floor(Math.random() * 10) % 3);
		
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
		
		int empWage= WAGE_PER_HOUR * empHours;
		int monthlyWage= empWage*20;
		System.out.println("The daily wage of the employee is : " + empWage);
		System.out.println("Monthly wage of the employee is : "+monthlyWage);
	}

}
