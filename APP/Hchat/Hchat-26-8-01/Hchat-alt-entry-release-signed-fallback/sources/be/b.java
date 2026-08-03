package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f772g;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f772g = r1
            r0.<init>()
            return
    }

    public static void A(java.util.ArrayList r9) {
            java.util.stream.Stream r0 = r9.stream()
            ae.d r1 = new ae.d
            r2 = 10
            r1.<init>(r2)
            ae.d r2 = new ae.d
            r3 = 11
            r2.<init>(r3)
            be.o r3 = new be.o
            r3.<init>()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toMap(r1, r2, r3)
            java.lang.Object r0 = r0.collect(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.stream.Stream r0 = r0.stream()
            a7.b r1 = new a7.b
            r2 = 10
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            ae.d r1 = new ae.d
            r2 = 12
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toSet()
            java.lang.Object r0 = r0.collect(r1)
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r9.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r1.next()
            be.r r2 = (be.r) r2
            boolean r4 = r2.f842c
            if (r4 != 0) goto L5f
            goto Lb1
        L5f:
            pd.j r4 = r2.f841b
            qd.l r3 = r4.S(r3)
            r3.getClass()
            boolean r5 = r3 instanceof qd.m
            if (r5 == 0) goto La6
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            boolean r3 = r3.N()
            if (r3 != 0) goto L81
            md.b r3 = md.b.F
            md.f r5 = r4.f8877g
            boolean r3 = r5.b(r3)
            if (r3 == 0) goto L81
            goto Lb1
        L81:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4.U(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L4d
            java.util.Iterator r3 = r3.iterator()
        L93:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r3.next()
            qd.r r4 = (qd.r) r4
            boolean r4 = r4.N()
            if (r4 != 0) goto L93
            goto Lb1
        La6:
            boolean r4 = r3 instanceof qd.n
            if (r4 != 0) goto L4d
            boolean r3 = r3.N()
            if (r3 == 0) goto Lb1
            goto L4d
        Lb1:
            ud.g r2 = r2.f840a
            od.c r2 = r2.f13707l
            r0.add(r2)
            goto L4d
        Lb9:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L10b
        Lbf:
            java.util.Iterator r1 = r9.iterator()
            r2 = r3
        Lc4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L109
            java.lang.Object r4 = r1.next()
            be.r r4 = (be.r) r4
            ud.g r5 = r4.f840a
            od.c r5 = r5.f13707l
            boolean r6 = r0.contains(r5)
            if (r6 == 0) goto Ldb
            goto Lc4
        Ldb:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto Le3
            r4 = r3
            goto L102
        Le3:
            pd.j r4 = r4.f841b
            pd.k r6 = r4.f13713k
            pd.k r7 = pd.k.N
            if (r6 != r7) goto Lee
            pd.k r6 = pd.k.M
            goto Lf0
        Lee:
            pd.k r6 = pd.k.K
        Lf0:
            be.m r7 = new be.m
            r8 = 0
            r7.<init>(r6, r8, r0)
            java.lang.Object r4 = r4.g0(r7)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = java.util.Objects.equals(r4, r6)
        L102:
            if (r4 == 0) goto Lc4
            r0.add(r5)
            r2 = 1
            goto Lc4
        L109:
            if (r2 != 0) goto Lbf
        L10b:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L11a
            be.p r1 = new be.p
            r2 = 0
            r1.<init>(r0, r2)
            r9.removeIf(r1)
        L11a:
            return
    }

    public static void B(ud.e r7, java.util.ArrayList r8) {
            ae.d r0 = new ae.d
            r1 = 9
            r0.<init>(r1)
            java.util.List r0 = xe.s.c(r8, r0)
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r8.size()
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L18:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r8.next()
            be.r r2 = (be.r) r2
            pd.j r3 = r2.f841b
            pd.k r4 = r3.f13713k
            pd.k r5 = pd.k.N
            if (r4 != r5) goto L2f
            pd.k r4 = pd.k.M
            goto L31
        L2f:
            pd.k r4 = pd.k.K
        L31:
            be.n r5 = new be.n
            r5.<init>(r4, r7, r1, r2)
            r3.h0(r5)
            goto L18
        L3a:
            boolean r8 = r1.isEmpty()
            r2 = -1
            if (r8 == 0) goto L43
            goto Lae
        L43:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r0.next()
            ud.g r3 = (ud.g) r3
            int r4 = r8.indexOf(r3)
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L6a
            if (r4 != r2) goto L4c
            r8.add(r3)
            goto L4c
        L6a:
            if (r4 != r2) goto L8a
            java.util.Iterator r4 = r5.iterator()
        L70:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L86
            java.lang.Object r5 = r4.next()
            ud.g r5 = (ud.g) r5
            boolean r6 = r8.contains(r5)
            if (r6 != 0) goto L70
            r8.add(r5)
            goto L70
        L86:
            r8.add(r3)
            goto L4c
        L8a:
            java.util.Iterator r3 = r5.iterator()
        L8e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r3.next()
            ud.g r5 = (ud.g) r5
            int r6 = r8.indexOf(r5)
            if (r6 != r2) goto La4
            r8.add(r4, r5)
            goto L8e
        La4:
            if (r6 <= r4) goto L8e
            r8.remove(r6)
            r8.add(r4, r5)
            goto L8e
        Lad:
            r0 = r8
        Lae:
            java.util.List r7 = r7.f13698u
            int r8 = java.util.Collections.indexOfSubList(r7, r0)
            if (r8 == r2) goto Lb7
            return
        Lb7:
            r7.removeAll(r0)
            r7.addAll(r0)
            return
    }

    public static boolean C(ud.r r4, ud.p r5) {
            pd.k r0 = r5.f13713k
            pd.k r1 = pd.k.O
            r2 = 1
            if (r0 != r1) goto L22
            pd.n r5 = (pd.n) r5
            ud.e r4 = r4.f13718l
            ud.u r4 = r4.f13688k
            od.d r5 = r5.f10526p
            ud.r r4 = r4.i(r5)
            if (r4 == 0) goto L49
            ud.e r5 = r4.f13718l
            ud.u r5 = r5.f13688k
            bc.g r5 = r5.f13742a
            r5.getClass()
            be.e.i(r4, r2)
            return r2
        L22:
            pd.k r1 = pd.k.W
            r3 = 0
            if (r0 != r1) goto L3c
            qd.l r5 = r5.S(r3)
            r5.getClass()
            boolean r0 = r5 instanceof qd.m
            if (r0 != 0) goto L33
            return r3
        L33:
            qd.m r5 = (qd.m) r5
            ud.p r5 = r5.f10904l
            boolean r4 = C(r4, r5)
            return r4
        L3c:
            boolean r0 = r5 instanceof pd.j
            if (r0 == 0) goto L4a
            r0 = r5
            pd.j r0 = (pd.j) r0
            java.lang.Object r0 = r0.f10495o
            boolean r0 = r0 instanceof od.c
            if (r0 == 0) goto L4a
        L49:
            return r2
        L4a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Can't inline method, not implemented redirect type for insn: "
            java.lang.String r5 = r0.concat(r5)
            r4.I(r5)
            return r3
    }

    public static boolean D(qd.s r8) {
            java.util.ArrayList r8 = r8.f10928j
            boolean r0 = r8.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lb
            goto L86
        Lb:
            java.util.Iterator r0 = r8.iterator()
            r2 = r1
        L10:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r0.next()
            qd.r r3 = (qd.r) r3
            ud.p r5 = r3.f10903j
            if (r5 == 0) goto L10
            pd.k r6 = r5.f13713k
            pd.k r7 = pd.k.f10504m
            if (r6 != r7) goto L30
            qd.r r3 = r5.f13714l
            qd.s r3 = r3.f10923m
            boolean r4 = D(r3)
            goto L7a
        L30:
            int r6 = r6.ordinal()
            r7 = 16
            if (r6 == r7) goto L6d
            r7 = 34
            if (r6 == r7) goto L64
            r7 = 18
            if (r6 == r7) goto L6d
            r7 = 19
            if (r6 == r7) goto L6d
            r7 = 21
            if (r6 == r7) goto L6d
            r7 = 22
            if (r6 == r7) goto L6d
            r7 = 26
            if (r6 == r7) goto L6d
            r7 = 27
            if (r6 == r7) goto L6d
            r7 = 30
            if (r6 == r7) goto L6d
            r7 = 31
            if (r6 == r7) goto L5d
            goto L73
        L5d:
            qd.l r5 = r5.S(r4)
            if (r5 == r3) goto L75
            goto L73
        L64:
            pd.n r5 = (pd.n) r5
            qd.l r5 = r5.k0()
            if (r5 == r3) goto L75
            goto L73
        L6d:
            qd.l r5 = r5.S(r1)
            if (r5 == r3) goto L75
        L73:
            r4 = r1
            goto L7a
        L75:
            md.a r5 = md.a.f8837r
            r3.w(r5)
        L7a:
            if (r4 == 0) goto L10
            int r2 = r2 + 1
            goto L10
        L7f:
            int r8 = r8.size()
            if (r2 != r8) goto L86
            return r4
        L86:
            return r1
    }

    public static int E(ud.p[] r3, int r4) {
            int r0 = r3.length
        L1:
            int r4 = r4 + 1
            if (r4 >= r0) goto L10
            r1 = r3[r4]
            if (r1 == 0) goto L1
            pd.k r1 = r1.f13713k
            pd.k r2 = pd.k.Q
            if (r1 == r2) goto L1
            return r4
        L10:
            r3 = -1
            return r3
    }

    public static ud.p F(qd.r r2) {
            qd.s r2 = r2.f10923m
            java.util.ArrayList r0 = r2.f10928j
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto Lc
            goto L19
        Lc:
            java.util.ArrayList r2 = r2.f10928j
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            qd.r r2 = (qd.r) r2
            ud.p r2 = r2.f10903j
            if (r2 != 0) goto L1b
        L19:
            r2 = 0
            return r2
        L1b:
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.f10504m
            if (r0 != r1) goto L27
            qd.r r2 = r2.f13714l
            ud.p r2 = F(r2)
        L27:
            return r2
    }

    public static qd.j G(ud.r r3, lf.b r4) {
            java.lang.String r0 = r4.f8035c
            qd.j r0 = qd.j.z(r0)
            java.lang.String r4 = r4.f8036d
            if (r4 != 0) goto Lb
            goto L27
        Lb:
            vd.a r1 = new vd.a     // Catch: java.lang.Exception -> L28
            r1.<init>(r4)     // Catch: java.lang.Exception -> L28
            qd.j r1 = r1.e()     // Catch: java.lang.Exception -> L28
            ud.e r2 = r3.f13718l     // Catch: java.lang.Exception -> L28
            ud.u r2 = r2.f13688k     // Catch: java.lang.Exception -> L28
            fe.a r2 = r2.f13750i     // Catch: java.lang.Exception -> L28
            r2.getClass()     // Catch: java.lang.Exception -> L28
            fe.a.c(r3, r1)     // Catch: java.lang.Exception -> L28
            boolean r3 = u(r3, r0, r1)     // Catch: java.lang.Exception -> L28
            if (r3 == 0) goto L27
            return r1
        L27:
            return r0
        L28:
            r1 = move-exception
            java.lang.String r2 = "Can't parse signature for local variable: "
            java.lang.String r4 = r2.concat(r4)
            r3.M(r4, r1)
            return r0
    }

    public static void H(qd.s r5) {
            qd.k r0 = r5.f10931m
            if (r0 == 0) goto L5
            return
        L5:
            qd.k r0 = new qd.k
            r0.<init>()
            qd.r r1 = r5.f10927i
            md.a r2 = md.a.J
            md.f r3 = r1.f8877g
            boolean r2 = r3.a(r2)
            r3 = 1
            if (r2 == 0) goto L1d
            java.lang.String r2 = "this"
            r0.f10894a = r2
            r0.f10898e = r3
        L1d:
            md.a r2 = md.a.M
            md.f r4 = r1.f8877g
            boolean r2 = r4.a(r2)
            if (r2 != 0) goto L31
            md.a r2 = md.a.P
            md.f r1 = r1.f8877g
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L33
        L31:
            r0.f10899f = r3
        L33:
            java.util.List r1 = r5.g()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r2.add(r5)
            v(r1, r2)
            int r5 = r2.size()
            if (r5 <= r3) goto La8
            java.util.stream.Stream r5 = r2.stream()
            ae.d r1 = new ae.d
            r4 = 13
            r1.<init>(r4)
            java.util.stream.Stream r5 = r5.map(r1)
            a7.b r1 = new a7.b
            r4 = 11
            r1.<init>(r4)
            java.util.stream.Stream r5 = r5.filter(r1)
            a7.b r1 = new a7.b
            r4 = 12
            r1.<init>(r4)
            java.util.stream.Stream r5 = r5.filter(r1)
            java.util.stream.Stream r5 = r5.distinct()
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r5 = r5.collect(r1)
            java.util.List r5 = (java.util.List) r5
            int r1 = r5.size()
            if (r1 != r3) goto L91
            r1 = 0
            java.lang.Object r5 = r5.get(r1)
            qd.j r5 = (qd.j) r5
            r0.f10895b = r5
            goto La8
        L91:
            if (r1 > r3) goto L94
            goto La8
        L94:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Several immutable types in one variable: "
            java.lang.String r2 = ", vars: "
            java.lang.String r5 = bc.e.j(r1, r5, r2, r0)
            ah.a.k(r5)
            return
        La8:
            ae.g r5 = new ae.g
            r1 = 2
            r5.<init>(r0, r1)
            r2.forEach(r5)
            return
        Lb2:
            r5.m(r0)
            return
    }

    public static void I(ud.r r3) {
            qd.r r0 = r3.f13729w
            if (r0 == 0) goto Lf
            qd.s r1 = r0.f10923m
            if (r1 != 0) goto Lc
            qd.s r1 = r3.b0(r0)
        Lc:
            H(r1)
        Lf:
            java.util.List r0 = r3.S()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            qd.r r1 = (qd.r) r1
            qd.s r2 = r1.f10923m
            if (r2 != 0) goto L2b
            qd.s r2 = r3.b0(r1)
        L2b:
            H(r2)
            goto L17
        L2f:
            java.util.List r3 = r3.D
            java.util.Iterator r3 = r3.iterator()
        L35:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.next()
            qd.s r0 = (qd.s) r0
            H(r0)
            goto L35
        L45:
            return
    }

    public static void J(ud.r r2, qd.r r3, ud.p r4, ud.a r5) {
            md.a r0 = md.a.O
            md.f r1 = r4.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Le
            o(r2, r3, r4, r5)
            return
        Le:
            r0 = 0
            qd.l r0 = r3.b0(r2, r4, r0)
            if (r0 == 0) goto L22
            ud.p r3 = r3.f10903j
            if (r3 == 0) goto L1c
            r3.V(r4)
        L1c:
            xe.l.l(r2, r4)
            xe.l.g(r2, r5, r4)
        L22:
            return
    }

    public static nd.w K(ud.r r7) {
            java.util.List r0 = r7.f13732z
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 2
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            int r4 = r3.size()
            if (r4 != 0) goto L21
            goto Lc
        L21:
            int r5 = r1.size()
            int r5 = r5 + r4
            if (r5 <= r2) goto L2b
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            goto L2f
        L2b:
            r1.addAll(r3)
            goto Lc
        L2f:
            int r0 = r1.size()
            if (r0 != 0) goto L37
            goto L194
        L37:
            pd.k r3 = pd.k.f10507p
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L73
            java.lang.Object r0 = r1.get(r4)
            ud.p r0 = (ud.p) r0
            pd.k r1 = r0.f13713k
            if (r1 != r3) goto L6e
            java.util.List r1 = r0.f13715m
            int r1 = r1.size()
            if (r1 != r5) goto L6e
            qd.l r0 = r0.S(r4)
            r0.getClass()
            boolean r1 = r0 instanceof qd.m
            if (r1 != 0) goto L5c
            goto L194
        L5c:
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            ud.p r0 = r0.O()
            md.a r1 = md.a.S
            r0.D(r1)
            nd.w r7 = j(r7, r0, r5)
            return r7
        L6e:
            nd.w r7 = j(r7, r0, r4)
            return r7
        L73:
            if (r0 != r2) goto L194
            java.lang.Object r0 = r1.get(r5)
            ud.p r0 = (ud.p) r0
            pd.k r0 = r0.f13713k
            if (r0 != r3) goto L194
            java.lang.Object r0 = r1.get(r4)
            ud.p r0 = (ud.p) r0
            java.lang.Object r1 = r1.get(r5)
            ud.p r1 = (ud.p) r1
            java.util.List r3 = r1.f13715m
            int r3 = r3.size()
            if (r3 == 0) goto L18f
            java.util.List r3 = r7.S()
            pd.k r6 = r0.f13713k
            int r6 = r6.ordinal()
            switch(r6) {
                case 30: goto L16d;
                case 31: goto L136;
                case 32: goto L123;
                case 33: goto Lfc;
                case 34: goto La2;
                default: goto La0;
            }
        La0:
            goto L194
        La2:
            qd.l r1 = r1.S(r4)
            qd.r r2 = r0.f13714l
            boolean r1 = r1.M(r2)
            if (r1 != 0) goto Lb0
            goto L194
        Lb0:
            java.util.List r1 = r7.S()
            java.util.List r2 = r0.f13715m
            if (r1 != r2) goto Lba
            goto L18f
        Lba:
            int r3 = r1.size()
            int r5 = r2.size()
            if (r3 == r5) goto Lc6
            goto L194
        Lc6:
            java.util.Iterator r1 = r1.iterator()
            java.util.Iterator r2 = r2.iterator()
        Lce:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lee
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lee
            java.lang.Object r3 = r1.next()
            java.lang.Object r5 = r2.next()
            qd.r r3 = (qd.r) r3
            qd.l r5 = (qd.l) r5
            boolean r3 = r5.M(r3)
            if (r3 != 0) goto Lce
            goto L194
        Lee:
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L194
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L194
            goto L18f
        Lfc:
            int r2 = r3.size()
            if (r2 != r5) goto L194
            qd.l r1 = r1.S(r4)
            java.lang.Object r2 = r3.get(r4)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            qd.l r1 = r0.S(r4)
            java.lang.Object r2 = r3.get(r4)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            goto L18f
        L123:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L194
            qd.l r1 = r1.S(r4)
            qd.r r2 = r0.f13714l
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            goto L18f
        L136:
            int r6 = r3.size()
            if (r6 != r2) goto L194
            qd.l r1 = r1.S(r4)
            java.lang.Object r2 = r3.get(r5)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            qd.l r1 = r0.S(r4)
            java.lang.Object r2 = r3.get(r5)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            qd.l r1 = r0.S(r5)
            java.lang.Object r2 = r3.get(r4)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            goto L18f
        L16d:
            int r2 = r3.size()
            if (r2 != r5) goto L194
            qd.l r1 = r1.S(r4)
            qd.r r2 = r0.f13714l
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
            qd.l r1 = r0.S(r4)
            java.lang.Object r2 = r3.get(r4)
            qd.r r2 = (qd.r) r2
            boolean r1 = r1.M(r2)
            if (r1 == 0) goto L194
        L18f:
            nd.w r7 = j(r7, r0, r4)
            return r7
        L194:
            r7 = 0
            return r7
    }

    public static boolean L(ud.e r1) {
            b5.k r0 = r1.f13692o
            boolean r0 = r0.i()
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f13698u
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f13697t
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r1 = r1.f13699v
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static void M(qd.r r3) {
            if (r3 != 0) goto L3
            goto L36
        L3:
            md.a r0 = md.a.J
            r3.w(r0)
            md.a r0 = md.a.N
            r3.w(r0)
            ud.p r0 = r3.f10903j
            if (r0 == 0) goto L36
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.f10504m
            if (r1 != r2) goto L36
            r1 = 0
            qd.l r1 = r0.S(r1)
            if (r1 != r3) goto L36
            qd.r r1 = r0.f13714l
            int r2 = r1.f10922l
            int r3 = r3.f10922l
            if (r2 == r3) goto L36
            qd.s r3 = r1.f10923m
            boolean r3 = r3.j()
            if (r3 != 0) goto L36
            N(r1)
            md.a r3 = md.a.f8838s
            r0.w(r3)
        L36:
            return
    }

    public static void N(qd.r r2) {
            if (r2 == 0) goto L13
            M(r2)
            qd.s r2 = r2.f10923m
            java.util.ArrayList r2 = r2.f10928j
            ae.e r0 = new ae.e
            r1 = 24
            r0.<init>(r1)
            r2.forEach(r0)
        L13:
            return
    }

    public static void O(ud.p[] r3, int r4, ud.p r5, qd.j r6) {
            int r4 = E(r3, r4)
            r0 = -1
            if (r4 != r0) goto L8
            goto L10
        L8:
            r4 = r3[r4]
            pd.k r0 = r4.f13713k
            pd.k r1 = pd.k.P
            if (r0 == r1) goto L11
        L10:
            return
        L11:
            qd.r r0 = r4.f13714l
            int r1 = r0.f10922l
            qd.s r2 = r0.f10923m
            qd.r r6 = r0.d0(r1, r6, r2)
            r5.d0(r6)
            r5.B(r4)
            r5.H(r4)
            int r4 = r4.f13716n
            r5 = 0
            r3[r4] = r5
            return
    }

    public static void P(ud.r r15) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r15.f13732z
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L116
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            java.util.Iterator r3 = r2.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Led
            java.lang.Object r4 = r3.next()
            ud.p r4 = (ud.p) r4
            pd.k r5 = r4.f13713k
            pd.k r6 = pd.k.f10504m
            if (r5 == r6) goto L30
            goto L1d
        L30:
            qd.r r5 = r4.f13714l
            r6 = 0
            qd.l r6 = r4.S(r6)
            boolean r7 = r5.h0(r6)
            if (r7 == 0) goto L3f
            goto Le5
        L3f:
            r6.getClass()
            boolean r7 = r6 instanceof qd.r
            if (r7 == 0) goto L58
            r8 = r6
            qd.r r8 = (qd.r) r8
            qd.s r8 = r8.f10923m
            qd.r r8 = r8.f10927i
            ud.p r8 = r8.f10903j
            if (r8 == 0) goto L58
            pd.k r8 = r8.f13713k
            pd.k r9 = pd.k.X
            if (r8 != r9) goto L58
            goto L1d
        L58:
            qd.s r5 = r5.f10923m
            java.util.ArrayList r8 = r5.f10928j
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L64
            goto Le5
        L64:
            boolean r5 = r5.j()
            if (r5 == 0) goto L6b
            goto L1d
        L6b:
            md.f r5 = r6.f8877g
            md.b r9 = md.b.L
            oc.b r5 = r5.c(r9)
            nd.d0 r5 = (nd.d0) r5
            java.util.Iterator r10 = r8.iterator()
        L79:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L98
            java.lang.Object r11 = r10.next()
            qd.r r11 = (qd.r) r11
            ud.p r12 = r11.f10903j
            if (r12 != 0) goto L8a
            goto L1d
        L8a:
            if (r5 != 0) goto L79
            md.f r11 = r11.f8877g
            oc.b r11 = r11.c(r9)
            nd.d0 r11 = (nd.d0) r11
            if (r11 == 0) goto L79
            r5 = r11
            goto L79
        L98:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
        La1:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Le5
            java.lang.Object r9 = r8.next()
            qd.r r9 = (qd.r) r9
            ud.p r10 = r9.f10903j
            if (r10 != 0) goto Lb2
            goto La1
        Lb2:
            if (r7 == 0) goto Lc2
            r11 = r6
            qd.r r11 = (qd.r) r11
            qd.j r12 = r9.f10902i
            int r13 = r11.f10922l
            qd.s r14 = r11.f10923m
            qd.r r11 = r11.d0(r13, r12, r14)
            goto Lc6
        Lc2:
            qd.l r11 = r6.H()
        Lc6:
            r10.V(r4)
            r11.B(r9)
            if (r5 == 0) goto Ld1
            r11.y(r5)
        Ld1:
            boolean r9 = r10.b0(r9, r11)
            if (r9 != 0) goto La1
            java.lang.String r9 = java.lang.String.valueOf(r10)
            java.lang.String r10 = "Failed to replace arg in insn: "
            java.lang.String r9 = r10.concat(r9)
            r15.L(r9)
            goto La1
        Le5:
            r0.add(r4)
            xe.l.j(r15, r4)
            goto L1d
        Led:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lf5
            goto Lb
        Lf5:
            if (r2 != 0) goto L10b
            java.util.Iterator r2 = r0.iterator()
        Lfb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L111
            java.lang.Object r3 = r2.next()
            ud.p r3 = (ud.p) r3
            xe.l.d(r15, r3)
            goto Lfb
        L10b:
            xe.l.k(r15, r0)
            xe.l.e(r2, r0)
        L111:
            r0.clear()
            goto Lb
        L116:
            return
    }

    public static nd.w Q(ud.r r2) {
            md.b r0 = md.b.f8859n     // Catch: java.lang.Exception -> L24
            md.f r1 = r2.f8877g     // Catch: java.lang.Exception -> L24
            oc.b r0 = r1.c(r0)     // Catch: java.lang.Exception -> L24
            nd.w r0 = (nd.w) r0     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto Ld
            return r0
        Ld:
            md.a r0 = md.a.f8815c0     // Catch: java.lang.Exception -> L24
            md.f r1 = r2.f8877g     // Catch: java.lang.Exception -> L24
            boolean r0 = r1.a(r0)     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L2a
            java.util.List r0 = r2.f13732z     // Catch: java.lang.Exception -> L24
            if (r0 != 0) goto L1d
            r2 = 0
            return r2
        L1d:
            nd.w r0 = K(r2)     // Catch: java.lang.Exception -> L24
            if (r0 == 0) goto L2a
            return r0
        L24:
            r0 = move-exception
            java.lang.String r1 = "Method inline analysis failed"
            r2.M(r1, r0)
        L2a:
            nd.w r0 = nd.w.f9399i
            r2.y(r0)
            return r0
    }

    public static void R(ud.r r25) {
            r0 = r25
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r0.f13732z
            ud.e r3 = r0.f13718l
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2af
            java.lang.Object r4 = r2.next()
            ud.a r4 = (ud.a) r4
            r1.clear()
            java.util.ArrayList r5 = r4.f13674l
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2a1
            java.lang.Object r6 = r5.next()
            ud.p r6 = (ud.p) r6
            md.f r7 = r6.f8877g
            md.a r8 = md.a.f8836q
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L48
            md.f r7 = r6.f8877g
            md.a r9 = md.a.f8838s
            boolean r7 = r7.a(r9)
            if (r7 != 0) goto L48
            qd.r r7 = r6.f13714l
            if (r7 != 0) goto L4e
        L48:
            r19 = r2
            r20 = r5
            goto L29b
        L4e:
            qd.s r7 = r7.f10923m
            pd.k r10 = r6.f13713k
            int r10 = r10.ordinal()
            r11 = 1
            pd.k r13 = pd.k.M
            r14 = 0
            if (r10 == 0) goto La7
            if (r10 == r11) goto L7a
            r15 = 2
            if (r10 == r15) goto L65
            r15 = 6
            if (r10 == r15) goto La7
            goto L48
        L65:
            boolean r7 = r7.j()
            if (r7 == 0) goto L6c
            goto L48
        L6c:
            ud.p r7 = r6.O()
            qd.m r7 = qd.l.Z(r7)
            qd.e r10 = qd.j.f10878l
            r7.f10902i = r10
        L78:
            r15 = 0
            goto Lc2
        L7a:
            r7 = r6
            pd.d r7 = (pd.d) r7
            java.lang.String r7 = r7.f10477o
            ud.l r7 = r3.X(r7, r11)
            if (r7 != 0) goto L8e
            ud.p r7 = r6.O()
            qd.m r7 = qd.l.Z(r7)
            goto L78
        L8e:
            pd.j r10 = new pd.j
            od.c r15 = r7.f()
            r10.<init>(r13, r15, r14)
            qd.m r10 = qd.l.Z(r10)
            qd.e r15 = qd.j.f10879m
            r10.f10902i = r15
            a1.d r15 = new a1.d
            r12 = 5
            r15.<init>(r7, r12, r0)
            r7 = r10
            goto Lc2
        La7:
            qd.l r10 = r6.S(r14)
            r10.getClass()
            boolean r12 = r10 instanceof qd.n
            if (r12 != 0) goto Lb3
            goto L48
        Lb3:
            boolean r12 = r10.R()
            if (r12 == 0) goto Lc0
            boolean r7 = D(r7)
            if (r7 == 0) goto Lc0
            goto L48
        Lc0:
            r7 = r10
            goto L78
        Lc2:
            qd.r r10 = r6.f13714l
            qd.s r10 = r10.f10923m
            java.util.ArrayList r12 = r10.f10928j
            int r12 = r12.size()
            java.util.ArrayList r10 = r10.f10928j
            if (r12 != 0) goto Ld6
            r19 = r2
            r20 = r5
            goto L27f
        Ld6:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r10)
            java.util.Iterator r16 = r12.iterator()
            r17 = r14
        Le1:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L271
            java.lang.Object r18 = r16.next()
            r14 = r18
            qd.r r14 = (qd.r) r14
            md.a r11 = md.a.f8837r
            r19 = r2
            md.f r2 = r14.f8877g
            boolean r2 = r2.a(r11)
            if (r2 != 0) goto L103
            md.f r2 = r14.f8877g
            boolean r2 = r2.a(r8)
            if (r2 == 0) goto L10e
        L103:
            r20 = r5
        L105:
            r22 = r8
            r21 = r10
            r14 = r17
            r10 = 1
            goto L263
        L10e:
            ud.p r2 = r14.f10903j
            if (r2 != 0) goto L113
            goto L103
        L113:
            md.f r11 = r2.f8877g
            boolean r11 = r11.a(r9)
            if (r11 == 0) goto L11c
            goto L103
        L11c:
            qd.s r11 = r14.f10923m
            qd.k r11 = r11.b()
            java.util.List r11 = r11.f10896c
            int r11 = r11.size()
            r20 = r5
            r5 = 1
            if (r11 <= r5) goto L136
            qd.s r5 = r14.f10923m
            boolean r5 = r5.j()
            if (r5 != 0) goto L136
        L135:
            goto L105
        L136:
            pd.k r5 = r2.f13713k
            pd.k r11 = pd.k.S
            if (r5 != r11) goto L165
            ud.u r5 = r3.f13688k
            fe.a r5 = r5.f13749h
            td.a r2 = (td.a) r2
            ud.m r2 = r5.g(r2)
            boolean r5 = r2 instanceof ud.r
            if (r5 == 0) goto L14d
            ud.r r2 = (ud.r) r2
            goto L14e
        L14d:
            r2 = 0
        L14e:
            if (r2 == 0) goto L165
            md.a r5 = md.a.f8815c0
            md.f r11 = r2.f8877g
            boolean r5 = r11.a(r5)
            if (r5 != 0) goto L105
            md.a r5 = md.a.H
            md.f r2 = r2.f8877g
            boolean r2 = r2.a(r5)
            if (r2 == 0) goto L165
            goto L135
        L165:
            ud.p r2 = r14.f10903j
            if (r2 != 0) goto L170
        L169:
            r22 = r8
            r21 = r10
        L16d:
            r10 = 1
            goto L258
        L170:
            pd.k r5 = r2.f13713k
            pd.k r11 = pd.k.X
            if (r5 != r11) goto L177
            goto L169
        L177:
            boolean r5 = r7 instanceof qd.n
            if (r5 == 0) goto L249
            r5 = r7
            qd.n r5 = (qd.n) r5
            r21 = r10
            long r10 = r5.f10905l
            qd.j r5 = r14.I()
            r22 = r8
            qd.h r8 = qd.j.f10887u
            if (r5 != r8) goto L18e
            qd.j r5 = r14.f10902i
        L18e:
            boolean r8 = r5.v()
            if (r8 == 0) goto L19c
            r23 = 0
            int r8 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r8 == 0) goto L19c
            qd.h r5 = qd.j.f10892z
        L19c:
            qd.n r5 = qd.l.S(r10, r5)
            r5.B(r7)
            boolean r8 = r2.b0(r14, r5)
            if (r8 != 0) goto L1aa
            goto L16d
        L1aa:
            qd.j r8 = r5.f10902i
            boolean r14 = r8.w()
            if (r14 == 0) goto L1b8
            ud.l r8 = r3.Y(r5)
            r10 = 0
            goto L1cd
        L1b8:
            qd.q r14 = qd.q.f10911n
            boolean r8 = r8.a(r14)
            if (r8 == 0) goto L1cb
            int r8 = (int) r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 0
            ud.l r8 = r3.X(r8, r10)
            goto L1cd
        L1cb:
            r10 = 0
            r8 = 0
        L1cd:
            if (r8 == 0) goto L1e3
            pd.j r11 = new pd.j
            od.c r14 = r8.f()
            r11.<init>(r13, r14, r10)
            r14 = 1
            qd.l r5 = r5.b0(r0, r11, r14)
            if (r5 == 0) goto L247
            be.d0.i(r8, r0)
            goto L247
        L1e3:
            boolean r8 = r2 instanceof pd.b
            if (r8 == 0) goto L247
            r8 = r2
            pd.b r8 = (pd.b) r8
            od.d r11 = r8.i0()
            qd.l r14 = r8.k0()
            if (r14 != r5) goto L21e
            boolean r8 = r5.R()
            if (r8 == 0) goto L218
            od.a r8 = r11.f9780j
            qd.j r8 = r8.f9765g
            pd.j r11 = new pd.j
            pd.k r14 = pd.k.f10506o
            r10 = 1
            r11.<init>(r14, r8, r10)
            r11.I(r5)
            md.a r14 = md.a.X
            r11.w(r14)
            qd.m r11 = qd.l.Z(r11)
            r11.f10902i = r8
            r2.b0(r5, r11)
            goto L25b
        L218:
            java.lang.String r0 = "Unexpected instance arg in invoke"
            ah.a.k(r0)
            return
        L21e:
            r10 = 1
            int r8 = r8.j0()
            int r14 = r2.T(r5)
            java.util.List r11 = r11.f9779i
            int r14 = r14 - r8
            java.lang.Object r8 = r11.get(r14)
            qd.j r8 = (qd.j) r8
            r8.getClass()
            boolean r11 = r8 instanceof qd.g
            if (r11 == 0) goto L25b
            r5.f10902i = r8
            qd.g r11 = qd.j.f10870d
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L25b
            md.a r8 = md.a.W
            r5.w(r8)
            goto L25b
        L247:
            r10 = 1
            goto L25b
        L249:
            r22 = r8
            r21 = r10
            r10 = 1
            qd.l r5 = r7.H()
            boolean r5 = r2.b0(r14, r5)
            if (r5 != 0) goto L25b
        L258:
            r14 = r17
            goto L263
        L25b:
            r2.V(r6)
            r14 = r17
            int r17 = r14 + 1
            goto L265
        L263:
            r17 = r14
        L265:
            r11 = r10
            r2 = r19
            r5 = r20
            r10 = r21
            r8 = r22
            r14 = 0
            goto Le1
        L271:
            r19 = r2
            r20 = r5
            r21 = r10
            r14 = r17
            int r2 = r12.size()
            if (r14 != r2) goto L288
        L27f:
            r1.add(r6)
            if (r15 == 0) goto L29b
            r15.run()
            goto L29b
        L288:
            java.util.stream.Stream r2 = r21.stream()
            a7.b r5 = new a7.b
            r7 = 2
            r5.<init>(r7)
            boolean r2 = r2.allMatch(r5)
            if (r2 == 0) goto L29b
            r6.w(r9)
        L29b:
            r2 = r19
            r5 = r20
            goto L24
        L2a1:
            r19 = r2
            xe.l.k(r0, r1)
            java.util.ArrayList r2 = r4.f13674l
            xe.l.e(r2, r1)
            r2 = r19
            goto Lf
        L2af:
            return
    }

    public static void S(ud.r r11, p4.t r12) {
            ud.p[] r0 = r11.f13731y
            java.lang.Object r1 = r12.f10224h
            java.util.Map r1 = (java.util.Map) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Le
            goto Ld0
        Le:
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Exception -> L3d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L3d
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3d
            r4 = r0[r4]     // Catch: java.lang.Exception -> L3d
            if (r4 == 0) goto L16
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Exception -> L3d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L3d
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L3d
            r4.f9389i = r3     // Catch: java.lang.Exception -> L3d
            goto L16
        L3d:
            r1 = move-exception
            java.lang.String r2 = "Error attach source line"
            r11.M(r2, r1)
            goto Ld0
        L45:
            java.util.Collection r2 = r1.values()
            java.util.stream.Stream r2 = r2.stream()
            ae.a r3 = new ae.a
            r4 = 6
            r3.<init>(r4)
            java.util.stream.IntStream r2 = r2.mapToInt(r3)
            java.util.OptionalInt r2 = r2.min()
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r2.orElse(r3)
            r3 = 3
            if (r2 >= r3) goto L6c
            java.lang.String r1 = "Lines numbers was adjusted: min line is "
            java.lang.String r1 = eh.a.l(r2, r1)
            goto Lbf
        L6c:
            java.util.Collection r1 = r1.values()
            java.util.stream.Stream r1 = r1.stream()
            com.alibaba.fastjson2.writer.b r2 = new com.alibaba.fastjson2.writer.b
            r3 = 10
            r2.<init>(r3)
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 11
            r3.<init>(r4)
            be.o r4 = new be.o
            r4.<init>()
            java.util.stream.Collector r2 = java.util.stream.Collectors.toMap(r2, r3, r4)
            java.lang.Object r1 = r1.collect(r2)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.stream.Stream r1 = r1.stream()
            ce.n r2 = new ce.n
            r3 = 3
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.filter(r2)
            java.util.stream.Collector r2 = java.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r2)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lbe
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Repeating lines: "
            java.lang.String r1 = r2.concat(r1)
            goto Lbf
        Lbe:
            r1 = 0
        Lbf:
            if (r1 == 0) goto Lcb
            java.lang.String r2 = "Don't trust debug lines info. "
            java.lang.String r1 = r2.concat(r1)
            r11.I(r1)
            goto Ld0
        Lcb:
            md.a r1 = md.a.f8816d0
            r11.w(r1)
        Ld0:
            java.lang.Object r12 = r12.f10225i
            java.util.List r12 = (java.util.List) r12
            boolean r1 = r12.isEmpty()
            r2 = 0
            if (r1 == 0) goto Ldd
            goto L153
        Ldd:
            java.util.Iterator r1 = r12.iterator()
        Le1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L14b
            java.lang.Object r3 = r1.next()
            lf.b r3 = (lf.b) r3
            int r4 = r3.f8033a
            int r5 = r3.f8038f
            int r6 = r3.f8039g
            qd.j r7 = G(r11, r3)
            nd.d0 r8 = new nd.d0
            java.lang.String r3 = r3.f8034b
            r8.<init>(r3, r7)
            if (r5 > 0) goto L120
            qd.r r3 = r11.f13729w
            if (r3 == 0) goto L107
            p(r3, r8, r4)
        L107:
            java.util.List r3 = r11.S()
            java.util.Iterator r3 = r3.iterator()
        L10f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L11f
            java.lang.Object r5 = r3.next()
            qd.r r5 = (qd.r) r5
            p(r5, r8, r4)
            goto L10f
        L11f:
            r5 = r2
        L120:
            if (r5 > r6) goto Le1
            r3 = r0[r5]
            if (r3 != 0) goto L127
            goto L148
        L127:
            java.util.List r7 = r3.f13715m
            java.util.Iterator r7 = r7.iterator()
            r9 = r2
        L12e:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L140
            java.lang.Object r10 = r7.next()
            qd.l r10 = (qd.l) r10
            int r10 = p(r10, r8, r4)
            int r9 = r9 + r10
            goto L12e
        L140:
            if (r9 == 0) goto L143
            goto L148
        L143:
            qd.r r3 = r3.f13714l
            p(r3, r8, r4)
        L148:
            int r5 = r5 + 1
            goto L120
        L14b:
            nd.s r1 = new nd.s
            r1.<init>(r12)
            r11.y(r1)
        L153:
            int r12 = r0.length
        L154:
            if (r2 >= r12) goto L166
            r1 = r0[r2]
            if (r1 == 0) goto L163
            int r1 = r1.f9389i
            if (r1 == 0) goto L163
            int r1 = r1 + (-1)
            r11.f9389i = r1
            goto L166
        L163:
            int r2 = r2 + 1
            goto L154
        L166:
            return
    }

    public static boolean T(qd.l r3) {
            r3.getClass()
            boolean r0 = r3 instanceof qd.r
            if (r0 == 0) goto L9
            r3 = 1
            return r3
        L9:
            boolean r0 = r3 instanceof qd.m
            r1 = 0
            if (r0 == 0) goto L21
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            pd.k r0 = r3.f13713k
            pd.k r2 = pd.k.A
            if (r0 != r2) goto L21
            qd.l r3 = r3.S(r1)
            boolean r3 = T(r3)
            return r3
        L21:
            return r1
    }

    public static ud.p U(ud.r r5, ud.p r6, xe.l r7) {
            if (r6 != 0) goto L3
            goto L4d
        L3:
            pd.k r0 = r6.f13713k
            pd.k r1 = pd.k.J
            if (r0 != r1) goto La
            return r6
        La:
            md.f r1 = r6.f8877g
            boolean r1 = r1.f()
            r2 = 0
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r7.f21570c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r6)
            goto L3a
        L1b:
            ud.p r1 = new ud.p
            pd.k r3 = pd.k.Q
            r1.<init>(r3, r2)
            java.util.List r3 = r5.f13732z
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            ud.a r4 = (ud.a) r4
            boolean r4 = a.a.K0(r5, r4, r6, r1)
            if (r4 == 0) goto L28
        L3a:
            pd.k r1 = pd.k.f10504m
            if (r0 != r1) goto L4d
            qd.l r6 = r6.S(r2)
            qd.r r6 = (qd.r) r6
            ud.p r6 = r6.f0()
            ud.p r5 = U(r5, r6, r7)
            return r5
        L4d:
            r5 = 0
            return r5
    }

    public static void V(ud.p r6) {
            pd.k r0 = r6.f13713k
            md.a r1 = md.a.f8835p
            pd.k r2 = pd.k.f10501j
            if (r0 != r2) goto L3f
            pd.a r6 = (pd.a) r6
            int r0 = r6.f10475o
            r3 = 1
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L18
            r3 = 6
            if (r0 == r3) goto L18
            r3 = 7
            if (r0 != r3) goto L85
        L18:
            r3 = 0
        L19:
            r4 = 2
            if (r3 >= r4) goto L85
            qd.l r4 = r6.S(r3)
            r4.getClass()
            boolean r5 = r4 instanceof qd.m
            if (r5 == 0) goto L3c
            qd.m r4 = (qd.m) r4
            ud.p r4 = r4.f10904l
            pd.k r5 = r4.f13713k
            if (r5 != r2) goto L39
            r5 = r4
            pd.a r5 = (pd.a) r5
            int r5 = r5.f10475o
            if (r5 != r0) goto L39
            r4.w(r1)
        L39:
            V(r4)
        L3c:
            int r3 = r3 + 1
            goto L19
        L3f:
            pd.k r2 = pd.k.R
            if (r0 != r2) goto L64
            r0 = r6
            td.b r0 = (td.b) r0
            yd.b r0 = r0.f13121o
            int r2 = r0.f22419i
            java.util.List r0 = r0.f22420j
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r0.next()
            yd.b r3 = (yd.b) r3
            int r4 = r3.f22419i
            if (r4 != r2) goto L50
            r3.w(r1)
            goto L50
        L64:
            java.util.List r6 = r6.f13715m
            java.util.Iterator r6 = r6.iterator()
        L6a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r6.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r1 = r0 instanceof qd.m
            if (r1 == 0) goto L6a
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            V(r0)
            goto L6a
        L85:
            return
    }

    public static void W(ud.r r5) {
            java.util.List r0 = r5.D
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            qd.s r1 = (qd.s) r1
            boolean r2 = r1.i()
            p4.t r3 = r1.f10930l
            if (r2 != 0) goto L24
            qd.h r2 = qd.j.f10887u
            r3.f10224h = r2
            qd.k r4 = r1.f10931m
            if (r4 == 0) goto L24
            r4.f10895b = r2
        L24:
            java.lang.Object r2 = r3.f10225i
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r2.clear()
            r2 = 0
            r1.f10931m = r2
            goto L6
        L2f:
            I(r5)
            return
    }

    public static void X(ud.e r5) {
            java.util.List r0 = r5.f13699v
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ud.e r1 = (ud.e) r1
            X(r1)
            goto L6
        L16:
            java.util.List r0 = r5.f13697t
            java.util.List r1 = r5.f13699v
            java.util.List r2 = r5.f13698u
            r3 = 3
            java.util.List[] r3 = new java.util.List[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r1 = 2
            r3[r1] = r2
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r3)
            ae.d r2 = new ae.d
            r3 = 4
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.flatMap(r2)
            a7.b r2 = new a7.b
            r3 = 17
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.filter(r2)
            a7.b r2 = new a7.b
            r3 = 18
            r2.<init>(r3)
            java.util.stream.Stream r1 = r1.filter(r2)
            ae.a r2 = new ae.a
            r2.<init>(r0)
            java.util.stream.IntStream r1 = r1.mapToInt(r2)
            java.util.OptionalInt r1 = r1.min()
            int r1 = r1.orElse(r4)
            if (r1 == 0) goto L62
            int r1 = r1 - r0
            r5.f9389i = r1
        L62:
            return
    }

    public static void Y(ud.r r21) {
            r0 = r21
            boolean r1 = r0.f13722p
            if (r1 == 0) goto L8
            goto L3c4
        L8:
            md.a r1 = md.a.f8814b0
            r0.D(r1)
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c4
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r3 = r2.f13674l
            boolean r4 = r3.isEmpty()
            md.a r5 = md.a.S
            if (r4 == 0) goto L2d
            r16 = r1
            goto L37f
        L2d:
            int r4 = r3.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r4)
            r8 = 0
        L37:
            if (r8 >= r4) goto L4a
            oe.a r9 = new oe.a
            java.lang.Object r10 = r3.get(r8)
            ud.p r10 = (ud.p) r10
            r9.<init>(r10, r7, r8)
            r7.add(r9)
            int r8 = r8 + 1
            goto L37
        L4a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L35f
            java.lang.Object r8 = r7.next()
            oe.a r8 = (oe.a) r8
            java.util.ArrayList r9 = r8.f9790c
            int r10 = r9.size()
            r11 = 1
            int r10 = r10 - r11
        L67:
            if (r10 < 0) goto L53
            java.lang.Object r12 = r9.get(r10)
            qd.r r12 = (qd.r) r12
            md.f r13 = r12.f8877g
            md.a r14 = md.a.f8836q
            boolean r13 = r13.a(r14)
            if (r13 != 0) goto L87
            ud.p r13 = r12.f10903j
            if (r13 == 0) goto L87
            md.f r13 = r13.f8877g
            md.a r15 = md.a.f8838s
            boolean r13 = r13.a(r15)
            if (r13 == 0) goto L8d
        L87:
            r16 = r1
        L89:
            r18 = r7
            goto L193
        L8d:
            qd.s r13 = r12.f10923m
            if (r13 == 0) goto L87
            java.util.ArrayList r6 = r13.f10928j
            qd.r r11 = r13.f10927i
            md.f r11 = r11.f8877g
            boolean r11 = r11.a(r14)
            if (r11 == 0) goto L9e
            goto L87
        L9e:
            qd.r r11 = r13.f10927i
            ud.p r11 = r11.f10903j
            if (r11 == 0) goto L87
            r16 = r1
            md.f r1 = r11.f8877g
            boolean r1 = r1.a(r14)
            if (r1 != 0) goto L89
            md.f r1 = r11.f8877g
            boolean r1 = r1.a(r5)
            if (r1 == 0) goto Lb7
        Lb6:
            goto L89
        Lb7:
            md.a r1 = md.a.O
            md.f r14 = r11.f8877g
            boolean r1 = r14.a(r1)
            if (r1 != 0) goto Lc8
            boolean r14 = r13.j()
            if (r14 == 0) goto Lc8
            goto Lb6
        Lc8:
            java.util.Iterator r14 = r6.iterator()
            r17 = r1
            r1 = 0
        Lcf:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto L103
            java.lang.Object r18 = r14.next()
            r19 = r6
            r6 = r18
            qd.r r6 = (qd.r) r6
            r18 = r7
            ud.p r7 = r6.f10903j
            if (r7 == 0) goto Lf2
            md.f r7 = r7.f8877g
            boolean r7 = r7.a(r15)
            if (r7 == 0) goto Lf2
        Led:
            r7 = r18
            r6 = r19
            goto Lcf
        Lf2:
            if (r17 != 0) goto L100
            md.a r7 = md.a.f8837r
            md.f r6 = r6.f8877g
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto L100
            goto L193
        L100:
            int r1 = r1 + 1
            goto Led
        L103:
            r19 = r6
            r18 = r7
            r6 = 1
            if (r17 != 0) goto L10e
            if (r1 == r6) goto L10e
            goto L193
        L10e:
            if (r17 != 0) goto L163
            java.lang.String r1 = r13.e()
            if (r1 == 0) goto L163
            java.lang.String r1 = r13.e()
            nd.n r7 = new nd.n
            r14 = 1
            r7.<init>(r1, r14)
            java.lang.Object r1 = r11.e0(r7)
            qd.l r1 = (qd.l) r1
            if (r1 == 0) goto L129
            goto L163
        L129:
            java.util.List r1 = r0.D
            java.util.Iterator r1 = r1.iterator()
        L12f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L193
            java.lang.Object r7 = r1.next()
            qd.s r7 = (qd.s) r7
            if (r7 == r13) goto L12f
            qd.k r14 = r7.b()
            qd.k r6 = r13.b()
            if (r14 != r6) goto L149
        L147:
            r6 = 1
            goto L12f
        L149:
            java.lang.String r6 = r7.e()
            java.lang.String r14 = r13.e()
            boolean r6 = java.util.Objects.equals(r6, r14)
            if (r6 == 0) goto L147
            java.util.ArrayList r1 = r7.f10928j
            int r1 = r1.size()
            int r6 = r19.size()
            if (r1 <= r6) goto L193
        L163:
            pd.k r1 = r11.f13713k
            pd.k r6 = pd.k.O
            if (r1 != r6) goto L197
            boolean r1 = r11 instanceof pd.l
            if (r1 == 0) goto L197
            qd.s r1 = r12.f10923m
            java.util.ArrayList r1 = r1.f10928j
            java.util.Iterator r1 = r1.iterator()
        L175:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L197
            java.lang.Object r7 = r1.next()
            qd.r r7 = (qd.r) r7
            ud.p r13 = r7.f10903j
            if (r13 == 0) goto L175
            pd.k r14 = r13.f13713k
            if (r14 != r6) goto L175
            pd.n r13 = (pd.n) r13
            qd.l r13 = r13.k0()
            if (r13 == 0) goto L175
            if (r13 != r7) goto L175
        L193:
            r19 = r9
            goto L354
        L197:
            r1 = 0
            int r6 = xe.k.a(r3, r11, r1)
            r1 = -1
            if (r6 == r1) goto L24c
            java.util.ArrayList r1 = r8.f9789b
            int r7 = r8.f9792e
            if (r6 >= r7) goto L242
            java.lang.Object r11 = r1.get(r6)
            oe.a r11 = (oe.a) r11
            int r13 = r6 + 1
            if (r13 != r7) goto L1b2
        L1af:
            r19 = r9
            goto L20e
        L1b2:
            if (r13 > r7) goto L236
            java.util.ArrayList r14 = r11.f9790c
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L1c7
            java.util.ArrayList r14 = r11.f9794g
            boolean r14 = xe.s.h(r14)
            if (r14 == 0) goto L1c7
            xe.g r14 = xe.g.f21560g
            goto L1cf
        L1c7:
            java.util.BitSet r14 = new java.util.BitSet
            r14.<init>()
            r11.c(r14)
        L1cf:
            xe.g r15 = xe.g.f21560g
            if (r14 != r15) goto L1dc
            ud.p r15 = r11.f9788a
            boolean r15 = r15.W()
            if (r15 == 0) goto L1dc
            goto L1af
        L1dc:
            boolean r11 = r11.b()
        L1e0:
            if (r13 >= r7) goto L1af
            java.lang.Object r15 = r1.get(r13)
            oe.a r15 = (oe.a) r15
            r19 = r9
            oe.a r9 = r15.d()
            if (r9 != r8) goto L1f1
            goto L209
        L1f1:
            ud.p r9 = r15.f9788a
            if (r11 == 0) goto L1fc
            boolean r9 = oe.a.e(r9, r14)
            if (r9 == 0) goto L209
            goto L244
        L1fc:
            boolean r15 = r9.N()
            if (r15 == 0) goto L244
            boolean r9 = oe.a.e(r9, r14)
            if (r9 == 0) goto L209
            goto L244
        L209:
            int r13 = r13 + 1
            r9 = r19
            goto L1e0
        L20e:
            r8.f9792e = r6
            java.lang.Object r1 = r1.get(r6)
            oe.a r1 = (oe.a) r1
            r1.f9793f = r8
            java.util.ArrayList r6 = r8.f9794g
            if (r6 != 0) goto L229
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList r7 = r8.f9790c
            int r7 = r7.size()
            r6.<init>(r7)
            r8.f9794g = r6
        L229:
            java.util.ArrayList r6 = r8.f9794g
            r6.add(r1)
            oe.b r6 = new oe.b
            ud.p r1 = r1.f9788a
            r6.<init>(r1, r12)
            goto L245
        L236:
            java.lang.String r0 = "Invalid inline insn positions: "
            java.lang.String r1 = " - "
            java.lang.String r0 = p.a.j(r13, r0, r1, r7)
            ah.a.k(r0)
            return
        L242:
            r19 = r9
        L244:
            r6 = 0
        L245:
            if (r6 == 0) goto L354
            r4.add(r6)
            goto L354
        L24c:
            r19 = r9
            java.util.List r1 = r0.f13732z
            ud.a r1 = a.a.S(r0, r11, r1)
            if (r1 == 0) goto L354
            ud.p r6 = r12.f10903j
            if (r11 == r6) goto L354
            ud.p r6 = r8.f9788a
            boolean r7 = a.a.s0(r1, r2)
            if (r7 != 0) goto L265
        L262:
            r6 = 0
            goto L33a
        L265:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            oe.a.a(r11, r7)
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L276:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L288
            java.lang.Object r13 = r7.next()
            qd.r r13 = (qd.r) r13
            int r13 = r13.f10922l
            r9.set(r13)
            goto L276
        L288:
            java.util.ArrayList r7 = r1.f13674l
            java.util.Iterator r7 = r7.iterator()
            r13 = 0
        L28f:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L2ae
            java.lang.Object r14 = r7.next()
            ud.p r14 = (ud.p) r14
            if (r13 == 0) goto L2aa
            boolean r20 = r14.N()
            if (r20 == 0) goto L262
            boolean r20 = oe.a.e(r14, r9)
            if (r20 == 0) goto L2aa
            goto L262
        L2aa:
            if (r14 != r11) goto L28f
            r13 = 1
            goto L28f
        L2ae:
            java.util.HashSet r7 = a.a.P(r1, r2)
            r7.remove(r1)
            r7.remove(r2)
            java.util.Iterator r7 = r7.iterator()
        L2bc:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L318
            java.lang.Object r13 = r7.next()
            ud.a r13 = (ud.a) r13
            md.f r14 = r13.f8877g
            boolean r14 = r14.a(r15)
            if (r14 == 0) goto L2f8
            pd.k r14 = pd.k.f10517z
            boolean r13 = a.a.v(r13, r14)
            if (r13 == 0) goto L2bc
            xd.b r13 = r0.G
            if (r13 != 0) goto L2de
        L2dc:
            r13 = 0
            goto L2f5
        L2de:
            ud.j r13 = f8.i.z(r1, r13)
            boolean r14 = r13 instanceof ud.n
            if (r14 == 0) goto L2dc
            boolean r14 = r13 instanceof ud.i
            if (r14 == 0) goto L2eb
            goto L2dc
        L2eb:
            ud.n r13 = (ud.n) r13
            java.util.List r13 = r13.u()
            boolean r13 = r13.contains(r2)
        L2f5:
            if (r13 == 0) goto L262
            goto L2bc
        L2f8:
            java.util.ArrayList r13 = r13.f13674l
            java.util.Iterator r13 = r13.iterator()
        L2fe:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L2bc
            java.lang.Object r14 = r13.next()
            ud.p r14 = (ud.p) r14
            boolean r20 = r14.N()
            if (r20 == 0) goto L262
            boolean r14 = oe.a.e(r14, r9)
            if (r14 == 0) goto L2fe
            goto L262
        L318:
            java.util.Iterator r7 = r3.iterator()
        L31c:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L346
            java.lang.Object r13 = r7.next()
            ud.p r13 = (ud.p) r13
            if (r13 != r6) goto L32c
            r6 = 1
            goto L33a
        L32c:
            boolean r14 = r13.N()
            if (r14 == 0) goto L262
            boolean r13 = oe.a.e(r13, r9)
            if (r13 == 0) goto L31c
            goto L262
        L33a:
            if (r6 == 0) goto L354
            if (r17 == 0) goto L342
            o(r0, r12, r11, r1)
            goto L354
        L342:
            J(r0, r12, r11, r1)
            goto L354
        L346:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Can't process instruction move : "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            return
        L354:
            int r10 = r10 + (-1)
            r1 = r16
            r7 = r18
            r9 = r19
            r11 = 1
            goto L67
        L35f:
            r16 = r1
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L37f
            java.util.Iterator r1 = r4.iterator()
        L36b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37f
            java.lang.Object r4 = r1.next()
            oe.b r4 = (oe.b) r4
            qd.r r6 = r4.f9796b
            ud.p r4 = r4.f9795a
            J(r0, r6, r4, r2)
            goto L36b
        L37f:
            int r1 = r3.size()
            r2 = 0
        L384:
            if (r2 >= r1) goto L3c0
            java.lang.Object r4 = r3.get(r2)
            ud.p r4 = (ud.p) r4
            pd.k r6 = r4.f13713k
            pd.k r7 = pd.k.f10504m
            if (r6 != r7) goto L3bc
            r6 = 0
            qd.l r7 = r4.S(r6)
            r7.getClass()
            boolean r8 = r7 instanceof qd.m
            if (r8 == 0) goto L3bd
            qd.m r7 = (qd.m) r7
            ud.p r7 = r7.f10904l
            xe.l.l(r0, r7)
            qd.r r8 = r4.f13714l
            qd.r r8 = r8.c0()
            r7.d0(r8)
            r7.V(r4)
            int r4 = r4.f13716n
            r7.f13716n = r4
            r7.D(r5)
            r3.set(r2, r7)
            goto L3bd
        L3bc:
            r6 = 0
        L3bd:
            int r2 = r2 + 1
            goto L384
        L3c0:
            r1 = r16
            goto L13
        L3c4:
            return
    }

    public static void Z(ud.r r6, qd.l r7) {
            if (r7 == 0) goto L20
            boolean r0 = r7.Q()
            if (r0 == 0) goto L20
            qd.j r0 = r7.I()
            pd.j r1 = new pd.j
            pd.k r2 = pd.k.f10506o
            r3 = 1
            r1.<init>(r2, r0, r3)
            r4 = 0
            qd.n r0 = qd.l.S(r4, r0)
            r1.I(r0)
            r7.b0(r6, r1, r3)
        L20:
            return
    }

    private final void a0(ud.r r21) {
            r20 = this;
            r0 = r21
            boolean r1 = r0.f13722p
            if (r1 == 0) goto L8
            goto L629
        L8:
            java.util.List r1 = r0.D
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L12
            goto L629
        L12:
            pe.a r1 = new pe.a
            r1.<init>()
            java.util.List r2 = r0.f13732z
            int r2 = r2.size()
            int r3 = r0.f13723q
            java.util.BitSet[] r4 = pe.a.a(r2, r3)
            r1.f10542a = r4
            java.util.BitSet[] r4 = pe.a.a(r2, r3)
            r1.f10543b = r4
            java.util.BitSet[] r2 = pe.a.a(r3, r2)
            r1.f10545d = r2
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            int r4 = r3.f13672j
            java.util.BitSet[] r5 = r1.f10542a
            r5 = r5[r4]
            java.util.BitSet[] r6 = r1.f10543b
            r6 = r6[r4]
            java.util.ArrayList r3 = r3.f13674l
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L37
            java.lang.Object r7 = r3.next()
            ud.p r7 = (ud.p) r7
            java.util.List r8 = r7.f13715m
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r8.next()
            qd.l r9 = (qd.l) r9
            r9.getClass()
            boolean r10 = r9 instanceof qd.r
            if (r10 == 0) goto L65
            qd.r r9 = (qd.r) r9
            int r9 = r9.f10922l
            boolean r10 = r6.get(r9)
            if (r10 != 0) goto L65
            r5.set(r9)
            goto L65
        L86:
            qd.r r7 = r7.f13714l
            if (r7 == 0) goto L53
            int r7 = r7.f10922l
            r6.set(r7)
            java.util.BitSet[] r8 = r1.f10545d
            r7 = r8[r7]
            r7.set(r4)
            goto L53
        L97:
            java.util.List r2 = r0.f13732z
            int r2 = r2.size()
            int r3 = r0.f13723q
            java.util.BitSet[] r2 = pe.a.a(r2, r3)
            java.util.List r4 = r0.f13732z
            int r5 = r4.size()
            int r6 = r5 * 10
            r7 = 0
            r8 = r7
        Lad:
            java.util.Iterator r9 = r4.iterator()
            r10 = r7
        Lb2:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Lfb
            java.lang.Object r11 = r9.next()
            ud.a r11 = (ud.a) r11
            int r13 = r11.f13672j
            r14 = r2[r13]
            java.util.BitSet r15 = new java.util.BitSet
            r15.<init>(r3)
            java.util.List r11 = r11.f13676n
            java.util.Iterator r11 = r11.iterator()
        Lcd:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto Le3
            java.lang.Object r16 = r11.next()
            r12 = r16
            ud.a r12 = (ud.a) r12
            int r12 = r12.f13672j
            r12 = r2[r12]
            r15.or(r12)
            goto Lcd
        Le3:
            java.util.BitSet[] r11 = r1.f10543b
            r11 = r11[r13]
            r15.andNot(r11)
            java.util.BitSet[] r11 = r1.f10542a
            r11 = r11[r13]
            r15.or(r11)
            boolean r11 = r14.equals(r15)
            if (r11 != 0) goto Lb2
            r2[r13] = r15
            r10 = 1
            goto Lb2
        Lfb:
            int r9 = r8 + 1
            if (r8 > r6) goto L62d
            if (r10 != 0) goto L62a
            r1.f10544c = r2
            int r2 = r0.f13723q
            r3 = r7
        L106:
            if (r3 >= r2) goto L19e
            java.util.List r4 = r0.f13732z
            int r5 = r4.size()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>(r5)
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>(r5)
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>()
            java.util.BitSet[] r9 = r1.f10545d
            r9 = r9[r3]
            int r10 = r9.nextSetBit(r7)
        L125:
            if (r10 < 0) goto L13a
            r8.set(r10)
            java.lang.Object r11 = r4.get(r10)
            ud.a r11 = (ud.a) r11
            r5.add(r11)
            int r10 = r10 + 1
            int r10 = r9.nextSetBit(r10)
            goto L125
        L13a:
            boolean r9 = r5.isEmpty()
            if (r9 != 0) goto L19a
            java.lang.Object r9 = r5.pop()
            ud.a r9 = (ud.a) r9
            java.util.BitSet r9 = r9.f13680r
            int r10 = r9.nextSetBit(r7)
        L14c:
            if (r10 < 0) goto L13a
            boolean r11 = r6.get(r10)
            if (r11 != 0) goto L193
            java.util.BitSet[] r11 = r1.f10544c
            int r12 = r11.length
            if (r10 < r12) goto L16d
            mh.b r11 = pe.a.f10541e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.util.BitSet[] r13 = r1.f10544c
            int r13 = r13.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "LiveVarAnalysis: out of bounds block: {}, max: {}"
            r11.s(r12, r14, r13)
            r11 = r7
            goto L173
        L16d:
            r11 = r11[r10]
            boolean r11 = r11.get(r3)
        L173:
            if (r11 == 0) goto L193
            java.lang.Object r11 = r4.get(r10)
            ud.a r11 = (ud.a) r11
            pd.q r12 = l(r0, r11, r3)
            java.util.ArrayList r13 = r11.f13674l
            r13.add(r7, r12)
            r6.set(r10)
            boolean r12 = r8.get(r10)
            if (r12 != 0) goto L193
            r8.set(r10)
            r5.add(r11)
        L193:
            int r10 = r10 + 1
            int r10 = r9.nextSetBit(r10)
            goto L14c
        L19a:
            int r3 = r3 + 1
            goto L106
        L19e:
            int r1 = r0.f13723q
            pe.b r2 = new pe.b
            ud.a r3 = r0.B
            qd.s[] r4 = new qd.s[r1]
            int[] r1 = new int[r1]
            r2.<init>(r0, r3, r4, r1)
            qd.r r1 = r0.f13729w
            if (r1 == 0) goto L1b2
            r2.a(r1)
        L1b2:
            java.util.List r1 = r0.S()
            java.util.Iterator r1 = r1.iterator()
        L1ba:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1ca
            java.lang.Object r3 = r1.next()
            qd.r r3 = (qd.r) r3
            r2.a(r3)
            goto L1ba
        L1ca:
            ud.a r1 = r2.f10547b
            md.f r1 = r1.f8877g
            md.b r3 = md.b.f8869x
            oc.b r1 = r1.c(r3)
            nd.c0 r1 = (nd.c0) r1
            if (r1 == 0) goto L1ee
            java.util.ArrayList r1 = r1.f9356g
            java.util.Iterator r1 = r1.iterator()
        L1de:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1ee
            java.lang.Object r4 = r1.next()
            pd.q r4 = (pd.q) r4
            q(r2, r4)
            goto L1de
        L1ee:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r1.push(r2)
        L1f6:
            boolean r2 = r1.isEmpty()
            pd.k r4 = pd.k.X
            if (r2 != 0) goto L2d9
            java.lang.Object r2 = r1.pop()
            pe.b r2 = (pe.b) r2
            ud.a r5 = r2.f10547b
            qd.s[] r6 = r2.f10548c
            java.util.ArrayList r8 = r5.f13674l
            java.util.Iterator r8 = r8.iterator()
        L20e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L27b
            java.lang.Object r9 = r8.next()
            ud.p r9 = (ud.p) r9
            pd.k r10 = r9.f13713k
            if (r10 == r4) goto L272
            java.util.List r10 = r9.f13715m
            java.util.Iterator r10 = r10.iterator()
        L224:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L272
            java.lang.Object r11 = r10.next()
            qd.l r11 = (qd.l) r11
            r11.getClass()
            boolean r12 = r11 instanceof qd.r
            if (r12 != 0) goto L238
            goto L224
        L238:
            qd.r r11 = (qd.r) r11
            int r12 = r11.f10922l
            r13 = r6[r12]
            if (r13 != 0) goto L26d
            java.lang.String r13 = java.lang.String.valueOf(r9)
            java.lang.String r14 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r7 = "Not initialized variable reg: "
            r15.<init>(r7)
            r15.append(r12)
            java.lang.String r7 = ", insn: "
            r15.append(r7)
            r15.append(r13)
            java.lang.String r7 = ", block:"
            r15.append(r7)
            r15.append(r14)
            java.lang.String r7 = r15.toString()
            r0.L(r7)
            qd.s r13 = r2.a(r11)
        L26d:
            r13.q(r11)
            r7 = 0
            goto L224
        L272:
            qd.r r7 = r9.f13714l
            if (r7 == 0) goto L279
            r2.a(r7)
        L279:
            r7 = 0
            goto L20e
        L27b:
            java.util.List r4 = r5.f13676n
            java.util.Iterator r4 = r4.iterator()
        L281:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2ae
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r3)
            nd.c0 r5 = (nd.c0) r5
            if (r5 != 0) goto L298
            goto L281
        L298:
            java.util.ArrayList r5 = r5.f9356g
            java.util.Iterator r5 = r5.iterator()
        L29e:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L281
            java.lang.Object r7 = r5.next()
            pd.q r7 = (pd.q) r7
            q(r2, r7)
            goto L29e
        L2ae:
            ud.a r4 = r2.f10547b
            java.util.List r4 = r4.f13683u
            java.util.Iterator r4 = r4.iterator()
        L2b6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2d6
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            pe.b r7 = new pe.b
            ud.r r8 = r2.f10546a
            int r9 = r6.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r6, r9)
            qd.s[] r9 = (qd.s[]) r9
            int[] r10 = r2.f10549d
            r7.<init>(r8, r5, r9, r10)
            r1.push(r7)
            goto L2b6
        L2d6:
            r7 = 0
            goto L1f6
        L2d9:
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L2df:
            boolean r2 = r1.hasNext()
            md.b r5 = md.b.E
            if (r2 == 0) goto L378
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            md.f r7 = r2.f8877g
            oc.b r7 = r7.c(r3)
            nd.c0 r7 = (nd.c0) r7
            if (r7 == 0) goto L2df
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r5)
            ae.c r2 = (ae.c) r2
            if (r2 == 0) goto L2df
            java.util.ArrayList r5 = r7.f9356g
            java.util.Iterator r5 = r5.iterator()
        L307:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L2df
            java.lang.Object r7 = r5.next()
            pd.q r7 = (pd.q) r7
            java.util.List r8 = r7.f13715m
            int r8 = r8.size()
            r9 = 0
        L31a:
            if (r9 >= r8) goto L369
            qd.r r10 = r7.j0(r9)
            ud.p r11 = r10.f0()
            if (r11 == 0) goto L366
            qd.r r12 = r11.f13714l
            if (r12 == 0) goto L366
            md.a r12 = md.a.f8825j
            md.f r13 = r11.f8877g
            boolean r12 = r13.a(r12)
            if (r12 == 0) goto L366
            md.f r12 = r11.f8877g
            md.b r13 = md.b.F
            oc.b r12 = r12.c(r13)
            ae.b r12 = (ae.b) r12
            if (r12 == 0) goto L341
            goto L354
        L341:
            java.util.List r12 = r0.f13732z
            ud.a r11 = a.a.S(r0, r11, r12)
            if (r11 != 0) goto L34b
            r12 = 0
            goto L354
        L34b:
            md.f r11 = r11.f8877g
            oc.b r11 = r11.c(r13)
            r12 = r11
            ae.b r12 = (ae.b) r12
        L354:
            if (r12 == 0) goto L366
            java.util.List r11 = r12.f228g
            ae.f r12 = r2.f229g
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L366
            r7.l0(r10)
            int r8 = r8 + (-1)
            goto L31a
        L366:
            int r9 = r9 + 1
            goto L31a
        L369:
            java.util.List r7 = r7.f13715m
            int r7 = r7.size()
            if (r7 == 0) goto L372
            goto L307
        L372:
            java.lang.String r0 = "PHI empty after try-catch fix!"
            ah.a.k(r0)
            return
        L378:
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L37e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d0
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            md.f r7 = r2.f8877g
            oc.b r7 = r7.c(r3)
            nd.c0 r7 = (nd.c0) r7
            if (r7 != 0) goto L395
            goto L37e
        L395:
            java.util.ArrayList r7 = r7.f9356g
            java.util.Iterator r7 = r7.iterator()
        L39b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L37e
            java.lang.Object r8 = r7.next()
            pd.q r8 = (pd.q) r8
            r9 = 0
        L3a8:
            java.util.List r10 = r8.f13715m
            int r10 = r10.size()
            if (r9 >= r10) goto L39b
            qd.r r10 = r8.j0(r9)
            ud.p r11 = r10.f0()
            if (r11 == 0) goto L3cd
            md.a r12 = md.a.f8840u
            md.f r13 = r11.f8877g
            boolean r12 = r13.a(r12)
            if (r12 == 0) goto L3cd
            r8.l0(r10)
            xe.l.j(r0, r11)
            xe.l.g(r0, r2, r11)
        L3cd:
            int r9 = r9 + 1
            goto L3a8
        L3d0:
            qd.r r1 = r0.f13729w
            N(r1)
            java.util.List r1 = r0.D
            int r1 = r1.size()
            int r1 = r1 * 2
            r2 = 0
        L3de:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = r0.D
            java.util.Iterator r8 = r8.iterator()
            r9 = 0
        L3ea:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L40f
            java.lang.Object r10 = r8.next()
            qd.s r10 = (qd.s) r10
            java.util.ArrayList r11 = r10.f10928j
            int r11 = r11.size()
            if (r11 != 0) goto L3ea
            qd.r r10 = r10.f10927i
            ud.p r10 = r10.f10903j
            if (r10 == 0) goto L3ea
            pd.k r11 = r10.f13713k
            if (r11 != r4) goto L3ea
            pd.q r10 = (pd.q) r10
            r7.add(r10)
            r9 = 1
            goto L3ea
        L40f:
            java.util.List r8 = r0.f13732z
            java.util.Iterator r8 = r8.iterator()
        L415:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L55d
            java.lang.Object r10 = r8.next()
            ud.a r10 = (ud.a) r10
            md.f r11 = r10.f8877g
            oc.b r11 = r11.c(r3)
            nd.c0 r11 = (nd.c0) r11
            if (r11 != 0) goto L42c
            goto L415
        L42c:
            java.util.ArrayList r11 = r11.f9356g
            java.util.Iterator r11 = r11.iterator()
        L432:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L415
            java.lang.Object r12 = r11.next()
            pd.q r12 = (pd.q) r12
            java.util.List r13 = r12.f13715m
            int r14 = r13.size()
            if (r14 != 0) goto L477
            qd.r r9 = r12.f13714l
            qd.s r9 = r9.f10923m
            java.util.ArrayList r9 = r9.f10928j
            java.util.Iterator r9 = r9.iterator()
        L450:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L468
            java.lang.Object r13 = r9.next()
            qd.r r13 = (qd.r) r13
            ud.p r14 = r13.f10903j
            if (r14 == 0) goto L450
            pd.k r14 = r14.f13713k
            if (r14 != r4) goto L450
            r12.l0(r13)
            goto L450
        L468:
            xe.l.j(r0, r12)
            xe.l.g(r0, r10, r12)
            r17 = r4
            r16 = r7
            r19 = r8
            r8 = 1
            goto L551
        L477:
            int r14 = r13.size()
            r15 = 1
            if (r14 == r15) goto L497
            r14 = 0
            r15 = 0
        L480:
            int r6 = r13.size()
            if (r14 >= r6) goto L497
            qd.r r6 = r12.j0(r14)
            if (r15 != 0) goto L48f
            qd.s r15 = r6.f10923m
            goto L494
        L48f:
            qd.s r6 = r6.f10923m
            if (r15 == r6) goto L494
            goto L4a5
        L494:
            int r14 = r14 + 1
            goto L480
        L497:
            r6 = 0
            qd.r r13 = r12.j0(r6)
            java.util.ArrayList r14 = r10.f13674l
            int r15 = xe.k.a(r14, r12, r6)
            r6 = -1
            if (r15 != r6) goto L4ae
        L4a5:
            r17 = r4
            r16 = r7
            r19 = r8
            r8 = 1
            goto L555
        L4ae:
            qd.r r6 = r12.f13714l
            qd.s r6 = r6.f10923m
            qd.s r9 = r13.f10923m
            if (r9 == 0) goto L4bc
            r9.k(r13)
            r9.l(r12)
        L4bc:
            qd.r r9 = r12.f13714l
            qd.s r9 = r9.f10923m
            if (r9 != 0) goto L4c9
            r17 = r4
            r16 = r7
        L4c6:
            r19 = r8
            goto L50e
        L4c9:
            r17 = r4
            r16 = r7
            r4 = 0
            qd.r r7 = r12.j0(r4)
            qd.s r4 = r7.f10923m
            if (r4 != 0) goto L4d7
            goto L4c6
        L4d7:
            java.util.ArrayList r4 = r9.f10928j
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r4)
            java.util.Iterator r4 = r9.iterator()
        L4e2:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L52f
            java.lang.Object r9 = r4.next()
            qd.r r9 = (qd.r) r9
            r18 = r4
            ud.p r4 = r9.f10903j
            if (r4 == 0) goto L4c6
            if (r4 == r12) goto L4c6
            int r4 = r9.f10922l
            r19 = r8
            int r8 = r7.f10922l
            if (r4 == r8) goto L4ff
            goto L50e
        L4ff:
            qd.s r4 = r9.f10923m
            r4.k(r9)
            qd.s r4 = r7.f10923m
            r4.q(r9)
            r4 = r18
            r8 = r19
            goto L4e2
        L50e:
            r6.l(r12)
            ud.p r4 = new ud.p
            pd.k r6 = pd.k.f10504m
            r8 = 1
            r4.<init>(r6, r8)
            md.a r6 = md.a.f8831m
            r4.w(r6)
            qd.r r6 = r12.f13714l
            r4.d0(r6)
            r4.I(r13)
            qd.s r6 = r13.f10923m
            r6.q(r13)
            r14.set(r15, r4)
            goto L551
        L52f:
            r19 = r8
            r8 = 1
            md.f r4 = r10.f8877g
            boolean r4 = r4.b(r5)
            if (r4 == 0) goto L54b
            ud.p r4 = r7.f0()
            if (r4 == 0) goto L54b
            boolean r6 = r4.W()
            if (r6 != 0) goto L54b
            md.a r6 = md.a.f8836q
            r4.w(r6)
        L54b:
            xe.l.j(r0, r12)
            r14.remove(r15)
        L551:
            r11.remove()
            r9 = r8
        L555:
            r7 = r16
            r4 = r17
            r8 = r19
            goto L432
        L55d:
            r17 = r4
            r16 = r7
            r8 = 1
            java.util.List r4 = r0.f13732z
            java.util.Iterator r4 = r4.iterator()
        L568:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5c7
            java.lang.Object r6 = r4.next()
            ud.a r6 = (ud.a) r6
            md.f r7 = r6.f8877g
            oc.b r7 = r7.c(r3)
            nd.c0 r7 = (nd.c0) r7
            if (r7 != 0) goto L57f
            goto L568
        L57f:
            java.util.ArrayList r7 = r7.f9356g
            java.util.Iterator r10 = r16.iterator()
        L585:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L5bd
            java.lang.Object r11 = r10.next()
            pd.q r11 = (pd.q) r11
            boolean r12 = r7.remove(r11)
            if (r12 == 0) goto L585
            java.util.List r12 = r11.f13715m
            java.util.Iterator r12 = r12.iterator()
        L59d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5b6
            java.lang.Object r13 = r12.next()
            qd.l r13 = (qd.l) r13
            if (r13 != 0) goto L5ac
            goto L59d
        L5ac:
            qd.r r13 = (qd.r) r13
            qd.s r13 = r13.f10923m
            if (r13 == 0) goto L59d
            r13.l(r11)
            goto L59d
        L5b6:
            xe.l.j(r0, r11)
            xe.l.g(r0, r6, r11)
            goto L585
        L5bd:
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L568
            r6.E(r3)
            goto L568
        L5c7:
            r16.clear()
            if (r9 == 0) goto L5db
            int r6 = r2 + 1
            if (r2 > r1) goto L5d5
            r2 = r6
            r4 = r17
            goto L3de
        L5d5:
            java.lang.String r0 = "Phi nodes fix limit reached!"
            ah.a.k(r0)
            return
        L5db:
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L5e1:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5fa
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            ce.n r3 = new ce.n
            r4 = 20
            r3.<init>(r4)
            r2.removeIf(r3)
            goto L5e1
        L5fa:
            java.util.List r0 = r0.D
            java.util.Iterator r0 = r0.iterator()
        L600:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L629
            java.lang.Object r1 = r0.next()
            qd.s r1 = (qd.s) r1
            java.util.ArrayList r2 = r1.f10928j
            int r2 = r2.size()
            if (r2 != 0) goto L627
            qd.r r1 = r1.f10927i
            ud.p r1 = r1.f10903j
            if (r1 == 0) goto L627
            pd.k r2 = r1.f13713k
            pd.k r3 = pd.k.O
            if (r2 != r3) goto L627
            r2 = 0
            r1.f13714l = r2
            r0.remove()
            goto L600
        L627:
            r2 = 0
            goto L600
        L629:
            return
        L62a:
            r8 = r9
            goto Lad
        L62d:
            java.lang.String r0 = "Live variable analysis reach iterations limit, blocks count: "
            java.lang.String r0 = eh.a.l(r5, r0)
            ah.a.k(r0)
            return
    }

    public static void i(ud.r r3, ud.g r4, pd.j r5) {
            r0 = 0
            qd.l r5 = r5.S(r0)
            r5.getClass()
            boolean r0 = r5 instanceof qd.m
            if (r0 == 0) goto L11
            qd.m r5 = (qd.m) r5
            ud.p r5 = r5.f10904l
            goto L1d
        L11:
            ud.p r0 = new ud.p
            pd.k r1 = pd.k.W
            r2 = 1
            r0.<init>(r1, r2)
            r0.I(r5)
            r5 = r0
        L1d:
            md.h r0 = new md.h
            r0.<init>(r3, r5)
            r4.y(r0)
            return
    }

    public static nd.w j(ud.r r4, ud.p r5, boolean r6) {
            boolean r0 = C(r4, r5)
            if (r0 != 0) goto L13
            if (r6 == 0) goto L11
            ae.e r4 = new ae.e
            r6 = 3
            r4.<init>(r6)
            r5.f0(r4)
        L11:
            r4 = 0
            return r4
        L13:
            if (r6 == 0) goto L16
            goto L1a
        L16:
            ud.p r5 = r5.O()
        L1a:
            ae.e r6 = new ae.e
            r0 = 3
            r6.<init>(r0)
            r5.f0(r6)
            java.util.List r6 = r4.S()
            qd.r r0 = r4.f13729w
            if (r0 == 0) goto L3f
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            int r1 = r1 + 1
            r0.<init>(r1)
            qd.r r1 = r4.f13729w
            r0.add(r1)
            r0.addAll(r6)
            r6 = r0
        L3f:
            int r0 = r6.size()
            int[] r1 = new int[r0]
            r2 = 0
        L46:
            if (r2 >= r0) goto L55
            java.lang.Object r3 = r6.get(r2)
            qd.r r3 = (qd.r) r3
            int r3 = r3.f10922l
            r1[r2] = r3
            int r2 = r2 + 1
            goto L46
        L55:
            nd.w r6 = new nd.w
            r6.<init>(r5, r1)
            r4.y(r6)
            java.lang.String r5 = "Marked for inline"
            r4.I(r5)
            return r6
    }

    public static void k(ud.r r2, ud.p[] r3, int r4, int r5) {
            r3 = r3[r5]     // Catch: java.lang.Exception -> Ld
            md.b r0 = md.b.H     // Catch: java.lang.Exception -> Ld
            nd.q r1 = new nd.q     // Catch: java.lang.Exception -> Ld
            r1.<init>(r4, r5)     // Catch: java.lang.Exception -> Ld
            r3.x(r0, r1)     // Catch: java.lang.Exception -> Ld
            return
        Ld:
            r3 = move-exception
            java.lang.String r4 = xe.m.d(r4)
            java.lang.String r5 = xe.m.d(r5)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to set jump: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " -> "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r2.getClass()
            xe.h.a(r2, r4, r3)
            return
    }

    public static pd.q l(ud.r r3, ud.a r4, int r5) {
            md.b r0 = md.b.f8869x
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            nd.c0 r0 = (nd.c0) r0
            if (r0 != 0) goto L14
            nd.c0 r0 = new nd.c0
            r0.<init>()
            r4.y(r0)
        L14:
            java.util.List r1 = r4.f13675m
            int r1 = r1.size()
            ud.a r2 = r3.B
            if (r2 != r4) goto L42
            qd.r r2 = r3.f13729w
            if (r2 == 0) goto L29
            int r2 = r2.f10922l
            if (r2 != r5) goto L29
        L26:
            int r1 = r1 + 1
            goto L42
        L29:
            java.util.List r3 = r3.S()
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r3.next()
            qd.r r2 = (qd.r) r2
            int r2 = r2.f10922l
            if (r2 != r5) goto L31
            goto L26
        L42:
            pd.q r3 = new pd.q
            r3.<init>(r1)
            qd.h r1 = qd.j.f10887u
            mh.b r2 = qd.l.f10901k
            qd.r r2 = new qd.r
            r2.<init>(r5, r1)
            r3.d0(r2)
            md.a r5 = md.a.f8836q
            r3.w(r5)
            md.a r5 = md.a.f8838s
            r3.w(r5)
            java.util.ArrayList r5 = r0.f9356g
            r5.add(r3)
            int r4 = r4.f13673k
            r3.f13716n = r4
            return r3
    }

    public static int m(ud.u r6, java.util.LinkedHashSet r7, java.util.HashSet r8, qd.j r9) {
            qd.e r0 = qd.j.f10877k
            boolean r0 = java.util.Objects.equals(r9, r0)
            r1 = 0
            if (r0 == 0) goto La
            goto L10
        La:
            boolean r0 = r7.add(r9)
            if (r0 != 0) goto L11
        L10:
            return r1
        L11:
            ud.e r0 = r6.g(r9)
            r2 = 1
            if (r0 == 0) goto L1c
            y(r0, r7, r8)
            return r2
        L1c:
            ed.c r0 = r6.f13760s
            ed.b r0 = r0.c(r9)
            if (r0 == 0) goto L3e
            qd.j[] r0 = r0.f2708c
            int r3 = r0.length
            r4 = r1
        L28:
            if (r1 >= r3) goto L34
            r5 = r0[r1]
            int r5 = m(r6, r7, r8, r5)
            int r4 = r4 + r5
            int r1 = r1 + 1
            goto L28
        L34:
            if (r4 != 0) goto L3d
            java.lang.String r6 = r9.l()
            r8.add(r6)
        L3d:
            return r2
        L3e:
            java.lang.String r6 = r9.l()
            r8.add(r6)
            return r2
    }

    public static nd.x n(ud.r r8, java.util.List r9, java.util.HashSet r10, boolean r11) {
            java.util.stream.Stream r0 = r9.stream()
            a7.b r1 = new a7.b
            r2 = 16
            r1.<init>(r2)
            boolean r0 = r0.anyMatch(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r9.size()
            r3 = 1
            int r2 = r2 + r3
            r1.<init>(r2)
            r1.add(r8)
            java.util.Iterator r8 = r9.iterator()
        L21:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r8.next()
            ud.m r2 = (ud.m) r2
            boolean r4 = r2 instanceof ud.r
            if (r4 == 0) goto L21
            ud.r r2 = (ud.r) r2
            r1.add(r2)
            goto L21
        L37:
            md.b r8 = md.b.f8863r
            if (r11 == 0) goto L86
            java.util.Iterator r2 = r1.iterator()
        L3f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L58
            java.lang.Object r4 = r2.next()
            ud.r r4 = (ud.r) r4
            md.f r4 = r4.f8877g
            oc.b r4 = r4.c(r8)
            nd.x r4 = (nd.x) r4
            if (r4 == 0) goto L3f
            java.util.SortedSet r2 = r4.f9403h
            goto L59
        L58:
            r2 = 0
        L59:
            if (r2 == 0) goto L5f
            r2.addAll(r1)
            goto L64
        L5f:
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>(r1)
        L64:
            java.util.Iterator r4 = r1.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r4.next()
            ud.r r5 = (ud.r) r5
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r8)
            nd.x r5 = (nd.x) r5
            if (r5 == 0) goto L68
            java.util.SortedSet r5 = r5.f9403h
            if (r2 == r5) goto L68
            r2.addAll(r5)
            goto L68
        L86:
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>(r1)
        L8b:
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
        L90:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Ld4
            java.lang.Object r5 = r1.next()
            ud.r r5 = (ud.r) r5
            if (r0 == 0) goto La3
            md.a r6 = md.a.f8843x
            r5.w(r6)
        La3:
            if (r4 != 0) goto La7
            r4 = r3
            goto L90
        La7:
            if (r11 == 0) goto Lb6
            md.f r6 = r5.f8877g
            oc.b r6 = r6.c(r8)
            nd.x r6 = (nd.x) r6
            if (r6 == 0) goto Lb6
            r6.f9403h = r2
            goto L90
        Lb6:
            nd.x r6 = new nd.x
            java.lang.String r7 = xe.s.f21577a
            if (r4 != 0) goto Lbe
            r7 = r9
            goto Lcb
        Lbe:
            int r7 = r9.size()
            if (r4 < r7) goto Lc7
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            goto Lcb
        Lc7:
            java.util.List r7 = r9.subList(r4, r7)
        Lcb:
            r6.<init>(r7, r2, r10)
            r5.y(r6)
            int r4 = r4 + 1
            goto L90
        Ld4:
            nd.x r8 = new nd.x
            r8.<init>(r9, r2, r10)
            return r8
    }

    public static boolean o(ud.r r4, qd.r r5, ud.p r6, ud.a r7) {
            qd.s r5 = r5.f10923m
            java.util.ArrayList r5 = r5.f10928j
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            qd.r r5 = (qd.r) r5
            ud.p r1 = r5.f10903j
            if (r1 == 0) goto L2a
            md.a r2 = md.a.f8838s
            md.f r3 = r1.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L1a
            goto L2a
        L1a:
            boolean r4 = xe.l.g(r4, r7, r6)
            if (r4 != 0) goto L21
            goto L2a
        L21:
            qd.l r4 = qd.l.a0(r6)
            r1.b0(r5, r4)
            r4 = 1
            return r4
        L2a:
            return r0
    }

    public static int p(qd.l r1, nd.d0 r2, int r3) {
            boolean r0 = r1 instanceof qd.r
            if (r0 == 0) goto Lf
            qd.r r1 = (qd.r) r1
            int r0 = r1.f10922l
            if (r3 != r0) goto Lf
            r1.y(r2)
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public static void q(pe.b r4, pd.q r5) {
            qd.r r0 = r5.f13714l
            int r1 = r0.f10922l
            qd.s[] r2 = r4.f10548c
            r2 = r2[r1]
            if (r2 != 0) goto Lb
            return
        Lb:
            ud.a r4 = r4.f10547b
            qd.j r0 = r0.f10902i
            qd.r r3 = new qd.r
            r3.<init>(r1, r0)
            r5.i0(r3, r4)
            r2.q(r3)
            r2.a(r5)
            return
    }

    public static nd.x r(ud.r r4, java.util.ArrayList r5, java.util.HashSet r6, nd.x r7) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto La
            if (r7 != 0) goto La
            r4 = 0
            return r4
        La:
            if (r7 != 0) goto L24
            java.util.stream.Stream r5 = r5.stream()
            java.util.stream.Stream r5 = r5.distinct()
            java.util.stream.Collector r7 = java.util.stream.Collectors.toList()
            java.lang.Object r5 = r5.collect(r7)
            java.util.List r5 = (java.util.List) r5
            r7 = 0
            nd.x r4 = n(r4, r5, r6, r7)
            return r4
        L24:
            java.util.List r0 = r7.f9402g
            boolean r1 = xe.s.h(r5)
            if (r1 == 0) goto L2e
            r5 = r0
            goto L4a
        L2e:
            boolean r1 = xe.s.h(r0)
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            int r3 = r0.size()
            int r3 = r3 + r2
            r1.<init>(r3)
            r1.addAll(r5)
            r1.addAll(r0)
            r5 = r1
        L4a:
            java.util.stream.Stream r5 = r5.stream()
            java.util.stream.Stream r5 = r5.distinct()
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r5 = r5.collect(r0)
            java.util.List r5 = (java.util.List) r5
            java.util.HashSet r7 = r7.f9404i
            boolean r0 = xe.s.h(r6)
            if (r0 == 0) goto L66
            r6 = r7
            goto L82
        L66:
            boolean r0 = xe.s.h(r7)
            if (r0 == 0) goto L6d
            goto L82
        L6d:
            java.util.HashSet r0 = new java.util.HashSet
            int r1 = r6.size()
            int r2 = r7.size()
            int r2 = r2 + r1
            r0.<init>(r2)
            r0.addAll(r6)
            r0.addAll(r7)
            r6 = r0
        L82:
            r7 = 1
            nd.x r4 = n(r4, r5, r6, r7)
            return r4
    }

    public static b.e t(ud.u r5, ud.p r6) {
            r0 = 0
            qd.l r1 = r6.S(r0)
            r2 = 1
            qd.l r6 = r6.S(r2)
            r1.getClass()
            boolean r2 = r1 instanceof qd.m
            if (r2 == 0) goto L71
            r6.getClass()
            boolean r2 = r6 instanceof qd.m
            if (r2 != 0) goto L19
            goto L71
        L19:
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            qd.m r1 = (qd.m) r1
            ud.p r1 = r1.f10904l
            pd.k r2 = r6.f13713k
            pd.k r3 = pd.k.O
            if (r2 != r3) goto L71
            pd.k r2 = r1.f13713k
            pd.k r3 = pd.k.M
            if (r2 == r3) goto L2e
            goto L71
        L2e:
            pd.n r6 = (pd.n) r6
            od.d r2 = r6.f10526p
            java.lang.String r3 = r2.f9781k
            java.lang.String r4 = "ordinal()I"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L3d
            goto L71
        L3d:
            od.a r2 = r2.f9780j
            ud.e r2 = r5.f(r2)
            if (r2 == 0) goto L71
            boolean r2 = r2.c0()
            if (r2 != 0) goto L4c
            goto L71
        L4c:
            pd.j r1 = (pd.j) r1
            java.lang.Object r1 = r1.f10495o
            boolean r2 = r1 instanceof od.c
            if (r2 != 0) goto L55
            goto L71
        L55:
            od.c r1 = (od.c) r1
            ud.g r5 = r5.h(r1)
            if (r5 == 0) goto L71
            b5.k r1 = r5.f13708m
            boolean r1 = r1.i()
            if (r1 != 0) goto L66
            goto L71
        L66:
            b.e r1 = new b.e
            qd.l r6 = r6.S(r0)
            r0 = 1
            r1.<init>(r6, r0, r5)
            return r1
        L71:
            r5 = 0
            return r5
    }

    public static boolean u(ud.r r2, qd.j r3, qd.j r4) {
            qd.j r0 = r4.h()
            boolean r1 = r0.t()
            if (r1 == 0) goto L3f
            qd.j r1 = r3.h()
            java.lang.String r1 = r1.l()
            java.lang.String r0 = r0.l()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Generic types in debug info not equals: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " != "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.L(r3)
        L3d:
            r2 = 1
            return r2
        L3f:
            boolean r2 = r0 instanceof qd.c
            return r2
    }

    public static void v(java.util.List r3, java.util.LinkedHashSet r4) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L34
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r0 = r3.next()
            pd.q r0 = (pd.q) r0
            qd.r r1 = r0.f13714l
            qd.s r1 = r1.f10923m
            boolean r2 = r4.add(r1)
            if (r2 == 0) goto L28
            java.util.List r1 = r1.g()
            v(r1, r4)
        L28:
            java.util.List r0 = r0.f13715m
            ae.g r1 = new ae.g
            r2 = 3
            r1.<init>(r4, r2)
            r0.forEach(r1)
            goto Lb
        L34:
            return
    }

    public static java.util.ArrayList w(ud.e r12, ud.r r13, pd.k r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            ud.a r2 = r13.B
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L11
            goto L4a
        L11:
            r1.add(r2)
            java.util.List r5 = r2.f13675m
            int r5 = r5.size()
            r6 = 0
            if (r5 <= r4) goto L1f
        L1d:
            r2 = r6
            goto L2d
        L1f:
            java.util.List r2 = r2.f13676n
            int r5 = r2.size()
            if (r5 != r4) goto L1d
            java.lang.Object r2 = r2.get(r3)
            ud.a r2 = (ud.a) r2
        L2d:
            if (r2 == 0) goto L4a
            r1.add(r2)
            java.util.List r5 = r2.f13675m
            int r5 = r5.size()
            if (r5 <= r4) goto L3b
            goto L1d
        L3b:
            java.util.List r2 = r2.f13676n
            int r5 = r2.size()
            if (r5 != r4) goto L1d
            java.lang.Object r2 = r2.get(r3)
            ud.a r2 = (ud.a) r2
            goto L2d
        L4a:
            java.util.List r13 = r13.f13732z
            java.util.Iterator r13 = r13.iterator()
            r2 = r4
        L51:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto La8
            java.lang.Object r5 = r13.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r6 = r5.f13674l
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L51
            java.lang.Object r7 = r6.next()
            ud.p r7 = (ud.p) r7
            pd.k r8 = r7.f13713k
            if (r8 != r14) goto L9e
            r8 = r7
            pd.j r8 = (pd.j) r8
            java.lang.Object r9 = r8.f10495o
            od.c r9 = (od.c) r9
            od.a r10 = r9.f9773g
            od.a r11 = r12.f13690m
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L9e
            ud.g r9 = r12.l0(r9)
            if (r9 == 0) goto L9e
            if (r2 == 0) goto L94
            boolean r7 = r1.contains(r5)
            if (r7 == 0) goto L94
            r7 = r4
            goto L95
        L94:
            r7 = r3
        L95:
            be.r r10 = new be.r
            r10.<init>(r9, r8, r7)
            r0.add(r10)
            goto L63
        L9e:
            if (r2 == 0) goto L63
            boolean r7 = r7.N()
            if (r7 != 0) goto L63
            r2 = r3
            goto L63
        La8:
            return r0
    }

    public static void y(ud.e r4, java.util.LinkedHashSet r5, java.util.HashSet r6) {
            ud.u r0 = r4.f13688k
            qd.j r1 = r4.f13693p
            if (r1 == 0) goto Lb
            int r1 = m(r0, r5, r6, r1)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.util.List r2 = r4.f13694q
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            qd.j r3 = (qd.j) r3
            int r3 = m(r0, r5, r6, r3)
            int r1 = r1 + r3
            goto L12
        L24:
            if (r1 != 0) goto L31
            qd.j r4 = r4.b0()
            java.lang.String r4 = r4.l()
            r6.add(r4)
        L31:
            return
    }

    public static boolean z(pd.s r4, qd.l r5, qd.l r6, java.util.function.IntFunction r7) {
            md.b r0 = md.b.K
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            nd.e0 r0 = (nd.e0) r0
            r1 = 0
            if (r0 != 0) goto Le
            goto L14
        Le:
            boolean r5 = r4.b0(r5, r6)
            if (r5 != 0) goto L15
        L14:
            return r1
        L15:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            pd.r r6 = r4.l0()
            int[] r6 = r6.f10532p
            int r6 = r6.length
        L21:
            if (r1 >= r6) goto L34
            java.lang.Object r2 = r4.k0(r1)
            java.lang.Object r3 = r7.apply(r1)
            r4.m0(r1, r3)
            r5.put(r2, r3)
            int r1 = r1 + 1
            goto L21
        L34:
            ud.n r4 = r0.f9361g
            xd.d r4 = (xd.d) r4
            java.util.ArrayList r4 = r4.f21544l
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r4.next()
            xd.c r6 = (xd.c) r6
            java.util.List r6 = r6.f21540a
            be.u r7 = new be.u
            r7.<init>(r5)
            r6.replaceAll(r7)
            goto L3e
        L55:
            r4 = 1
            return r4
    }

    @Override // be.a
    public java.lang.String e() {
            r1 = this;
            int r0 = r1.f772g
            switch(r0) {
                case 11: goto L16;
                case 12: goto L13;
                case 19: goto L10;
                case 20: goto Ld;
                case 23: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.e()
            return r0
        La:
            java.lang.String r0 = "FinishTypeInference"
            return r0
        Ld:
            java.lang.String r0 = "SourceFileRename"
            return r0
        L10:
            java.lang.String r0 = "DeobfuscatorVisitor"
            return r0
        L13:
            java.lang.String r0 = "PrepareForCodeGen"
            return r0
        L16:
            java.lang.String r0 = "OverrideMethodVisitor"
            return r0
    }

    @Override // be.a
    public void f(ud.u r15) {
            r14 = this;
            int r0 = r14.f772g
            r1 = 2
            switch(r0) {
                case 6: goto L162;
                case 17: goto L13d;
                case 19: goto L137;
                case 20: goto L7;
                default: goto L6;
            }
        L6:
            return
        L7:
            r0 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            bc.g r3 = r15.f13742a
            int r4 = r3.R
            r5 = 3
            if (r4 != r5) goto L15
            goto L136
        L15:
            int r3 = r3.f729x
            if (r3 > r0) goto L1b
            goto L136
        L1b:
            java.util.ArrayList r15 = r15.f13755n
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r7 = r15.iterator()
        L26:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3a
            java.lang.Object r8 = r7.next()
            ud.e r8 = (ud.e) r8
            od.a r8 = r8.f13690m
            java.lang.String r8 = r8.f9766h
            r6.put(r8, r2)
            goto L26
        L3a:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r15 = r15.iterator()
        L43:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto Lbc
            java.lang.Object r8 = r15.next()
            ud.e r8 = (ud.e) r8
            md.a r9 = md.a.f8843x
            md.f r10 = r8.f8877g
            boolean r9 = r10.a(r9)
            if (r9 == 0) goto L5a
            goto L43
        L5a:
            md.f r9 = r8.f8877g
            od.a r10 = r8.f13690m
            oc.c r11 = oc.c.f9757c
            oc.b r9 = r9.c(r11)
            pc.k r9 = (pc.k) r9
            r11 = 0
            if (r9 != 0) goto L6a
            goto La0
        L6a:
            boolean r12 = r10.o()
            if (r12 == 0) goto L71
            goto La0
        L71:
            java.lang.String r9 = r9.f10473g
            xe.q r12 = xe.q.f21574b
            java.lang.String r12 = ".java"
            boolean r12 = r9.endsWith(r12)
            r13 = 0
            if (r12 == 0) goto L83
            r12 = 5
            java.lang.String r9 = wb.en.f(r12, r13, r9)
        L83:
            java.lang.String r12 = ".kt"
            boolean r12 = r9.endsWith(r12)
            if (r12 == 0) goto L8f
            java.lang.String r9 = wb.en.f(r5, r13, r9)
        L8f:
            boolean r12 = kd.d.c(r9)
            if (r12 != 0) goto L96
            goto La0
        L96:
            java.lang.String r10 = r10.f9766h
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L9f
            goto La0
        L9f:
            r11 = r9
        La0:
            if (r11 == 0) goto L43
            ke.m r9 = new ke.m
            r9.<init>()
            java.lang.Object r9 = r6.merge(r11, r2, r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            if (r9 >= r3) goto L43
            ne.c r10 = new ne.c
            r10.<init>(r8, r11, r9)
            r7.add(r10)
            goto L43
        Lbc:
            java.util.Iterator r15 = r7.iterator()
        Lc0:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L136
            java.lang.Object r2 = r15.next()
            ne.c r2 = (ne.c) r2
            java.lang.String r5 = r2.f9411b
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 >= r3) goto Lc0
            ud.e r5 = r2.f9410a
            int r7 = r2.f9412c
            java.lang.String r2 = r2.f9411b
            if (r7 >= r1) goto Le3
            goto Lf2
        Le3:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
        Lf2:
            od.a r7 = r5.f13690m
            boolean r8 = r7.n()
            if (r8 == 0) goto L125
            java.lang.String r8 = r7.k()
            int r9 = t3.c.b(r4)
            if (r9 == 0) goto L11d
            if (r9 == r0) goto L118
            if (r9 != r1) goto L10a
            r9 = r8
            goto L11e
        L10a:
            java.lang.String r15 = bc.e.x(r4)
            java.lang.String r0 = "Unhandled strategy: "
            java.lang.String r15 = r0.concat(r15)
            ah.a.k(r15)
            goto L136
        L118:
            java.lang.String r9 = xe.a.a(r2, r8)
            goto L11e
        L11d:
            r9 = r2
        L11e:
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L125
            goto Lc0
        L125:
            r7.a(r2)
            nd.f0 r2 = new nd.f0
            r2.<init>(r5)
            java.lang.String r7 = "use source file name"
            r2.b(r7)
            r5.y(r2)
            goto Lc0
        L136:
            return
        L137:
            bc.g r15 = r15.f13742a
            r15.getClass()
            return
        L13d:
            bc.g r0 = r15.f13742a
            boolean r0 = r0.B
            if (r0 != 0) goto L144
            goto L161
        L144:
            java.lang.String r0 = "android.R"
            qd.j r0 = qd.j.x(r0)
            od.a r0 = od.a.e(r15, r0)
            ud.e r0 = r15.f(r0)
            if (r0 == 0) goto L155
            goto L161
        L155:
            j8.f r0 = r15.f13745d
            java.util.HashMap r2 = ye.a.f22424a
            be.f0 r3 = new be.f0
            r3.<init>(r15, r1, r0)
            r2.forEach(r3)
        L161:
            return
        L162:
            bc.g r0 = r15.f13742a
            int r0 = r0.U
            if (r0 != r1) goto L16b
            gd.c.a(r15)
        L16b:
            return
    }

    @Override // be.a
    public void g(ud.r r37) {
            r36 = this;
            r1 = r36
            r2 = r37
            int r0 = r1.f772g
            pd.k r3 = pd.k.S
            r6 = 10
            pd.k r7 = pd.k.Q
            r11 = 5
            md.a r13 = md.a.f8838s
            r14 = 34
            md.a r15 = md.a.f8840u
            r12 = 2
            r19 = 0
            r4 = 0
            switch(r0) {
                case 1: goto Lc47;
                case 2: goto L1a;
                case 3: goto Lc3e;
                case 4: goto L985;
                case 5: goto L1a;
                case 6: goto L930;
                case 7: goto L79e;
                case 8: goto L79a;
                case 9: goto L796;
                case 10: goto L78d;
                case 11: goto L1a;
                case 12: goto L4be;
                case 13: goto L382;
                case 14: goto L89;
                case 15: goto L57;
                case 16: goto L3b;
                case 17: goto L1a;
                case 18: goto L1a;
                case 19: goto L1a;
                case 20: goto L1a;
                case 21: goto L37;
                case 22: goto L33;
                case 23: goto L1b;
                default: goto L1a;
            }
        L1a:
            return
        L1b:
            boolean r0 = r2.f13722p
            if (r0 != 0) goto L32
            java.util.List r0 = r2.D
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L28
            goto L32
        L28:
            java.util.List r0 = r2.D
            ce.d r3 = new ce.d
            r3.<init>(r2, r11)
            r0.forEach(r3)
        L32:
            return
        L33:
            r36.a0(r37)
            return
        L37:
            Y(r2)
            return
        L3b:
            p4.t r0 = r2.T()     // Catch: java.lang.Exception -> L45 af.c -> L47
            if (r0 == 0) goto L56
            S(r2, r0)     // Catch: java.lang.Exception -> L45 af.c -> L47
            goto L56
        L45:
            r0 = move-exception
            goto L49
        L47:
            r0 = move-exception
            goto L4f
        L49:
            java.lang.String r3 = "Failed to parse debug info"
            r2.M(r3, r0)
            goto L56
        L4f:
            java.lang.String r0 = r0.getMessage()
            r2.L(r0)
        L56:
            return
        L57:
            boolean r0 = r2.f13722p
            if (r0 != 0) goto L88
            java.util.List r0 = r2.f13732z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L64
            goto L88
        L64:
            md.a r0 = md.a.f8817e0
            md.f r3 = r2.f8877g
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L88
            java.util.List r0 = r2.f13732z
            java.util.List r0 = xe.s.m(r0)
            r2.f13732z = r0
            java.util.List r0 = r2.F
            java.util.List r0 = xe.s.m(r0)
            r2.F = r0
            java.util.List r0 = r2.f13732z
            ud.d r2 = new ud.d
            r2.<init>(r12)
            r0.forEach(r2)
        L88:
            return
        L89:
            nd.c r0 = nd.c.f9354h
            boolean r0 = nd.d.b(r2, r0)
            if (r0 != 0) goto L93
            goto L381
        L93:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r4
        L99:
            java.util.List r6 = r2.f13732z
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        La0:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L35f
            java.lang.Object r11 = r6.next()
            ud.a r11 = (ud.a) r11
            java.util.ArrayList r13 = r11.f13674l
            int r14 = r13.size()
            r8 = r4
        Lb3:
            if (r8 >= r14) goto L332
            java.lang.Object r16 = r13.get(r8)
            r9 = r16
            ud.p r9 = (ud.p) r9
            pd.k r10 = r9.f13713k
            pd.k r12 = pd.k.I
            if (r10 != r12) goto L310
            md.f r10 = r9.f8877g
            boolean r10 = r10.a(r15)
            if (r10 != 0) goto L310
            pd.p r9 = (pd.p) r9
            ud.e r10 = r2.f13718l
            ud.u r12 = r10.f13688k
            qd.l r5 = r9.S(r4)
            java.lang.Object r5 = xe.m.e(r12, r5)
            boolean r12 = r5 instanceof qd.n
            if (r12 != 0) goto Lec
        Ldd:
            r29 = r3
            r17 = r6
            r18 = r7
        Le3:
            r25 = r8
            r27 = r14
            r28 = r15
        Le9:
            r3 = r0
            goto L30e
        Lec:
            qd.n r5 = (qd.n) r5
            long r4 = r5.f10905l
            int r4 = (int) r4
            if (r4 != 0) goto Lf4
            goto Ldd
        Lf4:
            qd.j r5 = r9.f10529o
            qd.j r12 = r5.g()
            int r5 = r5.f()
            r17 = r6
            r6 = 1
            if (r5 != r6) goto L10d
            r12.getClass()
            boolean r5 = r12 instanceof qd.g
            if (r5 == 0) goto L10d
            int r5 = r4 / 2
            goto L10e
        L10d:
            r5 = r4
        L10e:
            qd.r r6 = r9.f13714l
            r18 = r7
            qd.s r7 = r6.f10923m
            java.util.ArrayList r7 = r7.f10928j
            r20 = r7
            int r7 = r20.size()
            if (r7 >= r5) goto L121
        L11e:
            r29 = r3
            goto Le3
        L121:
            java.util.Iterator r7 = r20.iterator()
        L125:
            boolean r25 = r7.hasNext()
            if (r25 == 0) goto L11e
            java.lang.Object r25 = r7.next()
            r26 = r7
            r7 = r25
            qd.r r7 = (qd.r) r7
            ud.p r7 = r7.f10903j
            if (r7 == 0) goto L2fc
            pd.k r7 = r7.f13713k
            r25 = r8
            pd.k r8 = pd.k.H
            if (r7 != r8) goto L2f4
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.util.Iterator r20 = r20.iterator()
            r27 = r14
            r14 = r19
        L14e:
            boolean r26 = r20.hasNext()
            if (r26 == 0) goto L1c1
            java.lang.Object r26 = r20.next()
            r28 = r15
            r15 = r26
            qd.r r15 = (qd.r) r15
            ud.p r15 = r15.f10903j
            if (r15 == 0) goto L1ab
            pd.k r1 = r15.f13713k
            if (r1 != r8) goto L1ab
            r16 = r8
            r1 = 0
            qd.l r8 = r15.S(r1)
            boolean r8 = r6.h0(r8)
            if (r8 != 0) goto L177
            r29 = r3
        L175:
            r3 = r0
            goto L1b0
        L177:
            ud.u r8 = r10.f13688k
            r29 = r3
            r1 = 1
            qd.l r3 = r15.S(r1)
            java.lang.Object r1 = xe.m.e(r8, r3)
            boolean r3 = r1 instanceof qd.n
            if (r3 != 0) goto L18a
            goto Le9
        L18a:
            qd.n r1 = (qd.n) r1
            r3 = r0
            long r0 = r1.f10905l
            r30 = r0
            long r0 = (long) r4
            int r0 = (r30 > r0 ? 1 : (r30 == r0 ? 0 : -1))
            if (r0 < 0) goto L198
            goto L30e
        L198:
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L1a3
            goto L1c6
        L1a3:
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            r7.put(r0, r15)
            goto L1bd
        L1ab:
            r29 = r3
            r16 = r8
            goto L175
        L1b0:
            if (r14 != 0) goto L1bd
            r1 = r36
            r0 = r3
            r14 = r15
        L1b6:
            r8 = r16
            r15 = r28
            r3 = r29
            goto L14e
        L1bd:
            r1 = r36
            r0 = r3
            goto L1b6
        L1c1:
            r29 = r3
            r28 = r15
            r3 = r0
        L1c6:
            int r0 = r7.size()
            if (r0 >= r5) goto L1ce
            goto L30e
        L1ce:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = r7.values()
            r0.<init>(r1)
            int r1 = r0.size()
            int r5 = r13.size()
            if (r5 >= r1) goto L1e3
            goto L30e
        L1e3:
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r1.addAll(r13)
            boolean r1 = r1.containsAll(r0)
            if (r1 != 0) goto L1f7
            goto L30e
        L1f7:
            java.util.Iterator r0 = r0.iterator()
        L1fb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L217
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            r5 = 2
            qd.l r1 = r1.S(r5)
            r1.getClass()
            boolean r1 = xe.m.c(r1, r6)
            if (r1 == 0) goto L1fb
            goto L30e
        L217:
            pd.g r0 = new pd.g
            r0.<init>(r4, r12)
            qd.r r1 = r6.c0()
            r0.d0(r1)
            r0.B(r9)
            r0.H(r9)
            r0.V(r9)
            int r1 = r9.f13716n
            r0.f13716n = r1
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r5 = -1
        L23a:
            boolean r8 = r1.hasNext()
            r15 = 1
            if (r8 == 0) goto L2b8
            java.lang.Object r8 = r1.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r20 = r8.getKey()
            java.lang.Long r20 = (java.lang.Long) r20
            long r30 = r20.longValue()
            int r20 = (r30 > r5 ? 1 : (r30 == r5 ? 0 : -1))
            if (r20 == 0) goto L26d
            long r5 = r5 + r15
        L257:
            int r20 = (r5 > r30 ? 1 : (r5 == r30 ? 0 : -1))
            if (r20 >= 0) goto L26d
            r32 = r5
            r34 = r15
            r5 = 0
            qd.n r15 = qd.l.S(r5, r12)
            r0.I(r15)
            long r5 = r32 + r34
            r15 = r34
            goto L257
        L26d:
            java.lang.Object r5 = r8.getValue()
            ud.p r5 = (ud.p) r5
            r6 = 2
            qd.l r8 = r5.S(r6)
            r8.getClass()
            boolean r6 = r8 instanceof qd.n
            if (r6 == 0) goto L2a0
            r6 = r8
            qd.n r6 = (qd.n) r6
            ud.l r6 = r10.Y(r6)
            if (r6 == 0) goto L2a0
            pd.j r8 = new pd.j
            pd.k r15 = pd.k.M
            r16 = r1
            od.c r1 = r6.f()
            r20 = r3
            r3 = 0
            r8.<init>(r15, r1, r3)
            qd.m r3 = qd.l.Z(r8)
            be.d0.i(r6, r2)
            goto L2a8
        L2a0:
            r16 = r1
            r20 = r3
            qd.l r3 = r8.H()
        L2a8:
            r0.I(r3)
            r3 = r20
            r3.add(r5)
            xe.l.j(r2, r5)
            r1 = r16
            r5 = r30
            goto L23a
        L2b8:
            r34 = r15
        L2ba:
            long r5 = r5 + r34
            long r1 = (long) r4
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L2cb
            r1 = 0
            qd.n r8 = qd.l.S(r1, r12)
            r0.I(r8)
            goto L2ba
        L2cb:
            r3.add(r9)
            r2 = r37
            xe.l.j(r2, r9)
            java.lang.Object r1 = r7.lastKey()
            java.lang.Object r1 = r7.get(r1)
            ud.p r1 = (ud.p) r1
            r12 = 0
            int r1 = xe.k.a(r13, r1, r12)
            if (r14 == 0) goto L2ef
            int r4 = xe.k.a(r13, r14, r12)
            r5 = -1
            if (r4 == r5) goto L2ef
            int r1 = java.lang.Math.min(r4, r1)
        L2ef:
            r13.add(r1, r0)
            r0 = 1
            goto L31e
        L2f4:
            r29 = r3
            r27 = r14
            r28 = r15
            r3 = r0
            goto L2ff
        L2fc:
            r25 = r8
            goto L2f4
        L2ff:
            r1 = r36
            r0 = r3
            r8 = r25
            r7 = r26
            r14 = r27
            r15 = r28
            r3 = r29
            goto L125
        L30e:
            r0 = 0
            goto L31e
        L310:
            r29 = r3
            r17 = r6
            r18 = r7
            r25 = r8
            r27 = r14
            r28 = r15
            goto Le9
        L31e:
            r7 = r18 | r0
            int r0 = r25 + 1
            r1 = r36
            r8 = r0
            r0 = r3
            r6 = r17
            r14 = r27
            r15 = r28
            r3 = r29
            r4 = 0
            r12 = 2
            goto Lb3
        L332:
            r29 = r3
            r17 = r6
            r18 = r7
            r28 = r15
            r3 = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L342
            goto L350
        L342:
            java.util.ArrayList r0 = r11.f13674l
            java.util.Objects.requireNonNull(r0)
            xe.l.k(r2, r3)
            xe.l.e(r0, r3)
            r3.clear()
        L350:
            r1 = r36
            r0 = r3
            r6 = r17
            r7 = r18
            r15 = r28
            r3 = r29
            r4 = 0
            r12 = 2
            goto La0
        L35f:
            r29 = r3
            r28 = r15
            r3 = r0
            if (r7 == 0) goto L381
            Y(r2)
            int r12 = r29 + 1
            r0 = 100
            r4 = r29
            if (r4 <= r0) goto L377
            java.lang.String r0 = "Reached limit for ReplaceNewArray iterations"
            r2.L(r0)
            goto L381
        L377:
            r1 = r36
            r0 = r3
            r3 = r12
            r15 = r28
            r4 = 0
            r12 = 2
            goto L99
        L381:
            return
        L382:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L388
            goto L4bd
        L388:
            ud.p[] r0 = r2.f13731y
            r12 = 0
        L38b:
            int r1 = r0.length
            if (r12 >= r1) goto L4bd
            r1 = r0[r12]
            if (r1 != 0) goto L395
        L392:
            r5 = -1
            goto L4b9
        L395:
            pd.k r3 = r1.f13713k
            int r3 = r3.ordinal()
            if (r3 == r6) goto L4af
            r4 = 23
            if (r3 == r4) goto L478
            r4 = 25
            if (r3 == r4) goto L467
            if (r3 == r14) goto L455
            r4 = 41
            if (r3 == r4) goto L44a
            r4 = 45
            if (r3 == r4) goto L437
            r4 = 15
            if (r3 == r4) goto L422
            r4 = 16
            if (r3 == r4) goto L3b8
            goto L392
        L3b8:
            pd.s r1 = (pd.s) r1
            pd.r r3 = r1.f10536q
            if (r3 != 0) goto L408
            int r3 = E(r0, r12)
            int r4 = r1.f10534o
            int r5 = r0.length
            r9 = r4
        L3c6:
            if (r9 >= r5) goto L3d4
            r10 = r0[r9]
            if (r10 == 0) goto L3d1
            pd.k r11 = r10.f13713k
            if (r11 == r7) goto L3d1
            goto L3d6
        L3d1:
            int r9 = r9 + 1
            goto L3c6
        L3d4:
            r10 = r19
        L3d6:
            if (r10 == 0) goto L3f9
            pd.k r5 = r10.f13713k
            pd.k r9 = pd.k.f10515x
            if (r5 != r9) goto L3f9
            r4 = r10
            pd.r r4 = (pd.r) r4
            int r5 = r4.f10531o
            int[] r9 = r4.f10533q
            r11 = 0
        L3e6:
            if (r11 >= r5) goto L3f0
            r13 = r9[r11]
            int r13 = r13 + r12
            r9[r11] = r13
            int r11 = r11 + 1
            goto L3e6
        L3f0:
            r1.f10536q = r4
            r1.f10537r = r3
            int r3 = r10.f13716n
            r0[r3] = r19
            goto L408
        L3f9:
            java.lang.String r0 = xe.m.d(r4)
            java.lang.String r1 = "Payload for switch not found at "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            goto L4bd
        L408:
            int r3 = r1.f10537r
            r5 = -1
            if (r3 == r5) goto L410
            k(r2, r0, r12, r3)
        L410:
            pd.r r1 = r1.l0()
            int[] r1 = r1.f10533q
            int r3 = r1.length
            r4 = 0
        L418:
            if (r4 >= r3) goto L392
            r5 = r1[r4]
            k(r2, r0, r12, r5)
            int r4 = r4 + 1
            goto L418
        L422:
            int r3 = E(r0, r12)
            r5 = -1
            if (r3 == r5) goto L42c
            k(r2, r0, r12, r3)
        L42c:
            pd.i r1 = (pd.i) r1
            int r1 = r1.k0()
            k(r2, r0, r12, r1)
            goto L392
        L437:
            sd.a r1 = (sd.a) r1
            int r1 = r1.f12414o
            k(r2, r0, r12, r1)
            int r1 = E(r0, r12)
            r5 = -1
            if (r1 == r5) goto L4b9
            k(r2, r0, r12, r1)
            goto L4b9
        L44a:
            r5 = -1
            qd.r r3 = r1.f13714l
            if (r3 != 0) goto L4b9
            qd.e r3 = qd.j.f10879m
            O(r0, r12, r1, r3)
            goto L4b9
        L455:
            r5 = -1
            qd.r r3 = r1.f13714l
            if (r3 != 0) goto L4b9
            r3 = r1
            pd.b r3 = (pd.b) r3
            od.d r3 = r3.i0()
            qd.j r3 = r3.f9778h
            O(r0, r12, r1, r3)
            goto L4b9
        L467:
            r5 = -1
            r3 = r1
            pd.g r3 = (pd.g) r3
            qd.j r3 = r3.f10488o
            qd.g r4 = qd.j.f10868b
            qd.a r4 = new qd.a
            r4.<init>(r3)
            O(r0, r12, r1, r4)
            goto L4b9
        L478:
            r5 = -1
            pd.f r1 = (pd.f) r1
            int r3 = r1.f10486o
            int r4 = r0.length
            r9 = r3
        L47f:
            if (r9 >= r4) goto L48d
            r10 = r0[r9]
            if (r10 == 0) goto L48a
            pd.k r11 = r10.f13713k
            if (r11 == r7) goto L48a
            goto L48f
        L48a:
            int r9 = r9 + 1
            goto L47f
        L48d:
            r10 = r19
        L48f:
            if (r10 == 0) goto L4a1
            pd.k r4 = r10.f13713k
            pd.k r9 = pd.k.E
            if (r4 != r9) goto L4a1
            r3 = r10
            pd.e r3 = (pd.e) r3
            r1.f10487p = r3
            int r1 = r10.f13716n
            r0[r1] = r19
            goto L4b9
        L4a1:
            java.lang.String r0 = xe.m.d(r3)
            java.lang.String r1 = "Payload for fill-array not found at "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            goto L4bd
        L4af:
            r5 = -1
            pd.h r1 = (pd.h) r1
            int r1 = r1.k0()
            k(r2, r0, r12, r1)
        L4b9:
            int r12 = r12 + 1
            goto L38b
        L4bd:
            return
        L4be:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L4c6
        L4c2:
            r1 = r36
            goto L78c
        L4c6:
            java.util.List r0 = r2.f13732z
            java.util.Iterator r0 = r0.iterator()
        L4cc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63b
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            md.f r4 = r1.f8877g
            java.util.ArrayList r1 = r1.f13674l
            boolean r4 = r4.a(r13)
            if (r4 == 0) goto L4e3
            goto L4cc
        L4e3:
            java.util.Iterator r4 = r1.iterator()
        L4e7:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54e
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            pd.k r6 = r5.f13713k
            int r6 = r6.ordinal()
            r7 = 6
            if (r6 == r7) goto L520
            r7 = 12
            if (r6 == r7) goto L51c
            r7 = 36
            if (r6 == r7) goto L51c
            r7 = 38
            if (r6 == r7) goto L511
            r5 = 18
            if (r6 == r5) goto L51c
            r5 = 19
            if (r6 == r5) goto L51c
            goto L4e7
        L511:
            td.a r5 = (td.a) r5
            int r5 = r5.f13120p
            r6 = 4
            if (r5 != r6) goto L4e7
            r4.remove()
            goto L4e7
        L51c:
            r4.remove()
            goto L4e7
        L520:
            qd.r r6 = r5.f13714l
            qd.s r7 = r6.f10923m
            java.util.ArrayList r7 = r7.f10928j
            int r7 = r7.size()
            if (r7 != 0) goto L4e7
            r12 = 0
            qd.l r5 = r5.S(r12)
            java.lang.String r6 = r6.getName()
            if (r6 == 0) goto L547
            boolean r7 = r5 instanceof qd.o
            if (r7 != 0) goto L53c
            goto L547
        L53c:
            qd.o r5 = (qd.o) r5
            java.lang.String r5 = r5.getName()
            boolean r5 = r6.equals(r5)
            goto L548
        L547:
            r5 = 0
        L548:
            if (r5 == 0) goto L4e7
            r4.remove()
            goto L4e7
        L54e:
            r4 = 0
        L54f:
            int r5 = r1.size()
            if (r4 >= r5) goto L586
            java.lang.Object r5 = r1.get(r4)
            ud.p r5 = (ud.p) r5
            pd.k r6 = r5.f13713k
            pd.k r7 = pd.k.f10504m
            if (r6 != r7) goto L583
            r12 = 0
            qd.l r6 = r5.S(r12)
            r6.getClass()
            boolean r6 = r6 instanceof qd.m
            if (r6 == 0) goto L583
            qd.l r6 = r5.S(r12)
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            qd.r r7 = r5.f13714l
            r6.d0(r7)
            r6.B(r5)
            r6.H(r5)
            r1.set(r4, r6)
        L583:
            int r4 = r4 + 1
            goto L54f
        L586:
            java.util.Iterator r4 = r1.iterator()
        L58a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59a
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            V(r5)
            goto L58a
        L59a:
            java.util.Iterator r4 = r1.iterator()
        L59e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5ee
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            pd.k r6 = r5.f13713k
            pd.k r7 = pd.k.f10501j
            if (r6 != r7) goto L5eb
            md.f r6 = r5.f8877g
            md.a r7 = md.a.T
            boolean r6 = r6.a(r7)
            if (r6 != 0) goto L5eb
            md.a r6 = md.a.Q
            md.f r8 = r5.f8877g
            boolean r6 = r8.a(r6)
            if (r6 != 0) goto L5eb
            qd.r r6 = r5.f13714l
            r12 = 0
            qd.l r8 = r5.S(r12)
            boolean r9 = r6.equals(r8)
            if (r9 == 0) goto L5d3
            r6 = 1
            goto L5e2
        L5d3:
            r8.getClass()
            boolean r9 = r8 instanceof qd.r
            if (r9 == 0) goto L5e1
            qd.r r8 = (qd.r) r8
            boolean r6 = r6.g0(r8)
            goto L5e2
        L5e1:
            r6 = 0
        L5e2:
            if (r6 == 0) goto L5eb
            r6 = r19
            r5.f13714l = r6
            r5.w(r7)
        L5eb:
            r19 = 0
            goto L59e
        L5ee:
            java.util.Iterator r4 = r1.iterator()
        L5f2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L607
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            ae.e r6 = new ae.e
            r6.<init>(r11)
            r5.h0(r6)
            goto L5f2
        L607:
            java.util.Iterator r1 = r1.iterator()
        L60b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L637
            java.lang.Object r4 = r1.next()
            ud.p r4 = (ud.p) r4
            pd.k r5 = r4.f13713k
            int r5 = r5.ordinal()
            r6 = 22
            if (r5 == r6) goto L62e
            if (r5 == r14) goto L624
            goto L60b
        L624:
            pd.n r4 = (pd.n) r4
            qd.l r4 = r4.k0()
            Z(r2, r4)
            goto L60b
        L62e:
            r12 = 0
            qd.l r4 = r4.S(r12)
            Z(r2, r4)
            goto L60b
        L637:
            r19 = 0
            goto L4cc
        L63b:
            boolean r0 = r2.W()
            if (r0 != 0) goto L643
            goto L728
        L643:
            java.util.List r0 = r2.f13732z
            java.util.Iterator r0 = r0.iterator()
        L649:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67f
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.ArrayList r1 = r1.f13674l
            java.util.Iterator r1 = r1.iterator()
        L65b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L649
            java.lang.Object r4 = r1.next()
            ud.p r4 = (ud.p) r4
            pd.k r5 = r4.f13713k
            if (r5 != r3) goto L65b
            r6 = r4
            td.a r6 = (td.a) r6
            boolean r0 = r6.l0()
            if (r0 != 0) goto L680
            int r0 = r6.f13120p
            r1 = 3
            if (r0 != r1) goto L67b
            r0 = 1
            goto L67c
        L67b:
            r0 = 0
        L67c:
            if (r0 == 0) goto L67f
            goto L680
        L67f:
            r6 = 0
        L680:
            if (r6 == 0) goto L728
            md.f r0 = r6.f8877g
            boolean r0 = r0.a(r13)
            if (r0 == 0) goto L68c
            goto L728
        L68c:
            ud.a r0 = r2.B
            ud.a r0 = a.a.K(r0)
            java.util.ArrayList r0 = r0.f13674l
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L6a5
            r12 = 0
            java.lang.Object r0 = r0.get(r12)
            if (r0 != r6) goto L6a3
        L6a1:
            r0 = 1
            goto L6d9
        L6a3:
            r0 = r12
            goto L6d9
        L6a5:
            r12 = 0
            java.util.List r0 = r2.f13732z
            ud.a r0 = a.a.S(r2, r6, r0)
            if (r0 == 0) goto L77a
            java.util.ArrayList r1 = r0.f13674l
            java.lang.Object r1 = r1.get(r12)
            if (r1 == r6) goto L6b8
        L6b6:
            r0 = 0
            goto L6d9
        L6b8:
            ud.a r1 = r2.B
            java.util.HashSet r1 = a.a.P(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L6c2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6a1
            java.lang.Object r3 = r1.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r4 = r3.f13674l
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L6c2
            if (r3 == r0) goto L6c2
            goto L6b6
        L6d9:
            xd.b r1 = r2.G
            md.b r3 = md.b.f8868w
            md.f r1 = r1.f8877g
            oc.b r1 = r1.c(r3)
            nd.e r1 = (nd.e) r1
            if (r0 == 0) goto L6ea
            if (r1 != 0) goto L6ea
            goto L728
        L6ea:
            int r1 = r6.f13120p
            r3 = 1
            if (r1 == r3) goto L704
            r5 = 2
            if (r1 == r5) goto L701
            r3 = 3
            if (r1 == r3) goto L6fe
            r3 = 4
            if (r1 != r3) goto L6fb
            java.lang.String r1 = "SELF"
            goto L706
        L6fb:
            r19 = 0
            throw r19
        L6fe:
            java.lang.String r1 = "THIS"
            goto L706
        L701:
            java.lang.String r1 = "SUPER"
            goto L706
        L704:
            java.lang.String r1 = "CONSTRUCTOR"
        L706:
            java.lang.String r1 = r1.toLowerCase()
            java.util.List r3 = r2.f13732z
            ud.a r3 = a.a.S(r2, r6, r3)
            if (r3 != 0) goto L72b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to move "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " instruction to top"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.K(r0)
        L728:
            r1 = r36
            goto L789
        L72b:
            if (r0 != 0) goto L769
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.U(r0)
            qd.r r4 = r2.f13729w
            r0.remove(r4)
            java.util.List r4 = r2.S()
            be.z r5 = new be.z
            r7 = 1
            r5.<init>(r0, r7)
            r4.forEach(r5)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L753
            java.lang.String r0 = "Illegal instructions before constructor call"
            r2.L(r0)
            goto L728
        L753:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "'"
            r0.<init>(r4)
            r0.append(r1)
            java.lang.String r1 = "' call moved to the top of the method (can break code semantics)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.L(r0)
        L769:
            xe.k.b(r3, r6)
            xd.b r0 = r2.G
            java.util.ArrayList r0 = r0.f21539k
            ud.o r1 = new ud.o
            r1.<init>(r6)
            r12 = 0
            r0.add(r12, r1)
            goto L728
        L77a:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Insn not found in method: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            goto L4c2
        L789:
            r1.x(r2, r2)
        L78c:
            return
        L78d:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L792
            goto L795
        L792:
            P(r2)
        L795:
            return
        L796:
            Q(r2)
            return
        L79a:
            I(r2)
            return
        L79e:
            r28 = r15
            boolean r0 = r2.f13722p
            ud.e r3 = r2.f13718l
            if (r0 == 0) goto L7a8
            goto L92f
        L7a8:
            java.util.List r0 = r2.f13732z
            java.util.Iterator r0 = r0.iterator()
            r4 = 0
        L7af:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L92a
            java.lang.Object r5 = r0.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r5 = r5.f13674l
            java.util.Iterator r5 = r5.iterator()
        L7c1:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L926
            java.lang.Object r6 = r5.next()
            ud.p r6 = (ud.p) r6
            pd.k r7 = r6.f13713k
            pd.k r8 = pd.k.f10514w
            if (r7 != r8) goto L919
            md.f r7 = r6.f8877g
            r8 = r28
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L916
            pd.s r6 = (pd.s) r6
            r12 = 0
            qd.l r7 = r6.S(r12)
            r7.getClass()
            boolean r9 = r7 instanceof qd.m
            if (r9 != 0) goto L7f0
        L7eb:
            r18 = r0
        L7ed:
            r12 = 0
            goto L914
        L7f0:
            r9 = r7
            qd.m r9 = (qd.m) r9
            ud.p r9 = r9.f10904l
            pd.k r10 = r9.f13713k
            int r10 = r10.ordinal()
            r11 = 26
            if (r10 == r11) goto L881
            if (r10 == r14) goto L802
            goto L7eb
        L802:
            pd.n r9 = (pd.n) r9
            od.d r10 = r9.f10526p
            java.lang.String r10 = r10.f9781k
            java.lang.String r11 = "ordinal()I"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L811
            goto L82f
        L811:
            r12 = 0
            qd.l r9 = r9.S(r12)
            ud.u r10 = r3.f13688k
            qd.j r11 = r9.I()
            ud.e r10 = r10.g(r11)
            if (r10 != 0) goto L823
            goto L82f
        L823:
            md.b r11 = md.b.f8850e
            md.f r10 = r10.f8877g
            oc.b r10 = r10.c(r11)
            nd.h r10 = (nd.h) r10
            if (r10 != 0) goto L830
        L82f:
            goto L7eb
        L830:
            java.util.List r10 = r10.f9370g
            pd.r r11 = r6.l0()
            int[] r11 = r11.f10532p
            int r11 = r11.length
            int r15 = r10.size()
            if (r15 >= r11) goto L844
            r18 = r0
        L841:
            r15 = r19
            goto L86c
        L844:
            ud.g[] r15 = new ud.g[r11]
            r12 = 0
        L847:
            if (r12 >= r11) goto L86a
            java.lang.Object r14 = r6.k0(r12)
            r18 = r0
            boolean r0 = r14 instanceof java.lang.Integer
            if (r0 == 0) goto L841
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r0 = r14.intValue()
            java.lang.Object r14 = r10.get(r0)     // Catch: java.lang.Exception -> L841
            nd.g r14 = (nd.g) r14     // Catch: java.lang.Exception -> L841
            ud.g r14 = r14.f9366a     // Catch: java.lang.Exception -> L841
            r15[r0] = r14     // Catch: java.lang.Exception -> L841
            int r12 = r12 + 1
            r0 = r18
            r14 = 34
            goto L847
        L86a:
            r18 = r0
        L86c:
            if (r15 != 0) goto L871
            r16 = 0
            goto L87d
        L871:
            be.s r0 = new be.s
            r12 = 0
            r0.<init>(r12, r15)
            boolean r0 = z(r6, r7, r9, r0)
            r16 = r0
        L87d:
            r12 = r16
            goto L914
        L881:
            r18 = r0
            ud.u r0 = r3.f13688k
            b.e r0 = t(r0, r9)
            if (r0 != 0) goto L88d
            goto L7ed
        L88d:
            java.lang.Object r9 = r0.f333i
            ud.g r9 = (ud.g) r9
            ud.e r10 = r9.f13706k
            java.lang.Object r0 = r0.f332h
            qd.l r0 = (qd.l) r0
            md.b r11 = md.b.f8851f
            md.f r14 = r10.f8877g
            oc.b r11 = r14.c(r11)
            nd.j r11 = (nd.j) r11
            if (r11 != 0) goto L8a6
        L8a3:
            r11 = r19
            goto L8b1
        L8a6:
            java.util.HashMap r11 = r11.f9377g
            if (r11 != 0) goto L8ab
            goto L8a3
        L8ab:
            java.lang.Object r11 = r11.get(r9)
            nd.i r11 = (nd.i) r11
        L8b1:
            if (r11 != 0) goto L8b5
            goto L7ed
        L8b5:
            pd.r r14 = r6.l0()
            int[] r14 = r14.f10532p
            int r14 = r14.length
            r15 = 0
        L8bd:
            if (r15 >= r14) goto L8d2
            java.lang.Object r12 = r6.k0(r15)
            java.util.HashMap r1 = r11.f9375a
            java.lang.Object r1 = r1.get(r12)
            if (r1 != 0) goto L8cd
            goto L7ed
        L8cd:
            int r15 = r15 + 1
            r1 = r36
            goto L8bd
        L8d2:
            be.t r1 = new be.t
            r1.<init>(r11, r6)
            boolean r0 = z(r6, r7, r0, r1)
            if (r0 == 0) goto L7ed
            r9.w(r13)
            java.util.List r0 = r10.f13698u
            java.util.Iterator r0 = r0.iterator()
        L8e6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L910
            java.lang.Object r1 = r0.next()
            ud.g r1 = (ud.g) r1
            b5.k r6 = r1.f13708m
            boolean r7 = r6.i()
            if (r7 == 0) goto L8e6
            boolean r7 = r6.h()
            if (r7 == 0) goto L8e6
            boolean r6 = r6.c()
            if (r6 == 0) goto L8e6
            md.f r1 = r1.f8877g
            boolean r1 = r1.a(r13)
            if (r1 != 0) goto L8e6
        L90e:
            r12 = 1
            goto L914
        L910:
            r10.w(r13)
            goto L90e
        L914:
            r4 = r4 | r12
            goto L91c
        L916:
            r18 = r0
            goto L91c
        L919:
            r8 = r28
            goto L916
        L91c:
            r1 = r36
            r28 = r8
            r0 = r18
            r14 = 34
            goto L7c1
        L926:
            r1 = r36
            goto L7af
        L92a:
            if (r4 == 0) goto L92f
            Y(r2)
        L92f:
            return
        L930:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L935
            goto L984
        L935:
            ud.p[] r0 = r2.f13731y
            int r1 = r0.length
            r4 = 0
        L939:
            if (r4 >= r1) goto L984
            r2 = r0[r4]
            if (r2 != 0) goto L945
        L93f:
            r7 = 2
            r8 = 4
            r9 = 6
            r10 = 45
            goto L981
        L945:
            md.f r3 = r2.f8877g
            md.b r5 = md.b.F
            oc.b r3 = r3.c(r5)
            ae.b r3 = (ae.b) r3
            if (r3 == 0) goto L93f
            pd.k r3 = r2.f13713k
            int r3 = r3.ordinal()
            if (r3 == 0) goto L97c
            r7 = 1
            if (r3 == r7) goto L97c
            r7 = 2
            if (r3 == r7) goto L979
            r8 = 3
            if (r3 == r8) goto L979
            r8 = 4
            r9 = 6
            if (r3 == r8) goto L976
            r10 = 45
            if (r3 == r9) goto L97e
            if (r3 == r10) goto L97e
            r11 = 9
            if (r3 == r11) goto L97e
            if (r3 == r6) goto L97e
            switch(r3) {
                case 12: goto L97e;
                case 13: goto L97e;
                case 14: goto L97e;
                case 15: goto L97e;
                default: goto L975;
            }
        L975:
            goto L981
        L976:
            r10 = 45
            goto L97e
        L979:
            r8 = 4
            r9 = 6
            goto L976
        L97c:
            r7 = 2
            goto L979
        L97e:
            r2.E(r5)
        L981:
            int r4 = r4 + 1
            goto L939
        L984:
            return
        L985:
            r8 = r15
            boolean r0 = r2.f13722p
            if (r0 == 0) goto L98c
            goto Lc3d
        L98c:
            xe.l r0 = new xe.l
            r12 = 0
            r0.<init>(r2, r12)
            java.util.List r1 = r2.f13732z
            ud.e r4 = r2.f13718l
            java.util.Iterator r1 = r1.iterator()
            r16 = 0
        L99c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lc38
            java.lang.Object r5 = r1.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r6 = r5.f13674l
            r0.f21568a = r6
            int r7 = r6.size()
            r9 = 0
        L9b1:
            if (r9 >= r7) goto Lc2b
            java.lang.Object r10 = r6.get(r9)
            ud.p r10 = (ud.p) r10
            pd.k r10 = r10.f13713k
            pd.k r11 = pd.k.O
            if (r10 != r11) goto Lc11
            java.lang.Object r10 = r6.get(r9)
            pd.n r10 = (pd.n) r10
            od.d r11 = r10.f10526p
            boolean r13 = r11.f()
            if (r13 != 0) goto L9dc
            r18 = r1
        L9cf:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
            r12 = 0
            r22 = 0
            goto Lc0e
        L9dc:
            qd.l r13 = r10.k0()
            if (r13 == 0) goto L9ff
            boolean r14 = r13 instanceof qd.r
            if (r14 != 0) goto L9e7
            goto L9ff
        L9e7:
            qd.r r13 = (qd.r) r13
            qd.s r13 = r13.f10923m
            qd.r r13 = r13.f10927i
            ud.p r13 = r13.f10903j
            if (r13 == 0) goto L9ff
            pd.k r14 = r13.f13713k
            pd.k r15 = pd.k.J
            if (r14 == r15) goto L9f8
            goto L9ff
        L9f8:
            pd.j r13 = (pd.j) r13
            java.lang.Object r13 = r13.f10495o
            qd.j r13 = (qd.j) r13
            goto La01
        L9ff:
            r13 = r19
        La01:
            if (r13 == 0) goto La1f
            od.a r14 = r11.f9780j
            qd.j r14 = r14.f9765g
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto La1f
            ud.u r14 = r4.f13688k
            od.a r13 = od.a.e(r14, r13)
            ud.u r14 = r4.f13688k
            java.lang.String r15 = r11.f9777g
            java.util.List r12 = r11.f9779i
            qd.j r11 = r11.f9778h
            od.d r11 = od.d.b(r14, r13, r15, r12, r11)
        La1f:
            td.a r12 = new td.a
            r12.<init>(r2, r10, r11)
            boolean r11 = r12.l0()
            java.util.List r13 = r12.f13715m
            if (r11 == 0) goto La3b
            int r11 = r13.size()
            if (r11 == 0) goto La38
            boolean r11 = r4.c0()
            if (r11 == 0) goto La3b
        La38:
            r18 = r1
            goto La6f
        La3b:
            int r11 = r12.f13120p
            od.d r14 = r12.f13119o
            r15 = 3
            if (r11 != r15) goto La55
            int r17 = r13.size()
            if (r17 != 0) goto La55
            java.lang.String r15 = r14.f9781k
            ud.r r15 = r4.m0(r15)
            if (r15 == 0) goto La38
            boolean r15 = r15.f13722p
            if (r15 == 0) goto La55
            goto La38
        La55:
            md.b r15 = md.b.f8853h
            r18 = r1
            md.f r1 = r4.f8877g
            boolean r1 = r1.b(r15)
            ud.u r15 = r4.f13688k
            if (r1 == 0) goto La74
            boolean r1 = r2.X()
            if (r1 == 0) goto La74
            boolean r1 = r12.l0()
            if (r1 == 0) goto La74
        La6f:
            r0.a(r10)
            goto L9cf
        La74:
            r12.V(r10)
            r1 = 0
            qd.l r10 = r10.S(r1)
            qd.r r10 = (qd.r) r10
            qd.s r1 = r10.f10923m
            r1.k(r10)
            r1 = 1
            if (r11 != r1) goto Lb64
            ud.p r1 = r10.f0()
            if (r1 == 0) goto Lb54
            r20 = r4
            pd.k r4 = r1.f13713k
            if (r4 != r3) goto Lb3a
            td.a r1 = (td.a) r1
            java.util.List r4 = r2.f13732z
            ud.a r4 = a.a.S(r2, r1, r4)
            if (r4 == 0) goto Lb2b
            r21 = r3
            ud.a r3 = a.a.h0(r2, r5, r4)
            if (r3 != 0) goto Lae8
            qd.r r1 = r10.e0(r2)
            r3 = 1
            java.util.ArrayList r4 = a.a.y(r2, r5, r3)
            qd.s r3 = r10.f10923m
            java.util.ArrayList r3 = r3.f10928j
            java.util.Iterator r3 = r3.iterator()
        Lab5:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto Lade
            java.lang.Object r10 = r3.next()
            qd.r r10 = (qd.r) r10
            r24 = r1
            ud.p r1 = r10.f10903j
            if (r1 == 0) goto Lad7
            ud.a r25 = a.a.S(r2, r1, r4)
            if (r25 == 0) goto Lad7
            r25 = r3
            qd.r r3 = r24.c0()
            r1.b0(r10, r3)
            goto Lad9
        Lad7:
            r25 = r3
        Lad9:
            r1 = r24
            r3 = r25
            goto Lab5
        Lade:
            r24 = r1
            r27 = r7
            r10 = r24
            r24 = r6
            goto Lb5c
        Lae8:
            qd.r r10 = r10.e0(r2)
            r24 = r6
            qd.r r6 = r1.f13714l
            qd.r r25 = r6.e0(r2)
            r27 = r7
            int r7 = r6.f10922l
            pd.q r7 = l(r2, r3, r7)
            qd.r r6 = r6.c0()
            r7.d0(r6)
            qd.r r6 = r10.c0()
            r28 = r10
            ud.a r10 = a.a.i0(r2, r3, r5)
            r7.i0(r6, r10)
            qd.r r6 = r25.c0()
            ud.a r3 = a.a.i0(r2, r3, r4)
            r7.i0(r6, r3)
            r7.Z()
            qd.r r3 = r25.c0()
            r1.d0(r3)
            r1.Z()
            r10 = r28
            goto Lb5c
        Lb2b:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Block not found by insn: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            goto Lc3d
        Lb3a:
            r21 = r3
            r24 = r6
            r27 = r7
            ud.p r1 = U(r2, r1, r0)
            if (r1 == 0) goto Lb5c
            r12.V(r1)
            r1.w(r8)
            java.lang.Object r3 = r0.f21570c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r1)
            goto Lb5c
        Lb54:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
        Lb5c:
            qd.r r1 = r10.c0()
            r12.d0(r1)
            goto Lb6c
        Lb64:
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
        Lb6c:
            r12.Z()
            ud.r r1 = r15.i(r14)
            if (r1 == 0) goto Lbfe
            b5.k r3 = r1.f13719m
            boolean r3 = r3.i()
            if (r3 == 0) goto Lbfe
            java.util.Iterator r3 = r13.iterator()
        Lb81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb9f
            java.lang.Object r4 = r3.next()
            qd.l r4 = (qd.l) r4
            r4.getClass()
            boolean r6 = r4 instanceof qd.n
            if (r6 == 0) goto Lbfe
            qd.n r4 = (qd.n) r4
            long r6 = r4.f10905l
            r22 = 0
            int r4 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r4 == 0) goto Lb81
            goto Lbab
        Lb9f:
            r22 = 0
            ud.e r3 = r1.f13718l
            od.a r3 = r3.f13690m
            ud.e r3 = r15.f(r3)
            if (r3 != 0) goto Lbae
        Lbab:
            r6 = r19
            goto Lc01
        Lbae:
            qd.r r4 = r12.f13714l
            if (r4 != 0) goto Lbb3
            goto Lbab
        Lbb3:
            boolean r6 = r4.N()
            if (r6 == 0) goto Lbc0
            qd.j r4 = r4.f10902i
            java.lang.String r4 = fd.j.b(r4)
            goto Lbc2
        Lbc0:
            java.lang.String r4 = ""
        Lbc2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "<init>("
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ")V"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            ud.r r3 = r3.m0(r4)
            if (r3 == 0) goto Lbab
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto Lbab
            b5.k r1 = r3.f13719m
            boolean r1 = r1.i()
            if (r1 == 0) goto Lbea
            goto Lbab
        Lbea:
            td.a r6 = new td.a
            od.d r1 = r3.f13717k
            r6.<init>(r1, r11)
            qd.r r1 = r12.f13714l
            qd.r r1 = r1.c0()
            r6.d0(r1)
            r6.V(r12)
            goto Lc01
        Lbfe:
            r22 = 0
            goto Lbab
        Lc01:
            if (r6 == 0) goto Lc0a
            r0.a(r12)
            a.a.J0(r2, r5, r9, r6)
            goto Lc0d
        Lc0a:
            a.a.J0(r2, r5, r9, r12)
        Lc0d:
            r12 = 1
        Lc0e:
            r16 = r16 | r12
            goto Lc1d
        Lc11:
            r18 = r1
            r21 = r3
            r20 = r4
            r24 = r6
            r27 = r7
            r22 = 0
        Lc1d:
            int r9 = r9 + 1
            r1 = r18
            r4 = r20
            r3 = r21
            r6 = r24
            r7 = r27
            goto L9b1
        Lc2b:
            r18 = r1
            r21 = r3
            r20 = r4
            r22 = 0
            r0.c()
            goto L99c
        Lc38:
            if (r16 == 0) goto Lc3d
            P(r2)
        Lc3d:
            return
        Lc3e:
            boolean r0 = r2.f13722p
            if (r0 == 0) goto Lc43
            goto Lc46
        Lc43:
            R(r2)
        Lc46:
            return
        Lc47:
            od.d r0 = r2.f13717k
            java.util.List r0 = r0.f9779i
            int r0 = r0.size()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 <= r1) goto Lc83
            java.util.List r0 = r2.H
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lc5c
            goto Lc7d
        Lc5c:
            ud.p[] r0 = r2.f13731y
            int r1 = r0.length
            if (r1 != 0) goto Lc62
            goto Lc7d
        Lc62:
            int r1 = r0.length
            r3 = 0
        Lc64:
            if (r3 >= r1) goto Lc7d
            r4 = r0[r3]
            if (r4 == 0) goto Lc7a
            pd.k r5 = r4.f13713k
            if (r5 == r7) goto Lc7a
            pd.k r6 = pd.k.f10507p
            if (r5 != r6) goto Lc83
            java.util.List r4 = r4.f13715m
            int r4 = r4.size()
            if (r4 != 0) goto Lc83
        Lc7a:
            int r3 = r3 + 1
            goto Lc64
        Lc7d:
            r2.w(r13)
            r1 = 1
            r2.f13722p = r1
        Lc83:
            ud.p[] r0 = r2.f13731y
            java.lang.String r1 = xe.s.f21577a
            if (r0 == 0) goto Lcf4
            int r0 = r0.length
            if (r0 != 0) goto Lc8d
            goto Lcf4
        Lc8d:
            int r0 = r2.f13723q
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ud.p[] r2 = r2.f13731y
            int r3 = r2.length
            r4 = 0
        Lc98:
            if (r4 >= r3) goto Lcf4
            r5 = r2[r4]
            if (r5 != 0) goto Lc9f
            goto Lcf1
        Lc9f:
            r1.clear()
            qd.r r6 = r5.f13714l
            if (r6 == 0) goto Lca9
            r1.add(r6)
        Lca9:
            r5.U(r1)
            java.util.Iterator r6 = r1.iterator()
        Lcb0:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lcf1
            java.lang.Object r7 = r6.next()
            qd.r r7 = (qd.r) r7
            int r7 = r7.f10922l
            if (r7 < 0) goto Lce3
            if (r7 >= r0) goto Lcc3
            goto Lcb0
        Lcc3:
            af.g r1 = new af.g
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect register number in instruction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", expected to be less than "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        Lce3:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Incorrect negative register number in instruction: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            goto Lcf4
        Lcf1:
            int r4 = r4 + 1
            goto Lc98
        Lcf4:
            return
    }

    @Override // be.a
    public boolean h(ud.e r26) {
            r25 = this;
            r1 = r25
            r2 = r26
            int r0 = r1.f772g
            md.b r3 = md.b.f8853h
            md.a r4 = md.a.f8838s
            pd.k r5 = pd.k.L
            java.lang.String r6 = "<clinit>()V"
            oc.c r7 = oc.c.f9760f
            r8 = 2
            r10 = 1
            r11 = 0
            switch(r0) {
                case 0: goto L96a;
                case 2: goto L7bf;
                case 5: goto L5ea;
                case 7: goto L527;
                case 11: goto Lf3;
                case 12: goto La9;
                case 18: goto L1b;
                default: goto L16;
            }
        L16:
            boolean r0 = super.h(r26)
            return r0
        L1b:
            ud.u r0 = r2.f13688k
            bc.g r3 = r0.f13742a
            boolean r3 = r3.B
            if (r3 != 0) goto L25
            goto La8
        L25:
            java.util.List r3 = r2.f13698u
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2f
            goto La8
        L2f:
            j8.f r3 = r0.f13745d
            java.util.List r0 = r2.f13698u
            java.util.Iterator r4 = r0.iterator()
        L37:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r4.next()
            r5 = r0
            ud.g r5 = (ud.g) r5
            b5.k r0 = r5.f13708m     // Catch: java.lang.Exception -> L99
            boolean r6 = r0.h()     // Catch: java.lang.Exception -> L99
            if (r6 == 0) goto L6a
            boolean r0 = r0.c()     // Catch: java.lang.Exception -> L99
            if (r0 != 0) goto L53
            goto L6a
        L53:
            md.f r0 = r5.f8877g     // Catch: java.lang.Exception -> L99
            oc.b r0 = r0.c(r7)     // Catch: java.lang.Exception -> L99
            nc.a r0 = (nc.a) r0     // Catch: java.lang.Exception -> L99
            if (r0 == 0) goto L6a
            nc.a r6 = nc.a.f9340i     // Catch: java.lang.Exception -> L99
            if (r0 != r6) goto L62
            goto L6a
        L62:
            java.util.List r6 = r5.f13710o     // Catch: java.lang.Exception -> L99
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L99
            if (r6 != 0) goto L6c
        L6a:
            r0 = 0
            goto L6e
        L6c:
            java.lang.Object r0 = r0.f9342h     // Catch: java.lang.Exception -> L99
        L6e:
            if (r0 == 0) goto L37
            b5.k r6 = r5.f13708m     // Catch: java.lang.Exception -> L99
            boolean r6 = r6.g()     // Catch: java.lang.Exception -> L99
            if (r6 == 0) goto L80
            java.lang.Object r6 = r3.f6781b     // Catch: java.lang.Exception -> L99
            od.b r6 = (od.b) r6     // Catch: java.lang.Exception -> L99
            r6.a(r0, r5)     // Catch: java.lang.Exception -> L99
            goto L37
        L80:
            r3.getClass()     // Catch: java.lang.Exception -> L99
            ud.e r6 = r5.f13706k     // Catch: java.lang.Exception -> L99
            java.lang.Object r8 = r3.f6782c     // Catch: java.lang.Exception -> L99
            java.util.HashMap r8 = (java.util.HashMap) r8     // Catch: java.lang.Exception -> L99
            me.a r11 = new me.a     // Catch: java.lang.Exception -> L99
            r12 = 5
            r11.<init>(r12)     // Catch: java.lang.Exception -> L99
            java.lang.Object r6 = r8.computeIfAbsent(r6, r11)     // Catch: java.lang.Exception -> L99
            od.b r6 = (od.b) r6     // Catch: java.lang.Exception -> L99
            r6.a(r0, r5)     // Catch: java.lang.Exception -> L99
            goto L37
        L99:
            r0 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Failed to process value of field: "
            java.lang.String r5 = r6.concat(r5)
            r2.M(r5, r0)
            goto L37
        La8:
            return r10
        La9:
            ud.u r0 = r2.f13688k
            bc.g r0 = r0.f13742a
            boolean r0 = r0.f722q
            if (r0 == 0) goto Lb4
            X(r2)
        Lb4:
            java.util.List r0 = r2.f13697t
            java.util.Iterator r0 = r0.iterator()
        Lba:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lce
            java.lang.Object r3 = r0.next()
            ud.r r3 = (ud.r) r3
            boolean r4 = r3.X()
            if (r4 == 0) goto Lba
            r9 = r3
            goto Lcf
        Lce:
            r9 = 0
        Lcf:
            if (r9 != 0) goto Le2
            java.util.List r0 = r2.f13697t
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le2
            java.util.List r0 = r2.f13697t
            java.lang.Object r0 = r0.get(r11)
            r9 = r0
            ud.r r9 = (ud.r) r9
        Le2:
            if (r9 != 0) goto Le5
            goto Lf2
        Le5:
            r1.x(r9, r2)
            java.util.List r0 = r2.f13698u
            be.e0 r2 = new be.e0
            r2.<init>(r1, r9, r11)
            r0.forEach(r2)
        Lf2:
            return r10
        Lf3:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            y(r2, r0, r3)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L108
            r4 = 0
            goto L118
        L108:
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L518
            b.e r4 = new b.e
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            r4.<init>(r5, r8, r3)
        L118:
            if (r4 == 0) goto L516
            java.lang.Object r0 = r4.f333i
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r3 = r4.f332h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r2 = r2.f13697t
            java.util.Iterator r2 = r2.iterator()
        L128:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L516
            java.lang.Object r4 = r2.next()
            ud.r r4 = (ud.r) r4
            boolean r5 = r4.W()
            od.d r6 = r4.f13717k
            ud.e r7 = r4.f13718l
            if (r5 != 0) goto L14e
            b5.k r5 = r4.f13719m
            boolean r5 = r5.h()
            if (r5 != 0) goto L14e
            b5.k r5 = r4.f13719m
            boolean r5 = r5.e()
            if (r5 == 0) goto L157
        L14e:
            r20 = r0
            r26 = r2
            r19 = r3
        L154:
            r8 = 0
            goto L50b
        L157:
            md.f r5 = r4.f8877g
            md.b r12 = md.b.f8863r
            oc.b r5 = r5.c(r12)
            nd.x r5 = (nd.x) r5
            if (r5 == 0) goto L169
            r26 = r2
            r19 = r3
            goto L2ef
        L169:
            java.lang.String r5 = r6.j(r11, r11)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.Iterator r15 = r3.iterator()
        L17b:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L2e6
            java.lang.Object r16 = r15.next()
            r8 = r16
            qd.j r8 = (qd.j) r8
            ud.u r11 = r7.f13688k
            ud.e r11 = r11.g(r8)
            if (r11 == 0) goto L28f
            java.lang.String r10 = r6.f9781k
            java.util.List r9 = r11.f13697t
            java.util.Iterator r9 = r9.iterator()
        L199:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L1c4
            java.lang.Object r19 = r9.next()
            r26 = r2
            r2 = r19
            ud.r r2 = (ud.r) r2
            r19 = r3
            od.d r3 = r2.f13717k
            java.lang.String r3 = r3.f9781k
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L1bf
            b5.k r3 = r2.f13719m
            boolean r3 = r3.h()
            if (r3 != 0) goto L1bf
            goto L239
        L1bf:
            r2 = r26
            r3 = r19
            goto L199
        L1c4:
            r26 = r2
            r19 = r3
            java.util.List r2 = r11.f13697t
            java.util.Iterator r2 = r2.iterator()
        L1ce:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L238
            java.lang.Object r3 = r2.next()
            ud.r r3 = (ud.r) r3
            od.d r9 = r3.f13717k
            java.lang.String r10 = r9.f9781k
            boolean r10 = r10.startsWith(r5)
            if (r10 == 0) goto L233
            b5.k r10 = r3.f13719m
            boolean r10 = r10.h()
            if (r10 != 0) goto L233
            ud.u r10 = r11.f13688k
            qe.x r10 = r10.f13748g
            qe.k r10 = r10.f11002c
            r20 = r2
            qd.j r2 = r9.f9778h
            r21 = r3
            qd.j r3 = r6.f9778h
            qe.l r2 = r10.d(r2, r3)
            boolean r3 = r2.d()
            if (r3 == 0) goto L207
            r2 = r21
            goto L239
        L207:
            qe.l r3 = qe.l.f10971n
            if (r2 == r3) goto L20f
            qe.l r3 = qe.l.f10969l
            if (r2 != r3) goto L235
        L20f:
            od.a r2 = r9.f9780j
            java.lang.String r2 = r2.f9768j
            java.lang.String r3 = r9.f9781k
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = "."
            r9.append(r2)
            r9.append(r3)
            java.lang.String r2 = r9.toString()
            java.lang.String r3 = "Possible override for method "
            java.lang.String r2 = r3.concat(r2)
            r4.I(r2)
            goto L235
        L233:
            r20 = r2
        L235:
            r2 = r20
            goto L1ce
        L238:
            r2 = 0
        L239:
            if (r2 == 0) goto L2c8
            b5.k r3 = r2.f13719m
            boolean r9 = r3.e()
            if (r9 == 0) goto L245
            r3 = 0
            goto L266
        L245:
            boolean r9 = r3.g()
            if (r9 != 0) goto L265
            boolean r3 = r3.f()
            if (r3 == 0) goto L252
            goto L265
        L252:
            ud.e r3 = r2.f13718l
            od.a r3 = r3.f13690m
            java.lang.String r3 = r3.j()
            od.a r9 = r7.f13690m
            java.lang.String r9 = r9.j()
            boolean r3 = java.util.Objects.equals(r3, r9)
            goto L266
        L265:
            r3 = 1
        L266:
            if (r3 == 0) goto L2c8
            r13.add(r2)
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r12)
            nd.x r2 = (nd.x) r2
            if (r2 == 0) goto L2c8
            java.lang.String r3 = r8.l()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L28a
            java.lang.Object r3 = xe.s.i(r13)
            ud.m r3 = (ud.m) r3
            if (r3 == 0) goto L28a
            r14.add(r3)
        L28a:
            nd.x r5 = r(r4, r13, r14, r2)
            goto L2ef
        L28f:
            r26 = r2
            r19 = r3
            ud.u r2 = r7.f13688k
            ed.c r2 = r2.f13760s
            ed.b r2 = r2.c(r8)
            if (r2 == 0) goto L2c8
            java.util.Map r2 = r2.f2709d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L2a7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r9 = r3.getKey()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r9.startsWith(r5)
            if (r9 == 0) goto L2a7
            java.lang.Object r2 = r3.getValue()
            ud.m r2 = (ud.m) r2
            r13.add(r2)
        L2c8:
            java.lang.String r2 = r8.l()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L2dd
            java.lang.Object r2 = xe.s.i(r13)
            ud.m r2 = (ud.m) r2
            if (r2 == 0) goto L2dd
            r14.add(r2)
        L2dd:
            r2 = r26
            r3 = r19
            r8 = 2
            r10 = 1
            r11 = 0
            goto L17b
        L2e6:
            r26 = r2
            r19 = r3
            r2 = 0
            nd.x r5 = r(r4, r13, r14, r2)
        L2ef:
            if (r5 == 0) goto L4f6
            java.util.HashSet r2 = r5.f9404i
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L4fa
            r4.y(r5)
            java.lang.String r3 = xe.s.f21577a
            int r3 = r2.size()
            r5 = 1
            if (r3 == r5) goto L307
            r2 = 0
            goto L30f
        L307:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L30f:
            ud.m r2 = (ud.m) r2
            if (r2 == 0) goto L4f6
            qd.j r3 = r4.f13726t
            qd.g r5 = qd.j.f10876j
            qe.l r8 = qe.l.f10966i
            if (r3 != r5) goto L31d
            r5 = 0
            goto L38d
        L31d:
            qd.j r5 = r2.e()
            qd.j r9 = r4.f13726t
            boolean r9 = r9.equals(r5)
            if (r9 == 0) goto L32b
        L329:
            r5 = 0
            goto L371
        L32b:
            boolean r9 = r5.c()
            if (r9 != 0) goto L332
            goto L329
        L332:
            ud.u r9 = r7.f13688k
            qe.x r9 = r9.f13748g
            qe.k r9 = r9.f11002c
            od.d r10 = r2.q()
            od.a r10 = r10.f9780j
            qd.j r10 = r10.f9765g
            java.util.Iterator r11 = r19.iterator()
        L344:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L329
            java.lang.Object r13 = r11.next()
            qd.j r13 = (qd.j) r13
            qe.l r14 = r9.d(r13, r10)
            if (r14 != r8) goto L344
            ud.u r14 = r7.f13688k
            fe.a r14 = r14.f13750i
            qd.j r13 = r14.l(r13, r13, r5)
            if (r13 == 0) goto L344
            boolean r14 = r13.c()
            if (r14 != 0) goto L344
            qd.j r14 = r4.f13726t
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L344
            r4.f13726t = r13
            r5 = 1
        L371:
            if (r5 == 0) goto L38d
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Return type fixed from '"
            r9.<init>(r10)
            r9.append(r3)
            java.lang.String r3 = "' to match base method"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            r4.I(r3)
        L38d:
            java.util.List r3 = r4.c()
            java.util.List r9 = r2.c()
            boolean r10 = r3.equals(r9)
            if (r10 == 0) goto L3a2
        L39b:
            r20 = r0
            r24 = r5
            r13 = 0
            goto L468
        L3a2:
            int r10 = r3.size()
            int r9 = r9.size()
            if (r10 == r9) goto L3ad
            goto L39b
        L3ad:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r10)
            r11 = 0
            r13 = 0
        L3b4:
            if (r11 >= r10) goto L448
            java.util.List r14 = r4.c()
            java.lang.Object r14 = r14.get(r11)
            qd.j r14 = (qd.j) r14
            java.util.List r15 = r2.c()
            java.lang.Object r15 = r15.get(r11)
            qd.j r15 = (qd.j) r15
            boolean r20 = r14.equals(r15)
            if (r20 == 0) goto L3da
        L3d0:
            r20 = r0
            r21 = r2
        L3d4:
            r24 = r5
            r23 = r10
            r2 = 0
            goto L42c
        L3da:
            boolean r20 = r15.c()
            if (r20 != 0) goto L3e1
            goto L3d0
        L3e1:
            r20 = r0
            ud.u r0 = r7.f13688k
            qe.x r0 = r0.f13748g
            qe.k r0 = r0.f11002c
            r21 = r2
            od.d r2 = r21.q()
            od.a r2 = r2.f9780j
            qd.j r2 = r2.f9765g
            java.util.Iterator r22 = r19.iterator()
        L3f7:
            boolean r23 = r22.hasNext()
            if (r23 == 0) goto L3d4
            java.lang.Object r23 = r22.next()
            r24 = r5
            r5 = r23
            qd.j r5 = (qd.j) r5
            r23 = r10
            qe.l r10 = r0.d(r5, r2)
            if (r10 != r8) goto L427
            ud.u r10 = r7.f13688k
            fe.a r10 = r10.f13750i
            qd.j r5 = r10.l(r5, r5, r15)
            if (r5 == 0) goto L427
            boolean r10 = r5.c()
            if (r10 != 0) goto L427
            boolean r10 = r5.equals(r14)
            if (r10 != 0) goto L427
            r2 = r5
            goto L42c
        L427:
            r10 = r23
            r5 = r24
            goto L3f7
        L42c:
            if (r2 == 0) goto L433
            r9.add(r2)
            r13 = 1
            goto L43c
        L433:
            java.lang.Object r0 = r3.get(r11)
            qd.j r0 = (qd.j) r0
            r9.add(r0)
        L43c:
            int r11 = r11 + 1
            r0 = r20
            r2 = r21
            r10 = r23
            r5 = r24
            goto L3b4
        L448:
            r20 = r0
            r24 = r5
            if (r13 == 0) goto L468
            java.util.List r0 = r4.c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Method arguments types fixed to match base method, original types: "
            java.lang.String r0 = r2.concat(r0)
            r4.I(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            r4.f13727u = r0
            r4.V(r9)
        L468:
            r0 = r24 | r13
            if (r0 == 0) goto L154
            ud.u r0 = r7.f13688k
            bc.g r0 = r0.f13742a
            boolean r0 = r0.a()
            java.lang.String r2 = r6.f9784n
            java.util.List r3 = r4.c()
            r8 = 0
            java.lang.String r3 = od.d.i(r2, r3, r8)
            java.util.List r5 = r7.f13697t
            java.util.Iterator r5 = r5.iterator()
        L485:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L50b
            java.lang.Object r6 = r5.next()
            ud.r r6 = (ud.r) r6
            od.d r7 = r6.f13717k
            java.lang.String r9 = r7.f9784n
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L485
            if (r6 == r4) goto L485
            r9 = 1
            r10 = 0
            java.lang.String r11 = r7.j(r9, r10)
            boolean r9 = r11.equals(r3)
            if (r9 == 0) goto L485
            if (r0 == 0) goto L4ed
            md.a r0 = md.a.f8843x
            md.f r2 = r6.f8877g
            boolean r0 = r2.a(r0)
            if (r0 != 0) goto L4e8
            md.f r0 = r6.f8877g
            boolean r0 = r0.b(r12)
            if (r0 == 0) goto L4be
            goto L4e8
        L4be:
            ud.e r0 = r6.f13718l
            java.lang.String r2 = r7.f9784n
            r3 = 2
        L4c3:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            ud.r r9 = r0.n0(r5)
            if (r9 != 0) goto L4e5
            r7.f9784n = r5
            nd.f0 r0 = new nd.f0
            java.lang.String r2 = "avoid collision after fix types in other method"
            r0.<init>(r2)
            r6.y(r0)
            goto L4ed
        L4e5:
            int r3 = r3 + 1
            goto L4c3
        L4e8:
            java.lang.String r0 = "Can't rename method to resolve collision"
            r6.L(r0)
        L4ed:
            nd.v r0 = new nd.v
            r0.<init>(r4)
            r6.y(r0)
            goto L50b
        L4f6:
            r20 = r0
            goto L154
        L4fa:
            java.util.List r0 = r5.f9402g
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "No base methods for override attribute: "
            java.lang.String r0 = r2.concat(r0)
            ah.a.k(r0)
        L509:
            r10 = 0
            goto L526
        L50b:
            r2 = r26
            r3 = r19
            r0 = r20
            r8 = 2
            r10 = 1
            r11 = 0
            goto L128
        L516:
            r10 = 1
            goto L526
        L518:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "No end types in class hierarchy: "
            java.lang.String r0 = r2.concat(r0)
            ah.a.k(r0)
            goto L509
        L526:
            return r10
        L527:
            r8 = 0
            ud.r r0 = r2.m0(r6)
            if (r0 == 0) goto L5e7
            boolean r3 = r0.f13722p
            if (r3 != 0) goto L5e7
            java.util.List r0 = r0.f13732z
            if (r0 != 0) goto L538
            goto L5e7
        L538:
            nd.j r3 = new nd.j
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L541:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L5d9
            java.lang.Object r4 = r0.next()
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r4 = r4.f13674l
            java.util.Iterator r4 = r4.iterator()
        L553:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L541
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            pd.k r6 = r5.f13713k
            pd.k r7 = pd.k.H
            if (r6 != r7) goto L553
            ud.u r6 = r2.f13688k
            r7 = 2
            qd.l r9 = r5.S(r7)
            r9.getClass()
            boolean r7 = r9 instanceof qd.n
            if (r7 != 0) goto L574
            goto L553
        L574:
            b.e r5 = t(r6, r5)
            if (r5 != 0) goto L57b
            goto L553
        L57b:
            java.lang.Object r7 = r5.f332h
            qd.l r7 = (qd.l) r7
            java.lang.Object r5 = r5.f333i
            ud.g r5 = (ud.g) r5
            r7.getClass()
            boolean r10 = r7 instanceof qd.m
            if (r10 != 0) goto L58b
            goto L553
        L58b:
            qd.m r7 = (qd.m) r7
            ud.p r7 = r7.f10904l
            boolean r10 = r7 instanceof pd.j
            if (r10 != 0) goto L594
            goto L553
        L594:
            pd.j r7 = (pd.j) r7
            java.lang.Object r7 = r7.f10495o
            boolean r10 = r7 instanceof od.c
            if (r10 != 0) goto L59d
            goto L553
        L59d:
            od.c r7 = (od.c) r7
            ud.g r6 = r6.h(r7)
            if (r6 != 0) goto L5a6
            goto L553
        L5a6:
            qd.n r9 = (qd.n) r9
            long r9 = r9.f10905l
            int r7 = (int) r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r9 = r3.f9377g
            if (r9 != 0) goto L5b5
            r9 = r8
            goto L5bb
        L5b5:
            java.lang.Object r9 = r9.get(r5)
            nd.i r9 = (nd.i) r9
        L5bb:
            if (r9 != 0) goto L5d2
            nd.i r9 = new nd.i
            r9.<init>()
            java.util.HashMap r10 = r3.f9377g
            if (r10 != 0) goto L5cd
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r3.f9377g = r10
        L5cd:
            java.util.HashMap r10 = r3.f9377g
            r10.put(r5, r9)
        L5d2:
            java.util.HashMap r5 = r9.f9375a
            r5.put(r7, r6)
            goto L553
        L5d9:
            java.util.HashMap r0 = r3.f9377g
            if (r0 == 0) goto L5e7
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e4
            goto L5e7
        L5e4:
            r2.y(r3)
        L5e7:
            r17 = 1
            return r17
        L5ea:
            r8 = 0
            java.util.List r0 = r2.f13699v
            java.util.Iterator r0 = r0.iterator()
        L5f1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L601
            java.lang.Object r3 = r0.next()
            ud.e r3 = (ud.e) r3
            r1.h(r3)
            goto L5f1
        L601:
            java.util.List r0 = r2.f13698u
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7bc
            ud.r r0 = r2.m0(r6)
            md.a r3 = md.a.Q
            if (r0 == 0) goto L69a
            b5.k r4 = r0.f13719m
            boolean r4 = r4.h()
            if (r4 == 0) goto L69a
            boolean r4 = r0.f13722p
            if (r4 != 0) goto L69a
            java.util.List r4 = r0.f13732z
            if (r4 != 0) goto L623
            goto L69a
        L623:
            java.util.List r4 = r2.f13698u
            a7.b r6 = new a7.b
            r9 = 8
            r6.<init>(r9)
            boolean r4 = be.h.k(r4, r6)
            if (r4 != 0) goto L633
            goto L69a
        L633:
            pd.k r4 = pd.k.N
            java.util.ArrayList r4 = w(r2, r0, r4)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L640
            goto L69a
        L640:
            java.util.Iterator r6 = r4.iterator()
        L644:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L65e
            java.lang.Object r9 = r6.next()
            be.r r9 = (be.r) r9
            ud.g r9 = r9.f840a
            b5.k r10 = r9.f13708m
            boolean r10 = r10.c()
            if (r10 == 0) goto L644
            r9.E(r7)
            goto L644
        L65e:
            A(r4)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L668
            goto L69a
        L668:
            java.util.Iterator r6 = r4.iterator()
        L66c:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L693
            java.lang.Object r9 = r6.next()
            be.r r9 = (be.r) r9
            pd.j r10 = r9.f841b
            r11 = 0
            qd.l r12 = r10.S(r11)
            boolean r11 = r12 instanceof qd.m
            if (r11 == 0) goto L68a
            qd.m r12 = (qd.m) r12
            ud.p r11 = r12.f10904l
            r11.w(r3)
        L68a:
            xe.l.d(r0, r10)
            ud.g r9 = r9.f840a
            i(r0, r9, r10)
            goto L66c
        L693:
            B(r2, r4)
            Y(r0)
            goto L633
        L69a:
            java.util.List r0 = r2.f13698u
            a7.b r4 = new a7.b
            r6 = 9
            r4.<init>(r6)
            boolean r0 = be.h.k(r0, r4)
            if (r0 != 0) goto L6ab
            goto L7bc
        L6ab:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r4 = r2.f13697t
            java.util.Iterator r4 = r4.iterator()
        L6b6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L6e1
            java.lang.Object r6 = r4.next()
            ud.r r6 = (ud.r) r6
            b5.k r7 = r6.f13719m
            boolean r9 = r7.h()
            if (r9 != 0) goto L6b6
            boolean r7 = r7.a()
            if (r7 == 0) goto L6b6
            r0.add(r6)
            boolean r7 = r6.f13722p
            if (r7 != 0) goto L6df
            java.util.List r6 = r6.f13732z
            boolean r6 = a.a.l0(r6)
            if (r6 == 0) goto L6b6
        L6df:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L6e1:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L6e9
            goto L7bc
        L6e9:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r0.size()
            r4.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L6f6:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L71a
            java.lang.Object r6 = r0.next()
            ud.r r6 = (ud.r) r6
            java.util.ArrayList r7 = w(r2, r6, r5)
            A(r7)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L711
            goto L7bc
        L711:
            be.q r9 = new be.q
            r9.<init>(r6, r7)
            r4.add(r9)
            goto L6f6
        L71a:
            java.util.Iterator r0 = r4.iterator()
            r9 = r8
        L71f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L760
            java.lang.Object r5 = r0.next()
            be.q r5 = (be.q) r5
            if (r9 != 0) goto L72f
            r9 = r5
            goto L71f
        L72f:
            java.util.ArrayList r6 = r9.f839b
            java.util.ArrayList r5 = r5.f839b
            int r7 = r6.size()
            int r8 = r5.size()
            if (r7 == r8) goto L73f
            goto L7bc
        L73f:
            int r7 = r6.size()
            r8 = 0
        L744:
            if (r8 >= r7) goto L71f
            java.lang.Object r10 = r6.get(r8)
            be.r r10 = (be.r) r10
            pd.j r10 = r10.f841b
            java.lang.Object r11 = r5.get(r8)
            be.r r11 = (be.r) r11
            pd.j r11 = r11.f841b
            boolean r10 = r10.Y(r11)
            if (r10 != 0) goto L75d
            goto L7bc
        L75d:
            int r8 = r8 + 1
            goto L744
        L760:
            if (r9 != 0) goto L763
            goto L7bc
        L763:
            java.util.ArrayList r0 = r9.f839b
            java.util.Iterator r4 = r4.iterator()
        L769:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L79f
            java.lang.Object r5 = r4.next()
            be.q r5 = (be.q) r5
            java.util.ArrayList r6 = r5.f839b
            java.util.Iterator r6 = r6.iterator()
        L77b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L769
            java.lang.Object r7 = r6.next()
            be.r r7 = (be.r) r7
            pd.j r7 = r7.f841b
            r10 = 0
            qd.l r8 = r7.S(r10)
            boolean r10 = r8 instanceof qd.m
            if (r10 == 0) goto L799
            qd.m r8 = (qd.m) r8
            ud.p r8 = r8.f10904l
            r8.w(r3)
        L799:
            ud.r r8 = r5.f838a
            xe.l.d(r8, r7)
            goto L77b
        L79f:
            java.util.Iterator r3 = r0.iterator()
        L7a3:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b9
            java.lang.Object r4 = r3.next()
            be.r r4 = (be.r) r4
            ud.r r5 = r9.f838a
            ud.g r6 = r4.f840a
            pd.j r4 = r4.f841b
            i(r5, r6, r4)
            goto L7a3
        L7b9:
            B(r2, r0)
        L7bc:
            r16 = 0
            return r16
        L7bf:
            md.a r0 = md.a.L
            md.f r6 = r2.f8877g
            boolean r0 = r6.a(r0)
            if (r0 == 0) goto L7cd
        L7c9:
            r16 = 0
            goto L969
        L7cd:
            java.util.List r0 = r2.f13699v
            java.util.Iterator r0 = r0.iterator()
        L7d3:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L7e3
            java.lang.Object r6 = r0.next()
            ud.e r6 = (ud.e) r6
            r1.h(r6)
            goto L7d3
        L7e3:
            boolean r0 = L(r2)
            if (r0 == 0) goto L7ed
            r2.w(r4)
            goto L7c9
        L7ed:
            md.f r0 = r2.f8877g
            boolean r0 = r0.b(r3)
            ud.u r3 = r2.f13688k
            od.a r6 = r2.f13690m
            if (r0 != 0) goto L7ff
            boolean r7 = r6.o()
            if (r7 == 0) goto L951
        L7ff:
            java.util.List r7 = r2.f13698u
            java.util.Iterator r7 = r7.iterator()
        L805:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L951
            java.lang.Object r8 = r7.next()
            ud.g r8 = (ud.g) r8
            qd.j r9 = r8.f13709n
            b5.k r10 = r8.f13708m
            boolean r10 = r10.i()
            if (r10 == 0) goto L83d
            boolean r10 = r9.v()
            if (r10 == 0) goto L83d
            boolean r10 = r9 instanceof qd.c
            if (r10 != 0) goto L83d
            od.a r9 = od.a.e(r3, r9)
            ud.e r9 = r3.f(r9)
            od.a r10 = r6.f9769k
            if (r9 != 0) goto L832
            goto L805
        L832:
            od.a r9 = r9.f13690m
            boolean r10 = java.util.Objects.equals(r10, r9)
            if (r0 != 0) goto L847
            if (r10 == 0) goto L83d
            goto L847
        L83d:
            r18 = r0
            r19 = r3
            r20 = r5
            r21 = r6
            goto L945
        L847:
            java.util.List r11 = r2.f13697t
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L84e:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L92e
            java.lang.Object r13 = r11.next()
            ud.r r13 = (ud.r) r13
            boolean r14 = r13.f13722p
            if (r14 != 0) goto L91e
            b5.k r14 = r13.f13719m
            boolean r14 = r14.a()
            if (r14 != 0) goto L868
            goto L91e
        L868:
            java.util.List r14 = r13.S()
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto L91e
            md.f r15 = r13.f8877g
            r18 = r0
            md.a r0 = md.a.E
            boolean r15 = r15.a(r0)
            if (r15 == 0) goto L886
        L87e:
            r19 = r3
        L880:
            r20 = r5
            r21 = r6
            goto L922
        L886:
            r15 = 0
            java.lang.Object r14 = r14.get(r15)
            qd.r r14 = (qd.r) r14
            qd.j r15 = r14.I()
            qd.j r1 = r9.f9765g
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L89a
            goto L87e
        L89a:
            ud.a r1 = r13.B
            java.util.List r1 = r1.f13677o
            r15 = 0
            java.lang.Object r1 = r1.get(r15)
            ud.a r1 = (ud.a) r1
            java.util.ArrayList r15 = r1.f13674l
            boolean r19 = r15.isEmpty()
            if (r19 == 0) goto L8ae
            goto L87e
        L8ae:
            r19 = r3
            r3 = 0
            java.lang.Object r15 = r15.get(r3)
            ud.p r15 = (ud.p) r15
            pd.k r3 = r15.f13713k
            if (r3 == r5) goto L8bc
            goto L880
        L8bc:
            r3 = r15
            pd.j r3 = (pd.j) r3
            r20 = r5
            java.lang.Object r5 = r3.f10495o
            od.c r5 = (od.c) r5
            r21 = r6
            od.c r6 = r8.f13707l
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L922
            r6 = 0
            qd.l r3 = r3.S(r6)
            boolean r3 = r3.equals(r14)
            if (r3 != 0) goto L8db
            goto L922
        L8db:
            r13.w(r0)
            xe.l.j(r13, r15)
            xe.l.g(r13, r1, r15)
            qd.s r0 = r14.f10923m
            java.util.ArrayList r0 = r0.f10928j
            int r0 = r0.size()
            if (r0 == 0) goto L91b
            pd.j r0 = new pd.j
            pd.k r1 = pd.k.K
            r3 = 1
            r0.<init>(r1, r5, r3)
            qd.l r1 = r15.S(r3)
            r0.I(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            qd.s r3 = r14.f10923m
            java.util.ArrayList r3 = r3.f10928j
            r1.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L90a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L91b
            java.lang.Object r3 = r1.next()
            qd.l r3 = (qd.l) r3
            r5 = 1
            r3.b0(r13, r0, r5)
            goto L90a
        L91b:
            int r12 = r12 + 1
            goto L922
        L91e:
            r18 = r0
            goto L87e
        L922:
            r1 = r25
            r0 = r18
            r3 = r19
            r5 = r20
            r6 = r21
            goto L84e
        L92e:
            r18 = r0
            r19 = r3
            r20 = r5
            r21 = r6
            if (r12 == 0) goto L945
            if (r10 == 0) goto L942
            nd.k r0 = new nd.k
            r0.<init>(r9)
            r8.y(r0)
        L942:
            r8.w(r4)
        L945:
            r1 = r25
            r0 = r18
            r3 = r19
            r5 = r20
            r6 = r21
            goto L805
        L951:
            java.util.List r0 = r2.f13697t
            ae.e r1 = new ae.e
            r5 = 1
            r1.<init>(r5)
            r0.forEach(r1)
            java.util.List r0 = r2.f13697t
            ae.e r1 = new ae.e
            r7 = 2
            r1.<init>(r7)
            r0.forEach(r1)
            goto L7c9
        L969:
            return r16
        L96a:
            r5 = r10
            md.f r0 = r2.f8877g
            boolean r0 = r0.b(r3)
            if (r0 == 0) goto Lab2
            java.util.List r0 = r2.f13697t
            java.util.Iterator r0 = r0.iterator()
        L979:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lab2
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            md.a r2 = md.a.H
            md.f r3 = r1.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L979
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            od.d r2 = r1.f13717k
            ud.e r3 = r1.f13718l
            java.util.List r6 = r1.S()
            java.util.List r7 = r1.H
            r15 = 0
            java.lang.Object r7 = r7.get(r15)
            ud.r r7 = (ud.r) r7
            ud.e r7 = r7.f13718l
            java.util.List r8 = r2.f9779i
            int r8 = r8.size()
            if (r8 == 0) goto L9c3
            java.util.List r2 = r2.f9779i
            java.lang.Object r2 = r2.get(r15)
            qd.j r2 = (qd.j) r2
            od.a r7 = r7.f13690m
            qd.j r7 = r7.f9765g
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L9c3
            r2 = r5
            goto L9c4
        L9c3:
            r2 = r15
        L9c4:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            int r8 = r6.size()
        L9cd:
            if (r2 >= r8) goto La20
            java.lang.Object r9 = r6.get(r2)
            qd.r r9 = (qd.r) r9
            ud.p r10 = F(r9)
            if (r10 != 0) goto L9de
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            goto La20
        L9de:
            pd.k r11 = r10.f13713k
            int r11 = r11.ordinal()
            r12 = 31
            if (r11 == r12) goto L9ff
            r9 = 38
            if (r11 == r9) goto L9ef
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            goto La20
        L9ef:
            r9 = r10
            td.a r9 = (td.a) r9
            boolean r9 = r9.l0()
            if (r9 != 0) goto L9fb
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            goto La20
        L9fb:
            r0.add(r10)
            goto La1b
        L9ff:
            r11 = r10
            pd.j r11 = (pd.j) r11
            java.lang.Object r11 = r11.f10495o
            od.c r11 = (od.c) r11
            ud.g r11 = r3.l0(r11)
            if (r11 == 0) goto La1e
            b5.k r12 = r11.f13708m
            boolean r12 = r12.i()
            if (r12 != 0) goto La15
            goto La1e
        La15:
            r7.put(r9, r11)
            r0.add(r10)
        La1b:
            int r2 = r2 + 1
            goto L9cd
        La1e:
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
        La20:
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto La2d
            md.a r2 = md.a.G
            r1.w(r2)
            goto La9e
        La2d:
            java.util.Set r2 = r7.entrySet()
            java.util.Iterator r2 = r2.iterator()
        La35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La9e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getValue()
            ud.g r6 = (ud.g) r6
            if (r6 != 0) goto La4a
            goto La35
        La4a:
            java.lang.Object r3 = r3.getKey()
            qd.l r3 = (qd.l) r3
            nd.k r7 = new nd.k
            r7.<init>(r3)
            r6.y(r7)
            r6.w(r4)
            r3.getClass()
            boolean r6 = r3 instanceof qd.r
            if (r6 == 0) goto La35
            md.a r6 = md.a.F
            r3.w(r6)
            qd.r r3 = (qd.r) r3
            java.util.List r6 = r1.S()
            java.lang.String r7 = xe.s.f21577a
            boolean r7 = r6.isEmpty()
            r8 = -1
            if (r7 == 0) goto La78
        La76:
            r10 = r8
            goto La89
        La78:
            int r7 = r6.size()
            r10 = r15
        La7d:
            if (r10 >= r7) goto La76
            java.lang.Object r9 = r6.get(r10)
            if (r9 != r3) goto La86
            goto La89
        La86:
            int r10 = r10 + 1
            goto La7d
        La89:
            if (r10 == r8) goto La8f
            nd.g0.b(r1, r10)
            goto La35
        La8f:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Arg not found: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            r10 = r15
            goto Lab3
        La9e:
            java.util.Iterator r0 = r0.iterator()
        Laa2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lab2
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            r1.w(r4)
            goto Laa2
        Lab2:
            r10 = r5
        Lab3:
            return r10
    }

    public void s(ud.r r3, nc.a r4) {
            r2 = this;
            int r0 = r4.f9341g
            java.lang.Object r4 = r4.f9342h
            int r0 = t3.c.b(r0)
            r1 = 12
            if (r0 == r1) goto L2f
            r1 = 16
            if (r0 == r1) goto L23
            r1 = 17
            if (r0 == r1) goto L15
            goto L58
        L15:
            nc.b r4 = (nc.b) r4
            java.util.LinkedHashMap r4 = r4.f9345c
            be.f0 r0 = new be.f0
            r1 = 0
            r0.<init>(r2, r1, r3)
            r4.forEach(r0)
            return
        L23:
            java.util.List r4 = (java.util.List) r4
            be.e0 r0 = new be.e0
            r1 = 1
            r0.<init>(r2, r3, r1)
            r4.forEach(r0)
            return
        L2f:
            boolean r0 = r4 instanceof jf.d
            if (r0 == 0) goto L3e
            ud.e r0 = r3.f13718l
            ud.u r0 = r0.f13688k
            jf.d r4 = (jf.d) r4
            od.c r4 = od.c.a(r0, r4)
            goto L40
        L3e:
            od.c r4 = (od.c) r4
        L40:
            ud.e r0 = r3.f13718l
            ud.u r0 = r0.f13688k
            ud.g r4 = r0.h(r4)
            if (r4 == 0) goto L58
            monitor-enter(r4)
            java.util.List r0 = r4.f13710o     // Catch: java.lang.Throwable -> L55
            java.util.List r3 = be.h.Y(r0, r3)     // Catch: java.lang.Throwable -> L55
            r4.f13710o = r3     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return
        L55:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            throw r3
        L58:
            return
    }

    public void x(ud.r r4, nd.b0 r5) {
            r3 = this;
            oc.c r0 = oc.c.f9755a
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r0)
            pc.d r5 = (pc.d) r5
            if (r5 != 0) goto Ld
            goto L49
        Ld:
            java.util.HashMap r5 = r5.f10463g
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r5.next()
            nc.b r0 = (nc.b) r0
            int r1 = r0.f9343a
            r2 = 3
            if (r1 != r2) goto L29
            goto L17
        L29:
            java.util.LinkedHashMap r0 = r0.f9345c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            nc.a r1 = (nc.a) r1
            r3.s(r4, r1)
            goto L33
        L49:
            return
    }
}
