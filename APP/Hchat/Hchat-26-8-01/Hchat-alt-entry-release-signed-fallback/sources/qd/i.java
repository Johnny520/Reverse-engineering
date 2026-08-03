package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends qd.e {
    public final qd.j L;
    public final int M;

    public i(int r2, qd.j r3) {
            r1 = this;
            qd.e r0 = qd.j.f10877k
            java.lang.String r0 = r0.K
            r1.<init>(r0)
            java.util.Objects.requireNonNull(r3)
            r1.L = r3
            if (r2 == 0) goto L11
            r1.M = r2
            return
        L11:
            r2 = 0
            throw r2
    }

    @Override // qd.j
    public final int q() {
            r1 = this;
            int r0 = r1.M
            return r0
    }

    @Override // qd.j
    public final qd.j r() {
            r1 = this;
            qd.j r0 = r1.L
            return r0
    }

    @Override // qd.e, qd.j
    public final boolean s(java.lang.Object r3) {
            r2 = this;
            boolean r0 = super.s(r3)
            if (r0 == 0) goto L1a
            qd.i r3 = (qd.i) r3
            int r0 = r3.M
            int r1 = r2.M
            if (r1 != r0) goto L1a
            qd.j r0 = r2.L
            qd.j r3 = r3.L
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // qd.j
    public final boolean t() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qd.e, qd.j
    public final java.lang.String toString() {
            r2 = this;
            r0 = 2
            int r1 = r2.M
            if (r1 != r0) goto La
            java.lang.String r0 = p.a.d(r1)
            return r0
        La:
            java.lang.String r0 = p.a.d(r1)
            qd.j r1 = r2.L
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.concat(r1)
            return r0
    }
}
