package methods;

public class Main {

	public static void main(String[] args) {
		
		findNumber();
		findNumber();
		findNumber();
		findNumber();
		
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5 };

		int search = 1;

		boolean isExist = false;

		for (int number : numbers) {
			if (number == search) {
				isExist = true;
				break;
			}
		} // for

		if (isExist)
			sendMessage("Number is exist:" +search);
		else
			sendMessage("Number is not exist:" +search);
		}
	
	public static void sendMessage(String message){
		
		System.out.println(message);
		
	}

}
