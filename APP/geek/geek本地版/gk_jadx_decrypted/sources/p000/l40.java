package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements Parcelable {
    public static final Parcelable.Creator<l40> CREATOR = new C0729t1(13);

    /* JADX INFO: renamed from: a */
    public int f3009a;

    /* JADX INFO: renamed from: b */
    public int f3010b;

    /* JADX INFO: renamed from: c */
    public int[] f3011c;

    /* JADX INFO: renamed from: d */
    public boolean f3012d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3009a + ", mGapDir=" + this.f3010b + ", mHasUnwantedGapAfter=" + this.f3012d + ", mGapPerSpan=" + Arrays.toString(this.f3011c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3009a);
        parcel.writeInt(this.f3010b);
        parcel.writeInt(this.f3012d ? 1 : 0);
        int[] iArr = this.f3011c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3011c);
        }
    }
}
