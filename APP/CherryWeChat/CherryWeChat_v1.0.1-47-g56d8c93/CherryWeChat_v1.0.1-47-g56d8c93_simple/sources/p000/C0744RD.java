package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: RD */
/* JADX INFO: loaded from: classes.dex */
public final class C0744RD extends AbstractC0702QD {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f2374d;

    /* JADX INFO: renamed from: e */
    public final Parcel f2375e;

    /* JADX INFO: renamed from: f */
    public final int f2376f;

    /* JADX INFO: renamed from: g */
    public final int f2377g;

    /* JADX INFO: renamed from: h */
    public final String f2378h;

    /* JADX INFO: renamed from: i */
    public int f2379i;

    /* JADX INFO: renamed from: j */
    public int f2380j;

    /* JADX INFO: renamed from: k */
    public int f2381k;

    public C0744RD(Parcel r9) {
        this(r9, r9.dataPosition(), r9.dataSize(), "", new C0521M4(0), new C0521M4(0), new C0521M4(0));
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: a */
    public final C0744RD mo1437a() {
        Parcel r1 = this.f2375e;
        int r2 = r1.dataPosition();
        int r3 = this.f2380j;
        if (r3 != this.f2376f) goto L5;
        r3 = this.f2377g;
    L5:
        String r4 = AbstractC0213Ey.m410h(new StringBuilder(), this.f2378h, "  ");
        C0521M4 r6 = this.f2270b;
        C0521M4 r7 = this.f2271c;
        return new C0744RD(r1, r2, r3, r4, this.f2269a, r6, r7);
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: e */
    public final boolean mo1441e(int r3) {
    L3:
        if (this.f2380j >= this.f2377g) goto L12;
        int r0 = this.f2381k;
        if (r0 == r3) goto L20;
        if (String.valueOf(r0).compareTo(String.valueOf(r3)) > 0) goto L21;
        int r02 = this.f2380j;
        Parcel r1 = this.f2375e;
        r1.setDataPosition(r02);
        int r03 = r1.readInt();
        this.f2381k = r1.readInt();
        this.f2380j += r03;
        goto L3
    L21:
        return false;
    L20:
        return true;
    L12:
        if (this.f2381k != r3) goto L15;
        return true;
    L15:
        return false;
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: i */
    public final void mo1445i(int r6) {
        int r0 = this.f2379i;
        SparseIntArray r1 = this.f2374d;
        Parcel r2 = this.f2375e;
        if (r0 < 0) goto L5;
        int r02 = r1.get(r0);
        int r3 = r2.dataPosition();
        r2.setDataPosition(r02);
        r2.writeInt(r3 - r02);
        r2.setDataPosition(r3);
    L5:
        this.f2379i = r6;
        r1.put(r6, r2.dataPosition());
        r2.writeInt(0);
        r2.writeInt(r6);
    }

    public C0744RD(Parcel r1, int r2, int r3, String r4, C0521M4 r5, C0521M4 r6, C0521M4 r7) {
        super(r5, r6, r7);
        this.f2374d = new SparseIntArray();
        this.f2379i = -1;
        this.f2381k = -1;
        this.f2375e = r1;
        this.f2376f = r2;
        this.f2377g = r3;
        this.f2380j = r2;
        this.f2378h = r4;
    }
}
