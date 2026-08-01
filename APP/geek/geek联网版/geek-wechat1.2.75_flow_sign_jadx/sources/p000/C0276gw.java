package p000;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gw */
/* JADX INFO: loaded from: classes.dex */
public final class C0276gw implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0276gw> CREATOR = new C0728t1(10);

    /* JADX INFO: renamed from: a */
    public final Calendar f2060a;

    /* JADX INFO: renamed from: b */
    public final int f2061b;

    /* JADX INFO: renamed from: c */
    public final int f2062c;

    /* JADX INFO: renamed from: d */
    public final int f2063d;

    /* JADX INFO: renamed from: e */
    public final int f2064e;

    /* JADX INFO: renamed from: f */
    public final long f2065f;

    /* JADX INFO: renamed from: g */
    public String f2066g;

    public C0276gw(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2819a = z80.m2819a(calendar);
        this.f2060a = calendarM2819a;
        this.f2061b = calendarM2819a.get(2);
        this.f2062c = calendarM2819a.get(1);
        this.f2063d = calendarM2819a.getMaximum(7);
        this.f2064e = calendarM2819a.getActualMaximum(5);
        this.f2065f = calendarM2819a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C0276gw m1341a(int i, int i2) {
        Calendar calendarM2821c = z80.m2821c(null);
        calendarM2821c.set(1, i);
        calendarM2821c.set(2, i2);
        return new C0276gw(calendarM2821c);
    }

    /* JADX INFO: renamed from: b */
    public static C0276gw m1342b(long j) {
        Calendar calendarM2821c = z80.m2821c(null);
        calendarM2821c.setTimeInMillis(j);
        return new C0276gw(calendarM2821c);
    }

    /* JADX INFO: renamed from: c */
    public final String m1343c() {
        if (this.f2066g == null) {
            long timeInMillis = this.f2060a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = z80.f5560a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f2066g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f2066g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2060a.compareTo(((C0276gw) obj).f2060a);
    }

    /* JADX INFO: renamed from: d */
    public final int m1344d(C0276gw c0276gw) {
        if (!(this.f2060a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0276gw.f2061b - this.f2061b) + ((c0276gw.f2062c - this.f2062c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0276gw)) {
            return false;
        }
        C0276gw c0276gw = (C0276gw) obj;
        return this.f2061b == c0276gw.f2061b && this.f2062c == c0276gw.f2062c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2061b), Integer.valueOf(this.f2062c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2062c);
        parcel.writeInt(this.f2061b);
    }
}
