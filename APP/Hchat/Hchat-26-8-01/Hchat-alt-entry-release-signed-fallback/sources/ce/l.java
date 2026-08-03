package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f1650g = null;

    static {
            java.lang.Class<ce.l> r0 = ce.l.class
            mh.b r0 = mh.d.b(r0)
            ce.l.f1650g = r0
            return
    }

    public static void i(ud.r r3) {
            java.util.List r0 = r3.f13732z
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.List r2 = r1.f13675m
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            ud.a r2 = r3.B
            if (r1 != r2) goto L1f
            goto L6
        L1f:
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Unreachable block: "
            java.lang.String r3 = r0.concat(r3)
            ah.a.k(r3)
        L2c:
            return
    }

    public static void j(ud.r r9) {
            java.util.List r0 = r9.f13732z
            ae.e r1 = new ae.e
            r2 = 12
            r1.<init>(r2)
            r0.forEach(r1)
            java.util.List r0 = r9.f13732z
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            be.m0 r2 = new be.m0
            r3 = 3
            r2.<init>(r3, r1)
            ud.a r3 = r9.B
            ae.d r4 = new ae.d
            r5 = 28
            r4.<init>(r5)
            a.a.d1(r9, r3, r4, r2)
            int r2 = r1.size()
            if (r2 != r0) goto L94
            r9.f13732z = r1
            r9.f0()
            ae.d r0 = new ae.d
            r2 = 27
            r0.<init>(r2)
            ud.a[] r0 = f8.i.h(r1, r0)
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            ud.a r2 = (ud.a) r2
            xe.g r3 = xe.g.f21560g
            r2.f13678p = r3
            r3 = 0
            r2.f13681s = r3
            int r2 = r1.size()
            r3 = 1
        L52:
            if (r3 >= r2) goto L87
            java.lang.Object r4 = r1.get(r3)
            ud.a r4 = (ud.a) r4
            r5 = r0[r3]
            r4.f13681s = r5
            java.util.List r6 = r5.f13683u
            r6.add(r4)
            java.util.BitSet r6 = new java.util.BitSet
            int r7 = r0.length
            r6.<init>(r7)
        L69:
            int r7 = r5.f13672j
            boolean r8 = r6.get(r7)
            if (r8 == 0) goto L72
            goto L7c
        L72:
            r6.set(r7)
            java.util.BitSet r5 = r5.f13678p
            if (r5 == 0) goto L84
            r6.or(r5)
        L7c:
            r6.clear(r3)
            r4.f13678p = r6
            int r3 = r3 + 1
            goto L52
        L84:
            r5 = r0[r7]
            goto L69
        L87:
            java.util.List r9 = r9.f13732z
            ae.e r0 = new ae.e
            r1 = 13
            r0.<init>(r1)
            r9.forEach(r0)
            return
        L94:
            java.lang.String r9 = "Found unreachable blocks"
            ah.a.k(r9)
            return
    }

    public static void k(java.util.LinkedHashSet r3, ud.a r4, ud.r r5) {
            java.util.List r0 = r4.f13675m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            ud.a r5 = r5.B
            if (r4 == r5) goto L4b
            java.util.EnumSet r0 = ce.m.f1651g
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r0.add(r4)
        L16:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L4b
            java.lang.Object r4 = r0.pop()
            ud.a r4 = (ud.a) r4
            boolean r1 = r3.contains(r4)
            if (r1 != 0) goto L16
            r3.add(r4)
            java.util.List r4 = r4.f13676n
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r4.next()
            ud.a r1 = (ud.a) r1
            if (r1 == r5) goto L31
            java.util.List r2 = r1.f13675m
            boolean r2 = r3.containsAll(r2)
            if (r2 == 0) goto L31
            r0.push(r1)
            goto L31
        L4b:
            return
    }

    public static boolean l(java.util.List r2, qd.l r3) {
            r3.getClass()
            boolean r0 = r3 instanceof qd.r
            if (r0 == 0) goto L37
            qd.r r3 = (qd.r) r3
            int r3 = r3.f10922l
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            ud.a r0 = (ud.a) r0
            java.util.ArrayList r0 = r0.f13674l
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            qd.r r1 = r1.f13714l
            if (r1 == 0) goto L21
            int r1 = r1.f10922l
            if (r1 != r3) goto L21
            r2 = 1
            return r2
        L37:
            r2 = 0
            return r2
    }

    public static boolean m(ud.r r16) {
            r0 = r16
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            md.a r3 = md.a.f8831m
            r4 = -1
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L17b
            java.lang.Object r2 = r1.next()
            ud.a r2 = (ud.a) r2
            md.a r7 = md.a.f8827k
            md.f r8 = r2.f8877g
            boolean r7 = r8.a(r7)
            if (r7 != 0) goto L25
            goto L177
        L25:
            md.b r7 = md.b.f8871z
            md.f r8 = r2.f8877g
            java.util.List r7 = r8.d(r7)
            int r8 = r7.size()
            if (r8 != 0) goto L35
            goto L177
        L35:
            java.util.Iterator r9 = r7.iterator()
        L39:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L7f
            java.lang.Object r10 = r9.next()
            nd.t r10 = (nd.t) r10
            java.util.ArrayList r10 = r10.a()
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L79
            java.util.Iterator r10 = r10.iterator()
            r11 = r5
        L54:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L7a
            java.lang.Object r12 = r10.next()
            ud.f r12 = (ud.f) r12
            ud.a r13 = r12.f13705b
            ud.a r12 = r12.f13704a
            md.f r14 = r13.f8877g
            boolean r14 = r14.a(r3)
            if (r14 != 0) goto L54
            md.f r14 = r12.f8877g
            boolean r14 = r14.a(r3)
            if (r14 != 0) goto L54
            ce.m.o(r0, r12, r13)
            r11 = r6
            goto L54
        L79:
            r11 = r5
        L7a:
            if (r11 == 0) goto L39
        L7c:
            r5 = r6
            goto L177
        L7f:
            if (r8 <= r6) goto Lbd
            java.util.Iterator r9 = r7.iterator()
        L85:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L97
            java.lang.Object r10 = r9.next()
            nd.t r10 = (nd.t) r10
            ud.a r10 = r10.f9392a
            if (r10 == r2) goto L85
            r2 = r5
            goto Lba
        L97:
            int r9 = r2.f13673k
            ud.a r9 = ce.m.s(r0, r9)
            r9.w(r3)
            ce.m.j(r9, r2)
            java.util.Iterator r10 = r7.iterator()
        La7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb9
            java.lang.Object r11 = r10.next()
            nd.t r11 = (nd.t) r11
            ud.a r11 = r11.f9393b
            ce.m.r(r11, r2, r9)
            goto La7
        Lb9:
            r2 = r6
        Lba:
            if (r2 == 0) goto Lbd
            goto L7c
        Lbd:
            if (r8 != r6) goto L177
            java.lang.Object r2 = r7.get(r5)
            nd.t r2 = (nd.t) r2
            ud.a r7 = r2.f9393b
            ud.a r2 = r2.f9392a
            java.util.List r8 = r7.f13675m
            int r9 = r8.size()
            if (r9 <= r6) goto Lf4
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            java.util.Iterator r8 = r9.iterator()
            r9 = r5
        Ldb:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lf5
            java.lang.Object r10 = r8.next()
            ud.a r10 = (ud.a) r10
            md.f r11 = r10.f8877g
            boolean r11 = r11.a(r3)
            if (r11 != 0) goto Ldb
            ce.m.o(r0, r10, r7)
            r9 = r6
            goto Ldb
        Lf4:
            r9 = r5
        Lf5:
            if (r9 != 0) goto L7c
            java.util.List r8 = r2.f13675m
            int r9 = r8.size()
            int r9 = r9 - r6
            if (r9 != r6) goto L102
            r8 = r5
            goto L154
        L102:
            if (r9 != 0) goto L12e
            md.f r8 = r2.f8877g
            md.a r9 = md.a.f8819g
            boolean r8 = r8.a(r9)
            if (r8 != 0) goto L11b
            java.lang.String r8 = java.lang.String.valueOf(r2)
            java.lang.String r10 = "Unexpected block without predecessors: "
            java.lang.String r8 = r10.concat(r8)
            r0.L(r8)
        L11b:
            ud.a r8 = ce.m.s(r0, r4)
            r8.w(r3)
            r8.w(r9)
            r0.B = r8
            r2.D(r9)
            ce.m.j(r8, r2)
            goto L153
        L12e:
            ud.a r9 = ce.m.s(r0, r4)
            r9.w(r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            java.util.Iterator r8 = r10.iterator()
        L13e:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L150
            java.lang.Object r10 = r8.next()
            ud.a r10 = (ud.a) r10
            if (r10 == r7) goto L13e
            ce.m.r(r10, r2, r9)
            goto L13e
        L150:
            ce.m.j(r9, r2)
        L153:
            r8 = r6
        L154:
            if (r8 != 0) goto L7c
            java.util.List r8 = r7.f13676n
            int r8 = r8.size()
            if (r8 > r6) goto L160
            r2 = r5
            goto L173
        L160:
            ud.a r4 = ce.m.s(r0, r4)
            r4.w(r3)
            md.a r3 = md.a.f8829l
            r4.w(r3)
            ce.m.r(r7, r2, r4)
            ce.m.j(r4, r2)
            r2 = r6
        L173:
            if (r2 == 0) goto L177
            goto L7c
        L177:
            if (r5 == 0) goto L8
            goto L2c5
        L17b:
            boolean r1 = r0.Z()
            md.a r2 = md.a.f8840u
            if (r1 == 0) goto L186
            r7 = r5
            goto L202
        L186:
            java.util.ArrayList r1 = new java.util.ArrayList
            ud.a r7 = r0.C
            java.util.List r7 = r7.f13675m
            r1.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
            r7 = r5
        L194:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L1fd
            java.lang.Object r8 = r1.next()
            ud.a r8 = (ud.a) r8
            java.util.List r9 = r8.f13675m
            java.util.ArrayList r10 = r8.f13674l
            java.lang.Object r9 = xe.s.f(r9)
            ud.a r9 = (ud.a) r9
            if (r9 == 0) goto L194
            java.util.ArrayList r11 = r9.f13674l
            java.lang.Object r12 = xe.s.f(r11)
            ud.p r12 = (ud.p) r12
            if (r12 == 0) goto L194
            boolean r13 = r12.W()
            if (r13 == 0) goto L194
            qd.r r12 = r12.f13714l
            ud.p r13 = a.a.c0(r8)
            if (r13 == 0) goto L194
            pd.k r14 = r13.f13713k
            pd.k r15 = pd.k.f10507p
            if (r14 != r15) goto L194
            qd.l r13 = r13.S(r5)
            r12.getClass()
            r13.getClass()
            boolean r14 = r13 instanceof qd.r
            if (r14 != 0) goto L1d9
            goto L194
        L1d9:
            int r12 = r12.f10922l
            qd.r r13 = (qd.r) r13
            int r13 = r13.f10922l
            if (r12 != r13) goto L194
            r11.addAll(r10)
            r9.B(r8)
            ce.m.p(r9, r8)
            r10.clear()
            r8.w(r2)
            ud.a r7 = r0.C
            ce.m.p(r8, r7)
            ce.m.j(r9, r7)
            r9.H()
            r7 = r6
            goto L194
        L1fd:
            if (r7 == 0) goto L202
            o(r0)
        L202:
            if (r7 == 0) goto L206
            goto L2c5
        L206:
            nd.c r1 = nd.c.f9353g
            boolean r1 = nd.d.b(r0, r1)
            if (r1 == 0) goto L2c9
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
        L214:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L2c9
            java.lang.Object r7 = r1.next()
            ud.a r7 = (ud.a) r7
            java.util.ArrayList r8 = r7.f13674l
            int r9 = r8.size()
            if (r9 != r6) goto L2c2
            java.util.List r9 = r7.f13676n
            int r9 = r9.size()
            if (r9 != r6) goto L2c2
            java.lang.Object r8 = r8.get(r5)
            ud.p r8 = (ud.p) r8
            pd.k r8 = r8.f13713k
            pd.k r9 = pd.k.f10504m
            if (r8 != r9) goto L2c2
            java.util.List r8 = r7.f13675m
            int r9 = r8.size()
            r10 = 3
            if (r9 < r10) goto L2c2
            java.util.Iterator r10 = r8.iterator()
            r11 = r5
            r12 = r11
        L24b:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L272
            java.lang.Object r13 = r10.next()
            ud.a r13 = (ud.a) r13
            ud.p r13 = a.a.c0(r13)
            if (r13 != 0) goto L25f
            goto L2c2
        L25f:
            pd.k r13 = r13.f13713k
            int r13 = r13.ordinal()
            r14 = 15
            if (r13 == r14) goto L270
            r11 = 16
            if (r13 == r11) goto L26e
            goto L2c2
        L26e:
            r11 = r6
            goto L24b
        L270:
            r12 = r6
            goto L24b
        L272:
            if (r11 == 0) goto L2c2
            if (r12 == 0) goto L2c2
            java.util.List r10 = r7.f13676n
            java.lang.Object r10 = r10.get(r5)
            ud.a r10 = (ud.a) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r8)
            r8 = r6
        L284:
            if (r8 >= r9) goto L2c0
            java.lang.Object r12 = r11.get(r8)
            ud.a r12 = (ud.a) r12
            ud.a r13 = ce.m.s(r0, r4)
            r13.w(r3)
            java.util.ArrayList r14 = r7.f13674l
            java.util.Iterator r14 = r14.iterator()
        L299:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L2b3
            java.lang.Object r15 = r14.next()
            ud.p r15 = (ud.p) r15
            ud.p r15 = r15.R()
            r15.w(r3)
            java.util.ArrayList r4 = r13.f13674l
            r4.add(r15)
            r4 = -1
            goto L299
        L2b3:
            r13.B(r7)
            ce.m.r(r12, r7, r13)
            ce.m.j(r13, r10)
            int r8 = r8 + 1
            r4 = -1
            goto L284
        L2c0:
            r4 = r6
            goto L2c3
        L2c2:
            r4 = r5
        L2c3:
            if (r4 == 0) goto L2c6
        L2c5:
            return r6
        L2c6:
            r4 = -1
            goto L214
        L2c9:
            ud.a r1 = r0.C
            java.util.List r1 = r1.f13675m
            java.util.Iterator r1 = r1.iterator()
            r4 = r5
        L2d2:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L431
            java.lang.Object r7 = r1.next()
            ud.a r7 = (ud.a) r7
            md.f r8 = r7.f8877g
            java.util.ArrayList r9 = r7.f13674l
            boolean r8 = r8.a(r3)
            r10 = 2
            if (r8 != 0) goto L379
            md.f r8 = r7.f8877g
            md.a r11 = md.a.f8834o
            boolean r8 = r8.a(r11)
            if (r8 != 0) goto L379
            md.b r8 = md.b.E
            md.f r12 = r7.f8877g
            boolean r8 = r12.b(r8)
            if (r8 == 0) goto L2ff
            goto L379
        L2ff:
            java.util.List r8 = r7.f13675m
            int r12 = r8.size()
            if (r12 >= r10) goto L309
            goto L379
        L309:
            ud.p r12 = a.a.c0(r7)
            if (r12 != 0) goto L311
            goto L379
        L311:
            java.util.List r13 = r12.f13715m
            int r13 = r13.size()
            if (r13 != r6) goto L32a
            int r13 = r9.size()
            if (r13 != r6) goto L32a
            qd.l r12 = r12.S(r5)
            boolean r12 = l(r8, r12)
            if (r12 != 0) goto L32a
            goto L379
        L32a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
            r8 = r6
        L334:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L375
            java.lang.Object r10 = r4.next()
            ud.a r10 = (ud.a) r10
            if (r8 == 0) goto L347
            r7.w(r11)
            r8 = r5
            goto L334
        L347:
            r12 = -1
            ud.a r13 = ce.m.s(r0, r12)
            r13.w(r3)
            md.a r12 = md.a.f8833n
            r13.w(r12)
            java.util.Iterator r12 = r9.iterator()
        L358:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L371
            java.lang.Object r14 = r12.next()
            ud.p r14 = (ud.p) r14
            ud.p r14 = r14.R()
            r14.w(r3)
            java.util.ArrayList r15 = r13.f13674l
            r15.add(r14)
            goto L358
        L371:
            ce.m.r(r10, r7, r13)
            goto L334
        L375:
            r4 = r6
        L376:
            r10 = -1
            goto L42e
        L379:
            md.f r8 = r7.f8877g
            md.a r11 = md.a.D
            boolean r8 = r8.a(r11)
            if (r8 == 0) goto L384
            goto L399
        L384:
            java.util.List r8 = r7.f13675m
            int r12 = r8.size()
            if (r12 >= r10) goto L38d
            goto L399
        L38d:
            ud.p r10 = a.a.c0(r7)
            if (r10 == 0) goto L376
            pd.k r12 = r10.f13713k
            pd.k r13 = pd.k.f10509r
            if (r12 == r13) goto L39a
        L399:
            goto L376
        L39a:
            java.util.HashMap r12 = new java.util.HashMap
            int r13 = r8.size()
            r12.<init>(r13)
            java.util.HashSet r13 = new java.util.HashSet
            int r14 = r8.size()
            r13.<init>(r14)
            java.util.Iterator r14 = r8.iterator()
        L3b0:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L3cb
            java.lang.Object r15 = r14.next()
            ud.a r15 = (ud.a) r15
            ce.j r5 = new ce.j
            r5.<init>(r10, r12, r15, r13)
            java.util.BitSet r6 = a.a.D0(r0)
            a.a.U0(r15, r6, r5)
            r5 = 0
            r6 = 1
            goto L3b0
        L3cb:
            int r5 = r13.size()
            r6 = 1
            if (r5 != r6) goto L3d6
            r7.w(r11)
            goto L376
        L3d6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r8)
            java.util.Iterator r4 = r4.iterator()
            r5 = r6
        L3e0:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L42c
            java.lang.Object r8 = r4.next()
            ud.a r8 = (ud.a) r8
            if (r5 == 0) goto L3f1
            r5 = 0
            r10 = -1
            goto L3e0
        L3f1:
            r10 = -1
            ud.a r11 = ce.m.s(r0, r10)
            r11.w(r3)
            java.util.Iterator r13 = r9.iterator()
        L3fd:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L416
            java.lang.Object r14 = r13.next()
            ud.p r14 = (ud.p) r14
            ud.p r14 = r14.R()
            r14.w(r3)
            java.util.ArrayList r15 = r11.f13674l
            r15.add(r14)
            goto L3fd
        L416:
            r11.B(r7)
            java.lang.Object r13 = r12.get(r8)
            ae.c r13 = (ae.c) r13
            if (r13 == 0) goto L428
            ae.f r13 = r13.f229g
            java.util.ArrayList r13 = r13.f235d
            r13.add(r11)
        L428:
            ce.m.r(r8, r7, r11)
            goto L3e0
        L42c:
            r10 = -1
            r4 = r6
        L42e:
            r5 = 0
            goto L2d2
        L431:
            if (r4 == 0) goto L47c
            ud.a r1 = r0.C
            java.util.EnumSet r3 = ce.m.f1651g
            java.util.List r3 = r1.f13675m
            java.util.Iterator r3 = r3.iterator()
        L43d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L44f
            java.lang.Object r5 = r3.next()
            ud.a r5 = (ud.a) r5
            java.util.List r5 = r5.f13676n
            r5.remove(r1)
            goto L43d
        L44f:
            java.util.List r3 = r1.f13675m
            r3.clear()
            java.util.List r0 = r0.f13732z
            java.util.Iterator r0 = r0.iterator()
        L45a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L47c
            java.lang.Object r3 = r0.next()
            ud.a r3 = (ud.a) r3
            if (r3 == r1) goto L45a
            java.util.List r5 = r3.f13676n
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L45a
            md.f r5 = r3.f8877g
            boolean r5 = r5.a(r2)
            if (r5 != 0) goto L45a
            ce.m.j(r3, r1)
            goto L45a
        L47c:
            return r4
    }

    public static void n(java.util.LinkedHashSet r5, ud.r r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.stream.Stream r0 = r5.stream()
            a7.b r1 = new a7.b
            r2 = 26
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.filter(r1)
            long r0 = r0.count()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L4b
            java.util.stream.Stream r2 = r5.stream()
            ae.a r3 = new ae.a
            r4 = 3
            r3.<init>(r4)
            java.util.stream.IntStream r2 = r2.mapToInt(r3)
            int r2 = r2.sum()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unreachable blocks removed: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", instructions: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            r6.L(r0)
        L4b:
            ae.e r0 = new ae.e
            r1 = 14
            r0.<init>(r1)
            r5.forEach(r0)
            java.util.List r0 = r6.f13732z
            r0.removeAll(r5)
            r6.f0()
            return
    }

    public static void o(ud.r r2) {
            java.util.List r0 = r2.f13732z
            ce.i r1 = new ce.i
            r1.<init>(r2)
            boolean r0 = r0.removeIf(r1)
            if (r0 == 0) goto L10
            r2.f0()
        L10:
            return
    }

    public static boolean p(qd.l r4, qd.l r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 == 0) goto L4f
            if (r5 != 0) goto La
            goto L4f
        La:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4f
            boolean r2 = r4 instanceof qd.r
            if (r2 == 0) goto L28
            qd.r r4 = (qd.r) r4
            int r4 = r4.f10922l
            qd.r r5 = (qd.r) r5
            int r5 = r5.f10922l
            if (r4 != r5) goto L27
            return r0
        L27:
            return r1
        L28:
            boolean r2 = r4 instanceof qd.n
            if (r2 == 0) goto L3a
            qd.n r4 = (qd.n) r4
            long r2 = r4.f10905l
            qd.n r5 = (qd.n) r5
            long r4 = r5.f10905l
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L39
            return r0
        L39:
            return r1
        L3a:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Unexpected InsnArg types: "
            java.lang.String r1 = " and "
            java.lang.String r4 = bc.e.j(r0, r4, r1, r5)
            ah.a.k(r4)
            r4 = 0
            return r4
        L4f:
            return r1
    }

    @Override // be.a
    public final void g(ud.r r24) {
            r23 = this;
            r1 = r24
            boolean r0 = r1.f13722p
            if (r0 != 0) goto Lade
            java.util.List r0 = r1.f13732z
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            goto Lade
        L10:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r2 = r1.f13732z
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            k(r0, r3, r1)
            goto L1b
        L2b:
            n(r0, r1)
            j(r1)
            java.util.List r0 = r1.f13732z
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = r3
        L39:
            boolean r5 = r2.hasNext()
            r6 = 1
            md.b r8 = md.b.E
            if (r5 == 0) goto L13c
            java.lang.Object r5 = r2.next()
            ud.a r5 = (ud.a) r5
            md.a r9 = md.a.f8827k
            md.f r10 = r5.f8877g
            boolean r9 = r10.a(r9)
            if (r9 != 0) goto L5c
            md.a r9 = md.a.f8829l
            md.f r10 = r5.f8877g
            boolean r9 = r10.a(r9)
            if (r9 == 0) goto L39
        L5c:
            java.util.List r9 = r5.f13675m
            int r10 = r9.size()
            if (r10 <= r6) goto L39
            ud.p r10 = a.a.c0(r5)
            if (r10 == 0) goto L71
            pd.k r10 = r10.f13713k
            pd.k r11 = pd.k.f10513v
            if (r10 != r11) goto L71
            goto L39
        L71:
            ud.p r10 = a.a.W(r5)
            if (r10 == 0) goto L80
            md.f r10 = r10.f8877g
            boolean r8 = r10.b(r8)
            if (r8 == 0) goto L80
            goto L39
        L80:
            r8 = r3
        L81:
            java.util.Iterator r10 = r9.iterator()
            r11 = 0
        L86:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L138
            java.lang.Object r12 = r10.next()
            ud.a r12 = (ud.a) r12
            java.util.ArrayList r12 = r12.f13674l
            int r13 = r12.size()
            if (r13 > r8) goto L9c
            r12 = 0
            goto La4
        L9c:
            int r13 = r13 - r8
            int r13 = r13 - r6
            java.lang.Object r12 = r12.get(r13)
            ud.p r12 = (ud.p) r12
        La4:
            if (r12 != 0) goto La7
            goto Le0
        La7:
            if (r11 != 0) goto Lab
            r11 = r12
            goto L86
        Lab:
            if (r11 != r12) goto Lae
            goto Ld9
        Lae:
            boolean r13 = r11.Y(r12)
            if (r13 == 0) goto Le0
            qd.r r13 = r11.f13714l
            qd.r r14 = r12.f13714l
            boolean r13 = p(r13, r14)
            if (r13 == 0) goto Le0
            java.util.List r13 = r11.f13715m
            int r13 = r13.size()
            r14 = r3
        Lc5:
            if (r14 >= r13) goto Ld9
            qd.l r15 = r11.S(r14)
            qd.l r7 = r12.S(r14)
            boolean r7 = p(r15, r7)
            if (r7 != 0) goto Ld6
            goto Le0
        Ld6:
            int r14 = r14 + 1
            goto Lc5
        Ld9:
            boolean r7 = r11.N()
            if (r7 == 0) goto Le0
            goto L86
        Le0:
            if (r8 <= 0) goto L39
            java.lang.Object r4 = r9.get(r3)
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r4 = r4.f13674l
            int r7 = r4.size()
            int r10 = r7 - r8
            java.util.List r4 = r4.subList(r10, r7)
            java.util.ArrayList r7 = r5.f13674l
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4.size()
            int r12 = r7.size()
            int r12 = r12 + r11
            r10.<init>(r12)
            r10.addAll(r4)
            r10.addAll(r7)
            r7.clear()
            r7.addAll(r10)
            ce.h r4 = new ce.h
            r4.<init>(r8)
            r9.forEach(r4)
            java.lang.String r4 = java.lang.String.valueOf(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Move duplicate insns, count: "
            r5.<init>(r7)
            r5.append(r8)
            java.lang.String r7 = " to block "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.I(r4)
            r4 = r6
            goto L39
        L138:
            int r8 = r8 + 1
            goto L81
        L13c:
            int r2 = ce.g.f1640a
            java.util.List r2 = r1.E
            boolean r2 = r2.isEmpty()
            r7 = 2
            r9 = 10
            if (r2 == 0) goto L150
            r16 = r0
            r9 = r3
            r17 = r4
            goto L982
        L150:
            java.util.List r2 = r1.f13732z
            ae.e r10 = new ae.e
            r10.<init>(r9)
            r2.forEach(r10)
            f8.i.n(r1)
            java.util.List r2 = r1.f13732z
            java.util.Iterator r2 = r2.iterator()
        L163:
            boolean r10 = r2.hasNext()
            r11 = 6
            md.b r12 = md.b.F
            if (r10 == 0) goto L1af
            java.lang.Object r10 = r2.next()
            ud.a r10 = (ud.a) r10
            java.util.ArrayList r10 = r10.f13674l
            java.util.Iterator r10 = r10.iterator()
        L178:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L163
            java.lang.Object r13 = r10.next()
            ud.p r13 = (ud.p) r13
            md.f r14 = r13.f8877g
            boolean r14 = r14.b(r12)
            if (r14 == 0) goto L178
            pd.k r14 = r13.f13713k
            int r14 = r14.ordinal()
            if (r14 == 0) goto L1ab
            if (r14 == r6) goto L1ab
            if (r14 == r7) goto L1ab
            r15 = 4
            if (r14 == r15) goto L1ab
            if (r14 == r11) goto L1ab
            r15 = 36
            if (r14 == r15) goto L1ab
            r15 = 9
            if (r14 == r15) goto L1ab
            if (r14 == r9) goto L1ab
            switch(r14) {
                case 12: goto L1ab;
                case 13: goto L1ab;
                case 14: goto L1ab;
                case 15: goto L1ab;
                default: goto L1aa;
            }
        L1aa:
            goto L178
        L1ab:
            r13.E(r12)
            goto L178
        L1af:
            java.util.List r2 = r1.f13732z
            java.util.Iterator r2 = r2.iterator()
        L1b5:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L21b
            java.lang.Object r10 = r2.next()
            ud.a r10 = (ud.a) r10
            java.util.ArrayList r13 = r10.f13674l
            java.util.Iterator r13 = r13.iterator()
            r14 = 0
        L1c8:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L1e9
            java.lang.Object r15 = r13.next()
            ud.p r15 = (ud.p) r15
            md.f r15 = r15.f8877g
            oc.b r15 = r15.c(r12)
            ae.b r15 = (ae.b) r15
            if (r15 == 0) goto L1c8
            if (r14 != 0) goto L1e2
            r14 = r15
            goto L1c8
        L1e2:
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L1c8
            r14 = 0
        L1e9:
            if (r14 == 0) goto L1b5
            r10.y(r14)
            java.util.ArrayList r13 = r10.f13674l
            java.util.Iterator r13 = r13.iterator()
        L1f4:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L1b5
            java.lang.Object r14 = r13.next()
            ud.p r14 = (ud.p) r14
            md.f r15 = r14.f8877g
            md.a r5 = md.a.f8823i
            boolean r15 = r15.a(r5)
            if (r15 == 0) goto L20d
            r10.w(r5)
        L20d:
            md.f r5 = r14.f8877g
            md.a r14 = md.a.f8825j
            boolean r5 = r5.a(r14)
            if (r5 == 0) goto L1f4
            r10.w(r14)
            goto L1f4
        L21b:
            java.util.List r2 = r1.f13732z
            int r5 = r2.size()
            r10 = r3
        L222:
            pd.k r13 = pd.k.f10510s
            md.a r14 = md.a.f8831m
            if (r10 >= r5) goto L2d8
            java.lang.Object r15 = r2.get(r10)
            ud.a r15 = (ud.a) r15
            ud.p r9 = a.a.W(r15)
            if (r9 != 0) goto L236
            goto L2ce
        L236:
            md.f r7 = r9.f8877g
            oc.b r7 = r7.c(r8)
            ae.c r7 = (ae.c) r7
            if (r7 != 0) goto L242
            goto L2ce
        L242:
            ae.f r11 = r7.f229g
            java.util.ArrayList r3 = r11.f235d
            r9.E(r8)
            md.f r9 = r15.f8877g
            md.b r6 = md.b.C
            oc.b r9 = r9.c(r6)
            nd.i0 r9 = (nd.i0) r9
            if (r9 == 0) goto L25d
            ud.a r9 = r9.f9376g
            ce.m.p(r9, r15)
            r15.E(r6)
        L25d:
            java.util.List r6 = r15.f13675m
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L284
            r11.f234c = r15
            r15.y(r7)
            r3.add(r15)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.BitSet r6 = a.a.D0(r1)
            r9 = 1
            a.a.z(r15, r15, r3, r6, r9)
            ae.g r6 = new ae.g
            r9 = 7
            r6.<init>(r11, r9)
            r3.forEach(r6)
            goto L298
        L284:
            int r6 = r15.f13673k
            ud.a r6 = ce.m.s(r1, r6)
            r6.w(r14)
            r6.y(r7)
            ce.m.j(r6, r15)
            r11.f234c = r6
            r3.add(r6)
        L298:
            qd.j r3 = r11.b()
            ud.p r6 = a.a.c0(r15)
            if (r6 == 0) goto L2c5
            pd.k r9 = r6.f13713k
            if (r9 != r13) goto L2c5
            qd.r r9 = r6.f13714l
            int r9 = r9.f10922l
            qd.r r13 = new qd.r
            r13.<init>(r9, r3)
            r13.B(r6)
            r6.d0(r13)
            md.a r3 = md.a.f8836q
            r6.w(r3)
            md.a r3 = md.a.P
            r13.w(r3)
            r11.f237f = r13
            r6.y(r7)
            goto L2ce
        L2c5:
            qd.p r6 = new qd.p
            java.lang.String r7 = "unused"
            r6.<init>(r7, r3)
            r11.f237f = r6
        L2ce:
            int r10 = r10 + 1
            r3 = 0
            r6 = 1
            r7 = 2
            r9 = 10
            r11 = 6
            goto L222
        L2d8:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r3 = r1.f13732z
            java.util.Iterator r3 = r3.iterator()
        L2e3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L31c
            java.lang.Object r5 = r3.next()
            ud.a r5 = (ud.a) r5
            md.f r6 = r5.f8877g
            oc.b r6 = r6.c(r12)
            ae.b r6 = (ae.b) r6
            if (r6 == 0) goto L2e3
            java.util.List r6 = r6.f228g
            java.util.Iterator r6 = r6.iterator()
        L2ff:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2e3
            java.lang.Object r7 = r6.next()
            ae.f r7 = (ae.f) r7
            ae.d r8 = new ae.d
            r9 = 25
            r8.<init>(r9)
            java.lang.Object r7 = r2.computeIfAbsent(r7, r8)
            java.util.List r7 = (java.util.List) r7
            r7.add(r5)
            goto L2ff
        L31c:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L32e
            java.util.List r3 = r1.E
            ce.d r5 = new ce.d
            r6 = 0
            r5.<init>(r1, r6)
            r3.forEach(r5)
            goto L337
        L32e:
            r6 = 0
            ce.e r3 = new ce.e
            r3.<init>(r1, r6)
            r2.forEach(r3)
        L337:
            ce.m.m(r1)
            java.util.List r3 = r1.E
            ud.b r5 = new ud.b
            r9 = 1
            r5.<init>(r9)
            r3.removeIf(r5)
            java.util.List r3 = r1.E
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L353
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            r16 = r0
            goto L5b5
        L353:
            ce.f r3 = new ce.f
            r6 = 0
            r3.<init>(r6)
            r2.forEach(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            ce.e r5 = new ce.e
            r9 = 1
            r5.<init>(r3, r9)
            r2.forEach(r5)
            int r2 = r3.size()
            r5 = 24
            if (r2 <= r9) goto L46e
        L372:
            java.util.Iterator r2 = r3.iterator()
        L376:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L46e
            java.lang.Object r6 = r2.next()
            ae.h r6 = (ae.h) r6
            java.util.Iterator r7 = r3.iterator()
        L386:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L376
            java.lang.Object r8 = r7.next()
            ae.h r8 = (ae.h) r8
            if (r6 == r8) goto L386
            ae.h r9 = r8.f246j
            if (r9 == 0) goto L399
            goto L386
        L399:
            java.util.List r9 = r6.f245i
            java.util.List r10 = r6.f244h
            java.util.List r11 = r8.f245i
            java.util.List r15 = r8.f244h
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L3c3
            java.util.List r2 = ac.p.o(r10, r15)
            ae.h r7 = new ae.h
            int r9 = r3.size()
            java.util.List r10 = r6.f245i
            r7.<init>(r9, r2, r10)
            r3.add(r7)
            r3.remove(r6)
            r3.remove(r8)
            r16 = r0
            goto L460
        L3c3:
            java.util.stream.Stream r9 = r15.stream()
            ae.d r11 = new ae.d
            r11.<init>(r5)
            java.util.stream.Stream r9 = r9.flatMap(r11)
            java.util.stream.Collector r11 = java.util.stream.Collectors.toSet()
            java.lang.Object r9 = r9.collect(r11)
            java.util.Set r9 = (java.util.Set) r9
            java.util.stream.Stream r11 = r9.stream()
            be.i r5 = new be.i
            r16 = r0
            r0 = 6
            r5.<init>(r6, r0)
            boolean r5 = r11.anyMatch(r5)
            java.util.List r11 = r8.f245i
            java.util.stream.Stream r11 = r11.stream()
            r17 = r2
            be.i r2 = new be.i
            r2.<init>(r6, r0)
            boolean r0 = r11.anyMatch(r2)
            java.util.List r2 = r6.f245i
            java.util.stream.Stream r2 = r2.stream()
            be.p r11 = new be.p
            r18 = r0
            r0 = 1
            r11.<init>(r9, r0)
            boolean r0 = r2.anyMatch(r11)
            if (r5 == 0) goto L437
            if (r18 != 0) goto L413
            if (r0 == 0) goto L437
        L413:
            java.util.List r0 = r6.f245i
            java.util.List r2 = r8.f245i
            java.util.List r0 = ac.p.o(r0, r2)
            r15.removeAll(r10)
            r8.f246j = r6
            java.util.List r2 = r6.f247k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L42f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.f247k = r2
        L42f:
            java.util.List r2 = r6.f247k
            r2.add(r8)
            r6.f245i = r0
            goto L466
        L437:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r15)
            boolean r0 = r0.containsAll(r10)
            if (r0 == 0) goto L466
            java.util.List r0 = r6.f245i
            java.util.List r2 = r8.f245i
            java.util.List r0 = ac.p.o(r0, r2)
            java.util.List r2 = ac.p.o(r10, r15)
            ae.h r5 = new ae.h
            int r7 = r3.size()
            r5.<init>(r7, r2, r0)
            r3.add(r5)
            r3.remove(r6)
            r3.remove(r8)
        L460:
            r0 = r16
            r5 = 24
            goto L372
        L466:
            r0 = r16
            r2 = r17
            r5 = 24
            goto L386
        L46e:
            r16 = r0
            java.util.Iterator r0 = r3.iterator()
            r2 = 0
        L475:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L53f
            java.lang.Object r5 = r0.next()
            ae.h r5 = (ae.h) r5
            java.util.List r5 = r5.f244h
            int r6 = r5.size()
            r7 = 2
            if (r6 >= r7) goto L48d
        L48a:
            r5 = 0
            goto L53a
        L48d:
            java.util.Iterator r6 = r5.iterator()
        L491:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4b8
            java.lang.Object r7 = r6.next()
            ae.f r7 = (ae.f) r7
            java.util.ArrayList r8 = r7.f235d
            int r8 = r8.size()
            r9 = 1
            if (r8 == r9) goto L4a7
            goto L48a
        L4a7:
            ud.a r7 = r7.f234c
            java.util.ArrayList r8 = r7.f13674l
            int r8 = r8.size()
            if (r8 != r9) goto L48a
            boolean r7 = a.a.v(r7, r13)
            if (r7 != 0) goto L491
            goto L48a
        L4b8:
            ae.d r6 = new ae.d
            r7 = 26
            r6.<init>(r7)
            java.util.List r6 = be.h.K(r5, r6)
            java.util.stream.Stream r7 = r6.stream()
            ae.d r8 = new ae.d
            r9 = 22
            r8.<init>(r9)
            java.util.stream.Stream r7 = r7.flatMap(r8)
            java.util.stream.Stream r7 = r7.distinct()
            java.util.stream.Collector r8 = java.util.stream.Collectors.toList()
            java.lang.Object r7 = r7.collect(r8)
            java.util.List r7 = (java.util.List) r7
            int r8 = r7.size()
            r9 = 1
            if (r8 == r9) goto L4e8
            goto L48a
        L4e8:
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            ud.a r7 = (ud.a) r7
            java.util.List r7 = r7.f13675m
            int r8 = r7.size()
            int r9 = r6.size()
            if (r8 == r9) goto L4fd
            r6 = 0
            goto L501
        L4fd:
            boolean r6 = r7.containsAll(r6)
        L501:
            if (r6 != 0) goto L504
            goto L48a
        L504:
            java.util.stream.Stream r6 = r5.stream()
            ae.d r7 = new ae.d
            r8 = 23
            r7.<init>(r8)
            java.util.stream.Stream r6 = r6.map(r7)
            java.util.stream.Stream r6 = r6.distinct()
            java.util.stream.Collector r7 = java.util.stream.Collectors.toList()
            java.lang.Object r6 = r6.collect(r7)
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            r9 = 1
            if (r6 == r9) goto L52a
            goto L48a
        L52a:
            r6 = 0
            java.lang.Object r7 = r5.get(r6)
            ae.f r7 = (ae.f) r7
            ce.a r6 = new ce.a
            r6.<init>(r7, r1)
            r5.removeIf(r6)
            r5 = 1
        L53a:
            if (r5 == 0) goto L475
            r2 = 1
            goto L475
        L53f:
            if (r2 == 0) goto L54f
            ce.m.m(r1)
            java.util.List r0 = r1.E
            ud.b r2 = new ud.b
            r9 = 1
            r2.<init>(r9)
            r0.removeIf(r2)
        L54f:
            ae.e r0 = new ae.e
            r2 = 11
            r0.<init>(r2)
            r3.forEach(r0)
            a7.b r0 = new a7.b
            r2 = 24
            r0.<init>(r2)
            r3.removeIf(r0)
            java.util.List r0 = r1.E
            ud.b r2 = new ud.b
            r9 = 1
            r2.<init>(r9)
            r0.removeIf(r2)
            ce.m.m(r1)
            ud.e r0 = r1.f13718l
            ud.u r0 = r0.f13688k
            qe.x r0 = r0.f13748g
            qe.k r0 = r0.f11002c
            java.util.Comparator r0 = r0.f10963c
            java.util.Iterator r2 = r3.iterator()
        L57f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L5b4
            java.lang.Object r5 = r2.next()
            ae.h r5 = (ae.h) r5
            java.util.List r6 = r5.f244h
            java.util.Iterator r6 = r6.iterator()
        L591:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a9
            java.lang.Object r7 = r6.next()
            ae.f r7 = (ae.f) r7
            java.util.ArrayList r7 = r7.f232a
            ce.b r8 = new ce.b
            r9 = 0
            r8.<init>(r0, r9)
            r7.sort(r8)
            goto L591
        L5a9:
            java.util.List r6 = r5.f244h
            ce.c r7 = new ce.c
            r7.<init>(r5, r0)
            r6.sort(r7)
            goto L57f
        L5b4:
            r2 = r3
        L5b5:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5bf
        L5bb:
            r17 = r4
            goto L88e
        L5bf:
            int r0 = r2.size()
            r3 = 3
            int r0 = r0 * r3
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r2)
            r6 = 0
        L5cb:
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L5bb
            java.lang.Object r7 = r5.removeFirst()
            ae.h r7 = (ae.h) r7
            java.util.List r8 = r7.f245i
            java.util.List r9 = r7.f244h
            int r10 = r8.size()
            r11 = 1
            if (r10 != r11) goto L5ea
            r10 = 0
            java.lang.Object r11 = r8.get(r10)
            ud.a r11 = (ud.a) r11
            goto L614
        L5ea:
            java.util.Iterator r10 = r8.iterator()
        L5ee:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L613
            java.lang.Object r11 = r10.next()
            ud.a r11 = (ud.a) r11
            java.util.Iterator r13 = r8.iterator()
        L5fe:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L614
            java.lang.Object r15 = r13.next()
            ud.a r15 = (ud.a) r15
            if (r11 == r15) goto L5fe
            boolean r15 = a.a.m0(r11, r15)
            if (r15 != 0) goto L5fe
            goto L5ee
        L613:
            r11 = 0
        L614:
            if (r11 == 0) goto L634
            java.util.List r10 = r11.f13676n
            int r10 = r10.size()
            r13 = 1
            if (r10 != r13) goto L632
            md.f r10 = r11.f8877g
            boolean r10 = r10.b(r12)
            if (r10 != 0) goto L632
            java.util.List r10 = r11.f13676n
            r13 = 0
            java.lang.Object r10 = r10.get(r13)
            r11 = r10
            ud.a r11 = (ud.a) r11
            goto L693
        L632:
            r13 = 0
            goto L693
        L634:
            r13 = 0
            java.util.BitSet r10 = a.a.D0(r1)
            java.util.List r11 = r1.f13732z
            int r11 = r11.size()
            r10.set(r13, r11)
            xe.d r11 = new xe.d
            r13 = 2
            r11.<init>(r13, r10)
            r8.forEach(r11)
            java.util.BitSet r11 = a.a.D0(r1)
            r11.or(r10)
            xe.d r13 = new xe.d
            r13.<init>(r3, r11)
            a.a.L(r1, r10, r13)
            ud.a r10 = a.a.r(r1, r11)
            if (r10 == 0) goto L87e
            java.util.List r11 = r10.f13676n
            int r11 = r11.size()
            r13 = 1
            if (r11 != r13) goto L679
            java.util.List r11 = r10.f13676n
            r15 = 0
            java.lang.Object r11 = r11.get(r15)
            ud.a r11 = (ud.a) r11
            boolean r15 = r8.contains(r11)
            if (r15 == 0) goto L679
            goto L693
        L679:
            java.util.List r11 = r10.f13676n
            int r11 = r11.size()
            if (r11 != r13) goto L692
            md.f r11 = r10.f8877g
            boolean r11 = r11.b(r12)
            if (r11 != 0) goto L692
            java.util.List r10 = r10.f13676n
            r15 = 0
            java.lang.Object r10 = r10.get(r15)
            ud.a r10 = (ud.a) r10
        L692:
            r11 = r10
        L693:
            java.util.List r10 = r11.f13675m
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L6a8
            ud.a r10 = r1.B
            if (r11 == r10) goto L6a8
            r5.addLast(r7)
            r17 = r4
            r18 = r5
            goto L86c
        L6a8:
            ud.a r10 = a.a.V(r8)
            if (r10 == 0) goto L6af
            goto L6fc
        L6af:
            ud.a r10 = a.a.g0(r1, r8)
            if (r10 != 0) goto L6b7
            r10 = 0
            goto L6fc
        L6b7:
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.List r15 = r10.f13675m
            r13.<init>(r15)
            r13.removeAll(r8)
            java.util.stream.Stream r13 = r13.stream()
            be.i r15 = new be.i
            r3 = 5
            r15.<init>(r8, r3)
            java.util.stream.Stream r3 = r13.filter(r15)
            java.util.stream.Collector r13 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r13)
            java.util.List r3 = (java.util.List) r3
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L6e0
            goto L6fc
        L6e0:
            ud.a r13 = ce.m.i(r1, r10)
            r13.w(r14)
            java.util.Iterator r3 = r3.iterator()
        L6eb:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L6fb
            java.lang.Object r15 = r3.next()
            ud.a r15 = (ud.a) r15
            ce.m.r(r15, r13, r10)
            goto L6eb
        L6fb:
            r10 = r13
        L6fc:
            if (r10 == 0) goto L715
            md.a r3 = md.a.f8833n
            md.f r13 = r10.f8877g
            boolean r3 = r13.a(r3)
            if (r3 == 0) goto L715
            ud.a r3 = ce.m.i(r1, r10)
            r3.w(r14)
            r22 = r10
            r10 = r3
            r3 = r22
            goto L716
        L715:
            r3 = 0
        L716:
            ud.a r13 = r1.B
            md.a r15 = md.a.A
            if (r11 != r13) goto L72e
            java.util.List r11 = r13.f13676n
            r13 = 0
            java.lang.Object r11 = r11.get(r13)
            ud.a r11 = (ud.a) r11
            ud.a r11 = ce.m.i(r1, r11)
            r17 = r4
            r18 = r5
            goto L768
        L72e:
            java.util.List r13 = r11.f13675m
            ud.a r13 = a.a.U(r13, r15)
            if (r13 == 0) goto L73c
            r17 = r4
            r18 = r5
        L73a:
            r11 = r13
            goto L768
        L73c:
            java.util.List r13 = r11.f13677o
            int r13 = r13.size()
            r17 = r4
            r4 = 1
            if (r13 != r4) goto L762
            java.util.ArrayList r13 = r11.f13674l
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L762
            java.util.List r13 = r11.f13677o
            ud.a r13 = a.a.U(r13, r15)
            if (r13 == 0) goto L762
            r18 = r5
            java.util.List r5 = r13.f13675m
            int r5 = r5.size()
            if (r5 != r4) goto L764
            goto L73a
        L762:
            r18 = r5
        L764:
            ud.a r11 = ce.m.i(r1, r11)
        L768:
            r11.w(r15)
            r11.w(r14)
            java.util.stream.Stream r4 = r9.stream()
            ae.a r5 = new ae.a
            r13 = 2
            r5.<init>(r13)
            java.util.stream.IntStream r4 = r4.mapToInt(r5)
            int r4 = r4.sum()
            if (r10 == 0) goto L784
            if (r4 != 0) goto L788
        L784:
            r21 = r8
            goto L836
        L788:
            java.util.List r4 = r10.f13676n
            md.a r5 = md.a.B
            ud.a r4 = a.a.U(r4, r5)
            if (r4 == 0) goto L793
            goto L798
        L793:
            r4 = -1
            ud.a r4 = ce.m.s(r1, r4)
        L798:
            r4.w(r5)
            r4.w(r14)
            ce.m.j(r10, r4)
            if (r3 == 0) goto L830
            java.util.List r5 = r10.f13675m
            ze.c r13 = new ze.c
            r13.<init>(r1)
            ae.g r15 = new ae.g
            r19 = r4
            r4 = 6
            r15.<init>(r13, r4)
            r5.forEach(r15)
            java.util.Iterator r4 = r9.iterator()
        L7b9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L82d
            java.lang.Object r5 = r4.next()
            ae.f r5 = (ae.f) r5
            java.util.ArrayList r9 = r5.f235d
            java.util.Iterator r9 = r9.iterator()
        L7cb:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L824
            java.lang.Object r15 = r9.next()
            ud.a r15 = (ud.a) r15
            boolean r15 = r13.b(r15)
            if (r15 == 0) goto L7cb
            java.util.ArrayList r5 = r5.f235d
            ze.c r9 = new ze.c
            ud.r r15 = r13.f22679g
            r9.<init>(r15)
            r20 = r4
            ae.g r4 = new ae.g
            r21 = r8
            r8 = 6
            r4.<init>(r9, r8)
            r5.forEach(r4)
            java.util.BitSet r4 = new java.util.BitSet
            java.util.List r5 = r15.f13732z
            int r5 = r5.size()
            r4.<init>(r5)
            java.util.BitSet r5 = r13.f22680h
            r4.or(r5)
            java.util.BitSet r5 = r9.f22680h
            r4.and(r5)
            int r5 = r4.cardinality()
            r9 = 1
            if (r5 != r9) goto L81d
            java.util.List r5 = r15.f13732z
            r15 = 0
            int r4 = r4.nextSetBit(r15)
            java.lang.Object r4 = r5.get(r4)
            ud.a r4 = (ud.a) r4
            goto L81e
        L81d:
            r4 = 0
        L81e:
            if (r4 == 0) goto L828
            ce.m.r(r4, r10, r3)
            goto L828
        L824:
            r20 = r4
            r21 = r8
        L828:
            r4 = r20
            r8 = r21
            goto L7b9
        L82d:
            r21 = r8
            goto L833
        L830:
            r19 = r4
            goto L82d
        L833:
            r4 = r19
            goto L837
        L836:
            r4 = 0
        L837:
            ce.g.a(r7, r11, r4)
            java.util.Iterator r3 = r21.iterator()
        L83e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L862
            java.lang.Object r5 = r3.next()
            ud.a r5 = (ud.a) r5
            md.b r8 = md.b.D
            md.f r9 = r5.f8877g
            oc.b r8 = r9.c(r8)
            ae.h r8 = (ae.h) r8
            if (r8 == 0) goto L85e
            java.util.List r8 = r8.f247k
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L83e
        L85e:
            r5.y(r7)
            goto L83e
        L862:
            r7.f249m = r11
            r11.H()
            if (r4 == 0) goto L86c
            r4.H()
        L86c:
            int r3 = r6 + 1
            if (r6 > r0) goto L878
            r6 = r3
            r4 = r17
            r5 = r18
            r3 = 3
            goto L5cb
        L878:
            java.lang.String r0 = "Try blocks wrapping queue limit reached! Please report as an issue!"
            ah.a.k(r0)
            return
        L87e:
            r21 = r8
            java.lang.String r0 = java.lang.String.valueOf(r21)
            java.lang.String r1 = "Failed to find top block for try-catch from: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            return
        L88e:
            md.f r0 = r1.C()
            md.d r3 = new md.d
            r15 = 0
            r3.<init>(r0, r15)
            r2.forEach(r3)
            java.util.List r0 = r1.f13732z
            ae.e r3 = new ae.e
            r4 = 10
            r3.<init>(r4)
            r0.forEach(r3)
            java.util.List r0 = r1.E
            java.util.Iterator r0 = r0.iterator()
        L8ad:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L921
            java.lang.Object r3 = r0.next()
            ae.f r3 = (ae.f) r3
            java.util.ArrayList r3 = r3.f235d
            java.util.Iterator r3 = r3.iterator()
        L8bf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8ad
            java.lang.Object r4 = r3.next()
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r4 == 0) goto L8d5
            java.util.ArrayList r6 = r4.f13674l
            goto L8d6
        L8d5:
            r6 = 0
        L8d6:
            java.util.ArrayList r4 = r4.f13674l
            java.util.Iterator r4 = r4.iterator()
        L8dc:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L8fa
            java.lang.Object r7 = r4.next()
            ud.p r7 = (ud.p) r7
            pd.k r8 = r7.f13713k
            pd.k r9 = pd.k.f10516y
            if (r8 != r9) goto L8ef
            goto L8fa
        L8ef:
            pd.k r9 = pd.k.f10517z
            if (r8 != r9) goto L8dc
            r5.add(r7)
            xe.l.j(r1, r7)
            goto L8dc
        L8fa:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L901
            goto L8bf
        L901:
            if (r6 != 0) goto L917
            java.util.Iterator r4 = r5.iterator()
        L907:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L91d
            java.lang.Object r6 = r4.next()
            ud.p r6 = (ud.p) r6
            xe.l.d(r1, r6)
            goto L907
        L917:
            xe.l.k(r1, r5)
            xe.l.e(r6, r5)
        L91d:
            r5.clear()
            goto L8bf
        L921:
            o(r1)
            ze.c r0 = new ze.c
            r0.<init>(r1)
            ae.g r3 = new ae.g
            r4 = 6
            r3.<init>(r0, r4)
            ud.a r4 = r1.B
            ae.d r5 = new ae.d
            r6 = 28
            r5.<init>(r6)
            a.a.d1(r1, r4, r5, r3)
            java.util.List r3 = r1.E
            java.util.Iterator r3 = r3.iterator()
        L941:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L981
            java.lang.Object r4 = r3.next()
            ae.f r4 = (ae.f) r4
            ud.a r5 = r4.f234c
            if (r5 == 0) goto L941
            java.util.BitSet r6 = r0.f22680h
            int r7 = r5.f13672j
            boolean r6 = r6.get(r7)
            if (r6 == 0) goto L95c
            goto L941
        L95c:
            java.util.Iterator r6 = r2.iterator()
        L960:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L975
            java.lang.Object r7 = r6.next()
            ae.h r7 = (ae.h) r7
            java.util.List r7 = r7.f244h
            boolean r7 = r7.contains(r4)
            if (r7 == 0) goto L960
            goto L941
        L975:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            k(r4, r5, r1)
            n(r4, r1)
            goto L941
        L981:
            r9 = 1
        L982:
            if (r9 == 0) goto L986
            r4 = 1
            goto L988
        L986:
            r4 = r17
        L988:
            java.util.Iterator r0 = r16.iterator()
            r9 = r4
        L98d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9a1
            java.lang.Object r2 = r0.next()
            ud.a r2 = (ud.a) r2
            boolean r2 = ce.m.q(r2)
            if (r2 == 0) goto L98d
            r9 = 1
            goto L98d
        L9a1:
            java.util.EnumSet r0 = ce.m.f1651g
            java.util.List r0 = r1.f13732z
            a7.b r2 = new a7.b
            r6 = 28
            r2.<init>(r6)
            boolean r0 = r0.removeIf(r2)
            if (r0 == 0) goto L9b3
            r9 = 1
        L9b3:
            if (r9 == 0) goto L9bb
            i(r1)
            j(r1)
        L9bb:
            java.util.List r0 = r1.f13732z     // Catch: java.lang.Exception -> La1d
            int r0 = r0.size()     // Catch: java.lang.Exception -> La1d
            ce.p[] r0 = new ce.p[r0]     // Catch: java.lang.Exception -> La1d
            ce.p r2 = ce.p.f1656g     // Catch: java.lang.Exception -> La1d
            java.util.Arrays.fill(r0, r2)     // Catch: java.lang.Exception -> La1d
            ud.a r2 = r1.B     // Catch: java.lang.Exception -> La1d
            fb.v0.i(r1, r0, r2)     // Catch: java.lang.Exception -> La1d
            md.b r0 = md.b.B
            md.f r2 = r1.f8877g
            java.util.List r0 = r2.d(r0)
            java.util.stream.Stream r2 = r0.stream()
            ce.n r3 = new ce.n
            r15 = 0
            r3.<init>(r15)
            java.util.stream.Stream r2 = r2.filter(r3)
            java.util.stream.Collector r3 = java.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r3)
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L9f5
        L9f3:
            r6 = r15
            goto La25
        L9f5:
            ce.n r3 = new ce.n     // Catch: java.lang.Exception -> La16
            r9 = 1
            r3.<init>(r9)     // Catch: java.lang.Exception -> La16
            java.util.List r0 = be.h.v(r0, r3)     // Catch: java.lang.Exception -> La16
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> La16
            r6 = r15
        La04:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> La16
            if (r3 == 0) goto La25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> La16
            nd.h0 r3 = (nd.h0) r3     // Catch: java.lang.Exception -> La16
            boolean r3 = fb.v0.p(r1, r3, r0)     // Catch: java.lang.Exception -> La16
            r6 = r6 | r3
            goto La04
        La16:
            r0 = move-exception
            java.lang.String r2 = "Failed to fix multi-entry loops"
            r1.M(r2, r0)
            goto L9f3
        La1d:
            r0 = move-exception
            r15 = 0
            java.lang.String r2 = "Failed to detect multi-entry loops"
            r1.M(r2, r0)
            goto L9f3
        La25:
            if (r6 == 0) goto La2a
            j(r1)
        La2a:
            java.util.List r0 = r1.f13732z
            ae.e r2 = new ae.e
            r4 = 10
            r2.<init>(r4)
            r0.forEach(r2)
            java.util.List r0 = r1.f13732z
            int r0 = r0.size()
            r2 = 100
            int r2 = java.lang.Math.max(r2, r0)
            r3 = r15
        La43:
            boolean r4 = m(r1)
            if (r4 == 0) goto La64
            j(r1)
            int r4 = r3 + 1
            if (r3 <= r2) goto La62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "CFG modification limit reached, blocks count: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.K(r0)
            goto La64
        La62:
            r3 = r4
            goto La43
        La64:
            i(r1)
            f8.i.n(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.F = r0
            java.util.List r0 = r1.f13732z
            ce.d r2 = new ce.d
            r13 = 2
            r2.<init>(r1, r13)
            r0.forEach(r2)
            java.util.List r0 = r1.F
            int r0 = r0.size()
            if (r0 != 0) goto La85
            goto Lacf
        La85:
            java.util.List r0 = r1.F
            java.util.Iterator r0 = r0.iterator()
        La8b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lacf
            java.lang.Object r2 = r0.next()
            nd.t r2 = (nd.t) r2
            java.util.List r3 = r1.F
            java.util.Iterator r3 = r3.iterator()
        La9d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La8b
            java.lang.Object r4 = r3.next()
            nd.t r4 = (nd.t) r4
            if (r2 != r4) goto Laac
            goto La9d
        Laac:
            java.util.HashSet r5 = r2.f9394c
            java.util.HashSet r6 = r4.f9394c
            boolean r5 = r5.containsAll(r6)
            if (r5 == 0) goto La9d
            nd.t r5 = r4.f9396e
            if (r5 == 0) goto Lacc
            java.util.HashSet r6 = r5.f9394c
            java.util.HashSet r7 = r2.f9394c
            boolean r6 = r6.containsAll(r7)
            if (r6 == 0) goto Lac9
            r2.f9396e = r5
            r4.f9396e = r2
            goto La9d
        Lac9:
            r5.f9396e = r2
            goto La9d
        Lacc:
            r4.f9396e = r2
            goto La9d
        Lacf:
            g4.a.i(r1)
            java.util.List r0 = r1.f13732z
            ae.e r1 = new ae.e
            r4 = 10
            r1.<init>(r4)
            r0.forEach(r1)
        Lade:
            return
    }
}
