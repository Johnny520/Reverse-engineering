package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements Parcelable {
    public static final Parcelable.Creator<cm> CREATOR = null;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Bundle j;
    public final boolean k;
    public final int l;
    public Bundle m;

    static {
        CREATOR = new t1(7);
    }

    public cm(ml r2) {
        this.a = r2.getClass().getName();
        this.b = r2.e;
        this.c = r2.m;
        this.d = r2.v;
        this.e = r2.w;
        this.f = r2.x;
        this.g = r2.A;
        this.h = r2.l;
        this.i = r2.z;
        this.j = r2.f;
        this.k = r2.y;
        this.l = r2.K.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentState{");
        r0.append(this.a);
        r0.append(" (");
        r0.append(this.b);
        r0.append(")}:");
        if (this.c == false) goto L5;
        r0.append(" fromLayout");
    L5:
        int r1 = this.e;
        if (r1 == 0) goto L8;
        r0.append(" id=0x");
        r0.append(Integer.toHexString(r1));
    L8:
        String r12 = this.f;
        if (r12 == null) goto L14;
        if (r12.isEmpty() == true) goto L14;
        r0.append(" tag=");
        r0.append(r12);
    L14:
        if (this.g == false) goto L17;
        r0.append(" retainInstance");
    L17:
        if (this.h == false) goto L20;
        r0.append(" removing");
    L20:
        if (this.i == false) goto L23;
        r0.append(" detached");
    L23:
        if (this.k == false) goto L26;
        r0.append(" hidden");
    L26:
        return r0.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.a);
        r1.writeString(this.b);
        r1.writeInt(this.c ? 1 : 0);
        r1.writeInt(this.d);
        r1.writeInt(this.e);
        r1.writeString(this.f);
        r1.writeInt(this.g ? 1 : 0);
        r1.writeInt(this.h ? 1 : 0);
        r1.writeInt(this.i ? 1 : 0);
        r1.writeBundle(this.j);
        r1.writeInt(this.k ? 1 : 0);
        r1.writeBundle(this.m);
        r1.writeInt(this.l);
    }

    public cm(Parcel r4) {
        this.a = r4.readString();
        this.b = r4.readString();
        boolean r1 = false;
        if (r4.readInt() == 0) goto L5;
        boolean r0 = true;
    L6:
        this.c = r0;
        this.d = r4.readInt();
        this.e = r4.readInt();
        this.f = r4.readString();
        if (r4.readInt() == 0) goto L9;
        boolean r02 = true;
    L10:
        this.g = r02;
        if (r4.readInt() == 0) goto L13;
        boolean r03 = true;
    L14:
        this.h = r03;
        if (r4.readInt() == 0) goto L17;
        boolean r04 = true;
    L18:
        this.i = r04;
        this.j = r4.readBundle();
        if (r4.readInt() == 0) goto L21;
        r1 = true;
    L21:
        this.k = r1;
        this.m = r4.readBundle();
        this.l = r4.readInt();
        return;
    L17:
        r04 = false;
        goto L18
    L13:
        r03 = false;
        goto L14
    L9:
        r02 = false;
        goto L10
    L5:
        r0 = false;
        goto L6
    }
}
