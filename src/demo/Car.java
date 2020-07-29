package demo;

public class Car {

	// instance variables
	private double weight;
	private String color ;
	public static final int power=700;
	
	
	Car(double weight, String color){ 
		System.out.println("This is constructor with 3 inputs - weight color power");
		 this.weight = weight;
		 this.color  = color ;
	}

	public void drive() {
		System.out.println("This is drive method. Weight  is = " + weight + " and Color is " + color );
	}

//	public void setPower(int p) {
//		power=p;
//	}
	
	public void getPower() {
		System.out.println("This is brake method and power is " + power);
	}


	public static void main(String[] args) {

		Car object1 = new Car(100,"black"); //car1
		object1.drive();
		//object1.setPower(100);/// power is 100
		object1.getPower();
	
		System.out.println("\n");

		Car object2 = new Car(50,"red"); //car2
		object2.drive();
		object2.getPower();
		
		System.out.println("\n");


		///1. naming convention variable/menthods should be small letter and camel case
		///2. Main -   call methods
		///3. METHODS -- CALL Attributes
		
		//Employee Ramesh Suresh

	}
}



