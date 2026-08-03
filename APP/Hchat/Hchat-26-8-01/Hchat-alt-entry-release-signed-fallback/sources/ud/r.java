package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends nd.b0 implements ud.m, java.lang.Comparable {
    public static final ud.p[] J = null;
    public int A;
    public ud.a B;
    public ud.a C;
    public java.util.List D;
    public java.util.List E;
    public java.util.List F;
    public xd.b G;
    public java.util.List H;
    public bc.n I;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final od.d f13717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ud.e f13718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b5.k f13719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a5.a f13720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public qd.j f13726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.util.List f13727u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.util.List f13728v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qd.r f13729w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.util.List f13730x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ud.p[] f13731y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.util.List f13732z;

    static {
            java.lang.Class<ud.r> r0 = ud.r.class
            mh.d.b(r0)
            r0 = 0
            ud.p[] r0 = new ud.p[r0]
            ud.r.J = r0
            return
    }

    public r(ud.e r6, jf.f r7) {
            r5 = this;
            r5.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r5.H = r0
            ud.u r1 = r6.f13688k
            jf.h r2 = r7.f6887b
            od.d r1 = od.d.d(r1, r2)
            r5.f13717k = r1
            r5.f13718l = r6
            b5.k r6 = new b5.k
            int r2 = r7.f6888c
            r3 = 3
            r4 = 3
            r6.<init>(r2, r3, r4)
            r5.f13719m = r6
            a5.a r6 = r7.f6891f
            r7 = 0
            if (r6 != 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = r7
        L26:
            r5.f13722p = r2
            if (r2 == 0) goto L30
            r6 = 0
            r5.f13720n = r6
            r5.f13721o = r7
            goto L49
        L30:
            a5.a r7 = new a5.a
            java.lang.Object r2 = r6.f57i
            ac.k r2 = (ac.k) r2
            ac.k r2 = r2.g()
            r7.<init>(r2)
            int r2 = r6.f56h
            r7.f56h = r2
            r5.f13720n = r7
            int r6 = r6.f()
            r5.f13721o = r6
        L49:
            qd.j r6 = r1.f9778h
            r5.f13726t = r6
            java.util.List r6 = r1.f9779i
            r5.f13727u = r6
            r5.f13728v = r0
            r5.e0()
            return
    }

    @Override // nd.b0
    public final b5.k O() {
            r1 = this;
            b5.k r0 = r1.f13719m
            return r0
    }

    @Override // nd.b0
    public final ud.e P() {
            r1 = this;
            ud.e r0 = r1.f13718l
            return r0
    }

    @Override // nd.b0
    public final void Q(b5.k r1) {
            r0 = this;
            r0.f13719m = r1
            return
    }

    public final java.util.List R(ud.a r5) {
            r4 = this;
            java.util.List r0 = r4.F
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r5 = java.util.Collections.EMPTY_LIST
            return r5
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r4.F
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.List r1 = r4.F
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            nd.t r2 = (nd.t) r2
            java.util.HashSet r3 = r2.f9394c
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L1c
            r0.add(r2)
            goto L1c
        L34:
            return r0
    }

    public final java.util.List S() {
            r4 = this;
            java.util.List r0 = r4.f13730x
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            ud.e r1 = r4.f13718l
            ud.e r1 = r1.a0()
            int r1 = r1.f13702y
            java.lang.String r1 = p.a.A(r1)
            java.lang.String r2 = "Method arg registers not loaded: "
            java.lang.String r3 = ", class status: "
            java.lang.String r0 = bc.e.j(r2, r0, r3, r1)
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final p4.t T() {
            r19 = this;
            r0 = r19
            boolean r1 = r0.f13722p
            r2 = 0
            if (r1 == 0) goto L8
            goto L1d
        L8:
            a5.a r1 = r0.f13720n
            java.lang.Object r3 = r1.f57i
            ac.k r3 = (ac.k) r3
            r4 = 8
            r3.B(r4)
            java.lang.Object r5 = r3.f178i
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r6 = r5.getInt()
            if (r6 != 0) goto L1e
        L1d:
            return r2
        L1e:
            if (r6 < 0) goto L1ba
            int r7 = r5.capacity()
            if (r6 > r7) goto L1ba
            java.lang.Object r7 = r1.f57i
            ac.k r7 = (ac.k) r7
            r8 = 0
            r7.B(r8)
            int r7 = r7.L()
            lf.a r9 = new lf.a
            int r10 = r1.f()
            r9.<init>(r3, r7, r10)
            int r1 = r1.f56h
            java.lang.Object r10 = r3.f179j
            ff.e r10 = (ff.e) r10
            jf.e r10 = r10.f3934d
            int r11 = r10.f6883g
            int r1 = r1 * r4
            int r1 = r1 + r11
            r11 = 2
            int r1 = r1 + r11
            r3.a(r1)
            int r1 = r3.L()
            int r10 = r10.f6882f
            int r1 = r1 * 12
            int r1 = r1 + r10
            int r1 = r1 + r4
            r3.a(r1)
            int r1 = r5.getInt()
            if (r1 != 0) goto L62
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            goto L69
        L62:
            r3.a(r1)
            java.util.List r1 = r3.J()
        L69:
            boolean r3 = r1.isEmpty()
            r4 = 1
            if (r3 == 0) goto L75
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r9.f8031g = r1
            goto L9d
        L75:
            int r3 = r1.size()
            int[] r5 = new int[r3]
            int r3 = r3 - r4
        L7c:
            if (r3 < 0) goto L99
            java.lang.Object r10 = r1.get(r3)
            java.lang.String r10 = (java.lang.String) r10
            char r10 = r10.charAt(r8)
            r12 = 68
            if (r10 == r12) goto L92
            r12 = 74
            if (r10 == r12) goto L92
            r10 = r4
            goto L93
        L92:
            r10 = r11
        L93:
            int r7 = r7 - r10
            r5[r3] = r7
            int r3 = r3 + (-1)
            goto L7c
        L99:
            r9.f8032h = r5
            r9.f8031g = r1
        L9d:
            ac.k r1 = r9.f8025a
            r1.a(r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r9.f8029e = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r9.f8030f = r3
            int r3 = a.a.H0(r1)
            int r5 = a.a.H0(r1)
            java.util.List r6 = r9.f8031g
            int r6 = r6.size()
            r7 = r8
            r10 = r7
        Lc0:
            ac.k r11 = r9.f8026b
            if (r7 >= r5) goto Lec
            int r12 = a.a.H0(r1)
            int r12 = r12 - r4
            java.lang.String r11 = r11.v(r12)
            if (r11 == 0) goto Le9
            if (r7 >= r6) goto Le9
            lf.b r10 = new lf.b
            int[] r12 = r9.f8032h
            r12 = r12[r7]
            java.util.List r13 = r9.f8031g
            java.lang.Object r13 = r13.get(r7)
            java.lang.String r13 = (java.lang.String) r13
            r10.<init>(r12, r11, r13, r2)
            r9.b(r10, r8)
            r11 = -1
            r10.f8038f = r11
            r10 = r4
        Le9:
            int r7 = r7 + 1
            goto Lc0
        Lec:
            r2 = r8
        Led:
            int r5 = r1.K()
            int r6 = r9.f8028d
            lf.b[] r7 = r9.f8027c
            if (r5 != 0) goto L117
            if (r10 == 0) goto L10c
            int r1 = r7.length
        Lfa:
            if (r8 >= r1) goto L10c
            r2 = r7[r8]
            if (r2 == 0) goto L109
            boolean r3 = r2.f8037e
            if (r3 != 0) goto L109
            int r3 = r6 + (-1)
            r9.a(r2, r3)
        L109:
            int r8 = r8 + 1
            goto Lfa
        L10c:
            p4.t r1 = new p4.t
            java.util.HashMap r2 = r9.f8030f
            java.util.ArrayList r3 = r9.f8029e
            r4 = 2
            r1.<init>(r2, r4, r3)
            return r1
        L117:
            switch(r5) {
                case 1: goto L1ad;
                case 2: goto L1a7;
                case 3: goto L18a;
                case 4: goto L169;
                case 5: goto L15d;
                case 6: goto L142;
                case 7: goto Led;
                case 8: goto Led;
                case 9: goto L139;
                default: goto L11a;
            }
        L11a:
            int r5 = r5 + (-10)
            int r7 = r5 / 15
            int r7 = r7 + r2
            int r6 = r6 + (-1)
            int r2 = java.lang.Math.min(r7, r6)
            int r5 = r5 % 15
            int r5 = r5 + (-4)
            int r5 = r5 + r3
            java.util.HashMap r3 = r9.f8030f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r3.put(r6, r7)
        L137:
            r3 = r5
            goto Led
        L139:
            int r5 = a.a.H0(r1)
            int r5 = r5 - r4
            r11.v(r5)
            goto Led
        L142:
            int r5 = a.a.H0(r1)
            r6 = r7[r5]
            if (r6 == 0) goto L15b
            r9.a(r6, r2)
            lf.b r7 = new lf.b
            java.lang.String r10 = r6.f8034b
            java.lang.String r12 = r6.f8035c
            java.lang.String r6 = r6.f8036d
            r7.<init>(r5, r10, r12, r6)
            r9.b(r7, r2)
        L15b:
            r10 = r4
            goto Led
        L15d:
            int r5 = a.a.H0(r1)
            r5 = r7[r5]
            if (r5 == 0) goto L15b
            r9.a(r5, r2)
            goto L15b
        L169:
            int r14 = a.a.H0(r1)
            int r5 = a.a.H0(r1)
            int r15 = r5 + (-1)
            int r5 = a.a.H0(r1)
            int r16 = r5 + (-1)
            int r5 = a.a.H0(r1)
            int r17 = r5 + (-1)
            lf.b r12 = new lf.b
            ac.k r13 = r9.f8026b
            r12.<init>(r13, r14, r15, r16, r17)
            r9.b(r12, r2)
            goto L15b
        L18a:
            int r15 = a.a.H0(r1)
            int r5 = a.a.H0(r1)
            int r16 = r5 + (-1)
            int r5 = a.a.H0(r1)
            int r17 = r5 + (-1)
            lf.b r13 = new lf.b
            ac.k r14 = r9.f8026b
            r18 = -1
            r13.<init>(r14, r15, r16, r17, r18)
            r9.b(r13, r2)
            goto L15b
        L1a7:
            int r5 = r1.I()
            int r5 = r5 + r3
            goto L137
        L1ad:
            int r5 = a.a.H0(r1)
            int r5 = r5 + r2
            int r6 = r6 + (-1)
            int r2 = java.lang.Math.min(r5, r6)
            goto Led
        L1ba:
            af.c r1 = new af.c
            java.lang.String r2 = "Invalid debug info offset"
            r1.<init>(r2)
            throw r1
    }

    public final nd.t U(ud.a r4) {
            r3 = this;
            java.util.List r0 = r3.F
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto L24
        L9:
            java.util.List r0 = r3.F
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            nd.t r1 = (nd.t) r1
            java.util.HashSet r2 = r1.f9394c
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto Lf
            return r1
        L24:
            r4 = 0
            return r4
    }

    public final void V(java.util.List r7) {
            r6 = this;
            boolean r0 = r6.f13722p
            if (r0 == 0) goto L6
            r0 = 0
            goto L2e
        L6:
            int r0 = r6.f13724r
            r1 = -1
            if (r0 == r1) goto Lc
            goto L2e
        Lc:
            int r0 = r6.f13723q
            java.util.Iterator r1 = r7.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            qd.j r2 = (qd.j) r2
            int r2 = r2.p()
            int r0 = r0 - r2
            goto L12
        L24:
            b5.k r1 = r6.f13719m
            boolean r1 = r1.h()
            if (r1 != 0) goto L2e
            int r0 = r0 + (-1)
        L2e:
            ud.e r1 = r6.f13718l
            ud.u r2 = r1.f13688k
            fe.a r2 = r2.f13750i
            b5.k r3 = r6.f13719m
            boolean r3 = r3.h()
            md.a r4 = md.a.N
            if (r3 == 0) goto L42
            r1 = 0
            r6.f13729w = r1
            goto L60
        L42:
            qd.j r1 = r1.b0()
            r2.getClass()
            fe.a.c(r6, r1)
            int r3 = r0 + 1
            mh.b r5 = qd.l.f10901k
            qd.r r5 = new qd.r
            r5.<init>(r0, r1)
            md.a r0 = md.a.J
            r5.w(r0)
            r5.w(r4)
            r6.f13729w = r5
            r0 = r3
        L60:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L6b
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            r6.f13730x = r7
            return
        L6b:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r7.size()
            r1.<init>(r3)
            r6.f13730x = r1
            java.util.Iterator r7 = r7.iterator()
        L7a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La6
            java.lang.Object r1 = r7.next()
            qd.j r1 = (qd.j) r1
            r2.getClass()
            fe.a.c(r6, r1)
            mh.b r3 = qd.l.f10901k
            qd.r r3 = new qd.r
            r3.<init>(r0, r1)
            md.a r5 = md.a.M
            r3.w(r5)
            r3.w(r4)
            java.util.List r5 = r6.f13730x
            r5.add(r3)
            int r1 = r1.p()
            int r0 = r0 + r1
            goto L7a
        La6:
            return
    }

    public final boolean W() {
            r1 = this;
            b5.k r0 = r1.f13719m
            boolean r0 = r0.a()
            if (r0 == 0) goto L12
            od.d r0 = r1.f13717k
            boolean r0 = r0.f()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public final boolean X() {
            r4 = this;
            boolean r0 = r4.W()
            r1 = 0
            if (r0 == 0) goto L4a
            ud.e r0 = r4.f13718l
            od.a r2 = r0.f13690m
            boolean r2 = r2.o()
            r3 = 1
            if (r2 == 0) goto L3c
            b5.k r2 = r0.f13692o
            boolean r2 = r2.h()
            if (r2 != 0) goto L3c
            ud.e r0 = r0.f13701x
            java.util.List r2 = r4.f13730x
            if (r2 == 0) goto L3c
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3c
            java.util.List r2 = r4.f13730x
            java.lang.Object r2 = r2.get(r1)
            qd.r r2 = (qd.r) r2
            qd.j r2 = r2.f10902i
            od.a r0 = r0.f13690m
            qd.j r0 = r0.f9765g
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3c
            r0 = r3
            goto L3d
        L3c:
            r0 = r1
        L3d:
            java.util.List r2 = r4.f13730x
            if (r2 == 0) goto L49
            int r2 = r2.size()
            if (r2 != r0) goto L48
            goto L49
        L48:
            return r1
        L49:
            return r3
        L4a:
            return r1
    }

    public final boolean Y(ud.a r4) {
            r3 = this;
            java.util.List r0 = r4.f13676n
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L17
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            ud.a r4 = (ud.a) r4
            ud.a r0 = r3.C
            boolean r4 = r4.equals(r0)
            return r4
        L17:
            ud.a r0 = r3.C
            java.util.List r0 = r0.f13675m
            boolean r4 = r0.contains(r4)
            return r4
    }

    public final boolean Z() {
            r2 = this;
            od.d r0 = r2.f13717k
            qd.j r0 = r0.f9778h
            qd.g r1 = qd.j.f10876j
            boolean r0 = r0.equals(r1)
            return r0
    }

    public final void a0() {
            r7 = this;
            a5.a r0 = r7.f13720n
            boolean r1 = r7.f13725s
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 0
            r2 = 1
            r7.f13725s = r2     // Catch: java.lang.Exception -> L17
            boolean r3 = r7.f13722p     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L19
            r7.f13723q = r1     // Catch: java.lang.Exception -> L17
            java.util.List r0 = r7.f13727u     // Catch: java.lang.Exception -> L17
            r7.V(r0)     // Catch: java.lang.Exception -> L17
            return
        L17:
            r0 = move-exception
            goto L55
        L19:
            java.lang.Object r3 = r0.f57i     // Catch: java.lang.Exception -> L17
            ac.k r3 = (ac.k) r3     // Catch: java.lang.Exception -> L17
            r3.B(r1)     // Catch: java.lang.Exception -> L17
            int r3 = r3.L()     // Catch: java.lang.Exception -> L17
            r7.f13723q = r3     // Catch: java.lang.Exception -> L17
            r3 = -1
            r7.f13724r = r3     // Catch: java.lang.Exception -> L17
            java.util.List r3 = r7.f13727u     // Catch: java.lang.Exception -> L17
            r7.V(r3)     // Catch: java.lang.Exception -> L17
            md.b r3 = md.b.f8848c     // Catch: java.lang.Exception -> L17
            md.f r4 = r7.f8877g     // Catch: java.lang.Exception -> L17
            boolean r3 = r4.b(r3)     // Catch: java.lang.Exception -> L17
            if (r3 == 0) goto L3d
            ud.p[] r0 = ud.r.J     // Catch: java.lang.Exception -> L17
            r7.f13731y = r0     // Catch: java.lang.Exception -> L17
            return
        L3d:
            p4.t r3 = new p4.t     // Catch: java.lang.Exception -> L17
            r3.<init>(r7)     // Catch: java.lang.Exception -> L17
            int r4 = r0.f()     // Catch: java.lang.Exception -> L17
            ud.p[] r4 = new ud.p[r4]     // Catch: java.lang.Exception -> L17
            be.w r5 = new be.w     // Catch: java.lang.Exception -> L17
            r6 = 12
            r5.<init>(r3, r6, r4)     // Catch: java.lang.Exception -> L17
            r0.r(r5)     // Catch: java.lang.Exception -> L17
            r7.f13731y = r4     // Catch: java.lang.Exception -> L17
            return
        L55:
            boolean r3 = r7.f13722p
            if (r3 != 0) goto L63
            r7.e0()
            r7.f13722p = r2
            r7.a0()
            r7.f13722p = r1
        L63:
            af.b r1 = new af.b
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Load method exception: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            java.lang.String r2 = xe.h.b(r7, r2)
            r1.<init>(r2, r0)
            throw r1
    }

    public final qd.s b0(qd.r r6) {
            r5 = this;
            int r0 = r6.f10922l
            java.util.List r1 = r5.D
            java.util.Iterator r1 = r1.iterator()
            r2 = -1
        L9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r1.next()
            qd.s r3 = (qd.s) r3
            int r4 = r3.f10925g
            if (r4 != r0) goto L9
            int r3 = r3.f10926h
            int r2 = java.lang.Math.max(r2, r3)
            goto L9
        L20:
            int r2 = r2 + 1
            qd.s r1 = new qd.s
            r1.<init>(r0, r2, r6)
            java.util.List r6 = r5.D
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L36
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.D = r6
        L36:
            java.util.List r6 = r5.D
            r6.add(r1)
            return r1
    }

    @Override // ud.m
    public final java.util.List c() {
            r2 = this;
            java.util.List r0 = r2.f13727u
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Method generic types not initialized: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            r0 = 0
            return r0
    }

    public final qd.r c0(qd.j r3) {
            r2 = this;
            mh.b r0 = qd.l.f10901k
            qd.r r0 = new qd.r
            r1 = 0
            r0.<init>(r1, r3)
            md.a r1 = md.a.f8831m
            r0.w(r1)
            qd.s r1 = r2.b0(r0)
            be.b.H(r1)
            r1.n(r3)
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ud.r r2 = (ud.r) r2
            od.d r0 = r1.f13717k
            od.d r2 = r2.f13717k
            int r2 = r0.a(r2)
            return r2
    }

    @Override // ud.m, oc.b
    public final java.lang.String d() {
            r2 = this;
            java.lang.String r0 = super.d()
            java.lang.String r1 = " (m)"
            java.lang.String r0 = r0.concat(r1)
            return r0
    }

    public final void d0(java.lang.String r3) {
            r2 = this;
            md.b r0 = md.b.f8863r
            md.f r1 = r2.f8877g
            oc.b r0 = r1.c(r0)
            nd.x r0 = (nd.x) r0
            if (r0 == 0) goto L24
            java.util.SortedSet r0 = r0.f9403h
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            od.d r1 = r1.f13717k
            r1.f9784n = r3
            goto L12
        L23:
            return
        L24:
            od.d r0 = r2.f13717k
            r0.f9784n = r3
            return
    }

    @Override // ud.m
    public final qd.j e() {
            r1 = this;
            qd.j r0 = r1.f13726t
            return r0
    }

    public final void e0() {
            r2 = this;
            r0 = 0
            r2.f13725s = r0
            r0 = 0
            r2.f13729w = r0
            r2.f13730x = r0
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r2.D = r1
            r2.f13731y = r0
            r2.f13732z = r0
            r2.B = r0
            r2.C = r0
            r2.G = r0
            r2.E = r1
            r2.F = r1
            r2.F()
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<ud.r> r0 = ud.r.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            ud.r r3 = (ud.r) r3
            od.d r0 = r2.f13717k
            od.d r3 = r3.f13717k
            boolean r3 = r0.equals(r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public final void f0() {
            r4 = this;
            java.util.List r0 = r4.f13732z
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L14
            java.lang.Object r3 = r0.get(r2)
            ud.a r3 = (ud.a) r3
            r3.f13672j = r2
            int r2 = r2 + 1
            goto L7
        L14:
            return
    }

    @Override // ud.m
    public final java.util.List getTypeParameters() {
            r1 = this;
            java.util.List r0 = r1.f13728v
            return r0
    }

    public final int hashCode() {
            r1 = this;
            od.d r0 = r1.f13717k
            int r0 = r0.f9783m
            return r0
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // ud.k
    public final java.lang.String m() {
            r1 = this;
            ud.e r0 = r1.f13718l
            java.lang.String r0 = r0.f13696s
            return r0
    }

    @Override // ud.k
    public final ud.u n() {
            r1 = this;
            ud.e r0 = r1.f13718l
            ud.u r0 = r0.f13688k
            return r0
    }

    @Override // ud.m
    public final int o() {
            r1 = this;
            b5.k r0 = r1.f13719m
            int r0 = r0.f488b
            return r0
    }

    @Override // ud.m
    public final od.d q() {
            r1 = this;
            od.d r0 = r1.f13717k
            return r0
    }

    @Override // ud.m
    public final java.util.List s() {
            r3 = this;
            md.b r0 = md.b.f8867v
            md.f r1 = r3.f8877g
            oc.b r0 = r1.c(r0)
            nd.z r0 = (nd.z) r0
            if (r0 == 0) goto L1a
            java.util.HashSet r0 = r0.f9406g
            me.a r1 = new me.a
            r2 = 14
            r1.<init>(r2)
            java.util.List r0 = xe.s.c(r0, r1)
            return r0
        L1a:
            oc.c r0 = oc.c.f9763i
            md.f r1 = r3.f8877g
            oc.b r0 = r1.c(r0)
            pc.e r0 = (pc.e) r0
            if (r0 == 0) goto L34
            java.util.List r0 = r0.f10464g
            me.a r1 = new me.a
            r2 = 14
            r1.<init>(r2)
            java.util.List r0 = xe.s.c(r0, r1)
            return r0
        L34:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.e r0 = r5.f13718l
            java.lang.String r0 = java.lang.String.valueOf(r0)
            od.d r1 = r5.f13717k
            java.lang.String r1 = r1.f9777g
            java.util.List r2 = r5.f13727u
            java.lang.String r3 = ", "
            java.lang.String r2 = xe.s.j(r2, r3)
            qd.j r3 = r5.f13726t
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = "("
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = "):"
            java.lang.String r0 = eh.a.r(r4, r0, r3)
            return r0
    }

    @Override // ud.k
    public final java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "method"
            return r0
    }

    @Override // ud.m
    public final boolean v() {
            r1 = this;
            b5.k r0 = r1.f13719m
            int r0 = r0.f488b
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
