package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class v1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.i2 f8402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m.p1 f8403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8405d;

    public v1(m.i2 r1, m.p1 r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f8402a = r1
            r0.f8403b = r2
            r0.f8404c = r3
            r0.f8405d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2b
        L3:
            boolean r0 = r3 instanceof m.v1
            if (r0 != 0) goto L8
            goto L29
        L8:
            m.v1 r3 = (m.v1) r3
            m.i2 r0 = r3.f8402a
            m.i2 r1 = r2.f8402a
            boolean r0 = gg.l.a(r1, r0)
            if (r0 != 0) goto L15
            goto L29
        L15:
            m.p1 r0 = r2.f8403b
            m.p1 r1 = r3.f8403b
            if (r0 == r1) goto L1c
            goto L29
        L1c:
            boolean r0 = r2.f8404c
            boolean r1 = r3.f8404c
            if (r0 == r1) goto L23
            goto L29
        L23:
            boolean r0 = r2.f8405d
            boolean r3 = r3.f8405d
            if (r0 == r3) goto L2b
        L29:
            r3 = 0
            return r3
        L2b:
            r3 = 1
            return r3
    }

    @Override // x1.x0
    public final y0.n f() {
            r8 = this;
            m.h2 r0 = new m.h2
            boolean r7 = r8.f8405d
            r5 = 0
            r1 = 0
            r2 = 0
            m.p1 r3 = r8.f8403b
            m.i2 r4 = r8.f8402a
            boolean r6 = r8.f8404c
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            r0 = r9
            m.h2 r0 = (m.h2) r0
            r2 = 0
            r5 = 0
            r1 = 0
            m.p1 r3 = r8.f8403b
            m.i2 r4 = r8.f8402a
            boolean r6 = r8.f8404c
            boolean r7 = r8.f8405d
            r0.F1(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public final int hashCode() {
            r3 = this;
            m.i2 r0 = r3.f8402a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            m.p1 r2 = r3.f8403b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 961
            boolean r0 = r3.f8404c
            int r0 = eh.a.h(r2, r1, r0)
            boolean r1 = r3.f8405d
            r2 = 29791(0x745f, float:4.1746E-41)
            int r0 = eh.a.h(r0, r2, r1)
            return r0
    }
}
