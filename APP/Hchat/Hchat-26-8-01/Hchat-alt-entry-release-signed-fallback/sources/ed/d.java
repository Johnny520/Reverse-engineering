package ed;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ud.m, java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od.d f2718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f2719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qd.j f2720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.List f2721j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f2722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2723l;

    public d(od.d r1, java.util.List r2, qd.j r3, java.util.List r4, java.util.List r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.f2718g = r1
            r0.f2719h = r2
            r0.f2720i = r3
            r0.f2721j = r4
            r0.f2722k = r5
            r0.f2723l = r6
            return
    }

    @Override // ud.m
    public final java.util.List c() {
            r1 = this;
            java.util.List r0 = r1.f2719h
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ed.d r2 = (ed.d) r2
            od.d r0 = r1.f2718g
            od.d r2 = r2.f2718g
            int r2 = r0.a(r2)
            return r2
    }

    @Override // ud.m, oc.b
    public final java.lang.String d() {
            r2 = this;
            java.lang.String r0 = super.d()
            java.lang.String r1 = " (c)"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    @Override // ud.m
    public final qd.j e() {
            r1 = this;
            qd.j r0 = r1.f2720i
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof ed.d
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            ed.d r2 = (ed.d) r2
            od.d r0 = r1.f2718g
            od.d r2 = r2.f2718g
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // ud.m
    public final java.util.List getTypeParameters() {
            r1 = this;
            java.util.List r0 = r1.f2721j
            return r0
    }

    public final int hashCode() {
            r1 = this;
            od.d r0 = r1.f2718g
            int r0 = r0.f9783m
            return r0
    }

    @Override // ud.m
    public final int o() {
            r1 = this;
            int r0 = r1.f2723l
            return r0
    }

    @Override // ud.m
    public final od.d q() {
            r1 = this;
            od.d r0 = r1.f2718g
            return r0
    }

    @Override // ud.m
    public final java.util.List s() {
            r1 = this;
            java.util.List r0 = r1.f2722k
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClspMth{"
            r0.<init>(r1)
            java.util.List r1 = r5.f2721j
            boolean r2 = xe.s.n(r1)
            java.lang.String r3 = ", "
            if (r2 == 0) goto L22
            r2 = 60
            r0.append(r2)
            java.lang.String r1 = xe.s.j(r1, r3)
            r0.append(r1)
            java.lang.String r1 = "> "
            r0.append(r1)
        L22:
            od.d r1 = r5.f2718g
            od.a r2 = r1.f9780j
            java.lang.String r2 = r2.f9768j
            java.lang.String r1 = r1.f9777g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "."
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.util.List r1 = r5.f2719h
            java.lang.String r1 = xe.s.j(r1, r3)
            r0.append(r1)
            java.lang.String r1 = "):"
            r0.append(r1)
            qd.j r1 = r5.f2720i
            r0.append(r1)
            boolean r1 = r5.v()
            if (r1 == 0) goto L64
            java.lang.String r1 = " VARARG"
            r0.append(r1)
        L64:
            java.util.List r1 = r5.f2722k
            boolean r2 = xe.s.n(r1)
            if (r2 == 0) goto L78
            java.lang.String r2 = " throws "
            r0.append(r2)
            java.lang.String r1 = xe.s.j(r1, r3)
            r0.append(r1)
        L78:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // ud.m
    public final boolean v() {
            r1 = this;
            int r0 = r1.f2723l
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
