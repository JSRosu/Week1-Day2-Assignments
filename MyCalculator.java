package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator myCalc = new Calculator();
		int add = myCalc.add();
		System.out.println("The result is : " + add);
		
		int sub = myCalc.sub();
		System.out.println("The result is : " + sub);
		
		double mul = myCalc.mul();
		System.out.println("The resutl is : " + mul);

		float div = myCalc.div();
		System.out.println("The result is : " + div);
		
		
	}

}
