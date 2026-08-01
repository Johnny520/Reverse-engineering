package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m40 implements Parcelable {
    public static final Parcelable.Creator<m40> CREATOR = null;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public ArrayList g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
        CREATOR = new t1(14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.a);
        r1.writeInt(this.b);
        r1.writeInt(this.c);
        if (this.c <= 0) goto L5;
        r1.writeIntArray(this.d);
    L5:
        r1.writeInt(this.e);
        if (this.e <= 0) goto L8;
        r1.writeIntArray(this.f);
    L8:
        r1.writeInt(this.h ? 1 : 0);
        r1.writeInt(this.i ? 1 : 0);
        r1.writeInt(this.j ? 1 : 0);
        r1.writeList(this.g);
    }
}
