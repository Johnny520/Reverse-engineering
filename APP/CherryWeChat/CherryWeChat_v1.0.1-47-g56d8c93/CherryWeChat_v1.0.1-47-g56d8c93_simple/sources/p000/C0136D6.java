package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: D6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0136D6 implements Parcelable {
    public static final Parcelable.Creator<C0136D6> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public final C1469gs f349a;

    /* JADX INFO: renamed from: b */
    public final C1469gs f350b;

    /* JADX INFO: renamed from: c */
    public final C0019Ac f351c;

    /* JADX INFO: renamed from: d */
    public final C1469gs f352d;

    /* JADX INFO: renamed from: e */
    public final int f353e;

    /* JADX INFO: renamed from: f */
    public final int f354f;

    /* JADX INFO: renamed from: g */
    public final int f355g;

    static {
        CREATOR = new C0646P0(4);
    }

    public C0136D6(C1469gs r2, C1469gs r3, C0019Ac r4, C1469gs r5, int r6) {
        Objects.requireNonNull(r2, "start cannot be null");
        Objects.requireNonNull(r3, "end cannot be null");
        Objects.requireNonNull(r4, "validator cannot be null");
        this.f349a = r2;
        this.f350b = r3;
        this.f352d = r5;
        this.f353e = r6;
        this.f351c = r4;
        if (r5 != null) goto L5;
    L9:
        if (r5 != null) goto L11;
    L15:
        if (r6 < 0) goto L21;
        if (r6 > AbstractC2407qD.m4845c(null).getMaximum(7)) goto L21;
        this.f355g = r2.m2823d(r3) + 1;
        this.f354f = (r3.f5209c - r2.f5209c) + 1;
        return;
    L21:
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    L11:
        if (r5.f5207a.compareTo(r3.f5207a) <= 0) goto L15;
        throw new IllegalArgumentException("current Month cannot be after end Month");
    L5:
        if (r2.f5207a.compareTo(r5.f5207a) <= 0) goto L9;
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
        if ((r5 instanceof C0136D6) == true) goto L8;
        return false;
    L8:
        C0136D6 r52 = (C0136D6) r5;
        if (this.f349a.equals(r52.f349a) == true) goto L11;
    L19:
        return false;
    L11:
        if (this.f350b.equals(r52.f350b) == false) goto L19;
        if (Objects.equals(this.f352d, r52.f352d) == false) goto L19;
        if (this.f353e != r52.f353e) goto L19;
        if (this.f351c.equals(r52.f351c) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        Integer r0 = Integer.valueOf(this.f353e);
        C0019Ac r1 = this.f351c;
        return Arrays.hashCode(new Object[]{this.f349a, this.f350b, this.f352d, r0, r1});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeParcelable(this.f349a, 0);
        r2.writeParcelable(this.f350b, 0);
        r2.writeParcelable(this.f352d, 0);
        r2.writeParcelable(this.f351c, 0);
        r2.writeInt(this.f353e);
    }
}
