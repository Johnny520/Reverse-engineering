package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class s40 implements Parcelable {
    public static final Parcelable.Creator<s40> CREATOR = new C0728t1(13);

    /* JADX INFO: renamed from: a */
    public int f4207a;

    /* JADX INFO: renamed from: b */
    public int f4208b;

    /* JADX INFO: renamed from: c */
    public int[] f4209c;

    /* JADX INFO: renamed from: d */
    public boolean f4210d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4207a + ", mGapDir=" + this.f4208b + ", mHasUnwantedGapAfter=" + this.f4210d + ", mGapPerSpan=" + Arrays.toString(this.f4209c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4207a);
        parcel.writeInt(this.f4208b);
        parcel.writeInt(this.f4210d ? 1 : 0);
        int[] iArr = this.f4209c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4209c);
        }
    }
}
