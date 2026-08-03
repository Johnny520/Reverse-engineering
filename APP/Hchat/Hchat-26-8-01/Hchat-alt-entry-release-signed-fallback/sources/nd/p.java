package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f9385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Throwable f9386h;

    public p(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.f9385g = r1
            r0.f9386h = r2
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            nd.p r2 = (nd.p) r2
            java.lang.String r0 = r1.f9385g
            java.lang.String r2 = r2.f9385g
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<nd.p> r0 = nd.p.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            nd.p r3 = (nd.p) r3
            java.lang.String r0 = r2.f9385g
            java.lang.String r3 = r3.f9385g
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f9385g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JadxError: "
            r0.<init>(r1)
            java.lang.String r1 = r3.f9385g
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.Throwable r1 = r3.f9386h
            if (r1 == 0) goto L34
            java.lang.Class r2 = r1.getClass()
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            java.lang.String r1 = xe.s.g(r1)
            r0.append(r1)
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
