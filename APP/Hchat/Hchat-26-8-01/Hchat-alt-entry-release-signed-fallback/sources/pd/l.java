package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends pd.n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public od.d f10518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public pd.b f10520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f10521t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10522u;

    @Override // pd.n, ud.p
    public final ud.p O() {
            r4 = this;
            pd.l r0 = new pd.l
            java.util.List r1 = r4.f13715m
            int r1 = r1.size()
            od.d r2 = r4.f10526p
            int r3 = r4.f10525o
            r0.<init>(r2, r3, r1)
            r4.P(r0)
            od.d r1 = r4.f10518q
            r0.f10518q = r1
            int r1 = r4.f10519r
            r0.f10519r = r1
            pd.b r1 = r4.f10520s
            r0.f10520s = r1
            boolean r1 = r4.f10521t
            r0.f10521t = r1
            boolean r1 = r4.f10522u
            r0.f10522u = r1
            return r0
    }

    @Override // pd.n, ud.p
    public final boolean Y(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof pd.l
            if (r0 == 0) goto L38
            boolean r0 = super.Y(r3)
            if (r0 != 0) goto Le
            goto L38
        Le:
            pd.l r3 = (pd.l) r3
            int r0 = r2.f10519r
            int r1 = r3.f10519r
            if (r0 != r1) goto L38
            od.d r0 = r2.f10518q
            od.d r1 = r3.f10518q
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
            pd.b r0 = r2.f10520s
            pd.b r1 = r3.f10520s
            boolean r0 = r0.Y(r1)
            if (r0 == 0) goto L38
            boolean r0 = r2.f10521t
            boolean r1 = r3.f10521t
            if (r0 != r1) goto L38
            boolean r0 = r2.f10522u
            boolean r3 = r3.f10522u
            if (r0 != r3) goto L38
        L36:
            r3 = 1
            return r3
        L38:
            r3 = 0
            return r3
    }

    @Override // pd.n, pd.b
    public final int j0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // pd.n, pd.b
    public final qd.l k0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // pd.n, ud.p
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f13716n
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
            java.lang.String r1 = ": INVOKE_CUSTOM "
            r0.append(r1)
            qd.r r1 = r2.f13714l
            if (r1 == 0) goto L1f
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
        L1f:
            r2.J(r0)
            r2.K(r0)
            java.lang.String r1 = "\n handle type: "
            r0.append(r1)
            int r1 = r2.f10519r
            java.lang.String r1 = j8.b.v(r1)
            r0.append(r1)
            java.lang.String r1 = "\n lambda: "
            r0.append(r1)
            od.d r1 = r2.f10518q
            r0.append(r1)
            java.lang.String r1 = "\n call insn: "
            r0.append(r1)
            pd.b r1 = r2.f10520s
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
