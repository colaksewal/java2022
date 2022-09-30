package miniProjeAsalSayiMi;

public class Main {

	public static void main(String[] args) {

		int number = 4;
		System.out.print(number);

		boolean isPrime = true;

		if(number < 1) {
			System.out.println("invalid number");
			return ;
		}
		
		if(number  == 1) {
			System.out.println(" is not prime number");
			return;
		}
		
		for (int i = 2; i < number; i++) {

			if (number % i == 0)
				isPrime =false;
		} // for
		if (isPrime)
			System.out.println(" is prime number");
		else
			System.out.println(" is not prime number");

		
		
	}
}
