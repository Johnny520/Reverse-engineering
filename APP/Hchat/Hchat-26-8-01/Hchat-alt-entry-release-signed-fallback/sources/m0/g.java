package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.g f8461c = null;

    static {
            m0.g r0 = new m0.g
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            m0.g.f8461c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r3, i0.a r4, l0.k r5, b5.i r6, m0.k0 r7) {
            r2 = this;
            r5 = 0
            java.lang.Object r6 = r3.d(r5)
            s0.e r6 = (s0.e) r6
            int r6 = r6.f12186a
            r7 = 1
            java.lang.Object r3 = r3.d(r7)
            java.util.List r3 = (java.util.List) r3
            int r7 = r3.size()
        L14:
            if (r5 >= r7) goto L25
            java.lang.Object r0 = r3.get(r5)
            int r1 = r6 + r5
            r4.c(r1, r0)
            r4.p(r1, r0)
            int r5 = r5 + 1
            goto L14
        L25:
            return
    }
}
