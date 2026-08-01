package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class xq implements Parcelable {
    public static final Parcelable.Creator<xq> CREATOR = null;
    public int a;
    public int b;
    public boolean c;

    static {
        CREATOR = new t1(8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.a);
        r1.writeInt(this.b);
        r1.writeInt(this.c ? 1 : 0);
    }
}
