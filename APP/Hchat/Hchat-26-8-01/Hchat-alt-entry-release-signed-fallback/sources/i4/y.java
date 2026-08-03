package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f6495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f6496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f6497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f6498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f6499g;

    public y(i4.z r2, i4.i r3, java.util.ArrayList r4) {
            r1 = this;
            r1.<init>()
            r1.f6499g = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f6495c = r0
            java.util.BitSet r0 = new java.util.BitSet
            int r2 = r2.f6503d
            r0.<init>(r2)
            r1.f6496d = r0
            r1.f6497e = r3
            r1.f6498f = r4
            return
    }

    public y(ud.r r3) {
            r2 = this;
            r2.<init>()
            r2.f6495c = r3
            le.c r0 = new le.c
            r0.<init>()
            r2.f6496d = r0
            le.a r0 = new le.a
            r0.<init>(r3, r2)
            r2.f6497e = r0
            b5.c r1 = new b5.c
            r1.<init>(r3, r2, r0)
            r2.f6498f = r1
            ze.c r0 = new ze.c
            r0.<init>(r3)
            r2.f6499g = r0
            java.util.List r3 = r3.f13732z
            int r3 = r3.size()
            int r3 = r3 * 100
            r2.f6493a = r3
            return
    }

    public void a(u4.b r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Object r2 = r0.f6498f
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.f6499g
            i4.z r3 = (i4.z) r3
            z4.g r4 = r1.f13367c
            int r5 = r1.f13365a
            r6 = 0
            int r4 = r4.n(r6)
            r0.f6494b = r4
            z4.g r4 = r1.f13367c
            r7 = 1
            int r4 = r4.n(r7)
            r0.f6493a = r4
            int r4 = r0.c(r4)
            java.lang.Object r8 = r0.f6496d
            java.util.BitSet r8 = (java.util.BitSet) r8
            int r9 = r8.nextSetBit(r6)
        L2c:
            if (r9 < 0) goto L16f
            r8.clear(r9)
            java.lang.Object r10 = r0.f6495c
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r10 = r10.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            u4.b r11 = r3.j(r9)
            z4.g r12 = r11.f13367c
            boolean r13 = r3.h(r11)
            if (r13 == 0) goto L6e
            int r13 = r12.n(r6)
            int r13 = r0.c(r13)
            int r12 = r12.n(r7)
            z4.g r15 = new z4.g
            r16 = r7
            r7 = 2
            r15.<init>(r7)
            r15.l(r13)
            r15.l(r12)
            r15.f22555g = r6
            r14 = -1
            goto Le7
        L6e:
            r16 = r7
            f1.h[] r7 = r3.f6511l
            int r13 = r7.length
            int r13 = r13 + (-1)
        L75:
            if (r13 < 0) goto L89
            r15 = r7[r13]
            if (r15 == 0) goto L86
            java.lang.Object r14 = r15.f3059j
            java.util.BitSet r14 = (java.util.BitSet) r14
            boolean r14 = r14.get(r9)
            if (r14 == 0) goto L86
            goto L8a
        L86:
            int r13 = r13 + (-1)
            goto L75
        L89:
            r15 = 0
        L8a:
            if (r15 == 0) goto Lc1
            int r7 = r15.f3057h
            int r12 = r0.f6493a
            if (r7 != r12) goto L9b
            int r7 = r0.f6494b
            z4.g r15 = z4.g.o(r7)
            int r14 = r0.f6494b
            goto Le7
        L9b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = a.a.X0(r7)
            int r3 = r0.f6493a
            java.lang.String r3 = a.a.X0(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ret instruction returns to label "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " expected: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            throw r1
        Lc1:
            int r7 = r11.f13368d
            int r13 = r12.f22552i
            z4.g r15 = new z4.g
            r15.<init>(r13)
            r14 = -1
        Lcb:
            if (r6 >= r13) goto Le4
            r17 = r13
            int r13 = r12.n(r6)
            r18 = r6
            int r6 = r0.c(r13)
            r15.l(r6)
            if (r7 != r13) goto Ldf
            r14 = r6
        Ldf:
            int r6 = r18 + 1
            r13 = r17
            goto Lcb
        Le4:
            r6 = 0
            r15.f22555g = r6
        Le7:
            u4.b r6 = new u4.b
            h4.u r7 = r11.f13366b
            java.lang.Object[] r11 = r7.f22543h
            int r11 = r11.length
            r12 = 0
            r13 = 0
        Lf0:
            if (r12 >= r11) goto L10b
            java.lang.Object r17 = r7.l(r12)
            r18 = r12
            r12 = r17
            u4.i r12 = (u4.i) r12
            u4.r r12 = r12.f13382g
            r17 = r4
            u4.r r4 = u4.s.f13437g
            if (r12 == r4) goto L106
            int r13 = r13 + 1
        L106:
            int r12 = r18 + 1
            r4 = r17
            goto Lf0
        L10b:
            r17 = r4
            if (r13 != r11) goto L110
            goto L13e
        L110:
            h4.u r4 = new h4.u
            r4.<init>(r13)
            r12 = 0
            r13 = 0
        L117:
            if (r12 >= r11) goto L13a
            java.lang.Object r18 = r7.l(r12)
            r19 = r7
            r7 = r18
            u4.i r7 = (u4.i) r7
            r18 = r11
            u4.r r11 = r7.f13382g
            r20 = r12
            u4.r r12 = u4.s.f13437g
            if (r11 == r12) goto L133
            int r11 = r13 + 1
            r4.m(r13, r7)
            r13 = r11
        L133:
            int r12 = r20 + 1
            r11 = r18
            r7 = r19
            goto L117
        L13a:
            r7 = 0
            r4.f22555g = r7
            r7 = r4
        L13e:
            r6.<init>(r10, r7, r15, r14)
            java.lang.Object r4 = r2.get(r10)
            z4.g r4 = (z4.g) r4
            r3.a(r6, r4)
            u4.b r4 = r3.j(r9)
            boolean r4 = r3.h(r4)
            if (r4 == 0) goto L164
            i4.y r4 = new i4.y
            java.lang.Object r6 = r0.f6497e
            i4.i r6 = (i4.i) r6
            r4.<init>(r3, r6, r2)
            u4.b r6 = r3.j(r10)
            r4.a(r6)
        L164:
            r6 = 0
            int r9 = r8.nextSetBit(r6)
            r7 = r16
            r4 = r17
            goto L2c
        L16f:
            r17 = r4
            u4.b r4 = new u4.b
            h4.u r1 = r1.f13366b
            z4.g r6 = z4.g.o(r17)
            r7 = r17
            r4.<init>(r5, r1, r6, r7)
            java.lang.Object r1 = r2.get(r5)
            z4.g r1 = (z4.g) r1
            java.util.ArrayList r2 = r3.f6508i
            java.util.ArrayList r5 = r3.f6507h
            int r6 = r4.f13365a
            int r3 = r3.k(r6)
            if (r3 >= 0) goto L191
            goto L197
        L191:
            r5.remove(r3)
            r2.remove(r3)
        L197:
            r5.add(r4)
            r1.k()
            r2.add(r1)
            return
    }

    public xd.b b(ud.a r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.lang.Object r2 = r0.f6495c
            ud.r r2 = (ud.r) r2
            java.lang.Object r3 = r0.f6499g
            ze.c r3 = (ze.c) r3
            java.util.Objects.requireNonNull(r1)
            xd.b r4 = new xd.b
            java.lang.Object r5 = r0.f6496d
            le.c r5 = (le.c) r5
            le.b r6 = r5.f8017b
            xd.a r6 = r6.f8015b
            r4.<init>(r6)
            le.b r6 = r5.f8017b
            java.util.HashSet r6 = r6.f8014a
            boolean r6 = r6.contains(r1)
            pd.k r7 = pd.k.U
            md.b r8 = md.b.A
            if (r6 == 0) goto L80
            md.f r1 = r1.f8877g
            java.util.List r1 = r1.d(r8)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L3a
        L36:
            r14 = r0
            r10 = r4
            goto L7b8
        L3a:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L47:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r3.next()
            nd.f r5 = (nd.f) r5
            ud.p r5 = r5.f9364i
            pd.k r6 = r5.f13713k
            pd.k r8 = pd.k.T
            if (r6 != r8) goto L47
            r2.add(r5)
        L5e:
            java.util.Iterator r1 = r1.iterator()
        L62:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L77
            java.lang.Object r3 = r1.next()
            nd.f r3 = (nd.f) r3
            ud.p r3 = r3.f9364i
            pd.k r5 = r3.f13713k
            if (r5 != r7) goto L62
            r2.add(r3)
        L77:
            ud.o r1 = new ud.o
            r1.<init>(r2)
            r4.H(r1)
            return r4
        L80:
            r3.getClass()
            java.util.BitSet r3 = r3.f22680h
            int r6 = r1.f13672j
            boolean r9 = r3.get(r6)
            r3.set(r6)
            if (r9 == 0) goto Lb4
            java.lang.String r3 = java.lang.String.valueOf(r1)
            md.f r1 = r1.f8877g
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Removed duplicated region for block: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.K(r1)
            return r4
        Lb4:
            if (r1 == 0) goto L36
            java.lang.Object r6 = r0.f6498f
            b5.c r6 = (b5.c) r6
            md.a r9 = md.a.f8821h
            md.f r10 = r1.f8877g
            boolean r9 = r10.a(r9)
            r10 = 1
            if (r9 == 0) goto Lcb
            r14 = r0
            r10 = r4
            r12 = r8
        Lc8:
            r1 = 0
            goto L79f
        Lcb:
            md.b r9 = md.b.f8871z
            md.f r12 = r1.f8877g
            java.util.List r9 = r12.d(r9)
            int r12 = r9.size()
            r13 = 0
            if (r12 == 0) goto L10b
            md.a r14 = md.a.f8827k
            md.f r15 = r1.f8877g
            boolean r14 = r15.a(r14)
            if (r14 == 0) goto L10b
            if (r12 != r10) goto Lf2
            java.lang.Object r9 = r9.get(r13)
            nd.t r9 = (nd.t) r9
            ud.a r6 = r6.H(r4, r9, r5)
        Lf0:
            r9 = r10
            goto L10d
        Lf2:
            java.util.Iterator r9 = r9.iterator()
        Lf6:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L10b
            java.lang.Object r12 = r9.next()
            nd.t r12 = (nd.t) r12
            ud.a r14 = r12.f9392a
            if (r14 != r1) goto Lf6
            ud.a r6 = r6.H(r4, r12, r5)
            goto Lf0
        L10b:
            r9 = r13
            r6 = 0
        L10d:
            ud.p r12 = a.a.c0(r1)
            java.util.ArrayList r14 = r4.f21539k
            if (r9 != 0) goto L12b
            if (r12 == 0) goto L12b
            pd.k r15 = r12.f13713k
            int r15 = r15.ordinal()
            r11 = 15
            md.a r10 = md.a.f8845z
            if (r15 == r11) goto L665
            r11 = 16
            if (r15 == r11) goto L231
            r10 = 18
            if (r15 == r10) goto L130
        L12b:
            r10 = r4
            r12 = r8
            r11 = r14
            goto L22e
        L130:
            le.f r6 = new le.f
            r6.<init>(r2, r0)
            xd.e r9 = new xd.e
            r9.<init>(r4, r12)
            xd.b r10 = r9.f21547m
            java.util.ArrayList r11 = r10.f21539k
            r11.add(r1)
            r14.add(r9)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            qd.l r12 = r12.S(r13)
            le.f.a(r9, r12, r1, r11, r15)
            java.util.ArrayList r12 = r9.f21546l
            java.util.Iterator r12 = r12.iterator()
        L15b:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L187
            java.lang.Object r17 = r12.next()
            r13 = r17
            ud.p r13 = (ud.p) r13
            r17 = r12
            java.util.List r12 = r2.f13732z
            ud.a r12 = a.a.S(r2, r13, r12)
            r19 = r8
            md.a r8 = md.a.f8838s
            if (r12 == 0) goto L17a
            r12.w(r8)
        L17a:
            r12 = 0
            r13.a0(r12)
            r13.w(r8)
            r12 = r17
            r8 = r19
            r13 = 0
            goto L15b
        L187:
            r19 = r8
            ud.a r8 = a.a.d0(r1)
            if (r8 != 0) goto L197
            java.lang.String r6 = "Unexpected end of synchronized block"
            r2.K(r6)
            r6 = 0
            goto L229
        L197:
            int r12 = r11.size()
            r13 = 1
            if (r12 != r13) goto L1ad
            java.util.Iterator r12 = r11.iterator()
            java.lang.Object r12 = r12.next()
            ud.a r12 = (ud.a) r12
            ud.a r12 = a.a.d0(r12)
            goto L1bc
        L1ad:
            int r12 = r11.size()
            if (r12 <= r13) goto L1bb
            r15.clear()
            ud.a r12 = le.f.b(r8, r11, r15)
            goto L1bc
        L1bb:
            r12 = 0
        L1bc:
            r5.c(r9)
            if (r12 == 0) goto L1c5
            r5.a(r12)
            goto L21a
        L1c5:
            java.util.Iterator r9 = r11.iterator()
        L1c9:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L21a
            java.lang.Object r11 = r9.next()
            ud.a r11 = (ud.a) r11
            java.util.List r13 = a.a.u(r11)
            boolean r15 = r13.isEmpty()
            if (r15 != 0) goto L211
            java.lang.Object r13 = xe.s.i(r13)
            ud.a r13 = (ud.a) r13
            ud.a r15 = r2.C
            if (r13 != r15) goto L1ed
        L1e9:
            r17 = r9
            r9 = 1
            goto L20e
        L1ed:
            java.util.List r13 = r13.f13676n
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L1f6
            goto L1e9
        L1f6:
            int r15 = r13.size()
            r17 = r9
            r9 = 1
            if (r15 != r9) goto L20d
            r9 = 0
            java.lang.Object r13 = r13.get(r9)
            ud.a r13 = (ud.a) r13
            java.util.List r9 = r13.f13676n
            boolean r9 = r9.isEmpty()
            goto L20e
        L20d:
            r9 = 0
        L20e:
            if (r9 != 0) goto L217
            goto L213
        L211:
            r17 = r9
        L213:
            r5.a(r11)
            r12 = r11
        L217:
            r9 = r17
            goto L1c9
        L21a:
            java.util.ArrayList r9 = r10.f21539k
            i4.y r6 = r6.f8024a
            xd.b r6 = r6.b(r8)
            r9.add(r6)
            r5.b()
            r6 = r12
        L229:
            r10 = r4
            r11 = r14
            r12 = r19
            r9 = 1
        L22e:
            r14 = r0
            goto L77f
        L231:
            r19 = r8
            pd.s r12 = (pd.s) r12
            pd.r r6 = r12.l0()
            int[] r6 = r6.f10533q
            int r6 = r6.length
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r6)
            ud.a[] r9 = r12.f10539t
            r11 = 0
        L244:
            if (r11 >= r6) goto L263
            r13 = r9[r11]
            com.alibaba.fastjson2.writer.b r15 = new com.alibaba.fastjson2.writer.b
            r17 = r6
            r6 = 27
            r15.<init>(r6)
            java.lang.Object r6 = r8.computeIfAbsent(r13, r15)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r13 = r12.k0(r11)
            r6.add(r13)
            int r11 = r11 + 1
            r6 = r17
            goto L244
        L263:
            ud.a r6 = r12.f10540u
            if (r6 == 0) goto L279
            com.alibaba.fastjson2.writer.b r9 = new com.alibaba.fastjson2.writer.b
            r11 = 28
            r9.<init>(r11)
            java.lang.Object r9 = r8.computeIfAbsent(r6, r9)
            java.util.List r9 = (java.util.List) r9
            uf.d r11 = xd.d.f21542m
            r9.add(r11)
        L279:
            xd.d r9 = new xd.d
            r9.<init>(r4, r1)
            nd.e0 r11 = new nd.e0
            r11.<init>(r9)
            r12.y(r11)
            r14.add(r9)
            r5.c(r9)
            java.util.BitSet r11 = a.a.D0(r2)
            java.util.List r13 = r1.f13677o
            java.util.Iterator r13 = r13.iterator()
        L296:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L2bb
            java.lang.Object r15 = r13.next()
            ud.a r15 = (ud.a) r15
            r17 = r6
            md.a r6 = md.a.f8829l
            r20 = r13
            md.f r13 = r15.f8877g
            boolean r6 = r13.a(r6)
            if (r6 == 0) goto L2b5
        L2b0:
            r6 = r17
            r13 = r20
            goto L296
        L2b5:
            java.util.BitSet r6 = r15.f13680r
            r11.or(r6)
            goto L2b0
        L2bb:
            r17 = r6
            int r6 = r1.f13672j
            r11.clear(r6)
            ud.a r6 = r2.C
            int r6 = r6.f13672j
            r11.clear(r6)
            int r6 = r11.cardinality()
            r13 = 1
            if (r6 != r13) goto L2dc
            ud.a r6 = a.a.r(r2, r11)
            r23 = r4
            r24 = r8
            r21 = r14
            goto L3de
        L2dc:
            nd.t r6 = r2.U(r1)
            if (r6 == 0) goto L3c1
            ud.a r13 = r6.f9393b
            ud.a r6 = r6.f9392a
            java.util.BitSet r6 = r6.f13679q
            r11.andNot(r6)
            java.util.BitSet r6 = r13.f13679q
            r11.andNot(r6)
            int r6 = r11.cardinality()
            r15 = 2
            if (r6 != r15) goto L3af
            int r6 = r13.f13672j
            boolean r6 = r11.get(r6)
            if (r6 == 0) goto L3af
            java.util.List r6 = a.a.q(r2, r11)
            r6.remove(r13)
            java.lang.Object r6 = xe.s.f(r6)
            ud.a r6 = (ud.a) r6
            if (r6 == 0) goto L3af
            java.util.List r15 = r1.f13677o
            java.util.Iterator r15 = r15.iterator()
            r20 = 0
        L316:
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L3a1
            java.lang.Object r21 = r15.next()
            r22 = r15
            r15 = r21
            ud.a r15 = (ud.a) r15
            r21 = r14
            java.util.BitSet r14 = r15.f13680r
            r23 = r4
            int r4 = r13.f13672j
            boolean r4 = r14.get(r4)
            if (r4 == 0) goto L393
            if (r15 == r6) goto L393
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.BitSet r0 = a.a.D0(r2)
            r24 = r8
            r8 = 0
            a.a.z(r15, r15, r14, r0, r8)
            r4.<init>(r14)
            boolean r0 = r4.contains(r6)
            if (r0 != 0) goto L395
            java.util.List r0 = r6.f13675m
            java.util.stream.Stream r0 = r0.stream()
            le.d r8 = new le.d
            r14 = 0
            r8.<init>(r4, r14)
            boolean r0 = r0.anyMatch(r8)
            if (r0 == 0) goto L363
            goto L395
        L363:
            java.util.List r0 = r13.f13675m
            java.util.Iterator r0 = r0.iterator()
        L369:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L395
            java.lang.Object r8 = r0.next()
            ud.a r8 = (ud.a) r8
            boolean r14 = r4.contains(r8)
            if (r14 == 0) goto L369
            md.a r0 = md.a.f8831m
            md.f r4 = r8.f8877g
            boolean r0 = r4.a(r0)
            if (r0 == 0) goto L395
            java.util.ArrayList r0 = r8.f13674l
            ud.p r4 = new ud.p
            r8 = 0
            r4.<init>(r7, r8)
            r0.add(r4)
            r20 = 1
            goto L395
        L393:
            r24 = r8
        L395:
            r0 = r25
            r14 = r21
            r15 = r22
            r4 = r23
            r8 = r24
            goto L316
        L3a1:
            r23 = r4
            r24 = r8
            r21 = r14
            if (r20 == 0) goto L3b5
            int r0 = r13.f13672j
            r11.clear(r0)
            goto L3b6
        L3af:
            r23 = r4
            r24 = r8
            r21 = r14
        L3b5:
            r6 = 0
        L3b6:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L3c8
            ud.a r0 = r2.C
        L3be:
            r6 = r0
            goto L50a
        L3c1:
            r23 = r4
            r24 = r8
            r21 = r14
            r6 = 0
        L3c8:
            if (r6 != 0) goto L3de
            ud.a r6 = r1.f13682t
            int r0 = r6.f13672j
            boolean r0 = r11.get(r0)
            if (r0 == 0) goto L3d5
            goto L3de
        L3d5:
            java.util.BitSet r0 = r1.f13679q
            r11.andNot(r0)
            ud.a r6 = a.a.r(r2, r11)
        L3de:
            if (r6 == 0) goto L3e8
            boolean r0 = r2.Y(r6)
            if (r0 == 0) goto L3e8
            ud.a r6 = r2.C
        L3e8:
            ud.a r0 = r1.f13682t
            if (r6 != 0) goto L4c1
            ud.a r4 = r2.C
            if (r0 != r4) goto L4c1
            java.util.List r0 = r4.f13675m
            int r6 = r0.size()
            r13 = 1
            if (r6 != r13) goto L401
            r8 = 0
            java.lang.Object r0 = r0.get(r8)
            ud.a r0 = (ud.a) r0
            goto L3be
        L401:
            qd.j r8 = r2.f13726t
            qd.g r11 = qd.j.f10876j
            pd.k r13 = pd.k.f10507p
            if (r8 != r11) goto L424
            java.util.Iterator r8 = r0.iterator()
        L40d:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L490
            java.lang.Object r11 = r8.next()
            ud.a r11 = (ud.a) r11
            ud.p r11 = a.a.c0(r11)
            if (r11 == 0) goto L48a
            pd.k r11 = r11.f13713k
            if (r11 == r13) goto L40d
            goto L48a
        L424:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r11 = r0.iterator()
        L42d:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L44d
            java.lang.Object r14 = r11.next()
            ud.a r14 = (ud.a) r14
            ud.p r14 = a.a.c0(r14)
            if (r14 == 0) goto L48a
            pd.k r15 = r14.f13713k
            if (r15 == r13) goto L444
            goto L48a
        L444:
            r15 = 0
            qd.l r14 = r14.S(r15)
            r8.add(r14)
            goto L42d
        L44d:
            r15 = 0
            java.lang.Object r11 = r8.get(r15)
            qd.l r11 = (qd.l) r11
            r11.getClass()
            boolean r13 = r11 instanceof qd.r
            if (r13 == 0) goto L47a
            qd.r r11 = (qd.r) r11
            r13 = 1
        L45e:
            if (r13 >= r6) goto L490
            r14 = 1
            java.lang.Object r15 = r8.get(r14)
            qd.l r15 = (qd.l) r15
            r15.getClass()
            boolean r14 = r15 instanceof qd.r
            if (r14 == 0) goto L48a
            qd.r r15 = (qd.r) r15
            boolean r14 = r15.g0(r11)
            if (r14 != 0) goto L477
            goto L48a
        L477:
            int r13 = r13 + 1
            goto L45e
        L47a:
            r13 = 1
        L47b:
            if (r13 >= r6) goto L490
            r14 = 1
            java.lang.Object r15 = r8.get(r14)
            qd.l r15 = (qd.l) r15
            boolean r14 = r15.equals(r11)
            if (r14 != 0) goto L48d
        L48a:
            r6 = r4
            goto L50a
        L48d:
            int r13 = r13 + 1
            goto L47b
        L490:
            java.util.Iterator r4 = r0.iterator()
        L494:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L4a4
            java.lang.Object r8 = r4.next()
            ud.a r8 = (ud.a) r8
            r5.a(r8)
            goto L494
        L4a4:
            r4 = 1
        L4a5:
            if (r4 >= r6) goto L4b8
            java.lang.Object r8 = r0.get(r4)
            ud.a r8 = (ud.a) r8
            md.a r11 = md.a.f8840u
            r8.w(r11)
            r8.w(r10)
            int r4 = r4 + 1
            goto L4a5
        L4b8:
            r8 = 0
            java.lang.Object r0 = r0.get(r8)
            ud.a r0 = (ud.a) r0
            goto L3be
        L4c1:
            ud.a r4 = r12.f10540u
            if (r0 != r4) goto L4da
            java.util.List r4 = r1.f13677o
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L4da
            java.util.BitSet r4 = r1.f13680r
            int r8 = r0.f13672j
            boolean r4 = r4.get(r8)
            if (r4 == 0) goto L4da
            r5.a(r0)
        L4da:
            if (r6 != 0) goto L4f8
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to find 'out' block for switch in "
            r4.<init>(r6)
            r4.append(r0)
            java.lang.String r0 = ". Please report as an issue."
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.L(r0)
            ud.a r6 = r1.f13682t
        L4f8:
            if (r6 == 0) goto L50a
            int r0 = r6.f13672j
            boolean r0 = r3.get(r0)
            if (r0 != 0) goto L503
            goto L50a
        L503:
            java.lang.String r0 = "Failed to find switch 'out' block (already processed)"
            ah.a.k(r0)
            r0 = 0
            return r0
        L50a:
            r5.a(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            if (r6 == 0) goto L5d2
            java.util.Set r4 = r24.keySet()
            java.util.BitSet r8 = a.a.D0(r2)
            java.util.Iterator r4 = r4.iterator()
        L520:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L532
            java.lang.Object r10 = r4.next()
            ud.a r10 = (ud.a) r10
            int r10 = r10.f13672j
            r8.set(r10)
            goto L520
        L532:
            int r4 = r6.f13672j
            r8.clear(r4)
            ud.a r4 = r9.f21543k
            java.util.List r4 = r4.f13676n
            java.util.Iterator r4 = r4.iterator()
        L53f:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L577
            java.lang.Object r10 = r4.next()
            ud.a r10 = (ud.a) r10
            java.util.BitSet r11 = r10.f13680r
            boolean r13 = r11.intersects(r8)
            if (r13 == 0) goto L53f
            java.util.BitSet r13 = new java.util.BitSet
            java.util.List r14 = r2.f13732z
            int r14 = r14.size()
            r13.<init>(r14)
            boolean r14 = r11.isEmpty()
            if (r14 != 0) goto L567
            r13.or(r11)
        L567:
            int r11 = r6.f13672j
            r13.clear(r11)
            r13.and(r8)
            ud.a r11 = a.a.r(r2, r13)
            r0.put(r10, r11)
            goto L53f
        L577:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L5d2
            r4 = r24
            boolean r8 = oh.h.E(r4, r0)
            if (r8 == 0) goto L5d4
            java.util.ArrayList r8 = new java.util.ArrayList
            int r10 = r4.size()
            r8.<init>(r10)
            java.util.Set r10 = r4.keySet()
            r8.addAll(r10)
            ce.b r10 = new ce.b
            r11 = 2
            r10.<init>(r0, r11)
            r8.sort(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            int r11 = r4.size()
            r10.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L5ab:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L5c1
            java.lang.Object r11 = r8.next()
            ud.a r11 = (ud.a) r11
            java.lang.Object r13 = r4.get(r11)
            java.util.List r13 = (java.util.List) r13
            r10.put(r11, r13)
            goto L5ab
        L5c1:
            boolean r8 = oh.h.E(r10, r0)
            if (r8 == 0) goto L5d0
            java.lang.String r8 = "Can't fix incorrect switch cases order, some code will duplicate"
            r2.L(r8)
            r0.clear()
            goto L5d4
        L5d0:
            r8 = r10
            goto L5d5
        L5d2:
            r4 = r24
        L5d4:
            r8 = r4
        L5d5:
            java.util.Set r4 = r8.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L5dd:
            boolean r8 = r4.hasNext()
            java.util.ArrayList r10 = r9.f21544l
            if (r8 == 0) goto L638
            java.lang.Object r8 = r4.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r11 = r8.getValue()
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r8 = r8.getKey()
            ud.a r8 = (ud.a) r8
            le.b r13 = r5.f8017b
            java.util.HashSet r13 = r13.f8014a
            boolean r13 = r13.contains(r8)
            if (r13 == 0) goto L60d
            xd.b r8 = new xd.b
            le.b r13 = r5.f8017b
            xd.a r13 = r13.f8015b
            r8.<init>(r13)
            r14 = r25
            goto L62f
        L60d:
            java.lang.Object r13 = r0.get(r8)
            ud.a r13 = (ud.a) r13
            r5.a(r13)
            r14 = r25
            xd.b r8 = r14.b(r8)
            if (r13 == 0) goto L625
            le.b r15 = r5.f8017b
            java.util.HashSet r15 = r15.f8014a
            r15.remove(r13)
        L625:
            if (r13 == 0) goto L62f
            md.a r15 = md.a.U
            r13.w(r15)
            r8.w(r15)
        L62f:
            xd.c r13 = new xd.c
            r13.<init>(r11, r8)
            r10.add(r13)
            goto L5dd
        L638:
            r14 = r25
            if (r17 != 0) goto L63e
            r0 = 1
            goto L64d
        L63e:
            java.util.stream.Stream r0 = r10.stream()
            ce.n r4 = new ce.n
            r8 = 16
            r4.<init>(r8)
            boolean r0 = r0.anyMatch(r4)
        L64d:
            if (r0 == 0) goto L659
            be.i r0 = new be.i
            r4 = 15
            r0.<init>(r12, r4)
            r10.removeIf(r0)
        L659:
            r5.b()
        L65c:
            r12 = r19
            r11 = r21
            r10 = r23
        L662:
            r9 = 1
            goto L77f
        L665:
            r23 = r4
            r19 = r8
            r21 = r14
            r14 = r0
            java.lang.Object r0 = r14.f6497e
            le.a r0 = (le.a) r0
            pd.i r12 = (pd.i) r12
            i4.y r4 = r0.f8013b
            ud.r r0 = r0.f8012a
            md.f r6 = r1.f8877g
            boolean r6 = r6.a(r10)
            if (r6 == 0) goto L682
            ud.a r0 = r12.f10493q
            r6 = r0
            goto L65c
        L682:
            hb.r r6 = le.a.g(r0, r1)
            if (r6 != 0) goto L690
        L688:
            r12 = r19
            r11 = r21
            r10 = r23
            r6 = 0
            goto L662
        L690:
            hb.r r8 = le.a.h(r6)
            if (r8 == 0) goto L697
            goto L69b
        L697:
            hb.r r8 = hb.r.l(r6)
        L69b:
            hb.r r6 = le.a.j(r0, r1, r8)
            if (r6 == 0) goto L6a2
            goto L6bb
        L6a2:
            java.lang.Object r6 = r8.f5457d
            ze.c r6 = (ze.c) r6
            java.util.BitSet r6 = r6.f22680h
            int r6 = r6.cardinality()
            r13 = 1
            if (r6 > r13) goto L6b0
            goto L688
        L6b0:
            hb.r r6 = le.a.g(r0, r1)
            hb.r r6 = le.a.j(r0, r1, r6)
            if (r6 != 0) goto L6bb
            goto L688
        L6bb:
            java.lang.Object r0 = r6.f5457d
            ze.c r0 = (ze.c) r0
            le.a.a(r6)
            yd.c r8 = new yd.c
            r10 = r23
            r8.<init>(r10)
            java.lang.Object r9 = r6.f5456c
            yd.b r9 = (yd.b) r9
            r8.f22417k = r9
            java.util.List r9 = r0.c()
            r8.f22418l = r9
            r11 = r21
            r11.add(r8)
            java.lang.Object r9 = r6.f5462i
            ud.a r9 = (ud.a) r9
            r5.c(r8)
            r5.a(r9)
            java.lang.Object r12 = r6.f5458e
            ud.a r12 = (ud.a) r12
            if (r12 != 0) goto L6f2
            xd.b r12 = new xd.b
            r12.<init>(r8)
            r8.f22422m = r12
            goto L6f8
        L6f2:
            xd.b r12 = r4.b(r12)
            r8.f22422m = r12
        L6f8:
            java.lang.Object r6 = r6.f5459f
            ud.a r6 = (ud.a) r6
            if (r6 == 0) goto L708
            le.b r12 = r5.f8017b
            java.util.HashSet r12 = r12.f8014a
            boolean r12 = r12.contains(r6)
            if (r12 == 0) goto L70a
        L708:
            r4 = 0
            goto L712
        L70a:
            xd.b r4 = r4.b(r6)
            r8.f22423n = r4
            r4 = 0
            goto L714
        L712:
            r8.f22423n = r4
        L714:
            ud.j r6 = r8.f22423n
            if (r6 != 0) goto L777
            if (r9 == 0) goto L777
            md.f r6 = r9.f8877g
            r12 = r19
            java.util.List r6 = r6.d(r12)
            boolean r13 = r6.isEmpty()
            if (r13 != 0) goto L779
            xd.b r13 = new xd.b
            r13.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L731:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L774
            java.lang.Object r15 = r6.next()
            nd.f r15 = (nd.f) r15
            ud.a r4 = r15.f9363h
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L76e
            ud.a r4 = r15.f9362g
            java.util.Iterator r15 = r0.iterator()
        L74b:
            r17 = r15
            ze.b r17 = (ze.b) r17
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L76e
            java.lang.Object r17 = r17.next()
            r18 = r0
            r0 = r17
            ud.a r0 = (ud.a) r0
            java.util.List r0 = r0.f13676n
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L76b
            r13.H(r4)
            goto L770
        L76b:
            r0 = r18
            goto L74b
        L76e:
            r18 = r0
        L770:
            r0 = r18
            r4 = 0
            goto L731
        L774:
            r8.f22423n = r13
            goto L779
        L777:
            r12 = r19
        L779:
            r5.b()
            r6 = r9
            goto L662
        L77f:
            if (r9 != 0) goto L788
            r11.add(r1)
            ud.a r6 = a.a.d0(r1)
        L788:
            if (r6 == 0) goto Lc8
            le.b r0 = r5.f8017b
            java.util.HashSet r0 = r0.f8014a
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto Lc8
            le.b r0 = r5.f8017b
            java.util.HashSet r0 = r0.f8014a
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto Lc8
            r1 = r6
        L79f:
            int r0 = r14.f6494b
            r16 = 1
            int r0 = r0 + 1
            r14.f6494b = r0
            int r4 = r14.f6493a
            if (r0 > r4) goto L7b0
            r4 = r10
            r8 = r12
            r0 = r14
            goto Lb4
        L7b0:
            af.f r0 = new af.f
            java.lang.String r1 = "Regions count limit reached"
            r0.<init>(r1)
            throw r0
        L7b8:
            return r10
    }

    public int c(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.f6498f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r5.f6495c
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r1.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L19
            int r6 = r2.intValue()
            return r6
        L19:
            int r2 = r5.f6493a
            java.lang.Object r3 = r0.get(r6)
            z4.g r3 = (z4.g) r3
            if (r3 == 0) goto L5e
            int r4 = r3.f22552i
            if (r4 <= 0) goto L5e
            int r4 = r4 + (-1)
            int r3 = r3.n(r4)
            if (r3 != r2) goto L5e
            java.lang.Object r2 = r5.f6497e
            i4.i r2 = (i4.i) r2
            int r2 = r2.k()
            java.lang.Object r3 = r5.f6496d
            java.util.BitSet r3 = (java.util.BitSet) r3
            r3.set(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.put(r3, r4)
        L49:
            int r1 = r0.size()
            if (r1 > r2) goto L54
            r1 = 0
            r0.add(r1)
            goto L49
        L54:
            java.lang.Object r6 = r0.get(r6)
            z4.g r6 = (z4.g) r6
            r0.set(r2, r6)
            return r2
        L5e:
            return r6
    }
}
