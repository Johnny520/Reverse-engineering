package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o7.c {
    @Override // o7.b
    public final void d0(int r1, boolean r2) {
            r0 = this;
            r2 = 1
            super.d0(r1, r2)
            return
    }

    public final void k0() {
            r5 = this;
            super.e0()
            z7.c r0 = r5.f9563k
            java.util.Iterator r0 = r0.b()
            r1 = 0
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            r7.n r2 = (r7.n) r2
            r7.o r3 = r2.N()
            if (r3 == 0) goto La
            int r3 = r3.f7388g
            int r4 = r2.f7388g
            if (r3 == r4) goto La
            r5.T(r3, r2)
            r1 = 1
            goto La
        L27:
            if (r1 == 0) goto L36
            java.lang.Class<m7.g> r0 = m7.g.class
            k7.a r0 = r5.v(r0)
            m7.g r0 = (m7.g) r0
            u7.a r0 = r0.f8744o
            r0.c0()
        L36:
            if (r1 == 0) goto L3c
            boolean r0 = super.e0()
        L3c:
            ce.n r0 = new ce.n
            r1 = 28
            r0.<init>(r1)
            r5.f0(r0)
            return
    }

    @Override // o7.b, k7.a
    public final int p() {
            r2 = this;
            z7.c r0 = r2.f9563k
            int r0 = r0.size()
            if (r0 == 0) goto L15
            r1 = 0
            k7.a r1 = r2.Q(r1)
            r7.n r1 = (r7.n) r1
            int r1 = r1.p()
            int r1 = r1 * r0
            return r1
        L15:
            return r0
    }
}
