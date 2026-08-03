package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qd.j f9358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9359h;

    public d0(java.lang.String r1, qd.j r2) {
            r0 = this;
            r0.<init>()
            r0.f9358g = r2
            r0.f9359h = r1
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.L
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<nd.d0> r2 = nd.d0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            nd.d0 r5 = (nd.d0) r5
            qd.j r2 = r4.f9358g
            qd.j r3 = r5.f9358g
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            java.lang.String r2 = r4.f9359h
            java.lang.String r5 = r5.f9359h
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            qd.j r0 = r2.f9358g
            java.lang.String r1 = r2.f9359h
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            qd.j r0 = r5.f9358g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "' "
            java.lang.String r2 = ")"
            java.lang.String r3 = "D('"
            java.lang.String r4 = r5.f9359h
            java.lang.String r0 = bc.e.k(r3, r4, r1, r0, r2)
            return r0
    }
}
