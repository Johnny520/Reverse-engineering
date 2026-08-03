package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class JSONReaderUTF8 extends com.alibaba.fastjson2.JSONReader {
    static final int REF = 0;
    protected byte[] byteBuf;
    protected final byte[] bytes;
    protected final com.alibaba.fastjson2.JSONFactory.CacheItem cacheItem;
    protected char[] charBuf;
    protected final int end;
    protected final java.io.InputStream in;
    protected final int length;
    protected boolean nameAscii;
    protected int nameBegin;
    protected int nameEnd;
    protected int nameLength;
    protected int referenceBegin;
    protected final int start;

    static {
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L8
            r0 = 611476838(0x24726566, float:5.2561273E-17)
            goto Lb
        L8:
            r0 = 1717924388(0x66657224, float:2.7088186E23)
        Lb:
            com.alibaba.fastjson2.JSONReaderUTF8.REF = r0
            return
    }

    public JSONReaderUTF8(com.alibaba.fastjson2.JSONReader.Context r6, java.io.InputStream r7) {
            r5 = this;
            r0 = 0
            r5.<init>(r6, r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r1 = java.lang.System.identityHashCode(r1)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r2.length
            int r3 = r3 + (-1)
            r1 = r1 & r3
            r1 = r2[r1]
            r5.cacheItem = r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r2 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r3 = 0
            java.lang.Object r1 = r2.getAndSet(r1, r3)
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L25
            int r1 = r6.bufferSize
            byte[] r1 = new byte[r1]
        L25:
            r2 = r0
        L26:
            int r3 = r1.length     // Catch: java.io.IOException -> L57
            int r3 = r3 - r2
            int r3 = r7.read(r1, r2, r3)     // Catch: java.io.IOException -> L57
            r4 = -1
            if (r3 != r4) goto L4a
            r5.byteBuf = r1
            r5.bytes = r1
            r5.offset = r0
            r5.length = r2
            r5.in = r7
            r5.start = r0
            r5.end = r2
            r5.next()
            char r6 = r5.f1814ch
            r7 = 47
            if (r6 != r7) goto L49
            r5.skipComment()
        L49:
            return
        L4a:
            int r2 = r2 + r3
            int r3 = r1.length     // Catch: java.io.IOException -> L57
            if (r2 != r3) goto L26
            int r3 = r1.length     // Catch: java.io.IOException -> L57
            int r4 = r6.bufferSize     // Catch: java.io.IOException -> L57
            int r3 = r3 + r4
            byte[] r1 = java.util.Arrays.copyOf(r1, r3)     // Catch: java.io.IOException -> L57
            goto L26
        L57:
            r6 = move-exception
            java.lang.String r7 = "read error"
            ah.a.x(r7, r6)
            r6 = 0
            throw r6
    }

    public JSONReaderUTF8(com.alibaba.fastjson2.JSONReader.Context r6, java.lang.String r7, byte[] r8, int r9, int r10) {
            r5 = this;
            r7 = 0
            r5.<init>(r6, r7)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            int r6 = java.lang.System.identityHashCode(r6)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r7 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r0 = r7.length
            int r0 = r0 + (-1)
            r6 = r6 & r0
            r6 = r7[r6]
            r5.cacheItem = r6
            r5.bytes = r8
            r5.length = r10
            r6 = 0
            r5.in = r6
            r5.start = r9
            int r10 = r10 + r9
            r5.end = r10
            r6 = 26
            if (r9 < r10) goto L29
            r7 = r9
        L27:
            r9 = r6
            goto L2d
        L29:
            int r7 = r9 + 1
            r9 = r8[r9]
        L2d:
            r10 = 32
            if (r9 > r10) goto L4d
            r0 = 1
            long r0 = r0 << r9
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r0 = r0 & r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r9 = r5.end
            if (r7 != r9) goto L45
            goto L27
        L45:
            int r9 = r7 + 1
            r7 = r8[r7]
            r4 = r9
            r9 = r7
            r7 = r4
            goto L2d
        L4d:
            if (r9 >= 0) goto L53
            r5.next()
            return
        L53:
            r5.offset = r7
            char r6 = (char) r9
            r5.f1814ch = r6
            r6 = 47
            if (r9 != r6) goto L5f
            r5.skipComment()
        L5f:
            return
    }

    public JSONReaderUTF8(com.alibaba.fastjson2.JSONReader.Context r7, java.nio.ByteBuffer r8) {
            r6 = this;
            r0 = 0
            r6.<init>(r7, r0)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            int r7 = java.lang.System.identityHashCode(r7)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            r7 = r7 & r2
            r7 = r1[r7]
            r6.cacheItem = r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r2 = 0
            java.lang.Object r7 = r1.getAndSet(r7, r2)
            byte[] r7 = (byte[]) r7
            int r1 = r8.remaining()
            if (r7 == 0) goto L28
            int r4 = r7.length
            if (r4 >= r1) goto L2a
        L28:
            byte[] r7 = new byte[r1]
        L2a:
            r8.get(r7, r0, r1)
            r6.byteBuf = r7
            r6.bytes = r7
            r6.length = r1
            r6.in = r2
            r6.start = r0
            r6.end = r1
            r8 = 26
            if (r1 > 0) goto L40
            r3 = r0
        L3e:
            r0 = r8
            goto L42
        L40:
            r0 = r7[r0]
        L42:
            r1 = 32
            if (r0 > r1) goto L61
            r1 = 1
            long r1 = r1 << r0
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r1 = r1 & r4
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L61
            int r0 = r6.end
            if (r3 != r0) goto L5a
            goto L3e
        L5a:
            int r0 = r3 + 1
            r1 = r7[r3]
            r3 = r0
            r0 = r1
            goto L42
        L61:
            if (r0 >= 0) goto L67
            r6.next()
            return
        L67:
            r6.offset = r3
            char r7 = (char) r0
            r6.f1814ch = r7
            r7 = 47
            if (r0 != r7) goto L73
            r6.skipComment()
        L73:
            return
    }

    public static int char2_utf8(int r2, int r3, int r4) {
            r0 = r3 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto Le
            r2 = r2 & 31
            int r2 = r2 << 6
            r3 = r3 & 63
            r2 = r2 | r3
            return r2
        Le:
            java.lang.String r2 = "malformed input around byte "
            java.lang.String r2 = eh.a.l(r4, r2)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static int char2_utf8(int r2, int r3, int r4, int r5) {
            r0 = r3 & 192(0xc0, float:2.69E-43)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 != r1) goto L17
            r0 = r4 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L17
            r2 = r2 & 15
            int r2 = r2 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r2 = r2 | r3
            r3 = r4 & 63
            r2 = r2 | r3
            return r2
        L17:
            java.lang.String r2 = "malformed input around byte "
            java.lang.String r2 = eh.a.l(r5, r2)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public static void char2_utf8(byte[] r4, int r5, int r6, char[] r7, int r8) {
            int r0 = r6 >> 3
            r1 = -2
            java.lang.String r2 = "malformed input around byte "
            if (r0 != r1) goto L53
            int r0 = r5 + 1
            r0 = r4[r0]
            int r1 = r5 + 2
            r1 = r4[r1]
            int r3 = r5 + 3
            r4 = r4[r3]
            int r6 = r6 << 18
            int r3 = r0 << 12
            r6 = r6 ^ r3
            int r3 = r1 << 6
            r6 = r6 ^ r3
            r3 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r4
            r6 = r6 ^ r3
            r0 = r0 & 192(0xc0, float:2.69E-43)
            r3 = 128(0x80, float:1.8E-43)
            if (r0 != r3) goto L4b
            r0 = r1 & 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L4b
            r4 = r4 & 192(0xc0, float:2.69E-43)
            if (r4 != r3) goto L4b
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r4) goto L4b
            r4 = 1114112(0x110000, float:1.561203E-39)
            if (r6 >= r4) goto L4b
            int r4 = r6 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            r7[r8] = r4
            int r8 = r8 + 1
            r4 = r6 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            r7[r8] = r4
            return
        L4b:
            java.lang.String r4 = eh.a.l(r5, r2)
            ah.a.w(r4)
            return
        L53:
            java.lang.String r4 = eh.a.l(r5, r2)
            ah.a.w(r4)
            return
    }

    private void char_utf8(int r6, int r7) {
            r5 = this;
            byte[] r0 = r5.bytes
            r1 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r1 >> 4
            switch(r2) {
                case 12: goto L3f;
                case 13: goto L3f;
                case 14: goto L32;
                default: goto L9;
            }
        L9:
            int r1 = r6 >> 3
            r2 = -2
            if (r1 != r2) goto L28
            r1 = r0[r7]
            int r2 = r7 + 1
            r2 = r0[r2]
            int r3 = r7 + 2
            r0 = r0[r3]
            int r6 = r6 << 18
            int r1 = r1 << 12
            r6 = r6 ^ r1
            int r1 = r2 << 6
            r6 = r6 ^ r1
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r0 = r0 ^ r1
            r6 = r6 ^ r0
            int r7 = r7 + 3
            goto L4a
        L28:
            java.lang.String r6 = "malformed input around byte "
            java.lang.String r6 = eh.a.l(r7, r6)
            ah.a.w(r6)
            return
        L32:
            r6 = r0[r7]
            int r2 = r7 + 1
            r0 = r0[r2]
            int r6 = char2_utf8(r1, r6, r0, r7)
            int r7 = r7 + 2
            goto L4a
        L3f:
            int r6 = r7 + 1
            r7 = r0[r7]
            int r7 = char2_utf8(r1, r7, r6)
            r4 = r7
            r7 = r6
            r6 = r4
        L4a:
            char r6 = (char) r6
            r5.f1814ch = r6
            r5.offset = r7
            return
    }

    private boolean isReference0(byte[] r15, int r16, int r17, int r18) {
            r14 = this;
            r0 = r17
            int r1 = r16 + 6
            r2 = r15[r1]
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 0
            if (r2 < 0) goto L25
            if (r2 > r9) goto L25
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L25
            int r1 = r1 + 1
            if (r1 < r0) goto L22
            return r10
        L22:
            r2 = r15[r1]
            goto L6
        L25:
            r11 = 58
            if (r2 != r11) goto L5d
            r2 = 1
            int r1 = r1 + r2
            if (r1 < r0) goto L2e
            goto L5d
        L2e:
            r11 = r15[r1]
        L30:
            if (r11 < 0) goto L43
            if (r11 > r9) goto L43
            long r12 = r7 << r11
            long r12 = r12 & r5
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L43
            int r1 = r1 + 1
            if (r1 < r0) goto L40
            return r10
        L40:
            r11 = r15[r1]
            goto L30
        L43:
            r3 = r18
            if (r11 != r3) goto L5d
            int r3 = r1 + 1
            if (r3 >= r0) goto L5a
            r15 = r15[r3]
            r0 = 36
            if (r15 == r0) goto L5a
            r0 = 46
            if (r15 == r0) goto L5a
            r0 = 64
            if (r15 == r0) goto L5a
            goto L5d
        L5a:
            r14.referenceBegin = r1
            return r2
        L5d:
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            com.alibaba.fastjson2.JSONFactory$CacheItem r0 = r4.cacheItem
            byte[] r1 = r4.byteBuf
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r1 == 0) goto L10
            int r3 = r1.length
            if (r3 >= r2) goto L10
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r3 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r3.lazySet(r0, r1)
        L10:
            char[] r1 = r4.charBuf
            if (r1 == 0) goto L1c
            int r3 = r1.length
            if (r3 >= r2) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r2 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r2.lazySet(r0, r1)
        L1c:
            java.io.InputStream r0 = r4.in
            if (r0 == 0) goto L23
            r0.close()     // Catch: java.io.IOException -> L23
        L23:
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
            r13 = this;
            byte[] r0 = r13.bytes
            int r1 = r13.nameEnd
            int r2 = r13.nameBegin
            int r1 = r1 - r2
            boolean r3 = r13.nameEscape
            if (r3 != 0) goto L1c
            boolean r3 = r13.nameAscii
            if (r3 == 0) goto L14
            java.lang.String r0 = r13.getLatin1String(r2, r1)
            return r0
        L14:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r2, r1, r4)
            return r3
        L1c:
            char[] r2 = r13.charBuf
            if (r2 != 0) goto L2d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r2 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r3 = r13.cacheItem
            r4 = 0
            java.lang.Object r2 = r2.getAndSet(r3, r4)
            char[] r2 = (char[]) r2
            r13.charBuf = r2
        L2d:
            if (r2 == 0) goto L32
            int r3 = r2.length
            if (r3 >= r1) goto L38
        L32:
            int r1 = r13.nameLength
            char[] r2 = new char[r1]
            r13.charBuf = r2
        L38:
            int r1 = r13.nameBegin
            r3 = 0
            r4 = r3
        L3c:
            int r5 = r13.nameEnd
            if (r1 >= r5) goto L105
            r5 = r0[r1]
            if (r5 >= 0) goto L9f
            r6 = r5 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> 4
            r7 = 128(0x80, float:1.8E-43)
            java.lang.String r8 = "malformed input around byte "
            switch(r6) {
                case 12: goto L80;
                case 13: goto L80;
                case 14: goto L58;
                default: goto L4f;
            }
        L4f:
            java.lang.String r0 = eh.a.l(r1, r8)
            ah.a.w(r0)
            r0 = 0
            return r0
        L58:
            int r6 = r1 + 1
            r6 = r0[r6]
            int r9 = r1 + 2
            r10 = r0[r9]
            r11 = r6 & 192(0xc0, float:2.69E-43)
            if (r11 != r7) goto L77
            r11 = r10 & 192(0xc0, float:2.69E-43)
            if (r11 != r7) goto L77
            r5 = r5 & 15
            int r5 = r5 << 12
            r6 = r6 & 63
            int r6 = r6 << 6
            r5 = r5 | r6
            r6 = r10 & 63
            r5 = r5 | r6
            int r1 = r1 + 3
            goto L91
        L77:
            java.lang.String r0 = eh.a.l(r9, r8)
            ah.a.w(r0)
            r0 = 0
            return r0
        L80:
            int r6 = r1 + 1
            r6 = r0[r6]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            if (r9 != r7) goto L96
            r5 = r5 & 31
            int r5 = r5 << 6
            r6 = r6 & 63
            r5 = r5 | r6
            int r1 = r1 + 2
        L91:
            char r5 = (char) r5
            r2[r4] = r5
            goto L101
        L96:
            java.lang.String r0 = eh.a.l(r1, r8)
            ah.a.w(r0)
            r0 = 0
            return r0
        L9f:
            r6 = 34
            r7 = 92
            if (r5 != r7) goto Lf9
            int r5 = r1 + 1
            r8 = r0[r5]
            char r8 = (char) r8
            if (r8 == r6) goto Lf6
            r6 = 58
            if (r8 == r6) goto Lf6
            r6 = 64
            if (r8 == r6) goto Lf6
            if (r8 == r7) goto Lf6
            r6 = 117(0x75, float:1.64E-43)
            if (r8 == r6) goto Le1
            r6 = 120(0x78, float:1.68E-43)
            if (r8 == r6) goto Ld4
            r1 = 42
            if (r8 == r1) goto Lf6
            r1 = 43
            if (r8 == r1) goto Lf6
            switch(r8) {
                case 45: goto Lf6;
                case 46: goto Lf6;
                case 47: goto Lf6;
                default: goto Lc9;
            }
        Lc9:
            switch(r8) {
                case 60: goto Lf6;
                case 61: goto Lf6;
                case 62: goto Lf6;
                default: goto Lcc;
            }
        Lcc:
            char r1 = r13.char1(r8)
            r12 = r5
            r5 = r1
            r1 = r12
            goto Lfc
        Ld4:
            int r5 = r1 + 2
            r5 = r0[r5]
            int r1 = r1 + 3
            r6 = r0[r1]
            char r5 = com.alibaba.fastjson2.JSONReader.char2(r5, r6)
            goto Lfc
        Le1:
            int r5 = r1 + 2
            r5 = r0[r5]
            int r6 = r1 + 3
            r6 = r0[r6]
            int r7 = r1 + 4
            r7 = r0[r7]
            int r1 = r1 + 5
            r8 = r0[r1]
            char r5 = com.alibaba.fastjson2.JSONReader.char4(r5, r6, r7, r8)
            goto Lfc
        Lf6:
            r1 = r5
            r5 = r8
            goto Lfc
        Lf9:
            if (r5 != r6) goto Lfc
            goto L105
        Lfc:
            char r5 = (char) r5
            r2[r4] = r5
            int r1 = r1 + 1
        L101:
            int r4 = r4 + 1
            goto L3c
        L105:
            java.lang.String r0 = new java.lang.String
            int r1 = r13.nameLength
            r0.<init>(r2, r3, r1)
            return r0
    }

    public final java.lang.String getLatin1String(int r6, int r7) {
            r5 = this;
            int r0 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r1 = 34
            if (r0 < r1) goto L10
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r5.bytes
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            r0.<init>(r1, r6, r7, r2)
            return r0
        L10:
            char[] r0 = r5.charBuf
            if (r0 != 0) goto L21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r0 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r1 = r5.cacheItem
            r2 = 0
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            char[] r0 = (char[]) r0
            r5.charBuf = r0
        L21:
            if (r0 == 0) goto L26
            int r1 = r0.length
            if (r1 >= r7) goto L2a
        L26:
            char[] r0 = new char[r7]
            r5.charBuf = r0
        L2a:
            r1 = 0
            r2 = r1
        L2c:
            if (r2 >= r7) goto L3c
            byte[] r3 = r5.bytes
            int r4 = r6 + r2
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            r0[r2] = r3
            int r2 = r2 + 1
            goto L2c
        L3c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1, r7)
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
            r20 = this;
            r0 = r20
            int r1 = r0.nameBegin
            byte[] r2 = r0.bytes
            r3 = 39
            r4 = 34
            if (r1 <= 0) goto L14
            int r5 = r1 + (-1)
            r5 = r2[r5]
            if (r5 != r3) goto L14
            r5 = r3
            goto L15
        L14:
            r5 = r4
        L15:
            r8 = 0
            r9 = 0
        L18:
            int r11 = r0.end
            r12 = 120(0x78, float:1.68E-43)
            r13 = 117(0x75, float:1.64E-43)
            r14 = 92
            r16 = 0
            r7 = 45
            r15 = 95
            r6 = 32
            if (r1 >= r11) goto Lfb
            r11 = r2[r1]
            if (r11 != r14) goto L62
            int r11 = r1 + 1
            r14 = r2[r11]
            if (r14 == r13) goto L4d
            if (r14 == r12) goto L40
            char r1 = r0.char1(r14)
            r19 = r11
            r11 = r1
            r1 = r19
            goto L7a
        L40:
            int r11 = r1 + 2
            r11 = r2[r11]
            int r1 = r1 + 3
            r14 = r2[r1]
            char r11 = com.alibaba.fastjson2.JSONReader.char2(r11, r14)
            goto L7a
        L4d:
            int r11 = r1 + 2
            r11 = r2[r11]
            int r14 = r1 + 3
            r14 = r2[r14]
            int r18 = r1 + 4
            r12 = r2[r18]
            int r1 = r1 + 5
            r13 = r2[r1]
            char r11 = com.alibaba.fastjson2.JSONReader.char4(r11, r14, r12, r13)
            goto L7a
        L62:
            r12 = -61
            if (r11 == r12) goto L6f
            r12 = -62
            if (r11 != r12) goto L6b
            goto L6f
        L6b:
            if (r11 != r5) goto L7a
            goto Lfb
        L6f:
            r11 = r11 & 31
            int r11 = r11 << 6
            int r1 = r1 + 1
            r12 = r2[r1]
            r12 = r12 & 63
            r11 = r11 | r12
        L7a:
            r12 = 8
            if (r8 >= r12) goto Lf7
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r13) goto Lf7
            if (r11 < 0) goto Lf7
            if (r8 != 0) goto L8a
            if (r11 != 0) goto L8a
            goto Lf7
        L8a:
            if (r11 == r15) goto L94
            if (r11 == r7) goto L94
            if (r11 != r6) goto L91
            goto L94
        L91:
            r7 = 65
            goto L9f
        L94:
            int r7 = r1 + 1
            r7 = r2[r7]
            if (r7 == r4) goto L91
            if (r7 == r3) goto L91
            if (r7 == r11) goto L91
            goto Lf3
        L9f:
            if (r11 < r7) goto La8
            r7 = 90
            if (r11 > r7) goto La8
            int r11 = r11 + 32
            char r11 = (char) r11
        La8:
            switch(r8) {
                case 0: goto Lef;
                case 1: goto Le9;
                case 2: goto Le1;
                case 3: goto Ld9;
                case 4: goto Lcf;
                case 5: goto Lc4;
                case 6: goto Lb9;
                case 7: goto Lac;
                default: goto Lab;
            }
        Lab:
            goto Lf1
        Lac:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 56
            long r6 = r6 << r11
            r11 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        Lb6:
            long r9 = r9 & r11
            long r9 = r9 + r6
            goto Lf1
        Lb9:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 48
            long r6 = r6 << r11
            r11 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto Lb6
        Lc4:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 40
            long r6 = r6 << r11
            r11 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto Lb6
        Lcf:
            byte r7 = (byte) r11
            long r11 = (long) r7
            long r6 = r11 << r6
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lb6
        Ld9:
            byte r6 = (byte) r11
            int r6 = r6 << 24
            long r6 = (long) r6
            r11 = 16777215(0xffffff, double:8.2890456E-317)
            goto Lb6
        Le1:
            byte r6 = (byte) r11
            int r6 = r6 << 16
            long r6 = (long) r6
            r11 = 65535(0xffff, double:3.23786E-319)
            goto Lb6
        Le9:
            byte r6 = (byte) r11
            int r6 = r6 << r12
            long r6 = (long) r6
            r11 = 255(0xff, double:1.26E-321)
            goto Lb6
        Lef:
            byte r6 = (byte) r11
            long r9 = (long) r6
        Lf1:
            int r8 = r8 + 1
        Lf3:
            int r1 = r1 + 1
            goto L18
        Lf7:
            int r1 = r0.nameBegin
            r9 = r16
        Lfb:
            int r8 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r8 == 0) goto L100
            return r9
        L100:
            boolean r8 = r0.nameAscii
            r9 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            r11 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            if (r8 == 0) goto L13c
            boolean r8 = r0.nameEscape
            if (r8 != 0) goto L13c
            int r1 = r0.nameBegin
        L114:
            int r5 = r0.nameEnd
            if (r1 >= r5) goto L13b
            r5 = r2[r1]
            r8 = 65
            if (r5 < r8) goto L124
            r8 = 90
            if (r5 > r8) goto L124
            int r5 = r5 + 32
        L124:
            if (r5 == r15) goto L12a
            if (r5 == r7) goto L12a
            if (r5 != r6) goto L135
        L12a:
            int r8 = r1 + 1
            r8 = r2[r8]
            if (r8 == r4) goto L135
            if (r8 == r3) goto L135
            if (r8 == r5) goto L135
            goto L138
        L135:
            long r13 = (long) r5
            long r11 = r11 ^ r13
            long r11 = r11 * r9
        L138:
            int r1 = r1 + 1
            goto L114
        L13b:
            return r11
        L13c:
            r3 = r2[r1]
            r4 = 92
            if (r3 != r4) goto L18b
            int r3 = r1 + 1
            r8 = r2[r3]
            r13 = 117(0x75, float:1.64E-43)
            if (r8 == r13) goto L167
            r14 = 120(0x78, float:1.68E-43)
            if (r8 == r14) goto L155
            char r1 = r0.char1(r8)
        L152:
            r16 = r9
            goto L184
        L155:
            int r3 = r1 + 2
            r3 = r2[r3]
            int r1 = r1 + 3
            r8 = r2[r1]
            char r3 = com.alibaba.fastjson2.JSONReader.char2(r3, r8)
            r16 = r3
            r3 = r1
            r1 = r16
            goto L152
        L167:
            r14 = 120(0x78, float:1.68E-43)
            int r3 = r1 + 2
            r3 = r2[r3]
            int r8 = r1 + 3
            r8 = r2[r8]
            int r16 = r1 + 4
            r4 = r2[r16]
            int r1 = r1 + 5
            r16 = r9
            r9 = r2[r1]
            char r3 = com.alibaba.fastjson2.JSONReader.char4(r3, r8, r4, r9)
            r19 = r3
            r3 = r1
            r1 = r19
        L184:
            int r3 = r3 + 1
            r4 = 90
            r8 = 65
            goto L1e4
        L18b:
            r16 = r9
            r13 = 117(0x75, float:1.64E-43)
            r14 = 120(0x78, float:1.68E-43)
            if (r3 != r5) goto L194
            return r11
        L194:
            if (r3 < 0) goto L1a8
            r8 = 65
            r4 = 90
            if (r3 < r8) goto L1a0
            if (r3 > r4) goto L1a0
            int r3 = r3 + 32
        L1a0:
            int r1 = r1 + 1
        L1a2:
            r19 = r3
            r3 = r1
            r1 = r19
            goto L1e4
        L1a8:
            r4 = 90
            r8 = 65
            r9 = r3 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 4
            switch(r9) {
                case 12: goto L1d6;
                case 13: goto L1d6;
                case 14: goto L1bf;
                default: goto L1b3;
            }
        L1b3:
            java.lang.String r2 = "malformed input around byte "
            java.lang.String r1 = eh.a.l(r1, r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L1bf:
            int r9 = r1 + 1
            r9 = r2[r9]
            int r10 = r1 + 2
            r10 = r2[r10]
            r3 = r3 & 15
            int r3 = r3 << 12
            r9 = r9 & 63
            int r9 = r9 << 6
            r3 = r3 | r9
            r9 = r10 & 63
            r3 = r3 | r9
            int r1 = r1 + 3
            goto L1a2
        L1d6:
            int r9 = r1 + 1
            r9 = r2[r9]
            r3 = r3 & 31
            int r3 = r3 << 6
            r9 = r9 & 63
            r3 = r3 | r9
            int r1 = r1 + 2
            goto L1a2
        L1e4:
            if (r1 == r15) goto L1ef
            if (r1 == r7) goto L1ef
            if (r1 != r6) goto L1eb
            goto L1ef
        L1eb:
            long r9 = (long) r1
            long r9 = r9 ^ r11
            long r11 = r9 * r16
        L1ef:
            r1 = r3
            r9 = r16
            goto L13c
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
            r7 = this;
            int r0 = r7.offset
            int r1 = r0 + 3
            byte[] r2 = r7.bytes
            int r3 = r2.length
            if (r1 >= r3) goto L17
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r3 = r3 + r5
            r5 = 1
            long r3 = r3 - r5
            int r0 = r1.getInt(r2, r3)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
            r7 = this;
            int r0 = r7.offset
            int r1 = r0 + 8
            byte[] r2 = r7.bytes
            int r3 = r2.length
            if (r1 >= r3) goto L17
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r3 = r3 + r5
            r5 = 1
            long r3 = r3 - r5
            long r0 = r1.getLong(r2, r3)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String getString() {
            r12 = this;
            java.lang.String r0 = r12.stringValue
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[] r0 = r12.bytes
            int r1 = r12.nameBegin
            int r2 = r12.nameEnd
            int r2 = r2 - r1
            boolean r3 = r12.nameEscape
            if (r3 != 0) goto L21
            boolean r3 = r12.nameAscii
            if (r3 == 0) goto L19
            java.lang.String r0 = r12.getLatin1String(r1, r2)
            return r0
        L19:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r0, r1, r2, r4)
            return r3
        L21:
            int r2 = r12.nameLength
            char[] r2 = new char[r2]
            r3 = 0
        L26:
            r4 = r0[r1]
            if (r4 >= 0) goto Ld2
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 >> 4
            java.lang.String r7 = "malformed input around byte "
            r8 = 128(0x80, float:1.8E-43)
            switch(r6) {
                case 12: goto Lb4;
                case 13: goto Lb4;
                case 14: goto L8c;
                default: goto L35;
            }
        L35:
            int r6 = r4 >> 3
            r9 = -2
            if (r6 != r9) goto L89
            int r5 = r1 + 1
            r5 = r0[r5]
            int r6 = r1 + 2
            r6 = r0[r6]
            int r9 = r1 + 3
            r9 = r0[r9]
            int r1 = r1 + 4
            int r4 = r4 << 18
            int r10 = r5 << 12
            r4 = r4 ^ r10
            int r10 = r6 << 6
            r4 = r4 ^ r10
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r10 = r10 ^ r9
            r4 = r4 ^ r10
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r8) goto L80
            r5 = r6 & 192(0xc0, float:2.69E-43)
            if (r5 != r8) goto L80
            r5 = r9 & 192(0xc0, float:2.69E-43)
            if (r5 != r8) goto L80
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 < r5) goto L80
            r5 = 1114112(0x110000, float:1.561203E-39)
            if (r4 >= r5) goto L80
            int r5 = r3 + 1
            int r6 = r4 >>> 10
            r7 = 55232(0xd7c0, float:7.7397E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            r2[r3] = r6
            r3 = r4 & 1023(0x3ff, float:1.434E-42)
            r4 = 56320(0xdc00, float:7.8921E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r2[r5] = r3
            r3 = r5
            goto L125
        L80:
            java.lang.String r0 = eh.a.l(r1, r7)
            ah.a.w(r0)
            r0 = 0
            return r0
        L89:
            int r1 = r1 + 1
            goto Lc5
        L8c:
            int r5 = r1 + 1
            r5 = r0[r5]
            int r6 = r1 + 2
            r9 = r0[r6]
            r10 = r5 & 192(0xc0, float:2.69E-43)
            if (r10 != r8) goto Lab
            r10 = r9 & 192(0xc0, float:2.69E-43)
            if (r10 != r8) goto Lab
            r4 = r4 & 15
            int r4 = r4 << 12
            r5 = r5 & 63
            int r5 = r5 << 6
            r4 = r4 | r5
            r5 = r9 & 63
            r5 = r5 | r4
            int r1 = r1 + 3
            goto Lc5
        Lab:
            java.lang.String r0 = eh.a.l(r6, r7)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lb4:
            int r5 = r1 + 1
            r5 = r0[r5]
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto Lc9
            r4 = r4 & 31
            int r4 = r4 << 6
            r5 = r5 & 63
            r5 = r5 | r4
            int r1 = r1 + 2
        Lc5:
            char r4 = (char) r5
            r2[r3] = r4
            goto L125
        Lc9:
            java.lang.String r0 = eh.a.l(r1, r7)
            ah.a.w(r0)
            r0 = 0
            return r0
        Ld2:
            r5 = 34
            r6 = 92
            if (r4 != r6) goto L116
            int r4 = r1 + 1
            r7 = r0[r4]
            char r7 = (char) r7
            if (r7 == r5) goto L113
            if (r7 == r6) goto L113
            r5 = 117(0x75, float:1.64E-43)
            if (r7 == r5) goto Lfe
            r5 = 120(0x78, float:1.68E-43)
            if (r7 == r5) goto Lf1
            char r1 = r12.char1(r7)
            r11 = r4
            r4 = r1
            r1 = r11
            goto L120
        Lf1:
            int r4 = r1 + 2
            r4 = r0[r4]
            int r1 = r1 + 3
            r5 = r0[r1]
            char r4 = com.alibaba.fastjson2.JSONReader.char2(r4, r5)
            goto L120
        Lfe:
            int r4 = r1 + 2
            r4 = r0[r4]
            int r5 = r1 + 3
            r5 = r0[r5]
            int r6 = r1 + 4
            r6 = r0[r6]
            int r1 = r1 + 5
            r7 = r0[r1]
            char r4 = com.alibaba.fastjson2.JSONReader.char4(r4, r5, r6, r7)
            goto L120
        L113:
            r1 = r4
            r4 = r7
            goto L120
        L116:
            if (r4 != r5) goto L120
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r12.stringValue = r0
            return r0
        L120:
            char r4 = (char) r4
            r2[r3] = r4
            int r1 = r1 + 1
        L125:
            int r3 = r3 + 1
            goto L26
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
            r6 = this;
            char r0 = r6.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
        L12:
            int r1 = r6.offset
            byte[] r2 = r6.bytes
            int r3 = r1 + 8
            int r4 = r6.end
            if (r3 >= r4) goto L53
            int r4 = r2.length
            if (r3 >= r4) goto L53
            r4 = r2[r1]
            if (r4 == r0) goto L53
            int r4 = r1 + 1
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 2
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 3
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 4
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 5
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 6
            r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 7
            r4 = r2[r4]
            if (r4 == r0) goto L53
            r1 = 8
            r5 = r3
            r3 = r1
            r1 = r5
            goto L54
        L53:
            r3 = 0
        L54:
            int r4 = r6.end
            if (r1 >= r4) goto L62
            r4 = r2[r1]
            if (r4 != r0) goto L5d
            goto L62
        L5d:
            int r1 = r1 + 1
            int r3 = r3 + 1
            goto L54
        L62:
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String info(java.lang.String r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r6.offset
            r5 = 10
            if (r1 >= r4) goto L1b
            int r4 = r6.end
            if (r1 >= r4) goto L1b
            byte[] r4 = r6.bytes
            r4 = r4[r1]
            if (r4 != r5) goto L17
            int r3 = r3 + 1
            r2 = r0
        L17:
            int r1 = r1 + 1
            int r2 = r2 + r0
            goto L4
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r7 == 0) goto L30
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L30
            r1.append(r7)
            java.lang.String r7 = ", "
            r1.append(r7)
        L30:
            java.lang.String r7 = "offset "
            r1.append(r7)
            int r7 = r6.offset
            r1.append(r7)
            java.lang.String r7 = ", character "
            r1.append(r7)
            char r7 = r6.f1814ch
            r1.append(r7)
            java.lang.String r7 = ", line "
            r1.append(r7)
            r1.append(r3)
            java.lang.String r7 = ", column "
            r1.append(r7)
            r1.append(r2)
            java.lang.String r7 = ", fastjson-version 2.0.60"
            r1.append(r7)
            if (r3 <= r0) goto L5c
            goto L5e
        L5c:
            r5 = 32
        L5e:
            r1.append(r5)
            java.lang.String r7 = new java.lang.String
            byte[] r0 = r6.bytes
            int r2 = r6.start
            int r3 = r6.length
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r3 >= r4) goto L6f
            goto L70
        L6f:
            r3 = r4
        L70:
            r7.<init>(r0, r2, r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            return r7
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isArray() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 91
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isNull() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L16
            int r0 = r2.offset
            int r1 = r2.end
            if (r0 >= r1) goto L16
            byte[] r1 = r2.bytes
            r0 = r1[r0]
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean isReference() {
            r14 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r14.context
            long r0 = r0.features
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            byte[] r0 = r14.bytes
            char r4 = r14.f1814ch
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L1b
            return r1
        L1b:
            int r4 = r14.offset
            int r5 = r14.end
            if (r4 != r5) goto L22
            return r1
        L22:
            r6 = r0[r4]
        L24:
            r7 = 32
            r8 = 1
            if (r6 > r7) goto L3e
            long r10 = r8 << r6
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r10 = r10 & r12
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L3e
            int r4 = r4 + 1
            if (r4 < r5) goto L3b
            return r1
        L3b:
            r6 = r0[r4]
            goto L24
        L3e:
            int r2 = r4 + 6
            if (r2 >= r5) goto L5d
            int r2 = r4 + 5
            r2 = r0[r2]
            if (r2 != r6) goto L5d
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r12 = (long) r4
            long r10 = r10 + r12
            long r10 = r10 + r8
            int r2 = r2.getInt(r0, r10)
            int r3 = com.alibaba.fastjson2.JSONReaderUTF8.REF
            if (r2 == r3) goto L58
            goto L5d
        L58:
            boolean r0 = r14.isReference0(r0, r4, r5, r6)
            return r0
        L5d:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.f1814ch = r0
            r0 = 47
            if (r1 != r0) goto L43
            r9.skipComment()
        L43:
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r4 = 93
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.end
            r4 = 26
            if (r3 != r1) goto L17
            r1 = r3
        L15:
            r3 = r4
            goto L1b
        L17:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L3e
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r3 = r0.end
            if (r1 != r3) goto L34
            goto L15
        L34:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L69
            r0.comma = r13
            int r3 = r0.end
            if (r1 != r3) goto L4c
            r3 = r1
            r1 = r4
            goto L50
        L4c:
            int r3 = r1 + 1
            r1 = r2[r1]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r3 > r11) goto L69
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r3 = r0.end
            if (r1 != r3) goto L64
            r3 = r4
            goto L55
        L64:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L50
        L69:
            if (r3 >= 0) goto L6f
            r0.char_utf8(r3, r1)
            return r13
        L6f:
            char r2 = (char) r3
            r0.f1814ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayStart() {
            r9 = this;
            char r0 = r9.f1814ch
            r1 = 91
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.f1814ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.f1814ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            r11 = 44
            if (r2 == r11) goto L35
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 0
            return r0
        L35:
            int r2 = r14.end
            if (r1 != r2) goto L3c
            r2 = r1
        L3a:
            r1 = r10
            goto L40
        L3c:
            int r2 = r1 + 1
            r1 = r0[r1]
        L40:
            if (r1 > r9) goto L56
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L56
            int r1 = r14.end
            if (r2 != r1) goto L4e
            goto L3a
        L4e:
            int r1 = r2 + 1
            r2 = r0[r2]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L40
        L56:
            r0 = 1
            if (r1 >= 0) goto L5d
            r14.char_utf8(r1, r2)
            return r0
        L5d:
            r14.offset = r2
            char r2 = (char) r1
            r14.f1814ch = r2
            r2 = 47
            if (r1 != r2) goto L69
            r14.skipComment()
        L69:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfInfinity() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f1814ch
            r3 = 73
            if (r2 != r3) goto L74
            int r2 = r1 + 6
            int r3 = r10.end
            if (r2 >= r3) goto L74
            r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L74
            int r4 = r1 + 1
            r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 2
            r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L74
            int r4 = r1 + 3
            r4 = r0[r4]
            if (r4 != r5) goto L74
            int r4 = r1 + 4
            r4 = r0[r4]
            if (r4 != r6) goto L74
            int r4 = r1 + 5
            r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L74
            r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L74
            int r2 = r1 + 7
            r4 = 26
            if (r2 != r3) goto L49
            r1 = r2
        L47:
            r2 = r4
            goto L4d
        L49:
            int r1 = r1 + 8
            r2 = r0[r2]
        L4d:
            r3 = 32
            if (r2 > r3) goto L6d
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L6d
            int r2 = r10.end
            if (r1 != r2) goto L65
            goto L47
        L65:
            int r2 = r1 + 1
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L4d
        L6d:
            r10.offset = r1
            char r0 = (char) r2
            r10.f1814ch = r0
            r0 = 1
            return r0
        L74:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char r15) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            char r2 = r14.f1814ch
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 26
            if (r2 > r9) goto L2a
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L2a
            int r2 = r14.end
            if (r1 != r2) goto L22
            r2 = r10
            goto L6
        L22:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            if (r2 == r15) goto L2e
            r15 = 0
            return r15
        L2e:
            int r15 = r14.end
            if (r1 != r15) goto L35
            r15 = r1
        L33:
            r1 = r10
            goto L39
        L35:
            int r15 = r1 + 1
            r1 = r0[r1]
        L39:
            if (r1 > r9) goto L4f
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 == 0) goto L4f
            int r1 = r14.end
            if (r15 != r1) goto L47
            goto L33
        L47:
            int r1 = r15 + 1
            r15 = r0[r15]
            r13 = r1
            r1 = r15
            r15 = r13
            goto L39
        L4f:
            r0 = 1
            if (r1 >= 0) goto L56
            r14.char_utf8(r1, r15)
            return r0
        L56:
            r14.offset = r15
            char r15 = (char) r1
            r14.f1814ch = r15
            r15 = 47
            if (r1 != r15) goto L62
            r14.skipComment()
        L62:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r8, char r9, char r10) {
            r7 = this;
            char r0 = r7.f1814ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 2
            int r3 = r7.end
            if (r2 > r3) goto L6d
            r4 = r8[r0]
            if (r4 != r9) goto L6d
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 == r10) goto L1b
            goto L6d
        L1b:
            r9 = 26
            if (r2 != r3) goto L21
        L1f:
            r10 = r9
            goto L26
        L21:
            int r0 = r0 + 3
            r10 = r8[r2]
            r2 = r0
        L26:
            r0 = 32
            if (r10 > r0) goto L45
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L45
            int r10 = r7.end
            if (r2 != r10) goto L3e
            goto L1f
        L3e:
            int r10 = r2 + 1
            r0 = r8[r2]
            r2 = r10
            r10 = r0
            goto L26
        L45:
            int r8 = r7.offset
            int r8 = r8 + 3
            if (r2 != r8) goto L66
            if (r10 == r9) goto L66
            r8 = 40
            if (r10 == r8) goto L66
            r8 = 91
            if (r10 == r8) goto L66
            r8 = 93
            if (r10 == r8) goto L66
            r8 = 41
            if (r10 == r8) goto L66
            r8 = 58
            if (r10 == r8) goto L66
            r8 = 44
            if (r10 == r8) goto L66
            return r1
        L66:
            r7.offset = r2
            char r8 = (char) r10
            r7.f1814ch = r8
            r8 = 1
            return r8
        L6d:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r8, char r9, char r10, char r11) {
            r7 = this;
            char r0 = r7.f1814ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            byte[] r8 = r7.bytes
            int r0 = r7.offset
            int r2 = r0 + 3
            int r3 = r7.end
            if (r2 > r3) goto L73
            r4 = r8[r0]
            if (r4 != r9) goto L73
            int r9 = r0 + 1
            r9 = r8[r9]
            if (r9 != r10) goto L73
            int r9 = r0 + 2
            r9 = r8[r9]
            if (r9 == r11) goto L21
            goto L73
        L21:
            r9 = 26
            if (r2 != r3) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r0 = r0 + 4
            r10 = r8[r2]
            r2 = r0
        L2c:
            r11 = 32
            if (r10 > r11) goto L4b
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r10 = r7.end
            if (r2 != r10) goto L44
            goto L25
        L44:
            int r10 = r2 + 1
            r11 = r8[r2]
            r2 = r10
            r10 = r11
            goto L2c
        L4b:
            int r8 = r7.offset
            int r8 = r8 + 4
            if (r2 != r8) goto L6c
            if (r10 == r9) goto L6c
            r8 = 40
            if (r10 == r8) goto L6c
            r8 = 91
            if (r10 == r8) goto L6c
            r8 = 93
            if (r10 == r8) goto L6c
            r8 = 41
            if (r10 == r8) goto L6c
            r8 = 58
            if (r10 == r8) goto L6c
            r8 = 44
            if (r10 == r8) goto L6c
            return r1
        L6c:
            r7.offset = r2
            char r8 = (char) r10
            r7.f1814ch = r8
            r8 = 1
            return r8
        L73:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10) {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 4
            int r3 = r5.end
            if (r2 > r3) goto L79
            r4 = r6[r0]
            if (r4 != r7) goto L79
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L79
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L79
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 == r10) goto L27
            goto L79
        L27:
            r7 = 26
            if (r2 != r3) goto L2d
        L2b:
            r8 = r7
            goto L32
        L2d:
            int r0 = r0 + 5
            r8 = r6[r2]
            r2 = r0
        L32:
            r9 = 32
            if (r8 > r9) goto L51
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L51
            int r8 = r5.end
            if (r2 != r8) goto L4a
            goto L2b
        L4a:
            int r8 = r2 + 1
            r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L32
        L51:
            int r6 = r5.offset
            int r6 = r6 + 5
            if (r2 != r6) goto L72
            if (r8 == r7) goto L72
            r6 = 40
            if (r8 == r6) goto L72
            r6 = 91
            if (r8 == r6) goto L72
            r6 = 93
            if (r8 == r6) goto L72
            r6 = 41
            if (r8 == r6) goto L72
            r6 = 58
            if (r8 == r6) goto L72
            r6 = 44
            if (r8 == r6) goto L72
            return r1
        L72:
            r5.offset = r2
            char r6 = (char) r8
            r5.f1814ch = r6
            r6 = 1
            return r6
        L79:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r2 = r0 + 5
            int r3 = r5.end
            if (r2 > r3) goto L7f
            r4 = r6[r0]
            if (r4 != r7) goto L7f
            int r7 = r0 + 1
            r7 = r6[r7]
            if (r7 != r8) goto L7f
            int r7 = r0 + 2
            r7 = r6[r7]
            if (r7 != r9) goto L7f
            int r7 = r0 + 3
            r7 = r6[r7]
            if (r7 != r10) goto L7f
            int r7 = r0 + 4
            r7 = r6[r7]
            if (r7 == r11) goto L2d
            goto L7f
        L2d:
            r7 = 26
            if (r2 != r3) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r0 = r0 + 6
            r8 = r6[r2]
            r2 = r0
        L38:
            r9 = 32
            if (r8 > r9) goto L57
            r9 = 1
            long r9 = r9 << r8
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r3
            r3 = 0
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto L57
            int r8 = r5.end
            if (r2 != r8) goto L50
            goto L31
        L50:
            int r8 = r2 + 1
            r9 = r6[r2]
            r2 = r8
            r8 = r9
            goto L38
        L57:
            int r6 = r5.offset
            int r6 = r6 + 6
            if (r2 != r6) goto L78
            if (r8 == r7) goto L78
            r6 = 40
            if (r8 == r6) goto L78
            r6 = 91
            if (r8 == r6) goto L78
            r6 = 93
            if (r8 == r6) goto L78
            r6 = 41
            if (r8 == r6) goto L78
            r6 = 58
            if (r8 == r6) goto L78
            r6 = 44
            if (r8 == r6) goto L78
            return r1
        L78:
            r5.offset = r2
            char r6 = (char) r8
            r5.f1814ch = r6
            r6 = 1
            return r6
        L7f:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 12
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L4f
            int r10 = r1 + 11
            r10 = r0[r10]
            r11 = 58
            if (r10 == r11) goto L26
            goto L4f
        L26:
            int r1 = r1 + 13
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L2c:
            r11 = 32
            if (r10 > r11) goto L48
            r2 = 1
            long r2 = r2 << r10
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L48
            int r10 = r1 + 1
            r11 = r0[r1]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r1 = r10
            r10 = r11
            goto L2c
        L48:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L4f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 13
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 10
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L57
            int r10 = r1 + 11
            r10 = r0[r10]
            r11 = 34
            if (r10 != r11) goto L57
            int r10 = r1 + 12
            r10 = r0[r10]
            r11 = 58
            if (r10 == r11) goto L2e
            goto L57
        L2e:
            int r1 = r1 + 14
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L34:
            r11 = 32
            if (r10 > r11) goto L50
            r2 = 1
            long r2 = r2 << r10
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L50
            int r10 = r1 + 1
            r11 = r0[r1]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r1 = r10
            r10 = r11
            goto L34
        L50:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L57:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long r10, byte r12) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 14
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 11
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L5d
            int r10 = r1 + 11
            r10 = r0[r10]
            if (r10 != r12) goto L5d
            int r10 = r1 + 12
            r10 = r0[r10]
            r11 = 34
            if (r10 != r11) goto L5d
            int r10 = r1 + 13
            r10 = r0[r10]
            r11 = 58
            if (r10 == r11) goto L34
            goto L5d
        L34:
            int r1 = r1 + 15
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L3a:
            r11 = 32
            if (r10 > r11) goto L56
            r11 = 1
            long r11 = r11 << r10
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r11 = r11 & r2
            r2 = 0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L56
            int r10 = r1 + 1
            r11 = r0[r1]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r1 = r10
            r10 = r11
            goto L3a
        L56:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L5d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long r15, int r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 15
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 12
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L55
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r17
            if (r3 == r5) goto L2b
            goto L55
        L2b:
            int r1 = r1 + 16
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L31:
            r3 = 32
            if (r2 > r3) goto L4e
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L4e
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L31
        L4e:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L55:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long r15, int r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 16
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 13
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L5d
            long r5 = r5 + r7
            r7 = 5
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r17
            if (r3 != r5) goto L5d
            int r3 = r1 + 15
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L33
            goto L5d
        L33:
            int r1 = r1 + 17
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L39:
            r3 = 32
            if (r2 > r3) goto L56
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L56
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L39
        L56:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L5d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long r15, int r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 17
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 14
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L65
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r17
            if (r3 != r5) goto L65
            int r3 = r1 + 15
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L65
            int r3 = r1 + 16
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L3b
            goto L65
        L3b:
            int r1 = r1 + 18
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L41:
            r3 = 32
            if (r2 > r3) goto L5e
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5e
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L41
        L5e:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L65:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long r15, int r17, byte r18) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 18
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 15
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6d
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r17
            if (r3 != r5) goto L6d
            int r3 = r1 + 15
            r3 = r0[r3]
            r5 = r18
            if (r3 != r5) goto L6d
            int r3 = r1 + 16
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L6d
            int r3 = r1 + 17
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L43
            goto L6d
        L43:
            int r1 = r1 + 19
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L49:
            r3 = 32
            if (r2 > r3) goto L66
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L66
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L49
        L66:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long r15, long r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 19
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 16
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L55
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 == 0) goto L2b
            goto L55
        L2b:
            int r1 = r1 + 20
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L31:
            r3 = 32
            if (r2 > r3) goto L4e
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L4e
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L31
        L4e:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L55:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long r15, long r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 20
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 17
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L5d
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 != 0) goto L5d
            int r3 = r1 + 19
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L33
            goto L5d
        L33:
            int r1 = r1 + 21
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L39:
            r3 = 32
            if (r2 > r3) goto L56
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L56
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L39
        L56:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L5d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long r15, long r17) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 21
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 18
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L65
            long r5 = r5 + r7
            r7 = 10
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 != 0) goto L65
            int r3 = r1 + 19
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L65
            int r3 = r1 + 20
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L3b
            goto L65
        L3b:
            int r1 = r1 + 22
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L41:
            r3 = 32
            if (r2 > r3) goto L5e
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5e
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L41
        L5e:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L65:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
            r8 = this;
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            int r2 = r1 + 4
            int r3 = r8.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L15
            return r4
        L15:
            int r1 = r1 + 5
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L1b:
            r3 = 32
            if (r2 > r3) goto L38
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L38
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r7 = r2
            r2 = r1
            r1 = r7
            goto L1b
        L38:
            r8.offset = r1
            char r0 = (char) r2
            r8.f1814ch = r0
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long r15, long r17, byte r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 22
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 19
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6d
            long r5 = r5 + r7
            r7 = 11
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 != 0) goto L6d
            int r3 = r1 + 19
            r3 = r0[r3]
            r5 = r19
            if (r3 != r5) goto L6d
            int r3 = r1 + 20
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L6d
            int r3 = r1 + 21
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L43
            goto L6d
        L43:
            int r1 = r1 + 23
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L49:
            r3 = 32
            if (r2 > r3) goto L66
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L66
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L49
        L66:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long r15, long r17, int r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 23
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 20
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L62
            long r9 = r5 + r7
            r11 = 12
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L62
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r19
            if (r3 == r5) goto L38
            goto L62
        L38:
            int r1 = r1 + 24
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L3e:
            r3 = 32
            if (r2 > r3) goto L5b
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5b
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L3e
        L5b:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L62:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long r15, long r17, int r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 24
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 21
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6a
            long r9 = r5 + r7
            r11 = 13
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L6a
            long r5 = r5 + r7
            r7 = 5
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r19
            if (r3 != r5) goto L6a
            int r3 = r1 + 23
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L40
            goto L6a
        L40:
            int r1 = r1 + 25
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L46:
            r3 = 32
            if (r2 > r3) goto L63
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L63
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L46
        L63:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long r15, long r17, int r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 25
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 22
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L72
            long r9 = r5 + r7
            r11 = 14
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L72
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r19
            if (r3 != r5) goto L72
            int r3 = r1 + 23
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L72
            int r3 = r1 + 24
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L48
            goto L72
        L48:
            int r1 = r1 + 26
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L4e:
            r3 = 32
            if (r2 > r3) goto L6b
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L6b
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L4e
        L6b:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L72:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long r15, long r17, int r19, byte r20) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 26
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 23
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7a
            long r9 = r5 + r7
            r11 = 15
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7a
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r19
            if (r3 != r5) goto L7a
            int r3 = r1 + 23
            r3 = r0[r3]
            r5 = r20
            if (r3 != r5) goto L7a
            int r3 = r1 + 24
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L7a
            int r3 = r1 + 25
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L50
            goto L7a
        L50:
            int r1 = r1 + 27
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L56:
            r3 = 32
            if (r2 > r3) goto L73
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L73
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L56
        L73:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long r15, long r17, long r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 27
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 24
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L62
            long r9 = r5 + r7
            r11 = 16
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L62
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 == 0) goto L38
            goto L62
        L38:
            int r1 = r1 + 28
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L3e:
            r3 = 32
            if (r2 > r3) goto L5b
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5b
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L3e
        L5b:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L62:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long r15, long r17, long r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 28
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 25
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6a
            long r9 = r5 + r7
            r11 = 17
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L6a
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 != 0) goto L6a
            int r3 = r1 + 27
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L40
            goto L6a
        L40:
            int r1 = r1 + 29
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L46:
            r3 = 32
            if (r2 > r3) goto L63
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L63
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L46
        L63:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long r15, long r17, long r19) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 29
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 26
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L72
            long r9 = r5 + r7
            r11 = 18
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L72
            long r5 = r5 + r7
            r7 = 10
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 != 0) goto L72
            int r3 = r1 + 27
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L72
            int r3 = r1 + 28
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L48
            goto L72
        L48:
            int r1 = r1 + 30
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L4e:
            r3 = 32
            if (r2 > r3) goto L6b
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L6b
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L4e
        L6b:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L72:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long r15, long r17, long r19, byte r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 30
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 27
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7a
            long r9 = r5 + r7
            r11 = 19
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7a
            long r5 = r5 + r7
            r7 = 11
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r3 != 0) goto L7a
            int r3 = r1 + 27
            r3 = r0[r3]
            r5 = r21
            if (r3 != r5) goto L7a
            int r3 = r1 + 28
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L7a
            int r3 = r1 + 29
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L50
            goto L7a
        L50:
            int r1 = r1 + 31
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L56:
            r3 = 32
            if (r2 > r3) goto L73
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L73
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L56
        L73:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long r15, long r17, long r19, int r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 31
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 28
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6e
            long r9 = r5 + r7
            r11 = 20
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L6e
            long r9 = r5 + r7
            r11 = 12
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L6e
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r21
            if (r3 == r5) goto L45
            goto L6e
        L45:
            r3 = 32
            int r1 = r1 + r3
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L4c:
            if (r2 > r3) goto L67
            r4 = 1
            long r4 = r4 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L67
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L4c
        L67:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6e:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 5
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L41
            int r1 = r1 + 4
            r1 = r0[r1]
            r3 = 58
            if (r1 == r3) goto L1d
            goto L41
        L1d:
            r1 = r0[r2]
        L1f:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r1 > r3) goto L39
            r3 = 1
            long r3 = r3 << r1
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L39
            int r2 = r2 + 1
            r1 = r0[r2]
            goto L1f
        L39:
            r0 = 1
            int r2 = r2 + r0
            r7.offset = r2
            char r1 = (char) r1
            r7.f1814ch = r1
            return r0
        L41:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long r15, long r17, long r19, int r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 32
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 29
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L77
            long r9 = r5 + r7
            r11 = 21
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L77
            long r9 = r5 + r7
            r11 = 13
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L77
            long r5 = r5 + r7
            r7 = 5
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r21
            if (r3 != r5) goto L77
            int r3 = r1 + 31
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L4d
            goto L77
        L4d:
            int r1 = r1 + 33
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L53:
            r3 = 32
            if (r2 > r3) goto L70
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L70
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L53
        L70:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L77:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long r15, long r17, long r19, int r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 33
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 30
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7e
            long r9 = r5 + r7
            r11 = 22
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7e
            long r9 = r5 + r7
            r11 = 14
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L7e
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r21
            if (r3 != r5) goto L7e
            int r3 = r1 + 31
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L7e
            int r3 = r1 + 32
            r3 = r0[r3]
            r6 = 58
            if (r3 == r6) goto L55
            goto L7e
        L55:
            int r1 = r1 + r5
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L5a:
            r3 = 32
            if (r2 > r3) goto L77
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L77
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L5a
        L77:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7e:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long r15, long r17, long r19, int r21, byte r22) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 34
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 31
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L87
            long r9 = r5 + r7
            r11 = 23
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L87
            long r9 = r5 + r7
            r11 = 15
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L87
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r21
            if (r3 != r5) goto L87
            int r3 = r1 + 31
            r3 = r0[r3]
            r5 = r22
            if (r3 != r5) goto L87
            int r3 = r1 + 32
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L87
            int r3 = r1 + 33
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L5d
            goto L87
        L5d:
            int r1 = r1 + 35
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L63:
            r3 = 32
            if (r2 > r3) goto L80
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L80
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L63
        L80:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L87:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long r15, long r17, long r19, long r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 35
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 32
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L6f
            long r9 = r5 + r7
            r11 = 24
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L6f
            long r9 = r5 + r7
            r11 = 16
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L6f
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 == 0) goto L45
            goto L6f
        L45:
            int r1 = r1 + 36
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L4b:
            r3 = 32
            if (r2 > r3) goto L68
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L68
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L4b
        L68:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L6f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long r15, long r17, long r19, long r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 36
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 33
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L77
            long r9 = r5 + r7
            r11 = 25
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L77
            long r9 = r5 + r7
            r11 = 17
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L77
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 != 0) goto L77
            int r3 = r1 + 35
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L4d
            goto L77
        L4d:
            int r1 = r1 + 37
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L53:
            r3 = 32
            if (r2 > r3) goto L70
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L70
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L53
        L70:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L77:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long r15, long r17, long r19, long r21) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 37
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 34
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7f
            long r9 = r5 + r7
            r11 = 26
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7f
            long r9 = r5 + r7
            r11 = 18
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L7f
            long r5 = r5 + r7
            r7 = 10
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 != 0) goto L7f
            int r3 = r1 + 35
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L7f
            int r3 = r1 + 36
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L55
            goto L7f
        L55:
            int r1 = r1 + 38
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L5b:
            r3 = 32
            if (r2 > r3) goto L78
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L78
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L5b
        L78:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long r15, long r17, long r19, long r21, byte r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 38
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 35
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L87
            long r9 = r5 + r7
            r11 = 27
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L87
            long r9 = r5 + r7
            r11 = 19
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L87
            long r5 = r5 + r7
            r7 = 11
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 != 0) goto L87
            int r3 = r1 + 35
            r3 = r0[r3]
            r5 = r23
            if (r3 != r5) goto L87
            int r3 = r1 + 36
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L87
            int r3 = r1 + 37
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L5d
            goto L87
        L5d:
            int r1 = r1 + 39
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L63:
            r3 = 32
            if (r2 > r3) goto L80
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L80
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L63
        L80:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L87:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long r15, long r17, long r19, long r21, int r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 39
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 36
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 28
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 20
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 12
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r23
            if (r3 == r5) goto L52
            goto L7c
        L52:
            int r1 = r1 + 40
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L58:
            r3 = 32
            if (r2 > r3) goto L75
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L75
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L58
        L75:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7c:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long r15, long r17, long r19, long r21, int r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 40
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 37
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 29
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 21
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 13
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L84
            long r5 = r5 + r7
            r7 = 5
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r23
            if (r3 != r5) goto L84
            int r3 = r1 + 39
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L5a
            goto L84
        L5a:
            int r1 = r1 + 41
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L60:
            r3 = 32
            if (r2 > r3) goto L7d
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L7d
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L60
        L7d:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L84:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long r15, long r17, long r19, long r21, int r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 41
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 38
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 30
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 22
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 14
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r23
            if (r3 != r5) goto L8c
            int r3 = r1 + 39
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L8c
            int r3 = r1 + 40
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L62
            goto L8c
        L62:
            int r1 = r1 + 42
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L68:
            r3 = 32
            if (r2 > r3) goto L85
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L85
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L68
        L85:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L8c:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 6
            int r3 = r7.end
            if (r2 >= r3) goto L4b
            int r3 = r1 + 3
            r3 = r0[r3]
            if (r3 != r8) goto L4b
            int r8 = r1 + 4
            r8 = r0[r8]
            r3 = 34
            if (r8 != r3) goto L4b
            int r8 = r1 + 5
            r8 = r0[r8]
            r3 = 58
            if (r8 == r3) goto L21
            goto L4b
        L21:
            int r1 = r1 + 7
            r8 = r0[r2]
            r8 = r8 & 255(0xff, float:3.57E-43)
        L27:
            r2 = 32
            if (r8 > r2) goto L44
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L44
            int r8 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = r1
            r1 = r8
            r8 = r6
            goto L27
        L44:
            r7.offset = r1
            char r8 = (char) r8
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4b:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long r15, long r17, long r19, long r21, int r23, byte r24) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 42
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 39
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L94
            long r9 = r5 + r7
            r11 = 31
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L94
            long r9 = r5 + r7
            r11 = 23
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L94
            long r9 = r5 + r7
            r11 = 15
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L94
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            r5 = r23
            if (r3 != r5) goto L94
            int r3 = r1 + 39
            r3 = r0[r3]
            r5 = r24
            if (r3 != r5) goto L94
            int r3 = r1 + 40
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L94
            int r3 = r1 + 41
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L6a
            goto L94
        L6a:
            int r1 = r1 + 43
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L70:
            r3 = 32
            if (r2 > r3) goto L8d
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L8d
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L70
        L8d:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L94:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long r15, long r17, long r19, long r21, long r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 43
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 40
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 32
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 24
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r9 = r5 + r7
            r11 = 16
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L7c
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 == 0) goto L52
            goto L7c
        L52:
            int r1 = r1 + 44
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L58:
            r3 = 32
            if (r2 > r3) goto L75
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L75
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L58
        L75:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L7c:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long r15, long r17, long r19, long r21, long r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 44
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 41
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 33
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 25
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L84
            long r9 = r5 + r7
            r11 = 17
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L84
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 != 0) goto L84
            int r3 = r1 + 43
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L5a
            goto L84
        L5a:
            int r1 = r1 + 45
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L60:
            r3 = 32
            if (r2 > r3) goto L7d
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L7d
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L60
        L7d:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L84:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long r15, long r17, long r19, long r21, long r23) {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            int r2 = r1 + 45
            int r3 = r14.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r9 = r5 + r7
            r11 = 42
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 34
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 26
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r9 = r5 + r7
            r11 = 18
            long r9 = r9 - r11
            long r9 = r3.getLong(r0, r9)
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 != 0) goto L8c
            long r5 = r5 + r7
            r7 = 10
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 != 0) goto L8c
            int r3 = r1 + 43
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L8c
            int r3 = r1 + 44
            r3 = r0[r3]
            r5 = 58
            if (r3 == r5) goto L62
            goto L8c
        L62:
            int r1 = r1 + 46
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
        L68:
            r3 = 32
            if (r2 > r3) goto L85
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L85
            int r2 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L68
        L85:
            r14.offset = r1
            char r0 = (char) r2
            r14.f1814ch = r0
            r0 = 1
            return r0
        L8c:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 7
            int r3 = r9.end
            if (r2 >= r3) goto L44
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            r6 = 4
            long r4 = r4 - r6
            int r3 = r3.getInt(r0, r4)
            if (r3 == r10) goto L1a
            goto L44
        L1a:
            int r1 = r1 + 8
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L20:
            r2 = 32
            if (r10 > r2) goto L3d
            r2 = 1
            long r2 = r2 << r10
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3d
            int r10 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r8 = r1
            r1 = r10
            r10 = r8
            goto L20
        L3d:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L44:
            r10 = 0
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 8
            int r3 = r9.end
            if (r2 >= r3) goto L4c
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            r6 = 5
            long r4 = r4 - r6
            int r3 = r3.getInt(r0, r4)
            if (r3 != r10) goto L4c
            int r10 = r1 + 7
            r10 = r0[r10]
            r3 = 58
            if (r10 == r3) goto L22
            goto L4c
        L22:
            int r1 = r1 + 9
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L28:
            r2 = 32
            if (r10 > r2) goto L45
            r2 = 1
            long r2 = r2 << r10
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L45
            int r10 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r8 = r1
            r1 = r10
            r10 = r8
            goto L28
        L45:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L4c:
            r10 = 0
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int r11) {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 9
            int r3 = r10.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            if (r3 != r11) goto L56
            int r11 = r1 + 7
            r11 = r0[r11]
            r3 = 34
            if (r11 != r3) goto L56
            int r11 = r1 + 8
            r11 = r0[r11]
            r3 = 58
            if (r11 == r3) goto L2c
            goto L56
        L2c:
            int r1 = r1 + 10
            r11 = r0[r2]
            r11 = r11 & 255(0xff, float:3.57E-43)
        L32:
            r2 = 32
            if (r11 > r2) goto L4f
            r2 = 1
            long r2 = r2 << r11
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L4f
            int r11 = r1 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r9 = r1
            r1 = r11
            r11 = r9
            goto L32
        L4f:
            r10.offset = r1
            char r11 = (char) r11
            r10.f1814ch = r11
            r11 = 1
            return r11
        L56:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int r10, byte r11) {
            r9 = this;
            int r0 = r9.offset
            int r1 = r0 + 10
            int r2 = r9.end
            r3 = 0
            if (r1 < r2) goto La
            return r3
        La:
            byte[] r2 = r9.bytes
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r1
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r4 = r4.getInt(r2, r5)
            if (r4 != r10) goto L5b
            int r10 = r0 + 7
            r10 = r2[r10]
            if (r10 != r11) goto L5b
            int r10 = r0 + 8
            r10 = r2[r10]
            r11 = 34
            if (r10 != r11) goto L5b
            int r10 = r0 + 9
            r10 = r2[r10]
            r11 = 58
            if (r10 == r11) goto L32
            goto L5b
        L32:
            int r0 = r0 + 11
            r10 = r2[r1]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L38:
            r11 = 32
            if (r10 > r11) goto L54
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L54
            int r10 = r0 + 1
            r11 = r2[r0]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r0 = r10
            r10 = r11
            goto L38
        L54:
            r9.offset = r0
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
        L5b:
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 11
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 == 0) goto L1e
            return r4
        L1e:
            int r1 = r1 + 12
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
        L24:
            r11 = 32
            if (r10 > r11) goto L40
            r2 = 1
            long r2 = r2 << r10
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L40
            int r10 = r1 + 1
            r11 = r0[r1]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r1 = r10
            r10 = r11
            goto L24
        L40:
            r9.offset = r1
            char r10 = (char) r10
            r9.f1814ch = r10
            r10 = 1
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 7
            int r2 = r7.end
            if (r1 != r2) goto L10
            r0 = 26
            r7.f1814ch = r0
            r0 = 0
            return r0
        L10:
            r2 = r0[r1]
        L12:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r2 > r3) goto L2c
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2c
            int r1 = r1 + 1
            r2 = r0[r1]
            goto L12
        L2c:
            r0 = 1
            int r1 = r1 + r0
            r7.offset = r1
            char r1 = (char) r2
            r7.f1814ch = r1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 8
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r1 = r1 + 7
            r1 = r0[r1]
            r3 = 58
            if (r1 == r3) goto L15
            return r4
        L15:
            r1 = r0[r2]
        L17:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r1 > r3) goto L31
            r3 = 1
            long r3 = r3 << r1
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L31
            int r2 = r2 + 1
            r1 = r0[r2]
            goto L17
        L31:
            r0 = 1
            int r2 = r2 + r0
            r7.offset = r2
            char r1 = (char) r1
            r7.f1814ch = r1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 9
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 7
            r3 = r0[r3]
            r5 = 34
            if (r3 != r5) goto L41
            int r1 = r1 + 8
            r1 = r0[r1]
            r3 = 58
            if (r1 == r3) goto L1d
            goto L41
        L1d:
            r1 = r0[r2]
        L1f:
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 32
            if (r1 > r3) goto L39
            r3 = 1
            long r3 = r3 << r1
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L39
            int r2 = r2 + 1
            r1 = r0[r2]
            goto L1f
        L39:
            r0 = 1
            int r2 = r2 + r0
            r7.offset = r2
            char r1 = (char) r1
            r7.f1814ch = r1
            return r0
        L41:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfNull() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L1b
            int r0 = r3.offset
            int r1 = r0 + 2
            int r2 = r3.end
            if (r1 >= r2) goto L1b
            byte[] r1 = r3.bytes
            r0 = r1[r0]
            r1 = 117(0x75, float:1.64E-43)
            if (r0 != r1) goto L1b
            r3.readNull()
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
            r18 = this;
            r0 = r18
            char r1 = r0.f1814ch
            int r2 = r0.end
            int r3 = r0.offset
            byte[] r4 = r0.bytes
            r5 = 117(0x75, float:1.64E-43)
            r6 = 0
            r7 = 108(0x6c, float:1.51E-43)
            r8 = 1
            r9 = 110(0x6e, float:1.54E-43)
            if (r1 != r9) goto L29
            int r10 = r3 + 2
            if (r10 >= r2) goto L29
            r11 = r4[r3]
            if (r11 != r5) goto L29
            int r11 = r3 + 1
            r11 = r4[r11]
            if (r11 != r7) goto L29
            r10 = r4[r10]
            if (r10 != r7) goto L29
            int r3 = r3 + 3
            goto L5b
        L29:
            r10 = 34
            if (r1 == r10) goto L33
            r10 = 39
            if (r1 != r10) goto L32
            goto L33
        L32:
            return r6
        L33:
            if (r3 >= r2) goto L3b
            r10 = r4[r3]
            if (r10 != r1) goto L3b
            int r3 = r3 + r8
            goto L5b
        L3b:
            int r10 = r3 + 4
            if (r10 >= r2) goto Lbe
            r11 = r4[r3]
            if (r11 != r9) goto Lbe
            int r9 = r3 + 1
            r9 = r4[r9]
            if (r9 != r5) goto Lbe
            int r5 = r3 + 2
            r5 = r4[r5]
            if (r5 != r7) goto Lbe
            int r5 = r3 + 3
            r5 = r4[r5]
            if (r5 != r7) goto Lbe
            r5 = r4[r10]
            if (r5 != r1) goto Lbe
            int r3 = r3 + 5
        L5b:
            r1 = 26
            if (r3 != r2) goto L62
            r5 = r3
        L60:
            r3 = r1
            goto L66
        L62:
            int r5 = r3 + 1
            r3 = r4[r3]
        L66:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 < 0) goto L89
            if (r3 > r7) goto L89
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L89
            if (r5 != r2) goto L7f
            goto L60
        L7f:
            int r3 = r5 + 1
            r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L66
        L89:
            r15 = 44
            if (r3 != r15) goto L8e
            r6 = r8
        L8e:
            r0.comma = r6
            if (r6 == 0) goto L9f
            if (r5 != r2) goto L96
        L94:
            r3 = r1
            goto L9f
        L96:
            int r3 = r5 + 1
            r5 = r4[r5]
        L9a:
            r17 = r5
            r5 = r3
            r3 = r17
        L9f:
            if (r3 < 0) goto Lb2
            if (r3 > r7) goto Lb2
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto Lb2
            if (r5 != r2) goto Lad
            goto L94
        Lad:
            int r3 = r5 + 1
            r5 = r4[r5]
            goto L9a
        Lb2:
            if (r3 >= 0) goto Lb8
            r0.char_utf8(r3, r5)
            return r8
        Lb8:
            r0.offset = r5
            char r1 = (char) r3
            r0.f1814ch = r1
            return r8
        Lbe:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 == r4) goto Le
            r1 = 0
            return r1
        Le:
            int r1 = r0.end
            r4 = 26
            if (r3 != r1) goto L17
            r1 = r3
        L15:
            r3 = r4
            goto L1b
        L17:
            int r1 = r3 + 1
            r3 = r2[r3]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r3 > r11) goto L3e
            long r12 = r9 << r3
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r3 = r0.end
            if (r1 != r3) goto L34
            goto L15
        L34:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r3 != r12) goto L69
            r0.comma = r13
            int r3 = r0.end
            if (r1 != r3) goto L4c
            r3 = r1
            r1 = r4
            goto L50
        L4c:
            int r3 = r1 + 1
            r1 = r2[r1]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r3 > r11) goto L69
            long r14 = r9 << r3
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r3 = r0.end
            if (r1 != r3) goto L64
            r3 = r4
            goto L55
        L64:
            int r3 = r1 + 1
            r1 = r2[r1]
            goto L50
        L69:
            if (r3 >= 0) goto L6f
            r0.char_utf8(r3, r1)
            return r13
        L6f:
            char r2 = (char) r3
            r0.f1814ch = r2
            r0.offset = r1
            r1 = 47
            if (r3 != r1) goto L7b
            r0.skipComment()
        L7b:
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
            r9 = this;
            char r0 = r9.f1814ch
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 != r2) goto L15
            r2 = r1
        L13:
            r1 = r3
            goto L19
        L15:
            int r2 = r1 + 1
            r1 = r0[r1]
        L19:
            r4 = 32
            if (r1 > r4) goto L39
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L39
            int r1 = r9.end
            if (r2 != r1) goto L31
            goto L13
        L31:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r0 = 1
            if (r1 >= 0) goto L40
            r9.char_utf8(r1, r2)
            return r0
        L40:
            char r3 = (char) r1
            r9.f1814ch = r3
            r9.offset = r2
            r2 = 47
            if (r1 != r2) goto L4c
            r9.skipComment()
        L4c:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfSet() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            char r2 = r10.f1814ch
            r3 = 83
            if (r2 != r3) goto L50
            int r2 = r1 + 1
            int r3 = r10.end
            if (r2 >= r3) goto L50
            r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L50
            r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L50
            int r2 = r1 + 2
            r4 = 26
            if (r2 != r3) goto L25
            r1 = r2
        L23:
            r2 = r4
            goto L29
        L25:
            int r1 = r1 + 3
            r2 = r0[r2]
        L29:
            r3 = 32
            if (r2 > r3) goto L49
            r5 = 1
            long r5 = r5 << r2
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L49
            int r2 = r10.end
            if (r1 != r2) goto L41
            goto L23
        L41:
            int r2 = r1 + 1
            r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L29
        L49:
            r10.offset = r1
            char r0 = (char) r2
            r10.f1814ch = r0
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 11
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 8
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 == 0) goto L1e
            return r4
        L1e:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 44
            if (r10 == r11) goto L2f
            r3 = 125(0x7d, float:1.75E-43)
            if (r10 == r3) goto L2f
            r3 = 93
            if (r10 == r3) goto L2f
            return r4
        L2f:
            r3 = 1
            if (r10 != r11) goto L40
            r9.comma = r3
            int r2 = r1 + 12
            int r10 = r9.end
            if (r2 != r10) goto L3d
            r10 = 26
            goto L40
        L3d:
            r10 = r0[r2]
            goto L57
        L40:
            r11 = 32
            if (r10 > r11) goto L5a
            r4 = 1
            long r4 = r4 << r10
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L5a
            int r2 = r2 + 1
            r10 = r0[r2]
        L57:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L40
        L5a:
            int r2 = r2 + r3
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 12
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 9
            long r5 = r5 - r7
            long r5 = r3.getLong(r0, r5)
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 != 0) goto L69
            int r10 = r1 + 11
            r10 = r0[r10]
            r11 = 34
            if (r10 == r11) goto L26
            goto L69
        L26:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 44
            if (r10 == r11) goto L37
            r3 = 125(0x7d, float:1.75E-43)
            if (r10 == r3) goto L37
            r3 = 93
            if (r10 == r3) goto L37
            return r4
        L37:
            r3 = 1
            if (r10 != r11) goto L48
            r9.comma = r3
            int r2 = r1 + 13
            int r10 = r9.end
            if (r2 != r10) goto L45
            r10 = 26
            goto L48
        L45:
            r10 = r0[r2]
            goto L5f
        L48:
            r11 = 32
            if (r10 > r11) goto L62
            r4 = 1
            long r4 = r4 << r10
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L62
            int r2 = r2 + 1
            r10 = r0[r2]
        L5f:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L48
        L62:
            int r2 = r2 + r3
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
            return r3
        L69:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 3
            int r3 = r10.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r6 = 44
            if (r2 == r6) goto L1f
            r7 = 125(0x7d, float:1.75E-43)
            if (r2 == r7) goto L1f
            r7 = 93
            if (r2 == r7) goto L1f
            return r4
        L1f:
            r4 = 1
            if (r2 != r6) goto L2f
            r10.comma = r4
            if (r5 != r3) goto L2a
            r1 = 26
            r2 = r1
            goto L2f
        L2a:
            int r1 = r1 + 5
            r2 = r0[r5]
            goto L46
        L2f:
            r1 = 32
            if (r2 > r1) goto L4a
            r6 = 1
            long r6 = r6 << r2
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L4a
            int r1 = r5 + 1
            r2 = r0[r5]
        L46:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = r1
            goto L2f
        L4a:
            r10.offset = r5
            char r0 = (char) r2
            r10.f1814ch = r0
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 4
            int r3 = r10.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            r5 = r0[r5]
            r6 = 34
            if (r5 == r6) goto L15
            return r4
        L15:
            r5 = r0[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 44
            if (r5 == r6) goto L26
            r7 = 125(0x7d, float:1.75E-43)
            if (r5 == r7) goto L26
            r7 = 93
            if (r5 == r7) goto L26
            return r4
        L26:
            r4 = 1
            if (r5 != r6) goto L38
            r10.comma = r4
            int r2 = r1 + 5
            if (r2 != r3) goto L33
            r1 = 26
        L31:
            r5 = r1
            goto L38
        L33:
            r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            goto L31
        L38:
            r1 = 32
            if (r5 > r1) goto L52
            r6 = 1
            long r6 = r6 << r5
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L52
            int r2 = r2 + 1
            r1 = r0[r2]
            r5 = r1 & 255(0xff, float:3.57E-43)
            goto L38
        L52:
            int r2 = r2 + r4
            r10.offset = r2
            char r0 = (char) r5
            r10.f1814ch = r0
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 5
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            r5 = r0[r5]
            if (r5 != r10) goto L5b
            int r10 = r1 + 4
            r10 = r0[r10]
            r5 = 34
            if (r10 == r5) goto L1b
            goto L5b
        L1b:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r5 = 44
            if (r10 == r5) goto L2c
            r6 = 125(0x7d, float:1.75E-43)
            if (r10 == r6) goto L2c
            r6 = 93
            if (r10 == r6) goto L2c
            return r4
        L2c:
            r4 = 1
            if (r10 != r5) goto L3b
            r9.comma = r4
            int r2 = r1 + 6
            if (r2 != r3) goto L38
            r10 = 26
            goto L3b
        L38:
            r10 = r0[r2]
            goto L52
        L3b:
            r1 = 32
            if (r10 > r1) goto L55
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L55
            int r2 = r2 + 1
            r10 = r0[r2]
        L52:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L3b
        L55:
            int r2 = r2 + r4
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
        L5b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte r10, byte r11) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 6
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            r5 = r0[r5]
            if (r5 != r10) goto L61
            int r10 = r1 + 4
            r10 = r0[r10]
            if (r10 != r11) goto L61
            int r10 = r1 + 5
            r10 = r0[r10]
            r11 = 34
            if (r10 == r11) goto L21
            goto L61
        L21:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 44
            if (r10 == r11) goto L32
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L32
            r5 = 93
            if (r10 == r5) goto L32
            return r4
        L32:
            r4 = 1
            if (r10 != r11) goto L41
            r9.comma = r4
            int r2 = r1 + 7
            if (r2 != r3) goto L3e
            r10 = 26
            goto L41
        L3e:
            r10 = r0[r2]
            goto L58
        L41:
            r11 = 32
            if (r10 > r11) goto L5b
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r2 = r2 + 1
            r10 = r0[r2]
        L58:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L41
        L5b:
            int r2 = r2 + r4
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
        L61:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 7
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 4
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            if (r3 == r10) goto L1c
            return r4
        L1c:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r3 = 44
            if (r10 == r3) goto L2d
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L2d
            r5 = 93
            if (r10 == r5) goto L2d
            return r4
        L2d:
            r4 = 1
            if (r10 != r3) goto L3e
            r9.comma = r4
            int r2 = r1 + 8
            int r10 = r9.end
            if (r2 != r10) goto L3b
            r10 = 26
            goto L3e
        L3b:
            r10 = r0[r2]
            goto L55
        L3e:
            r1 = 32
            if (r10 > r1) goto L58
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L58
            int r2 = r2 + 1
            r10 = r0[r2]
        L55:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L3e
        L58:
            int r2 = r2 + r4
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int r10) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 8
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 5
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            if (r3 != r10) goto L66
            int r10 = r1 + 7
            r10 = r0[r10]
            r3 = 34
            if (r10 == r3) goto L24
            goto L66
        L24:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r3 = 44
            if (r10 == r3) goto L35
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L35
            r5 = 93
            if (r10 == r5) goto L35
            return r4
        L35:
            r4 = 1
            if (r10 != r3) goto L46
            r9.comma = r4
            int r2 = r1 + 9
            int r10 = r9.end
            if (r2 != r10) goto L43
            r10 = 26
            goto L46
        L43:
            r10 = r0[r2]
            goto L5d
        L46:
            r1 = 32
            if (r10 > r1) goto L60
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L60
            int r2 = r2 + 1
            r10 = r0[r2]
        L5d:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L46
        L60:
            int r2 = r2 + r4
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
        L66:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int r10, byte r11) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 9
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 6
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            if (r3 != r10) goto L6d
            int r10 = r1 + 7
            r10 = r0[r10]
            if (r10 != r11) goto L6d
            int r10 = r1 + 8
            r10 = r0[r10]
            r11 = 34
            if (r10 == r11) goto L2a
            goto L6d
        L2a:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 44
            if (r10 == r11) goto L3b
            r3 = 125(0x7d, float:1.75E-43)
            if (r10 == r3) goto L3b
            r3 = 93
            if (r10 == r3) goto L3b
            return r4
        L3b:
            r3 = 1
            if (r10 != r11) goto L4c
            r9.comma = r3
            int r2 = r1 + 10
            int r10 = r9.end
            if (r2 != r10) goto L49
            r10 = 26
            goto L4c
        L49:
            r10 = r0[r2]
            goto L63
        L4c:
            r11 = 32
            if (r10 > r11) goto L66
            r4 = 1
            long r4 = r4 << r10
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L66
            int r2 = r2 + 1
            r10 = r0[r2]
        L63:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L4c
        L66:
            int r2 = r2 + r3
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
            return r3
        L6d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int r10, byte r11, byte r12) {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 10
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r2
            long r5 = r5 + r7
            r7 = 7
            long r5 = r5 - r7
            int r3 = r3.getInt(r0, r5)
            if (r3 != r10) goto L73
            int r10 = r1 + 7
            r10 = r0[r10]
            if (r10 != r11) goto L73
            int r10 = r1 + 8
            r10 = r0[r10]
            if (r10 != r12) goto L73
            int r10 = r1 + 9
            r10 = r0[r10]
            r11 = 34
            if (r10 == r11) goto L30
            goto L73
        L30:
            r10 = r0[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 44
            if (r10 == r11) goto L41
            r12 = 125(0x7d, float:1.75E-43)
            if (r10 == r12) goto L41
            r12 = 93
            if (r10 == r12) goto L41
            return r4
        L41:
            r12 = 1
            if (r10 != r11) goto L52
            r9.comma = r12
            int r2 = r1 + 11
            int r10 = r9.end
            if (r2 != r10) goto L4f
            r10 = 26
            goto L52
        L4f:
            r10 = r0[r2]
            goto L69
        L52:
            r11 = 32
            if (r10 > r11) goto L6c
            r3 = 1
            long r3 = r3 << r10
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 == 0) goto L6c
            int r2 = r2 + 1
            r10 = r0[r2]
        L69:
            r10 = r10 & 255(0xff, float:3.57E-43)
            goto L52
        L6c:
            int r2 = r2 + r12
            r9.offset = r2
            char r10 = (char) r10
            r9.f1814ch = r10
            return r12
        L73:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void nextWithoutComment() {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r9.end
            r3 = 26
            if (r1 < r2) goto Ld
            r2 = r1
        Lb:
            r1 = r3
            goto L11
        Ld:
            int r2 = r1 + 1
            r1 = r0[r1]
        L11:
            r4 = 32
            if (r1 > r4) goto L31
            r4 = 1
            long r4 = r4 << r1
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r1 = r9.end
            if (r2 != r1) goto L29
            goto Lb
        L29:
            int r1 = r2 + 1
            r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L11
        L31:
            if (r1 >= 0) goto L37
            r9.char_utf8(r1, r2)
            return
        L37:
            r9.offset = r2
            char r0 = (char) r1
            r9.f1814ch = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.math.BigDecimal readBigDecimal() {
            r28 = this;
            r1 = r28
            byte[] r0 = r1.bytes
            char r2 = r1.f1814ch
            int r3 = r1.offset
            r4 = 34
            r5 = 2
            r7 = 0
            r8 = 0
            if (r2 == r4) goto L17
            r4 = 39
            if (r2 != r4) goto L14
            goto L17
        L14:
            r4 = r3
            r3 = r7
            goto L33
        L17:
            int r4 = r3 + 1
            r9 = r0[r3]
            if (r9 != r2) goto L31
            int r2 = r1.end
            if (r4 != r2) goto L24
            r6 = 26
            goto L29
        L24:
            int r3 = r3 + r5
            r0 = r0[r4]
            char r6 = (char) r0
            r4 = r3
        L29:
            r1.f1814ch = r6
            r1.offset = r4
            r1.nextIfComma()
            return r8
        L31:
            r3 = r2
            r2 = r9
        L33:
            r9 = 43
            r10 = 45
            r11 = 1
            if (r2 != r10) goto L46
            r1.negative = r11
            int r2 = r4 + 1
            r12 = r0[r4]
        L40:
            r27 = r12
            r12 = r2
            r2 = r27
            goto L50
        L46:
            r1.negative = r7
            if (r2 != r9) goto L4f
            int r2 = r4 + 1
            r12 = r0[r4]
            goto L40
        L4f:
            r12 = r4
        L50:
            r1.valueType = r11
            r13 = 0
            r15 = r7
            r18 = r15
            r16 = r13
        L59:
            r19 = 31
            r6 = 57
            r20 = 10
            r22 = r8
            r8 = 48
            if (r2 < r8) goto L9d
            if (r2 > r6) goto L9d
            if (r15 != 0) goto L7b
            long r23 = r16 * r20
            long r25 = r16 | r20
            long r25 = r25 >>> r19
            int r18 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r18 == 0) goto L7e
            long r25 = r23 / r20
            int r18 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r18 != 0) goto L7a
            goto L7e
        L7a:
            r15 = r11
        L7b:
            r25 = r13
            goto L85
        L7e:
            int r2 = r2 + (-48)
            r25 = r13
            long r13 = (long) r2
            long r16 = r23 + r13
        L85:
            int r2 = r1.end
            if (r12 != r2) goto L90
            int r12 = r12 + 1
            r18 = r11
            r2 = 26
            goto L9f
        L90:
            int r2 = r12 + 1
            r6 = r0[r12]
            r12 = r2
            r2 = r6
            r18 = r11
            r8 = r22
            r13 = r25
            goto L59
        L9d:
            r25 = r13
        L9f:
            int r13 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r13 >= 0) goto La4
            r15 = r11
        La4:
            r1.scale = r7
            r13 = 46
            if (r2 != r13) goto Lf3
            r1.valueType = r5
            int r2 = r12 + 1
            r12 = r0[r12]
            r27 = r12
            r12 = r2
            r2 = r27
        Lb5:
            if (r2 < r8) goto Lf3
            if (r2 > r6) goto Lf3
            short r13 = r1.scale
            int r13 = r13 + r11
            short r13 = (short) r13
            r1.scale = r13
            if (r15 != 0) goto Lda
            long r13 = r16 * r20
            long r23 = r16 | r20
            long r23 = r23 >>> r19
            int r18 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r18 == 0) goto Ld4
            long r23 = r13 / r20
            int r18 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r18 != 0) goto Ld2
            goto Ld4
        Ld2:
            r15 = r11
            goto Lda
        Ld4:
            int r2 = r2 + (-48)
            long r5 = (long) r2
            long r13 = r13 + r5
            r16 = r13
        Lda:
            int r2 = r1.end
            if (r12 != r2) goto Le7
            int r12 = r12 + 1
            r18 = r11
            r5 = r16
            r2 = 26
            goto Lf5
        Le7:
            int r2 = r12 + 1
            r5 = r0[r12]
            r12 = r2
            r2 = r5
            r18 = r11
            r5 = 2
            r6 = 57
            goto Lb5
        Lf3:
            r5 = r16
        Lf5:
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto L100
            r14 = 69
            if (r2 != r14) goto Lfe
            goto L100
        Lfe:
            r9 = r7
            goto L153
        L100:
            int r2 = r12 + 1
            r14 = r0[r12]
            if (r14 != r10) goto L108
            r10 = r11
            goto L109
        L108:
            r10 = r7
        L109:
            if (r10 != 0) goto L110
            if (r14 != r9) goto L10e
            goto L110
        L10e:
            r9 = r7
            goto L116
        L110:
            int r12 = r12 + 2
            r14 = r0[r2]
            r9 = r7
            r2 = r12
        L116:
            if (r14 < r8) goto L148
            r12 = 57
            if (r14 > r12) goto L148
            int r14 = r14 + (-48)
            int r9 = r9 * 10
            int r9 = r9 + r14
            r14 = 2047(0x7ff, float:2.868E-42)
            if (r9 > r14) goto L13d
            int r14 = r1.end
            if (r2 != r14) goto L131
            int r2 = r2 + 1
            r12 = r2
            r18 = r11
            r2 = 26
            goto L14a
        L131:
            int r14 = r2 + 1
            r2 = r0[r2]
            r18 = r14
            r14 = r2
            r2 = r18
            r18 = r11
            goto L116
        L13d:
            java.lang.String r0 = "too large exp value : "
            java.lang.String r0 = eh.a.l(r9, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L148:
            r12 = r2
            r2 = r14
        L14a:
            if (r10 == 0) goto L14d
            int r9 = -r9
        L14d:
            short r8 = (short) r9
            r1.exponent = r8
            r8 = 2
            r1.valueType = r8
        L153:
            if (r12 != r4) goto L239
            r8 = 110(0x6e, float:1.54E-43)
            r10 = 117(0x75, float:1.64E-43)
            r14 = 108(0x6c, float:1.51E-43)
            if (r2 != r8) goto L1a2
            int r8 = r12 + 1
            r7 = r0[r12]
            if (r7 != r10) goto L19e
            int r7 = r12 + 2
            r8 = r0[r8]
            if (r8 != r14) goto L1a0
            int r8 = r12 + 3
            r7 = r0[r7]
            if (r7 != r14) goto L19e
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r13 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            r19 = r12
            long r11 = r2.mask
            long r10 = r13 & r11
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L193
            r2 = 1
            r1.wasNull = r2
            int r2 = r1.end
            if (r8 != r2) goto L189
            r2 = 26
            goto L18b
        L189:
            r2 = r0[r8]
        L18b:
            int r12 = r19 + 4
        L18d:
            r7 = 0
            r8 = 1
            r18 = 1
            goto L23c
        L193:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L19e:
            r12 = r8
            goto L1a4
        L1a0:
            r12 = r7
            goto L1a4
        L1a2:
            r19 = r12
        L1a4:
            r7 = 116(0x74, float:1.63E-43)
            if (r2 != r7) goto L1cf
            int r7 = r12 + 3
            int r8 = r1.end
            if (r7 > r8) goto L1cf
            r11 = r0[r12]
            r14 = 114(0x72, float:1.6E-43)
            if (r11 != r14) goto L1cf
            int r11 = r12 + 1
            r11 = r0[r11]
            if (r11 != r10) goto L1cf
            int r10 = r12 + 2
            r10 = r0[r10]
            if (r10 != r13) goto L1cf
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            if (r7 != r8) goto L1c7
            r7 = 26
            goto L1c9
        L1c7:
            r7 = r0[r7]
        L1c9:
            int r12 = r12 + 4
        L1cb:
            r22 = r2
            r2 = r7
            goto L18d
        L1cf:
            r7 = 102(0x66, float:1.43E-43)
            if (r2 != r7) goto L201
            int r7 = r12 + 4
            int r8 = r1.end
            if (r7 > r8) goto L201
            r10 = r0[r12]
            r11 = 97
            if (r10 != r11) goto L201
            int r10 = r12 + 1
            r10 = r0[r10]
            r11 = 108(0x6c, float:1.51E-43)
            if (r10 != r11) goto L201
            int r10 = r12 + 2
            r10 = r0[r10]
            r11 = 115(0x73, float:1.61E-43)
            if (r10 != r11) goto L201
            int r10 = r12 + 3
            r10 = r0[r10]
            if (r10 != r13) goto L201
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            if (r7 != r8) goto L1fc
            r7 = 26
            goto L1fe
        L1fc:
            r7 = r0[r7]
        L1fe:
            int r12 = r12 + 5
            goto L1cb
        L201:
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 != r7) goto L219
            if (r3 != 0) goto L219
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r2 = r25
            r1.readObject(r0, r2)
            r7 = 0
            r1.wasNull = r7
            java.math.BigDecimal r0 = r1.decimal(r0)
            return r0
        L219:
            r7 = 0
            r8 = 91
            if (r2 != r8) goto L237
            if (r3 != 0) goto L237
            java.util.List r0 = r1.readArray()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22e
            r2 = 1
            r1.wasNull = r2
            return r22
        L22e:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            r0 = 0
            return r0
        L237:
            r8 = r7
            goto L23c
        L239:
            r19 = r12
            goto L237
        L23c:
            int r10 = r12 - r4
            if (r3 == 0) goto L266
            if (r2 == r3) goto L259
            java.lang.String r0 = r1.readString()
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)     // Catch: java.lang.NumberFormatException -> L24b
            return r0
        L24b:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = r1.info(r2)
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        L259:
            int r2 = r1.end
            if (r12 < r2) goto L260
            r2 = 26
            goto L266
        L260:
            int r2 = r12 + 1
            r3 = r0[r12]
            r12 = r2
            r2 = r3
        L266:
            if (r8 != 0) goto L2ac
            if (r9 != 0) goto L27e
            if (r15 != 0) goto L27e
            r25 = 0
            int r3 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r3 == 0) goto L27e
            boolean r3 = r1.negative
            if (r3 == 0) goto L277
            long r5 = -r5
        L277:
            short r3 = r1.scale
            java.math.BigDecimal r22 = java.math.BigDecimal.valueOf(r5, r3)
            r8 = 1
        L27e:
            r17 = 1
            if (r8 != 0) goto L28a
            int r4 = r4 + (-1)
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.parseBigDecimal(r0, r4, r10)
            r22 = r3
        L28a:
            r3 = 76
            if (r2 == r3) goto L29e
            r3 = 70
            if (r2 == r3) goto L29e
            r3 = 68
            if (r2 == r3) goto L29e
            r3 = 66
            if (r2 == r3) goto L29e
            r3 = 83
            if (r2 != r3) goto L2ae
        L29e:
            int r2 = r1.end
            if (r12 < r2) goto L2a5
        L2a2:
            r2 = 26
            goto L2ae
        L2a5:
            int r2 = r12 + 1
            r3 = r0[r12]
        L2a9:
            r12 = r2
            r2 = r3
            goto L2ae
        L2ac:
            r17 = 1
        L2ae:
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            r5 = 1
            r8 = 32
            if (r2 > r8) goto L2cc
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r9 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r9 == 0) goto L2cc
            int r2 = r1.end
            if (r12 != r2) goto L2c7
            goto L2a2
        L2c7:
            int r2 = r12 + 1
            r3 = r0[r12]
            goto L2a9
        L2cc:
            r9 = 44
            if (r2 != r9) goto L2d2
            r7 = r17
        L2d2:
            r1.comma = r7
            if (r7 == 0) goto L2fb
            int r2 = r1.end
            if (r12 != r2) goto L2dd
            r7 = 26
            goto L2e2
        L2dd:
            int r2 = r12 + 1
            r7 = r0[r12]
            goto L2f9
        L2e2:
            r2 = r7
        L2e3:
            if (r2 > r8) goto L2fb
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r7 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r7 == 0) goto L2fb
            int r2 = r1.end
            if (r12 != r2) goto L2f5
            r2 = 26
            goto L2e3
        L2f5:
            int r2 = r12 + 1
            r7 = r0[r12]
        L2f9:
            r12 = r2
            goto L2e2
        L2fb:
            if (r18 == 0) goto L303
            char r0 = (char) r2
            r1.f1814ch = r0
            r1.offset = r12
            return r22
        L303:
            java.lang.String r0 = "illegal input error"
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readBoolValue() {
            r18 = this;
            r0 = r18
            r1 = 0
            r0.wasNull = r1
            byte[] r2 = r0.bytes
            int r3 = r0.offset
            char r4 = r0.f1814ch
            r5 = 116(0x74, float:1.63E-43)
            r6 = 101(0x65, float:1.42E-43)
            r7 = 117(0x75, float:1.64E-43)
            r8 = 0
            r10 = 1
            if (r4 != r5) goto L30
            int r5 = r3 + 2
            int r11 = r2.length
            if (r5 >= r11) goto L30
            r11 = r2[r3]
            r12 = 114(0x72, float:1.6E-43)
            if (r11 != r12) goto L30
            int r11 = r3 + 1
            r11 = r2[r11]
            if (r11 != r7) goto L30
            r5 = r2[r5]
            if (r5 != r6) goto L30
            int r3 = r3 + 3
        L2d:
            r4 = r10
            goto Lc6
        L30:
            r5 = 102(0x66, float:1.43E-43)
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 != r5) goto L58
            int r5 = r3 + 3
            int r12 = r2.length
            if (r5 >= r12) goto L58
            r12 = r2[r3]
            r13 = 97
            if (r12 != r13) goto L58
            int r12 = r3 + 1
            r12 = r2[r12]
            if (r12 != r11) goto L58
            int r12 = r3 + 2
            r12 = r2[r12]
            r13 = 115(0x73, float:1.61E-43)
            if (r12 != r13) goto L58
            r5 = r2[r5]
            if (r5 != r6) goto L58
            int r3 = r3 + 4
        L55:
            r4 = r1
            goto Lc6
        L58:
            r5 = 45
            if (r4 == r5) goto L15e
            r5 = 48
            if (r4 < r5) goto L66
            r6 = 57
            if (r4 > r6) goto L66
            goto L15e
        L66:
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 != r6) goto L9a
            int r6 = r3 + 2
            int r12 = r2.length
            if (r6 >= r12) goto L9a
            r12 = r2[r3]
            if (r12 != r7) goto L9a
            int r7 = r3 + 1
            r7 = r2[r7]
            if (r7 != r11) goto L9a
            r6 = r2[r6]
            if (r6 != r11) goto L9a
            com.alibaba.fastjson2.JSONReader$Context r4 = r0.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r6 = r6.mask
            long r4 = r4 & r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L8f
            r0.wasNull = r10
            int r3 = r3 + 3
            goto L55
        L8f:
            java.lang.String r1 = "boolean value not support input null"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
        L98:
            r1 = 0
            return r1
        L9a:
            r6 = 34
            if (r4 != r6) goto L153
            int r4 = r3 + 1
            int r7 = r2.length
            java.lang.String r11 = "can not convert to boolean : "
            if (r4 >= r7) goto L122
            r4 = r2[r4]
            if (r4 != r6) goto L122
            r4 = r2[r3]
            int r3 = r3 + 2
            if (r4 == r5) goto L55
            r5 = 78
            if (r4 != r5) goto Lb4
            goto L55
        Lb4:
            r5 = 49
            if (r4 == r5) goto L2d
            r5 = 89
            if (r4 != r5) goto Lbe
            goto L2d
        Lbe:
            java.lang.String r1 = eh.a.l(r4, r11)
            ah.a.w(r1)
            goto L98
        Lc6:
            int r5 = r0.end
            r6 = 26
            if (r3 != r5) goto Lcf
            r5 = r3
        Lcd:
            r3 = r6
            goto Ld4
        Lcf:
            int r5 = r3 + 1
            r3 = r2[r3]
            char r3 = (char) r3
        Ld4:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto Lf5
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto Lf5
            int r3 = r0.end
            if (r5 < r3) goto Leb
            goto Lcd
        Leb:
            int r3 = r5 + 1
            r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto Ld4
        Lf5:
            r15 = 44
            if (r3 != r15) goto Lfa
            r1 = r10
        Lfa:
            r0.comma = r1
            if (r1 == 0) goto L11c
            int r1 = r0.end
            if (r5 < r1) goto L104
        L102:
            r3 = r6
            goto L109
        L104:
            int r1 = r5 + 1
            r3 = r2[r5]
        L108:
            r5 = r1
        L109:
            if (r3 > r7) goto L11c
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 == 0) goto L11c
            int r1 = r0.end
            if (r5 < r1) goto L117
            goto L102
        L117:
            int r1 = r5 + 1
            r3 = r2[r5]
            goto L108
        L11c:
            r0.offset = r5
            char r1 = (char) r3
            r0.f1814ch = r1
            return r4
        L122:
            java.lang.String r2 = r0.readString()
            java.lang.String r3 = "true"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L12f
            return r10
        L12f:
            java.lang.String r3 = "false"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L138
            return r1
        L138:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L150
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L147
            goto L150
        L147:
            java.lang.String r1 = r11.concat(r2)
            ah.a.w(r1)
            goto L98
        L150:
            r0.wasNull = r10
            return r1
        L153:
            java.lang.String r1 = "syntax error : "
            java.lang.String r1 = eh.a.l(r4, r1)
            ah.a.w(r1)
            goto L98
        L15e:
            r0.readNumber()
            byte r2 = r0.valueType
            if (r2 != r10) goto L194
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            int r3 = r0.mag0
            if (r2 == 0) goto L185
            if (r3 != 0) goto L184
            int r2 = r0.mag1
            if (r2 != 0) goto L184
            int r2 = r0.mag2
            if (r2 != 0) goto L184
            int r2 = r0.mag3
            if (r2 == 0) goto L183
            goto L184
        L183:
            return r1
        L184:
            return r10
        L185:
            if (r3 != 0) goto L194
            int r2 = r0.mag1
            if (r2 != 0) goto L194
            int r2 = r0.mag2
            if (r2 != 0) goto L194
            int r2 = r0.mag3
            if (r2 != r10) goto L194
            return r10
        L194:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final double readDoubleValue() {
            r35 = this;
            r0 = r35
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            int r3 = r0.offset
            int r4 = r0.end
            r5 = 34
            if (r2 == r5) goto L17
            r5 = 39
            if (r2 != r5) goto L13
            goto L17
        L13:
            r5 = r3
            r3 = r2
            r2 = 0
            goto L21
        L17:
            if (r3 != r4) goto L1d
            r5 = r3
            r3 = 26
            goto L21
        L1d:
            int r5 = r3 + 1
            r3 = r1[r3]
        L21:
            r8 = 44
            if (r2 == 0) goto L3d
            if (r3 != r2) goto L3d
            if (r5 != r4) goto L2c
            r3 = 26
            goto L31
        L2c:
            int r2 = r5 + 1
            r3 = r1[r5]
            r5 = r2
        L31:
            r7 = r1
            r11 = 0
            r13 = 1
            r14 = 0
            r16 = 1
            r18 = 0
            goto L228
        L3d:
            r6 = 43
            r7 = 45
            r16 = 1
            r9 = 57
            r10 = 48
            if (r3 < r10) goto L51
            if (r3 > r9) goto L51
            r18 = 0
            int r11 = 48 - r3
            long r11 = (long) r11
            goto L59
        L51:
            r18 = 0
            if (r3 == r7) goto L57
            if (r3 != r6) goto L7c
        L57:
            r11 = r18
        L59:
            int r20 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            r21 = 100
            r23 = -92233720368547758(0xfeb851eb851eb852, double:-2.605908932677002E302)
            r13 = -1
            if (r20 > 0) goto L7f
            r25 = 0
            int r14 = r5 + 1
            if (r14 >= r4) goto L81
            int r14 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r5)
            if (r14 == r13) goto L81
            int r13 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r13 > 0) goto L7c
            long r11 = r11 * r21
            long r13 = (long) r14
            long r11 = r11 - r13
            int r5 = r5 + 2
            goto L59
        L7c:
            r11 = r16
            goto L59
        L7f:
            r25 = 0
        L81:
            r27 = 10
            r29 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            if (r20 > 0) goto La4
            if (r5 >= r4) goto La4
            r31 = 48
            r14 = r1[r5]
            if (r14 < r10) goto La7
            if (r14 > r9) goto La7
            int r15 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r15 > 0) goto La1
            long r11 = r11 * r27
            long r11 = r11 + r31
            long r6 = (long) r14
            long r11 = r11 - r6
            int r5 = r5 + 1
            goto La7
        La1:
            r11 = r16
            goto La7
        La4:
            r31 = 48
            r14 = r3
        La7:
            int r6 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r6 > 0) goto Lfa
            if (r5 >= r4) goto Lfa
            r6 = r1[r5]
            r7 = 46
            if (r6 != r7) goto Lfa
            int r5 = r5 + 1
            r6 = 0
        Lb6:
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 > 0) goto Ld9
            int r15 = r5 + 1
            if (r15 >= r4) goto Ld9
            int r15 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r5)
            if (r15 == r13) goto Ld9
            int r7 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r7 > 0) goto Ld6
            long r11 = r11 * r21
            r33 = r14
            long r13 = (long) r15
            long r11 = r11 - r13
            int r5 = r5 + 2
            int r6 = r6 + 2
            r14 = r33
            r13 = -1
            goto Lb6
        Ld6:
            r11 = r16
            goto Lb6
        Ld9:
            r33 = r14
            if (r7 > 0) goto Lf7
            if (r5 >= r4) goto Lf7
            r14 = r1[r5]
            if (r14 < r10) goto Lff
            if (r14 > r9) goto Lff
            int r7 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r7 > 0) goto Lf4
            long r11 = r11 * r27
            long r11 = r11 + r31
            long r9 = (long) r14
            long r11 = r11 - r9
            int r5 = r5 + 1
            int r6 = r6 + 1
            goto Lff
        Lf4:
            r11 = r16
            goto Lff
        Lf7:
            r14 = r33
            goto Lff
        Lfa:
            r33 = r14
            r14 = r33
            r6 = 0
        Lff:
            int r9 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r9 > 0) goto L10e
            if (r5 != r4) goto L108
            r14 = 26
            goto L10e
        L108:
            int r10 = r5 + 1
            r5 = r1[r5]
            r14 = r5
            r5 = r10
        L10e:
            if (r9 > 0) goto L1aa
            r9 = 101(0x65, float:1.42E-43)
            if (r14 == r9) goto L13b
            r9 = 69
            if (r14 != r9) goto L119
            goto L13b
        L119:
            r7 = 76
            if (r14 == r7) goto L12d
            r7 = 70
            if (r14 == r7) goto L12d
            r7 = 68
            if (r14 == r7) goto L12d
            r7 = 66
            if (r14 == r7) goto L12d
            r7 = 83
            if (r14 != r7) goto L1aa
        L12d:
            if (r5 != r4) goto L133
            r14 = 26
            goto L1aa
        L133:
            int r7 = r5 + 1
            r5 = r1[r5]
            r14 = r5
            r5 = r7
            goto L1aa
        L13b:
            if (r5 != r4) goto L143
            r9 = r5
            r5 = 26
        L140:
            r10 = 45
            goto L148
        L143:
            int r9 = r5 + 1
            r5 = r1[r5]
            goto L140
        L148:
            if (r5 != r10) goto L14c
            r10 = 1
            goto L14d
        L14c:
            r10 = 0
        L14d:
            if (r10 != 0) goto L15e
            r15 = 43
            if (r5 != r15) goto L154
            goto L15e
        L154:
            if (r5 == r8) goto L159
        L156:
            r13 = 48
            goto L16d
        L159:
            com.alibaba.fastjson2.JSONException r1 = r0.numberError()
            throw r1
        L15e:
            if (r9 != r4) goto L163
            r5 = 26
            goto L156
        L163:
            int r5 = r9 + 1
            r9 = r1[r9]
            r34 = r9
            r9 = r5
            r5 = r34
            goto L156
        L16d:
            if (r5 < r13) goto L1a6
            r7 = 57
            if (r5 > r7) goto L1a6
            int r5 = r5 + (-48)
        L175:
            if (r9 >= r4) goto L195
            r14 = r1[r9]
            if (r14 < r13) goto L195
            if (r14 > r7) goto L195
            int r14 = r14 + (-48)
            int r5 = r5 * 10
            int r5 = r5 + r14
            r14 = 2047(0x7ff, float:2.868E-42)
            if (r5 > r14) goto L189
            int r9 = r9 + 1
            goto L175
        L189:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = eh.a.l(r5, r1)
            ah.a.w(r1)
            r1 = 0
            return r1
        L195:
            if (r10 == 0) goto L198
            int r5 = -r5
        L198:
            int r6 = r6 - r5
            if (r9 != r4) goto L19e
            r7 = 26
            goto L1a3
        L19e:
            int r5 = r9 + 1
            r7 = r1[r9]
            r9 = r5
        L1a3:
            r14 = r7
        L1a4:
            r5 = r9
            goto L1aa
        L1a6:
            r14 = r5
            r11 = r16
            goto L1a4
        L1aa:
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 > 0) goto L1c1
            if (r2 == 0) goto L1c1
            if (r14 != r2) goto L1bf
            if (r5 != r4) goto L1b8
            r2 = r5
            r5 = 26
            goto L1bc
        L1b8:
            int r2 = r5 + 1
            r5 = r1[r5]
        L1bc:
            r14 = r5
            r5 = r2
            goto L1c1
        L1bf:
            r11 = r16
        L1c1:
            int r2 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r2 > 0) goto L223
            if (r6 != 0) goto L1cc
            double r9 = (double) r11
            r7 = r1
            r13 = r2
        L1ca:
            r1 = 1
            goto L1f1
        L1cc:
            double r9 = (double) r11
            r7 = r1
            r13 = r2
            long r1 = (long) r9
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L1ee
            if (r6 <= 0) goto L1e0
            double[] r1 = com.alibaba.fastjson2.JSONFactory.DOUBLE_10_POW
            int r2 = r1.length
            if (r6 >= r2) goto L1e0
            r21 = r1[r6]
            double r9 = r9 / r21
            goto L1ca
        L1e0:
            if (r6 >= 0) goto L1ee
            double[] r1 = com.alibaba.fastjson2.JSONFactory.DOUBLE_10_POW
            int r2 = r1.length
            int r2 = -r2
            if (r6 <= r2) goto L1ee
            int r2 = -r6
            r21 = r1[r2]
            double r9 = r9 * r21
            goto L1ca
        L1ee:
            r9 = r25
            r1 = 0
        L1f1:
            if (r1 != 0) goto L214
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r6 <= r1) goto L20e
            r1 = 128(0x80, float:1.8E-43)
            if (r6 >= r1) goto L20e
            r1 = 45
            if (r3 != r1) goto L201
            r13 = -1
            goto L202
        L201:
            r13 = 1
        L202:
            long r1 = java.lang.Math.abs(r11)
            double r1 = com.alibaba.fastjson2.util.TypeUtils.doubleValue(r13, r1, r6)
        L20a:
            r3 = r14
            r13 = 0
            r14 = r1
            goto L228
        L20e:
            r3 = r14
            r11 = r16
        L211:
            r13 = 0
            r14 = r9
            goto L228
        L214:
            r1 = 45
            if (r3 == r1) goto L21e
            int r1 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r1 == 0) goto L221
        L21c:
            double r1 = -r9
            goto L20a
        L21e:
            if (r13 != 0) goto L221
            goto L21c
        L221:
            r3 = r14
            goto L211
        L223:
            r7 = r1
            r3 = r14
            r14 = r25
            r13 = 0
        L228:
            int r1 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r1 <= 0) goto L234
            r0.readNumber0()
            double r1 = r0.getDoubleValue()
            return r1
        L234:
            r1 = 4294981377(0x100003701, double:2.122002748E-314)
            r6 = 32
            if (r3 > r6) goto L250
            long r9 = r16 << r3
            long r9 = r9 & r1
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L250
            if (r5 != r4) goto L249
            r3 = 26
            goto L234
        L249:
            int r1 = r5 + 1
            r2 = r7[r5]
            r5 = r1
            r3 = r2
            goto L234
        L250:
            if (r3 != r8) goto L254
            r8 = 1
            goto L255
        L254:
            r8 = 0
        L255:
            r0.comma = r8
            if (r8 == 0) goto L27b
            if (r5 != r4) goto L25f
            r3 = r5
            r5 = 26
            goto L263
        L25f:
            int r3 = r5 + 1
            r5 = r7[r5]
        L263:
            r34 = r5
            r5 = r3
            r3 = r34
        L268:
            if (r3 > r6) goto L27b
            long r8 = r16 << r3
            long r8 = r8 & r1
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 == 0) goto L27b
            if (r5 != r4) goto L276
            r3 = 26
            goto L268
        L276:
            int r3 = r5 + 1
            r5 = r7[r5]
            goto L263
        L27b:
            r0.wasNull = r13
            char r1 = (char) r3
            r0.f1814ch = r1
            r0.offset = r5
            return r14
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readFieldName() {
            r24 = this;
            r0 = r24
            char r1 = r0.f1814ch
            r2 = 39
            r3 = 0
            if (r1 != r2) goto L1d
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r7 = r2.mask
            long r5 = r5 & r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L18
            goto L1d
        L18:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L1d:
            r2 = 34
            if (r1 == r2) goto L3f
            r2 = 39
            if (r1 == r2) goto L3f
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r7 = r2.mask
            long r5 = r5 & r7
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3d
            boolean r1 = com.alibaba.fastjson2.JSONReader.isFirstIdentifier(r1)
            if (r1 == 0) goto L3d
            java.lang.String r1 = r0.readFieldNameUnquote()
            return r1
        L3d:
            r1 = 0
            return r1
        L3f:
            byte[] r2 = r0.bytes
            r5 = 1
            r0.nameAscii = r5
            r6 = 0
            r0.nameEscape = r6
            int r7 = r0.offset
            r0.nameBegin = r7
            int r8 = r0.end
            r10 = r6
            r9 = r7
        L4f:
            r11 = 32
            if (r9 >= r8) goto Lf3
            r12 = r2[r9]
            r13 = 92
            r14 = 4
            r15 = 2
            if (r12 != r13) goto L70
            r0.nameEscape = r5
            int r11 = r9 + 1
            r11 = r2[r11]
            r12 = 117(0x75, float:1.64E-43)
            if (r11 != r12) goto L67
            r14 = 6
            goto L6d
        L67:
            r12 = 120(0x78, float:1.68E-43)
            if (r11 != r12) goto L6c
            goto L6d
        L6c:
            r14 = r15
        L6d:
            int r9 = r9 + r14
            goto Lef
        L70:
            if (r12 != r1) goto Lcc
            r0.nameLength = r10
            r0.nameEnd = r9
            int r9 = r9 + 1
            if (r9 >= r8) goto L7f
            r1 = r2[r9]
        L7c:
            r1 = r1 & 255(0xff, float:3.57E-43)
            goto L81
        L7f:
            r1 = 26
        L81:
            if (r1 > r11) goto L96
            r12 = 1
            long r12 = r12 << r1
            r16 = 4294981377(0x100003701, double:2.122002748E-314)
            long r12 = r12 & r16
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto L96
            int r9 = r9 + 1
            r1 = r2[r9]
            goto L7c
        L96:
            r10 = 58
            if (r1 != r10) goto Lc7
            int r1 = r9 + 1
            if (r1 != r8) goto La1
        L9e:
            r9 = 26
            goto La9
        La1:
            int r9 = r9 + r15
            r1 = r2[r1]
        La4:
            r23 = r9
            r9 = r1
            r1 = r23
        La9:
            if (r9 > r11) goto Lc0
            r12 = 1
            long r12 = r12 << r9
            r14 = 4294981377(0x100003701, double:2.122002748E-314)
            long r12 = r12 & r14
            int r10 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r10 == 0) goto Lc0
            if (r1 != r8) goto Lbb
            goto L9e
        Lbb:
            int r9 = r1 + 1
            r1 = r2[r1]
            goto La4
        Lc0:
            r0.offset = r1
            char r3 = (char) r9
            r0.f1814ch = r3
            r9 = r1
            goto Lf3
        Lc7:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r1)
            throw r1
        Lcc:
            if (r12 < 0) goto Ld1
            int r9 = r9 + 1
            goto Lef
        Ld1:
            boolean r11 = r0.nameAscii
            if (r11 == 0) goto Ld7
            r0.nameAscii = r6
        Ld7:
            r11 = r12 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> r14
            switch(r11) {
                case 12: goto Led;
                case 13: goto Led;
                case 14: goto Lea;
                default: goto Ldd;
            }
        Ldd:
            int r11 = r12 >> 3
            r13 = -2
            if (r11 != r13) goto Le5
            int r9 = r9 + 4
            goto Lef
        Le5:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r12)
            throw r1
        Lea:
            int r9 = r9 + 3
            goto Lef
        Led:
            int r9 = r9 + 2
        Lef:
            int r10 = r10 + 1
            goto L4f
        Lf3:
            int r1 = r0.nameEnd
            if (r1 < r7) goto L5ef
            int r1 = r1 - r7
            boolean r3 = r0.nameEscape
            if (r3 != 0) goto L5ea
            boolean r3 = r0.nameAscii
            if (r3 == 0) goto L5a5
            r12 = 40
            r13 = 24
            r14 = 16
            r15 = 8
            switch(r1) {
                case 1: goto L54a;
                case 2: goto L53e;
                case 3: goto L52c;
                case 4: goto L50e;
                case 5: goto L4e7;
                case 6: goto L4b7;
                case 7: goto L47d;
                case 8: goto L433;
                case 9: goto L3e9;
                case 10: goto L399;
                case 11: goto L343;
                case 12: goto L2e6;
                case 13: goto L27e;
                case 14: goto L20e;
                case 15: goto L197;
                case 16: goto L115;
                default: goto L10b;
            }
        L10b:
            r16 = r11
            r12 = -1
            r14 = -1
            r18 = -1
            goto L551
        L115:
            int r16 = r7 + 7
            r17 = 56
            r4 = r2[r16]
            r18 = -1
            long r8 = (long) r4
            long r8 = r8 << r17
            int r4 = r7 + 6
            r4 = r2[r4]
            r16 = r11
            r20 = 48
            long r10 = (long) r4
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r12
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r13
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 15
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 14
            r4 = r2[r4]
            r21 = r12
            r22 = r13
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 13
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
        L191:
            long r12 = (long) r4
            long r10 = r10 + r12
            r12 = r8
            r14 = r10
            goto L551
        L197:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 6
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r20
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 14
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 13
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            goto L191
        L20e:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 5
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r21
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 13
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 12
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            goto L191
        L27e:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 4
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r16
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            long r10 = (long) r4
            long r8 = r8 + r10
            int r4 = r7 + 12
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 11
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            goto L191
        L2e6:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 3
            r4 = r2[r4]
            int r4 = r4 << 24
            int r8 = r7 + 2
            r8 = r2[r8]
            int r8 = r8 << r14
            int r4 = r4 + r8
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 11
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 10
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            goto L191
        L343:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 2
            r4 = r2[r4]
            int r4 = r4 << r14
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 10
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 9
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            goto L191
        L399:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 1
            r4 = r2[r4]
            int r4 = r4 << r15
            r8 = r2[r7]
            int r4 = r4 + r8
            long r8 = (long) r4
            int r4 = r7 + 9
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 8
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 2
            r4 = r2[r4]
            goto L191
        L3e9:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            r4 = r2[r7]
            long r8 = (long) r4
            int r4 = r7 + 8
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r17
            int r4 = r7 + 7
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r20
            long r10 = r10 + r12
            int r4 = r7 + 6
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r21
            long r10 = r10 + r12
            int r4 = r7 + 5
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r16
            long r10 = r10 + r12
            int r4 = r7 + 4
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r22
            long r10 = r10 + r12
            int r4 = r7 + 3
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r14
            long r10 = r10 + r12
            int r4 = r7 + 2
            r4 = r2[r4]
            long r12 = (long) r4
            long r12 = r12 << r15
            long r10 = r10 + r12
            int r4 = r7 + 1
            r4 = r2[r4]
            goto L191
        L433:
            r16 = r11
            r21 = r12
            r22 = r13
            r17 = 56
            r18 = -1
            r20 = 48
            int r4 = r7 + 7
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r17
            int r4 = r7 + 6
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
        L476:
            long r10 = (long) r4
            long r8 = r8 + r10
        L478:
            r12 = r8
            r14 = r18
            goto L551
        L47d:
            r16 = r11
            r21 = r12
            r22 = r13
            r18 = -1
            r20 = 48
            int r4 = r7 + 6
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r20
            int r4 = r7 + 5
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L4b7:
            r16 = r11
            r21 = r12
            r22 = r13
            r18 = -1
            int r4 = r7 + 5
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r21
            int r4 = r7 + 4
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r16
            long r8 = r8 + r10
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L4e7:
            r16 = r11
            r22 = r13
            r18 = -1
            int r4 = r7 + 4
            r4 = r2[r4]
            long r8 = (long) r4
            long r8 = r8 << r16
            int r4 = r7 + 3
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r22
            long r8 = r8 + r10
            int r4 = r7 + 2
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r14
            long r8 = r8 + r10
            int r4 = r7 + 1
            r4 = r2[r4]
            long r10 = (long) r4
            long r10 = r10 << r15
            long r8 = r8 + r10
            r4 = r2[r7]
            goto L476
        L50e:
            r16 = r11
            r22 = r13
            r18 = -1
            int r4 = r7 + 3
            r4 = r2[r4]
            int r4 = r4 << 24
            int r8 = r7 + 2
            r8 = r2[r8]
            int r8 = r8 << r14
            int r4 = r4 + r8
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
        L528:
            int r4 = r4 + r8
        L529:
            long r8 = (long) r4
            goto L478
        L52c:
            r16 = r11
            r18 = -1
            int r4 = r7 + 2
            r4 = r2[r4]
            int r4 = r4 << r14
            int r8 = r7 + 1
            r8 = r2[r8]
            int r8 = r8 << r15
            int r4 = r4 + r8
            r8 = r2[r7]
            goto L528
        L53e:
            r16 = r11
            r18 = -1
            int r4 = r7 + 1
            r4 = r2[r4]
            int r4 = r4 << r15
            r8 = r2[r7]
            goto L528
        L54a:
            r16 = r11
            r18 = -1
            r4 = r2[r7]
            goto L529
        L551:
            int r4 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r4 == 0) goto L5a5
            int r4 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r4 == 0) goto L583
            long r8 = r12 ^ r14
            long r10 = r8 >>> r16
            long r8 = r8 ^ r10
            int r4 = (int) r8
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r8 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            int r9 = r8.length
            int r9 = r9 - r5
            r4 = r4 & r9
            r5 = r8[r4]
            if (r5 != 0) goto L574
            java.lang.String r11 = r0.getLatin1String(r7, r1)
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2 r10 = new com.alibaba.fastjson2.JSONFactory$NameCacheEntry2
            r10.<init>(r11, r12, r14)
            r8[r4] = r10
            return r11
        L574:
            long r8 = r5.value0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto L5a5
            long r8 = r5.value1
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 != 0) goto L5a5
            java.lang.String r1 = r5.name
            return r1
        L583:
            long r8 = r12 >>> r16
            long r8 = r8 ^ r12
            int r4 = (int) r8
            com.alibaba.fastjson2.util.NameCacheEntry[] r8 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            int r9 = r8.length
            int r9 = r9 - r5
            r4 = r4 & r9
            r5 = r8[r4]
            if (r5 != 0) goto L59c
            java.lang.String r1 = r0.getLatin1String(r7, r1)
            com.alibaba.fastjson2.util.NameCacheEntry r2 = new com.alibaba.fastjson2.util.NameCacheEntry
            r2.<init>(r1, r12)
            r8[r4] = r2
            return r1
        L59c:
            long r8 = r5.value
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 != 0) goto L5a5
            java.lang.String r1 = r5.name
            return r1
        L5a5:
            if (r3 == 0) goto L5e2
            int r3 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r4 = 34
            if (r3 >= r4) goto L5da
            char[] r3 = r0.charBuf
            if (r3 != 0) goto L5be
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r3 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r4 = r0.cacheItem
            r5 = 0
            java.lang.Object r3 = r3.getAndSet(r4, r5)
            char[] r3 = (char[]) r3
            r0.charBuf = r3
        L5be:
            if (r3 == 0) goto L5c3
            int r4 = r3.length
            if (r4 >= r1) goto L5c7
        L5c3:
            char[] r3 = new char[r1]
            r0.charBuf = r3
        L5c7:
            r4 = r6
        L5c8:
            if (r4 >= r1) goto L5d4
            int r5 = r7 + r4
            r5 = r2[r5]
            char r5 = (char) r5
            r3[r4] = r5
            int r4 = r4 + 1
            goto L5c8
        L5d4:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3, r6, r1)
            return r2
        L5da:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r2, r7, r1, r4)
            return r3
        L5e2:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r2, r7, r1, r4)
            return r3
        L5ea:
            java.lang.String r1 = r0.getFieldName()
            return r1
        L5ef:
            char r1 = r0.f1814ch
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r9, r1)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
            r29 = this;
            r0 = r29
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            r3 = 47
            if (r2 != r3) goto Lf
            r0.skipComment()
            char r2 = r0.f1814ch
        Lf:
            r3 = 39
            r4 = 0
            if (r2 != r3) goto L28
            com.alibaba.fastjson2.JSONReader$Context r6 = r0.context
            long r6 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r8 = r8.mask
            long r6 = r6 & r8
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L23
            goto L28
        L23:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L28:
            r6 = 34
            if (r2 == r6) goto L89
            if (r2 == r3) goto L89
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r6 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r8 = r1.mask
            long r6 = r6 & r8
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L46
            boolean r1 = com.alibaba.fastjson2.JSONReader.isFirstIdentifier(r2)
            if (r1 == 0) goto L46
            long r1 = r0.readFieldNameHashCodeUnquote()
            return r1
        L46:
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 == r1) goto L86
            boolean r1 = r0.isNull()
            if (r1 == 0) goto L51
            goto L86
        L51:
            r1 = 91
            if (r2 != r1) goto L76
            int r1 = r0.nameBegin
            if (r1 <= 0) goto L76
            java.lang.String r1 = r0.getFieldName()
            if (r1 == 0) goto L76
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "illegal fieldName input "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", previous fieldName "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L7c
        L76:
            java.lang.String r1 = "illegal fieldName input"
            java.lang.String r1 = eh.a.l(r2, r1)
        L7c:
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
        L83:
            r1 = 0
            return r1
        L86:
            r1 = -1
            return r1
        L89:
            r3 = 1
            r0.nameAscii = r3
            r6 = 0
            r0.nameEscape = r6
            int r7 = r0.offset
            r0.nameBegin = r7
            int r8 = r0.end
            int r9 = r7 + 9
            r15 = 8
            r16 = r4
            r4 = 92
            if (r9 >= r8) goto L247
            r5 = r1[r7]
            if (r5 != r2) goto Lb0
            r5 = r7
            r6 = r16
            r18 = 56
            r19 = 48
        Laa:
            r21 = 40
        Lac:
            r22 = 32
            goto L255
        Lb0:
            r18 = 56
            int r10 = r7 + 1
            r19 = 48
            r11 = r1[r10]
            if (r11 != r2) goto Lc8
            if (r5 == r4) goto Lc8
            if (r5 <= 0) goto Lc8
            r20 = r7
            long r6 = (long) r5
            r0.nameLength = r3
            r0.nameEnd = r10
            int r5 = r20 + 2
            goto Laa
        Lc8:
            r20 = r7
            int r7 = r20 + 2
            r6 = r1[r7]
            if (r6 != r2) goto Le9
            if (r5 == r4) goto Le9
            if (r11 == r4) goto Le9
            if (r5 < 0) goto Le9
            if (r11 <= 0) goto Le9
            int r6 = r11 << 8
            int r6 = r6 + r5
            long r5 = (long) r6
            r9 = 2
            r0.nameLength = r9
            r0.nameEnd = r7
            int r7 = r20 + 3
        Le3:
            r21 = r5
            r5 = r7
            r6 = r21
            goto Laa
        Le9:
            int r7 = r20 + 3
            r10 = r1[r7]
            if (r10 != r2) goto L10a
            if (r5 == r4) goto L10a
            if (r11 == r4) goto L10a
            if (r6 == r4) goto L10a
            if (r5 < 0) goto L10a
            if (r11 < 0) goto L10a
            if (r6 <= 0) goto L10a
            int r6 = r6 << 16
            int r9 = r11 << 8
            int r6 = r6 + r9
            int r6 = r6 + r5
            long r5 = (long) r6
            r9 = 3
            r0.nameLength = r9
            r0.nameEnd = r7
            int r7 = r20 + 4
            goto Le3
        L10a:
            int r7 = r20 + 4
            r21 = 40
            r12 = r1[r7]
            if (r12 != r2) goto L13a
            if (r5 == r4) goto L13a
            if (r11 == r4) goto L13a
            if (r6 == r4) goto L13a
            if (r10 == r4) goto L13a
            if (r5 < 0) goto L13a
            if (r11 < 0) goto L13a
            if (r6 < 0) goto L13a
            if (r10 <= 0) goto L13a
            int r9 = r10 << 24
            int r6 = r6 << 16
            int r9 = r9 + r6
            int r6 = r11 << 8
            int r9 = r9 + r6
            int r9 = r9 + r5
            long r5 = (long) r9
            r9 = 4
            r0.nameLength = r9
            r0.nameEnd = r7
            int r7 = r20 + 5
            r27 = r5
            r5 = r7
            r6 = r27
            goto Lac
        L13a:
            int r7 = r20 + 5
            r22 = 32
            r14 = r1[r7]
            if (r14 != r2) goto L175
            if (r5 == r4) goto L175
            if (r11 == r4) goto L175
            if (r6 == r4) goto L175
            if (r10 == r4) goto L175
            if (r12 == r4) goto L175
            if (r5 < 0) goto L175
            if (r11 < 0) goto L175
            if (r6 < 0) goto L175
            if (r10 < 0) goto L175
            if (r12 <= 0) goto L175
            long r13 = (long) r12
            long r12 = r13 << r22
            int r9 = r10 << 24
            long r9 = (long) r9
            long r12 = r12 + r9
            int r6 = r6 << 16
            long r9 = (long) r6
            long r12 = r12 + r9
            int r6 = r11 << 8
            long r9 = (long) r6
            long r12 = r12 + r9
            long r5 = (long) r5
            long r5 = r5 + r12
            r9 = 5
            r0.nameLength = r9
            r0.nameEnd = r7
            int r7 = r20 + 6
            r27 = r5
            r5 = r7
            r6 = r27
            goto L255
        L175:
            int r7 = r20 + 6
            r13 = r1[r7]
            if (r13 != r2) goto L1b3
            if (r5 == r4) goto L1b3
            if (r11 == r4) goto L1b3
            if (r6 == r4) goto L1b3
            if (r10 == r4) goto L1b3
            if (r12 == r4) goto L1b3
            if (r14 == r4) goto L1b3
            if (r5 < 0) goto L1b3
            if (r11 < 0) goto L1b3
            if (r6 < 0) goto L1b3
            if (r10 < 0) goto L1b3
            if (r12 < 0) goto L1b3
            if (r14 <= 0) goto L1b3
            long r13 = (long) r14
            long r13 = r13 << r21
            long r3 = (long) r12
            long r3 = r3 << r22
            long r13 = r13 + r3
            int r3 = r10 << 24
            long r3 = (long) r3
            long r13 = r13 + r3
            int r3 = r6 << 16
            long r3 = (long) r3
            long r13 = r13 + r3
            int r3 = r11 << 8
            long r3 = (long) r3
            long r13 = r13 + r3
            long r3 = (long) r5
            long r3 = r3 + r13
            r5 = 6
            r0.nameLength = r5
            r0.nameEnd = r7
            int r7 = r20 + 7
        L1af:
            r5 = r7
            r6 = r3
            goto L255
        L1b3:
            int r7 = r20 + 7
            r3 = r1[r7]
            if (r3 != r2) goto L1f8
            r4 = 92
            if (r5 == r4) goto L1f8
            if (r11 == r4) goto L1f8
            if (r6 == r4) goto L1f8
            if (r10 == r4) goto L1f8
            if (r12 == r4) goto L1f8
            if (r14 == r4) goto L1f8
            if (r13 == r4) goto L1f8
            if (r5 < 0) goto L1f8
            if (r11 < 0) goto L1f8
            if (r6 < 0) goto L1f8
            if (r10 < 0) goto L1f8
            if (r12 < 0) goto L1f8
            if (r14 < 0) goto L1f8
            if (r13 <= 0) goto L1f8
            long r3 = (long) r13
            long r3 = r3 << r19
            long r13 = (long) r14
            long r13 = r13 << r21
            long r3 = r3 + r13
            long r12 = (long) r12
            long r12 = r12 << r22
            long r3 = r3 + r12
            int r9 = r10 << 24
            long r9 = (long) r9
            long r3 = r3 + r9
            int r6 = r6 << 16
            long r9 = (long) r6
            long r3 = r3 + r9
            int r6 = r11 << 8
            long r9 = (long) r6
            long r3 = r3 + r9
            long r5 = (long) r5
            long r3 = r3 + r5
            r5 = 7
            r0.nameLength = r5
            r0.nameEnd = r7
            int r7 = r20 + 8
            goto L1af
        L1f8:
            int r7 = r20 + 8
            r4 = r1[r7]
            if (r4 != r2) goto L251
            r4 = 92
            if (r5 == r4) goto L251
            if (r11 == r4) goto L251
            if (r6 == r4) goto L251
            if (r10 == r4) goto L251
            if (r12 == r4) goto L251
            if (r14 == r4) goto L251
            if (r13 == r4) goto L251
            if (r3 == r4) goto L251
            if (r5 < 0) goto L251
            if (r11 < 0) goto L251
            if (r6 < 0) goto L251
            if (r10 < 0) goto L251
            if (r12 < 0) goto L251
            if (r14 < 0) goto L251
            if (r13 < 0) goto L251
            if (r3 <= 0) goto L251
            long r3 = (long) r3
            long r3 = r3 << r18
            r25 = r3
            long r3 = (long) r13
            long r3 = r3 << r19
            long r3 = r25 + r3
            long r13 = (long) r14
            long r13 = r13 << r21
            long r3 = r3 + r13
            long r12 = (long) r12
            long r12 = r12 << r22
            long r3 = r3 + r12
            int r10 = r10 << 24
            long r12 = (long) r10
            long r3 = r3 + r12
            int r6 = r6 << 16
            long r12 = (long) r6
            long r3 = r3 + r12
            int r6 = r11 << 8
            long r10 = (long) r6
            long r3 = r3 + r10
            long r5 = (long) r5
            long r3 = r3 + r5
            r0.nameLength = r15
            r0.nameEnd = r7
            r6 = r3
            r5 = r9
            goto L255
        L247:
            r20 = r7
            r18 = 56
            r19 = 48
            r21 = 40
            r22 = 32
        L251:
            r6 = r16
            r5 = r20
        L255:
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r4 = 120(0x78, float:1.68E-43)
            r9 = 117(0x75, float:1.64E-43)
            if (r3 != 0) goto L32e
            r3 = 0
        L25e:
            if (r5 >= r8) goto L32e
            r10 = r1[r5]
            if (r10 != r2) goto L272
            if (r3 != 0) goto L26a
            int r5 = r0.nameBegin
            goto L32e
        L26a:
            r0.nameLength = r3
            r0.nameEnd = r5
            int r5 = r5 + 1
            goto L32e
        L272:
            r11 = 255(0xff, float:3.57E-43)
            r12 = 92
            if (r10 != r12) goto L2b6
            r12 = 1
            r0.nameEscape = r12
            int r10 = r5 + 1
            r12 = r1[r10]
            if (r12 == r9) goto L29a
            if (r12 == r4) goto L28d
            char r5 = r0.char1(r12)
            r27 = r10
            r10 = r5
            r5 = r27
            goto L2ae
        L28d:
            int r10 = r5 + 2
            r10 = r1[r10]
            int r5 = r5 + 3
            r12 = r1[r5]
            char r10 = com.alibaba.fastjson2.JSONReader.char2(r10, r12)
            goto L2ae
        L29a:
            int r10 = r5 + 2
            r10 = r1[r10]
            int r12 = r5 + 3
            r12 = r1[r12]
            int r13 = r5 + 4
            r13 = r1[r13]
            int r5 = r5 + 5
            r14 = r1[r5]
            char r10 = com.alibaba.fastjson2.JSONReader.char4(r10, r12, r13, r14)
        L2ae:
            if (r10 <= r11) goto L2b3
            r12 = 0
            r0.nameAscii = r12
        L2b3:
            r23 = 6
            goto L2cf
        L2b6:
            r12 = -61
            if (r10 == r12) goto L2be
            r12 = -62
            if (r10 != r12) goto L2b3
        L2be:
            int r5 = r5 + 1
            r12 = r1[r5]
            r10 = r10 & 31
            r23 = 6
            int r10 = r10 << 6
            r12 = r12 & 63
            r10 = r10 | r12
            char r10 = (char) r10
            r12 = 0
            r0.nameAscii = r12
        L2cf:
            if (r10 > r11) goto L32a
            if (r10 < 0) goto L32a
            if (r3 >= r15) goto L32a
            if (r3 != 0) goto L2da
            if (r10 != 0) goto L2da
            goto L32a
        L2da:
            switch(r3) {
                case 0: goto L321;
                case 1: goto L31b;
                case 2: goto L313;
                case 3: goto L30b;
                case 4: goto L301;
                case 5: goto L2f7;
                case 6: goto L2ed;
                case 7: goto L2e0;
                default: goto L2dd;
            }
        L2dd:
            r24 = 1
            goto L324
        L2e0:
            byte r10 = (byte) r10
            long r10 = (long) r10
            long r10 = r10 << r18
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L2e9:
            long r6 = r6 & r12
            long r10 = r10 + r6
            r6 = r10
            goto L2dd
        L2ed:
            byte r10 = (byte) r10
            long r10 = (long) r10
            long r10 = r10 << r19
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L2e9
        L2f7:
            byte r10 = (byte) r10
            long r10 = (long) r10
            long r10 = r10 << r21
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L2e9
        L301:
            byte r10 = (byte) r10
            long r10 = (long) r10
            long r10 = r10 << r22
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L2e9
        L30b:
            byte r10 = (byte) r10
            int r10 = r10 << 24
            long r10 = (long) r10
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto L2e9
        L313:
            byte r10 = (byte) r10
            int r10 = r10 << 16
            long r10 = (long) r10
            r12 = 65535(0xffff, double:3.23786E-319)
            goto L2e9
        L31b:
            byte r10 = (byte) r10
            int r10 = r10 << r15
            long r10 = (long) r10
            r12 = 255(0xff, double:1.26E-321)
            goto L2e9
        L321:
            byte r6 = (byte) r10
            long r6 = (long) r6
            goto L2dd
        L324:
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L25e
        L32a:
            int r5 = r0.nameBegin
            r6 = r16
        L32e:
            int r3 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r3 == 0) goto L333
            goto L394
        L333:
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r12 = 0
        L339:
            r3 = r1[r5]
            r10 = 92
            if (r3 != r10) goto L38a
            r11 = 1
            r0.nameEscape = r11
            int r3 = r5 + 1
            r11 = r1[r3]
            if (r11 == r9) goto L363
            if (r11 == r4) goto L351
            char r5 = r0.char1(r11)
        L34e:
            r24 = 1
            goto L378
        L351:
            int r3 = r5 + 2
            r3 = r1[r3]
            int r5 = r5 + 3
            r11 = r1[r5]
            char r3 = com.alibaba.fastjson2.JSONReader.char2(r3, r11)
        L35d:
            r24 = r5
            r5 = r3
            r3 = r24
            goto L34e
        L363:
            int r3 = r5 + 2
            r3 = r1[r3]
            int r11 = r5 + 3
            r11 = r1[r11]
            int r13 = r5 + 4
            r13 = r1[r13]
            int r5 = r5 + 5
            r14 = r1[r5]
            char r3 = com.alibaba.fastjson2.JSONReader.char4(r3, r11, r13, r14)
            goto L35d
        L378:
            int r3 = r3 + 1
            long r13 = (long) r5
            long r5 = r6 ^ r13
            r13 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r5 = r5 * r13
            r6 = r5
            r11 = r22
            r13 = 0
            r5 = r3
            goto L43a
        L38a:
            r24 = 1
            if (r3 != r2) goto L3f9
            r0.nameLength = r12
            r0.nameEnd = r5
            int r5 = r5 + 1
        L394:
            r2 = 26
            if (r5 != r8) goto L39a
            r4 = r2
            goto L39f
        L39a:
            int r3 = r5 + 1
            r4 = r1[r5]
            r5 = r3
        L39f:
            r3 = r22
        L3a1:
            if (r4 > r3) goto L3bc
            r9 = 1
            long r9 = r9 << r4
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 == 0) goto L3bc
            if (r5 != r8) goto L3b4
            r4 = r2
            goto L3b9
        L3b4:
            int r3 = r5 + 1
            r4 = r1[r5]
            r5 = r3
        L3b9:
            r3 = 32
            goto L3a1
        L3bc:
            r3 = 58
            if (r4 != r3) goto L3ea
            if (r5 != r8) goto L3c4
            r4 = r2
            goto L3c9
        L3c4:
            int r3 = r5 + 1
            r4 = r1[r5]
            r5 = r3
        L3c9:
            r11 = 32
        L3cb:
            if (r4 > r11) goto L3e4
            r9 = 1
            long r9 = r9 << r4
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r12
            int r3 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r3 == 0) goto L3e4
            if (r5 != r8) goto L3de
            r4 = r2
            goto L3cb
        L3de:
            int r3 = r5 + 1
            r4 = r1[r5]
            r5 = r3
            goto L3cb
        L3e4:
            r0.offset = r5
            char r1 = (char) r4
            r0.f1814ch = r1
            return r6
        L3ea:
            java.lang.String r1 = "expect ':', but "
            java.lang.String r1 = eh.a.l(r4, r1)
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            goto L83
        L3f9:
            r11 = r22
            if (r3 < 0) goto L401
            int r5 = r5 + 1
            r13 = 0
            goto L432
        L401:
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r13 = r3 >> 4
            switch(r13) {
                case 12: goto L425;
                case 13: goto L425;
                case 14: goto L413;
                default: goto L408;
            }
        L408:
            java.lang.String r1 = "malformed input around byte "
            java.lang.String r1 = eh.a.l(r5, r1)
            ah.a.w(r1)
            goto L83
        L413:
            int r13 = r5 + 1
            r13 = r1[r13]
            int r14 = r5 + 2
            r14 = r1[r14]
            int r3 = char2_utf8(r3, r13, r14, r5)
            int r5 = r5 + 3
            r13 = 0
            r0.nameAscii = r13
            goto L432
        L425:
            r13 = 0
            int r14 = r5 + 1
            r14 = r1[r14]
            int r3 = char2_utf8(r3, r14, r5)
            int r5 = r5 + 2
            r0.nameAscii = r13
        L432:
            long r14 = (long) r3
            long r6 = r6 ^ r14
            r14 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r6 = r6 * r14
        L43a:
            int r12 = r12 + 1
            r22 = r11
            goto L339
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
            r28 = this;
            r0 = r28
            r1 = 0
            r0.nameEscape = r1
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
            char r5 = r0.f1814ch
            int r6 = r2 + (-1)
            r0.nameBegin = r6
            r9 = r1
            r8 = r5
            r10 = 0
        L15:
            r16 = 0
            r6 = 93
            r7 = 91
            r1 = 13
            r19 = 4294981377(0x100003701, double:2.122002748E-314)
            r21 = 1
            r12 = 12
            r13 = 58
            r14 = 26
            r15 = 1
            if (r2 > r3) goto L17c
            if (r8 == r12) goto L15a
            if (r8 == r1) goto L15a
            if (r8 == r14) goto L15a
            if (r8 == r13) goto L15a
            if (r8 == r7) goto L15a
            if (r8 == r6) goto L15a
            r6 = 123(0x7b, float:1.72E-43)
            if (r8 == r6) goto L15a
            r6 = 125(0x7d, float:1.75E-43)
            if (r8 == r6) goto L15a
            r6 = 32
            if (r8 == r6) goto L15a
            r6 = 33
            if (r8 == r6) goto L15a
            switch(r8) {
                case 8: goto L15a;
                case 9: goto L15a;
                case 10: goto L15a;
                default: goto L4c;
            }
        L4c:
            switch(r8) {
                case 40: goto L15a;
                case 41: goto L15a;
                case 42: goto L15a;
                case 43: goto L15a;
                case 44: goto L15a;
                case 45: goto L15a;
                case 46: goto L15a;
                case 47: goto L15a;
                default: goto L4f;
            }
        L4f:
            switch(r8) {
                case 60: goto L15a;
                case 61: goto L15a;
                case 62: goto L15a;
                default: goto L52;
            }
        L52:
            r6 = 92
            if (r8 != r6) goto Laa
            r0.nameEscape = r15
            int r8 = r2 + 1
            r7 = r4[r2]
            char r7 = (char) r7
            r1 = 34
            if (r7 == r1) goto La8
            if (r7 == r13) goto La8
            r1 = 64
            if (r7 == r1) goto La8
            if (r7 == r6) goto La8
            r1 = 117(0x75, float:1.64E-43)
            if (r7 == r1) goto L93
            r1 = 120(0x78, float:1.68E-43)
            if (r7 == r1) goto L86
            r1 = 42
            if (r7 == r1) goto La8
            r1 = 43
            if (r7 == r1) goto La8
            switch(r7) {
                case 45: goto La8;
                case 46: goto La8;
                case 47: goto La8;
                default: goto L7c;
            }
        L7c:
            switch(r7) {
                case 60: goto La8;
                case 61: goto La8;
                case 62: goto La8;
                default: goto L7f;
            }
        L7f:
            char r1 = r0.char1(r7)
            r2 = r8
            r8 = r1
            goto Laa
        L86:
            r1 = r4[r8]
            int r6 = r2 + 2
            r6 = r4[r6]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r1, r6)
            int r2 = r2 + 3
            goto Laa
        L93:
            r1 = r4[r8]
            int r6 = r2 + 2
            r6 = r4[r6]
            int r7 = r2 + 3
            r7 = r4[r7]
            int r8 = r2 + 4
            r8 = r4[r8]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r1, r6, r7, r8)
            int r2 = r2 + 5
            goto Laa
        La8:
            r2 = r8
            r8 = r7
        Laa:
            if (r8 >= 0) goto Lf2
            r1 = r8 & 255(0xff, float:3.57E-43)
            int r6 = r1 >> 4
            switch(r6) {
                case 12: goto Le9;
                case 13: goto Le9;
                case 14: goto Ldc;
                default: goto Lb3;
            }
        Lb3:
            int r1 = r8 >> 3
            r6 = -2
            if (r1 != r6) goto Ld0
            r1 = r4[r2]
            int r6 = r2 + 1
            r6 = r4[r6]
            int r7 = r2 + 2
            r7 = r4[r7]
            int r8 = r8 << 18
            int r1 = r1 << r12
            r1 = r1 ^ r8
            int r6 = r6 << 6
            r1 = r1 ^ r6
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r6 = r6 ^ r7
            r8 = r1 ^ r6
            goto Lf2
        Ld0:
            java.lang.String r1 = "malformed input around byte "
            java.lang.String r1 = eh.a.l(r2, r1)
            ah.a.w(r1)
        Ld9:
            r1 = 0
            return r1
        Ldc:
            r6 = r4[r2]
            int r7 = r2 + 1
            r7 = r4[r7]
            int r8 = char2_utf8(r1, r6, r7, r2)
            int r2 = r2 + 2
            goto Lf2
        Le9:
            int r6 = r2 + 1
            r2 = r4[r2]
            int r8 = char2_utf8(r1, r2, r6)
            r2 = r6
        Lf2:
            r1 = 255(0xff, float:3.57E-43)
            if (r8 > r1) goto L153
            r1 = 8
            if (r9 >= r1) goto L153
            if (r9 != 0) goto Lff
            if (r8 != 0) goto Lff
            goto L153
        Lff:
            byte r1 = (byte) r8
            switch(r9) {
                case 0: goto L143;
                case 1: goto L13d;
                case 2: goto L136;
                case 3: goto L12f;
                case 4: goto L124;
                case 5: goto L11a;
                case 6: goto L110;
                case 7: goto L104;
                default: goto L103;
            }
        L103:
            goto L144
        L104:
            long r6 = (long) r1
            r1 = 56
            long r6 = r6 << r1
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L10d:
            long r10 = r10 & r12
            long r10 = r10 + r6
            goto L144
        L110:
            long r6 = (long) r1
            r1 = 48
            long r6 = r6 << r1
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L10d
        L11a:
            long r6 = (long) r1
            r1 = 40
            long r6 = r6 << r1
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L10d
        L124:
            long r6 = (long) r1
            r24 = 32
            long r6 = r6 << r24
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L10d
        L12f:
            int r1 = r1 << 24
            long r6 = (long) r1
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto L10d
        L136:
            int r1 = r1 << 16
            long r6 = (long) r1
            r12 = 65535(0xffff, double:3.23786E-319)
            goto L10d
        L13d:
            int r1 = r1 << 8
            long r6 = (long) r1
            r12 = 255(0xff, double:1.26E-321)
            goto L10d
        L143:
            long r10 = (long) r1
        L144:
            if (r2 != r3) goto L148
            r8 = r14
            goto L14e
        L148:
            int r1 = r2 + 1
            r2 = r4[r2]
            r8 = r2
            r2 = r1
        L14e:
            int r9 = r9 + 1
            r1 = 0
            goto L15
        L153:
            int r1 = r0.nameBegin
            int r2 = r1 + 1
            r10 = r16
            goto L17d
        L15a:
            r0.nameLength = r9
            if (r8 != r14) goto L160
            r1 = r2
            goto L162
        L160:
            int r1 = r2 + (-1)
        L162:
            r0.nameEnd = r1
            r6 = 32
            if (r8 > r6) goto L17c
            long r5 = r21 << r8
            long r5 = r5 & r19
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r1 == 0) goto L17c
            if (r2 != r3) goto L174
            r5 = r14
            goto L17d
        L174:
            int r1 = r2 + 1
            r2 = r4[r2]
            char r2 = (char) r2
            r5 = r2
            r2 = r1
            goto L17d
        L17c:
            r5 = r8
        L17d:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto L183
            goto L2cd
        L183:
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r6
            r1 = 0
        L18a:
            r8 = 92
            if (r5 != r8) goto L1f3
            r0.nameEscape = r15
            int r5 = r2 + 1
            r9 = r4[r2]
            r6 = 34
            r25 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            if (r9 == r6) goto L1e1
            if (r9 == r13) goto L1e1
            r7 = 64
            if (r9 == r7) goto L1e1
            if (r9 == r8) goto L1e1
            r7 = 117(0x75, float:1.64E-43)
            if (r9 == r7) goto L1cd
            r7 = 120(0x78, float:1.68E-43)
            if (r9 == r7) goto L1c0
            r2 = 42
            if (r9 == r2) goto L1e1
            r2 = 43
            if (r9 == r2) goto L1e1
            switch(r9) {
                case 45: goto L1e1;
                case 46: goto L1e1;
                case 47: goto L1e1;
                default: goto L1b8;
            }
        L1b8:
            switch(r9) {
                case 60: goto L1e1;
                case 61: goto L1e1;
                case 62: goto L1e1;
                default: goto L1bb;
            }
        L1bb:
            char r9 = r0.char1(r9)
            goto L1e1
        L1c0:
            r5 = r4[r5]
            int r7 = r2 + 2
            r7 = r4[r7]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r5, r7)
            int r5 = r2 + 3
            goto L1e1
        L1cd:
            r5 = r4[r5]
            int r7 = r2 + 2
            r7 = r4[r7]
            int r9 = r2 + 3
            r9 = r4[r9]
            int r23 = r2 + 4
            r6 = r4[r23]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r5, r7, r9, r6)
            int r5 = r2 + 5
        L1e1:
            long r6 = (long) r9
            long r6 = r6 ^ r10
            long r6 = r6 * r25
            if (r5 != r3) goto L1ea
            r2 = r5
            r5 = r14
            goto L1ee
        L1ea:
            int r2 = r5 + 1
            r5 = r4[r5]
        L1ee:
            r10 = r6
            r9 = 93
            goto L2a8
        L1f3:
            r25 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            if (r5 == r12) goto L2ac
            r6 = 13
            if (r5 == r6) goto L2ac
            if (r5 == r14) goto L2ac
            if (r5 == r13) goto L2ac
            r7 = 91
            if (r5 == r7) goto L2ac
            r9 = 93
            if (r5 == r9) goto L2ac
            r6 = 123(0x7b, float:1.72E-43)
            if (r5 == r6) goto L2ac
            r6 = 125(0x7d, float:1.75E-43)
            if (r5 == r6) goto L2ac
            r6 = 32
            if (r5 == r6) goto L2ac
            r6 = 33
            if (r5 == r6) goto L2ac
            switch(r5) {
                case 8: goto L2ac;
                case 9: goto L2ac;
                case 10: goto L2ac;
                default: goto L21d;
            }
        L21d:
            switch(r5) {
                case 40: goto L2ac;
                case 41: goto L2ac;
                case 42: goto L2ac;
                case 43: goto L2ac;
                case 44: goto L2ac;
                case 45: goto L2ac;
                case 46: goto L2ac;
                case 47: goto L2ac;
                default: goto L220;
            }
        L220:
            switch(r5) {
                case 60: goto L2ac;
                case 61: goto L2ac;
                case 62: goto L2ac;
                default: goto L223;
            }
        L223:
            if (r5 >= 0) goto L27b
            r6 = r5 & 255(0xff, float:3.57E-43)
            int r23 = r6 >> 4
            switch(r23) {
                case 12: goto L26a;
                case 13: goto L26a;
                case 14: goto L25a;
                default: goto L22c;
            }
        L22c:
            int r6 = r5 >> 3
            r7 = -2
            if (r6 != r7) goto L24f
            r6 = r4[r2]
            int r7 = r2 + 1
            r7 = r4[r7]
            int r23 = r2 + 2
            r23 = r4[r23]
            int r5 = r5 << 18
            int r6 = r6 << r12
            r5 = r5 ^ r6
            int r6 = r7 << 6
            r5 = r5 ^ r6
            r6 = 3678080(0x381f80, float:5.154088E-39)
            r6 = r23 ^ r6
            r5 = r5 ^ r6
            int r2 = r2 + 3
            r6 = 0
            r0.nameAscii = r6
            r7 = r6
            goto L27c
        L24f:
            java.lang.String r1 = "malformed input around byte "
            java.lang.String r1 = eh.a.l(r2, r1)
            ah.a.w(r1)
            goto Ld9
        L25a:
            r5 = r4[r2]
            int r7 = r2 + 1
            r7 = r4[r7]
            int r5 = char2_utf8(r6, r5, r7, r2)
            int r2 = r2 + 2
            r7 = 0
            r0.nameAscii = r7
            goto L27c
        L26a:
            r7 = 0
            int r5 = r2 + 1
            r2 = r4[r2]
            int r2 = char2_utf8(r6, r2, r5)
            r0.nameAscii = r7
            r27 = r5
            r5 = r2
            r2 = r27
            goto L27c
        L27b:
            r7 = 0
        L27c:
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r5 <= r6) goto L299
            int r6 = r5 >>> 10
            r18 = 55232(0xd7c0, float:7.7397E-41)
            int r6 = r6 + r18
            long r7 = (long) r6
            long r6 = r10 ^ r7
            long r6 = r6 * r25
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r8 = 56320(0xdc00, float:7.8921E-41)
            int r5 = r5 + r8
            long r10 = (long) r5
            long r5 = r6 ^ r10
        L296:
            long r5 = r5 * r25
            goto L29c
        L299:
            long r5 = (long) r5
            long r5 = r5 ^ r10
            goto L296
        L29c:
            if (r2 != r3) goto L2a1
            r7 = r2
            r2 = r14
            goto L2a5
        L2a1:
            int r7 = r2 + 1
            r2 = r4[r2]
        L2a5:
            r10 = r5
            r5 = r2
            r2 = r7
        L2a8:
            int r1 = r1 + 1
            goto L18a
        L2ac:
            r0.nameLength = r1
            if (r5 != r14) goto L2b2
            r1 = r2
            goto L2b4
        L2b2:
            int r1 = r2 + (-1)
        L2b4:
            r0.nameEnd = r1
        L2b6:
            r6 = 32
            if (r5 > r6) goto L2cd
            long r6 = r21 << r5
            long r6 = r6 & r19
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L2cd
            if (r2 != r3) goto L2c6
            r5 = r14
            goto L2b6
        L2c6:
            int r1 = r2 + 1
            r2 = r4[r2]
            r5 = r2
            r2 = r1
            goto L2b6
        L2cd:
            if (r5 != r13) goto L2f1
            if (r2 != r3) goto L2d4
            r1 = r2
            r2 = r14
            goto L2d9
        L2d4:
            int r1 = r2 + 1
            r2 = r4[r2]
            char r2 = (char) r2
        L2d9:
            r5 = r2
            r6 = 32
        L2dc:
            r2 = r1
        L2dd:
            if (r5 > r6) goto L2f1
            long r7 = r21 << r5
            long r7 = r7 & r19
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto L2f1
            if (r2 != r3) goto L2eb
            r5 = r14
            goto L2dd
        L2eb:
            int r1 = r2 + 1
            r2 = r4[r2]
            r5 = r2
            goto L2dc
        L2f1:
            r0.offset = r2
            char r1 = (char) r5
            r0.f1814ch = r1
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final float readFloatValue() {
            r32 = this;
            r0 = r32
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            int r3 = r0.offset
            int r4 = r0.end
            r5 = 34
            if (r2 == r5) goto L17
            r5 = 39
            if (r2 != r5) goto L13
            goto L17
        L13:
            r5 = r3
            r3 = r2
            r2 = 0
            goto L21
        L17:
            if (r3 != r4) goto L1d
            r5 = r3
            r3 = 26
            goto L21
        L1d:
            int r5 = r3 + 1
            r3 = r1[r3]
        L21:
            r8 = 44
            if (r2 == 0) goto L3b
            if (r3 != r2) goto L3b
            if (r5 != r4) goto L2c
            r3 = 26
            goto L31
        L2c:
            int r2 = r5 + 1
            r3 = r1[r5]
            r5 = r2
        L31:
            r11 = 0
            r13 = 1
            r14 = 0
            r16 = 1
            r18 = 0
            goto L20c
        L3b:
            r15 = 43
            r6 = 45
            r7 = 57
            r16 = 1
            r9 = 48
            if (r3 < r9) goto L4f
            if (r3 > r7) goto L4f
            int r10 = 48 - r3
            r18 = 0
            long r11 = (long) r10
            goto L57
        L4f:
            r18 = 0
            if (r3 == r6) goto L55
            if (r3 != r15) goto L7a
        L55:
            r11 = r18
        L57:
            int r10 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            r20 = 100
            r22 = -92233720368547758(0xfeb851eb851eb852, double:-2.605908932677002E302)
            r13 = -1
            if (r10 > 0) goto L7d
            r24 = 0
            int r14 = r5 + 1
            if (r14 >= r4) goto L7f
            int r14 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r5)
            if (r14 == r13) goto L7f
            int r10 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r10 > 0) goto L7a
            long r11 = r11 * r20
            long r13 = (long) r14
            long r11 = r11 - r13
            int r5 = r5 + 2
            goto L57
        L7a:
            r11 = r16
            goto L57
        L7d:
            r24 = 0
        L7f:
            r25 = 48
            r27 = 10
            r29 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            if (r10 > 0) goto La2
            if (r5 >= r4) goto La2
            r10 = r1[r5]
            if (r10 < r9) goto La3
            if (r10 > r7) goto La3
            int r14 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r14 > 0) goto L9f
            long r11 = r11 * r27
            long r11 = r11 + r25
            long r6 = (long) r10
            long r11 = r11 - r6
            int r5 = r5 + 1
            goto La3
        L9f:
            r11 = r16
            goto La3
        La2:
            r10 = r3
        La3:
            int r6 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r6 > 0) goto Lef
            if (r5 >= r4) goto Lef
            r6 = r1[r5]
            r7 = 46
            if (r6 != r7) goto Lef
            int r5 = r5 + 1
            r6 = 0
        Lb2:
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 > 0) goto Ld1
            int r14 = r5 + 1
            if (r14 >= r4) goto Ld1
            int r14 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r5)
            if (r14 == r13) goto Ld1
            int r7 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r7 > 0) goto Lce
            long r11 = r11 * r20
            long r13 = (long) r14
            long r11 = r11 - r13
            int r5 = r5 + 2
            int r6 = r6 + 2
            r13 = -1
            goto Lb2
        Lce:
            r11 = r16
            goto Lb2
        Ld1:
            if (r7 > 0) goto Lf0
            if (r5 >= r4) goto Lf0
            r10 = r1[r5]
            if (r10 < r9) goto Lf0
            r7 = 57
            if (r10 > r7) goto Lf0
            int r7 = (r29 > r11 ? 1 : (r29 == r11 ? 0 : -1))
            if (r7 > 0) goto Lec
            long r11 = r11 * r27
            long r11 = r11 + r25
            long r13 = (long) r10
            long r11 = r11 - r13
            int r5 = r5 + 1
            int r6 = r6 + 1
            goto Lf0
        Lec:
            r11 = r16
            goto Lf0
        Lef:
            r6 = 0
        Lf0:
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 > 0) goto L102
            if (r5 != r4) goto Lf9
            r10 = 26
            goto L102
        Lf9:
            int r10 = r5 + 1
            r5 = r1[r5]
            r31 = r10
            r10 = r5
            r5 = r31
        L102:
            if (r7 > 0) goto L197
            r7 = 101(0x65, float:1.42E-43)
            if (r10 == r7) goto L12f
            r7 = 69
            if (r10 != r7) goto L10d
            goto L12f
        L10d:
            r7 = 76
            if (r10 == r7) goto L121
            r7 = 70
            if (r10 == r7) goto L121
            r7 = 68
            if (r10 == r7) goto L121
            r7 = 66
            if (r10 == r7) goto L121
            r7 = 83
            if (r10 != r7) goto L197
        L121:
            if (r5 != r4) goto L127
            r10 = 26
            goto L197
        L127:
            int r7 = r5 + 1
            r5 = r1[r5]
            r10 = r5
            r5 = r7
            goto L197
        L12f:
            if (r5 != r4) goto L137
            r7 = r5
            r5 = 26
        L134:
            r14 = 45
            goto L13c
        L137:
            int r7 = r5 + 1
            r5 = r1[r5]
            goto L134
        L13c:
            if (r5 != r14) goto L140
            r10 = 1
            goto L141
        L140:
            r10 = 0
        L141:
            if (r10 != 0) goto L14e
            if (r5 != r15) goto L146
            goto L14e
        L146:
            if (r5 == r8) goto L149
            goto L15c
        L149:
            com.alibaba.fastjson2.JSONException r1 = r0.numberError()
            throw r1
        L14e:
            if (r7 != r4) goto L153
            r5 = 26
            goto L15c
        L153:
            int r5 = r7 + 1
            r7 = r1[r7]
            r31 = r7
            r7 = r5
            r5 = r31
        L15c:
            if (r5 < r9) goto L193
            r13 = 57
            if (r5 > r13) goto L193
            int r5 = r5 + (-48)
        L164:
            if (r7 >= r4) goto L183
            r15 = r1[r7]
            if (r15 < r9) goto L183
            if (r15 > r13) goto L183
            int r15 = r15 + (-48)
            int r5 = r5 * 10
            int r5 = r5 + r15
            r15 = 2047(0x7ff, float:2.868E-42)
            if (r5 > r15) goto L178
            int r7 = r7 + 1
            goto L164
        L178:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = eh.a.l(r5, r1)
            ah.a.w(r1)
            r1 = 0
            return r1
        L183:
            if (r10 == 0) goto L186
            int r5 = -r5
        L186:
            int r6 = r6 - r5
            if (r7 != r4) goto L18d
            r5 = r7
            r7 = 26
            goto L191
        L18d:
            int r5 = r7 + 1
            r7 = r1[r7]
        L191:
            r10 = r7
            goto L197
        L193:
            r10 = r5
            r5 = r7
            r11 = r16
        L197:
            int r7 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r7 > 0) goto L1ae
            if (r2 == 0) goto L1ae
            if (r10 != r2) goto L1ac
            if (r5 != r4) goto L1a5
            r2 = r5
            r5 = 26
            goto L1a9
        L1a5:
            int r2 = r5 + 1
            r5 = r1[r5]
        L1a9:
            r10 = r5
            r5 = r2
            goto L1ae
        L1ac:
            r11 = r16
        L1ae:
            int r2 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r2 > 0) goto L208
            if (r6 != 0) goto L1b7
            float r7 = (float) r11
        L1b5:
            r9 = 1
            goto L1d8
        L1b7:
            float r7 = (float) r11
            long r14 = (long) r7
            int r9 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r9 != 0) goto L1d5
            if (r6 <= 0) goto L1c8
            float[] r9 = com.alibaba.fastjson2.JSONFactory.FLOAT_10_POW
            int r13 = r9.length
            if (r6 >= r13) goto L1c8
            r9 = r9[r6]
            float r7 = r7 / r9
            goto L1b5
        L1c8:
            if (r6 >= 0) goto L1d5
            float[] r9 = com.alibaba.fastjson2.JSONFactory.FLOAT_10_POW
            int r13 = r9.length
            int r13 = -r13
            if (r6 <= r13) goto L1d5
            int r13 = -r6
            r9 = r9[r13]
            float r7 = r7 * r9
            goto L1b5
        L1d5:
            r7 = r24
            r9 = 0
        L1d8:
            if (r9 != 0) goto L1f9
            r2 = -128(0xffffffffffffff80, float:NaN)
            if (r6 <= r2) goto L1f4
            r2 = 128(0x80, float:1.8E-43)
            if (r6 >= r2) goto L1f4
            r14 = 45
            if (r3 != r14) goto L1e8
            r13 = -1
            goto L1e9
        L1e8:
            r13 = 1
        L1e9:
            long r2 = java.lang.Math.abs(r11)
            float r14 = com.alibaba.fastjson2.util.TypeUtils.floatValue(r13, r2, r6)
        L1f1:
            r3 = r10
        L1f2:
            r13 = 0
            goto L20c
        L1f4:
            r14 = r7
            r3 = r10
            r11 = r16
            goto L1f2
        L1f9:
            r14 = 45
            if (r3 == r14) goto L203
            int r2 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r2 == 0) goto L206
        L201:
            float r14 = -r7
            goto L1f1
        L203:
            if (r2 != 0) goto L206
            goto L201
        L206:
            r14 = r7
            goto L1f1
        L208:
            r3 = r10
            r14 = r24
            goto L1f2
        L20c:
            int r2 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r2 <= 0) goto L218
            r0.readNumber0()
            float r1 = r0.getFloatValue()
            return r1
        L218:
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r2 = 32
            if (r3 > r2) goto L233
            long r9 = r16 << r3
            long r9 = r9 & r6
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L233
            if (r5 != r4) goto L22d
            r3 = 26
            goto L218
        L22d:
            int r2 = r5 + 1
            r3 = r1[r5]
            r5 = r2
            goto L218
        L233:
            if (r3 != r8) goto L237
            r8 = 1
            goto L238
        L237:
            r8 = 0
        L238:
            r0.comma = r8
            if (r8 == 0) goto L25e
            if (r5 != r4) goto L242
            r3 = r5
            r5 = 26
            goto L246
        L242:
            int r3 = r5 + 1
            r5 = r1[r5]
        L246:
            r31 = r5
            r5 = r3
            r3 = r31
        L24b:
            if (r3 > r2) goto L25e
            long r8 = r16 << r3
            long r8 = r8 & r6
            int r8 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r8 == 0) goto L25e
            if (r5 != r4) goto L259
            r3 = 26
            goto L24b
        L259:
            int r3 = r5 + 1
            r5 = r1[r5]
            goto L246
        L25e:
            r0.wasNull = r13
            char r1 = (char) r3
            r0.f1814ch = r1
            r0.offset = r5
            return r14
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final byte[] readHex() {
            r17 = this;
            r0 = r17
            int r1 = r0.offset
            byte[] r2 = r0.bytes
            char r3 = r0.f1814ch
            r4 = 120(0x78, float:1.68E-43)
            r5 = 26
            if (r3 != r4) goto L1d
            int r3 = r0.end
            if (r1 != r3) goto L14
            r3 = r5
            goto L1d
        L14:
            int r3 = r1 + 1
            r1 = r2[r1]
            r16 = r3
            r3 = r1
            r1 = r16
        L1d:
            r4 = 39
            java.lang.String r6 = "illegal state. "
            if (r3 == r4) goto L31
            r4 = 34
            if (r3 != r4) goto L28
            goto L31
        L28:
            java.lang.String r1 = eh.a.l(r3, r6)
            ah.a.w(r1)
        L2f:
            r1 = 0
            return r1
        L31:
            int r4 = r0.end
            if (r1 != r4) goto L38
            r4 = r1
        L36:
            r7 = r5
            goto L3c
        L38:
            int r4 = r1 + 1
            r7 = r2[r1]
        L3c:
            r8 = 57
            r9 = 48
            if (r7 < r9) goto L44
            if (r7 <= r8) goto L4c
        L44:
            r10 = 65
            if (r7 < r10) goto L5b
            r10 = 70
            if (r7 > r10) goto L5b
        L4c:
            int r7 = r0.end
            if (r4 != r7) goto L51
            goto L36
        L51:
            int r7 = r4 + 1
            r4 = r2[r4]
            r16 = r7
            r7 = r4
            r4 = r16
            goto L3c
        L5b:
            if (r7 != r3) goto L102
            int r3 = r0.end
            if (r4 != r3) goto L64
            r3 = r4
            r4 = r5
            goto L68
        L64:
            int r3 = r4 + 1
            r4 = r2[r4]
        L68:
            int r7 = r3 - r1
            int r10 = r7 + (-2)
            r11 = 1
            if (r4 != r5) goto L71
            int r10 = r7 + (-1)
        L71:
            int r7 = r10 % 2
            if (r7 != 0) goto Lf9
            int r10 = r10 / 2
            byte[] r6 = new byte[r10]
            r7 = 0
        L7a:
            if (r7 >= r10) goto L99
            int r12 = r7 * 2
            int r12 = r12 + r1
            r13 = r2[r12]
            int r12 = r12 + r11
            r12 = r2[r12]
            r14 = 55
            if (r13 > r8) goto L8a
            r15 = r9
            goto L8b
        L8a:
            r15 = r14
        L8b:
            int r13 = r13 - r15
            if (r12 > r8) goto L8f
            r14 = r9
        L8f:
            int r12 = r12 - r14
            int r13 = r13 << 4
            r12 = r12 | r13
            byte r12 = (byte) r12
            r6[r7] = r12
            int r7 = r7 + 1
            goto L7a
        L99:
            r7 = 0
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r1 = 32
            if (r4 > r1) goto Lba
            long r14 = r12 << r4
            long r14 = r14 & r9
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 == 0) goto Lba
            int r1 = r0.end
            if (r3 != r1) goto Lb3
            r4 = r5
            goto L99
        Lb3:
            int r1 = r3 + 1
            r3 = r2[r3]
            r4 = r3
            r3 = r1
            goto L99
        Lba:
            r14 = 44
            if (r4 != r14) goto Lf3
            int r14 = r0.end
            if (r3 < r14) goto Lc3
            goto Lf3
        Lc3:
            r0.comma = r11
            if (r3 != r14) goto Lca
            r4 = r3
        Lc8:
            r3 = r5
            goto Lce
        Lca:
            int r4 = r3 + 1
            r3 = r2[r3]
        Lce:
            if (r3 > r1) goto Le6
            long r14 = r12 << r3
            long r14 = r14 & r9
            int r11 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r11 == 0) goto Le6
            int r3 = r0.end
            if (r4 != r3) goto Ldc
            goto Lc8
        Ldc:
            int r3 = r4 + 1
            r4 = r2[r4]
            r16 = r4
            r4 = r3
            r3 = r16
            goto Lce
        Le6:
            r0.offset = r4
            char r1 = (char) r3
            r0.f1814ch = r1
            r2 = 47
            if (r1 != r2) goto Lf2
            r0.skipComment()
        Lf2:
            return r6
        Lf3:
            r0.offset = r3
            char r1 = (char) r4
            r0.f1814ch = r1
            return r6
        Lf9:
            java.lang.String r1 = eh.a.l(r10, r6)
            ah.a.w(r1)
            goto L2f
        L102:
            java.lang.String r1 = eh.a.l(r7, r6)
            ah.a.w(r1)
            goto L2f
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean readIfNull() {
            r18 = this;
            r0 = r18
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            int r3 = r0.offset
            r4 = 110(0x6e, float:1.54E-43)
            r5 = 0
            if (r2 != r4) goto L89
            r2 = r1[r3]
            r4 = 117(0x75, float:1.64E-43)
            if (r2 != r4) goto L89
            int r2 = r3 + 1
            r2 = r1[r2]
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 != r4) goto L89
            int r2 = r3 + 2
            r2 = r1[r2]
            if (r2 != r4) goto L89
            int r2 = r3 + 3
            int r4 = r0.end
            r6 = 26
            if (r2 != r4) goto L2b
            r2 = r6
            goto L2e
        L2b:
            r2 = r1[r2]
            char r2 = (char) r2
        L2e:
            int r3 = r3 + 4
        L30:
            r7 = 0
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            r11 = 1
            r4 = 32
            if (r2 > r4) goto L54
            long r13 = r11 << r2
            long r13 = r13 & r9
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 == 0) goto L54
            int r2 = r0.end
            if (r3 != r2) goto L4a
            r2 = r6
            goto L30
        L4a:
            int r2 = r3 + 1
            r3 = r1[r3]
            r17 = r3
            r3 = r2
            r2 = r17
            goto L30
        L54:
            r13 = 44
            r14 = 1
            if (r2 != r13) goto L5a
            r5 = r14
        L5a:
            r0.comma = r5
            if (r5 == 0) goto L83
            int r2 = r0.end
            if (r3 != r2) goto L65
            r2 = r3
            r3 = r6
            goto L6a
        L65:
            int r2 = r3 + 1
            r3 = r1[r3]
            char r3 = (char) r3
        L6a:
            r17 = r3
            r3 = r2
            r2 = r17
        L6f:
            if (r2 > r4) goto L83
            long r15 = r11 << r2
            long r15 = r15 & r9
            int r5 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r5 == 0) goto L83
            int r2 = r0.end
            if (r3 != r2) goto L7e
            r2 = r6
            goto L6f
        L7e:
            int r2 = r3 + 1
            r3 = r1[r3]
            goto L6a
        L83:
            r0.offset = r3
            char r1 = (char) r2
            r0.f1814ch = r1
            return r14
        L89:
            return r5
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int readInt32Value() {
            r21 = this;
            r0 = r21
            char r1 = r0.f1814ch
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
            r5 = 34
            if (r1 == r5) goto L16
            r5 = 39
            if (r1 != r5) goto L13
            goto L16
        L13:
            r5 = r2
            r2 = 0
            goto L1f
        L16:
            int r5 = r2 + 1
            r2 = r4[r2]
            r20 = r2
            r2 = r1
            r1 = r20
        L1f:
            r7 = 57
            r8 = 45
            r9 = 48
            r10 = 1
            if (r1 < r9) goto L2d
            if (r1 > r7) goto L2d
            int r11 = 48 - r1
            goto L37
        L2d:
            if (r1 == r8) goto L36
            r11 = 43
            if (r1 != r11) goto L34
            goto L36
        L34:
            r11 = r10
            goto L37
        L36:
            r11 = 0
        L37:
            int r12 = r5 + 1
            if (r12 >= r3) goto L58
            int r13 = com.alibaba.fastjson2.util.IOUtils.digit2(r4, r5)
            r14 = -1
            if (r13 == r14) goto L58
            r14 = -21474836(0xfffffffffeb851ec, float:-1.2250166E38)
            if (r14 > r11) goto L49
            r14 = r10
            goto L4a
        L49:
            r14 = 0
        L4a:
            if (r11 > 0) goto L4e
            r15 = r10
            goto L4f
        L4e:
            r15 = 0
        L4f:
            r14 = r14 & r15
            if (r14 == 0) goto L58
            int r11 = r11 * 100
            int r11 = r11 - r13
            int r5 = r5 + 2
            goto L37
        L58:
            if (r5 >= r3) goto L75
            r13 = r4[r5]
            if (r13 < r9) goto L75
            if (r13 > r7) goto L75
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r7 > r11) goto L67
            r7 = r10
            goto L68
        L67:
            r7 = 0
        L68:
            if (r11 > 0) goto L6c
            r14 = r10
            goto L6d
        L6c:
            r14 = 0
        L6d:
            r7 = r7 & r14
            if (r7 == 0) goto L75
            int r11 = r11 * 10
            int r11 = r11 + r9
            int r11 = r11 - r13
            r5 = r12
        L75:
            r7 = 26
            if (r5 != r3) goto L7c
            r9 = r5
            r5 = r7
            goto L80
        L7c:
            int r9 = r5 + 1
            r5 = r4[r5]
        L80:
            if (r11 > 0) goto L10d
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 < r11) goto L88
            if (r1 != r8) goto L10d
        L88:
            boolean[] r12 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r13 = r5 & 255(0xff, float:3.57E-43)
            boolean r12 = r12[r13]
            if (r12 == 0) goto L10d
            if (r2 == 0) goto L94
            if (r5 != r2) goto L10d
        L94:
            if (r2 == 0) goto L9f
            if (r9 != r3) goto L9a
            r5 = r7
            goto L9f
        L9a:
            int r2 = r9 + 1
            r5 = r4[r9]
            r9 = r2
        L9f:
            r2 = 76
            if (r5 == r2) goto Lb3
            r2 = 70
            if (r5 == r2) goto Lb3
            r2 = 68
            if (r5 == r2) goto Lb3
            r2 = 66
            if (r5 == r2) goto Lb3
            r2 = 83
            if (r5 != r2) goto Lbc
        Lb3:
            if (r9 != r3) goto Lb7
        Lb5:
            r5 = r7
            goto Lbc
        Lb7:
            int r2 = r9 + 1
            r5 = r4[r9]
        Lbb:
            r9 = r2
        Lbc:
            r12 = 0
            r14 = 4294981377(0x100003701, double:2.122002748E-314)
            r16 = 1
            r2 = 32
            if (r5 > r2) goto Ld9
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r18 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r18 == 0) goto Ld9
            if (r9 != r3) goto Ld4
            goto Lb5
        Ld4:
            int r2 = r9 + 1
            r5 = r4[r9]
            goto Lbb
        Ld9:
            r6 = 44
            if (r5 != r6) goto Ldf
            r6 = r10
            goto Le0
        Ldf:
            r6 = 0
        Le0:
            r0.comma = r6
            if (r6 == 0) goto L103
            if (r9 != r3) goto Le8
            r6 = r7
            goto Lee
        Le8:
            int r5 = r9 + 1
            r6 = r4[r9]
            char r6 = (char) r6
            goto L101
        Lee:
            r5 = r6
        Lef:
            if (r5 > r2) goto L103
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r6 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r6 == 0) goto L103
            if (r9 != r3) goto Lfd
            r5 = r7
            goto Lef
        Lfd:
            int r5 = r9 + 1
            r6 = r4[r9]
        L101:
            r9 = r5
            goto Lee
        L103:
            char r2 = (char) r5
            r0.f1814ch = r2
            r0.offset = r9
            if (r1 != r8) goto L10b
            return r11
        L10b:
            int r1 = -r11
            return r1
        L10d:
            int r1 = r0.readInt32ValueOverflow()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long readInt64Value() {
            r23 = this;
            r0 = r23
            char r1 = r0.f1814ch
            int r2 = r0.offset
            int r3 = r0.end
            byte[] r4 = r0.bytes
            r5 = 34
            if (r1 == r5) goto L16
            r5 = 39
            if (r1 != r5) goto L13
            goto L16
        L13:
            r5 = r2
            r2 = 0
            goto L1f
        L16:
            int r5 = r2 + 1
            r2 = r4[r2]
            r22 = r2
            r2 = r1
            r1 = r22
        L1f:
            r7 = 57
            r10 = 45
            r11 = 48
            r12 = 0
            if (r1 < r11) goto L2f
            if (r1 > r7) goto L2f
            int r14 = 48 - r1
            long r14 = (long) r14
            goto L3a
        L2f:
            if (r1 == r10) goto L39
            r14 = 43
            if (r1 != r14) goto L36
            goto L39
        L36:
            r14 = 1
            goto L3a
        L39:
            r14 = r12
        L3a:
            int r6 = r5 + 1
            r17 = 1
            r18 = 1
            if (r6 >= r3) goto L6c
            int r8 = com.alibaba.fastjson2.util.IOUtils.digit2(r4, r5)
            r9 = -1
            if (r8 == r9) goto L6c
            r20 = -92233720368547758(0xfeb851eb851eb852, double:-2.605908932677002E302)
            int r9 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r9 > 0) goto L55
            r9 = r17
            goto L56
        L55:
            r9 = 0
        L56:
            int r20 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r20 > 0) goto L5d
            r20 = r17
            goto L5f
        L5d:
            r20 = 0
        L5f:
            r9 = r9 & r20
            if (r9 == 0) goto L6c
            r20 = 100
            long r14 = r14 * r20
            long r8 = (long) r8
            long r14 = r14 - r8
            int r5 = r5 + 2
            goto L3a
        L6c:
            if (r5 >= r3) goto L97
            r8 = r4[r5]
            if (r8 < r11) goto L97
            if (r8 > r7) goto L97
            r20 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r7 > 0) goto L80
            r7 = r17
            goto L81
        L80:
            r7 = 0
        L81:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 > 0) goto L88
            r9 = r17
            goto L89
        L88:
            r9 = 0
        L89:
            r7 = r7 & r9
            if (r7 == 0) goto L97
            r20 = 10
            long r14 = r14 * r20
            r20 = 48
            long r14 = r14 + r20
            long r7 = (long) r8
            long r14 = r14 - r7
            r5 = r6
        L97:
            r6 = 26
            if (r5 != r3) goto L9e
            r7 = r5
            r5 = r6
            goto La2
        L9e:
            int r7 = r5 + 1
            r5 = r4[r5]
        La2:
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 > 0) goto L133
            r8 = -9223372036854775808
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto Lae
            if (r1 != r10) goto L133
        Lae:
            boolean[] r8 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r9 = r5 & 255(0xff, float:3.57E-43)
            boolean r8 = r8[r9]
            if (r8 == 0) goto L133
            if (r2 == 0) goto Lba
            if (r5 != r2) goto L133
        Lba:
            if (r2 == 0) goto Lc5
            if (r7 != r3) goto Lc0
            r5 = r6
            goto Lc5
        Lc0:
            int r2 = r7 + 1
            r5 = r4[r7]
            r7 = r2
        Lc5:
            r2 = 76
            if (r5 == r2) goto Ld9
            r2 = 70
            if (r5 == r2) goto Ld9
            r2 = 68
            if (r5 == r2) goto Ld9
            r2 = 66
            if (r5 == r2) goto Ld9
            r2 = 83
            if (r5 != r2) goto Le2
        Ld9:
            if (r7 != r3) goto Ldd
        Ldb:
            r5 = r6
            goto Le2
        Ldd:
            int r2 = r7 + 1
            r5 = r4[r7]
        Le1:
            r7 = r2
        Le2:
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r2 = 32
            if (r5 > r2) goto Lfb
            long r20 = r18 << r5
            long r20 = r20 & r8
            int r11 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r11 == 0) goto Lfb
            if (r7 != r3) goto Lf6
            goto Ldb
        Lf6:
            int r2 = r7 + 1
            r5 = r4[r7]
            goto Le1
        Lfb:
            r11 = 44
            if (r5 != r11) goto L102
            r11 = r17
            goto L103
        L102:
            r11 = 0
        L103:
            r0.comma = r11
            if (r11 == 0) goto L129
            if (r7 != r3) goto L10c
            r5 = r7
            r7 = r6
            goto L111
        L10c:
            int r5 = r7 + 1
            r7 = r4[r7]
            char r7 = (char) r7
        L111:
            r22 = r7
            r7 = r5
            r5 = r22
        L116:
            if (r5 > r2) goto L129
            long r16 = r18 << r5
            long r16 = r16 & r8
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 == 0) goto L129
            if (r7 != r3) goto L124
            r5 = r6
            goto L116
        L124:
            int r5 = r7 + 1
            r7 = r4[r7]
            goto L111
        L129:
            char r2 = (char) r5
            r0.f1814ch = r2
            r0.offset = r7
            if (r1 != r10) goto L131
            return r14
        L131:
            long r1 = -r14
            return r1
        L133:
            long r1 = r0.readInt64ValueOverflow()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate() {
            r17 = this;
            r1 = r17
            byte[] r0 = r1.bytes
            int r2 = r1.offset
            char r3 = r1.f1814ch
            r4 = 34
            if (r3 == r4) goto L10
            r4 = 39
            if (r3 != r4) goto L12a
        L10:
            com.alibaba.fastjson2.JSONReader$Context r4 = r1.context
            java.lang.String r5 = r4.dateFormat
            if (r5 == 0) goto L26
            boolean r5 = r4.formatyyyyMMddhhmmss19
            if (r5 != 0) goto L26
            boolean r5 = r4.formatyyyyMMddhhmmssT19
            if (r5 != 0) goto L26
            boolean r5 = r4.formatyyyyMMdd8
            if (r5 != 0) goto L26
            boolean r4 = r4.formatISO8601
            if (r4 == 0) goto L12a
        L26:
            int r4 = r2 + 10
            int r5 = r0.length
            r8 = 45
            r10 = 10
            if (r4 >= r5) goto Lcf
            int r5 = r1.end
            if (r4 >= r5) goto Lcf
            int r5 = r2 + 4
            r5 = r0[r5]
            if (r5 != r8) goto Lcf
            int r5 = r2 + 7
            r5 = r0[r5]
            if (r5 != r8) goto Lcf
            r4 = r0[r4]
            if (r4 != r3) goto Lcf
            r4 = r0[r2]
            int r5 = r2 + 1
            r5 = r0[r5]
            int r11 = r2 + 2
            r11 = r0[r11]
            int r12 = r2 + 3
            r12 = r0[r12]
            int r13 = r2 + 5
            r13 = r0[r13]
            int r14 = r2 + 6
            r14 = r0[r14]
            int r15 = r2 + 8
            r15 = r0[r15]
            int r16 = r2 + 9
            r6 = r0[r16]
            r16 = 1
            r9 = 48
            if (r4 < r9) goto Ld1
            r8 = 57
            if (r4 > r8) goto Ld1
            if (r5 < r9) goto Ld1
            if (r5 > r8) goto Ld1
            if (r11 < r9) goto Ld1
            if (r11 > r8) goto Ld1
            if (r12 < r9) goto Ld1
            if (r12 > r8) goto Ld1
            int r4 = r4 - r9
            int r4 = r4 * 1000
            r7 = 100
            int r4 = p.a.z(r5, r9, r7, r4)
            int r4 = p.a.z(r11, r9, r10, r4)
            int r12 = r12 - r9
            int r12 = r12 + r4
            if (r13 < r9) goto Ld1
            if (r13 > r8) goto Ld1
            if (r14 < r9) goto Ld1
            if (r14 > r8) goto Ld1
            int r13 = r13 - r9
            int r13 = r13 * r10
            int r14 = r14 - r9
            int r14 = r14 + r13
            if (r15 < r9) goto Ld1
            if (r15 > r8) goto Ld1
            if (r6 < r9) goto Ld1
            if (r6 > r8) goto Ld1
            int r15 = r15 - r9
            int r15 = r15 * r10
            int r6 = r6 - r9
            int r6 = r6 + r15
            if (r12 != 0) goto La6
            if (r14 != 0) goto La6
            if (r6 != 0) goto La6
            r0 = 0
            goto Laa
        La6:
            java.time.LocalDate r0 = java.time.LocalDate.of(r12, r14, r6)     // Catch: java.time.DateTimeException -> Lc3
        Laa:
            int r2 = r2 + 11
            r1.offset = r2
            r1.next()
            char r2 = r1.f1814ch
            r3 = 44
            if (r2 != r3) goto Lba
            r6 = r16
            goto Lbb
        Lba:
            r6 = 0
        Lbb:
            r1.comma = r6
            if (r6 == 0) goto Lc2
            r1.next()
        Lc2:
            return r0
        Lc3:
            r0 = move-exception
            java.lang.String r2 = "read date error"
            java.lang.String r2 = r1.info(r2)
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        Lcf:
            r16 = 1
        Ld1:
            int r4 = r2 + 17
            int r5 = r1.end
            int r4 = java.lang.Math.min(r4, r5)
            r5 = -1
            r6 = r2
            r7 = r5
        Ldc:
            if (r6 >= r4) goto Le6
            r8 = r0[r6]
            if (r8 != r3) goto Le3
            r7 = r6
        Le3:
            int r6 = r6 + 1
            goto Ldc
        Le6:
            if (r7 == r5) goto L12a
            int r3 = r7 - r2
            if (r3 <= r10) goto L12a
            int r4 = r7 + (-6)
            r4 = r0[r4]
            r5 = 45
            if (r4 != r5) goto L12a
            int r4 = r7 + (-3)
            r4 = r0[r4]
            if (r4 != r5) goto L12a
            int r3 = r3 + (-6)
            int r2 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r2, r3)
            int r3 = r7 + (-5)
            r4 = 2
            int r3 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r3, r4)
            int r5 = r7 + (-2)
            int r0 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r5, r4)
            java.time.LocalDate r0 = java.time.LocalDate.of(r2, r3, r0)
            int r7 = r7 + 1
            r1.offset = r7
            r1.next()
            char r2 = r1.f1814ch
            r3 = 44
            if (r2 != r3) goto L121
            r6 = r16
            goto L122
        L121:
            r6 = 0
        L122:
            r1.comma = r6
            if (r6 == 0) goto L129
            r1.next()
        L129:
            return r0
        L12a:
            java.time.LocalDate r0 = super.readLocalDate()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate10() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L38
            byte[] r0 = r3.bytes     // Catch: java.time.DateTimeException -> L2c
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L2c
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(r0, r1)     // Catch: java.time.DateTimeException -> L2c
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 11
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
        L36:
            r0 = 0
            return r0
        L38:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
            goto L36
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate11() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 11
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate8() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L34
            byte[] r0 = r3.bytes     // Catch: java.time.DateTimeException -> L28
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L28
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(r0, r1)     // Catch: java.time.DateTimeException -> L28
            int r1 = r3.offset
            int r1 = r1 + 9
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r3.comma = r1
            if (r1 == 0) goto L27
            r3.next()
        L27:
            return r0
        L28:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
        L32:
            r0 = 0
            return r0
        L34:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
            goto L32
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate9() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L34
            byte[] r0 = r3.bytes     // Catch: java.time.DateTimeException -> L28
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L28
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(r0, r1)     // Catch: java.time.DateTimeException -> L28
            int r1 = r3.offset
            int r1 = r1 + 10
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r3.comma = r1
            if (r1 == 0) goto L27
            r3.next()
        L27:
            return r0
        L28:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
        L32:
            r0 = 0
            return r0
        L34:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
            goto L32
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime12() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 13
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime14() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 15
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime16() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 17
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime17() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 18
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime18() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L28
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(r0, r1)
            int r1 = r3.offset
            int r1 = r1 + 19
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r3.comma = r1
            if (r1 == 0) goto L27
            r3.next()
        L27:
            return r0
        L28:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime19() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 20
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime20() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 21
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTimeX(int r4) {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(r0, r1, r4)
            if (r0 != 0) goto L12
            r4 = 0
            return r4
        L12:
            int r1 = r3.offset
            r2 = 1
            int r4 = r4 + r2
            int r4 = r4 + r1
            r3.offset = r4
            r3.next()
            char r4 = r3.f1814ch
            r1 = 44
            if (r4 != r1) goto L23
            goto L24
        L23:
            r2 = 0
        L24:
            r3.comma = r2
            if (r2 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r4 = "date only support string input"
            ah.a.w(r4)
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime10() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 11
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime11() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 12
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime12() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 13
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime15() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime15(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 16
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime18() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 19
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime5() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
        L12:
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 6
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            r3.comma = r1
            if (r1 == 0) goto L37
            r3.next()
        L37:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime8() {
            r3 = this;
            boolean r0 = r3.isString()
            if (r0 == 0) goto L2c
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(r0, r1)
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            int r1 = r3.offset
            int r1 = r1 + 9
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            r3.comma = r1
            if (r1 == 0) goto L2b
            r3.next()
        L2b:
            return r0
        L2c:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime9() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localTime only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
        L12:
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 10
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L2f
            r1 = 1
            goto L30
        L2f:
            r1 = 0
        L30:
            r3.comma = r1
            if (r1 == 0) goto L37
            r3.next()
        L37:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long readMillis19() {
            r7 = this;
            char r0 = r7.f1814ch
            r1 = 34
            if (r0 == r1) goto L13
            r1 = 39
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
        L10:
            r0 = 0
            return r0
        L13:
            int r1 = r7.offset
            int r2 = r1 + 18
            int r3 = r7.end
            r4 = 1
            if (r2 < r3) goto L1f
            r7.wasNull = r4
            goto L10
        L1f:
            byte[] r2 = r7.bytes
            com.alibaba.fastjson2.JSONReader$Context r3 = r7.context
            java.time.ZoneId r3 = r3.zoneId
            long r1 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(r2, r1, r3)
            byte[] r3 = r7.bytes
            int r5 = r7.offset
            int r6 = r5 + 19
            r3 = r3[r6]
            if (r3 != r0) goto L4a
            int r5 = r5 + 20
            r7.offset = r5
            r7.next()
            char r0 = r7.f1814ch
            r3 = 44
            if (r0 != r3) goto L41
            goto L42
        L41:
            r4 = 0
        L42:
            r7.comma = r4
            if (r4 == 0) goto L49
            r7.next()
        L49:
            return r1
        L4a:
            java.lang.String r0 = "illegal date input"
            java.lang.String r0 = r7.info(r0)
            ah.a.w(r0)
            goto L10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final double readNaN() {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 97
            if (r2 != r3) goto L77
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 78
            if (r2 != r3) goto L77
            int r2 = r1 + 2
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L1d
            r1 = r2
        L1b:
            r2 = r4
            goto L21
        L1d:
            int r1 = r1 + 3
            r2 = r0[r2]
        L21:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L42
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L42
            int r2 = r14.end
            if (r1 < r2) goto L3a
            goto L1b
        L3a:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L21
        L42:
            r11 = 44
            if (r2 != r11) goto L48
            r11 = 1
            goto L49
        L48:
            r11 = 0
        L49:
            r14.comma = r11
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L54
            r2 = r1
            r1 = r4
            goto L58
        L54:
            int r2 = r1 + 1
            r1 = r0[r1]
        L58:
            r13 = r2
            r2 = r1
            r1 = r13
        L5b:
            if (r2 > r3) goto L6f
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r2 = r14.end
            if (r1 < r2) goto L6a
            r2 = r4
            goto L5b
        L6a:
            int r2 = r1 + 1
            r1 = r0[r1]
            goto L58
        L6f:
            char r0 = (char) r2
            r14.f1814ch = r0
            r14.offset = r1
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L77:
            java.lang.String r0 = "json syntax error, not NaN "
            java.lang.String r0 = eh.a.l(r1, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void readNull() {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 1
            r2 = r0[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L7b
            int r2 = r1 + 2
            r2 = r0[r2]
            if (r2 != r3) goto L7b
            int r2 = r1 + 3
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L23
            r1 = r2
        L21:
            r2 = r4
            goto L27
        L23:
            int r1 = r1 + 4
            r2 = r0[r2]
        L27:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r3 = 32
            if (r2 > r3) goto L48
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L48
            int r2 = r14.end
            if (r1 < r2) goto L40
            goto L21
        L40:
            int r2 = r1 + 1
            r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L27
        L48:
            r11 = 44
            if (r2 != r11) goto L4e
            r11 = 1
            goto L4f
        L4e:
            r11 = 0
        L4f:
            r14.comma = r11
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L5a
            r2 = r1
            r1 = r4
            goto L5e
        L5a:
            int r2 = r1 + 1
            r1 = r0[r1]
        L5e:
            r13 = r2
            r2 = r1
            r1 = r13
        L61:
            if (r2 > r3) goto L75
            long r11 = r9 << r2
            long r11 = r11 & r7
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 == 0) goto L75
            int r2 = r14.end
            if (r1 < r2) goto L70
            r2 = r4
            goto L61
        L70:
            int r2 = r1 + 1
            r1 = r0[r1]
            goto L5e
        L75:
            char r0 = (char) r2
            r14.f1814ch = r0
            r14.offset = r1
            return
        L7b:
            java.lang.String r0 = "json syntax error, not match null"
            java.lang.String r0 = eh.a.l(r1, r0)
            ah.a.w(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.util.Date readNullOrNewDate() {
            r19 = this;
            r0 = r19
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 2
            int r4 = r0.end
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            r12 = 26
            if (r3 >= r4) goto L3a
            r13 = r1[r2]
            r14 = 117(0x75, float:1.64E-43)
            if (r13 != r14) goto L3a
            int r13 = r2 + 1
            r13 = r1[r13]
            r14 = 108(0x6c, float:1.51E-43)
            if (r13 != r14) goto L3a
            r13 = r1[r3]
            if (r13 != r14) goto L3a
            int r3 = r2 + 3
            if (r3 != r4) goto L31
            r3 = r12
            goto L33
        L31:
            r3 = r1[r3]
        L33:
            int r2 = r2 + 4
            r4 = 0
            r16 = r5
            goto Lf2
        L3a:
            int r13 = r2 + 1
            if (r13 >= r4) goto L159
            r14 = r1[r2]
            r15 = 101(0x65, float:1.42E-43)
            if (r14 != r15) goto L159
            r13 = r1[r13]
            r14 = 119(0x77, float:1.67E-43)
            if (r13 != r14) goto L159
            int r2 = r2 + 3
            if (r2 != r4) goto L50
        L4e:
            r3 = r12
            goto L52
        L50:
            r3 = r1[r3]
        L52:
            if (r3 > r11) goto L6a
            long r13 = r9 << r3
            long r13 = r13 & r7
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 == 0) goto L6a
            int r3 = r0.end
            if (r2 != r3) goto L60
            goto L4e
        L60:
            int r3 = r2 + 1
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L52
        L6a:
            int r4 = r2 + 4
            int r13 = r0.end
            java.lang.String r14 = "json syntax error, not match new Date"
            if (r4 >= r13) goto L151
            r16 = r5
            r5 = 68
            if (r3 != r5) goto L151
            r3 = r1[r2]
            r5 = 97
            if (r3 != r5) goto L151
            int r3 = r2 + 1
            r3 = r1[r3]
            r5 = 116(0x74, float:1.63E-43)
            if (r3 != r5) goto L151
            int r3 = r2 + 2
            r3 = r1[r3]
            if (r3 != r15) goto L151
            int r2 = r2 + 3
            if (r2 != r13) goto L92
        L90:
            r2 = r12
            goto L94
        L92:
            r2 = r1[r2]
        L94:
            if (r2 > r11) goto La9
            long r5 = r9 << r2
            long r5 = r5 & r7
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 == 0) goto La9
            int r2 = r0.end
            if (r4 != r2) goto La2
            goto L90
        La2:
            int r2 = r4 + 1
            r3 = r1[r4]
            r4 = r2
            r2 = r3
            goto L94
        La9:
            r3 = 40
            if (r2 != r3) goto L149
            int r2 = r0.end
            if (r4 >= r2) goto L149
            int r2 = r4 + 1
            r3 = r1[r4]
        Lb5:
            if (r3 > r11) goto Lce
            long r4 = r9 << r3
            long r4 = r4 & r7
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto Lce
            int r3 = r0.end
            if (r2 != r3) goto Lc4
            r3 = r12
            goto Lb5
        Lc4:
            int r3 = r2 + 1
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lb5
        Lce:
            char r3 = (char) r3
            r0.f1814ch = r3
            r0.offset = r2
            long r2 = r0.readInt64Value()
            char r4 = r0.f1814ch
            int r5 = r0.offset
            r6 = 41
            if (r4 != r6) goto L140
            int r4 = r0.end
            if (r5 < r4) goto Le6
            r4 = r5
            r5 = r12
            goto Lea
        Le6:
            int r4 = r5 + 1
            r5 = r1[r5]
        Lea:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r2)
            r2 = r4
            r3 = r5
            r4 = r6
        Lf2:
            if (r3 > r11) goto L10b
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L10b
            int r3 = r0.end
            if (r2 != r3) goto L101
            r3 = r12
            goto Lf2
        L101:
            int r3 = r2 + 1
            r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lf2
        L10b:
            r5 = 44
            if (r3 != r5) goto L111
            r5 = 1
            goto L112
        L111:
            r5 = 0
        L112:
            r0.comma = r5
            if (r5 == 0) goto L13a
            int r3 = r0.end
            if (r2 != r3) goto L11d
            r3 = r2
            r2 = r12
            goto L121
        L11d:
            int r3 = r2 + 1
            r2 = r1[r2]
        L121:
            r18 = r3
            r3 = r2
            r2 = r18
        L126:
            if (r3 > r11) goto L13a
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L13a
            int r3 = r0.end
            if (r2 != r3) goto L135
            r3 = r12
            goto L126
        L135:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L121
        L13a:
            r0.offset = r2
            char r1 = (char) r3
            r0.f1814ch = r1
            return r4
        L140:
            java.lang.String r1 = eh.a.l(r5, r14)
            ah.a.w(r1)
        L147:
            r1 = 0
            return r1
        L149:
            java.lang.String r1 = eh.a.l(r4, r14)
            ah.a.w(r1)
            goto L147
        L151:
            java.lang.String r1 = eh.a.l(r2, r14)
            ah.a.w(r1)
            goto L147
        L159:
            java.lang.String r1 = "json syntax error, not match null or new Date"
            java.lang.String r1 = eh.a.l(r2, r1)
            ah.a.w(r1)
            goto L147
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void readNumber0() {
            r28 = this;
            r0 = r28
            r1 = 0
            r0.wasNull = r1
            r0.mag0 = r1
            r0.mag1 = r1
            r0.mag2 = r1
            r0.mag3 = r1
            r0.negative = r1
            r0.exponent = r1
            r0.scale = r1
            int r2 = r0.offset
            byte[] r3 = r0.bytes
            char r4 = r0.f1814ch
            int r5 = r0.end
            r6 = 34
            r7 = 5
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r14 = 32
            r15 = 2
            r16 = 26
            r17 = 0
            r8 = 1
            if (r4 == r6) goto L39
            r6 = 39
            if (r4 != r6) goto L34
            goto L39
        L34:
            r6 = r1
            r9 = r2
        L36:
            r19 = r10
            goto L74
        L39:
            int r6 = r2 + 1
            r9 = r3[r2]
            char r9 = (char) r9
            if (r9 != r4) goto L6d
            if (r6 != r5) goto L45
        L42:
            r1 = r16
            goto L49
        L45:
            int r2 = r2 + r15
            r1 = r3[r6]
            r6 = r2
        L49:
            if (r1 > r14) goto L5d
            long r19 = r12 << r1
            long r19 = r19 & r10
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L5d
            if (r6 != r5) goto L56
            goto L42
        L56:
            int r1 = r6 + 1
            r2 = r3[r6]
            r6 = r1
            r1 = r2
            goto L49
        L5d:
            char r1 = (char) r1
            r0.f1814ch = r1
            r0.offset = r6
            boolean r1 = r0.nextIfComma()
            r0.comma = r1
            r0.wasNull = r8
            r0.valueType = r7
            return
        L6d:
            r19 = r6
            r6 = r4
            r4 = r9
            r9 = r19
            goto L36
        L74:
            r10 = 43
            r11 = 45
            r21 = r12
            java.lang.String r12 = "illegal input"
            if (r4 != r11) goto L8f
            if (r9 == r5) goto L87
            r0.negative = r8
            int r4 = r9 + 1
            r13 = r3[r9]
            goto Lab
        L87:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        L8f:
            if (r4 != r10) goto La5
            if (r9 == r5) goto L9d
            int r4 = r9 + 1
            r13 = r3[r9]
            r27 = r13
            r13 = r4
            r4 = r27
            goto La6
        L9d:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        La5:
            r13 = r9
        La6:
            r27 = r13
            r13 = r4
            r4 = r27
        Lab:
            r0.valueType = r8
            r23 = r1
            r24 = r23
        Lb1:
            r14 = 57
            r25 = 10
            r1 = 48
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r13 < r1) goto Lec
            if (r13 > r14) goto Lec
            if (r23 != 0) goto Ld5
            int r13 = r13 + (-48)
            r26 = r8
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto Lcf
        Lcc:
            r23 = r26
            goto Ld7
        Lcf:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto Ld7
            goto Lcc
        Ld5:
            r26 = r8
        Ld7:
            if (r4 != r5) goto Le0
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto Lee
        Le0:
            int r1 = r4 + 1
            r13 = r3[r4]
            r4 = r1
            r8 = r26
            r24 = r8
            r1 = 0
            r7 = 5
            goto Lb1
        Lec:
            r26 = r8
        Lee:
            r8 = 46
            if (r13 != r8) goto L134
            r0.valueType = r15
            if (r4 == r5) goto L12c
            int r8 = r4 + 1
            r4 = r3[r4]
            r13 = r4
        Lfb:
            r4 = r8
            if (r13 < r1) goto L134
            if (r13 > r14) goto L134
            if (r23 != 0) goto L115
            int r13 = r13 + (-48)
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto L10f
        L10c:
            r23 = r26
            goto L115
        L10f:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto L115
            goto L10c
        L115:
            short r8 = r0.scale
            int r8 = r8 + 1
            short r8 = (short) r8
            r0.scale = r8
            if (r4 != r5) goto L125
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto L134
        L125:
            int r8 = r4 + 1
            r13 = r3[r4]
            r24 = r26
            goto Lfb
        L12c:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        L134:
            if (r23 == 0) goto L166
            boolean r7 = r0.negative
            if (r7 == 0) goto L13c
            r8 = r9
            goto L13e
        L13c:
            int r8 = r9 + (-1)
        L13e:
            short r12 = r0.scale
            if (r12 <= 0) goto L146
            int r12 = r4 + (-2)
        L144:
            int r12 = r12 - r8
            goto L149
        L146:
            int r12 = r4 + (-1)
            goto L144
        L149:
            r15 = 38
            if (r12 <= r15) goto L160
            r12 = 8
            r0.valueType = r12
            if (r7 == 0) goto L155
            int r8 = r8 + (-1)
        L155:
            java.lang.String r7 = new java.lang.String
            int r12 = r4 + (-1)
            int r12 = r12 - r8
            r7.<init>(r3, r8, r12)
            r0.stringValue = r7
            goto L16b
        L160:
            int r7 = r4 + (-1)
            r0.bigInt(r3, r8, r7)
            goto L16b
        L166:
            int r7 = r0.mag3
            int r7 = -r7
            r0.mag3 = r7
        L16b:
            r7 = 101(0x65, float:1.42E-43)
            if (r13 == r7) goto L173
            r8 = 69
            if (r13 != r8) goto L1bc
        L173:
            int r8 = r4 + 1
            r12 = r3[r4]
            if (r12 != r11) goto L181
            int r4 = r4 + 2
            r12 = r3[r8]
            r8 = r26
        L17f:
            r10 = 0
            goto L18c
        L181:
            if (r12 != r10) goto L18a
            int r4 = r4 + 2
            r8 = r3[r8]
            char r12 = (char) r8
        L188:
            r8 = 0
            goto L17f
        L18a:
            r4 = r8
            goto L188
        L18c:
            if (r12 < r1) goto L1b2
            if (r12 > r14) goto L1b2
            int r12 = r12 + (-48)
            int r10 = r10 * 10
            int r10 = r10 + r12
            r11 = 2047(0x7ff, float:2.868E-42)
            if (r10 > r11) goto L1a8
            if (r4 != r5) goto L1a0
            r13 = r16
            r24 = r26
            goto L1b3
        L1a0:
            int r11 = r4 + 1
            r12 = r3[r4]
            r4 = r11
            r24 = r26
            goto L18c
        L1a8:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = eh.a.l(r10, r1)
            ah.a.w(r1)
            return
        L1b2:
            r13 = r12
        L1b3:
            if (r8 == 0) goto L1b6
            int r10 = -r10
        L1b6:
            short r1 = (short) r10
            r0.exponent = r1
            r1 = 2
            r0.valueType = r1
        L1bc:
            if (r4 != r9) goto L29e
            r1 = 110(0x6e, float:1.54E-43)
            r8 = 117(0x75, float:1.64E-43)
            r10 = 108(0x6c, float:1.51E-43)
            if (r13 != r1) goto L1f4
            r1 = r3[r4]
            if (r1 != r8) goto L1f0
            int r1 = r4 + 1
            r1 = r3[r1]
            if (r1 != r10) goto L1f0
            int r1 = r4 + 2
            r1 = r3[r1]
            if (r1 != r10) goto L1f0
            int r1 = r4 + 3
            r7 = r26
            r0.wasNull = r7
            r7 = 5
            r0.valueType = r7
            if (r1 != r5) goto L1e5
        L1e1:
            r4 = r1
            r13 = r16
            goto L1ea
        L1e5:
            int r4 = r4 + 4
            r1 = r3[r1]
        L1e9:
            r13 = r1
        L1ea:
            r7 = 0
        L1eb:
            r8 = 1
            r24 = 1
            goto L2a1
        L1f0:
            r7 = 0
            r8 = 1
            goto L2a1
        L1f4:
            r1 = 116(0x74, float:1.63E-43)
            r11 = 4
            if (r13 != r1) goto L21a
            r1 = r3[r4]
            r12 = 114(0x72, float:1.6E-43)
            if (r1 != r12) goto L21a
            int r1 = r4 + 1
            r1 = r3[r1]
            if (r1 != r8) goto L21a
            int r1 = r4 + 2
            r1 = r3[r1]
            if (r1 != r7) goto L21a
            int r1 = r4 + 3
            r7 = 1
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L215
            goto L1e1
        L215:
            int r4 = r4 + 4
            r1 = r3[r1]
            goto L1e9
        L21a:
            r1 = 102(0x66, float:1.43E-43)
            r8 = 97
            if (r13 != r1) goto L24d
            int r1 = r4 + 3
            if (r1 >= r5) goto L24d
            r12 = r3[r4]
            if (r12 != r8) goto L24d
            int r12 = r4 + 1
            r12 = r3[r12]
            if (r12 != r10) goto L24d
            int r10 = r4 + 2
            r10 = r3[r10]
            r12 = 115(0x73, float:1.61E-43)
            if (r10 != r12) goto L24d
            r1 = r3[r1]
            if (r1 != r7) goto L24d
            int r1 = r4 + 4
            r7 = 0
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L247
            r4 = r1
            r13 = r16
            goto L1eb
        L247:
            int r4 = r4 + 5
            r1 = r3[r1]
            r13 = r1
            goto L1eb
        L24d:
            r7 = 0
            r1 = 78
            if (r13 != r1) goto L273
            r10 = r3[r4]
            if (r10 != r8) goto L273
            int r8 = r4 + 1
            r8 = r3[r8]
            if (r8 != r1) goto L273
            int r1 = r4 + 2
            r8 = 1
            r0.boolValue = r8
            r10 = 14
            r0.valueType = r10
            if (r1 != r5) goto L26b
            r4 = r1
            r13 = r16
            goto L270
        L26b:
            int r4 = r4 + 3
            r1 = r3[r1]
            r13 = r1
        L270:
            r24 = r8
            goto L2a1
        L273:
            r8 = 1
            r1 = 123(0x7b, float:1.72E-43)
            if (r13 != r1) goto L289
            if (r6 != 0) goto L289
            r0.offset = r4
            char r1 = (char) r13
            r0.f1814ch = r1
            java.util.Map r1 = r0.readObject()
            r0.complex = r1
            r1 = 6
            r0.valueType = r1
            return
        L289:
            r1 = 91
            if (r13 != r1) goto L2a1
            if (r6 != 0) goto L2a1
            r0.offset = r4
            char r1 = (char) r13
            r0.f1814ch = r1
            java.util.List r1 = r0.readArray()
            r0.complex = r1
            r1 = 7
            r0.valueType = r1
            return
        L29e:
            r8 = r26
            r7 = 0
        L2a1:
            if (r6 == 0) goto L2bc
            if (r13 == r6) goto L2b1
            r0.offset = r2
            char r1 = (char) r6
            r0.f1814ch = r1
            r0.readString0()
            r1 = 3
            r0.valueType = r1
            return
        L2b1:
            if (r4 != r5) goto L2b6
            r13 = r16
            goto L2bc
        L2b6:
            int r1 = r4 + 1
            r2 = r3[r4]
            r4 = r1
            r13 = r2
        L2bc:
            r1 = 76
            if (r13 == r1) goto L2d4
            r1 = 70
            if (r13 == r1) goto L2d4
            r1 = 68
            if (r13 == r1) goto L2d4
            r1 = 66
            if (r13 == r1) goto L2d4
            r1 = 83
            if (r13 != r1) goto L2d1
            goto L2d4
        L2d1:
            r1 = 32
            goto L326
        L2d4:
            r1 = 66
            if (r13 == r1) goto L30f
            r1 = 68
            if (r13 == r1) goto L30a
            r1 = 70
            if (r13 == r1) goto L305
            r1 = 76
            if (r13 == r1) goto L2f5
            r1 = 83
            if (r13 == r1) goto L2e9
            goto L31a
        L2e9:
            if (r23 != 0) goto L31a
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L31a
            r1 = r25
            r0.valueType = r1
            goto L31a
        L2f5:
            r2 = 2
            int r1 = r4 - r9
            r6 = 19
            if (r1 >= r6) goto L31a
            byte r1 = r0.valueType
            if (r1 == r2) goto L31a
            r1 = 11
            r0.valueType = r1
            goto L31a
        L305:
            r1 = 12
            r0.valueType = r1
            goto L31a
        L30a:
            r1 = 13
            r0.valueType = r1
            goto L31a
        L30f:
            if (r23 != 0) goto L31a
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L31a
            r1 = 9
            r0.valueType = r1
        L31a:
            if (r4 != r5) goto L31f
        L31c:
            r13 = r16
            goto L2d1
        L31f:
            int r1 = r4 + 1
            r2 = r3[r4]
        L323:
            r4 = r1
            r13 = r2
            goto L2d1
        L326:
            if (r13 > r1) goto L338
            long r1 = r21 << r13
            long r1 = r1 & r19
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L338
            if (r4 != r5) goto L333
            goto L31c
        L333:
            int r1 = r4 + 1
            r2 = r3[r4]
            goto L323
        L338:
            r1 = 44
            if (r13 != r1) goto L33e
            r1 = r8
            goto L33f
        L33e:
            r1 = r7
        L33f:
            r0.comma = r1
            if (r1 == 0) goto L366
            if (r4 != r5) goto L348
            r2 = r16
            goto L34d
        L348:
            int r1 = r4 + 1
            r2 = r3[r4]
            r4 = r1
        L34d:
            r13 = r2
            r1 = 32
        L350:
            if (r13 > r1) goto L366
            long r6 = r21 << r13
            long r6 = r6 & r19
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L366
            if (r4 != r5) goto L35f
            r13 = r16
            goto L350
        L35f:
            int r2 = r4 + 1
            r4 = r3[r4]
            r13 = r4
            r4 = r2
            goto L350
        L366:
            if (r24 == 0) goto L36e
            r0.offset = r4
            char r1 = (char) r13
            r0.f1814ch = r1
            return
        L36e:
            java.lang.String r1 = "illegal input error"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetDateTime readOffsetDateTime() {
            r29 = this;
            r0 = r29
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r0.end
            char r4 = r0.f1814ch
            r5 = 34
            if (r4 == r5) goto L12
            r6 = 39
            if (r4 != r6) goto L136
        L12:
            com.alibaba.fastjson2.JSONReader$Context r6 = r0.context
            boolean r6 = r6.formatComplex
            if (r6 != 0) goto L136
            int r6 = r2 + 19
            int r7 = r1.length
            if (r6 >= r7) goto L136
            if (r6 >= r3) goto L136
            int r7 = com.alibaba.fastjson2.util.DateUtils.yy(r1, r2)
            r8 = -1
            if (r7 == r8) goto L136
            int r9 = r2 + 2
            long r9 = com.alibaba.fastjson2.util.DateUtils.ymd(r1, r9)
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L136
            int r13 = r2 + 10
            r13 = r1[r13]
            r14 = 32
            if (r13 == r14) goto L3e
            r15 = 84
            if (r13 != r15) goto L136
        L3e:
            int r13 = r2 + 11
            r15 = r11
            long r11 = com.alibaba.fastjson2.util.DateUtils.hms(r1, r13)
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 == 0) goto L136
            int r13 = r2 + 20
            r6 = r1[r6]
            r15 = 46
            r16 = 0
            if (r6 != r15) goto L58
            int r2 = r2 + 21
            r6 = r1[r13]
            r13 = r2
        L58:
            r2 = r16
            r15 = r2
        L5b:
            r14 = 48
            r17 = r14
            if (r6 < r14) goto L78
            r14 = 57
            if (r6 > r14) goto L78
            int r2 = r2 * 10
            int r14 = r6 + (-48)
            int r2 = r2 + r14
            int r15 = r15 + 1
            if (r13 >= r3) goto L78
            int r6 = r13 + 1
            r13 = r1[r13]
            r28 = r13
            r13 = r6
            r6 = r28
            goto L5b
        L78:
            if (r15 == 0) goto L7e
            int r2 = com.alibaba.fastjson2.util.DateUtils.nanos(r2, r15)
        L7e:
            r24 = r2
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            r14 = 90
            r15 = 1
            if (r6 != r14) goto L8f
            int r5 = r13 + 1
            r6 = r1[r13]
            r25 = r2
            r13 = r5
            goto La8
        L8f:
            if (r6 == r4) goto La6
            int r5 = com.alibaba.fastjson2.util.IOUtils.indexOfChar(r1, r5, r13, r3)
            if (r5 == r8) goto La6
            int r2 = r13 + (-1)
            int r6 = r5 - r13
            int r6 = r6 + r15
            java.time.ZoneOffset r2 = com.alibaba.fastjson2.util.DateUtils.zoneOffset(r1, r2, r6)
            int r13 = r5 + 1
            r25 = r2
            r6 = r4
            goto La8
        La6:
            r25 = r2
        La8:
            if (r6 != r4) goto L136
            r2 = 26
            if (r13 < r3) goto Lb0
        Lae:
            r5 = r2
            goto Lb5
        Lb0:
            int r4 = r13 + 1
            r5 = r1[r13]
        Lb4:
            r13 = r4
        Lb5:
            r18 = 0
            r20 = 4294981377(0x100003701, double:2.122002748E-314)
            r22 = 1
            r4 = 32
            if (r5 > r4) goto Ld2
            long r26 = r22 << r5
            long r26 = r26 & r20
            int r4 = (r26 > r18 ? 1 : (r26 == r18 ? 0 : -1))
            if (r4 == 0) goto Ld2
            if (r13 != r3) goto Lcd
            goto Lae
        Lcd:
            int r4 = r13 + 1
            r5 = r1[r13]
            goto Lb4
        Ld2:
            r4 = 44
            if (r5 != r4) goto Ld7
            goto Ld9
        Ld7:
            r15 = r16
        Ld9:
            r0.comma = r15
            if (r15 == 0) goto Lfe
            if (r13 != r3) goto Le1
            r5 = r2
            goto Le7
        Le1:
            int r4 = r13 + 1
            r5 = r1[r13]
            char r5 = (char) r5
            r13 = r4
        Le7:
            r4 = 32
        Le9:
            if (r5 > r4) goto Lfe
            long r14 = r22 << r5
            long r14 = r14 & r20
            int r6 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r6 == 0) goto Lfe
            if (r13 != r3) goto Lf7
            r5 = r2
            goto Le9
        Lf7:
            int r5 = r13 + 1
            r6 = r1[r13]
            r13 = r5
            r5 = r6
            goto Le9
        Lfe:
            if (r5 >= 0) goto L104
            r0.char_utf8(r5, r13)
            goto L109
        L104:
            r0.offset = r13
            char r1 = (char) r5
            r0.f1814ch = r1
        L109:
            int r1 = (int) r9
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r18 = r7 + r1
            r1 = 24
            long r2 = r9 >> r1
            int r2 = (int) r2
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r3 = r9 >> r17
            int r3 = (int) r3
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = (int) r11
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r5 = r11 >> r1
            int r1 = (int) r5
            r1 = r1 & 255(0xff, float:3.57E-43)
            long r5 = r11 >> r17
            int r5 = (int) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            r22 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r23 = r5
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.of(r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L136:
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L13e
            r1 = 0
            return r1
        L13e:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetTime readOffsetTime() {
            r15 = this;
            byte[] r0 = r15.bytes
            int r1 = r15.offset
            com.alibaba.fastjson2.JSONReader$Context r2 = r15.context
            char r3 = r15.f1814ch
            r4 = 34
            java.lang.String r5 = "illegal offsetTime"
            if (r3 == r4) goto L12
            r4 = 39
            if (r3 != r4) goto Lf1
        L12:
            java.lang.String r2 = r2.dateFormat
            if (r2 != 0) goto Lf1
            int r2 = r1 + 8
            int r4 = r0.length
            if (r2 >= r4) goto Lf1
            int r4 = r15.end
            if (r2 >= r4) goto Lf1
            int r4 = r1 + 2
            r4 = r0[r4]
            r6 = 58
            if (r4 != r6) goto Lf1
            int r4 = r1 + 5
            r4 = r0[r4]
            if (r4 != r6) goto Lf1
            r4 = r0[r1]
            int r6 = r1 + 1
            r6 = r0[r6]
            int r7 = r1 + 3
            r7 = r0[r7]
            int r8 = r1 + 4
            r8 = r0[r8]
            int r9 = r1 + 6
            r9 = r0[r9]
            int r10 = r1 + 7
            r10 = r0[r10]
            r11 = 48
            if (r4 < r11) goto Le9
            r12 = 57
            if (r4 > r12) goto Le9
            if (r6 < r11) goto Le9
            if (r6 > r12) goto Le9
            int r4 = r4 - r11
            int r4 = r4 * 10
            int r6 = r6 - r11
            int r6 = r6 + r4
            if (r7 < r11) goto Le1
            if (r7 > r12) goto Le1
            if (r8 < r11) goto Le1
            if (r8 > r12) goto Le1
            int r7 = r7 - r11
            int r7 = r7 * 10
            int r8 = r8 - r11
            int r8 = r8 + r7
            if (r9 < r11) goto Ld8
            if (r9 > r12) goto Ld8
            if (r10 < r11) goto Ld8
            if (r10 > r12) goto Ld8
            int r9 = r9 - r11
            int r9 = r9 * 10
            int r10 = r10 - r11
            int r10 = r10 + r9
            int r4 = r1 + 25
            r5 = -1
            r7 = r2
            r9 = r5
        L73:
            r11 = 0
            r12 = 1
            if (r7 >= r4) goto L98
            int r13 = r15.end
            if (r7 >= r13) goto L98
            int r13 = r0.length
            if (r7 >= r13) goto L98
            r13 = r0[r7]
            if (r9 != r5) goto L91
            r14 = 90
            if (r13 == r14) goto L8e
            r14 = 43
            if (r13 == r14) goto L8e
            r14 = 45
            if (r13 != r14) goto L91
        L8e:
            int r9 = r7 - r2
            int r9 = r9 - r12
        L91:
            if (r13 != r3) goto L95
            int r7 = r7 - r1
            goto L99
        L95:
            int r7 = r7 + 1
            goto L73
        L98:
            r7 = r11
        L99:
            if (r9 > 0) goto L9d
            r2 = r11
            goto La3
        L9d:
            int r2 = r1 + 9
            int r2 = com.alibaba.fastjson2.util.DateUtils.readNanos(r0, r9, r2)
        La3:
            int r3 = r7 + (-9)
            int r3 = r3 - r9
            if (r3 > r12) goto Lab
            java.time.ZoneOffset r0 = java.time.ZoneOffset.UTC
            goto Lb7
        Lab:
            java.lang.String r4 = new java.lang.String
            int r1 = r1 + 9
            int r1 = r1 + r9
            r4.<init>(r0, r1, r3)
            java.time.ZoneOffset r0 = java.time.ZoneOffset.of(r4)
        Lb7:
            java.time.LocalTime r1 = java.time.LocalTime.of(r6, r8, r10, r2)
            java.time.OffsetTime r0 = java.time.OffsetTime.of(r1, r0)
            int r1 = r15.offset
            int r7 = r7 + 2
            int r7 = r7 + r1
            r15.offset = r7
            r15.next()
            char r1 = r15.f1814ch
            r2 = 44
            if (r1 != r2) goto Ld0
            r11 = r12
        Ld0:
            r15.comma = r11
            if (r11 == 0) goto Ld7
            r15.next()
        Ld7:
            return r0
        Ld8:
            java.lang.String r0 = r15.info(r5)
            ah.a.w(r0)
        Ldf:
            r0 = 0
            return r0
        Le1:
            java.lang.String r0 = r15.info(r5)
            ah.a.w(r0)
            goto Ldf
        Le9:
            java.lang.String r0 = r15.info(r5)
            ah.a.w(r0)
            goto Ldf
        Lf1:
            java.lang.String r0 = r15.info(r5)
            ah.a.w(r0)
            goto Ldf
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String readPattern() {
            r15 = this;
            char r0 = r15.f1814ch
            r1 = 47
            if (r0 != r1) goto L83
            byte[] r0 = r15.bytes
            int r2 = r15.offset
            r3 = r2
        Lb:
            int r4 = r15.end
            if (r3 >= r4) goto L17
            r4 = r0[r3]
            if (r4 != r1) goto L14
            goto L17
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            java.lang.String r1 = new java.lang.String
            int r4 = r3 - r2
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2, r4, r5)
            int r2 = r3 + 1
            int r4 = r15.end
            r5 = 26
            if (r2 != r4) goto L2b
            r3 = r2
        L29:
            r2 = r5
            goto L2f
        L2b:
            int r3 = r3 + 2
            r2 = r0[r2]
        L2f:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r4 = 32
            if (r2 > r4) goto L50
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L50
            int r2 = r15.end
            if (r3 != r2) goto L48
            goto L29
        L48:
            int r2 = r3 + 1
            r3 = r0[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L2f
        L50:
            r12 = 44
            if (r2 != r12) goto L56
            r12 = 1
            goto L57
        L56:
            r12 = 0
        L57:
            r15.comma = r12
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L62
            r2 = r3
            r3 = r5
            goto L66
        L62:
            int r2 = r3 + 1
            r3 = r0[r3]
        L66:
            r14 = r3
            r3 = r2
            r2 = r14
        L69:
            if (r2 > r4) goto L7d
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L7d
            int r2 = r15.end
            if (r3 != r2) goto L78
            r2 = r5
            goto L69
        L78:
            int r2 = r3 + 1
            r3 = r0[r3]
            goto L66
        L7d:
            r15.offset = r3
            char r0 = (char) r2
            r15.f1814ch = r0
            return r1
        L83:
            java.lang.String r0 = "illegal pattern"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.lang.String readReference() {
            r15 = this;
            int r0 = r15.referenceBegin
            int r1 = r15.end
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            byte[] r1 = r15.bytes
            int r2 = r0 + 1
            r15.offset = r2
            r0 = r1[r0]
            char r0 = (char) r0
            r15.f1814ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.f1814ch
            int r3 = r15.offset
        L1b:
            r4 = 0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r2 > r10) goto L3f
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L3f
            int r2 = r15.end
            if (r3 != r2) goto L37
            r2 = r11
            goto L1b
        L37:
            int r2 = r3 + 1
            r3 = r1[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L1b
        L3f:
            r12 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L97
            int r2 = r15.end
            if (r3 != r2) goto L4a
            r2 = r3
        L48:
            r3 = r11
            goto L4e
        L4a:
            int r2 = r3 + 1
            r3 = r1[r3]
        L4e:
            if (r3 > r10) goto L64
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L64
            int r3 = r15.end
            if (r2 != r3) goto L5c
            goto L48
        L5c:
            int r3 = r2 + 1
            r2 = r1[r2]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L4e
        L64:
            r12 = 44
            if (r3 != r12) goto L6a
            r12 = 1
            goto L6b
        L6a:
            r12 = 0
        L6b:
            r15.comma = r12
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L76
            r3 = r2
            r2 = r11
            goto L7a
        L76:
            int r3 = r2 + 1
            r2 = r1[r2]
        L7a:
            r14 = r3
            r3 = r2
            r2 = r14
        L7d:
            if (r3 > r10) goto L91
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L91
            int r3 = r15.end
            if (r2 != r3) goto L8c
            r3 = r11
            goto L7d
        L8c:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L7a
        L91:
            char r1 = (char) r3
            r15.f1814ch = r1
            r15.offset = r2
            return r0
        L97:
            java.lang.String r1 = "illegal reference : "
            java.lang.String r0 = wb.en.g(r1, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
            r21 = this;
            r0 = r21
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            r3 = 34
            if (r2 == r3) goto L14
            r4 = 39
            if (r2 != r4) goto Lf
            goto L14
        Lf:
            java.lang.String r1 = r0.readStringNotMatch()
            return r1
        L14:
            int r4 = r0.offset
            int r5 = r0.end
            r6 = 0
            r0.valueEscape = r6
            r7 = 1
            r8 = r4
            r9 = r6
            r10 = r7
        L1f:
            if (r8 >= r5) goto L20d
            r11 = r1[r8]
            r12 = 120(0x78, float:1.68E-43)
            r13 = 117(0x75, float:1.64E-43)
            r15 = 92
            r16 = 4
            r17 = 2
            if (r11 != r15) goto L45
            r0.valueEscape = r7
            int r11 = r8 + 1
            r11 = r1[r11]
            if (r11 != r13) goto L39
            r14 = 6
            goto L40
        L39:
            if (r11 != r12) goto L3e
            r14 = r16
            goto L40
        L3e:
            r14 = r17
        L40:
            int r8 = r8 + r14
            r18 = r7
            goto L207
        L45:
            if (r11 < 0) goto L1f2
            if (r11 != r2) goto L1ed
            boolean r11 = r0.valueEscape
            r18 = r7
            r7 = 0
            if (r11 == 0) goto L128
            char[] r8 = r0.charBuf
            if (r8 != 0) goto L60
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r8 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r10 = r0.cacheItem
            java.lang.Object r8 = r8.getAndSet(r10, r7)
            char[] r8 = (char[]) r8
            r0.charBuf = r8
        L60:
            if (r8 == 0) goto L68
            int r10 = r8.length
            if (r10 >= r9) goto L66
            goto L68
        L66:
            r11 = r8
            goto L6d
        L68:
            char[] r8 = new char[r9]
            r0.charBuf = r8
            goto L66
        L6d:
            r8 = r6
        L6e:
            r10 = r1[r4]
            r19 = 12
            if (r10 != r15) goto Ld3
            int r10 = r4 + 1
            r20 = 6
            r14 = r1[r10]
            if (r14 == r3) goto Lcc
            if (r14 == r15) goto Lcc
            r15 = 98
            if (r14 == r15) goto Lc9
            r15 = 102(0x66, float:1.43E-43)
            if (r14 == r15) goto L9a
            r15 = 110(0x6e, float:1.54E-43)
            if (r14 == r15) goto Lc6
            r15 = 114(0x72, float:1.6E-43)
            if (r14 == r15) goto Lc3
            if (r14 == r12) goto Lb6
            r15 = 116(0x74, float:1.63E-43)
            if (r14 == r15) goto Lb3
            if (r14 == r13) goto L9d
            char r19 = r0.char1(r14)
        L9a:
            r14 = r19
            goto Lcc
        L9d:
            int r10 = r4 + 2
            r10 = r1[r10]
            int r14 = r4 + 3
            r14 = r1[r14]
            int r15 = r4 + 4
            r15 = r1[r15]
            int r4 = r4 + 5
            r12 = r1[r4]
            char r19 = com.alibaba.fastjson2.JSONReader.char4(r10, r14, r15, r12)
        Lb1:
            r10 = r4
            goto L9a
        Lb3:
            r19 = 9
            goto L9a
        Lb6:
            int r10 = r4 + 2
            r10 = r1[r10]
            int r4 = r4 + 3
            r12 = r1[r4]
            char r19 = com.alibaba.fastjson2.JSONReader.char2(r10, r12)
            goto Lb1
        Lc3:
            r19 = 13
            goto L9a
        Lc6:
            r19 = 10
            goto L9a
        Lc9:
            r19 = 8
            goto L9a
        Lcc:
            char r4 = (char) r14
            r11[r8] = r4
            int r10 = r10 + 1
            r4 = r10
            goto L120
        Ld3:
            r20 = 6
            if (r10 != r2) goto Ldf
            java.lang.String r2 = new java.lang.String
            r2.<init>(r11, r6, r9)
            r8 = r4
            goto L16f
        Ldf:
            if (r10 < 0) goto Le7
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 1
            goto L120
        Le7:
            r12 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r12 >> 4
            switch(r12) {
                case 12: goto L110;
                case 13: goto L110;
                case 14: goto Lf6;
                default: goto Lee;
            }
        Lee:
            char2_utf8(r1, r4, r10, r11, r8)
            int r4 = r4 + 4
            int r8 = r8 + 1
            goto L120
        Lf6:
            r10 = r10 & 15
            int r10 = r10 << 12
            int r12 = r4 + 1
            r12 = r1[r12]
            r12 = r12 & 63
            int r12 = r12 << 6
            r10 = r10 | r12
            int r12 = r4 + 2
            r12 = r1[r12]
            r12 = r12 & 63
            r10 = r10 | r12
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 3
            goto L120
        L110:
            int r12 = r4 + 1
            r12 = r1[r12]
            r10 = r10 & 31
            int r10 = r10 << 6
            r12 = r12 & 63
            r10 = r10 | r12
            char r10 = (char) r10
            r11[r8] = r10
            int r4 = r4 + 2
        L120:
            int r8 = r8 + 1
            r12 = 120(0x78, float:1.68E-43)
            r15 = 92
            goto L6e
        L128:
            if (r10 == 0) goto L166
            int r2 = r8 - r4
            int r9 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            if (r9 >= r3) goto L15d
            char[] r3 = r0.charBuf
            if (r3 != 0) goto L140
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r3 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r9 = r0.cacheItem
            java.lang.Object r3 = r3.getAndSet(r9, r7)
            char[] r3 = (char[]) r3
            r0.charBuf = r3
        L140:
            if (r3 == 0) goto L145
            int r9 = r3.length
            if (r9 >= r2) goto L149
        L145:
            char[] r3 = new char[r2]
            r0.charBuf = r3
        L149:
            r9 = r6
        L14a:
            if (r9 >= r2) goto L156
            int r10 = r4 + r9
            r10 = r1[r10]
            char r10 = (char) r10
            r3[r9] = r10
            int r9 = r9 + 1
            goto L14a
        L156:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3, r6, r2)
            r2 = r4
            goto L16f
        L15d:
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r1, r4, r2, r9)
            r2 = r3
            goto L16f
        L166:
            java.lang.String r2 = new java.lang.String
            int r3 = r8 - r4
            java.nio.charset.Charset r9 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r1, r4, r3, r9)
        L16f:
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r9 = r9.mask
            long r3 = r3 & r9
            r9 = 0
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L182
            java.lang.String r2 = r2.trim()
        L182:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L196
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r11 = r11.mask
            long r3 = r3 & r11
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 == 0) goto L196
            goto L197
        L196:
            r7 = r2
        L197:
            int r2 = r8 + 1
            r3 = 26
            if (r2 != r5) goto L1a0
            r8 = r2
        L19e:
            r2 = r3
            goto L1a4
        L1a0:
            int r8 = r8 + 2
            r2 = r1[r2]
        L1a4:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r4 = 32
            if (r2 > r4) goto L1c0
            long r15 = r13 << r2
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L1c0
            if (r8 != r5) goto L1b9
            goto L19e
        L1b9:
            int r2 = r8 + 1
            r4 = r1[r8]
            r8 = r2
            r2 = r4
            goto L1a4
        L1c0:
            r15 = 44
            if (r2 != r15) goto L1c6
            r6 = r18
        L1c6:
            r0.comma = r6
            if (r6 == 0) goto L1e7
            if (r8 != r5) goto L1ce
            r6 = r3
            goto L1d3
        L1ce:
            int r2 = r8 + 1
            r6 = r1[r8]
            goto L1e5
        L1d3:
            r2 = r6
        L1d4:
            if (r2 > r4) goto L1e7
            long r15 = r13 << r2
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto L1e7
            if (r8 != r5) goto L1e1
            r2 = r3
            goto L1d4
        L1e1:
            int r2 = r8 + 1
            r6 = r1[r8]
        L1e5:
            r8 = r2
            goto L1d3
        L1e7:
            char r1 = (char) r2
            r0.f1814ch = r1
            r0.offset = r8
            return r7
        L1ed:
            r18 = r7
            int r8 = r8 + 1
            goto L207
        L1f2:
            r18 = r7
            r7 = r11 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            switch(r7) {
                case 12: goto L204;
                case 13: goto L204;
                case 14: goto L201;
                default: goto L1fb;
            }
        L1fb:
            int r8 = r8 + 4
            int r9 = r9 + 1
        L1ff:
            r10 = r6
            goto L207
        L201:
            int r8 = r8 + 3
            goto L1ff
        L204:
            int r8 = r8 + 2
            goto L1ff
        L207:
            int r9 = r9 + 1
            r7 = r18
            goto L1f
        L20d:
            java.lang.String r1 = "invalid escape character EOI"
            ah.a.w(r1)
            r1 = 0
            return r1
    }

    public void readString0() {
            r18 = this;
            r0 = r18
            char r1 = r0.f1814ch
            int r2 = r0.offset
            r3 = 0
            r0.valueEscape = r3
            byte[] r4 = r0.bytes
            r5 = 1
            r6 = r2
            r7 = r3
            r8 = r5
        Lf:
            r9 = r4[r6]
            r10 = 120(0x78, float:1.68E-43)
            r11 = 117(0x75, float:1.64E-43)
            r12 = 92
            r13 = 6
            r14 = 4
            if (r9 != r12) goto L2e
            r0.valueEscape = r5
            int r9 = r6 + 1
            r9 = r4[r9]
            if (r9 != r11) goto L24
            goto L29
        L24:
            if (r9 != r10) goto L28
            r13 = r14
            goto L29
        L28:
            r13 = 2
        L29:
            int r6 = r6 + r13
            r16 = r5
            goto L19d
        L2e:
            r15 = -2
            java.lang.String r3 = "malformed input around byte "
            if (r9 < 0) goto L17d
            if (r9 != r1) goto L178
            boolean r1 = r0.valueEscape
            if (r1 == 0) goto L12c
            char[] r1 = new char[r7]
            r6 = 0
        L3c:
            r7 = r4[r2]
            r8 = 34
            if (r7 != r12) goto L82
            int r7 = r2 + 1
            r9 = r4[r7]
            if (r9 == r8) goto L52
            if (r9 == r12) goto L52
            if (r9 == r11) goto L63
            if (r9 == r10) goto L55
            char r9 = r0.char1(r9)
        L52:
            r16 = r5
            goto L7a
        L55:
            int r7 = r2 + 2
            r7 = r4[r7]
            int r2 = r2 + 3
            r8 = r4[r2]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r7, r8)
            r7 = r2
            goto L52
        L63:
            int r7 = r2 + 2
            r7 = r4[r7]
            int r8 = r2 + 3
            r8 = r4[r8]
            int r9 = r2 + 4
            r9 = r4[r9]
            int r2 = r2 + 5
            r16 = r5
            r5 = r4[r2]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r7, r8, r9, r5)
            r7 = r2
        L7a:
            char r2 = (char) r9
            r1[r6] = r2
            int r7 = r7 + 1
            r2 = r7
            goto L124
        L82:
            r16 = r5
            if (r7 != r8) goto L8e
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            r6 = r2
            goto L142
        L8e:
            if (r7 < 0) goto L97
            char r5 = (char) r7
            r1[r6] = r5
            int r2 = r2 + 1
            goto L124
        L97:
            r5 = r7 & 255(0xff, float:3.57E-43)
            int r5 = r5 >> r14
            switch(r5) {
                case 12: goto L115;
                case 13: goto L115;
                case 14: goto Lfc;
                default: goto L9d;
            }
        L9d:
            int r5 = r7 >> 3
            if (r5 != r15) goto Lf4
            int r5 = r2 + 1
            int r8 = r2 + 2
            r5 = r4[r5]
            int r9 = r2 + 3
            r8 = r4[r8]
            int r2 = r2 + 4
            r9 = r4[r9]
            int r7 = r7 << 18
            int r17 = r5 << 12
            r7 = r7 ^ r17
            int r17 = r8 << 6
            r7 = r7 ^ r17
            r17 = 3678080(0x381f80, float:5.154088E-39)
            r17 = r9 ^ r17
            r7 = r7 ^ r17
            r5 = r5 & 192(0xc0, float:2.69E-43)
            r10 = 128(0x80, float:1.8E-43)
            if (r5 != r10) goto Lec
            r5 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto Lec
            r5 = r9 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto Lec
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r7 < r5) goto Lec
            r5 = 1114112(0x110000, float:1.561203E-39)
            if (r7 >= r5) goto Lec
            int r5 = r6 + 1
            int r8 = r7 >>> 10
            r9 = 55232(0xd7c0, float:7.7397E-41)
            int r8 = r8 + r9
            char r8 = (char) r8
            r1[r6] = r8
            r6 = r7 & 1023(0x3ff, float:1.434E-42)
            r7 = 56320(0xdc00, float:7.8921E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            r1[r5] = r6
            r6 = r5
            goto L124
        Lec:
            java.lang.String r1 = eh.a.l(r2, r3)
            ah.a.w(r1)
            return
        Lf4:
            java.lang.String r1 = eh.a.l(r2, r3)
            ah.a.w(r1)
            return
        Lfc:
            int r5 = r2 + 1
            int r8 = r2 + 2
            r5 = r4[r5]
            int r2 = r2 + 3
            r8 = r4[r8]
            r7 = r7 & 15
            int r7 = r7 << 12
            r5 = r5 & 63
            int r5 = r5 << r13
            r5 = r5 | r7
            r7 = r8 & 63
            r5 = r5 | r7
            char r5 = (char) r5
            r1[r6] = r5
            goto L124
        L115:
            int r5 = r2 + 1
            int r2 = r2 + 2
            r5 = r4[r5]
            r7 = r7 & 31
            int r7 = r7 << r13
            r5 = r5 & 63
            r5 = r5 | r7
            char r5 = (char) r5
            r1[r6] = r5
        L124:
            int r6 = r6 + 1
            r5 = r16
            r10 = 120(0x78, float:1.68E-43)
            goto L3c
        L12c:
            r16 = r5
            int r1 = r0.offset
            if (r8 == 0) goto L139
            int r2 = r6 - r1
            java.lang.String r3 = r0.getLatin1String(r1, r2)
            goto L142
        L139:
            java.lang.String r3 = new java.lang.String
            int r2 = r6 - r1
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r3.<init>(r4, r1, r2, r5)
        L142:
            int r6 = r6 + 1
            r1 = r4[r6]
        L146:
            r2 = 32
            if (r1 > r2) goto L15e
            r7 = 1
            long r7 = r7 << r1
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L15e
            int r6 = r6 + 1
            r1 = r4[r6]
            goto L146
        L15e:
            r2 = 44
            if (r1 != r2) goto L165
            r4 = r16
            goto L166
        L165:
            r4 = 0
        L166:
            r0.comma = r4
            int r6 = r6 + 1
            r0.offset = r6
            if (r1 != r2) goto L172
            r0.next()
            goto L175
        L172:
            char r1 = (char) r1
            r0.f1814ch = r1
        L175:
            r0.stringValue = r3
            return
        L178:
            r16 = r5
            int r6 = r6 + 1
            goto L19d
        L17d:
            r16 = r5
            r5 = r9 & 255(0xff, float:3.57E-43)
            int r5 = r5 >> r14
            switch(r5) {
                case 12: goto L19a;
                case 13: goto L19a;
                case 14: goto L197;
                default: goto L185;
            }
        L185:
            int r5 = r9 >> 3
            if (r5 != r15) goto L18f
            int r6 = r6 + 4
            int r7 = r7 + 1
        L18d:
            r8 = 0
            goto L19d
        L18f:
            java.lang.String r1 = eh.a.l(r6, r3)
            ah.a.w(r1)
            return
        L197:
            int r6 = r6 + 3
            goto L18d
        L19a:
            int r6 = r6 + 2
            goto L18d
        L19d:
            int r7 = r7 + 1
            r5 = r16
            r3 = 0
            goto Lf
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.util.UUID readUUID() {
            r19 = this;
            r0 = r19
            char r1 = r0.f1814ch
            r2 = 110(0x6e, float:1.54E-43)
            r3 = 0
            if (r1 != r2) goto Ld
            r0.readNull()
            return r3
        Ld:
            r2 = 34
            if (r1 == r2) goto L21
            r2 = 39
            if (r1 != r2) goto L16
            goto L21
        L16:
            java.lang.String r1 = "syntax error, can not read uuid"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            r1 = 0
            return r1
        L21:
            byte[] r2 = r0.bytes
            int r4 = r0.offset
            int r5 = r4 + 36
            int r6 = r2.length
            r7 = 32
            r8 = 0
            r9 = 0
            r11 = 4
            if (r5 >= r6) goto Lc0
            r5 = r2[r5]
            if (r5 != r1) goto Lc0
            int r5 = r4 + 8
            r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto Lc0
            int r5 = r4 + 13
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 18
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 23
            r5 = r2[r5]
            if (r5 != r6) goto Lc0
            r1 = r8
            r5 = r9
        L50:
            r3 = 8
            if (r1 >= r3) goto L64
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L50
        L64:
            r1 = 9
        L66:
            r3 = 13
            if (r1 >= r3) goto L7a
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L66
        L7a:
            r1 = 14
        L7c:
            r3 = 18
            if (r1 >= r3) goto L90
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto L7c
        L90:
            r1 = 19
            r12 = r9
        L93:
            r3 = 23
            if (r1 >= r3) goto La7
            long r12 = r12 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r1
            r14 = r2[r14]
            int r14 = r14 + (-48)
            r3 = r3[r14]
            long r14 = (long) r3
            long r12 = r12 + r14
            int r1 = r1 + 1
            goto L93
        La7:
            r1 = 24
        La9:
            r3 = 36
            if (r1 >= r3) goto Lbd
            long r12 = r12 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r1
            r14 = r2[r14]
            int r14 = r14 + (-48)
            r3 = r3[r14]
            long r14 = (long) r3
            long r12 = r12 + r14
            int r1 = r1 + 1
            goto La9
        Lbd:
            int r4 = r4 + 37
            goto Lf4
        Lc0:
            int r5 = r4 + 32
            int r6 = r2.length
            if (r5 >= r6) goto L138
            r5 = r2[r5]
            if (r5 != r1) goto L138
            r1 = r8
            r5 = r9
        Lcb:
            r3 = 16
            if (r1 >= r3) goto Ldf
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            r12 = r2[r12]
            int r12 = r12 + (-48)
            r3 = r3[r12]
            long r12 = (long) r3
            long r5 = r5 + r12
            int r1 = r1 + 1
            goto Lcb
        Ldf:
            r12 = r9
        Le0:
            if (r3 >= r7) goto Lf2
            long r12 = r12 << r11
            byte[] r1 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r14 = r4 + r3
            r14 = r2[r14]
            int r14 = r14 + (-48)
            r1 = r1[r14]
            long r14 = (long) r1
            long r12 = r12 + r14
            int r3 = r3 + 1
            goto Le0
        Lf2:
            int r4 = r4 + 33
        Lf4:
            int r1 = r0.end
            r3 = 26
            if (r4 != r1) goto Lfd
            r1 = r4
        Lfb:
            r4 = r3
            goto L101
        Lfd:
            int r1 = r4 + 1
            r4 = r2[r4]
        L101:
            if (r4 > r7) goto L120
            r14 = 1
            long r14 = r14 << r4
            r16 = 4294981377(0x100003701, double:2.122002748E-314)
            long r14 = r14 & r16
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 == 0) goto L120
            int r4 = r0.end
            if (r1 != r4) goto L116
            goto Lfb
        L116:
            int r4 = r1 + 1
            r1 = r2[r1]
            r18 = r4
            r4 = r1
            r1 = r18
            goto L101
        L120:
            r0.offset = r1
            r1 = 44
            if (r4 != r1) goto L127
            r8 = 1
        L127:
            r0.comma = r8
            if (r8 == 0) goto L12f
            r0.next()
            goto L132
        L12f:
            char r1 = (char) r4
            r0.f1814ch = r1
        L132:
            java.util.UUID r1 = new java.util.UUID
            r1.<init>(r5, r12)
            return r1
        L138:
            java.lang.String r1 = r0.readString()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L143
            return r3
        L143:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
            r25 = this;
            r0 = r25
            char r1 = r0.f1814ch
            r2 = 34
            if (r1 == r2) goto Lf
            r3 = 39
            if (r1 == r3) goto Lf
            r1 = -1
            return r1
        Lf:
            byte[] r3 = r0.bytes
            r4 = 1
            r0.nameAscii = r4
            r5 = 0
            r0.nameEscape = r5
            int r6 = r0.offset
            r0.nameBegin = r6
            int r7 = r0.end
            r10 = r5
            r11 = 0
        L20:
            r13 = 120(0x78, float:1.68E-43)
            r14 = 117(0x75, float:1.64E-43)
            r15 = 92
            r16 = 0
            if (r6 >= r7) goto L34
            r9 = r3[r6]
            if (r9 != r1) goto L3f
            if (r10 != 0) goto L38
            int r6 = r0.nameBegin
            r11 = r16
        L34:
            r20 = 32
            goto Lf5
        L38:
            r0.nameLength = r10
            r0.nameEnd = r6
            int r6 = r6 + 1
            goto L34
        L3f:
            if (r9 != r15) goto L7a
            r0.nameEscape = r4
            int r9 = r6 + 1
            r5 = r3[r9]
            if (r5 == r14) goto L63
            if (r5 == r13) goto L54
            char r5 = r0.char1(r5)
            r6 = r9
            r20 = 32
            r9 = r5
            goto L90
        L54:
            int r5 = r6 + 2
            r5 = r3[r5]
            int r6 = r6 + 3
            r9 = r3[r6]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r5, r9)
            r20 = 32
            goto L90
        L63:
            int r5 = r6 + 2
            r5 = r3[r5]
            int r9 = r6 + 3
            r9 = r3[r9]
            int r19 = r6 + 4
            r20 = 32
            r8 = r3[r19]
            int r6 = r6 + 5
            r2 = r3[r6]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r5, r9, r8, r2)
            goto L90
        L7a:
            r20 = 32
            r2 = -61
            if (r9 == r2) goto L84
            r2 = -62
            if (r9 != r2) goto L90
        L84:
            r2 = r9 & 31
            int r2 = r2 << 6
            int r6 = r6 + 1
            r5 = r3[r6]
            r5 = r5 & 63
            r2 = r2 | r5
            char r9 = (char) r2
        L90:
            r2 = 255(0xff, float:3.57E-43)
            if (r9 > r2) goto Lf1
            if (r9 < 0) goto Lf1
            r2 = 8
            if (r10 >= r2) goto Lf1
            if (r10 != 0) goto L9f
            if (r9 != 0) goto L9f
            goto Lf1
        L9f:
            switch(r10) {
                case 0: goto Le7;
                case 1: goto Le0;
                case 2: goto Ld8;
                case 3: goto Ld0;
                case 4: goto Lc6;
                case 5: goto Lbb;
                case 6: goto Lb0;
                case 7: goto La3;
                default: goto La2;
            }
        La2:
            goto Le9
        La3:
            byte r2 = (byte) r9
            long r8 = (long) r2
            r2 = 56
            long r8 = r8 << r2
            r13 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        Lad:
            long r11 = r11 & r13
            long r11 = r11 + r8
            goto Le9
        Lb0:
            byte r2 = (byte) r9
            long r8 = (long) r2
            r2 = 48
            long r8 = r8 << r2
            r13 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto Lad
        Lbb:
            byte r2 = (byte) r9
            long r8 = (long) r2
            r2 = 40
            long r8 = r8 << r2
            r13 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto Lad
        Lc6:
            byte r2 = (byte) r9
            long r8 = (long) r2
            long r8 = r8 << r20
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lad
        Ld0:
            byte r2 = (byte) r9
            int r2 = r2 << 24
            long r8 = (long) r2
            r13 = 16777215(0xffffff, double:8.2890456E-317)
            goto Lad
        Ld8:
            byte r2 = (byte) r9
            int r2 = r2 << 16
            long r8 = (long) r2
            r13 = 65535(0xffff, double:3.23786E-319)
            goto Lad
        Le0:
            byte r5 = (byte) r9
            int r2 = r5 << 8
            long r8 = (long) r2
            r13 = 255(0xff, double:1.26E-321)
            goto Lad
        Le7:
            byte r2 = (byte) r9
            long r11 = (long) r2
        Le9:
            int r6 = r6 + r4
            int r10 = r10 + 1
            r2 = 34
            r5 = 0
            goto L20
        Lf1:
            int r6 = r0.nameBegin
            r11 = r16
        Lf5:
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 == 0) goto Lfc
            r21 = r4
            goto L15c
        Lfc:
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r11 = r1
            r1 = 0
        L103:
            r2 = r3[r6]
            r8 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            if (r2 != r15) goto L150
            r0.nameEscape = r4
            int r2 = r6 + 1
            r5 = r3[r2]
            if (r5 == r14) goto L12f
            if (r5 == r13) goto L11d
            char r5 = r0.char1(r5)
        L11a:
            r21 = r4
            goto L146
        L11d:
            int r2 = r6 + 2
            r2 = r3[r2]
            int r5 = r6 + 3
            r6 = r3[r5]
            char r2 = com.alibaba.fastjson2.JSONReader.char2(r2, r6)
            r21 = r5
            r5 = r2
            r2 = r21
            goto L11a
        L12f:
            int r2 = r6 + 2
            r2 = r3[r2]
            int r5 = r6 + 3
            r5 = r3[r5]
            int r10 = r6 + 4
            r10 = r3[r10]
            int r6 = r6 + 5
            r21 = r4
            r4 = r3[r6]
            char r5 = com.alibaba.fastjson2.JSONReader.char4(r2, r5, r10, r4)
            r2 = r6
        L146:
            int r2 = r2 + 1
            long r4 = (long) r5
            long r4 = r4 ^ r11
            long r4 = r4 * r8
            r6 = r2
        L14c:
            r11 = r4
            r4 = 0
            goto L257
        L150:
            r21 = r4
            r4 = 34
            if (r2 != r4) goto L1b7
            r0.nameLength = r1
            r0.nameEnd = r6
            int r6 = r6 + 1
        L15c:
            r1 = 26
            if (r6 != r7) goto L162
            r4 = r1
            goto L167
        L162:
            int r2 = r6 + 1
            r4 = r3[r6]
            r6 = r2
        L167:
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r2 = r20
            if (r4 > r2) goto L186
            long r22 = r13 << r4
            long r22 = r22 & r8
            int r2 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r2 == 0) goto L186
            if (r6 != r7) goto L17e
            r4 = r1
            goto L183
        L17e:
            int r2 = r6 + 1
            r4 = r3[r6]
            r6 = r2
        L183:
            r20 = 32
            goto L167
        L186:
            r2 = 44
            if (r4 != r2) goto L18d
            r2 = r21
            goto L18e
        L18d:
            r2 = 0
        L18e:
            r0.comma = r2
            if (r2 == 0) goto L1b1
            if (r6 != r7) goto L196
            r4 = r1
            goto L19b
        L196:
            int r2 = r6 + 1
            r4 = r3[r6]
            r6 = r2
        L19b:
            r5 = 32
        L19d:
            if (r4 > r5) goto L1b1
            long r18 = r13 << r4
            long r18 = r18 & r8
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 == 0) goto L1b1
            if (r6 != r7) goto L1ab
            r4 = r1
            goto L19d
        L1ab:
            int r2 = r6 + 1
            r4 = r3[r6]
            r6 = r2
            goto L19d
        L1b1:
            r0.offset = r6
            char r1 = (char) r4
            r0.f1814ch = r1
            return r11
        L1b7:
            r5 = r20
            if (r2 < 0) goto L1c2
            int r6 = r6 + 1
            r23 = r8
            r4 = 0
            goto L252
        L1c2:
            r10 = r2 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            switch(r10) {
                case 12: goto L243;
                case 13: goto L243;
                case 14: goto L22f;
                default: goto L1c9;
            }
        L1c9:
            int r10 = r2 >> 3
            r4 = -2
            java.lang.String r5 = "malformed input around byte "
            if (r10 != r4) goto L227
            int r4 = r6 + 1
            int r10 = r6 + 2
            r4 = r3[r4]
            int r22 = r6 + 3
            r10 = r3[r10]
            int r6 = r6 + 4
            r23 = r8
            r8 = r3[r22]
            int r2 = r2 << 18
            int r9 = r4 << 12
            r2 = r2 ^ r9
            int r9 = r10 << 6
            r2 = r2 ^ r9
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r9 = r9 ^ r8
            r2 = r2 ^ r9
            r4 = r4 & 192(0xc0, float:2.69E-43)
            r9 = 128(0x80, float:1.8E-43)
            if (r4 != r9) goto L21d
            r4 = r10 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L21d
            r4 = r8 & 192(0xc0, float:2.69E-43)
            if (r4 != r9) goto L21d
            r4 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r4) goto L21d
            r4 = 1114112(0x110000, float:1.561203E-39)
            if (r2 >= r4) goto L21d
            int r4 = r2 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            r2 = r2 & 1023(0x3ff, float:1.434E-42)
            r5 = 56320(0xdc00, float:7.8921E-41)
            int r2 = r2 + r5
            char r2 = (char) r2
            long r4 = (long) r4
            long r4 = r4 ^ r11
            long r4 = r4 * r23
            long r8 = (long) r2
            long r4 = r4 ^ r8
            long r4 = r4 * r23
            int r1 = r1 + 1
            goto L14c
        L21d:
            java.lang.String r1 = eh.a.l(r6, r5)
            ah.a.w(r1)
        L224:
            r1 = 0
            return r1
        L227:
            java.lang.String r1 = eh.a.l(r6, r5)
            ah.a.w(r1)
            goto L224
        L22f:
            r23 = r8
            int r4 = r6 + 1
            r4 = r3[r4]
            int r5 = r6 + 2
            r5 = r3[r5]
            int r2 = char2_utf8(r2, r4, r5, r6)
            int r6 = r6 + 3
            r4 = 0
            r0.nameAscii = r4
            goto L252
        L243:
            r23 = r8
            r4 = 0
            int r5 = r6 + 1
            r5 = r3[r5]
            int r2 = char2_utf8(r2, r5, r6)
            int r6 = r6 + 2
            r0.nameAscii = r4
        L252:
            long r8 = (long) r2
            long r8 = r8 ^ r11
            long r8 = r8 * r23
            r11 = r8
        L257:
            int r1 = r1 + 1
            r4 = r21
            r20 = 32
            goto L103
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.ZonedDateTime readZonedDateTimeX(int r6) {
            r5 = this;
            boolean r0 = r5.isString()
            if (r0 == 0) goto L9b
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto Lc
            return r1
        Lc:
            r0 = 30
            r2 = 90
            if (r6 != r0) goto L27
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 29
            r4 = r0[r4]
            if (r4 != r2) goto L27
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L27:
            r0 = 29
            if (r6 != r0) goto L40
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 28
            r4 = r0[r4]
            if (r4 != r2) goto L40
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L40:
            r0 = 28
            if (r6 != r0) goto L59
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 27
            r4 = r0[r4]
            if (r4 != r2) goto L59
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L59:
            r0 = 27
            if (r6 != r0) goto L72
            byte[] r0 = r5.bytes
            int r3 = r5.offset
            int r4 = r3 + 26
            r4 = r0[r4]
            if (r4 != r2) goto L72
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L7e
        L72:
            byte[] r0 = r5.bytes
            int r2 = r5.offset
            com.alibaba.fastjson2.JSONReader$Context r3 = r5.context
            java.time.ZoneId r3 = r3.zoneId
            java.time.ZonedDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(r0, r2, r6, r3)
        L7e:
            if (r0 != 0) goto L81
            return r1
        L81:
            int r1 = r5.offset
            r2 = 1
            int r6 = r6 + r2
            int r6 = r6 + r1
            r5.offset = r6
            r5.next()
            char r6 = r5.f1814ch
            r1 = 44
            if (r6 != r1) goto L92
            goto L93
        L92:
            r2 = 0
        L93:
            r5.comma = r2
            if (r2 == 0) goto L9a
            r5.next()
        L9a:
            return r0
        L9b:
            java.lang.String r6 = "date only support string input"
            ah.a.w(r6)
            r6 = 0
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipComment() {
            r13 = this;
            int r0 = r13.offset
            int r1 = r0 + 1
            int r2 = r13.end
            if (r1 >= r2) goto L7e
            byte[] r2 = r13.bytes
            r3 = r2[r0]
            r4 = 42
            r5 = 0
            r6 = 47
            r7 = 1
            if (r3 != r4) goto L16
            r3 = r7
            goto L19
        L16:
            if (r3 != r6) goto L74
            r3 = r5
        L19:
            int r0 = r0 + 2
            r1 = r2[r1]
        L1d:
            if (r3 == 0) goto L2f
            if (r1 != r4) goto L2d
            int r1 = r13.end
            if (r0 > r1) goto L2d
            r1 = r2[r0]
            if (r1 != r6) goto L2d
            int r0 = r0 + 1
        L2b:
            r1 = r7
            goto L34
        L2d:
            r1 = r5
            goto L34
        L2f:
            r8 = 10
            if (r1 != r8) goto L2d
            goto L2b
        L34:
            int r8 = r13.end
            r9 = 26
            if (r1 == 0) goto L5f
            if (r0 < r8) goto L3d
            goto L61
        L3d:
            r1 = r2[r0]
        L3f:
            r3 = 32
            if (r1 > r3) goto L5c
            r3 = 1
            long r3 = r3 << r1
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r10
            r10 = 0
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 == 0) goto L5c
            int r0 = r0 + 1
            int r1 = r13.end
            if (r0 < r1) goto L59
            goto L5d
        L59:
            r1 = r2[r0]
            goto L3f
        L5c:
            r9 = r1
        L5d:
            int r0 = r0 + r7
            goto L61
        L5f:
            if (r0 < r8) goto L6c
        L61:
            char r1 = (char) r9
            r13.f1814ch = r1
            r13.offset = r0
            if (r9 != r6) goto L6b
            r13.skipComment()
        L6b:
            return
        L6c:
            int r1 = r0 + 1
            r0 = r2[r0]
            r12 = r1
            r1 = r0
            r0 = r12
            goto L1d
        L74:
            java.lang.String r0 = "parse comment error"
            java.lang.String r0 = r13.info(r0)
            ah.a.w(r0)
            return
        L7e:
            java.lang.String r0 = r13.info()
            ah.a.w(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean skipName() {
            r15 = this;
            char r0 = r15.f1814ch
            r1 = 0
            r3 = 39
            if (r0 != r3) goto L1b
            com.alibaba.fastjson2.JSONReader$Context r4 = r15.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r6 = r6.mask
            long r4 = r4 & r6
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L16
            goto L1b
        L16:
            com.alibaba.fastjson2.JSONException r0 = r15.notSupportName()
            throw r0
        L1b:
            r4 = 34
            r5 = 1
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            com.alibaba.fastjson2.JSONReader$Context r0 = r15.context
            long r3 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r6 = r0.mask
            long r3 = r3 & r6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L33
            r15.readFieldNameHashCodeUnquote()
            return r5
        L33:
            com.alibaba.fastjson2.JSONException r0 = r15.notSupportName()
            throw r0
        L38:
            int r3 = r15.offset
            byte[] r4 = r15.bytes
        L3c:
            int r6 = r3 + 1
            r7 = r4[r3]
            r8 = 92
            if (r7 != r8) goto L55
            r3 = r4[r6]
            r7 = 117(0x75, float:1.64E-43)
            if (r3 != r7) goto L4c
            r3 = 5
            goto L53
        L4c:
            r7 = 120(0x78, float:1.68E-43)
            if (r3 != r7) goto L52
            r3 = 3
            goto L53
        L52:
            r3 = r5
        L53:
            int r3 = r3 + r6
            goto L3c
        L55:
            if (r7 != r0) goto Lb2
            int r0 = r15.end
            r7 = 26
            if (r6 != r0) goto L5f
        L5d:
            r0 = r7
            goto L64
        L5f:
            int r3 = r3 + 2
            r0 = r4[r6]
            r6 = r3
        L64:
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r3 = 32
            if (r0 > r3) goto L82
            long r12 = r10 << r0
            long r12 = r12 & r8
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto L82
            int r0 = r15.end
            if (r6 != r0) goto L7b
            goto L5d
        L7b:
            int r0 = r6 + 1
            r3 = r4[r6]
            r6 = r0
            r0 = r3
            goto L64
        L82:
            r12 = 58
            if (r0 != r12) goto Lad
            int r0 = r15.end
            if (r6 != r0) goto L8d
            r0 = r6
        L8b:
            r6 = r7
            goto L91
        L8d:
            int r0 = r6 + 1
            r6 = r4[r6]
        L91:
            if (r6 > r3) goto La7
            long r12 = r10 << r6
            long r12 = r12 & r8
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 == 0) goto La7
            int r6 = r15.end
            if (r0 != r6) goto L9f
            goto L8b
        L9f:
            int r6 = r0 + 1
            r0 = r4[r0]
            r14 = r6
            r6 = r0
            r0 = r14
            goto L91
        La7:
            r15.offset = r0
            char r0 = (char) r6
            r15.f1814ch = r0
            return r5
        Lad:
            com.alibaba.fastjson2.JSONException r0 = com.alibaba.fastjson2.JSONReader.syntaxError(r0)
            throw r0
        Lb2:
            r3 = r6
            goto L3c
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void skipValue() {
            r20 = this;
            r0 = r20
            byte[] r1 = r0.bytes
            char r2 = r0.f1814ch
            int r3 = r0.offset
            int r4 = r0.end
            r5 = 0
            r0.comma = r5
            r6 = 125(0x7d, float:1.75E-43)
            r7 = 93
            r8 = 39
            r11 = 117(0x75, float:1.64E-43)
            r14 = 34
            if (r2 == r14) goto L20a
            if (r2 == r8) goto L20a
            r8 = 101(0x65, float:1.42E-43)
            r14 = 83
            r15 = 46
            r16 = 0
            r9 = 45
            r10 = 43
            if (r2 == r10) goto L126
            r12 = 102(0x66, float:1.43E-43)
            r13 = 108(0x6c, float:1.51E-43)
            if (r2 == r12) goto Lf5
            r12 = 110(0x6e, float:1.54E-43)
            if (r2 == r12) goto Lce
            r12 = 116(0x74, float:1.63E-43)
            if (r2 == r12) goto La4
            if (r2 == r9) goto L126
            if (r2 == r15) goto L126
            switch(r2) {
                case 48: goto L126;
                case 49: goto L126;
                case 50: goto L126;
                case 51: goto L126;
                case 52: goto L126;
                case 53: goto L126;
                case 54: goto L126;
                case 55: goto L126;
                case 56: goto L126;
                case 57: goto L126;
                default: goto L3e;
            }
        L3e:
            r8 = 91
            if (r2 != r8) goto L6f
            r0.next()
            r2 = r5
        L46:
            char r3 = r0.f1814ch
            if (r3 != r7) goto L5b
            r0.comma = r5
            int r2 = r0.offset
            if (r2 != r4) goto L55
        L50:
            r3 = r2
        L51:
            r2 = 26
            goto L252
        L55:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L252
        L5b:
            if (r2 == 0) goto L67
            boolean r3 = r0.comma
            if (r3 == 0) goto L62
            goto L67
        L62:
            com.alibaba.fastjson2.JSONException r1 = r0.valueError()
            throw r1
        L67:
            r0.comma = r5
            r0.skipValue()
            int r2 = r2 + 1
            goto L46
        L6f:
            r8 = 123(0x7b, float:1.72E-43)
            if (r2 != r8) goto L8e
            r0.next()
        L76:
            char r2 = r0.f1814ch
            if (r2 != r6) goto L87
            r0.comma = r5
            int r2 = r0.offset
            if (r2 != r4) goto L81
            goto L50
        L81:
            int r3 = r2 + 1
            r2 = r1[r2]
            goto L252
        L87:
            r0.skipName()
            r0.skipValue()
            goto L76
        L8e:
            if (r2 != r14) goto L9f
            boolean r5 = r0.nextIfSet()
            if (r5 == 0) goto L9f
            r0.skipValue()
            char r2 = r0.f1814ch
            int r3 = r0.offset
            goto L252
        L9f:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        La4:
            int r5 = r3 + 3
            if (r5 > r4) goto Lc9
            r9 = r1[r3]
            r10 = 114(0x72, float:1.6E-43)
            if (r9 != r10) goto Lc4
            int r9 = r3 + 1
            r9 = r1[r9]
            if (r9 != r11) goto Lc4
            int r9 = r3 + 2
            r9 = r1[r9]
            if (r9 != r8) goto Lc4
            if (r5 != r4) goto Lbe
        Lbc:
            r3 = r5
            goto L51
        Lbe:
            int r3 = r3 + 4
            r2 = r1[r5]
            goto L252
        Lc4:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lc9:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lce:
            int r5 = r3 + 3
            if (r5 > r4) goto Lf0
            r8 = r1[r3]
            if (r8 != r11) goto Leb
            int r8 = r3 + 1
            r8 = r1[r8]
            if (r8 != r13) goto Leb
            int r8 = r3 + 2
            r8 = r1[r8]
            if (r8 != r13) goto Leb
            if (r5 != r4) goto Le5
            goto Lbc
        Le5:
            int r3 = r3 + 4
            r2 = r1[r5]
            goto L252
        Leb:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lf0:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lf5:
            int r5 = r3 + 4
            if (r5 > r4) goto L121
            r9 = r1[r3]
            r10 = 97
            if (r9 != r10) goto L11c
            int r9 = r3 + 1
            r9 = r1[r9]
            if (r9 != r13) goto L11c
            int r9 = r3 + 2
            r9 = r1[r9]
            r10 = 115(0x73, float:1.61E-43)
            if (r9 != r10) goto L11c
            int r9 = r3 + 3
            r9 = r1[r9]
            if (r9 != r8) goto L11c
            if (r5 != r4) goto L116
            goto Lbc
        L116:
            int r3 = r3 + 5
            r2 = r1[r5]
            goto L252
        L11c:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L121:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L126:
            if (r2 == r9) goto L12a
            if (r2 != r10) goto L135
        L12a:
            if (r3 >= r4) goto L205
            int r2 = r3 + 1
            r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L135:
            if (r2 != r15) goto L139
            r11 = 1
            goto L13a
        L139:
            r11 = r5
        L13a:
            r12 = 57
            r13 = 48
            if (r11 != 0) goto L158
            if (r2 < r13) goto L158
            if (r2 > r12) goto L158
        L144:
            if (r3 != r4) goto L149
            r2 = 26
            goto L152
        L149:
            int r2 = r3 + 1
            r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L152:
            if (r2 < r13) goto L156
            if (r2 <= r12) goto L144
        L156:
            r11 = 1
            goto L159
        L158:
            r11 = r5
        L159:
            r5 = 76
            if (r11 == 0) goto L176
            if (r2 == r5) goto L16d
            r7 = 70
            if (r2 == r7) goto L16d
            r7 = 68
            if (r2 == r7) goto L16d
            r7 = 66
            if (r2 == r7) goto L16d
            if (r2 != r14) goto L176
        L16d:
            int r2 = r3 + 1
            r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L176:
            if (r2 != r15) goto L19e
            if (r3 != r4) goto L17d
            r2 = 26
            goto L186
        L17d:
            int r2 = r3 + 1
            r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L186:
            if (r2 < r13) goto L19c
            if (r2 > r12) goto L19c
        L18a:
            if (r3 != r4) goto L18f
            r2 = 26
            goto L198
        L18f:
            int r2 = r3 + 1
            r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L198:
            if (r2 < r13) goto L19c
            if (r2 <= r12) goto L18a
        L19c:
            r7 = 1
            goto L19f
        L19e:
            r7 = 0
        L19f:
            if (r11 != 0) goto L1a9
            if (r7 == 0) goto L1a4
            goto L1a9
        L1a4:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
        L1a9:
            if (r2 == r8) goto L1af
            r7 = 69
            if (r2 != r7) goto L1dd
        L1af:
            int r2 = r3 + 1
            r7 = r1[r3]
            if (r7 == r10) goto L1bb
            if (r7 != r9) goto L1b8
            goto L1bb
        L1b8:
            r18 = 0
            goto L1c4
        L1bb:
            if (r2 >= r4) goto L200
            int r3 = r3 + 2
            r7 = r1[r2]
            r2 = r3
            r18 = 1
        L1c4:
            if (r7 < r13) goto L1d9
            if (r7 > r12) goto L1d9
        L1c8:
            if (r2 != r4) goto L1ce
            r3 = r2
            r2 = 26
            goto L1d2
        L1ce:
            int r3 = r2 + 1
            r2 = r1[r2]
        L1d2:
            if (r2 < r13) goto L1dd
            if (r2 <= r12) goto L1d7
            goto L1dd
        L1d7:
            r2 = r3
            goto L1c8
        L1d9:
            if (r18 != 0) goto L1fb
            r3 = r2
            r2 = r7
        L1dd:
            if (r2 == r5) goto L1ed
            r5 = 70
            if (r2 == r5) goto L1ed
            r5 = 68
            if (r2 == r5) goto L1ed
            r5 = 66
            if (r2 == r5) goto L1ed
            if (r2 != r14) goto L252
        L1ed:
            if (r3 != r4) goto L1f1
        L1ef:
            goto L51
        L1f1:
            int r2 = r3 + 1
            r3 = r1[r3]
        L1f5:
            r19 = r3
            r3 = r2
            r2 = r19
            goto L252
        L1fb:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r7)
            throw r1
        L200:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r7)
            throw r1
        L205:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
        L20a:
            r16 = 0
            if (r2 != r8) goto L221
            com.alibaba.fastjson2.JSONReader$Context r5 = r0.context
            long r7 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r9 = r5.mask
            long r7 = r7 & r9
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 != 0) goto L21c
            goto L221
        L21c:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L221:
            int r5 = r3 + 1
            r3 = r1[r3]
        L225:
            r7 = 92
            if (r3 != r7) goto L247
            int r3 = r5 + 1
            r7 = r1[r5]
            if (r7 != r11) goto L232
            int r3 = r5 + 5
            goto L242
        L232:
            r8 = 120(0x78, float:1.68E-43)
            if (r7 != r8) goto L239
            int r3 = r5 + 3
            goto L242
        L239:
            r5 = 92
            if (r7 == r5) goto L242
            if (r7 == r14) goto L242
            r0.char1(r7)
        L242:
            int r5 = r3 + 1
            r3 = r1[r3]
            goto L225
        L247:
            if (r3 != r2) goto L2b8
            if (r5 != r4) goto L24d
            goto Lbc
        L24d:
            int r2 = r5 + 1
            r3 = r1[r5]
            goto L1f5
        L252:
            r5 = 32
            if (r2 > r5) goto L26b
            r7 = 1
            long r7 = r7 << r2
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 == 0) goto L26b
            if (r3 != r4) goto L266
            goto L1ef
        L266:
            int r2 = r3 + 1
            r3 = r1[r3]
            goto L1f5
        L26b:
            r5 = 44
            if (r2 != r5) goto L29c
            r7 = 1
            r0.comma = r7
            if (r3 != r4) goto L278
            r2 = r3
            r3 = 26
            goto L27c
        L278:
            int r2 = r3 + 1
            r3 = r1[r3]
        L27c:
            r19 = r3
            r3 = r2
            r2 = r19
        L281:
            r5 = 32
            if (r2 > r5) goto L29c
            r7 = 1
            long r7 = r7 << r2
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            int r5 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r5 == 0) goto L29c
            if (r3 != r4) goto L297
            r2 = 26
            goto L281
        L297:
            int r2 = r3 + 1
            r3 = r1[r3]
            goto L27c
        L29c:
            boolean r1 = r0.comma
            if (r1 != 0) goto L2b2
            r8 = 26
            if (r2 == r8) goto L2b2
            if (r2 == r6) goto L2b2
            r9 = 93
            if (r2 == r9) goto L2b2
            if (r2 != r8) goto L2ad
            goto L2b2
        L2ad:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L2b2:
            char r1 = (char) r2
            r0.f1814ch = r1
            r0.offset = r3
            return
        L2b8:
            r7 = 1
            r8 = 26
            r9 = 93
            int r3 = r5 + 1
            r5 = r1[r5]
            r19 = r5
            r5 = r3
            r3 = r19
            goto L225
    }
}
