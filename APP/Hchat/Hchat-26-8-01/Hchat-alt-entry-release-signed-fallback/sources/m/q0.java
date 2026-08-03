package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends x1.x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i2.z f8333d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.n f8334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.q f8335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg.q f8336c;

    static {
            i2.z r0 = new i2.z
            r1 = 23
            r0.<init>(r1)
            m.q0.f8333d = r0
            return
    }

    public q0(m.n r1, fg.q r2, fg.q r3) {
            r0 = this;
            r0.<init>()
            r0.f8334a = r1
            r0.f8335b = r2
            r0.f8336c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            if (r4 != 0) goto L7
            goto L32
        L7:
            java.lang.Class<m.q0> r1 = m.q0.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L10
            goto L32
        L10:
            m.q0 r4 = (m.q0) r4
            m.n r1 = r3.f8334a
            m.n r2 = r4.f8334a
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L1d
            goto L32
        L1d:
            fg.q r1 = r3.f8335b
            fg.q r2 = r4.f8335b
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L28
            goto L32
        L28:
            fg.q r1 = r3.f8336c
            fg.q r4 = r4.f8336c
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L34
        L32:
            r4 = 0
            return r4
        L34:
            return r0
    }

    @Override // x1.x0
    public final y0.n f() {
            r5 = this;
            m.t0 r0 = new m.t0
            i2.z r1 = m.q0.f8333d
            r2 = 1
            r3 = 0
            m.p1 r4 = m.p1.f8325h
            r0.<init>(r1, r2, r3, r4)
            m.n r1 = r5.f8334a
            r0.P = r1
            r0.Q = r4
            fg.q r1 = r5.f8335b
            r0.R = r1
            fg.q r1 = r5.f8336c
            r0.S = r1
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r7) {
            r6 = this;
            r0 = r7
            m.t0 r0 = (m.t0) r0
            m.n r7 = r0.P
            m.n r1 = r6.f8334a
            boolean r7 = gg.l.a(r7, r1)
            r2 = 1
            if (r7 != 0) goto L12
            r0.P = r1
            r7 = r2
            goto L13
        L12:
            r7 = 0
        L13:
            m.p1 r1 = r0.Q
            m.p1 r4 = m.p1.f8325h
            if (r1 == r4) goto L1d
            r0.Q = r4
            r5 = r2
            goto L1e
        L1d:
            r5 = r7
        L1e:
            fg.q r7 = r6.f8335b
            r0.R = r7
            fg.q r7 = r6.f8336c
            r0.S = r7
            i2.z r1 = m.q0.f8333d
            r2 = 1
            r3 = 0
            r0.E1(r1, r2, r3, r4, r5)
            return
    }

    public final int hashCode() {
            r4 = this;
            m.n r0 = r4.f8334a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            m.p1 r2 = m.p1.f8325h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 1
            r3 = 961(0x3c1, float:1.347E-42)
            int r0 = eh.a.h(r2, r3, r0)
            r2 = 0
            int r0 = eh.a.h(r0, r1, r2)
            fg.q r3 = r4.f8335b
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            int r3 = r3 * r1
            fg.q r0 = r4.f8336c
            int r0 = r0.hashCode()
            int r0 = r0 + r3
            int r0 = r0 * r1
            int r1 = java.lang.Boolean.hashCode(r2)
            int r1 = r1 + r0
            return r1
    }
}
