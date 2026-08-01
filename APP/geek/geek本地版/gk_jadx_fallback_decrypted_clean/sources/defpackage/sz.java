package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sz {
    public android.util.SparseArray a;
    public int b;

    public final defpackage.rz a(int r3) {
            r2 = this;
            android.util.SparseArray r0 = r2.a
            java.lang.Object r1 = r0.get(r3)
            rz r1 = (defpackage.rz) r1
            if (r1 != 0) goto L12
            rz r1 = new rz
            r1.<init>()
            r0.put(r3, r1)
        L12:
            return r1
    }
}
