package defpackage;

/* JADX INFO: renamed from: ᛱᛷᛴᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0127 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public byte[] f1038;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f1039;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public defpackage.C1708 f1040;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public byte[] f1041;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public android.graphics.Bitmap.Config f1042;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public int f1043;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public java.lang.Boolean f1044;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public byte[] f1045;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.graphics.Bitmap f1046;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.nio.ByteBuffer f1047;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0682 f1048;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int[] f1049;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int[] f1050;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final boolean f1051;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final int f1052;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final int f1053;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int[] f1054;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public short[] f1055;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final int f1056;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public byte[] f1057;

    public C0127(defpackage.C0682 r2, defpackage.C1708 r3, java.nio.ByteBuffer r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r1.f1054 = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.f1042 = r0
            r1.f1048 = r2
            ᲀᛷᛵᲈ r2 = new ᲀᛷᛵᲈ
            r2.<init>()
            r1.f1040 = r2
            java.lang.String r2 = "Sample size must be >=0, not: "
            monitor-enter(r1)
            if (r5 <= 0) goto L96
            int r2 = java.lang.Integer.highestOneBit(r5)     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r1.f1043 = r5     // Catch: java.lang.Throwable -> L54
            r1.f1040 = r3     // Catch: java.lang.Throwable -> L54
            r0 = -1
            r1.f1039 = r0     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r4 = r4.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r1.f1047 = r4     // Catch: java.lang.Throwable -> L54
            r4.position(r5)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r4 = r1.f1047     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r4.order(r0)     // Catch: java.lang.Throwable -> L54
            r1.f1051 = r5     // Catch: java.lang.Throwable -> L54
            java.util.ArrayList r4 = r3.f7605     // Catch: java.lang.Throwable -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L54
        L3f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L54
            ᛳᛱᲇᲈ r5 = (defpackage.C0414) r5     // Catch: java.lang.Throwable -> L54
            int r5 = r5.f2089     // Catch: java.lang.Throwable -> L54
            r0 = 3
            if (r5 != r0) goto L3f
            r4 = 1
            r1.f1051 = r4     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r2 = move-exception
            goto La8
        L56:
            r1.f1056 = r2     // Catch: java.lang.Throwable -> L54
            int r4 = r3.f7611     // Catch: java.lang.Throwable -> L54
            int r5 = r4 / r2
            r1.f1053 = r5     // Catch: java.lang.Throwable -> L54
            int r3 = r3.f7612     // Catch: java.lang.Throwable -> L54
            int r2 = r3 / r2
            r1.f1052 = r2     // Catch: java.lang.Throwable -> L54
            ᛴᛵᲇᲇ r2 = r1.f1048     // Catch: java.lang.Throwable -> L54
            int r4 = r4 * r3
            java.lang.Object r2 = r2.f3285     // Catch: java.lang.Throwable -> L54
            ᲇᛶᛳᛱ r2 = (defpackage.C2063) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L70
            byte[] r2 = new byte[r4]     // Catch: java.lang.Throwable -> L54
            goto L78
        L70:
            java.lang.Class<byte[]> r3 = byte[].class
            java.lang.Object r2 = r2.m3464(r3, r4)     // Catch: java.lang.Throwable -> L54
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L54
        L78:
            r1.f1041 = r2     // Catch: java.lang.Throwable -> L54
            ᛴᛵᲇᲇ r2 = r1.f1048     // Catch: java.lang.Throwable -> L54
            int r3 = r1.f1053     // Catch: java.lang.Throwable -> L54
            int r4 = r1.f1052     // Catch: java.lang.Throwable -> L54
            int r3 = r3 * r4
            java.lang.Object r2 = r2.f3285     // Catch: java.lang.Throwable -> L54
            ᲇᛶᛳᛱ r2 = (defpackage.C2063) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L8a
            int[] r2 = new int[r3]     // Catch: java.lang.Throwable -> L54
            goto L92
        L8a:
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Object r2 = r2.m3464(r4, r3)     // Catch: java.lang.Throwable -> L54
            int[] r2 = (int[]) r2     // Catch: java.lang.Throwable -> L54
        L92:
            r1.f1050 = r2     // Catch: java.lang.Throwable -> L54
            monitor-exit(r1)
            return
        L96:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L54
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L54
            r4.append(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L54
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54
            throw r3     // Catch: java.lang.Throwable -> L54
        La8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.graphics.Bitmap m638(defpackage.C0414 r37, defpackage.C0414 r38) {
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            ᛴᛵᲇᲇ r3 = r0.f1048
            r4 = 0
            int[] r6 = r0.f1050
            if (r2 != 0) goto L1e
            android.graphics.Bitmap r5 = r0.f1046
            if (r5 == 0) goto L18
            java.lang.Object r7 = r3.f3286
            ᛸᲈᲇᲁ r7 = (defpackage.InterfaceC1612) r7
            r7.mo1257(r5)
        L18:
            r5 = 0
            r0.f1046 = r5
            java.util.Arrays.fill(r6, r4)
        L1e:
            r13 = 3
            if (r2 == 0) goto L2c
            int r5 = r2.f2089
            if (r5 != r13) goto L2c
            android.graphics.Bitmap r5 = r0.f1046
            if (r5 != 0) goto L2c
            java.util.Arrays.fill(r6, r4)
        L2c:
            int r14 = r0.f1053
            int r15 = r0.f1056
            r5 = 2
            if (r2 == 0) goto L6a
            int r7 = r2.f2089
            if (r7 <= 0) goto L6a
            if (r7 != r5) goto L6c
            boolean r7 = r1.f2088
            if (r7 != 0) goto L4b
            ᲀᛷᛵᲈ r7 = r0.f1040
            int r8 = r7.f7603
            int[] r9 = r1.f2080
            if (r9 == 0) goto L4c
            int r7 = r7.f7609
            int r9 = r1.f2079
            if (r7 != r9) goto L4c
        L4b:
            r8 = r4
        L4c:
            int r7 = r2.f2083
            int r7 = r7 / r15
            int r9 = r2.f2087
            int r9 = r9 / r15
            int r10 = r2.f2084
            int r10 = r10 / r15
            int r2 = r2.f2085
            int r2 = r2 / r15
            int r9 = r9 * r14
            int r9 = r9 + r2
            int r7 = r7 * r14
            int r7 = r7 + r9
        L5c:
            if (r9 >= r7) goto L6a
            int r2 = r9 + r10
            r11 = r9
        L61:
            if (r11 >= r2) goto L68
            r6[r11] = r8
            int r11 = r11 + 1
            goto L61
        L68:
            int r9 = r9 + r14
            goto L5c
        L6a:
            r2 = r5
            goto L7e
        L6c:
            if (r7 != r13) goto L6a
            r2 = r5
            android.graphics.Bitmap r5 = r0.f1046
            if (r5 == 0) goto L7e
            r10 = 0
            int r12 = r0.f1052
            r7 = 0
            int r8 = r0.f1053
            r9 = 0
            r11 = r8
            r5.getPixels(r6, r7, r8, r9, r10, r11, r12)
        L7e:
            java.nio.ByteBuffer r5 = r0.f1047
            int r7 = r1.f2086
            r5.position(r7)
            int r5 = r1.f2084
            int r7 = r1.f2083
            int r5 = r5 * r7
            byte[] r7 = r0.f1041
            if (r7 == 0) goto L91
            int r8 = r7.length
            if (r8 >= r5) goto La6
        L91:
            java.lang.Object r3 = r3.f3285
            ᲇᛶᛳᛱ r3 = (defpackage.C2063) r3
            if (r3 != 0) goto L9b
            byte[] r3 = new byte[r5]
        L99:
            r7 = r3
            goto La4
        L9b:
            java.lang.Class<byte[]> r7 = byte[].class
            java.lang.Object r3 = r3.m3464(r7, r5)
            byte[] r3 = (byte[]) r3
            goto L99
        La4:
            r0.f1041 = r7
        La6:
            short[] r3 = r0.f1055
            r8 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto Lb0
            short[] r3 = new short[r8]
            r0.f1055 = r3
        Lb0:
            byte[] r9 = r0.f1057
            if (r9 != 0) goto Lb8
            byte[] r9 = new byte[r8]
            r0.f1057 = r9
        Lb8:
            byte[] r10 = r0.f1038
            if (r10 != 0) goto Lc2
            r10 = 4097(0x1001, float:5.741E-42)
            byte[] r10 = new byte[r10]
            r0.f1038 = r10
        Lc2:
            java.nio.ByteBuffer r11 = r0.f1047
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 1
            int r2 = r12 << r11
            r16 = r12
            int r12 = r2 + 1
            int r17 = r2 + 2
            int r11 = r11 + 1
            int r18 = r16 << r11
            int r18 = r18 + (-1)
            r8 = r4
        Lda:
            if (r8 >= r2) goto Le5
            r3[r8] = r4
            byte r13 = (byte) r8
            r9[r8] = r13
            int r8 = r8 + 1
            r13 = 3
            goto Lda
        Le5:
            byte[] r8 = r0.f1045
            r13 = r4
            r22 = r13
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r30 = r26
            r31 = r30
            r29 = r11
            r27 = r17
            r28 = r18
            r20 = -1
            r21 = -1
        L100:
            r32 = 8
            if (r13 >= r5) goto L200
            if (r22 != 0) goto L13e
            java.nio.ByteBuffer r4 = r0.f1047
            byte r4 = r4.get()
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 > 0) goto L119
            r33 = r3
            r22 = r4
            r34 = r6
            r35 = r8
            goto L131
        L119:
            r33 = r3
            java.nio.ByteBuffer r3 = r0.f1047
            r34 = r6
            byte[] r6 = r0.f1045
            r35 = r8
            int r8 = r3.remaining()
            int r8 = java.lang.Math.min(r4, r8)
            r22 = r4
            r4 = 0
            r3.get(r6, r4, r8)
        L131:
            if (r22 > 0) goto L13b
            r3 = 3
            r0.f1043 = r3
            r4 = 0
        L137:
            r2 = r26
            goto L204
        L13b:
            r23 = 0
            goto L144
        L13e:
            r33 = r3
            r34 = r6
            r35 = r8
        L144:
            r3 = r35[r23]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r24
            int r25 = r25 + r3
            int r24 = r24 + 8
            int r23 = r23 + 1
            int r22 = r22 + (-1)
            r3 = r21
            r4 = r24
            r6 = r27
            r8 = r29
            r21 = r9
            r9 = r30
        L15e:
            r24 = r4
            if (r4 < r8) goto L1e9
            r4 = r25 & r28
            int r25 = r25 >> r8
            int r24 = r24 - r8
            if (r4 != r2) goto L174
            r8 = r11
            r6 = r17
            r28 = r18
            r3 = r20
            r4 = r24
            goto L15e
        L174:
            if (r4 != r12) goto L189
            r27 = r6
            r29 = r8
            r30 = r9
            r9 = r21
            r6 = r34
            r8 = r35
            r4 = 0
            r21 = r3
            r3 = r33
            goto L100
        L189:
            r27 = r8
            r8 = r20
            if (r3 != r8) goto L1a0
            r3 = r21[r4]
            r7[r26] = r3
            int r26 = r26 + 1
            int r13 = r13 + 1
            r3 = r4
            r9 = r3
            r4 = r24
            r8 = r27
        L19d:
            r20 = -1
            goto L15e
        L1a0:
            if (r4 < r6) goto L1a9
            byte r8 = (byte) r9
            r10[r31] = r8
            int r31 = r31 + 1
            r8 = r3
            goto L1aa
        L1a9:
            r8 = r4
        L1aa:
            if (r8 < r2) goto L1b5
            r9 = r21[r8]
            r10[r31] = r9
            int r31 = r31 + 1
            short r8 = r33[r8]
            goto L1aa
        L1b5:
            r8 = r21[r8]
            r9 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r9
            r7[r26] = r8
        L1bc:
            int r26 = r26 + 1
            int r13 = r13 + 1
            if (r31 <= 0) goto L1c9
            int r31 = r31 + (-1)
            r29 = r10[r31]
            r7[r26] = r29
            goto L1bc
        L1c9:
            r29 = r2
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 >= r2) goto L1e1
            short r3 = (short) r3
            r33[r6] = r3
            r21[r6] = r8
            int r6 = r6 + 1
            r3 = r6 & r28
            if (r3 != 0) goto L1e1
            if (r6 >= r2) goto L1e1
            int r8 = r27 + 1
            int r28 = r28 + r6
            goto L1e3
        L1e1:
            r8 = r27
        L1e3:
            r3 = r4
            r4 = r24
            r2 = r29
            goto L19d
        L1e9:
            r27 = r8
            r30 = r9
            r9 = r21
            r29 = r27
            r8 = r35
            r4 = 0
            r20 = -1
            r21 = r3
            r27 = r6
            r3 = r33
            r6 = r34
            goto L100
        L200:
            r34 = r6
            goto L137
        L204:
            java.util.Arrays.fill(r7, r2, r5, r4)
            boolean r2 = r1.f2082
            int[] r3 = r0.f1050
            if (r2 != 0) goto L211
            r2 = r16
            if (r15 == r2) goto L215
        L211:
            r18 = r3
            goto L27d
        L215:
            int r2 = r1.f2083
            int r5 = r1.f2087
            int r6 = r1.f2084
            int r7 = r1.f2085
            int r8 = r0.f1039
            if (r8 != 0) goto L223
            r8 = 1
            goto L224
        L223:
            r8 = r4
        L224:
            byte[] r9 = r0.f1041
            int[] r10 = r0.f1049
            r11 = r4
            r12 = -1
        L22a:
            if (r11 >= r2) goto L25f
            int r13 = r11 + r5
            int r13 = r13 * r14
            int r15 = r13 + r7
            int r4 = r15 + r6
            int r13 = r13 + r14
            if (r13 >= r4) goto L237
            r4 = r13
        L237:
            int r13 = r1.f2084
            int r13 = r13 * r11
        L23a:
            if (r15 >= r4) goto L257
            r17 = r2
            r2 = r9[r13]
            r18 = r3
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 == r12) goto L24e
            r3 = r10[r3]
            if (r3 == 0) goto L24d
            r18[r15] = r3
            goto L24e
        L24d:
            r12 = r2
        L24e:
            int r13 = r13 + 1
            int r15 = r15 + 1
            r2 = r17
            r3 = r18
            goto L23a
        L257:
            r17 = r2
            r18 = r3
            int r11 = r11 + 1
            r4 = 0
            goto L22a
        L25f:
            java.lang.Boolean r2 = r0.f1044
            if (r2 == 0) goto L269
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L272
        L269:
            java.lang.Boolean r2 = r0.f1044
            if (r2 != 0) goto L274
            if (r8 == 0) goto L274
            r8 = -1
            if (r12 == r8) goto L274
        L272:
            r4 = 1
            goto L275
        L274:
            r4 = 0
        L275:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.f1044 = r2
            goto L3ea
        L27d:
            int r2 = r1.f2083
            int r2 = r2 / r15
            int r3 = r1.f2087
            int r3 = r3 / r15
            int r4 = r1.f2084
            int r4 = r4 / r15
            int r5 = r1.f2085
            int r5 = r5 / r15
            int r6 = r0.f1039
            if (r6 != 0) goto L28f
            r6 = 1
            goto L290
        L28f:
            r6 = 0
        L290:
            byte[] r7 = r0.f1041
            int[] r8 = r0.f1049
            java.lang.Boolean r9 = r0.f1044
            r12 = r9
            r11 = r32
            r9 = 0
            r10 = 0
            r13 = 1
        L29c:
            if (r9 >= r2) goto L3d8
            r17 = r3
            boolean r3 = r1.f2082
            if (r3 == 0) goto L2be
            if (r10 < r2) goto L2bb
            int r13 = r13 + 1
            r3 = 2
            if (r13 == r3) goto L2b9
            r3 = 3
            if (r13 == r3) goto L2b5
            r3 = 4
            if (r13 == r3) goto L2b2
            goto L2bb
        L2b2:
            r10 = 1
            r11 = 2
            goto L2bb
        L2b5:
            r3 = 4
            r11 = r3
            r10 = 2
            goto L2bb
        L2b9:
            r3 = 4
            r10 = r3
        L2bb:
            int r3 = r10 + r11
            goto L2c0
        L2be:
            r3 = r10
            r10 = r9
        L2c0:
            int r10 = r10 + r17
            r19 = r2
            r2 = 1
            if (r15 != r2) goto L2ca
            r20 = 1
            goto L2cc
        L2ca:
            r20 = 0
        L2cc:
            int r2 = r0.f1052
            if (r10 >= r2) goto L3c6
            int r10 = r10 * r14
            int r2 = r10 + r5
            r21 = r2
            int r2 = r21 + r4
            int r10 = r10 + r14
            if (r10 >= r2) goto L2db
            r2 = r10
        L2db:
            int r10 = r9 * r15
            r22 = r3
            int r3 = r1.f2084
            int r10 = r10 * r3
            if (r20 == 0) goto L306
            r3 = r21
        L2e6:
            if (r3 >= r2) goto L300
            r20 = r3
            r3 = r7[r10]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r8[r3]
            if (r3 == 0) goto L2f5
            r18[r20] = r3
            goto L2fc
        L2f5:
            if (r6 == 0) goto L2fc
            if (r12 != 0) goto L2fc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r12 = r3
        L2fc:
            int r10 = r10 + r15
            int r3 = r20 + 1
            goto L2e6
        L300:
            r29 = r4
            r30 = r5
            goto L3ca
        L306:
            int r3 = r2 - r21
            int r3 = r3 * r15
            int r3 = r3 + r10
            r20 = r12
            r12 = r10
            r10 = r21
        L30f:
            if (r10 >= r2) goto L3bf
            r21 = r2
            int r2 = r1.f2084
            r28 = r2
            r29 = r4
            r2 = r12
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L324:
            int r4 = r12 + r15
            if (r2 >= r4) goto L358
            byte[] r4 = r0.f1041
            r30 = r5
            int r5 = r4.length
            if (r2 >= r5) goto L35a
            if (r2 >= r3) goto L35a
            r4 = r4[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int[] r5 = r0.f1049
            r4 = r5[r4]
            if (r4 == 0) goto L353
            int r5 = r4 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r5
            int r5 = r4 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r5
            int r5 = r4 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r5
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r4
            int r27 = r27 + 1
        L353:
            int r2 = r2 + 1
            r5 = r30
            goto L324
        L358:
            r30 = r5
        L35a:
            int r2 = r12 + r28
            r4 = r2
        L35d:
            int r5 = r2 + r15
            if (r4 >= r5) goto L391
            byte[] r5 = r0.f1041
            r28 = r2
            int r2 = r5.length
            if (r4 >= r2) goto L391
            if (r4 >= r3) goto L391
            r2 = r5[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int[] r5 = r0.f1049
            r2 = r5[r2]
            if (r2 == 0) goto L38c
            int r5 = r2 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r5
            int r5 = r2 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r5
            int r5 = r2 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r5
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r2
            int r27 = r27 + 1
        L38c:
            int r4 = r4 + 1
            r2 = r28
            goto L35d
        L391:
            if (r27 != 0) goto L395
            r4 = 0
            goto L3a7
        L395:
            int r23 = r23 / r27
            int r2 = r23 << 24
            int r24 = r24 / r27
            int r4 = r24 << 16
            r2 = r2 | r4
            int r25 = r25 / r27
            int r4 = r25 << 8
            r2 = r2 | r4
            int r26 = r26 / r27
            r4 = r2 | r26
        L3a7:
            if (r4 == 0) goto L3ac
            r18[r10] = r4
            goto L3b4
        L3ac:
            if (r6 == 0) goto L3b4
            if (r20 != 0) goto L3b4
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r20 = r2
        L3b4:
            int r12 = r12 + r15
            int r10 = r10 + 1
            r2 = r21
            r4 = r29
            r5 = r30
            goto L30f
        L3bf:
            r29 = r4
            r30 = r5
            r12 = r20
            goto L3ca
        L3c6:
            r22 = r3
            goto L300
        L3ca:
            int r9 = r9 + 1
            r3 = r17
            r2 = r19
            r10 = r22
            r4 = r29
            r5 = r30
            goto L29c
        L3d8:
            java.lang.Boolean r2 = r0.f1044
            if (r2 != 0) goto L3ea
            if (r12 != 0) goto L3e0
            r4 = 0
            goto L3e4
        L3e0:
            boolean r4 = r12.booleanValue()
        L3e4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.f1044 = r2
        L3ea:
            boolean r2 = r0.f1051
            if (r2 == 0) goto L3f6
            int r1 = r1.f2089
            if (r1 == 0) goto L3f9
            r2 = 1
            if (r1 != r2) goto L3f6
            goto L3f9
        L3f6:
            r6 = r34
            goto L411
        L3f9:
            android.graphics.Bitmap r1 = r0.f1046
            if (r1 != 0) goto L403
            android.graphics.Bitmap r1 = r0.m640()
            r0.f1046 = r1
        L403:
            r5 = r1
            r10 = 0
            int r12 = r0.f1052
            r7 = 0
            int r8 = r0.f1053
            r9 = 0
            r11 = r8
            r6 = r34
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
        L411:
            android.graphics.Bitmap r5 = r0.m640()
            r10 = 0
            int r12 = r0.f1052
            r7 = 0
            int r8 = r0.f1053
            r9 = 0
            r11 = r8
            r5.setPixels(r6, r7, r8, r9, r10, r11, r12)
            return r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m639(android.graphics.Bitmap.Config r5) {
            r4 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r5 == r0) goto L2d
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r5 != r1) goto L9
            goto L2d
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unsupported format: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = ", must be one of "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = " or "
            r2.append(r5)
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            throw r4
        L2d:
            r4.f1042 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.graphics.Bitmap m640() {
            r3 = this;
            java.lang.Boolean r0 = r3.f1044
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            android.graphics.Bitmap$Config r0 = r3.f1042
            goto L10
        Le:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L10:
            ᛴᛵᲇᲇ r1 = r3.f1048
            java.lang.Object r1 = r1.f3286
            ᛸᲈᲇᲁ r1 = (defpackage.InterfaceC1612) r1
            int r2 = r3.f1053
            int r3 = r3.f1052
            android.graphics.Bitmap r3 = r1.mo1261(r2, r3, r0)
            r0 = 1
            r3.setHasAlpha(r0)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final synchronized android.graphics.Bitmap m641() {
            r9 = this;
            java.lang.String r0 = "Unable to decode frame, status="
            java.lang.String r1 = "No valid color table found for frame #"
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            ᲀᛷᛵᲈ r3 = r9.f1040     // Catch: java.lang.Throwable -> L14
            int r3 = r3.f7607     // Catch: java.lang.Throwable -> L14
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L17
            int r3 = r9.f1039     // Catch: java.lang.Throwable -> L14
            if (r3 >= 0) goto L40
            goto L17
        L14:
            r0 = move-exception
            goto Lf2
        L17:
            java.lang.String r3 = "ᛱᛷᛴᛷ"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L3e
            java.lang.String r3 = "ᛱᛷᛴᛷ"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L14
            ᲀᛷᛵᲈ r2 = r9.f1040     // Catch: java.lang.Throwable -> L14
            int r2 = r2.f7607     // Catch: java.lang.Throwable -> L14
            r6.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch: java.lang.Throwable -> L14
            int r2 = r9.f1039     // Catch: java.lang.Throwable -> L14
            r6.append(r2)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.d(r3, r2)     // Catch: java.lang.Throwable -> L14
        L3e:
            r9.f1043 = r5     // Catch: java.lang.Throwable -> L14
        L40:
            int r2 = r9.f1043     // Catch: java.lang.Throwable -> L14
            r3 = 0
            if (r2 == r5) goto Ld5
            r6 = 2
            if (r2 != r6) goto L4a
            goto Ld5
        L4a:
            r0 = 0
            r9.f1043 = r0     // Catch: java.lang.Throwable -> L14
            byte[] r2 = r9.f1045     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L68
            ᛴᛵᲇᲇ r2 = r9.f1048     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.f3285     // Catch: java.lang.Throwable -> L14
            ᲇᛶᛳᛱ r2 = (defpackage.C2063) r2     // Catch: java.lang.Throwable -> L14
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L5e
            byte[] r2 = new byte[r7]     // Catch: java.lang.Throwable -> L14
            goto L66
        L5e:
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Object r2 = r2.m3464(r8, r7)     // Catch: java.lang.Throwable -> L14
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L14
        L66:
            r9.f1045 = r2     // Catch: java.lang.Throwable -> L14
        L68:
            ᲀᛷᛵᲈ r2 = r9.f1040     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r2 = r2.f7605     // Catch: java.lang.Throwable -> L14
            int r7 = r9.f1039     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L14
            ᛳᛱᲇᲈ r2 = (defpackage.C0414) r2     // Catch: java.lang.Throwable -> L14
            int r7 = r9.f1039     // Catch: java.lang.Throwable -> L14
            int r7 = r7 - r5
            if (r7 < 0) goto L84
            ᲀᛷᛵᲈ r8 = r9.f1040     // Catch: java.lang.Throwable -> L14
            java.util.ArrayList r8 = r8.f7605     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = r8.get(r7)     // Catch: java.lang.Throwable -> L14
            ᛳᛱᲇᲈ r7 = (defpackage.C0414) r7     // Catch: java.lang.Throwable -> L14
            goto L85
        L84:
            r7 = r3
        L85:
            int[] r8 = r2.f2080     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L8a
            goto L8e
        L8a:
            ᲀᛷᛵᲈ r8 = r9.f1040     // Catch: java.lang.Throwable -> L14
            int[] r8 = r8.f7608     // Catch: java.lang.Throwable -> L14
        L8e:
            r9.f1049 = r8     // Catch: java.lang.Throwable -> L14
            if (r8 != 0) goto Lb1
            java.lang.String r0 = "ᛱᛷᛴᛷ"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto Lad
            java.lang.String r0 = "ᛱᛷᛴᛷ"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L14
            int r1 = r9.f1039     // Catch: java.lang.Throwable -> L14
            r2.append(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L14
        Lad:
            r9.f1043 = r5     // Catch: java.lang.Throwable -> L14
            monitor-exit(r9)
            return r3
        Lb1:
            boolean r1 = r2.f2088     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lcf
            int[] r1 = r9.f1054     // Catch: java.lang.Throwable -> L14
            int r3 = r8.length     // Catch: java.lang.Throwable -> L14
            java.lang.System.arraycopy(r8, r0, r1, r0, r3)     // Catch: java.lang.Throwable -> L14
            int[] r1 = r9.f1054     // Catch: java.lang.Throwable -> L14
            r9.f1049 = r1     // Catch: java.lang.Throwable -> L14
            int r3 = r2.f2079     // Catch: java.lang.Throwable -> L14
            r1[r3] = r0     // Catch: java.lang.Throwable -> L14
            int r0 = r2.f2089     // Catch: java.lang.Throwable -> L14
            if (r0 != r6) goto Lcf
            int r0 = r9.f1039     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto Lcf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L14
            r9.f1044 = r0     // Catch: java.lang.Throwable -> L14
        Lcf:
            android.graphics.Bitmap r0 = r9.m638(r2, r7)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r9)
            return r0
        Ld5:
            java.lang.String r1 = "ᛱᛷᛴᛷ"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto Lf0
            java.lang.String r1 = "ᛱᛷᛴᛷ"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L14
            int r0 = r9.f1043     // Catch: java.lang.Throwable -> L14
            r2.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L14
            android.util.Log.d(r1, r0)     // Catch: java.lang.Throwable -> L14
        Lf0:
            monitor-exit(r9)
            return r3
        Lf2:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L14
            throw r0
    }
}
