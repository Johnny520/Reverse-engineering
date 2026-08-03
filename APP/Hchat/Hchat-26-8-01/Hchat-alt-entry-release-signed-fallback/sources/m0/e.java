package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.e f8457c = null;

    static {
            m0.e r0 = new m0.e
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            m0.e.f8457c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r4, i0.a r5, l0.k r6, b5.i r7, m0.k0 r8) {
            r3 = this;
            r5 = 0
            java.lang.Object r5 = r4.d(r5)
            l0.b r5 = (l0.b) r5
            r8 = 1
            java.lang.Object r4 = r4.d(r8)
            boolean r0 = r4 instanceof i0.k0
            if (r0 == 0) goto L21
            r0 = r4
            i0.k0 r0 = (i0.k0) r0
            java.util.RandomAccess r1 = r7.f480f
            j0.b r1 = (j0.b) r1
            r1.b(r0)
            java.lang.Object r7 = r7.f479e
            f.l0 r7 = (f.l0) r7
            r7.a(r0)
        L21:
            int r7 = r6.f7707n
            if (r7 != 0) goto L26
            goto L2b
        L26:
            java.lang.String r7 = "Can only append a slot if not current inserting"
            i0.m.a(r7)
        L2b:
            int r7 = r6.f7702i
            int r0 = r6.f7703j
            int r5 = r6.c(r5)
            int[] r1 = r6.f7695b
            int r2 = r5 + 1
            int r2 = r6.r(r2)
            int r1 = r6.g(r1, r2)
            r6.f7702i = r1
            r6.f7703j = r1
            r6.x(r8, r5)
            if (r7 < r1) goto L4c
            int r7 = r7 + 1
            int r0 = r0 + 1
        L4c:
            java.lang.Object[] r5 = r6.f7696c
            r5[r1] = r4
            r6.f7702i = r7
            r6.f7703j = r0
            return
    }
}
