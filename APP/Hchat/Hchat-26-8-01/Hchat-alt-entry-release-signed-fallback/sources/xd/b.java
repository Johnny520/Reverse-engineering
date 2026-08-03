package xd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends xd.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f21539k;

    public b(ud.n r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 1
            r2.<init>(r0)
            r1.f21539k = r2
            return
    }

    public final void H(ud.j r2) {
            r1 = this;
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto Lb
            r0 = r2
            ud.n r0 = (ud.n) r0
            xd.a r0 = (xd.a) r0
            r0.f21538i = r1
        Lb:
            java.util.ArrayList r0 = r1.f21539k
            r0.add(r2)
            return
    }

    @Override // ud.j
    public final void b(fd.i r3, fc.f r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.f21539k
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ud.j r1 = (ud.j) r1
            r3.u(r4, r1)
            goto L6
        L16:
            return
    }

    @Override // ud.j
    public final java.lang.String k() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList r1 = r4.f21539k
            int r2 = r1.size()
            r3 = 40
            r0.append(r3)
            r0.append(r2)
            if (r2 <= 0) goto L26
            r2 = 58
            r0.append(r2)
            me.a r2 = new me.a
            r3 = 23
            r2.<init>(r3)
            java.lang.String r3 = "|"
            xe.s.l(r0, r1, r3, r2)
        L26:
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // xd.a, ud.n
    public final boolean l(ud.j r3, ud.j r4) {
            r2 = this;
            java.util.ArrayList r0 = r2.f21539k
            int r3 = r0.indexOf(r3)
            r1 = -1
            if (r3 == r1) goto L18
            r0.set(r3, r4)
            boolean r3 = r4 instanceof ud.n
            if (r3 == 0) goto L16
            ud.n r4 = (ud.n) r4
            xd.a r4 = (xd.a) r4
            r4.f21538i = r2
        L16:
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = r2.k()
            java.lang.String r1 = "R"
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r1 = this;
            java.util.ArrayList r0 = r1.f21539k
            return r0
    }
}
