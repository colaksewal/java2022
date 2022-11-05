package classes;

public class Main {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager ;
		
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;//ikisi içinde referans aynı 
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

	}

}

