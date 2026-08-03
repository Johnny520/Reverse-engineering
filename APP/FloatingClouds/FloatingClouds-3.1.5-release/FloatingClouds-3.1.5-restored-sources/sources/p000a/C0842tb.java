package p000a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: renamed from: a.tb */
/* JADX INFO: loaded from: classes.dex */
public final class C0842tb implements Comparable<C0842tb>, Parcelable {
    public static final Parcelable.Creator<C0842tb> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final Calendar f3312a;

    /* JADX INFO: renamed from: b */
    public final int f3313b;

    /* JADX INFO: renamed from: c */
    public final int f3314c;

    /* JADX INFO: renamed from: d */
    public final int f3315d;

    /* JADX INFO: renamed from: e */
    public final int f3316e;

    /* JADX INFO: renamed from: f */
    public final long f3317f;

    /* JADX INFO: renamed from: g */
    public String f3318g;

    /* JADX INFO: renamed from: a.tb$a */
    public class a implements Parcelable.Creator<C0842tb> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0842tb createFromParcel(Parcel parcel) {
            return C0842tb.m1964k(parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0842tb[] newArray(int i) {
            return new C0842tb[i];
        }
    }

    public C0842tb(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM1137c = C0467Zf.m1137c(calendar);
        this.f3312a = calendarM1137c;
        this.f3313b = calendarM1137c.get(2);
        this.f3314c = calendarM1137c.get(1);
        this.f3315d = calendarM1137c.getMaximum(7);
        this.f3316e = calendarM1137c.getActualMaximum(5);
        this.f3317f = calendarM1137c.getTimeInMillis();
    }

    /* JADX INFO: renamed from: k */
    public static C0842tb m1964k(int i, int i2) {
        Calendar calendarM1139e = C0467Zf.m1139e(null);
        calendarM1139e.set(1, i);
        calendarM1139e.set(2, i2);
        return new C0842tb(calendarM1139e);
    }

    /* JADX INFO: renamed from: l */
    public static C0842tb m1965l(long j) {
        Calendar calendarM1139e = C0467Zf.m1139e(null);
        calendarM1139e.setTimeInMillis(j);
        return new C0842tb(calendarM1139e);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final int compareTo(C0842tb c0842tb) {
        return this.f3312a.compareTo(c0842tb.f3312a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0842tb)) {
            return false;
        }
        C0842tb c0842tb = (C0842tb) obj;
        return this.f3313b == c0842tb.f3313b && this.f3314c == c0842tb.f3314c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3313b), Integer.valueOf(this.f3314c)});
    }

    /* JADX INFO: renamed from: m */
    public final String m1966m() {
        if (this.f3318g == null) {
            this.f3318g = C0467Zf.m1136b("yMMMM", Locale.getDefault()).format(new Date(this.f3312a.getTimeInMillis()));
        }
        return this.f3318g;
    }

    /* JADX INFO: renamed from: n */
    public final int m1967n(C0842tb c0842tb) {
        if (!(this.f3312a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0842tb.f3313b - this.f3313b) + ((c0842tb.f3314c - this.f3314c) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3314c);
        parcel.writeInt(this.f3313b);
    }
}
