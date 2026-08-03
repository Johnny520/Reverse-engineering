package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends v4.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t4.a f14065g;

    public b(t4.a r1) {
            r0 = this;
            r0.<init>()
            r1.k()
            r0.f14065g = r1
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r1 = this;
            t4.a r0 = r1.f14065g
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // v4.a
    public final int e(v4.a r2) {
            r1 = this;
            v4.b r2 = (v4.b) r2
            t4.a r2 = r2.f14065g
            t4.a r0 = r1.f14065g
            int r2 = r0.m(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof v4.b
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            v4.b r2 = (v4.b) r2
            t4.a r2 = r2.f14065g
            t4.a r0 = r1.f14065g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            t4.a r0 = r1.f14065g
            int r0 = r0.hashCode()
            return r0
    }

    @Override // v4.a
    public final boolean i() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "annotation"
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            t4.a r0 = r1.f14065g
            java.lang.String r0 = r0.a()
            return r0
    }
}
