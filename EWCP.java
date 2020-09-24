package assignment1;

public class EWCP {
	
	public static final int WAGE_PER_HOUR= 20;
	public static final int PART_TIME= 1;
	public static final int FULL_DAY= 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empHours=0;
		int empType = (int) (Math.floor(Math.random() * 10) % 3);
		
		if(empType== FULL_DAY) {
			System.out.println("Full time employee.");
			empHours=8;
		}	
		else if(empType==PART_TIME) {
			System.out.println("Part time employee.");
			empHours=4;
		}	
		else {
			System.out.println("Employee absent.");
			empHours=0;
		}
		
		int empWage= WAGE_PER_HOUR * empHours;
		System.out.println("The daily wage of the employee is :" + empWage);
	}

}
