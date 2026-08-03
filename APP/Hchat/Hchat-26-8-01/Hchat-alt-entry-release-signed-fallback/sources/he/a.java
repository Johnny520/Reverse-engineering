package he;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends be.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final mh.b f5515j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public od.a f5516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.HashSet f5517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5518i;

    static {
            java.lang.Class<he.a> r0 = he.a.class
            mh.b r0 = mh.d.b(r0)
            he.a.f5515j = r0
            return
    }

    public static boolean i(qd.r r2, java.lang.String r3) {
            java.lang.String r0 = "$this$"
            boolean r0 = r3.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto Lf
            r0 = 6
            java.lang.String r3 = r3.substring(r0)
            goto L1b
        Lf:
            java.lang.String r0 = "$"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L1b
            java.lang.String r3 = r3.substring(r1)
        L1b:
            boolean r0 = kd.d.c(r3)
            if (r0 == 0) goto L2a
            qd.s r2 = r2.f10923m
            qd.k r2 = r2.b()
            r2.f10894a = r3
            return r1
        L2a:
            r2 = 0
            return r2
    }

    public static java.lang.String j(ud.r r3, ud.p r4, int r5) {
            qd.l r5 = r4.S(r5)
            r5.getClass()
            boolean r0 = r5 instanceof qd.m
            if (r0 != 0) goto Lc
            goto L4b
        Lc:
            r0 = r5
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.f10499h
            if (r1 != r2) goto L1c
            pd.d r0 = (pd.d) r0
            java.lang.String r3 = r0.f10477o
            return r3
        L1c:
            pd.k r2 = pd.k.M
            if (r1 != r2) goto L4b
            pd.j r0 = (pd.j) r0
            java.lang.Object r0 = r0.f10495o
            od.c r0 = (od.c) r0
            ud.e r3 = r3.f13718l
            ud.u r3 = r3.f13688k
            ud.g r3 = r3.h(r0)
            if (r3 == 0) goto L4b
            oc.c r0 = oc.c.f9760f
            md.f r3 = r3.f8877g
            oc.b r3 = r3.c(r0)
            nc.a r3 = (nc.a) r3
            java.lang.Object r3 = r3.f9342h
            java.lang.String r3 = (java.lang.String) r3
            pd.d r0 = new pd.d
            r0.<init>(r3)
            qd.m r0 = qd.l.Z(r0)
            r4.b0(r5, r0)
            return r3
        L4b:
            r3 = 0
            return r3
    }

    @Override // be.a
    public final void f(ud.u r11) {
            r10 = this;
            r11.getClass()
            java.lang.String r0 = "kotlin.jvm.internal.Intrinsics"
            qd.j r1 = qd.j.x(r0)
            od.a r1 = od.a.e(r11, r1)
            ud.e r1 = r11.f(r1)
            java.lang.String r2 = "(Ljava/lang/Object;Ljava/lang/String;)V"
            r3 = 0
            if (r1 == 0) goto L18
            goto L93
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r4 = r11.f13755n
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r4.next()
            ud.e r5 = (ud.e) r5
            od.a r6 = r5.f13690m
            java.lang.String r7 = r6.k()
            java.lang.String r8 = "Intrinsics"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L48
            java.lang.String r7 = r6.f()
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L48
            goto L88
        L48:
            java.lang.String r6 = r6.f9768j
            java.lang.String r7 = "kotlin.jvm.internal."
            boolean r6 = r6.startsWith(r7)
            if (r6 != 0) goto L53
            goto L23
        L53:
            java.util.List r6 = r5.f13697t
            int r6 = r6.size()
            r7 = 5
            if (r6 >= r7) goto L5d
            goto L23
        L5d:
            java.util.List r6 = r5.f13697t
            java.util.Iterator r6 = r6.iterator()
            r7 = r3
        L64:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L85
            java.lang.Object r8 = r6.next()
            ud.r r8 = (ud.r) r8
            b5.k r9 = r8.f13719m
            boolean r9 = r9.h()
            if (r9 == 0) goto L64
            od.d r8 = r8.f13717k
            java.lang.String r8 = r8.f9781k
            boolean r8 = r8.endsWith(r2)
            if (r8 == 0) goto L64
            int r7 = r7 + 1
            goto L64
        L85:
            r6 = 2
            if (r7 <= r6) goto L23
        L88:
            r1.add(r5)
            goto L23
        L8c:
            java.lang.Object r0 = xe.s.f(r1)
            r1 = r0
            ud.e r1 = (ud.e) r1
        L93:
            mh.b r0 = he.a.f5515j
            if (r1 == 0) goto Le1
            od.a r4 = r1.f13690m
            r10.f5516g = r4
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r1.f13697t
            java.util.Iterator r5 = r5.iterator()
        La6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Ld1
            java.lang.Object r6 = r5.next()
            ud.r r6 = (ud.r) r6
            b5.k r7 = r6.f13719m
            od.d r6 = r6.f13717k
            boolean r7 = r7.h()
            if (r7 != 0) goto Lbd
            goto La6
        Lbd:
            java.lang.String r7 = r6.f9781k
            boolean r8 = r7.endsWith(r2)
            if (r8 != 0) goto Lcd
            java.lang.String r8 = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto La6
        Lcd:
            r4.add(r6)
            goto La6
        Ld1:
            r10.f5517h = r4
            int r2 = r4.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r4 = "Kotlin Intrinsics class: {}, methods: {}"
            r0.y(r1, r4, r2)
            goto Le9
        Le1:
            r1 = 0
            r10.f5516g = r1
            java.lang.String r1 = "Kotlin Intrinsics class not found"
            r0.l(r1)
        Le9:
            bc.g r11 = r11.f13742a
            int r11 = r11.W
            r0 = 3
            if (r11 != r0) goto Lf1
            r3 = 1
        Lf1:
            r10.f5518i = r3
            return
    }

    @Override // be.a
    public final boolean h(ud.e r7) {
            r6 = this;
            od.a r0 = r6.f5516g
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            java.util.List r7 = r7.f13697t
            java.util.Iterator r7 = r7.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r7.next()
            ud.r r0 = (ud.r) r0
            boolean r1 = r0.f13722p
            if (r1 != 0) goto Lc
            md.b r1 = md.b.f8848c
            md.f r2 = r0.f8877g
            boolean r1 = r2.b(r1)
            if (r1 == 0) goto L27
            goto Lc
        L27:
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            ud.p r3 = (ud.p) r3
            pd.k r4 = r3.f13713k
            pd.k r5 = pd.k.O
            if (r4 != r5) goto L3f
            r6.k(r0, r3)     // Catch: java.lang.Exception -> L55
            goto L3f
        L55:
            r3 = move-exception
            java.lang.String r4 = "Failed to extract var names"
            r0.M(r4, r3)
            goto L3f
        L5c:
            r7 = 1
            return r7
    }

    public final void k(ud.r r6, ud.p r7) {
            r5 = this;
            java.util.List r0 = r7.f13715m
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto La
            goto L4d
        La:
            r2 = r7
            pd.n r2 = (pd.n) r2
            od.d r2 = r2.f10526p
            java.util.HashSet r3 = r5.f5517h
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L18
            goto L4d
        L18:
            r2 = 0
            qd.l r3 = r7.S(r2)
            r3.getClass()
            boolean r4 = r3 instanceof qd.r
            if (r4 != 0) goto L25
            goto L4d
        L25:
            qd.r r3 = (qd.r) r3
            if (r0 != r1) goto L35
            r0 = 1
            java.lang.String r6 = j(r6, r7, r0)
            if (r6 == 0) goto L42
            boolean r2 = i(r3, r6)
            goto L42
        L35:
            r4 = 3
            if (r0 != r4) goto L42
            java.lang.String r6 = j(r6, r7, r1)
            if (r6 == 0) goto L42
            boolean r2 = i(r3, r6)
        L42:
            if (r2 == 0) goto L4d
            boolean r6 = r5.f5518i
            if (r6 == 0) goto L4d
            md.a r6 = md.a.f8838s
            r7.w(r6)
        L4d:
            return
    }
}
