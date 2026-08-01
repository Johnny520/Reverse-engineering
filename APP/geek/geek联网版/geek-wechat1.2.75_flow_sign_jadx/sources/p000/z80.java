package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class z80 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f5560a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m2819a(Calendar calendar) {
        Calendar calendarM2821c = m2821c(calendar);
        Calendar calendarM2821c2 = m2821c(null);
        calendarM2821c2.set(calendarM2821c.get(1), calendarM2821c.get(2), calendarM2821c.get(5));
        return calendarM2821c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m2820b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m2821c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
