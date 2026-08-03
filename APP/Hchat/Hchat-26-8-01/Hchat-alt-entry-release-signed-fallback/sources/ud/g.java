package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends nd.b0 implements ud.l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.e f13706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final od.c f13707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b5.k f13708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qd.j f13709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f13710o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public bc.m f13711p;

    public g(ud.e r2, od.c r3, int r4) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f13710o = r0
            r1.f13706k = r2
            r1.f13707l = r3
            qd.j r2 = r3.f9775i
            r1.f13709n = r2
            b5.k r2 = new b5.k
            r3 = 2
            r0 = 3
            r2.<init>(r4, r3, r0)
            r1.f13708m = r2
            return
    }

    @Override // nd.b0
    public final b5.k O() {
            r1 = this;
            b5.k r0 = r1.f13708m
            return r0
    }

    @Override // nd.b0
    public final ud.e P() {
            r1 = this;
            ud.e r0 = r1.f13706k
            return r0
    }

    @Override // nd.b0
    public final void Q(b5.k r1) {
            r0 = this;
            r0.f13708m = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<ud.g> r0 = ud.g.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            ud.g r3 = (ud.g) r3
            od.c r0 = r2.f13707l
            od.c r3 = r3.f13707l
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    @Override // ud.l
    public final od.c f() {
            r1 = this;
            od.c r0 = r1.f13707l
            return r0
    }

    public final int hashCode() {
            r1 = this;
            od.c r0 = r1.f13707l
            int r0 = r0.hashCode()
            return r0
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // ud.k
    public final java.lang.String m() {
            r1 = this;
            ud.e r0 = r1.f13706k
            java.lang.String r0 = r0.f13696s
            return r0
    }

    @Override // ud.k
    public final ud.u n() {
            r1 = this;
            ud.e r0 = r1.f13706k
            ud.u r0 = r0.f13688k
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            od.c r0 = r5.f13707l
            od.a r1 = r0.f9773g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = r0.f9774h
            qd.j r2 = r5.f13709n
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "."
            java.lang.String r4 = " :"
            java.lang.String r0 = bc.e.v(r1, r3, r0, r4, r2)
            return r0
    }

    @Override // ud.k
    public final java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "field"
            return r0
    }
}
