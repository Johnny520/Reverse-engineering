package ge;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends be.a implements ke.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l3.w f4490h;

    @Override // ke.d
    public final boolean c(ud.r r5, ud.n r6) {
            r4 = this;
            boolean r5 = r4.f4489g
            r0 = 0
            if (r5 == 0) goto L6
            goto L64
        L6:
            boolean r5 = r6 instanceof xd.d
            if (r5 == 0) goto L64
            xd.d r6 = (xd.d) r6
            java.util.ArrayList r5 = r6.f21544l
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L64
            java.lang.Object r6 = r5.next()
            xd.c r6 = (xd.c) r6
            java.util.List r6 = r6.f21540a
            java.util.Iterator r6 = r6.iterator()
        L24:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L12
            java.lang.Object r1 = r6.next()
            boolean r2 = r1 instanceof ud.g
            if (r2 == 0) goto L24
            ud.g r1 = (ud.g) r1
            ud.e r1 = r1.f13706k
            ud.e r1 = r1.a0()
            mh.b r2 = ye.f.f22435a
            ud.e r2 = r1.f13701x
            if (r2 == 0) goto L24
            od.a r2 = r2.f13690m
            java.lang.String r2 = r2.k()
            java.lang.String r3 = "R"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L24
            od.a r1 = r1.f13690m
            java.lang.String r1 = r1.f()
            java.lang.String r2 = "android.R"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L24
            r5 = 1
            r4.f4489g = r5
            l3.w r5 = r4.f4490h
            r5.getClass()
        L64:
            return r0
    }

    @Override // be.a
    public final void f(ud.u r1) {
            r0 = this;
            l3.w r1 = r1.f13752k
            r0.f4490h = r1
            return
    }

    @Override // be.a
    public final void g(ud.r r3) {
            r2 = this;
            oc.c r0 = oc.c.f9755a
            md.f r1 = r3.f8877g
            oc.b r0 = r1.c(r0)
            pc.d r0 = (pc.d) r0
            boolean r0 = r2.i(r0)
            if (r0 == 0) goto L14
            r3 = 1
            r2.f4489g = r3
            return
        L14:
            boolean r0 = r2.f4489g
            if (r0 != 0) goto L24
            nd.c r0 = nd.c.f9353g
            boolean r0 = nd.d.b(r3, r0)
            if (r0 != 0) goto L21
            goto L24
        L21:
            x6.d.i0(r3, r2)
        L24:
            return
    }

    @Override // be.a
    public final boolean h(ud.e r2) {
            r1 = this;
            boolean r0 = r1.f4489g
            if (r0 == 0) goto L5
            goto L15
        L5:
            oc.c r0 = oc.c.f9755a
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r0)
            pc.d r2 = (pc.d) r2
            boolean r2 = r1.i(r2)
            if (r2 == 0) goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public final boolean i(pc.d r5) {
            r4 = this;
            if (r5 == 0) goto L67
            java.util.HashMap r5 = r5.f10463g
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        Lc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            nc.b r0 = (nc.b) r0
            int r1 = r0.f9343a
            r2 = 3
            if (r1 != r2) goto L1e
            goto Lc
        L1e:
            java.util.LinkedHashMap r0 = r0.f9345c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            nc.a r1 = (nc.a) r1
            java.lang.Object r1 = r1.f9342h
            boolean r2 = r1 instanceof ud.l
            if (r2 == 0) goto L28
            ud.l r1 = (ud.l) r1
            od.c r1 = r1.f()
            od.a r1 = r1.f9773g
            od.a r1 = r1.f9769k
            if (r1 == 0) goto L28
            java.lang.String r2 = r1.f9766h
            java.lang.String r3 = "R"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            java.lang.String r1 = r1.f9768j
            java.lang.String r2 = "android.R"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            l3.w r5 = r4.f4490h
            r5.getClass()
            r5 = 1
            return r5
        L67:
            r5 = 0
            return r5
    }
}
