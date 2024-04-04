package app.utils;

public class Time {

    private String hours;
    private String minutes;
    private String seconds;

    public Time(String hours, String minutes, String seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
