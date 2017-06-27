package session4_assignment3;

/*
 * If you make any method as final, you cannot override it.
 */

public class Honda extends Bike{
	
	void run(){
		
		System.out.println("Running safely with 100kmph");
	}

	public static void main(String[] args) {
		
		Honda honda= new Honda();  
		honda.run(); 		
	}

}

//OUTPUT : COMPILE TIME ERROR