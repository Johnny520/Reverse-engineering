package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements oc.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ae.h f246j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f248l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ud.a f249m;

    public h(int r2, java.util.List r3, java.util.List r4) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.f247k = r0
            r0 = 0
            r1.f248l = r0
            r1.f243g = r2
            r1.f244h = r3
            r1.f245i = r4
            ae.g r2 = new ae.g
            r4 = 0
            r2.<init>(r1, r4)
            r3.forEach(r2)
            return
    }

    @Override // oc.b
    public final oc.a a() {
            r1 = this;
            md.b r0 = md.b.D
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2d
            java.lang.Class<ae.h> r2 = ae.h.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2d
        L10:
            ae.h r5 = (ae.h) r5
            int r2 = r4.f243g
            int r3 = r5.f243g
            if (r2 != r3) goto L2d
            java.util.List r2 = r4.f244h
            java.util.List r3 = r5.f244h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2d
            java.util.List r2 = r4.f245i
            java.util.List r5 = r5.f245i
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2d
            return r0
        L2d:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.util.List r0 = r2.f244h
            int r0 = r0.hashCode()
            java.util.List r1 = r2.f245i
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.f248l
            if (r0 == 0) goto L11
            ae.h r0 = r5.f246j
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Merged into "
            java.lang.String r0 = r1.concat(r0)
            return r0
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TryCatch #"
            r0.<init>(r1)
            int r1 = r5.f243g
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.util.List r1 = r5.f244h
            java.lang.String r2 = ", "
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", blocks: ("
            r0.append(r1)
            java.util.List r1 = r5.f245i
            java.lang.String r1 = xe.s.j(r1, r2)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            ud.a r1 = r5.f249m
            if (r1 == 0) goto L4e
            java.lang.String r1 = ", top: "
            r0.append(r1)
            ud.a r1 = r5.f249m
            r0.append(r1)
        L4e:
            ae.h r1 = r5.f246j
            if (r1 == 0) goto L5e
            java.lang.String r1 = ", outer: #"
            r0.append(r1)
            ae.h r1 = r5.f246j
            int r1 = r1.f243g
            r0.append(r1)
        L5e:
            java.util.List r1 = r5.f247k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L7a
            java.lang.String r1 = ", inners: "
            r0.append(r1)
            java.util.List r1 = r5.f247k
            ae.d r3 = new ae.d
            r4 = 1
            r3.<init>(r4)
            java.lang.String r1 = xe.s.k(r1, r2, r3)
            r0.append(r1)
        L7a:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
