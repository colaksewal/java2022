package miniProject4FriendsNumber;

public class Main {

	public static void main(String[] args) {
		int num1 = 220;
		int num2 = 284;

		int total1 = 0, total2 = 0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				total2 += i;
			}
		}

		if (total1 == num2 && total2 == num1)
			System.out.println("they are friends number");
		else
			System.out.println("they are not friends number");
	}

}
