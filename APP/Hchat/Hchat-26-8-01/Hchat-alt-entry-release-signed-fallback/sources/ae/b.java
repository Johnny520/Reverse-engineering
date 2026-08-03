package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f228g;

    public b(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f228g = r1
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.F
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof ae.b
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            ae.b r2 = (ae.b) r2
            java.util.List r0 = r1.f228g
            java.util.List r2 = r2.f228g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.f228g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.util.List r0 = r2.f228g
            java.lang.String r1 = ", "
            java.lang.String r0 = xe.s.j(r0, r1)
            java.lang.String r1 = "Catch: "
            java.lang.String r0 = r1.concat(r0)
            return r0
    }
}
