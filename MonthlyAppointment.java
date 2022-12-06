package PartA;

public class MonthlyAppointment {
    public int month;
    public int day;
    private String Event;

    public MonthlyAppointment(int month, int day, String thing){
        this.day=day;
        this.month=month;
        Event=thing;
    }
    public String getEvent(){
        return Event;
    }

    public boolean dateEquals(int month, int day){
        if(this.month==month && this.day==day){
            return true;
        }
        else{return false;}
    }
}
