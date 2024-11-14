public class TimeCalc {
    public static void main(String[] args) {
        String originalTime = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt(originalTime.substring(0,2));
        int minutes = Integer.parseInt(originalTime.substring(3,5));
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = (totalMinutes / 60);
        int newHours = (totalHours % 24);
        int newMinutes = totalMinutes - (totalHours * 60);
        if (newHours < 10) {
            System.out.print("0" + newHours + ":");
            if(newMinutes < 10) {
                System.out.print("0" + newMinutes);
            }
            else {
                System.out.print(newMinutes);
            }
        }
        else {
            if (newMinutes < 10)
                if (newMinutes == 0) {
                    System.out.println(newHours + ":" + "00");
                } else {
                System.out.println(newHours + ":" + "0" + newMinutes);
            }        
            else {
                System.out.println(newHours + ":" + newMinutes);
        }
    }
    }
}
