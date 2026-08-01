package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l40 implements Parcelable {
    public static final Parcelable.Creator<l40> CREATOR = null;
    public int a;
    public int b;
    public int[] c;
    public boolean d;

    static {
        CREATOR = new t1(13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.a);
        r2.writeInt(this.b);
        r2.writeInt(this.d ? 1 : 0);
        int[] r32 = this.c;
        if (r32 != null) goto L5;
    L8:
        r2.writeInt(0);
        return;
    L5:
        if (r32.length <= 0) goto L8;
        r2.writeInt(r32.length);
        r2.writeIntArray(this.c);
    }
}
