package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.k f8470c = null;

    static {
            m0.k r0 = new m0.k
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r2)
            m0.k.f8470c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r1, i0.a r2, l0.k r3, b5.i r4, m0.k0 r5) {
            r0 = this;
            r3 = 0
            java.lang.Object r1 = r1.d(r3)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r4 = r1.length
        L8:
            if (r3 >= r4) goto L12
            r5 = r1[r3]
            r2.d(r5)
            int r3 = r3 + 1
            goto L8
        L12:
            return
    }
}
