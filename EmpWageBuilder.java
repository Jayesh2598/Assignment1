package assignment1;

public class EmpWageBuilder {
	private Company[] empWageArray;
	
	public EmpWageBuilder(){
		 empWageArray= new Company[5];
	}
	private int companyNo=0;
	
	private void addCompanyWage(String company, int wage_per_hour, int days_per_month, int hours_per_month) {
		empWageArray[companyNo] = new Company(company, wage_per_hour, days_per_month, hours_per_month);
		companyNo++;
	}
	
	private void computeWage() {
		for (int i=0;i<companyNo;i++) {
			empWageArray[i].setTotalEmployeeWage(empWageArray[i].calculateWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		EmpWageBuilder empWageBuilder= new EmpWageBuilder();
		empWageBuilder.addCompanyWage("Company1",20,20,80);
		
		empWageBuilder.addCompanyWage("Company2",30,15,65);

		empWageBuilder.addCompanyWage("Company3",25,22,90);
		
		empWageBuilder.computeWage();
	}
}