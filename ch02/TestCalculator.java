package ch02;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator test=new Calculator();
		//加法
		test.clear();
		test.add(2);
		System.out.println("0+2="+test.getResult());
		//减法
		test.clear();
		test.substract(2);
		System.out.println("0-2="+test.getResult());
		//乘法
		test.clear();
		test.multiply(2);
		System.out.println("0*2="+test.getResult());
		//除法
		test.clear();
		test.divide(0);
		test.add(2);
		test.divide(2);
		System.out.println("2/2="+test.getResult());
		//平方
		test.clear();
		test.add(2);
		test.square();
		System.out.println("2^2="+test.getResult());
		//幂运算
		test.power(3);
		System.out.println("4^3="+test.getResult());

	}

}
