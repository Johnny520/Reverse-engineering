package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends be.a implements ke.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ke.g f7590h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ke.g f7591i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a2.a f7592j = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7593g;

    static {
            ke.g r0 = new ke.g
            r1 = 3
            r0.<init>(r1)
            ke.c.f7590h = r0
            ke.g r0 = new ke.g
            r1 = 4
            r0.<init>(r1)
            ke.c.f7591i = r0
            a2.a r0 = new a2.a
            r1 = 26
            r0.<init>(r1)
            ke.c.f7592j = r0
            return
    }

    public /* synthetic */ c(int r1) {
            r0 = this;
            r0.f7593g = r1
            r0.<init>()
            return
    }

    public static java.util.IdentityHashMap i(ud.r r6, qd.s r7) {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            java.util.ArrayList r1 = r7.f10928j
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            r0.<init>(r1)
            java.util.ArrayList r7 = r7.f10928j
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r7.next()
            qd.r r1 = (qd.r) r1
            ud.p r1 = r1.f10903j
            if (r1 == 0) goto L13
            pd.k r3 = r1.f13713k
            pd.k r4 = pd.k.O
            if (r3 != r4) goto L13
            r3 = r1
            pd.n r3 = (pd.n) r3
            od.d r4 = r3.f10526p
            java.lang.String r4 = r4.f9782l
            java.lang.String r5 = "java.lang.String.equals(Ljava/lang/Object;)Z"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L13
            qd.l r3 = r3.S(r2)
            ud.e r4 = r6.f13718l
            ud.u r4 = r4.f13688k
            java.lang.Object r3 = xe.m.e(r4, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L13
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r1, r3)
            goto L13
        L4e:
            return r0
    }

    public static qd.r j(ud.p r2) {
            if (r2 == 0) goto L26
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.O
            if (r0 == r1) goto L9
            goto L26
        L9:
            pd.n r2 = (pd.n) r2
            od.d r0 = r2.f10526p
            java.lang.String r0 = r0.f9782l
            java.lang.String r1 = "java.lang.String.hashCode()I"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L26
        L18:
            qd.l r2 = r2.k0()
            if (r2 == 0) goto L26
            boolean r0 = r2 instanceof qd.r
            if (r0 != 0) goto L23
            goto L26
        L23:
            qd.r r2 = (qd.r) r2
            return r2
        L26:
            r2 = 0
            return r2
    }

    public static qd.r k(qd.l r1) {
            r1.getClass()
            boolean r0 = r1 instanceof qd.r
            if (r0 == 0) goto L12
            qd.r r1 = (qd.r) r1
            ud.p r1 = r1.f0()
            qd.r r1 = j(r1)
            return r1
        L12:
            boolean r0 = r1 instanceof qd.m
            if (r0 == 0) goto L1f
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            qd.r r1 = j(r1)
            return r1
        L1f:
            r1 = 0
            return r1
    }

    public static void l(yd.c r2) {
            ud.j r0 = r2.f22423n
            if (r0 == 0) goto L16
            yd.b r0 = r2.f22417k
            if (r0 == 0) goto Le
            yd.b r0 = yd.b.K(r0)
            r2.f22417k = r0
        Le:
            ud.j r0 = r2.f22422m
            ud.j r1 = r2.f22423n
            r2.f22422m = r1
            r2.f22423n = r0
        L16:
            return
    }

    public static boolean m(ud.j r3) {
            boolean r0 = r3 instanceof yd.c
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r3 instanceof ud.n
            r2 = 0
            if (r0 == 0) goto L20
            ud.n r3 = (ud.n) r3
            java.util.List r3 = r3.u()
            int r0 = r3.size()
            if (r0 != r1) goto L20
            java.lang.Object r3 = r3.get(r2)
            boolean r3 = r3 instanceof yd.c
            if (r3 == 0) goto L20
            return r1
        L20:
            return r2
    }

    public static boolean n(ud.r r4, ud.j r5) {
            r0 = 0
            if (r5 != 0) goto L5
            goto L82
        L5:
            r1 = r5
            md.e r1 = (md.e) r1
            md.f r1 = r1.f8877g
            md.a r2 = md.a.f8833n
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != 0) goto L83
            boolean r1 = r5 instanceof ud.a
            if (r1 == 0) goto L3c
            r1 = r5
            ud.a r1 = (ud.a) r1
            ud.a r3 = r4.C
            if (r1 != r3) goto L1f
            goto L27
        L1f:
            java.util.List r1 = r1.f13676n
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L29
        L27:
            r1 = r2
            goto L3d
        L29:
            int r3 = r1.size()
            if (r3 != r2) goto L3c
            java.lang.Object r1 = r1.get(r0)
            ud.a r1 = (ud.a) r1
            java.util.List r1 = r1.f13676n
            boolean r1 = r1.isEmpty()
            goto L3d
        L3c:
            r1 = r0
        L3d:
            if (r1 == 0) goto L40
            goto L83
        L40:
            boolean r1 = r5 instanceof ud.n
            if (r1 == 0) goto L82
            ud.n r5 = (ud.n) r5
            java.util.List r5 = r5.u()
            int r1 = r5.size()
            if (r1 != r2) goto L82
            java.lang.Object r5 = r5.get(r0)
            ud.j r5 = (ud.j) r5
            boolean r1 = r5 instanceof ud.a
            if (r1 == 0) goto L7e
            ud.a r5 = (ud.a) r5
            ud.a r4 = r4.C
            if (r5 != r4) goto L61
            goto L69
        L61:
            java.util.List r4 = r5.f13676n
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L6b
        L69:
            r4 = r2
            goto L7f
        L6b:
            int r5 = r4.size()
            if (r5 != r2) goto L7e
            java.lang.Object r4 = r4.get(r0)
            ud.a r4 = (ud.a) r4
            java.util.List r4 = r4.f13676n
            boolean r4 = r4.isEmpty()
            goto L7f
        L7e:
            r4 = r0
        L7f:
            if (r4 == 0) goto L82
            goto L83
        L82:
            return r0
        L83:
            return r2
    }

    public static void o(hb.r r5) {
            java.lang.Object r0 = r5.f5455b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r5.f5457d     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            ae.e r2 = new ae.e     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            r3 = 21
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            r1.forEach(r2)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.lang.Object r1 = r5.f5461h     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            xd.d r1 = (xd.d) r1     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            md.a r2 = md.a.f8840u
            if (r1 == 0) goto L31
            java.lang.Object r3 = r5.f5456c     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            xd.d r3 = (xd.d) r3     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            ud.n r3 = r3.f21538i     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.util.List r3 = r3.u()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            r3.remove(r1)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            ud.a r1 = r1.f21543k     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            r1.w(r2)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            goto L31
        L2d:
            r5 = move-exception
            goto L7c
        L2f:
            r5 = move-exception
            goto L7c
        L31:
            java.lang.Object r5 = r5.f5462i     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            qd.r r5 = (qd.r) r5     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            if (r5 == 0) goto L78
            qd.s r5 = r5.f10923m     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            qd.k r5 = r5.b()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.util.List r5 = r5.f10896c     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
        L43:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            if (r1 == 0) goto L78
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            qd.s r1 = (qd.s) r1     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            qd.r r3 = r1.f10927i     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            ud.p r3 = r3.f10903j     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            if (r3 == 0) goto L58
            r3.w(r2)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
        L58:
            java.util.ArrayList r3 = r1.f10928j     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
        L5e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            qd.r r4 = (qd.r) r4     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            ud.p r4 = r4.f10903j     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            if (r4 == 0) goto L5e
            r4.w(r2)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            goto L5e
        L72:
            java.util.List r3 = r0.D     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            r3.remove(r1)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            goto L43
        L78:
            xe.l.f(r0)     // Catch: java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            return
        L7c:
            java.lang.String r1 = "Failed to clean up code after switch over string restore"
            r0.M(r1, r5)
            return
    }

    public static boolean p(hb.r r16) {
            r0 = r16
            java.lang.Object r1 = r0.f5455b
            ud.r r1 = (ud.r) r1
            java.lang.Object r2 = r0.f5456c
            xd.d r2 = (xd.d) r2
            ud.n r3 = r2.f21538i
            java.util.List r3 = r3.u()
            int r2 = r3.indexOf(r2)
            r4 = -1
            r6 = 1
            if (r2 == r4) goto L27
            int r2 = r2 + r6
            int r4 = r3.size()
            if (r2 < r4) goto L20
            goto L27
        L20:
            java.lang.Object r2 = r3.get(r2)
            ud.j r2 = (ud.j) r2
            goto L28
        L27:
            r2 = 0
        L28:
            boolean r3 = r2 instanceof xd.d
            r4 = 0
            if (r3 != 0) goto L2f
            goto L222
        L2f:
            xd.d r2 = (xd.d) r2
            ud.a r3 = r2.f21543k
            ud.p r3 = a.a.c0(r3)
            if (r3 == 0) goto L40
            pd.k r7 = r3.f13713k
            pd.k r8 = pd.k.f10514w
            if (r7 != r8) goto L40
            goto L41
        L40:
            r3 = 0
        L41:
            if (r3 == 0) goto L222
            qd.l r7 = r3.S(r4)
            r7.getClass()
            boolean r7 = r7 instanceof qd.r
            if (r7 != 0) goto L50
            goto L222
        L50:
            qd.l r7 = r3.S(r4)
            qd.r r7 = (qd.r) r7
            java.lang.Object r8 = r0.f5459f
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r9 = r8.iterator()
            r10 = r4
        L5f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L101
            java.lang.Object r11 = r9.next()
            ke.l r11 = (ke.l) r11
            ud.j r12 = r11.f7606b
            if (r12 == 0) goto L9a
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            be.m0 r14 = new be.m0
            r15 = 7
            r14.<init>(r15, r13)
            ke.a r15 = new ke.a
            r5 = 2
            r15.<init>(r14, r5)
            x6.d.h0(r1, r15, r12)
            ce.n r5 = new ce.n
            r12 = 14
            r5.<init>(r12)
            r13.removeIf(r5)
            int r5 = r13.size()
            if (r5 != r6) goto Lc6
            java.lang.Object r5 = r13.get(r4)
            ud.p r5 = (ud.p) r5
            goto Lc7
        L9a:
            ud.a r5 = r11.f7607c
            if (r5 == 0) goto Lc6
            qd.l r12 = r3.S(r4)
            r12.getClass()
            boolean r13 = r12 instanceof qd.r
            if (r13 == 0) goto Lc6
            qd.r r12 = (qd.r) r12
            qd.s r12 = r12.f10923m
            qd.r r12 = r12.f10927i
            ud.p r12 = r12.f10903j
            if (r12 == 0) goto Lc6
            pd.k r13 = r12.f13713k
            pd.k r14 = pd.k.X
            if (r13 != r14) goto Lc6
            pd.q r12 = (pd.q) r12
            qd.r r5 = r12.k0(r5)
            if (r5 == 0) goto Lc6
            ud.p r5 = r5.f0()
            goto Lc7
        Lc6:
            r5 = 0
        Lc7:
            if (r5 == 0) goto Lf4
            java.util.List r12 = r5.f13715m
            int r12 = r12.size()
            if (r12 == r6) goto Ld2
            goto Lf4
        Ld2:
            ud.e r12 = r1.f13718l
            ud.u r12 = r12.f13688k
            qd.l r13 = r5.S(r4)
            java.lang.Object r12 = xe.m.e(r12, r13)
            boolean r13 = r12 instanceof qd.n
            if (r13 == 0) goto Lf4
            qd.r r5 = r5.f13714l
            boolean r5 = r7.g0(r5)
            if (r5 == 0) goto Lf4
            qd.n r12 = (qd.n) r12
            long r12 = r12.f10905l
            int r5 = (int) r12
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto Lf5
        Lf4:
            r5 = 0
        Lf5:
            if (r5 == 0) goto L5f
            int r5 = r5.intValue()
            r11.f7608d = r5
            int r10 = r10 + 1
            goto L5f
        L101:
            if (r10 != 0) goto L104
            return r6
        L104:
            int r3 = r8.size()
            if (r10 == r3) goto L10c
            goto L222
        L10c:
            ae.a r3 = new ae.a
            r5 = 11
            r3.<init>(r5)
            java.util.Comparator r3 = java.util.Comparator.comparingInt(r3)
            r8.sort(r3)
            java.util.HashMap r3 = new java.util.HashMap
            int r5 = r8.size()
            r3.<init>(r5)
            java.util.Iterator r5 = r8.iterator()
        L127:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L156
            java.lang.Object r8 = r5.next()
            ke.l r8 = (ke.l) r8
            int r9 = r8.f7608d
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r3.put(r9, r8)
            ke.l r9 = (ke.l) r9
            if (r9 == 0) goto L143
            goto L222
        L143:
            ud.j r8 = r8.f7606b
            ae.g r9 = new ae.g
            r10 = 9
            r9.<init>(r0, r10)
            ke.a r10 = new ke.a
            r11 = 2
            r10.<init>(r9, r11)
            x6.d.h0(r1, r10, r8)
            goto L127
        L156:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r5 = r2.f21544l
            java.util.Iterator r5 = r5.iterator()
        L161:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L21b
            java.lang.Object r8 = r5.next()
            xd.c r8 = (xd.c) r8
            java.util.List r9 = r8.f21540a
            ud.j r8 = r8.f21541b
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L176:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L216
            java.lang.Object r11 = r9.next()
            boolean r12 = r11 instanceof java.lang.Integer
            if (r12 == 0) goto L188
            r12 = r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L1a6
        L188:
            boolean r12 = r11 instanceof ud.g
            if (r12 == 0) goto L1a5
            r12 = r11
            ud.g r12 = (ud.g) r12
            oc.c r13 = oc.c.f9760f
            md.f r12 = r12.f8877g
            oc.b r12 = r12.c(r13)
            nc.a r12 = (nc.a) r12
            if (r12 == 0) goto L1a5
            int r13 = r12.f9341g
            r14 = 6
            if (r13 != r14) goto L1a5
            java.lang.Object r12 = r12.f9342h
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L1a6
        L1a5:
            r12 = 0
        L1a6:
            if (r12 == 0) goto L1c8
            java.lang.Object r11 = r3.remove(r12)
            ke.l r11 = (ke.l) r11
            if (r11 != 0) goto L1b2
            goto L222
        L1b2:
            java.util.ArrayList r11 = r11.f7605a
            if (r10 != 0) goto L1c2
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r11)
            xd.c r11 = new xd.c
            r11.<init>(r10, r8)
            r10 = r11
            goto L176
        L1c2:
            java.util.List r12 = r10.f21540a
            r12.addAll(r11)
            goto L176
        L1c8:
            uf.d r12 = xd.d.f21542m
            if (r11 != r12) goto L222
            java.util.Set r11 = r3.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L1d4:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L201
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r12 = r12.getValue()
            ke.l r12 = (ke.l) r12
            if (r10 != 0) goto L1f6
            java.util.ArrayList r10 = new java.util.ArrayList
            java.util.ArrayList r12 = r12.f7605a
            r10.<init>(r12)
            xd.c r12 = new xd.c
            r12.<init>(r10, r8)
            r10 = r12
            goto L1fd
        L1f6:
            java.util.List r13 = r10.f21540a
            java.util.ArrayList r12 = r12.f7605a
            r13.addAll(r12)
        L1fd:
            r11.remove()
            goto L1d4
        L201:
            if (r10 != 0) goto L20d
            xd.c r10 = new xd.c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.<init>(r11, r8)
        L20d:
            java.util.List r11 = r10.f21540a
            uf.d r12 = xd.d.f21542m
            r11.add(r12)
            goto L176
        L216:
            r1.add(r10)
            goto L161
        L21b:
            r0.f5461h = r2
            r0.f5462i = r7
            r0.f5460g = r1
            return r6
        L222:
            return r4
    }

    public static void q(ud.r r2) {
            boolean r0 = r2.f13722p
            if (r0 != 0) goto L14
            java.util.List r0 = r2.f13732z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L14
        Ld:
            ke.g r0 = ke.c.f7590h
            xd.b r1 = r2.G
            x6.d.h0(r2, r0, r1)
        L14:
            return
    }

    public static void r(ud.r r3) {
            ke.g r0 = ke.g.f7596l
            xd.b r1 = r3.G
            x6.d.h0(r3, r0, r1)
            md.a r1 = md.a.f8814b0
            md.f r2 = r3.f8877g
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L14
            be.b.Y(r3)
        L14:
            x6.d.i0(r3, r0)
            ke.g r0 = ke.c.f7591i
            xd.b r1 = r3.G
            x6.d.h0(r3, r0, r1)
            a2.a r0 = ke.c.f7592j
            x6.d.i0(r3, r0)
            return
    }

    @Override // ke.d
    public boolean c(ud.r r14, ud.n r15) {
            r13 = this;
            boolean r0 = r15 instanceof xd.d
            r1 = 0
            if (r0 == 0) goto Lde
            xd.d r15 = (xd.d) r15
            ud.a r0 = r15.f21543k
            java.lang.String r2 = "Failed to restore switch over string. Please report as a decompilation issue"
            java.util.ArrayList r3 = r15.f21544l     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            pd.k r4 = pd.k.f10514w     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            ud.p r5 = a.a.c0(r0)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r5 == 0) goto L1a
            pd.k r6 = r5.f13713k     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r6 != r4) goto L1a
            goto L1b
        L1a:
            r5 = 0
        L1b:
            if (r5 != 0) goto L1f
            goto Lde
        L1f:
            qd.l r4 = r5.S(r1)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            qd.r r4 = k(r4)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r4 != 0) goto L2b
            goto Lde
        L2b:
            int r6 = r3.size()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.stream.Stream r7 = r3.stream()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            ce.n r8 = new ce.n     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r9 = 13
            r8.<init>(r9)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            boolean r7 = r7.anyMatch(r8)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r7 == 0) goto L43
            int r7 = r6 + (-1)
            goto L44
        L43:
            r7 = r6
        L44:
            qd.s r8 = r4.f10923m     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.ArrayList r9 = r8.f10928j     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            int r9 = r9.size()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r10 = 1
            int r9 = r9 - r10
            if (r9 >= r7) goto L52
            goto Lde
        L52:
            java.util.IdentityHashMap r8 = i(r14, r8)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            int r9 = r8.size()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r9 >= r7) goto L5e
            goto Lde
        L5e:
            hb.r r7 = new hb.r     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r7.<init>(r14, r15)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r7.f5458e = r8     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r8.<init>(r6)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r7.f5459f = r8     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
        L70:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r6 == 0) goto L8a
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            xd.c r6 = (xd.c) r6     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            boolean r6 = r13.s(r7, r6)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r6 != 0) goto L70
            r14.L(r2)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            return r1
        L86:
            r15 = move-exception
            goto Ldb
        L88:
            r15 = move-exception
            goto Ldb
        L8a:
            boolean r3 = p(r7)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r3 != 0) goto L94
            r14.L(r2)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            return r1
        L94:
            ud.n r3 = r15.f21538i     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            xd.d r6 = new xd.d     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r6.<init>(r3, r0)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.lang.Object r0 = r7.f5460g     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
        La3:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r8 == 0) goto Lc2
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            xd.c r8 = (xd.c) r8     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.List r9 = r8.f21540a     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            ud.j r8 = r8.f21541b     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            java.util.ArrayList r11 = r6.f21544l     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            xd.c r12 = new xd.c     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r12.<init>(r9, r8)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r11.add(r12)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            goto La3
        Lc2:
            boolean r15 = r3.l(r15, r6)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            if (r15 != 0) goto Lcc
            r14.L(r2)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            return r1
        Lcc:
            o(r7)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            qd.l r15 = r5.S(r1)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            qd.r r0 = r4.c0()     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            r5.b0(r15, r0)     // Catch: java.lang.Exception -> L86 java.lang.StackOverflowError -> L88
            return r10
        Ldb:
            r14.M(r2, r15)
        Lde:
            return r1
    }

    @Override // be.a
    public java.lang.String e() {
            r1 = this;
            int r0 = r1.f7593g
            switch(r0) {
                case 2: goto Ld;
                case 3: goto L5;
                case 4: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.e()
            return r0
        La:
            java.lang.String r0 = "SwitchBreakVisitor"
            return r0
        Ld:
            java.lang.String r0 = "RegionMakerVisitor"
            return r0
    }

    @Override // be.a
    public final void g(ud.r r20) {
            r19 = this;
            r1 = r19
            r2 = r20
            int r0 = r1.f7593g
            r3 = 3
            nd.c r4 = nd.c.f9353g
            r5 = 1
            switch(r0) {
                case 0: goto L409;
                case 1: goto L400;
                case 2: goto L65;
                case 3: goto L54;
                case 4: goto L18;
                default: goto Ld;
            }
        Ld:
            boolean r0 = nd.d.b(r2, r4)
            if (r0 != 0) goto L14
            goto L17
        L14:
            x6.d.i0(r2, r1)
        L17:
            return
        L18:
            boolean r0 = nd.d.b(r2, r4)
            if (r0 == 0) goto L53
            ha.p r0 = new ha.p
            r4 = 2
            r0.<init>(r4)
            ke.a r4 = new ke.a
            r4.<init>(r0, r5)
            xd.b r0 = r2.G
            x6.d.h0(r2, r4, r0)
            ha.p r0 = new ha.p
            r0.<init>(r3)
            ke.a r3 = new ke.a
            r3.<init>(r0, r5)
            xd.b r0 = r2.G
            x6.d.h0(r2, r3, r0)
            md.f r0 = r2.f8877g
            md.a r3 = md.a.f8813a0
            boolean r0 = r0.a(r3)
            if (r0 == 0) goto L53
            r(r2)     // Catch: java.lang.Throwable -> L4e
            r2.D(r3)
            goto L53
        L4e:
            r0 = move-exception
            r2.D(r3)
            throw r0
        L53:
            return
        L54:
            boolean r0 = r2.Z()
            if (r0 == 0) goto L64
            ke.j r0 = new ke.j
            r0.<init>(r3)
            xd.b r3 = r2.G
            x6.d.h0(r2, r0, r3)
        L64:
            return
        L65:
            boolean r0 = r2.f13722p
            if (r0 != 0) goto L3ff
            java.util.List r0 = r2.f13732z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L73
            goto L3ff
        L73:
            i4.y r0 = new i4.y
            r0.<init>(r2)
            java.lang.Object r3 = r0.f6496d
            le.c r3 = (le.c) r3
            ud.a r4 = r2.B
            xd.b r4 = r0.b(r4)
            r2.G = r4
            java.util.List r4 = r2.E
            boolean r4 = r4.isEmpty()
            r6 = 0
            md.b r8 = md.b.f8865t
            if (r4 != 0) goto L292
            java.util.List r4 = r2.E
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L99
            goto L292
        L99:
            md.f r4 = r2.f8877g
            java.util.List r4 = r4.d(r8)
            java.util.Iterator r9 = r4.iterator()
        La3:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L204
            java.lang.Object r10 = r9.next()
            ae.h r10 = (ae.h) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.List r10 = r10.f244h
            int r12 = r10.size()
            r11.<init>(r12)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.Iterator r13 = r10.iterator()
        Lc3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lec
            java.lang.Object r14 = r13.next()
            ae.f r14 = (ae.f) r14
            ud.a r15 = r14.f234c
            if (r15 == 0) goto Lde
            r11.add(r15)
            ud.a r14 = a.a.j0(r15)
            r12.add(r14)
            goto Lc3
        Lde:
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r15 = "No exception handler block: "
            java.lang.String r14 = r15.concat(r14)
            r2.I(r14)
            goto Lc3
        Lec:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        Lf5:
            boolean r14 = r12.hasNext()
            md.a r15 = md.a.f8840u
            if (r14 == 0) goto L14b
            java.lang.Object r14 = r12.next()
            ud.a r14 = (ud.a) r14
            java.util.Iterator r16 = r11.iterator()
        L107:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto Lf5
            java.lang.Object r17 = r16.next()
            r5 = r17
            ud.a r5 = (ud.a) r5
            md.f r7 = r5.f8877g
            boolean r7 = r7.a(r15)
            if (r7 == 0) goto L11f
        L11d:
            r5 = 1
            goto L107
        L11f:
            java.util.List r7 = r14.f13676n
            boolean r18 = r7.isEmpty()
            if (r18 == 0) goto L135
            java.lang.String r5 = java.lang.String.valueOf(r14)
            java.lang.String r7 = "No successors for splitter: "
            java.lang.String r5 = r7.concat(r5)
            r2.I(r5)
            goto L11d
        L135:
            java.lang.Object r7 = r7.get(r6)
            ud.a r7 = (ud.a) r7
            ud.a r6 = a.a.h0(r2, r7, r5)
            if (r6 == 0) goto L148
            if (r6 == r7) goto L148
            if (r6 == r5) goto L148
            r13.add(r6)
        L148:
            r5 = 1
            r6 = 0
            goto L107
        L14b:
            java.util.Iterator r5 = r10.iterator()
        L14f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L200
            java.lang.Object r6 = r5.next()
            ae.f r6 = (ae.f) r6
            ud.a r7 = r6.f234c
            if (r7 != 0) goto L160
            goto L14f
        L160:
            java.util.ArrayDeque r10 = r3.f8016a
            r10.clear()
            le.b r10 = new le.b
            r10.<init>()
            r3.f8017b = r10
            boolean r10 = r6.f239h
            if (r10 == 0) goto L175
            ud.a r10 = a.a.j0(r7)
            goto L18a
        L175:
            java.util.Iterator r10 = r13.iterator()
        L179:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L189
            java.lang.Object r11 = r10.next()
            ud.a r11 = (ud.a) r11
            r3.a(r11)
            goto L179
        L189:
            r10 = r7
        L18a:
            md.f r11 = r10.f8877g
            boolean r11 = r11.a(r15)
            if (r11 == 0) goto L193
            goto L14f
        L193:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            ud.a r12 = a.a.k0(r6, r2)
            if (r12 == 0) goto L1a2
            r11.add(r12)
            goto L1ab
        L1a2:
            java.util.BitSet r10 = r10.f13680r
            java.util.List r10 = a.a.q(r2, r10)
            r11.addAll(r10)
        L1ab:
            nd.t r10 = r2.U(r7)
            if (r10 == 0) goto L1b3
            r10 = 1
            goto L1b4
        L1b3:
            r10 = 0
        L1b4:
            java.util.Iterator r11 = r11.iterator()
        L1b8:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1d8
            java.lang.Object r12 = r11.next()
            ud.a r12 = (ud.a) r12
            if (r10 == 0) goto L1cc
            boolean r14 = a.a.s0(r7, r12)
            if (r14 == 0) goto L1b8
        L1cc:
            xd.b r14 = r2.G
            boolean r14 = f8.i.Z(r12, r14)
            if (r14 == 0) goto L1b8
            r3.a(r12)
            goto L1b8
        L1d8:
            xd.b r10 = r0.b(r7)
            r6.f236e = r10
            md.b r10 = md.b.E
            md.f r11 = r7.f8877g
            oc.b r10 = r11.c(r10)
            ae.c r10 = (ae.c) r10
            if (r10 != 0) goto L1f9
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String r7 = "Missing exception handler attribute for start block: "
            java.lang.String r6 = r7.concat(r6)
            r2.K(r6)
            goto L14f
        L1f9:
            xd.b r6 = r6.f236e
            r6.y(r10)
            goto L14f
        L200:
            r5 = 1
            r6 = 0
            goto La3
        L204:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            xd.b r6 = r2.G
            f8.i.y(r6, r5)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L217:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L24c
            java.lang.Object r7 = r4.next()
            ae.h r7 = (ae.h) r7
            java.util.List r7 = r7.f244h
            java.util.Iterator r7 = r7.iterator()
        L229:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L217
            java.lang.Object r9 = r7.next()
            ae.f r9 = (ae.f) r9
            xd.b r9 = r9.f236e
            if (r9 == 0) goto L229
            ud.h r10 = f8.i.D(r9)
            boolean r11 = r10 instanceof ud.a
            if (r11 == 0) goto L248
            ud.a r10 = (ud.a) r10
            java.util.List r10 = r10.f13676n
            r6.addAll(r10)
        L248:
            f8.i.y(r9, r5)
            goto L229
        L24c:
            r6.removeAll(r5)
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L257
            r4 = 0
            goto L28b
        L257:
            xd.b r4 = new xd.b
            xd.b r5 = r2.G
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L262:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L28b
            java.lang.Object r6 = r5.next()
            ud.h r6 = (ud.h) r6
            boolean r7 = r6 instanceof ud.a
            if (r7 == 0) goto L262
            java.util.ArrayDeque r7 = r3.f8016a
            r7.clear()
            le.b r7 = new le.b
            r7.<init>()
            r3.f8017b = r7
            r3.c(r4)
            ud.a r6 = (ud.a) r6
            xd.b r6 = r0.b(r6)
            r4.H(r6)
            goto L262
        L28b:
            if (r4 == 0) goto L292
            xd.b r0 = r2.G
            r0.H(r4)
        L292:
            java.util.List r0 = r2.f13732z
            java.util.stream.Stream r0 = r0.stream()
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 26
            r3.<init>(r4)
            java.util.stream.Stream r0 = r0.flatMap(r3)
            ce.n r3 = new ce.n
            r4 = 11
            r3.<init>(r4)
            boolean r0 = r0.anyMatch(r3)
            if (r0 == 0) goto L2b3
            be.b.Y(r2)
        L2b3:
            boolean r0 = r2.f13722p
            if (r0 != 0) goto L34f
            java.util.List r0 = r2.E
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2c1
            goto L34f
        L2c1:
            md.f r0 = r2.f8877g
            java.util.List r0 = r0.d(r8)
            boolean r3 = r0.isEmpty()
            r4 = 5
            if (r3 == 0) goto L2d1
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            goto L2df
        L2d1:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            b8.c r0 = new b8.c
            r0.<init>(r4)
            r3.sort(r0)
            r0 = r3
        L2df:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2e6
            goto L34f
        L2e6:
            ke.h r3 = new ke.h
            r5 = 0
            r3.<init>(r0, r5)
            java.util.List r0 = r2.f13732z
            int r0 = r0.size()
            int r0 = r0 * r4
            r4 = 0
        L2f4:
            xd.b r5 = r2.G
            boolean r5 = x6.d.j0(r2, r3, r5)
            if (r5 != 0) goto L316
            java.util.List r6 = r2.E
            java.util.Iterator r6 = r6.iterator()
        L302:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L316
            java.lang.Object r5 = r6.next()
            ae.f r5 = (ae.f) r5
            xd.b r5 = r5.f236e
            boolean r5 = x6.d.j0(r2, r3, r5)
            if (r5 == 0) goto L302
        L316:
            int r6 = r4 + 1
            if (r4 > r0) goto L31f
            if (r5 != 0) goto L31d
            goto L34f
        L31d:
            r4 = r6
            goto L2f4
        L31f:
            af.g r3 = new af.g
            java.lang.Class<ke.h> r4 = ke.h.class
            java.lang.String r4 = r4.getName()
            java.util.List r2 = r2.f13732z
            int r2 = r2.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Iterative traversal limit reached: limit: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", visitor: "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", blocks count: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0)
            throw r3
        L34f:
            ke.g r0 = ke.g.f7595k
            xd.b r3 = r2.G
            x6.d.h0(r2, r0, r3)
            q(r2)
            b5.k r0 = r2.f13719m
            int r0 = r0.f488b
            r3 = 131104(0x20020, float:1.83716E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L3ff
            int r0 = le.f.f8023b
            xd.b r0 = r2.G
            java.util.ArrayList r3 = r0.f21539k
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3ff
            r5 = 0
            java.lang.Object r4 = r3.get(r5)
            boolean r4 = r4 instanceof xd.e
            if (r4 == 0) goto L3ff
            java.lang.Object r3 = r3.get(r5)
            xd.e r3 = (xd.e) r3
            ud.p r4 = r3.f21545k
            qd.l r6 = r4.S(r5)
            b5.k r5 = r2.f13719m
            boolean r5 = r5.h()
            if (r5 == 0) goto L3c7
            r6.getClass()
            boolean r5 = r6 instanceof qd.m
            if (r5 == 0) goto L3b9
            boolean r7 = r6.K()
            if (r7 == 0) goto L3b9
            if (r5 == 0) goto L3a1
            r5 = r6
            qd.m r5 = (qd.m) r5
            ud.p r7 = r5.f10904l
            goto L3a2
        L3a1:
            r7 = 0
        L3a2:
            pd.k r5 = r7.f13713k
            pd.k r8 = pd.k.f10500i
            if (r5 != r8) goto L3b9
            pd.c r7 = (pd.c) r7
            qd.j r5 = r7.f10476o
            ud.e r7 = r2.f13718l
            qd.j r7 = r7.b0()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L3b9
            goto L3cd
        L3b9:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "In static synchronized method top region not synchronized by class const: "
            java.lang.String r0 = r3.concat(r0)
            r2.L(r0)
            goto L3ff
        L3c7:
            boolean r5 = r6.N()
            if (r5 == 0) goto L3f2
        L3cd:
            java.util.ArrayList r0 = r0.f21539k
            xd.b r5 = r3.f21547m
            r6 = 0
            r0.set(r6, r5)
            xe.l.d(r2, r4)
            java.util.ArrayList r0 = r3.f21546l
            java.util.Iterator r0 = r0.iterator()
        L3de:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3ee
            java.lang.Object r3 = r0.next()
            ud.p r3 = (ud.p) r3
            xe.l.d(r2, r3)
            goto L3de
        L3ee:
            q(r2)
            goto L3ff
        L3f2:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r3 = "In synchronized method top region not synchronized by 'this': "
            java.lang.String r0 = r3.concat(r0)
            r2.L(r0)
        L3ff:
            return
        L400:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L405
            goto L408
        L405:
            r(r2)
        L408:
            return
        L409:
            q(r2)
            return
    }

    public boolean s(hb.r r6, xd.c r7) {
            r5 = this;
            java.util.List r0 = r7.f21540a
            int r1 = r0.size()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L14
            java.lang.Object r0 = r0.get(r3)
            uf.d r1 = xd.d.f21542m
            if (r0 != r1) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r3
        L15:
            ud.j r7 = r7.f21541b
            if (r0 == 0) goto L1f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r2
        L1f:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r3)
            java.lang.Object r1 = r6.f5455b
            ud.r r1 = (ud.r) r1
            ce.a r3 = new ce.a
            r3.<init>(r5, r0, r6)
            ke.a r6 = new ke.a
            r4 = 4
            r6.<init>(r3, r4)
            x6.d.h0(r1, r6, r7)
            boolean r6 = r0.get()
            r6 = r6 ^ r2
            return r6
    }
}
