package recapDemo2;

public class Main {

	public static void main(String[] args) {
	
		double[] mylist = {7.2,15.43,4.3,5.6};
		
		double total= 0;
		
		double max = mylist[0];
		
		for(double number: mylist) {
			System.out.println(number);
			total += number;
			
			if (max<number) 
				max =number ;
				
	
		}
     System.out.println(total);
     System.out.println(max);
	}

}
