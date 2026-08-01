package p000;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class he0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f2221a;

    /* JADX INFO: renamed from: b */
    public y91 f2222b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public he0(int i) {
        this.f2221a = new SparseArray(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1300a(y91 y91Var, int i, int i2) {
        int iM5224a = y91Var.m5224a(i);
        SparseArray sparseArray = this.f2221a;
        he0 he0Var = sparseArray == null ? null : (he0) sparseArray.get(iM5224a);
        if (he0Var == null) {
            he0Var = new he0(1);
            sparseArray.put(y91Var.m5224a(i), he0Var);
        }
        if (i2 > i) {
            he0Var.m1300a(y91Var, i + 1, i2);
        } else {
            he0Var.f2222b = y91Var;
        }
    }
}
