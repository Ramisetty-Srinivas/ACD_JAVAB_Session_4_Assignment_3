package session4_assignment3;

/*
 * 	Final Variable:
 * 		If you make any variable as final, you cannot change the value of final variable(It will be constant).
 * 
 * 	Final Method:
 * 		If you make any method as final, you cannot override it.
 * 
 * 	Final Class:
 * 		If you make any class as final, you cannot extend it.
 * 
 * 	Final Constructor:
 * 		constructor is never inherited.
 */

/*
 * If you make any class as final, you cannot extend it.
 */

public class Bajaj extends Scooter{
	
	void run(){
		System.out.println("Running safely with 100kmph");
	}

	public static void main(String[] args) {
		
		Honda1 honda= new Honda();  
		honda.run();		
		
	}

}


// OUTPUT : COMPILE TIME ERROR