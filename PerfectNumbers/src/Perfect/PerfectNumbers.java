package Perfect;


import java.util.Scanner;

public class PerfectNumbers {
static void again() {
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Please enter any number");
		int n = scan.nextInt();
		
		int total=0;
		for(int i=1;i<n;i++) {
			
			if(n%i == 0) {
				
				total=total+i;
			}
		}
		
		if(n == total) {
			System.out.println("n is perfect number");
		}
		else {
			System.out.println("n is not perfect number");
		}
		again();
	}


	public static void main(String[] args) {
		
	again();
	
	
	}

}