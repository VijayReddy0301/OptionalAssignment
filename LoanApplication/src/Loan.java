import java.util.Scanner;

class Loan  {
	

	double pAmount;
	
	int time;
	
	double interest;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void loanDetails() {
		
		
		System.out.println();
		
		System.out.println("Your Principal Amount is                ::"  +pAmount );
		
		System.out.println();
		
		System.out.println("No Of Years To Be Repay Is              ::   " +time);
		
		System.out.println();
	}
	
	public void loanCreteria() {
		
		System.out.println(" *********  ELIGIBILITY ****************");
		
		System.out.println();
		
		System.out.println(" 1 . You are within the age range of 21 to 60 years.");
		
		System.out.println();
		
		System.out.println(" 2 . You have held a job for at least 2 years, with a minimum of 1 year with the current employer.");
		
		System.out.println();
		
		System.out.println(" 3 . Those who earn a minimum of 25,000 net income per month.");
		
		System.out.println();
		
		System.out.println("             TYPE OF EMPLOYMENT                ");
		
		System.out.println("===============================================================");
		
		System.out.println(" 1 . Employed Type");
		
		System.out.println();
		
		System.out.println(" 2 . Self-Employed");
		
		System.out.println();
		
		
		
	}
	
public void personalLoanCreteria() {
		
		
	
		System.out.println("Personal Loan");
}


 public void homeLoanCreteria() {
	
	System.out.println("Home Loan");
	
}
 
 public void vehicleLoanCreteria() {
		
		System.out.println("Vechile Loan");
		
	}
	
 
 public void educationLoanCreteria() {
		
		System.out.println("Vechile Loan");
		
	}
 
 public void agricultureLoanCreteria() {
		
		System.out.println("Agriculture Loan");
		
	}
 
 
 
 
	
	void getLoanDetails() {
		
		
		
		System.out.println();
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Enter The Amount You Want to take");
		
		pAmount = sc.nextDouble();
		
		System.out.println("-------------------------------------------------");
		
		System.out.println("Enter the No of Years To Repay The Loan");
		
		time = sc.nextInt();
	
	}
	
	public double calculateLoan(double interestRate) {
		
		
		return 0;
		
		
	}
	
	public void displayloan() {
		
		System.out.println("Loan Details");
	}
}

class PersonalLoan extends Loan{
	
			public void displayloan() {
		
					System.out.println("Loan Details");
		}

			public void displayDetails() {
			
			System.out.println("======================================");
			
			System.out.println("        Personal Loan Details          ");
			
			System.out.println("=======================================");
			
	}
			
			public void personalLoanCreteria() {
				
				
				System.out.println("=======Personal Loan Details========");
				
				System.out.println();
				
				System.out.println("Everthing You need To About Personal Loan");
				
				System.out.println();
				
				
			}
		
		public double calculateLoan(double interestRate) {
			
			
			interest = (pAmount*time*interestRate)/100;
			
			
			return interest;
			
	}
		
}
	
class HomeLoan extends Loan{
	

	public void homeLoanCreteria() {
		
		
		System.out.println("=======HOME LOAN DETAILS========");
		
		System.out.println();
		
		System.out.println("Everthing You need To About Home Loan");
		
		System.out.println();
		
		
	}
		double interest;
		
		public double calculateLoan(double interestRate) {
			
	
			interest = (pAmount*time*interestRate)/100;
			
			System.out.println(interest);
			
			return interest;
			
	}
		
}

class VehicleLoan extends Loan{
	
	
	
public void vehicleLoanCreteria() {
		
	
	System.out.println("=======VEHICLE LOAN DETAILS========");
	
	System.out.println();
	
	System.out.println("Everthing You need To About Vechile Loan");
	
	System.out.println();
	
	System.out.println("Type Of The Vechile You Are Taking");
	
	System.out.println("Enter......");
	
	String s =sc.next();
	
	System.out.println();
	
	System.out.println("====================================================");
	
	System.out.println("Your Type Of Vechile Is  ####   "   +  s+"    ####");
	
	System.out.println("=====================================================");
	
	
		
	}
		
		public double calculateLoan(double interestRate) {
			
			
			interest = (pAmount*time*interestRate)/100;
			
			
			return interest;
			
	}
		
}

class EducationLoan extends Loan{
	
	
	public void educationLoanCreteria() {
		
		System.out.println("=======EDUCATION LOAN DETAILS========");
		
		System.out.println();
		
		System.out.println("Everthing You need To About Education Loan");
		
		System.out.println();
		
		
	}
		
		public double calculateLoan(double interestRate) {
			
			
			interest = (pAmount*time*interestRate)/100;
			
			
			return interest;
			
	}
		
}

class Agriculture extends Loan{
	
	
public void agricultureLoanCreteria() {
		
		System.out.println("=======ARICULTURE LOAN DETAILS========");
	
		System.out.println();
	
		System.out.println("Everthing You need To About Agriculture Loan");
	
		System.out.println();
		
	}
	
		
		public double calculateLoan(double interestRate) {
			
			
			interest = (pAmount*time*interestRate)/100;
			
			
			return interest;
			
	}
		
}
	

