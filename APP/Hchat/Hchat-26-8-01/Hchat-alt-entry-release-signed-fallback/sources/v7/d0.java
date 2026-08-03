package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends v7.j0 {
    @Override // v7.j0, r7.b, k7.a
    public final void B(q7.b r4) {
            r3 = this;
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            r1 = 0
            if (r0 == 0) goto L11
            r2 = r1
            goto L13
        L11:
            r2 = 8
        L13:
            r3.M(r2, r1)
            if (r0 != 0) goto L1b
            super.B(r4)
        L1b:
            return
    }

    @Override // v7.j0
    public final int O() {
            r3 = this;
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            if (r0 == 0) goto L1a
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 4
            int r0 = k7.a.s(r0, r1)
            return r0
        L1a:
            int r0 = super.O()
            return r0
    }

    @Override // v7.j0
    public final l7.g P() {
            r2 = this;
            java.lang.Class<v7.d> r0 = v7.d.class
            k7.a r0 = r2.u(r0)
            v7.d r0 = (v7.d) r0
            if (r0 == 0) goto L13
            java.lang.Class<l7.f> r1 = l7.f.class
            k7.a r0 = r0.u(r1)
            l7.f r0 = (l7.f) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // v7.j0
    public final int Q() {
            r3 = this;
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            int r0 = super.Q()
            return r0
    }

    @Override // v7.j0
    public final byte R() {
            r3 = this;
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            if (r0 == 0) goto L17
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r0 = r0[r2]
            return r0
        L17:
            byte r0 = super.R()
            return r0
    }

    @Override // v7.j0
    public final void X(int r4) {
            r3 = this;
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 2
            r2 = 3
            boolean r0 = k7.a.q(r0, r1, r2)
            if (r0 == 0) goto L19
            v7.e r0 = r3.Y()
            byte[] r0 = r0.f11553k
            r1 = 4
            k7.a.D(r0, r1, r4)
            return
        L19:
            super.X(r4)
            return
    }

    public final v7.e Y() {
            r1 = this;
            java.lang.Class<v7.b0> r0 = v7.b0.class
            k7.a r0 = r1.u(r0)
            v7.b0 r0 = (v7.b0) r0
            if (r0 == 0) goto Lf
            v7.i0 r0 = r0.f14153k
            v7.e r0 = (v7.e) r0
            return r0
        Lf:
            java.lang.String r0 = "Unreachable"
            bsh.j.g(r0)
            r0 = 0
            return r0
    }
}
