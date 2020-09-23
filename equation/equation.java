package equation;
public class equation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3.4;
		double b=50.2;
		double c=2.1;
		double d=0.55;
		double e=44.5;
		double f=5.9;
		double x, y;
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		if (a * d - b * c == 0) {
			System.out.println("The question has no solution!");
		} else {
			System.out.println("x is " + x);
			System.out.println("y is " + y);
		}
	}

}
