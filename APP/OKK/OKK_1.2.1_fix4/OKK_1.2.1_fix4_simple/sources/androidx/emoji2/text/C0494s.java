package androidx.emoji2.text;

import android.util.SparseArray;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0494s {

    /* JADX INFO: renamed from: a */
    public final SparseArray f1391a;

    /* JADX INFO: renamed from: b */
    public C0497v f1392b;

    public C0494s(int r2) {
        this.f1391a = new SparseArray(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1212a(C0497v r5, int r6, int r7) {
        int r02 = r5.m1218a(r6);
        SparseArray r1 = this.f1391a;
        if (r1 != null) goto L5;
        C0494s r03 = null;
    L7:
        if (r03 != null) goto L9;
        r03 = new C0494s(1);
        r1.put(r5.m1218a(r6), r03);
    L9:
        if (r7 <= r6) goto L11;
        r03.m1212a(r5, r6 + 1, r7);
        return;
    L11:
        r03.f1392b = r5;
        return;
    L5:
        r03 = (C0494s) r1.get(r02);
        goto L7
    }
}
