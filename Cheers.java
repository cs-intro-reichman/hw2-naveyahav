// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheeers = args[0].toUpperCase();
                int sequence = Integer.parseInt(args[1]);
                int counter = 0;
                String noValues = "AEFHILMNORSX";
                int counterB = 0;
                while (counter < cheeers.length()) {
                        if (noValues.indexOf(cheeers.charAt(counter)) == -1)
                                System.out.println("GIVE ME a  " + cheeers.charAt(counter) + ": "
                                + cheeers.charAt(counter) + "!");
                        else { 
                                System.out.println("GIVE ME an " + cheeers.charAt(counter) + ": "
                                + cheeers.charAt(counter) + "!");   
                        }
                counter++;
                }
                System.out.println("what does that spell?");
                while (counterB < sequence) {
                        System.out.println(cheeers + "!!!");
                counterB++;
                }


        }
}
