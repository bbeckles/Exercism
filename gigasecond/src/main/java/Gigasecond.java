import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    Gigasecond(LocalDate moment) {
        mytime = moment.atStartOfDay();

    }

    Gigasecond(LocalDateTime moment) {
        mytime = moment;
    }

    LocalDateTime getDateTime() {
        return mytime.plusSeconds((long) Math.pow(10, 9));
    }

    LocalDateTime mytime;

}
