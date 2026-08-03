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

/* JADX INFO: renamed from: gs */
/* JADX INFO: loaded from: classes.dex */
public final class C1469gs implements Comparable, Parcelable {
    public static final Parcelable.Creator<C1469gs> CREATOR = new C0646P0(17);

    /* JADX INFO: renamed from: a */
    public final Calendar f5207a;

    /* JADX INFO: renamed from: b */
    public final int f5208b;

    /* JADX INFO: renamed from: c */
    public final int f5209c;

    /* JADX INFO: renamed from: d */
    public final int f5210d;

    /* JADX INFO: renamed from: e */
    public final int f5211e;

    /* JADX INFO: renamed from: f */
    public final long f5212f;

    /* JADX INFO: renamed from: g */
    public String f5213g;

    public C1469gs(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM4843a = AbstractC2407qD.m4843a(calendar);
        this.f5207a = calendarM4843a;
        this.f5208b = calendarM4843a.get(2);
        this.f5209c = calendarM4843a.get(1);
        this.f5210d = calendarM4843a.getMaximum(7);
        this.f5211e = calendarM4843a.getActualMaximum(5);
        this.f5212f = calendarM4843a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C1469gs m2820a(int i, int i2) {
        Calendar calendarM4845c = AbstractC2407qD.m4845c(null);
        calendarM4845c.set(1, i);
        calendarM4845c.set(2, i2);
        return new C1469gs(calendarM4845c);
    }

    /* JADX INFO: renamed from: b */
    public static C1469gs m2821b(long j) {
        Calendar calendarM4845c = AbstractC2407qD.m4845c(null);
        calendarM4845c.setTimeInMillis(j);
        return new C1469gs(calendarM4845c);
    }

    /* JADX INFO: renamed from: c */
    public final String m2822c() {
        if (this.f5213g == null) {
            long timeInMillis = this.f5207a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC2407qD.f8441a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f5213g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f5213g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5207a.compareTo(((C1469gs) obj).f5207a);
    }

    /* JADX INFO: renamed from: d */
    public final int m2823d(C1469gs c1469gs) {
        if (!(this.f5207a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c1469gs.f5208b - this.f5208b) + ((c1469gs.f5209c - this.f5209c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1469gs)) {
            return false;
        }
        C1469gs c1469gs = (C1469gs) obj;
        return this.f5208b == c1469gs.f5208b && this.f5209c == c1469gs.f5209c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5208b), Integer.valueOf(this.f5209c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5209c);
        parcel.writeInt(this.f5208b);
    }
}
