package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends m7.q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m7.r f8750l;

    @Override // m7.q
    public final m7.q L() {
            r1 = this;
            m7.q r0 = super.L()
            m7.i r0 = (m7.i) r0
            return r0
    }

    @Override // m7.q
    public void M() {
            r2 = this;
            d7.b r0 = r2.R()
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            m7.q r1 = (m7.q) r1
            r1.M()
            goto La
        L1a:
            return
    }

    @Override // m7.q
    public void N() {
            r1 = this;
            d7.b r0 = r1.R()
            r0.N()
            return
    }

    public final m7.j O(java.lang.String r4) {
            r3 = this;
            bc.i r0 = new bc.i
            r1 = 1
            r0.<init>(r4, r1)
            z7.f r4 = new z7.f
            d7.b r1 = r3.R()
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
            java.lang.Class<m7.j> r2 = m7.j.class
            r4.<init>(r1, r2, r0)
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L1f
            r4 = 0
            goto L23
        L1f:
            java.lang.Object r4 = r4.next()
        L23:
            m7.j r4 = (m7.j) r4
            return r4
    }

    public final java.util.Iterator P(java.lang.String... r2) {
            r1 = this;
            int r0 = r2.length
            if (r0 != 0) goto L6
            z7.h r2 = z7.h.f22606g
            return r2
        L6:
            r0 = 0
            java.util.Iterator r2 = r1.Q(r2, r0)
            return r2
    }

    public final java.util.Iterator Q(java.lang.String[] r6, int r7) {
            r5 = this;
            int r0 = r6.length
            int r0 = r0 + (-1)
            if (r7 <= r0) goto L8
            z7.h r6 = z7.h.f22606g
            return r6
        L8:
            r1 = r6[r7]
            bc.i r2 = new bc.i
            r3 = 1
            r2.<init>(r1, r3)
            z7.f r1 = new z7.f
            d7.b r3 = r5.R()
            z7.c r3 = r3.f9563k
            java.util.Iterator r3 = r3.iterator()
            java.lang.Class<m7.j> r4 = m7.j.class
            r1.<init>(r3, r4, r2)
            if (r7 == r0) goto L32
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto L2a
            goto L32
        L2a:
            int r7 = r7 + 1
            m7.h r0 = new m7.h
            r0.<init>(r1, r6, r7)
            return r0
        L32:
            return r1
    }

    public abstract d7.b R();

    public final m7.i S() {
            r1 = this;
            m7.q r0 = super.L()
            m7.i r0 = (m7.i) r0
            return r0
    }

    public final m7.x T(int r5) {
            r4 = this;
            r0 = 9
            r1 = 6
            r2 = 8
            if (r5 == r2) goto L18
            if (r5 == r1) goto L18
            if (r5 != r0) goto Lc
            goto L18
        Lc:
            m7.x r5 = new m7.x
            l7.j r0 = new l7.j
            r1 = 1
            r0.<init>(r1)
            r5.<init>(r0, r1)
            goto L36
        L18:
            m7.y r3 = new m7.y
            if (r5 != r2) goto L22
            m7.l r5 = new m7.l
            r5.<init>()
            goto L31
        L22:
            if (r5 != r1) goto L2a
            m7.m r5 = new m7.m
            r5.<init>()
            goto L31
        L2a:
            if (r5 != r0) goto L3e
            m7.w r5 = new m7.w
            r5.<init>()
        L31:
            r0 = 1
            r3.<init>(r5, r0)
            r5 = r3
        L36:
            d7.b r0 = r4.R()
            r0.M(r5)
            return r5
        L3e:
            java.lang.String r5 = j8.b.u(r5)
            java.lang.String r0 = "Invalid chunk type: "
            java.lang.String r5 = r0.concat(r5)
            bsh.j.g(r5)
            r5 = 0
            return r5
    }

    @Override // m7.q
    public java.lang.String toString() {
            r1 = this;
            r1.S()
            m7.r r0 = r1.f8750l
            if (r0 != 0) goto Le
            m7.r r0 = new m7.r
            r0.<init>(r1)
            r1.f8750l = r0
        Le:
            k7.c r0 = r1.f8760k
            java.lang.String r0 = r0.toString()
            return r0
    }
}
