package PartA;

public class OneTimeAppointment {

    public int year;
    public int month;
    public int day;
    private String Event;

    public OneTimeAppointment(int year,int month,int day, String thing){
        this.day=day;
        this.month=month;
        this.year=year;
        Event=thing;
    }
    public String getEvent(){
        return Event;
    }
    public boolean dateEquals(int year, int month, int day){
        if(this.year==year && this.month==month && this.day==day){
            return true;
        }
        else{return false;}
    }

}
