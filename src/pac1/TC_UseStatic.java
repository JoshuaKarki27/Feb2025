package pac1;

public class TC_UseStatic {
	
	static int num1 = 3;
	static int num2; 
	
	static
	{
		System.out.println("Static block initialized.");
		num2 = num1*3;
	}
	
	static void mymethod(int num3)
	{
		System.out.println("Num1 value: "+num1);
		System.out.println("Num1 value: "+num2);
		System.out.println("Num1 value: "+num3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod(300);
	}

}