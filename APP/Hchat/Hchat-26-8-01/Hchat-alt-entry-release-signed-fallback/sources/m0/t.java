package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.t f8489c = null;

    static {
            m0.t r0 = new m0.t
            r1 = 3
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            m0.t.f8489c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r8, i0.a r9, l0.k r10, b5.i r11, m0.k0 r12) {
            r7 = this;
            r0 = 1
            java.lang.Object r1 = r8.d(r0)
            l0.h r1 = (l0.h) r1
            r2 = 0
            java.lang.Object r3 = r8.d(r2)
            l0.b r3 = (l0.b) r3
            r4 = 2
            java.lang.Object r8 = r8.d(r4)
            m0.c r8 = (m0.c) r8
            l0.k r4 = r1.e()
            if (r12 == 0) goto L25
            b.e r5 = new b.e     // Catch: java.lang.Throwable -> L23
            r6 = 23
            r5.<init>(r12, r6, r10)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r8 = move-exception
            goto L4c
        L25:
            r5 = 0
        L26:
            m0.l0 r12 = r8.f8453d     // Catch: java.lang.Throwable -> L23
            boolean r12 = r12.T()     // Catch: java.lang.Throwable -> L23
            if (r12 != 0) goto L33
            java.lang.String r12 = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"
            i0.m.a(r12)     // Catch: java.lang.Throwable -> L23
        L33:
            m0.l0 r8 = r8.f8452c     // Catch: java.lang.Throwable -> L23
            r8.S(r9, r4, r11, r5)     // Catch: java.lang.Throwable -> L23
            r4.e(r0)
            r10.d()
            r3.getClass()
            int r8 = r1.a(r3)
            r10.A(r1, r8)
            r10.k()
            return
        L4c:
            r4.e(r2)
            throw r8
    }
}
