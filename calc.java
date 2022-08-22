package calculator;

public class calc {
private String name;
	
	/*public calc(String name2) {
		this.name=name;
	}*/
	public void addition(double a,double b) {
		if(a>=0 && b>=0) {
			double c=a+b;
			System.out.println("The Sum is "+c);
		}
		else {
			System.out.println("Invalid input");
		}
	}
	public void subtraction(double a,double b) {
		if(a>=0 && b>=0) {
			double c=a-b;
			System.out.println("The Answer is "+c);
		}
		else {
			System.out.println("Put positive values");
		}
	}
	public void multiply(double a,double b) {
		if(a>=0 && b>=0) {
			double c=a*b;
			System.out.println("The Product is "+c);
		}
		else {
			System.out.println("Enter positive values");
		}
	}
	public void divide(double a,double b) {
		if(a>=0 && b>=0) {
			double c=a/b;
			System.out.println("The Quotient is "+c);
			double d=a%b;
			System.out.println("The Remainder is "+d);
		}
		else {
			System.out.println("Wrong values entered");
		}
	}
}
