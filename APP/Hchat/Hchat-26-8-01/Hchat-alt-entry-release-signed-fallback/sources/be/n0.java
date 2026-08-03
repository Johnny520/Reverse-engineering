package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends be.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mh.b f834h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public od.d f835g;

    static {
            java.lang.Class<be.n0> r0 = be.n0.class
            mh.b r0 = mh.d.b(r0)
            be.n0.f834h = r0
            return
    }

    public static java.util.List i(java.util.List r12) {
            java.util.Iterator r0 = r12.iterator()
            r1 = 0
            r2 = r1
        L6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r0.next()
            qd.l r3 = (qd.l) r3
            boolean r3 = r3.K()
            if (r3 == 0) goto Lce
            if (r2 == 0) goto Lce
            int r0 = r12.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
        L28:
            if (r1 >= r0) goto Lc0
            java.lang.Object r4 = r12.get(r1)
            qd.l r4 = (qd.l) r4
            r4.getClass()
            boolean r5 = r4 instanceof qd.n
            r6 = 0
            if (r5 == 0) goto L92
            r5 = r4
            qd.n r5 = (qd.n) r5
            mh.b r7 = fd.j.f3921a
            qd.j r7 = r5.f10902i
            if (r7 != 0) goto L42
            goto La3
        L42:
            long r8 = r5.f10905l
            qd.q r5 = r7.o()
            int r5 = r5.ordinal()
            r10 = 0
            switch(r5) {
                case 0: goto L88;
                case 1: goto L81;
                case 2: goto L7c;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L72;
                case 6: goto L7c;
                case 7: goto L69;
                case 8: goto L52;
                case 9: goto L52;
                default: goto L51;
            }
        L51:
            goto La3
        L52:
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L66
            mh.b r5 = fd.j.f3921a
            java.lang.String r6 = "Wrong object literal: {} for type: {}"
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            r5.s(r10, r6, r7)
            java.lang.String r6 = java.lang.Long.toString(r8)
            goto La3
        L66:
            java.lang.String r6 = "null"
            goto La3
        L69:
            double r5 = java.lang.Double.longBitsToDouble(r8)
            java.lang.String r6 = java.lang.Double.toString(r5)
            goto La3
        L72:
            int r5 = (int) r8
            float r5 = java.lang.Float.intBitsToFloat(r5)
            java.lang.String r6 = java.lang.Float.toString(r5)
            goto La3
        L7c:
            java.lang.String r6 = java.lang.Long.toString(r8)
            goto La3
        L81:
            int r5 = (int) r8
            char r5 = (char) r5
            java.lang.String r6 = java.lang.String.valueOf(r5)
            goto La3
        L88:
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto L8f
            java.lang.String r6 = "false"
            goto La3
        L8f:
            java.lang.String r6 = "true"
            goto La3
        L92:
            boolean r5 = r4 instanceof qd.m
            if (r5 == 0) goto La3
            r5 = r4
            qd.m r5 = (qd.m) r5
            ud.p r5 = r5.f10904l
            boolean r7 = r5 instanceof pd.d
            if (r7 == 0) goto La3
            pd.d r5 = (pd.d) r5
            java.lang.String r6 = r5.f10477o
        La3:
            if (r6 == 0) goto La9
            r3.add(r6)
            goto Lbc
        La9:
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto Lb9
            qd.l r5 = k(r3, r12, r1)
            r2.add(r5)
            r3.clear()
        Lb9:
            r2.add(r4)
        Lbc:
            int r1 = r1 + 1
            goto L28
        Lc0:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto Lcd
            qd.l r12 = k(r3, r12, r0)
            r2.add(r12)
        Lcd:
            return r2
        Lce:
            r2 = r3
            goto L6
        Ld1:
            return r12
    }

    public static ud.p j(ud.r r10, pd.n r11, java.util.List r12) {
            r0 = 0
            int r1 = r12.size()     // Catch: java.lang.Exception -> L41
            r2 = 2
            if (r1 >= r2) goto La
            goto L7e
        La:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L41
            r3.<init>(r1)     // Catch: java.lang.Exception -> L41
            r4 = 0
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.Exception -> L41
            ud.p r5 = (ud.p) r5     // Catch: java.lang.Exception -> L41
            pd.k r6 = r5.f13713k     // Catch: java.lang.Exception -> L41
            pd.k r7 = pd.k.S     // Catch: java.lang.Exception -> L41
            if (r6 == r7) goto L1d
            goto L7e
        L1d:
            td.a r5 = (td.a) r5     // Catch: java.lang.Exception -> L41
            java.util.List r6 = r5.f13715m     // Catch: java.lang.Exception -> L41
            int r6 = r6.size()     // Catch: java.lang.Exception -> L41
            r7 = 1
            if (r6 != r7) goto L44
            od.d r6 = r5.f13119o     // Catch: java.lang.Exception -> L41
            java.util.List r6 = r6.f9779i     // Catch: java.lang.Exception -> L41
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Exception -> L41
            qd.j r6 = (qd.j) r6     // Catch: java.lang.Exception -> L41
            boolean r6 = r6.v()     // Catch: java.lang.Exception -> L41
            if (r6 != 0) goto L39
            goto L7e
        L39:
            qd.l r4 = r5.S(r4)     // Catch: java.lang.Exception -> L41
            r3.add(r4)     // Catch: java.lang.Exception -> L41
            goto L44
        L41:
            r11 = move-exception
            goto L103
        L44:
            r4 = r7
        L45:
            if (r4 >= r1) goto L85
            java.lang.Object r5 = r12.get(r4)     // Catch: java.lang.Exception -> L41
            ud.p r5 = (ud.p) r5     // Catch: java.lang.Exception -> L41
            pd.k r6 = r5.f13713k     // Catch: java.lang.Exception -> L41
            pd.k r8 = pd.k.O     // Catch: java.lang.Exception -> L41
            if (r6 != r8) goto L7b
            java.util.List r6 = r5.f13715m     // Catch: java.lang.Exception -> L41
            int r6 = r6.size()     // Catch: java.lang.Exception -> L41
            if (r6 != r2) goto L7b
            r6 = r5
            pd.n r6 = (pd.n) r6     // Catch: java.lang.Exception -> L41
            od.d r6 = r6.f10526p     // Catch: java.lang.Exception -> L41
            od.a r8 = r6.f9780j     // Catch: java.lang.Exception -> L41
            java.lang.String r8 = r8.f9768j     // Catch: java.lang.Exception -> L41
            java.lang.String r9 = "java.lang.StringBuilder"
            boolean r8 = r8.equals(r9)     // Catch: java.lang.Exception -> L41
            if (r8 == 0) goto L7b
            java.lang.String r6 = r6.f9777g     // Catch: java.lang.Exception -> L41
            java.lang.String r8 = "append"
            boolean r6 = r6.equals(r8)     // Catch: java.lang.Exception -> L41
            if (r6 == 0) goto L7b
            qd.l r5 = r5.S(r7)     // Catch: java.lang.Exception -> L41
            goto L7c
        L7b:
            r5 = r0
        L7c:
            if (r5 != 0) goto L7f
        L7e:
            return r0
        L7f:
            r3.add(r5)     // Catch: java.lang.Exception -> L41
            int r4 = r4 + 1
            goto L45
        L85:
            java.util.Iterator r1 = r3.iterator()     // Catch: java.lang.Exception -> L41
        L89:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto Le1
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L41
            qd.l r2 = (qd.l) r2     // Catch: java.lang.Exception -> L41
            qd.j r2 = r2.I()     // Catch: java.lang.Exception -> L41
            qd.e r4 = qd.j.f10879m     // Catch: java.lang.Exception -> L41
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L89
            ae.d r1 = new ae.d     // Catch: java.lang.Exception -> L41
            r2 = 19
            r1.<init>(r2)     // Catch: java.lang.Exception -> L41
            java.util.List r1 = xe.s.c(r3, r1)     // Catch: java.lang.Exception -> L41
            java.util.List r1 = i(r1)     // Catch: java.lang.Exception -> L41
            ud.p r2 = new ud.p     // Catch: java.lang.Exception -> L41
            pd.k r3 = pd.k.V     // Catch: java.lang.Exception -> L41
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> L41
            md.a r1 = md.a.f8831m     // Catch: java.lang.Exception -> L41
            r2.w(r1)     // Catch: java.lang.Exception -> L41
            qd.r r1 = r11.f13714l     // Catch: java.lang.Exception -> L41
            if (r1 != 0) goto Ld2
            md.a r1 = md.a.S     // Catch: java.lang.Exception -> L41
            md.f r3 = r11.f8877g     // Catch: java.lang.Exception -> L41
            boolean r1 = r3.a(r1)     // Catch: java.lang.Exception -> L41
            if (r1 != 0) goto Ld2
            qd.r r1 = r10.c0(r4)     // Catch: java.lang.Exception -> L41
            r2.d0(r1)     // Catch: java.lang.Exception -> L41
            goto Ld7
        Ld2:
            qd.r r1 = r11.f13714l     // Catch: java.lang.Exception -> L41
            r2.d0(r1)     // Catch: java.lang.Exception -> L41
        Ld7:
            r2.B(r11)     // Catch: java.lang.Exception -> L41
            r2.H(r11)     // Catch: java.lang.Exception -> L41
            l(r10, r11, r12)     // Catch: java.lang.Exception -> L41
            return r2
        Le1:
            ae.d r11 = new ae.d     // Catch: java.lang.Exception -> L41
            r12 = 18
            r11.<init>(r12)     // Catch: java.lang.Exception -> L41
            java.lang.String r12 = ", "
            java.lang.String r11 = xe.s.k(r3, r12, r11)     // Catch: java.lang.Exception -> L41
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r12.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = "TODO: convert one arg to string using `String.valueOf()`, args: "
            r12.append(r1)     // Catch: java.lang.Exception -> L41
            r12.append(r11)     // Catch: java.lang.Exception -> L41
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Exception -> L41
            r10.I(r11)     // Catch: java.lang.Exception -> L41
            return r0
        L103:
            java.lang.String r12 = "String concatenation convert failed"
            r10.M(r12, r11)
            return r0
    }

    public static qd.l k(java.util.ArrayList r2, java.util.List r3, int r4) {
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto Lf
            int r4 = r4 - r1
            java.lang.Object r2 = r3.get(r4)
            qd.l r2 = (qd.l) r2
            return r2
        Lf:
            boolean r3 = xe.s.h(r2)
            if (r3 == 0) goto L18
            java.lang.String r2 = ""
            goto L39
        L18:
            int r3 = r2.size()
            if (r3 != r1) goto L26
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L39
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            ae.g r4 = new ae.g
            r0 = 22
            r4.<init>(r3, r0)
            r2.forEach(r4)
            java.lang.String r2 = r3.toString()
        L39:
            pd.d r3 = new pd.d
            r3.<init>(r2)
            qd.m r2 = qd.l.Z(r3)
            return r2
    }

    public static void l(ud.r r2, pd.n r3, java.util.List r4) {
            xe.l.h(r2, r3)
            java.util.Iterator r0 = r4.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            xe.l.h(r2, r1)
            goto L7
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            ud.p r1 = (ud.p) r1
            if (r1 == r3) goto L20
            r0.add(r1)
            xe.l.j(r2, r1)
            goto L20
        L35:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L3c
            goto L53
        L3c:
            java.util.Iterator r3 = r0.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()
            ud.p r4 = (ud.p) r4
            xe.l.d(r2, r4)
            goto L40
        L50:
            r0.clear()
        L53:
            return
    }

    public static void n(ud.r r6, pd.i r7) {
            r0 = 0
            qd.l r1 = r7.S(r0)
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L4a
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            pd.k r2 = r1.f13713k
            pd.k r3 = pd.k.f10511t
            if (r2 == r3) goto L1a
            pd.k r3 = pd.k.f10512u
            if (r2 != r3) goto L4a
        L1a:
            r2 = 1
            qd.l r3 = r7.S(r2)
            boolean r3 = r3.R()
            if (r3 == 0) goto L43
            int r3 = r7.f10492p
            qd.l r4 = r1.S(r0)
            qd.l r4 = r4.H()
            qd.l r5 = r1.S(r2)
            qd.l r5 = r5.H()
            r7.f10492p = r3
            r7.c0(r0, r4)
            r7.c0(r2, r5)
            xe.l.j(r6, r1)
            return
        L43:
            mh.b r6 = be.n0.f834h
            java.lang.String r0 = "TODO: cmp {}"
            r6.h(r7, r0)
        L4a:
            return
    }

    @Override // be.a
    public final void f(ud.u r5) {
            r4 = this;
            qd.e r0 = qd.j.f10879m
            od.a r0 = od.a.e(r5, r0)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            qd.g r2 = qd.j.f10870d
            qd.a r3 = new qd.a
            r3.<init>(r2)
            java.lang.String r2 = "getBytes"
            od.d r5 = od.d.b(r5, r0, r2, r1, r3)
            r4.f835g = r5
            return
    }

    @Override // be.a
    public final void g(ud.r r4) {
            r3 = this;
            boolean r0 = r4.f13722p
            if (r0 == 0) goto L5
            goto L2d
        L5:
            java.util.List r0 = r4.f13732z
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r0.next()
            ud.a r2 = (ud.a) r2
            boolean r2 = r3.m(r4, r2)
            if (r2 == 0) goto Lc
            r1 = 1
            goto Lc
        L20:
            if (r1 != 0) goto L2e
            md.a r0 = md.a.f8814b0
            md.f r1 = r4.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L2d
            goto L2e
        L2d:
            return
        L2e:
            be.b.Y(r4)
            return
    }

    public final boolean m(ud.r r8, ud.a r9) {
            r7 = this;
            java.util.ArrayList r0 = r9.f13674l
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            int r4 = r0.size()
            if (r2 >= r4) goto L50
            java.lang.Object r4 = r0.get(r2)
            ud.p r4 = (ud.p) r4
            int r5 = r0.size()
            r6 = 0
            ud.p r6 = r7.o(r8, r4, r6)
            if (r6 == 0) goto L4d
            r6.Z()
            int r3 = r0.size()
            if (r2 >= r3) goto L2f
            java.lang.Object r3 = r0.get(r2)
            if (r3 != r4) goto L2f
            r0.set(r2, r6)
            goto L39
        L2f:
            int r3 = xe.k.a(r0, r4, r1)
            r4 = -1
            if (r3 == r4) goto L46
            r0.set(r3, r6)
        L39:
            int r3 = r0.size()
            r4 = 1
            if (r3 >= r5) goto L44
            r7.m(r8, r9)
            return r4
        L44:
            r3 = r4
            goto L4d
        L46:
            java.lang.String r8 = "Failed to replace insn"
            ah.a.k(r8)
            r8 = 0
            return r8
        L4d:
            int r2 = r2 + 1
            goto L5
        L50:
            return r3
    }

    public final ud.p o(ud.r r18, ud.p r19, ud.p r20) {
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r0 = r20
            md.f r4 = r3.f8877g
            pd.k r5 = r3.f13713k
            md.a r6 = md.a.f8838s
            boolean r4 = r4.a(r6)
            r6 = 0
            if (r4 == 0) goto L19
        L15:
            r16 = r6
            goto L4f8
        L19:
            java.util.List r4 = r3.f13715m
            java.util.Iterator r4 = r4.iterator()
            r7 = 0
            r8 = r7
        L21:
            boolean r9 = r4.hasNext()
            r10 = 1
            if (r9 == 0) goto L48
            java.lang.Object r9 = r4.next()
            qd.l r9 = (qd.l) r9
            r9.getClass()
            boolean r11 = r9 instanceof qd.m
            if (r11 == 0) goto L21
            r11 = r9
            qd.m r11 = (qd.m) r11
            ud.p r11 = r11.f10904l
            ud.p r12 = r1.o(r2, r11, r3)
            if (r12 == 0) goto L21
            r9.b0(r2, r12, r7)
            xe.l.j(r2, r11)
            r8 = r10
            goto L21
        L48:
            if (r8 == 0) goto L52
            r3.Z()
            md.a r4 = md.a.f8814b0
            r2.w(r4)
        L52:
            int r4 = r5.ordinal()
            r8 = 3
            pd.k r9 = pd.k.f10504m
            pd.k r11 = pd.k.f10498g
            if (r4 == r8) goto L40c
            r12 = 6
            if (r4 == r12) goto L3ed
            r11 = 8
            pd.k r12 = pd.k.f10501j
            if (r4 == r11) goto L314
            r11 = 15
            if (r4 == r11) goto L30b
            r11 = 20
            if (r4 == r11) goto L314
            r0 = 31
            if (r4 == r0) goto L241
            r0 = 33
            if (r4 == r0) goto L241
            r0 = 34
            if (r4 == r0) goto L154
            r0 = 37
            if (r4 == r0) goto L13b
            r0 = 38
            if (r4 == r0) goto L83
            goto L15
        L83:
            r0 = r3
            td.a r0 = (td.a) r0
            od.d r3 = r0.f13119o
            java.util.List r4 = r0.f13715m
            od.a r3 = r3.f9780j
            qd.j r3 = r3.f9765g
            qd.e r5 = qd.j.f10879m
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L15
            int r3 = r4.size()
            if (r3 == 0) goto L15
            qd.l r3 = r0.S(r7)
            r3.getClass()
            boolean r3 = r3 instanceof qd.m
            if (r3 == 0) goto L15
            qd.l r3 = r0.S(r7)
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            pd.k r5 = r3.f13713k
            java.util.List r9 = r3.f13715m
            pd.k r11 = pd.k.F
            if (r5 != r11) goto L15
            int r5 = r9.size()
            if (r5 == 0) goto L15
            r5 = r3
            pd.g r5 = (pd.g) r5
            qd.j r5 = r5.f10488o
            qd.g r11 = qd.j.f10870d
            if (r5 == r11) goto Lca
            qd.g r11 = qd.j.f10872f
            if (r5 != r11) goto L15
        Lca:
            int r5 = r9.size()
            byte[] r9 = new byte[r5]
            r11 = r7
            r12 = r11
        Ld2:
            if (r11 >= r5) goto Lf9
            qd.l r13 = r3.S(r11)
            r13.getClass()
            boolean r14 = r13 instanceof qd.n
            if (r14 != 0) goto Le1
            goto L15
        Le1:
            qd.n r13 = (qd.n) r13
            long r13 = r13.f10905l
            int r13 = (int) r13
            byte r13 = (byte) r13
            r9[r11] = r13
            char r13 = (char) r13
            java.util.regex.Pattern r14 = kd.d.f7584a
            r14 = 32
            if (r14 > r13) goto Lf6
            r14 = 126(0x7e, float:1.77E-43)
            if (r13 > r14) goto Lf6
            int r12 = r12 + 1
        Lf6:
            int r11 = r11 + 1
            goto Ld2
        Lf9:
            int r5 = r5 - r12
            if (r12 < r5) goto L15
            pd.d r3 = new pd.d
            java.lang.String r5 = new java.lang.String
            r5.<init>(r9)
            r3.<init>(r5)
            int r4 = r4.size()
            if (r4 != r10) goto L11f
            qd.r r4 = r0.f13714l
            r3.d0(r4)
            r3.B(r0)
            r3.H(r0)
            qd.l r0 = r0.S(r7)
            xe.l.i(r2, r0)
            return r3
        L11f:
            pd.n r2 = new pd.n
            od.d r4 = r1.f835g
            r2.<init>(r4, r8, r10)
            qd.m r3 = qd.l.Z(r3)
            r2.I(r3)
            qd.m r2 = qd.l.Z(r2)
            od.d r3 = r1.f835g
            qd.j r3 = r3.f9778h
            r2.f10902i = r3
            r0.c0(r7, r2)
            return r6
        L13b:
            r0 = r3
            td.b r0 = (td.b) r0
            yd.b r3 = r0.f13121o
            boolean r4 = r3.L()
            if (r4 == 0) goto L150
            xe.e r0 = r3.f22421k
            java.lang.Object r0 = r0.f21559b
            pd.i r0 = (pd.i) r0
            n(r2, r0)
            return r6
        L150:
            r0.i0()
            return r6
        L154:
            r0 = r3
            pd.n r0 = (pd.n) r0
            od.d r3 = r0.f10526p
            od.a r4 = r3.f9780j
            java.lang.String r4 = r4.f9768j
            java.lang.String r5 = "java.lang.StringBuilder"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L15
            java.lang.String r3 = r3.f9781k
            java.lang.String r4 = "toString()Ljava/lang/String;"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L15
            qd.l r3 = r0.S(r7)
            r3.getClass()
            boolean r4 = r3 instanceof qd.m
            if (r4 == 0) goto L1ad
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            qd.l r4 = r0.S(r7)
        L183:
            r4.getClass()
            boolean r5 = r4 instanceof qd.m
            if (r5 == 0) goto L1a5
            qd.m r4 = (qd.m) r4
            ud.p r4 = r4.f10904l
            r3.add(r4)
            pd.k r5 = r4.f13713k
            pd.k r6 = pd.k.S
            if (r5 == r6) goto L1a5
            java.util.List r5 = r4.f13715m
            int r5 = r5.size()
            if (r5 != 0) goto L1a0
            goto L1a5
        L1a0:
            qd.l r4 = r4.S(r7)
            goto L183
        L1a5:
            java.util.Collections.reverse(r3)
            ud.p r0 = j(r2, r0, r3)
            return r0
        L1ad:
            boolean r4 = r3 instanceof qd.r
            if (r4 == 0) goto L15
            qd.r r3 = (qd.r) r3
            qd.s r3 = r3.f10923m
            boolean r4 = r3.j()
            java.util.ArrayList r5 = r3.f10928j
            if (r4 != 0) goto L23a
            int r4 = r5.size()
            if (r4 != 0) goto L1c5
            goto L23a
        L1c5:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r5.size()
            int r6 = r6 + r10
            r4.<init>(r6)
            qd.r r3 = r3.f10927i
            ud.p r3 = r3.f10903j
            if (r3 != 0) goto L1d8
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L1d8:
            r4.add(r3)
            java.util.Iterator r5 = r5.iterator()
        L1df:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L1f6
            java.lang.Object r6 = r5.next()
            qd.r r6 = (qd.r) r6
            ud.p r6 = r6.f10903j
            if (r6 != 0) goto L1f2
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L1f2:
            r4.add(r6)
            goto L1df
        L1f6:
            int r5 = xe.k.a(r4, r0, r7)
            int r6 = r4.size()
            int r6 = r6 - r10
            if (r6 == r5) goto L204
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L204:
            r4.remove(r5)
            java.util.List r5 = r2.f13732z
            ud.a r5 = a.a.S(r2, r3, r5)
            if (r5 != 0) goto L212
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L212:
            java.util.ArrayList r5 = r5.f13674l
            int r3 = xe.k.a(r5, r3, r7)
            int r6 = r4.size()
            int r7 = r5.size()
            int r7 = r7 - r3
            if (r7 >= r6) goto L226
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L226:
            if (r10 >= r6) goto L23c
            int r7 = r3 + r10
            java.lang.Object r7 = r5.get(r7)
            java.lang.Object r8 = r4.get(r10)
            if (r7 == r8) goto L237
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            goto L23c
        L237:
            int r10 = r10 + 1
            goto L226
        L23a:
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L23c:
            ud.p r0 = j(r2, r0, r4)
            return r0
        L241:
            qd.l r0 = r3.S(r7)
            r0.getClass()
            boolean r4 = r0 instanceof qd.m
            if (r4 != 0) goto L24e
            goto L15
        L24e:
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            pd.k r4 = r0.f13713k
            pd.k r8 = pd.k.V
            if (r4 == r12) goto L25a
            if (r4 != r8) goto L15
        L25a:
            qd.l r9 = r0.S(r7)
            r9.getClass()
            boolean r9 = r9 instanceof qd.m
            if (r9 != 0) goto L267
            goto L15
        L267:
            qd.l r9 = r0.S(r7)
            r11 = r9
            qd.m r11 = (qd.m) r11
            ud.p r11 = r11.f10904l
            pd.k r13 = r11.f13713k
            pd.k r14 = pd.k.K
            if (r13 == r14) goto L27c
            pd.k r15 = pd.k.M
            if (r13 == r15) goto L27c
            goto L15
        L27c:
            r15 = r3
            pd.j r15 = (pd.j) r15
            java.lang.Object r15 = r15.f10495o
            od.c r15 = (od.c) r15
            r6 = r11
            pd.j r6 = (pd.j) r6
            java.lang.Object r6 = r6.f10495o
            od.c r6 = (od.c) r6
            boolean r6 = r15.equals(r6)
            if (r6 != 0) goto L294
        L290:
            r16 = 0
            goto L4f8
        L294:
            pd.k r6 = pd.k.L
            if (r13 != r14) goto L2ab
            if (r5 != r6) goto L2ab
            qd.l r7 = r11.S(r7)     // Catch: java.lang.Exception -> L2a9
            qd.l r13 = r3.S(r10)     // Catch: java.lang.Exception -> L2a9
            boolean r7 = r7.equals(r13)     // Catch: java.lang.Exception -> L2a9
            if (r7 != 0) goto L2ab
            goto L290
        L2a9:
            r0 = move-exception
            goto L2fd
        L2ab:
            qd.l r7 = r9.H()     // Catch: java.lang.Exception -> L2a9
            xe.l.j(r2, r11)     // Catch: java.lang.Exception -> L2a9
            if (r5 != r6) goto L2bb
            qd.l r5 = r3.S(r10)     // Catch: java.lang.Exception -> L2a9
            xe.l.i(r2, r5)     // Catch: java.lang.Exception -> L2a9
        L2bb:
            md.a r5 = md.a.T
            if (r4 != r12) goto L2d1
            pd.a r0 = (pd.a) r0     // Catch: java.lang.Exception -> L2a9
            int r4 = r0.f10475o     // Catch: java.lang.Exception -> L2a9
            qd.l r0 = r0.S(r10)     // Catch: java.lang.Exception -> L2a9
            pd.a r6 = new pd.a     // Catch: java.lang.Exception -> L2a9
            r8 = 0
            r6.<init>(r4, r8, r7, r0)     // Catch: java.lang.Exception -> L2a9
            r6.w(r5)     // Catch: java.lang.Exception -> L2a9
            return r6
        L2d1:
            java.util.List r4 = r0.f13715m     // Catch: java.lang.Exception -> L2a9
            int r4 = r4.size()     // Catch: java.lang.Exception -> L2a9
            ud.p r6 = new ud.p     // Catch: java.lang.Exception -> L2a9
            int r9 = r4 + (-1)
            r6.<init>(r8, r9)     // Catch: java.lang.Exception -> L2a9
            r8 = r10
        L2df:
            if (r8 >= r4) goto L2eb
            qd.l r9 = r0.S(r8)     // Catch: java.lang.Exception -> L2a9
            r6.I(r9)     // Catch: java.lang.Exception -> L2a9
            int r8 = r8 + 1
            goto L2df
        L2eb:
            qd.m r0 = qd.l.Z(r6)     // Catch: java.lang.Exception -> L2a9
            qd.e r4 = qd.j.f10879m     // Catch: java.lang.Exception -> L2a9
            r0.f10902i = r4     // Catch: java.lang.Exception -> L2a9
            pd.a r4 = new pd.a     // Catch: java.lang.Exception -> L2a9
            r8 = 0
            r4.<init>(r10, r8, r7, r0)     // Catch: java.lang.Exception -> L2a9
            r4.w(r5)     // Catch: java.lang.Exception -> L2a9
            return r4
        L2fd:
            java.lang.String r4 = "Can't convert field arith insn: {}, mth: {}"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r2, r0}
            mh.b r2 = be.n0.f834h
            r2.o(r4, r0)
            r16 = 0
            return r16
        L30b:
            r16 = r6
            r0 = r3
            pd.i r0 = (pd.i) r0
            n(r2, r0)
            return r16
        L314:
            pd.j r3 = (pd.j) r3
            md.a r4 = md.a.X
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L322
            goto L290
        L322:
            qd.l r4 = r3.S(r7)
            qd.j r5 = r4.I()
            boolean r6 = r4 instanceof qd.m
            if (r6 == 0) goto L33f
            r6 = r4
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            pd.k r8 = r6.f13713k
            pd.k r11 = pd.k.O
            if (r8 != r11) goto L33f
            pd.n r6 = (pd.n) r6
            od.d r5 = r6.f10526p
            qd.j r5 = r5.f9778h
        L33f:
            java.lang.Object r6 = r3.f10495o
            qd.j r6 = (qd.j) r6
            if (r0 == 0) goto L363
            pd.k r8 = r0.f13713k
            if (r8 != r12) goto L363
            r5.getClass()
            boolean r8 = r5 instanceof qd.g
            if (r8 == 0) goto L363
            r6.getClass()
            boolean r8 = r6 instanceof qd.g
            if (r8 == 0) goto L363
            int r8 = r6.p()
            int r11 = r5.p()
            if (r8 <= r11) goto L363
            goto L290
        L363:
            ud.e r8 = r2.f13718l
            ud.u r8 = r8.f13688k
            qd.g r11 = qd.j.f10868b
            boolean r11 = r5.equals(r6)
            if (r11 == 0) goto L371
            r5 = r7
            goto L37e
        L371:
            qe.x r8 = r8.f13748g
            qe.k r8 = r8.f11002c
            qe.l r5 = r8.d(r5, r6)
            boolean r5 = r5.c()
            r5 = r5 ^ r10
        L37e:
            if (r5 == 0) goto L3db
            qd.l r5 = r3.S(r7)
            r5.getClass()
            boolean r8 = r5 instanceof qd.r
            if (r8 == 0) goto L3b8
            qd.r r5 = (qd.r) r5
            qd.s r5 = r5.f10923m
            if (r5 == 0) goto L3b8
            java.util.ArrayList r8 = r5.f10928j
            int r8 = r8.size()
            if (r8 != r10) goto L3b8
            boolean r8 = r5.j()
            if (r8 != 0) goto L3b8
            qd.r r5 = r5.f10927i
            ud.p r5 = r5.f10903j
            if (r5 == 0) goto L3b8
            pd.k r8 = r5.f13713k
            pd.k r11 = pd.k.A
            if (r8 != r11) goto L3b8
            pd.j r5 = (pd.j) r5
            java.lang.Object r5 = r5.f10495o
            qd.j r5 = (qd.j) r5
            java.lang.Object r8 = r3.f10495o
            boolean r5 = r5.equals(r8)
            goto L3b9
        L3b8:
            r5 = r7
        L3b9:
            if (r5 != 0) goto L3db
            ud.e r2 = r2.f13718l
            ud.u r2 = r2.f13688k
            if (r0 == 0) goto L3d9
            pd.k r5 = r0.f13713k
            pd.k r8 = pd.k.f10506o
            if (r5 != r8) goto L3d9
            pd.j r0 = (pd.j) r0
            java.lang.Object r0 = r0.f10495o
            qd.j r0 = (qd.j) r0
            qe.x r2 = r2.f13748g
            qe.k r2 = r2.f11002c
            qe.l r0 = r2.d(r0, r6)
            boolean r7 = r0.c()
        L3d9:
            if (r7 == 0) goto L290
        L3db:
            ud.p r0 = new ud.p
            r0.<init>(r9, r10)
            int r2 = r3.f13716n
            r0.f13716n = r2
            qd.r r2 = r3.f13714l
            r0.d0(r2)
            r0.I(r4)
            return r0
        L3ed:
            qd.l r0 = r3.S(r7)
            r0.getClass()
            boolean r2 = r0 instanceof qd.n
            if (r2 == 0) goto L290
            ud.p r2 = new ud.p
            r2.<init>(r11, r10)
            qd.r r4 = r3.f13714l
            r2.d0(r4)
            r2.I(r0)
            r2.B(r3)
            r2.H(r3)
            return r2
        L40c:
            r0 = r3
            pd.a r0 = (pd.a) r0
            java.util.List r2 = r0.f13715m
            int r2 = r2.size()
            r3 = 2
            if (r2 == r3) goto L41a
            goto L290
        L41a:
            qd.l r2 = r0.S(r10)
            r2.getClass()
            boolean r4 = r2 instanceof qd.m
            if (r4 == 0) goto L43c
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            pd.k r4 = r2.f13713k
            if (r4 != r11) goto L444
            qd.l r2 = r2.S(r7)
            r2.getClass()
            boolean r4 = r2 instanceof qd.n
            if (r4 == 0) goto L444
            r8 = r2
            qd.n r8 = (qd.n) r8
            goto L445
        L43c:
            boolean r4 = r2 instanceof qd.n
            if (r4 == 0) goto L444
            r8 = r2
            qd.n r8 = (qd.n) r8
            goto L445
        L444:
            r8 = 0
        L445:
            if (r8 != 0) goto L449
            goto L290
        L449:
            long r4 = r8.f10905l
            int r2 = r0.f10475o
            int r2 = t3.c.b(r2)
            r11 = 0
            if (r2 == 0) goto L483
            r3 = 7
            if (r2 == r3) goto L45a
            goto L290
        L45a:
            qd.l r2 = r0.S(r7)
            qd.j r3 = r2.I()
            qd.g r6 = qd.j.f10869c
            if (r3 != r6) goto L290
            int r3 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r3 == 0) goto L470
            r6 = 1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L290
        L470:
            ud.p r4 = new ud.p
            if (r3 != 0) goto L475
            goto L477
        L475:
            pd.k r9 = pd.k.f10503l
        L477:
            r4.<init>(r9, r10)
            qd.r r0 = r0.f13714l
            r4.d0(r0)
            r4.I(r2)
            return r4
        L483:
            boolean r2 = r8.c0()
            if (r2 == 0) goto L48e
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 >= 0) goto L290
            goto L4b9
        L48e:
            qd.j r2 = r8.f10902i
            qd.g r6 = qd.j.f10873g
            if (r2 != r6) goto L4a5
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r6 = 0
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L290
            boolean r2 = java.lang.Float.isFinite(r2)
            if (r2 == 0) goto L290
            goto L4b9
        L4a5:
            qd.g r6 = qd.j.f10874h
            if (r2 != r6) goto L290
            double r9 = java.lang.Double.longBitsToDouble(r4)
            r11 = 0
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 >= 0) goto L290
            boolean r2 = java.lang.Double.isFinite(r9)
            if (r2 == 0) goto L290
        L4b9:
            boolean r2 = r8.c0()
            if (r2 == 0) goto L4c1
            long r4 = -r4
            goto L4e0
        L4c1:
            qd.j r2 = r8.f10902i
            qd.g r6 = qd.j.f10873g
            if (r2 != r6) goto L4d3
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = -r2
            int r2 = java.lang.Float.floatToIntBits(r2)
            long r4 = (long) r2
            goto L4e0
        L4d3:
            qd.g r6 = qd.j.f10874h
            if (r2 != r6) goto L4e9
            double r4 = java.lang.Double.longBitsToDouble(r4)
            double r4 = -r4
            long r4 = java.lang.Double.doubleToLongBits(r4)
        L4e0:
            qd.n r2 = new qd.n
            qd.j r6 = r8.f10902i
            r2.<init>(r4, r6)
            r8 = r2
            goto L4ea
        L4e9:
            r8 = 0
        L4ea:
            if (r8 == 0) goto L290
            pd.a r2 = new pd.a
            qd.r r4 = r0.f13714l
            qd.l r0 = r0.S(r7)
            r2.<init>(r3, r4, r0, r8)
            return r2
        L4f8:
            return r16
    }
}
