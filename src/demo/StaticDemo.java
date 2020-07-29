package demo;

public class StaticDemo {
	
	//Java static property is shared to all objects. 1 copy, access it directly without object. 
	//we can acess directly without object
	
	
	static String company="IBM";  ////not change --- final,  one copy--- static
	 static int empid=0;
	
	 
	  public void changeCompany() {
		 company="HCL";
	 }
	 
	 
	StaticDemo(){
		empid++;

	}
	

	public void display() {
		System.out.println("Company = " + company +  " and Emp id = " + empid);
	}
	
	public static void main(String[] args) {
		 
		
		StaticDemo obj1= new StaticDemo();
		obj1.display();
		obj1.changeCompany();
		
		
		StaticDemo obj2= new StaticDemo();
		obj2.display();
		StaticDemo obj3= new StaticDemo();
		obj3.display();
	}

}








