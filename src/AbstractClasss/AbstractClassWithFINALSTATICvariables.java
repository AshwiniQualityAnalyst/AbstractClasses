package AbstractClasss;

abstract class withVariables {
	final int finalVar = 10;
	static int staticVar = 20;
	int defaultVar = 10;
}

class testVariables extends withVariables {
	void printVariables() {
		System.out.println("STATIC VAR: " + withVariables.staticVar);
	}
}

public class AbstractClassWithFINALSTATICvariables {

	public static void main(String[] args) {
		testVariables object = new testVariables();
		System.out.println("FINAL VAR: "+object.finalVar);
		object.printVariables();
		System.out.println("DEFAULT VAR :"+object.defaultVar);

	}

}
