package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p017J.C0222k;

/* JADX INFO: renamed from: U.U */
/* JADX INFO: loaded from: classes.dex */
public final class C0360U implements Parcelable {
    public static final Parcelable.Creator<C0360U> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f747a;

    /* JADX INFO: renamed from: b */
    public int f748b;

    /* JADX INFO: renamed from: c */
    public int[] f749c;

    /* JADX INFO: renamed from: d */
    public boolean f750d;

    static {
        CREATOR = new C0222k(2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f747a + ", mGapDir=" + this.f748b + ", mHasUnwantedGapAfter=" + this.f750d + ", mGapPerSpan=" + Arrays.toString(this.f749c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.f747a);
        r2.writeInt(this.f748b);
        r2.writeInt(this.f750d ? 1 : 0);
        int[] r32 = this.f749c;
        if (r32 != null) goto L5;
    L7:
        r2.writeInt(0);
        return;
    L5:
        if (r32.length <= 0) goto L7;
        r2.writeInt(r32.length);
        r2.writeIntArray(this.f749c);
    }
}
