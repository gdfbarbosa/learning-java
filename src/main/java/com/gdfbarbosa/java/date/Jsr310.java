package com.gdfbarbosa.java.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalUnit;

public class Jsr310 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.parse("1999-01-01T01:01:01.610000001");
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth().name());
        System.out.println(localDateTime.getNano());
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(14).withYear(2018).plus(2, ChronoUnit.DAYS);
        localDateTime1 = localDateTime1.with(temporal -> temporal.plus(4, ChronoUnit.MONTHS));
        localDateTime1 = localDateTime1.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(localDateTime1);
        System.out.println(localDateTime1.toLocalDate());
        System.out.println(localDateTime1.toLocalTime());
        System.out.println(localDateTime1.getDayOfMonth());
        System.out.println(localDateTime1.getDayOfWeek());
        System.out.println(localDateTime1.getMonth().name());
        System.out.println(localDateTime1.getNano());

        ZoneId zoneId = ZoneId.of("America/Bogota");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        System.out.println(zonedDateTime.toString());

        ZoneOffset offset = ZoneOffset.of("+02:00");
        System.out.println(offset);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Europe/Paris]");
        System.out.println(zonedDateTime1);

        OffsetTime time = OffsetTime.now();
		// changes offset, while keeping the same point on the timeline
        OffsetTime sameTimeDifferentOffset = time.withOffsetSameInstant(
                offset);
        System.out.println(sameTimeDifferentOffset);
		// changes the offset, and updates the point on the timeline
        OffsetTime changeTimeWithNewOffset = time.withOffsetSameLocal(
                offset);
        System.out.println(changeTimeWithNewOffset);
		// Can also create new object with altered fields as before
        changeTimeWithNewOffset
                .withHour(3)
                .plusSeconds(2);

        // 3 years, 2 months, 1 day
        Period period = Period.of(1, 1, 1);
        System.out.println(zonedDateTime1.plus(period));

        Duration duration = Duration.of(2, ChronoUnit.HOURS);
        OffsetTime newTime4 = sameTimeDifferentOffset.plus(duration);
        System.out.println(newTime4);
    }
}
