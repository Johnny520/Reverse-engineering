package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: Sy */
/* JADX INFO: loaded from: classes.dex */
public final class C0814Sy implements Parcelable {
    public static final Parcelable.Creator<C0814Sy> CREATOR = null;

    /* JADX INFO: renamed from: a */
    public int f2579a;

    /* JADX INFO: renamed from: b */
    public int f2580b;

    /* JADX INFO: renamed from: c */
    public int[] f2581c;

    /* JADX INFO: renamed from: d */
    public boolean f2582d;

    static {
        CREATOR = new C0646P0(24);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f2579a + ", mGapDir=" + this.f2580b + ", mHasUnwantedGapAfter=" + this.f2582d + ", mGapPerSpan=" + Arrays.toString(this.f2581c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeInt(this.f2579a);
        r2.writeInt(this.f2580b);
        r2.writeInt(this.f2582d ? 1 : 0);
        int[] r32 = this.f2581c;
        if (r32 != null) goto L5;
    L8:
        r2.writeInt(0);
        return;
    L5:
        if (r32.length <= 0) goto L8;
        r2.writeInt(r32.length);
        r2.writeIntArray(this.f2581c);
    }
}
