package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h31 extends p000.t31 {

    /* JADX INFO: renamed from: γ */
    public final p000.q01 f4557;

    /* JADX INFO: renamed from: δ */
    public final p000.C0891v f4558;

    /* JADX INFO: renamed from: ε */
    public final p000.zv0 f4559;

    /* JADX INFO: renamed from: ζ */
    public p000.q31 f4560;

    /* JADX INFO: renamed from: η */
    public p000.vh1 f4561;

    /* JADX INFO: renamed from: θ */
    public boolean f4562;

    /* JADX INFO: renamed from: ι */
    public boolean f4563;

    /* JADX INFO: renamed from: κ */
    public boolean f4564;

    public h31(p000.q01 r3) {
            r2 = this;
            r2.<init>()
            r2.f4557 = r3
            v r3 = new v
            r3.<init>()
            r0 = 2
            long[] r1 = new long[r0]
            r3.f11045 = r1
            r2.f4558 = r3
            zv0 r3 = new zv0
            r3.<init>(r0)
            r2.f4559 = r3
            r3 = 1
            r2.f4563 = r3
            r2.f4564 = r3
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Node(modifierNode="
            r0.<init>(r1)
            q01 r1 = r2.f4557
            r0.append(r1)
            java.lang.String r1 = ", children="
            r0.append(r1)
            k21 r1 = r2.f10166
            r0.append(r1)
            java.lang.String r1 = ", pointerIds="
            r0.append(r1)
            v r2 = r2.f4558
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.t31
    /* JADX INFO: renamed from: α */
    public final boolean mo2353(p000.zv0 r56, p000.mp0 r57, p000.C0574n5 r58, boolean r59) {
            r55 = this;
            r0 = r55
            r1 = r56
            r2 = r57
            r3 = r58
            boolean r4 = super.mo2353(r56, r57, r58, r59)
            q01 r5 = r0.f4557
            boolean r6 = r5.f8784
            r7 = 1
            if (r6 != 0) goto L14
            goto L63
        L14:
            r8 = 0
        L15:
            if (r5 == 0) goto L5f
            boolean r10 = r5 instanceof p000.di1
            r11 = 16
            if (r10 == 0) goto L26
            di1 r5 = (p000.di1) r5
            q31 r5 = p000.h62.m2443(r5, r11)
            r0.f4560 = r5
            goto L5a
        L26:
            int r10 = r5.f8773
            r10 = r10 & r11
            if (r10 == 0) goto L5a
            boolean r10 = r5 instanceof p000.C1014ya
            if (r10 == 0) goto L5a
            r10 = r5
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r9 = 0
        L35:
            if (r10 == 0) goto L57
            int r12 = r10.f8773
            r12 = r12 & r11
            if (r12 == 0) goto L54
            int r9 = r9 + 1
            if (r9 != r7) goto L42
            r5 = r10
            goto L54
        L42:
            if (r8 != 0) goto L4b
            k21 r8 = new k21
            q01[] r12 = new p000.q01[r11]
            r8.<init>(r12)
        L4b:
            if (r5 == 0) goto L51
            r8.m3127(r5)
            r5 = 0
        L51:
            r8.m3127(r10)
        L54:
            q01 r10 = r10.f8776
            goto L35
        L57:
            if (r9 != r7) goto L5a
            goto L15
        L5a:
            q01 r5 = p000.h62.m2387(r8)
            goto L15
        L5f:
            q31 r5 = r0.f4560
            if (r5 != 0) goto L64
        L63:
            return r7
        L64:
            int r5 = r1.m7238()
            r8 = 0
        L69:
            v r10 = r0.f4558
            zv0 r11 = r0.f4559
            if (r8 >= r5) goto L1ab
            long r12 = r1.m7235(r8)
            java.lang.Object r14 = r1.m7239(r8)
            ai1 r14 = (p000.ai1) r14
            boolean r10 = r10.m6010(r12)
            if (r10 == 0) goto L197
            r15 = r7
            long r6 = r14.f265
            java.util.ArrayList r10 = r14.f271
            r16 = r10
            long r9 = r14.f261
            r17 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r19 = r6 & r17
            r21 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r19 = r19 + r21
            r23 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r19 = r19 & r23
            r25 = 0
            int r19 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r19 != 0) goto L18e
            long r19 = r9 & r17
            long r19 = r19 + r21
            long r19 = r19 & r23
            int r19 = (r19 > r25 ? 1 : (r19 == r25 ? 0 : -1))
            if (r19 != 0) goto L18e
            r19 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            jz r20 = p000.C0450jz.f5672
            if (r16 != 0) goto Lba
            r27 = r20
        Lb7:
            r50 = r4
            goto Lbd
        Lba:
            r27 = r16
            goto Lb7
        Lbd:
            int r4 = r27.size()
            r15.<init>(r4)
            if (r16 != 0) goto Lcb
            r4 = r20
        Lc8:
            r16 = r5
            goto Lce
        Lcb:
            r4 = r16
            goto Lc8
        Lce:
            int r5 = r4.size()
            r20 = r8
            r8 = 0
        Ld5:
            if (r8 >= r5) goto L12a
            java.lang.Object r27 = r4.get(r8)
            r28 = r4
            r4 = r27
            je0 r4 = (p000.je0) r4
            r51 = r11
            r52 = r12
            long r11 = r4.f5439
            long r29 = r11 & r17
            long r29 = r29 + r21
            long r29 = r29 & r23
            int r13 = (r29 > r25 ? 1 : (r29 == r25 ? 0 : -1))
            if (r13 != 0) goto L119
            je0 r29 = new je0
            r54 = r14
            long r13 = r4.f5438
            r27 = r5
            q31 r5 = r0.f4560
            r5.getClass()
            long r32 = r5.mo2332(r2, r11)
            float r5 = r4.f5440
            long r11 = r4.f5441
            r34 = r5
            long r4 = r4.f5442
            r37 = r4
            r35 = r11
            r30 = r13
            r29.<init>(r30, r32, r34, r35, r37)
            r4 = r29
            r15.add(r4)
            goto L11d
        L119:
            r27 = r5
            r54 = r14
        L11d:
            int r8 = r8 + 1
            r5 = r27
            r4 = r28
            r11 = r51
            r12 = r52
            r14 = r54
            goto Ld5
        L12a:
            r51 = r11
            r52 = r12
            r54 = r14
            q31 r4 = r0.f4560
            r4.getClass()
            long r38 = r4.mo2332(r2, r6)
            q31 r4 = r0.f4560
            r4.getClass()
            long r32 = r4.mo2332(r2, r9)
            long r4 = r14.f259
            long r6 = r14.f260
            boolean r8 = r14.f262
            long r9 = r14.f264
            boolean r11 = r14.f266
            int r12 = r14.f267
            r28 = r4
            long r4 = r14.f268
            float r13 = r14.f263
            ai1 r27 = new ai1
            float r2 = r14.f269
            r43 = r4
            long r4 = r14.f270
            r46 = r4
            long r4 = r14.f272
            r45 = r2
            r48 = r4
            r30 = r6
            r34 = r8
            r36 = r9
            r40 = r11
            r41 = r12
            r35 = r13
            r42 = r15
            r27.<init>(r28, r30, r32, r34, r35, r36, r38, r40, r41, r42, r43, r45, r46, r48)
            r2 = r27
            ai1 r4 = r14.f275
            if (r4 != 0) goto L17c
            r4 = r14
        L17c:
            r2.f275 = r4
            ai1 r4 = r14.f275
            if (r4 != 0) goto L183
            goto L184
        L183:
            r14 = r4
        L184:
            r2.f275 = r14
            r6 = r51
            r4 = r52
            r6.m7236(r4, r2)
            goto L19f
        L18e:
            r50 = r4
            r16 = r5
            r20 = r8
            r19 = r15
            goto L19f
        L197:
            r50 = r4
            r16 = r5
            r19 = r7
            r20 = r8
        L19f:
            int r8 = r20 + 1
            r2 = r57
            r5 = r16
            r7 = r19
            r4 = r50
            goto L69
        L1ab:
            r50 = r4
            r19 = r7
            r6 = r11
            int r2 = r6.m7238()
            if (r2 != 0) goto L1bf
            r2 = 0
            r10.f11044 = r2
            k21 r0 = r0.f10166
            r0.m3132()
            return r19
        L1bf:
            int r2 = r10.f11044
            int r2 = r2 + (-1)
        L1c3:
            r4 = -1
            if (r4 >= r2) goto L227
            java.lang.Object r5 = r10.f11045
            long[] r5 = (long[]) r5
            r7 = r5[r2]
            boolean r5 = r1.f13315
            if (r5 == 0) goto L1fc
            int r5 = r1.f13318
            long[] r9 = r1.f13316
            java.lang.Object[] r11 = r1.f13317
            r12 = 0
            r13 = r12
            r14 = r13
        L1d9:
            if (r13 >= r5) goto L1f5
            r15 = r11[r13]
            r57 = r4
            java.lang.Object r4 = p000.h62.f4591
            if (r15 == r4) goto L1f0
            if (r13 == r14) goto L1ee
            r16 = r9[r13]
            r9[r14] = r16
            r11[r14] = r15
            r4 = 0
            r11[r13] = r4
        L1ee:
            int r14 = r14 + 1
        L1f0:
            int r13 = r13 + 1
            r4 = r57
            goto L1d9
        L1f5:
            r57 = r4
            r1.f13315 = r12
            r1.f13318 = r14
            goto L1fe
        L1fc:
            r57 = r4
        L1fe:
            long[] r4 = r1.f13316
            int r5 = r1.f13318
            int r4 = p000.AbstractC1021yh.m6881(r4, r5, r7)
            if (r4 < 0) goto L209
            goto L224
        L209:
            int r4 = r10.f11044
            if (r2 >= r4) goto L224
            int r4 = r4 + (-1)
            r5 = r2
        L210:
            if (r5 >= r4) goto L21e
            java.lang.Object r7 = r10.f11045
            long[] r7 = (long[]) r7
            int r8 = r5 + 1
            r11 = r7[r8]
            r7[r5] = r11
            r5 = r8
            goto L210
        L21e:
            int r4 = r10.f11044
            int r4 = r4 + (-1)
            r10.f11044 = r4
        L224:
            int r2 = r2 + (-1)
            goto L1c3
        L227:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.m7238()
            r1.<init>(r2)
            int r2 = r6.m7238()
            r4 = 0
        L235:
            if (r4 >= r2) goto L241
            java.lang.Object r5 = r6.m7239(r4)
            r1.add(r5)
            int r4 = r4 + 1
            goto L235
        L241:
            vh1 r2 = new vh1
            r2.<init>(r1, r3)
            int r4 = r1.size()
            r5 = 0
        L24b:
            if (r5 >= r4) goto L260
            java.lang.Object r6 = r1.get(r5)
            r7 = r6
            ai1 r7 = (p000.ai1) r7
            long r7 = r7.f259
            boolean r7 = r3.m3984(r7)
            if (r7 == 0) goto L25d
            goto L261
        L25d:
            int r5 = r5 + 1
            goto L24b
        L260:
            r6 = 0
        L261:
            ai1 r6 = (p000.ai1) r6
            r1 = 3
            if (r6 == 0) goto L2f3
            boolean r3 = r6.f262
            if (r59 != 0) goto L26e
            r4 = 0
            r0.f4563 = r4
            goto L2c5
        L26e:
            r4 = 0
            boolean r5 = r0.f4563
            if (r5 != 0) goto L2c5
            if (r3 != 0) goto L279
            boolean r5 = r6.f266
            if (r5 == 0) goto L2c5
        L279:
            q31 r5 = r0.f4560
            r5.getClass()
            long r7 = r5.f2117
            long r5 = r6.f261
            r9 = 32
            long r10 = r5 >> r9
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r11
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r13 = r7 >> r9
            int r6 = (int) r13
            long r7 = r7 & r11
            int r7 = (int) r7
            r8 = 0
            int r9 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r9 >= 0) goto L2a3
            r9 = r19
            goto L2a4
        L2a3:
            r9 = r4
        L2a4:
            float r6 = (float) r6
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 <= 0) goto L2ac
            r6 = r19
            goto L2ad
        L2ac:
            r6 = r4
        L2ad:
            r6 = r6 | r9
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 >= 0) goto L2b5
            r8 = r19
            goto L2b6
        L2b5:
            r8 = r4
        L2b6:
            r6 = r6 | r8
            float r7 = (float) r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L2bf
            r5 = r19
            goto L2c0
        L2bf:
            r5 = r4
        L2c0:
            r5 = r5 | r6
            r5 = r5 ^ 1
            r0.f4563 = r5
        L2c5:
            boolean r5 = r0.f4563
            boolean r6 = r0.f4562
            r7 = 5
            r8 = 4
            if (r5 == r6) goto L2dd
            int r9 = r2.f11296
            if (r9 != r1) goto L2d2
            goto L2d7
        L2d2:
            if (r9 != r8) goto L2d5
            goto L2d7
        L2d5:
            if (r9 != r7) goto L2dd
        L2d7:
            if (r5 == 0) goto L2da
            r7 = r8
        L2da:
            r2.f11296 = r7
            goto L2f4
        L2dd:
            int r9 = r2.f11296
            if (r9 != r8) goto L2ea
            if (r6 == 0) goto L2ea
            boolean r6 = r0.f4564
            if (r6 != 0) goto L2ea
            r2.f11296 = r1
            goto L2f4
        L2ea:
            if (r9 != r7) goto L2f4
            if (r5 == 0) goto L2f4
            if (r3 == 0) goto L2f4
            r2.f11296 = r1
            goto L2f4
        L2f3:
            r4 = 0
        L2f4:
            if (r50 != 0) goto L330
            int r3 = r2.f11296
            if (r3 != r1) goto L330
            vh1 r1 = r0.f4561
            if (r1 == 0) goto L330
            java.lang.Object r1 = r1.f11293
            int r3 = r1.size()
            java.lang.Object r5 = r2.f11293
            int r6 = r5.size()
            if (r3 == r6) goto L30d
            goto L330
        L30d:
            int r3 = r5.size()
            r6 = r4
        L312:
            if (r6 >= r3) goto L32e
            java.lang.Object r7 = r1.get(r6)
            ai1 r7 = (p000.ai1) r7
            java.lang.Object r8 = r5.get(r6)
            ai1 r8 = (p000.ai1) r8
            long r9 = r7.f261
            long r7 = r8.f261
            boolean r7 = p000.o41.m4203(r9, r7)
            if (r7 != 0) goto L32b
            goto L330
        L32b:
            int r6 = r6 + 1
            goto L312
        L32e:
            r7 = r4
            goto L332
        L330:
            r7 = r19
        L332:
            r0.f4561 = r2
            return r7
    }

    @Override // p000.t31
    /* JADX INFO: renamed from: β */
    public final void mo2354(p000.C0574n5 r11) {
            r10 = this;
            super.mo2354(r11)
            vh1 r0 = r10.f4561
            if (r0 != 0) goto L8
            return
        L8:
            boolean r1 = r10.f4563
            r10.f4562 = r1
            java.lang.Object r1 = r0.f11293
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L14:
            if (r4 >= r2) goto L36
            java.lang.Object r5 = r1.get(r4)
            ai1 r5 = (p000.ai1) r5
            boolean r6 = r5.f262
            long r7 = r5.f259
            boolean r5 = r11.m3984(r7)
            boolean r9 = r10.f4563
            if (r6 != 0) goto L2a
            if (r5 == 0) goto L2e
        L2a:
            if (r6 != 0) goto L33
            if (r9 != 0) goto L33
        L2e:
            v r5 = r10.f4558
            r5.m6013(r7)
        L33:
            int r4 = r4 + 1
            goto L14
        L36:
            r10.f4563 = r3
            int r11 = r0.f11296
            r0 = 5
            if (r11 != r0) goto L3e
            r3 = 1
        L3e:
            r10.f4564 = r3
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m2355() {
            r8 = this;
            k21 r0 = r8.f10166
            java.lang.Object[] r1 = r0.f5716
            int r0 = r0.f5718
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r0) goto L14
            r4 = r1[r3]
            h31 r4 = (p000.h31) r4
            r4.m2355()
            int r3 = r3 + 1
            goto L8
        L14:
            r0 = 0
            q01 r8 = r8.f4557
            r1 = r0
        L18:
            if (r8 == 0) goto L60
            boolean r3 = r8 instanceof p000.di1
            if (r3 == 0) goto L24
            di1 r8 = (p000.di1) r8
            r8.mo1750()
            goto L5b
        L24:
            int r3 = r8.f8773
            r4 = 16
            r3 = r3 & r4
            if (r3 == 0) goto L5b
            boolean r3 = r8 instanceof p000.C1014ya
            if (r3 == 0) goto L5b
            r3 = r8
            ya r3 = (p000.C1014ya) r3
            q01 r3 = r3.f12512
            r5 = r2
        L35:
            r6 = 1
            if (r3 == 0) goto L58
            int r7 = r3.f8773
            r7 = r7 & r4
            if (r7 == 0) goto L55
            int r5 = r5 + 1
            if (r5 != r6) goto L43
            r8 = r3
            goto L55
        L43:
            if (r1 != 0) goto L4c
            k21 r1 = new k21
            q01[] r6 = new p000.q01[r4]
            r1.<init>(r6)
        L4c:
            if (r8 == 0) goto L52
            r1.m3127(r8)
            r8 = r0
        L52:
            r1.m3127(r3)
        L55:
            q01 r3 = r3.f8776
            goto L35
        L58:
            if (r5 != r6) goto L5b
            goto L18
        L5b:
            q01 r8 = p000.h62.m2387(r1)
            goto L18
        L60:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m2356(p000.C0574n5 r15) {
            r14 = this;
            zv0 r0 = r14.f4559
            int r1 = r0.m7238()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Lc
            goto La4
        Lc:
            q01 r1 = r14.f4557
            boolean r4 = r1.f8784
            if (r4 != 0) goto L14
            goto La4
        L14:
            q31 r4 = r1.f8778
            if (r4 == 0) goto L21
            yp0 r4 = r4.f8839
            if (r4 == 0) goto L21
            boolean r4 = r4.m6978()
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 != 0) goto L26
            goto La4
        L26:
            vh1 r4 = r14.f4561
            r4.getClass()
            q31 r5 = r14.f4560
            r5.getClass()
            long r5 = r5.f2117
            r7 = r1
            r8 = r2
        L34:
            r9 = 1
            if (r7 == 0) goto L8d
            boolean r10 = r7 instanceof p000.di1
            if (r10 == 0) goto L45
            r10 = r7
            di1 r10 = (p000.di1) r10
            wh1 r11 = p000.wh1.f11722
            r10.mo1747(r4, r11, r5)
            r10 = r3
            goto L46
        L45:
            r10 = r9
        L46:
            if (r10 == 0) goto L88
            int r10 = r7.f8773
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L51
            r10 = r9
            goto L52
        L51:
            r10 = r3
        L52:
            if (r10 == 0) goto L88
            boolean r10 = r7 instanceof p000.C1014ya
            if (r10 == 0) goto L88
            r10 = r7
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r12 = r3
        L5e:
            if (r10 == 0) goto L85
            int r13 = r10.f8773
            r13 = r13 & r11
            if (r13 == 0) goto L67
            r13 = r9
            goto L68
        L67:
            r13 = r3
        L68:
            if (r13 == 0) goto L82
            int r12 = r12 + 1
            if (r12 != r9) goto L70
            r7 = r10
            goto L82
        L70:
            if (r8 != 0) goto L79
            k21 r8 = new k21
            q01[] r13 = new p000.q01[r11]
            r8.<init>(r13)
        L79:
            if (r7 == 0) goto L7f
            r8.m3127(r7)
            r7 = r2
        L7f:
            r8.m3127(r10)
        L82:
            q01 r10 = r10.f8776
            goto L5e
        L85:
            if (r12 != r9) goto L88
            goto L34
        L88:
            q01 r7 = p000.h62.m2387(r8)
            goto L34
        L8d:
            boolean r1 = r1.f8784
            if (r1 == 0) goto La3
            k21 r1 = r14.f10166
            java.lang.Object[] r4 = r1.f5716
            int r1 = r1.f5718
        L97:
            if (r3 >= r1) goto La3
            r5 = r4[r3]
            h31 r5 = (p000.h31) r5
            r5.m2356(r15)
            int r3 = r3 + 1
            goto L97
        La3:
            r3 = r9
        La4:
            r14.mo2354(r15)
            r0.m7233()
            r14.f4560 = r2
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m2357(p000.C0574n5 r14, boolean r15) {
            r13 = this;
            zv0 r0 = r13.f4559
            int r0 = r0.m7238()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            q01 r0 = r13.f4557
            boolean r2 = r0.f8784
            if (r2 != 0) goto L11
            goto L21
        L11:
            q31 r2 = r0.f8778
            if (r2 == 0) goto L1e
            yp0 r2 = r2.f8839
            if (r2 == 0) goto L1e
            boolean r2 = r2.m6978()
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 != 0) goto L22
        L21:
            return r1
        L22:
            vh1 r2 = r13.f4561
            r2.getClass()
            q31 r3 = r13.f4560
            r3.getClass()
            long r3 = r3.f2117
            r5 = 0
            r6 = r0
            r7 = r5
        L31:
            r8 = 16
            r9 = 1
            if (r6 == 0) goto L8a
            boolean r10 = r6 instanceof p000.di1
            if (r10 == 0) goto L44
            r10 = r6
            di1 r10 = (p000.di1) r10
            wh1 r11 = p000.wh1.f11720
            r10.mo1747(r2, r11, r3)
            r10 = r1
            goto L45
        L44:
            r10 = r9
        L45:
            if (r10 == 0) goto L85
            int r10 = r6.f8773
            r10 = r10 & r8
            if (r10 == 0) goto L4e
            r10 = r9
            goto L4f
        L4e:
            r10 = r1
        L4f:
            if (r10 == 0) goto L85
            boolean r10 = r6 instanceof p000.C1014ya
            if (r10 == 0) goto L85
            r10 = r6
            ya r10 = (p000.C1014ya) r10
            q01 r10 = r10.f12512
            r11 = r1
        L5b:
            if (r10 == 0) goto L82
            int r12 = r10.f8773
            r12 = r12 & r8
            if (r12 == 0) goto L64
            r12 = r9
            goto L65
        L64:
            r12 = r1
        L65:
            if (r12 == 0) goto L7f
            int r11 = r11 + 1
            if (r11 != r9) goto L6d
            r6 = r10
            goto L7f
        L6d:
            if (r7 != 0) goto L76
            k21 r7 = new k21
            q01[] r12 = new p000.q01[r8]
            r7.<init>(r12)
        L76:
            if (r6 == 0) goto L7c
            r7.m3127(r6)
            r6 = r5
        L7c:
            r7.m3127(r10)
        L7f:
            q01 r10 = r10.f8776
            goto L5b
        L82:
            if (r11 != r9) goto L85
            goto L31
        L85:
            q01 r6 = p000.h62.m2387(r7)
            goto L31
        L8a:
            boolean r6 = r0.f8784
            if (r6 == 0) goto La6
            k21 r6 = r13.f10166
            java.lang.Object[] r7 = r6.f5716
            int r6 = r6.f5718
            r10 = r1
        L95:
            if (r10 >= r6) goto La6
            r11 = r7[r10]
            h31 r11 = (p000.h31) r11
            q31 r12 = r13.f4560
            r12.getClass()
            r11.m2357(r14, r15)
            int r10 = r10 + 1
            goto L95
        La6:
            boolean r13 = r0.f8784
            if (r13 == 0) goto L101
            r13 = r5
        Lab:
            if (r0 == 0) goto L101
            boolean r14 = r0 instanceof p000.di1
            if (r14 == 0) goto Lbb
            r14 = r0
            di1 r14 = (p000.di1) r14
            wh1 r15 = p000.wh1.f11721
            r14.mo1747(r2, r15, r3)
            r14 = r1
            goto Lbc
        Lbb:
            r14 = r9
        Lbc:
            if (r14 == 0) goto Lfc
            int r14 = r0.f8773
            r14 = r14 & r8
            if (r14 == 0) goto Lc5
            r14 = r9
            goto Lc6
        Lc5:
            r14 = r1
        Lc6:
            if (r14 == 0) goto Lfc
            boolean r14 = r0 instanceof p000.C1014ya
            if (r14 == 0) goto Lfc
            r14 = r0
            ya r14 = (p000.C1014ya) r14
            q01 r14 = r14.f12512
            r15 = r1
        Ld2:
            if (r14 == 0) goto Lf9
            int r6 = r14.f8773
            r6 = r6 & r8
            if (r6 == 0) goto Ldb
            r6 = r9
            goto Ldc
        Ldb:
            r6 = r1
        Ldc:
            if (r6 == 0) goto Lf6
            int r15 = r15 + 1
            if (r15 != r9) goto Le4
            r0 = r14
            goto Lf6
        Le4:
            if (r13 != 0) goto Led
            k21 r13 = new k21
            q01[] r6 = new p000.q01[r8]
            r13.<init>(r6)
        Led:
            if (r0 == 0) goto Lf3
            r13.m3127(r0)
            r0 = r5
        Lf3:
            r13.m3127(r14)
        Lf6:
            q01 r14 = r14.f8776
            goto Ld2
        Lf9:
            if (r15 != r9) goto Lfc
            goto Lab
        Lfc:
            q01 r0 = p000.h62.m2387(r13)
            goto Lab
        L101:
            return r9
    }

    /* JADX INFO: renamed from: ζ */
    public final void m2358(long r4, p000.v11 r6) {
            r3 = this;
            v r0 = r3.f4558
            boolean r1 = r0.m6010(r4)
            if (r1 == 0) goto L17
            int r1 = r6.m6021(r3)
            if (r1 < 0) goto Lf
            goto L17
        Lf:
            r0.m6013(r4)
            zv0 r0 = r3.f4559
            r0.m7237(r4)
        L17:
            k21 r3 = r3.f10166
            java.lang.Object[] r0 = r3.f5716
            int r3 = r3.f5718
            r1 = 0
        L1e:
            if (r1 >= r3) goto L2a
            r2 = r0[r1]
            h31 r2 = (p000.h31) r2
            r2.m2358(r4, r6)
            int r1 = r1 + 1
            goto L1e
        L2a:
            return
    }
}
