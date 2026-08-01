package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: m8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0476m8 implements Parcelable {
    public static final Parcelable.Creator<C0476m8> CREATOR = new C0728t1(3);

    /* JADX INFO: renamed from: a */
    public final C0276gw f3099a;

    /* JADX INFO: renamed from: b */
    public final C0276gw f3100b;

    /* JADX INFO: renamed from: c */
    public final C0149df f3101c;

    /* JADX INFO: renamed from: d */
    public final C0276gw f3102d;

    /* JADX INFO: renamed from: e */
    public final int f3103e;

    /* JADX INFO: renamed from: f */
    public final int f3104f;

    /* JADX INFO: renamed from: g */
    public final int f3105g;

    public C0476m8(C0276gw c0276gw, C0276gw c0276gw2, C0149df c0149df, C0276gw c0276gw3, int i) {
        Objects.requireNonNull(c0276gw, "start cannot be null");
        Objects.requireNonNull(c0276gw2, "end cannot be null");
        Objects.requireNonNull(c0149df, "validator cannot be null");
        this.f3099a = c0276gw;
        this.f3100b = c0276gw2;
        this.f3102d = c0276gw3;
        this.f3103e = i;
        this.f3101c = c0149df;
        if (c0276gw3 != null && c0276gw.f2060a.compareTo(c0276gw3.f2060a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0276gw3 != null && c0276gw3.f2060a.compareTo(c0276gw2.f2060a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > z80.m2821c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3105g = c0276gw.m1344d(c0276gw2) + 1;
        this.f3104f = (c0276gw2.f2062c - c0276gw.f2062c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0476m8)) {
            return false;
        }
        C0476m8 c0476m8 = (C0476m8) obj;
        return this.f3099a.equals(c0476m8.f3099a) && this.f3100b.equals(c0476m8.f3100b) && AbstractC0908xw.m2709a(this.f3102d, c0476m8.f3102d) && this.f3103e == c0476m8.f3103e && this.f3101c.equals(c0476m8.f3101c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3099a, this.f3100b, this.f3102d, Integer.valueOf(this.f3103e), this.f3101c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3099a, 0);
        parcel.writeParcelable(this.f3100b, 0);
        parcel.writeParcelable(this.f3102d, 0);
        parcel.writeParcelable(this.f3101c, 0);
        parcel.writeInt(this.f3103e);
    }
}
