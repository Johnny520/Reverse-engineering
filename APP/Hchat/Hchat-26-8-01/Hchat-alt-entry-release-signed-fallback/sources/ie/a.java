package ie;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ud.m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od.d f6662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qd.j f6663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f6664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.List f6665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f6666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6668m;

    public a(ud.m r2) {
            r1 = this;
            r1.<init>()
            od.d r0 = r2.q()
            r1.f6662g = r0
            qd.j r0 = r2.e()
            r1.f6663h = r0
            java.util.List r0 = r2.c()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f6664i = r0
            java.util.List r0 = r2.getTypeParameters()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f6665j = r0
            java.util.List r0 = r2.s()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f6666k = r0
            boolean r0 = r2.v()
            r1.f6667l = r0
            int r2 = r2.o()
            r1.f6668m = r2
            return
    }

    @Override // ud.m
    public final java.util.List c() {
            r1 = this;
            java.util.List r0 = r1.f6664i
            return r0
    }

    @Override // ud.m, oc.b
    public final java.lang.String d() {
            r2 = this;
            java.lang.String r0 = super.d()
            java.lang.String r1 = " (mut)"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    @Override // ud.m
    public final qd.j e() {
            r1 = this;
            qd.j r0 = r1.f6663h
            return r0
    }

    @Override // ud.m
    public final java.util.List getTypeParameters() {
            r1 = this;
            java.util.List r0 = r1.f6665j
            return r0
    }

    @Override // ud.m
    public final int o() {
            r1 = this;
            int r0 = r1.f6668m
            return r0
    }

    @Override // ud.m
    public final od.d q() {
            r1 = this;
            od.d r0 = r1.f6662g
            return r0
    }

    @Override // ud.m
    public final java.util.List s() {
            r1 = this;
            java.util.List r0 = r1.f6666k
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.d()
            java.lang.String r1 = "Mutable"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @Override // ud.m
    public final boolean v() {
            r1 = this;
            boolean r0 = r1.f6667l
            return r0
    }
}
