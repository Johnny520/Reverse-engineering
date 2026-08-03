package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements qe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.j f10948b;

    public g(int r1, int r2, qd.j r3) {
            r0 = this;
            r0.<init>()
            r0.f10947a = r1
            r0.f10948b = r3
            return
    }

    @Override // qe.d
    public final int b() {
            r1 = this;
            int r0 = r1.f10947a
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            if (r3 == 0) goto L22
            java.lang.Class<qe.g> r0 = qe.g.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L22
        Le:
            qe.g r3 = (qe.g) r3
            int r0 = r2.f10947a
            int r1 = r3.f10947a
            if (r0 != r1) goto L22
            qd.j r0 = r2.f10948b
            qd.j r3 = r3.f10948b
            boolean r3 = java.util.Objects.equals(r0, r3)
            if (r3 == 0) goto L22
        L20:
            r3 = 1
            return r3
        L22:
            r3 = 0
            return r3
    }

    @Override // qe.d
    public final qd.j getType() {
            r1 = this;
            qd.j r0 = r1.f10948b
            return r0
    }

    public final int hashCode() {
            r2 = this;
            qd.j r0 = r2.f10948b
            int r1 = r2.f10947a
            java.lang.Integer r1 = t3.c.a(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            r0 = 1
            int r1 = r5.f10947a
            if (r1 == r0) goto Le
            r0 = 2
            if (r1 == r0) goto Lb
            java.lang.String r0 = "null"
            goto L10
        Lb:
            java.lang.String r0 = "USE"
            goto L10
        Le:
            java.lang.String r0 = "ASSIGN"
        L10:
            qd.j r1 = r5.f10948b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ": "
            java.lang.String r3 = "}"
            java.lang.String r4 = "{"
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
