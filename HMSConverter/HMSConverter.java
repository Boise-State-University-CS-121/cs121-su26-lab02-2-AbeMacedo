import java.util.Scanner;

public class HMSConverter
 {
    public static void main(String[] args)
    {
        Scanner keyInput = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int numHrs = keyInput.nextInt();

        System.out.print("Enter the number of minutes: ");
        int numMin = keyInput.nextInt();

        System.out.print("Enter the number of seconds: ");
        int numSec = keyInput.nextInt();

        int totalSec = ((numHrs / 60) / 60) + ((numMin / 60) * 3600) + numSec;


        System.out.println("Total seconds: " + totalSec);

        keyInput.close();

    }

}
