package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k90 extends j90 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public k90(Parcel r9) {
        this(r9, r9.dataPosition(), r9.dataSize(), "", new n6(), new n6(), new n6());
    }

    @Override // defpackage.j90
    public final k90 a() {
        Parcel r1 = this.e;
        int r2 = r1.dataPosition();
        int r3 = this.j;
        if (r3 != this.f) goto L5;
        r3 = this.g;
    L5:
        String r4 = z30.l(new StringBuilder(), this.h, "  ");
        n6 r6 = this.b;
        n6 r7 = this.c;
        return new k90(r1, r2, r3, r4, this.a, r6, r7);
    }

    @Override // defpackage.j90
    public final boolean e(int r3) {
    L3:
        if (this.j >= this.g) goto L12;
        int r0 = this.k;
        if (r0 == r3) goto L20;
        if (String.valueOf(r0).compareTo(String.valueOf(r3)) > 0) goto L21;
        int r02 = this.j;
        Parcel r1 = this.e;
        r1.setDataPosition(r02);
        int r03 = r1.readInt();
        this.k = r1.readInt();
        this.j += r03;
        goto L3
    L21:
        return false;
    L20:
        return true;
    L12:
        if (this.k != r3) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // defpackage.j90
    public final void h(int r6) {
        int r0 = this.i;
        SparseIntArray r1 = this.d;
        Parcel r2 = this.e;
        if (r0 < 0) goto L5;
        int r02 = r1.get(r0);
        int r3 = r2.dataPosition();
        r2.setDataPosition(r02);
        r2.writeInt(r3 - r02);
        r2.setDataPosition(r3);
    L5:
        this.i = r6;
        r1.put(r6, r2.dataPosition());
        r2.writeInt(0);
        r2.writeInt(r6);
    }

    public k90(Parcel r1, int r2, int r3, String r4, n6 r5, n6 r6, n6 r7) {
        super(r5, r6, r7);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = r1;
        this.f = r2;
        this.g = r3;
        this.j = r2;
        this.h = r4;
    }
}
