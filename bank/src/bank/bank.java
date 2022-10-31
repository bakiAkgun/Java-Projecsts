package bank;

import java.util.Scanner;

public class bank {
	
		static Scanner scan= new Scanner(System.in);
		static int[] numbers1= {100,100,100,100,100,100,100,100,100,100};
		static int[] identify= {0,1,2,3,4,5,6,7,8,9};
		 static int n;
		 
			static void myMethod() {
				System.out.println("Please choose your what you want operation ");
				System.out.println("1-Check balance");
				System.out.println("2-Withdraw");
				System.out.println("3-Deposit");
				System.out.println("4-Exit");
				
				
				
				  
			}
			static void again(){
					
					
				System.out.println("Welcome this ATM machine. Please insert your card");
				System.out.println("please enter an id:");
				
				 int n= scan.nextInt();
					
				myMethod();

				 int operation= scan.nextInt();
				  
		switch(operation) {

		case 1:
		System.out.println("Check Balance");
		System.out.println("Your balance is: "+numbers1[n]);
		break;
		case 2:
		System.out.println("Withdraw");
		System.out.println("Enter an amount to withdraw: ");
		int withdraw=scan.nextInt();
		numbers1[n] -=withdraw;
		
		if(withdraw<=numbers1[n]) {
			System.out.println("your money is being preparing... your money is ready");
			
		}
		else {
			System.out.println("Withdraw amount is too large.you are redirected to deposit menu ");
			System.out.println("You should insert remainder money: "+(withdraw-numbers1[n]));
		}
		break;
		case 3:
		System.out.println("Please enter an amount to deposit: ");
		int deposit=scan.nextInt();

		System.out.println("your process is completed. added:  "+deposit);
		numbers1[n] +=deposit;
		break;
		
		case 4:
		System.out.println("please take back your card.");
	   System.exit(11);
		break;

		default:
			System.out.println("you entered invalid number of operation");
		}
		again();
					}

			
			public static void main(String[] args) {
      
		
				
				if(n<10) {
		again();

				}
				else{
					System.out.println("you should enter valid id.");
				}	 
	

   
  
			}
				
	
		 }

