package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv {
    public final android.util.SparseArray a;
    public defpackage.ni b;

    public xv(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public final void a(defpackage.ni r5, int r6, int r7) {
            r4 = this;
            int r0 = r5.a(r6)
            android.util.SparseArray r1 = r4.a
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.Object r0 = r1.get(r0)
            xv r0 = (defpackage.xv) r0
        L10:
            r2 = 1
            if (r0 != 0) goto L1f
            xv r0 = new xv
            r0.<init>(r2)
            int r3 = r5.a(r6)
            r1.put(r3, r0)
        L1f:
            if (r7 <= r6) goto L26
            int r6 = r6 + r2
            r0.a(r5, r6, r7)
            return
        L26:
            r0.b = r5
            return
    }
}
