package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends m7.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r7.a f8763q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b.e f8764r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.a f8765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m7.e f8766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m7.e f8767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m7.e f8768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m7.d f8769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m7.l f8770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m.a f8771y;

    public t(m7.l r12) {
            r11 = this;
            r0 = 0
            r1 = 9
            r2 = 7
            r11.<init>(r2, r0, r1)
            r11.f8770x = r12
            r7.a r12 = new r7.a
            r0 = 20
            r12.<init>(r0)
            r11.f8763q = r12
            r7.a r1 = new r7.a
            r1.<init>(r0)
            r7.a r0 = new r7.a
            r2 = 1
            r3 = 0
            r0.<init>(r2, r3)
            r11.f8765s = r0
            m7.e r2 = new m7.e
            r4 = 1
            r2.<init>(r4, r3)
            r11.f8766t = r2
            m7.e r4 = new m7.e
            r5 = 1
            r4.<init>(r5, r3)
            r11.f8767u = r4
            m7.e r5 = new m7.e
            r6 = 1
            r5.<init>(r6, r3)
            r11.f8768v = r5
            o7.g r3 = new o7.g
            r3.<init>()
            m.a r6 = new m.a
            r7 = 3
            r6.<init>(r11, r7)
            r11.f8771y = r6
            m7.s r6 = new m7.s
            r6.<init>(r11)
            b.e r7 = new b.e
            r8 = 26
            r7.<init>(r11, r8, r1)
            r11.f8764r = r7
            m7.d r8 = new m7.d
            m.a r9 = new m.a
            r10 = 2
            r9.<init>(r7, r10)
            r8.<init>(r9, r0)
            r11.f8769w = r8
            r11.P(r12)
            r11.P(r1)
            r11.P(r0)
            r11.P(r2)
            r11.P(r4)
            r11.P(r5)
            r11.P(r3)
            r11.P(r6)
            r11.P(r8)
            return
    }

    @Override // k7.c
    public final void M() {
            r1 = this;
            m7.d r0 = r1.f8769w
            r0.k0()
            return
    }

    @Override // m7.b, l7.a
    public final void S() {
            r2 = this;
            r7.a r0 = r2.f8765s
            int r0 = r0.f11551o
            if (r0 == 0) goto L17
            f6.b r0 = new f6.b
            m7.d r1 = r2.f8769w
            r0.<init>(r1)
            r2.z(r0)
            int r0 = r0.f3307c
            m.a r1 = r2.f8771y
            r1.k(r0)
        L17:
            m7.e r0 = r2.f8766t
            r0.c()
            m7.e r0 = r2.f8767u
            r0.c()
            m7.e r0 = r2.f8768v
            r0.c()
            return
    }

    @Override // m7.b
    public final void Y() {
            r1 = this;
            super.Y()
            m7.l r0 = r1.f8770x
            r0.Y()
            m7.u r0 = r1.d0()
            if (r0 == 0) goto L13
            java.util.HashSet r0 = r0.f8773r
            r0.add(r1)
        L13:
            m7.e r0 = r1.f8766t
            r0.P()
            m7.e r0 = r1.f8767u
            r0.P()
            m7.e r0 = r1.f8768v
            r0.P()
            return
    }

    @Override // m7.b
    public final void Z() {
            r3 = this;
            super.Z()
            m7.u r0 = r3.d0()
            if (r0 == 0) goto Le
            java.util.HashSet r0 = r0.f8773r
            r0.remove(r3)
        Le:
            m7.d r0 = r3.f8769w
            r0.N()
            r7.g r1 = r0.f9566n
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            r1.k(r0)
            m7.l r0 = r3.f8770x
            r0.Z()
            m7.e r0 = r3.f8766t
            r1 = 0
            r0.f8741p = r1
            r2 = -1
            r0.Q(r2)
            m7.e r0 = r3.f8767u
            r0.f8741p = r1
            r0.Q(r2)
            m7.e r0 = r3.f8768v
            r0.f8741p = r1
            r0.Q(r2)
            return
    }

    @Override // m7.b
    public final void a0(int r2) {
            r1 = this;
            super.a0(r2)
            m7.l r0 = r1.f8770x
            r0.a0(r2)
            return
    }

    @Override // m7.b
    public final void b0(int r2) {
            r1 = this;
            super.b0(r2)
            m7.l r0 = r1.f8770x
            r0.b0(r2)
            return
    }

    public final java.lang.String c0(boolean r4) {
            r3 = this;
            java.lang.String r0 = r3.U()
            if (r4 == 0) goto L22
            m7.u r4 = r3.d0()
            r1 = 0
            if (r4 == 0) goto L19
            r7.f r2 = r4.f8734o
            int r2 = r2.f11560n
            r7.o r4 = r4.V(r2)
            if (r4 == 0) goto L19
            java.lang.String r1 = r4.f11578m
        L19:
            if (r1 == 0) goto L22
            java.lang.String r4 = ":"
            java.lang.String r4 = wb.en.h(r1, r4, r0)
            return r4
        L22:
            return r0
    }

    public final m7.u d0() {
            r2 = this;
            r7.f r0 = r2.f8734o
            int r0 = r0.f11560n
            r1 = -1
            if (r0 == r1) goto L16
            java.lang.Class<m7.j> r1 = m7.j.class
            k7.a r1 = r2.v(r1)
            m7.j r1 = (m7.j) r1
            if (r1 == 0) goto L16
            m7.u r0 = r1.U(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // m7.b, l7.a
    public final java.lang.String toString() {
            r2 = this;
            r0 = 1
            java.lang.String r0 = r2.c0(r0)
            if (r0 != 0) goto Lc
            java.lang.String r0 = super.toString()
            return r0
        Lc:
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = bc.e.n(r0, r1)
            m7.d r1 = r2.f8769w
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
            java.lang.String r1 = y7.a.h(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
