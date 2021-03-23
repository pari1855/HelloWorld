package TestingJava;

public class SingletonClass {

	//private static SingletonClass obj=new SingletonClass();
	
	/*private SingletonClass() {
		making the object private
	}*/
	
	/*static SingletonClass getInstance() {
		return obj;
	}
	public void add(long a, long b) {
		System.out.println(Math.addExact(a, b));
	}
	public void subtract(int a, int b) {
		System.out.println(Math.subtractExact(a, b));
	}*/
	private SingletonClass(int a, int b) {
		System.out.println("Constructor initialized");
		System.out.println(a +" " + b);	
	}
	private SingletonClass() {
		System.out.println("Default Constructor initialized");
	}
	public static void main(String[] args) {
		SingletonClass obj = new SingletonClass(10, 11);
		SingletonClass obj1 = new SingletonClass(2, 4);
		SingletonClass obj2 = new SingletonClass();
	}
	
}
