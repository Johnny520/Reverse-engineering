package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.o f8480c = null;

    static {
            m0.o r0 = new m0.o
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r2)
            m0.o.f8480c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r1, i0.a r2, l0.k r3, b5.i r4, m0.k0 r5) {
            r0 = this;
            r2 = 0
            java.lang.Object r1 = r1.d(r2)
            i0.r1 r1 = (i0.r1) r1
            java.lang.Object r2 = r4.f484j
            f.k0 r2 = (f.k0) r2
            if (r2 == 0) goto L2c
            java.lang.Object r3 = r2.g(r1)
            s0.f r3 = (s0.f) r3
            if (r3 == 0) goto L2c
            java.util.ArrayList r3 = r4.f475a
            if (r3 == 0) goto L29
            int r5 = r3.size()
            int r5 = r5 + (-1)
            java.lang.Object r3 = r3.remove(r5)
            j0.b r3 = (j0.b) r3
            if (r3 == 0) goto L29
            r4.f480f = r3
        L29:
            r2.k(r1)
        L2c:
            return
    }
}
