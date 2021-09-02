/* this program determines how many positive and negative integers have been entered by the user
    and calculates the total and average of all the entered numbers
 */
//import class
import java.util.Scanner;

public class averageNumber {
    public static void main(String[] args){
        //declare pos & neg counters
        int posCount = 0;
        int negCount = 0;
        //declare total, avg  and input counts counters
        int total = 0;
        double avg;
        int inCount = 0;
        //declare integer variable
        int num;

        //create scanner object for user input
        Scanner input = new Scanner(System.in);
        //prompt user for num
        System.out.println("Enter an integer number, or 0 to end:");
        //store input value in num variable
        num = input.nextInt();


        //run a while loop to continue user input after checking pos or neg values, until user enters 0
        while (num != 0) {
            //count while checking if num is + or -
            if (num < 0) {
                negCount += 1;
            } else if (num > 0) {
                posCount += 1;
            }
            //add num to total
            total += num;
            //add to input counts
            inCount += 1;
            //prompt user for num
            System.out.println("Enter an integer number, or 0 to end:");
            //store input value in num variable
            num = input.nextInt();
        }
        //calculate average
        avg = (double)total/inCount;

        //display results
        System.out.println(posCount + " positive numbers");
        System.out.println(negCount + " negative numbers");
        System.out.println("The total of the numbers are: " + total);
        System.out.println("The average of the numbers are: " + avg);

        //close scanner
        input.close();
    }
}
