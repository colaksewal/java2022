package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		double num1 = 9.0 , num2 = 201.4;
		
		FourOperations myOperator = new FourOperations();
		
		System.out.println(myOperator.Addition(num1, num2));
		System.out.println(myOperator.Subtraction(num2, num1));
		System.out.println(myOperator.Addition(num1, num2));
		System.out.println(myOperator.Subtraction(num2, num1));

	}

}
