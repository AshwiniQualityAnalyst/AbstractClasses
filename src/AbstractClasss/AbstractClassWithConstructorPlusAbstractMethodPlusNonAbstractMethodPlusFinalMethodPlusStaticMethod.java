package AbstractClasss;

abstract class checkConstructor {

	// Constrcutor
	public checkConstructor() {
		System.out.println("Abstract class with Constructor");
	}

	// Abstract Method
	abstract void abstractMethod();

	// Non Abstract Method
	void nonAbstractMethod() {
		System.out.println("Abstract class with Non Abstract Method");
	}

	// Declaring FINAL method
	final void finalMethod() {
		System.out.println("Abstract class with Final Method");
	}

	// Declaring static method
	static void staticMethod() {
		System.out.println("Abstract class with static Method");
	}
}

class child extends checkConstructor {

	public child() {
		System.out.println("Child class with Constructor");
	}

	@Override
	void abstractMethod() {
		System.out.println("Abstract class with Abstract Method");
	}

	void nonAbstractMethod() {
		System.out.println("Child class with Non Abstract Method");
	}

	// Final method cannot be inherited
	/*
	 * void finalMethod() {
	 * 
	 * }
	 */

}

public class AbstractClassWithConstructorPlusAbstractMethodPlusNonAbstractMethodPlusFinalMethodPlusStaticMethod {

	public static void main(String[] args) {
		child c = new child();
		c.nonAbstractMethod();
		c.finalMethod();
		checkConstructor.staticMethod();
	}

}
