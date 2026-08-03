package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends qd.e {
    public final java.util.List L;

    public b(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.Objects.requireNonNull(r2)
            java.util.List r2 = (java.util.List) r2
            r0.L = r2
            int r1 = r1.hashCode()
            int r2 = r2.hashCode()
            int r2 = r2 * 31
            int r2 = r2 + r1
            r0.f10893a = r2
            return
    }

    @Override // qd.j
    public final java.util.List j() {
            r1 = this;
            java.util.List r0 = r1.L
            return r0
    }

    @Override // qd.e, qd.j
    public final boolean s(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.s(r2)
            if (r0 == 0) goto L14
            qd.b r2 = (qd.b) r2
            java.util.List r2 = r2.L
            java.util.List r0 = r1.L
            boolean r2 = java.util.Objects.equals(r0, r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // qd.e, qd.j
    public final java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.L
            java.lang.String r1 = ", "
            java.lang.String r0 = xe.s.j(r0, r1)
            java.lang.String r1 = "<"
            java.lang.String r2 = ">"
            java.lang.String r3 = r4.K
            java.lang.String r0 = wb.en.i(r3, r1, r0, r2)
            return r0
    }
}
