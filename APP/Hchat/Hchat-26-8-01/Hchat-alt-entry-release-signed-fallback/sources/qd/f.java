package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends qd.e {
    public final qd.e L;
    public final qd.e M;

    public f(qd.e r4, qd.e r5) {
            r3 = this;
            java.lang.String r0 = r4.K
            java.lang.String r1 = r5.K
            java.lang.String r2 = "$"
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            r3.<init>(r0)
            r3.L = r4
            r3.M = r5
            int r0 = r0.hashCode()
            int r4 = r4.f10893a
            int r5 = r5.f10893a
            int r5 = r5 * 31
            int r5 = r5 + r4
            int r5 = r5 * 31
            int r5 = r5 + r0
            r3.f10893a = r5
            return
    }

    @Override // qd.j
    public final java.util.List j() {
            r1 = this;
            qd.e r0 = r1.M
            java.util.List r0 = r0.j()
            return r0
    }

    @Override // qd.j
    public final qd.j k() {
            r1 = this;
            qd.e r0 = r1.M
            return r0
    }

    @Override // qd.j
    public final qd.j m() {
            r1 = this;
            qd.e r0 = r1.L
            return r0
    }

    @Override // qd.e, qd.j
    public final boolean s(java.lang.Object r3) {
            r2 = this;
            boolean r0 = super.s(r3)
            if (r0 == 0) goto L1e
            qd.f r3 = (qd.f) r3
            qd.e r0 = r3.L
            qd.e r1 = r2.L
            boolean r0 = java.util.Objects.equals(r1, r0)
            if (r0 == 0) goto L1e
            qd.e r0 = r2.M
            qd.e r3 = r3.M
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
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
            r3 = this;
            qd.e r0 = r3.L
            java.lang.String r0 = r0.toString()
            qd.e r1 = r3.M
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "$"
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            return r0
    }
}
