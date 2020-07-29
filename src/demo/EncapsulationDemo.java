package demo;

class A1 {
	
	private int a=2; //data hiding/data members/data fields/variables/attributes
	
	public void print() {
		System.out.println("This is print " + a);
	}

}


//test classs....
public class EncapsulationDemo{
	
	public static void main(String[] args) {
		A1 obj = new A1();
		obj.print();
		//int b = obj.a; // not allowed.....
		
	}
}


// q1)
// bank class  --- intrest field, calculate intrest
// sbi, icici, hdfc child...    define... 
//test class -- call here...

//q2)
//Account acc=new Account();  
//acc.setAcc_no(7560504000L);  
//acc.setName("Sonoo Jaiswal");  
//acc.setEmail("sonoojaiswal@javatpoint.com");  
//acc.setAmount(500000f);  