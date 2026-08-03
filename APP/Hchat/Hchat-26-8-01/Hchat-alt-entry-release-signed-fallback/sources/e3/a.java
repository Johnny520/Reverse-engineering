package e3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f2339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f2340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.util.List f2341c;

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof e3.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e3.a r5 = (e3.a) r5
            java.lang.String r1 = r4.f2339a
            java.lang.String r3 = r5.f2339a
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f2340b
            java.lang.String r3 = r5.f2340b
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            java.util.List r1 = r4.f2341c
            java.util.List r5 = r5.f2341c
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f2339a
            java.lang.String r1 = r3.f2340b
            java.util.List r2 = r3.f2341c
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }
}
