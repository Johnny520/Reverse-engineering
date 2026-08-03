package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f400i;

    public /* synthetic */ q(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f398g = r2
            r0.f400i = r1
            r0.f399h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ q(java.lang.Object r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.f398g = r4
            r0.f400i = r1
            r0.f399h = r2
            r0.<init>()
            return
    }

    public /* synthetic */ q(z.g r1, z.c r2, int r3) {
            r0 = this;
            r3 = 1
            r0.f398g = r3
            r0.<init>()
            r0.f399h = r1
            r0.f400i = r2
            return
    }

    private final java.lang.Object e(java.lang.Object r67, java.lang.Object r68) {
            r66 = this;
            r1 = r66
            java.lang.Object r0 = r1.f400i
            s.b0 r0 = (s.b0) r0
            java.lang.Object r2 = r1.f399h
            r.o r2 = (r.o) r2
            r3 = r67
            v1.k1 r3 = (v1.k1) r3
            r4 = r68
            u2.a r4 = (u2.a) r4
            s.f0 r14 = new s.f0
            r14.<init>(r0, r3)
            long r4 = r4.f13338a
            p.g r0 = r2.f11213f
            p.i r6 = r2.f11212e
            p.x0 r7 = r2.f11210c
            boolean r8 = r2.f11209b
            r.z r9 = r2.f11208a
            i0.a1 r10 = r9.f11299t
            r10.getValue()
            boolean r10 = r9.f11281b
            if (r10 != 0) goto L36
            boolean r10 = r3.u0()
            if (r10 == 0) goto L33
            goto L36
        L33:
            r24 = 0
            goto L38
        L36:
            r24 = 1
        L38:
            m.p1 r29 = m.p1.f8325h
            m.p1 r30 = m.p1.f8324g
            if (r8 == 0) goto L41
            r10 = r30
            goto L43
        L41:
            r10 = r29
        L43:
            k.n.h(r4, r10)
            u2.m r10 = u2.m.f13354g
            if (r8 == 0) goto L57
            u2.m r13 = r3.getLayoutDirection()
            float r13 = r7.d(r13)
            int r13 = r3.G0(r13)
            goto L6a
        L57:
            u2.m r13 = r3.getLayoutDirection()
            if (r13 != r10) goto L62
            float r13 = r7.d(r13)
            goto L66
        L62:
            float r13 = r7.b(r13)
        L66:
            int r13 = r3.G0(r13)
        L6a:
            if (r8 == 0) goto L79
            u2.m r15 = r3.getLayoutDirection()
            float r15 = r7.b(r15)
            int r15 = r3.G0(r15)
            goto L8c
        L79:
            u2.m r15 = r3.getLayoutDirection()
            if (r15 != r10) goto L84
            float r15 = r7.b(r15)
            goto L88
        L84:
            float r15 = r7.d(r15)
        L88:
            int r15 = r3.G0(r15)
        L8c:
            float r11 = r7.c()
            int r11 = r3.G0(r11)
            float r7 = r7.a()
            int r7 = r3.G0(r7)
            int r7 = r7 + r11
            r20 = r0
            int r0 = r13 + r15
            if (r8 == 0) goto La6
            r16 = r7
            goto La8
        La6:
            r16 = r0
        La8:
            if (r8 == 0) goto Lac
            r15 = r11
            goto Laf
        Lac:
            if (r8 != 0) goto Laf
            r15 = r13
        Laf:
            int r22 = r16 - r15
            int r12 = -r0
            r31 = r0
            int r0 = -r7
            long r16 = u2.b.i(r12, r0, r4)
            fg.a r0 = r2.f11211d
            java.lang.Object r0 = r0.invoke()
            r.k r0 = (r.k) r0
            r.d r12 = r0.f11176c
            r18 = r0
            int r0 = u2.a.h(r16)
            int r1 = u2.a.g(r16)
            r25 = r4
            i0.g1 r4 = r12.f11158a
            r4.h(r0)
            i0.g1 r0 = r12.f11159b
            r0.h(r1)
            java.lang.String r0 = "null verticalArrangement when isVertical == true"
            if (r8 == 0) goto Lec
            if (r6 == 0) goto Le4
            float r1 = r6.a()
            goto Lf2
        Le4:
            o.b.b(r0)
            okio.a.c()
        Lea:
            r0 = 0
            return r0
        Lec:
            if (r20 == 0) goto Laa2
            float r1 = r20.a()
        Lf2:
            int r23 = r3.G0(r1)
            int r1 = r18.c()
            if (r8 == 0) goto L102
            int r4 = u2.a.g(r25)
            int r4 = r4 - r7
            goto L108
        L102:
            int r4 = u2.a.h(r25)
            int r4 = r4 - r31
        L108:
            long r12 = (long) r13
            r32 = 32
            long r12 = r12 << r32
            r21 = r0
            r5 = r1
            long r0 = (long) r11
            r33 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r33
            long r0 = r0 | r12
            r11 = r5
            r.n r5 = new r.n
            boolean r8 = r2.f11209b
            y0.e r13 = r2.f11217j
            r12 = r10
            r10 = r14
            y0.f r14 = r2.f11218k
            r27 = r0
            r.z r0 = r2.f11208a
            r19 = r0
            r37 = r6
            r38 = r7
            r67 = r9
            r6 = r16
            r9 = r18
            r16 = r22
            r35 = r25
            r17 = r27
            r0 = 1
            r1 = 0
            r22 = r12
            r12 = r23
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            r14 = r10
            r13 = r15
            r15 = r11
            r64 = r6
            r7 = r5
            r6 = r12
            r5 = r16
            r11 = r64
            w0.f r8 = w0.q.e()
            r39 = 0
            if (r8 == 0) goto L15b
            fg.l r10 = r8.e()
            goto L15d
        L15b:
            r10 = r39
        L15d:
            w0.f r1 = w0.q.h(r8)
            r40 = r0
            int r0 = r67.h()     // Catch: java.lang.Throwable -> La9d
            r41 = r6
            r6 = r67
            r67 = r5
            b.f r5 = r6.f11284e     // Catch: java.lang.Throwable -> La9d
            r42 = r14
            java.lang.Object r14 = r5.f337d     // Catch: java.lang.Throwable -> La9d
            int r14 = s.o.f(r0, r14, r9)     // Catch: java.lang.Throwable -> La9d
            if (r0 == r14) goto L1a5
            r43 = r4
            java.lang.Object r4 = r5.f335b     // Catch: java.lang.Throwable -> La9d
            i0.g1 r4 = (i0.g1) r4     // Catch: java.lang.Throwable -> La9d
            r4.h(r14)     // Catch: java.lang.Throwable -> La9d
            java.lang.Object r4 = r5.f338e     // Catch: java.lang.Throwable -> La9d
            s.g0 r4 = (s.g0) r4     // Catch: java.lang.Throwable -> La9d
            int r5 = r4.f12015h     // Catch: java.lang.Throwable -> La9d
            if (r0 == r5) goto L1a7
            r4.f12015h = r0     // Catch: java.lang.Throwable -> La9d
            int r0 = r0 / 30
            int r0 = r0 * 30
            int r5 = r0 + (-100)
            r16 = r14
            r14 = 0
            int r5 = java.lang.Math.max(r5, r14)     // Catch: java.lang.Throwable -> La9d
            int r0 = r0 + 130
            lg.d r0 = r9.e0.r0(r5, r0)     // Catch: java.lang.Throwable -> La9d
            i0.j1 r4 = r4.f12014g     // Catch: java.lang.Throwable -> La9d
            r4.setValue(r0)     // Catch: java.lang.Throwable -> La9d
            goto L1a9
        L1a5:
            r43 = r4
        L1a7:
            r16 = r14
        L1a9:
            int r0 = r6.i()     // Catch: java.lang.Throwable -> La9d
            w0.q.k(r8, r1, r10)
            s.j0 r1 = r6.f11298s
            m.c r4 = r6.f11295p
            j0.b r5 = r4.f8101a
            int r8 = r5.f6673i
            if (r8 == 0) goto L1bd
            r8 = r40
            goto L1be
        L1bd:
            r8 = 0
        L1be:
            tf.t r10 = tf.t.f13167g
            if (r8 != 0) goto L1d1
            w0.p r8 = r1.f12036g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L1d1
            r18 = r0
            r8 = r10
            r44 = r8
            goto L2a0
        L1d1:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            j0.b r4 = r4.f8101a
            int r4 = r4.f6673i
            if (r4 == 0) goto L252
            lg.d r4 = new lg.d
            int r14 = r5.f6673i
            java.lang.String r17 = "MutableVector is empty."
            if (r14 == 0) goto L24d
            r18 = r0
            java.lang.Object[] r0 = r5.f6671g
            r19 = 0
            r23 = r0[r19]
            r19 = r0
            r0 = r23
            s.m r0 = (s.m) r0
            int r0 = r0.f12039a
            r44 = r10
            r10 = 0
        L1f7:
            if (r10 >= r14) goto L209
            r23 = r19[r10]
            r25 = r10
            r10 = r23
            s.m r10 = (s.m) r10
            int r10 = r10.f12039a
            if (r10 >= r0) goto L206
            r0 = r10
        L206:
            int r10 = r25 + 1
            goto L1f7
        L209:
            if (r0 < 0) goto L20c
            goto L211
        L20c:
            java.lang.String r10 = "negative minIndex"
            o.b.a(r10)
        L211:
            int r10 = r5.f6673i
            if (r10 == 0) goto L248
            java.lang.Object[] r5 = r5.f6671g
            r14 = 0
            r17 = r5[r14]
            r14 = r17
            s.m r14 = (s.m) r14
            int r14 = r14.f12040b
            r17 = r5
            r5 = r14
            r14 = 0
        L224:
            if (r14 >= r10) goto L238
            r19 = r17[r14]
            r23 = r10
            r10 = r19
            s.m r10 = (s.m) r10
            int r10 = r10.f12040b
            if (r10 <= r5) goto L233
            r5 = r10
        L233:
            int r14 = r14 + 1
            r10 = r23
            goto L224
        L238:
            int r10 = r9.c()
            int r10 = r10 + (-1)
            int r5 = java.lang.Math.min(r5, r10)
            r10 = r40
            r4.<init>(r0, r5, r10)
            goto L258
        L248:
            j8.o.l(r17)
            goto Lea
        L24d:
            j8.o.l(r17)
            goto Lea
        L252:
            r18 = r0
            r44 = r10
            lg.d r4 = lg.d.f8049j
        L258:
            w0.p r0 = r1.f12036g
            int r0 = r0.size()
            r5 = 0
        L25f:
            if (r5 >= r0) goto L28e
            java.lang.Object r10 = r1.get(r5)
            s.h0 r10 = (s.h0) r10
            java.lang.Object r14 = r10.f12018a
            int r10 = r10.f12020c
            int r10 = s.o.f(r10, r14, r9)
            int r14 = r4.f8042g
            r17 = r0
            int r0 = r4.f8043h
            if (r10 > r0) goto L27a
            if (r14 > r10) goto L27a
            goto L289
        L27a:
            if (r10 < 0) goto L289
            int r0 = r9.c()
            if (r10 >= r0) goto L289
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r8.add(r0)
        L289:
            int r5 = r5 + 1
            r0 = r17
            goto L25f
        L28e:
            int r0 = r4.f8042g
            int r1 = r4.f8043h
            if (r0 > r1) goto L2a0
        L294:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r8.add(r4)
            if (r0 == r1) goto L2a0
            int r0 = r0 + 1
            goto L294
        L2a0:
            boolean r0 = r3.u0()
            if (r0 != 0) goto L2bc
            if (r24 != 0) goto L2a9
            goto L2bc
        L2a9:
            p4.t r0 = r6.f11303x
            java.lang.Object r0 = r0.f10225i
            i.l r0 = (i.l) r0
            i0.j1 r0 = r0.f5719h
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            goto L2be
        L2bc:
            float r0 = r6.f11287h
        L2be:
            boolean r1 = r2.f11209b
            r4 = r15
            s.z r15 = r6.f11294o
            boolean r23 = r3.u0()
            qg.t r5 = r2.f11214g
            i0.a1 r14 = r6.f11302w
            f1.z r9 = r2.f11215h
            s.h r2 = r2.f11216i
            boolean r10 = r6.f11288i
            if (r13 < 0) goto L2d4
            goto L2d9
        L2d4:
            java.lang.String r17 = "invalid beforeContentPadding"
            o.b.a(r17)
        L2d9:
            if (r67 < 0) goto L2de
        L2db:
            r17 = r0
            goto L2e4
        L2de:
            java.lang.String r17 = "invalid afterContentPadding"
            o.b.a(r17)
            goto L2db
        L2e4:
            tf.u r0 = tf.u.f13168g
            r19 = r1
            r.k r1 = r7.f11195b
            r27 = r5
            r45 = r6
            r5 = 0
            if (r4 > 0) goto L378
            int r17 = u2.a.j(r11)
            int r18 = u2.a.i(r11)
            r22 = r19
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            ac.k r1 = r1.f11177d
            r25 = 0
            r26 = 0
            r16 = 0
            r20 = r1
            r21 = r7
            r28 = r9
            r15.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r16 = r15
            r15 = r21
            r19 = r22
            if (r23 != 0) goto L332
            long r1 = r16.a()
            boolean r4 = u2.l.a(r1, r5)
            if (r4 != 0) goto L332
            long r4 = r1 >> r32
            int r4 = (int) r4
            int r17 = u2.b.g(r4, r11)
            long r1 = r1 & r33
            int r1 = (int) r1
            int r18 = u2.b.f(r1, r11)
        L332:
            i2.z r1 = new i2.z
            r2 = 14
            r1.<init>(r2)
            int r2 = r17 + r31
            r4 = r35
            int r2 = u2.b.g(r2, r4)
            int r6 = r18 + r38
            int r4 = u2.b.f(r6, r4)
            v1.o0 r10 = r3.z(r2, r4, r0, r1)
            int r0 = -r13
            int r4 = r43 + r67
            if (r19 == 0) goto L353
            r21 = r30
            goto L355
        L353:
            r21 = r29
        L355:
            r.p r5 = new r.p
            r12 = 0
            r20 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            long r1 = r15.f11197d
            r22 = r67
            r18 = r0
            r15 = r1
            r19 = r4
            r13 = r27
            r23 = r41
            r14 = r42
            r17 = r44
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
            r0 = r3
            r63 = r45
            goto La88
        L378:
            r25 = r5
            r28 = r9
            r5 = r16
            r6 = r42
            r16 = r15
            r15 = r7
            r64 = r35
            r36 = r67
            r35 = r2
            r67 = r3
            r2 = r64
            if (r5 < r4) goto L393
            int r5 = r4 + (-1)
            r18 = 0
        L393:
            int r7 = java.lang.Math.round(r17)
            int r9 = r18 - r7
            if (r5 != 0) goto L39f
            if (r9 >= 0) goto L39f
            int r7 = r7 + r9
            r9 = 0
        L39f:
            r42 = r0
            tf.k r0 = new tf.k
            r0.<init>()
            r46 = r2
            int r2 = -r13
            if (r41 >= 0) goto L3ae
            r3 = r41
            goto L3af
        L3ae:
            r3 = 0
        L3af:
            int r3 = r3 + r2
            int r9 = r9 + r3
            r48 = r1
            r49 = r2
            r18 = r5
            r5 = 0
        L3b8:
            long r1 = r15.f11197d
            if (r9 >= 0) goto L3d8
            if (r18 <= 0) goto L3d8
            r50 = r7
            int r7 = r18 + (-1)
            r.q r1 = r15.a(r7, r1)
            r2 = 0
            r0.add(r2, r1)
            int r2 = r1.f11253r
            int r5 = java.lang.Math.max(r5, r2)
            int r1 = r1.f11252q
            int r9 = r9 + r1
            r18 = r7
            r7 = r50
            goto L3b8
        L3d8:
            r50 = r7
            if (r9 >= r3) goto L3e2
            int r7 = r3 - r9
            int r7 = r50 - r7
            r9 = r3
            goto L3e4
        L3e2:
            r7 = r50
        L3e4:
            int r9 = r9 - r3
            int r50 = r43 + r36
            r51 = r5
            if (r50 >= 0) goto L3ef
            r5 = 0
        L3ec:
            r52 = r10
            goto L3f2
        L3ef:
            r5 = r50
            goto L3ec
        L3f2:
            int r10 = -r9
            r54 = r9
            r56 = r14
            r55 = r18
            r9 = 0
            r53 = 0
        L3fc:
            int r14 = r0.f13165i
            if (r9 >= r14) goto L416
            if (r10 < r5) goto L408
            r0.c(r9)
            r53 = 1
            goto L3fc
        L408:
            int r55 = r55 + 1
            java.lang.Object r14 = r0.get(r9)
            r.q r14 = (r.q) r14
            int r14 = r14.f11252q
            int r10 = r10 + r14
            int r9 = r9 + 1
            goto L3fc
        L416:
            r9 = r51
            r14 = r55
        L41a:
            if (r14 >= r4) goto L429
            if (r10 < r5) goto L426
            if (r10 <= 0) goto L426
            boolean r51 = r0.isEmpty()
            if (r51 == 0) goto L429
        L426:
            r51 = r4
            goto L42e
        L429:
            r51 = r4
            r4 = r43
            goto L45d
        L42e:
            r.q r4 = r15.a(r14, r1)
            r55 = r5
            int r5 = r4.f11252q
            int r10 = r10 + r5
            if (r10 > r3) goto L448
            r57 = r3
            int r3 = r51 + (-1)
            if (r14 == r3) goto L44a
            int r3 = r14 + 1
            int r54 = r54 - r5
            r18 = r3
            r53 = 1
            goto L454
        L448:
            r57 = r3
        L44a:
            int r3 = r4.f11253r
            int r3 = java.lang.Math.max(r9, r3)
            r0.addLast(r4)
            r9 = r3
        L454:
            int r14 = r14 + 1
            r4 = r51
            r5 = r55
            r3 = r57
            goto L41a
        L45d:
            if (r10 >= r4) goto L4a4
            int r3 = r4 - r10
            int r54 = r54 - r3
            int r10 = r10 + r3
            r5 = r54
        L466:
            if (r5 >= r13) goto L487
            if (r18 <= 0) goto L487
            r43 = r3
            int r3 = r18 + (-1)
            r54 = r5
            r.q r5 = r15.a(r3, r1)
            r18 = r3
            r3 = 0
            r0.add(r3, r5)
            int r3 = r5.f11253r
            int r9 = java.lang.Math.max(r9, r3)
            int r3 = r5.f11252q
            int r5 = r54 + r3
            r3 = r43
            goto L466
        L487:
            r43 = r3
            r54 = r5
            int r3 = r7 + r43
            if (r54 >= 0) goto L49b
            int r3 = r3 + r54
            int r10 = r10 + r54
            r5 = r18
            r18 = r9
            r9 = r5
            r5 = r10
            r10 = 0
            goto L4ab
        L49b:
            r5 = r18
            r18 = r9
            r9 = r5
        L4a0:
            r5 = r10
            r10 = r54
            goto L4ab
        L4a4:
            r3 = r18
            r18 = r9
            r9 = r3
            r3 = r7
            goto L4a0
        L4ab:
            int r43 = java.lang.Math.round(r17)
            r54 = r13
            int r13 = java.lang.Integer.signum(r43)
            r43 = r14
            int r14 = java.lang.Integer.signum(r3)
            if (r13 != r14) goto L4cd
            int r13 = java.lang.Math.round(r17)
            int r13 = java.lang.Math.abs(r13)
            int r14 = java.lang.Math.abs(r3)
            if (r13 < r14) goto L4cd
            float r13 = (float) r3
            goto L4cf
        L4cd:
            r13 = r17
        L4cf:
            float r14 = r17 - r13
            r17 = 0
            if (r23 == 0) goto L4df
            if (r3 <= r7) goto L4df
            int r55 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r55 > 0) goto L4df
            int r3 = r3 - r7
            float r3 = (float) r3
            float r17 = r3 + r14
        L4df:
            r3 = r17
            if (r10 < 0) goto L4e4
            goto L4e9
        L4e4:
            java.lang.String r7 = "negative currentFirstItemScrollOffset"
            o.b.a(r7)
        L4e9:
            int r7 = -r10
            boolean r14 = r0.isEmpty()
            java.lang.String r17 = "ArrayDeque is empty."
            if (r14 != 0) goto La98
            java.lang.Object[] r14 = r0.f13164h
            r55 = r3
            int r3 = r0.f13163g
            r3 = r14[r3]
            r.q r3 = (r.q) r3
            if (r54 > 0) goto L509
            if (r41 >= 0) goto L501
            goto L509
        L501:
            r58 = r7
        L503:
            r59 = r25
            r14 = 0
            r25 = r10
            goto L542
        L509:
            int r14 = r0.a()
            r54 = r3
            r3 = 0
        L510:
            if (r3 >= r14) goto L53d
            java.lang.Object r57 = r0.get(r3)
            r58 = r7
            r7 = r57
            r.q r7 = (r.q) r7
            int r7 = r7.f11252q
            if (r10 == 0) goto L53f
            if (r7 > r10) goto L53f
            int r57 = r0.a()
            r59 = r7
            r40 = 1
            int r7 = r57 + (-1)
            if (r3 == r7) goto L53f
            int r10 = r10 - r59
            int r3 = r3 + 1
            java.lang.Object r7 = r0.get(r3)
            r54 = r7
            r.q r54 = (r.q) r54
            r7 = r58
            goto L510
        L53d:
            r58 = r7
        L53f:
            r3 = r54
            goto L503
        L542:
            int r7 = java.lang.Math.max(r14, r9)
            r40 = 1
            int r9 = r9 + (-1)
            r10 = r39
            if (r7 > r9) goto L561
        L54e:
            if (r10 != 0) goto L555
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L555:
            r.q r14 = r15.a(r9, r1)
            r10.add(r14)
            if (r9 == r7) goto L561
            int r9 = r9 + (-1)
            goto L54e
        L561:
            int r9 = r8.size()
            r14 = -1
            int r9 = r9 + r14
            if (r9 < 0) goto L58b
        L569:
            int r26 = r9 + (-1)
            java.lang.Object r9 = r8.get(r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 >= r7) goto L585
            if (r10 != 0) goto L57e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L57e:
            r.q r9 = r15.a(r9, r1)
            r10.add(r9)
        L585:
            if (r26 >= 0) goto L588
            goto L58b
        L588:
            r9 = r26
            goto L569
        L58b:
            if (r10 != 0) goto L58f
            r10 = r44
        L58f:
            int r7 = r10.size()
            r9 = r18
            r14 = 0
        L596:
            if (r14 >= r7) goto L5ad
            java.lang.Object r18 = r10.get(r14)
            r26 = r7
            r7 = r18
            r.q r7 = (r.q) r7
            int r7 = r7.f11253r
            int r9 = java.lang.Math.max(r9, r7)
            int r14 = r14 + 1
            r7 = r26
            goto L596
        L5ad:
            java.lang.Object r7 = tf.m.B1(r0)
            r.q r7 = (r.q) r7
            int r7 = r7.f11236a
            int r14 = r51 + (-1)
            int r7 = java.lang.Math.min(r7, r14)
            java.lang.Object r14 = tf.m.B1(r0)
            r.q r14 = (r.q) r14
            int r14 = r14.f11236a
            r40 = 1
            int r14 = r14 + 1
            if (r14 > r7) goto L5ea
            r18 = r39
        L5cb:
            if (r18 != 0) goto L5d2
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L5d2:
            r26 = r9
            r57 = r13
            r9 = r18
            r.q r13 = r15.a(r14, r1)
            r9.add(r13)
            if (r14 == r7) goto L5f0
            int r14 = r14 + 1
            r18 = r9
            r9 = r26
            r13 = r57
            goto L5cb
        L5ea:
            r26 = r9
            r57 = r13
            r9 = r39
        L5f0:
            if (r9 == 0) goto L604
            java.lang.Object r13 = tf.m.B1(r9)
            r.q r13 = (r.q) r13
            int r13 = r13.f11236a
            if (r13 <= r7) goto L604
            java.lang.Object r7 = tf.m.B1(r9)
            r.q r7 = (r.q) r7
            int r7 = r7.f11236a
        L604:
            int r13 = r8.size()
            r14 = 0
        L609:
            if (r14 >= r13) goto L62c
            java.lang.Object r18 = r8.get(r14)
            java.lang.Number r18 = (java.lang.Number) r18
            r61 = r8
            int r8 = r18.intValue()
            if (r8 <= r7) goto L627
            if (r9 != 0) goto L620
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L620:
            r.q r8 = r15.a(r8, r1)
            r9.add(r8)
        L627:
            int r14 = r14 + 1
            r8 = r61
            goto L609
        L62c:
            if (r9 != 0) goto L630
            r9 = r44
        L630:
            int r7 = r9.size()
            r8 = r26
            r13 = 0
        L637:
            if (r13 >= r7) goto L648
            java.lang.Object r14 = r9.get(r13)
            r.q r14 = (r.q) r14
            int r14 = r14.f11253r
            int r8 = java.lang.Math.max(r8, r14)
            int r13 = r13 + 1
            goto L637
        L648:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto La93
            java.lang.Object[] r7 = r0.f13164h
            int r13 = r0.f13163g
            r7 = r7[r13]
            boolean r7 = gg.l.a(r3, r7)
            if (r7 == 0) goto L668
            boolean r7 = r10.isEmpty()
            if (r7 == 0) goto L668
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L668
            r13 = 1
            goto L669
        L668:
            r13 = 0
        L669:
            if (r19 == 0) goto L66d
            r7 = r8
            goto L66e
        L66d:
            r7 = r5
        L66e:
            int r14 = u2.b.g(r7, r11)
            if (r19 == 0) goto L675
            r8 = r5
        L675:
            int r18 = u2.b.f(r8, r11)
            if (r19 == 0) goto L67e
            r7 = r18
            goto L67f
        L67e:
            r7 = r14
        L67f:
            int r8 = java.lang.Math.min(r7, r4)
            if (r5 >= r8) goto L687
            r8 = 1
            goto L688
        L687:
            r8 = 0
        L688:
            if (r8 == 0) goto L692
            if (r58 != 0) goto L68d
            goto L692
        L68d:
            java.lang.String r17 = "non-zero itemsScrollOffset"
            o.b.c(r17)
        L692:
            r61 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            int r17 = r0.a()
            int r26 = r10.size()
            int r26 = r26 + r17
            int r17 = r9.size()
            r62 = r5
            int r5 = r17 + r26
            r3.<init>(r5)
            if (r8 == 0) goto L744
            boolean r5 = r10.isEmpty()
            if (r5 == 0) goto L6ba
            boolean r5 = r9.isEmpty()
            if (r5 == 0) goto L6ba
            goto L6bf
        L6ba:
            java.lang.String r5 = "no extra items"
            o.b.a(r5)
        L6bf:
            int r5 = r0.a()
            int[] r8 = new int[r5]
            r9 = 0
        L6c6:
            if (r9 >= r5) goto L6d5
            java.lang.Object r10 = r0.get(r9)
            r.q r10 = (r.q) r10
            int r10 = r10.f11251p
            r8[r9] = r10
            int r9 = r9 + 1
            goto L6c6
        L6d5:
            int[] r10 = new int[r5]
            if (r19 == 0) goto L6f7
            r9 = r37
            if (r9 == 0) goto L6ef
            r9.c(r7, r6, r8, r10)
            r64 = r59
            r59 = r1
            r1 = r64
            r17 = r5
            r37 = r13
            r13 = r18
            r63 = r45
            goto L70e
        L6ef:
            o.b.b(r21)
            okio.a.c()
            goto Lea
        L6f7:
            if (r20 == 0) goto L73a
            r64 = r59
            r59 = r1
            r1 = r64
            r17 = r5
            r37 = r13
            r13 = r18
            r5 = r20
            r9 = r22
            r63 = r45
            r5.b(r6, r7, r8, r9, r10)
        L70e:
            lg.d r5 = new lg.d
            r7 = 1
            int r8 = r17 + (-1)
            r9 = 0
            r5.<init>(r9, r8, r7)
            int r7 = r5.f8043h
            int r5 = r5.f8044i
            if (r5 <= 0) goto L71f
            if (r7 >= 0) goto L723
        L71f:
            if (r5 >= 0) goto L79b
            if (r7 > 0) goto L79b
        L723:
            r8 = 0
        L724:
            r9 = r10[r8]
            java.lang.Object r17 = r0.get(r8)
            r1 = r17
            r.q r1 = (r.q) r1
            r1.d(r9, r14, r13)
            r3.add(r1)
            if (r8 == r7) goto L79b
            int r8 = r8 + r5
            r1 = 0
            goto L724
        L73a:
            java.lang.String r0 = "null horizontalArrangement when isVertical == false"
            o.b.b(r0)
            okio.a.c()
            goto Lea
        L744:
            r59 = r1
            r37 = r13
            r13 = r18
            r63 = r45
            int r1 = r10.size()
            r5 = r58
            r2 = 0
        L753:
            if (r2 >= r1) goto L767
            java.lang.Object r7 = r10.get(r2)
            r.q r7 = (r.q) r7
            int r8 = r7.f11252q
            int r5 = r5 - r8
            r7.d(r5, r14, r13)
            r3.add(r7)
            int r2 = r2 + 1
            goto L753
        L767:
            int r1 = r0.a()
            r7 = r58
            r2 = 0
        L76e:
            if (r2 >= r1) goto L782
            java.lang.Object r5 = r0.get(r2)
            r.q r5 = (r.q) r5
            r5.d(r7, r14, r13)
            r3.add(r5)
            int r5 = r5.f11252q
            int r7 = r7 + r5
            int r2 = r2 + 1
            goto L76e
        L782:
            int r1 = r9.size()
            r2 = 0
        L787:
            if (r2 >= r1) goto L79b
            java.lang.Object r5 = r9.get(r2)
            r.q r5 = (r.q) r5
            r5.d(r7, r14, r13)
            r3.add(r5)
            int r5 = r5.f11252q
            int r7 = r7 + r5
            int r2 = r2 + 1
            goto L787
        L79b:
            if (r52 != 0) goto L7c6
            r9 = r57
            int r1 = (int) r9
            r2 = r48
            ac.k r5 = r2.f11177d
            r20 = r5
            r18 = r13
            r17 = r14
            r21 = r15
            r15 = r16
            r22 = r19
            r5 = r51
            r26 = r62
            r16 = r1
            r19 = r3
            r15.c(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r16 = r15
            r15 = r21
            r10 = r26
        L7c1:
            r1 = r23
            r7 = r25
            goto L7d1
        L7c6:
            r22 = r19
            r2 = r48
            r5 = r51
            r9 = r57
            r10 = r62
            goto L7c1
        L7d1:
            if (r1 != 0) goto L826
            r8 = r6
            r25 = r7
            long r6 = r16.a()
            r16 = r8
            r57 = r9
            r8 = 0
            boolean r8 = u2.l.a(r6, r8)
            if (r8 != 0) goto L82c
            if (r22 == 0) goto L7ec
            r8 = r13
        L7e9:
            r17 = r6
            goto L7ee
        L7ec:
            r8 = r14
            goto L7e9
        L7ee:
            long r6 = r17 >> r32
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r14, r6)
            int r14 = u2.b.g(r6, r11)
            long r6 = r17 & r33
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r13, r6)
            int r18 = u2.b.f(r6, r11)
            if (r22 == 0) goto L809
            r6 = r18
            goto L80a
        L809:
            r6 = r14
        L80a:
            if (r6 == r8) goto L823
            int r7 = r3.size()
            r12 = 0
        L811:
            if (r12 >= r7) goto L823
            java.lang.Object r8 = r3.get(r12)
            r.q r8 = (r.q) r8
            r8.f11255t = r6
            int r9 = r8.f11243h
            int r9 = r9 + r6
            r8.f11257v = r9
            int r12 = r12 + 1
            goto L811
        L823:
            r13 = r18
            goto L82c
        L826:
            r16 = r6
            r25 = r7
            r57 = r9
        L82c:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L835
            r6 = r39
            goto L83b
        L835:
            java.lang.Object[] r6 = r0.f13164h
            int r7 = r0.f13163g
            r6 = r6[r7]
        L83b:
            r.q r6 = (r.q) r6
            if (r6 == 0) goto L842
            int r12 = r6.f11236a
            goto L843
        L842:
            r12 = 0
        L843:
            java.lang.Object r6 = r0.g()
            r.q r6 = (r.q) r6
            if (r6 == 0) goto L84e
            int r6 = r6.f11236a
            goto L84f
        L84e:
            r6 = 0
        L84f:
            r.h r2 = r2.f11175b
            r2.getClass()
            f.v r2 = f.j.f2840a
            if (r35 == 0) goto L9a8
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L9a8
            int r7 = r2.f2916b
            if (r7 == 0) goto L9a8
            int r6 = r6 - r12
            if (r6 < 0) goto L896
            if (r7 != 0) goto L868
            goto L896
        L868:
            r9 = 0
            lg.d r6 = r9.e0.r0(r9, r7)
            int r7 = r6.f8042g
            int r6 = r6.f8043h
            if (r7 > r6) goto L885
            r8 = -1
        L874:
            int r9 = r2.c(r7)
            if (r9 > r12) goto L883
            int r8 = r2.c(r7)
            if (r7 == r6) goto L883
            int r7 = r7 + 1
            goto L874
        L883:
            r6 = -1
            goto L887
        L885:
            r6 = -1
            r8 = -1
        L887:
            if (r8 != r6) goto L88c
            f.v r6 = f.j.f2840a
            goto L897
        L88c:
            f.v r6 = new f.v
            r7 = 1
            r6.<init>(r7)
            r6.a(r8)
            goto L897
        L896:
            r6 = r2
        L897:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = r3.size()
            r8.<init>(r9)
            int r9 = r3.size()
            r12 = 0
        L8aa:
            if (r12 >= r9) goto L8d8
            java.lang.Object r11 = r3.get(r12)
            r17 = r9
            r9 = r11
            r.q r9 = (r.q) r9
            int r9 = r9.f11236a
            r18 = r12
            int[] r12 = r2.f2915a
            r19 = r12
            int r12 = r2.f2916b
            r20 = r2
            r2 = 0
        L8c2:
            if (r2 >= r12) goto L8d1
            r21 = r2
            r2 = r19[r21]
            if (r2 != r9) goto L8ce
            r8.add(r11)
            goto L8d1
        L8ce:
            int r2 = r21 + 1
            goto L8c2
        L8d1:
            int r12 = r18 + 1
            r9 = r17
            r2 = r20
            goto L8aa
        L8d8:
            int[] r2 = r6.f2915a
            int r6 = r6.f2916b
            r12 = 0
        L8dd:
            if (r12 >= r6) goto L9a3
            r9 = r2[r12]
            java.util.Iterator r11 = r3.iterator()
            r17 = 0
        L8e7:
            boolean r18 = r11.hasNext()
            if (r18 == 0) goto L904
            java.lang.Object r18 = r11.next()
            r19 = r2
            r2 = r18
            r.q r2 = (r.q) r2
            int r2 = r2.f11236a
            if (r2 != r9) goto L8ff
            r2 = r17
        L8fd:
            r11 = -1
            goto L908
        L8ff:
            int r17 = r17 + 1
            r2 = r19
            goto L8e7
        L904:
            r19 = r2
            r2 = -1
            goto L8fd
        L908:
            if (r2 != r11) goto L917
            r17 = r12
            r11 = r59
            r.q r18 = r15.a(r9, r11)
        L912:
            r20 = r6
            r6 = r18
            goto L922
        L917:
            r17 = r12
            r11 = r59
            java.lang.Object r18 = r3.remove(r2)
            r.q r18 = (r.q) r18
            goto L912
        L922:
            int r11 = r6.f11252q
            r12 = -1
            if (r2 != r12) goto L92b
            r2 = r13
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L93d
        L92b:
            r2 = 0
            long r23 = r6.b(r2)
            boolean r2 = r6.f11238c
            if (r2 == 0) goto L939
            r2 = r13
            long r12 = r23 & r33
        L937:
            int r12 = (int) r12
            goto L93d
        L939:
            r2 = r13
            long r12 = r23 >> r32
            goto L937
        L93d:
            int r13 = r8.size()
            r21 = r2
            r2 = 0
        L944:
            if (r2 >= r13) goto L958
            java.lang.Object r23 = r8.get(r2)
            r24 = r2
            r2 = r23
            r.q r2 = (r.q) r2
            int r2 = r2.f11236a
            if (r2 == r9) goto L955
            goto L95a
        L955:
            int r2 = r24 + 1
            goto L944
        L958:
            r23 = r39
        L95a:
            r2 = r23
            r.q r2 = (r.q) r2
            if (r2 == 0) goto L975
            r9 = 0
            long r23 = r2.b(r9)
            boolean r2 = r2.f11238c
            if (r2 == 0) goto L96e
            r2 = r8
            long r8 = r23 & r33
        L96c:
            int r8 = (int) r8
            goto L972
        L96e:
            r2 = r8
            long r8 = r23 >> r32
            goto L96c
        L972:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L979
        L975:
            r2 = r8
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L972
        L979:
            if (r12 != r9) goto L97f
            r12 = r49
            r13 = r12
            goto L985
        L97f:
            r13 = r49
            int r12 = java.lang.Math.max(r13, r12)
        L985:
            if (r8 == r9) goto L98c
            int r8 = r8 - r11
            int r12 = java.lang.Math.min(r12, r8)
        L98c:
            r8 = 1
            r6.f11254s = r8
            r9 = r21
            r6.d(r12, r14, r9)
            r7.add(r6)
            int r12 = r17 + 1
            r8 = r2
            r49 = r13
            r2 = r19
            r6 = r20
            r13 = r9
            goto L8dd
        L9a3:
            r9 = r13
            r13 = r49
            r8 = 1
            goto L9ae
        L9a8:
            r9 = r13
            r13 = r49
            r8 = 1
            r7 = r44
        L9ae:
            if (r37 == 0) goto L9c2
            java.lang.Object r2 = tf.m.v1(r3)
            r.q r2 = (r.q) r2
            if (r2 == 0) goto L9bf
            int r2 = r2.f11236a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L9db
        L9bf:
            r2 = r39
            goto L9db
        L9c2:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L9cb
            r2 = r39
            goto L9d1
        L9cb:
            java.lang.Object[] r2 = r0.f13164h
            int r6 = r0.f13163g
            r2 = r2[r6]
        L9d1:
            r.q r2 = (r.q) r2
            if (r2 == 0) goto L9bf
            int r2 = r2.f11236a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L9db:
            if (r37 == 0) goto L9ee
            java.lang.Object r0 = tf.m.C1(r3)
            r.q r0 = (r.q) r0
            if (r0 == 0) goto L9eb
            int r0 = r0.f11236a
            java.lang.Integer r39 = java.lang.Integer.valueOf(r0)
        L9eb:
            r0 = r43
            goto L9fd
        L9ee:
            java.lang.Object r0 = r0.g()
            r.q r0 = (r.q) r0
            if (r0 == 0) goto L9eb
            int r0 = r0.f11236a
            java.lang.Integer r39 = java.lang.Integer.valueOf(r0)
            goto L9eb
        L9fd:
            if (r0 < r5) goto La03
            if (r10 <= r4) goto La02
            goto La03
        La02:
            r8 = 0
        La03:
            d9.h r0 = new d9.h
            r4 = r56
            r0.<init>(r4, r3, r7, r1)
            int r14 = r14 + r31
            r10 = r46
            int r1 = u2.b.g(r14, r10)
            int r4 = r9 + r38
            int r4 = u2.b.f(r4, r10)
            r6 = r67
            r9 = r42
            v1.o0 r10 = r6.z(r1, r4, r9, r0)
            if (r2 == 0) goto La27
            int r12 = r2.intValue()
            goto La28
        La27:
            r12 = 0
        La28:
            if (r39 == 0) goto La2f
            int r0 = r39.intValue()
            goto La30
        La2f:
            r0 = 0
        La30:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La39
            r17 = r44
            goto La5e
        La39:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r7)
            int r2 = r3.size()
            r4 = 0
        La43:
            if (r4 >= r2) goto La57
            java.lang.Object r7 = r3.get(r4)
            r.q r7 = (r.q) r7
            int r9 = r7.f11236a
            if (r12 > r9) goto La54
            if (r9 > r0) goto La54
            r1.add(r7)
        La54:
            int r4 = r4 + 1
            goto La43
        La57:
            b8.c r0 = s.o.f12052b
            tf.q.g1(r1, r0)
            r17 = r1
        La5e:
            if (r22 == 0) goto La64
            r21 = r30
        La62:
            r11 = r5
            goto La67
        La64:
            r21 = r29
            goto La62
        La67:
            r.p r5 = new r.p
            long r0 = r15.f11197d
            r20 = r11
            r18 = r13
            r14 = r16
            r7 = r25
            r13 = r27
            r22 = r36
            r23 = r41
            r19 = r50
            r12 = r53
            r11 = r55
            r9 = r57
            r15 = r0
            r0 = r6
            r6 = r61
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23)
        La88:
            boolean r0 = r0.u0()
            r6 = r63
            r14 = 0
            r6.g(r5, r0, r14)
            return r5
        La93:
            j8.o.l(r17)
            goto Lea
        La98:
            j8.o.l(r17)
            goto Lea
        La9d:
            r0 = move-exception
            w0.q.k(r8, r1, r10)
            throw r0
        Laa2:
            java.lang.String r0 = "null horizontalAlignment when isVertical == false"
            o.b.b(r0)
            okio.a.c()
            goto Lea
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r25, java.lang.Object r26) {
            r24 = this;
            r0 = r24
            r1 = r26
            int r2 = r0.f398g
            r4 = -1
            y0.l r5 = y0.l.f21818a
            r6 = 9
            r7 = 8
            r8 = 0
            r9 = 6
            i0.e r10 = i0.l.f5952a
            r11 = 2
            r12 = 0
            r13 = 1
            sf.n r14 = sf.n.f12433a
            java.lang.Object r15 = r0.f399h
            r16 = 49
            java.lang.Object r3 = r0.f400i
            switch(r2) {
                case 0: goto L7c1;
                case 1: goto L7ac;
                case 2: goto L797;
                case 3: goto L780;
                case 4: goto L756;
                case 5: goto L741;
                case 6: goto L62e;
                case 7: goto L5f6;
                case 8: goto L5e1;
                case 9: goto L5cc;
                case 10: goto L53f;
                case 11: goto L53a;
                case 12: goto L512;
                case 13: goto L499;
                case 14: goto L428;
                case 15: goto L400;
                case 16: goto L3e0;
                case 17: goto L3cb;
                case 18: goto L3b6;
                case 19: goto L3a1;
                case 20: goto L38c;
                case 21: goto L31f;
                case 22: goto L1e7;
                case 23: goto L19b;
                case 24: goto L16b;
                case 25: goto Lef;
                case 26: goto La3;
                case 27: goto L49;
                case 28: goto L34;
                default: goto L1f;
            }
        L1f:
            wb.fu r3 = (wb.fu) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            wb.ho.g4(r3, r15, r2, r1)
            return r14
        L34:
            wb.c3 r3 = (wb.c3) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            wb.ho.F0(r3, r15, r2, r1)
            return r14
        L49:
            wb.s0 r3 = (wb.s0) r3
            i0.a1 r15 = (i0.a1) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L5c
            r12 = r13
        L5c:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r12)
            if (r1 == 0) goto L9d
            if (r3 != 0) goto L6a
            java.lang.String r1 = "群名称 / 群聊备注 / 群号"
        L67:
            r17 = r1
            goto L6d
        L6a:
            java.lang.String r1 = "群昵称 / wxid"
            goto L67
        L6d:
            java.lang.Object r1 = r15.getValue()
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
            boolean r1 = r2.f(r15)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L81
            if (r3 != r10) goto L8b
        L81:
            wb.aj r3 = new wb.aj
            r1 = 14
            r3.<init>(r15, r1)
            r2.k0(r3)
        L8b:
            r20 = r3
            fg.l r20 = (fg.l) r20
            r22 = 6
            r23 = 8
            java.lang.String r16 = "搜索"
            r19 = 0
            r21 = r2
            wb.ho.C1(r16, r17, r18, r19, r20, r21, r22, r23)
            goto La2
        L9d:
            r21 = r2
            r21.V()
        La2:
            return r14
        La3:
            java.lang.String r3 = (java.lang.String) r3
            i0.a1 r15 = (i0.a1) r15
            r6 = r25
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r1 & 3
            if (r2 == r11) goto Lb7
            r2 = r13
            goto Lb8
        Lb7:
            r2 = r12
        Lb8:
            r1 = r1 & r13
            boolean r1 = r6.S(r1, r2)
            if (r1 == 0) goto Leb
            java.lang.Object r1 = r15.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r2 = r6.f(r15)
            java.lang.Object r4 = r6.P()
            if (r2 != 0) goto Ld5
            if (r4 != r10) goto Ldd
        Ld5:
            wb.gi r4 = new wb.gi
            r4.<init>(r15, r12)
            r6.k0(r4)
        Ldd:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r7 = 48
            r8 = 8
            java.lang.String r2 = "启用默认规则"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lee
        Leb:
            r6.V()
        Lee:
            return r14
        Lef:
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            r2 = r15
            fg.a r2 = (fg.a) r2
            r4 = r25
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r5 = r1 & 3
            if (r5 == r11) goto L104
            r5 = r13
            goto L105
        L104:
            r5 = r12
        L105:
            r1 = r1 & r13
            boolean r1 = r4.S(r1, r5)
            if (r1 == 0) goto L166
            r19 = 1
            r21 = 28080(0x6db0, float:3.9348E-41)
            java.lang.String r16 = "keyword_notify_system"
            java.lang.String r17 = "系统通知"
            java.lang.String r18 = "在通知栏显示提醒"
            r15 = r3
            r20 = r4
            wb.ho.O3(r15, r16, r17, r18, r19, r20, r21)
            r1 = r20
            wb.ho.D1(r8, r1, r12, r13)
            java.lang.String r16 = "keyword_notify_toast"
            java.lang.String r17 = "Toast 提示"
            java.lang.String r18 = "短暂弹出提示"
            wb.ho.O3(r15, r16, r17, r18, r19, r20, r21)
            wb.ho.D1(r8, r1, r12, r13)
            java.lang.String r16 = "keyword_notify_at_me"
            java.lang.String r17 = "@我通知"
            java.lang.String r18 = "群聊有人 @ 我时提醒"
            wb.ho.O3(r15, r16, r17, r18, r19, r20, r21)
            wb.ho.D1(r8, r1, r12, r13)
            java.lang.String r16 = "keyword_notify_at_all"
            java.lang.String r17 = "@所有人/群公告通知"
            java.lang.String r18 = "命中 @所有人 或群公告时提醒"
            wb.ho.O3(r15, r16, r17, r18, r19, r20, r21)
            wb.ho.D1(r8, r1, r12, r13)
            boolean r3 = r1.f(r2)
            java.lang.Object r4 = r1.P()
            if (r3 != 0) goto L151
            if (r4 != r10) goto L15a
        L151:
            wb.kc r4 = new wb.kc
            r3 = 3
            r4.<init>(r2, r3)
            r1.k0(r4)
        L15a:
            fg.a r4 = (fg.a) r4
            r2 = 54
            java.lang.String r3 = "通知/Toast模板"
            java.lang.String r5 = "留空时使用内置默认模板"
            wb.ho.b(r3, r5, r4, r1, r2)
            goto L16a
        L166:
            r1 = r4
            r1.V()
        L16a:
            return r14
        L16b:
            java.util.List r3 = (java.util.List) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L17e
            r12 = r13
        L17e:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r12)
            if (r1 == 0) goto L197
            int r1 = r3.size()
            java.lang.String r3 = "统一修改全部 "
            java.lang.String r4 = " 个会话规则"
            java.lang.String r1 = eh.a.m(r1, r3, r4)
            java.lang.String r3 = "批量配置"
            wb.ho.b(r3, r1, r15, r2, r9)
            goto L19a
        L197:
            r2.V()
        L19a:
            return r14
        L19b:
            x9.f r3 = (x9.f) r3
            fg.l r15 = (fg.l) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L1af
            r4 = r13
            goto L1b0
        L1af:
            r4 = r12
        L1b0:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L1e3
            java.lang.String r1 = r3.f21416a
            boolean r4 = r3.f21417b
            if (r4 == 0) goto L1c0
            java.lang.String r4 = "全字匹配"
            goto L1c2
        L1c0:
            java.lang.String r4 = "模糊匹配"
        L1c2:
            boolean r5 = r2.f(r15)
            boolean r6 = r2.h(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r2.P()
            if (r5 != 0) goto L1d3
            if (r6 != r10) goto L1dd
        L1d3:
            sh.v1 r6 = new sh.v1
            r5 = 24
            r6.<init>(r15, r5, r3)
            r2.k0(r6)
        L1dd:
            fg.a r6 = (fg.a) r6
            wb.ho.b(r1, r4, r6, r2, r12)
            goto L1e6
        L1e3:
            r2.V()
        L1e6:
            return r14
        L1e7:
            v8.a r3 = (v8.a) r3
            fg.l r15 = (fg.l) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L1fb
            r4 = r13
            goto L1fc
        L1fb:
            r4 = r12
        L1fc:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L31a
            boolean r1 = r3.f14203c
            boolean r4 = r2.f(r15)
            boolean r5 = r2.h(r3)
            r4 = r4 | r5
            java.lang.Object r5 = r2.P()
            if (r4 != 0) goto L216
            if (r5 != r10) goto L21f
        L216:
            wb.pg r5 = new wb.pg
            r4 = 4
            r5.<init>(r15, r3, r4)
            r2.k0(r5)
        L21f:
            r20 = r5
            fg.l r20 = (fg.l) r20
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 8
            java.lang.String r17 = "启用规则"
            java.lang.String r18 = "关闭后保留配置但不触发"
            r19 = 0
            r16 = r1
            r21 = r2
            wb.ho.P3(r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r21
            wb.ho.D1(r8, r1, r12, r13)
            boolean r2 = r3.f14204d
            boolean r4 = r1.f(r15)
            boolean r5 = r1.h(r3)
            r4 = r4 | r5
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L24c
            if (r5 != r10) goto L255
        L24c:
            wb.pg r5 = new wb.pg
            r4 = 5
            r5.<init>(r15, r3, r4)
            r1.k0(r5)
        L255:
            r20 = r5
            fg.l r20 = (fg.l) r20
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 8
            java.lang.String r17 = "转发自己发送的消息"
            java.lang.String r18 = "默认关闭；模块自动转发的消息不会再次触发"
            r19 = 0
            r21 = r1
            r16 = r2
            wb.ho.P3(r16, r17, r18, r19, r20, r21, r22, r23)
            wb.ho.D1(r8, r1, r12, r13)
            java.lang.String r2 = r3.f14202b
            boolean r4 = r1.f(r15)
            boolean r5 = r1.h(r3)
            r4 = r4 | r5
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L280
            if (r5 != r10) goto L288
        L280:
            wb.pg r5 = new wb.pg
            r5.<init>(r15, r3, r9)
            r1.k0(r5)
        L288:
            r20 = r5
            fg.l r20 = (fg.l) r20
            r22 = 54
            r23 = 8
            java.lang.String r16 = "规则名称"
            java.lang.String r17 = "用于列表里识别规则"
            r19 = 0
            r21 = r1
            r18 = r2
            wb.ho.C1(r16, r17, r18, r19, r20, r21, r22, r23)
            wb.ho.D1(r8, r1, r12, r13)
            boolean r2 = r3.f14209i
            boolean r4 = r1.f(r15)
            boolean r5 = r1.h(r3)
            r4 = r4 | r5
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L2b3
            if (r5 != r10) goto L2bc
        L2b3:
            wb.pg r5 = new wb.pg
            r4 = 7
            r5.<init>(r15, r3, r4)
            r1.k0(r5)
        L2bc:
            r20 = r5
            fg.l r20 = (fg.l) r20
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 8
            java.lang.String r17 = "延迟发送"
            java.lang.String r18 = "开启后按设置时间等待再转发"
            r19 = 0
            r21 = r1
            r16 = r2
            wb.ho.P3(r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r2 = r3.f14209i
            if (r2 == 0) goto L310
            r2 = -1015778076(0xffffffffc37474e4, float:-244.4566)
            r1.a0(r2)
            wb.ho.D1(r8, r1, r12, r13)
            long r4 = r3.f14210j
            java.lang.String r18 = java.lang.String.valueOf(r4)
            boolean r2 = r1.f(r15)
            boolean r4 = r1.h(r3)
            r2 = r2 | r4
            java.lang.Object r4 = r1.P()
            if (r2 != 0) goto L2f5
            if (r4 != r10) goto L2fd
        L2f5:
            wb.pg r4 = new wb.pg
            r4.<init>(r15, r3, r7)
            r1.k0(r4)
        L2fd:
            r19 = r4
            fg.l r19 = (fg.l) r19
            r21 = 54
            java.lang.String r16 = "延迟时间"
            java.lang.String r17 = "单位秒，0 表示立即发送"
            r20 = r1
            wb.ho.w2(r16, r17, r18, r19, r20, r21)
            r1.p(r12)
            goto L31e
        L310:
            r2 = -1015488815(0xffffffffc378ded1, float:-248.87038)
            r1.a0(r2)
            r1.p(r12)
            goto L31e
        L31a:
            r1 = r2
            r1.V()
        L31e:
            return r14
        L31f:
            wb.mu r3 = (wb.mu) r3
            i0.a1 r15 = (i0.a1) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L333
            r4 = r13
            goto L334
        L333:
            r4 = r12
        L334:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L387
            ua.h r1 = r3.f17791b
            java.lang.String r1 = r1.f13619b
            r20 = 6
            r21 = 4
            java.lang.String r16 = "ID"
            r18 = 0
            r17 = r1
            r19 = r2
            wb.ho.B1(r16, r17, r18, r19, r20, r21)
            r1 = r19
            wb.ho.D1(r8, r1, r12, r13)
            java.lang.Object r2 = r15.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r16 = r2.booleanValue()
            boolean r2 = r1.f(r15)
            java.lang.Object r3 = r1.P()
            if (r2 != 0) goto L369
            if (r3 != r10) goto L373
        L369:
            wb.oh r3 = new wb.oh
            r2 = 27
            r3.<init>(r15, r2)
            r1.k0(r3)
        L373:
            r20 = r3
            fg.l r20 = (fg.l) r20
            r22 = 432(0x1b0, float:6.05E-43)
            r23 = 8
            java.lang.String r17 = "启用自动收款"
            java.lang.String r18 = "关闭后该聊天不会自动收款"
            r19 = 0
            r21 = r1
            wb.ho.P3(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L38b
        L387:
            r1 = r2
            r1.V()
        L38b:
            return r14
        L38c:
            vb.a r3 = (vb.a) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            wb.ho.I0(r3, r15, r2, r1)
            return r14
        L3a1:
            wb.d3 r3 = (wb.d3) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            wb.ho.K0(r3, r15, r2, r1)
            return r14
        L3b6:
            eb.c0 r3 = (eb.c0) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r6)
            wb.ho.H2(r3, r15, r2, r1)
            return r14
        L3cb:
            wb.z2 r3 = (wb.z2) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r6)
            wb.ho.B0(r3, r15, r2, r1)
            return r14
        L3e0:
            c9.q0 r3 = (c9.q0) r3
            fg.a r15 = (fg.a) r15
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            r2.getClass()
            r1.getClass()
            java.lang.Object r1 = r3.invoke(r2, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3ff
            r15.invoke()
        L3ff:
            return r14
        L400:
            s0.d r3 = (s0.d) r3
            c9.r0 r15 = (c9.r0) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L414
            r4 = r13
            goto L415
        L414:
            r4 = r12
        L415:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L424
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r3.b(r15, r2, r1)
            goto L427
        L424:
            r2.V()
        L427:
            return r14
        L428:
            s0.d r3 = (s0.d) r3
            sh.o0 r15 = (sh.o0) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L43c
            r4 = r13
            goto L43d
        L43c:
            r4 = r12
        L43d:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L495
            y0.g r1 = y0.b.f21792g
            v1.n0 r1 = p.o.d(r1, r12)
            long r6 = r2.T
            int r4 = java.lang.Long.hashCode(r6)
            s0.h r6 = r2.l()
            y0.o r5 = y0.a.c(r2, r5)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r2.d0()
            boolean r8 = r2.S
            if (r8 == 0) goto L46a
            r2.k(r7)
            goto L46d
        L46a:
            r2.n0()
        L46d:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r2, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r2, r6)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.t(r2, r1, r4)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r2)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r2, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r3.b(r15, r2, r1)
            r2.p(r13)
            goto L498
        L495:
            r2.V()
        L498:
            return r14
        L499:
            p.x0 r3 = (p.x0) r3
            s0.d r15 = (s0.d) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L4ad
            r4 = r13
            goto L4ae
        L4ad:
            r4 = r12
        L4ae:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L50e
            y0.o r1 = p.d.k(r5, r3)
            p.e r3 = p.j.f9926c
            y0.e r4 = y0.b.f21804s
            p.t r3 = p.s.a(r3, r4, r2, r12)
            long r4 = r2.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r2.l()
            y0.o r1 = y0.a.c(r2, r1)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r2.d0()
            boolean r7 = r2.S
            if (r7 == 0) goto L4e1
            r2.k(r6)
            goto L4e4
        L4e1:
            r2.n0()
        L4e4:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r2, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r2, r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.t(r2, r3, r4)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r2)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r2, r1)
            p.u r1 = p.u.f10014a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r15.b(r1, r2, r3)
            r2.p(r13)
            goto L511
        L50e:
            r2.V()
        L511:
            return r14
        L512:
            s0.d r3 = (s0.d) r3
            s.x0 r15 = (s.x0) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L526
            r4 = r13
            goto L527
        L526:
            r4 = r12
        L527:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L536
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r3.b(r15, r2, r1)
            goto L539
        L536:
            r2.V()
        L539:
            return r14
        L53a:
            java.lang.Object r1 = r24.e(r25, r26)
            return r1
        L53f:
            s.b0 r3 = (s.b0) r3
            s.a0 r15 = (s.a0) r15
            java.lang.Object r2 = r15.f11967a
            r5 = r25
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6 = r1 & 3
            if (r6 == r11) goto L555
            r6 = r13
            goto L556
        L555:
            r6 = r12
        L556:
            r1 = r1 & r13
            boolean r1 = r5.S(r1, r6)
            if (r1 == 0) goto L5c7
            b0.j r1 = r3.f11981b
            java.lang.Object r1 = r1.invoke()
            r.k r1 = (r.k) r1
            int r6 = r15.f11969c
            int r7 = r1.c()
            if (r6 >= r7) goto L577
            java.lang.Object r7 = r1.d(r6)
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L581
        L577:
            ac.k r6 = r1.f11177d
            int r6 = r6.o(r2)
            if (r6 == r4) goto L581
            r15.f11969c = r6
        L581:
            if (r6 == r4) goto L5a2
            r4 = -1664741271(0xffffffff9cc61069, float:-1.3106783E-21)
            r5.a0(r4)
            v0.c r3 = r3.f11980a
            r21 = 0
            r16 = r1
            r19 = r2
            r17 = r3
            r20 = r5
            r18 = r6
            s.o.d(r16, r17, r18, r19, r20, r21)
            r1 = r19
            r2 = r20
            r2.p(r12)
            goto L5ad
        L5a2:
            r1 = r2
            r2 = r5
            r3 = -1664505826(0xffffffff9cc9a81e, float:-1.3344522E-21)
            r2.a0(r3)
            r2.p(r12)
        L5ad:
            boolean r3 = r2.h(r15)
            java.lang.Object r4 = r2.P()
            if (r3 != 0) goto L5b9
            if (r4 != r10) goto L5c1
        L5b9:
            nb.a r4 = new nb.a
            r4.<init>(r15, r9)
            r2.k0(r4)
        L5c1:
            fg.l r4 = (fg.l) r4
            i0.r.c(r1, r4, r2)
            goto L5cb
        L5c7:
            r2 = r5
            r2.V()
        L5cb:
            return r14
        L5cc:
            l.e r3 = (l.e) r3
            l.d r15 = (l.d) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            r3.a(r15, r2, r1)
            return r14
        L5e1:
            y0.o r3 = (y0.o) r3
            fg.l r15 = (fg.l) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            k.n.a(r3, r15, r2, r1)
            return r14
        L5f6:
            b5.i r3 = (b5.i) r3
            l0.k r15 = (l0.k) r15
            r2 = r25
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r1 instanceof i0.h
            if (r4 == 0) goto L610
            i0.h r1 = (i0.h) r1
            java.lang.Object r2 = r3.f481g
            j0.b r2 = (j0.b) r2
            r2.b(r1)
            goto L62d
        L610:
            boolean r4 = r1 instanceof i0.d2
            if (r4 != 0) goto L62d
            boolean r4 = r1 instanceof i0.k0
            if (r4 == 0) goto L621
            i0.r.z(r15, r2, r1)
            i0.k0 r1 = (i0.k0) r1
            r3.g(r1)
            goto L62d
        L621:
            boolean r3 = r1 instanceof i0.r1
            if (r3 == 0) goto L62d
            i0.r.z(r15, r2, r1)
            i0.r1 r1 = (i0.r1) r1
            r1.c()
        L62d:
            return r14
        L62e:
            h0.d1 r3 = (h0.d1) r3
            qg.t r15 = (qg.t) r15
            r2 = r25
            y.a r2 = (y.a) r2
            android.content.Context r1 = (android.content.Context) r1
            boolean r18 = r3.j()
            i2.g r5 = r3.m()
            if (r5 == 0) goto L645
            java.lang.String r5 = r5.f6314h
            goto L646
        L645:
            r5 = 0
        L646:
            i2.m0 r8 = r3.f4868v
            if (r8 == 0) goto L66a
            long r8 = r8.f6360a
            b5.k r10 = r3.f4848b
            r11 = 32
            long r12 = r8 >> r11
            int r11 = (int) r12
            r10.l(r11)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r12
            int r8 = (int) r8
            r10.l(r8)
            long r8 = i2.e0.b(r11, r8)
            i2.m0 r10 = new i2.m0
            r10.<init>(r8)
            goto L66b
        L66a:
            r10 = 0
        L66b:
            h0.p r8 = r3.f4855i
            b0.s r9 = new b0.s
            r9.<init>(r7, r1, r3, r15)
            i0.m2 r3 = h0.r.f4973a
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            if (r3 < r7) goto L684
            if (r5 == 0) goto L684
            if (r10 == 0) goto L684
            if (r8 == 0) goto L684
            boolean r3 = r8 instanceof h0.p
            if (r3 != 0) goto L68b
        L684:
            r17 = r1
            r1 = r2
            r19 = r5
            goto L730
        L68b:
            long r11 = r10.f6360a
            java.lang.Object r3 = r8.f4967h
            yg.b r7 = r8.f4964e
            boolean r13 = r7.e()
            if (r13 != 0) goto L699
            r6 = 0
            goto L6bd
        L699:
            i0.j1 r8 = r8.f4966g
            java.lang.Object r8 = r8.getValue()
            h0.r0 r8 = (h0.r0) r8
            r13 = r7
            if (r8 == 0) goto L6b8
            long r6 = r8.f4976b
            boolean r6 = i2.m0.b(r11, r6)
            if (r6 == 0) goto L6b8
            java.lang.CharSequence r6 = r8.f4975a
            boolean r6 = gg.l.a(r5, r6)
            if (r6 == 0) goto L6b8
            android.view.textclassifier.TextClassification r6 = r8.f4977c
        L6b6:
            r7 = 0
            goto L6ba
        L6b8:
            r6 = 0
            goto L6b6
        L6ba:
            r13.f(r7)
        L6bd:
            if (r6 != 0) goto L6c3
            r9.invoke(r2)
            goto L722
        L6c3:
            java.util.List r7 = b0.b0.r(r6)
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L6d9
            z.h r4 = new z.h
            r7 = 0
            r4.<init>(r3, r6, r7)
            f.f0 r7 = r2.f21788a
            r7.a(r4)
            goto L6ff
        L6d9:
            android.graphics.drawable.Drawable r7 = r6.getIcon()
            if (r7 != 0) goto L6e9
            java.lang.CharSequence r7 = r6.getLabel()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L6ff
        L6e9:
            android.content.Intent r7 = r6.getIntent()
            if (r7 != 0) goto L6f5
            android.view.View$OnClickListener r7 = r6.getOnClickListener()
            if (r7 == 0) goto L6ff
        L6f5:
            z.h r7 = new z.h
            r7.<init>(r3, r6, r4)
            f.f0 r4 = r2.f21788a
            r4.a(r7)
        L6ff:
            r9.invoke(r2)
            java.util.List r4 = b0.b0.r(r6)
            int r7 = r4.size()
            r12 = 0
        L70b:
            if (r12 >= r7) goto L722
            java.lang.Object r8 = r4.get(r12)
            android.app.RemoteAction r8 = (android.app.RemoteAction) r8
            if (r12 <= 0) goto L71f
            z.h r8 = new z.h
            r8.<init>(r3, r6, r12)
            f.f0 r9 = r2.f21788a
            r9.a(r8)
        L71f:
            int r12 = r12 + 1
            goto L70b
        L722:
            long r3 = r10.f6360a
            r17 = r1
            r16 = r2
            r20 = r3
            r19 = r5
            x.a.a(r16, r17, r18, r19, r20)
            goto L740
        L730:
            r9.invoke(r1)
            if (r19 == 0) goto L740
            if (r10 == 0) goto L740
            long r2 = r10.f6360a
            r16 = r1
            r20 = r2
            x.a.a(r16, r17, r18, r19, r20)
        L740:
            return r14
        L741:
            y0.o r3 = (y0.o) r3
            s0.d r15 = (s0.d) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r16)
            be.h.c(r3, r15, r2, r1)
            return r14
        L756:
            s0.d r3 = (s0.d) r3
            c9.p0 r15 = (c9.p0) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r4 = r1 & 3
            if (r4 == r11) goto L76a
            r4 = r13
            goto L76b
        L76a:
            r4 = 0
        L76b:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r4)
            if (r1 == 0) goto L77c
            r17 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r3.b(r15, r2, r1)
            goto L77f
        L77c:
            r2.V()
        L77f:
            return r14
        L780:
            c9.j1 r3 = (c9.j1) r3
            java.lang.String r15 = (java.lang.String) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            r1 = 55
            int r1 = i0.r.C(r1)
            r3.r(r15, r2, r1)
            return r14
        L797:
            b0.e0 r3 = (b0.e0) r3
            android.graphics.drawable.Drawable r15 = (android.graphics.drawable.Drawable) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r16)
            r3.a(r15, r2, r1)
            return r14
        L7ac:
            z.g r15 = (z.g) r15
            z.c r3 = (z.c) r3
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = i0.r.C(r13)
            b0.w.a(r15, r3, r2, r1)
            return r14
        L7c1:
            r6 = r3
            d0.d r6 = (d0.d) r6
            z.g r15 = (z.g) r15
            r2 = r25
            i0.h0 r2 = (i0.h0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r11) goto L7d6
            r7 = r13
            goto L7d7
        L7d6:
            r7 = 0
        L7d7:
            r1 = r1 & r13
            boolean r1 = r2.S(r1, r7)
            if (r1 == 0) goto L80d
            boolean r1 = r2.f(r6)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L7ea
            if (r3 != r10) goto L800
        L7ea:
            b0.v r4 = new b0.v
            r11 = 0
            r12 = 0
            r5 = 0
            java.lang.Class<d0.d> r7 = d0.d.class
            java.lang.String r8 = "data"
            java.lang.String r9 = "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;"
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            i0.x r3 = i0.r.p(r4)
            r2.k0(r3)
        L800:
            i0.l2 r3 = (i0.l2) r3
            java.lang.Object r1 = r3.getValue()
            z.c r1 = (z.c) r1
            r7 = 0
            b0.w.a(r15, r1, r2, r7)
            goto L810
        L80d:
            r2.V()
        L810:
            return r14
    }
}
