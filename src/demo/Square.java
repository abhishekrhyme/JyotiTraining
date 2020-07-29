package demo;

 class Square {
	
	 
	 //1.. we can call without object so no to create obj......
	 //2. inside static method, we cannot use non static variables....
	 //3. Satic bnlock will call first
	 //4. refer to the common property of all objects,
	 		//gets memory only once in the class area at the time of class loading.
	
	static int a;
	
	static int calculateSquare(int value){
		 
		return value * value;
		
	}
	
	
	static {
		a=5;
		System.out.println("Iam here first");
	}

	public static void main(String[] args) {
		
		System.out.println(a);

		int input = 8;
		
		int result = calculateSquare(input);
		System.out.println("Square of " + input + " is " + result);
		
	}

}
