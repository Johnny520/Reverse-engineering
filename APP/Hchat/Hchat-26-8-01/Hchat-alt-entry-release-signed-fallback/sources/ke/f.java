package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends be.a implements ke.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f7594g = null;

    static {
            java.lang.Class<ke.f> r0 = ke.f.class
            mh.b r0 = mh.d.b(r0)
            ke.f.f7594g = r0
            return
    }

    public static boolean i(ud.r r4, zd.c r5, qd.r r6) {
            ud.p r6 = r6.f0()
            if (r6 != 0) goto L7
            goto L48
        L7:
            qd.r r0 = r6.f13714l
            ud.p r0 = r0.f10903j
            r1 = 0
            if (r0 != 0) goto L10
        Le:
            r0 = r1
            goto L24
        L10:
            java.util.List r2 = r4.f13732z
            ud.a r2 = a.a.S(r4, r0, r2)
            if (r2 != 0) goto L20
            mh.b r2 = ke.f.f7594g
            java.lang.String r3 = " LoopRegionVisitor: instruction not found: {}, mth: {}"
            r2.y(r0, r3, r4)
            goto Le
        L20:
            boolean r0 = f8.i.Z(r2, r5)
        L24:
            if (r0 != 0) goto L27
            goto L47
        L27:
            boolean r0 = r6 instanceof pd.q
            if (r0 == 0) goto L48
            pd.q r6 = (pd.q) r6
            java.util.List r6 = r6.f13715m
            java.util.Iterator r6 = r6.iterator()
        L33:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r6.next()
            qd.l r0 = (qd.l) r0
            qd.r r0 = (qd.r) r0
            boolean r0 = i(r4, r5, r0)
            if (r0 != 0) goto L33
        L47:
            return r1
        L48:
            r4 = 1
            return r4
    }

    public static boolean j(ud.p r2, java.lang.String r3, java.lang.String r4) {
            if (r2 != 0) goto L3
            goto L2a
        L3:
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.O
            if (r0 != r1) goto L2a
            pd.n r2 = (pd.n) r2
            od.d r0 = r2.f10526p
            int r2 = r2.f10525o
            r1 = 4
            if (r2 == r1) goto L15
            r1 = 3
            if (r2 != r1) goto L2a
        L15:
            java.lang.String r2 = r0.f9781k
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L2a
            if (r3 != 0) goto L21
            r2 = 1
            return r2
        L21:
            od.a r2 = r0.f9780j
            java.lang.String r2 = r2.f9768j
            boolean r2 = r2.equals(r3)
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static boolean k(ud.r r4, qd.l r5, qd.r r6) {
            qd.j r0 = r5.I()
            qd.j r1 = r6.I()
            boolean r2 = r0.t()
            r3 = 1
            if (r2 == 0) goto L62
            java.util.List r5 = r0.j()
            r0 = 0
            if (r5 == 0) goto L61
            int r2 = r5.size()
            if (r2 == r3) goto L1d
            goto L61
        L1d:
            java.lang.Object r5 = r5.get(r0)
            qd.j r5 = (qd.j) r5
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L2b
            goto Lac
        L2b:
            boolean r2 = r5 instanceof qd.c
            if (r2 == 0) goto L33
            r6.W(r5)
            return r3
        L33:
            ud.e r6 = r4.f13718l
            ud.u r6 = r6.f13688k
            boolean r6 = qd.j.u(r6, r5, r1)
            if (r6 == 0) goto L3f
            goto Lac
        L3f:
            qd.j r6 = r5.r()
            if (r6 == 0) goto L56
            int r2 = r5.q()
            if (r2 != r3) goto L56
            ud.e r2 = r4.f13718l
            ud.u r2 = r2.f13688k
            boolean r6 = qd.j.u(r2, r6, r1)
            if (r6 == 0) goto L56
            goto Lac
        L56:
            java.lang.String r6 = "Generic type differs: '{}' and '{}' in {}"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r1, r4}
            mh.b r5 = ke.f.f7594g
            r5.i(r6, r4)
        L61:
            return r0
        L62:
            boolean r4 = r5 instanceof qd.r
            if (r4 == 0) goto Lac
            boolean r6 = r0.v()
            if (r6 != 0) goto L6d
            goto Lac
        L6d:
            java.lang.String r6 = r0.l()
            java.util.List r0 = java.util.Collections.singletonList(r1)
            qd.b r2 = new qd.b
            java.lang.String r6 = xe.s.b(r6)
            r2.<init>(r6, r0)
            if (r4 == 0) goto La9
            r4 = r5
            qd.r r4 = (qd.r) r4
            qd.s r6 = r4.f10923m
            if (r6 == 0) goto L8c
            qd.j r4 = r6.d()
            goto L9a
        L8c:
            md.a r6 = md.a.N
            md.f r0 = r4.f8877g
            boolean r6 = r0.a(r6)
            if (r6 == 0) goto L99
            qd.j r4 = r4.f10902i
            goto L9a
        L99:
            r4 = 0
        L9a:
            if (r4 == 0) goto La9
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto La9
            qd.e r4 = qd.j.f10877k
            boolean r4 = r1.equals(r4)
            return r4
        La9:
            r5.W(r2)
        Lac:
            return r3
    }

    public static boolean l(ud.r r4, zd.c r5, qd.r r6) {
            qd.s r6 = r6.f10923m
            java.util.ArrayList r6 = r6.f10928j
            java.util.Iterator r6 = r6.iterator()
        L8:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r6.next()
            qd.r r0 = (qd.r) r0
            ud.p r0 = r0.f10903j
            r1 = 0
            if (r0 != 0) goto L1b
        L19:
            r0 = r1
            goto L2f
        L1b:
            java.util.List r2 = r4.f13732z
            ud.a r2 = a.a.S(r4, r0, r2)
            if (r2 != 0) goto L2b
            mh.b r2 = ke.f.f7594g
            java.lang.String r3 = " LoopRegionVisitor: instruction not found: {}, mth: {}"
            r2.y(r0, r3, r4)
            goto L19
        L2b:
            boolean r0 = f8.i.Z(r2, r5)
        L2f:
            if (r0 != 0) goto L8
            return r1
        L32:
            r4 = 1
            return r4
    }

    @Override // ke.e
    public final boolean a(ud.r r17, ud.n r18) {
            r16 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof zd.c
            r3 = 1
            if (r2 == 0) goto L3b8
            zd.c r1 = (zd.c) r1
            boolean r2 = r1.f22667n
            if (r2 == 0) goto L11
            goto L3b8
        L11:
            yd.b r2 = r1.f22417k
            if (r2 != 0) goto L17
            goto L3b8
        L17:
            nd.t r4 = r1.f22666m
            ud.a r4 = r4.f9393b
            ud.a r4 = a.a.O0(r4)
            ud.p r4 = a.a.c0(r4)
            r5 = 0
            r6 = 0
            md.a r7 = md.a.S
            r8 = 2
            md.a r9 = md.a.f8838s
            if (r4 != 0) goto L2e
            goto L294
        L2e:
            qd.r r10 = r4.f13714l
            if (r10 == 0) goto L294
            qd.s r11 = r10.f10923m
            if (r11 == 0) goto L294
            boolean r11 = r11.j()
            if (r11 != 0) goto L3e
            goto L294
        L3e:
            qd.s r11 = r10.f10923m
            java.util.ArrayList r11 = r11.f10929k
            if (r11 != 0) goto L46
            java.util.List r11 = java.util.Collections.EMPTY_LIST
        L46:
            int r12 = r11.size()
            if (r12 == r3) goto L4e
            goto L294
        L4e:
            java.lang.Object r11 = r11.get(r5)
            pd.q r11 = (pd.q) r11
            java.util.List r12 = r11.f13715m
            int r12 = r12.size()
            if (r12 != r8) goto L294
            java.util.List r12 = r11.f13715m
            int r13 = r12.size()
            if (r13 != 0) goto L66
            r12 = r5
            goto L6a
        L66:
            boolean r12 = xe.m.b(r12, r10)
        L6a:
            if (r12 == 0) goto L294
            qd.s r10 = r10.f10923m
            java.util.ArrayList r10 = r10.f10928j
            int r10 = r10.size()
            if (r10 == r3) goto L78
            goto L294
        L78:
            qd.r r10 = r11.f13714l
            java.util.ArrayList r12 = r2.J()
            boolean r12 = r12.contains(r10)
            if (r12 == 0) goto L294
            qd.s r12 = r10.f10923m
            boolean r12 = r12.j()
            if (r12 == 0) goto L8e
            goto L294
        L8e:
            qd.r r11 = r11.j0(r5)
            ud.p r12 = r11.f0()
            if (r12 == 0) goto L294
            md.f r13 = r12.f8877g
            boolean r13 = r13.a(r9)
            if (r13 != 0) goto L294
            qd.s r11 = r11.f10923m
            java.util.ArrayList r11 = r11.f10928j
            int r11 = r11.size()
            if (r11 == r3) goto Lac
            goto L294
        Lac:
            boolean r10 = l(r0, r1, r10)
            if (r10 != 0) goto Lb4
            goto L294
        Lb4:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.U(r10)
            java.util.Iterator r10 = r10.iterator()
        Lc0:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Ldc
            java.lang.Object r11 = r10.next()
            qd.r r11 = (qd.r) r11
            boolean r11 = i(r0, r1, r11)     // Catch: java.lang.StackOverflowError -> Ld4
            if (r11 == 0) goto Lc0
            goto L294
        Ld4:
            af.f r0 = new af.f
            java.lang.String r1 = "LoopRegionVisitor.assignOnlyInLoop endless recursion"
            r0.<init>(r1)
            throw r0
        Ldc:
            r12.w(r9)
            r4.w(r9)
            boolean r8 = r4 instanceof pd.a
            if (r8 != 0) goto Le8
            goto L288
        Le8:
            r8 = r4
            pd.a r8 = (pd.a) r8
            int r8 = r8.f10475o
            if (r8 == r3) goto Lf1
            goto L288
        Lf1:
            qd.l r8 = r4.S(r3)
            r8.getClass()
            boolean r10 = r8 instanceof qd.n
            if (r10 == 0) goto L288
            qd.n r8 = (qd.n) r8
            long r10 = r8.f10905l
            r13 = 1
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 == 0) goto L108
            goto L288
        L108:
            pd.k r8 = r12.f13713k
            pd.k r10 = pd.k.f10498g
            if (r8 != r10) goto L288
            qd.l r8 = r12.S(r5)
            r8.getClass()
            boolean r8 = r8 instanceof qd.n
            if (r8 == 0) goto L288
            qd.l r8 = r12.S(r5)
            qd.n r8 = (qd.n) r8
            long r10 = r8.f10905l
            r13 = 0
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 == 0) goto L129
            goto L288
        L129:
            qd.l r8 = r4.S(r5)
            r8.getClass()
            boolean r10 = r8 instanceof qd.r
            if (r10 != 0) goto L136
            goto L288
        L136:
            qd.r r8 = (qd.r) r8
            qd.s r8 = r8.f10923m
            java.util.ArrayList r8 = r8.f10928j
            int r10 = r8.size()
            r11 = 3
            if (r10 == r11) goto L145
            goto L288
        L145:
            mh.b r10 = xe.m.f21571a
            java.util.Iterator r10 = r8.iterator()
        L14b:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L162
            java.lang.Object r13 = r10.next()
            qd.r r13 = (qd.r) r13
            ud.p r14 = r13.f10903j
            if (r14 == 0) goto L14b
            pd.k r14 = r14.f13713k
            pd.k r15 = pd.k.f10513v
            if (r14 != r15) goto L14b
            goto L163
        L162:
            r13 = r6
        L163:
            if (r13 != 0) goto L167
            goto L288
        L167:
            java.util.Iterator r8 = r8.iterator()
        L16b:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L182
            java.lang.Object r10 = r8.next()
            qd.r r10 = (qd.r) r10
            ud.p r14 = r10.f10903j
            if (r14 == 0) goto L16b
            pd.k r14 = r14.f13713k
            pd.k r15 = pd.k.G
            if (r14 != r15) goto L16b
            goto L183
        L182:
            r10 = r6
        L183:
            if (r10 != 0) goto L187
            goto L288
        L187:
            ud.p r8 = r10.f10903j
            if (r8 == 0) goto L288
            java.util.List r10 = r8.f13715m
            java.util.Iterator r10 = r10.iterator()
        L191:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L1a6
            java.lang.Object r14 = r10.next()
            qd.l r14 = (qd.l) r14
            r14.getClass()
            boolean r14 = r14 instanceof qd.m
            if (r14 == 0) goto L191
            goto L288
        L1a6:
            boolean r10 = r2.L()
            if (r10 != 0) goto L1ae
            goto L288
        L1ae:
            xe.e r2 = r2.f22421k
            java.lang.Object r10 = r2.f21559b
            pd.i r10 = (pd.i) r10
            int r14 = r10.f10492p
            if (r14 != r11) goto L288
            qd.l r10 = r10.S(r5)
            if (r10 == r13) goto L1c0
            goto L288
        L1c0:
            qd.l r10 = r2.a()
            r10.getClass()
            boolean r11 = r10 instanceof qd.m
            if (r11 == 0) goto L1d1
            r11 = r10
            qd.m r11 = (qd.m) r11
            ud.p r11 = r11.f10904l
            goto L1dc
        L1d1:
            boolean r11 = r10 instanceof qd.r
            if (r11 == 0) goto L288
            r11 = r10
            qd.r r11 = (qd.r) r11
            ud.p r11 = r11.f0()
        L1dc:
            if (r11 == 0) goto L288
            pd.k r14 = r11.f13713k
            pd.k r15 = pd.k.C
            if (r14 == r15) goto L1e6
            goto L288
        L1e6:
            qd.l r14 = r11.S(r5)
            qd.l r15 = r8.S(r5)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L1f6
            goto L288
        L1f6:
            qd.r r14 = r8.f13714l
            if (r14 == 0) goto L202
            boolean r7 = l(r0, r1, r14)
            if (r7 != 0) goto L22b
            goto L288
        L202:
            md.f r14 = r8.f8877g
            boolean r7 = r14.a(r7)
            if (r7 != 0) goto L20c
            goto L288
        L20c:
            qd.l r7 = a.a.M0(r0, r8)
            if (r7 == 0) goto L27b
            ud.p r14 = r7.f10903j
            if (r14 != 0) goto L217
            goto L27b
        L217:
            qd.j r6 = r7.I()
            qd.r r14 = r0.c0(r6)
            ud.p r6 = r7.f10903j
            qd.r r15 = r14.c0()
            r6.b0(r7, r15)
            r6.Z()
        L22b:
            qd.r r6 = r4.f13714l
            r6.w(r9)
            r13.w(r9)
            r10.w(r9)
            r8.w(r9)
            java.lang.Object r2 = r2.f21559b
            pd.i r2 = (pd.i) r2
            r2.w(r9)
            zd.a r6 = new zd.a
            qd.l r2 = r11.S(r5)
            r6.<init>(r2, r14)
            r6.P(r1)
            qd.r r2 = r11.f13714l
            if (r2 == 0) goto L271
            qd.s r2 = r2.f10923m
            java.util.ArrayList r2 = r2.f10928j
            java.util.Iterator r2 = r2.iterator()
        L258:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L271
            java.lang.Object r5 = r2.next()
            qd.r r5 = (qd.r) r5
            ud.p r5 = r5.f10903j
            if (r5 == 0) goto L258
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r9)
            if (r5 != 0) goto L258
            goto L277
        L271:
            r11.w(r9)
            xe.l.d(r0, r11)
        L277:
            be.b.Y(r0)
            goto L288
        L27b:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.String r5 = "checkArrayForEach: Wrapped insn not found: "
            java.lang.String r2 = r5.concat(r2)
            r0.L(r2)
        L288:
            if (r6 == 0) goto L28b
            goto L290
        L28b:
            zd.b r6 = new zd.b
            r6.<init>(r12, r4)
        L290:
            r1.f22671r = r6
            goto L3b3
        L294:
            java.util.ArrayList r2 = r2.J()
            int r4 = r2.size()
            if (r4 == r3) goto L2a0
            goto L3b8
        L2a0:
            java.lang.Object r2 = r2.get(r5)
            qd.r r2 = (qd.r) r2
            qd.s r4 = r2.f10923m
            if (r4 == 0) goto L3b8
            boolean r10 = r4.j()
            if (r10 == 0) goto L2b2
            goto L3b8
        L2b2:
            java.util.ArrayList r4 = r4.f10928j
            ud.p r2 = r2.f0()
            int r10 = r4.size()
            if (r10 == r8) goto L2c0
            goto L3b8
        L2c0:
            java.lang.String r8 = "iterator()Ljava/util/Iterator;"
            boolean r8 = j(r2, r6, r8)
            if (r8 != 0) goto L2ca
            goto L3b8
        L2ca:
            qd.l r8 = r2.S(r5)
            java.lang.Object r5 = r4.get(r5)
            qd.r r5 = (qd.r) r5
            ud.p r5 = r5.f10903j
            java.lang.Object r10 = r4.get(r3)
            qd.r r10 = (qd.r) r10
            ud.p r10 = r10.f10903j
            java.lang.String r11 = "hasNext()Z"
            java.lang.String r12 = "java.util.Iterator"
            boolean r5 = j(r5, r12, r11)
            if (r5 == 0) goto L3b8
            java.lang.String r5 = "next()Ljava/lang/Object;"
            boolean r5 = j(r10, r12, r5)
            if (r5 != 0) goto L2f2
            goto L3b8
        L2f2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            md.f r11 = r10.f8877g
            boolean r7 = r11.a(r7)
            if (r7 == 0) goto L361
            qd.l r7 = a.a.M0(r0, r10)
            if (r7 == 0) goto L359
            ud.p r11 = r7.f10903j
            if (r11 == 0) goto L359
            java.util.List r12 = r0.f13732z
            ud.a r12 = a.a.S(r0, r11, r12)
            if (r12 != 0) goto L313
            goto L3b8
        L313:
            boolean r12 = f8.i.Z(r12, r1)
            if (r12 != 0) goto L31b
            goto L3b8
        L31b:
            pd.k r12 = r11.f13713k
            pd.k r13 = pd.k.A
            if (r12 != r13) goto L33f
            qd.r r7 = r11.f13714l
            if (r7 == 0) goto L3b8
            boolean r10 = k(r0, r8, r7)
            if (r10 != 0) goto L32d
            goto L3b8
        L32d:
            qd.l r10 = a.a.M0(r0, r11)
            if (r10 == 0) goto L33b
            ud.p r12 = r10.f10903j
            if (r12 == 0) goto L33b
            r12.b0(r10, r7)
            goto L377
        L33b:
            r5.add(r11)
            goto L377
        L33f:
            qd.r r12 = r10.f13714l
            if (r12 != 0) goto L345
            goto L3b8
        L345:
            md.a r13 = md.a.f8840u
            r12.D(r13)
            r10.w(r9)
            boolean r10 = k(r0, r8, r12)
            if (r10 != 0) goto L354
            goto L3b8
        L354:
            r11.b0(r7, r12)
            r7 = r12
            goto L377
        L359:
            mh.b r1 = ke.f.f7594g
            java.lang.String r2 = " checkIterableForEach: Wrapped insn not found: {}, mth: {}"
            r1.s(r10, r2, r0)
            return r3
        L361:
            qd.r r7 = r10.f13714l
            if (r7 != 0) goto L366
            goto L3b8
        L366:
            boolean r11 = l(r0, r1, r7)
            if (r11 != 0) goto L36d
            goto L3b8
        L36d:
            boolean r11 = i(r0, r1, r7)
            if (r11 != 0) goto L374
            goto L3b8
        L374:
            r5.add(r10)
        L377:
            r2.w(r9)
            qd.r r2 = r2.f13714l
            r2.w(r9)
            java.util.Iterator r2 = r5.iterator()
        L383:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L395
            java.lang.Object r5 = r2.next()
            ud.p r5 = (ud.p) r5
            r5.f13714l = r6
            r5.w(r9)
            goto L383
        L395:
            java.util.Iterator r2 = r4.iterator()
        L399:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L3a9
            java.lang.Object r4 = r2.next()
            qd.r r4 = (qd.r) r4
            r4.w(r9)
            goto L399
        L3a9:
            zd.a r2 = new zd.a
            r2.<init>(r8, r7)
            r2.P(r1)
            r1.f22671r = r2
        L3b3:
            md.a r1 = md.a.f8813a0
            r0.w(r1)
        L3b8:
            return r3
    }

    @Override // ke.e
    public final void b(ud.r r1, ud.n r2) {
            r0 = this;
            return
    }

    @Override // ke.e
    public final void d(ud.r r1, ud.h r2) {
            r0 = this;
            return
    }

    @Override // be.a
    public final void g(ud.r r3) {
            r2 = this;
            xd.b r0 = r3.G
            x6.d.h0(r3, r2, r0)
            md.f r0 = r3.f8877g
            md.a r1 = md.a.f8813a0
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L1b
            ke.c.r(r3)     // Catch: java.lang.Throwable -> L16
            r3.D(r1)
            return
        L16:
            r0 = move-exception
            r3.D(r1)
            throw r0
        L1b:
            return
    }
}
