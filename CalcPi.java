// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int sequence = Integer.parseInt(args[0]);
		double sum =1.0;
		int counter = 1;
		for (int i = 0; i < sequence; i++) {
			counter+=2;
			double x = 1.0/counter;
			counter+=2;
			double y = 1.0/counter;
			sum += (-x+y);
		}
		System.out.println("pi according to Java: " + sum*4);
		System.out.println("approximated:     "+ Math.PI);
		

	
}
}
