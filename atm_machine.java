package atm_machine;

import java.util.*;
public class atm_machine {

	public static void main(String[] args) 
	{
	
		int pincode,amount;
		int choice,balance=50000;
		System.out.println("** welcome to state bamk ATM**   "+"\n"+"insert your card");
		System.out.println(" enter your pincode ");
		try{
		Scanner in  = new Scanner(System.in);
		pincode=in.nextInt();
		if(pincode!=6677)
			System.out.println("Invaid code");
			
		else
		System.out.println("select choice");
		System.out.println("1.cash withdrawl");
		System.out.println("2.balance enquiry");
		Scanner t=new Scanner(System.in);
		choice=t.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter the amount");
		      Scanner p=new Scanner(System.in);
		      amount=p.nextInt();
		      if(amount<=balance)
		      {
		    	  System.out.println("withdrwal amount is"+amount);
		    	  balance=balance-amount;
		    	  System.out.println("\nremaining balance is:"+balance);
		     }
		      else
		      {
		    	  System.out.println("Insufficient balance");
		      }
		      break;
		      
		case 2:
			System.out.println("balance is:"+balance);
			break;
			
			default:
				System.out.println("Wrong choice");
				break;
				
		}
	}
	
	catch(InputMismatchException  e)
	{
		System.out.println("Invalid input.....try again");
	}
	
   }
}

				
		
