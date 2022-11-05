package methods2;

public class Main {

	public static void main(String[] args) {
		
		String messages = "Today , the weather is so good";
		String newMessage = giveCity();
		System.out.println(newMessage);
		
		int number = addition(5 , 7);
		System.out.println(number);
		
		int total = addition2(2,3,5,7,8,9);
		System.out.println(total);
	}
	
	public static void add() {
		System.out.println("added");
	}
	
	public static void remove() {
		System.out.println("remove");
	}
	
	public static void update() {
		System.out.println("updated");
	}

	public static int addition (int num1 , int num2 ) {
		return num1+num2 ; 
	}
	

	public static int addition2(int... numbers) {
		
		int total = 0 ;
		
		for (int number : numbers) {
			
			total += number;
			
		}
		
		return total;
	}
	
	public static String giveCity() {
		return "Ankara";
	}
}
