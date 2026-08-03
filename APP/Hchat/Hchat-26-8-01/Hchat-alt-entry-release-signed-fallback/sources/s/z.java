package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.k0 f12146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ac.k f12147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.l0 f12149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f12150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f12151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f12152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f12153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f12154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s.w f12155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0.o f12156k;

    public z() {
            r1 = this;
            r1.<init>()
            long[] r0 = f.r0.f2895a
            f.k0 r0 = new f.k0
            r0.<init>()
            r1.f12146a = r0
            f.l0 r0 = f.s0.f2899a
            f.l0 r0 = new f.l0
            r0.<init>()
            r1.f12149d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12150e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12151f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12152g = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12153h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f12154i = r0
            s.v r0 = new s.v
            r0.<init>(r1)
            r1.f12156k = r0
            return
    }

    public static void b(r.q r10, int r11, s.x r12) {
            r0 = 0
            long r1 = r10.b(r0)
            boolean r3 = r10.f11238c
            if (r3 == 0) goto Lf
            r3 = 1
            long r3 = u2.j.a(r0, r11, r1, r3)
            goto L14
        Lf:
            r3 = 2
            long r3 = u2.j.a(r11, r0, r1, r3)
        L14:
            s.t[] r11 = r12.f12127a
            int r12 = r11.length
            r5 = r0
        L18:
            if (r0 >= r12) goto L32
            r6 = r11[r0]
            int r7 = r5 + 1
            if (r6 == 0) goto L2e
            long r8 = r10.b(r5)
            long r8 = u2.j.c(r8, r1)
            long r8 = u2.j.d(r3, r8)
            r6.f12104j = r8
        L2e:
            int r0 = r0 + 1
            r5 = r7
            goto L18
        L32:
            return
    }

    public static int g(int[] r2, r.q r3) {
            r3.getClass()
            r0 = 0
            r1 = r2[r0]
            int r3 = r3.f11252q
            int r1 = r1 + r3
            r2[r0] = r1
            int r2 = java.lang.Math.max(r0, r1)
            return r2
    }

    public final long a() {
            r13 = this;
            java.util.ArrayList r0 = r13.f12154i
            int r1 = r0.size()
            r2 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L43
            java.lang.Object r5 = r0.get(r4)
            s.t r5 = (s.t) r5
            i1.b r6 = r5.f12106l
            if (r6 == 0) goto L40
            r7 = 32
            long r8 = r2 >> r7
            int r8 = (int) r8
            long r9 = r5.f12104j
            long r9 = r9 >> r7
            int r9 = (int) r9
            long r10 = r6.f6153u
            long r10 = r10 >> r7
            int r10 = (int) r10
            int r9 = r9 + r10
            int r8 = java.lang.Math.max(r8, r9)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r9
            int r2 = (int) r2
            long r11 = r5.f12104j
            long r11 = r11 & r9
            int r3 = (int) r11
            long r5 = r6.f6153u
            long r5 = r5 & r9
            int r5 = (int) r5
            int r3 = r3 + r5
            int r2 = java.lang.Math.max(r2, r3)
            long r5 = (long) r8
            long r5 = r5 << r7
            long r2 = (long) r2
            long r2 = r2 & r9
            long r2 = r2 | r5
        L40:
            int r4 = r4 + 1
            goto L9
        L43:
            return r2
    }

    public final void c(int r44, int r45, int r46, java.util.ArrayList r47, ac.k r48, r.n r49, boolean r50, boolean r51, boolean r52, int r53, int r54, qg.t r55, f1.z r56) {
            r43 = this;
            r0 = r43
            r1 = r44
            r4 = r47
            r5 = r48
            ac.k r6 = r0.f12147b
            r0.f12147b = r5
            int r7 = r4.size()
            r8 = 0
            r9 = r8
        L12:
            f.k0 r11 = r0.f12146a
            if (r9 >= r7) goto L45
            java.lang.Object r12 = r4.get(r9)
            r.q r12 = (r.q) r12
            java.util.List r13 = r12.f11237b
            int r13 = r13.size()
            r14 = r8
        L23:
            if (r14 >= r13) goto L42
            java.util.List r15 = r12.f11237b
            java.lang.Object r15 = r15.get(r14)
            v1.b1 r15 = (v1.b1) r15
            java.lang.Object r15 = r15.X()
            r16 = 0
            boolean r10 = r15 instanceof s.l
            if (r10 == 0) goto L3a
            s.l r15 = (s.l) r15
            goto L3c
        L3a:
            r15 = r16
        L3c:
            if (r15 == 0) goto L3f
            goto L51
        L3f:
            int r14 = r14 + 1
            goto L23
        L42:
            int r9 = r9 + 1
            goto L12
        L45:
            r16 = 0
            boolean r7 = r11.i()
            if (r7 == 0) goto L51
            r0.d()
            return
        L51:
            int r7 = r0.f12148c
            java.lang.Object r9 = tf.m.v1(r4)
            r.q r9 = (r.q) r9
            if (r9 == 0) goto L5e
            int r9 = r9.f11236a
            goto L5f
        L5e:
            r9 = r8
        L5f:
            r0.f12148c = r9
            r12 = 32
            if (r50 == 0) goto L71
            long r13 = (long) r8
            long r13 = r13 << r12
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = (long) r1
            long r9 = r9 & r17
            long r9 = r9 | r13
            goto L7c
        L71:
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = (long) r1
            long r9 = r9 << r12
            long r13 = (long) r8
            long r13 = r13 & r17
            long r9 = r9 | r13
        L7c:
            if (r51 != 0) goto L83
            if (r52 != 0) goto L81
            goto L83
        L81:
            r13 = r8
            goto L84
        L83:
            r13 = 1
        L84:
            java.lang.Object[] r14 = r11.f2849b
            long[] r15 = r11.f2848a
            r19 = r12
            int r12 = r15.length
            int r12 = r12 + (-2)
            r20 = 128(0x80, double:6.3E-322)
            r22 = 255(0xff, double:1.26E-321)
            r24 = 7
            f.l0 r1 = r0.f12149d
            r25 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r52 = r13
            if (r12 < 0) goto Ldb
            r27 = r14
            r8 = 0
        La1:
            r50 = 8
            r13 = r15[r8]
            long r2 = ~r13
            long r2 = r2 << r24
            long r2 = r2 & r13
            long r2 = r2 & r25
            int r2 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r2 == 0) goto Ld6
            int r2 = r8 - r12
            int r2 = ~r2
            int r2 = r2 >>> 31
            int r2 = 8 - r2
            r3 = 0
        Lb7:
            if (r3 >= r2) goto Ld2
            long r28 = r13 & r22
            int r28 = (r28 > r20 ? 1 : (r28 == r20 ? 0 : -1))
            if (r28 >= 0) goto Lcb
            int r28 = r8 << 3
            int r28 = r28 + r3
            r29 = r3
            r3 = r27[r28]
            r1.a(r3)
            goto Lcd
        Lcb:
            r29 = r3
        Lcd:
            long r13 = r13 >> r50
            int r3 = r29 + 1
            goto Lb7
        Ld2:
            r3 = r50
            if (r2 != r3) goto Ldb
        Ld6:
            if (r8 == r12) goto Ldb
            int r8 = r8 + 1
            goto La1
        Ldb:
            int r2 = r4.size()
            r3 = 0
        Le0:
            java.util.ArrayList r8 = r0.f12154i
            java.util.ArrayList r13 = r0.f12151f
            java.util.ArrayList r14 = r0.f12150e
            if (r3 >= r2) goto L20d
            java.lang.Object r15 = r4.get(r3)
            r.q r15 = (r.q) r15
            java.lang.Object r12 = r15.f11246k
            r34 = r2
            java.util.List r2 = r15.f11237b
            r1.l(r12)
            r35 = r3
            int r3 = r2.size()
            r28 = r15
            r15 = 0
        L100:
            if (r15 >= r3) goto L200
            java.lang.Object r27 = r2.get(r15)
            v1.b1 r27 = (v1.b1) r27
            r29 = r2
            java.lang.Object r2 = r27.X()
            r27 = r3
            boolean r3 = r2 instanceof s.l
            if (r3 == 0) goto L117
            s.l r2 = (s.l) r2
            goto L119
        L117:
            r2 = r16
        L119:
            if (r2 == 0) goto L1f2
            java.lang.Object r2 = r11.g(r12)
            r27 = r2
            s.x r27 = (s.x) r27
            if (r6 == 0) goto L12b
            int r2 = r6.o(r12)
        L129:
            r3 = -1
            goto L12d
        L12b:
            r2 = -1
            goto L129
        L12d:
            if (r2 != r3) goto L133
            if (r6 == 0) goto L133
            r3 = 1
            goto L134
        L133:
            r3 = 0
        L134:
            if (r27 != 0) goto L185
            s.x r8 = new s.x
            r8.<init>(r0)
            r31 = r53
            r32 = r54
            r29 = r55
            r30 = r56
            r27 = r8
            s.x.b(r27, r28, r29, r30, r31, r32)
            r15 = r28
            r11.m(r12, r8)
            int r12 = r15.f11236a
            if (r12 == r2) goto L160
            r12 = -1
            if (r2 == r12) goto L160
            if (r2 >= r7) goto L15b
            r14.add(r15)
            goto L203
        L15b:
            r13.add(r15)
            goto L203
        L160:
            r2 = 0
            long r12 = r15.b(r2)
            boolean r2 = r15.f11238c
            if (r2 == 0) goto L16d
            long r12 = r12 & r17
        L16b:
            int r2 = (int) r12
            goto L170
        L16d:
            long r12 = r12 >> r19
            goto L16b
        L170:
            b(r15, r2, r8)
            if (r3 == 0) goto L203
            s.t[] r2 = r8.f12127a
            int r3 = r2.length
            r8 = 0
        L179:
            if (r8 >= r3) goto L203
            r12 = r2[r8]
            if (r12 == 0) goto L182
            r12.a()
        L182:
            int r8 = r8 + 1
            goto L179
        L185:
            r15 = r28
            if (r52 == 0) goto L203
            r31 = r53
            r32 = r54
            r29 = r55
            r30 = r56
            r28 = r15
            s.x.b(r27, r28, r29, r30, r31, r32)
            r12 = r27
            r2 = r28
            s.t[] r13 = r12.f12127a
            int r14 = r13.length
            r15 = 0
        L19e:
            if (r15 >= r14) goto L1c9
            r27 = r3
            r3 = r13[r15]
            r28 = r13
            r29 = r14
            if (r3 == 0) goto L1bc
            long r13 = r3.f12104j
            long r4 = s.t.f12093q
            boolean r4 = u2.j.b(r13, r4)
            if (r4 != 0) goto L1bc
            long r4 = r3.f12104j
            long r4 = u2.j.d(r4, r9)
            r3.f12104j = r4
        L1bc:
            int r15 = r15 + 1
            r4 = r47
            r5 = r48
            r3 = r27
            r13 = r28
            r14 = r29
            goto L19e
        L1c9:
            r27 = r3
            if (r27 == 0) goto L1ed
            s.t[] r3 = r12.f12127a
            int r4 = r3.length
            r5 = 0
        L1d1:
            if (r5 >= r4) goto L1ed
            r12 = r3[r5]
            if (r12 == 0) goto L1ea
            boolean r13 = r12.b()
            if (r13 == 0) goto L1e7
            r8.remove(r12)
            s.w r13 = r0.f12155j
            if (r13 == 0) goto L1e7
            x1.k.l(r13)
        L1e7:
            r12.a()
        L1ea:
            int r5 = r5 + 1
            goto L1d1
        L1ed:
            r3 = 0
            r0.f(r2, r3)
            goto L203
        L1f2:
            r2 = r28
            int r15 = r15 + 1
            r4 = r47
            r5 = r48
            r3 = r27
            r2 = r29
            goto L100
        L200:
            r0.e(r12)
        L203:
            int r3 = r35 + 1
            r4 = r47
            r5 = r48
            r2 = r34
            goto Le0
        L20d:
            r2 = 1
            int[] r3 = new int[r2]
            if (r52 == 0) goto L29d
            if (r6 == 0) goto L29d
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L257
            int r4 = r14.size()
            if (r4 <= r2) goto L229
            s.y r2 = new s.y
            r4 = 2
            r2.<init>(r6, r4)
            tf.q.g1(r14, r2)
        L229:
            int r2 = r14.size()
            r4 = 0
        L22e:
            if (r4 >= r2) goto L251
            java.lang.Object r5 = r14.get(r4)
            r.q r5 = (r.q) r5
            int r7 = g(r3, r5)
            int r7 = r53 - r7
            java.lang.Object r9 = r5.f11246k
            java.lang.Object r9 = r11.g(r9)
            r9.getClass()
            s.x r9 = (s.x) r9
            b(r5, r7, r9)
            r7 = 0
            r0.f(r5, r7)
            int r4 = r4 + 1
            goto L22e
        L251:
            r4 = 1
            r7 = 0
            java.util.Arrays.fill(r3, r7, r4, r7)
            goto L258
        L257:
            r4 = r2
        L258:
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L29d
            int r2 = r13.size()
            if (r2 <= r4) goto L26d
            s.y r2 = new s.y
            r4 = 0
            r2.<init>(r6, r4)
            tf.q.g1(r13, r2)
        L26d:
            int r2 = r13.size()
            r4 = 0
        L272:
            if (r4 >= r2) goto L298
            java.lang.Object r5 = r13.get(r4)
            r.q r5 = (r.q) r5
            int r7 = g(r3, r5)
            int r7 = r7 + r54
            int r9 = r5.f11252q
            int r7 = r7 - r9
            java.lang.Object r9 = r5.f11246k
            java.lang.Object r9 = r11.g(r9)
            r9.getClass()
            s.x r9 = (s.x) r9
            b(r5, r7, r9)
            r7 = 0
            r0.f(r5, r7)
            int r4 = r4 + 1
            goto L272
        L298:
            r4 = 1
            r7 = 0
            java.util.Arrays.fill(r3, r7, r4, r7)
        L29d:
            java.lang.Object[] r2 = r1.f2856b
            long[] r4 = r1.f2855a
            int r5 = r4.length
            int r5 = r5 + (-2)
            java.util.ArrayList r7 = r0.f12153h
            java.util.ArrayList r9 = r0.f12152g
            if (r5 < 0) goto L427
            r12 = r1
            r15 = r2
            r10 = 0
        L2ad:
            r1 = r4[r10]
            r28 = r12
            r27 = r13
            long r12 = ~r1
            long r12 = r12 << r24
            long r12 = r12 & r1
            long r12 = r12 & r25
            int r12 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r12 == 0) goto L409
            int r12 = r10 - r5
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r13 = 0
        L2c7:
            if (r13 >= r12) goto L3fa
            long r29 = r1 & r22
            int r29 = (r29 > r20 ? 1 : (r29 == r20 ? 0 : -1))
            if (r29 >= 0) goto L3dc
            int r29 = r10 << 3
            int r29 = r29 + r13
            r30 = r1
            r1 = r15[r29]
            java.lang.Object r2 = r11.g(r1)
            s.x r2 = (s.x) r2
            if (r2 != 0) goto L2e1
            goto L3de
        L2e1:
            r29 = r4
            r32 = r13
            r4 = r48
            int r13 = r4.o(r1)
            r34 = r14
            int r14 = r2.f12131e
            r35 = r15
            r15 = 1
            int r14 = java.lang.Math.min(r15, r14)
            r2.f12131e = r14
            int r14 = 1 - r14
            int r15 = r2.f12130d
            int r14 = java.lang.Math.min(r14, r15)
            r2.f12130d = r14
            r14 = -1
            if (r13 != r14) goto L376
            s.t[] r13 = r2.f12127a
            int r15 = r13.length
            r14 = 0
            r33 = 0
            r36 = 0
        L30d:
            if (r14 >= r15) goto L36d
            r37 = r13
            r13 = r37[r14]
            int r38 = r36 + 1
            if (r13 == 0) goto L364
            boolean r39 = r13.b()
            if (r39 == 0) goto L320
            r39 = r14
            goto L359
        L320:
            r39 = r14
            i0.j1 r14 = r13.f12103i
            java.lang.Object r14 = r14.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L342
            r13.c()
            s.t[] r14 = r2.f12127a
            r14[r36] = r16
            r8.remove(r13)
            s.w r13 = r0.f12155j
            if (r13 == 0) goto L366
            x1.k.l(r13)
            goto L366
        L342:
            i1.b r14 = r13.f12106l
            if (r14 == 0) goto L349
            r13.b()
        L349:
            boolean r14 = r13.b()
            if (r14 == 0) goto L35c
            r8.add(r13)
            s.w r13 = r0.f12155j
            if (r13 == 0) goto L359
            x1.k.l(r13)
        L359:
            r33 = 1
            goto L366
        L35c:
            r13.c()
            s.t[] r13 = r2.f12127a
            r13[r36] = r16
            goto L366
        L364:
            r39 = r14
        L366:
            int r14 = r39 + 1
            r13 = r37
            r36 = r38
            goto L30d
        L36d:
            if (r33 != 0) goto L372
            r0.e(r1)
        L372:
            r33 = r8
            goto L3d9
        L376:
            u2.a r14 = r2.f12128b
            r14.getClass()
            long r14 = r14.f13338a
            r33 = r8
            r8 = r49
            r.q r14 = r8.a(r13, r14)
            r15 = 1
            r14.f11254s = r15
            s.t[] r15 = r2.f12127a
            int r8 = r15.length
            r37 = r14
            r14 = 0
        L38e:
            if (r14 >= r8) goto L3af
            r36 = r8
            r8 = r15[r14]
            if (r8 == 0) goto L3a8
            i0.j1 r8 = r8.f12100f
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r38 = r14
            r14 = 1
            if (r8 != r14) goto L3aa
            goto L3bb
        L3a8:
            r38 = r14
        L3aa:
            int r14 = r38 + 1
            r8 = r36
            goto L38e
        L3af:
            if (r6 == 0) goto L3bb
            int r8 = r6.o(r1)
            if (r13 != r8) goto L3bb
            r0.e(r1)
            goto L3d9
        L3bb:
            int r1 = r2.f12129c
            r40 = r53
            r41 = r54
            r38 = r55
            r39 = r56
            r42 = r1
            r36 = r2
            r36.a(r37, r38, r39, r40, r41, r42)
            r1 = r37
            int r2 = r0.f12148c
            if (r13 >= r2) goto L3d6
            r9.add(r1)
            goto L3d9
        L3d6:
            r7.add(r1)
        L3d9:
            r13 = 8
            goto L3eb
        L3dc:
            r30 = r1
        L3de:
            r29 = r4
            r33 = r8
            r32 = r13
            r34 = r14
            r35 = r15
            r4 = r48
            goto L3d9
        L3eb:
            long r1 = r30 >> r13
            int r8 = r32 + 1
            r13 = r8
            r4 = r29
            r8 = r33
            r14 = r34
            r15 = r35
            goto L2c7
        L3fa:
            r29 = r4
            r33 = r8
            r34 = r14
            r35 = r15
            r13 = 8
            r4 = r48
            if (r12 != r13) goto L42f
            goto L415
        L409:
            r29 = r4
            r33 = r8
            r34 = r14
            r35 = r15
            r13 = 8
            r4 = r48
        L415:
            if (r10 == r5) goto L42f
            int r10 = r10 + 1
            r13 = r27
            r12 = r28
            r4 = r29
            r8 = r33
            r14 = r34
            r15 = r35
            goto L2ad
        L427:
            r4 = r48
            r28 = r1
            r27 = r13
            r34 = r14
        L42f:
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L496
            int r1 = r9.size()
            r15 = 1
            if (r1 <= r15) goto L445
            s.y r1 = new s.y
            r2 = 3
            r1.<init>(r4, r2)
            tf.q.g1(r9, r1)
        L445:
            int r1 = r9.size()
            r2 = 0
        L44a:
            if (r2 >= r1) goto L48c
            java.lang.Object r5 = r9.get(r2)
            r.q r5 = (r.q) r5
            java.lang.Object r6 = r5.f11246k
            java.lang.Object r6 = r11.g(r6)
            r6.getClass()
            s.x r6 = (s.x) r6
            int r8 = g(r3, r5)
            if (r51 == 0) goto L479
            java.lang.Object r6 = tf.m.t1(r47)
            r.q r6 = (r.q) r6
            r10 = 0
            long r12 = r6.b(r10)
            boolean r6 = r6.f11238c
            if (r6 == 0) goto L476
            long r12 = r12 & r17
        L474:
            int r6 = (int) r12
            goto L47b
        L476:
            long r12 = r12 >> r19
            goto L474
        L479:
            int r6 = r6.f12132f
        L47b:
            int r6 = r6 - r8
            r8 = r45
            r10 = r46
            r5.d(r6, r8, r10)
            r15 = 1
            if (r52 == 0) goto L489
            r0.f(r5, r15)
        L489:
            int r2 = r2 + 1
            goto L44a
        L48c:
            r8 = r45
            r10 = r46
            r2 = 0
            r15 = 1
            java.util.Arrays.fill(r3, r2, r15, r2)
            goto L49b
        L496:
            r8 = r45
            r10 = r46
            r15 = 1
        L49b:
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L4de
            int r1 = r7.size()
            if (r1 <= r15) goto L4b0
            s.y r1 = new s.y
            r2 = 1
            r1.<init>(r4, r2)
            tf.q.g1(r7, r1)
        L4b0:
            int r1 = r7.size()
            r2 = 0
        L4b5:
            if (r2 >= r1) goto L4de
            java.lang.Object r4 = r7.get(r2)
            r.q r4 = (r.q) r4
            java.lang.Object r5 = r4.f11246k
            java.lang.Object r5 = r11.g(r5)
            r5.getClass()
            s.x r5 = (s.x) r5
            int r6 = g(r3, r4)
            int r5 = r5.f12133g
            int r12 = r4.f11252q
            int r5 = r5 - r12
            int r5 = r5 + r6
            r4.d(r5, r8, r10)
            r15 = 1
            if (r52 == 0) goto L4db
            r0.f(r4, r15)
        L4db:
            int r2 = r2 + 1
            goto L4b5
        L4de:
            java.util.Collections.reverse(r9)
            r4 = r47
            r2 = 0
            r4.addAll(r2, r9)
            r4.addAll(r7)
            r34.clear()
            r27.clear()
            r9.clear()
            r7.clear()
            r28.b()
            return
    }

    public final void d() {
            r15 = this;
            f.k0 r0 = r15.f12146a
            boolean r1 = r0.j()
            if (r1 == 0) goto L5d
            java.lang.Object[] r1 = r0.f2850c
            long[] r2 = r0.f2848a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L13:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L2d:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            s.x r11 = (s.x) r11
            s.t[] r11 = r11.f12127a
            int r12 = r11.length
            r13 = r4
        L43:
            if (r13 >= r12) goto L4f
            r14 = r11[r13]
            if (r14 == 0) goto L4c
            r14.c()
        L4c:
            int r13 = r13 + 1
            goto L43
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L2d
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L13
        L5a:
            r0.a()
        L5d:
            return
    }

    public final void e(java.lang.Object r4) {
            r3 = this;
            f.k0 r0 = r3.f12146a
            java.lang.Object r4 = r0.k(r4)
            s.x r4 = (s.x) r4
            if (r4 == 0) goto L1a
            s.t[] r4 = r4.f12127a
            int r0 = r4.length
            r1 = 0
        Le:
            if (r1 >= r0) goto L1a
            r2 = r4[r1]
            if (r2 == 0) goto L17
            r2.c()
        L17:
            int r1 = r1 + 1
            goto Le
        L1a:
            return
    }

    public final void f(r.q r18, boolean r19) {
            r17 = this;
            r0 = r18
            r1 = r17
            f.k0 r2 = r1.f12146a
            java.lang.Object r3 = r0.f11246k
            java.lang.Object r2 = r2.g(r3)
            r2.getClass()
            s.x r2 = (s.x) r2
            s.t[] r2 = r2.f12127a
            int r3 = r2.length
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L76
            r7 = r2[r4]
            int r13 = r5 + 1
            if (r7 == 0) goto L6e
            long r14 = r0.b(r5)
            long r5 = r7.f12104j
            long r8 = s.t.f12093q
            boolean r8 = u2.j.b(r5, r8)
            if (r8 != 0) goto L69
            boolean r8 = u2.j.b(r5, r14)
            if (r8 != 0) goto L69
            long r5 = u2.j.c(r14, r5)
            i.y r8 = r7.f12098d
            if (r8 != 0) goto L3b
            goto L69
        L3b:
            i0.j1 r9 = r7.f12109o
            java.lang.Object r9 = r9.getValue()
            u2.j r9 = (u2.j) r9
            long r9 = r9.f13347a
            long r9 = u2.j.c(r9, r5)
            r7.e(r9)
            r5 = 1
            r7.d(r5)
            r5 = r19
            r7.f12099e = r5
            qg.t r6 = r7.f12095a
            r11 = r6
            c0.i r6 = new c0.i
            r12 = r11
            r11 = 0
            r16 = r12
            r12 = 5
            r0 = r16
            r6.<init>(r7, r8, r9, r11, r12)
            r8 = 3
            r9 = 0
            qg.v.q(r0, r9, r6, r8)
            goto L6b
        L69:
            r5 = r19
        L6b:
            r7.f12104j = r14
            goto L70
        L6e:
            r5 = r19
        L70:
            int r4 = r4 + 1
            r0 = r18
            r5 = r13
            goto L16
        L76:
            return
    }
}
