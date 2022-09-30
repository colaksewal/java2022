package miniProjectThinorThickVowel;

public class Main {

	public static void main(String[] args) {

		char letter = 'E';

		switch (letter) {
		case 'a':
		case 'A':
		case 'I':
		case 'ı':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("thick vowel");
			break;
		case 'e':
		case 'E':
		case 'i':
		case 'İ':
		case 'ü':
		case 'Ü':
		case 'ö':
		case 'Ö':
			System.out.println("thin vowel");
			break;

		default:
			System.out.println("is not vowel letter");

		}
	}

}
