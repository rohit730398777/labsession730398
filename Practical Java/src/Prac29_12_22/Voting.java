package Prac29_12_22;
import java.util.Scanner;
public class Voting{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age=scan.nextInt();
        if(age>=18) {
        	System.out.println("Eligible For Vote...");
        	
        }else {
        	throw new ArithmeticException("Age is Not Correct");
        }
        scan.close();
			
				
}
}
