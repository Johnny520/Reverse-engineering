package td;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public yd.b f13121o;

    public b() {
            r2 = this;
            pd.k r0 = pd.k.R
            r1 = 2
            r2.<init>(r0, r1)
            return
    }

    public b(yd.b r1, qd.r r2, qd.l r3, qd.l r4) {
            r0 = this;
            r0.<init>()
            r0.d0(r2)
            boolean r2 = r3.L()
            if (r2 == 0) goto L1f
            boolean r2 = r4.O()
            if (r2 == 0) goto L1f
            yd.b r1 = yd.b.K(r1)
            r0.f13121o = r1
            r0.I(r4)
            r0.I(r3)
            goto L27
        L1f:
            r0.f13121o = r1
            r0.I(r3)
            r0.I(r4)
        L27:
            ae.g r1 = new ae.g
            r2 = 19
            r1.<init>(r0, r2)
            super.h0(r1)
            yd.b r2 = r0.f13121o
            r2.P(r1)
            return
    }

    @Override // ud.p
    public final ud.p O() {
            r2 = this;
            td.b r0 = new td.b
            r0.<init>()
            yd.b r1 = r2.f13121o
            r0.f13121o = r1
            r2.P(r0)
            return r0
    }

    @Override // ud.p
    public final void U(java.util.Collection r2) {
            r1 = this;
            super.U(r2)
            yd.b r0 = r1.f13121o
            java.util.ArrayList r0 = r0.J()
            r2.addAll(r0)
            return
    }

    @Override // ud.p
    public final boolean Y(ud.p r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof td.b
            if (r0 == 0) goto L1a
            boolean r0 = super.Y(r2)
            if (r0 != 0) goto Lf
            goto L1a
        Lf:
            td.b r2 = (td.b) r2
            yd.b r0 = r1.f13121o
            yd.b r2 = r2.f13121o
            boolean r2 = r0.equals(r2)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // ud.p
    public final void Z() {
            r2 = this;
            super.Z()
            yd.b r0 = r2.f13121o
            java.util.ArrayList r0 = r0.J()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            qd.r r1 = (qd.r) r1
            ud.p r1 = r1.f10903j
            if (r1 == 0) goto Ld
            r1.Z()
            goto Ld
        L21:
            return
    }

    @Override // ud.p
    public final boolean b0(qd.l r2, qd.l r3) {
            r1 = this;
            boolean r0 = super.b0(r2, r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            yd.b r0 = r1.f13121o
            boolean r2 = r0.N(r2, r3)
            return r2
    }

    @Override // ud.p
    public final void h0(java.util.function.Consumer r2) {
            r1 = this;
            super.h0(r2)
            yd.b r0 = r1.f13121o
            r0.P(r2)
            return
    }

    public final void i0() {
            r4 = this;
            yd.b r0 = r4.f13121o
            yd.b r0 = yd.b.O(r0)
            r4.f13121o = r0
            int r1 = r0.f22419i
            r2 = 3
            if (r1 != r2) goto L23
            yd.b r0 = yd.b.K(r0)
            r4.f13121o = r0
            r0 = 0
            qd.l r1 = r4.S(r0)
            r2 = 1
            qd.l r3 = r4.S(r2)
            r4.c0(r0, r3)
            r4.c0(r2, r1)
        L23:
            return
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.f13716n
            java.lang.String r0 = xe.m.d(r0)
            qd.r r1 = r6.f13714l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            yd.b r2 = r6.f13121o
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3 = 0
            qd.l r3 = r6.S(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 1
            qd.l r4 = r6.S(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ": TERNARY "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " = ("
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ") ? "
            java.lang.String r1 = " : "
            java.lang.String r0 = j8.b.k(r5, r0, r3, r1, r4)
            return r0
    }
}
