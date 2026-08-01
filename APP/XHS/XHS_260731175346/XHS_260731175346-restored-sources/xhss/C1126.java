package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛲᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1126 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0476 f3636;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.util.SparseArray f3637;

    public C1126(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.f3637 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1820(xhss.C0476 r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.m875(r5)
            android.util.SparseArray r3 = r3.f3637
            java.lang.Object r0 = r3.get(r0)
            xhss.ᲈᛲᛷᛳ r0 = (xhss.C1126) r0
            r1 = 1
            if (r0 != 0) goto L1b
            xhss.ᲈᛲᛷᛳ r0 = new xhss.ᲈᛲᛷᛳ
            r0.<init>(r1)
            int r2 = r4.m875(r5)
            r3.put(r2, r0)
        L1b:
            if (r6 <= r5) goto L22
            int r5 = r5 + r1
            r0.m1820(r4, r5, r6)
            return
        L22:
            r0.f3636 = r4
            return
    }
}
