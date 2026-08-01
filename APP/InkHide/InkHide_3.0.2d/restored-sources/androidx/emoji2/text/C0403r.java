package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: renamed from: androidx.emoji2.text.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0403r {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1207a;

    /* JADX INFO: renamed from: b */
    public C0399n f1208b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0403r(int i2) {
        this.f1207a = new SparseArray(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m774a(C0399n c0399n, int i2, int i3) {
        int iM767a = c0399n.m767a(i2);
        SparseArray sparseArray = this.f1207a;
        C0403r c0403r = sparseArray == null ? null : (C0403r) sparseArray.get(iM767a);
        if (c0403r == null) {
            c0403r = new C0403r(1);
            sparseArray.put(c0399n.m767a(i2), c0403r);
        }
        if (i3 > i2) {
            c0403r.m774a(c0399n, i2 + 1, i3);
        } else {
            c0403r.f1208b = c0399n;
        }
    }
}
