package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m7.b {
    public l() {
            r2 = this;
            r0 = 8
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    @Override // k7.c
    public final void M() {
            r2 = this;
            java.lang.Class<m7.k> r0 = m7.k.class
            k7.a r0 = r2.v(r0)
            m7.k r0 = (m7.k) r0
            if (r0 == 0) goto Ld
            m7.t r0 = r0.f8752n
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L11
            return
        L11:
            r7.f r1 = r0.f8735p
            int r1 = r1.f11560n
            r2.b0(r1)
            r7.f r0 = r0.f8734o
            int r0 = r0.f11560n
            r2.a0(r0)
            return
    }

    @Override // m7.b, l7.a
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "</"
            r0.<init>(r1)
            java.lang.String r1 = super.U()
            java.lang.String r2 = ">"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
