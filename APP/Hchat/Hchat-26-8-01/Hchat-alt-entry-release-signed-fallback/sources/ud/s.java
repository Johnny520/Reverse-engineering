package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends nd.r implements ud.k, hc.c, java.lang.Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.u f13733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final od.e f13734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ud.s f13735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f13736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f13737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public od.e f13738p;

    public s(ud.u r2, ud.s r3, od.e r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f13736n = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f13737o = r0
            r1.f13733k = r2
            r1.f13735m = r3
            r1.f13734l = r4
            r1.f13738p = r4
            return
    }

    public static ud.s I(ud.u r2, java.lang.String r3) {
            java.util.HashMap r0 = r2.f13756o
            java.lang.Object r0 = r0.get(r3)
            ud.s r0 = (ud.s) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            od.e r3 = od.e.a(r2, r3)
            od.e r0 = r3.f9785a
            if (r0 != 0) goto L15
            r0 = 0
            goto L1b
        L15:
            java.lang.String r0 = r0.f9786b
            ud.s r0 = I(r2, r0)
        L1b:
            ud.s r1 = new ud.s
            r1.<init>(r2, r0, r3)
            if (r0 == 0) goto L27
            java.util.ArrayList r3 = r0.f13736n
            r3.add(r1)
        L27:
            java.util.HashMap r3 = r2.f13756o
            od.e r0 = r1.f13734l
            java.lang.String r0 = r0.f9786b
            r3.put(r0, r1)
            java.util.ArrayList r2 = r2.f13757p
            r2.add(r1)
            return r1
    }

    public final void J() {
            r5 = this;
            java.util.ArrayList r0 = r5.f13736n
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            ud.s r1 = (ud.s) r1
            ud.u r2 = r1.f13733k
            ud.s r3 = r1.f13735m
            if (r3 != 0) goto L1a
            r3 = 0
            goto L1c
        L1a:
            od.e r3 = r3.f13738p
        L1c:
            od.e r4 = r1.f13738p
            java.lang.String r4 = r4.f9787c
            od.e r2 = od.e.b(r2, r3, r4)
            r1.f13738p = r2
            r1.J()
            goto L6
        L2a:
            java.util.ArrayList r0 = r5.f13737o
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r0.next()
            ud.e r1 = (ud.e) r1
            od.a r2 = r1.f13690m
            boolean r3 = r2.o()
            if (r3 == 0) goto L45
            goto L30
        L45:
            ud.s r1 = r1.f13691n
            od.e r1 = r1.f13738p
            java.lang.String r1 = r1.f9786b
            boolean r3 = r2.o()
            if (r3 != 0) goto L6a
            java.lang.String r3 = r2.j()
            boolean r3 = java.util.Objects.equals(r3, r1)
            if (r3 != 0) goto L30
            g8.h r3 = new g8.h
            java.lang.String r4 = r2.k()
            r3.<init>(r1, r4)
            r2.c(r3)
            r2.f9770l = r3
            goto L30
        L6a:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Can't change package for inner class: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
        L77:
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ud.s r2 = (ud.s) r2
            od.e r0 = r1.f13734l
            java.lang.String r0 = r0.f9786b
            od.e r2 = r2.f13734l
            java.lang.String r2 = r2.f9786b
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof ud.s
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            ud.s r2 = (ud.s) r2
            od.e r2 = r2.f13734l
            od.e r0 = r1.f13734l
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            od.e r0 = r1.f13734l
            java.lang.String r0 = r0.f9786b
            int r0 = r0.hashCode()
            return r0
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // ud.k
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    @Override // ud.k
    public final ud.u n() {
            r1 = this;
            ud.u r0 = r1.f13733k
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            od.e r0 = r1.f13734l
            java.lang.String r0 = r0.f9786b
            return r0
    }

    @Override // ud.k
    public final java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "package"
            return r0
    }
}
