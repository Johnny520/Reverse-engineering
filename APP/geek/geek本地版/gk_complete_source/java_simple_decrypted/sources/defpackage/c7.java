package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c7 implements Parcelable {
    public static final Parcelable.Creator<c7> CREATOR = null;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    static {
        CREATOR = new t1(2);
    }

    public c7(b7 r9) {
        int r0 = r9.a.size();
        this.a = new int[r0 * 5];
        if (r9.g == false) goto L14;
        this.b = new ArrayList(r0);
        this.c = new int[r0];
        this.d = new int[r0];
        int r1 = 0;
        int r2 = 0;
    L5:
        if (r1 >= r0) goto L11;
        em r3 = (em) r9.a.get(r1);
        int r5 = r2 + 1;
        this.a[r2] = r3.a;
        ArrayList r4 = this.b;
        ml r6 = r3.b;
        if (r6 == null) goto L9;
        String r62 = r6.e;
    L10:
        r4.add(r62);
        int[] r42 = this.a;
        r42[r5] = r3.c;
        r42[r2 + 2] = r3.d;
        int r63 = r2 + 4;
        r42[r2 + 3] = r3.e;
        r2 = r2 + 5;
        r42[r63] = r3.f;
        this.c[r1] = r3.g.ordinal();
        this.d[r1] = r3.h.ordinal();
        r1 = r1 + 1;
        goto L5
    L9:
        r62 = null;
        goto L10
    L11:
        this.e = r9.f;
        this.f = r9.h;
        this.g = r9.r;
        this.h = r9.i;
        this.i = r9.j;
        this.j = r9.k;
        this.k = r9.l;
        this.l = r9.m;
        this.m = r9.n;
        this.n = r9.o;
        return;
    L14:
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        r2.writeIntArray(this.a);
        r2.writeStringList(this.b);
        r2.writeIntArray(this.c);
        r2.writeIntArray(this.d);
        r2.writeInt(this.e);
        r2.writeString(this.f);
        r2.writeInt(this.g);
        r2.writeInt(this.h);
        TextUtils.writeToParcel(this.i, r2, 0);
        r2.writeInt(this.j);
        TextUtils.writeToParcel(this.k, r2, 0);
        r2.writeStringList(this.l);
        r2.writeStringList(this.m);
        r2.writeInt(this.n ? 1 : 0);
    }

    public c7(Parcel r3) {
        this.a = r3.createIntArray();
        this.b = r3.createStringArrayList();
        this.c = r3.createIntArray();
        this.d = r3.createIntArray();
        this.e = r3.readInt();
        this.f = r3.readString();
        this.g = r3.readInt();
        this.h = r3.readInt();
        Parcelable.Creator r0 = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) r0.createFromParcel(r3);
        this.j = r3.readInt();
        this.k = (CharSequence) r0.createFromParcel(r3);
        this.l = r3.createStringArrayList();
        this.m = r3.createStringArrayList();
        if (r3.readInt() == 0) goto L5;
        boolean r32 = true;
    L6:
        this.n = r32;
        return;
    L5:
        r32 = false;
        goto L6
    }
}
