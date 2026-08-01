package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c8 implements Parcelable {
    public static final Parcelable.Creator<c8> CREATOR = null;
    public final zv a;
    public final zv b;
    public final cf c;
    public final zv d;
    public final int e;
    public final int f;
    public final int g;

    static {
        CREATOR = new t1(3);
    }

    public c8(zv r2, zv r3, cf r4, zv r5, int r6) {
        Objects.requireNonNull(r2, "start cannot be null");
        Objects.requireNonNull(r3, "end cannot be null");
        Objects.requireNonNull(r4, "validator cannot be null");
        this.a = r2;
        this.b = r3;
        this.d = r5;
        this.e = r6;
        this.c = r4;
        if (r5 != null) goto L5;
    L9:
        if (r5 != null) goto L11;
    L15:
        if (r6 < 0) goto L21;
        if (r6 > u80.c(null).getMaximum(7)) goto L21;
        this.g = r2.d(r3) + 1;
        this.f = (r3.c - r2.c) + 1;
        return;
    L21:
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    L11:
        if (r5.a.compareTo(r3.a) <= 0) goto L15;
        throw new IllegalArgumentException("current Month cannot be after end Month");
    L5:
        if (r2.a.compareTo(r5.a) <= 0) goto L9;
        throw new IllegalArgumentException("start Month cannot be after current Month");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c8) == true) goto L8;
        return false;
    L8:
        c8 r52 = (c8) r5;
        if (this.a.equals(r52.a) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.b.equals(r52.b) == false) goto L19;
        if (pw.a(this.d, r52.d) == false) goto L19;
        if (this.e != r52.e) goto L19;
        if (this.c.equals(r52.c) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.e);
        cf r1 = this.c;
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, r0, r1});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.a, 0);
        r2.writeParcelable(this.b, 0);
        r2.writeParcelable(this.d, 0);
        r2.writeParcelable(this.c, 0);
        r2.writeInt(this.e);
    }
}
