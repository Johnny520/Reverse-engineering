package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends f1.n0 {
    public static boolean p(ud.j r1) {
            boolean r0 = r1 instanceof ud.h
            if (r0 == 0) goto L1d
            ud.h r1 = (ud.h) r1
            java.util.List r0 = r1.g()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3f
            md.e r1 = (md.e) r1
            md.f r1 = r1.f8877g
            md.a r0 = md.a.f8833n
            boolean r1 = r1.a(r0)
            if (r1 == 0) goto L3d
            goto L3f
        L1d:
            boolean r0 = r1 instanceof ud.n
            if (r0 == 0) goto L41
            ud.n r1 = (ud.n) r1
            java.util.List r1 = r1.u()
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r1.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = p(r0)
            if (r0 != 0) goto L2b
        L3d:
            r1 = 0
            return r1
        L3f:
            r1 = 1
            return r1
        L41:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Unknown container type: "
            java.lang.String r1 = r0.concat(r1)
            ah.a.k(r1)
            r1 = 0
            return r1
    }

    @Override // f1.n0, ke.e
    public final boolean a(ud.r r1, ud.n r2) {
            r0 = this;
            super.a(r1, r2)
            boolean r1 = r2 instanceof xd.d
            if (r1 != 0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // f1.n0
    public final void l(ud.r r6, ud.h r7, ud.n r8) {
            r5 = this;
            java.lang.Object r8 = r5.f3080g
            java.util.ArrayDeque r8 = (java.util.ArrayDeque) r8
            java.lang.Class r0 = r7.getClass()
            java.lang.Class<ud.a> r1 = ud.a.class
            if (r0 == r1) goto Le
            goto L93
        Le:
            ud.a r7 = (ud.a) r7
            md.f r0 = r7.f8877g
            md.a r1 = md.a.f8833n
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L93
            java.util.ArrayList r0 = r7.f13674l
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L93
            java.util.List r2 = r6.F
            int r2 = r2.size()
            if (r2 != 0) goto L2c
            goto L4c
        L2c:
            nd.t r6 = r6.U(r7)
            if (r6 == 0) goto L33
            goto L93
        L33:
            java.util.Iterator r6 = r8.iterator()
        L37:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r6.next()
            ud.n r2 = (ud.n) r2
            java.lang.Class r2 = r2.getClass()
            java.lang.Class<zd.c> r3 = zd.c.class
            if (r2 != r3) goto L37
            goto L93
        L4c:
            java.util.Iterator r6 = r8.iterator()
            r8 = r7
        L51:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r6.next()
            ud.n r2 = (ud.n) r2
            boolean r3 = r2 instanceof ud.i
            if (r3 == 0) goto L62
            goto L8a
        L62:
            java.util.List r3 = r2.u()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L8a
            int r4 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r4)
        L74:
            boolean r4 = r3.hasPrevious()
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r3.previous()
            ud.j r4 = (ud.j) r4
            if (r4 != r8) goto L83
            goto L8a
        L83:
            boolean r4 = p(r4)
            if (r4 != 0) goto L74
            goto L93
        L8a:
            r8 = r2
            goto L51
        L8c:
            r6 = 0
            r0.remove(r6)
            r7.D(r1)
        L93:
            return
    }
}
