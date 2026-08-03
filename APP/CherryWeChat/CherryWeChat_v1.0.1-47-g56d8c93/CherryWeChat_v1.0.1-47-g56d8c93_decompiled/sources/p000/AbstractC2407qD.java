package p000;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: qD */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2407qD {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f8441a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m4843a(Calendar calendar) {
        Calendar calendarM4845c = m4845c(calendar);
        Calendar calendarM4845c2 = m4845c(null);
        calendarM4845c2.set(calendarM4845c.get(1), calendarM4845c.get(2), calendarM4845c.get(5));
        return calendarM4845c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m4844b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m4845c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
