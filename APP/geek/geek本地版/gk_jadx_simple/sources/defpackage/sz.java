package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class sz {
    public SparseArray a;
    public int b;

    public final rz a(int r3) {
        SparseArray r0 = this.a;
        rz r1 = (rz) r0.get(r3);
        if (r1 != null) goto L6;
        rz r12 = new rz();
        r0.put(r3, r12);
        return r12;
    L6:
        return r1;
    }
}
