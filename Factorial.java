import java.util.Scanner;

class Factorial {

	static void cal(int number) {
		int fact=1; 
  		for(int i=1; i<=number; i++){    
      			fact=fact*i;    
  		}    
  		System.out.println("Factorial of "+ number +" is: "+fact);    
 		}  
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scan.nextInt();

		cal(number);
	}

}