package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends fd.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mh.b f3920h = null;

    static {
            java.lang.Class<fd.i> r0 = fd.i.class
            mh.b r0 = mh.d.b(r0)
            fd.i.f3920h = r0
            return
    }

    public final void r(fc.f r3, ud.j r4) {
            r2 = this;
            md.e r4 = (md.e) r4
            md.f r4 = r4.f8877g
            md.b r0 = md.b.f8868w
            oc.b r4 = r4.c(r0)
            nd.e r4 = (nd.e) r4
            if (r4 == 0) goto L4a
            java.util.ArrayList r4 = r4.f9360g
            java.util.Iterator r4 = r4.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r4.next()
            qd.k r0 = (qd.k) r0
            r3.p()
            boolean r1 = r0.f10897d
            if (r1 == 0) goto L2c
            java.lang.String r1 = "final "
            r3.e(r1)
        L2c:
            qd.j r1 = r0.f10895b
            r2.q(r3, r1)
            r1 = 32
            r3.d(r1)
            r2.d(r3, r0)
            r1 = 59
            r3.d(r1)
            qd.s r0 = r0.a()
            qd.r r0 = r0.f10927i
            ud.r r1 = r2.f3908b
            jd.c.a(r3, r1, r0)
            goto L14
        L4a:
            return
    }

    public final void s(fc.f r7, ae.f r8) {
            r6 = this;
            fd.g r0 = r6.f3907a
            fd.h r1 = r0.f3917d
            xd.b r2 = r8.f236e
            if (r2 != 0) goto L9
            return
        L9:
            java.lang.String r3 = "} catch ("
            r7.r(r3)
            boolean r3 = r8.c()
            if (r3 == 0) goto L1c
            qd.e r3 = qd.j.f10881o
            fd.a r0 = r0.f3915b
            r0.p(r7, r3)
            goto L46
        L1c:
            java.util.ArrayList r0 = r8.f232a
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            od.a r3 = (od.a) r3
            r6.p(r7, r3)
        L31:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.String r3 = " | "
            r7.e(r3)
            java.lang.Object r3 = r0.next()
            od.a r3 = (od.a) r3
            r6.p(r7, r3)
            goto L31
        L46:
            r0 = 32
            r7.d(r0)
            qd.l r0 = r8.f237f
            ud.r r3 = r6.f3908b
            if (r0 != 0) goto L57
            java.lang.String r0 = "unknown"
            r7.e(r0)
            goto L8f
        L57:
            boolean r4 = r0 instanceof qd.r
            if (r4 == 0) goto L76
            qd.r r0 = (qd.r) r0
            qd.s r0 = r0.f10923m
            boolean r4 = r7 instanceof fc.b
            if (r4 == 0) goto L6a
            ic.d r4 = ic.d.a(r3, r0)
            r7.k(r4)
        L6a:
            qd.k r0 = r0.b()
            java.lang.String r0 = r1.a(r0)
            r7.e(r0)
            goto L8f
        L76:
            boolean r4 = r0 instanceof qd.p
            if (r4 == 0) goto Lad
            qd.p r0 = (qd.p) r0
            r1.getClass()
            java.lang.String r4 = r0.f10906l
            boolean r5 = r1.f3918g
            if (r5 == 0) goto L86
            goto L8c
        L86:
            java.lang.String r4 = r1.b(r4)
            r0.f10906l = r4
        L8c:
            r7.e(r4)
        L8f:
            java.lang.String r0 = ") {"
            r7.e(r0)
            int r0 = r8.f233b
            if (r0 < 0) goto La4
            boolean r1 = r7 instanceof fc.b
            if (r1 == 0) goto La4
            ic.a r1 = new ic.a
            r1.<init>(r0)
            r7.l(r1)
        La4:
            ud.a r8 = r8.f234c
            jd.c.a(r7, r3, r8)
            r6.v(r7, r2)
            return
        Lad:
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.Class r8 = r0.getClass()
            java.lang.String r8 = r8.getSimpleName()
            java.lang.String r0 = "Unexpected arg type in catch block: "
            java.lang.String r1 = ", class: "
            java.lang.String r7 = bc.e.j(r0, r7, r1, r8)
            ah.a.k(r7)
            return
    }

    public final void t(yd.c r7, fc.f r8, boolean r9) {
            r6 = this;
            if (r9 == 0) goto La
            int r9 = r7.H()
            r8.s(r9)
            goto L11
        La:
            int r9 = r7.H()
            r8.m(r9)
        L11:
            md.a r9 = md.a.f8839t
            md.f r0 = r7.f8877g
            boolean r9 = r0.a(r9)
            if (r9 == 0) goto L20
            java.lang.String r0 = "// "
            r8.e(r0)
        L20:
            java.lang.String r0 = "if ("
            r8.e(r0)
            fd.c r0 = new fd.c
            fd.g r1 = r6.f3907a
            boolean r2 = r6.f3910d
            r0.<init>(r1, r2)
            yd.b r1 = r7.f22417k
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r3 = 12
            r2.<init>(r3)
            r0.r(r8, r2, r1)
            java.lang.String r0 = ") {"
            r8.e(r0)
            boolean r0 = r8 instanceof fc.b
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.List r0 = r7.f22418l
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L5e
            java.lang.Object r0 = r0.get(r1)
            ud.a r0 = (ud.a) r0
            ud.p r0 = a.a.c0(r0)
            ic.a.a(r8, r0)
            ud.r r2 = r6.f3908b
            jd.c.a(r8, r2, r0)
        L5e:
            ud.j r0 = r7.f22422m
            r6.v(r8, r0)
            java.lang.String r0 = "// }"
            if (r9 == 0) goto L6b
            r8.r(r0)
            goto L6e
        L6b:
            r8.q()
        L6e:
            ud.j r7 = r7.f22423n
            boolean r2 = f8.i.n0(r7)
            if (r2 == 0) goto Ld4
            java.lang.String r2 = " else "
            r8.e(r2)
            r2 = r7
            md.e r2 = (md.e) r2
            md.f r2 = r2.f8877g
            md.a r3 = md.a.R
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto Lc3
            boolean r2 = r7 instanceof xd.b
            if (r2 == 0) goto Lb5
            r2 = r7
            xd.b r2 = (xd.b) r2
            java.util.ArrayList r2 = r2.f21539k
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto Lb5
            java.lang.Object r2 = r2.get(r1)
            ud.j r2 = (ud.j) r2
        L9e:
            boolean r3 = r2 instanceof xd.b
            if (r3 == 0) goto Lb6
            r3 = r2
            xd.b r3 = (xd.b) r3
            java.util.ArrayList r3 = r3.f21539k
            int r5 = r3.size()
            if (r5 == r4) goto Lae
            goto Lb6
        Lae:
            java.lang.Object r2 = r3.get(r1)
            ud.j r2 = (ud.j) r2
            goto L9e
        Lb5:
            r2 = 0
        Lb6:
            boolean r3 = r2 instanceof yd.c
            if (r3 == 0) goto Lc3
            r6.r(r8, r2)
            yd.c r2 = (yd.c) r2
            r6.t(r2, r8, r1)
            return
        Lc3:
            r1 = 123(0x7b, float:1.72E-43)
            r8.d(r1)
            r6.v(r8, r7)
            if (r9 == 0) goto Ld1
            r8.r(r0)
            return
        Ld1:
            r8.q()
        Ld4:
            return
    }

    public final void u(fc.f r1, ud.j r2) {
            r0 = this;
            r0.r(r1, r2)
            r2.b(r0, r1)
            return
    }

    public final void v(fc.f r1, ud.j r2) {
            r0 = this;
            r1.o()
            r0.u(r1, r2)
            r1.n()
            return
    }

    public final void w(fc.f r3, od.c r4, ud.g r5) {
            r2 = this;
            if (r5 == 0) goto L9
            ud.e r0 = r5.f13706k
            boolean r0 = r0.c0()
            goto L24
        L9:
            ud.u r0 = r2.f3909c
            ed.c r0 = r0.f13760s
            od.a r1 = r4.f9773g
            qd.j r1 = r1.f9765g
            ed.b r0 = r0.c(r1)
            if (r0 == 0) goto L23
            r1 = 16384(0x4000, float:2.2959E-41)
            int r0 = r0.f2707b
            boolean r0 = r9.e0.G(r0, r1)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L31
            if (r5 == 0) goto L2b
            r3.j(r5)
        L2b:
            java.lang.String r4 = r4.f9776j
            r3.e(r4)
            return
        L31:
            r2.o(r3, r4)
            if (r5 == 0) goto L63
            ud.r r4 = r2.f3908b
            bc.a r0 = bc.a.f700k
            boolean r4 = r4.N(r0)
            if (r4 == 0) goto L63
            oc.c r4 = oc.c.f9760f
            md.f r5 = r5.f8877g
            oc.b r4 = r5.c(r4)
            nc.a r4 = (nc.a) r4
            if (r4 == 0) goto L63
            java.lang.Object r4 = r4.f9342h
            if (r4 == 0) goto L63
            java.lang.String r5 = " /* "
            fc.f r3 = r3.e(r5)
            java.lang.String r4 = r4.toString()
            fc.f r3 = r3.e(r4)
            java.lang.String r4 = " */"
            r3.e(r4)
        L63:
            return
    }
}
