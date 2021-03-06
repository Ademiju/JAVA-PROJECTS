package chapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int second;
    private String time;

    public Clock (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }

    public void setHour(int hour) {
        if(hour < 24)
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if(minute < 60)
        this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if(second < 60)
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setDisplayTime(){
        time = hour+":"+minute+":"+second;
    }

    public String DisplayTime(){
        return time;



    }
}
