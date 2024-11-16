// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int sequence = Integer.parseInt(args[0]);
		String action = args[1];
		int x;
		int counter = 0;
		int counterFinal = 0;
		for (int i = 1; i <= sequence; i++) {
			x = i;
			counter = 1;
			counterFinal++;
			if (action.equals("v"))
				System.out.print(x+" ");
			do  {
				if(x % 2 == 0) {
					x = x / 2;
					if (action.equals("v"))
						System.out.print(x + " ");
				}
				else {
					x = (x * 3) + 1 ;
					if (action.equals("v")) 
						System.out.print(x+ " ");
				}
				counter++;
			} while (x != 1);
			if (action.equals("v"))
				System.out.println("(" + counter + ")");
		}
		if (counterFinal == sequence &&
		 (action.equals("v") || action.equals("c")))
			System.out.println("Every one of the first " + sequence + " hailstone sequences reached 1.");
}
}
