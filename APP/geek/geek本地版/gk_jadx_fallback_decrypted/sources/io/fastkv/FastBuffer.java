package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
class FastBuffer {
    private static final java.lang.String INVALID_STRING = "Invalid String";
    private static final int MAX_CHAR_LEN = 2048;
    private char[] charBuf;
    public byte[] hb;
    public int position;

    public FastBuffer(int r2) {
            r1 = this;
            byte[] r2 = new byte[r2]
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FastBuffer(byte[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FastBuffer(byte[] r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.charBuf = r0
            r1.hb = r2
            r1.position = r3
            return
    }

    private void encodeStr(java.lang.String r10) {
            r9 = this;
            byte[] r0 = r9.hb
            int r1 = r9.position
            int r2 = r10.length()
            r3 = 0
        L9:
            if (r3 >= r2) goto L8d
            int r4 = r3 + 1
            char r5 = r10.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1d
            int r3 = r1 + 1
            byte r5 = (byte) r5
            r0[r1] = r5
            r1 = r3
        L1b:
            r3 = r4
            goto L9
        L1d:
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 >= r7) goto L33
            int r3 = r1 + 1
            int r7 = r5 >>> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r1 = r1 + 2
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r0[r3] = r5
            goto L1b
        L33:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r7) goto L71
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r5 <= r7) goto L3e
            goto L71
        L3e:
            int r3 = r3 + 2
            char r4 = r10.charAt(r4)
            int r5 = r5 << 10
            int r5 = r5 + r4
            r4 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r5 = r5 + r4
            int r4 = r1 + 1
            int r7 = r5 >>> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r1 + 2
            int r8 = r5 >>> 12
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r4] = r8
            int r4 = r1 + 3
            int r8 = r5 >>> 6
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r7] = r8
            int r1 = r1 + 4
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r0[r4] = r5
            goto L9
        L71:
            int r3 = r1 + 1
            int r7 = r5 >>> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r7 = r1 + 2
            int r8 = r5 >>> 6
            r8 = r8 & 63
            r8 = r8 | r6
            byte r8 = (byte) r8
            r0[r3] = r8
            int r1 = r1 + 3
            r3 = r5 & 63
            r3 = r3 | r6
            byte r3 = (byte) r3
            r0[r7] = r3
            goto L1b
        L8d:
            r9.position = r1
            return
    }

    private char[] getCharBuf(int r4) {
            r3 = this;
            char[] r0 = r3.charBuf
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L12
            r0 = 256(0x100, float:3.59E-43)
            if (r4 > r0) goto Ld
            char[] r4 = new char[r0]
            goto Lf
        Ld:
            char[] r4 = new char[r1]
        Lf:
            r3.charBuf = r4
            return r4
        L12:
            int r2 = r0.length
            if (r2 >= r4) goto L1a
            char[] r4 = new char[r1]
            r3.charBuf = r4
            return r4
        L1a:
            return r0
    }

    public static int getStringSize(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L30
            int r3 = r1 + 1
            char r4 = r6.charAt(r1)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 >= r5) goto L16
            int r2 = r2 + 1
        L14:
            r1 = r3
            goto L6
        L16:
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L1d
            int r2 = r2 + 2
            goto L14
        L1d:
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L2d
            r5 = 57343(0xdfff, float:8.0355E-41)
            if (r4 <= r5) goto L28
            goto L2d
        L28:
            int r1 = r1 + 2
            int r2 = r2 + 4
            goto L6
        L2d:
            int r2 = r2 + 3
            goto L14
        L30:
            return r2
    }

    public static int getVarint32Size(int r1) {
            int r0 = r1 >> 7
            if (r0 != 0) goto L6
            r1 = 1
            return r1
        L6:
            int r0 = r1 >> 14
            if (r0 != 0) goto Lc
            r1 = 2
            return r1
        Lc:
            int r0 = r1 >> 21
            if (r0 != 0) goto L12
            r1 = 3
            return r1
        L12:
            int r1 = r1 >> 28
            if (r1 != 0) goto L18
            r1 = 4
            return r1
        L18:
            r1 = 5
            return r1
    }

    public synchronized java.lang.String decodeStr(byte[] r11, int r12, int r13) {
            r10 = this;
            monitor-enter(r10)
            char[] r0 = r10.getCharBuf(r13)     // Catch: java.lang.Throwable -> L18
            int r13 = r13 + r12
            r1 = 0
            r2 = r1
        L8:
            if (r12 >= r13) goto Lc3
            int r3 = r12 + 1
            r4 = r11[r12]     // Catch: java.lang.Throwable -> L18
            if (r4 <= 0) goto L1b
            int r12 = r2 + 1
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L18
            r0[r2] = r4     // Catch: java.lang.Throwable -> L18
            r2 = r12
            r12 = r3
            goto L8
        L18:
            r11 = move-exception
            goto Ld4
        L1b:
            r5 = -32
            r6 = -65
            if (r4 >= r5) goto L41
            int r12 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L18
            r5 = -62
            if (r4 < r5) goto L39
            if (r3 > r6) goto L39
            int r5 = r2 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            r3 = r3 & 63
            r3 = r3 | r4
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L18
            r0[r2] = r3     // Catch: java.lang.Throwable -> L18
        L37:
            r2 = r5
            goto L8
        L39:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L18
            throw r11     // Catch: java.lang.Throwable -> L18
        L41:
            r7 = -16
            if (r4 >= r7) goto L77
            int r7 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L18
            int r12 = r12 + 3
            r7 = r11[r7]     // Catch: java.lang.Throwable -> L18
            r8 = -96
            if (r4 != r5) goto L53
            if (r3 < r8) goto L6f
        L53:
            r5 = -19
            if (r4 != r5) goto L59
            if (r3 >= r8) goto L6f
        L59:
            if (r3 > r6) goto L6f
            if (r7 > r6) goto L6f
            int r5 = r2 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r3 = r3 | r4
            r4 = r7 & 63
            r3 = r3 | r4
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L18
            r0[r2] = r3     // Catch: java.lang.Throwable -> L18
            goto L37
        L6f:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L18
            throw r11     // Catch: java.lang.Throwable -> L18
        L77:
            int r5 = r12 + 2
            r3 = r11[r3]     // Catch: java.lang.Throwable -> L18
            int r7 = r12 + 3
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L18
            int r12 = r12 + 4
            r7 = r11[r7]     // Catch: java.lang.Throwable -> L18
            if (r3 > r6) goto Lbb
            int r8 = r4 << 28
            int r9 = r3 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto Lbb
            if (r5 > r6) goto Lbb
            if (r7 > r6) goto Lbb
            r4 = r4 & 7
            int r4 = r4 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r3 = r3 | r4
            r4 = r5 & 63
            int r4 = r4 << 6
            r3 = r3 | r4
            r4 = r7 & 63
            r3 = r3 | r4
            int r4 = r2 + 1
            int r5 = r3 >>> 10
            r6 = 55232(0xd7c0, float:7.7397E-41)
            int r5 = r5 + r6
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L18
            r0[r2] = r5     // Catch: java.lang.Throwable -> L18
            int r2 = r2 + 2
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r3 = r3 + r5
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L18
            r0[r4] = r3     // Catch: java.lang.Throwable -> L18
            goto L8
        Lbb:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L18
            throw r11     // Catch: java.lang.Throwable -> L18
        Lc3:
            if (r12 > r13) goto Lcc
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L18
            r11.<init>(r0, r1, r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r10)
            return r11
        Lcc:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "Invalid String"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L18
            throw r11     // Catch: java.lang.Throwable -> L18
        Ld4:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L18
            throw r11
    }

    public byte get() {
            r3 = this;
            byte[] r0 = r3.hb
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0 = r0[r1]
            return r0
    }

    public byte[] getBytes(int r5) {
            r4 = this;
            byte[] r0 = new byte[r5]
            byte[] r1 = r4.hb
            int r2 = r4.position
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r0, r3, r5)
            int r1 = r4.position
            int r1 = r1 + r5
            r4.position = r1
            return r0
    }

    public byte[] getBytes(io.fastkv.interfaces.FastCipher r1, int r2) {
            r0 = this;
            byte[] r2 = r0.getBytes(r2)
            if (r1 == 0) goto Lb
            byte[] r1 = r1.decrypt(r2)
            return r1
        Lb:
            return r2
    }

    public long getChecksum(int r10, int r11) {
            r9 = this;
            r0 = 0
            if (r11 > 0) goto L5
            return r0
        L5:
            int r2 = r11 >> 3
            r11 = r11 & 7
            r3 = 0
            r5 = r10
            r4 = r3
        Lc:
            if (r4 >= r2) goto L18
            long r6 = r9.getLong(r5)
            long r0 = r0 ^ r6
            int r5 = r5 + 8
            int r4 = r4 + 1
            goto Lc
        L18:
            int r11 = r11 << 3
        L1a:
            if (r3 >= r11) goto L2c
            byte[] r2 = r9.hb
            int r4 = r5 + 1
            r2 = r2[r5]
            long r5 = (long) r2
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            long r5 = r5 << r3
            long r0 = r0 ^ r5
            int r3 = r3 + 8
            r5 = r4
            goto L1a
        L2c:
            r10 = r10 & 7
            int r10 = r10 << 3
            long r2 = r0 << r10
            int r10 = 64 - r10
            long r10 = r0 >>> r10
            long r10 = r10 | r2
            return r10
    }

    public double getDouble(io.fastkv.interfaces.FastCipher r3) {
            r2 = this;
            long r0 = r2.getLong(r3)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public float getFloat(io.fastkv.interfaces.FastCipher r1) {
            r0 = this;
            int r1 = r0.getInt(r1)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public int getInt() {
            r5 = this;
            byte[] r0 = r5.hb
            int r1 = r5.position
            int r2 = r1 + 1
            r5.position = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r1 + 2
            r5.position = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            int r3 = r1 + 3
            r5.position = r3
            r4 = r0[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r2 = r2 | r4
            int r1 = r1 + 4
            r5.position = r1
            r0 = r0[r3]
            int r0 = r0 << 24
            r0 = r0 | r2
            return r0
    }

    public int getInt(int r5) {
            r4 = this;
            byte[] r0 = r4.hb
            int r1 = r5 + 1
            r2 = r0[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r5 + 2
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            int r5 = r5 + 3
            r2 = r0[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            r5 = r0[r5]
            int r5 = r5 << 24
            r5 = r5 | r1
            return r5
    }

    public int getInt(io.fastkv.interfaces.FastCipher r2) {
            r1 = this;
            int r0 = r1.getInt()
            if (r2 == 0) goto Lb
            int r2 = r2.decrypt(r0)
            return r2
        Lb:
            return r0
    }

    public long getLong() {
            r3 = this;
            int r0 = r3.position
            long r0 = r3.getLong(r0)
            int r2 = r3.position
            int r2 = r2 + 8
            r3.position = r2
            return r0
    }

    public long getLong(int r10) {
            r9 = this;
            byte[] r0 = r9.hb
            int r1 = r10 + 1
            r2 = r0[r10]
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r6 = r10 + 2
            r1 = r0[r1]
            long r7 = (long) r1
            long r7 = r7 & r4
            r1 = 8
            long r7 = r7 << r1
            long r1 = r2 | r7
            int r3 = r10 + 3
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 16
            long r6 = r6 << r8
            long r1 = r1 | r6
            int r6 = r10 + 4
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r4
            r3 = 24
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r3 = r10 + 5
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 32
            long r6 = r6 << r8
            long r1 = r1 | r6
            int r6 = r10 + 6
            r3 = r0[r3]
            long r7 = (long) r3
            long r7 = r7 & r4
            r3 = 40
            long r7 = r7 << r3
            long r1 = r1 | r7
            int r10 = r10 + 7
            r3 = r0[r6]
            long r6 = (long) r3
            long r3 = r6 & r4
            r5 = 48
            long r3 = r3 << r5
            long r1 = r1 | r3
            r10 = r0[r10]
            long r3 = (long) r10
            r10 = 56
            long r3 = r3 << r10
            long r0 = r1 | r3
            return r0
    }

    public long getLong(io.fastkv.interfaces.FastCipher r3) {
            r2 = this;
            long r0 = r2.getLong()
            if (r3 == 0) goto La
            long r0 = r3.decrypt(r0)
        La:
            return r0
    }

    public short getShort() {
            r4 = this;
            byte[] r0 = r4.hb
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 2
            r4.position = r1
            r0 = r0[r2]
            int r0 = r0 << 8
            r0 = r0 | r3
            short r0 = (short) r0
            return r0
    }

    public java.lang.String getString(int r5) {
            r4 = this;
            if (r5 >= 0) goto L4
            r5 = 0
            return r5
        L4:
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            r0 = 2048(0x800, float:2.87E-42)
            if (r5 <= r0) goto L19
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r4.hb
            int r2 = r4.position
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r1, r2, r5, r3)
            goto L21
        L19:
            byte[] r0 = r4.hb
            int r1 = r4.position
            java.lang.String r0 = r4.decodeStr(r0, r1, r5)
        L21:
            int r1 = r4.position
            int r1 = r1 + r5
            r4.position = r1
            return r0
    }

    public java.lang.String getString(io.fastkv.interfaces.FastCipher r4, int r5) {
            r3 = this;
            if (r4 == 0) goto L31
            if (r5 > 0) goto L5
            goto L31
        L5:
            byte[] r0 = r3.hb
            int r1 = r3.position
            int r2 = r1 + r5
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
            byte[] r4 = r4.decrypt(r0)
            if (r4 != 0) goto L17
            r4 = 0
            goto L2b
        L17:
            int r0 = r4.length
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 <= r1) goto L25
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r4, r1)
            r4 = r0
            goto L2b
        L25:
            r0 = 0
            int r1 = r4.length
            java.lang.String r4 = r3.decodeStr(r4, r0, r1)
        L2b:
            int r0 = r3.position
            int r0 = r0 + r5
            r3.position = r0
            return r4
        L31:
            java.lang.String r4 = r3.getString(r5)
            return r4
    }

    public int getVarint32() {
            r5 = this;
            byte[] r0 = r5.hb
            int r1 = r5.position
            int r2 = r1 + 1
            r5.position = r2
            r3 = r0[r1]
            int r4 = r3 >> 7
            if (r4 != 0) goto Lf
            return r3
        Lf:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r1 + 2
            r5.position = r4
            r2 = r0[r2]
            int r2 = r2 << 7
            r2 = r2 | r3
            int r3 = r2 >> 14
            if (r3 != 0) goto L1f
            return r2
        L1f:
            r2 = r2 & 16383(0x3fff, float:2.2957E-41)
            int r3 = r1 + 3
            r5.position = r3
            r4 = r0[r4]
            int r4 = r4 << 14
            r2 = r2 | r4
            int r4 = r2 >> 21
            if (r4 != 0) goto L2f
            return r2
        L2f:
            r4 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = r2 & r4
            int r4 = r1 + 4
            r5.position = r4
            r3 = r0[r3]
            int r3 = r3 << 21
            r2 = r2 | r3
            int r3 = r2 >> 28
            if (r3 != 0) goto L41
            return r2
        L41:
            r3 = 268435455(0xfffffff, float:2.5243547E-29)
            r2 = r2 & r3
            int r1 = r1 + 5
            r5.position = r1
            r0 = r0[r4]
            int r0 = r0 << 28
            r0 = r0 | r2
            return r0
    }

    public final void put(byte r4) {
            r3 = this;
            byte[] r0 = r3.hb
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0[r1] = r4
            return
    }

    public void putBytes(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            if (r0 <= 0) goto L10
            byte[] r1 = r4.hb
            int r2 = r4.position
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r2, r0)
            int r5 = r4.position
            int r5 = r5 + r0
            r4.position = r5
        L10:
            return
    }

    public void putInt(int r6) {
            r5 = this;
            byte[] r0 = r5.hb
            int r1 = r5.position
            int r2 = r1 + 1
            r5.position = r2
            byte r3 = (byte) r6
            r0[r1] = r3
            int r3 = r1 + 2
            r5.position = r3
            int r4 = r6 >> 8
            byte r4 = (byte) r4
            r0[r2] = r4
            int r2 = r1 + 3
            r5.position = r2
            int r4 = r6 >> 16
            byte r4 = (byte) r4
            r0[r3] = r4
            int r1 = r1 + 4
            r5.position = r1
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r0[r2] = r6
            return
    }

    public void putInt(int r5, int r6) {
            r4 = this;
            byte[] r0 = r4.hb
            int r1 = r5 + 1
            byte r2 = (byte) r6
            r0[r5] = r2
            int r2 = r5 + 2
            int r3 = r6 >> 8
            byte r3 = (byte) r3
            r0[r1] = r3
            int r5 = r5 + 3
            int r1 = r6 >> 16
            byte r1 = (byte) r1
            r0[r2] = r1
            int r6 = r6 >> 24
            byte r6 = (byte) r6
            r0[r5] = r6
            return
    }

    public void putLong(int r6, long r7) {
            r5 = this;
            byte[] r0 = r5.hb
            int r1 = r6 + 1
            int r2 = (int) r7
            byte r2 = (byte) r2
            r0[r6] = r2
            int r2 = r6 + 2
            r3 = 8
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r6 + 3
            r3 = 16
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r6 + 4
            r3 = 24
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r1 = r6 + 5
            r3 = 32
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r2] = r3
            int r2 = r6 + 6
            r3 = 40
            long r3 = r7 >> r3
            int r3 = (int) r3
            byte r3 = (byte) r3
            r0[r1] = r3
            int r6 = r6 + 7
            r1 = 48
            long r3 = r7 >> r1
            int r1 = (int) r3
            byte r1 = (byte) r1
            r0[r2] = r1
            r1 = 56
            long r7 = r7 >> r1
            int r7 = (int) r7
            byte r7 = (byte) r7
            r0[r6] = r7
            return
    }

    public void putLong(long r2) {
            r1 = this;
            int r0 = r1.position
            r1.putLong(r0, r2)
            int r2 = r1.position
            int r2 = r2 + 8
            r1.position = r2
            return
    }

    public void putShort(short r5) {
            r4 = this;
            byte[] r0 = r4.hb
            int r1 = r4.position
            int r2 = r1 + 1
            r4.position = r2
            byte r3 = (byte) r5
            r0[r1] = r3
            int r1 = r1 + 2
            r4.position = r1
            int r5 = r5 >> 8
            byte r5 = (byte) r5
            r0[r2] = r5
            return
    }

    public void putString(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lb
            r1.encodeStr(r2)
        Lb:
            return
    }

    public int putVarint32(int r4, int r5) {
            r3 = this;
        L0:
            r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
            if (r0 == 0) goto L13
            byte[] r0 = r3.hb
            int r1 = r4 + 1
            r2 = r5 & 127(0x7f, float:1.78E-43)
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r0[r4] = r2
            int r5 = r5 >>> 7
            r4 = r1
            goto L0
        L13:
            byte[] r0 = r3.hb
            int r1 = r4 + 1
            byte r5 = (byte) r5
            r0[r4] = r5
            return r1
    }

    public void putVarint32(int r2) {
            r1 = this;
            int r0 = r1.position
            int r2 = r1.putVarint32(r0, r2)
            r1.position = r2
            return
    }
}
