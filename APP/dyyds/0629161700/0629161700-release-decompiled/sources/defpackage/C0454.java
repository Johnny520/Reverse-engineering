package defpackage;

/* JADX INFO: renamed from: ᛳᛴᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0454 implements defpackage.InterfaceC0464 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String f2259;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2260;

    public C0454(java.lang.String r3) {
            r2 = this;
            r0 = 1
            r2.f2260 = r0
            r0 = -1151506786459182(0xfffbe8b5ef0961d2, double:NaN)
            r2.<init>()
            r2.f2259 = r3
            return
    }

    public /* synthetic */ C0454(java.lang.String r1, int r2) {
            r0 = this;
            r0.f2260 = r2
            r0.f2259 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static int[] m1229(java.io.RandomAccessFile r3, defpackage.C2047 r4) {
            long r0 = r4.f8817
            r3.seek(r0)
            r4 = 4
            r3.skipBytes(r4)
            int r4 = r3.readInt()
            int r0 = r3.readInt()
            r1 = 0
            if (r4 == 0) goto L1e
            int[] r3 = new int[r0]
        L16:
            if (r1 >= r0) goto L1d
            r3[r1] = r4
            int r1 = r1 + 1
            goto L16
        L1d:
            return r3
        L1e:
            int[] r4 = new int[r0]
        L20:
            if (r1 >= r0) goto L2b
            int r2 = r3.readInt()
            r4[r1] = r2
            int r1 = r1 + 1
            goto L20
        L2b:
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m1230(java.io.RandomAccessFile r14, long r15, long r17) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r15
        L6:
            r1 = 8
            long r5 = r3 + r1
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 > 0) goto L77
            r14.seek(r3)
            r5 = 8
            byte[] r6 = new byte[r5]
            int r7 = r14.read(r6)
            if (r7 < r5) goto L77
            r7 = 0
            r8 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r6, r7, r8)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r7 = r7.order(r9)
            int r7 = r7.getInt()
            long r10 = (long) r7
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            r12 = r1
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6219
            r2.<init>(r6, r8, r8, r1)
            r6 = 1
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L54
            byte[] r1 = new byte[r5]
            r14.read(r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.nio.ByteBuffer r1 = r1.order(r9)
            long r10 = r1.getLong()
            r5 = 16
            goto L5d
        L54:
            r5 = 0
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 != 0) goto L5c
            long r10 = r17 - r3
        L5c:
            r5 = r12
        L5d:
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 < 0) goto L77
            r7 = r5
            r5 = r10
            long r9 = r3 + r5
            long r11 = r17 + r12
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 <= 0) goto L6c
            goto L77
        L6c:
            ᲇᛵᛱᛵ r1 = new ᲇᛵᛱᛵ
            long r7 = r7 + r3
            r1.<init>(r2, r3, r5, r7, r9)
            r0.add(r1)
            r3 = r9
            goto L6
        L77:
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.util.ArrayList m1231(java.io.RandomAccessFile r5, defpackage.C2047 r6) {
            long r0 = r6.f8817
            r5.seek(r0)
            r6 = 4
            r5.skipBytes(r6)
            int r6 = r5.readInt()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L13:
            if (r1 >= r6) goto L30
            int r2 = r5.readInt()
            int r3 = r5.readInt()
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.<init>(r2, r3)
            r0.add(r4)
            int r1 = r1 + 1
            goto L13
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static byte[] m1232(java.io.RandomAccessFile r7, defpackage.C2047 r8) {
            long r0 = r8.f8817
            long r2 = r8.f8816
            long r2 = r2 - r0
            int r8 = (int) r2
            if (r8 <= 0) goto L74
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r8 <= r2) goto Ld
            goto L74
        Ld:
            r7.seek(r0)
            byte[] r0 = new byte[r8]
            r7.read(r0)
            r1 = -1151833203973678(0xfffbe869ef0961d2, double:NaN)
            java.lang.String r7 = "hvcC"
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6219
            byte[] r7 = r7.getBytes(r1)
            r1 = -1151854678810158(0xfffbe864ef0961d2, double:NaN)
            int r1 = r8 + (-4)
            r2 = 4
            r3 = r2
        L30:
            if (r3 >= r1) goto L74
            r4 = r0[r3]
            r5 = 0
            r5 = r7[r5]
            if (r4 != r5) goto L71
            int r4 = r3 + 1
            r4 = r0[r4]
            r5 = 1
            r5 = r7[r5]
            if (r4 != r5) goto L71
            int r4 = r3 + 2
            r4 = r0[r4]
            r5 = 2
            r5 = r7[r5]
            if (r4 != r5) goto L71
            int r4 = r3 + 3
            r4 = r0[r4]
            r5 = 3
            r5 = r7[r5]
            if (r4 != r5) goto L71
            int r4 = r3 + (-4)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r0, r4, r2)
            java.nio.ByteOrder r6 = java.nio.ByteOrder.BIG_ENDIAN
            java.nio.ByteBuffer r5 = r5.order(r6)
            int r5 = r5.getInt()
            r6 = 8
            if (r5 <= r6) goto L71
            int r4 = r4 + r5
            if (r4 > r8) goto L71
            int r3 = r3 + r2
            byte[] r7 = defpackage.AbstractC2315.m3773(r0, r3, r4)
            return r7
        L71:
            int r3 = r3 + 1
            goto L30
        L74:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static long[] m1233(long[] r11, java.util.List r12, int[] r13, int r14) {
            long[] r0 = new long[r14]
            int r1 = r11.length
            r2 = 0
            r3 = r2
            r4 = r3
        L6:
            if (r3 >= r1) goto L4f
            int r5 = r3 + 1
            java.lang.Object r6 = defpackage.AbstractC1107.m2114(r12)
            ᲇᲇᛸᛷ r6 = (defpackage.C2150) r6
            java.lang.Object r6 = r6.f9136
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.util.Iterator r7 = r12.iterator()
        L1c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L3b
            java.lang.Object r8 = r7.next()
            ᲇᲇᛸᛷ r8 = (defpackage.C2150) r8
            java.lang.Object r9 = r8.f9137
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 > r5) goto L3b
            java.lang.Object r6 = r8.f9136
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            goto L1c
        L3b:
            r7 = r11[r3]
            r3 = r2
        L3e:
            if (r3 >= r6) goto L4d
            if (r4 >= r14) goto L4d
            r0[r4] = r7
            r9 = r13[r4]
            long r9 = (long) r9
            long r7 = r7 + r9
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L3e
        L4d:
            r3 = r5
            goto L6
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static int[] m1234(java.util.List r10, long r11, int r13) {
            int[] r0 = new int[r13]
            boolean r1 = r10.isEmpty()
            r2 = 100
            r3 = 0
            if (r1 == 0) goto Lf
            java.util.Arrays.fill(r0, r3, r13, r2)
            return r0
        Lf:
            java.util.Iterator r10 = r10.iterator()
            r1 = r3
        L14:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r10.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.component2()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            long r6 = (long) r4
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            long r6 = r6 / r11
            int r4 = (int) r6
            r6 = 20
            if (r4 >= r6) goto L3f
            r4 = r2
        L3f:
            r6 = r3
        L40:
            if (r6 >= r5) goto L14
            if (r1 >= r13) goto L14
            r0[r1] = r4
            int r1 = r1 + 1
            int r6 = r6 + 1
            goto L40
        L4b:
            if (r1 >= r13) goto L52
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4b
        L52:
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static kotlin.Pair m1235(java.io.RandomAccessFile r2, defpackage.C2047 r3) {
            long r0 = r3.f8817
            r2.seek(r0)
            byte r3 = r2.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 3
            r2.skipBytes(r0)
            if (r3 != 0) goto L17
            r3 = 20
            r2.skipBytes(r3)
            goto L1c
        L17:
            r3 = 32
            r2.skipBytes(r3)
        L1c:
            r3 = 8
            r2.skipBytes(r3)
            r3 = 4
            r2.skipBytes(r3)
            r2.skipBytes(r3)
            r3 = 36
            r2.skipBytes(r3)
            int r3 = r2.readInt()
            int r2 = r2.readInt()
            int r3 = r3 >> 16
            int r2 = r2 >> 16
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.<init>(r3, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static long m1236(java.io.RandomAccessFile r2, defpackage.C2047 r3) {
            long r0 = r3.f8817
            r2.seek(r0)
            byte r3 = r2.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 3
            r2.skipBytes(r0)
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r3 != 0) goto L22
            r3 = 8
            r2.skipBytes(r3)
            int r2 = r2.readInt()
        L1f:
            long r2 = (long) r2
            long r2 = r2 & r0
            return r2
        L22:
            r3 = 16
            r2.skipBytes(r3)
            int r2 = r2.readInt()
            goto L1f
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static java.util.ArrayList m1237(java.io.RandomAccessFile r6, defpackage.C2047 r7) {
            long r0 = r7.f8817
            r6.seek(r0)
            r7 = 4
            r6.skipBytes(r7)
            int r7 = r6.readInt()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L13:
            if (r1 >= r7) goto L38
            int r2 = r6.readInt()
            int r3 = r6.readInt()
            int r4 = r6.readInt()
            ᲇᲇᛸᛷ r5 = new ᲇᲇᛸᛷ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.<init>(r2, r3, r4)
            r0.add(r5)
            int r1 = r1 + 1
            goto L13
        L38:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2260
            switch(r0) {
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r2 = r2.f2259
            r1 = 62
            java.lang.String r2 = defpackage.AbstractC0225.m823(r0, r2, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C1583 m1238() {
            r18 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.io.File r1 = new java.io.File
            r2 = r18
            java.lang.String r2 = r2.f2259
            r1.<init>(r2)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L16
            return r3
        L16:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r4 = -1151545441164846(0xfffbe8acef0961d2, double:NaN)
            java.lang.String r4 = "r"
            r2.<init>(r1, r4)
            long r4 = r2.length()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = 0
            java.util.ArrayList r1 = m1230(r2, r6, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L32:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto L57
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r5 = r4
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r5 = r5.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = -1151554031099438(0xfffbe8aaef0961d2, double:NaN)
            java.lang.String r6 = "moov"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L32
            goto L58
        L51:
            r0 = move-exception
            goto L32b
        L54:
            r0 = move-exception
            goto L324
        L57:
            r4 = r3
        L58:
            ᲇᛵᛱᛵ r4 = (defpackage.C2047) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 != 0) goto L60
            r2.close()
            return r3
        L60:
            long r5 = r4.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r7 = r4.f8816     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.ArrayList r1 = m1230(r2, r5, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L6c:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto L8b
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r5 = r4
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r5 = r5.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = -1151575505935918(0xfffbe8a5ef0961d2, double:NaN)
            java.lang.String r6 = "trak"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L6c
            goto L8c
        L8b:
            r4 = r3
        L8c:
            ᲇᛵᛱᛵ r4 = (defpackage.C2047) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 != 0) goto L94
            r2.close()
            return r3
        L94:
            long r5 = r4.f8816     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r7 = r4.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.ArrayList r1 = m1230(r2, r7, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        La0:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto Lbf
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r9 = r4
            ᲇᛵᛱᛵ r9 = (defpackage.C2047) r9     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r9 = r9.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r10 = -1151596980772398(0xfffbe8a0ef0961d2, double:NaN)
            java.lang.String r10 = "tkhd"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r9 == 0) goto La0
            goto Lc0
        Lbf:
            r4 = r3
        Lc0:
            ᲇᛵᛱᛵ r4 = (defpackage.C2047) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto Lde
            kotlin.Pair r4 = m1235(r2, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.Object r9 = r4.getFirst()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.Object r4 = r4.getSecond()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r10 = r4
            goto Le0
        Lde:
            r9 = 0
            r10 = 0
        Le0:
            java.util.ArrayList r4 = m1230(r2, r7, r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        Le8:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L107
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = r5
            ᲇᛵᛱᛵ r6 = (defpackage.C2047) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r6 = r6.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r7 = -1151618455608878(0xfffbe89bef0961d2, double:NaN)
            java.lang.String r7 = "mdia"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto Le8
            goto L108
        L107:
            r5 = r3
        L108:
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 != 0) goto L110
            r2.close()
            return r3
        L110:
            long r6 = r5.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r4 = r5.f8816     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.ArrayList r4 = m1230(r2, r6, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L11c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L13b
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r7 = r6
            ᲇᛵᛱᛵ r7 = (defpackage.C2047) r7     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r7 = r7.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r11 = -1151639930445358(0xfffbe896ef0961d2, double:NaN)
            java.lang.String r8 = "mdhd"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r7 == 0) goto L11c
            goto L13c
        L13b:
            r6 = r3
        L13c:
            ᲇᛵᛱᛵ r6 = (defpackage.C2047) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L146
            long r5 = m1236(r2, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L144:
            r11 = r5
            goto L149
        L146:
            r5 = 1000(0x3e8, double:4.94E-321)
            goto L144
        L149:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L14d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L16c
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = r5
            ᲇᛵᛱᛵ r6 = (defpackage.C2047) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r6 = r6.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r7 = -1151661405281838(0xfffbe891ef0961d2, double:NaN)
            java.lang.String r7 = "minf"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L14d
            goto L16d
        L16c:
            r5 = r3
        L16d:
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 != 0) goto L175
            r2.close()
            return r3
        L175:
            long r6 = r5.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r4 = r5.f8816     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.ArrayList r4 = m1230(r2, r6, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L181:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L1a0
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r6 = r5
            ᲇᛵᛱᛵ r6 = (defpackage.C2047) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r6 = r6.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r7 = -1151682880118318(0xfffbe88cef0961d2, double:NaN)
            java.lang.String r7 = "stbl"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L181
            goto L1a1
        L1a0:
            r5 = r3
        L1a1:
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 != 0) goto L1a9
            r2.close()
            return r3
        L1a9:
            long r6 = r5.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r4 = r5.f8816     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.ArrayList r4 = m1230(r2, r6, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r5 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L1b5:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L1d4
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r7 = r6
            ᲇᛵᛱᛵ r7 = (defpackage.C2047) r7     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r7 = r7.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = -1151704354954798(0xfffbe887ef0961d2, double:NaN)
            java.lang.String r8 = "stts"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r7 == 0) goto L1b5
            goto L1d5
        L1d4:
            r6 = r3
        L1d5:
            ᲇᛵᛱᛵ r6 = (defpackage.C2047) r6     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 == 0) goto L1de
            java.util.ArrayList r5 = m1231(r2, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            goto L1e0
        L1de:
            ᲀᛶᲇ r5 = defpackage.C1698.f7558     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L1e0:
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L1e4:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r7 == 0) goto L203
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r8 = r7
            ᲇᛵᛱᛵ r8 = (defpackage.C2047) r8     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r8 = r8.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = -1151725829791278(0xfffbe882ef0961d2, double:NaN)
            java.lang.String r13 = "stsz"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r8 = r8.equals(r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r8 == 0) goto L1e4
            goto L204
        L203:
            r7 = r3
        L204:
            ᲇᛵᛱᛵ r7 = (defpackage.C2047) r7     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r7 != 0) goto L20c
            r2.close()
            return r3
        L20c:
            int[] r7 = m1229(r2, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r6 = r7.length     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r6 != 0) goto L217
            r2.close()
            return r3
        L217:
            java.util.Iterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L21b:
            boolean r13 = r8.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r13 == 0) goto L23a
            java.lang.Object r13 = r8.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r14 = r13
            ᲇᛵᛱᛵ r14 = (defpackage.C2047) r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r14 = r14.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r15 = -1151747304627758(0xfffbe87def0961d2, double:NaN)
            java.lang.String r15 = "stco"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r14 = r14.equals(r15)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r14 == 0) goto L21b
            goto L23b
        L23a:
            r13 = r3
        L23b:
            ᲇᛵᛱᛵ r13 = (defpackage.C2047) r13     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r8 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L241:
            boolean r14 = r8.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r14 == 0) goto L260
            java.lang.Object r14 = r8.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r15 = r14
            ᲇᛵᛱᛵ r15 = (defpackage.C2047) r15     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r15 = r15.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r16 = -1151768779464238(0xfffbe878ef0961d2, double:NaN)
            java.lang.String r1 = "co64"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r1 = r15.equals(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r1 == 0) goto L241
            goto L261
        L260:
            r14 = r3
        L261:
            ᲇᛵᛱᛵ r14 = (defpackage.C2047) r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r1 = 4
            if (r13 == 0) goto L288
            long r13 = r13.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.seek(r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.skipBytes(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long[] r8 = new long[r1]     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = 0
        L275:
            if (r13 >= r1) goto L2a4
            int r14 = r2.readInt()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r14 = r14 & r16
            r8[r13] = r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r13 = r13 + 1
            goto L275
        L288:
            if (r14 == 0) goto L320
            long r13 = r14.f8817     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.seek(r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.skipBytes(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r1 = r2.readInt()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            long[] r8 = new long[r1]     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = 0
        L299:
            if (r13 >= r1) goto L2a4
            long r14 = r2.readLong()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r8[r13] = r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int r13 = r13 + 1
            goto L299
        L2a4:
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L2a8:
            boolean r13 = r1.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r13 == 0) goto L2c7
            java.lang.Object r13 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r14 = r13
            ᲇᛵᛱᛵ r14 = (defpackage.C2047) r14     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r14 = r14.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r15 = -1151790254300718(0xfffbe873ef0961d2, double:NaN)
            java.lang.String r15 = "stsc"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r14 = r14.equals(r15)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r14 == 0) goto L2a8
            goto L2c8
        L2c7:
            r13 = r3
        L2c8:
            ᲇᛵᛱᛵ r13 = (defpackage.C2047) r13     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r13 == 0) goto L2d1
            java.util.ArrayList r0 = m1237(r2, r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            goto L2de
        L2d1:
            ᲇᲇᛸᛷ r1 = new ᲇᲇᛸᛷ     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r1.<init>(r0, r13, r0)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L2de:
            long[] r0 = m1233(r8, r0, r7, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            int[] r8 = m1234(r5, r11, r6)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.util.Iterator r1 = r4.iterator()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
        L2ea:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto L309
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r5 = r4
            ᲇᛵᛱᛵ r5 = (defpackage.C2047) r5     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r5 = r5.f8819     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = -1151811729137198(0xfffbe86eef0961d2, double:NaN)
            java.lang.String r13 = "stsd"     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            boolean r5 = r5.equals(r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r5 == 0) goto L2ea
            goto L30a
        L309:
            r4 = r3
        L30a:
            ᲇᛵᛱᛵ r4 = (defpackage.C2047) r4     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            if (r4 == 0) goto L314
            byte[] r1 = m1232(r2, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r13 = r1
            goto L315
        L314:
            r13 = r3
        L315:
            ᛸᲇᛴᛴ r4 = new ᛸᲇᛴᛴ     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r5 = r6
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r2.close()
            return r4
        L320:
            r2.close()
            return r3
        L324:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L51
            r2.close()
            return r3
        L32b:
            r2.close()
            throw r0
    }

    @Override // defpackage.InterfaceC0464
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public java.lang.Object mo741() {
            r1 = this;
            ᛲᛱᛶᲀ r0 = new ᛲᛱᛶᲀ
            java.lang.String r1 = r1.f2259
            r0.<init>(r1)
            throw r0
    }
}
