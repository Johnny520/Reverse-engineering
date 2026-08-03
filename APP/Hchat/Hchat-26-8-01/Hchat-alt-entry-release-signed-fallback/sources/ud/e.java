package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends nd.b0 implements java.lang.Comparable {
    public static final mh.b F = null;
    public java.util.List A;
    public java.util.List B;
    public java.util.List C;
    public java.util.Map D;
    public bc.l E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.u f13688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jf.b f13689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final od.a f13690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ud.s f13691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b5.k f13692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public qd.j f13693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.util.List f13694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.List f13695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.lang.String f13696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.util.List f13697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.util.List f13698u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public java.util.List f13699v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.util.List f13700w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ud.e f13701x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile int f13702y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.util.List f13703z;

    static {
            java.lang.Class<ud.e> r0 = ud.e.class
            mh.b r0 = mh.d.b(r0)
            ud.e.F = r0
            return
    }

    public e(ud.u r4, jf.b r5) {
            r3 = this;
            r3.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r3.f13695r = r0
            r3.f13699v = r0
            r3.f13700w = r0
            r3.f13701x = r3
            r1 = 1
            r3.f13702y = r1
            r3.f13703z = r0
            r3.A = r0
            r3.B = r0
            r3.C = r0
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r3.D = r0
            r3.f13688k = r4
            java.lang.String r0 = r5.b()
            qd.j r0 = qd.j.x(r0)
            od.a r0 = od.a.e(r4, r0)
            r3.f13690m = r0
            java.lang.String r0 = r0.l()
            ud.s r4 = ud.s.I(r4, r0)
            java.util.ArrayList r0 = r4.f13737o
            r0.add(r3)
            r3.f13691n = r4
            jf.b r4 = new jf.b
            ac.k r0 = r5.f6866a
            ac.k r0 = r0.g()
            f.r r5 = r5.f6867b
            f.r r1 = new f.r
            java.lang.Object r2 = r5.f2893f
            ac.k r2 = (ac.k) r2
            ac.k r2 = r2.g()
            java.lang.Object r5 = r5.f2894g
            ac.k r5 = (ac.k) r5
            ac.k r5 = r5.g()
            r1.<init>(r2, r5)
            r4.<init>(r0, r1)
            r3.f13689l = r4
            r5 = 0
            r3.f0(r4, r5)
            return
    }

    public e(ud.u r4, od.a r5, int r6) {
            r3 = this;
            r3.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r3.f13695r = r0
            r3.f13699v = r0
            r3.f13700w = r0
            r3.f13701x = r3
            r1 = 1
            r3.f13702y = r1
            r3.f13703z = r0
            r3.A = r0
            r3.B = r0
            r3.C = r0
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r3.D = r0
            r3.f13688k = r4
            r0 = 0
            r3.f13689l = r0
            r3.f13690m = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f13694q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f13697t = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.f13698u = r0
            b5.k r0 = new b5.k
            r2 = 3
            r0.<init>(r6, r1, r2)
            r3.f13692o = r0
            java.lang.String r5 = r5.l()
            ud.s r4 = ud.s.I(r4, r5)
            java.util.ArrayList r5 = r4.f13737o
            r5.add(r3)
            r3.f13691n = r4
            return
    }

    public static ud.e T(ud.u r1, od.a r2, int r3) {
            ud.e r0 = new ud.e
            r0.<init>(r1, r2, r3)
            md.a r2 = md.a.f8831m
            r0.w(r2)
            java.lang.String r2 = "synthetic"
            r0.f13696s = r2
            r2 = 4
            r0.f13702y = r2
            java.util.ArrayList r2 = r1.f13755n
            r2.add(r0)
            java.util.HashMap r2 = r1.f13753l
            od.a r3 = r0.f13690m
            r2.put(r3, r0)
            java.util.HashMap r1 = r1.f13754m
            java.lang.String r2 = r0.Z()
            r1.put(r2, r0)
            return r0
    }

    public static void g0(ud.e r7) {
            md.f r0 = r7.f8877g
            oc.c r1 = oc.c.f9759e
            oc.b r0 = r0.c(r1)
            pc.b r0 = (pc.b) r0
            if (r0 == 0) goto L58
            r7.E(r1)
            java.util.LinkedHashMap r0 = r0.f10461g
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            ud.r r2 = r7.n0(r2)
            if (r2 == 0) goto L40
            pc.a r3 = new pc.a
            java.lang.Object r1 = r1.getValue()
            nc.a r1 = (nc.a) r1
            r3.<init>(r1)
            r2.y(r3)
            goto L19
        L40:
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Method from annotation default annotation not found: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r7.L(r1)
            goto L19
        L58:
            od.a r0 = r7.f13690m
            md.f r1 = r7.f8877g
            oc.c r2 = oc.c.f9757c
            oc.b r1 = r1.c(r2)
            pc.k r1 = (pc.k) r1
            if (r1 != 0) goto L68
            goto Ld4
        L68:
            java.lang.String r1 = r1.f10473g
            java.lang.String r3 = ".java"
            boolean r3 = r1.endsWith(r3)
            if (r3 == 0) goto L78
            r3 = 5
            r4 = 0
            java.lang.String r1 = wb.en.f(r3, r4, r1)
        L78:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Ld5
            java.lang.String r3 = "SourceFile"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L87
            goto Ld5
        L87:
            if (r0 == 0) goto Ld4
            java.lang.String r3 = r0.f9766h
            boolean r4 = r1.equals(r3)
            if (r4 == 0) goto L92
            goto Ld5
        L92:
            od.a r0 = r0.f9769k
        L94:
            java.lang.String r4 = "$"
            if (r0 == 0) goto Lae
            java.lang.String r5 = r0.f9766h
            boolean r6 = r5.equals(r1)
            if (r6 != 0) goto Ld5
            java.lang.String r4 = r1.concat(r4)
            boolean r4 = r5.startsWith(r4)
            if (r4 == 0) goto Lab
            goto Ld5
        Lab:
            od.a r0 = r0.f9769k
            goto L94
        Lae:
            boolean r0 = r1.contains(r4)
            if (r0 == 0) goto Lc7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto Lc7
            goto Ld5
        Lc7:
            boolean r0 = r3.contains(r4)
            if (r0 == 0) goto Ld4
            boolean r0 = r3.startsWith(r1)
            if (r0 == 0) goto Ld4
            goto Ld5
        Ld4:
            return
        Ld5:
            r7.E(r2)
            return
    }

    public static void h0(bc.d r5) {
            b.e r5 = r5.c()
            java.lang.Object r5 = r5.f333i
            java.util.NavigableMap r5 = (java.util.NavigableMap) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            hc.a r2 = (hc.a) r2
            int r3 = r2.j()
            r4 = 7
            if (r3 != r4) goto L17
            ic.b r2 = (ic.b) r2
            java.lang.Object r1 = r1.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            hc.c r2 = r2.f6652g
            r2.t(r1)
            goto L17
        L42:
            java.util.Collection r5 = r5.values()
            ud.b r0 = new ud.b
            r1 = 0
            r0.<init>(r1)
            r5.removeIf(r0)
            return
    }

    @Override // nd.b0
    public final b5.k O() {
            r1 = this;
            b5.k r0 = r1.f13692o
            return r0
    }

    @Override // nd.b0
    public final ud.e P() {
            r1 = this;
            boolean r0 = r1.d0()
            if (r0 == 0) goto L9
            ud.e r0 = r1.f13701x
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // nd.b0
    public final void Q(b5.k r1) {
            r0 = this;
            r0.f13692o = r1
            return
    }

    public final void R(ud.g r3) {
            r2 = this;
            java.util.List r0 = r2.f13698u
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
        La:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.f13698u = r0
        L12:
            java.util.List r0 = r2.f13698u
            r0.add(r3)
            return
    }

    public final void S(ud.e r3) {
            r2 = this;
            java.util.List r0 = r2.f13700w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            r2.f13700w = r0
        L10:
            nd.m r0 = new nd.m
            r0.<init>(r2)
            r3.y(r0)
            java.util.List r0 = r2.f13700w
            r0.add(r3)
            return
    }

    public final qd.j U(jf.b r4) {
            r3 = this;
            ac.k r4 = r4.f6866a
            r0 = 8
            r4.B(r0)
            java.lang.Object r0 = r4.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            java.lang.String r4 = r4.y(r0)
            if (r4 != 0) goto L43
            od.a r4 = r3.f13690m
            qd.j r0 = r4.f9765g
            java.lang.String r0 = r0.l()
            java.lang.String r1 = "java.lang.Object"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L27
            return r1
        L27:
            b5.k r0 = r3.f13692o
            int r0 = r0.f488b
            r2 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r2
            if (r0 == 0) goto L32
            return r1
        L32:
            qd.j r4 = r4.f9765g
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "No super class in "
            java.lang.String r4 = r0.concat(r4)
            ah.a.k(r4)
            r4 = 0
            return r4
        L43:
            qd.j r4 = qd.j.x(r4)
            return r4
    }

    public final synchronized bc.d V() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.d0()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            fc.e r0 = bc.d.f707a     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r4)
            return r0
        Lb:
            r0 = move-exception
            goto L48
        Ld:
            ud.u r0 = r4.f13688k     // Catch: java.lang.Throwable -> Lb
            bc.g r0 = r0.f13742a     // Catch: java.lang.Throwable -> Lb
            bc.c r0 = r0.f716k     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = r4.Z()     // Catch: java.lang.Throwable -> Lb
            bc.d r2 = r0.v(r1)     // Catch: java.lang.Throwable -> Lb
            fc.e r3 = bc.d.f707a     // Catch: java.lang.Throwable -> Lb
            if (r2 == r3) goto L21
            monitor-exit(r4)
            return r2
        L21:
            ud.u r2 = r4.f13688k     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            dd.b r2 = r2.f13759r     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            bc.d r2 = r2.b(r4)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            h0(r2)     // Catch: java.lang.Throwable -> Lb java.lang.Exception -> L2d java.lang.StackOverflowError -> L2f
            goto L3f
        L2d:
            r2 = move-exception
            goto L30
        L2f:
            r2 = move-exception
        L30:
            java.lang.String r3 = "Code generation failed"
            xe.h.a(r4, r3, r2)     // Catch: java.lang.Throwable -> Lb
            fc.e r3 = new fc.e     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = xe.s.g(r2)     // Catch: java.lang.Throwable -> Lb
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = r3
        L3f:
            fc.e r3 = bc.d.f707a     // Catch: java.lang.Throwable -> Lb
            if (r2 == r3) goto L46
            r0.r(r1, r2)     // Catch: java.lang.Throwable -> Lb
        L46:
            monitor-exit(r4)
            return r2
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    public final void W() {
            r4 = this;
            jf.b r0 = r4.f13689l
            if (r0 != 0) goto L5
            return
        L5:
            md.g r1 = md.e.f8876h
            r4.f8877g = r1
            r4.o0()
            ud.u r1 = r4.f13688k
            j8.f r1 = r1.f13745d
            java.lang.Object r2 = r1.f6782c
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.remove(r4)
            java.lang.Object r1 = r1.f6781b
            od.b r1 = (od.b) r1
            java.util.concurrent.ConcurrentHashMap r1 = r1.f9771a
            java.util.Set r1 = r1.entrySet()
            be.g0 r2 = new be.g0
            r3 = 3
            r2.<init>(r4, r3)
            r1.removeIf(r2)
            r1 = 1
            r4.f0(r0, r1)
            java.util.List r0 = r4.f13699v
            ae.e r1 = new ae.e
            r2 = 28
            r1.<init>(r2)
            r0.forEach(r1)
            return
    }

    public final ud.l X(java.lang.Object r2, boolean r3) {
            r1 = this;
            ud.u r0 = r1.f13688k
            j8.f r0 = r0.f13745d
            ud.l r2 = r0.f(r1, r2, r3)
            return r2
    }

    public final ud.l Y(qd.n r10) {
            r9 = this;
            ud.u r0 = r9.f13688k
            j8.f r0 = r0.f13745d
            boolean r1 = r0.f6780a
            if (r1 != 0) goto L9
            goto L21
        L9:
            qd.j r1 = r10.f10902i
            qd.q r1 = r1.o()
            if (r1 != 0) goto L12
            goto L21
        L12:
            long r2 = r10.f10905l
            int r10 = r1.ordinal()
            r4 = 10
            r6 = 100
            r1 = 1
            r8 = 0
            switch(r10) {
                case 0: goto Lb9;
                case 1: goto La4;
                case 2: goto L8f;
                case 3: goto L7a;
                case 4: goto L66;
                case 5: goto L4f;
                case 6: goto L3a;
                case 7: goto L23;
                default: goto L21;
            }
        L21:
            r10 = 0
            return r10
        L23:
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r10 = java.lang.Double.valueOf(r2)
            r4 = 0
            int r2 = java.lang.Double.compare(r2, r4)
            if (r2 != 0) goto L34
            goto L35
        L34:
            r1 = r8
        L35:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        L3a:
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49
            goto L4a
        L49:
            r1 = r8
        L4a:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        L4f:
            int r10 = (int) r2
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r2 = java.lang.Float.valueOf(r10)
            r3 = 0
            int r10 = java.lang.Float.compare(r10, r3)
            if (r10 != 0) goto L60
            goto L61
        L60:
            r1 = r8
        L61:
            ud.l r10 = r0.f(r9, r2, r1)
            return r10
        L66:
            int r10 = (int) r2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            long r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L74
            goto L75
        L74:
            r1 = r8
        L75:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        L7a:
            int r10 = (int) r2
            short r10 = (short) r10
            java.lang.Short r10 = java.lang.Short.valueOf(r10)
            long r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L89
            goto L8a
        L89:
            r1 = r8
        L8a:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        L8f:
            int r10 = (int) r2
            byte r10 = (byte) r10
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)
            long r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L9e
            goto L9f
        L9e:
            r1 = r8
        L9f:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        La4:
            int r10 = (int) r2
            char r10 = (char) r10
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            long r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Lb3
            goto Lb4
        Lb3:
            r1 = r8
        Lb4:
            ud.l r10 = r0.f(r9, r10, r1)
            return r10
        Lb9:
            r4 = 1
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto Lc0
            goto Lc1
        Lc0:
            r1 = r8
        Lc1:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            ud.l r10 = r0.f(r9, r10, r8)
            return r10
    }

    public final java.lang.String Z() {
            r1 = this;
            od.a r0 = r1.f13690m
            qd.j r0 = r0.f9765g
            java.lang.String r0 = r0.l()
            return r0
    }

    public final ud.e a0() {
            r1 = this;
            ud.e r0 = r1.f13701x
            if (r0 != r1) goto L5
            return r1
        L5:
            ud.e r0 = r0.a0()
            return r0
    }

    public final qd.j b0() {
            r2 = this;
            od.a r0 = r2.f13690m
            qd.j r0 = r0.f9765g
            java.util.List r1 = r2.f13695r
            boolean r1 = xe.s.n(r1)
            if (r1 == 0) goto L12
            java.util.List r1 = r2.f13695r
            qd.b r0 = qd.j.e(r0, r1)
        L12:
            return r0
    }

    public final boolean c0() {
            r2 = this;
            b5.k r0 = r2.f13692o
            boolean r0 = r0.b()
            if (r0 == 0) goto L1c
            qd.j r0 = r2.f13693p
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.l()
            qd.e r1 = qd.j.f10880n
            java.lang.String r1 = r1.K
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ud.e r2 = (ud.e) r2
            od.a r0 = r1.f13690m
            od.a r2 = r2.f13690m
            int r2 = r0.b(r2)
            return r2
    }

    public final boolean d0() {
            r1 = this;
            ud.e r0 = r1.f13701x
            if (r0 == r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final void e0() {
            r4 = this;
            java.util.List r0 = r4.f13697t
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            r1.a0()     // Catch: java.lang.Exception -> L16
            goto L6
        L16:
            r2 = move-exception
            r1.getClass()
            java.lang.String r3 = "Method load error"
            xe.h.a(r1, r3, r2)
            goto L6
        L20:
            java.util.List r0 = r4.f13699v
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            ud.e r1 = (ud.e) r1
            r1.e0()
            goto L26
        L36:
            r0 = 2
            r4.f13702y = r0
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof ud.e
            if (r0 == 0) goto L13
            ud.e r2 = (ud.e) r2
            od.a r0 = r1.f13690m
            od.a r2 = r2.f13690m
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void f0(jf.b r7, boolean r8) {
            r6 = this;
            od.a r0 = r6.f13690m
            java.util.ArrayList r1 = r7.a()     // Catch: java.lang.Exception -> La0
            ac.k r2 = r7.f6866a     // Catch: java.lang.Exception -> La0
            r6.z(r1)     // Catch: java.lang.Exception -> La0
            b5.k r1 = new b5.k     // Catch: java.lang.Exception -> La0
            oc.c r3 = oc.c.f9758d     // Catch: java.lang.Exception -> La0
            md.f r4 = r6.f8877g     // Catch: java.lang.Exception -> La0
            oc.b r3 = r4.c(r3)     // Catch: java.lang.Exception -> La0
            pc.f r3 = (pc.f) r3     // Catch: java.lang.Exception -> La0
            if (r3 == 0) goto L2a
            java.util.Map r3 = r3.f10465g     // Catch: java.lang.Exception -> La0
            java.lang.String r4 = r7.b()     // Catch: java.lang.Exception -> La0
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> La0
            pc.g r3 = (pc.g) r3     // Catch: java.lang.Exception -> La0
            if (r3 == 0) goto L2a
            int r3 = r3.f10468c     // Catch: java.lang.Exception -> La0
            goto L36
        L2a:
            r3 = 4
            r2.B(r3)     // Catch: java.lang.Exception -> La0
            java.lang.Object r3 = r2.f178i     // Catch: java.lang.Exception -> La0
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3     // Catch: java.lang.Exception -> La0
            int r3 = r3.getInt()     // Catch: java.lang.Exception -> La0
        L36:
            r4 = 3
            r5 = 1
            r1.<init>(r3, r5, r4)     // Catch: java.lang.Exception -> La0
            r6.f13692o = r1     // Catch: java.lang.Exception -> La0
            qd.j r1 = r6.U(r7)     // Catch: java.lang.Exception -> La0
            r6.f13693p = r1     // Catch: java.lang.Exception -> La0
            r1 = 12
            r2.B(r1)     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r2.f178i     // Catch: java.lang.Exception -> La0
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch: java.lang.Exception -> La0
            int r1 = r1.getInt()     // Catch: java.lang.Exception -> La0
            if (r1 != 0) goto L55
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> La0
            goto L5c
        L55:
            r2.a(r1)     // Catch: java.lang.Exception -> La0
            java.util.List r1 = r2.J()     // Catch: java.lang.Exception -> La0
        L5c:
            me.a r3 = new me.a     // Catch: java.lang.Exception -> La0
            r4 = 14
            r3.<init>(r4)     // Catch: java.lang.Exception -> La0
            java.util.List r1 = xe.s.c(r1, r3)     // Catch: java.lang.Exception -> La0
            r6.f13694q = r1     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r2.f179j     // Catch: java.lang.Exception -> La0
            ff.e r1 = (ff.e) r1     // Catch: java.lang.Exception -> La0
            java.lang.String r1 = r1.f3932b     // Catch: java.lang.Exception -> La0
            r6.f13696s = r1     // Catch: java.lang.Exception -> La0
            qc.e r1 = new qc.e     // Catch: java.lang.Exception -> La0
            ud.c r2 = new ud.c     // Catch: java.lang.Exception -> La0
            r3 = 0
            r2.<init>(r6, r3)     // Catch: java.lang.Exception -> La0
            r1.<init>(r2)     // Catch: java.lang.Exception -> La0
            qc.e r2 = new qc.e     // Catch: java.lang.Exception -> La0
            ud.c r3 = new ud.c     // Catch: java.lang.Exception -> La0
            r4 = 1
            r3.<init>(r6, r4)     // Catch: java.lang.Exception -> La0
            r2.<init>(r3)     // Catch: java.lang.Exception -> La0
            r7.e(r1, r2)     // Catch: java.lang.Exception -> La0
            java.util.List r7 = r1.f10864b     // Catch: java.lang.Exception -> La0
            if (r7 != 0) goto L90
            java.util.List r7 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> La0
        L90:
            r6.f13698u = r7     // Catch: java.lang.Exception -> La0
            java.util.List r7 = r2.f10864b     // Catch: java.lang.Exception -> La0
            if (r7 != 0) goto L98
            java.util.List r7 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> La0
        L98:
            r6.f13697t = r7     // Catch: java.lang.Exception -> La0
            if (r8 == 0) goto La3
            r6.k0()     // Catch: java.lang.Exception -> La0
            goto La3
        La0:
            r7 = move-exception
            goto L13c
        La3:
            java.util.List r7 = r6.f13698u     // Catch: java.lang.Exception -> La0
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Exception -> La0
            if (r8 == 0) goto Lac
            goto Lda
        Lac:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> La0
        Lb0:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> La0
            if (r8 == 0) goto Lda
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> La0
            ud.g r8 = (ud.g) r8     // Catch: java.lang.Exception -> La0
            b5.k r1 = r8.f13708m     // Catch: java.lang.Exception -> La0
            boolean r2 = r1.h()     // Catch: java.lang.Exception -> La0
            if (r2 == 0) goto Lb0
            boolean r1 = r1.c()     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto Lb0
            oc.c r1 = oc.c.f9760f     // Catch: java.lang.Exception -> La0
            md.f r2 = r8.f8877g     // Catch: java.lang.Exception -> La0
            oc.b r1 = r2.c(r1)     // Catch: java.lang.Exception -> La0
            if (r1 != 0) goto Lb0
            nc.a r1 = nc.a.f9340i     // Catch: java.lang.Exception -> La0
            r8.y(r1)     // Catch: java.lang.Exception -> La0
            goto Lb0
        Lda:
            g0(r6)     // Catch: java.lang.Exception -> La0
            java.lang.String r7 = r0.f9766h     // Catch: java.lang.Exception -> La0
            java.lang.String r8 = "package-info"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> La0
            if (r7 == 0) goto L101
            java.util.List r7 = r6.f13698u     // Catch: java.lang.Exception -> La0
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Exception -> La0
            if (r7 == 0) goto L101
            java.util.List r7 = r6.f13697t     // Catch: java.lang.Exception -> La0
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Exception -> La0
            if (r7 == 0) goto L101
            md.a r7 = md.a.L     // Catch: java.lang.Exception -> La0
            r6.w(r7)     // Catch: java.lang.Exception -> La0
            md.a r7 = md.a.f8843x     // Catch: java.lang.Exception -> La0
            r6.w(r7)     // Catch: java.lang.Exception -> La0
        L101:
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Exception -> La0
            java.util.List r8 = r6.f13697t     // Catch: java.lang.Exception -> La0
            int r8 = r8.size()     // Catch: java.lang.Exception -> La0
            r7.<init>(r8)     // Catch: java.lang.Exception -> La0
            r6.D = r7     // Catch: java.lang.Exception -> La0
            java.util.List r7 = r6.f13697t     // Catch: java.lang.Exception -> La0
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> La0
        L114:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Exception -> La0
            if (r8 == 0) goto L128
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Exception -> La0
            ud.r r8 = (ud.r) r8     // Catch: java.lang.Exception -> La0
            java.util.Map r1 = r6.D     // Catch: java.lang.Exception -> La0
            od.d r2 = r8.f13717k     // Catch: java.lang.Exception -> La0
            r1.put(r2, r8)     // Catch: java.lang.Exception -> La0
            goto L114
        L128:
            b5.k r7 = r6.f13692o     // Catch: java.lang.Exception -> La0
            int r7 = r7.f488b     // Catch: java.lang.Exception -> La0
            r8 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 & r8
            if (r7 == 0) goto L133
            goto L134
        L133:
            r5 = 0
        L134:
            if (r5 == 0) goto L13b
            java.lang.String r7 = "Modules not supported yet"
            r6.L(r7)     // Catch: java.lang.Exception -> La0
        L13b:
            return
        L13c:
            af.g r8 = new af.g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Error decode class: "
            java.lang.String r0 = r1.concat(r0)
            r8.<init>(r0, r7)
            throw r8
    }

    public final int hashCode() {
            r1 = this;
            od.a r0 = r1.f13690m
            qd.j r0 = r0.f9765g
            int r0 = r0.f10893a
            return r0
    }

    public final void i0(ud.e r3) {
            r2 = this;
            java.util.List r0 = r2.f13703z
            if (r0 == 0) goto L19
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L19
        Lb:
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L19
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L19
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L19:
            r2.f13703z = r0
            return
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void j0(java.lang.String r7) {
            r6 = this;
            r0 = 46
            int r0 = r7.indexOf(r0)
            r1 = -1
            od.a r2 = r6.f13690m
            if (r0 != r1) goto Lf
            r2.a(r7)
            return
        Lf:
            boolean r0 = r2.o()
            od.a r1 = new od.a
            qd.j r3 = qd.j.x(r7)
            ud.u r4 = r6.f13688k
            r1.<init>(r4, r3, r0)
            java.lang.String r0 = r1.l()
            java.lang.String r1 = r1.f9766h
            boolean r3 = r2.o()
            java.lang.String r5 = "Can't change package for inner class: "
            if (r3 == 0) goto L55
            java.lang.String r3 = r2.l()
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L51
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            r3.append(r0)
            java.lang.String r0 = " to "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r6.K(r7)
        L51:
            r2.a(r1)
            return
        L55:
            java.lang.String r7 = r2.j()
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L63
            r2.a(r1)
            return
        L63:
            boolean r7 = r2.o()
            if (r7 != 0) goto Lb0
            ud.s r7 = r6.f13691n
            r4.getClass()
            java.util.ArrayList r3 = r7.f13737o
            boolean r3 = r3.remove(r6)
            if (r3 == 0) goto L89
            java.util.ArrayList r3 = r7.f13737o
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L89
            java.util.ArrayList r3 = r7.f13736n
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L89
            r4.e(r7)
        L89:
            ud.s r7 = ud.s.I(r4, r0)
            java.util.ArrayList r3 = r7.f13737o
            r3.add(r6)
            r6.f13691n = r7
            java.util.ArrayList r7 = r4.f13757p
            java.util.Collections.sort(r7)
            boolean r7 = r2.o()
            if (r7 != 0) goto Laa
            g8.h r7 = new g8.h
            r7.<init>(r0, r1)
            r2.c(r7)
            r2.f9770l = r7
            return
        Laa:
            java.lang.String r7 = "Can't change package for inner class"
            ah.a.k(r7)
            return
        Lb0:
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r7 = r5.concat(r7)
            ah.a.k(r7)
            return
    }

    public final void k0() {
            r4 = this;
            ud.u r0 = r4.f13688k
            bc.g r1 = r0.f13742a
            bd.a r1 = r1.f717l
            i4.c0 r0 = r1.f(r0)
            if (r0 == 0) goto L8d
            java.lang.Object r1 = r0.f6444b
            b5.h r1 = (b5.h) r1
            java.util.HashMap r1 = r1.f474a
            java.lang.Object r1 = r1.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            java.util.List r1 = i4.c0.j(r1)
            r4.f13703z = r1
            java.lang.Object r1 = r0.f6445c
            b5.h r1 = (b5.h) r1
            java.util.HashMap r1 = r1.f474a
            java.lang.Object r1 = r1.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            java.util.List r1 = i4.c0.j(r1)
            r4.B = r1
            java.lang.Object r1 = r0.f6446d
            b5.h r1 = (b5.h) r1
            java.util.HashMap r1 = r1.f474a
            java.lang.Object r1 = r1.get(r4)
            java.util.Set r1 = (java.util.Set) r1
            java.util.List r1 = i4.c0.j(r1)
            r4.C = r1
            java.util.List r1 = r4.f13698u
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            ud.g r2 = (ud.g) r2
            java.lang.Object r3 = r0.f6447e
            b5.h r3 = (b5.h) r3
            java.util.HashMap r3 = r3.f474a
            java.lang.Object r3 = r3.get(r2)
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.f13710o = r3
            goto L48
        L67:
            java.util.List r1 = r4.f13697t
            java.util.Iterator r1 = r1.iterator()
        L6d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r1.next()
            ud.r r2 = (ud.r) r2
            java.lang.Object r3 = r0.f6448f
            b5.h r3 = (b5.h) r3
            java.util.HashMap r3 = r3.f474a
            java.lang.Object r3 = r3.get(r2)
            java.util.Set r3 = (java.util.Set) r3
            java.util.List r3 = i4.c0.j(r3)
            r2.H = r3
            goto L6d
        L8c:
            return
        L8d:
            mh.b r0 = ud.e.F
            java.lang.String r1 = "Can't restore usage data for class: {}"
            r0.h(r4, r1)
            return
    }

    public final ud.g l0(od.c r4) {
            r3 = this;
            java.util.List r0 = r3.f13698u
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            ud.g r1 = (ud.g) r1
            od.c r2 = r1.f13707l
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1b:
            r4 = 0
            return r4
    }

    @Override // ud.k
    public final java.lang.String m() {
            r1 = this;
            java.lang.String r0 = r1.f13696s
            return r0
    }

    public final ud.r m0(java.lang.String r4) {
            r3 = this;
            java.util.List r0 = r3.f13697t
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            od.d r2 = r1.f13717k
            java.lang.String r2 = r2.f9781k
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    @Override // ud.k
    public final ud.u n() {
            r1 = this;
            ud.u r0 = r1.f13688k
            return r0
    }

    public final ud.r n0(java.lang.String r4) {
            r3 = this;
            java.util.List r0 = r3.f13697t
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            od.d r2 = r1.f13717k
            java.lang.String r2 = r2.f9777g
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            return r1
        L1d:
            r4 = 0
            return r4
    }

    public final void o0() {
            r5 = this;
            int r0 = r5.f13702y
            r1 = 1
            if (r0 != r1) goto L6
            return
        L6:
            od.a r0 = r5.f13690m
            monitor-enter(r0)
            java.util.List r2 = r5.f13697t     // Catch: java.lang.Throwable -> L32
            ae.e r3 = new ae.e     // Catch: java.lang.Throwable -> L32
            r4 = 29
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L32
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L32
            java.util.List r2 = r5.f13699v     // Catch: java.lang.Throwable -> L32
            ud.d r3 = new ud.d     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L32
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L32
            java.util.List r2 = r5.f13698u     // Catch: java.lang.Throwable -> L32
            ud.d r3 = new ud.d     // Catch: java.lang.Throwable -> L32
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L32
            r2.forEach(r3)     // Catch: java.lang.Throwable -> L32
            r5.F()     // Catch: java.lang.Throwable -> L32
            r5.f13702y = r1     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    public final void p0(be.f0 r5) {
            r4 = this;
            ud.u r0 = r4.f13688k
            fe.a r0 = r0.f13750i
            qd.j r1 = r4.b0()
            qd.j r2 = r4.f13693p
            qd.e r3 = qd.j.f10877k
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            qd.j r2 = r4.f13693p
            r5.accept(r1, r2)
            qd.j r2 = r4.f13693p
            r0.n(r2, r5)
        L1c:
            java.util.List r2 = r4.f13694q
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()
            qd.j r3 = (qd.j) r3
            r5.accept(r1, r3)
            r0.n(r3, r5)
            goto L22
        L35:
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            od.a r0 = r1.f13690m
            java.lang.String r0 = r0.f9768j
            return r0
    }

    @Override // ud.k
    public final java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "class"
            return r0
    }
}
