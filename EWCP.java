package assignment1;

public class EWCP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee Wage Computation Programme!");
		
		int att= (int) (Math.floor(Math.random()*10) %2);
		if(att == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
