package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends pd.n {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pd.n f10523q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f10524r;

    public m(pd.n r1, od.d r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.f10523q = r1
            return
    }

    public m(pd.n r7, od.d r8, gf.a r9, boolean r10) {
            r6 = this;
            r3 = 8
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f10523q = r7
            return
    }

    @Override // pd.n, ud.p
    public final ud.p O() {
            r5 = this;
            pd.m r0 = new pd.m
            java.util.List r1 = r5.f13715m
            int r1 = r1.size()
            pd.n r2 = r5.f10523q
            od.d r3 = r5.f10526p
            int r4 = r5.f10525o
            r0.<init>(r2, r3, r4, r1)
            r5.P(r0)
            java.util.ArrayList r1 = r5.f10524r
            r0.f10524r = r1
            return r0
    }

    @Override // pd.n, ud.p
    public final boolean Y(ud.p r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof pd.m
            r2 = 0
            if (r1 == 0) goto L1c
            boolean r1 = super.Y(r4)
            if (r1 == 0) goto L1c
            pd.m r4 = (pd.m) r4
            pd.n r4 = r4.f10523q
            pd.n r1 = r3.f10523q
            boolean r4 = r1.Y(r4)
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
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
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.f13716n
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
            java.lang.String r1 = ": INVOKE_CUSTOM "
            r0.append(r1)
            qd.r r1 = r4.f13714l
            if (r1 == 0) goto L1f
            r0.append(r1)
            java.lang.String r1 = " = "
            r0.append(r1)
        L1f:
            boolean r1 = r4.J(r0)
            r2 = 10
            if (r1 != 0) goto L2a
            r0.append(r2)
        L2a:
            r4.K(r0)
            java.lang.String r1 = " call-site: \n  "
            r0.append(r1)
            java.util.ArrayList r1 = r4.f10524r
            java.lang.String r3 = "\n  "
            java.lang.String r1 = xe.s.j(r1, r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
