package ee;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends be.a {
    static {
            java.lang.Class<ee.c> r0 = ee.c.class
            mh.d.b(r0)
            return
    }

    public static boolean i(ud.a r18, ud.a r19, ee.b r20, ee.a r21, java.util.HashMap r22) {
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            ee.b r5 = r3.f2729e
            ze.a r6 = new ze.a
            r6.<init>(r0, r1)
            java.lang.Object r7 = r4.get(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L1e
            boolean r0 = r7.booleanValue()
            return r0
        L1e:
            md.f r7 = r1.f8877g
            md.a r8 = md.a.f8829l
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L2b
            java.util.List r1 = r1.f13677o
            goto L2d
        L2b:
            java.util.List r1 = r1.f13676n
        L2d:
            md.f r7 = r0.f8877g
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L38
            java.util.List r0 = r0.f13677o
            goto L3a
        L38:
            java.util.List r0 = r0.f13676n
        L3a:
            int r7 = r1.size()
            int r8 = r0.size()
            if (r7 != r8) goto Ld1
            r7 = 0
            r8 = r7
        L46:
            int r10 = r1.size()
            if (r8 >= r10) goto Ld1
            java.lang.Object r10 = r1.get(r8)
            ud.a r10 = (ud.a) r10
            java.lang.Object r11 = r0.get(r8)
            ud.a r11 = (ud.a) r11
            java.util.ArrayList r12 = r3.f2726b
            boolean r12 = r12.contains(r10)
            if (r12 == 0) goto Lc7
            java.util.ArrayList r12 = r11.f13674l
            java.util.ArrayList r13 = r10.f13674l
            int r14 = r12.size()
            int r15 = r13.size()
            if (r15 != 0) goto L74
            if (r14 != 0) goto L95
            r17 = r0
        L72:
            r7 = 1
            goto Lb9
        L74:
            if (r14 >= r15) goto L77
            goto L95
        L77:
            r3.f2732h = r12
            r3.f2733i = r7
        L7b:
            if (r7 >= r15) goto L9c
            java.lang.Object r16 = r12.get(r7)
            r9 = r16
            ud.p r9 = (ud.p) r9
            java.lang.Object r16 = r13.get(r7)
            r17 = r0
            r0 = r16
            ud.p r0 = (ud.p) r0
            boolean r0 = o(r3, r9, r0)
            if (r0 != 0) goto L97
        L95:
            r9 = 0
            goto Ld3
        L97:
            int r7 = r7 + 1
            r0 = r17
            goto L7b
        L9c:
            r17 = r0
            if (r14 <= r15) goto L72
            java.util.ArrayList r0 = r11.f13674l
            r7 = 0
        La3:
            if (r7 >= r15) goto Lb1
            java.lang.Object r9 = r0.get(r7)
            ud.p r9 = (ud.p) r9
            r2.b(r11, r9)
            int r7 = r7 + 1
            goto La3
        Lb1:
            r7 = 1
            r2.f2736c = r7
            r5.a(r10)
            r5.f2736c = r7
        Lb9:
            boolean r0 = i(r11, r10, r2, r3, r4)
            if (r0 != 0) goto Lc0
            goto L95
        Lc0:
            r2.a(r11)
            r5.a(r10)
            goto Lca
        Lc7:
            r17 = r0
            r7 = 1
        Lca:
            int r8 = r8 + 1
            r0 = r17
            r7 = 0
            goto L46
        Ld1:
            r7 = 1
            r9 = r7
        Ld3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r4.put(r6, r0)
            return r9
    }

    public static boolean j(ee.a r4, java.util.ArrayList r5, java.util.ArrayList r6, int r7) {
            r4.f2732h = r5
            r4.f2733i = r7
            int r0 = r6.size()
            r1 = 1
            int r0 = r0 - r1
        La:
            if (r0 < 0) goto L25
            java.lang.Object r2 = r6.get(r0)
            ud.p r2 = (ud.p) r2
            int r3 = r7 + r0
            java.lang.Object r3 = r5.get(r3)
            ud.p r3 = (ud.p) r3
            boolean r2 = o(r4, r3, r2)
            if (r2 != 0) goto L22
            r4 = 0
            return r4
        L22:
            int r0 = r0 + (-1)
            goto La
        L25:
            return r1
    }

    public static void k(qd.l r1, qd.l r2) {
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L1c
            boolean r0 = r1 instanceof qd.r
            if (r0 == 0) goto L1c
            boolean r0 = r2 instanceof qd.r
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            qd.r r1 = (qd.r) r1
            qd.s r1 = r1.f10923m
            qd.r r2 = (qd.r) r2
            qd.s r2 = r2.f10923m
            qd.k r1 = r1.b()
            r2.m(r1)
        L1c:
            return
    }

    public static void l(ee.b r4, md.a r5) {
            java.util.ArrayList r0 = r4.f2734a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            r1.w(r5)
            goto L6
        L16:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.ArrayList r1 = r4.f2734a
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            java.util.IdentityHashMap r3 = r4.f2735b
            java.lang.Object r2 = r3.get(r2)
            ud.a r2 = (ud.a) r2
            r0.add(r2)
            goto L21
        L39:
            java.util.Iterator r4 = r0.iterator()
        L3d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r4.next()
            ud.a r0 = (ud.a) r0
            java.util.ArrayList r1 = r0.f13674l
            java.util.Iterator r1 = r1.iterator()
        L4f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r1.next()
            ud.p r2 = (ud.p) r2
            md.f r2 = r2.f8877g
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L4f
            goto L3d
        L64:
            r0.w(r5)
            goto L3d
        L68:
            return
    }

    public static boolean m(ud.r r22, ae.h r23) {
            r0 = r22
            r1 = r23
            boolean r2 = r1.f248l
            java.util.List r3 = r1.f244h
            r4 = 0
            if (r2 == 0) goto Lf
        Lb:
            r16 = r4
            goto L38c
        Lf:
            java.util.Iterator r2 = r3.iterator()
        L13:
            boolean r5 = r2.hasNext()
            r6 = 0
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r2.next()
            ae.f r5 = (ae.f) r5
            boolean r7 = r5.c()
            if (r7 == 0) goto L13
            java.util.ArrayList r2 = r5.f235d
            java.util.Iterator r2 = r2.iterator()
        L2c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L49
            java.lang.Object r7 = r2.next()
            ud.a r7 = (ud.a) r7
            ud.p r8 = a.a.c0(r7)
            if (r8 == 0) goto L2c
            pd.k r8 = r8.f13713k
            pd.k r9 = pd.k.f10509r
            if (r8 != r9) goto L2c
            ud.p r6 = a.a.c0(r7)
            goto L2c
        L49:
            r2 = r6
            r6 = r5
            goto L4d
        L4c:
            r2 = r6
        L4d:
            if (r6 == 0) goto Lb
            java.util.ArrayList r5 = r6.f235d
            if (r2 == 0) goto Lb
            ud.a r7 = r6.f234c
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            java.util.BitSet r10 = a.a.D0(r0)
            r11 = 1
            a.a.z(r7, r7, r9, r10, r11)
            r8.<init>(r9)
            r8.remove(r7)
            ce.n r9 = new ce.n
            r10 = 5
            r9.<init>(r10)
            java.util.List r9 = be.h.v(r8, r9)
            int r10 = r9.size()
            if (r10 == r11) goto L95
            int r9 = r9.size()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r12 = "Finally have unexpected throw blocks count: "
            r10.<init>(r12)
            r10.append(r9)
            java.lang.String r9 = ", expect 1"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r0.I(r9)
            goto La1
        L95:
            java.lang.Object r9 = r9.get(r4)
            ud.a r9 = (ud.a) r9
            r8.remove(r9)
            n(r8, r9)
        La1:
            boolean r9 = r8.isEmpty()
            md.a r10 = md.a.f8838s
            if (r9 != 0) goto L375
            boolean r9 = a.a.l0(r8)
            if (r9 == 0) goto Lb1
            goto L375
        Lb1:
            java.util.List r7 = r7.f13677o
            java.lang.Object r7 = xe.s.f(r7)
            ud.a r7 = (ud.a) r7
            ee.a r9 = new ee.a
            r9.<init>(r0, r7, r8)
            java.util.List r7 = r1.f247k
            boolean r7 = r7.isEmpty()
            r12 = r7 ^ 1
            if (r7 != 0) goto Le5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r3)
            java.util.List r14 = r1.f247k
            java.util.Iterator r14 = r14.iterator()
        Ld3:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Le6
            java.lang.Object r15 = r14.next()
            ae.h r15 = (ae.h) r15
            java.util.List r15 = r15.f244h
            r13.addAll(r15)
            goto Ld3
        Le5:
            r13 = r3
        Le6:
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto Lee
            goto Lb
        Lee:
            java.util.Iterator r14 = r13.iterator()
        Lf2:
            boolean r15 = r14.hasNext()
            r16 = r4
            ee.b r4 = r9.f2729e
            if (r15 == 0) goto L13c
            java.lang.Object r15 = r14.next()
            ae.f r15 = (ae.f) r15
            if (r15 != r6) goto L107
            r4 = r16
            goto Lf2
        L107:
            java.util.ArrayList r15 = r15.f235d
            java.util.Iterator r15 = r15.iterator()
        L10d:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L135
            java.lang.Object r17 = r15.next()
            r18 = r11
            r11 = r17
            ud.a r11 = (ud.a) r11
            boolean r11 = p(r11, r9)
            if (r11 == 0) goto L124
            goto L137
        L124:
            boolean r11 = r4.f2736c
            if (r11 != 0) goto L132
            java.util.ArrayList r11 = r4.f2734a
            r11.clear()
            java.util.IdentityHashMap r11 = r4.f2735b
            r11.clear()
        L132:
            r11 = r18
            goto L10d
        L135:
            r18 = r11
        L137:
            r4 = r16
            r11 = r18
            goto Lf2
        L13c:
            r18 = r11
            java.util.ArrayList r11 = r9.f2727c
            int r14 = r11.size()
            int r13 = r13.size()
            int r13 = r13 + (-1)
            if (r14 != r13) goto L14d
            goto L15b
        L14d:
            if (r7 != 0) goto L38c
            int r7 = r3.size()
            int r7 = r7 + (-1)
            if (r14 == r7) goto L159
            goto L38c
        L159:
            r12 = r16
        L15b:
            ae.h r7 = r6.f238g
            java.util.List r7 = r7.f245i
            ud.a r5 = a.a.V(r5)
            if (r5 != 0) goto L167
            goto L38c
        L167:
            ud.a r5 = a.a.K(r5)
            ud.a r13 = a.a.d0(r5)
            if (r13 != 0) goto L173
            goto L38c
        L173:
            java.util.List r14 = r13.f13675m
            java.util.stream.Stream r14 = r14.stream()
            ce.o r15 = new ce.o
            r17 = r7
            r7 = 2
            r15.<init>(r5, r7)
            java.util.stream.Stream r5 = r14.filter(r15)
            ud.a r7 = r0.C
            if (r13 != r7) goto L194
            com.alibaba.fastjson2.writer.b r7 = new com.alibaba.fastjson2.writer.b
            r13 = 17
            r7.<init>(r13)
            java.util.stream.Stream r5 = r5.flatMap(r7)
        L194:
            java.util.stream.Collector r7 = java.util.stream.Collectors.toList()
            java.lang.Object r5 = r5.collect(r7)
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = r16
        L1a4:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L229
            java.lang.Object r13 = r5.next()
            ud.a r13 = (ud.a) r13
            java.util.BitSet r14 = a.a.D0(r0)
            boolean r15 = r17.isEmpty()
            if (r15 != 0) goto L1e0
            java.util.BitSet r15 = a.a.D0(r0)
            java.util.Iterator r19 = r17.iterator()
        L1c2:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L1da
            java.lang.Object r20 = r19.next()
            r21 = r5
            r5 = r20
            ud.a r5 = (ud.a) r5
            int r5 = r5.f13672j
            r15.set(r5)
            r5 = r21
            goto L1c2
        L1da:
            r21 = r5
            r14.or(r15)
            goto L1e2
        L1e0:
            r21 = r5
        L1e2:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            x8.h r15 = new x8.h
            r19 = r7
            r7 = 1
            r15.<init>(r5, r7)
            a.a.U0(r13, r14, r15)
            int r7 = r5.size()
            int r13 = r8.size()
            if (r7 >= r13) goto L201
        L1fc:
            r7 = r19
        L1fe:
            r5 = r21
            goto L1a4
        L201:
            java.util.Iterator r5 = r5.iterator()
        L205:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1fc
            java.lang.Object r7 = r5.next()
            ud.a r7 = (ud.a) r7
            boolean r7 = p(r7, r9)
            if (r7 == 0) goto L21a
            r7 = r18
            goto L1fe
        L21a:
            boolean r7 = r4.f2736c
            if (r7 != 0) goto L205
            java.util.ArrayList r7 = r4.f2734a
            r7.clear()
            java.util.IdentityHashMap r7 = r4.f2735b
            r7.clear()
            goto L205
        L229:
            r19 = r7
            if (r19 != 0) goto L22f
            goto L38c
        L22f:
            java.util.ArrayList r5 = r4.f2734a
            java.util.Iterator r7 = r11.iterator()
        L235:
            boolean r8 = r7.hasNext()
            java.lang.String r13 = ", expected: "
            ud.r r14 = r9.f2725a
            if (r8 == 0) goto L276
            java.lang.Object r8 = r7.next()
            ee.b r8 = (ee.b) r8
            java.util.ArrayList r15 = r8.f2734a
            int r15 = r15.size()
            r17 = r7
            int r7 = r5.size()
            if (r15 == r7) goto L273
            java.lang.String r1 = java.lang.String.valueOf(r8)
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect finally slice size: "
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r13)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r14.I(r1)
            goto L2c5
        L273:
            r7 = r17
            goto L235
        L276:
            r7 = r16
        L278:
            int r8 = r5.size()
            if (r7 >= r8) goto L2d7
            java.lang.Object r8 = r5.get(r7)
            ud.p r8 = (ud.p) r8
            java.util.Iterator r9 = r11.iterator()
        L288:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L2d0
            java.lang.Object r15 = r9.next()
            ee.b r15 = (ee.b) r15
            java.util.ArrayList r15 = r15.f2734a
            java.lang.Object r15 = r15.get(r7)
            ud.p r15 = (ud.p) r15
            r17 = r5
            pd.k r5 = r8.f13713k
            r19 = r7
            pd.k r7 = r15.f13713k
            if (r5 == r7) goto L2cb
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r2 = java.lang.String.valueOf(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect finally slice insn: "
            r3.<init>(r4)
            r3.append(r1)
            r3.append(r13)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r14.I(r1)
        L2c5:
            java.lang.String r1 = "Finally extract failed"
            r0.L(r1)
            return r16
        L2cb:
            r5 = r17
            r7 = r19
            goto L288
        L2d0:
            r17 = r5
            r19 = r7
            int r7 = r19 + 1
            goto L278
        L2d7:
            md.a r0 = md.a.C
            l(r4, r0)
            java.util.Iterator r0 = r11.iterator()
        L2e0:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L2f0
            java.lang.Object r5 = r0.next()
            ee.b r5 = (ee.b) r5
            l(r5, r10)
            goto L2e0
        L2f0:
            java.util.ArrayList r0 = r4.f2734a
            r4 = r16
        L2f4:
            int r5 = r0.size()
            if (r4 >= r5) goto L33a
            java.lang.Object r5 = r0.get(r4)
            ud.p r5 = (ud.p) r5
            java.util.Iterator r7 = r11.iterator()
        L304:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L337
            java.lang.Object r8 = r7.next()
            ee.b r8 = (ee.b) r8
            java.util.ArrayList r8 = r8.f2734a
            java.lang.Object r8 = r8.get(r4)
            ud.p r8 = (ud.p) r8
            qd.r r9 = r5.f13714l
            qd.r r13 = r8.f13714l
            k(r9, r13)
            java.util.List r9 = r5.f13715m
            int r9 = r9.size()
            r13 = r16
        L327:
            if (r13 >= r9) goto L304
            qd.l r14 = r5.S(r13)
            qd.l r15 = r8.S(r13)
            k(r14, r15)
            int r13 = r13 + 1
            goto L327
        L337:
            int r4 = r4 + 1
            goto L2f4
        L33a:
            r4 = r18
            r6.f239h = r4
            if (r12 == 0) goto L373
            java.util.List r0 = r1.f247k
            java.util.Iterator r4 = r0.iterator()
        L346:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L362
            java.lang.Object r5 = r4.next()
            ae.h r5 = (ae.h) r5
            java.util.List r6 = r5.f244h
            r3.addAll(r6)
            java.util.List r6 = r1.f245i
            java.util.List r7 = r5.f245i
            r6.addAll(r7)
            r6 = 1
            r5.f248l = r6
            goto L346
        L362:
            java.util.List r3 = r1.f245i
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r3)
            r4.<init>(r5)
            r1.f245i = r4
            r0.clear()
        L373:
            r4 = 1
            goto L388
        L375:
            ae.h r0 = r6.f238g
            java.util.List r0 = r0.f244h
            r0.remove(r6)
            r4 = 1
            r6.f240i = r4
            ae.e r0 = new ae.e
            r1 = 0
            r0.<init>(r1)
            r5.forEach(r0)
        L388:
            r2.w(r10)
            return r4
        L38c:
            return r16
    }

    public static void n(java.util.ArrayList r3, ud.a r4) {
            java.util.List r0 = r4.f13675m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            ud.a r1 = (ud.a) r1
            java.util.ArrayList r2 = r1.f13674l
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L6
            boolean r2 = r3.remove(r1)
            if (r2 == 0) goto L6
            java.util.List r2 = r1.f13677o
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L2a
            r2 = 0
            goto L30
        L2a:
            java.util.List r2 = r1.f13676n
            boolean r2 = r2.contains(r4)
        L30:
            if (r2 != 0) goto L6
            n(r3, r1)
            goto L6
        L36:
            return
    }

    public static boolean o(ee.a r11, ud.p r12, ud.p r13) {
            boolean r0 = r12.Y(r13)
            r1 = 0
            if (r0 != 0) goto L9
            goto Le9
        L9:
            r0 = r1
        La:
            java.util.List r2 = r12.f13715m
            int r2 = r2.size()
            r3 = 1
            if (r0 >= r2) goto Lee
            qd.l r2 = r12.S(r0)
            qd.l r4 = r13.S(r0)
            r2.getClass()
            boolean r5 = r2 instanceof qd.r
            r4.getClass()
            boolean r6 = r4 instanceof qd.r
            if (r5 == r6) goto L2a
        L27:
            r3 = r1
            goto Le7
        L2a:
            if (r5 == 0) goto Lc3
            r5 = r2
            qd.r r5 = (qd.r) r5
            r6 = r4
            qd.r r6 = (qd.r) r6
            boolean r7 = r5.g0(r6)
            if (r7 != 0) goto Lc3
            md.f r7 = r6.f8877g
            md.b r8 = md.b.L
            oc.b r7 = r7.c(r8)
            nd.d0 r7 = (nd.d0) r7
            md.f r9 = r5.f8877g
            oc.b r8 = r9.c(r8)
            nd.d0 r8 = (nd.d0) r8
            if (r7 == 0) goto L54
            if (r8 != 0) goto L4f
            goto L54
        L4f:
            boolean r7 = r8.equals(r7)
            goto L55
        L54:
            r7 = r1
        L55:
            if (r7 != 0) goto Lc3
            ee.b r7 = r11.f2729e
            java.util.ArrayList r7 = r7.f2734a
            ud.p r8 = r6.f0()
            int r7 = xe.k.a(r7, r8, r1)
            r8 = -1
            if (r7 == r8) goto L68
            r7 = r3
            goto L69
        L68:
            r7 = r1
        L69:
            if (r7 == 0) goto L6d
        L6b:
            r7 = r1
            goto L95
        L6d:
            ud.p r7 = r5.f0()
            ee.b r9 = r11.f2731g
            if (r9 == 0) goto L83
            java.util.ArrayList r9 = r9.f2734a
            int r9 = xe.k.a(r9, r7, r1)
            if (r9 == r8) goto L7f
            r9 = r3
            goto L80
        L7f:
            r9 = r1
        L80:
            if (r9 == 0) goto L83
            goto L6b
        L83:
            java.util.List r9 = r11.f2732h
            boolean r10 = xe.s.n(r9)
            if (r10 == 0) goto L94
            int r10 = r11.f2733i
            int r7 = xe.k.a(r9, r7, r10)
            if (r7 == r8) goto L94
            goto L6b
        L94:
            r7 = r3
        L95:
            if (r7 == 0) goto Lc3
            ud.p r6 = r6.f0()
            ud.p r5 = r5.f0()
            if (r6 == 0) goto Laa
            if (r5 != 0) goto La4
            goto Laa
        La4:
            boolean r7 = r6.Y(r5)
            if (r7 != 0) goto Lac
        Laa:
            r5 = r3
            goto Lbf
        Lac:
            boolean r7 = r6.W()
            if (r7 == 0) goto Lbe
            boolean r7 = r5.W()
            if (r7 == 0) goto Lbe
            boolean r5 = r6.X(r5)
            r5 = r5 ^ r3
            goto Lbf
        Lbe:
            r5 = r1
        Lbf:
            if (r5 == 0) goto Lc3
            goto L27
        Lc3:
            boolean r5 = r2.K()
            boolean r6 = r4.K()
            if (r5 == r6) goto Lcf
            goto L27
        Lcf:
            if (r5 == 0) goto Le7
            boolean r5 = r2.K()
            if (r5 == 0) goto Le2
            boolean r5 = r4.K()
            if (r5 == 0) goto Le2
            boolean r2 = r2.equals(r4)
            goto Le3
        Le2:
            r2 = r1
        Le3:
            if (r2 != 0) goto Le7
            goto L27
        Le7:
            if (r3 != 0) goto Lea
        Le9:
            return r1
        Lea:
            int r0 = r0 + 1
            goto La
        Lee:
            return r3
    }

    public static boolean p(ud.a r12, ee.a r13) {
            java.util.HashSet r0 = r13.f2728d
            boolean r0 = r0.add(r12)
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lef
        Lb:
            ud.a r0 = r13.f2730f
            r2 = 0
            r13.f2731g = r2
            ee.b r3 = r13.f2729e
            java.util.ArrayList r4 = r12.f13674l
            java.util.ArrayList r5 = r0.f13674l
            int r6 = r4.size()
            int r7 = r5.size()
            r8 = 1
            if (r6 >= r7) goto L24
        L21:
            r10 = r2
            goto Lba
        L24:
            if (r6 != r7) goto L30
            boolean r7 = j(r13, r4, r5, r1)
            if (r7 != 0) goto L2d
            goto L21
        L2d:
            r7 = r1
            r9 = r7
            goto L4e
        L30:
            int r9 = r6 - r7
            boolean r10 = j(r13, r4, r5, r9)
            if (r10 != 0) goto L4d
            r10 = r8
        L39:
            if (r10 >= r9) goto L48
            boolean r11 = j(r13, r4, r5, r10)
            if (r11 == 0) goto L45
            int r7 = r7 + r10
            r9 = r10
            r10 = r8
            goto L4a
        L45:
            int r10 = r10 + 1
            goto L39
        L48:
            r7 = r1
            r10 = r7
        L4a:
            if (r10 != 0) goto L4e
            goto L21
        L4d:
            r7 = r1
        L4e:
            ee.b r10 = new ee.b
            r10.<init>()
            r13.f2731g = r10
            if (r7 == 0) goto L5b
            int r6 = r7 + 1
            r7 = r8
            goto L5c
        L5b:
            r7 = r1
        L5c:
            if (r9 >= r6) goto L6a
            java.lang.Object r11 = r4.get(r9)
            ud.p r11 = (ud.p) r11
            r10.b(r12, r11)
            int r9 = r9 + 1
            goto L5c
        L6a:
            boolean r4 = r3.f2736c
            if (r4 == 0) goto La0
            java.util.ArrayList r4 = r3.f2734a
            int r4 = r4.size()
            java.util.ArrayList r5 = r10.f2734a
            int r5 = r5.size()
            if (r4 == r5) goto Lb4
            ud.r r4 = r13.f2725a
            java.lang.String r5 = java.lang.String.valueOf(r10)
            java.lang.String r6 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Another duplicated slice has different insns count: "
            r7.<init>(r9)
            r7.append(r5)
            java.lang.String r5 = ", finally: "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            r4.I(r5)
            goto L21
        La0:
            java.util.Iterator r4 = r5.iterator()
        La4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            r3.b(r0, r5)
            goto La4
        Lb4:
            if (r7 == 0) goto Lba
            r10.f2736c = r8
            r3.f2736c = r8
        Lba:
            if (r10 != 0) goto Lbd
            goto Led
        Lbd:
            boolean r4 = r10.f2736c
            if (r4 != 0) goto Ld0
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r12 = i(r12, r0, r10, r13, r4)
            if (r12 == 0) goto Led
            r10.f2736c = r8
            r3.f2736c = r8
        Ld0:
            java.util.ArrayList r12 = r10.f2734a
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto Ld9
            goto Led
        Ld9:
            int r0 = r12.size()
            if (r0 != r8) goto Lec
            java.lang.Object r12 = r12.get(r1)
            ud.p r12 = (ud.p) r12
            pd.k r12 = r12.f13713k
            pd.k r0 = pd.k.f10513v
            if (r12 != r0) goto Lec
            goto Led
        Lec:
            r2 = r10
        Led:
            if (r2 != 0) goto Lf0
        Lef:
            return r1
        Lf0:
            java.util.ArrayList r12 = r13.f2727c
            r12.add(r2)
            return r8
    }

    @Override // be.a
    public final void g(ud.r r6) {
            r5 = this;
            md.b r0 = md.b.f8865t
            boolean r1 = r6.f13722p
            if (r1 != 0) goto L90
            java.util.List r1 = r6.E
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L10
            goto L90
        L10:
            md.f r1 = r6.f8877g     // Catch: java.lang.Exception -> L2d
            java.util.List r1 = r1.d(r0)     // Catch: java.lang.Exception -> L2d
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> L2d
            r3 = 0
        L1b:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Exception -> L2d
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Exception -> L2d
            ae.h r4 = (ae.h) r4     // Catch: java.lang.Exception -> L2d
            boolean r4 = m(r6, r4)     // Catch: java.lang.Exception -> L2d
            r3 = r3 | r4
            goto L1b
        L2d:
            r0 = move-exception
            goto L5e
        L2f:
            if (r3 == 0) goto L90
            java.util.List r2 = r6.E     // Catch: java.lang.Exception -> L2d
            ud.b r3 = new ud.b     // Catch: java.lang.Exception -> L2d
            r4 = 1
            r3.<init>(r4)     // Catch: java.lang.Exception -> L2d
            r2.removeIf(r3)     // Catch: java.lang.Exception -> L2d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2d
            r2.<init>(r1)     // Catch: java.lang.Exception -> L2d
            ce.n r1 = new ce.n     // Catch: java.lang.Exception -> L2d
            r3 = 4
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2d
            boolean r1 = r2.removeIf(r1)     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L90
            r6.E(r0)     // Catch: java.lang.Exception -> L2d
            md.f r0 = r6.C()     // Catch: java.lang.Exception -> L2d
            md.d r1 = new md.d     // Catch: java.lang.Exception -> L2d
            r3 = 0
            r1.<init>(r0, r3)     // Catch: java.lang.Exception -> L2d
            r2.forEach(r1)     // Catch: java.lang.Exception -> L2d
            return
        L5e:
            java.lang.String r1 = "Undo finally extract visitor"
            r6.M(r1, r0)
            r6.e0()     // Catch: java.lang.Exception -> L8a
            r6.a0()     // Catch: java.lang.Exception -> L8a
            ud.e r0 = r6.f13718l     // Catch: java.lang.Exception -> L8a
            ud.u r0 = r0.f13688k     // Catch: java.lang.Exception -> L8a
            dd.b r0 = r0.f13759r     // Catch: java.lang.Exception -> L8a
            java.util.ArrayList r0 = r0.f2204a     // Catch: java.lang.Exception -> L8a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L8a
        L75:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto L90
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L8a
            be.a r1 = (be.a) r1     // Catch: java.lang.Exception -> L8a
            boolean r2 = r1 instanceof ee.c     // Catch: java.lang.Exception -> L8a
            if (r2 == 0) goto L86
            goto L90
        L86:
            be.h.i0(r1, r6)     // Catch: java.lang.Exception -> L8a
            goto L75
        L8a:
            r0 = move-exception
            java.lang.String r1 = "Undo finally extract failed"
            xe.h.a(r6, r1, r0)
        L90:
            return
    }
}
