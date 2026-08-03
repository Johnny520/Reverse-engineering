package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends pd.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final qd.h f10490s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final qd.h f10491t = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10492p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ud.a f10493q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ud.a f10494r;

    static {
            qd.q r0 = qd.q.f10911n
            qd.q r1 = qd.q.f10907j
            qd.q r2 = qd.q.f10915r
            qd.q r3 = qd.q.f10916s
            qd.q r4 = qd.q.f10909l
            qd.q r5 = qd.q.f10910m
            qd.q r6 = qd.q.f10908k
            qd.q[] r1 = new qd.q[]{r0, r1, r2, r3, r4, r5, r6}
            qd.h r2 = new qd.h
            r2.<init>(r1)
            pd.i.f10490s = r2
            qd.q[] r0 = new qd.q[]{r0, r4, r5, r6}
            qd.h r1 = new qd.h
            r1.<init>(r0)
            pd.i.f10491t = r1
            return
    }

    public i(int r3, int r4) {
            r2 = this;
            pd.k r0 = pd.k.f10513v
            r1 = 2
            r2.<init>(r0, r4, r1)
            r2.f10492p = r3
            return
    }

    public i(int r2, qd.l r3, qd.n r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            r1.I(r3)
            r1.I(r4)
            return
    }

    public i(gf.a r4, int r5) {
            r3 = this;
            int r0 = r4.f4502l
            pd.k r1 = pd.k.f10513v
            r2 = 2
            r3.<init>(r1, r0, r2)
            r3.f10492p = r5
            r0 = 1
            if (r5 == r0) goto L13
            if (r5 != r2) goto L10
            goto L13
        L10:
            qd.h r5 = pd.i.f10491t
            goto L15
        L13:
            qd.h r5 = pd.i.f10490s
        L15:
            mh.b r1 = qd.l.f10901k
            int[] r1 = r4.f4499i
            r2 = 0
            r1 = r1[r2]
            qd.r r2 = new qd.r
            r2.<init>(r1, r5)
            r3.I(r2)
            int r1 = r4.f4500j
            if (r1 != r0) goto L32
            r0 = 0
            qd.n r4 = qd.l.S(r0, r5)
            r3.I(r4)
            return
        L32:
            int[] r4 = r4.f4499i
            r4 = r4[r0]
            qd.r r0 = new qd.r
            r0.<init>(r4, r5)
            r3.I(r0)
            return
    }

    @Override // pd.h, ud.p
    public final ud.p O() {
            r3 = this;
            pd.i r0 = new pd.i
            int r1 = r3.f10492p
            int r2 = r3.f10489o
            r0.<init>(r1, r2)
            ud.a r1 = r3.f10493q
            r0.f10493q = r1
            ud.a r1 = r3.f10494r
            r0.f10494r = r1
            r3.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof pd.i
            if (r0 == 0) goto L18
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Le
            goto L18
        Le:
            pd.i r2 = (pd.i) r2
            int r0 = r1.f10492p
            int r2 = r2.f10492p
            if (r0 != r2) goto L18
        L16:
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    @Override // pd.t
    public final void i0(ud.a r4) {
            r3 = this;
            java.util.List r4 = r4.f13676n
            int r0 = r3.f10489o
            ud.a r0 = a.a.T(r0, r4)
            r3.f10493q = r0
            int r0 = r4.size()
            ud.a r1 = r3.f10493q
            r2 = 1
            if (r0 != r2) goto L16
            r3.f10494r = r1
            return
        L16:
            ud.a r4 = a.a.N0(r4, r1)
            r3.f10494r = r4
            return
    }

    @Override // pd.t
    public final void j0(ud.a r2, ud.a r3) {
            r1 = this;
            ud.a r0 = r1.f10493q
            if (r0 != r2) goto L6
            r1.f10493q = r3
        L6:
            ud.a r0 = r1.f10494r
            if (r0 != r2) goto Lc
            r1.f10494r = r3
        Lc:
            return
    }

    @Override // pd.h
    public final int k0() {
            r1 = this;
            ud.a r0 = r1.f10493q
            if (r0 != 0) goto L7
            int r0 = r1.f10489o
            return r0
        L7:
            int r0 = r0.f13673k
            return r0
    }

    public final void l0() {
            r2 = this;
            int r0 = r2.f10492p
            int r0 = p.a.a(r0)
            r2.f10492p = r0
            ud.a r0 = r2.f10493q
            ud.a r1 = r2.f10494r
            r2.f10493q = r1
            r2.f10494r = r0
            return
    }

    public final void m0() {
            r7 = this;
            int r0 = r7.f10492p
            r1 = 2
            if (r0 != r1) goto L26
            r0 = 1
            qd.l r1 = r7.S(r0)
            boolean r1 = r1.L()
            if (r1 == 0) goto L26
            r1 = 0
            qd.l r2 = r7.S(r1)
            qd.n r3 = new qd.n
            r4 = 1
            qd.g r6 = qd.j.f10869c
            r3.<init>(r4, r6)
            r7.f10492p = r0
            r7.c0(r1, r2)
            r7.c0(r0, r3)
        L26:
            return
    }

    @Override // pd.h, ud.p
    public final java.lang.String toString() {
            r8 = this;
            int r0 = r8.f13716n
            java.lang.String r0 = xe.m.d(r0)
            pd.k r1 = r8.f13713k
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "  "
            java.lang.String r1 = r1.concat(r2)
            r2 = 0
            qd.l r2 = r8.S(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r8.f10492p
            java.lang.String r3 = p.a.f(r3)
            r4 = 1
            qd.l r4 = r8.S(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            ud.a r5 = r8.f10493q
            if (r5 == 0) goto L2f
            goto L35
        L2f:
            int r5 = r8.f10489o
            java.lang.String r5 = xe.m.d(r5)
        L35:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = r8.M()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ": "
            r7.append(r0)
            r7.append(r1)
            r7.append(r2)
            java.lang.String r0 = " "
            r7.append(r0)
            java.lang.String r1 = "  -> "
            j8.b.t(r7, r3, r0, r4, r1)
            java.lang.String r0 = eh.a.r(r7, r5, r6)
            return r0
    }
}
