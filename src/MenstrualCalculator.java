import java.util.Scanner;
import java.time.LocalDate;

public class MenstrualCalculator {
        public static void main(String[]args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Welcome!!!");

            System.out.print("What is your name:");
            String userName = input.nextLine();

            System.out.println("Kindly enter your period date for the last 3 months for the current year:");

            System.out.print("When was your period date month1:");
            int periodDate1 = input.nextInt();

            System.out.print("When was your period date month2:");
            int periodDate2 = input.nextInt();

            System.out.print("When was your last period date:");
            int lastPeriodDate = input.nextInt();


            System.out.print("What is your period length:");
            int periodLength = input.nextInt();


            int averageMenstrualCycleLength = (periodDate1 + periodDate2 + lastPeriodDate) / 3;

            System.out.println("Your average menstrual cycle length is:" + averageMenstrualCycleLength + "days!");

            int fertileWindowStart = (averageMenstrualCycleLength / 2) - 5;
            int fertileWindowEnd = (averageMenstrualCycleLength / 2) + 1;

            System.out.println("Your fertile window is from day " + fertileWindowStart + " to day " + fertileWindowEnd + " of your cycle length ");

            int ovulationStartDate = averageMenstrualCycleLength - 2;
            int ovulationEndDate = ovulationStartDate + 2;

            System.out.println("Your Ovulation day is day " + ovulationStartDate + " of your cycle and possibly end" + ovulationEndDate);



            LocalDate nextPeriodDate = LocalDate.of(2023, 1, 29).plusDays(averageMenstrualCycleLength
            );
            LocalDate nextOvulationDay = LocalDate.of(2023, 1, 29).plusDays(ovulationStartDate
            );
            LocalDate endOvulationDay = LocalDate.of(2023, 1, 29).plusDays(ovulationEndDate
            );


System.out.println("Your next period date is:" +  nextPeriodDate);
System.out.println("Your possible ovulation date is:" + nextOvulationDay " and to end " endOvulationDay);



        }
}
