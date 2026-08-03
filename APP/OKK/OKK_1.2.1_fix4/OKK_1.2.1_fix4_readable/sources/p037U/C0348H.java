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
    public final C0347G m820a(int i2) {
        SparseArray sparseArray = this.f683a;
        C0347G c0347g = (C0347G) sparseArray.get(i2);
        if (c0347g != null) {
            return c0347g;
        }
        C0347G c0347g2 = new C0347G();
        sparseArray.put(i2, c0347g2);
        return c0347g2;
    }
}
