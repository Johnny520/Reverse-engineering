package xd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xd.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.p f21545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f21546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xd.b f21547m;

    public e(xd.b r1, ud.p r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f21546l = r1
            r0.f21545k = r2
            xd.b r1 = new xd.b
            r1.<init>(r0)
            r0.f21547m = r1
            return
    }

    @Override // ud.j
    public final void b(fd.i r4, fc.f r5) {
            r3 = this;
            java.lang.String r0 = "synchronized ("
            r5.r(r0)
            r0 = 0
            ud.p r1 = r3.f21545k
            qd.l r0 = r1.S(r0)
            r2 = 1
            r4.b(r5, r0, r2)
            java.lang.String r0 = ") {"
            r5.e(r0)
            ic.a.a(r5, r1)
            ud.r r0 = r4.f3908b
            jd.c.a(r5, r0, r1)
            xd.b r0 = r3.f21547m
            r4.v(r5, r0)
            r5.q()
            return
    }

    @Override // ud.j
    public final java.lang.String k() {
            r1 = this;
            ud.p r0 = r1.f21545k
            int r0 = r0.f13716n
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            xd.b r0 = r2.f21547m
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Synchronized:"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r1 = this;
            xd.b r0 = r1.f21547m
            java.util.ArrayList r0 = r0.f21539k
            return r0
    }
}
