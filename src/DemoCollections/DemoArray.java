package DemoCollections;

import java.util.Arrays;


public class DemoArray {
	
	String oneCar = "Ford";
	
	String[] manyCar = {"Ford","BMW","Honda","Hyundai"};//suitable in this scenario
	//example String[] links = page.findlinks(); 
	
	String[] city = new String[4]; //not suitabale we many not know the length
	
	public static void main(String[] args) {
		
		DemoArray obj = new DemoArray();
		
		//Single value
		System.out.println("Single value = " + obj.oneCar);
		
		//multiple value initalise already
		System.out.println("Array length " + obj.manyCar.length);
		for(int i =0; i<obj.manyCar.length; i++) {
			System.out.println("Index = " + i + " Array value = "+obj.manyCar[i]);
		}
		
		//initialise during code....
		obj.city[0]="Hyd";
		obj.city[1]="chennai";
		obj.city[2]="bangalore";
		obj.city[3]="mumbai";
		for(int i =0; i<obj.city.length; i++) {
			System.out.println("Array value = "+ obj.city[i]);
		}	
		
		
		String a = Arrays.toString(obj.city); //convert whole array to string 
		System.out.println(a); 
	}
	
}


//both samee....
//i<=2 0,1,2
//i<3 0,1,2

//syntax
//oneCar
//oneCar[index]