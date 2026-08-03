package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ud.u f10976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qe.x f10977h;

    static {
            java.lang.Class<qe.n> r0 = qe.n.class
            mh.d.b(r0)
            return
    }

    public static void i(p4.t r2, qe.d r3) {
            if (r3 != 0) goto L3
            goto L10
        L3:
            boolean r0 = r3 instanceof qe.e
            if (r0 != 0) goto L11
            qd.j r0 = r3.getType()
            qd.h r1 = qd.j.f10887u
            if (r0 == r1) goto L10
            goto L11
        L10:
            return
        L11:
            java.lang.Object r2 = r2.f10225i
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r2.add(r3)
            return
    }

    public static void j(ud.r r5) {
            java.util.List r5 = r5.D
            java.util.Iterator r5 = r5.iterator()
        L6:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r5.next()
            qd.s r0 = (qd.s) r0
            qd.r r1 = r0.f10927i
            md.f r1 = r1.f8877g
            md.a r2 = md.a.N
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L23
            qd.r r1 = r0.f10927i
            qd.j r1 = r1.f10902i
            goto L41
        L23:
            java.util.ArrayList r1 = r0.f10928j
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r3 = r1.next()
            qd.r r3 = (qd.r) r3
            md.f r4 = r3.f8877g
            boolean r4 = r4.a(r2)
            if (r4 == 0) goto L29
            qd.j r1 = r3.f10902i
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 == 0) goto L6
            qd.r r3 = r0.f10927i
            r3.w(r2)
            qd.r r2 = r0.f10927i
            qd.j r2 = r2.f10902i
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L6
            qd.r r0 = r0.f10927i
            r0.f10902i = r1
            goto L6
        L57:
            return
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "TypeInferenceVisitor"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r1) {
            r0 = this;
            r0.f10976g = r1
            qe.x r1 = r1.f13748g
            r0.f10977h = r1
            return
    }

    @Override // be.a
    public final void g(ud.r r3) {
            r2 = this;
            boolean r0 = r3.f13722p
            if (r0 == 0) goto L5
            goto L29
        L5:
            j(r3)     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            r2.l(r3)     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            r2.m(r3)     // Catch: java.lang.Exception -> Lf java.lang.BootstrapMethodError -> L11 java.lang.StackOverflowError -> L13
            return
        Lf:
            r0 = move-exception
            goto L15
        L11:
            r0 = move-exception
            goto L1b
        L13:
            r0 = move-exception
            goto L1b
        L15:
            java.lang.String r1 = "Type inference failed"
            xe.h.a(r3, r1, r0)
            goto L29
        L1b:
            af.f r1 = new af.f
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            java.lang.String r0 = "Type inference failed with stack overflow"
            xe.h.a(r3, r0, r1)
        L29:
            return
    }

    public final void k(ud.r r4, qd.s r5) {
            r3 = this;
            p4.t r0 = r5.f10930l
            java.lang.Object r0 = r0.f10225i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.stream.Stream r0 = r0.stream()
            me.a r1 = new me.a
            r2 = 9
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            a7.b r1 = new a7.b
            r2 = 11
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            qe.x r1 = r3.f10977h
            qe.k r1 = r1.f11002c
            c9.a0 r1 = r1.f10962b
            java.util.Optional r0 = r0.max(r1)
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L31
            return
        L31:
            java.lang.Object r0 = r0.get()
            qd.j r0 = (qd.j) r0
            qe.x r1 = r3.f10977h
            r1.getClass()
            qe.a0 r2 = qe.a0.f10934b
            r1.c(r4, r5, r0, r2)
            return
    }

    public final void l(ud.r r3) {
            r2 = this;
            java.util.List r3 = r3.D
            ae.g r0 = new ae.g
            r1 = 16
            r0.<init>(r2, r1)
            r3.forEach(r0)
            ae.e r0 = new ae.e
            r0.<init>(r2)
            r3.forEach(r0)
            return
    }

    public final void m(ud.r r4) {
            r3 = this;
            java.util.List r0 = r4.D
            qe.m r1 = new qe.m
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.forEach(r1)
            qe.m r1 = new qe.m
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.forEach(r1)
            return
    }
}
