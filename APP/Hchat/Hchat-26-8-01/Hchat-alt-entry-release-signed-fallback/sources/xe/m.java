package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mh.b f21571a = null;

    static {
            java.lang.Class<xe.m> r0 = xe.m.class
            mh.b r0 = mh.d.b(r0)
            xe.m.f21571a = r0
            return
    }

    public static ud.p a(ud.p r1, pd.k r2) {
            if (r1 == 0) goto L7
            pd.k r0 = r1.f13713k
            if (r0 != r2) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    public static boolean b(java.util.List r2, qd.r r3) {
            r0 = 0
            if (r2 == 0) goto L24
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L24
        La:
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r2.next()
            qd.l r1 = (qd.l) r1
            if (r1 == r3) goto L22
            boolean r1 = r3.h0(r1)
            if (r1 == 0) goto Le
        L22:
            r2 = 1
            return r2
        L24:
            return r0
    }

    public static boolean c(qd.l r2, qd.r r3) {
            r2.getClass()
            boolean r0 = r2 instanceof qd.r
            if (r0 == 0) goto Le
            qd.r r2 = (qd.r) r2
            boolean r2 = r2.h0(r3)
            return r2
        Le:
            boolean r0 = r2 instanceof qd.m
            r1 = 0
            if (r0 == 0) goto L46
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            if (r2 != 0) goto L1a
            goto L46
        L1a:
            java.util.List r0 = r2.f13715m
            qd.r r2 = r2.f13714l
            if (r2 == 0) goto L27
            boolean r2 = r2.h0(r3)
            if (r2 == 0) goto L27
            goto L44
        L27:
            int r2 = r0.size()
            if (r2 != 0) goto L2e
            goto L46
        L2e:
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r2.next()
            qd.l r0 = (qd.l) r0
            boolean r0 = c(r0, r3)
            if (r0 == 0) goto L32
        L44:
            r2 = 1
            return r2
        L46:
            return r1
    }

    public static java.lang.String d(int r1) {
            if (r1 >= 0) goto L5
            java.lang.String r1 = "?"
            return r1
        L5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "0x%04x"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }

    public static java.lang.Object e(ud.u r2, qd.l r3) {
            r3.getClass()
            boolean r0 = r3 instanceof qd.n
            if (r0 == 0) goto L8
            return r3
        L8:
            boolean r0 = r3 instanceof qd.r
            r1 = 0
            if (r0 == 0) goto L2b
            qd.r r3 = (qd.r) r3
            ud.p r3 = r3.f0()
            if (r3 != 0) goto L16
            return r1
        L16:
            pd.k r0 = r3.f13713k
            pd.k r1 = pd.k.f10504m
            if (r0 != r1) goto L26
            r0 = 0
            qd.l r3 = r3.S(r0)
            java.lang.Object r2 = e(r2, r3)
            return r2
        L26:
            java.lang.Object r2 = f(r2, r3)
            return r2
        L2b:
            boolean r0 = r3 instanceof qd.m
            if (r0 == 0) goto L38
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            java.lang.Object r2 = f(r2, r3)
            return r2
        L38:
            return r1
    }

    public static java.lang.Object f(ud.u r3, ud.p r4) {
            pd.k r0 = r4.f13713k
            int r0 = r0.ordinal()
            if (r0 == 0) goto L44
            r1 = 1
            if (r0 == r1) goto L3f
            r1 = 2
            if (r0 == r1) goto L3a
            r1 = 32
            r2 = 0
            if (r0 == r1) goto L14
            return r2
        L14:
            pd.j r4 = (pd.j) r4
            java.lang.Object r4 = r4.f10495o
            od.c r4 = (od.c) r4
            ud.g r3 = r3.h(r4)
            if (r3 != 0) goto L28
            mh.b r3 = xe.m.f21571a
            java.lang.String r0 = "Field {} not found"
            r3.h(r4, r0)
            return r2
        L28:
            oc.c r4 = oc.c.f9760f
            md.f r3 = r3.f8877g
            oc.b r3 = r3.c(r4)
            nc.a r3 = (nc.a) r3
            if (r3 == 0) goto L39
            java.lang.Object r3 = a7.a.n(r3)
            return r3
        L39:
            return r2
        L3a:
            pd.c r4 = (pd.c) r4
            qd.j r3 = r4.f10476o
            return r3
        L3f:
            pd.d r4 = (pd.d) r4
            java.lang.String r3 = r4.f10477o
            return r3
        L44:
            r3 = 0
            qd.l r3 = r4.S(r3)
            return r3
    }

    public static qd.l g(ud.p r2) {
            if (r2 == 0) goto L11
            java.util.List r0 = r2.f13715m
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L11
            r0 = 0
            qd.l r2 = r2.S(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public static ud.p h(qd.l r1) {
            if (r1 == 0) goto Lb
            boolean r0 = r1 instanceof qd.m
            if (r0 == 0) goto Lb
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static java.lang.String i(java.lang.Object r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L14
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "\""
            java.lang.String r1 = eh.a.n(r0, r1, r0)
            return r1
        L14:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static boolean j(ud.p r0, pd.k r1) {
            if (r0 == 0) goto L8
            pd.k r0 = r0.f13713k
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static ud.p k(ud.p r2, pd.k r3, java.util.function.Predicate r4) {
            pd.k r0 = r2.f13713k
            if (r0 != r3) goto Lb
            boolean r0 = r4.test(r2)
            if (r0 == 0) goto Lb
            return r2
        Lb:
            java.util.List r2 = r2.f13715m
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r1 = r0 instanceof qd.m
            if (r1 == 0) goto L11
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            ud.p r0 = k(r0, r3, r4)
            if (r0 == 0) goto L11
            return r0
        L2f:
            r2 = 0
            return r2
    }

    public static void l(ud.r r4, ud.p r5, be.j r6) {
            java.util.List r0 = r5.f13715m
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L31
            qd.l r2 = r5.S(r1)
            r2.getClass()
            boolean r3 = r2 instanceof qd.m
            if (r3 == 0) goto L2e
            r3 = r2
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            l(r4, r3, r6)
            java.lang.Object r3 = r6.apply(r3)
            ud.p r3 = (ud.p) r3
            if (r3 == 0) goto L2e
            xe.l.i(r4, r2)
            qd.l r2 = qd.l.a0(r3)
            r5.c0(r1, r2)
        L2e:
            int r1 = r1 + 1
            goto L7
        L31:
            return
    }

    public static ud.p m(ud.r r2, pd.k r3, java.util.function.Predicate r4) {
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L5
            goto L30
        L5:
            java.util.List r2 = r2.f13732z
            java.util.Iterator r2 = r2.iterator()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r2.next()
            ud.a r0 = (ud.a) r0
            java.util.ArrayList r0 = r0.f13674l
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            ud.p r1 = k(r1, r3, r4)
            if (r1 == 0) goto L1d
            return r1
        L30:
            r2 = 0
            return r2
    }
}
