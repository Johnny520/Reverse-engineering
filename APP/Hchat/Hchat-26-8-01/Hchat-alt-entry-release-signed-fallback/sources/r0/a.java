package r0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11304a;

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof r0.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r0.a r4 = (r0.a) r4
            int r1 = r3.f11304a
            int r4 = r4.f11304a
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f11304a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeltaCounter(count="
            r0.<init>(r1)
            int r1 = r3.f11304a
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
