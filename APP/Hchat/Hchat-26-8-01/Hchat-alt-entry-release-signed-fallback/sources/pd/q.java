package pd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends ud.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f10530o;

    public q(int r2) {
            r1 = this;
            pd.k r0 = pd.k.X
            r1.<init>(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f10530o = r0
            return
    }

    @Override // ud.p
    public final void I(qd.l r2) {
            r1 = this;
            af.g r2 = new af.g
            java.lang.String r0 = "Direct addArg is forbidden for PHI insn, bindArg must be used"
            r2.<init>(r0)
            throw r2
    }

    @Override // ud.p
    public final ud.p O() {
            r2 = this;
            pd.q r0 = new pd.q
            java.util.List r1 = r2.f13715m
            int r1 = r1.size()
            r0.<init>(r1)
            r2.P(r0)
            return r0
    }

    @Override // ud.p
    public final qd.l S(int r1) {
            r0 = this;
            qd.l r1 = super.S(r1)
            qd.r r1 = (qd.r) r1
            return r1
    }

    @Override // ud.p
    public final qd.l a0(int r3) {
            r2 = this;
            r3 = 0
            qd.l r0 = super.a0(r3)
            qd.r r0 = (qd.r) r0
            java.util.ArrayList r1 = r2.f10530o
            r1.remove(r3)
            qd.s r3 = r0.f10923m
            r3.p()
            return r0
    }

    @Override // ud.p
    public final boolean b0(qd.l r4, qd.l r5) {
            r3 = this;
            boolean r0 = r4 instanceof qd.r
            r1 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r5 instanceof qd.r
            if (r0 != 0) goto La
            goto L2a
        La:
            int r0 = r3.T(r4)
            r2 = -1
            if (r0 != r2) goto L12
            return r1
        L12:
            r1 = r5
            qd.r r1 = (qd.r) r1
            qd.s r1 = r1.f10923m
            r1.a(r3)
            super.c0(r0, r5)
            r5 = 0
            xe.l.i(r5, r4)
            qd.r r4 = (qd.r) r4
            qd.s r4 = r4.f10923m
            r4.p()
            r4 = 1
            return r4
        L2a:
            return r1
    }

    @Override // ud.p
    public final void c0(int r1, qd.l r2) {
            r0 = this;
            af.g r1 = new af.g
            java.lang.String r2 = "Direct setArg is forbidden for PHI insn, bindArg must be used"
            r1.<init>(r2)
            throw r1
    }

    public final void i0(qd.r r3, ud.a r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.f10530o
            boolean r1 = r0.contains(r4)
            if (r1 != 0) goto L1f
            if (r4 == 0) goto L11
            super.I(r3)
            r0.add(r4)
            return
        L11:
            java.lang.String r3 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Null bind block in PHI insn: "
            java.lang.String r3 = r4.concat(r3)
            ah.a.k(r3)
            return
        L1f:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Duplicate predecessors in PHI insn: "
            java.lang.String r1 = ", "
            java.lang.String r3 = bc.e.j(r0, r3, r1, r4)
            ah.a.k(r3)
            return
    }

    public final qd.r j0(int r1) {
            r0 = this;
            qd.l r1 = super.S(r1)
            qd.r r1 = (qd.r) r1
            return r1
    }

    public final qd.r k0(ud.a r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.f10530o
            int r2 = r1.size()
            if (r0 >= r2) goto L19
            java.lang.Object r1 = r1.get(r0)
            if (r1 != r4) goto L16
            qd.l r4 = super.S(r0)
            qd.r r4 = (qd.r) r4
            return r4
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    public final void l0(qd.r r3) {
            r2 = this;
            int r3 = r2.T(r3)
            r0 = -1
            if (r3 != r0) goto L8
            return
        L8:
            qd.l r0 = super.a0(r3)
            qd.r r0 = (qd.r) r0
            java.util.ArrayList r1 = r2.f10530o
            r1.remove(r3)
            qd.s r3 = r0.f10923m
            r3.p()
            return
    }

    @Override // ud.p
    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.k()
            java.util.ArrayList r1 = r4.f10530o
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = r4.M()
            java.lang.String r3 = " binds: "
            java.lang.String r0 = wb.en.i(r0, r3, r1, r2)
            return r0
    }
}
