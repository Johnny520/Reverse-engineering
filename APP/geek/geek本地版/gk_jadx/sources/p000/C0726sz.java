package p000;

import android.util.SparseArray;

/* JADX INFO: renamed from: sz */
/* JADX INFO: loaded from: classes.dex */
public final class C0726sz {

    /* JADX INFO: renamed from: a */
    public SparseArray f4472a;

    /* JADX INFO: renamed from: b */
    public int f4473b;

    /* JADX INFO: renamed from: a */
    public final C0689rz m2341a(int i) {
        SparseArray sparseArray = this.f4472a;
        C0689rz c0689rz = (C0689rz) sparseArray.get(i);
        if (c0689rz != null) {
            return c0689rz;
        }
        C0689rz c0689rz2 = new C0689rz();
        sparseArray.put(i, c0689rz2);
        return c0689rz2;
    }
}
