package p000a;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: a.Zf */
/* JADX INFO: loaded from: classes.dex */
public final class C0467Zf {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<C0599gf> f1749a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static long m1135a(long j) {
        Calendar calendarM1139e = m1139e(null);
        calendarM1139e.setTimeInMillis(j);
        return m1137c(calendarM1139e).getTimeInMillis();
    }

    @TargetApi(24)
    /* JADX INFO: renamed from: b */
    public static DateFormat m1136b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m1137c(Calendar calendar) {
        Calendar calendarM1139e = m1139e(calendar);
        Calendar calendarM1139e2 = m1139e(null);
        calendarM1139e2.set(calendarM1139e.get(1), calendarM1139e.get(2), calendarM1139e.get(5));
        return calendarM1139e2;
    }

    /* JADX INFO: renamed from: d */
    public static Calendar m1138d() {
        f1749a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static Calendar m1139e(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
