package TestingJava;

public class TestingSigleton {
	public static void main(String[] args) {
		
		//1. By using singleton pattern we can create only one object of the class.
		//2. But we need to make the constructor private.
		//SingletonClass obj = SingletonClass.getInstance();
		//SingletonClass obj1 = SingletonClass.getInstance();
		//SingletonClass obj = new SingletonClass();
		//SingletonClass obj1 = new SingletonClass();
		//System.out.println(obj +" and "+obj1);
		// Creating the object of a class(constructor is private.)
		//SingletonClass obj = SingletonClass.getInstance();
		SingletonClass obj = new SingletonClass();
		
 		TestingSigleton.add(125, 5);
		TestingSigleton.subtract(100, 75);
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
}
