package calculator;
import java.util.Scanner;
public class calcuse {

	public static void main(String[] args) {
		calc obj=new calc();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("--------------CALCULATOR---------------------");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiply");
			System.out.println("4.Division");
			System.out.println("5.Quit");
			System.out.println("-----------------------------------------------");
			System.out.println("Enter the choice");
			int ch=sc.nextInt();
			if(ch==1) {
				System.out.println("------------------------------------------");
				System.out.println("Enter the first number to be added");
				double a=sc.nextDouble();
				System.out.println("Enter the second number to be added");
				double b=sc.nextDouble();
				obj.addition(a,b);
				System.out.println("------------------------------------------");
			}
			else if(ch==2) {
				System.out.println("------------------------------------------");
				System.out.println("Enter the first number to be subtracted");
				double a=sc.nextDouble();
				System.out.println("Enter the second number to be subtracted");
				double b=sc.nextDouble();
				obj.subtraction(a,b);
				System.out.println("------------------------------------------");
			}
			else if(ch==3) {
				System.out.println("------------------------------------------");
				System.out.println("Enter the first number to be multiplied");
				double a=sc.nextDouble();
				System.out.println("Enter the second number to be multiplied");
				double b=sc.nextDouble();
				obj.multiply(a, b);
				System.out.println("------------------------------------------");
			}
			else if(ch==4) {
				System.out.println("------------------------------------------");
				System.out.println("Enter the Divident");
				double a=sc.nextDouble();
				System.out.println("Enter the Divisor");
				double b=sc.nextDouble();
				obj.divide(a,b);
				System.out.println("------------------------------------------");
			}
			else if(ch==5) {
				System.out.println("------------------------------------------");
				System.out.println("Thank you for using Abhika's calculator.");
				System.out.println("------------------------------------------");
				break;
			}
			else {
				System.out.println("Invalid choice please enter the correct choice");
			}
		}

	}

}
