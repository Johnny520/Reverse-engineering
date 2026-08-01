package defpackage;

/* JADX INFO: renamed from: ᛱᛱᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f467;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f468;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f469;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f470;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f471;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f472;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public byte[] f473;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f474;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f475;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.io.BufferedOutputStream f476;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f477;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.C0753 f478;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f479;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f480;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f481;

    public C0025(java.io.BufferedOutputStream r3) {
            r2 = this;
            r0 = -1147147394653742(0xfffbecacef0961d2, double:NaN)
            r2.<init>()
            r2.f476 = r3
            r3 = -1
            r2.f474 = r3
            r0 = 1
            r2.f481 = r0
            r0 = 10
            r2.f470 = r0
            r2.f477 = r3
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static void m325(defpackage.C0025 r19, java.util.ArrayList r20) {
            r0 = r19
            r1 = -1147164574522926(0xfffbeca8ef0961d2, double:NaN)
            boolean r1 = r20.isEmpty()
            if (r1 == 0) goto L11
            return
        L11:
            int r1 = r20.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r20.size()
            r3 = 1
            if (r1 < r2) goto L25
            r2 = r3
            goto L2a
        L25:
            int r2 = r20.size()
            int r2 = r2 / r1
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r20.size()
            int r4 = r4 + (-1)
            r5 = 46
            if (r2 <= 0) goto L143
            r6 = 0
            int r4 = defpackage.AbstractC0425.m1187(r6, r4, r2)
            r7 = 255(0xff, float:3.57E-43)
            if (r4 < 0) goto Lae
            r8 = r20
            r9 = r6
        L45:
            java.lang.Object r10 = r8.get(r9)
            r11 = r10
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            int r14 = r11.getWidth()
            int r18 = r11.getHeight()
            int r10 = r14 * r18
            int[] r12 = new int[r10]
            r15 = 0
            r16 = 0
            r13 = 0
            r17 = r14
            r11.getPixels(r12, r13, r14, r15, r16, r17, r18)
            int r11 = r10 / 10000
            int r11 = java.lang.Math.max(r3, r11)
            int r10 = r10 + (-1)
            if (r11 <= 0) goto L90
            int r10 = defpackage.AbstractC0425.m1187(r6, r10, r11)
            if (r10 < 0) goto L8b
            r13 = r6
        L72:
            r14 = r12[r13]
            int r15 = r14 >> 24
            r15 = r15 & r7
            boolean r6 = r0.f468
            if (r6 == 0) goto L7f
            r6 = 128(0x80, float:1.8E-43)
            if (r15 < r6) goto L86
        L7f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r1.add(r6)
        L86:
            if (r13 == r10) goto L8b
            int r13 = r13 + r11
            r6 = 0
            goto L72
        L8b:
            if (r9 == r4) goto Lae
            int r9 = r9 + r2
            r6 = 0
            goto L45
        L90:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = -1147319193345582(0xfffbec84ef0961d2, double:NaN)
            java.lang.String r1 = "Step must be positive, was: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r11)
            r2.append(r5)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lae:
            boolean r2 = r1.isEmpty()
            r4 = 768(0x300, float:1.076E-42)
            if (r2 == 0) goto Lc0
            byte[] r1 = new byte[r4]
            r0.f473 = r1
            r1 = 0
            r0.f478 = r1
            r0.f471 = r3
            return
        Lc0:
            int r2 = r1.size()
            r5 = 3
            int r2 = r2 * r5
            byte[] r2 = new byte[r2]
            int r6 = r1.size()
            r8 = 0
        Lcd:
            if (r8 >= r6) goto Lf3
            java.lang.Object r9 = r1.get(r8)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r10 = r8 * 3
            r11 = r9 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r2[r10] = r11
            int r11 = r10 + 1
            int r12 = r9 >> 8
            r12 = r12 & r7
            byte r12 = (byte) r12
            r2[r11] = r12
            int r10 = r10 + 2
            int r9 = r9 >> 16
            r9 = r9 & r7
            byte r9 = (byte) r9
            r2[r10] = r9
            int r8 = r8 + 1
            goto Lcd
        Lf3:
            ᛴᲀᲀᲁ r6 = new ᛴᲀᲀᲁ
            int r1 = r1.size()
            int r1 = r1 * r5
            int r8 = r0.f470
            r9 = 0
            r6.<init>(r1, r8, r9, r2)
            byte[] r1 = r6.m1668()
            ᛱᛵᲇᲇ r2 = defpackage.AbstractC1754.m3143(r9, r4)
            ᲈᛳᛷᛴ r2 = defpackage.AbstractC1754.m3157(r2, r5)
            int r4 = r2.f9424
            int r5 = r2.f9423
            int r2 = r2.f9422
            if (r2 <= 0) goto L116
            if (r4 <= r5) goto L11a
        L116:
            if (r2 >= 0) goto L128
            if (r5 > r4) goto L128
        L11a:
            r8 = r1[r4]
            int r9 = r4 + 2
            r10 = r1[r9]
            r1[r4] = r10
            r1[r9] = r8
            if (r4 == r5) goto L128
            int r4 = r4 + r2
            goto L11a
        L128:
            boolean r2 = r0.f468
            if (r2 == 0) goto L13c
            r0.f469 = r7
            r2 = 765(0x2fd, float:1.072E-42)
            r16 = 0
            r1[r2] = r16
            r2 = 766(0x2fe, float:1.073E-42)
            r1[r2] = r16
            r2 = 767(0x2ff, float:1.075E-42)
            r1[r2] = r16
        L13c:
            r0.f473 = r1
            r0.f478 = r6
            r0.f471 = r3
            return
        L143:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = -1147194639293998(0xfffbeca1ef0961d2, double:NaN)
            java.lang.String r1 = "Step must be positive, was: "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final void m326() {
            r5 = this;
            r0 = 33
            java.io.BufferedOutputStream r1 = r5.f476
            r1.write(r0)
            r0 = 249(0xf9, float:3.49E-43)
            r1.write(r0)
            r0 = 4
            r1.write(r0)
            int r0 = r5.f477
            r2 = 0
            r3 = 2
            if (r0 < 0) goto L17
            goto L1e
        L17:
            boolean r0 = r5.f468
            if (r0 == 0) goto L1d
            r0 = r3
            goto L1e
        L1d:
            r0 = r2
        L1e:
            boolean r4 = r5.f468
            int r0 = r0 << r3
            r0 = r0 | r4
            r1.write(r0)
            int r0 = r5.f472
            int r0 = r0 / 10
            if (r0 >= r3) goto L2c
            goto L2d
        L2c:
            r3 = r0
        L2d:
            r5.m331(r3)
            boolean r0 = r5.f468
            if (r0 == 0) goto L37
            int r5 = r5.f469
            goto L38
        L37:
            r5 = r2
        L38:
            r1.write(r5)
            r1.write(r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m327() {
            r4 = this;
            java.io.BufferedOutputStream r0 = r4.f476     // Catch: java.lang.Exception -> L20
            r1 = -1147443747397166(0xfffbec67ef0961d2, double:NaN)
            java.lang.String r1 = "GIF89a"     // Catch: java.lang.Exception -> L20
            java.nio.charset.Charset r2 = defpackage.AbstractC1422.f6221     // Catch: java.lang.Exception -> L20
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L20
            r2 = -1147473812168238(0xfffbec60ef0961d2, double:NaN)
            r0.write(r1)     // Catch: java.lang.Exception -> L20
            r0 = 1
            r4.f480 = r0     // Catch: java.lang.Exception -> L20
            return
        L20:
            r0 = 0
            r4.f480 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final byte[] m328(int[] r12) {
            r11 = this;
            int r0 = r12.length
            byte[] r1 = new byte[r0]
            ᛴᲀᲀᲁ r2 = r11.f478
            r3 = 0
            if (r2 != 0) goto L16
            boolean r12 = r11.f468
            if (r12 == 0) goto Lc2
        Lc:
            if (r3 >= r0) goto Lc2
            int r12 = r11.f469
            byte r12 = (byte) r12
            r1[r3] = r12
            int r3 = r3 + 1
            goto Lc
        L16:
            boolean r4 = r11.f471
            if (r4 != 0) goto L8e
            byte[] r1 = new byte[r0]
            int r2 = r0 * 3
            byte[] r4 = new byte[r2]
            r5 = r3
        L21:
            if (r5 >= r0) goto L41
            r6 = r12[r5]
            int r7 = r5 * 3
            r8 = r6 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r4[r7] = r8
            int r8 = r7 + 1
            int r9 = r6 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r4[r8] = r9
            int r7 = r7 + 2
            int r6 = r6 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r4[r7] = r6
            int r5 = r5 + 1
            goto L21
        L41:
            ᛴᲀᲀᲁ r5 = new ᛴᲀᲀᲁ
            int r6 = r11.f470
            r5.<init>(r2, r6, r3, r4)
            byte[] r2 = r5.m1668()
            r4 = 768(0x300, float:1.076E-42)
            ᛱᛵᲇᲇ r4 = defpackage.AbstractC1754.m3143(r3, r4)
            r6 = 3
            ᲈᛳᛷᛴ r4 = defpackage.AbstractC1754.m3157(r4, r6)
            int r6 = r4.f9424
            int r7 = r4.f9423
            int r4 = r4.f9422
            if (r4 <= 0) goto L61
            if (r6 <= r7) goto L65
        L61:
            if (r4 >= 0) goto L73
            if (r7 > r6) goto L73
        L65:
            r8 = r2[r6]
            int r9 = r6 + 2
            r10 = r2[r9]
            r2[r6] = r10
            r2[r9] = r8
            if (r6 == r7) goto L73
            int r6 = r6 + r4
            goto L65
        L73:
            r11.f473 = r2
        L75:
            if (r3 >= r0) goto L8d
            r11 = r12[r3]
            r2 = r11 & 255(0xff, float:3.57E-43)
            int r4 = r11 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r5.m1667(r2, r4, r11)
            byte r11 = (byte) r11
            r1[r3] = r11
            int r3 = r3 + 1
            goto L75
        L8d:
            return r1
        L8e:
            if (r3 >= r0) goto Lc2
            r4 = r12[r3]
            int r5 = r4 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            boolean r6 = r11.f468
            if (r6 == 0) goto La4
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto La4
            int r4 = r11.f469
            byte r4 = (byte) r4
            r1[r3] = r4
            goto Lbf
        La4:
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r2.m1667(r5, r6, r4)
            boolean r5 = r11.f468
            if (r5 == 0) goto Lbc
            int r5 = r11.f469
            if (r4 != r5) goto Lbc
            int r4 = r5 + (-1)
        Lbc:
            byte r4 = (byte) r4
            r1[r3] = r4
        Lbf:
            int r3 = r3 + 1
            goto L8e
        Lc2:
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m329(android.graphics.Bitmap r11) {
            r10 = this;
            r0 = -1147533941710382(0xfffbec52ef0961d2, double:NaN)
            boolean r0 = r10.f480
            if (r0 != 0) goto Le
            goto Lc6
        Le:
            boolean r0 = r10.f467     // Catch: java.lang.Exception -> Lc6
            r1 = 1
            if (r0 != 0) goto L21
            int r0 = r11.getWidth()     // Catch: java.lang.Exception -> Lc6
            r10.f479 = r0     // Catch: java.lang.Exception -> Lc6
            int r0 = r11.getHeight()     // Catch: java.lang.Exception -> Lc6
            r10.f475 = r0     // Catch: java.lang.Exception -> Lc6
            r10.f467 = r1     // Catch: java.lang.Exception -> Lc6
        L21:
            int r5 = r11.getWidth()     // Catch: java.lang.Exception -> Lc6
            int r9 = r11.getHeight()     // Catch: java.lang.Exception -> Lc6
            int r0 = r5 * r9
            int[] r3 = new int[r0]     // Catch: java.lang.Exception -> Lc6
            r6 = 0
            r7 = 0
            r4 = 0
            r8 = r5
            r2 = r11
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lc6
            byte[] r11 = r10.m328(r3)     // Catch: java.lang.Exception -> Lc6
            boolean r0 = r10.f481     // Catch: java.lang.Exception -> Lc6
            java.io.BufferedOutputStream r2 = r10.f476
            r3 = 0
            if (r0 == 0) goto La6
            int r0 = r10.f479     // Catch: java.lang.Exception -> Lc6
            r10.m331(r0)     // Catch: java.lang.Exception -> Lc6
            int r0 = r10.f475     // Catch: java.lang.Exception -> Lc6
            r10.m331(r0)     // Catch: java.lang.Exception -> Lc6
            r0 = 247(0xf7, float:3.46E-43)
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r2.write(r3)     // Catch: java.lang.Exception -> Lc6
            r2.write(r3)     // Catch: java.lang.Exception -> Lc6
            byte[] r0 = r10.f473     // Catch: java.lang.Exception -> Lc6
            if (r0 != 0) goto L5a
            goto L6a
        L5a:
            int r4 = r0.length     // Catch: java.lang.Exception -> Lc6
            r2.write(r0, r3, r4)     // Catch: java.lang.Exception -> Lc6
            int r0 = r0.length     // Catch: java.lang.Exception -> Lc6
            int r0 = 768 - r0
            r4 = r3
        L62:
            if (r4 >= r0) goto L6a
            r2.write(r3)     // Catch: java.lang.Exception -> Lc6
            int r4 = r4 + 1
            goto L62
        L6a:
            int r0 = r10.f474     // Catch: java.lang.Exception -> Lc6
            if (r0 < 0) goto La6
            r0 = 33
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r0 = 255(0xff, float:3.57E-43)
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r0 = 11
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r4 = -1147564006481454(0xfffbec4bef0961d2, double:NaN)
            java.lang.String r0 = "NETSCAPE2.0"     // Catch: java.lang.Exception -> Lc6
            java.nio.charset.Charset r4 = defpackage.AbstractC1422.f6221     // Catch: java.lang.Exception -> Lc6
            byte[] r0 = r0.getBytes(r4)     // Catch: java.lang.Exception -> Lc6
            r4 = -1147615546089006(0xfffbec3fef0961d2, double:NaN)
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r0 = 3
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r2.write(r1)     // Catch: java.lang.Exception -> Lc6
            int r0 = r10.f474     // Catch: java.lang.Exception -> Lc6
            r10.m331(r0)     // Catch: java.lang.Exception -> Lc6
            r2.write(r3)     // Catch: java.lang.Exception -> Lc6
        La6:
            r10.m326()     // Catch: java.lang.Exception -> Lc6
            r0 = 44
            r2.write(r0)     // Catch: java.lang.Exception -> Lc6
            r10.m331(r3)     // Catch: java.lang.Exception -> Lc6
            r10.m331(r3)     // Catch: java.lang.Exception -> Lc6
            int r0 = r10.f479     // Catch: java.lang.Exception -> Lc6
            r10.m331(r0)     // Catch: java.lang.Exception -> Lc6
            int r0 = r10.f475     // Catch: java.lang.Exception -> Lc6
            r10.m331(r0)     // Catch: java.lang.Exception -> Lc6
            r2.write(r3)     // Catch: java.lang.Exception -> Lc6
            r10.m330(r11)     // Catch: java.lang.Exception -> Lc6
            r10.f481 = r3     // Catch: java.lang.Exception -> Lc6
        Lc6:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m330(byte[] r17) {
            r16 = this;
            ᛱᛵᲁᛱ r0 = new ᛱᛵᲁᛱ
            r1 = r17
            r0.<init>(r1)
            r1 = -1147134509751854(0xfffbecafef0961d2, double:NaN)
            r1 = r16
            java.io.BufferedOutputStream r1 = r1.f476
            int r2 = r0.f920
            r1.write(r2)
            int r3 = r2 + 1
            r0.f922 = r3
            r4 = 0
            r0.f915 = r4
            r0.f919 = r3
            r5 = 1
            int r3 = r5 << r3
            int r3 = r3 - r5
            r0.f917 = r3
            int r2 = r5 << r2
            r0.f913 = r2
            int r3 = r2 + 1
            r0.f914 = r3
            int r2 = r2 + 2
            r0.f912 = r2
            r0.f927 = r4
            int[] r2 = r0.f925
            int r3 = r2.length
            if (r3 == 0) goto Lc6
            r3 = r2[r4]
            r6 = 5003(0x138b, float:7.01E-42)
            r8 = r4
            r7 = r6
        L40:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r7 >= r9) goto L49
            int r8 = r8 + 1
            int r7 = r7 * 2
            goto L40
        L49:
            int r7 = 8 - r8
            r8 = r4
        L4c:
            r9 = -1
            int[] r10 = r0.f926
            if (r8 >= r6) goto L56
            r10[r8] = r9
            int r8 = r8 + 1
            goto L4c
        L56:
            int r8 = r0.f913
            r0.m595(r8, r1)
            int r8 = r2.length
            r11 = r5
        L5d:
            if (r11 >= r8) goto Lba
            r12 = r2[r11]
            int r13 = r12 << 12
            int r13 = r13 + r3
            int r12 = r12 << r7
            r12 = r12 ^ r3
            r14 = r10[r12]
            int[] r15 = r0.f928
            if (r14 != r13) goto L71
            r3 = r15[r12]
            r16 = r9
            goto Lb5
        L71:
            if (r14 < 0) goto L8c
            int r14 = 5003 - r12
            if (r12 != 0) goto L78
            r14 = r5
        L78:
            int r12 = r12 - r14
            if (r12 >= 0) goto L7d
            int r12 = r12 + 5003
        L7d:
            r16 = r9
            r9 = r10[r12]
            if (r9 != r13) goto L86
            r3 = r15[r12]
            goto Lb5
        L86:
            if (r9 >= 0) goto L89
            goto L8e
        L89:
            r9 = r16
            goto L78
        L8c:
            r16 = r9
        L8e:
            r0.m595(r3, r1)
            r3 = r2[r11]
            int r9 = r0.f912
            r14 = 4096(0x1000, float:5.74E-42)
            if (r9 >= r14) goto La2
            int r14 = r9 + 1
            r0.f912 = r14
            r15[r12] = r9
            r10[r12] = r13
            goto Lb5
        La2:
            r9 = r4
        La3:
            if (r9 >= r6) goto Laa
            r10[r9] = r16
            int r9 = r9 + 1
            goto La3
        Laa:
            int r9 = r0.f913
            int r12 = r9 + 2
            r0.f912 = r12
            r0.f915 = r5
            r0.m595(r9, r1)
        Lb5:
            int r11 = r11 + 1
            r9 = r16
            goto L5d
        Lba:
            r0.m595(r3, r1)
            int r2 = r0.f914
            r0.m595(r2, r1)
            r1.write(r4)
            return
        Lc6:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final void m331(int r2) {
            r1 = this;
            r0 = r2 & 255(0xff, float:3.57E-43)
            java.io.BufferedOutputStream r1 = r1.f476
            r1.write(r0)
            int r2 = r2 >> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }
}
