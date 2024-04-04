package app.service;

import net.time4j.ClockUnit;
import net.time4j.Duration;

public class TimeService {

    public String[] convertFromSecondToHours() {

        StringBuilder builder = new StringBuilder();

        Duration<ClockUnit> dur = Duration.of(34444, ClockUnit.SECONDS).
                with(Duration.STD_CLOCK_PERIOD);

        // custom duration format => hh:mm:ss
        String str = Duration.Formatter.ofPattern(ClockUnit.class, "hh:mm:ss").format(dur);
        System.out.println(str);

        String[] values = convertFromSecondToHours();

        return values;
    }

}
