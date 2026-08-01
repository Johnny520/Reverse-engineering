package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: c8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c8 implements Parcelable {
    public static final Parcelable.Creator<C0095c8> CREATOR = new C0729t1(3);

    /* JADX INFO: renamed from: a */
    public final C0981zv f909a;

    /* JADX INFO: renamed from: b */
    public final C0981zv f910b;

    /* JADX INFO: renamed from: c */
    public final C0102cf f911c;

    /* JADX INFO: renamed from: d */
    public final C0981zv f912d;

    /* JADX INFO: renamed from: e */
    public final int f913e;

    /* JADX INFO: renamed from: f */
    public final int f914f;

    /* JADX INFO: renamed from: g */
    public final int f915g;

    public C0095c8(C0981zv c0981zv, C0981zv c0981zv2, C0102cf c0102cf, C0981zv c0981zv3, int i) {
        Objects.requireNonNull(c0981zv, "start cannot be null");
        Objects.requireNonNull(c0981zv2, "end cannot be null");
        Objects.requireNonNull(c0102cf, "validator cannot be null");
        this.f909a = c0981zv;
        this.f910b = c0981zv2;
        this.f912d = c0981zv3;
        this.f913e = i;
        this.f911c = c0102cf;
        if (c0981zv3 != null && c0981zv.f5619a.compareTo(c0981zv3.f5619a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0981zv3 != null && c0981zv3.f5619a.compareTo(c0981zv2.f5619a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > u80.m2428c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f915g = c0981zv.m2843d(c0981zv2) + 1;
        this.f914f = (c0981zv2.f5621c - c0981zv.f5621c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0095c8)) {
            return false;
        }
        C0095c8 c0095c8 = (C0095c8) obj;
        return this.f909a.equals(c0095c8.f909a) && this.f910b.equals(c0095c8.f910b) && AbstractC0612pw.m2131a(this.f912d, c0095c8.f912d) && this.f913e == c0095c8.f913e && this.f911c.equals(c0095c8.f911c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f909a, this.f910b, this.f912d, Integer.valueOf(this.f913e), this.f911c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f909a, 0);
        parcel.writeParcelable(this.f910b, 0);
        parcel.writeParcelable(this.f912d, 0);
        parcel.writeParcelable(this.f911c, 0);
        parcel.writeInt(this.f913e);
    }
}
