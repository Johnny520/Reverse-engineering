package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p017J.C0222k;

/* JADX INFO: renamed from: U.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0360U implements Parcelable {
    public static final Parcelable.Creator<C0360U> CREATOR = new C0222k(2);

    /* JADX INFO: renamed from: a */
    public int f747a;

    /* JADX INFO: renamed from: b */
    public int f748b;

    /* JADX INFO: renamed from: c */
    public int[] f749c;

    /* JADX INFO: renamed from: d */
    public boolean f750d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f747a + ", mGapDir=" + this.f748b + ", mHasUnwantedGapAfter=" + this.f750d + ", mGapPerSpan=" + Arrays.toString(this.f749c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f747a);
        parcel.writeInt(this.f748b);
        parcel.writeInt(this.f750d ? 1 : 0);
        int[] iArr = this.f749c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f749c);
        }
    }
}
