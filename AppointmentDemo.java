package PartA;
import java.util.Scanner;

public class AppointmentDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        AppointmentCheckingSystem Demo1=new AppointmentCheckingSystem();
        Demo1.addDailyEvent("Drink");
        Demo1.addDailyEvent("Eat");
        Demo1.addDailyEvent("Sleep");

        Demo1.addMonthlyEvent(12,20,"Purchase a new computer");
        Demo1.addMonthlyEvent(6,3,"meet with my Friend");
        Demo1.addMonthlyEvent(1,30,"During Happy NewYear!");

        Demo1.addOneTimeEvent(2022,6,3,"Having so much fun");
        Demo1.addOneTimeEvent(2004,11,30,"Born");

//        lo:while(true){
            System.out.print("Please input the date(Based on the format 11/30/2004):");
            String input=sc.next();
            String monthStr=input.substring(0,2);
            int month=(int)Double.parseDouble(monthStr);
            String dayStr=input.substring(3,5);
            int day=(int)Double.parseDouble(dayStr);
            String yearStr=input.substring(6,10);
            int year=(int)Double.parseDouble(yearStr);
            Demo1.occursOn(year,month,day);
//            System.out.println("if you want to quit, just type quit");
//
//        }



        /*AppointmentCheckingSystem Demo1=new AppointmentCheckingSystem();
        Demo1.addDailyEvent("Drink");
        Demo1.addDailyEvent("Eat");
        Demo1.addDailyEvent("Sleep");

        Demo1.addMonthlyEvent(12,20,"Purchase a new computer");
        Demo1.addMonthlyEvent(6,3,"Play with my girlFriend");
        Demo1.addMonthlyEvent(1,30,"During Happy NewYear!");

        Demo1.addOneTimeEvent(2022,6,3,"Having so much fun");
        Demo1.addOneTimeEvent(2004,11,30,"Born");

        Demo1.occursOn(2022,6,3);
*/

    }

}
