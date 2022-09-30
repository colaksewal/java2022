package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int num1 =2, num2=4, num3 =8;
		
		int max= num1;
		
		if(max < num2)
			max=num2;
		if(max < num3)
			max=num3;
		
		System.out.println("Biggest number:" +max);

	}

}
