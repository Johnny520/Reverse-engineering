package yyds;

import android.util.SparseArray;

/* JADX INFO: renamed from: yyds.ᛷᲇᛵᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1660 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final SparseArray f8461;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C0758 f8462;

    public C1660(int i) {
        this.f8461 = new SparseArray(i);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3380(C0758 c0758, int i, int i2) {
        int iM1705 = c0758.m1705(i);
        SparseArray sparseArray = this.f8461;
        C1660 c1660 = (C1660) sparseArray.get(iM1705);
        if (c1660 == null) {
            c1660 = new C1660(1);
            sparseArray.put(c0758.m1705(i), c1660);
        }
        if (i2 > i) {
            c1660.m3380(c0758, i + 1, i2);
        } else {
            c1660.f8462 = c0758;
        }
    }
}
