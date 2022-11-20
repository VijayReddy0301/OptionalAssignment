import java.util.Scanner;

class Bank{
	
	
	Scanner sc = new Scanner(System.in);
	
public int options() {
		
		
		
		System.out.println("Enter The Loan Type Number You wish To Take");
		
		System.out.println("1 . Personal Loan ");
		
		
		System.out.println("2 . Home Loan ");
		
		
		System.out.println("3 . Vehicle Loan ");
		
		
		System.out.println("4 . Education Loan ");
		
		
		System.out.println("5 . Agriculture Loan ");
		
		
		System.out.println();
		
		
		
		System.out.println("Enter The Option You Want.....");
		
		int option = sc.nextInt();
		
		return option;
	
     }

	public void display() {
		
		System.out.println("Welcome");
	}
	
	
	public double getPersonalInterestRate() {
		
		
		final double pRate = 15.6;
		
		return pRate ;
		
	}

	public double getHomeInterestRate() {
		
		final double hRate = 11.6;
		
		return hRate ;
		
	}

   public double getVehicleInterestRate() {
		
		final double vRate = 11.6;
		
		return vRate ;
   }
   
   public double getEducationInterestRate() {
		
		final double eRate = 11.6;
		
		return eRate ;
		
	}
   
   
   public double getAgricultureInterestRate() {
		
		final double aRate = 0.0;
		
		return aRate ;
		
	}

	
	
}


class Hdfc extends Bank{
	
	
	public void display() {
		
		System.out.println("==============================================");
		
		System.out.println("      ******Welcome To Hdfc Bank********     ");
		
		System.out.println("==============================================");
		
		System.out.println();
		
		System.out.println("-------------Enter Your Details----------------");
		
		System.out.println();
		
		
	}
	
	public double getPersonalInterestRate() {
		
		
		final double pRate = 15.6;
		
		return pRate ;
		
	}

   public double getHomeInterestRate() {
		
		final double hRate = 11.6;
		
		return hRate ;
		
	}

   public double getVehicleInterestRate() {
		
		final double vRate = 11.6;
		
		return vRate ;
   }
   
   public double getEducationInterestRate() {
		
		final double eRate = 11.6;
		
		return eRate ;
		
	}
   
   
   public double getAgricultureInterestRate() {
		
		final double aRate = 0.0;
		
		return aRate ;
		
	}



}

class Icic extends Bank{
	
	
	public void display() {
		
		System.out.println("==============================================");
		
		System.out.println("      ******Welcome To Icic Bank********     ");
		
		System.out.println("==============================================");
		
		System.out.println();
		
		System.out.println("-------------Enter Your Details----------------");
		
		System.out.println();
		
		
	}
	
	public double getPersonalInterestRate() {
		
		final double pRate = 16.6;
		
		return pRate ;
		
	}

   public double getHomeInterestRate() {
		
		final double hRate = 13.6;
		
		return hRate ;
		
	}

   public double getVehicleInterestRate() {
		
		final double vRate = 10.6;
		
		return vRate ;
   }
   
   public double getEducationInterestRate() {
		
		final double eRate = 6.6;
		
		return eRate ;
		
	}
   
   
   public double getAgricultureInterestRate() {
		
		final double aRate = 0.0;
		
		return aRate ;
		
	}



}


class Sbi extends Bank{
	
	
	public void display() {
		
		System.out.println("==============================================");
		
		System.out.println();
		
		System.out.println("    ******  Welcome To Sbi Bank  ********     ");
		
		System.out.println();
		
		System.out.println("==============================================");
		
		
		System.out.println();
		
		System.out.println("-------------Enter Your Details----------------");
		
		System.out.println();
		
		
	}
	
	public double getPersonalInterestRate() {
		
		final double pRate = 12.6;
		
		return pRate ;
		
	}

   public double getHomeInterestRate() {
		
		final double hRate = 9.6;
		
		return hRate ;
		
	}

   public double getVehicleInterestRate() {
		
		final double vRate = 8.6;
		
		return vRate ;
   }
   
   public double getEducationInterestRate() {
		
		final double eRate = 4.6;
		
		return eRate ;
		
	}
   
   
   public double getAgricultureInterestRate() {
		
		final double aRate = 0.0;
		
		return aRate ;
		
	}



}

