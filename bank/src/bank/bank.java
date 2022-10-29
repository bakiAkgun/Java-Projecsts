package bank;

import java.util.Scanner;

public class bank {
	
		 static void first() {
			 Scanner scan= new Scanner(System.in);
				
				int[] numbers1= new int[10];
				int[] numbers= {0,1,2,3,4,5,6,7,8,9};
				numbers[0]=100;
				numbers[1]=100;
				numbers[2]=100;
				numbers[3]=100;
				numbers[4]=100;
				numbers[5]=100;
				numbers[6]=100;
				numbers[7]=100;
				numbers[8]=100;
				numbers[9]=100;
		 }
			static void myMethod() {
				System.out.println("Please choose your what you want operation ");
				System.out.println("1-Check balance");
				System.out.println("2-Withdraw");
				System.out.println("3-Deposit");
				System.out.println("4-Exit");
				
				
				
				  
			}
			static void again(){
				 Scanner scan= new Scanner(System.in);
					
					int[] numbers1= new int[10];
					int[] numbers= {0,1,2,3,4,5,6,7,8,9};
					numbers[0]=100;
					numbers[1]=100;
					numbers[2]=100;
					numbers[3]=100;
					numbers[4]=100;
					numbers[5]=100;
					numbers[6]=100;
					numbers[7]=100;
					numbers[8]=100;
					numbers[9]=100;
				first();
				System.out.println("Please enter same id again");
				 int n= scan.nextInt();
					
				myMethod();

				 int operation= scan.nextInt();
				  
		switch(operation) {

		case 1:
		System.out.println("Check Balance");
		System.out.println("Your balance is: "+numbers[n]);
		break;
		case 2:
		System.out.println("Withdraw");
		System.out.println("Enter an amount to withdraw: ");
		int withdraw=scan.nextInt();
		System.out.println(withdraw);

		
		if(withdraw<=numbers[n]) {
			System.out.println("your money is being preparing... your money is ready");
			
		}
		else {
			System.out.println("Withdraw amount is too large.you are redirected to deposit menu ");
			System.out.println("You should insert remainder money: "+(withdraw-numbers[n]));
		}
		break;
		case 3:
		System.out.println("Please enter an amount to deposit: ");
		int deposit=scan.nextInt();

		System.out.println("your process is completed. added:  "+deposit);
		break;
		case 4:
		System.out.println("please take back your card.");
		break;

		default:
			System.out.println("you entered invalid number of operation");
		}
		again();


			}
			public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
			
				

				System.out.println("Welcome this ATM machine. Please insert your card");
				System.out.println("please enter an id:");
				
				 int n= scan.nextInt();
				if(n<10) {
		again();

				}
				else{
					System.out.println("you should enter valid id.");
				}	  
	

   
  
			}
				
	
		 }

