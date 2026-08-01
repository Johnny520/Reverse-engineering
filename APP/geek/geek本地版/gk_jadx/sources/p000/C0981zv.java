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

/* JADX INFO: renamed from: zv */
/* JADX INFO: loaded from: classes.dex */
public final class C0981zv implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0981zv> CREATOR = new C0729t1(10);

    /* JADX INFO: renamed from: a */
    public final Calendar f5619a;

    /* JADX INFO: renamed from: b */
    public final int f5620b;

    /* JADX INFO: renamed from: c */
    public final int f5621c;

    /* JADX INFO: renamed from: d */
    public final int f5622d;

    /* JADX INFO: renamed from: e */
    public final int f5623e;

    /* JADX INFO: renamed from: f */
    public final long f5624f;

    /* JADX INFO: renamed from: g */
    public String f5625g;

    public C0981zv(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM2426a = u80.m2426a(calendar);
        this.f5619a = calendarM2426a;
        this.f5620b = calendarM2426a.get(2);
        this.f5621c = calendarM2426a.get(1);
        this.f5622d = calendarM2426a.getMaximum(7);
        this.f5623e = calendarM2426a.getActualMaximum(5);
        this.f5624f = calendarM2426a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C0981zv m2840a(int i, int i2) {
        Calendar calendarM2428c = u80.m2428c(null);
        calendarM2428c.set(1, i);
        calendarM2428c.set(2, i2);
        return new C0981zv(calendarM2428c);
    }

    /* JADX INFO: renamed from: b */
    public static C0981zv m2841b(long j) {
        Calendar calendarM2428c = u80.m2428c(null);
        calendarM2428c.setTimeInMillis(j);
        return new C0981zv(calendarM2428c);
    }

    /* JADX INFO: renamed from: c */
    public final String m2842c() {
        if (this.f5625g == null) {
            long timeInMillis = this.f5619a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = u80.f4698a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f5625g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f5625g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5619a.compareTo(((C0981zv) obj).f5619a);
    }

    /* JADX INFO: renamed from: d */
    public final int m2843d(C0981zv c0981zv) {
        if (!(this.f5619a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0981zv.f5620b - this.f5620b) + ((c0981zv.f5621c - this.f5621c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0981zv)) {
            return false;
        }
        C0981zv c0981zv = (C0981zv) obj;
        return this.f5620b == c0981zv.f5620b && this.f5621c == c0981zv.f5621c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5620b), Integer.valueOf(this.f5621c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5621c);
        parcel.writeInt(this.f5620b);
    }
}
