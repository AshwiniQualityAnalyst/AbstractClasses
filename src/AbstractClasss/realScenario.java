package AbstractClasss;

abstract class Bank {
	abstract int getRateOfInterest();
}

class SBI extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}

}

class PNB extends Bank {

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 10;
	}

}

public class realScenario {

	public static void main(String[] args) {
		Bank B;
		B = new SBI();
		System.out.println(B.getRateOfInterest());

		B = new PNB();
		System.out.println(B.getRateOfInterest());

	}

}
