package AbstractClasss;

abstract class Bike {
	abstract void run();

	abstract void stop();

	void print() {
		System.out.println("Checking abstract");
	}
}

class honda extends Bike {

	@Override
	void run() {
		System.out.println("Running....");

	}

	@Override
	void stop() {
		System.out.println("Stopiing....");

	}

	void print() {
		System.out.println("Applying Non Abstract methods");
	}

}

public class AbstractClassWithAbstractMethod {

	public static void main(String[] args) {
		Bike reference = new honda();
		reference.run();
		reference.stop();
		reference.print();
	}

}
