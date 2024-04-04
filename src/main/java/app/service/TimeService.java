package app.service;

import app.utils.Time;
import net.time4j.ClockUnit;
import net.time4j.Duration;

public class TimeService {

    public Time convertFromSecondToHours(long timeInSeconds) {

        Duration<ClockUnit> dur = Duration.of(timeInSeconds, ClockUnit.SECONDS).
                with(Duration.STD_CLOCK_PERIOD);

        // custom duration format => hh:mm:ss
        String str = Duration.Formatter.ofPattern(ClockUnit.class, "hh:mm:ss").format(dur);
        String[] values = str.split(":");

        return new Time(values[0],values[1],values[2]);
    }

}
