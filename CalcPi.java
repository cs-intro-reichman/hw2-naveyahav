// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int sequence = Integer.parseInt(args[0]);
		double sum = 1.0;
		int counter = 1;
		int sign = -1;
		for (int i = 0; i < sequence-1 ; i++) {
			counter+=2;
			double x = 1.0/counter;
			sum += (x*sign);
			sign*=-1;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     "+ sum*4);
		

	
}
}
