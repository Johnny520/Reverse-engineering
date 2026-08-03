package com.google.android.material.datepicker;

import Yue.InterfaceC6490;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
class TimeSource {
    private static final TimeSource SYSTEM_TIME_SOURCE = new TimeSource(null, null);

    @InterfaceC6490
    private final Long fixedTimeMs;

    @InterfaceC6490
    private final TimeZone fixedTimeZone;

    private TimeSource(@InterfaceC6490 Long l, @InterfaceC6490 TimeZone timeZone) {
        this.fixedTimeMs = l;
        this.fixedTimeZone = timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static TimeSource fixed(long j, @InterfaceC6490 TimeZone timeZone) {
        return new TimeSource(Long.valueOf(j), timeZone);
    }

    public static TimeSource system() {
        return SYSTEM_TIME_SOURCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Calendar now() {
        return now(this.fixedTimeZone);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static TimeSource fixed(long j) {
        return new TimeSource(Long.valueOf(j), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Calendar now(@InterfaceC6490 TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.fixedTimeMs;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
