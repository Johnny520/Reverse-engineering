package defpackage;

/* JADX INFO: renamed from: ᛴᲀᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0753 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int[] f3526;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int[] f3527;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int[][] f3528;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3529;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f3530;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final byte[] f3531;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f3532;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int[] f3533;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int[] f3534;

    public C0753(int r9, int r10, int r11, byte[] r12) {
            r8 = this;
            r0 = 32
            r1 = 2
            r2 = 4
            r3 = 256(0x100, float:3.59E-43)
            r4 = 1
            r5 = 0
            switch(r11) {
                case 1: goto L4b;
                default: goto Lb;
            }
        Lb:
            r6 = -1148667813076526(0xfffbeb4aef0961d2, double:NaN)
            r8.<init>()
            r8.f3531 = r12
            r8.f3532 = r9
            r8.f3530 = r10
            int[][] r9 = new int[r3][]
            r10 = r5
        L1f:
            if (r10 >= r3) goto L31
            int[] r11 = new int[r2]
            int r12 = r10 << 12
            int r12 = r12 / r3
            r11[r5] = r12
            r11[r4] = r12
            r11[r1] = r12
            r9[r10] = r11
            int r10 = r10 + 1
            goto L1f
        L31:
            r8.f3528 = r9
            int[] r9 = new int[r3]
            r8.f3533 = r9
            int[] r9 = new int[r3]
            r8.f3534 = r9
            int[] r9 = new int[r3]
        L3d:
            if (r5 >= r3) goto L44
            r9[r5] = r3
            int r5 = r5 + 1
            goto L3d
        L44:
            r8.f3526 = r9
            int[] r9 = new int[r0]
            r8.f3527 = r9
            return
        L4b:
            r6 = -1156205480681006(0xfffbe46fef0961d2, double:NaN)
            r8.<init>()
            r8.f3531 = r12
            r8.f3532 = r9
            r8.f3530 = r10
            int[][] r9 = new int[r3][]
            r10 = r5
        L5f:
            if (r10 >= r3) goto L71
            int[] r11 = new int[r2]
            int r12 = r10 << 12
            int r12 = r12 / r3
            r11[r5] = r12
            r11[r4] = r12
            r11[r1] = r12
            r9[r10] = r11
            int r10 = r10 + 1
            goto L5f
        L71:
            r8.f3528 = r9
            int[] r9 = new int[r3]
            r8.f3533 = r9
            int[] r9 = new int[r3]
            r8.f3534 = r9
            int[] r9 = new int[r3]
        L7d:
            if (r5 >= r3) goto L84
            r9[r5] = r3
            int r5 = r5 + 1
            goto L7d
        L84:
            r8.f3526 = r9
            int[] r9 = new int[r0]
            r8.f3527 = r9
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int m1667(int r14, int r15, int r16) {
            r13 = this;
            int[] r0 = r13.f3533
            r0 = r0[r15]
            int r1 = r0 + (-1)
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = -1
            r4 = r3
        La:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 < r5) goto L12
            if (r1 < 0) goto L11
            goto L12
        L11:
            return r4
        L12:
            r6 = 3
            r7 = 2
            r8 = 0
            int[][] r9 = r13.f3528
            r10 = 1
            if (r0 >= r5) goto L3e
            r11 = r9[r0]
            r12 = r11[r10]
            int r12 = r12 - r15
            if (r12 < r2) goto L23
            r0 = r5
            goto L3e
        L23:
            int r0 = r0 + 1
            if (r12 >= 0) goto L28
            int r12 = -r12
        L28:
            r5 = r11[r8]
            int r5 = r5 - r14
            if (r5 >= 0) goto L2e
            int r5 = -r5
        L2e:
            int r12 = r12 + r5
            if (r12 >= r2) goto L3e
            r5 = r11[r7]
            int r5 = r5 - r16
            if (r5 >= 0) goto L38
            int r5 = -r5
        L38:
            int r12 = r12 + r5
            if (r12 >= r2) goto L3e
            r4 = r11[r6]
            r2 = r12
        L3e:
            if (r1 < 0) goto La
            r5 = r9[r1]
            r9 = r5[r10]
            int r9 = r15 - r9
            if (r9 < r2) goto L4a
            r1 = r3
            goto La
        L4a:
            int r1 = r1 + (-1)
            if (r9 >= 0) goto L4f
            int r9 = -r9
        L4f:
            r8 = r5[r8]
            int r8 = r8 - r14
            if (r8 >= 0) goto L55
            int r8 = -r8
        L55:
            int r9 = r9 + r8
            if (r9 >= r2) goto La
            r7 = r5[r7]
            int r7 = r7 - r16
            if (r7 >= 0) goto L5f
            int r7 = -r7
        L5f:
            int r7 = r7 + r9
            if (r7 >= r2) goto La
            r4 = r5[r6]
            r2 = r7
            goto La
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public byte[] m1668() {
            r32 = this;
            r0 = r32
            r1 = 1
            int r2 = r0.f3532
            r3 = 1509(0x5e5, float:2.115E-42)
            if (r2 >= r3) goto Lb
            r0.f3530 = r1
        Lb:
            int r4 = r0.f3530
            int r5 = r4 + (-1)
            r6 = 3
            int r5 = r5 / r6
            int r5 = r5 + 30
            r0.f3529 = r5
            int r4 = r4 * r6
            int r4 = r2 / r4
            int r5 = r4 / 100
            r8 = 0
        L1b:
            int[] r9 = r0.f3527
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 256(0x100, float:3.59E-43)
            r12 = 32
            if (r8 >= r12) goto L31
            int r12 = r8 * r8
            int r12 = 1024 - r12
            int r12 = r12 * r11
            int r12 = r12 / r10
            int r12 = r12 * r10
            r9[r8] = r12
            int r8 = r8 + 1
            goto L1b
        L31:
            if (r2 >= r3) goto L35
            r3 = r6
            goto L49
        L35:
            int r8 = r2 % 499
            if (r8 == 0) goto L3c
            r3 = 1497(0x5d9, float:2.098E-42)
            goto L49
        L3c:
            int r8 = r2 % 491
            if (r8 == 0) goto L43
            r3 = 1473(0x5c1, float:2.064E-42)
            goto L49
        L43:
            int r8 = r2 % 487
            if (r8 == 0) goto L49
            r3 = 1461(0x5b5, float:2.047E-42)
        L49:
            r8 = 2048(0x800, float:2.87E-42)
            r16 = r6
            r15 = r10
            r13 = 0
            r14 = 0
        L50:
            int[][] r6 = r0.f3528
            r17 = 0
            r18 = 4
            r7 = 255(0xff, float:3.57E-43)
            r19 = 2
            if (r13 >= r4) goto L1bb
            r20 = r1
            byte[] r1 = r0.f3531
            r10 = r1[r14]
            r10 = r10 & r7
            int r10 = r10 << 4
            int r22 = r14 + 1
            r11 = r1[r22]
            r11 = r11 & r7
            int r11 = r11 << 4
            int r22 = r14 + 2
            r1 = r1[r22]
            r1 = r1 & r7
            int r1 = r1 << 4
            r18 = 2147483647(0x7fffffff, float:NaN)
            r23 = r3
            r26 = r4
            r3 = r17
            r7 = r18
            r24 = -1
            r25 = -1
            r18 = r1
            r1 = r7
        L85:
            int[] r4 = r0.f3526
            r27 = r4
            int[] r4 = r0.f3534
            r28 = r4
            r4 = 256(0x100, float:3.59E-43)
            if (r3 >= r4) goto Lcf
            r4 = r6[r3]
            r29 = r4[r17]
            r30 = r3
            int r3 = r29 - r10
            if (r3 >= 0) goto L9c
            int r3 = -r3
        L9c:
            r29 = r4[r20]
            r31 = r3
            int r3 = r29 - r11
            if (r3 >= 0) goto La5
            int r3 = -r3
        La5:
            int r3 = r31 + r3
            r4 = r4[r19]
            int r4 = r4 - r18
            if (r4 >= 0) goto Lae
            int r4 = -r4
        Lae:
            int r3 = r3 + r4
            if (r3 >= r7) goto Lb4
            r7 = r3
            r24 = r30
        Lb4:
            r4 = r28[r30]
            int r4 = r4 >> 12
            int r3 = r3 - r4
            if (r3 >= r1) goto Lbe
            r1 = r3
            r25 = r30
        Lbe:
            r3 = r27[r30]
            int r4 = r3 >> 10
            int r3 = r3 - r4
            r27[r30] = r3
            r3 = r28[r30]
            int r4 = r4 << 10
            int r3 = r3 + r4
            r28[r30] = r3
            int r3 = r30 + 1
            goto L85
        Lcf:
            r1 = r27[r24]
            int r1 = r1 + 64
            r27[r24] = r1
            r1 = r28[r24]
            r3 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 - r3
            r28[r24] = r1
            r1 = r6[r25]
            r3 = r1[r17]
            int r4 = r3 - r10
            int r4 = r4 * r15
            r7 = 1024(0x400, float:1.435E-42)
            int r4 = r4 / r7
            int r3 = r3 - r4
            r1[r17] = r3
            r3 = r1[r20]
            int r4 = r3 - r11
            int r4 = r4 * r15
            int r4 = r4 / r7
            int r3 = r3 - r4
            r1[r20] = r3
            r3 = r1[r19]
            int r4 = r3 - r18
            int r4 = r4 * r15
            int r4 = r4 / r7
            int r3 = r3 - r4
            r1[r19] = r3
            if (r12 == 0) goto L17b
            int r1 = r25 - r12
            r3 = -1
            if (r1 >= r3) goto L103
            r1 = r3
        L103:
            int r3 = r25 + r12
            r4 = 256(0x100, float:3.59E-43)
            if (r3 <= r4) goto L10b
            r3 = 256(0x100, float:3.59E-43)
        L10b:
            int r4 = r25 + 1
            int r25 = r25 + (-1)
            r21 = r20
            r7 = r25
        L113:
            if (r4 < r3) goto L117
            if (r7 <= r1) goto L17b
        L117:
            int r24 = r21 + 1
            r21 = r9[r21]
            r25 = 262144(0x40000, float:3.67342E-40)
            if (r4 >= r3) goto L149
            int r27 = r4 + 1
            r4 = r6[r4]
            r28 = r4[r17]     // Catch: java.lang.Exception -> L147
            int r29 = r28 - r10
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r4[r17] = r28     // Catch: java.lang.Exception -> L147
            r28 = r4[r20]     // Catch: java.lang.Exception -> L147
            int r29 = r28 - r11
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r4[r20] = r28     // Catch: java.lang.Exception -> L147
            r28 = r4[r19]     // Catch: java.lang.Exception -> L147
            int r29 = r28 - r18
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r4[r19] = r28     // Catch: java.lang.Exception -> L147
        L147:
            r4 = r27
        L149:
            if (r7 <= r1) goto L178
            int r27 = r7 + (-1)
            r7 = r6[r7]
            r28 = r7[r17]     // Catch: java.lang.Exception -> L173
            int r29 = r28 - r10
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r7[r17] = r28     // Catch: java.lang.Exception -> L173
            r28 = r7[r20]     // Catch: java.lang.Exception -> L173
            int r29 = r28 - r11
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r7[r20] = r28     // Catch: java.lang.Exception -> L173
            r28 = r7[r19]     // Catch: java.lang.Exception -> L173
            int r29 = r28 - r18
            int r29 = r29 * r21
            int r29 = r29 / r25
            int r28 = r28 - r29
            r7[r19] = r28     // Catch: java.lang.Exception -> L173
        L173:
            r21 = r24
            r7 = r27
            goto L113
        L178:
            r21 = r24
            goto L113
        L17b:
            int r14 = r14 + r23
            if (r14 < r2) goto L180
            int r14 = r14 - r2
        L180:
            int r13 = r13 + 1
            if (r5 != 0) goto L186
            r5 = r20
        L186:
            int r1 = r13 % r5
            if (r1 != 0) goto L1b0
            int r1 = r0.f3529
            int r1 = r15 / r1
            int r15 = r15 - r1
            int r1 = r8 / 30
            int r8 = r8 - r1
            int r1 = r8 >> 6
            r3 = r20
            if (r1 > r3) goto L19b
            r12 = r17
            goto L19c
        L19b:
            r12 = r1
        L19c:
            int r1 = r12 * r12
            r3 = r17
        L1a0:
            if (r3 >= r12) goto L1b0
            int r4 = r3 * r3
            int r4 = r1 - r4
            r10 = 256(0x100, float:3.59E-43)
            int r4 = r4 * r10
            int r4 = r4 / r1
            int r4 = r4 * r15
            r9[r3] = r4
            int r3 = r3 + 1
            goto L1a0
        L1b0:
            r3 = r23
            r4 = r26
            r1 = 1
            r10 = 1024(0x400, float:1.435E-42)
            r11 = 256(0x100, float:3.59E-43)
            goto L50
        L1bb:
            r10 = r11
            r1 = r17
        L1be:
            if (r1 >= r10) goto L1dd
            r2 = r6[r1]
            r3 = r2[r17]
            int r3 = r3 >> 4
            r2[r17] = r3
            r20 = 1
            r3 = r2[r20]
            int r3 = r3 >> 4
            r2[r20] = r3
            r3 = r2[r19]
            int r3 = r3 >> 4
            r2[r19] = r3
            r2[r16] = r1
            int r1 = r1 + 1
            r10 = 256(0x100, float:3.59E-43)
            goto L1be
        L1dd:
            r1 = r17
            r2 = r1
            r3 = r2
        L1e1:
            int[] r4 = r0.f3533
            r10 = 256(0x100, float:3.59E-43)
            if (r1 >= r10) goto L22f
            r5 = r6[r1]
            r20 = 1
            r8 = r5[r20]
            int r9 = r1 + 1
            r12 = r1
            r11 = r9
        L1f1:
            if (r11 >= r10) goto L202
            r10 = r6[r11]
            r10 = r10[r20]
            if (r10 >= r8) goto L1fb
            r8 = r10
            r12 = r11
        L1fb:
            int r11 = r11 + 1
            r10 = 256(0x100, float:3.59E-43)
            r20 = 1
            goto L1f1
        L202:
            r10 = r6[r12]
            if (r1 == r12) goto L217
            r11 = r17
            r12 = r18
        L20a:
            if (r11 >= r12) goto L219
            r13 = r10[r11]
            r14 = r5[r11]
            r10[r11] = r14
            r5[r11] = r13
            int r11 = r11 + 1
            goto L20a
        L217:
            r12 = r18
        L219:
            if (r8 == r2) goto L22b
            int r3 = r3 + r1
            r20 = 1
            int r3 = r3 >> 1
            r4[r2] = r3
        L222:
            int r2 = r2 + 1
            if (r2 >= r8) goto L229
            r4[r2] = r1
            goto L222
        L229:
            r3 = r1
            r2 = r8
        L22b:
            r1 = r9
            r18 = r12
            goto L1e1
        L22f:
            int r3 = r3 + r7
            r20 = 1
            int r0 = r3 >> 1
            r4[r2] = r0
            int r2 = r2 + 1
            r10 = 256(0x100, float:3.59E-43)
        L23a:
            if (r2 >= r10) goto L241
            r4[r2] = r7
            int r2 = r2 + 1
            goto L23a
        L241:
            r0 = 768(0x300, float:1.076E-42)
            byte[] r0 = new byte[r0]
            int[] r1 = new int[r10]
            r2 = r17
        L249:
            if (r2 >= r10) goto L254
            r3 = r6[r2]
            r3 = r3[r16]
            r1[r3] = r2
            int r2 = r2 + 1
            goto L249
        L254:
            r2 = r17
            r3 = r2
        L257:
            if (r2 >= r10) goto L277
            r4 = r1[r2]
            int r5 = r3 + 1
            r4 = r6[r4]
            r7 = r4[r17]
            byte r7 = (byte) r7
            r0[r3] = r7
            int r7 = r3 + 2
            r20 = 1
            r8 = r4[r20]
            byte r8 = (byte) r8
            r0[r5] = r8
            int r3 = r3 + 3
            r4 = r4[r19]
            byte r4 = (byte) r4
            r0[r7] = r4
            int r2 = r2 + 1
            goto L257
        L277:
            return r0
    }
}
