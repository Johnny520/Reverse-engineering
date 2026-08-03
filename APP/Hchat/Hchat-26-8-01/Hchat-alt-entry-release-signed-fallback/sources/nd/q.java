package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9388b;

    public q(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9387a = r1
            r0.f9388b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class<nd.q> r2 = nd.q.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            return r1
        L11:
            nd.q r5 = (nd.q) r5
            int r2 = r4.f9388b
            int r3 = r5.f9388b
            if (r2 != r3) goto L20
            int r2 = r4.f9387a
            int r5 = r5.f9387a
            if (r2 != r5) goto L20
            return r0
        L20:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f9388b
            int r0 = r0 * 31
            int r1 = r2.f9387a
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f9387a
            java.lang.String r0 = xe.m.d(r0)
            int r1 = r4.f9388b
            java.lang.String r1 = xe.m.d(r1)
            java.lang.String r2 = "JUMP: "
            java.lang.String r3 = " -> "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            return r0
    }
}
