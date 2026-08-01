package p000;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0821t3 {

    /* JADX INFO: renamed from: α */
    public int f10143;

    /* JADX INFO: renamed from: β */
    public int f10144;

    /* JADX INFO: renamed from: γ */
    public int f10145;

    /* JADX INFO: renamed from: δ */
    public int f10146;

    /* JADX INFO: renamed from: ε */
    public java.lang.Integer f10147;

    /* JADX INFO: renamed from: ζ */
    public int f10148;

    /* JADX INFO: renamed from: η */
    public int f10149;

    /* JADX INFO: renamed from: θ */
    public int f10150;

    /* JADX INFO: renamed from: ι */
    public boolean f10151;

    /* JADX INFO: renamed from: κ */
    public java.io.OutputStream f10152;

    /* JADX INFO: renamed from: λ */
    public android.graphics.Bitmap f10153;

    /* JADX INFO: renamed from: μ */
    public byte[] f10154;

    /* JADX INFO: renamed from: ν */
    public byte[] f10155;

    /* JADX INFO: renamed from: ξ */
    public int f10156;

    /* JADX INFO: renamed from: ο */
    public byte[] f10157;

    /* JADX INFO: renamed from: π */
    public boolean[] f10158;

    /* JADX INFO: renamed from: ρ */
    public int f10159;

    /* JADX INFO: renamed from: σ */
    public int f10160;

    /* JADX INFO: renamed from: τ */
    public boolean f10161;

    /* JADX INFO: renamed from: υ */
    public boolean f10162;

    /* JADX INFO: renamed from: φ */
    public int f10163;

    /* JADX INFO: renamed from: χ */
    public boolean f10164;

    /* JADX INFO: renamed from: α */
    public final boolean m5595(android.graphics.Bitmap r4) {
            r3 = this;
            boolean r0 = r3.f10151
            r1 = 0
            if (r0 != 0) goto L7
            goto L8c
        L7:
            boolean r0 = r3.f10162     // Catch: java.io.IOException -> L8c
            if (r0 == 0) goto L14
            int r0 = r3.f10145     // Catch: java.io.IOException -> L8c
            int r2 = r3.f10146     // Catch: java.io.IOException -> L8c
            r3.f10143 = r0     // Catch: java.io.IOException -> L8c
            r3.f10144 = r2     // Catch: java.io.IOException -> L8c
            goto L20
        L14:
            int r0 = r4.getWidth()     // Catch: java.io.IOException -> L8c
            int r2 = r4.getHeight()     // Catch: java.io.IOException -> L8c
            r3.f10143 = r0     // Catch: java.io.IOException -> L8c
            r3.f10144 = r2     // Catch: java.io.IOException -> L8c
        L20:
            r3.f10153 = r4     // Catch: java.io.IOException -> L8c
            r3.m5598()     // Catch: java.io.IOException -> L8c
            r3.m5596()     // Catch: java.io.IOException -> L8c
            boolean r4 = r3.f10161     // Catch: java.io.IOException -> L8c
            if (r4 == 0) goto L53
            int r4 = r3.f10143     // Catch: java.io.IOException -> L8c
            r3.m5603(r4)     // Catch: java.io.IOException -> L8c
            int r4 = r3.f10144     // Catch: java.io.IOException -> L8c
            r3.m5603(r4)     // Catch: java.io.IOException -> L8c
            java.io.OutputStream r4 = r3.f10152     // Catch: java.io.IOException -> L8c
            int r0 = r3.f10159     // Catch: java.io.IOException -> L8c
            r0 = r0 | 240(0xf0, float:3.36E-43)
            r4.write(r0)     // Catch: java.io.IOException -> L8c
            java.io.OutputStream r4 = r3.f10152     // Catch: java.io.IOException -> L8c
            r4.write(r1)     // Catch: java.io.IOException -> L8c
            java.io.OutputStream r4 = r3.f10152     // Catch: java.io.IOException -> L8c
            r4.write(r1)     // Catch: java.io.IOException -> L8c
            r3.m5601()     // Catch: java.io.IOException -> L8c
            int r4 = r3.f10149     // Catch: java.io.IOException -> L8c
            if (r4 < 0) goto L53
            r3.m5600()     // Catch: java.io.IOException -> L8c
        L53:
            r3.m5599()     // Catch: java.io.IOException -> L8c
            java.io.OutputStream r4 = r3.f10152     // Catch: java.io.IOException -> L8c
            r0 = 44
            r4.write(r0)     // Catch: java.io.IOException -> L8c
            r3.m5603(r1)     // Catch: java.io.IOException -> L8c
            r3.m5603(r1)     // Catch: java.io.IOException -> L8c
            int r4 = r3.f10143     // Catch: java.io.IOException -> L8c
            r3.m5603(r4)     // Catch: java.io.IOException -> L8c
            int r4 = r3.f10144     // Catch: java.io.IOException -> L8c
            r3.m5603(r4)     // Catch: java.io.IOException -> L8c
            boolean r4 = r3.f10161     // Catch: java.io.IOException -> L8c
            java.io.OutputStream r0 = r3.f10152     // Catch: java.io.IOException -> L8c
            if (r4 == 0) goto L77
            r0.write(r1)     // Catch: java.io.IOException -> L8c
            goto L7e
        L77:
            int r4 = r3.f10159     // Catch: java.io.IOException -> L8c
            r4 = r4 | 128(0x80, float:1.8E-43)
            r0.write(r4)     // Catch: java.io.IOException -> L8c
        L7e:
            boolean r4 = r3.f10161     // Catch: java.io.IOException -> L8c
            if (r4 != 0) goto L85
            r3.m5601()     // Catch: java.io.IOException -> L8c
        L85:
            r3.m5602()     // Catch: java.io.IOException -> L8c
            r4 = 1
            r3.f10161 = r1     // Catch: java.io.IOException -> L8c
            return r4
        L8c:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public final void m5596() {
            r37 = this;
            r0 = r37
            boolean[] r1 = r0.f10158
            byte[] r2 = r0.f10154
            int r3 = r2.length
            int r4 = r3 / 3
            byte[] r5 = new byte[r4]
            r0.f10155 = r5
            int r5 = r0.f10163
            r6 = 256(0x100, float:3.59E-43)
            int[] r7 = new int[r6]
            int[] r8 = new int[r6]
            int[] r9 = new int[r6]
            r10 = 32
            int[] r11 = new int[r10]
            int[][] r12 = new int[r6][]
            r14 = 0
        L1e:
            r15 = 4
            r16 = 2
            r17 = 0
            if (r14 >= r6) goto L3b
            int[] r15 = new int[r15]
            r12[r14] = r15
            r18 = 1
            int r13 = r14 << 12
            int r13 = r13 / r6
            r15[r16] = r13
            r15[r18] = r13
            r15[r17] = r13
            r9[r14] = r6
            r8[r14] = r17
            int r14 = r14 + 1
            goto L1e
        L3b:
            r18 = 1
            r13 = 1509(0x5e5, float:2.115E-42)
            if (r3 >= r13) goto L43
            r5 = r18
        L43:
            int r14 = r5 + (-1)
            r19 = 3
            int r14 = r14 / 3
            int r14 = r14 + 30
            int r5 = r5 * 3
            int r5 = r3 / r5
            int r20 = r5 / 100
            r21 = r15
            r15 = r17
        L55:
            r13 = 1024(0x400, float:1.435E-42)
            if (r15 >= r10) goto L67
            int r10 = r15 * r15
            int r10 = 1024 - r10
            int r10 = r10 * r6
            int r10 = r10 / r13
            int r10 = r10 * r13
            r11[r15] = r10
            int r15 = r15 + 1
            r10 = 32
            goto L55
        L67:
            r10 = 1509(0x5e5, float:2.115E-42)
            if (r3 >= r10) goto L6e
            r10 = r19
            goto L82
        L6e:
            int r15 = r3 % 499
            if (r15 == 0) goto L75
            r10 = 1497(0x5d9, float:2.098E-42)
            goto L82
        L75:
            int r15 = r3 % 491
            if (r15 == 0) goto L7c
            r10 = 1473(0x5c1, float:2.064E-42)
            goto L82
        L7c:
            int r15 = r3 % 487
            if (r15 == 0) goto L82
            r10 = 1461(0x5b5, float:2.047E-42)
        L82:
            r15 = 2048(0x800, float:2.87E-42)
            r25 = r13
            r13 = r17
            r24 = r13
            r23 = 32
        L8c:
            r6 = 255(0xff, float:3.57E-43)
            if (r13 >= r5) goto L1f1
            r26 = r1
            r1 = r2[r24]
            r1 = r1 & r6
            int r1 = r1 << 4
            int r27 = r24 + 1
            r28 = r1
            r1 = r2[r27]
            r1 = r1 & r6
            int r1 = r1 << 4
            int r27 = r24 + 2
            r29 = r1
            r1 = r2[r27]
            r1 = r1 & r6
            int r1 = r1 << 4
            r6 = 2147483647(0x7fffffff, float:NaN)
            r27 = r1
            r30 = r2
            r33 = r5
            r1 = r6
            r2 = r17
            r31 = -1
            r32 = -1
        Lb9:
            r5 = 256(0x100, float:3.59E-43)
            if (r2 >= r5) goto Lfb
            r5 = r12[r2]
            r34 = r5[r17]
            r35 = r2
            int r2 = r34 - r28
            if (r2 >= 0) goto Lc8
            int r2 = -r2
        Lc8:
            r34 = r5[r18]
            r36 = r2
            int r2 = r34 - r29
            if (r2 >= 0) goto Ld1
            int r2 = -r2
        Ld1:
            int r2 = r36 + r2
            r5 = r5[r16]
            int r5 = r5 - r27
            if (r5 >= 0) goto Lda
            int r5 = -r5
        Lda:
            int r2 = r2 + r5
            if (r2 >= r6) goto Le0
            r6 = r2
            r31 = r35
        Le0:
            r5 = r8[r35]
            int r5 = r5 >> 12
            int r2 = r2 - r5
            if (r2 >= r1) goto Lea
            r1 = r2
            r32 = r35
        Lea:
            r2 = r9[r35]
            int r5 = r2 >> 10
            int r2 = r2 - r5
            r9[r35] = r2
            r2 = r8[r35]
            int r5 = r5 << 10
            int r2 = r2 + r5
            r8[r35] = r2
            int r2 = r35 + 1
            goto Lb9
        Lfb:
            r1 = r9[r31]
            int r1 = r1 + 64
            r9[r31] = r1
            r1 = r8[r31]
            r2 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 - r2
            r8[r31] = r1
            r1 = r12[r32]
            r2 = r1[r17]
            int r5 = r2 - r28
            int r5 = r5 * r25
            r6 = 1024(0x400, float:1.435E-42)
            int r5 = r5 / r6
            int r2 = r2 - r5
            r1[r17] = r2
            r2 = r1[r18]
            int r5 = r2 - r29
            int r5 = r5 * r25
            int r5 = r5 / r6
            int r2 = r2 - r5
            r1[r18] = r2
            r2 = r1[r16]
            int r5 = r2 - r27
            int r5 = r5 * r25
            int r5 = r5 / r6
            int r2 = r2 - r5
            r1[r16] = r2
            if (r23 == 0) goto L1aa
            int r1 = r32 - r23
            r2 = -1
            if (r1 >= r2) goto L132
            r1 = r2
        L132:
            int r2 = r32 + r23
            r5 = 256(0x100, float:3.59E-43)
            if (r2 <= r5) goto L13a
            r2 = 256(0x100, float:3.59E-43)
        L13a:
            int r5 = r32 + 1
            int r32 = r32 + (-1)
            r22 = r18
            r6 = r32
        L142:
            if (r5 < r2) goto L146
            if (r6 <= r1) goto L1aa
        L146:
            int r31 = r22 + 1
            r22 = r11[r22]
            r32 = 262144(0x40000, float:3.67342E-40)
            if (r5 >= r2) goto L178
            int r34 = r5 + 1
            r5 = r12[r5]
            r35 = r5[r17]     // Catch: java.lang.Exception -> L176
            int r36 = r35 - r28
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r5[r17] = r35     // Catch: java.lang.Exception -> L176
            r35 = r5[r18]     // Catch: java.lang.Exception -> L176
            int r36 = r35 - r29
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r5[r18] = r35     // Catch: java.lang.Exception -> L176
            r35 = r5[r16]     // Catch: java.lang.Exception -> L176
            int r36 = r35 - r27
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r5[r16] = r35     // Catch: java.lang.Exception -> L176
        L176:
            r5 = r34
        L178:
            if (r6 <= r1) goto L1a7
            int r34 = r6 + (-1)
            r6 = r12[r6]
            r35 = r6[r17]     // Catch: java.lang.Exception -> L1a2
            int r36 = r35 - r28
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r6[r17] = r35     // Catch: java.lang.Exception -> L1a2
            r35 = r6[r18]     // Catch: java.lang.Exception -> L1a2
            int r36 = r35 - r29
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r6[r18] = r35     // Catch: java.lang.Exception -> L1a2
            r35 = r6[r16]     // Catch: java.lang.Exception -> L1a2
            int r36 = r35 - r27
            int r36 = r36 * r22
            int r36 = r36 / r32
            int r35 = r35 - r36
            r6[r16] = r35     // Catch: java.lang.Exception -> L1a2
        L1a2:
            r22 = r31
            r6 = r34
            goto L142
        L1a7:
            r22 = r31
            goto L142
        L1aa:
            int r1 = r24 + r10
            if (r1 < r3) goto L1af
            int r1 = r1 - r3
        L1af:
            r24 = r1
            int r13 = r13 + 1
            if (r20 != 0) goto L1b7
            r20 = r18
        L1b7:
            int r1 = r13 % r20
            if (r1 != 0) goto L1e7
            int r1 = r25 / r14
            int r25 = r25 - r1
            int r1 = r15 / 30
            int r15 = r15 - r1
            int r1 = r15 >> 6
            r2 = r18
            if (r1 > r2) goto L1ca
            r1 = r17
        L1ca:
            r2 = r17
        L1cc:
            if (r2 >= r1) goto L1e3
            int r5 = r1 * r1
            int r6 = r2 * r2
            int r6 = r5 - r6
            r22 = r1
            r1 = 256(0x100, float:3.59E-43)
            int r6 = r6 * r1
            int r6 = r6 / r5
            int r6 = r6 * r25
            r11[r2] = r6
            int r2 = r2 + 1
            r1 = r22
            goto L1cc
        L1e3:
            r22 = r1
            r23 = r22
        L1e7:
            r1 = r26
            r2 = r30
            r5 = r33
            r18 = 1
            goto L8c
        L1f1:
            r26 = r1
            r2 = -1
            r3 = r17
        L1f6:
            r1 = 256(0x100, float:3.59E-43)
            if (r3 >= r1) goto L215
            r1 = r12[r3]
            r5 = r1[r17]
            int r5 = r5 >> 4
            r1[r17] = r5
            r18 = 1
            r5 = r1[r18]
            int r5 = r5 >> 4
            r1[r18] = r5
            r5 = r1[r16]
            int r5 = r5 >> 4
            r1[r16] = r5
            r1[r19] = r3
            int r3 = r3 + 1
            goto L1f6
        L215:
            r8 = r1
            r1 = r17
            r3 = r1
            r5 = r3
        L21a:
            r18 = 1
            if (r1 >= r8) goto L273
            r9 = r12[r1]
            r10 = r9[r18]
            int r11 = r1 + 1
            r14 = r1
            r13 = r11
        L226:
            if (r13 >= r8) goto L237
            r8 = r12[r13]
            r8 = r8[r18]
            if (r8 >= r10) goto L230
            r10 = r8
            r14 = r13
        L230:
            int r13 = r13 + 1
            r8 = 256(0x100, float:3.59E-43)
            r18 = 1
            goto L226
        L237:
            r8 = r12[r14]
            if (r1 == r14) goto L25d
            r13 = r8[r17]
            r14 = r9[r17]
            r8[r17] = r14
            r9[r17] = r13
            r18 = 1
            r13 = r8[r18]
            r14 = r9[r18]
            r8[r18] = r14
            r9[r18] = r13
            r13 = r8[r16]
            r14 = r9[r16]
            r8[r16] = r14
            r9[r16] = r13
            r13 = r8[r19]
            r14 = r9[r19]
            r8[r19] = r14
            r9[r19] = r13
        L25d:
            if (r10 == r3) goto L26f
            int r5 = r5 + r1
            r18 = 1
            int r5 = r5 >> 1
            r7[r3] = r5
        L266:
            int r3 = r3 + 1
            if (r3 >= r10) goto L26d
            r7[r3] = r1
            goto L266
        L26d:
            r5 = r1
            r3 = r10
        L26f:
            r1 = r11
            r8 = 256(0x100, float:3.59E-43)
            goto L21a
        L273:
            int r5 = r5 + r6
            r18 = 1
            int r1 = r5 >> 1
            r7[r3] = r1
            int r3 = r3 + 1
            r5 = 256(0x100, float:3.59E-43)
        L27e:
            if (r3 >= r5) goto L285
            r7[r3] = r6
            int r3 = r3 + 1
            goto L27e
        L285:
            r1 = 768(0x300, float:1.076E-42)
            byte[] r1 = new byte[r1]
            int[] r3 = new int[r5]
            r8 = r17
        L28d:
            if (r8 >= r5) goto L298
            r9 = r12[r8]
            r9 = r9[r19]
            r3[r9] = r8
            int r8 = r8 + 1
            goto L28d
        L298:
            r8 = r17
            r9 = r8
        L29b:
            if (r8 >= r5) goto L2bd
            r5 = r3[r8]
            int r10 = r9 + 1
            r5 = r12[r5]
            r11 = r5[r17]
            byte r11 = (byte) r11
            r1[r9] = r11
            int r11 = r9 + 2
            r18 = 1
            r13 = r5[r18]
            byte r13 = (byte) r13
            r1[r10] = r13
            int r9 = r9 + 3
            r5 = r5[r16]
            byte r5 = (byte) r5
            r1[r11] = r5
            int r8 = r8 + 1
            r5 = 256(0x100, float:3.59E-43)
            goto L29b
        L2bd:
            r0.f10157 = r1
            r1 = r17
        L2c1:
            byte[] r3 = r0.f10157
            int r5 = r3.length
            if (r1 >= r5) goto L2d7
            r5 = r3[r1]
            int r8 = r1 + 2
            r9 = r3[r8]
            r3[r1] = r9
            r3[r8] = r5
            int r3 = r1 / 3
            r26[r3] = r17
            int r1 = r1 + 3
            goto L2c1
        L2d7:
            r1 = r17
            r3 = r1
        L2da:
            if (r1 >= r4) goto L368
            byte[] r5 = r0.f10154
            int r8 = r3 + 1
            r9 = r5[r3]
            r9 = r9 & r6
            int r10 = r3 + 2
            r8 = r5[r8]
            r8 = r8 & r6
            int r3 = r3 + 3
            r5 = r5[r10]
            r5 = r5 & r6
            r10 = r7[r8]
            int r11 = r10 + (-1)
            r13 = 1000(0x3e8, float:1.401E-42)
            r15 = r2
            r14 = r13
            r13 = r11
        L2f6:
            r11 = 256(0x100, float:3.59E-43)
        L2f8:
            if (r10 < r11) goto L2fc
            if (r13 < 0) goto L2ff
        L2fc:
            r18 = 1
            goto L30b
        L2ff:
            r18 = 1
            r26[r15] = r18
            byte[] r5 = r0.f10155
            byte r8 = (byte) r15
            r5[r1] = r8
            int r1 = r1 + 1
            goto L2da
        L30b:
            if (r10 >= r11) goto L332
            r20 = r12[r10]
            r21 = r20[r18]
            int r2 = r21 - r8
            if (r2 < r14) goto L317
            r10 = r11
            goto L332
        L317:
            int r10 = r10 + 1
            if (r2 >= 0) goto L31c
            int r2 = -r2
        L31c:
            r21 = r20[r17]
            int r6 = r21 - r9
            if (r6 >= 0) goto L323
            int r6 = -r6
        L323:
            int r2 = r2 + r6
            if (r2 >= r14) goto L332
            r6 = r20[r16]
            int r6 = r6 - r5
            if (r6 >= 0) goto L32c
            int r6 = -r6
        L32c:
            int r2 = r2 + r6
            if (r2 >= r14) goto L332
            r15 = r20[r19]
            r14 = r2
        L332:
            if (r13 < 0) goto L362
            r2 = r12[r13]
            r18 = 1
            r6 = r2[r18]
            int r6 = r8 - r6
            if (r6 < r14) goto L343
            r2 = -1
            r6 = 255(0xff, float:3.57E-43)
            r13 = -1
            goto L2f8
        L343:
            int r13 = r13 + (-1)
            if (r6 >= 0) goto L348
            int r6 = -r6
        L348:
            r20 = r2[r17]
            int r11 = r20 - r9
            if (r11 >= 0) goto L34f
            int r11 = -r11
        L34f:
            int r6 = r6 + r11
            if (r6 >= r14) goto L35e
            r11 = r2[r16]
            int r11 = r11 - r5
            if (r11 >= 0) goto L358
            int r11 = -r11
        L358:
            int r6 = r6 + r11
            if (r6 >= r14) goto L35e
            r15 = r2[r19]
            r14 = r6
        L35e:
            r2 = -1
            r6 = 255(0xff, float:3.57E-43)
            goto L2f6
        L362:
            r18 = 1
            r2 = -1
            r6 = 255(0xff, float:3.57E-43)
            goto L2f8
        L368:
            r1 = 0
            r0.f10154 = r1
            r1 = 8
            r0.f10156 = r1
            r1 = 7
            r0.f10159 = r1
            java.lang.Integer r1 = r0.f10147
            if (r1 == 0) goto L381
            int r1 = r1.intValue()
            int r1 = r0.m5597(r1)
            r0.f10148 = r1
            goto L38d
        L381:
            boolean r1 = r0.f10164
            if (r1 == 0) goto L38d
            r1 = r17
            int r1 = r0.m5597(r1)
            r0.f10148 = r1
        L38d:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final int m5597(int r11) {
            r10 = this;
            byte[] r0 = r10.f10157
            if (r0 != 0) goto L6
            r10 = -1
            return r10
        L6:
            int r0 = android.graphics.Color.red(r11)
            int r1 = android.graphics.Color.green(r11)
            int r11 = android.graphics.Color.blue(r11)
            byte[] r2 = r10.f10157
            int r2 = r2.length
            r3 = 0
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = r4
            r4 = r3
        L1a:
            if (r3 >= r2) goto L48
            byte[] r6 = r10.f10157
            int r7 = r3 + 1
            r8 = r6[r3]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r0 - r8
            int r9 = r3 + 2
            r7 = r6[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r1 - r7
            r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r11 - r6
            int r8 = r8 * r8
            int r7 = r7 * r7
            int r7 = r7 + r8
            int r6 = r6 * r6
            int r6 = r6 + r7
            int r9 = r9 / 3
            boolean[] r7 = r10.f10158
            boolean r7 = r7[r9]
            if (r7 == 0) goto L45
            if (r6 >= r5) goto L45
            r5 = r6
            r4 = r9
        L45:
            int r3 = r3 + 3
            goto L1a
        L48:
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public final void m5598() {
            r12 = this;
            android.graphics.Bitmap r0 = r12.f10153
            int r4 = r0.getWidth()
            android.graphics.Bitmap r0 = r12.f10153
            int r8 = r0.getHeight()
            int r0 = r12.f10143
            if (r4 != r0) goto L14
            int r1 = r12.f10144
            if (r8 == r1) goto L28
        L14:
            int r1 = r12.f10144
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r1.drawBitmap(r0, r3, r3, r2)
            r12.f10153 = r0
        L28:
            int r0 = r4 * r8
            int[] r2 = new int[r0]
            android.graphics.Bitmap r1 = r12.f10153
            r5 = 0
            r6 = 0
            r3 = 0
            r7 = r4
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)
            int r1 = r0 * 3
            byte[] r1 = new byte[r1]
            r12.f10154 = r1
            r1 = 0
            r12.f10164 = r1
            r3 = r1
            r4 = r3
            r5 = r4
        L41:
            r6 = 3
            if (r3 >= r0) goto L67
            r7 = r2[r3]
            if (r7 != 0) goto L4a
            int r4 = r4 + 1
        L4a:
            byte[] r8 = r12.f10154
            int r9 = r5 + 1
            r10 = r7 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r8[r5] = r10
            int r10 = r5 + 2
            int r11 = r7 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r8[r9] = r11
            int r5 = r5 + r6
            int r6 = r7 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r8[r10] = r6
            int r3 = r3 + 1
            goto L41
        L67:
            int r4 = r4 * 100
            double r2 = (double) r4
            double r4 = (double) r0
            double r2 = r2 / r4
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L73
            r1 = 1
        L73:
            r12.f10164 = r1
            java.lang.String r12 = "AnimatedGifEncoder"
            boolean r0 = android.util.Log.isLoggable(r12, r6)
            if (r0 == 0) goto L93
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "got pixels for frame with "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = "% transparent pixels"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r12, r0)
        L93:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m5599() {
            r5 = this;
            java.io.OutputStream r0 = r5.f10152
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r5.f10152
            r1 = 249(0xf9, float:3.49E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r5.f10152
            r1 = 4
            r0.write(r1)
            java.lang.Integer r0 = r5.f10147
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L21
            boolean r0 = r5.f10164
            if (r0 != 0) goto L21
            r0 = r2
            r3 = r0
            goto L23
        L21:
            r0 = 1
            r3 = r1
        L23:
            int r4 = r5.f10160
            if (r4 < 0) goto L29
            r3 = r4 & 7
        L29:
            int r1 = r3 << 2
            java.io.OutputStream r3 = r5.f10152
            r0 = r0 | r1
            r3.write(r0)
            int r0 = r5.f10150
            r5.m5603(r0)
            java.io.OutputStream r0 = r5.f10152
            int r1 = r5.f10148
            r0.write(r1)
            java.io.OutputStream r5 = r5.f10152
            r5.write(r2)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m5600() {
            r5 = this;
            java.io.OutputStream r0 = r5.f10152
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r5.f10152
            r1 = 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r5.f10152
            r1 = 11
            r0.write(r1)
            r0 = 0
            r2 = r0
        L17:
            java.io.OutputStream r3 = r5.f10152
            if (r2 >= r1) goto L28
            java.lang.String r4 = "NETSCAPE2.0"
            char r4 = r4.charAt(r2)
            byte r4 = (byte) r4
            r3.write(r4)
            int r2 = r2 + 1
            goto L17
        L28:
            r1 = 3
            r3.write(r1)
            java.io.OutputStream r1 = r5.f10152
            r2 = 1
            r1.write(r2)
            int r1 = r5.f10149
            r5.m5603(r1)
            java.io.OutputStream r5 = r5.f10152
            r5.write(r0)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m5601() {
            r4 = this;
            java.io.OutputStream r0 = r4.f10152
            byte[] r1 = r4.f10157
            int r2 = r1.length
            r3 = 0
            r0.write(r1, r3, r2)
            byte[] r0 = r4.f10157
            int r0 = r0.length
            int r0 = 768 - r0
            r1 = r3
        Lf:
            if (r1 >= r0) goto L19
            java.io.OutputStream r2 = r4.f10152
            r2.write(r3)
            int r1 = r1 + 1
            goto Lf
        L19:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m5602() {
            r14 = this;
            zo0 r0 = new zo0
            int r1 = r14.f10143
            int r2 = r14.f10144
            byte[] r3 = r14.f10155
            int r4 = r14.f10156
            r0.<init>()
            r5 = 5003(0x138b, float:7.01E-42)
            int[] r6 = new int[r5]
            r0.f13218 = r6
            int[] r7 = new int[r5]
            r8 = 0
            r0.f13219 = r8
            r0.f13220 = r8
            r0.f13224 = r8
            r0.f13225 = r8
            r9 = 17
            int[] r9 = new int[r9]
            r9 = {x00f2: FILL_ARRAY_DATA , data: [0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535} // fill-array
            r0.f13226 = r9
            r9 = 256(0x100, float:3.59E-43)
            byte[] r9 = new byte[r9]
            r0.f13228 = r9
            r0.f13213 = r3
            r9 = 2
            int r4 = java.lang.Math.max(r9, r4)
            java.io.OutputStream r14 = r14.f10152
            r14.write(r4)
            int r1 = r1 * r2
            r0.f13214 = r1
            r0.f13215 = r8
            int r2 = r4 + 1
            r0.f13221 = r2
            r0.f13220 = r8
            r0.f13216 = r2
            r10 = 1
            int r2 = r10 << r2
            int r2 = r2 - r10
            r0.f13217 = r2
            int r2 = r10 << r4
            r0.f13222 = r2
            int r4 = r2 + 1
            r0.f13223 = r4
            int r2 = r2 + r9
            r0.f13219 = r2
            r0.f13227 = r8
            r2 = -1
            if (r1 != 0) goto L5e
            r1 = r2
            goto L67
        L5e:
            int r1 = r1 - r10
            r0.f13214 = r1
            r0.f13215 = r10
            r1 = r3[r8]
            r1 = r1 & 255(0xff, float:3.57E-43)
        L67:
            r3 = r5
            r4 = r8
        L69:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r3 >= r9) goto L72
            int r4 = r4 + 1
            int r3 = r3 * 2
            goto L69
        L72:
            int r3 = 8 - r4
            r4 = r8
        L75:
            if (r4 >= r5) goto L7e
            int[] r9 = r0.f13218
            r9[r4] = r2
            int r4 = r4 + 1
            goto L75
        L7e:
            int r4 = r0.f13222
            r0.m7216(r4, r14)
        L83:
            int r4 = r0.f13214
            if (r4 != 0) goto L89
            r4 = r2
            goto L99
        L89:
            int r4 = r4 + (-1)
            r0.f13214 = r4
            byte[] r4 = r0.f13213
            int r9 = r0.f13215
            int r11 = r9 + 1
            r0.f13215 = r11
            r4 = r4[r9]
            r4 = r4 & 255(0xff, float:3.57E-43)
        L99:
            if (r4 == r2) goto Le6
            int r9 = r4 << 12
            int r9 = r9 + r1
            int r11 = r4 << r3
            r11 = r11 ^ r1
            r12 = r6[r11]
            if (r12 != r9) goto La8
            r1 = r7[r11]
            goto L83
        La8:
            if (r12 < 0) goto Lbd
            int r12 = 5003 - r11
            if (r11 != 0) goto Laf
            r12 = r10
        Laf:
            int r11 = r11 - r12
            if (r11 >= 0) goto Lb4
            int r11 = r11 + 5003
        Lb4:
            r13 = r6[r11]
            if (r13 != r9) goto Lbb
            r1 = r7[r11]
            goto L83
        Lbb:
            if (r13 >= 0) goto Laf
        Lbd:
            r0.m7216(r1, r14)
            int r1 = r0.f13219
            r12 = 4096(0x1000, float:5.74E-42)
            if (r1 >= r12) goto Lcf
            int r12 = r1 + 1
            r0.f13219 = r12
            r7[r11] = r1
            r6[r11] = r9
            goto Le4
        Lcf:
            r1 = r8
        Ld0:
            if (r1 >= r5) goto Ld9
            int[] r9 = r0.f13218
            r9[r1] = r2
            int r1 = r1 + 1
            goto Ld0
        Ld9:
            int r1 = r0.f13222
            int r9 = r1 + 2
            r0.f13219 = r9
            r0.f13220 = r10
            r0.m7216(r1, r14)
        Le4:
            r1 = r4
            goto L83
        Le6:
            r0.m7216(r1, r14)
            int r1 = r0.f13223
            r0.m7216(r1, r14)
            r14.write(r8)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m5603(int r3) {
            r2 = this;
            java.io.OutputStream r0 = r2.f10152
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r2 = r2.f10152
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2.write(r3)
            return
    }
}
