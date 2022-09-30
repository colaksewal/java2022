package miniProject5FindingNumber;

public class Main {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int search = 5;

		boolean isExist = false;
		for (int number : numbers) {
			if (search == number) {
				isExist = true;
				break;
			}
		}
		if (isExist)
			System.out.println(search + " is exist");
		else
			System.out.println(search + " is not exist");

	}

}
