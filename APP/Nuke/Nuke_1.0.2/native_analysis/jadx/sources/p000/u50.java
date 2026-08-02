package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u50 implements Parcelable {
    public static final Parcelable.Creator<u50> CREATOR = new C0118d5(1);

    /* JADX INFO: renamed from: h */
    public final int f11109h;

    public u50(int i) {
        this.f11109h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u50) && this.f11109h == ((u50) obj).f11109h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11109h);
    }

    public final String toString() {
        return vi0.m5694m(new StringBuilder("DefaultLazyKey(index="), this.f11109h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11109h);
    }
}
