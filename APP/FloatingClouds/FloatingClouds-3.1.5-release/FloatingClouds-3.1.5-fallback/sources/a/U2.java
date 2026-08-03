package a;

/* JADX INFO: loaded from: classes.dex */
public final class U2 extends a.ih {
    public final java.util.ArrayList<a.ih> k;
    public int l;

    public U2(a.N3 r5, int r6) {
            r4 = this;
            r4.<init>(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.k = r5
            r4.f = r6
            a.N3 r5 = r4.b
            a.N3 r6 = r5.k(r6)
        L12:
            r3 = r6
            r6 = r5
            r5 = r3
            if (r5 == 0) goto L1e
            int r6 = r4.f
            a.N3 r6 = r5.k(r6)
            goto L12
        L1e:
            r4.b = r6
            int r5 = r4.f
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L29
            a.K8 r5 = r6.d
            goto L2f
        L29:
            if (r5 != r1) goto L2e
            a.og r5 = r6.e
            goto L2f
        L2e:
            r5 = r0
        L2f:
            java.util.ArrayList<a.ih> r2 = r4.k
            r2.add(r5)
            int r5 = r4.f
            a.N3 r5 = r6.j(r5)
        L3a:
            if (r5 == 0) goto L53
            int r6 = r4.f
            if (r6 != 0) goto L43
            a.K8 r6 = r5.d
            goto L49
        L43:
            if (r6 != r1) goto L48
            a.og r6 = r5.e
            goto L49
        L48:
            r6 = r0
        L49:
            r2.add(r6)
            int r6 = r4.f
            a.N3 r5 = r5.j(r6)
            goto L3a
        L53:
            java.util.Iterator r5 = r2.iterator()
        L57:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()
            a.ih r6 = (a.ih) r6
            int r0 = r4.f
            if (r0 != 0) goto L6c
            a.N3 r6 = r6.b
            r6.b = r4
            goto L57
        L6c:
            if (r0 != r1) goto L57
            a.N3 r6 = r6.b
            r6.c = r4
            goto L57
        L73:
            int r5 = r4.f
            if (r5 != 0) goto L96
            a.N3 r5 = r4.b
            a.N3 r5 = r5.K
            a.O3 r5 = (a.O3) r5
            boolean r5 = r5.i0
            if (r5 == 0) goto L96
            int r5 = r2.size()
            if (r5 <= r1) goto L96
            int r5 = r2.size()
            int r5 = r5 - r1
            java.lang.Object r5 = r2.get(r5)
            a.ih r5 = (a.ih) r5
            a.N3 r5 = r5.b
            r4.b = r5
        L96:
            int r5 = r4.f
            if (r5 != 0) goto L9f
            a.N3 r5 = r4.b
            int r5 = r5.Z
            goto La3
        L9f:
            a.N3 r5 = r4.b
            int r5 = r5.a0
        La3:
            r4.l = r5
            return
    }

    @Override // a.ih, a.T4
    public final void a(a.T4 r30) {
            r29 = this;
            r0 = r29
            a.V4 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L3df
            a.V4 r2 = r0.i
            boolean r3 = r2.j
            if (r3 != 0) goto L10
            goto L3df
        L10:
            a.N3 r3 = r0.b
            a.N3 r3 = r3.K
            if (r3 == 0) goto L1f
            boolean r5 = r3 instanceof a.O3
            if (r5 == 0) goto L1f
            a.O3 r3 = (a.O3) r3
            boolean r3 = r3.i0
            goto L20
        L1f:
            r3 = 0
        L20:
            int r5 = r2.g
            int r6 = r1.g
            int r5 = r5 - r6
            java.util.ArrayList<a.ih> r6 = r0.k
            int r7 = r6.size()
            r8 = 0
        L2c:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L40
            java.lang.Object r11 = r6.get(r8)
            a.ih r11 = (a.ih) r11
            a.N3 r11 = r11.b
            int r11 = r11.X
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
            a.ih r13 = (a.ih) r13
            a.N3 r13 = r13.b
            int r13 = r13.X
            if (r13 != r10) goto L55
            int r12 = r12 + (-1)
            goto L44
        L55:
            r9 = r12
        L56:
            r12 = 0
        L57:
            a.N3$a r13 = a.N3.a.c
            r30 = 0
            r15 = 2
            if (r12 >= r15) goto L112
            r20 = r30
            r4 = 0
            r15 = 0
            r18 = 0
            r19 = 0
        L66:
            if (r4 >= r7) goto Lfc
            java.lang.Object r21 = r6.get(r4)
            r14 = r21
            a.ih r14 = (a.ih) r14
            a.N3 r10 = r14.b
            r23 = r3
            int r3 = r10.X
            r24 = r12
            r12 = 8
            if (r3 != r12) goto L7e
            goto Lf2
        L7e:
            int r19 = r19 + 1
            if (r4 <= 0) goto L89
            if (r4 < r8) goto L89
            a.V4 r3 = r14.h
            int r3 = r3.f
            int r15 = r15 + r3
        L89:
            a.l5 r3 = r14.e
            int r12 = r3.g
            r25 = r12
            a.N3$a r12 = r14.d
            if (r12 == r13) goto L95
            r12 = 1
            goto L96
        L95:
            r12 = 0
        L96:
            if (r12 == 0) goto Lb8
            int r3 = r0.f
            r26 = r12
            if (r3 != 0) goto La8
            a.K8 r12 = r10.d
            a.l5 r12 = r12.e
            boolean r12 = r12.j
            if (r12 != 0) goto La8
            goto L3df
        La8:
            r12 = 1
            if (r3 != r12) goto Lb5
            a.og r3 = r10.e
            a.l5 r3 = r3.e
            boolean r3 = r3.j
            if (r3 != 0) goto Lb5
            goto L3df
        Lb5:
            r27 = r15
            goto Ld1
        Lb8:
            r26 = r12
            r27 = r15
            r12 = 1
            int r15 = r14.f516a
            if (r15 != r12) goto Lca
            if (r24 != 0) goto Lca
            int r12 = r3.m
            int r18 = r18 + 1
        Lc7:
            r26 = 1
            goto Ld3
        Lca:
            boolean r3 = r3.j
            if (r3 == 0) goto Ld1
            r12 = r25
            goto Lc7
        Ld1:
            r12 = r25
        Ld3:
            if (r26 != 0) goto Le6
            int r18 = r18 + 1
            float[] r3 = r10.b0
            int r10 = r0.f
            r3 = r3[r10]
            int r10 = (r3 > r30 ? 1 : (r3 == r30 ? 0 : -1))
            if (r10 < 0) goto Le3
            float r20 = r20 + r3
        Le3:
            r15 = r27
            goto Le8
        Le6:
            int r15 = r27 + r12
        Le8:
            if (r4 >= r11) goto Lf2
            if (r4 >= r9) goto Lf2
            a.V4 r3 = r14.i
            int r3 = r3.f
            int r3 = -r3
            int r15 = r15 + r3
        Lf2:
            int r4 = r4 + 1
            r3 = r23
            r12 = r24
            r10 = 8
            goto L66
        Lfc:
            r23 = r3
            r24 = r12
            if (r15 < r5) goto L10d
            if (r18 != 0) goto L105
            goto L10d
        L105:
            int r12 = r24 + 1
            r3 = r23
            r10 = 8
            goto L57
        L10d:
            r3 = r18
            r4 = r19
            goto L119
        L112:
            r23 = r3
            r20 = r30
            r3 = 0
            r4 = 0
            r15 = 0
        L119:
            int r1 = r1.g
            if (r23 == 0) goto L11f
            int r1 = r2.g
        L11f:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r5) goto L136
            r10 = 1073741824(0x40000000, float:2.0)
            if (r23 == 0) goto L12f
            int r12 = r15 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 + r10
            goto L136
        L12f:
            int r12 = r15 - r5
            float r12 = (float) r12
            float r12 = r12 / r10
            float r12 = r12 + r2
            int r10 = (int) r12
            int r1 = r1 - r10
        L136:
            if (r3 <= 0) goto L224
            int r10 = r5 - r15
            float r10 = (float) r10
            float r12 = (float) r3
            float r12 = r10 / r12
            float r12 = r12 + r2
            int r12 = (int) r12
            r14 = 0
            r18 = 0
        L143:
            if (r14 >= r7) goto L1dd
            java.lang.Object r19 = r6.get(r14)
            r24 = r2
            r2 = r19
            a.ih r2 = (a.ih) r2
            r19 = r1
            a.N3 r1 = r2.b
            r25 = r3
            int r3 = r1.X
            r26 = r10
            r10 = 8
            if (r3 != r10) goto L163
        L15d:
            r27 = r12
            r28 = r14
            goto L1cf
        L163:
            a.N3$a r3 = r2.d
            if (r3 != r13) goto L15d
            a.l5 r3 = r2.e
            boolean r10 = r3.j
            if (r10 != 0) goto L15d
            int r10 = (r20 > r30 ? 1 : (r20 == r30 ? 0 : -1))
            if (r10 <= 0) goto L183
            float[] r10 = r1.b0
            r27 = r10
            int r10 = r0.f
            r10 = r27[r10]
            float r10 = r10 * r26
            float r10 = r10 / r20
            float r10 = r10 + r24
            int r10 = (int) r10
            r27 = r12
            goto L186
        L183:
            r10 = r12
            r27 = r10
        L186:
            int r12 = r0.f
            if (r12 != 0) goto L1aa
            int r12 = r1.n
            int r1 = r1.m
            int r2 = r2.f516a
            r28 = r14
            r14 = 1
            if (r2 != r14) goto L19c
            int r2 = r3.m
            int r2 = java.lang.Math.min(r10, r2)
            goto L19d
        L19c:
            r2 = r10
        L19d:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L1a7
            int r1 = java.lang.Math.min(r12, r1)
        L1a7:
            if (r1 == r10) goto L1cc
            goto L1c9
        L1aa:
            r28 = r14
            int r12 = r1.q
            int r1 = r1.p
            int r2 = r2.f516a
            r14 = 1
            if (r2 != r14) goto L1bc
            int r2 = r3.m
            int r2 = java.lang.Math.min(r10, r2)
            goto L1bd
        L1bc:
            r2 = r10
        L1bd:
            int r1 = java.lang.Math.max(r1, r2)
            if (r12 <= 0) goto L1c7
            int r1 = java.lang.Math.min(r12, r1)
        L1c7:
            if (r1 == r10) goto L1cc
        L1c9:
            int r18 = r18 + 1
            r10 = r1
        L1cc:
            r3.d(r10)
        L1cf:
            int r14 = r28 + 1
            r1 = r19
            r2 = r24
            r3 = r25
            r10 = r26
            r12 = r27
            goto L143
        L1dd:
            r19 = r1
            r24 = r2
            r25 = r3
            if (r18 <= 0) goto L215
            int r3 = r25 - r18
            r1 = 0
            r15 = 0
        L1e9:
            if (r1 >= r7) goto L217
            java.lang.Object r2 = r6.get(r1)
            a.ih r2 = (a.ih) r2
            a.N3 r10 = r2.b
            int r10 = r10.X
            r12 = 8
            if (r10 != r12) goto L1fa
            goto L212
        L1fa:
            if (r1 <= 0) goto L203
            if (r1 < r8) goto L203
            a.V4 r10 = r2.h
            int r10 = r10.f
            int r15 = r15 + r10
        L203:
            a.l5 r10 = r2.e
            int r10 = r10.g
            int r15 = r15 + r10
            if (r1 >= r11) goto L212
            if (r1 >= r9) goto L212
            a.V4 r2 = r2.i
            int r2 = r2.f
            int r2 = -r2
            int r15 = r15 + r2
        L212:
            int r1 = r1 + 1
            goto L1e9
        L215:
            r3 = r25
        L217:
            int r1 = r0.l
            r2 = 2
            if (r1 != r2) goto L222
            if (r18 != 0) goto L222
            r1 = 0
            r0.l = r1
            goto L22c
        L222:
            r1 = 0
            goto L22c
        L224:
            r19 = r1
            r24 = r2
            r25 = r3
            r1 = 0
            r2 = 2
        L22c:
            if (r15 <= r5) goto L230
            r0.l = r2
        L230:
            if (r4 <= 0) goto L238
            if (r3 != 0) goto L238
            if (r8 != r9) goto L238
            r0.l = r2
        L238:
            int r2 = r0.l
            r14 = 1
            if (r2 != r14) goto L2cc
            if (r4 <= r14) goto L243
            int r5 = r5 - r15
            int r4 = r4 - r14
            int r5 = r5 / r4
            goto L24c
        L243:
            if (r4 != r14) goto L24b
            int r5 = r5 - r15
            r17 = 2
            int r5 = r5 / 2
            goto L24c
        L24b:
            r5 = r1
        L24c:
            if (r3 <= 0) goto L24f
            r5 = r1
        L24f:
            r4 = r1
            r1 = r19
        L252:
            if (r4 >= r7) goto L3df
            if (r23 == 0) goto L25b
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L25c
        L25b:
            r2 = r4
        L25c:
            java.lang.Object r2 = r6.get(r2)
            a.ih r2 = (a.ih) r2
            a.N3 r3 = r2.b
            int r3 = r3.X
            a.V4 r10 = r2.i
            a.V4 r12 = r2.h
            r14 = 8
            if (r3 != r14) goto L275
            r12.d(r1)
            r10.d(r1)
            goto L2c9
        L275:
            if (r4 <= 0) goto L27c
            if (r23 == 0) goto L27b
            int r1 = r1 - r5
            goto L27c
        L27b:
            int r1 = r1 + r5
        L27c:
            if (r4 <= 0) goto L289
            if (r4 < r8) goto L289
            if (r23 == 0) goto L286
            int r3 = r12.f
            int r1 = r1 - r3
            goto L289
        L286:
            int r3 = r12.f
            int r1 = r1 + r3
        L289:
            if (r23 == 0) goto L28f
            r10.d(r1)
            goto L292
        L28f:
            r12.d(r1)
        L292:
            a.l5 r3 = r2.e
            int r14 = r3.g
            a.N3$a r15 = r2.d
            if (r15 != r13) goto L2a4
            int r15 = r2.f516a
            r16 = r1
            r1 = 1
            if (r15 != r1) goto L2a6
            int r14 = r3.m
            goto L2a6
        L2a4:
            r16 = r1
        L2a6:
            if (r23 == 0) goto L2ab
            int r1 = r16 - r14
            goto L2ad
        L2ab:
            int r1 = r16 + r14
        L2ad:
            if (r23 == 0) goto L2b4
            r12.d(r1)
        L2b2:
            r14 = 1
            goto L2b8
        L2b4:
            r10.d(r1)
            goto L2b2
        L2b8:
            r2.g = r14
            if (r4 >= r11) goto L2c9
            if (r4 >= r9) goto L2c9
            if (r23 == 0) goto L2c5
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L2c9
        L2c5:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L2c9:
            int r4 = r4 + 1
            goto L252
        L2cc:
            if (r2 != 0) goto L34b
            int r5 = r5 - r15
            r22 = 1
            int r4 = r4 + 1
            int r5 = r5 / r4
            if (r3 <= 0) goto L2d7
            r5 = r1
        L2d7:
            r4 = r1
            r1 = r19
        L2da:
            if (r4 >= r7) goto L3df
            if (r23 == 0) goto L2e3
            int r2 = r4 + 1
            int r2 = r7 - r2
            goto L2e4
        L2e3:
            r2 = r4
        L2e4:
            java.lang.Object r2 = r6.get(r2)
            a.ih r2 = (a.ih) r2
            a.N3 r3 = r2.b
            int r3 = r3.X
            a.V4 r10 = r2.i
            a.V4 r12 = r2.h
            r14 = 8
            if (r3 != r14) goto L2fd
            r12.d(r1)
            r10.d(r1)
            goto L348
        L2fd:
            if (r23 == 0) goto L301
            int r1 = r1 - r5
            goto L302
        L301:
            int r1 = r1 + r5
        L302:
            if (r4 <= 0) goto L30f
            if (r4 < r8) goto L30f
            if (r23 == 0) goto L30c
            int r3 = r12.f
            int r1 = r1 - r3
            goto L30f
        L30c:
            int r3 = r12.f
            int r1 = r1 + r3
        L30f:
            if (r23 == 0) goto L315
            r10.d(r1)
            goto L318
        L315:
            r12.d(r1)
        L318:
            a.l5 r3 = r2.e
            int r14 = r3.g
            a.N3$a r15 = r2.d
            if (r15 != r13) goto L32b
            int r2 = r2.f516a
            r15 = 1
            if (r2 != r15) goto L32b
            int r2 = r3.m
            int r14 = java.lang.Math.min(r14, r2)
        L32b:
            if (r23 == 0) goto L32f
            int r1 = r1 - r14
            goto L330
        L32f:
            int r1 = r1 + r14
        L330:
            if (r23 == 0) goto L336
            r12.d(r1)
            goto L339
        L336:
            r10.d(r1)
        L339:
            if (r4 >= r11) goto L348
            if (r4 >= r9) goto L348
            if (r23 == 0) goto L344
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 - r2
            goto L348
        L344:
            int r2 = r10.f
            int r2 = -r2
            int r1 = r1 + r2
        L348:
            int r4 = r4 + 1
            goto L2da
        L34b:
            r4 = 2
            if (r2 != r4) goto L3df
            int r2 = r0.f
            if (r2 != 0) goto L357
            a.N3 r2 = r0.b
            float r2 = r2.U
            goto L35b
        L357:
            a.N3 r2 = r0.b
            float r2 = r2.V
        L35b:
            if (r23 == 0) goto L361
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = r4 - r2
        L361:
            int r5 = r5 - r15
            float r4 = (float) r5
            float r4 = r4 * r2
            float r4 = r4 + r24
            int r2 = (int) r4
            if (r2 < 0) goto L36b
            if (r3 <= 0) goto L36c
        L36b:
            r2 = r1
        L36c:
            if (r23 == 0) goto L371
            int r2 = r19 - r2
            goto L373
        L371:
            int r2 = r19 + r2
        L373:
            r4 = r1
        L374:
            if (r4 >= r7) goto L3df
            if (r23 == 0) goto L37d
            int r1 = r4 + 1
            int r1 = r7 - r1
            goto L37e
        L37d:
            r1 = r4
        L37e:
            java.lang.Object r1 = r6.get(r1)
            a.ih r1 = (a.ih) r1
            a.N3 r3 = r1.b
            int r3 = r3.X
            a.V4 r5 = r1.i
            a.V4 r10 = r1.h
            r14 = 8
            if (r3 != r14) goto L398
            r10.d(r2)
            r5.d(r2)
            r15 = 1
            goto L3dc
        L398:
            if (r4 <= 0) goto L3a5
            if (r4 < r8) goto L3a5
            if (r23 == 0) goto L3a2
            int r3 = r10.f
            int r2 = r2 - r3
            goto L3a5
        L3a2:
            int r3 = r10.f
            int r2 = r2 + r3
        L3a5:
            if (r23 == 0) goto L3ab
            r5.d(r2)
            goto L3ae
        L3ab:
            r10.d(r2)
        L3ae:
            a.l5 r3 = r1.e
            int r12 = r3.g
            a.N3$a r15 = r1.d
            if (r15 != r13) goto L3be
            int r1 = r1.f516a
            r15 = 1
            if (r1 != r15) goto L3bf
            int r12 = r3.m
            goto L3bf
        L3be:
            r15 = 1
        L3bf:
            if (r23 == 0) goto L3c3
            int r2 = r2 - r12
            goto L3c4
        L3c3:
            int r2 = r2 + r12
        L3c4:
            if (r23 == 0) goto L3ca
            r10.d(r2)
            goto L3cd
        L3ca:
            r5.d(r2)
        L3cd:
            if (r4 >= r11) goto L3dc
            if (r4 >= r9) goto L3dc
            if (r23 == 0) goto L3d8
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 - r1
            goto L3dc
        L3d8:
            int r1 = r5.f
            int r1 = -r1
            int r2 = r2 + r1
        L3dc:
            int r4 = r4 + 1
            goto L374
        L3df:
            return
    }

    @Override // a.ih
    public final void d() {
            r7 = this;
            java.util.ArrayList<a.ih> r0 = r7.k
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            a.ih r2 = (a.ih) r2
            r2.d()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            a.ih r4 = (a.ih) r4
            a.N3 r4 = r4.b
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            a.ih r0 = (a.ih) r0
            a.N3 r0 = r0.b
            int r1 = r7.f
            a.V4 r5 = r7.i
            a.V4 r6 = r7.h
            if (r1 != 0) goto L70
            a.M3 r1 = r4.y
            a.M3 r0 = r0.A
            a.V4 r2 = a.ih.i(r1, r3)
            int r1 = r1.c()
            a.N3 r4 = r7.m()
            if (r4 == 0) goto L50
            a.M3 r1 = r4.y
            int r1 = r1.c()
        L50:
            if (r2 == 0) goto L55
            a.ih.b(r6, r2, r1)
        L55:
            a.V4 r1 = a.ih.i(r0, r3)
            int r0 = r0.c()
            a.N3 r2 = r7.n()
            if (r2 == 0) goto L69
            a.M3 r0 = r2.A
            int r0 = r0.c()
        L69:
            if (r1 == 0) goto La7
            int r0 = -r0
            a.ih.b(r5, r1, r0)
            goto La7
        L70:
            a.M3 r1 = r4.z
            a.M3 r0 = r0.B
            a.V4 r3 = a.ih.i(r1, r2)
            int r1 = r1.c()
            a.N3 r4 = r7.m()
            if (r4 == 0) goto L88
            a.M3 r1 = r4.z
            int r1 = r1.c()
        L88:
            if (r3 == 0) goto L8d
            a.ih.b(r6, r3, r1)
        L8d:
            a.V4 r1 = a.ih.i(r0, r2)
            int r0 = r0.c()
            a.N3 r2 = r7.n()
            if (r2 == 0) goto La1
            a.M3 r0 = r2.B
            int r0 = r0.c()
        La1:
            if (r1 == 0) goto La7
            int r0 = -r0
            a.ih.b(r5, r1, r0)
        La7:
            r6.f300a = r7
            r5.f300a = r7
            return
    }

    @Override // a.ih
    public final void e() {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<a.ih> r1 = r3.k
            int r2 = r1.size()
            if (r0 >= r2) goto L15
            java.lang.Object r1 = r1.get(r0)
            a.ih r1 = (a.ih) r1
            r1.e()
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // a.ih
    public final void f() {
            r2 = this;
            r0 = 0
            r2.c = r0
            java.util.ArrayList<a.ih> r0 = r2.k
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            a.ih r1 = (a.ih) r1
            r1.f()
            goto L9
        L19:
            return
    }

    @Override // a.ih
    public final long j() {
            r8 = this;
            java.util.ArrayList<a.ih> r0 = r8.k
            int r1 = r0.size()
            r2 = 0
            r4 = 0
        L9:
            if (r4 >= r1) goto L25
            java.lang.Object r5 = r0.get(r4)
            a.ih r5 = (a.ih) r5
            a.V4 r6 = r5.h
            int r6 = r6.f
            long r6 = (long) r6
            long r2 = r2 + r6
            long r6 = r5.j()
            long r6 = r6 + r2
            a.V4 r2 = r5.i
            int r2 = r2.f
            long r2 = (long) r2
            long r2 = r2 + r6
            int r4 = r4 + 1
            goto L9
        L25:
            return r2
    }

    @Override // a.ih
    public final boolean k() {
            r5 = this;
            java.util.ArrayList<a.ih> r0 = r5.k
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L1a
            java.lang.Object r4 = r0.get(r3)
            a.ih r4 = (a.ih) r4
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

    public final a.N3 m() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<a.ih> r1 = r4.k
            int r2 = r1.size()
            if (r0 >= r2) goto L1b
            java.lang.Object r1 = r1.get(r0)
            a.ih r1 = (a.ih) r1
            a.N3 r1 = r1.b
            int r2 = r1.X
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

    public final a.N3 n() {
            r5 = this;
            java.util.ArrayList<a.ih> r0 = r5.k
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L8:
            if (r1 < 0) goto L1c
            java.lang.Object r2 = r0.get(r1)
            a.ih r2 = (a.ih) r2
            a.N3 r2 = r2.b
            int r3 = r2.X
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
            r4 = this;
            int r0 = r4.f
            if (r0 != 0) goto L7
            java.lang.String r0 = "horizontal : "
            goto L9
        L7:
            java.lang.String r0 = "vertical : "
        L9:
            java.lang.String r1 = "ChainRun "
            java.lang.String r0 = r1.concat(r0)
            java.util.ArrayList<a.ih> r1 = r4.k
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            a.ih r2 = (a.ih) r2
            java.lang.String r3 = "<"
            java.lang.String r0 = a.C0487z.f(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.String r2 = "> "
            java.lang.String r0 = a.C0487z.f(r0, r2)
            goto L15
        L3d:
            return r0
    }
}
