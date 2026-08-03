package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.Map f782g;

    static {
            java.lang.Class<be.d> r0 = be.d.class
            mh.d.b(r0)
            return
    }

    @Override // be.a
    public final void f(ud.u r3) {
            r2 = this;
            bc.g r0 = r3.f13742a
            r0.getClass()
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r2.f782g = r0
            ah.a r0 = new ah.a
            r1 = 4
            r0.<init>(r1)
            java.util.ArrayList r3 = r3.f13751j
            r3.add(r0)
            return
    }

    @Override // be.a
    public final boolean h(ud.e r3) {
            r2 = this;
            java.util.Map r0 = r2.f782g
            if (r0 != 0) goto L7
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L19
        L7:
            od.a r1 = r3.f13690m
            qd.j r1 = r1.f9765g
            java.lang.String r1 = r1.l()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L19
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L19:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L36
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L2a
            goto L36
        L2a:
            java.lang.Object r3 = r0.next()
            r3.getClass()
            ah.a.d()
        L34:
            r3 = 0
            return r3
        L36:
            java.util.List r3 = r3.f13699v
            ae.g r0 = new ae.g
            r1 = 1
            r0.<init>(r2, r1)
            r3.forEach(r0)
            goto L34
    }
}
