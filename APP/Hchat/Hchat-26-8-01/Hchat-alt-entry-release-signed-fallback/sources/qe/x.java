package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mh.b f10999e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.u f11000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.EnumMap f11001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qe.k f11002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bc.g f11003d;

    static {
            java.lang.Class<qe.x> r0 = qe.x.class
            mh.b r0 = mh.d.b(r0)
            qe.x.f10999e = r0
            return
    }

    public x(ud.u r4) {
            r3 = this;
            r3.<init>()
            r3.f11000a = r4
            bc.g r0 = r4.f13742a
            r3.f11003d = r0
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<pd.k> r1 = pd.k.class
            r0.<init>(r1)
            qe.t r1 = new qe.t
            r2 = 0
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10498g
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 2
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10504m
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 3
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.X
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 4
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.G
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 5
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.H
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 6
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10513v
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 7
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10501j
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 8
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10502k
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 8
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.f10503l
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 9
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.A
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 1
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.O
            r0.put(r2, r1)
            qe.t r1 = new qe.t
            r2 = 1
            r1.<init>(r3, r2)
            pd.k r2 = pd.k.S
            r0.put(r2, r1)
            r3.f11001b = r0
            qe.k r0 = new qe.k
            r0.<init>(r4)
            r3.f11002c = r0
            return
    }

    public static int a(qe.x r8, f5.g r9, ud.p r10, qd.l r11, qd.j r12) {
            ud.u r0 = r8.f11000a
            r3 = r10
            pd.b r3 = (pd.b) r3
            boolean r10 = h(r3, r11)
            if (r10 == 0) goto Lc
            goto L65
        Lc:
            qd.l r10 = r3.k0()
            if (r10 != r11) goto L65
            fe.a r10 = r0.f13749h
            ud.m r10 = r10.g(r3)
            if (r10 != 0) goto L1b
            goto L65
        L1b:
            fe.a r11 = r0.f13750i
            java.lang.Object r0 = r9.f3299d
            ud.r r0 = (ud.r) r0
            r11.getClass()
            java.util.Set r5 = fe.a.e(r0)
            java.util.Map r0 = r11.i(r12)
            qd.j r1 = r10.e()
            java.util.List r10 = r10.c()
            int r4 = r10.size()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L51
            qe.u r6 = new qe.u
            r6.<init>(r1)
            bc.j r7 = new bc.j
            r11 = 11
            r7.<init>(r10, r11)
            r1 = r8
            r2 = r9
            int r8 = r1.d(r2, r3, r4, r5, r6, r7)
            return r8
        L51:
            r2 = r1
            r1 = r8
            r8 = r2
            r2 = r9
            qe.v r6 = new qe.v
            r6.<init>(r11, r8, r0)
            d4.b r7 = new d4.b
            r8 = 2
            r7.<init>(r11, r12, r10, r8)
            int r8 = r1.d(r2, r3, r4, r5, r6, r7)
            return r8
        L65:
            r8 = 2
            return r8
    }

    public static boolean e(qd.j r2, qd.j r3) {
            qd.h r0 = qd.j.f10887u
            if (r2 != r0) goto L5
            goto L48
        L5:
            r3.getClass()
            boolean r0 = r3 instanceof qd.a
            r2.getClass()
            boolean r1 = r2 instanceof qd.a
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            qd.j r2 = r2.g()
            qd.j r3 = r3.g()
            boolean r2 = e(r2, r3)
            return r2
        L20:
            if (r0 == 0) goto L2b
            qd.q r0 = qd.q.f10916s
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L2b
            goto L48
        L2b:
            boolean r0 = r3.v()
            if (r0 == 0) goto L3a
            qd.q r0 = qd.q.f10915r
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L3a
            goto L48
        L3a:
            boolean r0 = r3 instanceof qd.g
            if (r0 == 0) goto L4a
            qd.q r3 = r3.o()
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L4a
        L48:
            r2 = 1
            return r2
        L4a:
            r2 = 0
            return r2
    }

    public static qd.j g(java.util.Set r3, qd.j r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L24
        L4:
            boolean r1 = r4 instanceof qd.i
            if (r1 == 0) goto L9
            return r0
        L9:
            boolean r1 = r4.c()
            if (r1 == 0) goto L25
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L16
            goto L24
        L16:
            qe.w r1 = new qe.w
            r2 = 0
            r1.<init>(r3, r2)
            java.lang.Object r3 = r4.C(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            return r4
    }

    public static boolean h(ud.p r0, qd.l r1) {
            qd.r r0 = r0.f13714l
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int b(f5.g r5, ud.p r6, qd.l r7, qd.j r8) {
            r4 = this;
            boolean r0 = h(r6, r7)
            if (r0 != 0) goto Ld
            qd.r r6 = r6.f13714l
            int r5 = r4.k(r5, r6, r8)
            return r5
        Ld:
            java.util.List r6 = r6.f13715m
            java.util.Iterator r6 = r6.iterator()
            r0 = 1
            r1 = r0
        L15:
            boolean r2 = r6.hasNext()
            r3 = 2
            if (r2 == 0) goto L30
            java.lang.Object r2 = r6.next()
            qd.l r2 = (qd.l) r2
            if (r2 != r7) goto L25
            goto L15
        L25:
            int r2 = r4.k(r5, r2, r8)
            if (r2 != r0) goto L2c
            return r2
        L2c:
            if (r2 == r3) goto L15
            r1 = 0
            goto L15
        L30:
            if (r1 == 0) goto L33
            return r3
        L33:
            r5 = 3
            return r5
    }

    public final int c(ud.r r4, qd.s r5, qd.j r6, qe.a0 r7) {
            r3 = this;
            r0 = 1
            if (r6 == 0) goto L52
            boolean r1 = r6.w()     // Catch: java.lang.Exception -> L3e
            if (r1 != 0) goto La
            goto L52
        La:
            f5.g r1 = new f5.g     // Catch: java.lang.Exception -> L3e
            bc.g r2 = r3.f11003d     // Catch: java.lang.Exception -> L3e
            r1.<init>(r4, r7, r2)     // Catch: java.lang.Exception -> L3e
            java.lang.Object r7 = r1.f3301f     // Catch: java.lang.Exception -> L3e
            java.util.IdentityHashMap r7 = (java.util.IdentityHashMap) r7     // Catch: java.lang.Exception -> L3e
            qd.r r2 = r5.f10927i     // Catch: java.lang.Exception -> L3e
            int r1 = r3.k(r1, r2, r6)     // Catch: java.lang.Exception -> L3e
            if (r1 != r0) goto L1e
            return r1
        L1e:
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L26
            r4 = 2
            return r4
        L26:
            java.util.Collection r7 = r7.values()     // Catch: java.lang.Exception -> L3e
            java.util.stream.Stream r7 = r7.stream()     // Catch: java.lang.Exception -> L3e
            java.util.stream.Stream r7 = r7.sorted()     // Catch: java.lang.Exception -> L3e
            ae.e r1 = new ae.e     // Catch: java.lang.Exception -> L3e
            r2 = 26
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3e
            r7.forEach(r1)     // Catch: java.lang.Exception -> L3e
            r4 = 3
            return r4
        L3e:
            r7 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Type update failed for variable: "
            java.lang.String r2 = ", new type: "
            java.lang.String r5 = bc.e.j(r1, r5, r2, r6)
            r4.M(r5, r7)
        L52:
            return r0
    }

    public final int d(f5.g r10, pd.b r11, int r12, java.util.Set r13, java.util.function.Supplier r14, java.util.function.Function r15) {
            r9 = this;
            qd.r r0 = r11.f13714l
            qe.k r1 = r9.f11002c
            r2 = 1
            r3 = 0
            r4 = 3
            if (r0 == 0) goto L34
            boolean r5 = r0.P()
            if (r5 != 0) goto L34
            java.lang.Object r14 = r14.get()
            qd.j r14 = (qd.j) r14
            qd.j r14 = g(r13, r14)
            if (r14 == 0) goto L34
            int r5 = r9.k(r10, r0, r14)
            if (r5 != r2) goto L30
            qd.j r0 = r0.I()
            qe.l r14 = r1.d(r14, r0)
            boolean r14 = r14.d()
            if (r14 == 0) goto L30
            goto L6c
        L30:
            if (r5 != r4) goto L34
            r14 = r3
            goto L35
        L34:
            r14 = r2
        L35:
            int r0 = r11.j0()
            r5 = r3
        L3a:
            if (r5 >= r12) goto L73
            int r6 = r0 + r5
            qd.l r6 = r11.S(r6)
            boolean r7 = r6.P()
            if (r7 != 0) goto L70
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r15.apply(r7)
            qd.j r7 = (qd.j) r7
            qd.j r7 = g(r13, r7)
            if (r7 == 0) goto L70
            int r8 = r9.k(r10, r6, r7)
            if (r8 != r2) goto L6d
            qd.j r6 = r6.I()
            qe.l r6 = r1.d(r7, r6)
            boolean r6 = r6.c()
            if (r6 == 0) goto L6d
        L6c:
            return r2
        L6d:
            if (r8 != r4) goto L70
            r14 = r3
        L70:
            int r5 = r5 + 1
            goto L3a
        L73:
            if (r14 == 0) goto L77
            r10 = 2
            return r10
        L77:
            return r4
    }

    public final boolean f(qd.j r5, qe.d r6, qd.j r7) {
            r4 = this;
            qe.k r0 = r4.f11002c
            qe.l r1 = r0.d(r5, r7)
            int r2 = r1.ordinal()
            r3 = 1
            switch(r2) {
                case 0: goto L45;
                case 1: goto L30;
                case 2: goto L45;
                case 3: goto L28;
                case 4: goto L45;
                case 5: goto L43;
                case 6: goto L43;
                case 7: goto L1d;
                default: goto Le;
            }
        Le:
            java.lang.String r5 = java.lang.String.valueOf(r1)
            java.lang.String r6 = "Not processed type compare enum: "
            java.lang.String r5 = r6.concat(r5)
            ah.a.k(r5)
            r5 = 0
            return r5
        L1d:
            mh.b r6 = qe.x.f10999e
            java.lang.String r1 = "Can't compare types, unknown hierarchy: {} and {}"
            r6.s(r5, r1, r7)
            r0.d(r5, r7)
            return r3
        L28:
            int r5 = r6.b()
            r6 = 2
            if (r5 == r6) goto L43
            goto L45
        L30:
            int r6 = r6.b()
            if (r6 != r3) goto L45
            boolean r6 = r7.w()
            if (r6 != 0) goto L43
            boolean r5 = e(r7, r5)
            if (r5 == 0) goto L43
            goto L45
        L43:
            r5 = 0
            return r5
        L45:
            return r3
    }

    public final int i(f5.g r13, qd.l r14, qd.j r15) {
            r12 = this;
            java.lang.Object r0 = r13.f3301f
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            boolean r1 = r0.containsKey(r14)
            r2 = 3
            if (r1 == 0) goto Lc
            return r2
        Lc:
            qe.y r1 = new qe.y
            int r3 = r13.f3298c
            int r4 = r3 + 1
            r13.f3298c = r4
            r1.<init>(r3, r14, r15)
            java.lang.Object r0 = r0.put(r14, r1)
            qe.y r0 = (qe.y) r0
            if (r0 != 0) goto L2d6
            int r0 = r13.f3298c
            int r1 = r13.f3297b
            if (r0 > r1) goto L2c8
            int r0 = r0 % 100
            if (r0 != 0) goto L2c
            xe.s.a()
        L2c:
            ud.p r0 = r14.f10903j
            r1 = 2
            r3 = 1
            if (r0 != 0) goto L35
        L32:
            r2 = r1
            goto L2c2
        L35:
            java.util.EnumMap r4 = r12.f11001b
            pd.k r5 = r0.f13713k
            java.lang.Object r4 = r4.get(r5)
            qe.t r4 = (qe.t) r4
            if (r4 != 0) goto L43
            goto L2c2
        L43:
            int r5 = r4.f10991a
            qe.l r6 = qe.l.f10967j
            r7 = 0
            switch(r5) {
                case 0: goto L29a;
                case 1: goto L293;
                case 2: goto L24f;
                case 3: goto L248;
                case 4: goto L1d6;
                case 5: goto L195;
                case 6: goto L110;
                case 7: goto Lf3;
                case 8: goto Leb;
                default: goto L4b;
            }
        L4b:
            qe.x r4 = r4.f10992b
            r5 = r0
            pd.j r5 = (pd.j) r5
            boolean r6 = h(r0, r14)
            if (r6 == 0) goto L62
            qd.l r0 = r0.S(r7)
            int r2 = r4.k(r13, r0, r15)
            if (r2 != r3) goto L2c2
            goto Le9
        L62:
            java.lang.Object r6 = r5.f10495o
            qd.j r6 = (qd.j) r6
            qe.k r8 = r4.f11002c
            qe.l r8 = r8.d(r15, r6)
            qe.l r9 = qe.l.f10969l
            if (r8 != r9) goto Lb8
            ud.u r9 = r4.f11000a
            boolean r10 = r15.v()
            if (r10 == 0) goto Lc6
            boolean r10 = r6.v()
            if (r10 != 0) goto L7f
            goto Lc6
        L7f:
            ed.c r10 = r9.f13760s
            ed.b r10 = r10.c(r15)
            ed.c r9 = r9.f13760s
            ed.b r6 = r9.c(r6)
            r9 = 512(0x200, float:7.17E-43)
            if (r10 == 0) goto L98
            int r11 = r10.f2707b
            boolean r11 = r9.e0.G(r11, r9)
            if (r11 != 0) goto L98
            goto Lc6
        L98:
            if (r6 == 0) goto La3
            int r11 = r6.f2707b
            boolean r11 = r9.e0.G(r11, r9)
            if (r11 != 0) goto La3
            goto Lc6
        La3:
            if (r10 == 0) goto Lb8
            if (r6 != 0) goto La8
            goto Lb8
        La8:
            int r6 = r6.f2707b
            boolean r6 = r9.e0.G(r6, r9)
            if (r6 == 0) goto Lc6
            int r6 = r10.f2707b
            boolean r6 = r9.e0.G(r6, r9)
            if (r6 == 0) goto Lc6
        Lb8:
            qe.l r6 = qe.l.f10970m
            if (r8 != r6) goto Lc9
            md.a r6 = md.a.Y
            md.f r0 = r0.f8877g
            boolean r0 = r0.a(r6)
            if (r0 != 0) goto Lc9
        Lc6:
            r2 = r3
            goto L2c2
        Lc9:
            qe.l r0 = qe.l.f10966i
            if (r8 != r0) goto Ldb
            boolean r0 = r15.b()
            if (r0 == 0) goto Ldb
            qd.r r0 = r5.f13714l
            int r2 = r4.k(r13, r0, r15)
            goto L2c2
        Ldb:
            qd.l r0 = r5.S(r7)
            qd.j r0 = r0.I()
            boolean r15 = r15.equals(r0)
            if (r15 == 0) goto L2c2
        Le9:
            goto L32
        Leb:
            qe.x r1 = r4.f10992b
            int r15 = r1.j(r13, r0, r14, r15)
            goto L291
        Lf3:
            qe.x r1 = r4.f10992b
            r2 = r0
            pd.a r2 = (pd.a) r2
            qd.g r4 = qd.j.f10869c
            if (r15 != r4) goto L10a
            int r2 = r2.f10475o
            boolean r2 = p.a.b(r2)
            if (r2 == 0) goto L10a
            int r15 = r1.b(r13, r0, r14, r15)
            goto L291
        L10a:
            int r15 = r1.j(r13, r0, r14, r15)
            goto L291
        L110:
            qe.x r2 = r4.f10992b
            qd.l r4 = r0.S(r7)
            qd.l r0 = r0.S(r3)
            if (r4 != r14) goto L11d
            r4 = r0
        L11d:
            int r0 = r2.k(r13, r4, r15)
            if (r0 != r3) goto L192
            qd.j r2 = r4.I()
            boolean r4 = r15.v()
            if (r4 == 0) goto L143
            boolean r4 = r2.v()
            if (r4 != 0) goto L32
            boolean r4 = r2.w()
            if (r4 != 0) goto L143
            qd.q r4 = qd.q.f10915r
            boolean r4 = r2.a(r4)
            if (r4 == 0) goto L143
            goto L32
        L143:
            boolean r4 = r15 instanceof qd.a
            if (r4 == 0) goto L15b
            boolean r4 = r2 instanceof qd.a
            if (r4 != 0) goto L32
            boolean r4 = r2.w()
            if (r4 != 0) goto L15b
            qd.q r4 = qd.q.f10916s
            boolean r4 = r2.a(r4)
            if (r4 == 0) goto L15b
            goto L32
        L15b:
            boolean r4 = r15 instanceof qd.g
            if (r4 == 0) goto L192
            r4 = r15
            qd.g r4 = (qd.g) r4
            qd.q r4 = r4.K
            boolean r5 = r2 instanceof qd.g
            if (r5 == 0) goto L16f
            r5 = r2
            qd.g r5 = (qd.g) r5
            qd.q r5 = r5.K
            if (r5 == r4) goto L17b
        L16f:
            boolean r5 = r2.w()
            if (r5 != 0) goto L17c
            boolean r4 = r2.a(r4)
            if (r4 == 0) goto L17c
        L17b:
            r7 = r3
        L17c:
            if (r7 == 0) goto L180
            goto L32
        L180:
            boolean r4 = r2.w()
            if (r4 == 0) goto L192
            int r15 = r15.p()
            int r2 = r2.p()
            if (r15 != r2) goto L192
            goto L32
        L192:
            r1 = r0
            goto L32
        L195:
            qe.x r4 = r4.f10992b
            qd.l r5 = r0.S(r7)
            qd.l r0 = r0.S(r1)
            if (r5 != r14) goto L1c7
            qd.j r15 = r15.g()
            if (r15 != 0) goto L1a9
            goto Lc6
        L1a9:
            int r1 = r4.k(r13, r0, r15)
            if (r1 != r3) goto L32
            qd.j r0 = r0.I()
            boolean r5 = r0.w()
            if (r5 == 0) goto L32
            qe.k r4 = r4.f11002c
            qe.l r15 = r4.d(r15, r0)
            if (r15 == r6) goto L2c2
            qe.l r0 = qe.l.f10968k
            if (r15 != r0) goto L32
            goto L2c2
        L1c7:
            if (r5 != r0) goto L32
            qd.g r0 = qd.j.f10868b
            qd.a r0 = new qd.a
            r0.<init>(r15)
            int r2 = r4.k(r13, r5, r0)
            goto L2c2
        L1d6:
            qe.x r4 = r4.f10992b
            qe.k r5 = r4.f11002c
            boolean r8 = h(r0, r14)
            if (r8 == 0) goto L21a
            qd.l r1 = r0.S(r7)
            qd.g r8 = qd.j.f10868b
            qd.a r8 = new qd.a
            r8.<init>(r15)
            int r1 = r4.k(r13, r1, r8)
            if (r1 != r3) goto L32
            qd.l r0 = r0.S(r7)
            qd.j r0 = r0.I()
            boolean r4 = r0.w()
            if (r4 == 0) goto L32
            boolean r4 = r0 instanceof qd.a
            if (r4 == 0) goto L32
            qd.j r4 = r0.g()
            r4.getClass()
            boolean r4 = r4 instanceof qd.g
            if (r4 == 0) goto L32
            qd.j r0 = r0.g()
            qe.l r15 = r5.d(r15, r0)
            if (r15 != r6) goto L32
            goto L2c2
        L21a:
            qd.l r7 = r0.S(r7)
            if (r7 != r14) goto L32
            qd.j r15 = r15.g()
            if (r15 != 0) goto L228
            goto Lc6
        L228:
            qd.r r1 = r0.f13714l
            int r1 = r4.k(r13, r1, r15)
            if (r1 != r3) goto L32
            qd.r r0 = r0.f13714l
            qd.j r0 = r0.I()
            boolean r4 = r0.w()
            if (r4 == 0) goto L32
            boolean r4 = r0 instanceof qd.g
            if (r4 == 0) goto L32
            qe.l r15 = r5.d(r0, r15)
            if (r15 != r6) goto L32
            goto L2c2
        L248:
            qe.x r1 = r4.f10992b
            int r15 = r1.b(r13, r0, r14, r15)
            goto L291
        L24f:
            qe.x r4 = r4.f10992b
            qd.r r5 = r0.f13714l
            if (r5 != 0) goto L257
            goto L2c2
        L257:
            if (r5 != r14) goto L25b
            r6 = r3
            goto L25c
        L25b:
            r6 = r7
        L25c:
            if (r6 == 0) goto L262
            qd.l r5 = r0.S(r7)
        L262:
            qe.k r0 = r4.f11002c
            qd.j r8 = r5.I()
            qe.l r0 = r0.d(r15, r8)
            boolean r8 = r0.b()
            if (r8 != 0) goto L281
            if (r6 == 0) goto L27b
            boolean r0 = r0.d()
            if (r0 == 0) goto L282
            goto L281
        L27b:
            boolean r0 = r0.c()
            if (r0 == 0) goto L282
        L281:
            r7 = r3
        L282:
            int r15 = r4.k(r13, r5, r15)
            if (r15 != r1) goto L28c
            if (r7 != 0) goto L28c
            goto Lc6
        L28c:
            if (r15 != r3) goto L291
            if (r7 == 0) goto L291
            goto L2c2
        L291:
            r2 = r15
            goto L2c2
        L293:
            qe.x r1 = r4.f10992b
            int r15 = a(r1, r13, r0, r14, r15)
            goto L291
        L29a:
            qe.x r1 = r4.f10992b
            boolean r4 = h(r0, r14)
            if (r4 == 0) goto L2a7
            qd.l r0 = r0.S(r7)
            goto L2a9
        L2a7:
            qd.r r0 = r0.f13714l
        L2a9:
            java.lang.Object r4 = r13.f3301f
            java.util.IdentityHashMap r4 = (java.util.IdentityHashMap) r4
            java.lang.Object r4 = r4.get(r0)
            qe.y r4 = (qe.y) r4
            if (r4 == 0) goto L2bb
            qd.j r4 = r4.f11006i
            boolean r7 = r4.equals(r15)
        L2bb:
            if (r7 == 0) goto L2be
            goto L2c2
        L2be:
            int r2 = r1.k(r13, r0, r15)
        L2c2:
            if (r2 != r3) goto L2c7
            r13.c(r14)
        L2c7:
            return r2
        L2c8:
            af.f r13 = new af.f
            java.lang.String r14 = "Type inference error: updates count limit reached with updateSeq = "
            java.lang.String r15 = ". Try increasing type updates limit count."
            java.lang.String r14 = eh.a.m(r0, r14, r15)
            r13.<init>(r14)
            throw r13
        L2d6:
            af.g r13 = new af.g
            java.lang.String r1 = java.lang.String.valueOf(r14)
            qd.j r0 = r0.f11006i
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r15 = java.lang.String.valueOf(r15)
            ud.p r14 = r14.f10903j
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r2 = " types: prev="
            java.lang.String r3 = ", new="
            java.lang.String r4 = "Unexpected type update override for arg: "
            java.lang.StringBuilder r0 = bc.e.p(r4, r1, r2, r0, r3)
            r0.append(r15)
            java.lang.String r15 = ", insn: "
            r0.append(r15)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r13.<init>(r14)
            throw r13
    }

    public final int j(f5.g r5, ud.p r6, qd.l r7, qd.j r8) {
            r4 = this;
            boolean r0 = h(r6, r7)
            if (r0 != 0) goto Ld
            qd.r r0 = r6.f13714l
            if (r0 == 0) goto Ld
            r4.k(r5, r0, r8)
        Ld:
            java.util.List r6 = r6.f13715m
            java.util.Iterator r6 = r6.iterator()
            r0 = 1
            r1 = r0
        L15:
            boolean r2 = r6.hasNext()
            r3 = 2
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r6.next()
            qd.l r2 = (qd.l) r2
            if (r2 == r7) goto L15
            int r2 = r4.k(r5, r2, r8)
            if (r2 != r0) goto L2b
            goto L15
        L2b:
            if (r2 == r3) goto L15
            r1 = 0
            goto L15
        L2f:
            if (r1 == 0) goto L32
            return r3
        L32:
            r5 = 3
            return r5
    }

    public final int k(f5.g r9, qd.l r10, qd.j r11) {
            r8 = this;
            if (r11 == 0) goto L135
            java.lang.Object r0 = r9.f3301f
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto Le
            goto L12e
        Le:
            qd.j r0 = r10.I()
            java.lang.Object r1 = r9.f3300e
            qe.a0 r1 = (qe.a0) r1
            boolean r2 = java.util.Objects.equals(r0, r11)
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L2c
            java.util.Set r0 = r1.f10938a
            qe.z r1 = qe.z.f11008h
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto La7
        L29:
            r0 = r5
            goto La8
        L2c:
            boolean r2 = r11 instanceof qd.i
            if (r2 == 0) goto L33
        L30:
            r0 = r3
            goto La8
        L33:
            qe.k r2 = r8.f11002c
            qe.l r2 = r2.d(r11, r0)
            r2.getClass()
            qe.l r6 = qe.l.f10969l
            if (r2 == r6) goto L30
            qe.l r6 = qe.l.f10970m
            if (r2 != r6) goto L45
            goto L30
        L45:
            qe.l r6 = qe.l.f10971n
            if (r2 != r6) goto L54
            java.util.Set r6 = r1.f10938a
            qe.z r7 = qe.z.f11009i
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L54
            goto L30
        L54:
            boolean r6 = r10.P()
            if (r6 == 0) goto L63
            qd.h r6 = qd.j.f10887u
            if (r0 == r6) goto L63
            qe.l r0 = qe.l.f10964g
            if (r2 != r0) goto L30
            goto L29
        L63:
            qe.l r0 = qe.l.f10968k
            if (r2 != r0) goto L72
            java.util.Set r0 = r1.f10938a
            qe.z r6 = qe.z.f11010j
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L72
            goto L30
        L72:
            boolean r0 = r2.d()
            if (r0 == 0) goto L83
            java.util.Set r0 = r1.f10938a
            qe.z r1 = qe.z.f11007g
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L83
            goto L30
        L83:
            boolean r0 = r11.c()
            if (r0 == 0) goto La7
            ud.u r0 = r8.f11000a
            fe.a r0 = r0.f13750i
            java.lang.Object r1 = r9.f3299d
            ud.r r1 = (ud.r) r1
            r0.getClass()
            java.util.Set r0 = fe.a.e(r1)
            qe.w r1 = new qe.w
            r2 = 1
            r1.<init>(r0, r2)
            java.lang.Object r0 = r11.C(r1)
            qd.j r0 = (qd.j) r0
            if (r0 == 0) goto La7
            goto L30
        La7:
            r0 = r4
        La8:
            if (r0 == 0) goto Lab
            return r0
        Lab:
            boolean r0 = r10 instanceof qd.r
            if (r0 == 0) goto L130
            qd.r r10 = (qd.r) r10
            qd.s r10 = r10.f10923m
            p4.t r0 = r10.f10930l
            java.util.ArrayList r1 = r10.f10928j
            qd.j r2 = r10.d()
            if (r2 == 0) goto Lc4
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto Lc4
            goto Lf0
        Lc4:
            java.lang.Object r0 = r0.f10225i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.Iterator r0 = r0.iterator()
        Lcc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r0.next()
            qe.d r2 = (qe.d) r2
            boolean r6 = r2 instanceof qe.e
            if (r6 == 0) goto Le4
            r6 = r2
            qe.e r6 = (qe.e) r6
            qd.j r6 = r6.a(r9)
            goto Le8
        Le4:
            qd.j r6 = r2.getType()
        Le8:
            if (r6 == 0) goto Lcc
            boolean r2 = r8.f(r11, r2, r6)
            if (r2 != 0) goto Lcc
        Lf0:
            return r3
        Lf1:
            qd.r r0 = r10.f10927i
            int r0 = r8.i(r9, r0, r11)
            if (r0 != r5) goto Lfb
            r2 = r3
            goto Lfc
        Lfb:
            r2 = r4
        Lfc:
            if (r0 == r3) goto L119
            java.util.Iterator r6 = r1.iterator()
        L102:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L119
            java.lang.Object r0 = r6.next()
            qd.r r0 = (qd.r) r0
            int r0 = r8.i(r9, r0, r11)
            if (r0 != r3) goto L115
            goto L119
        L115:
            if (r0 == r5) goto L102
            r2 = r4
            goto L102
        L119:
            if (r0 != r3) goto L12b
            qd.r r10 = r10.f10927i
            r9.c(r10)
            ae.g r10 = new ae.g
            r11 = 17
            r10.<init>(r9, r11)
            r1.forEach(r10)
            return r3
        L12b:
            if (r2 == 0) goto L12e
            return r5
        L12e:
            r9 = 3
            return r9
        L130:
            int r9 = r8.i(r9, r10, r11)
            return r9
        L135:
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r10 = "Null type update for arg: "
            java.lang.String r9 = r10.concat(r9)
            ah.a.k(r9)
            r9 = 0
            return r9
    }
}
