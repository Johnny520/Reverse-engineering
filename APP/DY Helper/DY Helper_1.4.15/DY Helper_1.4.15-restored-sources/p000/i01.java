package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i01 {

    /* JADX INFO: renamed from: α */
    public final android.util.SparseArray f4863;

    /* JADX INFO: renamed from: β */
    public p000.k62 f4864;

    public i01(int r2) {
            r1 = this;
            r1.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r2)
            r1.f4863 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2577(p000.k62 r4, int r5, int r6) {
            r3 = this;
            int r0 = r4.m3166(r5)
            android.util.SparseArray r3 = r3.f4863
            if (r3 != 0) goto La
            r0 = 0
            goto L10
        La:
            java.lang.Object r0 = r3.get(r0)
            i01 r0 = (p000.i01) r0
        L10:
            r1 = 1
            if (r0 != 0) goto L1f
            i01 r0 = new i01
            r0.<init>(r1)
            int r2 = r4.m3166(r5)
            r3.put(r2, r0)
        L1f:
            if (r6 <= r5) goto L26
            int r5 = r5 + r1
            r0.m2577(r4, r5, r6)
            return
        L26:
            r0.f4864 = r4
            return
    }
}
