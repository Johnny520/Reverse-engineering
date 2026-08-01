package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: zz */
/* JADX INFO: loaded from: classes.dex */
public final class C0985zz {

    /* JADX INFO: renamed from: a */
    public SparseArray f5631a;

    /* JADX INFO: renamed from: b */
    public int f5632b;

    /* JADX INFO: renamed from: a */
    public final C0948yz m2853a(int i) {
        SparseArray sparseArray = this.f5631a;
        C0948yz c0948yz = (C0948yz) sparseArray.get(i);
        if (c0948yz != null) {
            return c0948yz;
        }
        C0948yz c0948yz2 = new C0948yz();
        sparseArray.put(i, c0948yz2);
        return c0948yz2;
    }
}
