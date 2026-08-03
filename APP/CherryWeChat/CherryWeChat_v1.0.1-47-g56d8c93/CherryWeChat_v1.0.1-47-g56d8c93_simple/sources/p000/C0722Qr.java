package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: Qr */
/* JADX INFO: loaded from: classes.dex */
public final class C0722Qr {

    /* JADX INFO: renamed from: a */
    public final SparseArray f2308a;

    /* JADX INFO: renamed from: b */
    public C1043YB f2309b;

    public C0722Qr(int r2) {
        this.f2308a = new SparseArray(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m1509a(C1043YB r5, int r6, int r7) {
        int r0 = r5.m1991a(r6);
        SparseArray r1 = this.f2308a;
        if (r1 != null) goto L5;
        C0722Qr r02 = null;
    L7:
        if (r02 != null) goto L9;
        r02 = new C0722Qr(1);
        r1.put(r5.m1991a(r6), r02);
    L9:
        if (r7 <= r6) goto L12;
        r02.m1509a(r5, r6 + 1, r7);
        return;
    L12:
        r02.f2309b = r5;
        return;
    L5:
        r02 = (C0722Qr) r1.get(r0);
        goto L7
    }
}
