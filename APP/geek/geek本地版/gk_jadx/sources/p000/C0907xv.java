package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: xv */
/* JADX INFO: loaded from: classes.dex */
public final class C0907xv {

    /* JADX INFO: renamed from: a */
    public final SparseArray f5212a;

    /* JADX INFO: renamed from: b */
    public C0523ni f5213b;

    public C0907xv(int i) {
        this.f5212a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m2637a(C0523ni c0523ni, int i, int i2) {
        int iM1945a = c0523ni.m1945a(i);
        SparseArray sparseArray = this.f5212a;
        C0907xv c0907xv = sparseArray == null ? null : (C0907xv) sparseArray.get(iM1945a);
        if (c0907xv == null) {
            c0907xv = new C0907xv(1);
            sparseArray.put(c0523ni.m1945a(i), c0907xv);
        }
        if (i2 > i) {
            c0907xv.m2637a(c0523ni, i + 1, i2);
        } else {
            c0907xv.f5213b = c0523ni;
        }
    }
}
