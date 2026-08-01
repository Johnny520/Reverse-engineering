package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v8 extends defpackage.qb0 {
    public final java.util.ArrayList k;
    public int l;

    public v8(defpackage.pc r6, int r7) {
            r5 = this;
            r5.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.k = r6
            r5.f = r7
            pc r0 = r5.b
            pc r7 = r0.k(r7)
        L12:
            r4 = r0
            r0 = r7
            r7 = r4
            if (r0 == 0) goto L1e
            int r7 = r5.f
            pc r7 = r0.k(r7)
            goto L12
        L1e:
            r5.b = r7
            int r0 = r5.f
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L29
            po r0 = r7.d
            goto L2f
        L29:
            if (r0 != r2) goto L2e
            m90 r0 = r7.e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            r6.add(r0)
            int r0 = r5.f
            pc r7 = r7.j(r0)
        L38:
            if (r7 == 0) goto L51
            int r0 = r5.f
            if (r0 != 0) goto L41
            po r0 = r7.d
            goto L47
        L41:
            if (r0 != r2) goto L46
            m90 r0 = r7.e
            goto L47
        L46:
            r0 = r1
        L47:
            r6.add(r0)
            int r0 = r5.f
            pc r7 = r7.j(r0)
            goto L38
        L51:
            int r7 = r6.size()
            r0 = 0
        L56:
            if (r0 >= r7) goto L70
            java.lang.Object r1 = r6.get(r0)
            int r0 = r0 + 1
            qb0 r1 = (defpackage.qb0) r1
            int r3 = r5.f
            if (r3 != 0) goto L69
            pc r1 = r1.b
            r1.b = r5
            goto L56
        L69:
            if (r3 != r2) goto L56
            pc r1 = r1.b
            r1.c = r5
            goto L56
        L70:
            int r7 = r5.f
            if (r7 != 0) goto L93
            pc r7 = r5.b
            pc r7 = r7.I
            qc r7 = (defpackage.qc) r7
            boolean r7 = r7.h0
            if (r7 == 0) goto L93
            int r7 = r6.size()
            if (r7 <= r2) goto L93
            int r7 = r6.size()
            int r7 = r7 - r2
            java.lang.Object r6 = r6.get(r7)
            qb0 r6 = (defpackage.qb0) r6
            pc r6 = r6.b
            r5.b = r6
        L93:
            int r6 = r5.f
            if (r6 != 0) goto L9c
            pc r6 = r5.b
            int r6 = r6.X
            goto La0
        L9c:
            pc r6 = r5.b
            int r6 = r6.Y
        La0:
            r5.l = r6
            return
    }

    @Override // defpackage.hg
    public final void a(defpackage.hg r28) {
            r27 = this;
            r0 = r27
            jg r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L3cf
            jg r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L10
            goto L3cf
        L10:
            pc r3 = r0.b
            pc r3 = r3.I
            if (r3 == 0) goto L1f
            boolean r5 = r3 instanceof defpackage.qc
            if (r5 == 0) goto L1f
            qc r3 = (defpackage.qc) r3
            boolean r3 = r3.h0
            goto L20
        L1f:
            r3 = 0
        L20:
            int r5 = r2.g
            int r6 = r1.g
            int r5 = r5 - r6
            java.util.ArrayList r6 = r0.k
            int r7 = r6.size()
            r8 = 0
        L2c:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L40
            java.lang.Object r11 = r6.get(r8)
            qb0 r11 = (defpackage.qb0) r11
            pc r11 = r11.b
            int r11 = r11.V
            if (r11 != r10) goto L41
            int r8 = r8 + 1
            goto L2c
        L40:
            r8 = r9
        L41:
            int r11 = r7 + (-1)
            r12 = r11
        L44:
            if (r12 < 0) goto L56
            java.lang.Object r13 = r6.get(r12)
            qb0 r13 = (defpackage.qb0) r13
            pc r13 = r13.b
            int r13 = r13.V
            if (r13 != r10) goto L55
            int r12 = r12 + (-1)
            goto L44
        L55:
            r9 = r12
        L56:
            r12 = 0
        L57:
            r15 = 2
            r28 = 0
            if (r12 >= r15) goto L10a
            r19 = r28
            r4 = 0
            r15 = 0
            r17 = 0
            r18 = 0
        L64:
            if (r4 >= r7) goto Lf4
            java.lang.Object r20 = r6.get(r4)
            r13 = r20
            qb0 r13 = (defpackage.qb0) r13
            pc r14 = r13.b
            r22 = r3
            int r3 = r14.V
            if (r3 != r10) goto L7a
            r24 = r12
            goto Lea
        L7a:
            int r18 = r18 + 1
            if (r4 <= 0) goto L85
            if (r4 < r8) goto L85
            jg r3 = r13.h
            int r3 = r3.f
            int r15 = r15 + r3
        L85:
            sg r3 = r13.e
            int r10 = r3.g
            r23 = r10
            int r10 = r13.d
            r24 = r12
            r12 = 3
            if (r10 == r12) goto L94
            r10 = 1
            goto L95
        L94:
            r10 = 0
        L95:
            if (r10 == 0) goto Lb5
            int r3 = r0.f
            if (r3 != 0) goto La5
            po r12 = r14.d
            sg r12 = r12.e
            boolean r12 = r12.j
            if (r12 != 0) goto La5
            goto L3cf
        La5:
            r12 = 1
            if (r3 != r12) goto Lb2
            m90 r3 = r14.e
            sg r3 = r3.e
            boolean r3 = r3.j
            if (r3 != 0) goto Lb2
            goto L3cf
        Lb2:
            r25 = r10
            goto Lcc
        Lb5:
            r25 = r10
            r12 = 1
            int r10 = r13.a
            if (r10 != r12) goto Lc5
            if (r24 != 0) goto Lc5
            int r10 = r3.m
            int r17 = r17 + 1
        Lc2:
            r25 = 1
            goto Lce
        Lc5:
            boolean r3 = r3.j
            if (r3 == 0) goto Lcc
            r10 = r23
            goto Lc2
        Lcc:
            r10 = r23
        Lce:
            if (r25 != 0) goto Ldf
            int r17 = r17 + 1
            float[] r3 = r14.Z
            int r10 = r0.f
            r3 = r3[r10]
            int r10 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r10 < 0) goto Le0
            float r19 = r19 + r3
            goto Le0
        Ldf:
            int r15 = r15 + r10
        Le0:
            if (r4 >= r11) goto Lea
            if (r4 >= r9) goto Lea
            jg r3 = r13.i
            int r3 = r3.f
            int r3 = -r3
            int r15 = r15 + r3
        Lea:
            int r4 = r4 + 1
            r3 = r22
            r12 = r24
            r10 = 8
            goto L64
        Lf4:
            r22 = r3
            r24 = r12
            if (r15 < r5) goto L105
            if (r17 != 0) goto Lfd
            goto L105
        Lfd:
            int r12 = r24 + 1
            r3 = r22
            r10 = 8
            goto L57
        L105:
            r3 = r17
            r4 = r18
            goto L111
        L10a:
            r22 = r3
            r19 = r28
            r3 = 0
            r4 = 0
            r15 = 0
        L111:
            int r1 = r1.g
            if (r22 == 0) goto L117
            int r1 = r2.g
        L117:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r5) goto L12e
            r10 = 1073741824(0x40000000, float:2.0)
            if (r22 == 0) goto L127
            int r12 = r15 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 + r10
            goto L12e
        L127:
            int r12 = r15 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 - r10
        L12e:
            if (r3 <= 0) goto L217
            int r10 = r5 - r15
            float r10 = (float) r10
            float r12 = (float) r3
            float r12 = r10 / r12
            float r12 = r12 + r2
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L13a:
            if (r13 >= r7) goto L1d0
            java.lang.Object r17 = r6.get(r13)
            r18 = r2
            r2 = r17
            qb0 r2 = (defpackage.qb0) r2
            r17 = r1
            pc r1 = r2.b
            r23 = r3
            sg r3 = r2.e
            r24 = r10
            int r10 = r1.V
            r25 = r12
            r12 = 8
            if (r10 != r12) goto L15c
        L158:
            r26 = r13
            goto L1c2
        L15c:
            int r10 = r2.d
            r12 = 3
            if (r10 != r12) goto L158
            boolean r10 = r3.j
            if (r10 != 0) goto L158
            int r10 = (r19 > r28 ? 1 : (r19 == r28 ? 0 : -1))
            if (r10 <= 0) goto L177
            float[] r10 = r1.Z
            int r12 = r0.f
            r10 = r10[r12]
            float r10 = r10 * r24
            float r10 = r10 / r19
            float r10 = r10 + r18
            int r10 = (int) r10
            goto L179
        L177:
            r10 = r25
        L179:
            int r12 = r0.f
            if (r12 != 0) goto L19d
            int r12 = r1.n
            int r1 = r1.m
            int r2 = r2.a
            r26 = r13
            r13 = 1
            if (r2 != r13) goto L18f
            int r2 = r3.m
            int r2 = java.lang.Math.min(r10, r2)
            goto L190
        L18f:
            r2 = r10
        L190:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L19a
            int r1 = java.lang.Math.min(r12, r1)
        L19a:
            if (r1 == r10) goto L1bf
            goto L1bc
        L19d:
            r26 = r13
            int r12 = r1.q
            int r1 = r1.p
            int r2 = r2.a
            r13 = 1
            if (r2 != r13) goto L1af
            int r2 = r3.m
            int r2 = java.lang.Math.min(r10, r2)
            goto L1b0
        L1af:
            r2 = r10
        L1b0:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L1ba
            int r1 = java.lang.Math.min(r12, r1)
        L1ba:
            if (r1 == r10) goto L1bf
        L1bc:
            int r14 = r14 + 1
            r10 = r1
        L1bf:
            r3.d(r10)
        L1c2:
            int r13 = r26 + 1
            r1 = r17
            r2 = r18
            r3 = r23
            r10 = r24
            r12 = r25
            goto L13a
        L1d0:
            r17 = r1
            r18 = r2
            r23 = r3
            if (r14 <= 0) goto L208
            int r3 = r23 - r14
            r1 = 0
            r15 = 0
        L1dc:
            if (r1 >= r7) goto L20a
            java.lang.Object r2 = r6.get(r1)
            qb0 r2 = (defpackage.qb0) r2
            pc r10 = r2.b
            int r10 = r10.V
            r12 = 8
            if (r10 != r12) goto L1ed
            goto L205
        L1ed:
            if (r1 <= 0) goto L1f6
            if (r1 < r8) goto L1f6
            jg r10 = r2.h
            int r10 = r10.f
            int r15 = r15 + r10
        L1f6:
            sg r10 = r2.e
            int r10 = r10.g
            int r15 = r15 + r10
            if (r1 >= r11) goto L205
            if (r1 >= r9) goto L205
            jg r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r15 = r15 + r2
        L205:
            int r1 = r1 + 1
            goto L1dc
        L208:
            r3 = r23
        L20a:
            int r1 = r0.l
            r2 = 2
            if (r1 != r2) goto L215
            if (r14 != 0) goto L215
            r1 = 0
            r0.l = r1
            goto L21f
        L215:
            r1 = 0
            goto L21f
        L217:
            r17 = r1
            r18 = r2
            r23 = r3
            r1 = 0
            r2 = 2
        L21f:
            if (r15 <= r5) goto L223
            r0.l = r2
        L223:
            if (r4 <= 0) goto L22b
            if (r3 != 0) goto L22b
            if (r8 != r9) goto L22b
            r0.l = r2
        L22b:
            int r2 = r0.l
            r13 = 1
            if (r2 != r13) goto L2b9
            if (r4 <= r13) goto L236
            int r5 = r5 - r15
            int r4 = r4 - r13
            int r5 = r5 / r4
            goto L23f
        L236:
            if (r4 != r13) goto L23e
            int r5 = r5 - r15
            r16 = 2
            int r5 = r5 / 2
            goto L23f
        L23e:
            r5 = r1
        L23f:
            if (r3 <= 0) goto L242
            r5 = r1
        L242:
            r4 = r1
            r1 = r17
        L245:
            if (r4 >= r7) goto L3cf
            if (r22 == 0) goto L24e
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L24f
        L24e:
            r2 = r4
        L24f:
            java.lang.Object r2 = r6.get(r2)
            qb0 r2 = (defpackage.qb0) r2
            pc r3 = r2.b
            jg r10 = r2.i
            jg r12 = r2.h
            int r3 = r3.V
            r13 = 8
            if (r3 != r13) goto L268
            r12.d(r1)
            r10.d(r1)
            goto L2b6
        L268:
            if (r4 <= 0) goto L26f
            if (r22 == 0) goto L26e
            int r1 = r1 - r5
            goto L26f
        L26e:
            int r1 = r1 + r5
        L26f:
            if (r4 <= 0) goto L27c
            if (r4 < r8) goto L27c
            if (r22 == 0) goto L279
            int r3 = r12.f
            int r1 = r1 - r3
            goto L27c
        L279:
            int r3 = r12.f
            int r1 = r1 + r3
        L27c:
            if (r22 == 0) goto L282
            r10.d(r1)
            goto L285
        L282:
            r12.d(r1)
        L285:
            sg r3 = r2.e
            int r13 = r3.g
            int r14 = r2.d
            r15 = 3
            if (r14 != r15) goto L295
            int r14 = r2.a
            r15 = 1
            if (r14 != r15) goto L295
            int r13 = r3.m
        L295:
            if (r22 == 0) goto L299
            int r1 = r1 - r13
            goto L29a
        L299:
            int r1 = r1 + r13
        L29a:
            if (r22 == 0) goto L2a1
            r12.d(r1)
        L29f:
            r13 = 1
            goto L2a5
        L2a1:
            r10.d(r1)
            goto L29f
        L2a5:
            r2.g = r13
            if (r4 >= r11) goto L2b6
            if (r4 >= r9) goto L2b6
            if (r22 == 0) goto L2b2
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L2b6
        L2b2:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L2b6:
            int r4 = r4 + 1
            goto L245
        L2b9:
            if (r2 != 0) goto L339
            int r5 = r5 - r15
            r21 = 1
            int r4 = r4 + 1
            int r5 = r5 / r4
            if (r3 <= 0) goto L2c4
            r5 = r1
        L2c4:
            r4 = r1
            r1 = r17
        L2c7:
            if (r4 >= r7) goto L3cf
            if (r22 == 0) goto L2d0
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L2d1
        L2d0:
            r2 = r4
        L2d1:
            java.lang.Object r2 = r6.get(r2)
            qb0 r2 = (defpackage.qb0) r2
            pc r3 = r2.b
            jg r10 = r2.i
            jg r12 = r2.h
            int r3 = r3.V
            r13 = 8
            if (r3 != r13) goto L2ea
            r12.d(r1)
            r10.d(r1)
            goto L336
        L2ea:
            if (r22 == 0) goto L2ee
            int r1 = r1 - r5
            goto L2ef
        L2ee:
            int r1 = r1 + r5
        L2ef:
            if (r4 <= 0) goto L2fc
            if (r4 < r8) goto L2fc
            if (r22 == 0) goto L2f9
            int r3 = r12.f
            int r1 = r1 - r3
            goto L2fc
        L2f9:
            int r3 = r12.f
            int r1 = r1 + r3
        L2fc:
            if (r22 == 0) goto L302
            r10.d(r1)
            goto L305
        L302:
            r12.d(r1)
        L305:
            sg r3 = r2.e
            int r13 = r3.g
            int r14 = r2.d
            r15 = 3
            if (r14 != r15) goto L319
            int r2 = r2.a
            r15 = 1
            if (r2 != r15) goto L319
            int r2 = r3.m
            int r13 = java.lang.Math.min(r13, r2)
        L319:
            if (r22 == 0) goto L31d
            int r1 = r1 - r13
            goto L31e
        L31d:
            int r1 = r1 + r13
        L31e:
            if (r22 == 0) goto L324
            r12.d(r1)
            goto L327
        L324:
            r10.d(r1)
        L327:
            if (r4 >= r11) goto L336
            if (r4 >= r9) goto L336
            if (r22 == 0) goto L332
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L336
        L332:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L336:
            int r4 = r4 + 1
            goto L2c7
        L339:
            r4 = 2
            if (r2 != r4) goto L3cf
            int r2 = r0.f
            if (r2 != 0) goto L345
            pc r2 = r0.b
            float r2 = r2.S
            goto L349
        L345:
            pc r2 = r0.b
            float r2 = r2.T
        L349:
            if (r22 == 0) goto L34f
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 - r2
        L34f:
            int r5 = r5 - r15
            float r4 = (float) r5
            float r4 = r4 * r2
            float r4 = r4 + r18
            int r2 = (int) r4
            if (r2 < 0) goto L359
            if (r3 <= 0) goto L35a
        L359:
            r2 = r1
        L35a:
            if (r22 == 0) goto L35f
            int r2 = r17 - r2
            goto L361
        L35f:
            int r2 = r17 + r2
        L361:
            r4 = r1
        L362:
            if (r4 >= r7) goto L3cf
            if (r22 == 0) goto L36b
            int r1 = r4 + 1
            int r1 = r7 - r1
            goto L36c
        L36b:
            r1 = r4
        L36c:
            java.lang.Object r1 = r6.get(r1)
            qb0 r1 = (defpackage.qb0) r1
            pc r3 = r1.b
            jg r5 = r1.i
            jg r10 = r1.h
            int r3 = r3.V
            r12 = 8
            if (r3 != r12) goto L387
            r10.d(r2)
            r5.d(r2)
            r14 = 1
            r15 = 3
            goto L3cc
        L387:
            if (r4 <= 0) goto L394
            if (r4 < r8) goto L394
            if (r22 == 0) goto L391
            int r3 = r10.f
            int r2 = r2 - r3
            goto L394
        L391:
            int r3 = r10.f
            int r2 = r2 + r3
        L394:
            if (r22 == 0) goto L39a
            r5.d(r2)
            goto L39d
        L39a:
            r10.d(r2)
        L39d:
            sg r3 = r1.e
            int r13 = r3.g
            int r14 = r1.d
            r15 = 3
            if (r14 != r15) goto L3ae
            int r1 = r1.a
            r14 = 1
            if (r1 != r14) goto L3af
            int r13 = r3.m
            goto L3af
        L3ae:
            r14 = 1
        L3af:
            if (r22 == 0) goto L3b3
            int r2 = r2 - r13
            goto L3b4
        L3b3:
            int r2 = r2 + r13
        L3b4:
            if (r22 == 0) goto L3ba
            r10.d(r2)
            goto L3bd
        L3ba:
            r5.d(r2)
        L3bd:
            if (r4 >= r11) goto L3cc
            if (r4 >= r9) goto L3cc
            if (r22 == 0) goto L3c8
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 - r1
            goto L3cc
        L3c8:
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 + r1
        L3cc:
            int r4 = r4 + 1
            goto L362
        L3cf:
            return
    }

    @Override // defpackage.qb0
    public final void d() {
            r7 = this;
            java.util.ArrayList r0 = r7.k
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            qb0 r4 = (defpackage.qb0) r4
            r4.d()
            goto L8
        L16:
            int r1 = r0.size()
            r3 = 1
            if (r1 >= r3) goto L1e
            return
        L1e:
            java.lang.Object r4 = r0.get(r2)
            qb0 r4 = (defpackage.qb0) r4
            pc r4 = r4.b
            int r1 = r1 - r3
            java.lang.Object r0 = r0.get(r1)
            qb0 r0 = (defpackage.qb0) r0
            pc r0 = r0.b
            int r1 = r7.f
            jg r5 = r7.i
            jg r6 = r7.h
            if (r1 != 0) goto L6f
            cc r1 = r4.x
            cc r0 = r0.z
            jg r3 = defpackage.qb0.i(r1, r2)
            int r1 = r1.c()
            pc r4 = r7.m()
            if (r4 == 0) goto L4f
            cc r1 = r4.x
            int r1 = r1.c()
        L4f:
            if (r3 == 0) goto L54
            defpackage.qb0.b(r6, r3, r1)
        L54:
            jg r1 = defpackage.qb0.i(r0, r2)
            int r0 = r0.c()
            pc r2 = r7.n()
            if (r2 == 0) goto L68
            cc r0 = r2.z
            int r0 = r0.c()
        L68:
            if (r1 == 0) goto La6
            int r0 = -r0
            defpackage.qb0.b(r5, r1, r0)
            goto La6
        L6f:
            cc r1 = r4.y
            cc r0 = r0.A
            jg r2 = defpackage.qb0.i(r1, r3)
            int r1 = r1.c()
            pc r4 = r7.m()
            if (r4 == 0) goto L87
            cc r1 = r4.y
            int r1 = r1.c()
        L87:
            if (r2 == 0) goto L8c
            defpackage.qb0.b(r6, r2, r1)
        L8c:
            jg r1 = defpackage.qb0.i(r0, r3)
            int r0 = r0.c()
            pc r2 = r7.n()
            if (r2 == 0) goto La0
            cc r0 = r2.A
            int r0 = r0.c()
        La0:
            if (r1 == 0) goto La6
            int r0 = -r0
            defpackage.qb0.b(r5, r1, r0)
        La6:
            r6.a = r7
            r5.a = r7
            return
    }

    @Override // defpackage.qb0
    public final void e() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r3.k
            int r2 = r1.size()
            if (r0 >= r2) goto L15
            java.lang.Object r1 = r1.get(r0)
            qb0 r1 = (defpackage.qb0) r1
            r1.e()
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // defpackage.qb0
    public final void f() {
            r4 = this;
            r0 = 0
            r4.c = r0
            java.util.ArrayList r0 = r4.k
            int r1 = r0.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            qb0 r3 = (defpackage.qb0) r3
            r3.f()
            goto La
        L18:
            return
    }

    @Override // defpackage.qb0
    public final long j() {
            r8 = this;
            java.util.ArrayList r0 = r8.k
            int r1 = r0.size()
            r2 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L25
            java.lang.Object r5 = r0.get(r4)
            qb0 r5 = (defpackage.qb0) r5
            jg r6 = r5.h
            int r6 = r6.f
            long r6 = (long) r6
            long r2 = r2 + r6
            long r6 = r5.j()
            long r6 = r6 + r2
            jg r2 = r5.i
            int r2 = r2.f
            long r2 = (long) r2
            long r2 = r2 + r6
            int r4 = r4 + 1
            goto L9
        L25:
            return r2
    }

    @Override // defpackage.qb0
    public final boolean k() {
            r5 = this;
            java.util.ArrayList r0 = r5.k
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L1a
            java.lang.Object r4 = r0.get(r3)
            qb0 r4 = (defpackage.qb0) r4
            boolean r4 = r4.k()
            if (r4 != 0) goto L17
            return r2
        L17:
            int r3 = r3 + 1
            goto L8
        L1a:
            r0 = 1
            return r0
    }

    public final defpackage.pc m() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList r1 = r4.k
            int r2 = r1.size()
            if (r0 >= r2) goto L1b
            java.lang.Object r1 = r1.get(r0)
            qb0 r1 = (defpackage.qb0) r1
            pc r1 = r1.b
            int r2 = r1.V
            r3 = 8
            if (r2 == r3) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto L1
        L1b:
            r0 = 0
            return r0
    }

    public final defpackage.pc n() {
            r5 = this;
            java.util.ArrayList r0 = r5.k
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r0.get(r1)
            qb0 r2 = (defpackage.qb0) r2
            pc r2 = r2.b
            int r3 = r2.V
            r4 = 8
            if (r3 == r4) goto L19
            return r2
        L19:
            int r1 = r1 + (-1)
            goto L8
        L1c:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.f
            if (r0 != 0) goto L7
            java.lang.String r0 = "horizontal : "
            goto L9
        L7:
            java.lang.String r0 = "vertical : "
        L9:
            java.lang.String r1 = "ChainRun "
            java.lang.String r0 = r1.concat(r0)
            java.util.ArrayList r1 = r6.k
            int r2 = r1.size()
            r3 = 0
        L16:
            if (r3 >= r2) goto L3c
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            qb0 r4 = (defpackage.qb0) r4
            java.lang.String r5 = "<"
            java.lang.String r0 = defpackage.z30.i(r0, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "> "
            java.lang.String r0 = defpackage.z30.i(r0, r4)
            goto L16
        L3c:
            return r0
    }
}
