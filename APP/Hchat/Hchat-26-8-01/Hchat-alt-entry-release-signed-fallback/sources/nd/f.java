package nd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.a f9362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ud.a f9363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ud.p f9364i;

    public f(ud.a r1, ud.a r2, ud.p r3) {
            r0 = this;
            r0.<init>()
            r0.f9362g = r1
            r0.f9363h = r2
            r0.f9364i = r3
            return
    }

    @Override // oc.b
    public final /* bridge */ /* synthetic */ oc.a a() {
            r1 = this;
            md.b r0 = md.b.A
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2e
        L3:
            if (r3 == 0) goto L30
            java.lang.Class<nd.f> r0 = nd.f.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L30
        Le:
            nd.f r3 = (nd.f) r3
            ud.a r0 = r2.f9362g
            ud.a r1 = r3.f9362g
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            ud.a r0 = r2.f9363h
            ud.a r1 = r3.f9363h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            ud.p r0 = r2.f9364i
            ud.p r3 = r3.f9364i
            boolean r3 = r0.X(r3)
            if (r3 == 0) goto L30
        L2e:
            r3 = 1
            return r3
        L30:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            ud.a r0 = r3.f9363h
            ud.p r1 = r3.f9364i
            ud.a r2 = r3.f9362g
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r1}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            ud.a r0 = r6.f9362g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.a r1 = r6.f9363h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ud.p r2 = r6.f9364i
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "->"
            java.lang.String r4 = " "
            java.lang.String r5 = "EDGE_INSN: "
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
