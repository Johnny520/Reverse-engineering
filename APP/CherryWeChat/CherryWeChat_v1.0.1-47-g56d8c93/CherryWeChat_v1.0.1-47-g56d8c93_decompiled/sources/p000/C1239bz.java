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

    public C1239bz(C0728Qx c0728Qx) {
        m2362b();
        m2361a(StateSet.WILD_CARD, c0728Qx);
    }

    /* JADX INFO: renamed from: a */
    public final void m2361a(int[] iArr, C0728Qx c0728Qx) {
        int i = this.f4210a;
        if (i == 0 || iArr.length == 0) {
            this.f4211b = c0728Qx;
        }
        int[][] iArr2 = this.f4212c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f4212c = iArr3;
            C0728Qx[] c0728QxArr = new C0728Qx[i2];
            System.arraycopy(this.f4213d, 0, c0728QxArr, 0, i);
            this.f4213d = c0728QxArr;
        }
        int[][] iArr4 = this.f4212c;
        int i3 = this.f4210a;
        iArr4[i3] = iArr;
        this.f4213d[i3] = c0728Qx;
        this.f4210a = i3 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m2362b() {
        this.f4211b = new C0728Qx();
        this.f4212c = new int[10][];
        this.f4213d = new C0728Qx[10];
    }
}
