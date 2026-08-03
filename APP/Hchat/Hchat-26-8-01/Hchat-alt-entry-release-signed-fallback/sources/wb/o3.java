package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.m2 f17995a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final uh.b f17996b = null;

    static {
            k.s1 r0 = new k.s1
            r1 = 22
            r0.<init>(r1)
            i0.m2 r1 = new i0.m2
            r1.<init>(r0)
            wb.o3.f17995a = r1
            uh.b r0 = new uh.b
            r1 = 1
            float r1 = (float) r1
            uh.a r2 = new uh.a
            long r3 = f1.w.f3127c
            r5 = 1039516303(0x3df5c28f, float:0.12)
            long r5 = f1.w.b(r3, r5)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            float r7 = (float) r7
            r8 = r3
            r3 = r5
            uh.d r6 = new uh.d
            uh.c r5 = new uh.c
            r10 = -1097229926(0xffffffffbe99999a, float:-0.3)
            r11 = -1119040307(0xffffffffbd4ccccd, float:-0.05)
            r12 = 1056964608(0x3f000000, float:0.5)
            r5.<init>(r12, r10, r11)
            r10 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r5, r8, r10)
            r5 = r7
            uh.d r7 = new uh.d
            uh.c r11 = new uh.c
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            r14 = -1090519040(0xffffffffbf000000, float:-0.5)
            r11.<init>(r12, r13, r14)
            r12 = 1053609165(0x3ecccccd, float:0.4)
            r7.<init>(r11, r8, r12)
            r8 = 2
            r2.<init>(r3, r5, r6, r7, r8)
            r0.<init>(r1, r10, r2)
            wb.o3.f17996b = r0
            return
    }

    public static final void a(y0.o r54, fg.a r55, fg.l r56, th.a r57, int r58, boolean r59, boolean r60, s0.d r61, i0.h0 r62, int r63) {
            r1 = r57
            r4 = r58
            r11 = r59
            r12 = r60
            r8 = r61
            r13 = r62
            r14 = r63
            r55.getClass()
            r56.getClass()
            r1.getClass()
            r0 = -503117675(0xffffffffe2030895, float:-6.042855E20)
            r13.b0(r0)
            r0 = r14 | 6
            r2 = r14 & 48
            r15 = r55
            if (r2 != 0) goto L31
            boolean r2 = r13.h(r15)
            if (r2 == 0) goto L2e
            r2 = 32
            goto L30
        L2e:
            r2 = 16
        L30:
            r0 = r0 | r2
        L31:
            r2 = r14 & 384(0x180, float:5.38E-43)
            r3 = r56
            if (r2 != 0) goto L43
            boolean r2 = r13.h(r3)
            if (r2 == 0) goto L40
            r2 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r2 = 128(0x80, float:1.8E-43)
        L42:
            r0 = r0 | r2
        L43:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L5c
            r2 = r14 & 4096(0x1000, float:5.74E-42)
            if (r2 != 0) goto L50
            boolean r2 = r13.f(r1)
            goto L54
        L50:
            boolean r2 = r13.h(r1)
        L54:
            if (r2 == 0) goto L59
            r2 = 2048(0x800, float:2.87E-42)
            goto L5b
        L59:
            r2 = 1024(0x400, float:1.435E-42)
        L5b:
            r0 = r0 | r2
        L5c:
            r2 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L6c
            boolean r2 = r13.d(r4)
            if (r2 == 0) goto L69
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L6b
        L69:
            r2 = 8192(0x2000, float:1.148E-41)
        L6b:
            r0 = r0 | r2
        L6c:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r14
            if (r2 != 0) goto L7d
            boolean r2 = r13.g(r11)
            if (r2 == 0) goto L7a
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L7c
        L7a:
            r2 = 65536(0x10000, float:9.1835E-41)
        L7c:
            r0 = r0 | r2
        L7d:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r14
            if (r2 != 0) goto L8e
            boolean r2 = r13.g(r12)
            if (r2 == 0) goto L8b
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L8d
        L8b:
            r2 = 524288(0x80000, float:7.34684E-40)
        L8d:
            r0 = r0 | r2
        L8e:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r2 & r14
            if (r2 != 0) goto L9f
            boolean r2 = r13.h(r8)
            if (r2 == 0) goto L9c
            r2 = 8388608(0x800000, float:1.1754944E-38)
            goto L9e
        L9c:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L9e:
            r0 = r0 | r2
        L9f:
            r10 = r0
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r10
            r2 = 4793490(0x492492, float:6.71711E-39)
            r5 = 0
            if (r0 == r2) goto Lac
            r0 = 1
            goto Lad
        Lac:
            r0 = r5
        Lad:
            r2 = r10 & 1
            boolean r0 = r13.S(r2, r0)
            if (r0 == 0) goto L78e
            if (r11 == 0) goto Lc0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto Lc0
            r16 = 1
            goto Lc2
        Lc0:
            r16 = r5
        Lc2:
            boolean r0 = k.n.p(r13)
            java.lang.Object r2 = r13.P()
            i0.e r7 = i0.l.f5952a
            if (r2 != r7) goto Ld3
            v.d r2 = v.e.f13864a
            r13.k0(r2)
        Ld3:
            v.d r2 = (v.d) r2
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r18 = r13.j(r6)
            bi.b r18 = (bi.b) r18
            long r18 = r18.j()
            java.lang.Object r6 = r13.j(r6)
            bi.b r6 = (bi.b) r6
            r21 = r10
            long r9 = r6.m()
            if (r16 == 0) goto Lf6
            r6 = 1053609165(0x3ecccccd, float:0.4)
            long r9 = f1.w.b(r9, r6)
        Lf6:
            r6 = 3
            r54 = r0
            r0 = 0
            th.j r6 = th.c.e(r0, r13, r5, r6)
            i0.m2 r5 = y1.h1.f21946h
            java.lang.Object r5 = r13.j(r5)
            u2.c r5 = (u2.c) r5
            i0.m2 r0 = y1.h1.f21952n
            java.lang.Object r0 = r13.j(r0)
            r30 = r2
            u2.m r2 = u2.m.f13354g
            if (r0 != r2) goto L114
            r0 = 1
            goto L115
        L114:
            r0 = 0
        L115:
            java.lang.Object r2 = r13.P()
            if (r2 != r7) goto L122
            qg.t r2 = i0.r.n(r13)
            r13.k0(r2)
        L122:
            qg.t r2 = (qg.t) r2
            java.lang.Object r3 = r13.P()
            r11 = 0
            if (r3 != r7) goto L133
            i0.f1 r3 = new i0.f1
            r3.<init>(r11)
            r13.k0(r3)
        L133:
            r25 = r3
            i0.f1 r25 = (i0.f1) r25
            java.lang.Object r3 = r13.P()
            if (r3 != r7) goto L145
            i0.f1 r3 = new i0.f1
            r3.<init>(r11)
            r13.k0(r3)
        L145:
            i0.f1 r3 = (i0.f1) r3
            java.lang.Object r11 = r13.P()
            if (r11 != r7) goto L158
            r11 = 1008981770(0x3c23d70a, float:0.01)
            r4 = 0
            i.c r11 = i.d.a(r4, r11)
            r13.k0(r11)
        L158:
            i.c r11 = (i.c) r11
            r4 = 4
            float r12 = (float) r4
            float r4 = r5.x0(r12)
            boolean r22 = r13.c(r4)
            r32 = r6
            java.lang.Object r6 = r13.P()
            if (r22 != 0) goto L16e
            if (r6 != r7) goto L17a
        L16e:
            wb.e3 r6 = new wb.e3
            r6.<init>(r11, r4, r3)
            i0.x r6 = i0.r.p(r6)
            r13.k0(r6)
        L17a:
            r39 = r6
            i0.l2 r39 = (i0.l2) r39
            java.lang.Object r4 = r13.P()
            if (r4 != r7) goto L197
            java.lang.Object r4 = r15.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            i0.g1 r6 = new i0.g1
            r6.<init>(r4)
            r13.k0(r6)
            r4 = r6
        L197:
            r6 = r4
            i0.g1 r6 = (i0.g1) r6
            java.lang.Object r4 = r13.P()
            if (r4 != r7) goto L1a8
            wb.m3 r4 = new wb.m3
            r4.<init>()
            r13.k0(r4)
        L1a8:
            r23 = r4
            wb.m3 r23 = (wb.m3) r23
            boolean r4 = r13.f(r2)
            r22 = 57344(0xe000, float:8.0356E-41)
            r33 = r11
            r11 = r21 & r22
            r34 = r2
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r2) goto L1bf
            r2 = 1
            goto L1c0
        L1bf:
            r2 = 0
        L1c0:
            r2 = r2 | r4
            boolean r4 = r13.f(r5)
            r2 = r2 | r4
            boolean r4 = r13.g(r0)
            r2 = r2 | r4
            java.lang.Object r4 = r13.P()
            if (r2 != 0) goto L1d3
            if (r4 != r7) goto L1d5
        L1d3:
            r2 = 4
            goto L1e5
        L1d5:
            r27 = r0
            r28 = r3
            r41 = r5
            r15 = r6
            r0 = r7
            r40 = r30
            r17 = r32
            r5 = r34
            goto L256
        L1e5:
            xb.i r31 = new xb.i
            java.lang.Object r4 = r15.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            int r2 = r58 + (-1)
            float r2 = (float) r2
            r27 = r0
            lg.a r0 = new lg.a
            r22 = r3
            r3 = 0
            r0.<init>(r3, r2)
            r3 = r22
            c9.u r22 = new c9.u
            r28 = 4
            r24 = r5
            r26 = r25
            r25 = r27
            r27 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r28 = r27
            r27 = r25
            r25 = r26
            wb.m0 r2 = new wb.m0
            r3 = 6
            r2.<init>(r3)
            hb.w r37 = new hb.w
            r3 = r58
            r36 = r2
            r14 = r23
            r41 = r24
            r40 = r30
            r17 = r32
            r5 = r34
            r2 = r37
            r34 = r0
            r0 = r7
            r7 = r33
            r33 = r4
            r4 = r56
            r2.<init>(r3, r4, r5, r6, r7)
            wb.k3 r38 = new wb.k3
            r4 = r58
            r15 = r6
            r6 = r25
            r3 = r27
            r2 = r38
            r2.<init>(r3, r4, r5, r6, r7)
            r32 = r5
            r35 = r22
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            r4 = r31
            r14.f17593a = r4
            r13.k0(r4)
        L256:
            xb.i r4 = (xb.i) r4
            java.lang.Object r2 = r55.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r3 = r58 + (-1)
            if (r2 >= 0) goto L267
            r2 = 0
        L267:
            if (r2 <= r3) goto L26a
            goto L26b
        L26a:
            r3 = r2
        L26b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r6 = r13.d(r3)
            boolean r7 = r13.h(r4)
            r6 = r6 | r7
            java.lang.Object r7 = r13.P()
            if (r6 != 0) goto L283
            if (r7 != r0) goto L281
            goto L283
        L281:
            r6 = 0
            goto L28c
        L283:
            ci.j r7 = new ci.j
            r6 = 0
            r7.<init>(r3, r4, r15, r6)
            r13.k0(r7)
        L28c:
            fg.p r7 = (fg.p) r7
            i0.r.g(r2, r4, r7, r13)
            if (r16 == 0) goto L2da
            r2 = 1061351693(0x3f42f10d, float:0.76149064)
            r13.a0(r2)
            float r2 = r25.g()
            boolean r3 = r13.f(r5)
            boolean r2 = r13.c(r2)
            r2 = r2 | r3
            java.lang.Object r3 = r13.P()
            if (r2 != 0) goto L2b6
            if (r3 != r0) goto L2af
            goto L2b6
        L2af:
            r23 = r4
            r14 = r27
            r15 = r39
            goto L2d1
        L2b6:
            xb.o r3 = new xb.o
            sh.j r22 = new sh.j
            r23 = 1
            r24 = r4
            r26 = r39
            r22.<init>(r23, r24, r25, r26, r27)
            r2 = r22
            r23 = r24
            r15 = r26
            r14 = r27
            r3.<init>(r5, r2)
            r13.k0(r3)
        L2d1:
            r2 = r3
            xb.o r2 = (xb.o) r2
            r3 = 0
            r13.p(r3)
            r6 = r2
            goto L2ea
        L2da:
            r23 = r4
            r14 = r27
            r15 = r39
            r3 = 0
            r2 = 1061850297(0x3f4a8cb9, float:0.79120976)
            r13.a0(r2)
            r13.p(r3)
        L2ea:
            r2 = -1036779520(0xffffffffc2340000, float:-45.0)
            uh.b r3 = wb.o3.f17996b
            r4 = 6
            uh.b r2 = e(r3, r2, r13, r4)
            r5 = 1119092736(0x42b40000, float:90.0)
            r7 = 54
            uh.b r3 = e(r3, r5, r13, r7)
            int r5 = r21 >> 9
            r17.getClass()
            r7 = r5 & 14
            r7 = r7 ^ r4
            r22 = r4
            r4 = 4
            if (r7 <= r4) goto L30e
            boolean r7 = r13.f(r1)
            if (r7 != 0) goto L312
        L30e:
            r5 = r5 & 6
            if (r5 != r4) goto L316
        L312:
            r5 = 1
        L313:
            r4 = r17
            goto L318
        L316:
            r5 = 0
            goto L313
        L318:
            boolean r7 = r13.f(r4)
            r5 = r5 | r7
            java.lang.Object r7 = r13.P()
            if (r5 != 0) goto L325
            if (r7 != r0) goto L32d
        L325:
            yb.a r7 = new yb.a
            r7.<init>(r1, r4)
            r13.k0(r7)
        L32d:
            r30 = r7
            yb.a r30 = (yb.a) r30
            y0.l r5 = y0.l.f21818a
            if (r60 == 0) goto L33c
            p.n0 r7 = p.n0.f9955g
            y0.o r7 = p.d.s(r5, r7)
            goto L342
        L33c:
            r7 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r5, r7)
        L342:
            y0.g r1 = y0.b.f21795j
            r17 = r2
            r2 = 0
            v1.n0 r1 = p.o.d(r1, r2)
            r24 = r3
            long r2 = r13.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r13.l()
            y0.o r7 = y0.a.c(r13, r7)
            x1.f r26 = x1.g.f20914f
            r26.getClass()
            r27 = r14
            x1.y r14 = x1.f.f20883b
            r13.d0()
            r26 = r2
            boolean r2 = r13.S
            if (r2 == 0) goto L371
            r13.k(r14)
            goto L374
        L371:
            r13.n0()
        L374:
            x1.e r2 = x1.f.f20886e
            i0.r.A(r2, r13, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r13, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r13, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r13)
            r26 = r8
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r13, r7)
            r7 = r41
            boolean r29 = r13.f(r7)
            r31 = r1
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r1) goto L3a1
            r1 = 1
            goto L3a2
        L3a1:
            r1 = 0
        L3a2:
            r1 = r29 | r1
            java.lang.Object r11 = r13.P()
            if (r1 != 0) goto L3ac
            if (r11 != r0) goto L3ae
        L3ac:
            r1 = r2
            goto L3c4
        L3ae:
            r1 = r23
            r23 = r2
            r2 = r11
            r11 = r1
            r43 = r3
            r32 = r4
            r20 = r8
            r1 = r17
            r42 = r24
            r8 = r5
            r17 = r6
            r24 = r7
            goto L3ea
        L3c4:
            ca.k r2 = new ca.k
            r41 = r7
            r7 = 6
            r43 = r3
            r32 = r4
            r20 = r8
            r11 = r23
            r42 = r24
            r3 = r41
            r4 = r58
            r23 = r1
            r8 = r5
            r1 = r17
            r5 = r28
            r17 = r6
            r6 = r25
            r2.<init>(r3, r4, r5, r6, r7)
            r24 = r3
            r13.k0(r2)
        L3ea:
            fg.l r2 = (fg.l) r2
            y0.o r2 = v1.w.m(r8, r2)
            boolean r3 = r13.f(r15)
            java.lang.Object r4 = r13.P()
            if (r3 != 0) goto L3fc
            if (r4 != r0) goto L405
        L3fc:
            sh.y0 r4 = new sh.y0
            r3 = 7
            r4.<init>(r15, r3)
            r13.k0(r4)
        L405:
            fg.l r4 = (fg.l) r4
            y0.o r2 = f1.c0.m(r2, r4)
            l1.d r3 = new l1.d
            r4 = 10
            float r4 = (float) r4
            long r5 = f1.w.f3126b
            if (r54 == 0) goto L418
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            goto L41b
        L418:
            r7 = 1036831949(0x3dcccccd, float:0.1)
        L41b:
            r3.<init>(r4, r7, r5)
            c1.q r4 = new c1.q
            r5 = r40
            r4.<init>(r5, r3)
            y0.o r44 = r2.d(r4)
            java.lang.Object r2 = r13.P()
            if (r2 != r0) goto L437
            n.k r2 = new n.k
            r2.<init>()
            r13.k0(r2)
        L437:
            r45 = r2
            n.k r45 = (n.k) r45
            java.lang.Object r2 = r13.P()
            if (r2 != r0) goto L44b
            k.s1 r2 = new k.s1
            r3 = 21
            r2.<init>(r3)
            r13.k0(r2)
        L44b:
            r49 = r2
            fg.a r49 = (fg.a) r49
            r50 = 28
            r46 = 0
            r47 = 0
            r48 = 0
            y0.o r2 = k.n.i(r44, r45, r46, r47, r48, r49, r50)
            if (r16 == 0) goto L4f4
            r3 = 1527317071(0x5b09024f, float:3.856461E16)
            r13.a0(r3)
            java.lang.Object r3 = r13.P()
            if (r3 != r0) goto L473
            v0.a r3 = new v0.a
            r4 = 8
            r3.<init>(r5, r4)
            r13.k0(r3)
        L473:
            fg.a r3 = (fg.a) r3
            java.lang.Object r4 = r13.P()
            if (r4 != r0) goto L484
            w0.l r4 = new w0.l
            r6 = 2
            r4.<init>(r6)
            r13.k0(r4)
        L484:
            fg.l r4 = (fg.l) r4
            boolean r6 = r13.f(r1)
            java.lang.Object r7 = r13.P()
            if (r6 != 0) goto L492
            if (r7 != r0) goto L49b
        L492:
            wb.l3 r7 = new wb.l3
            r6 = 0
            r7.<init>(r1, r6)
            r13.k0(r7)
        L49b:
            fg.l r7 = (fg.l) r7
            boolean r1 = r13.h(r11)
            java.lang.Object r6 = r13.P()
            if (r1 != 0) goto L4a9
            if (r6 != r0) goto L4b2
        L4a9:
            wb.f3 r6 = new wb.f3
            r1 = 1
            r6.<init>(r11, r1)
            r13.k0(r6)
        L4b2:
            fg.l r6 = (fg.l) r6
            boolean r1 = r13.e(r9)
            r28 = r1
            java.lang.Object r1 = r13.P()
            if (r28 != 0) goto L4c6
            if (r1 != r0) goto L4c3
            goto L4c6
        L4c3:
            r28 = r0
            goto L4d2
        L4c6:
            ca.c r1 = new ca.c
            r28 = r0
            r0 = 19
            r1.<init>(r9, r0)
            r13.k0(r1)
        L4d2:
            fg.l r1 = (fg.l) r1
            r0 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r7 = 1888(0x760, float:2.646E-42)
            r51 = r17
            r17 = r15
            r15 = r51
            r51 = r28
            r28 = r11
            r11 = r0
            r0 = r8
            r8 = r5
            r5 = r6
            r6 = r1
            r1 = r57
            y0.o r2 = th.c.b(r0, r1, r2, r3, r4, r5, r6, r7)
            r3 = 0
            r13.p(r3)
            goto L50e
        L4f4:
            r3 = r17
            r17 = r15
            r15 = r3
            r51 = r0
            r0 = r8
            r28 = r11
            r3 = 0
            r11 = r2
            r8 = r5
            r1 = 1528363817(0x5b18fb29, float:4.306035E16)
            r13.a0(r1)
            r13.p(r3)
            y0.o r2 = k.n.g(r0, r9, r8)
        L50e:
            y0.o r1 = r11.d(r2)
            if (r15 == 0) goto L519
            y0.o r5 = r15.f21531i
            if (r5 == 0) goto L519
            goto L51a
        L519:
            r5 = r0
        L51a:
            y0.o r1 = r1.d(r5)
            r2 = 64
            float r2 = (float) r2
            y0.o r1 = p.h1.e(r1, r2)
            y0.o r1 = p.d.l(r1, r12)
            y0.f r2 = y0.b.f21802q
            int r3 = r21 >> 12
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | 384(0x180, float:5.38E-43)
            p.c r4 = p.j.f9924a
            r5 = 48
            p.e1 r2 = p.d1.a(r4, r2, r13, r5)
            long r4 = r13.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r13.l()
            y0.o r1 = y0.a.c(r13, r1)
            r13.d0()
            boolean r6 = r13.S
            if (r6 == 0) goto L554
            r13.k(r14)
        L551:
            r6 = r23
            goto L558
        L554:
            r13.n0()
            goto L551
        L558:
            i0.r.A(r6, r13, r2)
            r2 = r31
            i0.r.A(r2, r13, r5)
            r2 = r26
            r5 = r43
            j8.b.p(r4, r13, r2, r13, r5)
            r2 = r20
            i0.r.A(r2, r13, r1)
            int r1 = r3 >> 6
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p.f1 r2 = p.f1.f9898a
            r3 = r61
            r3.b(r2, r13, r1)
            r11 = 1
            r13.p(r11)
            r14 = 56
            if (r16 == 0) goto L5d9
            r1 = 1528780829(0x5b1f581d, float:4.4851403E16)
            r13.a0(r1)
            r1 = r28
            boolean r2 = r13.h(r1)
            java.lang.Object r4 = r13.P()
            if (r2 != 0) goto L59c
            r2 = r51
            if (r4 != r2) goto L5a7
            goto L59e
        L59c:
            r2 = r51
        L59e:
            wb.h3 r4 = new wb.h3
            r5 = 1
            r4.<init>(r1, r5)
            r13.k0(r4)
        L5a7:
            fg.a r4 = (fg.a) r4
            i0.m2 r5 = wb.o3.f17995a
            i0.q1 r4 = r5.a(r4)
            r5 = r0
            sh.b0 r0 = new sh.b0
            r11 = r1
            r53 = r2
            r52 = r5
            r6 = r15
            r2 = r17
            r1 = r32
            r15 = r4
            r4 = r9
            r9 = r3
            r10 = r8
            r7 = r18
            r3 = r57
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10)
            r3 = r0
            r0 = r7
            r8 = r10
            r4 = -1415645642(0xffffffffab9ef636, float:-1.1294912E-12)
            s0.d r3 = s0.i.e(r4, r3, r13)
            i0.r.a(r15, r3, r13, r14)
            r3 = 0
            r13.p(r3)
            goto L5ee
        L5d9:
            r52 = r0
            r6 = r15
            r2 = r17
            r0 = r18
            r11 = r28
            r53 = r51
            r3 = 0
            r4 = 1530205031(0x5b351367, float:5.0968304E16)
            r13.a0(r4)
            r13.p(r3)
        L5ee:
            float r3 = r25.g()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L77c
            r3 = 1530346577(0x5b373c51, float:5.157624E16)
            r13.a0(r3)
            float r3 = r25.g()
            r7 = r24
            float r3 = r7.l0(r3)
            r5 = 2
            if (r16 == 0) goto L713
            r0 = 1530426185(0x5b387349, float:5.1918153E16)
            r13.a0(r0)
            r7 = r52
            y0.o r0 = p.d.n(r7, r12, r4, r5)
            boolean r1 = r13.h(r11)
            r4 = r27
            boolean r5 = r13.g(r4)
            r1 = r1 | r5
            boolean r5 = r13.f(r2)
            r1 = r1 | r5
            java.lang.Object r5 = r13.P()
            r9 = r53
            if (r1 != 0) goto L630
            if (r5 != r9) goto L642
        L630:
            wb.i3 r22 = new wb.i3
            r27 = 1
            r26 = r2
            r24 = r4
            r23 = r11
            r22.<init>(r23, r24, r25, r26, r27)
            r5 = r22
            r13.k0(r5)
        L642:
            fg.l r5 = (fg.l) r5
            y0.o r0 = f1.c0.m(r0, r5)
            if (r6 == 0) goto L64f
            y0.o r5 = r6.f21532j
            if (r5 == 0) goto L64f
            goto L650
        L64f:
            r5 = r7
        L650:
            y0.o r0 = r0.d(r5)
            y0.o r1 = r11.f21499r
            y0.o r29 = r0.d(r1)
            java.lang.Object r0 = r13.P()
            if (r0 != r9) goto L66a
            v0.a r0 = new v0.a
            r1 = 8
            r0.<init>(r8, r1)
            r13.k0(r0)
        L66a:
            r31 = r0
            fg.a r31 = (fg.a) r31
            boolean r0 = r13.h(r11)
            java.lang.Object r1 = r13.P()
            if (r0 != 0) goto L67a
            if (r1 != r9) goto L683
        L67a:
            wb.f3 r1 = new wb.f3
            r0 = 2
            r1.<init>(r11, r0)
            r13.k0(r1)
        L683:
            r32 = r1
            fg.l r32 = (fg.l) r32
            r0 = r42
            boolean r1 = r13.f(r0)
            boolean r2 = r13.h(r11)
            r1 = r1 | r2
            java.lang.Object r2 = r13.P()
            if (r1 != 0) goto L69a
            if (r2 != r9) goto L6a4
        L69a:
            m.b r2 = new m.b
            r1 = 27
            r2.<init>(r0, r1, r11)
            r13.k0(r2)
        L6a4:
            r33 = r2
            fg.l r33 = (fg.l) r33
            boolean r0 = r13.h(r11)
            java.lang.Object r1 = r13.P()
            if (r0 != 0) goto L6b4
            if (r1 != r9) goto L6bd
        L6b4:
            wb.f3 r1 = new wb.f3
            r0 = 0
            r1.<init>(r11, r0)
            r13.k0(r1)
        L6bd:
            r34 = r1
            fg.l r34 = (fg.l) r34
            boolean r0 = r13.h(r11)
            r1 = r54
            boolean r2 = r13.g(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r13.P()
            if (r0 != 0) goto L6d4
            if (r2 != r9) goto L6dd
        L6d4:
            wb.g3 r2 = new wb.g3
            r0 = 0
            r2.<init>(r11, r1, r0)
            r13.k0(r2)
        L6dd:
            r35 = r2
            fg.l r35 = (fg.l) r35
            r36 = 1888(0x760, float:2.646E-42)
            y0.o r0 = th.c.b(r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = r13.h(r11)
            java.lang.Object r2 = r13.P()
            if (r1 != 0) goto L6f3
            if (r2 != r9) goto L6fc
        L6f3:
            wb.h3 r2 = new wb.h3
            r1 = 0
            r2.<init>(r11, r1)
            r13.k0(r2)
        L6fc:
            fg.a r2 = (fg.a) r2
            y0.o r0 = yb.d.a(r0, r8, r2)
            float r1 = (float) r14
            y0.o r0 = p.h1.e(r0, r1)
            y0.o r0 = p.h1.n(r0, r3)
            r3 = 0
            p.o.a(r0, r13, r3)
            r13.p(r3)
            goto L777
        L713:
            r4 = r27
            r7 = r52
            r9 = r53
            r6 = 1533126440(0x5b61a728, float:6.351566E16)
            r13.a0(r6)
            r6 = 0
            y0.o r5 = p.d.n(r7, r12, r6, r5)
            boolean r6 = r13.h(r11)
            boolean r10 = r13.g(r4)
            r6 = r6 | r10
            boolean r10 = r13.f(r2)
            r6 = r6 | r10
            java.lang.Object r10 = r13.P()
            if (r6 != 0) goto L73a
            if (r10 != r9) goto L74c
        L73a:
            wb.i3 r22 = new wb.i3
            r27 = 0
            r26 = r2
            r24 = r4
            r23 = r11
            r22.<init>(r23, r24, r25, r26, r27)
            r10 = r22
            r13.k0(r10)
        L74c:
            fg.l r10 = (fg.l) r10
            y0.o r2 = f1.c0.m(r5, r10)
            y0.o r4 = r11.f21499r
            y0.o r2 = r2.d(r4)
            y0.o r2 = c1.h.b(r2, r8)
            r4 = 1041865114(0x3e19999a, float:0.15)
            long r0 = f1.w.b(r0, r4)
            y0.o r0 = k.n.g(r2, r0, r8)
            float r1 = (float) r14
            y0.o r0 = p.h1.e(r0, r1)
            y0.o r0 = p.h1.n(r0, r3)
            r3 = 0
            p.o.a(r0, r13, r3)
            r13.p(r3)
        L777:
            r13.p(r3)
        L77a:
            r11 = 1
            goto L789
        L77c:
            r7 = r52
            r3 = 0
            r0 = 1533781191(0x5b6ba4c7, float:6.6327794E16)
            r13.a0(r0)
            r13.p(r3)
            goto L77a
        L789:
            r13.p(r11)
            r1 = r7
            goto L793
        L78e:
            r13.V()
            r1 = r54
        L793:
            i0.r1 r10 = r13.t()
            if (r10 == 0) goto L7b0
            wb.j3 r0 = new wb.j3
            r2 = r55
            r3 = r56
            r4 = r57
            r5 = r58
            r6 = r59
            r7 = r60
            r8 = r61
            r9 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L7b0:
            return
    }

    public static final float b(i0.l2 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            return r0
    }

    public static final void c(p.f1 r16, fg.a r17, y0.o r18, s0.d r19, i0.h0 r20, int r21) {
            r1 = r16
            r3 = r18
            r4 = r19
            r0 = r20
            r5 = r21
            r1.getClass()
            r17.getClass()
            r2 = -1760593024(0xffffffff970f7b80, float:-4.636167E-25)
            r0.b0(r2)
            r2 = r5 & 6
            r6 = 4
            if (r2 != 0) goto L26
            boolean r2 = r0.f(r1)
            if (r2 == 0) goto L23
            r2 = r6
            goto L24
        L23:
            r2 = 2
        L24:
            r2 = r2 | r5
            goto L27
        L26:
            r2 = r5
        L27:
            r7 = r5 & 48
            r13 = r17
            if (r7 != 0) goto L39
            boolean r7 = r0.h(r13)
            if (r7 == 0) goto L36
            r7 = 32
            goto L38
        L36:
            r7 = 16
        L38:
            r2 = r2 | r7
        L39:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L49
            boolean r7 = r0.f(r3)
            if (r7 == 0) goto L46
            r7 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r7 = 128(0x80, float:1.8E-43)
        L48:
            r2 = r2 | r7
        L49:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L59
            boolean r7 = r0.h(r4)
            if (r7 == 0) goto L56
            r7 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r7 = 1024(0x400, float:1.435E-42)
        L58:
            r2 = r2 | r7
        L59:
            r7 = r2 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            r15 = 0
            r9 = 1
            if (r7 == r8) goto L63
            r7 = r9
            goto L64
        L63:
            r7 = r15
        L64:
            r8 = r2 & 1
            boolean r7 = r0.S(r8, r7)
            if (r7 == 0) goto L11c
            i0.m2 r7 = wb.o3.f17995a
            java.lang.Object r7 = r0.j(r7)
            fg.a r7 = (fg.a) r7
            v.d r8 = v.e.f13864a
            y0.o r8 = c1.h.b(r3, r8)
            f2.i r12 = new f2.i
            r12.<init>(r6)
            r14 = 12
            r6 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            y0.o r8 = k.n.i(r8, r9, r10, r11, r12, r13, r14)
            p.a0 r9 = p.h1.f9914b
            y0.o r8 = r8.d(r9)
            y0.o r8 = r1.a(r8, r6)
            boolean r9 = r0.f(r7)
            java.lang.Object r10 = r0.P()
            if (r9 != 0) goto La1
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto La9
        La1:
            h0.g1 r10 = new h0.g1
            r10.<init>(r7, r6)
            r0.k0(r10)
        La9:
            fg.l r10 = (fg.l) r10
            y0.o r7 = f1.c0.m(r8, r10)
            p.c r8 = p.j.f9924a
            float r8 = (float) r6
            p.h r9 = new p.h
            okio.a r10 = new okio.a
            r11 = 3
            r10.<init>(r11)
            r9.<init>(r8, r15, r10)
            y0.e r8 = y0.b.f21805t
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            r10 = 54
            p.t r8 = p.s.a(r9, r8, r0, r10)
            long r9 = r0.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r0.l()
            y0.o r7 = y0.a.c(r0, r7)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r0.d0()
            boolean r12 = r0.S
            if (r12 == 0) goto Le9
            r0.k(r11)
            goto Lec
        Le9:
            r0.n0()
        Lec:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r0, r8)
            x1.e r8 = x1.f.f20885d
            i0.r.A(r8, r0, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r0, r8)
            x1.d r8 = x1.f.f20888g
            i0.r.w(r8, r0)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r0, r7)
            int r2 = r2 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            p.u r7 = p.u.f10014a
            r4.b(r7, r0, r2)
            r0.p(r6)
            goto L11f
        L11c:
            r0.V()
        L11f:
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L12e
            s0.c r0 = new s0.c
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L12e:
            return
    }

    public static final void d(th.j r16, boolean r17, y0.o r18, s0.d r19, i0.h0 r20, int r21) {
            r6 = r17
            r4 = r18
            r0 = r20
            r1 = 1533203847(0x5b62d587, float:6.384812E16)
            r0.b0(r1)
            r3 = r16
            boolean r1 = r0.f(r3)
            if (r1 == 0) goto L16
            r1 = 4
            goto L17
        L16:
            r1 = 2
        L17:
            r1 = r21 | r1
            boolean r5 = r0.g(r6)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r1 = r1 | r5
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L2e
            r5 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r5 = 128(0x80, float:1.8E-43)
        L30:
            r1 = r1 | r5
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r15 = 1
            r8 = 0
            if (r5 == r7) goto L3b
            r5 = r15
            goto L3c
        L3b:
            r5 = r8
        L3c:
            r1 = r1 & r15
            boolean r1 = r0.S(r1, r5)
            if (r1 == 0) goto L17f
            if (r6 == 0) goto L4d
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r1 < r5) goto L4d
            r1 = r15
            goto L4e
        L4d:
            r1 = r8
        L4e:
            boolean r5 = k.n.p(r0)
            java.lang.Object r7 = r0.P()
            i0.e r9 = i0.l.f5952a
            if (r7 != r9) goto L5f
            v.d r7 = v.e.f13864a
            r0.k0(r7)
        L5f:
            v.d r7 = (v.d) r7
            i0.m2 r10 = bi.d.f892a
            java.lang.Object r10 = r0.j(r10)
            bi.b r10 = (bi.b) r10
            long r10 = r10.m()
            if (r1 == 0) goto L76
            r12 = 1053609165(0x3ecccccd, float:0.4)
            long r10 = f1.w.b(r10, r12)
        L76:
            uh.b r12 = wb.o3.f17996b
            r13 = -1036779520(0xffffffffc2340000, float:-45.0)
            r14 = 6
            uh.b r12 = e(r12, r13, r0, r14)
            l1.d r13 = new l1.d
            r14 = 10
            float r14 = (float) r14
            long r2 = f1.w.f3126b
            if (r5 == 0) goto L8c
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            goto L8f
        L8c:
            r5 = 1036831949(0x3dcccccd, float:0.1)
        L8f:
            r13.<init>(r14, r5, r2)
            c1.q r2 = new c1.q
            r2.<init>(r7, r13)
            y0.o r2 = r4.d(r2)
            y0.l r3 = y0.l.f21818a
            if (r1 == 0) goto L10a
            r1 = -1300415813(0xffffffffb27d3abb, float:-1.4739892E-8)
            r0.a0(r1)
            java.lang.Object r1 = r0.P()
            if (r1 != r9) goto Lb5
            v0.a r1 = new v0.a
            r5 = 8
            r1.<init>(r7, r5)
            r0.k0(r1)
        Lb5:
            fg.a r1 = (fg.a) r1
            java.lang.Object r5 = r0.P()
            if (r5 != r9) goto Lc6
            w0.l r5 = new w0.l
            r13 = 5
            r5.<init>(r13)
            r0.k0(r5)
        Lc6:
            fg.l r5 = (fg.l) r5
            boolean r13 = r0.f(r12)
            java.lang.Object r14 = r0.P()
            if (r13 != 0) goto Ld4
            if (r14 != r9) goto Ldd
        Ld4:
            wb.l3 r14 = new wb.l3
            r13 = 1
            r14.<init>(r12, r13)
            r0.k0(r14)
        Ldd:
            fg.l r14 = (fg.l) r14
            boolean r12 = r0.e(r10)
            java.lang.Object r13 = r0.P()
            if (r12 != 0) goto Leb
            if (r13 != r9) goto Lf5
        Leb:
            ca.c r13 = new ca.c
            r9 = 18
            r13.<init>(r10, r9)
            r0.k0(r13)
        Lf5:
            fg.l r13 = (fg.l) r13
            r11 = r14
            r14 = 1904(0x770, float:2.668E-42)
            r12 = 0
            r9 = r1
            r10 = r5
            r1 = r7
            r7 = r3
            r3 = r8
            r8 = r16
            y0.o r5 = th.c.b(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.p(r3)
            goto L11a
        L10a:
            r1 = r7
            r7 = r3
            r3 = r8
            r5 = -1299761403(0xffffffffb2873705, float:-1.5741088E-8)
            r0.a0(r5)
            r0.p(r3)
            y0.o r5 = k.n.g(r7, r10, r1)
        L11a:
            y0.o r2 = r2.d(r5)
            y0.o r1 = c1.h.b(r2, r1)
            r2 = 4
            float r2 = (float) r2
            y0.o r1 = p.d.l(r1, r2)
            y0.g r2 = y0.b.f21796k
            v1.n0 r2 = p.o.d(r2, r3)
            long r7 = r0.T
            int r3 = java.lang.Long.hashCode(r7)
            s0.h r5 = r0.l()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r0.d0()
            boolean r8 = r0.S
            if (r8 == 0) goto L14e
            r0.k(r7)
            goto L151
        L14e:
            r0.n0()
        L151:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r0, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r0, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r0, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r0)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r0, r1)
            r1 = 54
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            p.r r2 = p.r.f9980a
            r5 = r19
            r5.b(r2, r0, r1)
            r0.p(r15)
            goto L184
        L17f:
            r5 = r19
            r0.V()
        L184:
            i0.r1 r7 = r0.t()
            if (r7 == 0) goto L196
            sh.j r0 = new sh.j
            r2 = 2
            r3 = r16
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L196:
            return
    }

    public static final uh.b e(uh.b r18, float r19, i0.h0 r20, int r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            uh.a r3 = r0.f13851c
            r3.getClass()
            uh.d r4 = r3.f13846d
            i0.m2 r5 = y1.i0.f21966b
            java.lang.Object r5 = r2.j(r5)
            android.content.Context r5 = (android.content.Context) r5
            i0.p1 r6 = o3.a.f9501a
            java.lang.Object r6 = r2.j(r6)
            androidx.lifecycle.q r6 = (androidx.lifecycle.q) r6
            java.lang.Object r7 = r2.P()
            i0.e r8 = i0.l.f5952a
            if (r7 != r8) goto L2e
            wh.a r7 = wh.a.f20789e
            i0.j1 r7 = i0.r.u(r7)
            r2.k0(r7)
        L2e:
            i0.a1 r7 = (i0.a1) r7
            r9 = 1041865114(0x3e19999a, float:0.15)
            java.lang.Float r10 = java.lang.Float.valueOf(r9)
            boolean r11 = r2.h(r5)
            boolean r9 = r2.c(r9)
            r9 = r9 | r11
            boolean r11 = r2.h(r6)
            r9 = r9 | r11
            java.lang.Object r11 = r2.P()
            if (r9 != 0) goto L4d
            if (r11 != r8) goto L57
        L4d:
            wb.dj r11 = new wb.dj
            r9 = 9
            r11.<init>(r5, r6, r7, r9)
            r2.k0(r11)
        L57:
            fg.l r11 = (fg.l) r11
            boolean r5 = r2.f(r5)
            boolean r6 = r2.f(r6)
            r5 = r5 | r6
            boolean r6 = r2.f(r10)
            r5 = r5 | r6
            java.lang.Object r6 = r2.P()
            if (r5 != 0) goto L6f
            if (r6 != r8) goto L77
        L6f:
            i0.y r6 = new i0.y
            r6.<init>(r11)
            r2.k0(r6)
        L77:
            i0.y r6 = (i0.y) r6
            java.lang.Object r5 = r7.getValue()
            wh.a r5 = (wh.a) r5
            boolean r5 = r2.f(r5)
            boolean r6 = r2.f(r4)
            r5 = r5 | r6
            r6 = r21 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r9 = 32
            if (r6 <= r9) goto L96
            boolean r6 = r2.c(r1)
            if (r6 != 0) goto L9a
        L96:
            r6 = r21 & 48
            if (r6 != r9) goto L9c
        L9a:
            r6 = 1
            goto L9d
        L9c:
            r6 = 0
        L9d:
            r5 = r5 | r6
            java.lang.Object r6 = r2.P()
            r9 = 0
            if (r5 != 0) goto La7
            if (r6 != r8) goto L137
        La7:
            java.lang.Object r5 = r7.getValue()
            wh.a r5 = (wh.a) r5
            float r5 = r5.f20792c
            java.lang.Object r6 = r7.getValue()
            wh.a r6 = (wh.a) r6
            float r6 = r6.f20793d
            float r7 = r5 * r5
            float r10 = r6 * r6
            float r10 = r10 + r7
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 <= 0) goto Ldc
            double r10 = (double) r10
            double r10 = java.lang.Math.sqrt(r10)
            float r7 = (float) r10
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 / r7
            float r5 = r5 * r10
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r6 = r6 * r10
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            sf.e r7 = new sf.e
            r7.<init>(r5, r6)
            goto Leb
        Ldc:
            java.lang.Float r5 = java.lang.Float.valueOf(r9)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            sf.e r7 = new sf.e
            r7.<init>(r5, r6)
        Leb:
            java.lang.Object r5 = r7.f12418g
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Object r6 = r7.f12419h
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            double r10 = (double) r1
            r12 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r10 = r10 * r12
            r12 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r10 = r10 / r12
            double r12 = java.lang.Math.cos(r10)
            float r1 = (float) r12
            double r10 = java.lang.Math.sin(r10)
            float r7 = (float) r10
            float r10 = r1 * r5
            float r11 = r7 * r6
            float r10 = r10 - r11
            float r7 = r7 * r5
            float r1 = r1 * r6
            float r1 = r1 + r7
            uh.c r5 = new uh.c
            r6 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 + r6
            r6 = 1060320051(0x3f333333, float:0.7)
            float r1 = r1 + r6
            uh.c r6 = r4.f13855a
            float r6 = r6.f13854c
            r5.<init>(r10, r1, r6)
            long r6 = r4.f13856b
            float r1 = r4.f13857c
            uh.d r4 = new uh.d
            r4.<init>(r5, r6, r1)
            r2.k0(r4)
            r6 = r4
        L137:
            r15 = r6
            uh.d r15 = (uh.d) r15
            boolean r1 = r2.f(r15)
            java.lang.Object r4 = r2.P()
            if (r1 != 0) goto L146
            if (r4 != r8) goto L167
        L146:
            long r11 = r3.f13843a
            int r13 = r3.f13844b
            float r14 = r3.f13845c
            uh.d r1 = r3.f13847e
            boolean r3 = r3.f13848f
            r15.getClass()
            r1.getClass()
            uh.a r10 = new uh.a
            r16 = r1
            r17 = r3
            r10.<init>(r11, r13, r14, r15, r16, r17)
            r1 = 3
            uh.b r4 = uh.b.a(r0, r9, r10, r1)
            r2.k0(r4)
        L167:
            uh.b r4 = (uh.b) r4
            return r4
    }
}
