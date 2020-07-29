package demo;

public class Application extends BaseUtil {
	
	String appName;
	
	public String getAppUrl(String appName) {
		
		this.appName = appName;
		
		if (appName.contains("facebook"))
				return "www.facebook.com";
		
		else if (appName.contains("yatra"))
			return "www.yatra.com";
		
		return null;
	}

	public static void main(String[] args) {
		Application obj = new Application();
		
		obj.drivername();
		System.out.println("Number of test cases="+ numberoftestcases);
		
		obj.homePage();
		System.out.println("Number of test cases="+ numberoftestcases);
		
		obj.timeout();
		System.out.println("Number of test cases="+ numberoftestcases);
		
		System.out.println("UrL is " + obj.getAppUrl("myntra"));
		
	}
}

//1. initialise in cons
//2. initialise in get,set method
//3. initialise in get method

//pom three level inheritance.... next class