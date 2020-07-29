package demo;

abstract class A{   /// it can have implement and unimplemented methods...	
	void print() {//implemented or non abstact...
		System.out.println("Hi this is print metho");
	}
	abstract void get();   ///unimplemented run
	abstract void set(); ////unimplneted 
	void initialise() { System.out.println("Hi this is initialise method."); }
}

interface B{
	int a=3; //static final
	void print();
}

///class extending abstractclaass
class C extends A {
	void get() {System.out.println("Hi this is get method");}
	void set(){};
}

//class implementing interface
class D implements B{ 
	public void print() {System.out.println("Hi this is print method");}
}

public class Abstractdemo {
	public static void main(String[] args) {
	//	A obj = new A(); //notallowed cant instancetiate,
		A obj = new C();
		obj.get();
		obj.set();
		obj.initialise();
		
		D obj1 = new D();
		obj1.print();
		int b=D.a;  //classname.field //classname.method  (static)
	}
}


//class car --- drive, wheels,
//class honda --- manual/automatic, wheels..
//testng listeners r example of interfaces...

