package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3143b;

    public d(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3142a = r1
            r0.f3143b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof f2.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f2.d r5 = (f2.d) r5
            int r1 = r5.f3142a
            int r3 = r4.f3142a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.f3143b
            int r5 = r5.f3143b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f3142a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f3143b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CollectionInfo(rowCount="
            r0.<init>(r1)
            int r1 = r3.f3142a
            r0.append(r1)
            java.lang.String r1 = ", columnCount="
            r0.append(r1)
            int r1 = r3.f3143b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
