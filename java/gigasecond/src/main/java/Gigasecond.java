import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

    private LocalDateTime moment;
    private static final long gigasecond = 1_000_000_000;

    Gigasecond(LocalDate moment) {
        this(LocalDateTime.of(moment, LocalTime.MIN));
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(gigasecond);
    }

    LocalDateTime getDateTime() {
        return this.moment;
    }

}
