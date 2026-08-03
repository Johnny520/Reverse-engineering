package p000;

import android.util.StateSet;

/* JADX INFO: renamed from: bz */
/* JADX INFO: loaded from: classes.dex */
public final class C1239bz {

    /* JADX INFO: renamed from: a */
    public int f4210a;

    /* JADX INFO: renamed from: b */
    public C0728Qx f4211b;

    /* JADX INFO: renamed from: c */
    public int[][] f4212c;

    /* JADX INFO: renamed from: d */
    public C0728Qx[] f4213d;

    /* JADX INFO: renamed from: e */
    public C1196az f4214e;

    /* JADX INFO: renamed from: f */
    public C1196az f4215f;

    /* JADX INFO: renamed from: g */
    public C1196az f4216g;

    /* JADX INFO: renamed from: h */
    public C1196az f4217h;

    public C1239bz(C0728Qx r2) {
        m2362b();
        m2361a(StateSet.WILD_CARD, r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2361a(int[] r6, C0728Qx r7) {
        int r0 = this.f4210a;
        if (r0 != 0) goto L5;
    L6:
        this.f4211b = r7;
    L7:
        int[][] r1 = this.f4212c;
        if (r0 < r1.length) goto L10;
        int r2 = r0 + 10;
        int[][] r3 = new int[r2][];
        System.arraycopy(r1, 0, r3, 0, r0);
        this.f4212c = r3;
        C0728Qx[] r12 = new C0728Qx[r2];
        System.arraycopy(this.f4213d, 0, r12, 0, r0);
        this.f4213d = r12;
    L10:
        int[][] r02 = this.f4212c;
        int r13 = this.f4210a;
        r02[r13] = r6;
        this.f4213d[r13] = r7;
        this.f4210a = r13 + 1;
        return;
    L5:
        if (r6.length != 0) goto L7;
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public final void m2362b() {
        this.f4211b = new C0728Qx();
        this.f4212c = new int[10][];
        this.f4213d = new C0728Qx[10];
    }
}
