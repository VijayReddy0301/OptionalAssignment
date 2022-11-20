import java.util.Scanner;

public class MainLoan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================================");
		
		System.out.println(" $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ ");
		
		System.out.println();
		
		System.out.println("     Welcome To (Loan For All) App");
		
		System.out.println();
		
		System.out.println(" $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ $ ");
		
		System.out.println();
		
		
		boolean switchAgain = false;
		
		do {
		
		System.out.println("Choose the Bank Name From Where You Want Loan");
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Presently We Are Accepting This Banks");
		
		System.out.println();
		
		System.out.println("1 . Hdfc Bank");
		
		System.out.println();
		
		System.out.println("2 . ICIC Bank");
		
		System.out.println();
		
		System.out.println("3 . SBI Bank");
		
		System.out.println();
		
		
		System.out.println("Enter The Number of Bank You Want");
		
		int option = scan.nextInt();
		
		Bank b=null;
		
		switch(option) {
		
		case  1 : b=new Hdfc();
					break;
					
		case 2 : b= new Icic();
					break;
					
		case 3: b=new Sbi();
		
					break;
					
		default: System.out.println("Input");
		
	}
		
		b.display();
		
		String[] cDetails = new String[2];
		
		Customer c = new Customer();
		
		cDetails = c.getCustomerDetails();
		
		
		System.out.println();
		
		System.out.println("=================================================================================");
		
		System.out.println("Welcome ##-> " + cDetails[0] + " <-##" + " Your Branch City Is ==>" + cDetails[1]);
		
		System.out.println("==================================================================================");
		
		System.out.println();
		
		int option1 = b.options();
		
		Loan l = null;
		
		double interestRate = 0.0;
		
		switch(option1) {
		
			case  1 :    l=new PersonalLoan();
			
			
							l.personalLoanCreteria();
							
							l.loanCreteria();
			

							System.out.println("Enter the input Number ");
			
							int input2 = scan.nextInt();
							
							System.out.println();
							
							 interestRate = b.getPersonalInterestRate();
			
			
							if(input2 == 1) {
				
							
								c.getSalaryDetails();
								
							}else {
				
								c.getBusinessDetails();
									
							}
				
						        break;
		
			case 2 :    l = new HomeLoan();
			

								l.homeLoanCreteria();
			
								l.loanCreteria();


								System.out.println("Enter the input Number ");

								int input3 = scan.nextInt();
			
								System.out.println();
			
								interestRate = b.getHomeInterestRate();


								if(input3 == 1) {

										c.getSalaryDetails();
								}else {

										c.getBusinessDetails();
					
								}

						      
								break;
		
			
			case 3:     l=new VehicleLoan() ;
			

									l.vehicleLoanCreteria();

									l.loanCreteria();


									System.out.println("Enter the input Number ");

									int input4 = scan.nextInt();

									System.out.println();

									interestRate = b.getHomeInterestRate();


									if(input4 == 1) {

										c.getSalaryDetails();
										
									}else {

										c.getBusinessDetails();

									}
									break;
		
			case 4 :    l = new EducationLoan();
			

							l.educationLoanCreteria();

							l.loanCreteria();


							System.out.println("Enter the input Number ");

							int input5 = scan.nextInt();

							System.out.println();

							interestRate = b.getHomeInterestRate();


							if(input5 == 1) {

									c.getSalaryDetails();
				
							}else {

									c.getBusinessDetails();

							}
							
							break;
			
							
							
							
							
			case 5 :    l = new Agriculture();
			

								l.agricultureLoanCreteria();

								System.out.println();
								
								System.out.println("===========================================");
								
								System.out.println("    Agriculture Is Most Important In India");
								
								System.out.println("===========================================");
								
								System.out.println("    Farmers Are backbone For The Economy");
								
								System.out.println();
								
								System.out.println("For Farmers Interest Rate Is 0.0");

								interestRate = b.getAgricultureInterestRate();
								
								break;

		
			
			default: System.out.println("Wrong Input");
		
	}
		
		System.out.println();
		
		System.out.println("============================================================");
		
		System.out.println("    Thank You For Submitting Details       ");
		
		System.out.println("============================================================");
		
		System.out.println();

		l.getLoanDetails();
		
		double interset = l.calculateLoan(interestRate);
		
		l.loanDetails();
		
		System.out.println("Rate Of Interset is                        :: " +interestRate);
		
		System.out.println();
		
		System.out.println("=============================================================");
		
		
		System.out.println("Total Interest Paid For 5 Years Is          ::  " +interset );
		
		System.out.println();
		
		

		System.out.println("=====================================================");

		System.out.println("If you Are Satisfied And Continue Press ::     Yes");
		
		System.out.println(    " or    ");
		
		System.out.println("If you Want to Switch Another Bank Press ::     No");
		
		System.out.println();
		
		System.out.println("Enter Your Option ");
		
		
		System.out.println("======================================================");

		String output = scan.next();



		if(output.equalsIgnoreCase("YES")  || output.equalsIgnoreCase("Y")) {

			switchAgain = false;
		}else {

			switchAgain = true;
		}
		
		

	}while(switchAgain);
		
		
		System.out.println("======================================================");
		
		System.out.println("Get The Documents Ready Our Execute Contact You Soonn");
		
		System.out.println("Thanks For Using Our App");
		
		System.out.println("======================================================");
		
		
		scan.close();
}
	
}
