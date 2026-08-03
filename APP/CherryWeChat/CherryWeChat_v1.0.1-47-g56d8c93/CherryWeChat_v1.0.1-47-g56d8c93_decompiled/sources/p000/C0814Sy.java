package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: Sy */
/* JADX INFO: loaded from: classes.dex */
public final class C0814Sy implements Parcelable {
    public static final Parcelable.Creator<C0814Sy> CREATOR = new C0646P0(24);

    /* JADX INFO: renamed from: a */
    public int f2579a;

    /* JADX INFO: renamed from: b */
    public int f2580b;

    /* JADX INFO: renamed from: c */
    public int[] f2581c;

    /* JADX INFO: renamed from: d */
    public boolean f2582d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2579a + ", mGapDir=" + this.f2580b + ", mHasUnwantedGapAfter=" + this.f2582d + ", mGapPerSpan=" + Arrays.toString(this.f2581c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2579a);
        parcel.writeInt(this.f2580b);
        parcel.writeInt(this.f2582d ? 1 : 0);
        int[] iArr = this.f2581c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f2581c);
        }
    }
}
