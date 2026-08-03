package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends pd.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f10534o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f10535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pd.r f10536q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10537r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.Object[] f10538s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ud.a[] f10539t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ud.a f10540u;

    public s(qd.l r3, int r4, boolean r5) {
            r2 = this;
            pd.k r0 = pd.k.f10514w
            r1 = 1
            r2.<init>(r0, r1)
            r2.I(r3)
            r2.f10534o = r4
            r2.f10535p = r5
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r4 = this;
            pd.s r0 = new pd.s
            r1 = 0
            qd.l r1 = r4.S(r1)
            int r2 = r4.f10534o
            boolean r3 = r4.f10535p
            r0.<init>(r1, r2, r3)
            pd.r r1 = r4.f10536q
            r0.f10536q = r1
            int r1 = r4.f10537r
            r0.f10537r = r1
            ud.a[] r1 = r4.f10539t
            r0.f10539t = r1
            ud.a r1 = r4.f10540u
            r0.f10540u = r1
            r4.P(r0)
            return r0
    }

    @Override // ud.p
    public final boolean Y(ud.p r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1c
        L3:
            boolean r0 = r3 instanceof pd.s
            if (r0 == 0) goto L1e
            boolean r0 = super.Y(r3)
            if (r0 != 0) goto Le
            goto L1e
        Le:
            pd.s r3 = (pd.s) r3
            int r0 = r2.f10534o
            int r1 = r3.f10534o
            if (r0 != r1) goto L1e
            boolean r0 = r2.f10535p
            boolean r3 = r3.f10535p
            if (r0 != r3) goto L1e
        L1c:
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @Override // pd.t
    public final void i0(ud.a r6) {
            r5 = this;
            pd.r r0 = r5.f10536q
            if (r0 == 0) goto L26
            java.util.List r6 = r6.f13676n
            int[] r0 = r0.f10533q
            int r1 = r0.length
            ud.a[] r2 = new ud.a[r1]
            r5.f10539t = r2
            r2 = 0
        Le:
            if (r2 >= r1) goto L1d
            ud.a[] r3 = r5.f10539t
            r4 = r0[r2]
            ud.a r4 = a.a.T(r4, r6)
            r3[r2] = r4
            int r2 = r2 + 1
            goto Le
        L1d:
            int r0 = r5.f10537r
            ud.a r6 = a.a.T(r0, r6)
            r5.f10540u = r6
            return
        L26:
            java.lang.String r6 = "Switch data not yet attached"
            ah.a.k(r6)
            return
    }

    @Override // pd.t
    public final void j0(ud.a r5, ud.a r6) {
            r4 = this;
            ud.a[] r0 = r4.f10539t
            if (r0 != 0) goto L5
            goto L1a
        L5:
            int r0 = r0.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L14
            ud.a[] r2 = r4.f10539t
            r3 = r2[r1]
            if (r3 != r5) goto L11
            r2[r1] = r6
        L11:
            int r1 = r1 + 1
            goto L7
        L14:
            ud.a r0 = r4.f10540u
            if (r0 != r5) goto L1a
            r4.f10540u = r6
        L1a:
            return
    }

    public final java.lang.Object k0(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.f10538s
            if (r0 == 0) goto L7
            r2 = r0[r2]
            return r2
        L7:
            pd.r r0 = r1.l0()
            int[] r0 = r0.f10532p
            r2 = r0[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    public final pd.r l0() {
            r1 = this;
            pd.r r0 = r1.f10536q
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Switch data not yet attached"
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final void m0(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.f10538s
            if (r0 != 0) goto L1d
            pd.r r0 = r5.l0()
            int[] r0 = r0.f10532p
            int r1 = r0.length
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
        Le:
            if (r3 >= r1) goto L1b
            r4 = r0[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto Le
        L1b:
            r5.f10538s = r2
        L1d:
            java.lang.Object[] r0 = r5.f10538s
            r0[r6] = r7
            return
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.k()
            r0.append(r1)
            pd.r r1 = r10.f10536q
            if (r1 != 0) goto L16
            java.lang.String r1 = "no payload"
            r0.append(r1)
            goto L75
        L16:
            int r2 = r1.f10531o
            int[] r3 = r1.f10532p
            ud.a[] r4 = r10.f10539t
            java.lang.String r5 = "\n default: goto "
            r6 = -1
            java.lang.String r7 = ": goto "
            java.lang.String r8 = "\n case "
            r9 = 0
            if (r4 == 0) goto L4a
        L26:
            if (r9 >= r2) goto L3d
            r0.append(r8)
            r1 = r3[r9]
            r0.append(r1)
            r0.append(r7)
            ud.a[] r1 = r10.f10539t
            r1 = r1[r9]
            r0.append(r1)
            int r9 = r9 + 1
            goto L26
        L3d:
            int r1 = r10.f10537r
            if (r1 == r6) goto L75
            r0.append(r5)
            ud.a r1 = r10.f10540u
            r0.append(r1)
            goto L75
        L4a:
            int[] r1 = r1.f10533q
        L4c:
            if (r9 >= r2) goto L65
            r0.append(r8)
            r4 = r3[r9]
            r0.append(r4)
            r0.append(r7)
            r4 = r1[r9]
            java.lang.String r4 = xe.m.d(r4)
            r0.append(r4)
            int r9 = r9 + 1
            goto L4c
        L65:
            int r1 = r10.f10537r
            if (r1 == r6) goto L75
            r0.append(r5)
            int r1 = r10.f10537r
            java.lang.String r1 = xe.m.d(r1)
            r0.append(r1)
        L75:
            r10.K(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
