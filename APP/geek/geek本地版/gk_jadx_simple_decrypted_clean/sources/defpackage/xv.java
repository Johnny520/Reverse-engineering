package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class xv {
    public final SparseArray a;
    public ni b;

    public xv(int r2) {
        this.a = new SparseArray(r2);
    }

    public final void a(ni r5, int r6, int r7) {
        int r0 = r5.a(r6);
        SparseArray r1 = this.a;
        if (r1 != null) goto L5;
        xv r02 = null;
    L7:
        if (r02 != null) goto L9;
        r02 = new xv(1);
        r1.put(r5.a(r6), r02);
    L9:
        if (r7 <= r6) goto L12;
        r02.a(r5, r6 + 1, r7);
        return;
    L12:
        r02.b = r5;
        return;
    L5:
        r02 = (xv) r1.get(r0);
        goto L7
    }
}
