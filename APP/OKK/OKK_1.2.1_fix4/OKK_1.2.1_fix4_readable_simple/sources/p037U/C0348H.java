package p037U;

import android.util.SparseArray;

/* JADX INFO: renamed from: U.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0348H {

    /* JADX INFO: renamed from: a */
    public SparseArray f683a;

    /* JADX INFO: renamed from: b */
    public int f684b;

    /* JADX INFO: renamed from: a */
    public final C0347G m820a(int r3) {
        SparseArray r02 = this.f683a;
        C0347G r1 = (C0347G) r02.get(r3);
        if (r1 != null) goto L6;
        C0347G r12 = new C0347G();
        r02.put(r3, r12);
        return r12;
    L6:
        return r1;
    }
}
