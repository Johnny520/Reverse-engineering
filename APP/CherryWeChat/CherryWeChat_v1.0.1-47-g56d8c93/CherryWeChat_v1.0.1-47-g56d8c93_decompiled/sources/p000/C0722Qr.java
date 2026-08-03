package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: Qr */
/* JADX INFO: loaded from: classes.dex */
public final class C0722Qr {

    /* JADX INFO: renamed from: a */
    public final SparseArray f2308a;

    /* JADX INFO: renamed from: b */
    public C1043YB f2309b;

    public C0722Qr(int i) {
        this.f2308a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1509a(C1043YB c1043yb, int i, int i2) {
        int iM1991a = c1043yb.m1991a(i);
        SparseArray sparseArray = this.f2308a;
        C0722Qr c0722Qr = sparseArray == null ? null : (C0722Qr) sparseArray.get(iM1991a);
        if (c0722Qr == null) {
            c0722Qr = new C0722Qr(1);
            sparseArray.put(c1043yb.m1991a(i), c0722Qr);
        }
        if (i2 > i) {
            c0722Qr.m1509a(c1043yb, i + 1, i2);
        } else {
            c0722Qr.f2309b = c1043yb;
        }
    }
}
