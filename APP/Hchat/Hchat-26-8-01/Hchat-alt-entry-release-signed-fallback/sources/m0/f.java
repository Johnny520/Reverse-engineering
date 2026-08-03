package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.f f8459c = null;

    static {
            m0.f r0 = new m0.f
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            m0.f.f8459c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r3, i0.a r4, l0.k r5, b5.i r6, m0.k0 r7) {
            r2 = this;
            r0 = 1
            java.lang.Object r0 = r3.d(r0)
            s0.e r0 = (s0.e) r0
            r1 = 0
            if (r0 == 0) goto Ld
            int r0 = r0.f12186a
            goto Le
        Ld:
            r0 = r1
        Le:
            java.lang.Object r3 = r3.d(r1)
            m0.a r3 = (m0.a) r3
            if (r0 <= 0) goto L1c
            i.u1 r1 = new i.u1
            r1.<init>(r4, r0)
            r4 = r1
        L1c:
            if (r7 == 0) goto L26
            b.e r0 = new b.e
            r1 = 23
            r0.<init>(r7, r1, r5)
            goto L27
        L26:
            r0 = 0
        L27:
            r3.t0(r4, r5, r6, r0)
            return
    }
}
