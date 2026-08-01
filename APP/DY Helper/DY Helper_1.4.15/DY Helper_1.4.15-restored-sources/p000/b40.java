package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b40 {

    /* JADX INFO: renamed from: α */
    public java.nio.ByteBuffer f1452;

    /* JADX INFO: renamed from: β */
    public int f1453;

    /* JADX INFO: renamed from: γ */
    public int f1454;

    /* JADX INFO: renamed from: δ */
    public int[] f1455;

    /* JADX INFO: renamed from: ε */
    public int f1456;

    /* JADX INFO: renamed from: ζ */
    public boolean f1457;

    /* JADX INFO: renamed from: η */
    public boolean f1458;

    /* JADX INFO: renamed from: θ */
    public int f1459;

    /* JADX INFO: renamed from: ι */
    public int[] f1460;

    /* JADX INFO: renamed from: κ */
    public int f1461;

    /* JADX INFO: renamed from: λ */
    public int f1462;

    /* JADX INFO: renamed from: μ */
    public final p000.C0966x f1463;

    /* JADX INFO: renamed from: ν */
    public final p000.f72 f1464;

    public b40() {
            r4 = this;
            x r0 = p000.C0966x.f11930
            h72 r1 = p000.f72.f3770
            if (r1 != 0) goto Ld
            h72 r1 = new h72
            r1.<init>()
            p000.f72.f3770 = r1
        Ld:
            h72 r1 = p000.f72.f3770
            r4.<init>()
            r2 = 1
            r4.f1454 = r2
            r2 = 0
            r4.f1455 = r2
            r2 = 0
            r4.f1456 = r2
            r4.f1457 = r2
            r4.f1458 = r2
            r3 = 16
            int[] r3 = new int[r3]
            r4.f1460 = r3
            r4.f1461 = r2
            r4.f1462 = r2
            r4.f1463 = r0
            r0 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r2)
            r4.f1452 = r0
            r4.f1464 = r1
            int r0 = r0.capacity()
            r4.f1453 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m720(int r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L15
            r0 = 0
            r1 = 1
            r3.m735(r1, r0)
            java.nio.ByteBuffer r0 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            byte r5 = (byte) r5
            r0.put(r2, r5)
            r3.m736(r4)
        L15:
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m721(byte r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            r3.m735(r1, r0)
            java.nio.ByteBuffer r0 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            r0.put(r2, r4)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m722(int r1, byte r2) {
            r0 = this;
            if (r2 == 0) goto L8
            r0.m721(r2)
            r0.m736(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m723(int r4) {
            r3 = this;
            r0 = 0
            r1 = 4
            r3.m735(r1, r0)
            java.nio.ByteBuffer r0 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            r0.putInt(r2, r4)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m724(int r1, int r2) {
            r0 = this;
            if (r2 == 0) goto L8
            r0.m723(r2)
            r0.m736(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m725(long r4) {
            r3 = this;
            r0 = 0
            r1 = 8
            r3.m735(r1, r0)
            java.nio.ByteBuffer r0 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            r0.putLong(r2, r4)
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m726(int r4) {
            r3 = this;
            r0 = 0
            r1 = 4
            r3.m735(r1, r0)
            int r0 = r3.m734()
            int r0 = r0 - r4
            int r0 = r0 + r1
            java.nio.ByteBuffer r4 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            r4.putInt(r2, r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public final void m727(int r1, int r2) {
            r0 = this;
            if (r2 == 0) goto L8
            r0.m726(r2)
            r0.m736(r1)
        L8:
            return
    }

    /* JADX INFO: renamed from: ι */
    public final void m728(short r4) {
            r3 = this;
            r0 = 0
            r1 = 2
            r3.m735(r1, r0)
            java.nio.ByteBuffer r0 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 - r1
            r3.f1453 = r2
            r0.putShort(r2, r4)
            return
    }

    /* JADX INFO: renamed from: κ */
    public final int m729(java.lang.CharSequence r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            f72 r2 = r0.f1464
            r3 = r2
            h72 r3 = (p000.h72) r3
            r3.getClass()
            int r3 = r1.length()
            r4 = 0
            r5 = r4
        L12:
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r3) goto L1f
            char r7 = r1.charAt(r5)
            if (r7 >= r6) goto L1f
            int r5 = r5 + 1
            goto L12
        L1f:
            r7 = r3
        L20:
            r8 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 2048(0x800, float:2.87E-42)
            r11 = 1
            if (r5 >= r3) goto L66
            char r12 = r1.charAt(r5)
            if (r12 >= r10) goto L39
            int r8 = 127 - r12
            int r8 = r8 >>> 31
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L20
        L39:
            int r12 = r1.length()
            r13 = r4
        L3e:
            if (r5 >= r12) goto L65
            char r14 = r1.charAt(r5)
            if (r14 >= r10) goto L4c
            int r14 = 127 - r14
            int r14 = r14 >>> 31
            int r13 = r13 + r14
            goto L63
        L4c:
            int r13 = r13 + 2
            if (r9 > r14) goto L63
            if (r14 > r8) goto L63
            int r14 = java.lang.Character.codePointAt(r1, r5)
            r15 = 65536(0x10000, float:9.1835E-41)
            if (r14 < r15) goto L5d
            int r5 = r5 + 1
            goto L63
        L5d:
            g72 r0 = new g72
            r0.<init>(r5, r12)
            throw r0
        L63:
            int r5 = r5 + r11
            goto L3e
        L65:
            int r7 = r7 + r13
        L66:
            if (r7 < r3) goto L2a2
            r0.m721(r4)
            r0.m738(r11, r7, r11)
            java.nio.ByteBuffer r3 = r0.f1452
            int r5 = r0.f1453
            int r5 = r5 - r7
            r0.f1453 = r5
            r3.position(r5)
            java.nio.ByteBuffer r3 = r0.f1452
            h72 r2 = (p000.h72) r2
            r2.getClass()
            boolean r2 = r3.hasArray()
            java.lang.String r5 = " at index "
            java.lang.String r7 = "Failed writing "
            if (r2 == 0) goto L1a1
            int r2 = r3.arrayOffset()
            byte[] r12 = r3.array()
            int r13 = r3.position()
            int r13 = r13 + r2
            int r14 = r3.remaining()
            int r15 = r1.length()
            int r14 = r14 + r13
        L9f:
            r16 = r11
            if (r4 >= r15) goto Lb8
            int r11 = r4 + r13
            if (r11 >= r14) goto Lb8
            char r8 = r1.charAt(r4)
            if (r8 >= r6) goto Lb8
            byte r8 = (byte) r8
            r12[r11] = r8
            int r4 = r4 + 1
            r11 = r16
            r8 = 57343(0xdfff, float:8.0355E-41)
            goto L9f
        Lb8:
            if (r4 != r15) goto Lbd
            int r13 = r13 + r15
            goto L19b
        Lbd:
            int r13 = r13 + r4
        Lbe:
            if (r4 >= r15) goto L19b
            char r8 = r1.charAt(r4)
            if (r8 >= r6) goto Ld0
            if (r13 >= r14) goto Ld0
            int r11 = r13 + 1
            byte r8 = (byte) r8
            r12[r13] = r8
            r13 = r11
            goto L14f
        Ld0:
            if (r8 >= r10) goto Le8
            int r11 = r14 + (-2)
            if (r13 > r11) goto Le8
            int r11 = r13 + 1
            int r10 = r8 >>> 6
            r10 = r10 | 960(0x3c0, float:1.345E-42)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r13 = r13 + 2
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r12[r11] = r8
            goto L14f
        Le8:
            if (r8 < r9) goto Lef
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r10 >= r8) goto L10f
        Lef:
            int r10 = r14 + (-3)
            if (r13 > r10) goto L10f
            int r10 = r13 + 1
            int r11 = r8 >>> 12
            r11 = r11 | 480(0x1e0, float:6.73E-43)
            byte r11 = (byte) r11
            r12[r13] = r11
            int r11 = r13 + 2
            int r17 = r8 >>> 6
            r9 = r17 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9
            r12[r10] = r9
            int r13 = r13 + 3
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r12[r11] = r8
            goto L14f
        L10f:
            int r9 = r14 + (-4)
            if (r13 > r9) goto L161
            int r9 = r4 + 1
            int r10 = r1.length()
            if (r9 == r10) goto L159
            char r4 = r1.charAt(r9)
            boolean r10 = java.lang.Character.isSurrogatePair(r8, r4)
            if (r10 == 0) goto L158
            int r4 = java.lang.Character.toCodePoint(r8, r4)
            int r8 = r13 + 1
            int r10 = r4 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            r12[r13] = r10
            int r10 = r13 + 2
            int r11 = r4 >>> 12
            r11 = r11 & 63
            r11 = r11 | r6
            byte r11 = (byte) r11
            r12[r8] = r11
            int r8 = r13 + 3
            int r11 = r4 >>> 6
            r11 = r11 & 63
            r11 = r11 | r6
            byte r11 = (byte) r11
            r12[r10] = r11
            int r13 = r13 + 4
            r4 = r4 & 63
            r4 = r4 | r6
            byte r4 = (byte) r4
            r12[r8] = r4
            r4 = r9
        L14f:
            int r4 = r4 + 1
            r9 = 55296(0xd800, float:7.7486E-41)
            r10 = 2048(0x800, float:2.87E-42)
            goto Lbe
        L158:
            r4 = r9
        L159:
            g72 r0 = new g72
            int r4 = r4 + (-1)
            r0.<init>(r4, r15)
            throw r0
        L161:
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r0 > r8) goto L183
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r8 > r10) goto L183
            int r0 = r4 + 1
            int r2 = r1.length()
            if (r0 == r2) goto L17d
            char r0 = r1.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r8, r0)
            if (r0 != 0) goto L183
        L17d:
            g72 r0 = new g72
            r0.<init>(r4, r15)
            throw r0
        L183:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r8)
            r1.append(r5)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19b:
            int r13 = r13 - r2
            r3.position(r13)
            goto L271
        L1a1:
            r16 = r11
            int r2 = r1.length()
            int r8 = r3.position()
        L1ab:
            if (r4 >= r2) goto L1bc
            char r9 = r1.charAt(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            if (r9 >= r6) goto L1bc
            int r10 = r8 + r4
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r3.put(r10, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            int r4 = r4 + 1
            goto L1ab
        L1bc:
            if (r4 != r2) goto L1c5
            int r2 = r8 + r4
            r3.position(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            goto L271
        L1c5:
            int r8 = r8 + r4
        L1c6:
            if (r4 >= r2) goto L26e
            char r9 = r1.charAt(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            if (r9 >= r6) goto L1dc
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r3.put(r8, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r10 = 2048(0x800, float:2.87E-42)
        L1d4:
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            goto L266
        L1dc:
            r10 = 2048(0x800, float:2.87E-42)
            if (r9 >= r10) goto L1f6
            int r11 = r8 + 1
            int r12 = r9 >>> 6
            r12 = r12 | 192(0xc0, float:2.69E-43)
            byte r12 = (byte) r12
            r3.put(r8, r12)     // Catch: java.lang.IndexOutOfBoundsException -> L1f3
            r8 = r9 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8     // Catch: java.lang.IndexOutOfBoundsException -> L1f3
            r3.put(r11, r8)     // Catch: java.lang.IndexOutOfBoundsException -> L1f3
            r8 = r11
            goto L1d4
        L1f3:
            r8 = r11
            goto L276
        L1f6:
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r9 < r11) goto L24a
            if (r12 >= r9) goto L201
            goto L24a
        L201:
            int r13 = r4 + 1
            if (r13 == r2) goto L244
            char r4 = r1.charAt(r13)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            boolean r14 = java.lang.Character.isSurrogatePair(r9, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            if (r14 == 0) goto L243
            int r4 = java.lang.Character.toCodePoint(r9, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            int r9 = r8 + 1
            int r14 = r4 >>> 18
            r14 = r14 | 240(0xf0, float:3.36E-43)
            byte r14 = (byte) r14
            r3.put(r8, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L241
            int r14 = r8 + 2
            int r15 = r4 >>> 12
            r15 = r15 & 63
            r15 = r15 | r6
            byte r15 = (byte) r15
            r3.put(r9, r15)     // Catch: java.lang.IndexOutOfBoundsException -> L23e
            int r8 = r8 + 3
            int r9 = r4 >>> 6
            r9 = r9 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9
            r3.put(r14, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            r4 = r4 & 63
            r4 = r4 | r6
            byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            r3.put(r8, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L23c
            r4 = r13
            goto L266
        L23c:
            r4 = r13
            goto L276
        L23e:
            r4 = r13
            r8 = r14
            goto L276
        L241:
            r8 = r9
            goto L23c
        L243:
            r4 = r13
        L244:
            g72 r0 = new g72     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r0.<init>(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            throw r0     // Catch: java.lang.IndexOutOfBoundsException -> L276
        L24a:
            int r13 = r8 + 1
            int r14 = r9 >>> 12
            r14 = r14 | 224(0xe0, float:3.14E-43)
            byte r14 = (byte) r14
            r3.put(r8, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L26c
            int r8 = r8 + 2
            int r14 = r9 >>> 6
            r14 = r14 & 63
            r14 = r14 | r6
            byte r14 = (byte) r14
            r3.put(r13, r14)     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r9 = r9 & 63
            r9 = r9 | r6
            byte r9 = (byte) r9     // Catch: java.lang.IndexOutOfBoundsException -> L276
            r3.put(r8, r9)     // Catch: java.lang.IndexOutOfBoundsException -> L276
        L266:
            int r4 = r4 + 1
            int r8 = r8 + 1
            goto L1c6
        L26c:
            r8 = r13
            goto L276
        L26e:
            r3.position(r8)     // Catch: java.lang.IndexOutOfBoundsException -> L276
        L271:
            int r0 = r0.m732()
            return r0
        L276:
            int r0 = r3.position()
            int r2 = r3.position()
            int r8 = r8 - r2
            int r8 = r8 + 1
            int r2 = java.lang.Math.max(r4, r8)
            int r2 = r2 + r0
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            char r1 = r1.charAt(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r7)
            r3.append(r1)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L2a2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            long r1 = (long) r7
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "UTF-8 length does not fit in int: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public final int m730(int[] r3) {
            r2 = this;
            boolean r0 = r2.f1457
            if (r0 != 0) goto L1b
            r0 = 4
            int r1 = r3.length
            r2.m738(r0, r1, r0)
            int r0 = r3.length
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L16
            r1 = r3[r0]
            r2.m726(r1)
            int r0 = r0 + (-1)
            goto Lc
        L16:
            int r2 = r2.m732()
            return r2
        L1b:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: μ */
    public final int m731() {
            r11 = this;
            int[] r0 = r11.f1455
            if (r0 == 0) goto Lc5
            boolean r0 = r11.f1457
            if (r0 == 0) goto Lc5
            r0 = 0
            r11.m723(r0)
            int r1 = r11.m734()
            int r2 = r11.f1456
            int r2 = r2 + (-1)
        L14:
            if (r2 < 0) goto L1f
            int[] r3 = r11.f1455
            r3 = r3[r2]
            if (r3 != 0) goto L1f
            int r2 = r2 + (-1)
            goto L14
        L1f:
            r3 = r2
        L20:
            if (r3 < 0) goto L33
            int[] r4 = r11.f1455
            r4 = r4[r3]
            if (r4 == 0) goto L2b
            int r4 = r1 - r4
            goto L2c
        L2b:
            r4 = r0
        L2c:
            short r4 = (short) r4
            r11.m728(r4)
            int r3 = r3 + (-1)
            goto L20
        L33:
            int r3 = r11.f1459
            int r3 = r1 - r3
            short r3 = (short) r3
            r11.m728(r3)
            int r2 = r2 + 3
            r3 = 2
            int r2 = r2 * r3
            short r2 = (short) r2
            r11.m728(r2)
            r2 = r0
        L44:
            int r4 = r11.f1461
            if (r2 >= r4) goto L84
            java.nio.ByteBuffer r4 = r11.f1452
            int r4 = r4.capacity()
            int[] r5 = r11.f1460
            r5 = r5[r2]
            int r4 = r4 - r5
            int r5 = r11.f1453
            java.nio.ByteBuffer r6 = r11.f1452
            short r6 = r6.getShort(r4)
            java.nio.ByteBuffer r7 = r11.f1452
            short r7 = r7.getShort(r5)
            if (r6 != r7) goto L81
            r7 = r3
        L64:
            if (r7 >= r6) goto L7c
            java.nio.ByteBuffer r8 = r11.f1452
            int r9 = r4 + r7
            short r8 = r8.getShort(r9)
            java.nio.ByteBuffer r9 = r11.f1452
            int r10 = r5 + r7
            short r9 = r9.getShort(r10)
            if (r8 == r9) goto L79
            goto L81
        L79:
            int r7 = r7 + 2
            goto L64
        L7c:
            int[] r4 = r11.f1460
            r2 = r4[r2]
            goto L85
        L81:
            int r2 = r2 + 1
            goto L44
        L84:
            r2 = r0
        L85:
            if (r2 == 0) goto L97
            java.nio.ByteBuffer r3 = r11.f1452
            int r3 = r3.capacity()
            int r3 = r3 - r1
            r11.f1453 = r3
            java.nio.ByteBuffer r4 = r11.f1452
            int r2 = r2 - r1
            r4.putInt(r3, r2)
            goto Lc2
        L97:
            int r2 = r11.f1461
            int[] r4 = r11.f1460
            int r5 = r4.length
            if (r2 != r5) goto La5
            int r2 = r2 * r3
            int[] r2 = java.util.Arrays.copyOf(r4, r2)
            r11.f1460 = r2
        La5:
            int[] r2 = r11.f1460
            int r3 = r11.f1461
            int r4 = r3 + 1
            r11.f1461 = r4
            int r4 = r11.m734()
            r2[r3] = r4
            java.nio.ByteBuffer r2 = r11.f1452
            int r3 = r2.capacity()
            int r3 = r3 - r1
            int r4 = r11.m734()
            int r4 = r4 - r1
            r2.putInt(r3, r4)
        Lc2:
            r11.f1457 = r0
            return r1
        Lc5:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endTable called without startTable"
            r11.<init>(r0)
            throw r11
    }

    /* JADX INFO: renamed from: ν */
    public final int m732() {
            r3 = this;
            boolean r0 = r3.f1457
            if (r0 == 0) goto L19
            r0 = 0
            r3.f1457 = r0
            int r0 = r3.f1462
            java.nio.ByteBuffer r1 = r3.f1452
            int r2 = r3.f1453
            int r2 = r2 + (-4)
            r3.f1453 = r2
            r1.putInt(r2, r0)
            int r3 = r3.m734()
            return r3
        L19:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r0 = "FlatBuffers: endVector called without startVector"
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ξ */
    public final void m733(int r3) {
            r2 = this;
            int r0 = r2.f1454
            r1 = 4
            r2.m735(r0, r1)
            r2.m726(r3)
            java.nio.ByteBuffer r3 = r2.f1452
            int r0 = r2.f1453
            r3.position(r0)
            r3 = 1
            r2.f1458 = r3
            return
    }

    /* JADX INFO: renamed from: ο */
    public final int m734() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f1452
            int r0 = r0.capacity()
            int r1 = r1.f1453
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: π */
    public final void m735(int r8, int r9) {
            r7 = this;
            int r0 = r7.f1454
            if (r8 <= r0) goto L6
            r7.f1454 = r8
        L6:
            java.nio.ByteBuffer r0 = r7.f1452
            int r0 = r0.capacity()
            int r1 = r7.f1453
            int r0 = r0 - r1
            int r0 = r0 + r9
            int r0 = ~r0
            int r0 = r0 + 1
            int r1 = r8 + (-1)
            r0 = r0 & r1
        L16:
            int r1 = r7.f1453
            int r2 = r0 + r8
            int r2 = r2 + r9
            r3 = 0
            if (r1 >= r2) goto L72
            java.nio.ByteBuffer r1 = r7.f1452
            int r1 = r1.capacity()
            java.nio.ByteBuffer r2 = r7.f1452
            int r4 = r2.capacity()
            if (r4 != 0) goto L2f
            r5 = 1024(0x400, float:1.435E-42)
            goto L3c
        L2f:
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r4 == r5) goto L6a
            r6 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6 = r6 & r4
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            int r5 = r4 << 1
        L3c:
            r2.position(r3)
            x r3 = r7.f1463
            r3.getClass()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r5)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r3 = r3.order(r5)
            java.nio.Buffer r5 = r3.clear()
            int r5 = r5.capacity()
            int r5 = r5 - r4
            r3.position(r5)
            r3.put(r2)
            r7.f1452 = r3
            int r2 = r7.f1453
            int r3 = r3.capacity()
            int r3 = r3 - r1
            int r3 = r3 + r2
            r7.f1453 = r3
            goto L16
        L6a:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "FlatBuffers: cannot grow buffer beyond 2 gigabytes."
            r7.<init>(r8)
            throw r7
        L72:
            r8 = r3
        L73:
            if (r8 >= r0) goto L83
            java.nio.ByteBuffer r9 = r7.f1452
            int r1 = r7.f1453
            int r1 = r1 + (-1)
            r7.f1453 = r1
            r9.put(r1, r3)
            int r8 = r8 + 1
            goto L73
        L83:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m736(int r2) {
            r1 = this;
            int[] r0 = r1.f1455
            int r1 = r1.m734()
            r0[r2] = r1
            return
    }

    /* JADX INFO: renamed from: σ */
    public final void m737(int r3) {
            r2 = this;
            boolean r0 = r2.f1457
            if (r0 != 0) goto L21
            int[] r0 = r2.f1455
            if (r0 == 0) goto Lb
            int r0 = r0.length
            if (r0 >= r3) goto Lf
        Lb:
            int[] r0 = new int[r3]
            r2.f1455 = r0
        Lf:
            r2.f1456 = r3
            int[] r0 = r2.f1455
            r1 = 0
            java.util.Arrays.fill(r0, r1, r3, r1)
            r3 = 1
            r2.f1457 = r3
            int r3 = r2.m734()
            r2.f1459 = r3
            return
        L21:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "FlatBuffers: object serialization must not be nested."
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: τ */
    public final void m738(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f1457
            if (r0 != 0) goto L12
            r1.f1462 = r3
            int r2 = r2 * r3
            r3 = 4
            r1.m735(r3, r2)
            r1.m735(r4, r2)
            r2 = 1
            r1.f1457 = r2
            return
        L12:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "FlatBuffers: object serialization must not be nested."
            r1.<init>(r2)
            throw r1
    }
}
