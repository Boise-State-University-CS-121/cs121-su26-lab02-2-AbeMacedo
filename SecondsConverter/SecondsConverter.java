import java.util.Scanner;

public class SecondsConverter 
{

    public static void main(String[] args) 
    {

        Scanner keyInput = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int numSec1 = keyInput.nextInt();

        int numHrs = numSec1 / 3600;
        int numMin = (numSec1 / 60) - (numHrs * 60);
        int numSeconds = numSec1 - (numMin * 60) - (numHrs  * 3600);

        System.out.println("Hours: " + numHrs);
        System.out.println("Minutes: " + numMin);
        System.out.println("Seconds: " + numSeconds);

        keyInput.close();

    }
    
}
