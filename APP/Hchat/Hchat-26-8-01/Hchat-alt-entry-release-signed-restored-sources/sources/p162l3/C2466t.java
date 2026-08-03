package p162l3;

import android.util.SparseArray;

/* JADX INFO: renamed from: l3.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2466t {

    /* JADX INFO: renamed from: a */
    public final SparseArray f8092a;

    /* JADX INFO: renamed from: b */
    public C2467u f8093b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2466t(int i9) {
        this.f8092a = new SparseArray(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5861a(C2467u c2467u, int i9, int i10) {
        int iM5862a = c2467u.m5862a(i9);
        SparseArray sparseArray = this.f8092a;
        C2466t c2466t = sparseArray == null ? null : (C2466t) sparseArray.get(iM5862a);
        if (c2466t == null) {
            c2466t = new C2466t(1);
            sparseArray.put(c2467u.m5862a(i9), c2466t);
        }
        if (i10 > i9) {
            c2466t.m5861a(c2467u, i9 + 1, i10);
        } else {
            c2466t.f8093b = c2467u;
        }
    }
}
