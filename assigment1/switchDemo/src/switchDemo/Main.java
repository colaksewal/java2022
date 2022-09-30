package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A' ;

		switch (grade) {
 		case 'A':
			System.out.println("Mükemmel :Geçtiniz");
			break;
		
 		case 'B':
			System.out.println("Başarılı :Geçtiniz");
			break;
			
 		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
			
 		case 'D':
			System.out.println("ŞArtlı Geçtiniz");
			break;
			
 		case 'F' :
 			System.out.println("Kaldınız");
 			break;
 			default :
 				System.out.println("Geçersiz not girdiniz");
		}
		

	}

}
