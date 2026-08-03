package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends m0.j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m0.e0 f8458c = null;

    static {
            m0.e0 r0 = new m0.e0
            r1 = 0
            r2 = 2
            r3 = 1
            r0.<init>(r3, r1, r2)
            m0.e0.f8458c = r0
            return
    }

    @Override // m0.j0
    public final void a(h0.s r3, i0.a r4, l0.k r5, b5.i r6, m0.k0 r7) {
            r2 = this;
            r4 = 0
            int r3 = r3.c(r4)
            int r4 = r5.f7715v
            int[] r7 = r5.f7695b
            int r0 = r5.r(r4)
            int r7 = r5.N(r7, r0)
            int[] r0 = r5.f7695b
            int r4 = r4 + 1
            int r4 = r5.r(r4)
            int r4 = r5.g(r0, r4)
            int r0 = r4 - r3
            int r7 = java.lang.Math.max(r7, r0)
        L23:
            if (r7 >= r4) goto L43
            java.lang.Object[] r0 = r5.f7696c
            int r1 = r5.h(r7)
            r0 = r0[r1]
            boolean r1 = r0 instanceof i0.k0
            if (r1 == 0) goto L37
            i0.k0 r0 = (i0.k0) r0
            r6.g(r0)
            goto L40
        L37:
            boolean r1 = r0 instanceof i0.r1
            if (r1 == 0) goto L40
            i0.r1 r0 = (i0.r1) r0
            r0.c()
        L40:
            int r7 = r7 + 1
            goto L23
        L43:
            java.lang.String r4 = "Check failed"
            if (r3 <= 0) goto L48
            goto L4b
        L48:
            i0.m.a(r4)
        L4b:
            int r6 = r5.f7715v
            int[] r7 = r5.f7695b
            int r0 = r5.r(r6)
            int r7 = r5.N(r7, r0)
            int[] r0 = r5.f7695b
            int r1 = r6 + 1
            int r1 = r5.r(r1)
            int r0 = r5.g(r0, r1)
            int r0 = r0 - r3
            if (r0 < r7) goto L67
            goto L6a
        L67:
            i0.m.a(r4)
        L6a:
            r5.J(r0, r3, r6)
            int r4 = r5.f7702i
            if (r4 < r7) goto L74
            int r4 = r4 - r3
            r5.f7702i = r4
        L74:
            return
    }
}
