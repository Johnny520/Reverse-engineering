package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ud.u f852g;

    static {
            java.lang.Class<be.y> r0 = be.y.class
            mh.d.b(r0)
            return
    }

    public static void i(pd.b r8, int r9, java.util.ArrayList r10, java.util.ArrayList r11) {
            java.util.List r0 = r8.f13715m
            int r0 = r0.size()
            r1 = r9
        L7:
            if (r1 >= r0) goto L87
            qd.l r2 = r8.S(r1)
            int r3 = r1 - r9
            java.lang.Object r4 = r10.get(r3)
            qd.j r4 = (qd.j) r4
            java.lang.Object r3 = r11.get(r3)
            qd.j r3 = (qd.j) r3
            if (r3 == 0) goto L84
            boolean r5 = r3.equals(r4)
            md.a r6 = md.a.X
            pd.k r7 = pd.k.A
            if (r5 != 0) goto L72
            r2.getClass()
            boolean r5 = r2 instanceof qd.n
            if (r5 == 0) goto L42
            r4.getClass()
            boolean r4 = r4 instanceof qd.g
            if (r4 == 0) goto L42
            boolean r4 = r3 instanceof qd.g
            if (r4 == 0) goto L42
            r2.W(r3)
            md.a r3 = md.a.W
            r2.w(r3)
            goto L84
        L42:
            mh.b r4 = xe.m.f21571a
            boolean r4 = r2 instanceof qd.m
            if (r4 == 0) goto L5a
            r4 = r2
            qd.m r4 = (qd.m) r4
            ud.p r4 = r4.f10904l
            pd.k r4 = r4.f13713k
            if (r4 != r7) goto L5a
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            pd.j r2 = (pd.j) r2
            r2.f10495o = r3
            goto L84
        L5a:
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.f10506o
            r7 = 1
            r4.<init>(r5, r3, r7)
            r4.I(r2)
            r4.w(r6)
            qd.m r2 = qd.l.Z(r4)
            r2.f10902i = r3
            r8.c0(r1, r2)
            goto L84
        L72:
            r2.getClass()
            boolean r3 = r2 instanceof qd.m
            if (r3 == 0) goto L84
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            pd.k r3 = r2.f13713k
            if (r3 != r7) goto L84
            r2.w(r6)
        L84:
            int r1 = r1 + 1
            goto L7
        L87:
            return
    }

    public static java.util.ArrayList j(pd.b r9, int r10) {
            java.util.List r0 = r9.f13715m
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        Lb:
            if (r10 >= r0) goto L8d
            qd.l r2 = r9.S(r10)
            boolean r3 = r2 instanceof qd.n
            if (r3 == 0) goto L46
            r3 = r2
            qd.n r3 = (qd.n) r3
            qd.j r4 = r3.f10902i
            long r5 = r3.f10905l
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2f
            boolean r3 = r4.v()
            if (r3 != 0) goto L2c
            boolean r3 = r4 instanceof qd.a
            if (r3 == 0) goto L2f
        L2c:
            qd.h r2 = qd.j.f10888v
            goto L78
        L2f:
            r4.getClass()
            boolean r3 = r4 instanceof qd.g
            if (r3 == 0) goto L43
            md.a r3 = md.a.W
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L43
            qd.g r2 = qd.j.f10868b
            goto L78
        L43:
            qd.j r2 = r2.f10902i
            goto L78
        L46:
            boolean r3 = r2 instanceof qd.r
            if (r3 == 0) goto L4f
            qd.j r2 = r2.I()
            goto L78
        L4f:
            boolean r3 = r2 instanceof qd.m
            if (r3 == 0) goto L7e
            r3 = r2
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            pd.k r4 = r3.f13713k
            int r4 = r4.ordinal()
            r5 = 8
            if (r4 == r5) goto L72
            r5 = 20
            if (r4 == r5) goto L72
            qd.r r3 = r3.f13714l
            if (r3 == 0) goto L6f
            qd.j r2 = r3.I()
            goto L78
        L6f:
            qd.j r2 = r2.f10902i
            goto L78
        L72:
            pd.j r3 = (pd.j) r3
            java.lang.Object r2 = r3.f10495o
            qd.j r2 = (qd.j) r2
        L78:
            r1.add(r2)
            int r10 = r10 + 1
            goto Lb
        L7e:
            java.lang.String r9 = java.lang.String.valueOf(r2)
            java.lang.String r10 = "Unknown var type for: "
            java.lang.String r9 = r10.concat(r9)
            ah.a.k(r9)
            r9 = 0
            return r9
        L8d:
            return r1
    }

    public static boolean m(java.util.ArrayList r4, java.util.List r5) {
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L21
            java.lang.Object r3 = r4.get(r1)
            qd.j r3 = (qd.j) r3
            boolean r3 = r3.w()
            if (r3 != 0) goto L1e
            java.lang.Object r2 = r5.get(r1)
            qd.j r2 = (qd.j) r2
            r4.set(r1, r2)
            r2 = 1
        L1e:
            int r1 = r1 + 1
            goto L6
        L21:
            return r2
    }

    @Override // be.a
    public final void f(ud.u r1) {
            r0 = this;
            r0.f852g = r1
            return
    }

    @Override // be.a
    public final void g(ud.r r6) {
            r5 = this;
            boolean r0 = r6.f13722p
            if (r0 == 0) goto L5
            goto L46
        L5:
            java.util.List r0 = r6.f13732z
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            md.f r2 = r1.f8877g
            md.a r3 = md.a.f8838s
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.util.ArrayList r1 = r1.f13674l
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            md.f r4 = r2.f8877g
            boolean r4 = r4.a(r3)
            if (r4 == 0) goto L3d
            goto L28
        L3d:
            be.w r4 = new be.w
            r4.<init>(r5, r6)
            r2.h0(r4)
            goto L28
        L46:
            return
    }

    public final java.util.ArrayList k(java.util.ArrayList r9, java.util.ArrayList r10, java.util.function.Function r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r9.next()
            ud.m r1 = (ud.m) r1
            java.util.List r2 = r1.c()
            int r3 = r2.size()
            int r4 = r10.size()
            if (r3 == r4) goto L28
            goto Ld
        L28:
            ud.u r4 = r8.f852g
            qe.x r4 = r4.f13748g
            qe.k r4 = r4.f11002c
            r5 = 0
        L2f:
            if (r5 >= r3) goto L51
            java.lang.Object r6 = r2.get(r5)
            qd.j r6 = (qd.j) r6
            java.lang.Object r7 = r10.get(r5)
            qd.j r7 = (qd.j) r7
            qe.l r6 = r4.d(r7, r6)
            java.lang.Object r6 = r11.apply(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4e
            goto Ld
        L4e:
            int r5 = r5 + 1
            goto L2f
        L51:
            r0.add(r1)
            goto Ld
        L55:
            return r0
    }

    public final boolean l(ud.m r5, java.util.ArrayList r6, java.util.ArrayList r7) {
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            goto L41
        L8:
            ae.d r0 = new ae.d
            r2 = 14
            r0.<init>(r2)
            java.util.ArrayList r0 = r4.k(r6, r7, r0)
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L25
            java.lang.Object r6 = r0.get(r1)
            ud.m r6 = (ud.m) r6
            boolean r5 = r6.equals(r5)
            return r5
        L25:
            ae.d r0 = new ae.d
            r2 = 15
            r0.<init>(r2)
            java.util.ArrayList r6 = r4.k(r6, r7, r0)
            int r7 = r6.size()
            if (r7 != r3) goto L41
            java.lang.Object r6 = r6.get(r1)
            ud.m r6 = (ud.m) r6
            boolean r5 = r6.equals(r5)
            return r5
        L41:
            return r1
    }

    public final ud.m n(ud.m r9, java.util.Map r10) {
            r8 = this;
            java.util.List r0 = r9.c()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 0
            r4 = r3
        Lf:
            r5 = 1
            if (r3 >= r1) goto L66
            java.lang.Object r6 = r0.get(r3)
            qd.j r6 = (qd.j) r6
            if (r6 == 0) goto L47
            boolean r7 = r6.c()
            if (r7 == 0) goto L41
            ud.u r4 = r8.f852g
            fe.a r4 = r4.f13750i
            qd.j r4 = r4.m(r6, r10)
            if (r4 == 0) goto L30
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto L3c
        L30:
            od.d r4 = r9.q()
            java.util.List r4 = r4.f9779i
            java.lang.Object r4 = r4.get(r3)
            qd.j r4 = (qd.j) r4
        L3c:
            r2.add(r4)
            r4 = r5
            goto L44
        L41:
            r2.add(r6)
        L44:
            int r3 = r3 + 1
            goto Lf
        L47:
            af.g r10 = new af.g
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = " at: "
            java.lang.String r2 = " in: "
            java.lang.String r4 = "Null arg type in "
            java.lang.StringBuilder r9 = eh.a.u(r3, r4, r9, r1, r2)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L66:
            qd.j r0 = r9.e()
            boolean r1 = r0.c()
            if (r1 == 0) goto L87
            ud.u r1 = r8.f852g
            fe.a r1 = r1.f13750i
            qd.j r10 = r1.m(r0, r10)
            if (r10 == 0) goto L80
            boolean r10 = r10.c()
            if (r10 == 0) goto L87
        L80:
            od.d r10 = r9.q()
            qd.j r0 = r10.f9778h
            r4 = r5
        L87:
            if (r4 != 0) goto L8a
            return r9
        L8a:
            ie.a r10 = new ie.a
            r10.<init>(r9)
            r10.f6664i = r2
            r10.f6663h = r0
            return r10
    }
}
