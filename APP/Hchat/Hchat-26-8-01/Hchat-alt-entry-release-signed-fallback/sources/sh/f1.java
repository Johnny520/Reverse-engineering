package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i.r0 f12580a = null;

    static {
            r0 = 0
            r1 = 4
            r2 = 1058642330(0x3f19999a, float:0.6)
            r3 = 1148633088(0x4476c000, float:987.0)
            i.r0 r0 = i.d.o(r2, r3, r0, r1)
            sh.f1.f12580a = r0
            return
    }

    public static final void a(float r49, fg.l r50, y0.o r51, boolean r52, lg.a r53, int r54, fg.a r55, float r56, sh.r0 r57, sh.s0 r58, boolean r59, java.util.List r60, float r61, i0.h0 r62, int r63, int r64) {
            r1 = r49
            r2 = r50
            r5 = r53
            r15 = r62
            float r3 = r5.f8041b
            float r4 = r5.f8040a
            r2.getClass()
            r6 = 1805770979(0x6ba1e0e3, float:3.913981E26)
            r15.b0(r6)
            boolean r6 = r15.c(r1)
            if (r6 == 0) goto L1d
            r6 = 4
            goto L1e
        L1d:
            r6 = 2
        L1e:
            r6 = r63 | r6
            r8 = r63 & 48
            if (r8 != 0) goto L30
            boolean r8 = r15.h(r2)
            if (r8 == 0) goto L2d
            r8 = 32
            goto L2f
        L2d:
            r8 = 16
        L2f:
            r6 = r6 | r8
        L30:
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            boolean r8 = r15.f(r5)
            if (r8 == 0) goto L3b
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L3d
        L3b:
            r8 = 8192(0x2000, float:1.148E-41)
        L3d:
            r6 = r6 | r8
            r8 = r64 & 64
            if (r8 == 0) goto L48
            r9 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r9
            r9 = r55
            goto L56
        L48:
            r9 = r55
            boolean r12 = r15.h(r9)
            if (r12 == 0) goto L53
            r12 = 1048576(0x100000, float:1.469368E-39)
            goto L55
        L53:
            r12 = 524288(0x80000, float:7.34684E-40)
        L55:
            r6 = r6 | r12
        L56:
            r12 = 381681664(0x16c00000, float:3.1019273E-25)
            r6 = r6 | r12
            r12 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r12 & r6
            r13 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r13) goto L64
            r12 = 0
            goto L65
        L64:
            r12 = 1
        L65:
            r13 = r6 & 1
            boolean r12 = r15.S(r13, r12)
            if (r12 == 0) goto L6f6
            r15.X()
            r12 = r63 & 1
            r13 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            i0.e r14 = i0.l.f5952a
            if (r12 == 0) goto L97
            boolean r12 = r15.B()
            if (r12 == 0) goto L80
            goto L97
        L80:
            r15.V()
            r6 = r6 & r13
            r0 = r52
            r10 = r56
            r11 = r57
            r20 = r58
            r39 = r3
            r40 = r4
            r1 = r9
            r9 = r14
            r3 = r61
        L94:
            r4 = r6
            goto L186
        L97:
            if (r8 == 0) goto L9a
            r9 = 0
        L9a:
            float r8 = sh.t0.f12837a
            i0.m2 r12 = bi.d.f892a
            java.lang.Object r19 = r15.j(r12)
            bi.b r19 = (bi.b) r19
            r52 = r8
            long r7 = r19.j()
            java.lang.Object r19 = r15.j(r12)
            r37 = r13
            r13 = r19
            bi.b r13 = (bi.b) r13
            i0.j1 r13 = r13.f877m
            java.lang.Object r13 = r13.getValue()
            f1.w r13 = (f1.w) r13
            long r10 = r13.f3133a
            java.lang.Object r13 = r15.j(r12)
            bi.b r13 = (bi.b) r13
            i0.j1 r13 = r13.f865a0
            java.lang.Object r13 = r13.getValue()
            f1.w r13 = (f1.w) r13
            r38 = r6
            long r5 = r13.f3133a
            java.lang.Object r13 = r15.j(r12)
            bi.b r13 = (bi.b) r13
            i0.j1 r13 = r13.f884t
            java.lang.Object r13 = r13.getValue()
            f1.w r13 = (f1.w) r13
            long r0 = r13.f3133a
            java.lang.Object r13 = r15.j(r12)
            bi.b r13 = (bi.b) r13
            r39 = r3
            r40 = r4
            long r3 = r13.e()
            java.lang.Object r13 = r15.j(r12)
            bi.b r13 = (bi.b) r13
            r41 = r14
            long r13 = r13.b()
            java.lang.Object r20 = r15.j(r12)
            r55 = r9
            r9 = r20
            bi.b r9 = (bi.b) r9
            i0.j1 r9 = r9.Y
            java.lang.Object r9 = r9.getValue()
            f1.w r9 = (f1.w) r9
            r31 = r13
            long r13 = r9.f3133a
            java.lang.Object r9 = r15.j(r12)
            bi.b r9 = (bi.b) r9
            i0.j1 r9 = r9.Z
            java.lang.Object r9 = r9.getValue()
            f1.w r9 = (f1.w) r9
            r33 = r13
            long r12 = r9.f3133a
            boolean r9 = r15.e(r7)
            boolean r14 = r15.e(r10)
            r9 = r9 | r14
            boolean r14 = r15.e(r5)
            r9 = r9 | r14
            boolean r14 = r15.e(r0)
            r9 = r9 | r14
            boolean r14 = r15.e(r3)
            r9 = r9 | r14
            r27 = r0
            r0 = r31
            boolean r14 = r15.e(r0)
            r9 = r9 | r14
            r0 = r33
            boolean r14 = r15.e(r0)
            r9 = r9 | r14
            boolean r14 = r15.e(r12)
            r9 = r9 | r14
            java.lang.Object r14 = r15.P()
            if (r9 != 0) goto L15a
            r9 = r41
            if (r14 != r9) goto L172
            goto L15c
        L15a:
            r9 = r41
        L15c:
            sh.r0 r20 = new sh.r0
            r33 = r0
            r29 = r3
            r25 = r5
            r21 = r7
            r23 = r10
            r35 = r12
            r20.<init>(r21, r23, r25, r27, r29, r31, r33, r35)
            r14 = r20
            r15.k0(r14)
        L172:
            r0 = r14
            sh.r0 r0 = (sh.r0) r0
            r6 = r38 & r37
            sh.s0 r1 = sh.t0.f12838b
            r3 = 1017370378(0x3ca3d70a, float:0.02)
            r10 = r52
            r11 = r0
            r20 = r1
            r0 = 1
            r1 = r55
            goto L94
        L186:
            r15.q()
            if (r54 < 0) goto L6f0
            int r5 = (r40 > r39 ? 1 : (r40 == r39 ? 0 : -1))
            if (r5 >= 0) goto L6ea
            i0.m2 r5 = y1.h1.f21950l
            java.lang.Object r5 = r15.j(r5)
            n1.a r5 = (n1.a) r5
            i0.m2 r6 = y1.h1.f21952n
            java.lang.Object r6 = r15.j(r6)
            u2.m r6 = (u2.m) r6
            u2.m r7 = u2.m.f13355h
            if (r6 != r7) goto L1a5
            r6 = 1
            goto L1a6
        L1a5:
            r6 = 0
        L1a6:
            i0.a1 r29 = i0.r.y(r2, r15)
            i0.a1 r7 = i0.r.y(r1, r15)
            java.lang.Object r8 = r15.P()
            if (r8 != r9) goto L1bd
            i0.f1 r8 = new i0.f1
            r12 = 0
            r8.<init>(r12)
            r15.k0(r8)
        L1bd:
            r26 = r8
            i0.f1 r26 = (i0.f1) r26
            java.lang.Object r8 = r15.P()
            if (r8 != r9) goto L1d0
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            i0.j1 r8 = i0.r.u(r8)
            r15.k0(r8)
        L1d0:
            r25 = r8
            i0.a1 r25 = (i0.a1) r25
            java.lang.Object r8 = r15.P()
            if (r8 != r9) goto L1e3
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            i0.j1 r8 = i0.r.u(r8)
            r15.k0(r8)
        L1e3:
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r12 = r15.P()
            if (r12 != r9) goto L1f5
            i0.g1 r12 = new i0.g1
            r13 = 0
            r12.<init>(r13)
            r15.k0(r12)
            goto L1f6
        L1f5:
            r13 = 0
        L1f6:
            r27 = r12
            i0.g1 r27 = (i0.g1) r27
            java.lang.Object r12 = r15.P()
            if (r12 != r9) goto L208
            i0.g1 r12 = new i0.g1
            r12.<init>(r13)
            r15.k0(r12)
        L208:
            r28 = r12
            i0.g1 r28 = (i0.g1) r28
            java.lang.Object r12 = r15.P()
            if (r12 != r9) goto L21a
            sh.u0 r12 = new sh.u0
            r12.<init>()
            r15.k0(r12)
        L21a:
            r24 = r12
            sh.u0 r24 = (sh.u0) r24
            java.lang.Object r12 = r15.P()
            if (r12 != r9) goto L22c
            n.k r12 = new n.k
            r12.<init>()
            r15.k0(r12)
        L22c:
            n.k r12 = (n.k) r12
            r13 = 6
            f1.r0 r31 = bi.k.b(r10, r15, r13)
            i0.a1 r21 = ac.p.n(r12, r15)
            r13 = r49
            r32 = r1
            r14 = r39
            r1 = r40
            float r1 = r9.e0.q(r13, r1, r14)
            java.lang.Object r14 = r25.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            boolean r14 = r15.g(r14)
            r52 = r1
            java.lang.Object r1 = r15.P()
            if (r14 != 0) goto L260
            if (r1 != r9) goto L25c
            goto L260
        L25c:
            r55 = r5
            r5 = 0
            goto L28b
        L260:
            java.lang.Object r1 = r25.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L27b
            r1 = 1063675494(0x3f666666, float:0.9)
            r14 = 1155227648(0x44db6000, float:1755.0)
            r55 = r5
            r2 = 4
            r5 = 0
            i.r0 r1 = i.d.o(r1, r14, r5, r2)
            goto L288
        L27b:
            r55 = r5
            r2 = 4
            r5 = 0
            r1 = 1064682127(0x3f75c28f, float:0.96)
            r14 = 1134624768(0x43a10000, float:322.0)
            i.r0 r1 = i.d.o(r1, r14, r5, r2)
        L288:
            r15.k0(r1)
        L28b:
            i.r0 r1 = (i.r0) r1
            r2 = 1
            r16 = 0
            r17 = 28
            r14 = 0
            r13 = r1
            r22 = r10
            r2 = r12
            r1 = r27
            r12 = r52
            r10 = r9
            r9 = r28
            i0.l2 r13 = i.f.a(r12, r13, r14, r15, r16, r17)
            java.lang.Object r14 = r21.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r14 != 0) goto L2cb
            java.lang.Object r14 = r25.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L2cb
            java.lang.Object r14 = r8.getValue()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L2c9
            goto L2cb
        L2c9:
            r14 = r15
            goto L2ce
        L2cb:
            r14 = 1066418569(0x3f904189, float:1.127)
        L2ce:
            r16 = 48
            r17 = 28
            r21 = r13
            i.r0 r13 = sh.f1.f12580a
            r23 = r12
            r12 = r14
            r14 = 0
            r15 = r62
            r5 = r21
            r42 = r23
            i0.l2 r12 = i.f.a(r12, r13, r14, r15, r16, r17)
            r13 = r15
            java.lang.Object r14 = r13.P()
            if (r14 != r10) goto L313
            if (r54 != 0) goto L2f6
            r14 = 0
            float[] r15 = new float[r14]
            r52 = r7
            r56 = r8
        L2f4:
            r14 = r15
            goto L30f
        L2f6:
            int r14 = r54 + 2
            float[] r15 = new float[r14]
            r52 = r7
            r7 = 0
        L2fd:
            r56 = r8
            if (r7 >= r14) goto L2f4
            float r8 = (float) r7
            r16 = r7
            int r7 = r54 + 1
            float r7 = (float) r7
            float r8 = r8 / r7
            r15[r16] = r8
            int r7 = r16 + 1
            r8 = r56
            goto L2fd
        L30f:
            r13.k0(r14)
            goto L317
        L313:
            r52 = r7
            r56 = r8
        L317:
            float[] r14 = (float[]) r14
            r15 = r60
            boolean r7 = r13.f(r15)
            boolean r8 = r13.f(r14)
            r7 = r7 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r4
            r8 = r8 ^ 24576(0x6000, float:3.4438E-41)
            r57 = r7
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r8 <= r7) goto L33e
            r7 = r53
            boolean r16 = r13.f(r7)
            if (r16 != 0) goto L339
            goto L340
        L339:
            r58 = r11
            r61 = r12
            goto L34a
        L33e:
            r7 = r53
        L340:
            r58 = r11
            r11 = r4 & 24576(0x6000, float:3.4438E-41)
            r61 = r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 != r12) goto L34c
        L34a:
            r11 = 1
            goto L34d
        L34c:
            r11 = 0
        L34d:
            r11 = r57 | r11
            java.lang.Object r12 = r13.P()
            if (r11 != 0) goto L357
            if (r12 != r10) goto L369
        L357:
            if (r15 == 0) goto L35f
            float[] r11 = d(r15, r7)
            r12 = r11
            goto L366
        L35f:
            if (r59 == 0) goto L363
            r12 = r14
            goto L366
        L363:
            r11 = 0
            float[] r12 = new float[r11]
        L366:
            r13.k0(r12)
        L369:
            r16 = r12
            float[] r16 = (float[]) r16
            boolean r11 = r13.f(r15)
            boolean r12 = r13.f(r14)
            r11 = r11 | r12
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r8 <= r12) goto L384
            boolean r17 = r13.f(r7)
            if (r17 != 0) goto L381
            goto L384
        L381:
            r57 = r11
            goto L38a
        L384:
            r57 = r11
            r11 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r11 != r12) goto L38c
        L38a:
            r11 = 1
            goto L38d
        L38c:
            r11 = 0
        L38d:
            r11 = r57 | r11
            java.lang.Object r12 = r13.P()
            if (r11 != 0) goto L39a
            if (r12 != r10) goto L398
            goto L39a
        L398:
            r11 = 0
            goto L3af
        L39a:
            if (r15 == 0) goto L3a3
            float[] r11 = d(r15, r7)
            r12 = r11
            r11 = 0
            goto L3ac
        L3a3:
            int r11 = r14.length
            if (r11 != 0) goto L3aa
            r11 = 0
            float[] r12 = new float[r11]
            goto L3ac
        L3aa:
            r11 = 0
            r12 = r14
        L3ac:
            r13.k0(r12)
        L3af:
            float[] r12 = (float[]) r12
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r8 <= r11) goto L3bb
            boolean r17 = r13.f(r7)
            if (r17 != 0) goto L3bf
        L3bb:
            r15 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r15 != r11) goto L3c1
        L3bf:
            r11 = 1
            goto L3c2
        L3c1:
            r11 = 0
        L3c2:
            boolean r14 = r13.f(r14)
            r11 = r11 | r14
            boolean r14 = r13.f(r12)
            r11 = r11 | r14
            java.lang.Object r14 = r13.P()
            if (r11 != 0) goto L3d8
            if (r14 != r10) goto L3d5
            goto L3d8
        L3d5:
            r11 = r54
            goto L3e2
        L3d8:
            sh.v0 r14 = new sh.v0
            r11 = r54
            r14.<init>(r7, r11, r12, r3)
            r13.k0(r14)
        L3e2:
            fg.l r14 = (fg.l) r14
            int r15 = r1.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            i0.a1 r15 = i0.r.y(r15, r13)
            int r17 = r9.g()
            r21 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            i0.a1 r3 = i0.r.y(r3, r13)
            y0.l r11 = y0.l.f21818a
            if (r0 == 0) goto L595
            r57 = r12
            r12 = 1261235432(0x4b2cece8, float:1.133284E7)
            r13.a0(r12)
            java.lang.Object r12 = r13.P()
            if (r12 != r10) goto L41d
            m.b r12 = new m.b
            r23 = r14
            r14 = 17
            r12.<init>(r1, r14, r9)
            r13.k0(r12)
            goto L41f
        L41d:
            r23 = r14
        L41f:
            fg.l r12 = (fg.l) r12
            y0.o r12 = v1.w.n(r11, r12)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
            boolean r17 = r13.f(r3)
            boolean r27 = r13.f(r15)
            r17 = r17 | r27
            boolean r27 = r13.f(r5)
            r17 = r17 | r27
            r27 = r1
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r8 <= r1) goto L449
            boolean r18 = r13.f(r7)
            if (r18 != 0) goto L446
            goto L449
        L446:
            r28 = r3
            goto L44f
        L449:
            r28 = r3
            r3 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r3 != r1) goto L451
        L44f:
            r1 = 1
            goto L452
        L451:
            r1 = 0
        L452:
            r1 = r17 | r1
            boolean r3 = r13.g(r6)
            r1 = r1 | r3
            java.lang.Object r3 = r13.P()
            if (r1 != 0) goto L477
            if (r3 != r10) goto L462
            goto L477
        L462:
            r43 = r52
            r15 = r55
            r1 = r4
            r4 = r6
            r28 = r9
            r41 = r10
            r52 = r11
            r34 = r21
            r11 = r29
            r21 = r5
            r5 = r7
            r10 = r8
            goto L499
        L477:
            sh.c1 r3 = new sh.c1
            r43 = r52
            r1 = r4
            r4 = r5
            r5 = r7
            r41 = r10
            r52 = r11
            r34 = r21
            r11 = r29
            r7 = r56
            r10 = r8
            r8 = r28
            r28 = r9
            r9 = r15
            r15 = r55
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r21 = r4
            r4 = r6
            r13.k0(r3)
        L499:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r3 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r3
            y0.o r3 = s1.h0.b(r12, r14, r5, r3)
            y0.o r3 = k.n.n(r3, r2, r0)
            boolean r6 = r13.g(r4)
            r14 = r23
            boolean r7 = r13.f(r14)
            r6 = r6 | r7
            boolean r7 = r13.f(r11)
            r6 = r6 | r7
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r10 <= r12) goto L4bd
            boolean r7 = r13.f(r5)
            if (r7 != 0) goto L4c1
        L4bd:
            r7 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r7 != r12) goto L4c3
        L4c1:
            r7 = 1
            goto L4c4
        L4c3:
            r7 = 0
        L4c4:
            r6 = r6 | r7
            boolean r7 = r13.h(r15)
            r6 = r6 | r7
            r7 = r57
            boolean r8 = r13.h(r7)
            r6 = r6 | r8
            r8 = r60
            boolean r9 = r13.h(r8)
            r6 = r6 | r9
            java.lang.Object r9 = r13.P()
            if (r6 != 0) goto L4fc
            r6 = r41
            if (r9 != r6) goto L4e4
        L4e2:
            r9 = r3
            goto L4ff
        L4e4:
            r45 = r58
            r47 = r61
            r55 = r0
            r17 = r1
            r19 = r2
            r1 = r3
            r2 = r6
            r18 = r10
            r0 = r13
            r35 = r20
            r46 = r21
            r44 = r22
            r6 = r24
            goto L530
        L4fc:
            r6 = r41
            goto L4e2
        L4ff:
            sh.w0 r3 = new sh.w0
            r45 = r58
            r47 = r61
            r55 = r0
            r17 = r1
            r19 = r2
            r2 = r6
            r1 = r9
            r18 = r10
            r0 = r13
            r9 = r15
            r46 = r21
            r44 = r22
            r6 = r24
            r12 = r26
            r13 = r27
            r10 = r7
            r15 = r11
            r7 = r5
            r11 = r8
            r5 = r14
            r8 = r20
            r14 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r35 = r8
            r11 = r15
            r14 = r5
            r5 = r7
            r0.k0(r3)
            r9 = r3
        L530:
            fg.l r9 = (fg.l) r9
            m.n r3 = m.s0.b(r9, r0)
            boolean r7 = r0.g(r4)
            boolean r8 = r0.f(r14)
            r7 = r7 | r8
            boolean r8 = r0.f(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r0.P()
            if (r7 != 0) goto L550
            if (r8 != r2) goto L54d
            goto L550
        L54d:
            r6 = r25
            goto L566
        L550:
            sh.d1 r21 = new sh.d1
            r30 = 0
            r22 = r4
            r24 = r6
            r29 = r11
            r23 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = r21
            r6 = r25
            r0.k0(r8)
        L566:
            fg.q r8 = (fg.q) r8
            r7 = r43
            boolean r9 = r0.f(r7)
            java.lang.Object r10 = r0.P()
            if (r9 != 0) goto L579
            if (r10 != r2) goto L577
            goto L579
        L577:
            r9 = 0
            goto L582
        L579:
            sh.e1 r10 = new sh.e1
            r9 = 0
            r10.<init>(r6, r7, r9)
            r0.k0(r10)
        L582:
            fg.q r10 = (fg.q) r10
            y0.o r1 = m.s0.a(r1, r3, r8, r10)
            r12 = r19
            y0.o r1 = k.v0.a(r1, r12, r9)
            r13 = 0
            r0.p(r13)
        L592:
            r3 = r51
            goto L5be
        L595:
            r45 = r58
            r47 = r61
            r55 = r0
            r17 = r4
            r46 = r5
            r4 = r6
            r5 = r7
            r18 = r8
            r2 = r10
            r52 = r11
            r0 = r13
            r35 = r20
            r34 = r21
            r44 = r22
            r6 = r25
            r11 = r29
            r13 = 0
            r1 = 1265385743(0x4b6c410f, float:1.5483151E7)
            r0.a0(r1)
            r0.p(r13)
            r1 = r52
            goto L592
        L5be:
            y0.o r1 = r3.d(r1)
            r12 = r42
            boolean r7 = r0.c(r12)
            r10 = r18
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r10 <= r8) goto L5d8
            boolean r9 = r0.f(r5)
            if (r9 != 0) goto L5d5
            goto L5d8
        L5d5:
            r9 = r17
            goto L5de
        L5d8:
            r9 = r17
            r10 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r10 != r8) goto L5e0
        L5de:
            r14 = 1
            goto L5e1
        L5e0:
            r14 = r13
        L5e1:
            r7 = r7 | r14
            boolean r8 = r0.f(r11)
            r7 = r7 | r8
            java.lang.Object r8 = r0.P()
            if (r7 != 0) goto L5f3
            if (r8 != r2) goto L5f0
            goto L5f3
        L5f0:
            r7 = r54
            goto L5fd
        L5f3:
            sh.v0 r8 = new sh.v0
            r7 = r54
            r8.<init>(r12, r5, r7, r11)
            r0.k0(r8)
        L5fd:
            fg.l r8 = (fg.l) r8
            y0.o r1 = f2.o.a(r1, r8)
            y0.g r8 = y0.b.f21795j
            v1.n0 r8 = p.o.d(r8, r13)
            long r10 = r0.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r0.l()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r0.d0()
            boolean r13 = r0.S
            if (r13 == 0) goto L629
            r0.k(r12)
            goto L62c
        L629:
            r0.n0()
        L62c:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r8)
            x1.e r8 = x1.f.f20885d
            i0.r.A(r8, r0, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            x1.e r10 = x1.f.f20887f
            i0.r.t(r0, r8, r10)
            x1.d r8 = x1.f.f20888g
            i0.r.w(r8, r0)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r0, r1)
            r1 = r45
            if (r55 == 0) goto L650
            long r10 = r1.f12799c
            goto L652
        L650:
            long r10 = r1.f12800d
        L652:
            if (r55 == 0) goto L657
            long r12 = r1.f12797a
            goto L659
        L657:
            long r12 = r1.f12798b
        L659:
            if (r55 == 0) goto L661
            long r14 = r1.f12801e
        L65d:
            r20 = r4
            r4 = r10
            goto L664
        L661:
            long r14 = r1.f12802f
            goto L65d
        L664:
            long r10 = r1.f12803g
            r25 = r6
            r6 = r12
            long r12 = r1.f12804h
            r8 = r46
            boolean r17 = r0.f(r8)
            r58 = r1
            java.lang.Object r1 = r0.P()
            if (r17 != 0) goto L67b
            if (r1 != r2) goto L684
        L67b:
            h0.i0 r1 = new h0.i0
            r3 = 2
            r1.<init>(r8, r3)
            r0.k0(r1)
        L684:
            fg.a r1 = (fg.a) r1
            java.lang.Object r3 = r25.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r8 = r47
            boolean r17 = r0.f(r8)
            r56 = r1
            java.lang.Object r1 = r0.P()
            if (r17 != 0) goto L6a0
            if (r1 != r2) goto L6a9
        L6a0:
            h0.i0 r1 = new h0.i0
            r2 = 3
            r1.<init>(r8, r2)
            r0.k0(r1)
        L6a9:
            r19 = r1
            fg.a r19 = (fg.a) r19
            r2 = r52
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r1 = p.h1.d(r2, r1)
            r2 = r44
            y0.o r21 = p.h1.e(r1, r2)
            int r1 = r9 << 9
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r1 = r1 & r8
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r23 = r1 | r8
            r24 = 6
            r17 = r59
            r22 = r0
            r8 = r14
            r18 = r16
            r15 = r53
            r14 = r56
            r16 = r3
            r3 = r31
            b(r3, r4, r6, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r15 = r22
            r0 = 1
            r15.p(r0)
            r4 = r55
            r9 = r58
            r8 = r2
            r7 = r32
            r13 = r34
            r10 = r35
            goto L704
        L6ea:
            java.lang.String r0 = "valueRange start should be less than end"
            j8.o.t(r0)
            return
        L6f0:
            java.lang.String r0 = "steps should be >= 0"
            j8.o.t(r0)
            return
        L6f6:
            r15.V()
            r4 = r52
            r8 = r56
            r10 = r58
            r13 = r61
            r7 = r9
            r9 = r57
        L704:
            i0.r1 r0 = r15.t()
            if (r0 == 0) goto L728
            r1 = r0
            sh.x0 r0 = new sh.x0
            r2 = r50
            r3 = r51
            r5 = r53
            r6 = r54
            r11 = r59
            r12 = r60
            r14 = r63
            r15 = r64
            r48 = r1
            r1 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r48
            r1.f6035d = r0
        L728:
            return
    }

    public static final void b(f1.r0 r31, long r32, long r34, long r36, long r38, long r40, fg.a r42, lg.a r43, boolean r44, boolean r45, float[] r46, fg.a r47, boolean r48, y0.o r49, i0.h0 r50, int r51, int r52) {
            r1 = r31
            r2 = r32
            r14 = r44
            r0 = r46
            r4 = r49
            r8 = r50
            r11 = r51
            r12 = r52
            r5 = -1133859733(0xffffffffbc6aac6b, float:-0.014323334)
            r8.b0(r5)
            r5 = r11 & 6
            if (r5 != 0) goto L25
            boolean r5 = r8.f(r1)
            if (r5 == 0) goto L22
            r5 = 4
            goto L23
        L22:
            r5 = 2
        L23:
            r5 = r5 | r11
            goto L26
        L25:
            r5 = r11
        L26:
            r7 = r11 & 48
            if (r7 != 0) goto L36
            boolean r7 = r8.e(r2)
            if (r7 == 0) goto L33
            r7 = 32
            goto L35
        L33:
            r7 = 16
        L35:
            r5 = r5 | r7
        L36:
            r7 = r11 & 384(0x180, float:5.38E-43)
            r9 = r34
            if (r7 != 0) goto L49
            boolean r18 = r8.e(r9)
            if (r18 == 0) goto L45
            r18 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r18 = 128(0x80, float:1.8E-43)
        L47:
            r5 = r5 | r18
        L49:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            r19 = 1024(0x400, float:1.435E-42)
            r9 = r36
            if (r6 != 0) goto L5d
            boolean r6 = r8.e(r9)
            if (r6 == 0) goto L5a
            r6 = 2048(0x800, float:2.87E-42)
            goto L5c
        L5a:
            r6 = r19
        L5c:
            r5 = r5 | r6
        L5d:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            r21 = 8192(0x2000, float:1.148E-41)
            r9 = r38
            if (r6 != 0) goto L71
            boolean r6 = r8.e(r9)
            if (r6 == 0) goto L6e
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L70
        L6e:
            r6 = r21
        L70:
            r5 = r5 | r6
        L71:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r11
            r9 = r40
            if (r6 != 0) goto L84
            boolean r6 = r8.e(r9)
            if (r6 == 0) goto L81
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L83
        L81:
            r6 = 65536(0x10000, float:9.1835E-41)
        L83:
            r5 = r5 | r6
        L84:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r11
            if (r6 != 0) goto L99
            r6 = r42
            boolean r25 = r8.h(r6)
            if (r25 == 0) goto L94
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L96
        L94:
            r25 = 524288(0x80000, float:7.34684E-40)
        L96:
            r5 = r5 | r25
            goto L9b
        L99:
            r6 = r42
        L9b:
            r25 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = r11 & r25
            r15 = r43
            if (r25 != 0) goto Lb0
            boolean r27 = r8.f(r15)
            if (r27 == 0) goto Lac
            r27 = 8388608(0x800000, float:1.1754944E-38)
            goto Lae
        Lac:
            r27 = 4194304(0x400000, float:5.877472E-39)
        Lae:
            r5 = r5 | r27
        Lb0:
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r27 = r11 & r27
            if (r27 != 0) goto Lc3
            boolean r27 = r8.g(r14)
            if (r27 == 0) goto Lbf
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lc1
        Lbf:
            r27 = 33554432(0x2000000, float:9.403955E-38)
        Lc1:
            r5 = r5 | r27
        Lc3:
            r27 = 805306368(0x30000000, float:4.656613E-10)
            r27 = r11 & r27
            r13 = 0
            if (r27 != 0) goto Ld6
            boolean r10 = r8.g(r13)
            if (r10 == 0) goto Ld3
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ld5
        Ld3:
            r10 = 268435456(0x10000000, float:2.524355E-29)
        Ld5:
            r5 = r5 | r10
        Ld6:
            r10 = r12 & 6
            if (r10 != 0) goto Lea
            r10 = r45
            boolean r27 = r8.g(r10)
            if (r27 == 0) goto Le5
            r18 = 4
            goto Le7
        Le5:
            r18 = 2
        Le7:
            r18 = r12 | r18
            goto Lee
        Lea:
            r10 = r45
            r18 = r12
        Lee:
            r27 = r12 & 48
            if (r27 != 0) goto Lff
            boolean r27 = r8.h(r0)
            if (r27 == 0) goto Lfb
            r17 = 32
            goto Lfd
        Lfb:
            r17 = 16
        Lfd:
            r18 = r18 | r17
        Lff:
            r7 = r12 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L113
            r7 = r47
            boolean r17 = r8.h(r7)
            if (r17 == 0) goto L10e
            r16 = 256(0x100, float:3.59E-43)
            goto L110
        L10e:
            r16 = 128(0x80, float:1.8E-43)
        L110:
            r18 = r18 | r16
            goto L115
        L113:
            r7 = r47
        L115:
            r9 = r12 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L126
            r9 = r48
            boolean r17 = r8.g(r9)
            if (r17 == 0) goto L123
            r19 = 2048(0x800, float:2.87E-42)
        L123:
            r18 = r18 | r19
            goto L128
        L126:
            r9 = r48
        L128:
            r13 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L136
            boolean r13 = r8.f(r4)
            if (r13 == 0) goto L134
            r21 = 16384(0x4000, float:2.2959E-41)
        L134:
            r18 = r18 | r21
        L136:
            r13 = r18
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r18 = r5
            r5 = r18 & r17
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            r17 = 1
            if (r5 != r6) goto L14f
            r5 = r13 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            if (r5 == r6) goto L14d
            goto L14f
        L14d:
            r5 = 0
            goto L151
        L14f:
            r5 = r17
        L151:
            r6 = r18 & 1
            boolean r5 = r8.S(r6, r5)
            if (r5 == 0) goto L242
            if (r14 == 0) goto L15f
            r5 = 1026832728(0x3d343958, float:0.044)
            goto L160
        L15f:
            r5 = 0
        L160:
            r6 = 150(0x96, float:2.1E-43)
            r19 = r5
            r5 = 6
            r7 = 0
            i.l1 r6 = i.d.p(r6, r5, r7)
            r9 = 3120(0xc30, float:4.372E-42)
            r10 = 20
            java.lang.String r7 = "SliderTrackAlpha"
            r11 = r18
            r5 = r19
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            i0.l2 r5 = i.f.a(r5, r6, r7, r8, r9, r10)
            y0.o r6 = c1.h.b(r4, r1)
            f1.m0 r7 = f1.c0.f3038b
            y0.o r6 = k.n.g(r6, r2, r7)
            boolean r7 = r8.f(r5)
            java.lang.Object r9 = r8.P()
            i0.e r10 = i0.l.f5952a
            if (r7 != 0) goto L192
            if (r9 != r10) goto L19b
        L192:
            sh.y0 r9 = new sh.y0
            r7 = 0
            r9.<init>(r5, r7)
            r8.k0(r9)
        L19b:
            fg.l r9 = (fg.l) r9
            y0.o r5 = c1.h.d(r6, r9)
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r11
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r7) goto L1ab
            r6 = r17
            goto L1ac
        L1ab:
            r6 = 0
        L1ac:
            r7 = r13 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != r9) goto L1b5
            r7 = r17
            goto L1b6
        L1b5:
            r7 = 0
        L1b6:
            r6 = r6 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r7 & r11
            r9 = 8388608(0x800000, float:1.1754944E-38)
            if (r7 != r9) goto L1c1
            r7 = r17
            goto L1c2
        L1c1:
            r7 = 0
        L1c2:
            r6 = r6 | r7
            r7 = 1879048192(0x70000000, float:1.5845633E29)
            r7 = r7 & r11
            if (r7 != r12) goto L1cb
            r7 = r17
            goto L1cc
        L1cb:
            r7 = 0
        L1cc:
            r6 = r6 | r7
            r7 = r13 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != r9) goto L1d6
            r7 = r17
            goto L1d7
        L1d6:
            r7 = 0
        L1d7:
            r6 = r6 | r7
            r7 = r11 & 896(0x380, float:1.256E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != r9) goto L1e1
            r7 = r17
            goto L1e2
        L1e1:
            r7 = 0
        L1e2:
            r6 = r6 | r7
            r7 = r13 & 14
            r9 = 4
            if (r7 != r9) goto L1eb
            r7 = r17
            goto L1ec
        L1eb:
            r7 = 0
        L1ec:
            r6 = r6 | r7
            boolean r7 = r8.h(r0)
            r6 = r6 | r7
            r7 = 458752(0x70000, float:6.42848E-40)
            r7 = r7 & r11
            r9 = 131072(0x20000, float:1.83671E-40)
            if (r7 != r9) goto L1fc
            r7 = r17
            goto L1fd
        L1fc:
            r7 = 0
        L1fd:
            r6 = r6 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r11
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r7 != r9) goto L209
            r7 = r17
            goto L20a
        L209:
            r7 = 0
        L20a:
            r6 = r6 | r7
            r7 = r11 & 7168(0x1c00, float:1.0045E-41)
            r9 = 2048(0x800, float:2.87E-42)
            if (r7 != r9) goto L212
            goto L214
        L212:
            r17 = 0
        L214:
            r6 = r6 | r17
            java.lang.Object r7 = r8.P()
            if (r6 != 0) goto L21e
            if (r7 != r10) goto L23b
        L21e:
            sh.z0 r15 = new sh.z0
            r20 = r34
            r28 = r36
            r26 = r38
            r24 = r40
            r16 = r42
            r18 = r43
            r22 = r45
            r17 = r47
            r19 = r48
            r23 = r0
            r15.<init>(r16, r17, r18, r19, r20, r22, r23, r24, r26, r28)
            r8.k0(r15)
            r7 = r15
        L23b:
            fg.l r7 = (fg.l) r7
            r0 = 0
            k.n.a(r5, r7, r8, r0)
            goto L245
        L242:
            r8.V()
        L245:
            i0.r1 r0 = r8.t()
            if (r0 == 0) goto L271
            r5 = r0
            sh.a1 r0 = new sh.a1
            r6 = r36
            r8 = r38
            r10 = r40
            r12 = r42
            r13 = r43
            r15 = r45
            r16 = r46
            r17 = r47
            r18 = r48
            r20 = r51
            r21 = r52
            r19 = r4
            r30 = r5
            r4 = r34
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5 = r30
            r5.f6035d = r0
        L271:
            return
    }

    public static final float c(float r2, int r3, int r4) {
            float r4 = (float) r4
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r3 = (float) r3
            float r0 = r0 * r4
            float r3 = r3 - r0
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Ld
            r3 = r0
        Ld:
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L12
            return r0
        L12:
            float r2 = r2 - r4
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9.e0.q(r2, r0, r3)
            return r2
    }

    public static final float[] d(java.util.List r5, lg.a r6) {
            float r0 = r6.f8040a
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r5)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r5.next()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 - r0
            float r3 = r6.f8041b
            float r3 = r3 - r0
            float r2 = r2 / r3
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r9.e0.q(r2, r3, r4)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.add(r2)
            goto Lf
        L33:
            int r5 = r1.size()
            float[] r5 = new float[r5]
            java.util.Iterator r6 = r1.iterator()
            r0 = 0
        L3e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r6.next()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = r0 + 1
            r5[r0] = r1
            r0 = r2
            goto L3e
        L54:
            return r5
    }
}
