package demo;


//class A  - variables and methods
class Animal{  

	void eat(){
		System.out.println("animal eating...");
	}  
}  

//Class B
class Dog extends Animal {  
	
	int bark = 500; //field
	
	void eat() {//over riding/same signature/run time
		System.out.println("Dog eating...");
	}

	void eat(int number) {//overriding --same name/same parameters/same retrun type// compile time
		System.out.println("dog eating...quanity =  " + number );
	}
	
	void eat(String food) {//overloading --same name/different parameters /same return type/ compile time
		System.out.println("dog eating...food type = " + food);
	}
	
	int barkmethod(){ //method
		System.out.println("barking...  " + bark);
		return 2;
	} 
		
}   


class DemoInheritance {
	public static void main(String args[]){  
		Dog d = new Dog();////////////////
		d.eat(); 
		d.eat("biscuits");
		d.eat(2);
		
		
		
	}
}

//inheritance....
//child class obj
//obj... to acess same class/parent classs methods/variables
//if static then no obj is required..
//it will not multiple inheritance.... multi level /hierarchy




