package demo;

public class BaseUtil {
	
	String drivername = "Chrome";
	static int numberoftestcases = 0;
	final int PAGE_LOAD_TIMEOUT=500;
	
	void drivername() {
		System.out.println("Driver name is " + drivername);
		numberoftestcases++;
	}
	
	void homePage() {
		System.out.println("Home page title is Login.");
		numberoftestcases++;
	}
	
	void timeout() {
		System.out.println("Page load timeout is " + PAGE_LOAD_TIMEOUT);
		numberoftestcases++;
	}


}
