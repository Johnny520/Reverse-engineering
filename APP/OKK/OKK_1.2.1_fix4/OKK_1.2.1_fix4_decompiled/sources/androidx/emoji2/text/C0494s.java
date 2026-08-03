package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0494s {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1391a;

    /* JADX INFO: renamed from: b */
    public C0497v f1392b;

    public C0494s(int i2) {
        this.f1391a = new SparseArray(i2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1212a(C0497v c0497v, int i2, int i3) {
        int iM1218a = c0497v.m1218a(i2);
        SparseArray sparseArray = this.f1391a;
        C0494s c0494s = sparseArray == null ? null : (C0494s) sparseArray.get(iM1218a);
        if (c0494s == null) {
            c0494s = new C0494s(1);
            sparseArray.put(c0497v.m1218a(i2), c0494s);
        }
        if (i3 > i2) {
            c0494s.m1212a(c0497v, i2 + 1, i3);
        } else {
            c0494s.f1392b = c0497v;
        }
    }
}
