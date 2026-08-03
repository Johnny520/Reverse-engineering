package a;

/* JADX INFO: loaded from: classes.dex */
public final class S2 {
    public static void a(a.O3 r40, a.B9 r41, int r42) {
            r0 = r40
            r1 = r41
            if (r42 != 0) goto Le
            int r2 = r0.m0
            a.T2[] r3 = r0.p0
            r14 = 0
        Lb:
            r12 = r2
            r13 = r3
            goto L14
        Le:
            int r2 = r0.n0
            a.T2[] r3 = r0.o0
            r14 = 2
            goto Lb
        L14:
            r15 = 0
        L15:
            if (r15 >= r12) goto L6dd
            r2 = r13[r15]
            boolean r3 = r2.q
            a.N3$a r4 = a.N3.a.c
            a.N3 r5 = r2.f269a
            r8 = 8
            r16 = 0
            if (r3 != 0) goto L159
            int r3 = r2.l
            int r9 = r3 * 2
            r7 = r5
            r11 = r7
            r17 = 0
            r18 = 0
        L2f:
            if (r17 != 0) goto L121
            r20 = 1
            int r6 = r2.i
            int r6 = r6 + 1
            r2.i = r6
            a.N3[] r6 = r7.d0
            r6[r3] = r16
            a.N3[] r6 = r7.c0
            r6[r3] = r16
            int r6 = r7.X
            a.M3[] r10 = r7.G
            if (r6 == r8) goto Lef
            r7.h(r3)
            r6 = r10[r9]
            r6.c()
            int r6 = r9 + 1
            r22 = r10[r6]
            r22.c()
            r22 = r10[r9]
            r22.c()
            r6 = r10[r6]
            r6.c()
            a.N3 r6 = r2.b
            if (r6 != 0) goto L66
            r2.b = r7
        L66:
            r2.d = r7
            a.N3$a[] r6 = r7.J
            r6 = r6[r3]
            if (r6 != r4) goto Lef
            int[] r8 = r7.l
            r8 = r8[r3]
            r23 = r3
            r3 = 3
            if (r8 == 0) goto L80
            if (r8 == r3) goto L80
            r3 = 2
            if (r8 != r3) goto L7d
            goto L80
        L7d:
            r26 = r9
            goto Ld5
        L80:
            int r3 = r2.j
            int r3 = r3 + 1
            r2.j = r3
            float[] r3 = r7.b0
            r3 = r3[r23]
            int r25 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r25 <= 0) goto L97
            r25 = r3
            float r3 = r2.k
            float r3 = r3 + r25
            r2.k = r3
            goto L99
        L97:
            r25 = r3
        L99:
            int r3 = r7.X
            r26 = r9
            r9 = 8
            if (r3 == r9) goto Lc5
            if (r6 != r4) goto Lc5
            if (r8 == 0) goto La8
            r3 = 3
            if (r8 != r3) goto Lc5
        La8:
            int r3 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r3 >= 0) goto Lb1
            r3 = r20
            r2.n = r3
            goto Lb5
        Lb1:
            r3 = r20
            r2.o = r3
        Lb5:
            java.util.ArrayList<a.N3> r3 = r2.h
            if (r3 != 0) goto Lc0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.h = r3
        Lc0:
            java.util.ArrayList<a.N3> r3 = r2.h
            r3.add(r7)
        Lc5:
            a.N3 r3 = r2.f
            if (r3 != 0) goto Lcb
            r2.f = r7
        Lcb:
            a.N3 r3 = r2.g
            if (r3 == 0) goto Ld3
            a.N3[] r3 = r3.c0
            r3[r23] = r7
        Ld3:
            r2.g = r7
        Ld5:
            if (r23 != 0) goto Le3
            int r3 = r7.j
            if (r3 == 0) goto Ldc
            goto Lf3
        Ldc:
            int r3 = r7.m
            if (r3 != 0) goto Lf3
            int r3 = r7.n
            goto Lf3
        Le3:
            int r3 = r7.k
            if (r3 == 0) goto Le8
            goto Lf3
        Le8:
            int r3 = r7.p
            if (r3 != 0) goto Lf3
            int r3 = r7.q
            goto Lf3
        Lef:
            r23 = r3
            r26 = r9
        Lf3:
            if (r11 == r7) goto Lf9
            a.N3[] r3 = r11.d0
            r3[r23] = r7
        Lf9:
            int r9 = r26 + 1
            r3 = r10[r9]
            a.M3 r3 = r3.d
            if (r3 == 0) goto L10f
            a.N3 r3 = r3.b
            a.M3[] r6 = r3.G
            r6 = r6[r26]
            a.M3 r6 = r6.d
            if (r6 == 0) goto L10f
            a.N3 r6 = r6.b
            if (r6 == r7) goto L111
        L10f:
            r3 = r16
        L111:
            if (r3 == 0) goto L114
            goto L117
        L114:
            r3 = r7
            r17 = 1
        L117:
            r11 = r7
            r9 = r26
            r8 = 8
            r7 = r3
            r3 = r23
            goto L2f
        L121:
            r23 = r3
            r26 = r9
            a.N3 r3 = r2.b
            if (r3 == 0) goto L130
            a.M3[] r3 = r3.G
            r3 = r3[r26]
            r3.c()
        L130:
            a.N3 r3 = r2.d
            if (r3 == 0) goto L13d
            int r9 = r26 + 1
            a.M3[] r3 = r3.G
            r3 = r3[r9]
            r3.c()
        L13d:
            r2.c = r7
            if (r23 != 0) goto L148
            boolean r3 = r2.m
            if (r3 == 0) goto L148
            r2.e = r7
            goto L14a
        L148:
            r2.e = r5
        L14a:
            boolean r3 = r2.o
            if (r3 == 0) goto L154
            boolean r3 = r2.n
            if (r3 == 0) goto L154
            r3 = 1
            goto L155
        L154:
            r3 = 0
        L155:
            r2.p = r3
        L157:
            r3 = 1
            goto L15c
        L159:
            r18 = 0
            goto L157
        L15c:
            r2.q = r3
            a.N3 r10 = r2.c
            a.N3 r11 = r2.b
            a.N3 r3 = r2.d
            a.N3 r6 = r2.e
            float r7 = r2.k
            a.N3$a[] r8 = r0.J
            r8 = r8[r42]
            a.N3$a r9 = a.N3.a.b
            if (r8 != r9) goto L172
            r8 = 1
            goto L173
        L172:
            r8 = 0
        L173:
            if (r42 != 0) goto L19a
            int r9 = r6.Z
            if (r9 != 0) goto L17f
            r20 = 1
        L17b:
            r17 = r7
            r7 = 1
            goto L182
        L17f:
            r20 = 0
            goto L17b
        L182:
            if (r9 != r7) goto L188
            r21 = r7
        L186:
            r7 = 2
            goto L18b
        L188:
            r21 = 0
            goto L186
        L18b:
            if (r9 != r7) goto L18f
            r9 = 1
            goto L190
        L18f:
            r9 = 0
        L190:
            r7 = r5
            r26 = r8
            r23 = r20
        L195:
            r24 = r21
            r21 = 0
            goto L1ba
        L19a:
            r17 = r7
            r7 = 2
            int r9 = r6.a0
            if (r9 != 0) goto L1a5
            r23 = 1
        L1a3:
            r7 = 1
            goto L1a8
        L1a5:
            r23 = 0
            goto L1a3
        L1a8:
            if (r9 != r7) goto L1ae
            r21 = 1
        L1ac:
            r7 = 2
            goto L1b1
        L1ae:
            r21 = 0
            goto L1ac
        L1b1:
            if (r9 != r7) goto L1b5
            r9 = 1
            goto L1b6
        L1b5:
            r9 = 0
        L1b6:
            r7 = r5
            r26 = r8
            goto L195
        L1ba:
            a.M3[] r8 = r0.G
            r27 = r8
            if (r21 != 0) goto L286
            a.M3[] r8 = r7.G
            r8 = r8[r14]
            if (r9 == 0) goto L1c9
            r29 = 1
            goto L1cb
        L1c9:
            r29 = 4
        L1cb:
            int r31 = r8.c()
            r32 = r9
            a.N3$a[] r9 = r7.J
            r33 = r9
            r9 = r33[r42]
            if (r9 != r4) goto L1e2
            int[] r9 = r7.l
            r9 = r9[r42]
            if (r9 != 0) goto L1e2
            r34 = 1
            goto L1e4
        L1e2:
            r34 = 0
        L1e4:
            a.M3 r9 = r8.d
            if (r9 == 0) goto L1f0
            if (r7 == r5) goto L1f0
            int r9 = r9.c()
            int r31 = r9 + r31
        L1f0:
            r9 = r31
            if (r32 == 0) goto L1fa
            if (r7 == r5) goto L1fa
            if (r7 == r11) goto L1fa
            r29 = 5
        L1fa:
            r31 = r12
            a.M3 r12 = r8.d
            if (r12 == 0) goto L22e
            if (r7 != r11) goto L20f
            r35 = r13
            a.le r13 = r8.g
            a.le r12 = r12.g
            r36 = r14
            r14 = 6
            r1.f(r13, r12, r9, r14)
            goto L21c
        L20f:
            r35 = r13
            r36 = r14
            a.le r13 = r8.g
            a.le r12 = r12.g
            r14 = 8
            r1.f(r13, r12, r9, r14)
        L21c:
            if (r34 == 0) goto L222
            if (r32 != 0) goto L222
            r12 = 5
            goto L224
        L222:
            r12 = r29
        L224:
            a.le r13 = r8.g
            a.M3 r8 = r8.d
            a.le r8 = r8.g
            r1.e(r13, r8, r9, r12)
            goto L232
        L22e:
            r35 = r13
            r36 = r14
        L232:
            a.M3[] r8 = r7.G
            if (r26 == 0) goto L25e
            int r9 = r7.X
            r14 = 8
            if (r9 == r14) goto L250
            r9 = r33[r42]
            if (r9 != r4) goto L250
            int r14 = r36 + 1
            r9 = r8[r14]
            a.le r9 = r9.g
            r12 = r8[r36]
            a.le r12 = r12.g
            r13 = 0
            r14 = 5
            r1.f(r9, r12, r13, r14)
            goto L251
        L250:
            r13 = 0
        L251:
            r9 = r8[r36]
            a.le r9 = r9.g
            r12 = r27[r36]
            a.le r12 = r12.g
            r14 = 8
            r1.f(r9, r12, r13, r14)
        L25e:
            int r14 = r36 + 1
            r8 = r8[r14]
            a.M3 r8 = r8.d
            if (r8 == 0) goto L274
            a.N3 r8 = r8.b
            a.M3[] r9 = r8.G
            r9 = r9[r36]
            a.M3 r9 = r9.d
            if (r9 == 0) goto L274
            a.N3 r9 = r9.b
            if (r9 == r7) goto L276
        L274:
            r8 = r16
        L276:
            if (r8 == 0) goto L27a
            r7 = r8
            goto L27c
        L27a:
            r21 = 1
        L27c:
            r12 = r31
            r9 = r32
            r13 = r35
            r14 = r36
            goto L1ba
        L286:
            r32 = r9
            r31 = r12
            r35 = r13
            r36 = r14
            if (r3 == 0) goto L2ea
            a.M3[] r7 = r10.G
            int r14 = r36 + 1
            r7 = r7[r14]
            a.M3 r7 = r7.d
            if (r7 == 0) goto L2ea
            a.M3[] r7 = r3.G
            r7 = r7[r14]
            a.N3$a[] r8 = r3.J
            r8 = r8[r42]
            if (r8 != r4) goto L2c0
            int[] r4 = r3.l
            r4 = r4[r42]
            if (r4 != 0) goto L2c0
            if (r32 != 0) goto L2c0
            a.M3 r4 = r7.d
            a.N3 r8 = r4.b
            if (r8 != r0) goto L2c0
            a.le r8 = r7.g
            a.le r4 = r4.g
            int r9 = r7.c()
            int r9 = -r9
            r12 = 5
            r1.e(r8, r4, r9, r12)
            goto L2d6
        L2c0:
            r12 = 5
            if (r32 == 0) goto L2d6
            a.M3 r4 = r7.d
            a.N3 r8 = r4.b
            if (r8 != r0) goto L2d6
            a.le r8 = r7.g
            a.le r4 = r4.g
            int r9 = r7.c()
            int r9 = -r9
            r13 = 4
            r1.e(r8, r4, r9, r13)
        L2d6:
            a.le r4 = r7.g
            a.M3[] r8 = r10.G
            r8 = r8[r14]
            a.M3 r8 = r8.d
            a.le r8 = r8.g
            int r7 = r7.c()
            int r7 = -r7
            r14 = 6
            r1.g(r4, r8, r7, r14)
            goto L2eb
        L2ea:
            r12 = 5
        L2eb:
            if (r26 == 0) goto L302
            int r14 = r36 + 1
            r4 = r27[r14]
            a.le r4 = r4.g
            a.M3[] r7 = r10.G
            r7 = r7[r14]
            a.le r8 = r7.g
            int r7 = r7.c()
            r14 = 8
            r1.f(r4, r8, r7, r14)
        L302:
            java.util.ArrayList<a.N3> r4 = r2.h
            if (r4 == 0) goto L41e
            int r7 = r4.size()
            r8 = 1
            if (r7 <= r8) goto L41e
            boolean r9 = r2.n
            if (r9 == 0) goto L31a
            boolean r9 = r2.p
            if (r9 != 0) goto L31a
            int r9 = r2.j
            float r9 = (float) r9
            r17 = r9
        L31a:
            r9 = r16
            r14 = r18
            r13 = 0
        L31f:
            if (r13 >= r7) goto L41e
            java.lang.Object r20 = r4.get(r13)
            r8 = r20
            a.N3 r8 = (a.N3) r8
            float[] r12 = r8.b0
            r12 = r12[r42]
            int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            a.M3[] r0 = r8.G
            r26 = r0
            if (r20 >= 0) goto L34d
            boolean r12 = r2.p
            if (r12 == 0) goto L34b
            int r0 = r36 + 1
            r0 = r26[r0]
            a.le r0 = r0.g
            r8 = r26[r36]
            a.le r8 = r8.g
            r20 = r4
            r4 = 4
            r12 = 0
            r1.e(r0, r8, r12, r4)
            goto L364
        L34b:
            r12 = 1065353216(0x3f800000, float:1.0)
        L34d:
            r20 = r4
            r4 = 4
            int r27 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r27 != 0) goto L36e
            int r0 = r36 + 1
            r0 = r26[r0]
            a.le r0 = r0.g
            r8 = r26[r36]
            a.le r8 = r8.g
            r4 = 8
            r12 = 0
            r1.e(r0, r8, r12, r4)
        L364:
            r34 = r7
            r19 = r12
            r37 = r18
            r18 = r13
            goto L410
        L36e:
            r19 = 0
            if (r9 == 0) goto L402
            a.M3[] r4 = r9.G
            r9 = r4[r36]
            a.le r9 = r9.g
            int r28 = r36 + 1
            r4 = r4[r28]
            a.le r4 = r4.g
            r0 = r26[r36]
            a.le r0 = r0.g
            r34 = r7
            r7 = r26[r28]
            a.le r7 = r7.g
            r26 = r8
            a.K1 r8 = r1.k()
            r28 = r12
            r12 = r18
            r8.b = r12
            int r18 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            r37 = r12
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r18 == 0) goto L3a0
            int r18 = (r14 > r28 ? 1 : (r14 == r28 ? 0 : -1))
            if (r18 != 0) goto L3a6
        L3a0:
            r18 = r13
            r13 = r12
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L3ea
        L3a6:
            int r18 = (r14 > r37 ? 1 : (r14 == r37 ? 0 : -1))
            if (r18 != 0) goto L3b9
            a.K1$a r0 = r8.d
            r7 = 1065353216(0x3f800000, float:1.0)
            r0.c(r9, r7)
            a.K1$a r0 = r8.d
            r0.c(r4, r12)
        L3b6:
            r18 = r13
            goto L3fe
        L3b9:
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r27 != 0) goto L3ca
            a.K1$a r4 = r8.d
            r4.c(r0, r12)
            a.K1$a r0 = r8.d
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.c(r7, r4)
            goto L3b6
        L3ca:
            float r14 = r14 / r17
            float r18 = r28 / r17
            float r14 = r14 / r18
            r18 = r13
            a.K1$a r13 = r8.d
            r13.c(r9, r12)
            a.K1$a r9 = r8.d
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9.c(r4, r13)
            a.K1$a r4 = r8.d
            r4.c(r7, r14)
            a.K1$a r4 = r8.d
            float r7 = -r14
            r4.c(r0, r7)
            goto L3fe
        L3ea:
            a.K1$a r14 = r8.d
            r14.c(r9, r12)
            a.K1$a r9 = r8.d
            r9.c(r4, r13)
            a.K1$a r4 = r8.d
            r4.c(r7, r12)
            a.K1$a r4 = r8.d
            r4.c(r0, r13)
        L3fe:
            r1.c(r8)
            goto L40c
        L402:
            r34 = r7
            r26 = r8
            r28 = r12
            r37 = r18
            r18 = r13
        L40c:
            r9 = r26
            r14 = r28
        L410:
            int r13 = r18 + 1
            r4 = r20
            r7 = r34
            r18 = r37
            r8 = 1
            r12 = 5
            r0 = r40
            goto L31f
        L41e:
            r19 = 0
            if (r11 == 0) goto L427
            if (r11 == r3) goto L42b
            if (r32 == 0) goto L427
            goto L42b
        L427:
            r0 = r3
            r25 = 2
            goto L481
        L42b:
            a.M3[] r0 = r5.G
            r0 = r0[r36]
            a.M3[] r2 = r10.G
            int r14 = r36 + 1
            r2 = r2[r14]
            a.M3 r0 = r0.d
            if (r0 == 0) goto L43c
            a.le r0 = r0.g
            goto L43e
        L43c:
            r0 = r16
        L43e:
            a.M3 r2 = r2.d
            if (r2 == 0) goto L445
            a.le r2 = r2.g
            goto L447
        L445:
            r2 = r16
        L447:
            a.M3[] r4 = r11.G
            r4 = r4[r36]
            a.M3[] r5 = r3.G
            r5 = r5[r14]
            if (r0 == 0) goto L47a
            if (r2 == 0) goto L47a
            if (r42 != 0) goto L458
            float r6 = r6.U
            goto L45a
        L458:
            float r6 = r6.V
        L45a:
            int r7 = r4.c()
            int r8 = r5.c()
            a.le r4 = r4.g
            a.le r5 = r5.g
            r9 = 7
            r25 = r3
            r3 = r0
            r0 = r25
            r25 = r6
            r6 = r2
            r2 = r4
            r4 = r7
            r7 = r5
            r5 = r25
            r25 = 2
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L47d
        L47a:
            r0 = r3
            r25 = 2
        L47d:
            r1 = r41
            goto L67a
        L481:
            if (r23 == 0) goto L570
            if (r11 == 0) goto L570
            int r1 = r2.j
            if (r1 <= 0) goto L490
            int r2 = r2.i
            if (r2 != r1) goto L490
            r21 = 1
            goto L492
        L490:
            r21 = r19
        L492:
            r12 = r11
            r13 = r12
        L494:
            if (r12 == 0) goto L47d
            a.N3[] r1 = r12.d0
            r1 = r1[r42]
            r14 = r1
        L49b:
            if (r14 == 0) goto L4a8
            int r1 = r14.X
            r4 = 8
            if (r1 != r4) goto L4aa
            a.N3[] r1 = r14.d0
            r14 = r1[r42]
            goto L49b
        L4a8:
            r4 = 8
        L4aa:
            if (r14 != 0) goto L4b8
            if (r12 != r0) goto L4af
            goto L4b8
        L4af:
            r38 = r5
            r17 = r13
            r30 = 5
            r13 = r4
            goto L563
        L4b8:
            a.M3[] r1 = r12.G
            r2 = r1[r36]
            a.le r3 = r2.g
            a.M3 r6 = r2.d
            if (r6 == 0) goto L4c5
            a.le r6 = r6.g
            goto L4c7
        L4c5:
            r6 = r16
        L4c7:
            if (r13 == r12) goto L4d2
            a.M3[] r6 = r13.G
            int r7 = r36 + 1
            r6 = r6[r7]
            a.le r6 = r6.g
            goto L4e3
        L4d2:
            if (r12 != r11) goto L4e3
            if (r13 != r12) goto L4e3
            a.M3[] r6 = r5.G
            r6 = r6[r36]
            a.M3 r6 = r6.d
            if (r6 == 0) goto L4e1
            a.le r6 = r6.g
            goto L4e3
        L4e1:
            r6 = r16
        L4e3:
            int r2 = r2.c()
            int r7 = r36 + 1
            r8 = r1[r7]
            int r8 = r8.c()
            if (r14 == 0) goto L4fc
            a.M3[] r9 = r14.G
            r9 = r9[r36]
            a.le r4 = r9.g
            r1 = r1[r7]
            a.le r1 = r1.g
            goto L50d
        L4fc:
            a.M3[] r4 = r10.G
            r4 = r4[r7]
            a.M3 r9 = r4.d
            if (r9 == 0) goto L507
            a.le r4 = r9.g
            goto L509
        L507:
            r4 = r16
        L509:
            r1 = r1[r7]
            a.le r1 = r1.g
        L50d:
            if (r9 == 0) goto L514
            int r9 = r9.c()
            int r8 = r8 + r9
        L514:
            if (r13 == 0) goto L51f
            a.M3[] r9 = r13.G
            r9 = r9[r7]
            int r9 = r9.c()
            int r2 = r2 + r9
        L51f:
            if (r3 == 0) goto L55b
            if (r6 == 0) goto L55b
            if (r4 == 0) goto L55b
            if (r1 == 0) goto L55b
            if (r12 != r11) goto L531
            a.M3[] r2 = r11.G
            r2 = r2[r36]
            int r2 = r2.c()
        L531:
            if (r12 != r0) goto L53b
            a.M3[] r8 = r0.G
            r7 = r8[r7]
            int r8 = r7.c()
        L53b:
            if (r21 == 0) goto L541
            r9 = 8
        L53f:
            r7 = r5
            goto L543
        L541:
            r9 = 5
            goto L53f
        L543:
            r5 = 1056964608(0x3f000000, float:0.5)
            r17 = r4
            r4 = r2
            r2 = r3
            r3 = r6
            r6 = r17
            r38 = r7
            r17 = r13
            r13 = 8
            r30 = 5
            r7 = r1
            r1 = r41
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L563
        L55b:
            r38 = r5
            r17 = r13
            r13 = 8
            r30 = 5
        L563:
            int r1 = r12.X
            if (r1 == r13) goto L569
            r17 = r12
        L569:
            r12 = r14
            r13 = r17
            r5 = r38
            goto L494
        L570:
            r38 = r5
            r13 = 8
            if (r24 == 0) goto L47d
            if (r11 == 0) goto L47d
            int r1 = r2.j
            if (r1 <= 0) goto L583
            int r2 = r2.i
            if (r2 != r1) goto L583
            r21 = 1
            goto L585
        L583:
            r21 = r19
        L585:
            r12 = r11
            r14 = r12
        L587:
            if (r12 == 0) goto L625
            a.N3[] r1 = r12.d0
            r1 = r1[r42]
        L58d:
            if (r1 == 0) goto L598
            int r2 = r1.X
            if (r2 != r13) goto L598
            a.N3[] r1 = r1.d0
            r1 = r1[r42]
            goto L58d
        L598:
            if (r12 == r11) goto L619
            if (r12 == r0) goto L619
            if (r1 == 0) goto L619
            if (r1 != r0) goto L5a2
            r1 = r16
        L5a2:
            a.M3[] r2 = r12.G
            r3 = r2[r36]
            r4 = r2
            a.le r2 = r3.g
            a.M3[] r5 = r14.G
            int r6 = r36 + 1
            r5 = r5[r6]
            a.le r5 = r5.g
            int r3 = r3.c()
            r7 = r4[r6]
            int r7 = r7.c()
            if (r1 == 0) goto L5cd
            a.M3[] r4 = r1.G
            r4 = r4[r36]
            a.le r8 = r4.g
            a.M3 r9 = r4.d
            if (r9 == 0) goto L5ca
            a.le r9 = r9.g
            goto L5e2
        L5ca:
            r9 = r16
            goto L5e2
        L5cd:
            a.M3[] r8 = r0.G
            r8 = r8[r36]
            if (r8 == 0) goto L5d6
            a.le r9 = r8.g
            goto L5d8
        L5d6:
            r9 = r16
        L5d8:
            r4 = r4[r6]
            a.le r4 = r4.g
            r39 = r9
            r9 = r4
            r4 = r8
            r8 = r39
        L5e2:
            if (r4 == 0) goto L5e9
            int r4 = r4.c()
            int r7 = r7 + r4
        L5e9:
            a.M3[] r4 = r14.G
            r4 = r4[r6]
            int r4 = r4.c()
            int r4 = r4 + r3
            r6 = r8
            r8 = r7
            r7 = r9
            if (r21 == 0) goto L5f9
            r9 = r13
            goto L5fa
        L5f9:
            r9 = 4
        L5fa:
            if (r2 == 0) goto L610
            if (r5 == 0) goto L610
            if (r6 == 0) goto L610
            if (r7 == 0) goto L610
            r3 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r17 = r1
            r29 = 4
            r1 = r41
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            goto L616
        L610:
            r2 = r41
            r17 = r1
            r29 = 4
        L616:
            r1 = r17
            goto L61d
        L619:
            r2 = r41
            r29 = 4
        L61d:
            int r3 = r12.X
            if (r3 == r13) goto L622
            r14 = r12
        L622:
            r12 = r1
            goto L587
        L625:
            r2 = r41
            a.M3[] r1 = r11.G
            r1 = r1[r36]
            r7 = r38
            a.M3[] r3 = r7.G
            r3 = r3[r36]
            a.M3 r3 = r3.d
            a.M3[] r4 = r0.G
            int r14 = r36 + 1
            r12 = r4[r14]
            a.M3[] r4 = r10.G
            r4 = r4[r14]
            a.M3 r13 = r4.d
            r9 = 5
            if (r3 == 0) goto L64f
            if (r11 == r0) goto L651
            a.le r4 = r1.g
            a.le r3 = r3.g
            int r1 = r1.c()
            r2.e(r4, r3, r1, r9)
        L64f:
            r1 = r2
            goto L66a
        L651:
            if (r13 == 0) goto L64f
            a.le r2 = r1.g
            a.le r3 = r3.g
            int r4 = r1.c()
            a.le r6 = r12.g
            a.le r7 = r13.g
            int r8 = r12.c()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r41
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L66a:
            if (r13 == 0) goto L67a
            if (r11 == r0) goto L67a
            a.le r2 = r12.g
            a.le r3 = r13.g
            int r4 = r12.c()
            int r4 = -r4
            r1.e(r2, r3, r4, r9)
        L67a:
            if (r23 != 0) goto L67e
            if (r24 == 0) goto L6cf
        L67e:
            if (r11 == 0) goto L6cf
            if (r11 == r0) goto L6cf
            a.M3[] r2 = r11.G
            r3 = r2[r36]
            a.M3[] r4 = r0.G
            int r14 = r36 + 1
            r4 = r4[r14]
            a.M3 r5 = r3.d
            if (r5 == 0) goto L693
            a.le r5 = r5.g
            goto L695
        L693:
            r5 = r16
        L695:
            a.M3 r6 = r4.d
            if (r6 == 0) goto L69c
            a.le r6 = r6.g
            goto L69e
        L69c:
            r6 = r16
        L69e:
            if (r10 == r0) goto L6ae
            a.M3[] r6 = r10.G
            r6 = r6[r14]
            a.M3 r6 = r6.d
            if (r6 == 0) goto L6ac
            a.le r6 = r6.g
            r16 = r6
        L6ac:
            r6 = r16
        L6ae:
            if (r11 != r0) goto L6b2
            r4 = r2[r14]
        L6b2:
            if (r5 == 0) goto L6cf
            if (r6 == 0) goto L6cf
            int r2 = r3.c()
            a.M3[] r0 = r0.G
            r0 = r0[r14]
            int r8 = r0.c()
            a.le r0 = r3.g
            a.le r7 = r4.g
            r9 = 5
            r3 = r5
            r5 = 1056964608(0x3f000000, float:0.5)
            r4 = r2
            r2 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L6cf:
            int r15 = r15 + 1
            r0 = r40
            r1 = r41
            r12 = r31
            r13 = r35
            r14 = r36
            goto L15
        L6dd:
            return
    }
}
