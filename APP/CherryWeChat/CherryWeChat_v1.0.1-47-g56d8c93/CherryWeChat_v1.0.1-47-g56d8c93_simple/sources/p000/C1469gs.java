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
    public static final Parcelable.Creator<C1469gs> CREATOR = null;

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

    static {
        CREATOR = new C0646P0(17);
    }

    public C1469gs(Calendar r4) {
        r4.set(5, 1);
        Calendar r42 = AbstractC2407qD.m4843a(r4);
        this.f5207a = r42;
        this.f5208b = r42.get(2);
        this.f5209c = r42.get(1);
        this.f5210d = r42.getMaximum(7);
        this.f5211e = r42.getActualMaximum(5);
        this.f5212f = r42.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C1469gs m2820a(int r2, int r3) {
        Calendar r0 = AbstractC2407qD.m4845c(null);
        r0.set(1, r2);
        r0.set(2, r3);
        return new C1469gs(r0);
    }

    /* JADX INFO: renamed from: b */
    public static C1469gs m2821b(long r1) {
        Calendar r0 = AbstractC2407qD.m4845c(null);
        r0.setTimeInMillis(r1);
        return new C1469gs(r0);
    }

    /* JADX INFO: renamed from: c */
    public final String m2822c() {
        if (this.f5213g != null) goto L6;
        long r0 = this.f5207a.getTimeInMillis();
        Locale r2 = Locale.getDefault();
        AtomicReference r3 = AbstractC2407qD.f8441a;
        DateFormat r22 = DateFormat.getInstanceForSkeleton("yMMMM", r2);
        r22.setTimeZone(TimeZone.getTimeZone("UTC"));
        r22.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f5213g = r22.format(new Date(r0));
    L6:
        return this.f5213g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.f5207a.compareTo(((C1469gs) r2).f5207a);
    }

    /* JADX INFO: renamed from: d */
    public final int m2823d(C1469gs r3) {
        if ((this.f5207a instanceof GregorianCalendar) == false) goto L7;
        int r0 = (r3.f5209c - this.f5209c) * 12;
        return (r3.f5208b - this.f5208b) + r0;
    L7:
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1469gs) == true) goto L8;
        return false;
    L8:
        C1469gs r52 = (C1469gs) r5;
        if (this.f5208b == r52.f5208b) goto L11;
    L13:
        return false;
    L11:
        if (this.f5209c != r52.f5209c) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5208b), Integer.valueOf(this.f5209c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f5209c);
        r1.writeInt(this.f5208b);
    }
}
