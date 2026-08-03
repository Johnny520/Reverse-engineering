package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: D6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0136D6 implements Parcelable {
    public static final Parcelable.Creator<C0136D6> CREATOR = new C0646P0(4);

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

    public C0136D6(C1469gs c1469gs, C1469gs c1469gs2, C0019Ac c0019Ac, C1469gs c1469gs3, int i) {
        Objects.requireNonNull(c1469gs, "start cannot be null");
        Objects.requireNonNull(c1469gs2, "end cannot be null");
        Objects.requireNonNull(c0019Ac, "validator cannot be null");
        this.f349a = c1469gs;
        this.f350b = c1469gs2;
        this.f352d = c1469gs3;
        this.f353e = i;
        this.f351c = c0019Ac;
        if (c1469gs3 != null && c1469gs.f5207a.compareTo(c1469gs3.f5207a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c1469gs3 != null && c1469gs3.f5207a.compareTo(c1469gs2.f5207a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC2407qD.m4845c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f355g = c1469gs.m2823d(c1469gs2) + 1;
        this.f354f = (c1469gs2.f5209c - c1469gs.f5209c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136D6)) {
            return false;
        }
        C0136D6 c0136d6 = (C0136D6) obj;
        return this.f349a.equals(c0136d6.f349a) && this.f350b.equals(c0136d6.f350b) && Objects.equals(this.f352d, c0136d6.f352d) && this.f353e == c0136d6.f353e && this.f351c.equals(c0136d6.f351c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349a, this.f350b, this.f352d, Integer.valueOf(this.f353e), this.f351c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f349a, 0);
        parcel.writeParcelable(this.f350b, 0);
        parcel.writeParcelable(this.f352d, 0);
        parcel.writeParcelable(this.f351c, 0);
        parcel.writeInt(this.f353e);
    }
}
