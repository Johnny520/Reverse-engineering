package yd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yd.a implements ud.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ud.j f22422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ud.j f22423n;

    @Override // ud.j
    public final void b(fd.i r2, fc.f r3) {
            r1 = this;
            r0 = 1
            r2.t(r1, r3, r0)
            return
    }

    @Override // xd.a, ud.i
    public final java.util.List i() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            ud.j r1 = r2.f22422m
            r0.add(r1)
            ud.j r1 = r2.f22423n
            r0.add(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // ud.j
    public final java.lang.String k() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ud.j r1 = r2.f22422m
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.k()
            r0.append(r1)
        L10:
            ud.j r1 = r2.f22423n
            if (r1 == 0) goto L1b
            java.lang.String r1 = r1.k()
            r0.append(r1)
        L1b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xd.a, ud.n
    public final boolean l(ud.j r3, ud.j r4) {
            r2 = this;
            ud.j r0 = r2.f22422m
            r1 = 1
            if (r3 != r0) goto L12
            r2.f22422m = r4
            boolean r3 = r4 instanceof ud.n
            if (r3 == 0) goto L22
            ud.n r4 = (ud.n) r4
            xd.a r4 = (xd.a) r4
            r4.f21538i = r2
            return r1
        L12:
            ud.j r0 = r2.f22423n
            if (r3 != r0) goto L23
            r2.f22423n = r4
            boolean r3 = r4 instanceof ud.n
            if (r3 == 0) goto L22
            ud.n r4 = (ud.n) r4
            xd.a r4 = (xd.a) r4
            r4.f21538i = r2
        L22:
            return r1
        L23:
            r3 = 0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            java.util.List r0 = r6.f22418l
            java.lang.String r0 = java.lang.String.valueOf(r0)
            ud.j r1 = r6.f22422m
            java.lang.String r1 = java.lang.String.valueOf(r1)
            ud.j r2 = r6.f22423n
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " THEN: "
            java.lang.String r4 = " ELSE: "
            java.lang.String r5 = "IF "
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r3 = this;
            java.util.List r0 = r3.f22418l
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + 2
            r1.<init>(r2)
            r1.addAll(r0)
            ud.j r0 = r3.f22422m
            if (r0 == 0) goto L17
            r1.add(r0)
        L17:
            ud.j r0 = r3.f22423n
            if (r0 == 0) goto L1e
            r1.add(r0)
        L1e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
    }
}
