package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends o7.c {
    @Override // o7.c, k7.a
    public final void B(q7.b r9) {
            r8 = this;
            r7.g r0 = r8.f9566n
            int r0 = r0.get()
            r8.c0(r0)
            if (r0 == 0) goto L42
            java.lang.Class<m7.t> r1 = m7.t.class
            k7.a r1 = r8.v(r1)
            m7.t r1 = (m7.t) r1
            b.e r1 = r1.f8764r
            int r1 = r1.get()
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r0) goto L42
            k7.a r4 = r8.Q(r3)
            m7.c r4 = (m7.c) r4
            int r5 = r1 + (-12)
            int r6 = r4.f14162n
            int r5 = r5 + r6
            r4.M(r5, r2)
            int r5 = r4.p()
            int r5 = r5 - r6
            byte[] r7 = r4.f11553k
            short r5 = (short) r5
            k7.a.F(r7, r6, r5)
            int r5 = r9.f10666k
            r4.G(r9)
            int r5 = r5 + r1
            r9.g(r5)
            int r3 = r3 + 1
            goto L1b
        L42:
            return
    }

    @Override // o7.b
    public final void W(k7.a r5) {
            r4 = this;
            m7.c r5 = (m7.c) r5
            java.lang.Class<m7.t> r0 = m7.t.class
            k7.a r0 = r4.v(r0)
            m7.t r0 = (m7.t) r0
            m7.e r1 = r0.f8766t
            m7.c r2 = r1.f8741p
            r3 = 0
            if (r2 != r5) goto L12
            goto L21
        L12:
            m7.e r1 = r0.f8767u
            m7.c r2 = r1.f8741p
            if (r2 != r5) goto L19
            goto L21
        L19:
            m7.e r1 = r0.f8768v
            m7.c r0 = r1.f8741p
            if (r0 != r5) goto L20
            goto L21
        L20:
            r1 = r3
        L21:
            if (r1 == 0) goto L29
            r1.f8741p = r3
            r0 = -1
            r1.Q(r0)
        L29:
            r5.W()
            m7.u r0 = r5.f8740s
            if (r0 != 0) goto L31
            goto L38
        L31:
            r5.f8740s = r3
            java.util.HashSet r0 = r0.f8772q
            r0.remove(r5)
        L38:
            r7.l r0 = r5.f8736o
            r5.e0(r0)
            r7.l r0 = r5.f8737p
            r5.e0(r0)
            r7.l r0 = r5.f8739r
            r5.e0(r0)
            r5.f8736o = r3
            r5.f8737p = r3
            r5.f8739r = r3
            byte[] r0 = r5.f11553k
            r1 = 4
            int r0 = k7.a.s(r0, r1)
            if (r0 >= 0) goto L58
        L56:
            r0 = r3
            goto L63
        L58:
            u7.a r1 = r5.b0()
            if (r1 != 0) goto L5f
            goto L56
        L5f:
            r7.s r0 = r1.V(r0)
        L63:
            r7.o r0 = (r7.o) r0
            if (r0 == 0) goto L69
            r7.n r3 = r0.f11574t
        L69:
            r5.d0(r3)
            return
    }

    @Override // o7.c, o7.b
    public final void c0(int r2) {
            r1 = this;
            z7.c r0 = r1.f9563k
            int r0 = r0.size()
            if (r2 == r0) goto L11
            r7.g r0 = r1.f9566n
            r0.k(r2)
            r0 = 0
            r1.d0(r2, r0)
        L11:
            return
    }

    public final void k0() {
            r2 = this;
            boolean r0 = super.e0()
            if (r0 == 0) goto L1d
            java.lang.Class<m7.t> r0 = m7.t.class
            k7.a r0 = r2.v(r0)
            m7.t r0 = (m7.t) r0
            m7.e r1 = r0.f8766t
            r1.c()
            m7.e r1 = r0.f8767u
            r1.c()
            m7.e r0 = r0.f8768v
            r0.c()
        L1d:
            return
    }
}
