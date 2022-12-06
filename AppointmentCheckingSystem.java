package PartA;
import java.util.ArrayList;
public class AppointmentCheckingSystem {
    private ArrayList<DailyAppointment> DailyArray;
    private ArrayList<OneTimeAppointment> OneTimeArray;
    private ArrayList<MonthlyAppointment> MonthlyArray;

    public AppointmentCheckingSystem(){
        DailyArray=new ArrayList<DailyAppointment>();
        OneTimeArray=new ArrayList<OneTimeAppointment>();
        MonthlyArray=new ArrayList<MonthlyAppointment>();

    }
    public void addDailyEvent(String thing){
        DailyAppointment temporaryVariable=new DailyAppointment(thing);
        DailyArray.add(temporaryVariable);
    }
    public void addOneTimeEvent(int year,int month,int day,String thing){
        OneTimeAppointment temporaryVariable=new OneTimeAppointment(year,month,day,thing);
        OneTimeArray.add(temporaryVariable);
    }
    public void addMonthlyEvent(int month,int day,String thing){
        MonthlyAppointment temporaryVariable=new MonthlyAppointment(month,day,thing);
        MonthlyArray.add(temporaryVariable);
    }

    public void occursOn(int year, int month, int day){
        System.out.println("In "+month+"/"+day+"/"+year+", you have the following appointments:");
        for (DailyAppointment Appointment: DailyArray) {
            System.out.println(Appointment.getEvent());
        }
        for (OneTimeAppointment Appointment: OneTimeArray){
            if(Appointment.dateEquals(year, month, day)){
                System.out.println(Appointment.getEvent());
            }
        }
        for (MonthlyAppointment Appointment: MonthlyArray){
            if(Appointment.dateEquals(month, day)){
                System.out.println(Appointment.getEvent());
            }
        }
    }
}
