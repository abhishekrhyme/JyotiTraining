package demo;

import java.util.ArrayList;
import java.util.List;

import DemoCollections.DemoArray;


//class A  - variables and methods
class Animal1{  
	int bark=20;
	void eat(){
		System.out.println("animal eating...");
	}  
}  

//Class B
class Dog1 extends Animal1 {  
	
	int bark = 500; //field
	
	void eat() {//over riding/same signature/run time
		System.out.println("Dog eating...");
	}
	
	int barkmethod(){ //method
		System.out.println("barking...  " + bark);
		return 2;
	} 
		
}   

class Upcasting {
	public static void main(String args[]){ 

		DemoArray c;
		
		Animal1 a = new Animal1();
		System.out.println(a.bark); 
		a.eat();
		
		Dog1 d = new Dog1();
		System.out.println(d.bark); ///500
		d.eat();//dog eating
		d.barkmethod();
		
		Animal1 mix = new Dog1(); //// methoids/variables should be there in both classes.
		System.out.println(mix.bark); //20 not acheived not calling child class
		mix.eat(); //achieved calling class 
		//mix.barkmethod();
	
	}
	
	List a = new ArrayList(); ///java defined classes--it is availablee i m imported the package...
	//the methods of list class which are in arraylist class -- u should access....
	//the methods of parent class which are in implemented in child class -- u should access....
	
	//BANK people = new JyotiBank(); ////dont give selling food  
	
}

//inheritance....
//child class obj
//obj... to acess same class/parent classs methods/variables
//if static then no obj is required..
//it will not multiple inheritance.... multi level /hierarchy




