package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Comparable f821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f822i;

    public /* synthetic */ l() {
            r1 = this;
            r0 = 0
            r1.f820g = r0
            r1.<init>()
            return
    }

    public l(java.lang.String r2, java.util.function.Consumer r3) {
            r1 = this;
            r0 = 1
            r1.f820g = r0
            r1.<init>()
            r1.f821h = r2
            r1.f822i = r3
            return
    }

    public static nd.g j(be.k r17, ud.g r18, td.a r19) {
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.f813b
            ud.e r3 = (ud.e) r3
            java.util.List r4 = r2.f13715m
            od.d r5 = r2.f13119o
            int r4 = r4.size()
            r6 = 1
            if (r4 >= r6) goto L19
        L15:
            r16 = 0
            goto L144
        L19:
            java.lang.Object r4 = r0.f814c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            od.a r6 = r5.f9780j
            ud.u r8 = r3.f13688k
            ud.e r6 = r8.f(r6)
            if (r6 != 0) goto L28
            goto L15
        L28:
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L2f
            goto L39
        L2f:
            md.b r8 = md.b.f8853h
            md.f r6 = r6.f8877g
            boolean r6 = r6.b(r8)
            if (r6 == 0) goto L15
        L39:
            ud.u r6 = r3.f13688k
            ud.r r5 = r6.i(r5)
            if (r5 != 0) goto L42
            goto L15
        L42:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.U(r5)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L13e
            ud.p r5 = r2.O()
            td.a r5 = (td.a) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.U(r6)
            java.util.Iterator r6 = r6.iterator()
        L62:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L125
            java.lang.Object r8 = r6.next()
            qd.r r8 = (qd.r) r8
            qd.s r9 = r8.f10923m
            qd.r r10 = r9.f10927i
            ud.p r10 = r10.f10903j
            pd.k r11 = pd.k.S
            ud.p r10 = xe.m.a(r10, r11)
            r11 = 0
            if (r10 == 0) goto L8c
            r12 = r10
            td.a r12 = (td.a) r12
            od.d r12 = r12.f13119o
            od.a r12 = r12.f9780j
            od.a r13 = r3.f13690m
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L8f
        L8c:
            r16 = 0
            goto Lbe
        L8f:
            java.util.ArrayList r9 = r9.f10928j
            java.util.Iterator r9 = r9.iterator()
            r12 = 0
        L96:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L107
            java.lang.Object r14 = r9.next()
            qd.r r14 = (qd.r) r14
            ud.p r14 = r14.f10903j
            if (r14 != 0) goto Laa
            r12 = 0
            r16 = 0
            goto L10e
        Laa:
            pd.k r15 = r14.f13713k
            int r15 = r15.ordinal()
            r16 = 0
            r7 = 25
            if (r15 == r7) goto Lea
            r7 = 33
            if (r15 == r7) goto Lce
            r7 = 38
            if (r15 == r7) goto Lc1
        Lbe:
            r12 = r16
            goto L10e
        Lc1:
            td.a r14 = (td.a) r14
            od.d r7 = r14.f13119o
            od.a r7 = r7.f9780j
            boolean r7 = r7.equals(r13)
            if (r7 != 0) goto L96
            goto Lbe
        Lce:
            pd.j r14 = (pd.j) r14
            java.lang.Object r7 = r14.f10495o
            r12 = r7
            od.c r12 = (od.c) r12
            od.a r7 = r12.f9773g
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto Lbe
            qd.j r7 = r12.f9775i
            qd.j r14 = r3.b0()
            boolean r7 = r7.equals(r14)
            if (r7 != 0) goto L96
            goto Lbe
        Lea:
            java.lang.Object r7 = r0.f816e
            ud.p r7 = (ud.p) r7
            qd.l r7 = r7.S(r11)
            r7.getClass()
            boolean r15 = r7 instanceof qd.m
            if (r15 == 0) goto Lfe
            qd.m r7 = (qd.m) r7
            ud.p r7 = r7.f10904l
            goto L100
        Lfe:
            r7 = r16
        L100:
            boolean r7 = r7.equals(r14)
            if (r7 != 0) goto L96
            goto Lbe
        L107:
            r16 = 0
            if (r12 == 0) goto L10e
            r4.add(r10)
        L10e:
            if (r12 != 0) goto L113
        L110:
            r7 = r16
            goto L126
        L113:
            pd.j r7 = new pd.j
            pd.k r9 = pd.k.M
            r7.<init>(r9, r12, r11)
            qd.m r7 = qd.l.Z(r7)
            boolean r7 = r5.b0(r8, r7)
            if (r7 != 0) goto L62
            goto L110
        L125:
            r7 = r5
        L126:
            if (r7 == 0) goto L12d
            r4.add(r2)
            r2 = r7
            goto L13e
        L12d:
            od.c r0 = r1.f13707l
            java.lang.String r0 = r0.f9774h
            java.lang.String r1 = "Init of enum field '"
            java.lang.String r2 = "' uses external variables"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            ah.a.k(r0)
            r0 = 0
            return r0
        L13e:
            nd.g r0 = new nd.g
            r0.<init>(r1, r2)
            return r0
        L144:
            return r16
    }

    public static java.util.List k(be.k r14, ud.p r15) {
            java.lang.Object r0 = r14.f814c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r14.f813b
            ud.e r1 = (ud.e) r1
            pd.k r2 = r15.f13713k
            int r2 = r2.ordinal()
            r3 = 25
            r4 = 0
            r5 = 0
            if (r2 == r3) goto L65
            r0 = 28
            if (r2 == r0) goto L58
            r0 = 34
            if (r2 == r0) goto L1e
            goto L154
        L1e:
            pd.n r15 = (pd.n) r15
            od.d r15 = r15.f10526p
            ud.u r0 = r1.f13688k
            ud.r r15 = r0.i(r15)
            if (r15 == 0) goto L154
            boolean r0 = r15.Z()
            if (r0 == 0) goto L32
            goto L154
        L32:
            ud.a r0 = r15.C
            java.util.List r0 = r0.f13675m
            java.lang.Object r0 = xe.s.f(r0)
            ud.a r0 = (ud.a) r0
            ud.p r0 = a.a.c0(r0)
            qd.l r0 = xe.m.g(r0)
            ud.p r0 = xe.m.h(r0)
            if (r0 != 0) goto L4c
            goto L154
        L4c:
            java.util.List r14 = k(r14, r0)
            if (r14 == 0) goto L57
            md.a r0 = md.a.f8838s
            r15.w(r0)
        L57:
            return r14
        L58:
            qd.l r14 = r15.S(r4)
            boolean r14 = r14.R()
            if (r14 == 0) goto L154
            java.util.List r14 = java.util.Collections.EMPTY_LIST
            return r14
        L65:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r3 = r15.f13715m
            java.util.Iterator r3 = r3.iterator()
        L70:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L15a
            java.lang.Object r6 = r3.next()
            qd.l r6 = (qd.l) r6
            r6.getClass()
            boolean r7 = r6 instanceof qd.m
            java.lang.String r8 = "Fake field, exist only in values array"
            md.a r9 = md.a.f8831m
            pd.k r10 = pd.k.S
            java.lang.String r11 = "EF"
            pd.k r12 = pd.k.M
            if (r7 == 0) goto Ld0
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            pd.k r7 = r6.f13713k
            if (r7 != r12) goto L9b
            nd.g r6 = m(r14, r6)
            goto L152
        L9b:
            if (r7 != r10) goto La0
            td.a r6 = (td.a) r6
            goto La1
        La0:
            r6 = r5
        La1:
            if (r6 == 0) goto L151
            int r7 = r6.f13716n
            java.lang.String r7 = eh.a.l(r7, r11)
            ud.u r10 = r1.f13688k
            od.a r11 = r1.f13690m
            qd.j r12 = r1.b0()
            od.c r13 = new od.c
            r13.<init>(r11, r7, r12)
            be.k r7 = r10.f13746e
            od.c r7 = r7.h(r13)
            ud.g r10 = new ud.g
            r10.<init>(r1, r7, r4)
            r10.w(r9)
            r10.J(r8)
            r1.R(r10)
            nd.g r6 = j(r14, r10, r6)
            goto L152
        Ld0:
            boolean r7 = r6 instanceof qd.r
            if (r7 == 0) goto L151
            qd.r r6 = (qd.r) r6
            ud.p r7 = r6.f0()
            if (r7 == 0) goto Le6
            pd.k r13 = r7.f13713k
            if (r13 != r12) goto Le6
            nd.g r6 = m(r14, r7)
            goto L152
        Le6:
            qd.s r7 = r6.f10923m
            java.util.ArrayList r12 = r7.f10928j
            int r12 = r12.size()
            if (r12 != 0) goto Lf1
            goto L151
        Lf1:
            qd.r r12 = r7.f10927i
            ud.p r12 = r12.f10903j
            if (r12 == 0) goto L151
            pd.k r13 = r12.f13713k
            if (r13 == r10) goto Lfc
            goto L151
        Lfc:
            java.util.ArrayList r7 = r7.f10928j
            java.lang.Object r7 = r7.get(r4)
            qd.r r7 = (qd.r) r7
            ud.p r7 = r7.f10903j
            if (r7 == 0) goto L11c
            pd.k r10 = r7.f13713k
            pd.k r13 = pd.k.N
            if (r10 == r13) goto L10f
            goto L11c
        L10f:
            r10 = r7
            pd.j r10 = (pd.j) r10
            java.lang.Object r10 = r10.f10495o
            od.c r10 = (od.c) r10
            ud.g r10 = r1.l0(r10)
            if (r10 != 0) goto L11e
        L11c:
            r10 = r5
            goto L121
        L11e:
            r0.add(r7)
        L121:
            if (r10 != 0) goto L14a
            int r6 = r6.f10922l
            java.lang.String r6 = eh.a.l(r6, r11)
            ud.u r7 = r1.f13688k
            od.a r10 = r1.f13690m
            qd.j r11 = r1.b0()
            od.c r13 = new od.c
            r13.<init>(r10, r6, r11)
            be.k r6 = r7.f13746e
            od.c r6 = r6.h(r13)
            ud.g r10 = new ud.g
            r10.<init>(r1, r6, r4)
            r10.w(r9)
            r10.J(r8)
            r1.R(r10)
        L14a:
            td.a r12 = (td.a) r12
            nd.g r6 = j(r14, r10, r12)
            goto L152
        L151:
            r6 = r5
        L152:
            if (r6 != 0) goto L155
        L154:
            return r5
        L155:
            r2.add(r6)
            goto L70
        L15a:
            r0.add(r15)
            return r2
    }

    public static nd.g m(be.k r9, ud.p r10) {
            java.lang.Object r0 = r9.f813b
            ud.e r0 = (ud.e) r0
            pd.k r1 = r10.f13713k
            pd.k r2 = pd.k.M
            r3 = 0
            if (r1 == r2) goto Ld
            goto L9e
        Ld:
            r1 = r10
            pd.j r1 = (pd.j) r1
            java.lang.Object r1 = r1.f10495o
            od.c r1 = (od.c) r1
            java.lang.Object r2 = r9.f814c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            ud.g r1 = r0.l0(r1)
            if (r1 != 0) goto L20
            goto L9e
        L20:
            java.lang.Object r4 = r9.f812a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L28:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r5 = r5.f13674l
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L28
            java.lang.Object r6 = r5.next()
            ud.p r6 = (ud.p) r6
            if (r6 == 0) goto L3a
            pd.k r7 = r6.f13713k
            pd.k r8 = pd.k.N
            if (r7 != r8) goto L3a
            r7 = r6
            pd.j r7 = (pd.j) r7
            java.lang.Object r7 = r7.f10495o
            od.c r7 = (od.c) r7
            ud.g r7 = r0.l0(r7)
            boolean r7 = java.util.Objects.equals(r7, r1)
            if (r7 == 0) goto L3a
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 != 0) goto L64
            goto L9e
        L64:
            java.util.List r0 = r6.f13715m
            int r0 = r0.size()
            r4 = 1
            if (r0 == r4) goto L6f
        L6d:
            r0 = r3
            goto L9c
        L6f:
            r0 = 0
            qd.l r0 = r6.S(r0)
            r0.getClass()
            boolean r5 = r0 instanceof qd.m
            pd.k r7 = pd.k.S
            if (r5 == 0) goto L8a
            qd.m r0 = (qd.m) r0
            ud.p r0 = r0.f10904l
            if (r0 == 0) goto L6d
            pd.k r5 = r0.f13713k
            if (r5 != r7) goto L6d
            td.a r0 = (td.a) r0
            goto L9c
        L8a:
            boolean r5 = r0 instanceof qd.r
            if (r5 == 0) goto L6d
            qd.r r0 = (qd.r) r0
            ud.p r0 = r0.f0()
            if (r0 == 0) goto L6d
            pd.k r5 = r0.f13713k
            if (r5 != r7) goto L6d
            td.a r0 = (td.a) r0
        L9c:
            if (r0 != 0) goto L9f
        L9e:
            return r3
        L9f:
            qd.r r3 = r10.f13714l
            if (r3 == 0) goto Lad
            qd.s r3 = r3.f10923m
            java.util.ArrayList r3 = r3.f10928j
            int r3 = r3.size()
            if (r3 != r4) goto Lb0
        Lad:
            r2.add(r10)
        Lb0:
            r2.add(r6)
            nd.g r9 = j(r9, r1, r0)
            return r9
    }

    @Override // be.a
    public java.lang.String e() {
            r1 = this;
            int r0 = r1.f820g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.e()
            return r0
        La:
            java.lang.Comparable r0 = r1.f821h
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // be.a
    public void f(ud.u r6) {
            r5 = this;
            int r0 = r5.f820g
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            qd.e r0 = qd.j.f10880n
            od.a r1 = od.a.e(r6, r0)
            r2 = 2
            qd.j[] r2 = new qd.j[r2]
            qd.e r3 = qd.j.f10878l
            r4 = 0
            r2[r4] = r3
            qd.e r3 = qd.j.f10879m
            r4 = 1
            r2[r4] = r3
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r3 = "valueOf"
            od.d r0 = od.d.b(r6, r1, r3, r2, r0)
            r5.f821h = r0
            qd.e r0 = qd.j.f10877k
            od.a r1 = od.a.e(r6, r0)
            java.lang.String r2 = "clone"
            java.util.List r3 = java.util.Collections.EMPTY_LIST
            od.d r6 = od.d.b(r6, r1, r2, r3, r0)
            r5.f822i = r6
            return
    }

    @Override // be.a
    public void g(ud.r r2) {
            r1 = this;
            int r0 = r1.f820g
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r1.f822i
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            r0.accept(r2)
            return
    }

    @Override // be.a
    public boolean h(ud.e r3) {
            r2 = this;
            int r0 = r2.f820g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.h(r3)
            return r3
        La:
            boolean r0 = r3.c0()
            if (r0 == 0) goto L33
            boolean r0 = r2.i(r3)     // Catch: java.lang.Exception -> L15
            goto L1c
        L15:
            r0 = move-exception
            java.lang.String r1 = "Enum visitor error"
            r3.M(r1, r0)
            r0 = 0
        L1c:
            if (r0 != 0) goto L33
            b5.k r0 = r3.f13692o
            boolean r1 = r0.b()
            if (r1 == 0) goto L33
            r1 = 16384(0x4000, float:2.2959E-41)
            b5.k r0 = r0.m(r1)
            r3.f13692o = r0
            java.lang.String r0 = "Failed to restore enum class, 'enum' modifier and super class removed"
            r3.L(r0)
        L33:
            r3 = 1
            return r3
    }

    public boolean i(ud.e r22) {
            r21 = this;
            r1 = r21
            r0 = r22
            qd.j r2 = r0.f13693p
            ud.u r3 = r0.f13688k
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.l()
            qd.e r4 = qd.j.f10880n
            java.lang.String r4 = r4.K
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L1d
            md.a r2 = md.a.f8841v
            r0.w(r2)
        L1d:
            java.lang.String r2 = "<clinit>()V"
            ud.r r2 = r0.m0(r2)
            r7 = 0
            if (r2 != 0) goto L2c
            java.lang.String r2 = "Enum class init method not found"
            r0.L(r2)
            return r7
        L2c:
            xd.b r4 = r2.G
            if (r4 == 0) goto L38
            java.util.List r5 = r2.f13732z
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3c
        L38:
            r17 = r7
            goto L4a4
        L3c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = r4.f21539k
            java.util.Iterator r4 = r4.iterator()
        L47:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L5d
            java.lang.Object r6 = r4.next()
            ud.j r6 = (ud.j) r6
            boolean r8 = r6 instanceof ud.a
            if (r8 == 0) goto L5d
            ud.a r6 = (ud.a) r6
            r5.add(r6)
            goto L47
        L5d:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L69
            java.lang.String r2 = "Unexpected branching in enum static init block"
            r0.L(r2)
            return r7
        L69:
            be.k r4 = new be.k
            r4.<init>(r0, r5)
            java.lang.Object r5 = r4.f813b
            ud.e r5 = (ud.e) r5
            java.lang.Object r6 = r4.f814c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            od.a r8 = r5.f13690m
            ud.u r9 = r5.f13688k
            qd.j r8 = r8.f9765g
            java.util.List r10 = r5.f13698u
            java.util.stream.Stream r10 = r10.stream()
            a7.b r11 = new a7.b
            r12 = 3
            r11.<init>(r12)
            java.util.stream.Stream r10 = r10.filter(r11)
            a7.b r11 = new a7.b
            r12 = 4
            r11.<init>(r12)
            java.util.stream.Stream r10 = r10.filter(r11)
            be.i r11 = new be.i
            r12 = 1
            r11.<init>(r8, r12)
            java.util.stream.Stream r8 = r10.filter(r11)
            java.util.stream.Collector r10 = java.util.stream.Collectors.toList()
            java.lang.Object r8 = r8.collect(r10)
            java.util.List r8 = (java.util.List) r8
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto Lb6
            java.lang.String r0 = "$VALUES field not found"
            r5.L(r0)
            return r7
        Lb6:
            int r10 = r8.size()
            if (r10 <= r12) goto Lc5
            a7.b r10 = new a7.b
            r11 = 5
            r10.<init>(r11)
            r8.removeIf(r10)
        Lc5:
            int r10 = r8.size()
            if (r10 <= r12) goto Lef
            java.util.stream.Stream r10 = r8.stream()
            a7.b r11 = new a7.b
            r13 = 6
            r11.<init>(r13)
            java.util.stream.Stream r10 = r10.filter(r11)
            java.util.Optional r10 = r10.findAny()
            boolean r11 = r10.isPresent()
            if (r11 == 0) goto Lef
            r8.clear()
            java.lang.Object r10 = r10.get()
            ud.g r10 = (ud.g) r10
            r8.add(r10)
        Lef:
            int r10 = r8.size()
            if (r10 == r12) goto L103
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r2 = "Found several \"values\" enum fields: "
            java.lang.String r0 = r2.concat(r0)
            r5.L(r0)
            return r7
        L103:
            java.lang.Object r8 = r8.get(r7)
            ud.g r8 = (ud.g) r8
            r4.f815d = r8
            od.c r8 = r8.f13707l
            java.lang.Object r10 = r4.f812a
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L115:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L14d
            java.lang.Object r11 = r10.next()
            ud.a r11 = (ud.a) r11
            java.util.ArrayList r14 = r11.f13674l
            java.util.Iterator r14 = r14.iterator()
        L127:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L115
            java.lang.Object r15 = r14.next()
            ud.p r15 = (ud.p) r15
            pd.k r13 = r15.f13713k
            pd.k r12 = pd.k.N
            if (r13 != r12) goto L14b
            pd.j r15 = (pd.j) r15
            java.lang.Object r12 = r15.f10495o
            od.c r12 = (od.c) r12
            boolean r12 = r12.equals(r8)
            if (r12 == 0) goto L14b
            xe.b r8 = new xe.b
            r8.<init>(r11, r15)
            goto L14e
        L14b:
            r12 = 1
            goto L127
        L14d:
            r8 = 0
        L14e:
            if (r8 != 0) goto L152
            goto L38
        L152:
            ud.p r8 = r8.f21553b
            r4.f816e = r8
            qd.l r8 = r8.S(r7)
            r8.getClass()
            boolean r10 = r8 instanceof qd.m
            if (r10 == 0) goto L16a
            qd.m r8 = (qd.m) r8
            ud.p r8 = r8.f10904l
            java.util.List r8 = k(r4, r8)
            goto L16b
        L16a:
            r8 = 0
        L16b:
            if (r8 != 0) goto L173
            java.lang.String r2 = "Unknown enum class pattern. Please report as an issue!"
            r0.L(r2)
            return r7
        L173:
            java.lang.Object r10 = r4.f816e
            ud.p r10 = (ud.p) r10
            r6.add(r10)
            nd.h r10 = new nd.h
            r10.<init>(r8)
            r10.f9371h = r2
            r0.y(r10)
            java.util.Iterator r8 = r8.iterator()
        L188:
            boolean r10 = r8.hasNext()
            pd.k r12 = pd.k.M
            md.a r13 = md.a.f8838s
            if (r10 == 0) goto L294
            java.lang.Object r10 = r8.next()
            nd.g r10 = (nd.g) r10
            td.a r14 = r10.f9367b
            ud.g r15 = r10.f9366a
            od.c r11 = r15.f13707l
            qd.l r14 = r14.S(r7)
            r14.getClass()
            boolean r7 = r14 instanceof qd.m
            if (r7 == 0) goto L1b8
            qd.m r14 = (qd.m) r14
            ud.p r7 = r14.f10904l
            java.lang.Object r7 = xe.m.f(r3, r7)
            boolean r14 = r7 instanceof java.lang.String
            if (r14 == 0) goto L1b8
            java.lang.String r7 = (java.lang.String) r7
            goto L1b9
        L1b8:
            r7 = 0
        L1b9:
            if (r7 == 0) goto L1d3
            java.lang.String r14 = r11.f9776j
            boolean r14 = r14.equals(r7)
            if (r14 != 0) goto L1d3
            boolean r14 = kd.d.c(r7)
            if (r14 == 0) goto L1d3
            bc.g r14 = r3.f13742a
            boolean r14 = r14.a()
            if (r14 == 0) goto L1d3
            r11.f9776j = r7
        L1d3:
            r15.w(r13)
            td.a r7 = r10.f9367b
            od.d r14 = r7.f13119o
            od.a r15 = r14.f9780j
            r18 = r3
            od.a r3 = r5.f13690m
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L227
            ud.e r3 = r9.f(r15)
            if (r3 == 0) goto L227
            java.util.List r15 = r3.f13697t
            java.util.Iterator r15 = r15.iterator()
        L1f2:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L214
            java.lang.Object r19 = r15.next()
            r20 = r8
            r8 = r19
            ud.r r8 = (ud.r) r8
            r19 = r15
            b5.k r15 = r8.f13719m
            boolean r15 = r15.a()
            if (r15 == 0) goto L20f
            r8.w(r13)
        L20f:
            r15 = r19
            r8 = r20
            goto L1f2
        L214:
            r20 = r8
            r10.f9368c = r3
            ud.e r8 = r3.f13701x
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L229
            r5.S(r3)
            r3.w(r13)
            goto L229
        L227:
            r20 = r8
        L229:
            ud.r r3 = r9.i(r14)
            if (r3 == 0) goto L241
            r8 = 0
            nd.g0.b(r3, r8)
            od.d r8 = r3.f13717k
            java.util.List r8 = r8.f9779i
            int r8 = r8.size()
            r10 = 1
            if (r8 <= r10) goto L241
            nd.g0.b(r3, r10)
        L241:
            qd.r r3 = r7.f13714l
            if (r3 == 0) goto L28a
            qd.s r8 = r3.f10923m
            java.util.ArrayList r8 = r8.f10928j
            int r8 = r8.size()
            r10 = 2
            if (r8 > r10) goto L251
            goto L28a
        L251:
            qd.s r8 = r3.f10923m
            java.util.ArrayList r8 = r8.f10928j
            java.util.stream.Stream r8 = r8.stream()
            be.i r10 = new be.i
            r13 = 0
            r10.<init>(r4, r13)
            boolean r8 = r8.anyMatch(r10)
            if (r8 == 0) goto L28d
            pd.j r8 = new pd.j
            r8.<init>(r12, r11, r13)
            qd.r r3 = r3.c0()
            r8.d0(r3)
            java.util.List r3 = r2.f13732z
            java.util.Iterator r3 = r3.iterator()
        L277:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L28d
            java.lang.Object r10 = r3.next()
            ud.a r10 = (ud.a) r10
            boolean r10 = a.a.K0(r2, r10, r7, r8)
            if (r10 == 0) goto L277
            goto L28d
        L28a:
            r6.add(r7)
        L28d:
            r3 = r18
            r8 = r20
            r7 = 0
            goto L188
        L294:
            java.lang.Object r3 = r4.f815d
            ud.g r3 = (ud.g) r3
            r3.w(r13)
            xe.l.k(r2, r6)
            java.util.List r3 = r2.f13732z
            java.util.Iterator r3 = r3.iterator()
        L2a4:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L2b6
            java.lang.Object r5 = r3.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r5 = r5.f13674l
            xe.l.e(r5, r6)
            goto L2a4
        L2b6:
            ud.p[] r3 = r2.f13731y
            if (r3 == 0) goto L2bd
            int r3 = r3.length
            long r9 = (long) r3
            goto L2d5
        L2bd:
            java.util.List r3 = r2.f13732z
            if (r3 == 0) goto L2d3
            java.util.stream.Stream r3 = r3.stream()
            ud.q r5 = new ud.q
            r5.<init>()
            java.util.stream.LongStream r3 = r3.mapToLong(r5)
            long r9 = r3.sum()
            goto L2d5
        L2d3:
            r9 = -1
        L2d5:
            r14 = 0
            int r3 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r3 != 0) goto L2df
            r2.w(r13)
            goto L2e8
        L2df:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L2e8
            be.b.Y(r2)
        L2e8:
            java.lang.Object r2 = r4.f815d
            ud.g r2 = (ud.g) r2
            od.a r3 = r0.f13690m
            qd.j r5 = r3.f9765g
            qd.g r3 = qd.j.f10868b
            qd.a r3 = new qd.a
            r3.<init>(r5)
            java.lang.String r3 = fd.j.b(r3)
            java.lang.String r4 = "values()"
            java.lang.String r3 = r4.concat(r3)
            java.util.List r4 = r0.f13697t
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L308:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L427
            java.lang.Object r9 = r4.next()
            ud.r r9 = (ud.r) r9
            od.d r10 = r9.f13717k
            boolean r11 = r10.e()
            java.lang.String r7 = r10.f9781k
            if (r11 != 0) goto L308
            boolean r8 = r9.f13722p
            if (r8 == 0) goto L323
            goto L308
        L323:
            boolean r8 = r10.f()
            if (r8 == 0) goto L372
            java.lang.String r8 = "<init>(Ljava/lang/String;I)V"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L339
            java.lang.String r8 = "<init>(Ljava/lang/String;)V"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L35f
        L339:
            ud.p[] r7 = r9.f13731y
            if (r7 == 0) goto L340
            int r7 = r7.length
            long r7 = (long) r7
            goto L358
        L340:
            java.util.List r7 = r9.f13732z
            if (r7 == 0) goto L356
            java.util.stream.Stream r7 = r7.stream()
            ud.q r8 = new ud.q
            r8.<init>()
            java.util.stream.LongStream r7 = r7.mapToLong(r8)
            long r7 = r7.sum()
            goto L358
        L356:
            r7 = -1
        L358:
            int r7 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r7 != 0) goto L35f
            r9.w(r13)
        L35f:
            r8 = 0
            nd.g0.b(r9, r8)
            od.d r7 = r9.f13717k
            java.util.List r7 = r7.f9779i
            int r7 = r7.size()
            r10 = 1
            if (r7 <= r10) goto L308
            nd.g0.b(r9, r10)
            goto L308
        L372:
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L395
            boolean r7 = r1.l(r9, r5)
            if (r7 == 0) goto L382
            r9.w(r13)
            goto L3c4
        L382:
            java.lang.String r7 = "valuesCustom"
            r10.f9784n = r7
            nd.f0 r7 = new nd.f0
            r7.<init>(r9)
            java.lang.String r8 = "to resolve conflict with enum method"
            r7.b(r8)
            r9.y(r7)
            goto L308
        L395:
            boolean r7 = r1.l(r9, r5)
            if (r7 == 0) goto L3c7
            java.lang.String r6 = r10.f9784n
            java.lang.String r7 = "values"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L3c1
            java.util.List r6 = r9.H
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L3c1
            r10.f9784n = r7
            nd.f0 r6 = new nd.f0
            r6.<init>(r9)
            java.lang.String r7 = "to match enum method name"
            r6.b(r7)
            r9.y(r6)
            md.a r6 = md.a.f8843x
            r9.w(r6)
        L3c1:
            r9.w(r13)
        L3c4:
            r6 = r9
            goto L308
        L3c7:
            a7.b r7 = new a7.b
            r8 = 7
            r7.<init>(r8)
            mh.b r8 = xe.m.f21571a
            boolean r8 = r9.f13722p
            if (r8 != 0) goto L3e5
            ud.a r8 = r9.C
            java.util.List r8 = r8.f13675m
            int r8 = r8.size()
            r10 = 1
            if (r8 != r10) goto L3e5
            pd.k r8 = pd.k.f10507p
            ud.p r7 = xe.m.m(r9, r8, r7)
            goto L3e6
        L3e5:
            r7 = 0
        L3e6:
            if (r7 != 0) goto L3ea
            goto L308
        L3ea:
            qd.l r7 = xe.m.g(r7)
            ud.p r7 = xe.m.h(r7)
            pd.k r8 = pd.k.A
            ud.p r7 = xe.m.a(r7, r8)
            pd.j r7 = (pd.j) r7
            if (r7 == 0) goto L308
            java.lang.Object r8 = r7.f10495o
            boolean r8 = java.util.Objects.equals(r8, r5)
            if (r8 == 0) goto L308
            qd.l r7 = xe.m.g(r7)
            ud.p r7 = xe.m.h(r7)
            pd.k r8 = pd.k.O
            ud.p r7 = xe.m.a(r7, r8)
            pd.n r7 = (pd.n) r7
            if (r7 == 0) goto L308
            od.d r7 = r7.f10526p
            java.lang.Comparable r8 = r1.f821h
            od.d r8 = (od.d) r8
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L308
            r9.w(r13)
            goto L308
        L427:
            od.c r2 = r2.f13707l
            java.util.List r0 = r0.f13697t
            java.util.Iterator r7 = r0.iterator()
        L42f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4a1
            java.lang.Object r0 = r7.next()
            r4 = r0
            ud.r r4 = (ud.r) r4
            od.d r0 = r4.f13717k
            boolean r3 = r0.f()
            if (r3 != 0) goto L450
            boolean r0 = r0.e()
            if (r0 != 0) goto L450
            boolean r0 = r4.f13722p
            if (r0 != 0) goto L450
            if (r4 != r6) goto L454
        L450:
            r3 = r6
            r10 = 2
        L452:
            r6 = r2
            goto L49c
        L454:
            be.i r0 = new be.i
            r10 = 2
            r0.<init>(r2, r10)
            ud.p r3 = xe.m.m(r4, r12, r0)
            if (r3 != 0) goto L462
            r3 = r6
            goto L452
        L462:
            r3 = r6
            r6 = r2
            r2 = r0
            be.j r0 = new be.j
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.List r1 = r4.f13732z
            java.util.Iterator r1 = r1.iterator()
        L470:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49c
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r8 = r2.f13674l
            int r9 = r8.size()
            r11 = 0
        L483:
            if (r11 >= r9) goto L470
            java.lang.Object r13 = r8.get(r11)
            ud.p r13 = (ud.p) r13
            xe.m.l(r4, r13, r0)
            java.lang.Object r13 = r0.apply(r13)
            ud.p r13 = (ud.p) r13
            if (r13 == 0) goto L499
            a.a.J0(r4, r2, r11, r13)
        L499:
            int r11 = r11 + 1
            goto L483
        L49c:
            r1 = r21
            r2 = r6
            r6 = r3
            goto L42f
        L4a1:
            r16 = 1
            return r16
        L4a4:
            return r17
    }

    public boolean l(ud.r r4, qd.j r5) {
            r3 = this;
            qd.j r0 = r4.f13726t
            r0.getClass()
            boolean r1 = r0 instanceof qd.a
            if (r1 == 0) goto L68
            qd.j r0 = r0.g()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L14
            goto L68
        L14:
            ud.p r4 = a.a.f0(r4)
            if (r4 == 0) goto L68
            pd.k r0 = r4.f13713k
            pd.k r1 = pd.k.f10507p
            if (r0 != r1) goto L68
            java.util.List r0 = r4.f13715m
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L2a
            goto L68
        L2a:
            qd.l r4 = xe.m.g(r4)
            ud.p r4 = xe.m.h(r4)
            pd.k r0 = pd.k.A
            ud.p r4 = xe.m.a(r4, r0)
            pd.j r4 = (pd.j) r4
            if (r4 == 0) goto L68
            java.lang.Object r0 = r4.f10495o
            qd.a r2 = new qd.a
            r2.<init>(r5)
            boolean r5 = java.util.Objects.equals(r0, r2)
            if (r5 == 0) goto L68
            qd.l r4 = xe.m.g(r4)
            ud.p r4 = xe.m.h(r4)
            pd.k r5 = pd.k.O
            ud.p r4 = xe.m.a(r4, r5)
            pd.n r4 = (pd.n) r4
            if (r4 == 0) goto L68
            od.d r4 = r4.f10526p
            java.lang.Object r5 = r3.f822i
            od.d r5 = (od.d) r5
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L68
            return r1
        L68:
            r4 = 0
            return r4
    }
}
