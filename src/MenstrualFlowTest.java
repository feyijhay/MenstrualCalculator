import java.util.Scanner;
import java.util.Calendar;

public class MenstrualFlowTest {
    public static void main(String[]args){
        MenstrualFlow menstrualflow = new MenstrualFlow("Jumoke Joseph", 7, 7);
        System.out.printf("name: %s%n", menstrualflow.getuserName());
        System.out.printf("period start date: %s%n", menstrualflow.getstartDate());
        System.out.printf("average cycle length: %s%n:", menstrualflow.getAveragePeriodLength());
        System.out.printf("average menstrual cycle length: %s%n", menstrualflow.getmenstrualCycleLength());
       System.out.printf("Expected fertile window start day is: %s%n", menstrualflow.getfertileWindowStart());
        System.out.printf("Expected fertile window end day is: %s%n", menstrualflow.getfertileWindowEnd());
        System.out.printf("Expected ovulation day is: %s%n", menstrualflow.getovulationDate());



        Scanner input = new Scanner(System.in);


        System.out.print("What is your name:");
         String userName = input.next();

         System.out.print("Enter your last period date:");
           int lastPeriodDate = input.nextInt();

           System.out.print("What is your period average length:");
             int periodAverageLength = input.nextInt();

System.out.printf("Your expected Menstrual cycle length is: %d%n", menstrualflow.getmenstrualCycleLength());
System.out.printf("Your expected fertile window start day is: %d%n", menstrualflow.getfertileWindowStart());
System.out.printf("Your expected fertile window end day is: %d%n", menstrualflow.getfertileWindowEnd());
System.out.printf("Your expected ovulation day is: %d%n", menstrualflow.getovulationDate());





    }
}
