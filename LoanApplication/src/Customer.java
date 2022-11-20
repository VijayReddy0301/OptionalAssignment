import java.util.Scanner;

class Customer{
	
	String [] details = new String[2];
	
	Scanner sc = new Scanner(System.in);
	
	public String[] getCustomerDetails() {
		
		
		System.out.println();
		
		System.out.println("Enter Your  Name");
		
		System.out.println();
		
		details[0] = sc.next();
		
		System.out.println();
		
		System.out.println("Enter Your City");
		
		details[1] = sc.next();
		
		return details;
		
		
	}
	
	
	public void getSalaryDetails() {
		
		 
		System.out.println("            EMPLOYMENT DETAILS             ");
		
		
		System.out.println("========================================");
		
		System.out.println("Enter Your Job Role");
		
		String st = sc.next();
		
		System.out.println("-------------------------------------");
		
		System.out.println("Enter Your Date Of Birth");
		
		String st1 = sc.next();
		
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter Your Salry");
		
		double salary = sc.nextDouble();
	}
	
public void getBusinessDetails() {
		
	
	 
		System.out.println("            BUSINESS DETAILS             ");
	
	
	
		System.out.println("========================================");
		
		System.out.println("Enter Your Business Organisation");
		
		String st = sc.next();
		
		System.out.println("-------------------------------------");
		
		System.out.println("Enter Your Date Of Birth");
		
		String st1 = sc.next();
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Enter Your Yearly Earnings");
		
		double salary = sc.nextDouble();
		
		sc.close();
	}
	


}
