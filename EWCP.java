package assignment1;

public class EWCP {
	
	public static int WAGE_PER_HOUR=20;
	public static int FULL_DAY_HOUR=8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Welcome to Employee Wage Computation Programme!");
//		
//		int att= (int) (Math.floor(Math.random()*10) %2);
//		if(att == 1)
//			System.out.println("Employee is Present");
//		else
//			System.out.println("Employee is Absent");
		
		int DAILY_EMP_WAGE= WAGE_PER_HOUR * FULL_DAY_HOUR;
		System.out.println("The daily wage of the employee is :" + DAILY_EMP_WAGE);
	}

}
