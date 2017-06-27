package session4_assignment3;

/*
 * If you make any variable as final, you cannot change the value of final variable(It will be constant).
 */

/*
 * There is a final variable speedlimit, we are going to change the value of this variable, but 
 * It can't be changed because final variable once assigned a value can never be changed.
 */
public class Bike9 {
	
	final int speedlimit = 90; //Declaring Final Variable
	
	void run(){
		
		speedlimit = 400;
		
	}

	public static void main(String[] args) {
		
		Bike9 obj = new Bike9;
		obj.run();
	}

} //End of class

//OUTPUT : COMPILE TIME ERROR
