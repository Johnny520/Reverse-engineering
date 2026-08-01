package defpackage;

/* JADX INFO: renamed from: ᛸᛶᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1520 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean[] f6701;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f6702;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f6703;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f6704;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f6705;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f6706;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.io.BufferedOutputStream f6707;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f6708;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f6709;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f6710;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f6711;

    public C1520(java.io.BufferedOutputStream r3) {
            r2 = this;
            r0 = -1155471041273390(0xfffbe51aef0961d2, double:NaN)
            r2.<init>()
            r2.f6707 = r3
            r3 = 256(0x100, float:3.59E-43)
            boolean[] r3 = new boolean[r3]
            r2.f6701 = r3
            r3 = 1
            r2.f6703 = r3
            r3 = 10
            r2.f6702 = r3
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m2764(int r2) {
            r1 = this;
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.io.BufferedOutputStream r1 = r1.f6707
            r1.write(r0)
            int r2 = r2 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m2765(byte[] r17) {
            r16 = this;
            r0 = r16
            ᛱᛵᲁᛱ r1 = new ᛱᛵᲁᛱ
            int r2 = r0.f6711
            r3 = r17
            r1.<init>(r2, r3)
            r2 = -1151493901557294(0xfffbe8b8ef0961d2, double:NaN)
            java.io.BufferedOutputStream r0 = r0.f6707
            int r2 = r1.f920
            r0.write(r2)
            int r3 = r2 + 1
            r1.f922 = r3
            r4 = 0
            r1.f915 = r4
            r1.f919 = r3
            r5 = 1
            int r3 = r5 << r3
            int r3 = r3 - r5
            r1.f917 = r3
            int r2 = r5 << r2
            r1.f913 = r2
            int r3 = r2 + 1
            r1.f914 = r3
            int r2 = r2 + 2
            r1.f912 = r2
            r1.f927 = r4
            int[] r2 = r1.f925
            int r3 = r2.length
            if (r3 == 0) goto Lc8
            r3 = r2[r4]
            r6 = 5003(0x138b, float:7.01E-42)
            r8 = r4
            r7 = r6
        L42:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r9) goto L4b
            int r8 = r8 + 1
            int r7 = r7 * 2
            goto L42
        L4b:
            int r7 = 8 - r8
            r8 = r4
        L4e:
            r9 = -1
            int[] r10 = r1.f926
            if (r8 >= r6) goto L58
            r10[r8] = r9
            int r8 = r8 + 1
            goto L4e
        L58:
            int r8 = r1.f913
            r1.m595(r8, r0)
            int r8 = r2.length
            r11 = r5
        L5f:
            if (r11 >= r8) goto Lbc
            r12 = r2[r11]
            int r13 = r12 << 12
            int r13 = r13 + r3
            int r12 = r12 << r7
            r12 = r12 ^ r3
            r14 = r10[r12]
            int[] r15 = r1.f928
            if (r14 != r13) goto L73
            r3 = r15[r12]
            r16 = r9
            goto Lb7
        L73:
            if (r14 < 0) goto L8e
            int r14 = 5003 - r12
            if (r12 != 0) goto L7a
            r14 = r5
        L7a:
            int r12 = r12 - r14
            if (r12 >= 0) goto L7f
            int r12 = r12 + 5003
        L7f:
            r16 = r9
            r9 = r10[r12]
            if (r9 != r13) goto L88
            r3 = r15[r12]
            goto Lb7
        L88:
            if (r9 >= 0) goto L8b
            goto L90
        L8b:
            r9 = r16
            goto L7a
        L8e:
            r16 = r9
        L90:
            r1.m595(r3, r0)
            r3 = r2[r11]
            int r9 = r1.f912
            r14 = 4096(0x1000, float:5.74E-42)
            if (r9 >= r14) goto La4
            int r14 = r9 + 1
            r1.f912 = r14
            r15[r12] = r9
            r10[r12] = r13
            goto Lb7
        La4:
            r9 = r4
        La5:
            if (r9 >= r6) goto Lac
            r10[r9] = r16
            int r9 = r9 + 1
            goto La5
        Lac:
            int r9 = r1.f913
            int r12 = r9 + 2
            r1.f912 = r12
            r1.f915 = r5
            r1.m595(r9, r0)
        Lb7:
            int r11 = r11 + 1
            r9 = r16
            goto L5f
        Lbc:
            r1.m595(r3, r0)
            int r2 = r1.f914
            r1.m595(r2, r0)
            r0.write(r4)
            return
        Lc8:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final byte[] m2766(android.graphics.Bitmap r13) {
            r12 = this;
            int r0 = r13.getWidth()
            int r1 = r13.getHeight()
            int r2 = r12.f6709
            if (r0 != r2) goto L13
            int r0 = r12.f6706
            if (r1 == r0) goto L11
            goto L13
        L11:
            r4 = r13
            goto L2a
        L13:
            int r0 = r12.f6706
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r0, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r3 = 0
            r1.drawBitmap(r13, r3, r3, r2)
            r4 = r0
        L2a:
            int r7 = r12.f6709
            int r11 = r12.f6706
            int r12 = r7 * r11
            int[] r5 = new int[r12]
            r8 = 0
            r9 = 0
            r6 = 0
            r10 = r7
            r4.getPixels(r5, r6, r7, r8, r9, r10, r11)
            if (r4 == r13) goto L3e
            r4.recycle()
        L3e:
            int r13 = r12 * 3
            byte[] r13 = new byte[r13]
            r0 = 0
        L43:
            if (r0 >= r12) goto L63
            int r1 = r0 * 3
            r2 = r5[r0]
            r3 = r2 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r13[r1] = r3
            int r3 = r1 + 1
            int r4 = r2 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r13[r3] = r4
            int r1 = r1 + 2
            int r2 = r2 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r13[r1] = r2
            int r0 = r0 + 1
            goto L43
        L63:
            return r13
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2767(android.graphics.Bitmap r9) {
            r8 = this;
            r0 = -1155518285913646(0xfffbe50fef0961d2, double:NaN)
            boolean r0 = r8.f6710
            if (r0 == 0) goto Led
            boolean r0 = r8.f6708     // Catch: java.lang.Exception -> Lec
            r1 = 1
            if (r0 != 0) goto L27
            int r0 = r9.getWidth()     // Catch: java.lang.Exception -> Lec
            int r2 = r9.getHeight()     // Catch: java.lang.Exception -> Lec
            if (r0 >= r1) goto L1d
            r0 = 320(0x140, float:4.48E-43)
        L1d:
            r8.f6709 = r0     // Catch: java.lang.Exception -> Lec
            if (r2 >= r1) goto L23
            r2 = 240(0xf0, float:3.36E-43)
        L23:
            r8.f6706 = r2     // Catch: java.lang.Exception -> Lec
            r8.f6708 = r1     // Catch: java.lang.Exception -> Lec
        L27:
            byte[] r9 = r8.m2766(r9)     // Catch: java.lang.Exception -> Lec
            ᛸᛲᛴᛱ r9 = r8.m2768(r9)     // Catch: java.lang.Exception -> Lec
            byte[] r0 = r9.f6289     // Catch: java.lang.Exception -> Lec
            boolean r2 = r8.f6703     // Catch: java.lang.Exception -> Lec
            r3 = 33
            java.io.BufferedOutputStream r4 = r8.f6707
            r5 = 0
            if (r2 == 0) goto L93
            int r2 = r8.f6709     // Catch: java.lang.Exception -> Lec
            r8.m2764(r2)     // Catch: java.lang.Exception -> Lec
            int r2 = r8.f6706     // Catch: java.lang.Exception -> Lec
            r8.m2764(r2)     // Catch: java.lang.Exception -> Lec
            r2 = 247(0xf7, float:3.46E-43)
            r4.write(r2)     // Catch: java.lang.Exception -> Lec
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            int r2 = r0.length     // Catch: java.lang.Exception -> Lec
            r4.write(r0, r5, r2)     // Catch: java.lang.Exception -> Lec
            int r2 = r0.length     // Catch: java.lang.Exception -> Lec
            int r2 = 768 - r2
            r6 = r5
        L57:
            if (r6 >= r2) goto L5f
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            int r6 = r6 + 1
            goto L57
        L5f:
            r4.write(r3)     // Catch: java.lang.Exception -> Lec
            r2 = 255(0xff, float:3.57E-43)
            r4.write(r2)     // Catch: java.lang.Exception -> Lec
            r2 = 11
            r4.write(r2)     // Catch: java.lang.Exception -> Lec
            r6 = -1155724444343854(0xfffbe4dfef0961d2, double:NaN)
            java.lang.String r2 = "NETSCAPE2.0"     // Catch: java.lang.Exception -> Lec
            java.nio.charset.Charset r6 = defpackage.AbstractC1422.f6221     // Catch: java.lang.Exception -> Lec
            byte[] r2 = r2.getBytes(r6)     // Catch: java.lang.Exception -> Lec
            r6 = -1155775983951406(0xfffbe4d3ef0961d2, double:NaN)
            r4.write(r2)     // Catch: java.lang.Exception -> Lec
            r2 = 3
            r4.write(r2)     // Catch: java.lang.Exception -> Lec
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
            r8.m2764(r5)     // Catch: java.lang.Exception -> Lec
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
        L93:
            r4.write(r3)     // Catch: java.lang.Exception -> Lec
            r1 = 249(0xf9, float:3.49E-43)
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
            r1 = 4
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            int r1 = r8.f6704     // Catch: java.lang.Exception -> Lec
            r8.m2764(r1)     // Catch: java.lang.Exception -> Lec
            int r1 = r8.f6705     // Catch: java.lang.Exception -> Lec
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            r1 = 44
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
            r8.m2764(r5)     // Catch: java.lang.Exception -> Lec
            r8.m2764(r5)     // Catch: java.lang.Exception -> Lec
            int r1 = r8.f6709     // Catch: java.lang.Exception -> Lec
            r8.m2764(r1)     // Catch: java.lang.Exception -> Lec
            int r1 = r8.f6706     // Catch: java.lang.Exception -> Lec
            r8.m2764(r1)     // Catch: java.lang.Exception -> Lec
            boolean r1 = r8.f6703     // Catch: java.lang.Exception -> Lec
            if (r1 == 0) goto Lcc
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            goto Ld1
        Lcc:
            r1 = 135(0x87, float:1.89E-43)
            r4.write(r1)     // Catch: java.lang.Exception -> Lec
        Ld1:
            boolean r1 = r8.f6703     // Catch: java.lang.Exception -> Lec
            if (r1 != 0) goto Le5
            int r1 = r0.length     // Catch: java.lang.Exception -> Lec
            r4.write(r0, r5, r1)     // Catch: java.lang.Exception -> Lec
            int r0 = r0.length     // Catch: java.lang.Exception -> Lec
            int r0 = 768 - r0
            r1 = r5
        Ldd:
            if (r1 >= r0) goto Le5
            r4.write(r5)     // Catch: java.lang.Exception -> Lec
            int r1 = r1 + 1
            goto Ldd
        Le5:
            byte[] r9 = r9.f6288     // Catch: java.lang.Exception -> Lec
            r8.m2765(r9)     // Catch: java.lang.Exception -> Lec
            r8.f6703 = r5     // Catch: java.lang.Exception -> Lec
        Lec:
            return
        Led:
            r8 = -1155548350684718(0xfffbe508ef0961d2, double:NaN)
            java.lang.String r8 = "Encoder not started. Call start() first."
            defpackage.C2264.m3676(r8)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1431 m2768(byte[] r35) {
            r34 = this;
            r0 = r34
            r1 = r35
            int r2 = r1.length
            int r3 = r2 / 3
            byte[] r4 = new byte[r3]
            ᛴᲀᲀᲁ r5 = new ᛴᲀᲀᲁ
            int r6 = r0.f6702
            r7 = 1
            r5.<init>(r2, r6, r7, r1)
            int r2 = r5.f3532
            r6 = 1509(0x5e5, float:2.115E-42)
            if (r2 >= r6) goto L19
            r5.f3530 = r7
        L19:
            int r8 = r5.f3530
            int r9 = r8 + (-1)
            r10 = 3
            int r9 = r9 / r10
            int r9 = r9 + 30
            r5.f3529 = r9
            int r8 = r8 * r10
            int r8 = r2 / r8
            int r9 = r8 / 100
            r12 = 0
        L29:
            int[] r13 = r5.f3527
            r14 = 1024(0x400, float:1.435E-42)
            r15 = 256(0x100, float:3.59E-43)
            r16 = r10
            r10 = 32
            if (r12 >= r10) goto L43
            int r10 = r12 * r12
            int r10 = 1024 - r10
            int r10 = r10 * r15
            int r10 = r10 / r14
            int r10 = r10 * r14
            r13[r12] = r10
            int r12 = r12 + 1
            r10 = r16
            goto L29
        L43:
            if (r2 >= r6) goto L48
            r6 = r16
            goto L5c
        L48:
            int r12 = r2 % 499
            if (r12 == 0) goto L4f
            r6 = 1497(0x5d9, float:2.098E-42)
            goto L5c
        L4f:
            int r12 = r2 % 491
            if (r12 == 0) goto L56
            r6 = 1473(0x5c1, float:2.064E-42)
            goto L5c
        L56:
            int r12 = r2 % 487
            if (r12 == 0) goto L5c
            r6 = 1461(0x5b5, float:2.047E-42)
        L5c:
            r12 = 2048(0x800, float:2.87E-42)
            r20 = r7
            r19 = r14
            r11 = 0
            r17 = 0
            r18 = 0
        L67:
            int[][] r7 = r5.f3528
            r22 = 4
            r14 = 255(0xff, float:3.57E-43)
            r23 = 2
            if (r11 >= r8) goto L1d5
            byte[] r15 = r5.f3531
            r1 = r15[r18]
            r1 = r1 & r14
            int r1 = r1 << 4
            int r24 = r18 + 1
            r25 = r1
            r1 = r15[r24]
            r1 = r1 & r14
            int r1 = r1 << 4
            int r24 = r18 + 2
            r15 = r15[r24]
            r14 = r14 & r15
            int r14 = r14 << 4
            r15 = 2147483647(0x7fffffff, float:NaN)
            r24 = r1
            r26 = r6
            r28 = r7
            r1 = r15
            r6 = r17
            r22 = -1
            r27 = -1
        L98:
            int[] r7 = r5.f3526
            r29 = r7
            int[] r7 = r5.f3534
            r30 = r7
            r7 = 256(0x100, float:3.59E-43)
            if (r6 >= r7) goto Le1
            r7 = r28[r6]
            r31 = r7[r17]
            r32 = r6
            int r6 = r31 - r25
            if (r6 >= 0) goto Laf
            int r6 = -r6
        Laf:
            r31 = r7[r20]
            r33 = r6
            int r6 = r31 - r24
            if (r6 >= 0) goto Lb8
            int r6 = -r6
        Lb8:
            int r6 = r33 + r6
            r7 = r7[r23]
            int r7 = r7 - r14
            if (r7 >= 0) goto Lc0
            int r7 = -r7
        Lc0:
            int r6 = r6 + r7
            if (r6 >= r15) goto Lc6
            r15 = r6
            r22 = r32
        Lc6:
            r7 = r30[r32]
            int r7 = r7 >> 12
            int r6 = r6 - r7
            if (r6 >= r1) goto Ld0
            r1 = r6
            r27 = r32
        Ld0:
            r6 = r29[r32]
            int r7 = r6 >> 10
            int r6 = r6 - r7
            r29[r32] = r6
            r6 = r30[r32]
            int r7 = r7 << 10
            int r6 = r6 + r7
            r30[r32] = r6
            int r6 = r32 + 1
            goto L98
        Le1:
            r1 = r29[r22]
            int r1 = r1 + 64
            r29[r22] = r1
            r1 = r30[r22]
            r6 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 - r6
            r30[r22] = r1
            r1 = r28[r27]
            r6 = r1[r17]
            int r7 = r6 - r25
            int r7 = r7 * r19
            r15 = 1024(0x400, float:1.435E-42)
            int r7 = r7 / r15
            int r6 = r6 - r7
            r1[r17] = r6
            r6 = r1[r20]
            int r7 = r6 - r24
            int r7 = r7 * r19
            int r7 = r7 / r15
            int r6 = r6 - r7
            r1[r20] = r6
            r6 = r1[r23]
            int r7 = r6 - r14
            int r7 = r7 * r19
            int r7 = r7 / r15
            int r6 = r6 - r7
            r1[r23] = r6
            if (r10 == 0) goto L190
            int r1 = r27 - r10
            r6 = -1
            if (r1 >= r6) goto L118
            r1 = r6
        L118:
            int r6 = r27 + r10
            r7 = 256(0x100, float:3.59E-43)
            if (r6 <= r7) goto L120
            r6 = 256(0x100, float:3.59E-43)
        L120:
            int r7 = r27 + 1
            int r27 = r27 + (-1)
            r21 = r20
            r15 = r27
        L128:
            if (r7 < r6) goto L12c
            if (r15 <= r1) goto L190
        L12c:
            int r22 = r21 + 1
            r21 = r13[r21]
            r27 = 262144(0x40000, float:3.67342E-40)
            if (r7 >= r6) goto L15e
            int r29 = r7 + 1
            r7 = r28[r7]
            r30 = r7[r17]     // Catch: java.lang.Exception -> L15c
            int r31 = r30 - r25
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r7[r17] = r30     // Catch: java.lang.Exception -> L15c
            r30 = r7[r20]     // Catch: java.lang.Exception -> L15c
            int r31 = r30 - r24
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r7[r20] = r30     // Catch: java.lang.Exception -> L15c
            r30 = r7[r23]     // Catch: java.lang.Exception -> L15c
            int r31 = r30 - r14
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r7[r23] = r30     // Catch: java.lang.Exception -> L15c
        L15c:
            r7 = r29
        L15e:
            if (r15 <= r1) goto L18d
            int r29 = r15 + (-1)
            r15 = r28[r15]
            r30 = r15[r17]     // Catch: java.lang.Exception -> L188
            int r31 = r30 - r25
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r15[r17] = r30     // Catch: java.lang.Exception -> L188
            r30 = r15[r20]     // Catch: java.lang.Exception -> L188
            int r31 = r30 - r24
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r15[r20] = r30     // Catch: java.lang.Exception -> L188
            r30 = r15[r23]     // Catch: java.lang.Exception -> L188
            int r31 = r30 - r14
            int r31 = r31 * r21
            int r31 = r31 / r27
            int r30 = r30 - r31
            r15[r23] = r30     // Catch: java.lang.Exception -> L188
        L188:
            r21 = r22
            r15 = r29
            goto L128
        L18d:
            r21 = r22
            goto L128
        L190:
            int r1 = r18 + r26
            if (r1 < r2) goto L195
            int r1 = r1 - r2
        L195:
            r18 = r1
            int r11 = r11 + 1
            if (r9 != 0) goto L19d
            r9 = r20
        L19d:
            int r1 = r11 % r9
            if (r1 != 0) goto L1c9
            int r1 = r5.f3529
            int r1 = r19 / r1
            int r19 = r19 - r1
            int r1 = r12 / 30
            int r12 = r12 - r1
            int r1 = r12 >> 6
            r6 = r20
            if (r1 > r6) goto L1b3
            r10 = r17
            goto L1b4
        L1b3:
            r10 = r1
        L1b4:
            int r1 = r10 * r10
            r6 = r17
        L1b8:
            if (r6 >= r10) goto L1c9
            int r7 = r6 * r6
            int r7 = r1 - r7
            r15 = 256(0x100, float:3.59E-43)
            int r7 = r7 * r15
            int r7 = r7 / r1
            int r7 = r7 * r19
            r13[r6] = r7
            int r6 = r6 + 1
            goto L1b8
        L1c9:
            r1 = r35
            r6 = r26
            r14 = 1024(0x400, float:1.435E-42)
            r15 = 256(0x100, float:3.59E-43)
            r20 = 1
            goto L67
        L1d5:
            r28 = r7
            r6 = -1
            r1 = r17
        L1da:
            if (r1 >= r15) goto L1f9
            r2 = r28[r1]
            r7 = r2[r17]
            int r7 = r7 >> 4
            r2[r17] = r7
            r20 = 1
            r7 = r2[r20]
            int r7 = r7 >> 4
            r2[r20] = r7
            r7 = r2[r23]
            int r7 = r7 >> 4
            r2[r23] = r7
            r2[r16] = r1
            int r1 = r1 + 1
            r15 = 256(0x100, float:3.59E-43)
            goto L1da
        L1f9:
            r1 = r17
            r2 = r1
            r7 = r2
        L1fd:
            int[] r8 = r5.f3533
            r15 = 256(0x100, float:3.59E-43)
            if (r1 >= r15) goto L24b
            r9 = r28[r1]
            r20 = 1
            r10 = r9[r20]
            int r11 = r1 + 1
            r13 = r1
            r12 = r11
        L20d:
            if (r12 >= r15) goto L21e
            r15 = r28[r12]
            r15 = r15[r20]
            if (r15 >= r10) goto L217
            r13 = r12
            r10 = r15
        L217:
            int r12 = r12 + 1
            r15 = 256(0x100, float:3.59E-43)
            r20 = 1
            goto L20d
        L21e:
            r12 = r28[r13]
            if (r1 == r13) goto L233
            r13 = r17
            r15 = r22
        L226:
            if (r13 >= r15) goto L235
            r18 = r12[r13]
            r19 = r9[r13]
            r12[r13] = r19
            r9[r13] = r18
            int r13 = r13 + 1
            goto L226
        L233:
            r15 = r22
        L235:
            if (r10 == r2) goto L247
            int r7 = r7 + r1
            r20 = 1
            int r7 = r7 >> 1
            r8[r2] = r7
        L23e:
            int r2 = r2 + 1
            if (r2 >= r10) goto L245
            r8[r2] = r1
            goto L23e
        L245:
            r7 = r1
            r2 = r10
        L247:
            r1 = r11
            r22 = r15
            goto L1fd
        L24b:
            int r7 = r7 + r14
            r20 = 1
            int r1 = r7 >> 1
            r8[r2] = r1
            int r2 = r2 + 1
            r15 = 256(0x100, float:3.59E-43)
        L256:
            if (r2 >= r15) goto L25d
            r8[r2] = r14
            int r2 = r2 + 1
            goto L256
        L25d:
            r1 = 768(0x300, float:1.076E-42)
            byte[] r1 = new byte[r1]
            int[] r2 = new int[r15]
            r5 = r17
        L265:
            if (r5 >= r15) goto L270
            r7 = r28[r5]
            r7 = r7[r16]
            r2[r7] = r5
            int r5 = r5 + 1
            goto L265
        L270:
            r5 = r17
            r7 = r5
        L273:
            if (r5 >= r15) goto L295
            r9 = r2[r5]
            int r10 = r7 + 1
            r9 = r28[r9]
            r11 = r9[r17]
            byte r11 = (byte) r11
            r1[r7] = r11
            int r11 = r7 + 2
            r20 = 1
            r12 = r9[r20]
            byte r12 = (byte) r12
            r1[r10] = r12
            int r7 = r7 + 3
            r9 = r9[r23]
            byte r9 = (byte) r9
            r1[r11] = r9
            int r5 = r5 + 1
            r15 = 256(0x100, float:3.59E-43)
            goto L273
        L295:
            r2 = r17
        L297:
            boolean[] r5 = r0.f6701
            r15 = 256(0x100, float:3.59E-43)
            if (r2 >= r15) goto L2ae
            int r7 = r2 * 3
            r9 = r1[r7]
            int r10 = r7 + 2
            r11 = r1[r10]
            r1[r7] = r11
            r1[r10] = r9
            r5[r2] = r17
            int r2 = r2 + 1
            goto L297
        L2ae:
            r2 = r17
            r7 = r2
        L2b1:
            if (r2 >= r3) goto L342
            int r9 = r7 + 1
            r10 = r35[r7]
            r10 = r10 & r14
            int r11 = r7 + 2
            r9 = r35[r9]
            r9 = r9 & r14
            int r7 = r7 + 3
            r11 = r35[r11]
            r11 = r11 & r14
            r12 = r8[r9]
            int r13 = r12 + (-1)
            r15 = 1000(0x3e8, float:1.401E-42)
            r14 = r6
            r6 = r15
        L2ca:
            r15 = 256(0x100, float:3.59E-43)
            if (r12 < r15) goto L2d0
            if (r13 < 0) goto L2d3
        L2d0:
            r20 = 1
            goto L2e0
        L2d3:
            r20 = 1
            r5[r14] = r20
            byte r6 = (byte) r14
            r4[r2] = r6
            int r2 = r2 + 1
            r6 = -1
            r14 = 255(0xff, float:3.57E-43)
            goto L2b1
        L2e0:
            if (r12 >= r15) goto L30d
            r19 = r28[r12]
            r21 = r19[r20]
            int r15 = r21 - r9
            if (r15 < r6) goto L2ef
            r22 = r2
            r12 = 256(0x100, float:3.59E-43)
            goto L30f
        L2ef:
            int r12 = r12 + 1
            if (r15 >= 0) goto L2f4
            int r15 = -r15
        L2f4:
            r21 = r19[r17]
            r22 = r2
            int r2 = r21 - r10
            if (r2 >= 0) goto L2fd
            int r2 = -r2
        L2fd:
            int r15 = r15 + r2
            if (r15 >= r6) goto L30f
            r2 = r19[r23]
            int r2 = r2 - r11
            if (r2 >= 0) goto L306
            int r2 = -r2
        L306:
            int r15 = r15 + r2
            if (r15 >= r6) goto L30f
            r14 = r19[r16]
            r6 = r15
            goto L30f
        L30d:
            r22 = r2
        L30f:
            if (r13 < 0) goto L33f
            r2 = r28[r13]
            r20 = 1
            r15 = r2[r20]
            int r15 = r9 - r15
            if (r15 < r6) goto L31f
            r2 = r22
            r13 = -1
            goto L2ca
        L31f:
            int r13 = r13 + (-1)
            if (r15 >= 0) goto L324
            int r15 = -r15
        L324:
            r19 = r2[r17]
            r21 = r2
            int r2 = r19 - r10
            if (r2 >= 0) goto L32d
            int r2 = -r2
        L32d:
            int r15 = r15 + r2
            if (r15 >= r6) goto L33c
            r2 = r21[r23]
            int r2 = r2 - r11
            if (r2 >= 0) goto L336
            int r2 = -r2
        L336:
            int r2 = r2 + r15
            if (r2 >= r6) goto L33c
            r14 = r21[r16]
            r6 = r2
        L33c:
            r2 = r22
            goto L2ca
        L33f:
            r20 = 1
            goto L33c
        L342:
            r2 = 8
            r0.f6711 = r2
            ᛸᛲᛴᛱ r0 = new ᛸᛲᛴᛱ
            r0.<init>(r4, r1)
            return r0
    }
}
