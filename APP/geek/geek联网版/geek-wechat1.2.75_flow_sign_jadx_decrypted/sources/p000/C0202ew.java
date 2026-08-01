package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: ew */
/* JADX INFO: loaded from: classes.dex */
public final class C0202ew {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1672a;

    /* JADX INFO: renamed from: b */
    public C0597pi f1673b;

    public C0202ew(int i) {
        this.f1672a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m1032a(C0597pi c0597pi, int i, int i2) {
        int iM2090a = c0597pi.m2090a(i);
        SparseArray sparseArray = this.f1672a;
        C0202ew c0202ew = sparseArray == null ? null : (C0202ew) sparseArray.get(iM2090a);
        if (c0202ew == null) {
            c0202ew = new C0202ew(1);
            sparseArray.put(c0597pi.m2090a(i), c0202ew);
        }
        if (i2 > i) {
            c0202ew.m1032a(c0597pi, i + 1, i2);
        } else {
            c0202ew.f1673b = c0597pi;
        }
    }
}
