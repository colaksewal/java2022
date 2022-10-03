package methods;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int [] { 1 , 2 , 3 , 4 , 5 };
		
		int search  = 1;
		
		boolean isExist =false ;
		
		for (int number : numbers ) {
			if (number == search)
			{
				isExist=true;
				break;
			}
		}//for

		if(isExist) 
			System.out.println("number is exist");
		else
			System.out.println("number is not exist");
			
		
	}

}
