package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class zv implements Comparable, Parcelable {
    public static final Parcelable.Creator<zv> CREATOR = null;
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    static {
        CREATOR = new t1(10);
    }

    public zv(Calendar r4) {
        r4.set(5, 1);
        Calendar r42 = u80.a(r4);
        this.a = r42;
        this.b = r42.get(2);
        this.c = r42.get(1);
        this.d = r42.getMaximum(7);
        this.e = r42.getActualMaximum(5);
        this.f = r42.getTimeInMillis();
    }

    public static zv a(int r2, int r3) {
        Calendar r0 = u80.c(null);
        r0.set(1, r2);
        r0.set(2, r3);
        return new zv(r0);
    }

    public static zv b(long r1) {
        Calendar r0 = u80.c(null);
        r0.setTimeInMillis(r1);
        return new zv(r0);
    }

    public final String c() {
        if (this.g != null) goto L6;
        long r0 = this.a.getTimeInMillis();
        Locale r2 = Locale.getDefault();
        AtomicReference r3 = u80.a;
        DateFormat r22 = DateFormat.getInstanceForSkeleton("yMMMM", r2);
        r22.setTimeZone(TimeZone.getTimeZone("UTC"));
        r22.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.g = r22.format(new Date(r0));
    L6:
        return this.g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r2) {
        return this.a.compareTo(((zv) r2).a);
    }

    public final int d(zv r3) {
        if ((this.a instanceof GregorianCalendar) == false) goto L7;
        int r0 = (r3.c - this.c) * 12;
        return (r3.b - this.b) + r0;
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
        if ((r5 instanceof zv) == true) goto L8;
        return false;
    L8:
        zv r52 = (zv) r5;
        if (this.b == r52.b) goto L11;
    L13:
        return false;
    L11:
        if (this.c != r52.c) goto L13;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.c);
        r1.writeInt(this.b);
    }
}
