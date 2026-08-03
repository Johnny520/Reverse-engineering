package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements z4.k, java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.m f11510g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r4.b f11511h;

    public u(v4.m r1, r4.b r2) {
            r0 = this;
            r0.<init>()
            r0.f11510g = r1
            r0.f11511h = r2
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.m r1 = r2.f11510g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r4.b r1 = r2.f11511h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.u r2 = (r4.u) r2
            v4.m r0 = r1.f11510g
            v4.m r2 = r2.f11510g
            int r2 = r0.d(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof r4.u
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r4.u r2 = (r4.u) r2
            v4.m r2 = r2.f11510g
            v4.m r0 = r1.f11510g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            v4.m r0 = r1.f11510g
            int r0 = r0.hashCode()
            return r0
    }
}
