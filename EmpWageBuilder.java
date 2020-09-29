package assignment1;

import java.util.Random;

public class EmpWageBuilder implements IEmpWageCompute {
	public final int FULL_TIME=1;
	public final int PART_TIME=2;
	public final int ABSENT=0;
	
	private Company[] empWageArray;
	
	public EmpWageBuilder(){
		 empWageArray= new Company[5];
	}
	private int companyNo=0;
	
	public void addCompanyWage(String company, int wage_per_hour, int days_per_month, int hours_per_month) {
		empWageArray[companyNo] = new Company(company, wage_per_hour, days_per_month, hours_per_month);
		companyNo++;
	}
	
	public void computeWage() {
		for (int i=0;i<companyNo;i++) {
			empWageArray[i].setTotalEmployeeWage(calculateWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}
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

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		IEmpWageCompute empWageBuilder= new EmpWageBuilder();
		empWageBuilder.addCompanyWage("Company1",20,20,80);
		
		empWageBuilder.addCompanyWage("Company2",30,15,65);

		empWageBuilder.addCompanyWage("Company3",25,22,90);
		
		empWageBuilder.computeWage();
	}
}
