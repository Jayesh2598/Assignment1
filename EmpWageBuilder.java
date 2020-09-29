package assignment1;

import java.util.*;

public class EmpWageBuilder implements IEmpWageCompute {
	public final int FULL_TIME=1;
	public final int PART_TIME=2;
	public final int ABSENT=0;
	
	static Scanner sc=new Scanner(System.in);
	
	private ArrayList<Company> empWageArray;
	private HashMap<String,Company> empWageMap;
	
	public EmpWageBuilder(){
		 empWageArray= new ArrayList<Company>();
		 empWageMap= new HashMap<String,Company>();
	}
	
	public void addCompanyWage(String companyName, int wage_per_hour, int days_per_month, int hours_per_month) {
		Company company = new Company(companyName, wage_per_hour, days_per_month, hours_per_month);
		empWageArray.add(company);
		empWageMap.put(companyName, company);
	}
	
	public void computeWage() {
		for (Company company: empWageArray) {
			company.setTotalEmployeeWage(calculateWage(company));
			//System.out.println(company);
		}
	}
	
	public int calculateWage(Company company) {
		int hoursWorked=0;
		int empHours=0;
		int days=0;
		Random ran=new Random();
		
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
		};
		return hoursWorked*company.getWage_per_hour();
	}
	
	public int getTotalWageByCompany(String companyName) {
		return empWageMap.get(companyName).getTotalEmployeeWage();
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		IEmpWageCompute empWageBuilder= new EmpWageBuilder();
		empWageBuilder.addCompanyWage("Company1",20,20,80);
		empWageBuilder.addCompanyWage("Company2",30,15,65);
		empWageBuilder.addCompanyWage("Company3",25,22,90);
		empWageBuilder.computeWage();
		System.out.println("Enter the company name (Company1/Company2/Company3):");
		String companyName= sc.next();
		if(companyName.equalsIgnoreCase("Company1") || companyName.equalsIgnoreCase("Company2") || companyName.equalsIgnoreCase("Company3"))
			System.out.println("The total wage of the employee of "+companyName+" is:"+empWageBuilder.getTotalWageByCompany(companyName));
		else
			System.out.println("Invalid company name.");
	}
}
