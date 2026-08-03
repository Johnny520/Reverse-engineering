package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderUTF16 extends com.alibaba.fastjson2.JSONReader {
    static final long CHAR_MASK = 0;
    private int cacheIndex;
    protected final char[] chars;
    protected final int end;
    private java.io.Closeable input;
    protected final int length;
    private int nameBegin;
    private int nameEnd;
    private int nameLength;
    private int referenceBegin;
    protected final int start;
    protected final java.lang.String str;

    static {
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto La
            r0 = 71777214294589695(0xff00ff00ff00ff, double:7.064161022838689E-304)
            goto Lf
        La:
            r0 = -71777214294589696(0xff00ff00ff00ff00, double:-5.82767264895205E303)
        Lf:
            com.alibaba.fastjson2.JSONReaderUTF16.CHAR_MASK = r0
            return
    }

    public JSONReaderUTF16(com.alibaba.fastjson2.JSONReader.Context r11, java.io.InputStream r12) {
            r10 = this;
            r0 = 0
            r10.<init>(r11, r0)
            r1 = -1
            r10.cacheIndex = r1
            r10.input = r12
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            int r2 = java.lang.System.identityHashCode(r2)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r3 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r4 = r3.length
            r5 = 1
            int r4 = r4 - r5
            r2 = r2 & r4
            r2 = r3[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r3 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r4 = 0
            java.lang.Object r3 = r3.getAndSet(r2, r4)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L28
            int r3 = r11.bufferSize
            byte[] r3 = new byte[r3]
        L28:
            r6 = r0
        L29:
            int r7 = r3.length     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r7 = r7 - r6
            int r7 = r12.read(r3, r6, r7)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            if (r7 != r1) goto Lc3
            int r11 = r6 % 2
            if (r11 == r5) goto Lac
            int r11 = r6 / 2
            char[] r12 = new char[r11]     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r1 = r0
            r7 = r1
        L3b:
            if (r1 >= r6) goto L58
            r8 = r3[r1]     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r9 = r1 + 1
            r9 = r3[r9]     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r8 = r8 | r9
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r12[r7] = r8     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r1 = r1 + 2
            int r7 = r7 + 1
            goto L3b
        L52:
            r11 = move-exception
            goto Ld9
        L55:
            r11 = move-exception
            goto Ld1
        L58:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r1.lazySet(r2, r3)
            r10.str = r4
            r10.chars = r12
            r10.offset = r0
            r10.length = r11
            r10.start = r0
            r10.end = r11
            r1 = 26
            if (r11 != 0) goto L70
            r10.f1814ch = r1
            return
        L70:
            char r2 = r12[r0]
        L72:
            r3 = 32
            if (r2 > r3) goto L8e
            r3 = 1
            long r3 = r3 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r6
            r6 = 0
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 == 0) goto L8e
            int r0 = r0 + r5
            if (r0 < r11) goto L8b
            r10.f1814ch = r1
            return
        L8b:
            char r2 = r12[r0]
            goto L72
        L8e:
            r10.f1814ch = r2
            int r11 = r10.offset
            int r11 = r11 + r5
            r10.offset = r11
            r11 = 65534(0xfffe, float:9.1833E-41)
            if (r2 == r11) goto L9f
            r11 = 65279(0xfeff, float:9.1475E-41)
            if (r2 != r11) goto La2
        L9f:
            r10.next()
        La2:
            char r11 = r10.f1814ch
            r12 = 47
            if (r11 != r12) goto Lab
            r10.skipComment()
        Lab:
            return
        Lac:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r12.<init>()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            java.lang.String r0 = "illegal input utf16 bytes, length "
            r12.append(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r12.append(r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            throw r11     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
        Lc3:
            int r6 = r6 + r7
            int r7 = r3.length     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            if (r6 != r7) goto L29
            int r7 = r3.length     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r8 = r11.bufferSize     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            int r7 = r7 + r8
            byte[] r3 = java.util.Arrays.copyOf(r3, r7)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L55
            goto L29
        Ld1:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = "read error"
            r12.<init>(r0, r11)     // Catch: java.lang.Throwable -> L52
            throw r12     // Catch: java.lang.Throwable -> L52
        Ld9:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r12 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r12.lazySet(r2, r3)
            throw r11
    }

    public JSONReaderUTF16(com.alibaba.fastjson2.JSONReader.Context r7, java.io.Reader r8) {
            r6 = this;
            r0 = 0
            r6.<init>(r7, r0)
            r7 = -1
            r6.cacheIndex = r7
            r6.input = r8
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r1 = java.lang.System.identityHashCode(r1)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r2.length
            int r3 = r3 + (-1)
            r1 = r1 & r3
            r6.cacheIndex = r1
            r1 = r2[r1]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r2 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r3 = 0
            java.lang.Object r1 = r2.getAndSet(r1, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L2a
            r1 = 8192(0x2000, float:1.148E-41)
            char[] r1 = new char[r1]
        L2a:
            r2 = r0
        L2b:
            int r4 = r1.length     // Catch: java.io.IOException -> L9c
            int r4 = r4 - r2
            int r4 = r8.read(r1, r2, r4)     // Catch: java.io.IOException -> L9c
            if (r4 != r7) goto L8f
            r6.str = r3
            r6.chars = r1
            r6.offset = r0
            r6.length = r2
            r6.start = r0
            r6.end = r2
            r7 = 26
            if (r2 > 0) goto L46
            r6.f1814ch = r7
            return
        L46:
            char r8 = r1[r0]
            r6.f1814ch = r8
        L4a:
            char r8 = r6.f1814ch
            r0 = 32
            if (r8 > r0) goto L71
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L71
            int r8 = r6.offset
            int r8 = r8 + 1
            r6.offset = r8
            int r0 = r6.length
            if (r8 < r0) goto L6c
            r6.f1814ch = r7
            return
        L6c:
            char r8 = r1[r8]
            r6.f1814ch = r8
            goto L4a
        L71:
            int r7 = r6.offset
            int r7 = r7 + 1
            r6.offset = r7
            r7 = 65534(0xfffe, float:9.1833E-41)
            if (r8 == r7) goto L81
            r7 = 65279(0xfeff, float:9.1475E-41)
            if (r8 != r7) goto L84
        L81:
            r6.next()
        L84:
            char r7 = r6.f1814ch
            r8 = 47
            if (r7 != r8) goto L8e
            r6.skipComment()
            goto L84
        L8e:
            return
        L8f:
            int r2 = r2 + r4
            int r4 = r1.length     // Catch: java.io.IOException -> L9c
            if (r2 != r4) goto L2b
            int r4 = r1.length     // Catch: java.io.IOException -> L9c
            int r5 = r4 >> 1
            int r4 = r4 + r5
            char[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.io.IOException -> L9c
            goto L2b
        L9c:
            r7 = move-exception
            java.lang.String r8 = "read error"
            ah.a.x(r8, r7)
            r7 = 0
            throw r7
    }

    public JSONReaderUTF16(com.alibaba.fastjson2.JSONReader.Context r6, java.lang.String r7, int r8, int r9) {
            r5 = this;
            r0 = 0
            r5.<init>(r6, r0)
            r6 = -1
            r5.cacheIndex = r6
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            int r6 = java.lang.System.identityHashCode(r6)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r2 = r1.length
            int r2 = r2 + (-1)
            r6 = r6 & r2
            r5.cacheIndex = r6
            r6 = r1[r6]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r2 = 0
            java.lang.Object r3 = r1.getAndSet(r6, r2)
            char[] r3 = (char[]) r3
            if (r3 == 0) goto L27
            int r4 = r3.length
            if (r4 >= r9) goto L34
        L27:
            if (r3 == 0) goto L2c
            r1.lazySet(r6, r3)
        L2c:
            r6 = 8192(0x2000, float:1.148E-41)
            int r6 = java.lang.Math.max(r9, r6)
            char[] r3 = new char[r6]
        L34:
            int r6 = r8 + r9
            r7.getChars(r8, r6, r3, r0)
            if (r8 != 0) goto L3c
            goto L3d
        L3c:
            r7 = r2
        L3d:
            r5.str = r7
            r5.chars = r3
            r5.offset = r0
            r5.length = r9
            r5.start = r0
            r5.end = r9
            r6 = 26
            if (r9 > 0) goto L50
            r5.f1814ch = r6
            return
        L50:
            char r7 = r3[r0]
            r5.f1814ch = r7
        L54:
            char r7 = r5.f1814ch
            r8 = 32
            if (r7 > r8) goto L7b
            r8 = 1
            long r8 = r8 << r7
            r0 = 4294981377(0x100003701, double:2.122002748E-314)
            long r8 = r8 & r0
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 == 0) goto L7b
            int r7 = r5.offset
            int r7 = r7 + 1
            r5.offset = r7
            int r8 = r5.length
            if (r7 < r8) goto L76
            r5.f1814ch = r6
            return
        L76:
            char r7 = r3[r7]
            r5.f1814ch = r7
            goto L54
        L7b:
            int r6 = r5.offset
            int r6 = r6 + 1
            r5.offset = r6
            r6 = 65534(0xfffe, float:9.1833E-41)
            if (r7 == r6) goto L8b
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r7 != r6) goto L8e
        L8b:
            r5.next()
        L8e:
            char r6 = r5.f1814ch
            r7 = 47
            if (r6 != r7) goto L97
            r5.skipComment()
        L97:
            return
    }

    public JSONReaderUTF16(com.alibaba.fastjson2.JSONReader.Context r5, java.lang.String r6, char[] r7, int r8, int r9) {
            r4 = this;
            r0 = 0
            r4.<init>(r5, r0)
            r5 = -1
            r4.cacheIndex = r5
            r4.str = r6
            r4.chars = r7
            r4.offset = r8
            r4.length = r9
            r4.start = r8
            int r5 = r8 + r9
            r4.end = r5
            r6 = 26
            if (r8 < r5) goto L1c
            r4.f1814ch = r6
            return
        L1c:
            char r5 = r7[r8]
            r4.f1814ch = r5
        L20:
            char r5 = r4.f1814ch
            r8 = 32
            if (r5 > r8) goto L45
            r0 = 1
            long r0 = r0 << r5
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r0 = r0 & r2
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L45
            int r5 = r4.offset
            int r5 = r5 + 1
            r4.offset = r5
            if (r5 < r9) goto L40
            r4.f1814ch = r6
            return
        L40:
            char r5 = r7[r5]
            r4.f1814ch = r5
            goto L20
        L45:
            int r6 = r4.offset
            int r6 = r6 + 1
            r4.offset = r6
            r6 = 65534(0xfffe, float:9.1833E-41)
            if (r5 == r6) goto L55
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L58
        L55:
            r4.next()
        L58:
            char r5 = r4.f1814ch
            r6 = 47
            if (r5 != r6) goto L61
            r4.skipComment()
        L61:
            return
    }

    public JSONReaderUTF16(com.alibaba.fastjson2.JSONReader.Context r9, byte[] r10, int r11, int r12) {
            r8 = this;
            r0 = 0
            r8.<init>(r9, r0)
            r9 = -1
            r8.cacheIndex = r9
            r9 = 0
            r8.str = r9
            int r9 = r12 / 2
            char[] r9 = new char[r9]
            r8.chars = r9
            int r9 = r11 + r12
            r1 = r11
        L13:
            if (r1 >= r9) goto L2c
            r2 = r10[r1]
            int r3 = r1 + 1
            r3 = r10[r3]
            char[] r4 = r8.chars
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            char r2 = (char) r2
            r4[r0] = r2
            int r1 = r1 + 2
            int r0 = r0 + 1
            goto L13
        L2c:
            r8.start = r11
            r8.length = r0
            r8.end = r0
            int r9 = r8.offset
            r10 = 26
            if (r9 < r0) goto L3b
            r8.f1814ch = r10
            return
        L3b:
            char[] r11 = r8.chars
            char r9 = r11[r9]
            r8.f1814ch = r9
        L41:
            char r9 = r8.f1814ch
            r0 = 0
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            r4 = 1
            r11 = 32
            if (r9 > r11) goto L69
            long r6 = r4 << r9
            long r6 = r6 & r2
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 == 0) goto L69
            int r9 = r8.offset
            int r9 = r9 + 1
            r8.offset = r9
            if (r9 < r12) goto L62
            r8.f1814ch = r10
            return
        L62:
            char[] r11 = r8.chars
            char r9 = r11[r9]
            r8.f1814ch = r9
            goto L41
        L69:
            char r9 = r8.f1814ch
            if (r9 > r11) goto L86
            long r6 = r4 << r9
            long r6 = r6 & r2
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L86
            int r9 = r8.offset
            int r9 = r9 + 1
            r8.offset = r9
            if (r9 < r12) goto L7f
            r8.f1814ch = r10
            return
        L7f:
            char[] r6 = r8.chars
            char r9 = r6[r9]
            r8.f1814ch = r9
            goto L69
        L86:
            int r10 = r8.offset
            int r10 = r10 + 1
            r8.offset = r10
            r10 = 65534(0xfffe, float:9.1833E-41)
            if (r9 == r10) goto L96
            r10 = 65279(0xfeff, float:9.1475E-41)
            if (r9 != r10) goto L99
        L96:
            r8.next()
        L99:
            char r9 = r8.f1814ch
            r10 = 47
            if (r9 != r10) goto La2
            r8.skipComment()
        La2:
            return
    }

    public static int getInt(char[] r6, int r7) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r7 = r7 << 1
            long r3 = (long) r7
            long r1 = r1 + r3
            long r6 = r0.getLong(r6, r1)
            long r0 = com.alibaba.fastjson2.JSONReaderUTF16.CHAR_MASK
            long r0 = r0 & r6
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            r6 = 0
            return r6
        L17:
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            r1 = 8
            if (r0 == 0) goto L1e
            long r6 = r6 >> r1
        L1e:
            r2 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r6
            r4 = 16711680(0xff0000, double:8.256667E-317)
            long r4 = r4 & r6
            long r0 = r4 >> r1
            long r0 = r0 | r2
            r2 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r2 = r2 & r6
            r4 = 16
            long r2 = r2 >> r4
            long r0 = r0 | r2
            r2 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r6 = r6 & r2
            r2 = 24
            long r6 = r6 >> r2
            long r6 = r6 | r0
            int r6 = (int) r6
            return r6
    }

    public static long getLong(char[] r17, int r18) {
            r0 = r17
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r3 = r18 << 1
            long r3 = (long) r3
            long r1 = r1 + r3
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = r3.getLong(r0, r1)
            r6 = 8
            long r1 = r1 + r6
            long r0 = r3.getLong(r0, r1)
            long r2 = r4 | r0
            long r6 = com.alibaba.fastjson2.JSONReaderUTF16.CHAR_MASK
            long r2 = r2 & r6
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L21
            return r6
        L21:
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            r3 = 8
            if (r2 == 0) goto L29
            long r4 = r4 >> r3
            long r0 = r0 >> r3
        L29:
            r6 = 255(0xff, double:1.26E-321)
            long r8 = r4 & r6
            r10 = 16711680(0xff0000, double:8.256667E-317)
            long r12 = r4 & r10
            long r12 = r12 >> r3
            long r8 = r8 | r12
            r12 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r14 = r4 & r12
            r2 = 16
            long r14 = r14 >> r2
            long r8 = r8 | r14
            r14 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r4 = r4 & r14
            r16 = 24
            long r4 = r4 >> r16
            long r4 = r4 | r8
            long r6 = r6 & r0
            r8 = 32
            long r6 = r6 << r8
            long r4 = r4 | r6
            long r6 = r0 & r10
            long r6 = r6 << r16
            long r4 = r4 | r6
            long r6 = r0 & r12
            long r6 = r6 << r2
            long r4 = r4 | r6
            long r0 = r0 & r14
            long r0 = r0 << r3
            long r0 = r0 | r4
            return r0
    }

    private boolean isReference0(char[] r15, int r16, int r17, char r18) {
            r14 = this;
            r0 = r17
            int r1 = r16 + 6
            char r2 = r15[r1]
        L6:
            r3 = 0
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            r7 = 1
            r9 = 32
            r10 = 0
            if (r2 > r9) goto L23
            long r11 = r7 << r2
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L23
            int r1 = r1 + 1
            if (r1 < r0) goto L20
            return r10
        L20:
            char r2 = r15[r1]
            goto L6
        L23:
            r11 = 58
            if (r2 != r11) goto L59
            r2 = 1
            int r1 = r1 + r2
            if (r1 < r0) goto L2c
            goto L59
        L2c:
            char r11 = r15[r1]
        L2e:
            if (r11 > r9) goto L3f
            long r12 = r7 << r11
            long r12 = r12 & r5
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L3f
            int r1 = r1 + 1
            if (r1 < r0) goto L3c
            return r10
        L3c:
            char r11 = r15[r1]
            goto L2e
        L3f:
            r3 = r18
            if (r11 != r3) goto L59
            int r3 = r1 + 1
            if (r3 >= r0) goto L56
            char r15 = r15[r3]
            r0 = 36
            if (r15 == r0) goto L56
            r0 = 46
            if (r15 == r0) goto L56
            r0 = 64
            if (r15 == r0) goto L56
            goto L59
        L56:
            r14.referenceBegin = r1
            return r2
        L59:
            return r10
    }

    private void skipString() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            int r2 = r0.offset
            char[] r3 = r0.chars
            int r4 = r2 + 1
            char r2 = r3[r2]
        Lc:
            r5 = 92
            if (r2 != r5) goto L43
            int r2 = r0.end
            if (r4 >= r2) goto L39
            int r2 = r4 + 1
            char r6 = r3[r4]
            if (r6 == r5) goto L34
            r5 = 34
            if (r6 != r5) goto L1f
            goto L34
        L1f:
            r5 = 117(0x75, float:1.64E-43)
            if (r6 != r5) goto L2a
            int r2 = r4 + 5
            int r4 = r4 + 6
            char r2 = r3[r2]
            goto Lc
        L2a:
            char r4 = r0.char1(r6)
        L2e:
            r16 = r4
            r4 = r2
            r2 = r16
            goto Lc
        L34:
            int r4 = r4 + 2
            char r2 = r3[r2]
            goto Lc
        L39:
            java.lang.String r1 = "illegal string, end"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            return
        L43:
            int r5 = r0.end
            r6 = 26
            if (r2 != r1) goto L53
            if (r4 >= r5) goto L51
            int r1 = r4 + 1
            char r2 = r3[r4]
        L4f:
            r4 = r1
            goto L5a
        L51:
            r2 = r6
            goto L5a
        L53:
            if (r4 >= r5) goto L51
            int r2 = r4 + 1
            char r4 = r3[r4]
            goto L2e
        L5a:
            r7 = 0
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            r11 = 1
            r1 = 32
            if (r2 > r1) goto L73
            long r13 = r11 << r2
            long r13 = r13 & r9
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 == 0) goto L73
            int r1 = r4 + 1
            char r2 = r3[r4]
            goto L4f
        L73:
            r5 = 44
            r13 = 1
            if (r2 != r5) goto L7a
            r5 = r13
            goto L7b
        L7a:
            r5 = 0
        L7b:
            r0.comma = r5
            if (r5 == 0) goto La2
            int r2 = r0.end
            if (r4 < r2) goto L88
            r0.f1814ch = r6
            r0.offset = r4
            return
        L88:
            char r2 = r3[r4]
        L8a:
            if (r2 > r1) goto La1
            long r14 = r11 << r2
            long r14 = r14 & r9
            int r5 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r5 == 0) goto La1
            int r4 = r4 + 1
            int r2 = r0.end
            if (r4 < r2) goto L9e
            r0.f1814ch = r6
            r0.offset = r4
            return
        L9e:
            char r2 = r3[r4]
            goto L8a
        La1:
            int r4 = r4 + r13
        La2:
            r0.f1814ch = r2
            r0.offset = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            int r0 = r4.cacheIndex
            r1 = -1
            if (r0 == r1) goto L15
            char[] r1 = r4.chars
            int r2 = r1.length
            r3 = 1048576(0x100000, float:1.469368E-39)
            if (r2 >= r3) goto L15
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            r0 = r2[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r2 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r2.lazySet(r0, r1)
        L15:
            java.io.Closeable r0 = r4.input
            if (r0 == 0) goto L1c
            r0.close()     // Catch: java.io.IOException -> L1c
        L1c:
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
            r9 = this;
            boolean r0 = r9.nameEscape
            if (r0 != 0) goto L1e
            java.lang.String r0 = r9.str
            if (r0 == 0) goto L11
            int r1 = r9.nameBegin
            int r2 = r9.nameEnd
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
        L11:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r9.chars
            int r2 = r9.nameBegin
            int r3 = r9.nameEnd
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L1e:
            int r0 = r9.nameLength
            char[] r0 = new char[r0]
            char[] r1 = r9.chars
            int r2 = r9.nameBegin
            r3 = 0
        L27:
            int r4 = r9.nameEnd
            if (r2 >= r4) goto L88
            char r4 = r1[r2]
            r5 = 34
            r6 = 92
            if (r4 != r6) goto L7e
            int r4 = r2 + 1
            char r7 = r1[r4]
            if (r7 == r5) goto L7b
            r5 = 58
            if (r7 == r5) goto L7b
            r5 = 64
            if (r7 == r5) goto L7b
            if (r7 == r6) goto L7b
            r5 = 117(0x75, float:1.64E-43)
            if (r7 == r5) goto L66
            r5 = 120(0x78, float:1.68E-43)
            if (r7 == r5) goto L59
            switch(r7) {
                case 42: goto L7b;
                case 43: goto L7b;
                case 44: goto L7b;
                case 45: goto L7b;
                case 46: goto L7b;
                case 47: goto L7b;
                default: goto L4e;
            }
        L4e:
            switch(r7) {
                case 60: goto L7b;
                case 61: goto L7b;
                case 62: goto L7b;
                default: goto L51;
            }
        L51:
            char r2 = r9.char1(r7)
            r8 = r4
            r4 = r2
            r2 = r8
            goto L81
        L59:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r2 = r2 + 3
            char r5 = r1[r2]
            char r4 = com.alibaba.fastjson2.JSONReader.char2(r4, r5)
            goto L81
        L66:
            int r4 = r2 + 2
            char r4 = r1[r4]
            int r5 = r2 + 3
            char r5 = r1[r5]
            int r6 = r2 + 4
            char r6 = r1[r6]
            int r2 = r2 + 5
            char r7 = r1[r2]
            char r4 = com.alibaba.fastjson2.JSONReader.char4(r4, r5, r6, r7)
            goto L81
        L7b:
            r2 = r4
            r4 = r7
            goto L81
        L7e:
            if (r4 != r5) goto L81
            goto L88
        L81:
            r0[r3] = r4
            int r2 = r2 + 1
            int r3 = r3 + 1
            goto L27
        L88:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
            r20 = this;
            r0 = r20
            int r1 = r0.nameBegin
            char[] r2 = r0.chars
            r3 = 39
            r4 = 34
            if (r1 <= 0) goto L14
            int r5 = r1 + (-1)
            char r5 = r2[r5]
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
            r14 = 45
            r15 = 95
            r16 = 0
            r6 = 120(0x78, float:1.68E-43)
            r7 = 117(0x75, float:1.64E-43)
            r12 = 92
            r13 = 32
            if (r1 >= r11) goto Le5
            char r11 = r2[r1]
            if (r11 != r12) goto L62
            int r11 = r1 + 1
            char r12 = r2[r11]
            if (r12 == r7) goto L4d
            if (r12 == r6) goto L40
            char r1 = r0.char1(r12)
            r19 = r11
            r11 = r1
            r1 = r19
            goto L66
        L40:
            int r11 = r1 + 2
            char r11 = r2[r11]
            int r1 = r1 + 3
            char r12 = r2[r1]
            char r11 = com.alibaba.fastjson2.JSONReader.char2(r11, r12)
            goto L66
        L4d:
            int r11 = r1 + 2
            char r11 = r2[r11]
            int r12 = r1 + 3
            char r12 = r2[r12]
            int r18 = r1 + 4
            char r6 = r2[r18]
            int r1 = r1 + 5
            char r7 = r2[r1]
            char r11 = com.alibaba.fastjson2.JSONReader.char4(r11, r12, r6, r7)
            goto L66
        L62:
            if (r11 != r5) goto L66
            goto Le5
        L66:
            r6 = 255(0xff, float:3.57E-43)
            if (r11 > r6) goto Le1
            r6 = 8
            if (r8 >= r6) goto Le1
            if (r8 != 0) goto L74
            if (r11 != 0) goto L74
            goto Le1
        L74:
            if (r11 == r15) goto L7e
            if (r11 == r14) goto L7e
            if (r11 != r13) goto L7b
            goto L7e
        L7b:
            r7 = 65
            goto L89
        L7e:
            int r7 = r1 + 1
            char r7 = r2[r7]
            if (r7 == r4) goto L7b
            if (r7 == r3) goto L7b
            if (r7 == r11) goto L7b
            goto Ldd
        L89:
            if (r11 < r7) goto L92
            r7 = 90
            if (r11 > r7) goto L92
            int r11 = r11 + 32
            char r11 = (char) r11
        L92:
            switch(r8) {
                case 0: goto Ld9;
                case 1: goto Ld2;
                case 2: goto Lca;
                case 3: goto Lc2;
                case 4: goto Lb9;
                case 5: goto Lae;
                case 6: goto La3;
                case 7: goto L96;
                default: goto L95;
            }
        L95:
            goto Ldb
        L96:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 56
            long r6 = r6 << r11
            r11 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        La0:
            long r9 = r9 & r11
            long r9 = r9 + r6
            goto Ldb
        La3:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 48
            long r6 = r6 << r11
            r11 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto La0
        Lae:
            byte r6 = (byte) r11
            long r6 = (long) r6
            r11 = 40
            long r6 = r6 << r11
            r11 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto La0
        Lb9:
            byte r6 = (byte) r11
            long r6 = (long) r6
            long r6 = r6 << r13
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto La0
        Lc2:
            byte r6 = (byte) r11
            int r6 = r6 << 24
            long r6 = (long) r6
            r11 = 16777215(0xffffff, double:8.2890456E-317)
            goto La0
        Lca:
            byte r6 = (byte) r11
            int r6 = r6 << 16
            long r6 = (long) r6
            r11 = 65535(0xffff, double:3.23786E-319)
            goto La0
        Ld2:
            byte r7 = (byte) r11
            int r6 = r7 << 8
            long r6 = (long) r6
            r11 = 255(0xff, double:1.26E-321)
            goto La0
        Ld9:
            byte r6 = (byte) r11
            long r9 = (long) r6
        Ldb:
            int r8 = r8 + 1
        Ldd:
            int r1 = r1 + 1
            goto L18
        Le1:
            int r1 = r0.nameBegin
            r9 = r16
        Le5:
            int r6 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r6 == 0) goto Lea
            return r9
        Lea:
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        Lef:
            int r8 = r0.end
            if (r1 >= r8) goto L163
            char r8 = r2[r1]
            r9 = 92
            if (r8 != r9) goto L133
            int r8 = r1 + 1
            char r10 = r2[r8]
            r11 = 117(0x75, float:1.64E-43)
            if (r10 == r11) goto L11c
            r12 = 120(0x78, float:1.68E-43)
            if (r10 == r12) goto L10f
            char r1 = r0.char1(r10)
            r19 = r8
            r8 = r1
            r1 = r19
            goto L138
        L10f:
            int r8 = r1 + 2
            char r8 = r2[r8]
            int r1 = r1 + 3
            char r10 = r2[r1]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r8, r10)
            goto L138
        L11c:
            r12 = 120(0x78, float:1.68E-43)
            int r8 = r1 + 2
            char r8 = r2[r8]
            int r10 = r1 + 3
            char r10 = r2[r10]
            int r16 = r1 + 4
            char r9 = r2[r16]
            int r1 = r1 + 5
            char r11 = r2[r1]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r8, r10, r9, r11)
            goto L138
        L133:
            r12 = 120(0x78, float:1.68E-43)
            if (r8 != r5) goto L138
            goto L163
        L138:
            int r1 = r1 + 1
            if (r8 == r15) goto L144
            if (r8 == r14) goto L144
            if (r8 != r13) goto L141
            goto L144
        L141:
            r9 = 65
            goto L14d
        L144:
            char r9 = r2[r1]
            if (r9 == r4) goto L141
            if (r9 == r3) goto L141
            if (r9 == r8) goto L141
            goto Lef
        L14d:
            r10 = 90
            if (r8 < r9) goto L156
            if (r8 > r10) goto L156
            int r8 = r8 + 32
            char r8 = (char) r8
        L156:
            long r3 = (long) r8
            long r3 = r3 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r6 = r6 * r3
            r3 = 39
            r4 = 34
            goto Lef
        L163:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getRawInt() {
            r4 = this;
            int r0 = r4.offset
            int r1 = r0 + 3
            char[] r2 = r4.chars
            int r3 = r2.length
            if (r1 >= r3) goto L10
            int r0 = r0 + (-1)
            int r0 = getInt(r2, r0)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final long getRawLong() {
            r4 = this;
            int r0 = r4.offset
            int r1 = r0 + 7
            char[] r2 = r4.chars
            int r3 = r2.length
            if (r1 >= r3) goto L10
            int r0 = r0 + (-1)
            long r0 = getLong(r2, r0)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getString() {
            r9 = this;
            java.lang.String r0 = r9.stringValue
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r9.nameEnd
            int r1 = r9.nameBegin
            int r0 = r0 - r1
            boolean r2 = r9.nameEscape
            if (r2 != 0) goto L16
            java.lang.String r2 = new java.lang.String
            char[] r3 = r9.chars
            r2.<init>(r3, r1, r0)
            return r2
        L16:
            int r0 = r9.nameLength
            char[] r0 = new char[r0]
            r2 = 0
        L1b:
            char[] r3 = r9.chars
            char r4 = r3[r1]
            r5 = 34
            r6 = 92
            if (r4 != r6) goto L62
            int r4 = r1 + 1
            char r7 = r3[r4]
            if (r7 == r5) goto L5f
            if (r7 == r6) goto L5f
            r5 = 117(0x75, float:1.64E-43)
            if (r7 == r5) goto L4a
            r5 = 120(0x78, float:1.68E-43)
            if (r7 == r5) goto L3d
            char r1 = r9.char1(r7)
            r8 = r4
            r4 = r1
            r1 = r8
            goto L6c
        L3d:
            int r4 = r1 + 2
            char r4 = r3[r4]
            int r1 = r1 + 3
            char r3 = r3[r1]
            char r4 = com.alibaba.fastjson2.JSONReader.char2(r4, r3)
            goto L6c
        L4a:
            int r4 = r1 + 2
            char r4 = r3[r4]
            int r5 = r1 + 3
            char r5 = r3[r5]
            int r6 = r1 + 4
            char r6 = r3[r6]
            int r1 = r1 + 5
            char r3 = r3[r1]
            char r4 = com.alibaba.fastjson2.JSONReader.char4(r4, r5, r6, r3)
            goto L6c
        L5f:
            r1 = r4
            r4 = r7
            goto L6c
        L62:
            if (r4 != r5) goto L6c
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r9.stringValue = r1
            return r1
        L6c:
            r0[r2] = r4
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L1b
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int getStringLength() {
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
            char[] r2 = r6.chars
            int r3 = r1 + 8
            int r4 = r6.end
            if (r3 >= r4) goto L53
            int r4 = r2.length
            if (r3 >= r4) goto L53
            char r4 = r2[r1]
            if (r4 == r0) goto L53
            int r4 = r1 + 1
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 2
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 3
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 4
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 5
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 6
            char r4 = r2[r4]
            if (r4 == r0) goto L53
            int r4 = r1 + 7
            char r4 = r2[r4]
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
            char r4 = r2[r1]
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
    public java.lang.String info(java.lang.String r8) {
            r7 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L5:
            int r5 = r7.offset
            if (r2 >= r5) goto Lb
            r5 = r0
            goto Lc
        Lb:
            r5 = r1
        Lc:
            int r6 = r7.end
            if (r2 >= r6) goto L12
            r6 = r0
            goto L13
        L12:
            r6 = r1
        L13:
            r5 = r5 & r6
            r6 = 10
            if (r5 == 0) goto L25
            char[] r5 = r7.chars
            char r5 = r5[r2]
            if (r5 != r6) goto L21
            int r3 = r3 + 1
            r4 = r0
        L21:
            int r2 = r2 + 1
            int r4 = r4 + r0
            goto L5
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r8 == 0) goto L3a
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L3a
            r1.append(r8)
            java.lang.String r8 = ", "
            r1.append(r8)
        L3a:
            java.lang.String r8 = "offset "
            r1.append(r8)
            int r8 = r7.offset
            r1.append(r8)
            java.lang.String r8 = ", character "
            r1.append(r8)
            char r8 = r7.f1814ch
            r1.append(r8)
            java.lang.String r8 = ", line "
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = ", column "
            r1.append(r8)
            r1.append(r4)
            java.lang.String r8 = ", fastjson-version 2.0.60"
            r1.append(r8)
            if (r3 <= r0) goto L66
            goto L68
        L66:
            r6 = 32
        L68:
            r1.append(r6)
            char[] r8 = r7.chars
            int r0 = r7.start
            int r2 = r7.length
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 >= r3) goto L77
            goto L78
        L77:
            r2 = r3
        L78:
            r1.append(r8, r0, r2)
            java.lang.String r8 = r1.toString()
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isArray() {
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
    public boolean isNull() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L16
            int r0 = r2.offset
            int r1 = r2.end
            if (r0 >= r1) goto L16
            char[] r1 = r2.chars
            char r0 = r1[r0]
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
            r11 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r11.context
            long r0 = r0.features
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L12
            return r1
        L12:
            char[] r0 = r11.chars
            char r4 = r11.f1814ch
            r5 = 123(0x7b, float:1.72E-43)
            if (r4 == r5) goto L1b
            return r1
        L1b:
            int r4 = r11.offset
            int r5 = r11.end
            if (r4 != r5) goto L22
            return r1
        L22:
            char r6 = r0[r4]
        L24:
            r7 = 32
            if (r6 > r7) goto L3d
            r7 = 1
            long r7 = r7 << r6
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L3d
            int r4 = r4 + 1
            if (r4 < r5) goto L3a
            return r1
        L3a:
            char r6 = r0[r4]
            goto L24
        L3d:
            int r2 = r4 + 6
            if (r2 >= r5) goto L6d
            int r2 = r4 + 1
            char r2 = r0[r2]
            r3 = 36
            if (r2 != r3) goto L6d
            int r2 = r4 + 2
            char r2 = r0[r2]
            r3 = 114(0x72, float:1.6E-43)
            if (r2 != r3) goto L6d
            int r2 = r4 + 3
            char r2 = r0[r2]
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L6d
            int r2 = r4 + 4
            char r2 = r0[r2]
            r3 = 102(0x66, float:1.43E-43)
            if (r2 != r3) goto L6d
            int r2 = r4 + 5
            char r2 = r0[r2]
            if (r2 == r6) goto L68
            goto L6d
        L68:
            boolean r0 = r11.isReference0(r0, r4, r5, r6)
            return r0
        L6d:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
            r9 = this;
            int r0 = r9.offset
            char[] r1 = r9.chars
            int r2 = r9.end
            r3 = 26
            if (r0 < r2) goto Ld
            r2 = r0
        Lb:
            r0 = r3
            goto L11
        Ld:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L11:
            r4 = 32
            if (r0 > r4) goto L31
            r4 = 1
            long r4 = r4 << r0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r0 = r9.end
            if (r2 != r0) goto L29
            goto Lb
        L29:
            int r0 = r2 + 1
            char r2 = r1[r2]
            r8 = r2
            r2 = r0
            r0 = r8
            goto L11
        L31:
            r9.offset = r2
            r9.f1814ch = r0
            r1 = 47
            if (r0 != r1) goto L3c
            r9.skipComment()
        L3c:
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            r2 = 93
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.offset
            char[] r2 = r0.chars
            int r3 = r0.end
            r4 = 26
            if (r1 != r3) goto L17
            r3 = r1
        L15:
            r1 = r4
            goto L1b
        L17:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L3e
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r1 = r0.end
            if (r3 != r1) goto L34
            goto L15
        L34:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L69
            r0.comma = r13
            int r1 = r0.end
            if (r3 != r1) goto L4c
            r1 = r3
            r3 = r4
            goto L50
        L4c:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r1 > r11) goto L69
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r1 = r0.end
            if (r3 != r1) goto L64
            r1 = r4
            goto L55
        L64:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L50
        L69:
            r0.f1814ch = r1
            r0.offset = r3
            r2 = 47
            if (r1 != r2) goto L74
            r0.skipComment()
        L74:
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
            char[] r0 = r9.chars
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
            char r1 = r0[r1]
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
            char r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r9.f1814ch = r1
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L44
            r9.skipComment()
        L44:
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
            r14 = this;
            char[] r0 = r14.chars
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
            char r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6
        L2a:
            r11 = 44
            if (r2 == r11) goto L34
            r14.offset = r1
            r14.f1814ch = r2
            r0 = 0
            return r0
        L34:
            int r2 = r14.end
            if (r1 != r2) goto L3b
            r2 = r1
        L39:
            r1 = r10
            goto L3f
        L3b:
            int r2 = r1 + 1
            char r1 = r0[r1]
        L3f:
            if (r1 > r9) goto L55
            long r11 = r7 << r1
            long r11 = r11 & r5
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 == 0) goto L55
            int r1 = r14.end
            if (r2 != r1) goto L4d
            goto L39
        L4d:
            int r1 = r2 + 1
            char r2 = r0[r2]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L3f
        L55:
            r14.offset = r2
            r14.f1814ch = r1
            r0 = 47
            if (r1 != r0) goto L60
            r14.skipComment()
        L60:
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfInfinity() {
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            char r2 = r10.f1814ch
            r3 = 73
            if (r2 != r3) goto L73
            int r2 = r1 + 6
            int r3 = r10.end
            if (r2 >= r3) goto L73
            char r4 = r0[r1]
            r5 = 110(0x6e, float:1.54E-43)
            if (r4 != r5) goto L73
            int r4 = r1 + 1
            char r4 = r0[r4]
            r6 = 102(0x66, float:1.43E-43)
            if (r4 != r6) goto L73
            int r4 = r1 + 2
            char r4 = r0[r4]
            r6 = 105(0x69, float:1.47E-43)
            if (r4 != r6) goto L73
            int r4 = r1 + 3
            char r4 = r0[r4]
            if (r4 != r5) goto L73
            int r4 = r1 + 4
            char r4 = r0[r4]
            if (r4 != r6) goto L73
            int r4 = r1 + 5
            char r4 = r0[r4]
            r5 = 116(0x74, float:1.63E-43)
            if (r4 != r5) goto L73
            char r2 = r0[r2]
            r4 = 121(0x79, float:1.7E-43)
            if (r2 != r4) goto L73
            int r2 = r1 + 7
            r4 = 26
            if (r2 != r3) goto L49
            r1 = r2
        L47:
            r2 = r4
            goto L4d
        L49:
            int r1 = r1 + 8
            char r2 = r0[r2]
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
            char r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L4d
        L6d:
            r10.offset = r1
            r10.f1814ch = r2
            r0 = 1
            return r0
        L73:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char r15) {
            r14 = this;
            char[] r0 = r14.chars
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
            char r1 = r0[r1]
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
            char r1 = r0[r1]
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
            char r15 = r0[r15]
            r13 = r1
            r1 = r15
            r15 = r13
            goto L39
        L4f:
            r14.offset = r15
            r14.f1814ch = r1
            r15 = 47
            if (r1 != r15) goto L5a
            r14.skipComment()
        L5a:
            r15 = 1
            return r15
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r8, char r9, char r10) {
            r7 = this;
            char r0 = r7.f1814ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            char[] r8 = r7.chars
            int r0 = r7.offset
            int r2 = r0 + 2
            int r3 = r7.end
            if (r2 > r3) goto L6c
            char r4 = r8[r0]
            if (r4 != r9) goto L6c
            int r9 = r0 + 1
            char r9 = r8[r9]
            if (r9 == r10) goto L1b
            goto L6c
        L1b:
            r9 = 26
            if (r2 != r3) goto L21
        L1f:
            r10 = r9
            goto L26
        L21:
            int r0 = r0 + 3
            char r10 = r8[r2]
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
            char r0 = r8[r2]
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
            r7.f1814ch = r10
            r8 = 1
            return r8
        L6c:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r8, char r9, char r10, char r11) {
            r7 = this;
            char r0 = r7.f1814ch
            r1 = 0
            if (r0 == r8) goto L6
            return r1
        L6:
            char[] r8 = r7.chars
            int r0 = r7.offset
            int r2 = r0 + 3
            int r3 = r7.end
            if (r2 > r3) goto L72
            char r4 = r8[r0]
            if (r4 != r9) goto L72
            int r9 = r0 + 1
            char r9 = r8[r9]
            if (r9 != r10) goto L72
            int r9 = r0 + 2
            char r9 = r8[r9]
            if (r9 == r11) goto L21
            goto L72
        L21:
            r9 = 26
            if (r2 != r3) goto L27
        L25:
            r10 = r9
            goto L2c
        L27:
            int r0 = r0 + 4
            char r10 = r8[r2]
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
            char r11 = r8[r2]
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
            r7.f1814ch = r10
            r8 = 1
            return r8
        L72:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10) {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            char[] r6 = r5.chars
            int r0 = r5.offset
            int r2 = r0 + 4
            int r3 = r5.end
            if (r2 > r3) goto L78
            char r4 = r6[r0]
            if (r4 != r7) goto L78
            int r7 = r0 + 1
            char r7 = r6[r7]
            if (r7 != r8) goto L78
            int r7 = r0 + 2
            char r7 = r6[r7]
            if (r7 != r9) goto L78
            int r7 = r0 + 3
            char r7 = r6[r7]
            if (r7 == r10) goto L27
            goto L78
        L27:
            r7 = 26
            if (r2 != r3) goto L2d
        L2b:
            r8 = r7
            goto L32
        L2d:
            int r0 = r0 + 5
            char r8 = r6[r2]
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
            char r9 = r6[r2]
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
            r5.f1814ch = r8
            r6 = 1
            return r6
        L78:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r6, char r7, char r8, char r9, char r10, char r11) {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 0
            if (r0 == r6) goto L6
            return r1
        L6:
            char[] r6 = r5.chars
            int r0 = r5.offset
            int r2 = r0 + 5
            int r3 = r5.end
            if (r2 > r3) goto L7e
            char r4 = r6[r0]
            if (r4 != r7) goto L7e
            int r7 = r0 + 1
            char r7 = r6[r7]
            if (r7 != r8) goto L7e
            int r7 = r0 + 2
            char r7 = r6[r7]
            if (r7 != r9) goto L7e
            int r7 = r0 + 3
            char r7 = r6[r7]
            if (r7 != r10) goto L7e
            int r7 = r0 + 4
            char r7 = r6[r7]
            if (r7 == r11) goto L2d
            goto L7e
        L2d:
            r7 = 26
            if (r2 != r3) goto L33
        L31:
            r8 = r7
            goto L38
        L33:
            int r0 = r0 + 6
            char r8 = r6[r2]
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
            char r9 = r6[r2]
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
            r5.f1814ch = r8
            r6 = 1
            return r6
        L7e:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match10(long r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 12
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L43
            int r8 = r1 + 11
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L1f
            goto L43
        L1f:
            int r1 = r1 + 13
            char r8 = r0[r2]
        L23:
            r9 = 32
            if (r8 > r9) goto L3d
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L3d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L23
        L3d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L43:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match11(long r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 13
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L4b
            int r8 = r1 + 11
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L4b
            int r8 = r1 + 12
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L27
            goto L4b
        L27:
            int r1 = r1 + 14
            char r8 = r0[r2]
        L2b:
            r9 = 32
            if (r8 > r9) goto L45
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L45
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L2b
        L45:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match12(long r8, byte r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 14
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L51
            int r8 = r1 + 11
            char r8 = r0[r8]
            if (r8 != r10) goto L51
            int r8 = r1 + 12
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L51
            int r8 = r1 + 13
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L2d
            goto L51
        L2d:
            int r1 = r1 + 15
            char r8 = r0[r2]
        L31:
            r9 = 32
            if (r8 > r9) goto L4b
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L4b
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L31
        L4b:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L51:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match13(long r8, int r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 15
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L43
            int r8 = r1 + 11
            int r8 = getInt(r0, r8)
            if (r8 == r10) goto L1f
            goto L43
        L1f:
            int r1 = r1 + 16
            char r8 = r0[r2]
        L23:
            r9 = 32
            if (r8 > r9) goto L3d
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L3d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L23
        L3d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L43:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match14(long r8, int r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 16
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L4b
            int r8 = r1 + 11
            int r8 = getInt(r0, r8)
            if (r8 != r10) goto L4b
            int r8 = r1 + 15
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L27
            goto L4b
        L27:
            int r1 = r1 + 17
            char r8 = r0[r2]
        L2b:
            r9 = 32
            if (r8 > r9) goto L45
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L45
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L2b
        L45:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match15(long r8, int r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 17
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L53
            int r8 = r1 + 11
            int r8 = getInt(r0, r8)
            if (r8 != r10) goto L53
            int r8 = r1 + 15
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L53
            int r8 = r1 + 16
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L2f
            goto L53
        L2f:
            int r1 = r1 + 18
            char r8 = r0[r2]
        L33:
            r9 = 32
            if (r8 > r9) goto L4d
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L4d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L33
        L4d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L53:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match16(long r8, int r10, byte r11) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 18
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L59
            int r8 = r1 + 11
            int r8 = getInt(r0, r8)
            if (r8 != r10) goto L59
            int r8 = r1 + 15
            char r8 = r0[r8]
            if (r8 != r11) goto L59
            int r8 = r1 + 16
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L59
            int r8 = r1 + 17
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L35
            goto L59
        L35:
            int r1 = r1 + 19
            char r8 = r0[r2]
        L39:
            r9 = 32
            if (r8 > r9) goto L53
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L53
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L39
        L53:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L59:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match17(long r8, long r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 19
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L45
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L21
            goto L45
        L21:
            int r1 = r1 + 20
            char r8 = r0[r2]
        L25:
            r9 = 32
            if (r8 > r9) goto L3f
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L3f
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L25
        L3f:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L45:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match18(long r8, long r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 20
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L4d
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4d
            int r8 = r1 + 19
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L29
            goto L4d
        L29:
            int r1 = r1 + 21
            char r8 = r0[r2]
        L2d:
            r9 = 32
            if (r8 > r9) goto L47
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L47
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L2d
        L47:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match19(long r8, long r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 21
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L55
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L55
            int r8 = r1 + 19
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L55
            int r8 = r1 + 20
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L31
            goto L55
        L31:
            int r1 = r1 + 22
            char r8 = r0[r2]
        L35:
            r9 = 32
            if (r8 > r9) goto L4f
            r9 = 1
            long r9 = r9 << r8
            r2 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L35
        L4f:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L55:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match2() {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 4
            int r3 = r8.end
            if (r2 >= r3) goto L38
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 58
            if (r3 == r4) goto L13
            goto L38
        L13:
            int r1 = r1 + 5
            char r2 = r0[r2]
        L17:
            r3 = 32
            if (r2 > r3) goto L32
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L32
            int r2 = r1 + 1
            char r1 = r0[r1]
            r7 = r2
            r2 = r1
            r1 = r7
            goto L17
        L32:
            r8.offset = r1
            r8.f1814ch = r2
            r0 = 1
            return r0
        L38:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match20(long r8, long r10, byte r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 22
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L5b
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L5b
            int r8 = r1 + 19
            char r8 = r0[r8]
            if (r8 != r12) goto L5b
            int r8 = r1 + 20
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L5b
            int r8 = r1 + 21
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L37
            goto L5b
        L37:
            int r1 = r1 + 23
            char r8 = r0[r2]
        L3b:
            r9 = 32
            if (r8 > r9) goto L55
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L55
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L3b
        L55:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L5b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match21(long r8, long r10, int r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 23
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L4d
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4d
            int r8 = r1 + 19
            int r8 = getInt(r0, r8)
            if (r8 == r12) goto L29
            goto L4d
        L29:
            int r1 = r1 + 24
            char r8 = r0[r2]
        L2d:
            r9 = 32
            if (r8 > r9) goto L47
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L47
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L2d
        L47:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match22(long r8, long r10, int r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 24
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L55
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L55
            int r8 = r1 + 19
            int r8 = getInt(r0, r8)
            if (r8 != r12) goto L55
            int r8 = r1 + 23
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L31
            goto L55
        L31:
            int r1 = r1 + 25
            char r8 = r0[r2]
        L35:
            r9 = 32
            if (r8 > r9) goto L4f
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L35
        L4f:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L55:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match23(long r8, long r10, int r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 25
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L5d
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L5d
            int r8 = r1 + 19
            int r8 = getInt(r0, r8)
            if (r8 != r12) goto L5d
            int r8 = r1 + 23
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L5d
            int r8 = r1 + 24
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L39
            goto L5d
        L39:
            int r1 = r1 + 26
            char r8 = r0[r2]
        L3d:
            r9 = 32
            if (r8 > r9) goto L57
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L57
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L3d
        L57:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L5d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match24(long r8, long r10, int r12, byte r13) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 26
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 19
            int r8 = getInt(r0, r8)
            if (r8 != r12) goto L63
            int r8 = r1 + 23
            char r8 = r0[r8]
            if (r8 != r13) goto L63
            int r8 = r1 + 24
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L63
            int r8 = r1 + 25
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L3f
            goto L63
        L3f:
            int r1 = r1 + 27
            char r8 = r0[r2]
        L43:
            r9 = 32
            if (r8 > r9) goto L5d
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L43
        L5d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L63:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match25(long r8, long r10, long r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 27
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L4f
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4f
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 == 0) goto L2b
            goto L4f
        L2b:
            int r1 = r1 + 28
            char r8 = r0[r2]
        L2f:
            r9 = 32
            if (r8 > r9) goto L49
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L49
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L2f
        L49:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match26(long r8, long r10, long r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 28
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L5a
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L5a
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L5a
            int r8 = r1 + 27
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L33
            goto L5a
        L33:
            char[] r8 = r7.chars
            int r1 = r1 + 29
            char r8 = r8[r2]
        L39:
            r9 = 32
            if (r8 > r9) goto L54
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L54
            char[] r8 = r7.chars
            int r9 = r1 + 1
            char r8 = r8[r1]
            r1 = r9
            goto L39
        L54:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L5a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match27(long r8, long r10, long r12) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 29
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L62
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L62
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L62
            int r8 = r1 + 27
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L62
            int r8 = r1 + 28
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L3b
            goto L62
        L3b:
            char[] r8 = r7.chars
            int r1 = r1 + 30
            char r8 = r8[r2]
        L41:
            r9 = 32
            if (r8 > r9) goto L5c
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            char[] r8 = r7.chars
            int r9 = r1 + 1
            char r8 = r8[r1]
            r1 = r9
            goto L41
        L5c:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L62:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match28(long r8, long r10, long r12, byte r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 30
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L65
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L65
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L65
            int r8 = r1 + 27
            char r8 = r0[r8]
            if (r8 != r14) goto L65
            int r8 = r1 + 28
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L65
            int r8 = r1 + 29
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L41
            goto L65
        L41:
            int r1 = r1 + 31
            char r8 = r0[r2]
        L45:
            r9 = 32
            if (r8 > r9) goto L5f
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5f
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L45
        L5f:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L65:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match29(long r8, long r10, long r12, int r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 31
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L56
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L56
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L56
            int r8 = r1 + 27
            int r8 = getInt(r0, r8)
            if (r8 == r14) goto L33
            goto L56
        L33:
            r8 = 32
            int r1 = r1 + r8
            char r9 = r0[r2]
        L38:
            if (r9 > r8) goto L50
            r10 = 1
            long r10 = r10 << r9
            r12 = 4294981377(0x100003701, double:2.122002748E-314)
            long r10 = r10 & r12
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L50
            int r9 = r1 + 1
            char r10 = r0[r1]
            r1 = r9
            r9 = r10
            goto L38
        L50:
            r7.offset = r1
            r7.f1814ch = r9
            r8 = 1
            return r8
        L56:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match3() {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 5
            int r3 = r7.end
            if (r2 >= r3) goto L3c
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 34
            if (r3 != r4) goto L3c
            int r1 = r1 + 4
            char r1 = r0[r1]
            r3 = 58
            if (r1 == r3) goto L1b
            goto L3c
        L1b:
            char r1 = r0[r2]
        L1d:
            r3 = 32
            if (r1 > r3) goto L35
            r3 = 1
            long r3 = r3 << r1
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L35
            int r2 = r2 + 1
            char r1 = r0[r2]
            goto L1d
        L35:
            r0 = 1
            int r2 = r2 + r0
            r7.offset = r2
            r7.f1814ch = r1
            return r0
        L3c:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match30(long r8, long r10, long r12, int r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 32
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L5f
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L5f
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L5f
            int r8 = r1 + 27
            int r8 = getInt(r0, r8)
            if (r8 != r14) goto L5f
            int r8 = r1 + 31
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L3b
            goto L5f
        L3b:
            int r1 = r1 + 33
            char r8 = r0[r2]
        L3f:
            r9 = 32
            if (r8 > r9) goto L59
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L59
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L3f
        L59:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L5f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match31(long r8, long r10, long r12, int r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 33
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L66
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L66
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L66
            int r8 = r1 + 27
            int r8 = getInt(r0, r8)
            if (r8 != r14) goto L66
            int r8 = r1 + 31
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L66
            int r8 = r1 + 32
            char r8 = r0[r8]
            r10 = 58
            if (r8 == r10) goto L43
            goto L66
        L43:
            int r1 = r1 + r9
            char r8 = r0[r2]
        L46:
            r9 = 32
            if (r8 > r9) goto L60
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L60
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L46
        L60:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L66:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match32(long r8, long r10, long r12, int r14, byte r15) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 34
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L6d
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L6d
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L6d
            int r8 = r1 + 27
            int r8 = getInt(r0, r8)
            if (r8 != r14) goto L6d
            int r8 = r1 + 31
            char r8 = r0[r8]
            if (r8 != r15) goto L6d
            int r8 = r1 + 32
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L6d
            int r8 = r1 + 33
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L49
            goto L6d
        L49:
            int r1 = r1 + 35
            char r8 = r0[r2]
        L4d:
            r9 = 32
            if (r8 > r9) goto L67
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L67
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L4d
        L67:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L6d:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match33(long r8, long r10, long r12, long r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 35
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L59
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L59
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L59
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto L35
            goto L59
        L35:
            int r1 = r1 + 36
            char r8 = r0[r2]
        L39:
            r9 = 32
            if (r8 > r9) goto L53
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L53
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L39
        L53:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L59:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match34(long r8, long r10, long r12, long r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 36
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L61
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L61
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L61
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L61
            int r8 = r1 + 35
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L3d
            goto L61
        L3d:
            int r1 = r1 + 37
            char r8 = r0[r2]
        L41:
            r9 = 32
            if (r8 > r9) goto L5b
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5b
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L41
        L5b:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L61:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match35(long r8, long r10, long r12, long r14) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 37
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L69
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L69
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L69
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L69
            int r8 = r1 + 35
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L69
            int r8 = r1 + 36
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L45
            goto L69
        L45:
            int r1 = r1 + 38
            char r8 = r0[r2]
        L49:
            r9 = 32
            if (r8 > r9) goto L63
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L63
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L49
        L63:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L69:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match36(long r8, long r10, long r12, long r14, byte r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 38
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L71
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L71
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L71
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L71
            int r8 = r1 + 35
            char r8 = r0[r8]
            r9 = r16
            if (r8 != r9) goto L71
            int r8 = r1 + 36
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L71
            int r8 = r1 + 37
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L4d
            goto L71
        L4d:
            int r1 = r1 + 39
            char r8 = r0[r2]
        L51:
            r9 = 32
            if (r8 > r9) goto L6b
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L6b
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L51
        L6b:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L71:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match37(long r8, long r10, long r12, long r14, int r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 39
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 35
            int r8 = getInt(r0, r8)
            r9 = r16
            if (r8 == r9) goto L3f
            goto L63
        L3f:
            int r1 = r1 + 40
            char r8 = r0[r2]
        L43:
            r9 = 32
            if (r8 > r9) goto L5d
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L43
        L5d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L63:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match38(long r8, long r10, long r12, long r14, int r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 40
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 35
            int r8 = getInt(r0, r8)
            r9 = r16
            if (r8 != r9) goto L6b
            int r8 = r1 + 39
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L47
            goto L6b
        L47:
            int r1 = r1 + 41
            char r8 = r0[r2]
        L4b:
            r9 = 32
            if (r8 > r9) goto L65
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L4b
        L65:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L6b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match39(long r8, long r10, long r12, long r14, int r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 41
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 35
            int r8 = getInt(r0, r8)
            r9 = r16
            if (r8 != r9) goto L73
            int r8 = r1 + 39
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L73
            int r8 = r1 + 40
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L4f
            goto L73
        L4f:
            int r1 = r1 + 42
            char r8 = r0[r2]
        L53:
            r9 = 32
            if (r8 > r9) goto L6d
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L6d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L53
        L6d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L73:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match4(byte r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 6
            int r3 = r7.end
            if (r2 >= r3) goto L42
            int r3 = r1 + 3
            char r3 = r0[r3]
            if (r3 != r8) goto L42
            int r8 = r1 + 4
            char r8 = r0[r8]
            r3 = 34
            if (r8 != r3) goto L42
            int r1 = r1 + 5
            char r8 = r0[r1]
            r1 = 58
            if (r8 == r1) goto L21
            goto L42
        L21:
            char r8 = r0[r2]
        L23:
            r1 = 32
            if (r8 > r1) goto L3b
            r3 = 1
            long r3 = r3 << r8
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L3b
            int r2 = r2 + 1
            char r8 = r0[r2]
            goto L23
        L3b:
            r0 = 1
            int r2 = r2 + r0
            r7.offset = r2
            r7.f1814ch = r8
            return r0
        L42:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match40(long r8, long r10, long r12, long r14, int r16, byte r17) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 42
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L7b
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L7b
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L7b
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L7b
            int r8 = r1 + 35
            int r8 = getInt(r0, r8)
            r9 = r16
            if (r8 != r9) goto L7b
            int r8 = r1 + 39
            char r8 = r0[r8]
            r9 = r17
            if (r8 != r9) goto L7b
            int r8 = r1 + 40
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L7b
            int r8 = r1 + 41
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L57
            goto L7b
        L57:
            int r1 = r1 + 43
            char r8 = r0[r2]
        L5b:
            r9 = 32
            if (r8 > r9) goto L75
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L75
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L5b
        L75:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L7b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match41(long r8, long r10, long r12, long r14, long r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 43
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L63
            int r8 = r1 + 35
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 == 0) goto L3f
            goto L63
        L3f:
            int r1 = r1 + 44
            char r8 = r0[r2]
        L43:
            r9 = 32
            if (r8 > r9) goto L5d
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L43
        L5d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L63:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match42(long r8, long r10, long r12, long r14, long r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 44
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 35
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L6b
            int r8 = r1 + 43
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L47
            goto L6b
        L47:
            int r1 = r1 + 45
            char r8 = r0[r2]
        L4b:
            r9 = 32
            if (r8 > r9) goto L65
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L4b
        L65:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L6b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match43(long r8, long r10, long r12, long r14, long r16) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 45
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 11
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 19
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 27
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 35
            long r8 = getLong(r0, r8)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 != 0) goto L73
            int r8 = r1 + 43
            char r8 = r0[r8]
            r9 = 34
            if (r8 != r9) goto L73
            int r8 = r1 + 44
            char r8 = r0[r8]
            r9 = 58
            if (r8 == r9) goto L4f
            goto L73
        L4f:
            int r1 = r1 + 46
            char r8 = r0[r2]
        L53:
            r9 = 32
            if (r8 > r9) goto L6d
            r9 = 1
            long r9 = r9 << r8
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r9 = r9 & r11
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L6d
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L53
        L6d:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L73:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match5(int r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 7
            int r3 = r7.end
            if (r2 >= r3) goto L38
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 == r8) goto L13
            goto L38
        L13:
            int r1 = r1 + 8
            char r8 = r0[r2]
        L17:
            r2 = 32
            if (r8 > r2) goto L32
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L32
            int r8 = r1 + 1
            char r1 = r0[r1]
            r6 = r1
            r1 = r8
            r8 = r6
            goto L17
        L32:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L38:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match6(int r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 8
            int r3 = r7.end
            if (r2 >= r3) goto L40
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r8) goto L40
            int r8 = r1 + 7
            char r8 = r0[r8]
            r3 = 58
            if (r8 == r3) goto L1b
            goto L40
        L1b:
            int r1 = r1 + 9
            char r8 = r0[r2]
        L1f:
            r2 = 32
            if (r8 > r2) goto L3a
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L3a
            int r8 = r1 + 1
            char r1 = r0[r1]
            r6 = r1
            r1 = r8
            r8 = r6
            goto L1f
        L3a:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L40:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match7(int r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 9
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r8) goto L4a
            int r8 = r1 + 7
            char r8 = r0[r8]
            r3 = 34
            if (r8 != r3) goto L4a
            int r8 = r1 + 8
            char r8 = r0[r8]
            r3 = 58
            if (r8 == r3) goto L25
            goto L4a
        L25:
            int r1 = r1 + 10
            char r8 = r0[r2]
        L29:
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
            char r1 = r0[r1]
            r6 = r1
            r1 = r8
            r8 = r6
            goto L29
        L44:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
        L4a:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match8(int r7, byte r8) {
            r6 = this;
            char[] r0 = r6.chars
            int r1 = r6.offset
            int r2 = r1 + 10
            int r3 = r6.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r7) goto L4f
            int r7 = r1 + 7
            char r7 = r0[r7]
            if (r7 != r8) goto L4f
            int r7 = r1 + 8
            char r7 = r0[r7]
            r8 = 34
            if (r7 != r8) goto L4f
            int r7 = r1 + 9
            char r7 = r0[r7]
            r8 = 58
            if (r7 == r8) goto L2b
            goto L4f
        L2b:
            int r1 = r1 + 11
            char r7 = r0[r2]
        L2f:
            r8 = 32
            if (r7 > r8) goto L49
            r2 = 1
            long r2 = r2 << r7
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L49
            int r7 = r1 + 1
            char r8 = r0[r1]
            r1 = r7
            r7 = r8
            goto L2f
        L49:
            r6.offset = r1
            r6.f1814ch = r7
            r7 = 1
            return r7
        L4f:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName4Match9(long r8) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 11
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L17
            return r4
        L17:
            int r1 = r1 + 12
            char r8 = r0[r2]
        L1b:
            r9 = 32
            if (r8 > r9) goto L35
            r2 = 1
            long r2 = r2 << r8
            r4 = 4294981377(0x100003701, double:2.122002748E-314)
            long r2 = r2 & r4
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L35
            int r8 = r1 + 1
            char r9 = r0[r1]
            r1 = r8
            r8 = r9
            goto L1b
        L35:
            r7.offset = r1
            r7.f1814ch = r8
            r8 = 1
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match0() {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 7
            int r3 = r8.end
            if (r2 != r3) goto L10
            r0 = 26
            r8.f1814ch = r0
            r0 = 0
            return r0
        L10:
            int r1 = r1 + 8
            char r2 = r0[r2]
        L14:
            r3 = 32
            if (r2 > r3) goto L2f
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L2f
            int r2 = r1 + 1
            char r1 = r0[r1]
            r7 = r2
            r2 = r1
            r1 = r7
            goto L14
        L2f:
            r8.offset = r1
            r8.f1814ch = r2
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match1() {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 8
            int r3 = r8.end
            if (r2 >= r3) goto L38
            int r3 = r1 + 7
            char r3 = r0[r3]
            r4 = 58
            if (r3 == r4) goto L13
            goto L38
        L13:
            int r1 = r1 + 9
            char r2 = r0[r2]
        L17:
            r3 = 32
            if (r2 > r3) goto L32
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L32
            int r2 = r1 + 1
            char r1 = r0[r1]
            r7 = r2
            r2 = r1
            r1 = r7
            goto L17
        L32:
            r8.offset = r1
            r8.f1814ch = r2
            r0 = 1
            return r0
        L38:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfName8Match2() {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 9
            int r3 = r8.end
            if (r2 >= r3) goto L40
            int r3 = r1 + 7
            char r3 = r0[r3]
            r4 = 34
            if (r3 != r4) goto L40
            int r3 = r1 + 8
            char r3 = r0[r3]
            r4 = 58
            if (r3 == r4) goto L1b
            goto L40
        L1b:
            int r1 = r1 + 10
            char r2 = r0[r2]
        L1f:
            r3 = 32
            if (r2 > r3) goto L3a
            r3 = 1
            long r3 = r3 << r2
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L3a
            int r2 = r1 + 1
            char r1 = r0[r1]
            r7 = r2
            r2 = r1
            r1 = r7
            goto L1f
        L3a:
            r8.offset = r1
            r8.f1814ch = r2
            r0 = 1
            return r0
        L40:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNull() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L1b
            int r0 = r3.offset
            int r1 = r0 + 2
            int r2 = r3.end
            if (r1 >= r2) goto L1b
            char[] r1 = r3.chars
            char r0 = r1[r0]
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
            char[] r4 = r0.chars
            r5 = 117(0x75, float:1.64E-43)
            r6 = 0
            r7 = 108(0x6c, float:1.51E-43)
            r8 = 1
            r9 = 110(0x6e, float:1.54E-43)
            if (r1 != r9) goto L29
            int r10 = r3 + 2
            if (r10 >= r2) goto L29
            char r11 = r4[r3]
            if (r11 != r5) goto L29
            int r11 = r3 + 1
            char r11 = r4[r11]
            if (r11 != r7) goto L29
            char r10 = r4[r10]
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
            char r10 = r4[r3]
            if (r10 != r1) goto L3b
            int r3 = r3 + r8
            goto L5b
        L3b:
            int r10 = r3 + 4
            if (r10 >= r2) goto Lb3
            char r11 = r4[r3]
            if (r11 != r9) goto Lb3
            int r9 = r3 + 1
            char r9 = r4[r9]
            if (r9 != r5) goto Lb3
            int r5 = r3 + 2
            char r5 = r4[r5]
            if (r5 != r7) goto Lb3
            int r5 = r3 + 3
            char r5 = r4[r5]
            if (r5 != r7) goto Lb3
            char r5 = r4[r10]
            if (r5 != r1) goto Lb3
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
            char r3 = r4[r3]
        L66:
            r9 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto L87
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r15 == 0) goto L87
            if (r5 != r2) goto L7d
            goto L60
        L7d:
            int r3 = r5 + 1
            char r5 = r4[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto L66
        L87:
            r15 = 44
            if (r3 != r15) goto L8c
            r6 = r8
        L8c:
            r0.comma = r6
            if (r6 == 0) goto L9d
            if (r5 != r2) goto L94
        L92:
            r3 = r1
            goto L9d
        L94:
            int r3 = r5 + 1
            char r5 = r4[r5]
        L98:
            r17 = r5
            r5 = r3
            r3 = r17
        L9d:
            if (r3 > r7) goto Lae
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 == 0) goto Lae
            if (r5 != r2) goto La9
            goto L92
        La9:
            int r3 = r5 + 1
            char r5 = r4[r5]
            goto L98
        Lae:
            r0.offset = r5
            r0.f1814ch = r3
            return r8
        Lb3:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto La
            r1 = 0
            return r1
        La:
            int r1 = r0.offset
            char[] r2 = r0.chars
            int r3 = r0.end
            r4 = 26
            if (r1 != r3) goto L17
            r3 = r1
        L15:
            r1 = r4
            goto L1b
        L17:
            int r3 = r1 + 1
            char r1 = r2[r1]
        L1b:
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            if (r1 > r11) goto L3e
            long r12 = r9 << r1
            long r12 = r12 & r7
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r1 = r0.end
            if (r3 != r1) goto L34
            goto L15
        L34:
            int r1 = r3 + 1
            char r3 = r2[r3]
            r16 = r3
            r3 = r1
            r1 = r16
            goto L1b
        L3e:
            r12 = 44
            r13 = 1
            if (r1 != r12) goto L69
            r0.comma = r13
            int r1 = r0.end
            if (r3 != r1) goto L4c
            r1 = r3
            r3 = r4
            goto L50
        L4c:
            int r1 = r3 + 1
            char r3 = r2[r3]
        L50:
            r16 = r3
            r3 = r1
            r1 = r16
        L55:
            if (r1 > r11) goto L69
            long r14 = r9 << r1
            long r14 = r14 & r7
            int r12 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r12 == 0) goto L69
            int r1 = r0.end
            if (r3 != r1) goto L64
            r1 = r4
            goto L55
        L64:
            int r1 = r3 + 1
            char r3 = r2[r3]
            goto L50
        L69:
            r0.f1814ch = r1
            r0.offset = r3
            r2 = 47
            if (r1 != r2) goto L74
            r0.skipComment()
        L74:
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
            char[] r0 = r9.chars
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
            char r1 = r0[r1]
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
            char r2 = r0[r2]
            r8 = r2
            r2 = r1
            r1 = r8
            goto L19
        L39:
            r9.f1814ch = r1
            r9.offset = r2
            r0 = 47
            if (r1 != r0) goto L44
            r9.skipComment()
        L44:
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfSet() {
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            char r2 = r10.f1814ch
            r3 = 83
            if (r2 != r3) goto L4f
            int r2 = r1 + 1
            int r3 = r10.end
            if (r2 >= r3) goto L4f
            char r4 = r0[r1]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L4f
            char r2 = r0[r2]
            r4 = 116(0x74, float:1.63E-43)
            if (r2 != r4) goto L4f
            int r2 = r1 + 2
            r4 = 26
            if (r2 != r3) goto L25
            r1 = r2
        L23:
            r2 = r4
            goto L29
        L25:
            int r1 = r1 + 3
            char r2 = r0[r2]
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
            char r1 = r0[r1]
            r9 = r2
            r2 = r1
            r1 = r9
            goto L29
        L49:
            r10.offset = r1
            r10.f1814ch = r2
            r0 = 1
            return r0
        L4f:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match10(long r9) {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 11
            int r3 = r8.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 == 0) goto L17
            return r4
        L17:
            char r9 = r0[r2]
            r10 = 44
            if (r9 == r10) goto L26
            r3 = 125(0x7d, float:1.75E-43)
            if (r9 == r3) goto L26
            r3 = 93
            if (r9 == r3) goto L26
            return r4
        L26:
            r3 = 1
            if (r9 != r10) goto L36
            r8.comma = r3
            int r2 = r1 + 12
            int r9 = r8.end
            if (r2 != r9) goto L34
            r9 = 26
            goto L36
        L34:
            char r9 = r0[r2]
        L36:
            r10 = 32
            if (r9 > r10) goto L4e
            r4 = 1
            long r4 = r4 << r9
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L4e
            int r2 = r2 + 1
            char r9 = r0[r2]
            goto L36
        L4e:
            int r2 = r2 + r3
            r8.offset = r2
            r8.f1814ch = r9
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match11(long r9) {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 12
            int r3 = r8.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            long r5 = getLong(r0, r3)
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 != 0) goto L5c
            int r9 = r1 + 11
            char r9 = r0[r9]
            r10 = 34
            if (r9 == r10) goto L1f
            goto L5c
        L1f:
            char r9 = r0[r2]
            r10 = 44
            if (r9 == r10) goto L2e
            r3 = 125(0x7d, float:1.75E-43)
            if (r9 == r3) goto L2e
            r3 = 93
            if (r9 == r3) goto L2e
            return r4
        L2e:
            r3 = 1
            if (r9 != r10) goto L3e
            r8.comma = r3
            int r2 = r1 + 13
            int r9 = r8.end
            if (r2 != r9) goto L3c
            r9 = 26
            goto L3e
        L3c:
            char r9 = r0[r2]
        L3e:
            r10 = 32
            if (r9 > r10) goto L56
            r4 = 1
            long r4 = r4 << r9
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L56
            int r2 = r2 + 1
            char r9 = r0[r2]
            goto L3e
        L56:
            int r2 = r2 + r3
            r8.offset = r2
            r8.f1814ch = r9
            return r3
        L5c:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match2() {
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            int r2 = r1 + 3
            int r3 = r10.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            char r5 = r0[r2]
            r6 = 44
            if (r5 == r6) goto L1b
            r7 = 125(0x7d, float:1.75E-43)
            if (r5 == r7) goto L1b
            r7 = 93
            if (r5 == r7) goto L1b
            return r4
        L1b:
            r4 = 1
            if (r5 != r6) goto L2b
            r10.comma = r4
            int r2 = r1 + 4
            if (r2 != r3) goto L28
            r1 = 26
        L26:
            r5 = r1
            goto L2b
        L28:
            char r1 = r0[r2]
            goto L26
        L2b:
            r1 = 32
            if (r5 > r1) goto L43
            r6 = 1
            long r6 = r6 << r5
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L43
            int r2 = r2 + 1
            char r5 = r0[r2]
            goto L2b
        L43:
            int r2 = r2 + r4
            r10.offset = r2
            r10.f1814ch = r5
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match3() {
            r10 = this;
            char[] r0 = r10.chars
            int r1 = r10.offset
            int r2 = r1 + 4
            int r3 = r10.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            char r5 = r0[r5]
            r6 = 34
            if (r5 == r6) goto L15
            return r4
        L15:
            char r5 = r0[r2]
            r6 = 44
            if (r5 == r6) goto L24
            r7 = 125(0x7d, float:1.75E-43)
            if (r5 == r7) goto L24
            r7 = 93
            if (r5 == r7) goto L24
            return r4
        L24:
            r4 = 1
            if (r5 != r6) goto L34
            r10.comma = r4
            int r2 = r1 + 5
            if (r2 != r3) goto L31
            r1 = 26
        L2f:
            r5 = r1
            goto L34
        L31:
            char r1 = r0[r2]
            goto L2f
        L34:
            r1 = 32
            if (r5 > r1) goto L4c
            r6 = 1
            long r6 = r6 << r5
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L4c
            int r2 = r2 + 1
            char r5 = r0[r2]
            goto L34
        L4c:
            int r2 = r2 + r4
            r10.offset = r2
            r10.f1814ch = r5
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match4(byte r10) {
            r9 = this;
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r1 + 5
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            char r5 = r0[r5]
            if (r5 != r10) goto L55
            int r10 = r1 + 4
            char r10 = r0[r10]
            r5 = 34
            if (r10 == r5) goto L1b
            goto L55
        L1b:
            char r10 = r0[r2]
            r5 = 44
            if (r10 == r5) goto L2a
            r6 = 125(0x7d, float:1.75E-43)
            if (r10 == r6) goto L2a
            r6 = 93
            if (r10 == r6) goto L2a
            return r4
        L2a:
            r4 = 1
            if (r10 != r5) goto L38
            r9.comma = r4
            int r2 = r1 + 6
            if (r2 != r3) goto L36
            r10 = 26
            goto L38
        L36:
            char r10 = r0[r2]
        L38:
            r1 = 32
            if (r10 > r1) goto L50
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L50
            int r2 = r2 + 1
            char r10 = r0[r2]
            goto L38
        L50:
            int r2 = r2 + r4
            r9.offset = r2
            r9.f1814ch = r10
        L55:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match5(byte r10, byte r11) {
            r9 = this;
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r1 + 6
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r5 = r1 + 3
            char r5 = r0[r5]
            if (r5 != r10) goto L5b
            int r10 = r1 + 4
            char r10 = r0[r10]
            if (r10 != r11) goto L5b
            int r10 = r1 + 5
            char r10 = r0[r10]
            r11 = 34
            if (r10 == r11) goto L21
            goto L5b
        L21:
            char r10 = r0[r2]
            r11 = 44
            if (r10 == r11) goto L30
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L30
            r5 = 93
            if (r10 == r5) goto L30
            return r4
        L30:
            r4 = 1
            if (r10 != r11) goto L3e
            r9.comma = r4
            int r2 = r1 + 7
            if (r2 != r3) goto L3c
            r10 = 26
            goto L3e
        L3c:
            char r10 = r0[r2]
        L3e:
            r11 = 32
            if (r10 > r11) goto L56
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L56
            int r2 = r2 + 1
            char r10 = r0[r2]
            goto L3e
        L56:
            int r2 = r2 + r4
            r9.offset = r2
            r9.f1814ch = r10
        L5b:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match6(int r10) {
            r9 = this;
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r1 + 7
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 == r10) goto L15
            return r4
        L15:
            char r10 = r0[r2]
            r3 = 44
            if (r10 == r3) goto L24
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L24
            r5 = 93
            if (r10 == r5) goto L24
            return r4
        L24:
            r4 = 1
            if (r10 != r3) goto L34
            r9.comma = r4
            int r2 = r1 + 8
            int r10 = r9.end
            if (r2 != r10) goto L32
            r10 = 26
            goto L34
        L32:
            char r10 = r0[r2]
        L34:
            r1 = 32
            if (r10 > r1) goto L4c
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L4c
            int r2 = r2 + 1
            char r10 = r0[r2]
            goto L34
        L4c:
            int r2 = r2 + r4
            r9.offset = r2
            r9.f1814ch = r10
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match7(int r10) {
            r9 = this;
            char[] r0 = r9.chars
            int r1 = r9.offset
            int r2 = r1 + 8
            int r3 = r9.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r10) goto L59
            int r10 = r1 + 7
            char r10 = r0[r10]
            r3 = 34
            if (r10 == r3) goto L1d
            goto L59
        L1d:
            char r10 = r0[r2]
            r3 = 44
            if (r10 == r3) goto L2c
            r5 = 125(0x7d, float:1.75E-43)
            if (r10 == r5) goto L2c
            r5 = 93
            if (r10 == r5) goto L2c
            return r4
        L2c:
            r4 = 1
            if (r10 != r3) goto L3c
            r9.comma = r4
            int r2 = r1 + 9
            int r10 = r9.end
            if (r2 != r10) goto L3a
            r10 = 26
            goto L3c
        L3a:
            char r10 = r0[r2]
        L3c:
            r1 = 32
            if (r10 > r1) goto L54
            r5 = 1
            long r5 = r5 << r10
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            long r5 = r5 & r7
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L54
            int r2 = r2 + 1
            char r10 = r0[r2]
            goto L3c
        L54:
            int r2 = r2 + r4
            r9.offset = r2
            r9.f1814ch = r10
        L59:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match8(int r9, byte r10) {
            r8 = this;
            char[] r0 = r8.chars
            int r1 = r8.offset
            int r2 = r1 + 9
            int r3 = r8.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r9) goto L60
            int r9 = r1 + 7
            char r9 = r0[r9]
            if (r9 != r10) goto L60
            int r9 = r1 + 8
            char r9 = r0[r9]
            r10 = 34
            if (r9 == r10) goto L23
            goto L60
        L23:
            char r9 = r0[r2]
            r10 = 44
            if (r9 == r10) goto L32
            r3 = 125(0x7d, float:1.75E-43)
            if (r9 == r3) goto L32
            r3 = 93
            if (r9 == r3) goto L32
            return r4
        L32:
            r3 = 1
            if (r9 != r10) goto L42
            r8.comma = r3
            int r2 = r1 + 10
            int r9 = r8.end
            if (r2 != r9) goto L40
            r9 = 26
            goto L42
        L40:
            char r9 = r0[r2]
        L42:
            r10 = 32
            if (r9 > r10) goto L5a
            r4 = 1
            long r4 = r4 << r9
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L5a
            int r2 = r2 + 1
            char r9 = r0[r2]
            goto L42
        L5a:
            int r2 = r2 + r3
            r8.offset = r2
            r8.f1814ch = r9
            return r3
        L60:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final boolean nextIfValue4Match9(int r8, byte r9, byte r10) {
            r7 = this;
            char[] r0 = r7.chars
            int r1 = r7.offset
            int r2 = r1 + 10
            int r3 = r7.end
            r4 = 0
            if (r2 < r3) goto Lc
            return r4
        Lc:
            int r3 = r1 + 3
            int r3 = getInt(r0, r3)
            if (r3 != r8) goto L66
            int r8 = r1 + 7
            char r8 = r0[r8]
            if (r8 != r9) goto L66
            int r8 = r1 + 8
            char r8 = r0[r8]
            if (r8 != r10) goto L66
            int r8 = r1 + 9
            char r8 = r0[r8]
            r9 = 34
            if (r8 == r9) goto L29
            goto L66
        L29:
            char r8 = r0[r2]
            r9 = 44
            if (r8 == r9) goto L38
            r10 = 125(0x7d, float:1.75E-43)
            if (r8 == r10) goto L38
            r10 = 93
            if (r8 == r10) goto L38
            return r4
        L38:
            r10 = 1
            if (r8 != r9) goto L48
            r7.comma = r10
            int r2 = r1 + 11
            int r8 = r7.end
            if (r2 != r8) goto L46
            r8 = 26
            goto L48
        L46:
            char r8 = r0[r2]
        L48:
            r9 = 32
            if (r8 > r9) goto L60
            r3 = 1
            long r3 = r3 << r8
            r5 = 4294981377(0x100003701, double:2.122002748E-314)
            long r3 = r3 & r5
            r5 = 0
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L60
            int r2 = r2 + 1
            char r8 = r0[r2]
            goto L48
        L60:
            int r2 = r2 + r10
            r7.offset = r2
            r7.f1814ch = r8
            return r10
        L66:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final void nextWithoutComment() {
            r9 = this;
            int r0 = r9.offset
            char[] r1 = r9.chars
            int r2 = r9.end
            r3 = 26
            if (r0 < r2) goto Ld
            r2 = r0
        Lb:
            r0 = r3
            goto L11
        Ld:
            int r2 = r0 + 1
            char r0 = r1[r0]
        L11:
            r4 = 32
            if (r0 > r4) goto L31
            r4 = 1
            long r4 = r4 << r0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            int r0 = r9.end
            if (r2 != r0) goto L29
            goto Lb
        L29:
            int r0 = r2 + 1
            char r2 = r1[r2]
            r8 = r2
            r2 = r0
            r0 = r8
            goto L11
        L31:
            r9.offset = r2
            r9.f1814ch = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.math.BigDecimal readBigDecimal() {
            r28 = this;
            r1 = r28
            char[] r0 = r1.chars
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
            goto L32
        L17:
            int r4 = r3 + 1
            char r9 = r0[r3]
            if (r9 != r2) goto L30
            int r2 = r1.end
            if (r4 != r2) goto L24
            r6 = 26
            goto L28
        L24:
            int r3 = r3 + r5
            char r6 = r0[r4]
            r4 = r3
        L28:
            r1.f1814ch = r6
            r1.offset = r4
            r1.nextIfComma()
            return r8
        L30:
            r3 = r2
            r2 = r9
        L32:
            r9 = 43
            r10 = 45
            r11 = 1
            if (r2 != r10) goto L45
            r1.negative = r11
            int r2 = r4 + 1
            char r12 = r0[r4]
        L3f:
            r27 = r12
            r12 = r2
            r2 = r27
            goto L4f
        L45:
            r1.negative = r7
            if (r2 != r9) goto L4e
            int r2 = r4 + 1
            char r12 = r0[r4]
            goto L3f
        L4e:
            r12 = r4
        L4f:
            r1.valueType = r11
            r13 = 0
            r15 = r7
            r18 = r15
            r16 = r13
        L58:
            r19 = 31
            r6 = 57
            r20 = 10
            r22 = r8
            r8 = 48
            if (r2 < r8) goto L9c
            if (r2 > r6) goto L9c
            if (r15 != 0) goto L7a
            long r23 = r16 * r20
            long r25 = r16 | r20
            long r25 = r25 >>> r19
            int r18 = (r25 > r13 ? 1 : (r25 == r13 ? 0 : -1))
            if (r18 == 0) goto L7d
            long r25 = r23 / r20
            int r18 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r18 != 0) goto L79
            goto L7d
        L79:
            r15 = r11
        L7a:
            r25 = r13
            goto L84
        L7d:
            int r2 = r2 + (-48)
            r25 = r13
            long r13 = (long) r2
            long r16 = r23 + r13
        L84:
            int r2 = r1.end
            if (r12 != r2) goto L8f
            int r12 = r12 + 1
            r18 = r11
            r2 = 26
            goto L9e
        L8f:
            int r2 = r12 + 1
            char r6 = r0[r12]
            r12 = r2
            r2 = r6
            r18 = r11
            r8 = r22
            r13 = r25
            goto L58
        L9c:
            r25 = r13
        L9e:
            int r13 = (r16 > r25 ? 1 : (r16 == r25 ? 0 : -1))
            if (r13 >= 0) goto La3
            r15 = r11
        La3:
            r1.scale = r7
            r13 = 46
            if (r2 != r13) goto Lf2
            r1.valueType = r5
            int r2 = r12 + 1
            char r12 = r0[r12]
            r27 = r12
            r12 = r2
            r2 = r27
        Lb4:
            if (r2 < r8) goto Lf2
            if (r2 > r6) goto Lf2
            short r13 = r1.scale
            int r13 = r13 + r11
            short r13 = (short) r13
            r1.scale = r13
            if (r15 != 0) goto Ld9
            long r13 = r16 * r20
            long r23 = r16 | r20
            long r23 = r23 >>> r19
            int r18 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r18 == 0) goto Ld3
            long r23 = r13 / r20
            int r18 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r18 != 0) goto Ld1
            goto Ld3
        Ld1:
            r15 = r11
            goto Ld9
        Ld3:
            int r2 = r2 + (-48)
            long r5 = (long) r2
            long r13 = r13 + r5
            r16 = r13
        Ld9:
            int r2 = r1.end
            if (r12 != r2) goto Le6
            int r12 = r12 + 1
            r18 = r11
            r5 = r16
            r2 = 26
            goto Lf4
        Le6:
            int r2 = r12 + 1
            char r5 = r0[r12]
            r12 = r2
            r2 = r5
            r18 = r11
            r5 = 2
            r6 = 57
            goto Lb4
        Lf2:
            r5 = r16
        Lf4:
            r13 = 101(0x65, float:1.42E-43)
            if (r2 == r13) goto Lff
            r14 = 69
            if (r2 != r14) goto Lfd
            goto Lff
        Lfd:
            r9 = r7
            goto L152
        Lff:
            int r2 = r12 + 1
            char r14 = r0[r12]
            if (r14 != r10) goto L107
            r10 = r11
            goto L108
        L107:
            r10 = r7
        L108:
            if (r10 != 0) goto L10f
            if (r14 != r9) goto L10d
            goto L10f
        L10d:
            r9 = r7
            goto L115
        L10f:
            int r12 = r12 + 2
            char r14 = r0[r2]
            r9 = r7
            r2 = r12
        L115:
            if (r14 < r8) goto L147
            r12 = 57
            if (r14 > r12) goto L147
            int r14 = r14 + (-48)
            int r9 = r9 * 10
            int r9 = r9 + r14
            r14 = 2047(0x7ff, float:2.868E-42)
            if (r9 > r14) goto L13c
            int r14 = r1.end
            if (r2 != r14) goto L130
            int r2 = r2 + 1
            r12 = r2
            r18 = r11
            r2 = 26
            goto L149
        L130:
            int r14 = r2 + 1
            char r2 = r0[r2]
            r18 = r14
            r14 = r2
            r2 = r18
            r18 = r11
            goto L115
        L13c:
            java.lang.String r0 = "too large exp value : "
            java.lang.String r0 = eh.a.l(r9, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L147:
            r12 = r2
            r2 = r14
        L149:
            if (r10 == 0) goto L14c
            int r9 = -r9
        L14c:
            short r8 = (short) r9
            r1.exponent = r8
            r8 = 2
            r1.valueType = r8
        L152:
            if (r12 != r4) goto L238
            r8 = 110(0x6e, float:1.54E-43)
            r10 = 117(0x75, float:1.64E-43)
            r14 = 108(0x6c, float:1.51E-43)
            if (r2 != r8) goto L1a1
            int r8 = r12 + 1
            char r7 = r0[r12]
            if (r7 != r10) goto L19d
            int r7 = r12 + 2
            char r8 = r0[r8]
            if (r8 != r14) goto L19f
            int r8 = r12 + 3
            char r7 = r0[r7]
            if (r7 != r14) goto L19d
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r13 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            r19 = r12
            long r11 = r2.mask
            long r10 = r13 & r11
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L192
            r2 = 1
            r1.wasNull = r2
            int r2 = r1.end
            if (r8 != r2) goto L188
            r2 = 26
            goto L18a
        L188:
            char r2 = r0[r8]
        L18a:
            int r12 = r19 + 4
        L18c:
            r7 = 0
            r8 = 1
            r18 = 1
            goto L23b
        L192:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L19d:
            r12 = r8
            goto L1a3
        L19f:
            r12 = r7
            goto L1a3
        L1a1:
            r19 = r12
        L1a3:
            r7 = 116(0x74, float:1.63E-43)
            if (r2 != r7) goto L1ce
            int r7 = r12 + 3
            int r8 = r1.end
            if (r7 > r8) goto L1ce
            char r11 = r0[r12]
            r14 = 114(0x72, float:1.6E-43)
            if (r11 != r14) goto L1ce
            int r11 = r12 + 1
            char r11 = r0[r11]
            if (r11 != r10) goto L1ce
            int r10 = r12 + 2
            char r10 = r0[r10]
            if (r10 != r13) goto L1ce
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            if (r7 != r8) goto L1c6
            r7 = 26
            goto L1c8
        L1c6:
            char r7 = r0[r7]
        L1c8:
            int r12 = r12 + 4
        L1ca:
            r22 = r2
            r2 = r7
            goto L18c
        L1ce:
            r7 = 102(0x66, float:1.43E-43)
            if (r2 != r7) goto L200
            int r7 = r12 + 4
            int r8 = r1.end
            if (r7 > r8) goto L200
            char r10 = r0[r12]
            r11 = 97
            if (r10 != r11) goto L200
            int r10 = r12 + 1
            char r10 = r0[r10]
            r11 = 108(0x6c, float:1.51E-43)
            if (r10 != r11) goto L200
            int r10 = r12 + 2
            char r10 = r0[r10]
            r11 = 115(0x73, float:1.61E-43)
            if (r10 != r11) goto L200
            int r10 = r12 + 3
            char r10 = r0[r10]
            if (r10 != r13) goto L200
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
            if (r7 != r8) goto L1fb
            r7 = 26
            goto L1fd
        L1fb:
            char r7 = r0[r7]
        L1fd:
            int r12 = r12 + 5
            goto L1ca
        L200:
            r7 = 123(0x7b, float:1.72E-43)
            if (r2 != r7) goto L218
            if (r3 != 0) goto L218
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r2 = r25
            r1.readObject(r0, r2)
            r7 = 0
            r1.wasNull = r7
            java.math.BigDecimal r0 = r1.decimal(r0)
            return r0
        L218:
            r7 = 0
            r8 = 91
            if (r2 != r8) goto L236
            if (r3 != 0) goto L236
            java.util.List r0 = r1.readArray()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22d
            r2 = 1
            r1.wasNull = r2
            return r22
        L22d:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            r0 = 0
            return r0
        L236:
            r8 = r7
            goto L23b
        L238:
            r19 = r12
            goto L236
        L23b:
            int r10 = r12 - r4
            if (r3 == 0) goto L265
            if (r2 == r3) goto L258
            java.lang.String r0 = r1.readString()
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)     // Catch: java.lang.NumberFormatException -> L24a
            return r0
        L24a:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r2 = r1.info(r2)
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        L258:
            int r2 = r1.end
            if (r12 < r2) goto L25f
            r2 = 26
            goto L265
        L25f:
            int r2 = r12 + 1
            char r3 = r0[r12]
            r12 = r2
            r2 = r3
        L265:
            if (r8 != 0) goto L2ab
            if (r9 != 0) goto L27d
            if (r15 != 0) goto L27d
            r25 = 0
            int r3 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r3 == 0) goto L27d
            boolean r3 = r1.negative
            if (r3 == 0) goto L276
            long r5 = -r5
        L276:
            short r3 = r1.scale
            java.math.BigDecimal r22 = java.math.BigDecimal.valueOf(r5, r3)
            r8 = 1
        L27d:
            r17 = 1
            if (r8 != 0) goto L289
            int r4 = r4 + (-1)
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.parseBigDecimal(r0, r4, r10)
            r22 = r3
        L289:
            r3 = 76
            if (r2 == r3) goto L29d
            r3 = 70
            if (r2 == r3) goto L29d
            r3 = 68
            if (r2 == r3) goto L29d
            r3 = 66
            if (r2 == r3) goto L29d
            r3 = 83
            if (r2 != r3) goto L2ad
        L29d:
            int r2 = r1.end
            if (r12 < r2) goto L2a4
        L2a1:
            r2 = 26
            goto L2ad
        L2a4:
            int r2 = r12 + 1
            char r3 = r0[r12]
        L2a8:
            r12 = r2
            r2 = r3
            goto L2ad
        L2ab:
            r17 = 1
        L2ad:
            r3 = 4294981377(0x100003701, double:2.122002748E-314)
            r5 = 1
            r8 = 32
            if (r2 > r8) goto L2cb
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r9 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r9 == 0) goto L2cb
            int r2 = r1.end
            if (r12 != r2) goto L2c6
            goto L2a1
        L2c6:
            int r2 = r12 + 1
            char r3 = r0[r12]
            goto L2a8
        L2cb:
            r9 = 44
            if (r2 != r9) goto L2d1
            r7 = r17
        L2d1:
            r1.comma = r7
            if (r7 == 0) goto L2fa
            int r2 = r1.end
            if (r12 != r2) goto L2dc
            r7 = 26
            goto L2e1
        L2dc:
            int r2 = r12 + 1
            char r7 = r0[r12]
            goto L2f8
        L2e1:
            r2 = r7
        L2e2:
            if (r2 > r8) goto L2fa
            long r9 = r5 << r2
            long r9 = r9 & r3
            r25 = 0
            int r7 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r7 == 0) goto L2fa
            int r2 = r1.end
            if (r12 != r2) goto L2f4
            r2 = 26
            goto L2e2
        L2f4:
            int r2 = r12 + 1
            char r7 = r0[r12]
        L2f8:
            r12 = r2
            goto L2e1
        L2fa:
            if (r18 == 0) goto L301
            r1.f1814ch = r2
            r1.offset = r12
            return r22
        L301:
            java.lang.String r0 = "illegal input error"
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readBoolValue() {
            r18 = this;
            r0 = r18
            r1 = 0
            r0.wasNull = r1
            char[] r2 = r0.chars
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
            char r11 = r2[r3]
            r12 = 114(0x72, float:1.6E-43)
            if (r11 != r12) goto L30
            int r11 = r3 + 1
            char r11 = r2[r11]
            if (r11 != r7) goto L30
            char r5 = r2[r5]
            if (r5 != r6) goto L30
            int r3 = r3 + 3
        L2d:
            r4 = r10
            goto Lc2
        L30:
            r5 = 102(0x66, float:1.43E-43)
            r11 = 108(0x6c, float:1.51E-43)
            if (r4 != r5) goto L58
            int r5 = r3 + 3
            int r12 = r2.length
            if (r5 >= r12) goto L58
            char r12 = r2[r3]
            r13 = 97
            if (r12 != r13) goto L58
            int r12 = r3 + 1
            char r12 = r2[r12]
            if (r12 != r11) goto L58
            int r12 = r3 + 2
            char r12 = r2[r12]
            r13 = 115(0x73, float:1.61E-43)
            if (r12 != r13) goto L58
            char r5 = r2[r5]
            if (r5 != r6) goto L58
            int r3 = r3 + 4
        L55:
            r4 = r1
            goto Lc2
        L58:
            r5 = 45
            if (r4 == r5) goto L154
            r5 = 48
            if (r4 < r5) goto L66
            r6 = 57
            if (r4 > r6) goto L66
            goto L154
        L66:
            r6 = 110(0x6e, float:1.54E-43)
            if (r4 != r6) goto L9a
            int r6 = r3 + 2
            int r12 = r2.length
            if (r6 >= r12) goto L9a
            char r12 = r2[r3]
            if (r12 != r7) goto L9a
            int r7 = r3 + 1
            char r7 = r2[r7]
            if (r7 != r11) goto L9a
            char r6 = r2[r6]
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
            if (r4 != r6) goto L14d
            int r4 = r3 + 1
            int r7 = r2.length
            java.lang.String r11 = "can not convert to boolean : "
            if (r4 >= r7) goto L11c
            char r4 = r2[r4]
            if (r4 != r6) goto L11c
            char r4 = r2[r3]
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
            ah.a.g(r4, r11)
            goto L98
        Lc2:
            int r5 = r0.end
            r6 = 26
            if (r3 != r5) goto Lcb
            r5 = r3
        Lc9:
            r3 = r6
            goto Lcf
        Lcb:
            int r5 = r3 + 1
            char r3 = r2[r3]
        Lcf:
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r7 = 32
            if (r3 > r7) goto Lf0
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r15 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r15 == 0) goto Lf0
            int r3 = r0.end
            if (r5 != r3) goto Le6
            goto Lc9
        Le6:
            int r3 = r5 + 1
            char r5 = r2[r5]
            r17 = r5
            r5 = r3
            r3 = r17
            goto Lcf
        Lf0:
            r15 = 44
            if (r3 != r15) goto Lf5
            r1 = r10
        Lf5:
            r0.comma = r1
            if (r1 == 0) goto L117
            int r1 = r0.end
            if (r5 != r1) goto Lff
        Lfd:
            r3 = r6
            goto L104
        Lff:
            int r1 = r5 + 1
            char r3 = r2[r5]
        L103:
            r5 = r1
        L104:
            if (r3 > r7) goto L117
            long r15 = r13 << r3
            long r15 = r15 & r11
            int r1 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r1 == 0) goto L117
            int r1 = r0.end
            if (r5 != r1) goto L112
            goto Lfd
        L112:
            int r1 = r5 + 1
            char r3 = r2[r5]
            goto L103
        L117:
            r0.offset = r5
            r0.f1814ch = r3
            return r4
        L11c:
            java.lang.String r2 = r0.readString()
            java.lang.String r3 = "true"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L129
            return r10
        L129:
            java.lang.String r3 = "false"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L132
            return r1
        L132:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L14a
            java.lang.String r3 = "null"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L141
            goto L14a
        L141:
            java.lang.String r1 = r11.concat(r2)
            ah.a.w(r1)
            goto L98
        L14a:
            r0.wasNull = r10
            return r1
        L14d:
            java.lang.String r1 = "syntax error : "
            ah.a.g(r4, r1)
            goto L98
        L154:
            r0.readNumber()
            byte r2 = r0.valueType
            if (r2 != r10) goto L18a
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            int r3 = r0.mag0
            if (r2 == 0) goto L17b
            if (r3 != 0) goto L17a
            int r2 = r0.mag1
            if (r2 != 0) goto L17a
            int r2 = r0.mag2
            if (r2 != 0) goto L17a
            int r2 = r0.mag3
            if (r2 == 0) goto L179
            goto L17a
        L179:
            return r1
        L17a:
            return r10
        L17b:
            if (r3 != 0) goto L18a
            int r2 = r0.mag1
            if (r2 != 0) goto L18a
            int r2 = r0.mag2
            if (r2 != 0) goto L18a
            int r2 = r0.mag3
            if (r2 != r10) goto L18a
            return r10
        L18a:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public double readDoubleValue() {
            r35 = this;
            r0 = r35
            char[] r1 = r0.chars
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
            char r3 = r1[r3]
        L21:
            r8 = 44
            if (r2 == 0) goto L3d
            if (r3 != r2) goto L3d
            if (r5 != r4) goto L2c
            r3 = 26
            goto L31
        L2c:
            int r2 = r5 + 1
            char r3 = r1[r5]
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
            char r14 = r1[r5]
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
            char r6 = r1[r5]
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
            char r14 = r1[r5]
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
            char r5 = r1[r5]
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
            char r5 = r1[r5]
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
            char r5 = r1[r5]
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
            char r9 = r1[r9]
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
            char r14 = r1[r9]
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
            char r7 = r1[r9]
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
            char r5 = r1[r5]
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
            char r2 = r7[r5]
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
            char r5 = r7[r5]
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
            char r5 = r7[r5]
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
            r32 = this;
            r0 = r32
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
            char[] r2 = r0.chars
            r5 = 0
            r0.nameEscape = r5
            int r5 = r0.offset
            r0.nameBegin = r5
            int r6 = r0.end
            r7 = 0
            r8 = r5
        L4c:
            r9 = 32
            r10 = 1
            if (r8 >= r6) goto Lc9
            char r11 = r2[r8]
            r12 = 92
            if (r11 != r12) goto L6e
            r0.nameEscape = r10
            int r9 = r8 + 1
            char r11 = r2[r9]
            r12 = 117(0x75, float:1.64E-43)
            if (r11 == r12) goto L69
            r12 = 120(0x78, float:1.68E-43)
            if (r11 == r12) goto L66
            goto L6b
        L66:
            int r9 = r8 + 3
            goto L6b
        L69:
            int r9 = r8 + 5
        L6b:
            int r9 = r9 + r10
            r8 = r9
            goto Lc6
        L6e:
            if (r11 != r1) goto Lc4
            r0.nameLength = r7
            r0.nameEnd = r8
            int r8 = r8 + 1
            if (r8 >= r6) goto L7b
            char r1 = r2[r8]
            goto L7d
        L7b:
            r1 = 26
        L7d:
            if (r1 > r9) goto L91
            r11 = 1
            long r11 = r11 << r1
            r13 = 4294981377(0x100003701, double:2.122002748E-314)
            long r11 = r11 & r13
            int r7 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r7 == 0) goto L91
            int r8 = r8 + 1
            char r1 = r2[r8]
            goto L7d
        L91:
            r7 = 58
            if (r1 != r7) goto Lb9
            int r8 = r8 + r10
            if (r8 != r6) goto L9b
            r1 = 26
            goto L9d
        L9b:
            char r1 = r2[r8]
        L9d:
            if (r1 > r9) goto Lb1
            r6 = 1
            long r6 = r6 << r1
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            long r6 = r6 & r11
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto Lb1
            int r8 = r8 + 1
            char r1 = r2[r8]
            goto L9d
        Lb1:
            int r3 = r8 + 1
            r0.offset = r3
            char r1 = (char) r1
            r0.f1814ch = r1
            goto Lc9
        Lb9:
            java.lang.String r1 = "syntax error : "
            java.lang.String r1 = eh.a.l(r8, r1)
            ah.a.w(r1)
            r1 = 0
            return r1
        Lc4:
            int r8 = r8 + 1
        Lc6:
            int r7 = r7 + 1
            goto L4c
        Lc9:
            int r1 = r0.nameEnd
            if (r1 < r5) goto L909
            boolean r3 = r0.nameEscape
            if (r3 != 0) goto L903
            int r3 = r0.nameLength
            switch(r3) {
                case 1: goto L845;
                case 2: goto L823;
                case 3: goto L7f4;
                case 4: goto L7b8;
                case 5: goto L76c;
                case 6: goto L712;
                case 7: goto L6ab;
                case 8: goto L632;
                case 9: goto L5b3;
                case 10: goto L529;
                case 11: goto L494;
                case 12: goto L3f6;
                case 13: goto L349;
                case 14: goto L290;
                case 15: goto L1c3;
                case 16: goto Le4;
                default: goto Ld6;
            }
        Ld6:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            goto L85a
        Le4:
            char r3 = r2[r5]
            int r15 = r5 + 1
            char r15 = r2[r15]
            int r16 = r5 + 2
            r17 = 56
            char r4 = r2[r16]
            int r16 = r5 + 3
            r18 = -1
            char r6 = r2[r16]
            int r7 = r5 + 4
            char r7 = r2[r7]
            int r16 = r5 + 5
            r20 = 48
            char r8 = r2[r16]
            int r16 = r5 + 6
            r21 = r9
            char r9 = r2[r16]
            int r16 = r5 + 7
            r22 = r10
            char r10 = r2[r16]
            int r16 = r5 + 8
            r23 = 40
            char r11 = r2[r16]
            int r16 = r5 + 9
            r24 = 24
            char r12 = r2[r16]
            int r16 = r5 + 10
            r25 = 16
            char r13 = r2[r16]
            int r16 = r5 + 11
            r26 = 8
            char r14 = r2[r16]
            int r16 = r5 + 12
            r27 = r2
            char r2 = r27[r16]
            int r16 = r5 + 13
            r28 = r1
            char r1 = r27[r16]
            int r16 = r5 + 14
            r29 = r5
            char r5 = r27[r16]
            int r16 = r29 + 15
            char r0 = r27[r16]
            r16 = r0
            r0 = r3 & 255(0xff, float:3.57E-43)
            if (r0 != r3) goto L85a
            r0 = r15 & 255(0xff, float:3.57E-43)
            if (r0 != r15) goto L85a
            r0 = r4 & 255(0xff, float:3.57E-43)
            if (r0 != r4) goto L85a
            r0 = r6 & 255(0xff, float:3.57E-43)
            if (r0 != r6) goto L85a
            r0 = r7 & 255(0xff, float:3.57E-43)
            if (r0 != r7) goto L85a
            r0 = r8 & 255(0xff, float:3.57E-43)
            if (r0 != r8) goto L85a
            r0 = r9 & 255(0xff, float:3.57E-43)
            if (r0 != r9) goto L85a
            r0 = r10 & 255(0xff, float:3.57E-43)
            if (r0 != r10) goto L85a
            r0 = r11 & 255(0xff, float:3.57E-43)
            if (r0 != r11) goto L85a
            r0 = r12 & 255(0xff, float:3.57E-43)
            if (r0 != r12) goto L85a
            r0 = r13 & 255(0xff, float:3.57E-43)
            if (r0 != r13) goto L85a
            r0 = r14 & 255(0xff, float:3.57E-43)
            if (r0 != r14) goto L85a
            r0 = r2 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L85a
            r0 = r1 & 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L85a
            r0 = r5 & 255(0xff, float:3.57E-43)
            if (r0 != r5) goto L85a
            r0 = r16
            r16 = r11
            r11 = r0 & 255(0xff, float:3.57E-43)
            if (r11 != r0) goto L85a
            long r10 = (long) r10
            long r10 = r10 << r17
            r30 = r10
            long r9 = (long) r9
            long r9 = r9 << r20
            long r10 = r30 + r9
            long r8 = (long) r8
            long r8 = r8 << r23
            long r10 = r10 + r8
            long r7 = (long) r7
            long r7 = r7 << r21
            long r10 = r10 + r7
            long r6 = (long) r6
            long r6 = r6 << r24
            long r10 = r10 + r6
            long r6 = (long) r4
            long r6 = r6 << r25
            long r10 = r10 + r6
            long r6 = (long) r15
            long r6 = r6 << r26
            long r10 = r10 + r6
            long r3 = (long) r3
            long r10 = r10 + r3
            long r3 = (long) r0
            long r3 = r3 << r17
            long r5 = (long) r5
            long r5 = r5 << r20
            long r3 = r3 + r5
            long r0 = (long) r1
            long r0 = r0 << r23
            long r3 = r3 + r0
            long r0 = (long) r2
            long r0 = r0 << r21
            long r3 = r3 + r0
            long r0 = (long) r14
            long r0 = r0 << r24
            long r3 = r3 + r0
            long r0 = (long) r13
            long r0 = r0 << r25
            long r3 = r3 + r0
            long r0 = (long) r12
            long r0 = r0 << r26
            long r3 = r3 + r0
            r0 = r16
            long r0 = (long) r0
            long r3 = r3 + r0
        L1bf:
            r4 = r3
            r2 = r10
            goto L85d
        L1c3:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            int r10 = r29 + 10
            char r10 = r27[r10]
            int r11 = r29 + 11
            char r11 = r27[r11]
            int r12 = r29 + 12
            char r12 = r27[r12]
            int r13 = r29 + 13
            char r13 = r27[r13]
            int r14 = r29 + 14
            char r14 = r27[r14]
            r15 = r0 & 255(0xff, float:3.57E-43)
            if (r15 != r0) goto L85a
            r15 = r1 & 255(0xff, float:3.57E-43)
            if (r15 != r1) goto L85a
            r15 = r2 & 255(0xff, float:3.57E-43)
            if (r15 != r2) goto L85a
            r15 = r3 & 255(0xff, float:3.57E-43)
            if (r15 != r3) goto L85a
            r15 = r4 & 255(0xff, float:3.57E-43)
            if (r15 != r4) goto L85a
            r15 = r5 & 255(0xff, float:3.57E-43)
            if (r15 != r5) goto L85a
            r15 = r6 & 255(0xff, float:3.57E-43)
            if (r15 != r6) goto L85a
            r15 = r7 & 255(0xff, float:3.57E-43)
            if (r15 != r7) goto L85a
            r15 = r8 & 255(0xff, float:3.57E-43)
            if (r15 != r8) goto L85a
            r15 = r9 & 255(0xff, float:3.57E-43)
            if (r15 != r9) goto L85a
            r15 = r10 & 255(0xff, float:3.57E-43)
            if (r15 != r10) goto L85a
            r15 = r11 & 255(0xff, float:3.57E-43)
            if (r15 != r11) goto L85a
            r15 = r12 & 255(0xff, float:3.57E-43)
            if (r15 != r12) goto L85a
            r15 = r13 & 255(0xff, float:3.57E-43)
            if (r15 != r13) goto L85a
            r15 = r14 & 255(0xff, float:3.57E-43)
            if (r15 != r14) goto L85a
            r15 = r7
            long r6 = (long) r6
            long r6 = r6 << r20
            r30 = r6
            long r5 = (long) r5
            long r5 = r5 << r23
            long r6 = r30 + r5
            long r4 = (long) r4
            long r4 = r4 << r21
            long r6 = r6 + r4
            long r3 = (long) r3
            long r3 = r3 << r24
            long r6 = r6 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r6 = r6 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r6 = r6 + r1
            long r0 = (long) r0
            long r0 = r0 + r6
            long r2 = (long) r14
            long r2 = r2 << r17
            long r4 = (long) r13
            long r4 = r4 << r20
            long r2 = r2 + r4
            long r4 = (long) r12
            long r4 = r4 << r23
            long r2 = r2 + r4
            long r4 = (long) r11
            long r4 = r4 << r21
            long r2 = r2 + r4
            long r4 = (long) r10
            long r4 = r4 << r24
            long r2 = r2 + r4
            long r4 = (long) r9
            long r4 = r4 << r25
            long r2 = r2 + r4
            long r4 = (long) r8
            long r4 = r4 << r26
            long r2 = r2 + r4
            long r4 = (long) r15
        L28a:
            long r3 = r2 + r4
        L28c:
            r4 = r3
            r2 = r0
            goto L85d
        L290:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            int r10 = r29 + 10
            char r10 = r27[r10]
            int r11 = r29 + 11
            char r11 = r27[r11]
            int r12 = r29 + 12
            char r12 = r27[r12]
            int r13 = r29 + 13
            char r13 = r27[r13]
            r14 = r0 & 255(0xff, float:3.57E-43)
            if (r14 != r0) goto L85a
            r14 = r1 & 255(0xff, float:3.57E-43)
            if (r14 != r1) goto L85a
            r14 = r2 & 255(0xff, float:3.57E-43)
            if (r14 != r2) goto L85a
            r14 = r3 & 255(0xff, float:3.57E-43)
            if (r14 != r3) goto L85a
            r14 = r4 & 255(0xff, float:3.57E-43)
            if (r14 != r4) goto L85a
            r14 = r5 & 255(0xff, float:3.57E-43)
            if (r14 != r5) goto L85a
            r14 = r6 & 255(0xff, float:3.57E-43)
            if (r14 != r6) goto L85a
            r14 = r7 & 255(0xff, float:3.57E-43)
            if (r14 != r7) goto L85a
            r14 = r8 & 255(0xff, float:3.57E-43)
            if (r14 != r8) goto L85a
            r14 = r9 & 255(0xff, float:3.57E-43)
            if (r14 != r9) goto L85a
            r14 = r10 & 255(0xff, float:3.57E-43)
            if (r14 != r10) goto L85a
            r14 = r11 & 255(0xff, float:3.57E-43)
            if (r14 != r11) goto L85a
            r14 = r12 & 255(0xff, float:3.57E-43)
            if (r14 != r12) goto L85a
            r14 = r13 & 255(0xff, float:3.57E-43)
            if (r14 != r13) goto L85a
            long r14 = (long) r5
            long r14 = r14 << r23
            long r4 = (long) r4
            long r4 = r4 << r21
            long r14 = r14 + r4
            long r3 = (long) r3
            long r3 = r3 << r24
            long r14 = r14 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r14 = r14 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r14 = r14 + r1
            long r0 = (long) r0
            long r0 = r0 + r14
            long r2 = (long) r13
            long r2 = r2 << r17
            long r4 = (long) r12
            long r4 = r4 << r20
            long r2 = r2 + r4
            long r4 = (long) r11
            long r4 = r4 << r23
            long r2 = r2 + r4
            long r4 = (long) r10
            long r4 = r4 << r21
            long r2 = r2 + r4
            long r4 = (long) r9
            long r4 = r4 << r24
            long r2 = r2 + r4
            long r4 = (long) r8
            long r4 = r4 << r25
            long r2 = r2 + r4
            long r4 = (long) r7
            long r4 = r4 << r26
            long r2 = r2 + r4
            long r4 = (long) r6
            goto L28a
        L349:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            int r10 = r29 + 10
            char r10 = r27[r10]
            int r11 = r29 + 11
            char r11 = r27[r11]
            int r12 = r29 + 12
            char r12 = r27[r12]
            r13 = r0 & 255(0xff, float:3.57E-43)
            if (r13 != r0) goto L85a
            r13 = r1 & 255(0xff, float:3.57E-43)
            if (r13 != r1) goto L85a
            r13 = r2 & 255(0xff, float:3.57E-43)
            if (r13 != r2) goto L85a
            r13 = r3 & 255(0xff, float:3.57E-43)
            if (r13 != r3) goto L85a
            r13 = r4 & 255(0xff, float:3.57E-43)
            if (r13 != r4) goto L85a
            r13 = r5 & 255(0xff, float:3.57E-43)
            if (r13 != r5) goto L85a
            r13 = r6 & 255(0xff, float:3.57E-43)
            if (r13 != r6) goto L85a
            r13 = r7 & 255(0xff, float:3.57E-43)
            if (r13 != r7) goto L85a
            r13 = r8 & 255(0xff, float:3.57E-43)
            if (r13 != r8) goto L85a
            r13 = r9 & 255(0xff, float:3.57E-43)
            if (r13 != r9) goto L85a
            r13 = r10 & 255(0xff, float:3.57E-43)
            if (r13 != r10) goto L85a
            r13 = r11 & 255(0xff, float:3.57E-43)
            if (r13 != r11) goto L85a
            r13 = r12 & 255(0xff, float:3.57E-43)
            if (r13 != r12) goto L85a
            long r13 = (long) r4
            long r13 = r13 << r21
            long r3 = (long) r3
            long r3 = r3 << r24
            long r13 = r13 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r13 = r13 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r13 = r13 + r1
            long r0 = (long) r0
            long r0 = r0 + r13
            long r2 = (long) r12
            long r2 = r2 << r17
            long r11 = (long) r11
            long r11 = r11 << r20
            long r2 = r2 + r11
            long r10 = (long) r10
            long r10 = r10 << r23
            long r2 = r2 + r10
            long r9 = (long) r9
            long r9 = r9 << r21
            long r2 = r2 + r9
            long r8 = (long) r8
            long r8 = r8 << r24
            long r2 = r2 + r8
            long r7 = (long) r7
            long r7 = r7 << r25
            long r2 = r2 + r7
            long r6 = (long) r6
            long r6 = r6 << r26
            long r2 = r2 + r6
            long r4 = (long) r5
            goto L28a
        L3f6:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            int r10 = r29 + 10
            char r10 = r27[r10]
            int r11 = r29 + 11
            char r11 = r27[r11]
            r12 = r0 & 255(0xff, float:3.57E-43)
            if (r12 != r0) goto L85a
            r12 = r1 & 255(0xff, float:3.57E-43)
            if (r12 != r1) goto L85a
            r12 = r2 & 255(0xff, float:3.57E-43)
            if (r12 != r2) goto L85a
            r12 = r3 & 255(0xff, float:3.57E-43)
            if (r12 != r3) goto L85a
            r12 = r4 & 255(0xff, float:3.57E-43)
            if (r12 != r4) goto L85a
            r12 = r5 & 255(0xff, float:3.57E-43)
            if (r12 != r5) goto L85a
            r12 = r6 & 255(0xff, float:3.57E-43)
            if (r12 != r6) goto L85a
            r12 = r7 & 255(0xff, float:3.57E-43)
            if (r12 != r7) goto L85a
            r12 = r8 & 255(0xff, float:3.57E-43)
            if (r12 != r8) goto L85a
            r12 = r9 & 255(0xff, float:3.57E-43)
            if (r12 != r9) goto L85a
            r12 = r10 & 255(0xff, float:3.57E-43)
            if (r12 != r10) goto L85a
            r12 = r11 & 255(0xff, float:3.57E-43)
            if (r12 != r11) goto L85a
            int r3 = r3 << 24
            int r2 = r2 << 16
            int r3 = r3 + r2
            int r1 = r1 << 8
            int r3 = r3 + r1
            int r3 = r3 + r0
            long r0 = (long) r3
            long r2 = (long) r11
            long r2 = r2 << r17
            long r10 = (long) r10
            long r10 = r10 << r20
            long r2 = r2 + r10
            long r9 = (long) r9
            long r9 = r9 << r23
            long r2 = r2 + r9
            long r8 = (long) r8
            long r8 = r8 << r21
            long r2 = r2 + r8
            long r7 = (long) r7
            long r7 = r7 << r24
            long r2 = r2 + r7
            long r6 = (long) r6
            long r6 = r6 << r25
            long r2 = r2 + r6
            long r5 = (long) r5
            long r5 = r5 << r26
            long r2 = r2 + r5
            long r4 = (long) r4
            goto L28a
        L494:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            int r10 = r29 + 10
            char r10 = r27[r10]
            r11 = r0 & 255(0xff, float:3.57E-43)
            if (r11 != r0) goto L85a
            r11 = r1 & 255(0xff, float:3.57E-43)
            if (r11 != r1) goto L85a
            r11 = r2 & 255(0xff, float:3.57E-43)
            if (r11 != r2) goto L85a
            r11 = r3 & 255(0xff, float:3.57E-43)
            if (r11 != r3) goto L85a
            r11 = r4 & 255(0xff, float:3.57E-43)
            if (r11 != r4) goto L85a
            r11 = r5 & 255(0xff, float:3.57E-43)
            if (r11 != r5) goto L85a
            r11 = r6 & 255(0xff, float:3.57E-43)
            if (r11 != r6) goto L85a
            r11 = r7 & 255(0xff, float:3.57E-43)
            if (r11 != r7) goto L85a
            r11 = r8 & 255(0xff, float:3.57E-43)
            if (r11 != r8) goto L85a
            r11 = r9 & 255(0xff, float:3.57E-43)
            if (r11 != r9) goto L85a
            r11 = r10 & 255(0xff, float:3.57E-43)
            if (r11 != r10) goto L85a
            int r2 = r2 << 16
            int r1 = r1 << 8
            int r2 = r2 + r1
            int r2 = r2 + r0
            long r0 = (long) r2
            long r10 = (long) r10
            long r10 = r10 << r17
            long r12 = (long) r9
            long r12 = r12 << r20
            long r10 = r10 + r12
            long r8 = (long) r8
            long r8 = r8 << r23
            long r10 = r10 + r8
            long r7 = (long) r7
            long r7 = r7 << r21
            long r10 = r10 + r7
            long r6 = (long) r6
            long r6 = r6 << r24
            long r10 = r10 + r6
            long r5 = (long) r5
            long r5 = r5 << r25
            long r10 = r10 + r5
            long r4 = (long) r4
            long r4 = r4 << r26
            long r10 = r10 + r4
            long r2 = (long) r3
            long r3 = r10 + r2
            goto L28c
        L529:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            int r9 = r29 + 9
            char r9 = r27[r9]
            r10 = r0 & 255(0xff, float:3.57E-43)
            if (r10 != r0) goto L85a
            r10 = r1 & 255(0xff, float:3.57E-43)
            if (r10 != r1) goto L85a
            r10 = r2 & 255(0xff, float:3.57E-43)
            if (r10 != r2) goto L85a
            r10 = r3 & 255(0xff, float:3.57E-43)
            if (r10 != r3) goto L85a
            r10 = r4 & 255(0xff, float:3.57E-43)
            if (r10 != r4) goto L85a
            r10 = r5 & 255(0xff, float:3.57E-43)
            if (r10 != r5) goto L85a
            r10 = r6 & 255(0xff, float:3.57E-43)
            if (r10 != r6) goto L85a
            r10 = r7 & 255(0xff, float:3.57E-43)
            if (r10 != r7) goto L85a
            r10 = r8 & 255(0xff, float:3.57E-43)
            if (r10 != r8) goto L85a
            r10 = r9 & 255(0xff, float:3.57E-43)
            if (r10 != r9) goto L85a
            int r1 = r1 << 8
            int r1 = r1 + r0
            long r10 = (long) r1
            long r0 = (long) r9
            long r0 = r0 << r17
            long r8 = (long) r8
            long r8 = r8 << r20
            long r0 = r0 + r8
            long r7 = (long) r7
            long r7 = r7 << r23
            long r0 = r0 + r7
            long r6 = (long) r6
            long r6 = r6 << r21
            long r0 = r0 + r6
            long r5 = (long) r5
            long r5 = r5 << r24
            long r0 = r0 + r5
            long r4 = (long) r4
            long r4 = r4 << r25
            long r0 = r0 + r4
            long r3 = (long) r3
            long r3 = r3 << r26
            long r0 = r0 + r3
            long r2 = (long) r2
            long r3 = r0 + r2
            goto L1bf
        L5b3:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            int r8 = r29 + 8
            char r8 = r27[r8]
            r9 = r0 & 255(0xff, float:3.57E-43)
            if (r9 != r0) goto L85a
            r9 = r1 & 255(0xff, float:3.57E-43)
            if (r9 != r1) goto L85a
            r9 = r2 & 255(0xff, float:3.57E-43)
            if (r9 != r2) goto L85a
            r9 = r3 & 255(0xff, float:3.57E-43)
            if (r9 != r3) goto L85a
            r9 = r4 & 255(0xff, float:3.57E-43)
            if (r9 != r4) goto L85a
            r9 = r5 & 255(0xff, float:3.57E-43)
            if (r9 != r5) goto L85a
            r9 = r6 & 255(0xff, float:3.57E-43)
            if (r9 != r6) goto L85a
            r9 = r7 & 255(0xff, float:3.57E-43)
            if (r9 != r7) goto L85a
            r9 = r8 & 255(0xff, float:3.57E-43)
            if (r9 != r8) goto L85a
            long r10 = (long) r0
            long r8 = (long) r8
            long r8 = r8 << r17
            long r12 = (long) r7
            long r12 = r12 << r20
            long r8 = r8 + r12
            long r6 = (long) r6
            long r6 = r6 << r23
            long r8 = r8 + r6
            long r5 = (long) r5
            long r5 = r5 << r21
            long r8 = r8 + r5
            long r4 = (long) r4
            long r4 = r4 << r24
            long r8 = r8 + r4
            long r3 = (long) r3
            long r3 = r3 << r25
            long r8 = r8 + r3
            long r2 = (long) r2
            long r2 = r2 << r26
            long r8 = r8 + r2
            long r0 = (long) r1
            long r3 = r8 + r0
            goto L1bf
        L632:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r17 = 56
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            int r7 = r29 + 7
            char r7 = r27[r7]
            r8 = r0 & 255(0xff, float:3.57E-43)
            if (r8 != r0) goto L85a
            r8 = r1 & 255(0xff, float:3.57E-43)
            if (r8 != r1) goto L85a
            r8 = r2 & 255(0xff, float:3.57E-43)
            if (r8 != r2) goto L85a
            r8 = r3 & 255(0xff, float:3.57E-43)
            if (r8 != r3) goto L85a
            r8 = r4 & 255(0xff, float:3.57E-43)
            if (r8 != r4) goto L85a
            r8 = r5 & 255(0xff, float:3.57E-43)
            if (r8 != r5) goto L85a
            r8 = r6 & 255(0xff, float:3.57E-43)
            if (r8 != r6) goto L85a
            r8 = r7 & 255(0xff, float:3.57E-43)
            if (r8 != r7) goto L85a
            long r7 = (long) r7
            long r7 = r7 << r17
            long r9 = (long) r6
            long r9 = r9 << r20
            long r7 = r7 + r9
            long r5 = (long) r5
            long r5 = r5 << r23
            long r7 = r7 + r5
            long r4 = (long) r4
            long r4 = r4 << r21
            long r7 = r7 + r4
            long r3 = (long) r3
            long r3 = r3 << r24
            long r7 = r7 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r7 = r7 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r7 = r7 + r1
            long r0 = (long) r0
            long r10 = r7 + r0
        L6a6:
            r2 = r10
            r4 = r18
            goto L85d
        L6ab:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r20 = 48
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            int r6 = r29 + 6
            char r6 = r27[r6]
            r7 = r0 & 255(0xff, float:3.57E-43)
            if (r7 != r0) goto L85a
            r7 = r1 & 255(0xff, float:3.57E-43)
            if (r7 != r1) goto L85a
            r7 = r2 & 255(0xff, float:3.57E-43)
            if (r7 != r2) goto L85a
            r7 = r3 & 255(0xff, float:3.57E-43)
            if (r7 != r3) goto L85a
            r7 = r4 & 255(0xff, float:3.57E-43)
            if (r7 != r4) goto L85a
            r7 = r5 & 255(0xff, float:3.57E-43)
            if (r7 != r5) goto L85a
            r7 = r6 & 255(0xff, float:3.57E-43)
            if (r7 != r6) goto L85a
            long r6 = (long) r6
            long r6 = r6 << r20
            long r8 = (long) r5
            long r8 = r8 << r23
            long r6 = r6 + r8
            long r4 = (long) r4
            long r4 = r4 << r21
            long r6 = r6 + r4
            long r3 = (long) r3
            long r3 = r3 << r24
            long r6 = r6 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r6 = r6 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r6 = r6 + r1
            long r0 = (long) r0
            long r10 = r6 + r0
            goto L6a6
        L712:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r23 = 40
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            int r5 = r29 + 5
            char r5 = r27[r5]
            r6 = r0 & 255(0xff, float:3.57E-43)
            if (r6 != r0) goto L85a
            r6 = r1 & 255(0xff, float:3.57E-43)
            if (r6 != r1) goto L85a
            r6 = r2 & 255(0xff, float:3.57E-43)
            if (r6 != r2) goto L85a
            r6 = r3 & 255(0xff, float:3.57E-43)
            if (r6 != r3) goto L85a
            r6 = r4 & 255(0xff, float:3.57E-43)
            if (r6 != r4) goto L85a
            r6 = r5 & 255(0xff, float:3.57E-43)
            if (r6 != r5) goto L85a
            long r5 = (long) r5
            long r5 = r5 << r23
            long r7 = (long) r4
            long r7 = r7 << r21
            long r5 = r5 + r7
            long r3 = (long) r3
            long r3 = r3 << r24
            long r5 = r5 + r3
            long r2 = (long) r2
            long r2 = r2 << r25
            long r5 = r5 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r5 = r5 + r1
            long r0 = (long) r0
            long r10 = r5 + r0
            goto L6a6
        L76c:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            int r5 = r29 + 4
            char r4 = r27[r5]
            r5 = r0 & 255(0xff, float:3.57E-43)
            if (r5 != r0) goto L85a
            r5 = r1 & 255(0xff, float:3.57E-43)
            if (r5 != r1) goto L85a
            r5 = r2 & 255(0xff, float:3.57E-43)
            if (r5 != r2) goto L85a
            r5 = r3 & 255(0xff, float:3.57E-43)
            if (r5 != r3) goto L85a
            r5 = r4 & 255(0xff, float:3.57E-43)
            if (r5 != r4) goto L85a
            long r4 = (long) r4
            long r4 = r4 << r21
            long r6 = (long) r3
            long r6 = r6 << r24
            long r4 = r4 + r6
            long r2 = (long) r2
            long r2 = r2 << r25
            long r4 = r4 + r2
            long r1 = (long) r1
            long r1 = r1 << r26
            long r4 = r4 + r1
            long r0 = (long) r0
            long r10 = r4 + r0
            goto L6a6
        L7b8:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r24 = 24
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            int r5 = r29 + 3
            char r3 = r27[r5]
            r4 = r0 & 255(0xff, float:3.57E-43)
            if (r4 != r0) goto L85a
            r4 = r1 & 255(0xff, float:3.57E-43)
            if (r4 != r1) goto L85a
            r4 = r2 & 255(0xff, float:3.57E-43)
            if (r4 != r2) goto L85a
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 != r3) goto L85a
            int r3 = r3 << 24
            int r2 = r2 << 16
            int r3 = r3 + r2
            int r1 = r1 << 8
            int r3 = r3 + r1
            int r3 = r3 + r0
            long r10 = (long) r3
            goto L6a6
        L7f4:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r25 = 16
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            int r5 = r29 + 2
            char r2 = r27[r5]
            r3 = r0 & 255(0xff, float:3.57E-43)
            if (r3 != r0) goto L85a
            r3 = r1 & 255(0xff, float:3.57E-43)
            if (r3 != r1) goto L85a
            r3 = r2 & 255(0xff, float:3.57E-43)
            if (r3 != r2) goto L85a
            int r2 = r2 << 16
            int r1 = r1 << 8
            int r2 = r2 + r1
            int r2 = r2 + r0
            long r10 = (long) r2
            goto L6a6
        L823:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            r26 = 8
            char r0 = r27[r29]
            int r5 = r29 + 1
            char r1 = r27[r5]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L85a
            r2 = r1 & 255(0xff, float:3.57E-43)
            if (r2 != r1) goto L85a
            int r1 = r1 << 8
            int r1 = r1 + r0
            long r10 = (long) r1
            goto L6a6
        L845:
            r28 = r1
            r27 = r2
            r29 = r5
            r21 = r9
            r22 = r10
            r18 = -1
            char r0 = r27[r29]
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L85a
            long r10 = (long) r0
            goto L6a6
        L85a:
            r2 = r18
            r4 = r2
        L85d:
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L8ea
            int r0 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r0 == 0) goto L8b2
            long r0 = r2 ^ r4
            long r6 = r0 >>> r21
            long r0 = r0 ^ r6
            int r0 = (int) r0
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r6 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            int r1 = r6.length
            int r1 = r1 + (-1)
            r7 = r0 & r1
            r0 = r6[r7]
            if (r0 != 0) goto L89b
            r9 = r32
            java.lang.String r0 = r9.str
            if (r0 == 0) goto L886
            r8 = r28
            r1 = r29
            java.lang.String r0 = r0.substring(r1, r8)
        L884:
            r1 = r0
            goto L893
        L886:
            r8 = r28
            r1 = r29
            java.lang.String r0 = new java.lang.String
            int r8 = r8 - r1
            r10 = r27
            r0.<init>(r10, r1, r8)
            goto L884
        L893:
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2 r0 = new com.alibaba.fastjson2.JSONFactory$NameCacheEntry2
            r0.<init>(r1, r2, r4)
            r6[r7] = r0
            return r1
        L89b:
            r9 = r32
            r10 = r27
            r8 = r28
            r1 = r29
            long r6 = r0.value0
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L8f2
            long r2 = r0.value1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L8f2
            java.lang.String r0 = r0.name
            return r0
        L8b2:
            r9 = r32
            r10 = r27
            r8 = r28
            r1 = r29
            long r4 = r2 >>> r21
            long r4 = r4 ^ r2
            int r0 = (int) r4
            com.alibaba.fastjson2.util.NameCacheEntry[] r4 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            int r5 = r4.length
            int r5 = r5 + (-1)
            r0 = r0 & r5
            r5 = r4[r0]
            if (r5 != 0) goto L8e1
            java.lang.String r5 = r9.str
            if (r5 == 0) goto L8d1
            java.lang.String r1 = r5.substring(r1, r8)
            goto L8d9
        L8d1:
            java.lang.String r5 = new java.lang.String
            int r6 = r8 - r1
            r5.<init>(r10, r1, r6)
            r1 = r5
        L8d9:
            com.alibaba.fastjson2.util.NameCacheEntry r5 = new com.alibaba.fastjson2.util.NameCacheEntry
            r5.<init>(r1, r2)
            r4[r0] = r5
            return r1
        L8e1:
            long r6 = r5.value
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L8f2
            java.lang.String r0 = r5.name
            return r0
        L8ea:
            r9 = r32
            r10 = r27
            r8 = r28
            r1 = r29
        L8f2:
            java.lang.String r0 = r9.str
            if (r0 == 0) goto L8fb
            java.lang.String r0 = r0.substring(r1, r8)
            return r0
        L8fb:
            java.lang.String r0 = new java.lang.String
            int r2 = r8 - r1
            r0.<init>(r10, r1, r2)
            return r0
        L903:
            r9 = r0
            java.lang.String r0 = r9.getFieldName()
            return r0
        L909:
            r9 = r0
            java.lang.String r0 = "syntax error : "
            java.lang.String r0 = eh.a.l(r8, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
            r35 = this;
            r0 = r35
            char[] r1 = r0.chars
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
            if (r2 == r6) goto L8f
            if (r2 == r3) goto L8f
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
            if (r2 == r1) goto L8c
            boolean r1 = r0.isNull()
            if (r1 == 0) goto L51
            goto L8c
        L51:
            r1 = 91
            if (r2 != r1) goto L74
            int r1 = r0.nameBegin
            if (r1 <= 0) goto L74
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "illegal fieldName input "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = ", previous fieldName "
            r1.append(r2)
            java.lang.String r2 = r0.getFieldName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L82
        L74:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "illegal fieldName input"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L82:
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
        L89:
            r1 = 0
            return r1
        L8c:
            r1 = -1
            return r1
        L8f:
            r3 = 0
            r0.stringValue = r3
            r3 = 0
            r0.nameEscape = r3
            int r6 = r0.offset
            r0.nameBegin = r6
            int r7 = r0.end
            int r8 = r6 + 9
            r16 = r4
            if (r8 >= r7) goto L281
            r18 = 56
            char r9 = r1[r6]
            r19 = 48
            int r10 = r6 + 1
            r20 = 40
            char r11 = r1[r10]
            r21 = 24
            int r12 = r6 + 2
            r22 = 16
            char r14 = r1[r12]
            r23 = 32
            int r13 = r6 + 3
            r24 = 8
            char r15 = r1[r13]
            int r3 = r6 + 4
            char r4 = r1[r3]
            int r5 = r6 + 5
            r26 = r1
            char r1 = r26[r5]
            r27 = r6
            int r6 = r27 + 6
            r28 = r8
            char r8 = r26[r6]
            r29 = r7
            int r7 = r27 + 7
            r30 = r7
            char r7 = r26[r30]
            r31 = r7
            int r7 = r27 + 8
            r32 = r7
            char r7 = r26[r32]
            if (r9 != r2) goto Le7
        Le1:
            r3 = r16
            r6 = r27
            goto L295
        Le7:
            if (r11 != r2) goto Lff
            if (r9 == 0) goto Lff
            r33 = r7
            r7 = 92
            if (r9 == r7) goto L101
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L101
            byte r1 = (byte) r9
            long r3 = (long) r1
            r1 = 1
            r0.nameLength = r1
            r0.nameEnd = r10
            r6 = r12
            goto L295
        Lff:
            r33 = r7
        L101:
            if (r14 != r2) goto L11e
            if (r9 == 0) goto L11e
            r7 = 92
            if (r9 == r7) goto L11e
            if (r11 == r7) goto L11e
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L11e
            if (r11 > r7) goto L11e
            byte r1 = (byte) r11
            int r1 = r1 << 8
            int r1 = r1 + r9
            long r3 = (long) r1
            r1 = 2
            r0.nameLength = r1
            r0.nameEnd = r12
            r6 = r13
            goto L295
        L11e:
            if (r15 != r2) goto L143
            if (r9 == 0) goto L143
            r7 = 92
            if (r9 == r7) goto L143
            if (r11 == r7) goto L143
            if (r14 == r7) goto L143
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L143
            if (r11 > r7) goto L143
            if (r14 > r7) goto L143
            byte r1 = (byte) r14
            int r1 = r1 << 16
            int r4 = r11 << 8
            int r1 = r1 + r4
            int r1 = r1 + r9
            long r4 = (long) r1
            r1 = 3
            r0.nameLength = r1
            r0.nameEnd = r13
            r6 = r3
            r3 = r4
            goto L295
        L143:
            if (r4 != r2) goto L16f
            if (r9 == 0) goto L16f
            r7 = 92
            if (r9 == r7) goto L16f
            if (r11 == r7) goto L16f
            if (r14 == r7) goto L16f
            if (r15 == r7) goto L16f
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L16f
            if (r11 > r7) goto L16f
            if (r14 > r7) goto L16f
            if (r15 > r7) goto L16f
            byte r1 = (byte) r15
            int r1 = r1 << 24
            int r4 = r14 << 16
            int r1 = r1 + r4
            int r4 = r11 << 8
            int r1 = r1 + r4
            int r1 = r1 + r9
            long r6 = (long) r1
            r1 = 4
            r0.nameLength = r1
            r0.nameEnd = r3
            r3 = r6
            r6 = r5
            goto L295
        L16f:
            if (r1 != r2) goto L1a4
            if (r9 == 0) goto L1a4
            r7 = 92
            if (r9 == r7) goto L1a4
            if (r11 == r7) goto L1a4
            if (r14 == r7) goto L1a4
            if (r15 == r7) goto L1a4
            if (r4 == r7) goto L1a4
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L1a4
            if (r11 > r7) goto L1a4
            if (r14 > r7) goto L1a4
            if (r15 > r7) goto L1a4
            if (r4 > r7) goto L1a4
            byte r1 = (byte) r4
            long r3 = (long) r1
            long r3 = r3 << r23
            long r7 = (long) r15
            long r7 = r7 << r21
            long r3 = r3 + r7
            long r7 = (long) r14
            long r7 = r7 << r22
            long r3 = r3 + r7
            long r7 = (long) r11
            long r7 = r7 << r24
            long r3 = r3 + r7
            long r7 = (long) r9
            long r3 = r3 + r7
            r1 = 5
            r0.nameLength = r1
            r0.nameEnd = r5
            goto L295
        L1a4:
            if (r8 != r2) goto L1e3
            if (r9 == 0) goto L1e3
            r7 = 92
            if (r9 == r7) goto L1e3
            if (r11 == r7) goto L1e3
            if (r14 == r7) goto L1e3
            if (r15 == r7) goto L1e3
            if (r4 == r7) goto L1e3
            if (r1 == r7) goto L1e3
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L1e3
            if (r11 > r7) goto L1e3
            if (r14 > r7) goto L1e3
            if (r15 > r7) goto L1e3
            if (r4 > r7) goto L1e3
            if (r1 > r7) goto L1e3
            byte r1 = (byte) r1
            long r7 = (long) r1
            long r7 = r7 << r20
            long r3 = (long) r4
            long r3 = r3 << r23
            long r7 = r7 + r3
            long r3 = (long) r15
            long r3 = r3 << r21
            long r7 = r7 + r3
            long r3 = (long) r14
            long r3 = r3 << r22
            long r7 = r7 + r3
            long r3 = (long) r11
            long r3 = r3 << r24
            long r7 = r7 + r3
            long r3 = (long) r9
            long r3 = r3 + r7
            r1 = 6
            r0.nameLength = r1
            r0.nameEnd = r6
            r6 = r30
            goto L295
        L1e3:
            r3 = r31
            if (r3 != r2) goto L22e
            if (r9 == 0) goto L22e
            r7 = 92
            if (r9 == r7) goto L22e
            if (r11 == r7) goto L22e
            if (r14 == r7) goto L22e
            if (r15 == r7) goto L22e
            if (r4 == r7) goto L22e
            if (r1 == r7) goto L22e
            if (r8 == r7) goto L22e
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto L22e
            if (r11 > r7) goto L22e
            if (r14 > r7) goto L22e
            if (r15 > r7) goto L22e
            if (r4 > r7) goto L22e
            if (r1 > r7) goto L22e
            if (r8 > r7) goto L22e
            byte r3 = (byte) r8
            long r5 = (long) r3
            long r5 = r5 << r19
            long r7 = (long) r1
            long r7 = r7 << r20
            long r5 = r5 + r7
            long r3 = (long) r4
            long r3 = r3 << r23
            long r5 = r5 + r3
            long r3 = (long) r15
            long r3 = r3 << r21
            long r5 = r5 + r3
            long r3 = (long) r14
            long r3 = r3 << r22
            long r5 = r5 + r3
            long r3 = (long) r11
            long r3 = r3 << r24
            long r5 = r5 + r3
            long r3 = (long) r9
            long r3 = r3 + r5
            r1 = 7
            r0.nameLength = r1
            r6 = r30
            r0.nameEnd = r6
            r6 = r32
            goto L295
        L22e:
            r5 = r33
            if (r5 != r2) goto Le1
            if (r9 == 0) goto Le1
            r7 = 92
            if (r9 == r7) goto Le1
            if (r11 == r7) goto Le1
            if (r14 == r7) goto Le1
            if (r15 == r7) goto Le1
            if (r4 == r7) goto Le1
            if (r1 == r7) goto Le1
            if (r8 == r7) goto Le1
            if (r3 == r7) goto Le1
            r7 = 255(0xff, float:3.57E-43)
            if (r9 > r7) goto Le1
            if (r11 > r7) goto Le1
            if (r14 > r7) goto Le1
            if (r15 > r7) goto Le1
            if (r4 > r7) goto Le1
            if (r1 > r7) goto Le1
            if (r8 > r7) goto Le1
            if (r3 > r7) goto Le1
            byte r3 = (byte) r3
            long r5 = (long) r3
            long r5 = r5 << r18
            long r7 = (long) r8
            long r7 = r7 << r19
            long r5 = r5 + r7
            long r7 = (long) r1
            long r7 = r7 << r20
            long r5 = r5 + r7
            long r3 = (long) r4
            long r3 = r3 << r23
            long r5 = r5 + r3
            long r3 = (long) r15
            long r3 = r3 << r21
            long r5 = r5 + r3
            long r3 = (long) r14
            long r3 = r3 << r22
            long r5 = r5 + r3
            long r3 = (long) r11
            long r3 = r3 << r24
            long r5 = r5 + r3
            long r3 = (long) r9
            long r3 = r3 + r5
            r1 = r24
            r0.nameLength = r1
            r6 = r32
            r0.nameEnd = r6
            r6 = r28
            goto L295
        L281:
            r26 = r1
            r27 = r6
            r29 = r7
            r18 = 56
            r19 = 48
            r20 = 40
            r21 = 24
            r22 = 16
            r23 = 32
            goto Le1
        L295:
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r5 = 120(0x78, float:1.68E-43)
            r7 = 117(0x75, float:1.64E-43)
            if (r1 != 0) goto L359
            r1 = r29
            r8 = 0
        L2a0:
            if (r6 >= r1) goto L35b
            char r9 = r26[r6]
            if (r9 != r2) goto L2b4
            if (r8 != 0) goto L2ac
            int r6 = r0.nameBegin
            goto L35b
        L2ac:
            r0.nameLength = r8
            r0.nameEnd = r6
            int r6 = r6 + 1
            goto L35b
        L2b4:
            r10 = 92
            if (r9 != r10) goto L2ca
            r10 = 1
            r0.nameEscape = r10
            int r9 = r6 + 1
            char r10 = r26[r9]
            if (r10 == r7) goto L2da
            if (r10 == r5) goto L2cd
            char r6 = r0.char1(r10)
            r10 = r9
            r9 = r6
            r6 = r10
        L2ca:
            r10 = 255(0xff, float:3.57E-43)
            goto L2ef
        L2cd:
            int r9 = r6 + 2
            char r9 = r26[r9]
            int r6 = r6 + 3
            char r10 = r26[r6]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r9, r10)
            goto L2ca
        L2da:
            int r9 = r6 + 2
            char r9 = r26[r9]
            int r10 = r6 + 3
            char r10 = r26[r10]
            int r11 = r6 + 4
            char r11 = r26[r11]
            int r6 = r6 + 5
            char r12 = r26[r6]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r9, r10, r11, r12)
            goto L2ca
        L2ef:
            if (r9 > r10) goto L354
            r11 = 8
            if (r8 >= r11) goto L354
            if (r8 != 0) goto L2fa
            if (r9 != 0) goto L2fa
            goto L354
        L2fa:
            switch(r8) {
                case 0: goto L349;
                case 1: goto L33d;
                case 2: goto L335;
                case 3: goto L32d;
                case 4: goto L323;
                case 5: goto L319;
                case 6: goto L30f;
                case 7: goto L302;
                default: goto L2fd;
            }
        L2fd:
            r24 = 8
        L2ff:
            r25 = 1
            goto L34e
        L302:
            byte r9 = (byte) r9
            long r11 = (long) r9
            long r11 = r11 << r18
            r13 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L30b:
            long r3 = r3 & r13
            long r11 = r11 + r3
            r3 = r11
            goto L2fd
        L30f:
            byte r9 = (byte) r9
            long r11 = (long) r9
            long r11 = r11 << r19
            r13 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L30b
        L319:
            byte r9 = (byte) r9
            long r11 = (long) r9
            long r11 = r11 << r20
            r13 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L30b
        L323:
            byte r9 = (byte) r9
            long r11 = (long) r9
            long r11 = r11 << r23
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L30b
        L32d:
            byte r9 = (byte) r9
            int r9 = r9 << 24
            long r11 = (long) r9
            r13 = 16777215(0xffffff, double:8.2890456E-317)
            goto L30b
        L335:
            byte r9 = (byte) r9
            int r9 = r9 << 16
            long r11 = (long) r9
            r13 = 65535(0xffff, double:3.23786E-319)
            goto L30b
        L33d:
            byte r9 = (byte) r9
            r24 = 8
            int r9 = r9 << 8
            long r11 = (long) r9
            r13 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            long r11 = r11 + r3
            r3 = r11
            goto L2ff
        L349:
            r24 = 8
            byte r3 = (byte) r9
            long r3 = (long) r3
            goto L2ff
        L34e:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto L2a0
        L354:
            int r6 = r0.nameBegin
            r3 = r16
            goto L35b
        L359:
            r1 = r29
        L35b:
            int r8 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r8 == 0) goto L360
            goto L3bf
        L360:
            r3 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r8 = r6
            r6 = 0
        L367:
            char r9 = r26[r8]
            r10 = 92
            if (r9 != r10) goto L3b5
            r11 = 1
            r0.nameEscape = r11
            int r9 = r8 + 1
            char r11 = r26[r9]
            if (r11 == r7) goto L391
            if (r11 == r5) goto L37f
            char r8 = r0.char1(r11)
        L37c:
            r25 = 1
            goto L3a6
        L37f:
            int r9 = r8 + 2
            char r9 = r26[r9]
            int r8 = r8 + 3
            char r11 = r26[r8]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r9, r11)
        L38b:
            r25 = r9
            r9 = r8
            r8 = r25
            goto L37c
        L391:
            int r9 = r8 + 2
            char r9 = r26[r9]
            int r11 = r8 + 3
            char r11 = r26[r11]
            int r12 = r8 + 4
            char r12 = r26[r12]
            int r8 = r8 + 5
            char r13 = r26[r8]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r9, r11, r12, r13)
            goto L38b
        L3a6:
            int r9 = r9 + 1
            long r11 = (long) r8
            long r3 = r3 ^ r11
            r11 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r3 = r3 * r11
            r8 = r9
            r11 = r23
            goto L43f
        L3b5:
            r25 = 1
            if (r9 != r2) goto L433
            r0.nameLength = r6
            r0.nameEnd = r8
            int r6 = r8 + 1
        L3bf:
            r2 = 26
            if (r6 != r1) goto L3c6
            r5 = r6
            r6 = r2
            goto L3ca
        L3c6:
            int r5 = r6 + 1
            char r6 = r26[r6]
        L3ca:
            r7 = r23
        L3cc:
            if (r6 > r7) goto L3eb
            r7 = 1
            long r7 = r7 << r6
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 == 0) goto L3eb
            if (r5 != r1) goto L3df
            r6 = r2
            goto L3e8
        L3df:
            int r6 = r5 + 1
            char r5 = r26[r5]
            r34 = r6
            r6 = r5
            r5 = r34
        L3e8:
            r7 = 32
            goto L3cc
        L3eb:
            r7 = 58
            if (r6 != r7) goto L41c
            if (r5 != r1) goto L3f4
            r6 = r5
            r5 = r2
            goto L3f8
        L3f4:
            int r6 = r5 + 1
            char r5 = r26[r5]
        L3f8:
            r11 = 32
        L3fa:
            if (r5 > r11) goto L417
            r7 = 1
            long r7 = r7 << r5
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            long r7 = r7 & r9
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 == 0) goto L417
            if (r6 != r1) goto L40d
            r5 = r2
            goto L3fa
        L40d:
            int r5 = r6 + 1
            char r6 = r26[r6]
            r34 = r6
            r6 = r5
            r5 = r34
            goto L3fa
        L417:
            r0.offset = r6
            r0.f1814ch = r5
            return r3
        L41c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "expect ':', but "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            goto L89
        L433:
            r11 = r23
            int r8 = r8 + 1
            long r12 = (long) r9
            long r3 = r3 ^ r12
            r12 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r3 = r3 * r12
        L43f:
            int r6 = r6 + 1
            r23 = r11
            goto L367
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
            r26 = this;
            r0 = r26
            r1 = 0
            r0.nameEscape = r1
            int r2 = r0.offset
            int r3 = r0.end
            char[] r4 = r0.chars
            char r5 = r0.f1814ch
            int r6 = r2 + (-1)
            r0.nameBegin = r6
            r9 = r1
            r8 = r5
            r10 = 0
        L15:
            r16 = 0
            r12 = 93
            r13 = 91
            r14 = 13
            r15 = 12
            r19 = 4294981377(0x100003701, double:2.122002748E-314)
            r21 = 1
            r1 = 58
            r6 = 26
            r7 = 1
            if (r2 > r3) goto L137
            if (r8 == r15) goto L113
            if (r8 == r14) goto L113
            if (r8 == r6) goto L113
            if (r8 == r1) goto L113
            if (r8 == r13) goto L113
            if (r8 == r12) goto L113
            r12 = 123(0x7b, float:1.72E-43)
            if (r8 == r12) goto L113
            r12 = 125(0x7d, float:1.75E-43)
            if (r8 == r12) goto L113
            r12 = 32
            if (r8 == r12) goto L113
            r12 = 33
            if (r8 == r12) goto L113
            switch(r8) {
                case 8: goto L113;
                case 9: goto L113;
                case 10: goto L113;
                default: goto L4c;
            }
        L4c:
            switch(r8) {
                case 40: goto L113;
                case 41: goto L113;
                case 42: goto L113;
                case 43: goto L113;
                case 44: goto L113;
                case 45: goto L113;
                case 46: goto L113;
                case 47: goto L113;
                default: goto L4f;
            }
        L4f:
            switch(r8) {
                case 60: goto L113;
                case 61: goto L113;
                case 62: goto L113;
                default: goto L52;
            }
        L52:
            r12 = 92
            if (r8 != r12) goto Lac
            r0.nameEscape = r7
            int r8 = r2 + 1
            char r13 = r4[r2]
            r14 = 34
            if (r13 == r14) goto Laa
            if (r13 == r1) goto Laa
            r14 = 64
            if (r13 == r14) goto Laa
            if (r13 == r12) goto Laa
            r12 = 117(0x75, float:1.64E-43)
            if (r13 == r12) goto L95
            r12 = 120(0x78, float:1.68E-43)
            if (r13 == r12) goto L88
            r2 = 42
            if (r13 == r2) goto Laa
            r2 = 43
            if (r13 == r2) goto Laa
            switch(r13) {
                case 45: goto Laa;
                case 46: goto Laa;
                case 47: goto Laa;
                default: goto L7b;
            }
        L7b:
            switch(r13) {
                case 60: goto Laa;
                case 61: goto Laa;
                case 62: goto Laa;
                default: goto L7e;
            }
        L7e:
            char r2 = r0.char1(r13)
            r24 = r8
            r8 = r2
            r2 = r24
            goto Lac
        L88:
            char r8 = r4[r8]
            int r12 = r2 + 2
            char r12 = r4[r12]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r8, r12)
            int r2 = r2 + 3
            goto Lac
        L95:
            char r8 = r4[r8]
            int r12 = r2 + 2
            char r12 = r4[r12]
            int r13 = r2 + 3
            char r13 = r4[r13]
            int r14 = r2 + 4
            char r14 = r4[r14]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r8, r12, r13, r14)
            int r2 = r2 + 5
            goto Lac
        Laa:
            r2 = r8
            r8 = r13
        Lac:
            r12 = 255(0xff, float:3.57E-43)
            if (r8 > r12) goto L10d
            r12 = 8
            if (r9 >= r12) goto L10d
            if (r9 != 0) goto Lb9
            if (r8 != 0) goto Lb9
            goto L10d
        Lb9:
            byte r1 = (byte) r8
            switch(r9) {
                case 0: goto Lfd;
                case 1: goto Lf7;
                case 2: goto Lf0;
                case 3: goto Le9;
                case 4: goto Lde;
                case 5: goto Ld4;
                case 6: goto Lca;
                case 7: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            goto Lfe
        Lbe:
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        Lc7:
            long r10 = r10 & r12
            long r10 = r10 + r7
            goto Lfe
        Lca:
            long r7 = (long) r1
            r1 = 48
            long r7 = r7 << r1
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto Lc7
        Ld4:
            long r7 = (long) r1
            r1 = 40
            long r7 = r7 << r1
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto Lc7
        Lde:
            long r7 = (long) r1
            r23 = 32
            long r7 = r7 << r23
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto Lc7
        Le9:
            int r1 = r1 << 24
            long r7 = (long) r1
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto Lc7
        Lf0:
            int r1 = r1 << 16
            long r7 = (long) r1
            r12 = 65535(0xffff, double:3.23786E-319)
            goto Lc7
        Lf7:
            int r1 = r1 << 8
            long r7 = (long) r1
            r12 = 255(0xff, double:1.26E-321)
            goto Lc7
        Lfd:
            long r10 = (long) r1
        Lfe:
            if (r2 != r3) goto L102
            r8 = r6
            goto L108
        L102:
            int r1 = r2 + 1
            char r2 = r4[r2]
            r8 = r2
            r2 = r1
        L108:
            int r9 = r9 + 1
            r1 = 0
            goto L15
        L10d:
            int r2 = r0.nameBegin
            int r2 = r2 + r7
            r10 = r16
            goto L138
        L113:
            r0.nameLength = r9
            if (r8 != r6) goto L119
            r5 = r2
            goto L11b
        L119:
            int r5 = r2 + (-1)
        L11b:
            r0.nameEnd = r5
            r12 = 32
            if (r8 > r12) goto L137
            long r12 = r21 << r8
            long r12 = r12 & r19
            int r5 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r5 == 0) goto L137
            if (r2 != r3) goto L12d
            r5 = r6
            goto L138
        L12d:
            int r5 = r2 + 1
            char r2 = r4[r2]
            r24 = r5
            r5 = r2
            r2 = r24
            goto L138
        L137:
            r5 = r8
        L138:
            int r8 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r8 == 0) goto L13e
            goto L227
        L13e:
            r8 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r8
            r8 = r5
            r5 = r2
            r2 = 0
        L147:
            r12 = 92
            if (r8 != r12) goto L1ba
            r0.nameEscape = r7
            int r8 = r5 + 1
            char r9 = r4[r5]
            r14 = 34
            if (r9 == r14) goto L19c
            if (r9 == r1) goto L19c
            r13 = 64
            if (r9 == r13) goto L19e
            if (r9 == r12) goto L19e
            r7 = 117(0x75, float:1.64E-43)
            if (r9 == r7) goto L185
            r7 = 120(0x78, float:1.68E-43)
            if (r9 == r7) goto L178
            r5 = 42
            if (r9 == r5) goto L19e
            r5 = 43
            if (r9 == r5) goto L19e
            switch(r9) {
                case 45: goto L19e;
                case 46: goto L19e;
                case 47: goto L19e;
                default: goto L170;
            }
        L170:
            switch(r9) {
                case 60: goto L19e;
                case 61: goto L19e;
                case 62: goto L19e;
                default: goto L173;
            }
        L173:
            char r9 = r0.char1(r9)
            goto L19e
        L178:
            char r8 = r4[r8]
            int r9 = r5 + 2
            char r9 = r4[r9]
            char r9 = com.alibaba.fastjson2.JSONReader.char2(r8, r9)
            int r8 = r5 + 3
            goto L19e
        L185:
            r7 = 120(0x78, float:1.68E-43)
            char r8 = r4[r8]
            int r9 = r5 + 2
            char r9 = r4[r9]
            int r18 = r5 + 3
            char r7 = r4[r18]
            int r18 = r5 + 4
            char r12 = r4[r18]
            char r9 = com.alibaba.fastjson2.JSONReader.char4(r8, r9, r7, r12)
            int r8 = r5 + 5
            goto L19e
        L19c:
            r13 = 64
        L19e:
            long r13 = (long) r9
            long r9 = r10 ^ r13
            r11 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r9 = r9 * r11
            if (r8 != r3) goto L1ac
            r5 = r8
            r8 = r6
            goto L1b0
        L1ac:
            int r5 = r8 + 1
            char r8 = r4[r8]
        L1b0:
            r10 = r9
            r9 = 13
            r12 = 91
            r13 = 93
            r14 = 123(0x7b, float:1.72E-43)
            goto L1fc
        L1ba:
            if (r8 == r15) goto L201
            r9 = 13
            if (r8 == r9) goto L201
            if (r8 == r6) goto L201
            if (r8 == r1) goto L201
            r12 = 91
            if (r8 == r12) goto L201
            r13 = 93
            if (r8 == r13) goto L201
            r14 = 123(0x7b, float:1.72E-43)
            if (r8 == r14) goto L201
            r7 = 125(0x7d, float:1.75E-43)
            if (r8 == r7) goto L201
            r7 = 32
            if (r8 == r7) goto L201
            r7 = 33
            if (r8 == r7) goto L201
            switch(r8) {
                case 8: goto L201;
                case 9: goto L201;
                case 10: goto L201;
                default: goto L1df;
            }
        L1df:
            switch(r8) {
                case 40: goto L201;
                case 41: goto L201;
                case 42: goto L201;
                case 43: goto L201;
                case 44: goto L201;
                case 45: goto L201;
                case 46: goto L201;
                case 47: goto L201;
                default: goto L1e2;
            }
        L1e2:
            switch(r8) {
                case 60: goto L201;
                case 61: goto L201;
                case 62: goto L201;
                default: goto L1e5;
            }
        L1e5:
            long r7 = (long) r8
            long r7 = r7 ^ r10
            r10 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r7 = r7 * r10
            if (r5 != r3) goto L1f2
            r10 = r5
            r5 = r6
            goto L1f6
        L1f2:
            int r10 = r5 + 1
            char r5 = r4[r5]
        L1f6:
            r24 = r7
            r8 = r5
            r5 = r10
            r10 = r24
        L1fc:
            int r2 = r2 + 1
            r7 = 1
            goto L147
        L201:
            r0.nameLength = r2
            if (r8 != r6) goto L207
            r2 = r5
            goto L209
        L207:
            int r2 = r5 + (-1)
        L209:
            r0.nameEnd = r2
            r2 = r5
            r5 = r8
        L20d:
            r12 = 32
            if (r5 > r12) goto L227
            long r7 = r21 << r5
            long r7 = r7 & r19
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 == 0) goto L227
            if (r2 != r3) goto L21d
            r5 = r6
            goto L20d
        L21d:
            int r5 = r2 + 1
            char r2 = r4[r2]
            r24 = r5
            r5 = r2
            r2 = r24
            goto L20d
        L227:
            if (r5 != r1) goto L24a
            if (r2 != r3) goto L22e
            r1 = r2
            r2 = r6
            goto L232
        L22e:
            int r1 = r2 + 1
            char r2 = r4[r2]
        L232:
            r5 = r2
            r12 = 32
        L235:
            r2 = r1
        L236:
            if (r5 > r12) goto L24a
            long r7 = r21 << r5
            long r7 = r7 & r19
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto L24a
            if (r2 != r3) goto L244
            r5 = r6
            goto L236
        L244:
            int r1 = r2 + 1
            char r2 = r4[r2]
            r5 = r2
            goto L235
        L24a:
            r0.offset = r2
            r0.f1814ch = r5
            return r10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public float readFloatValue() {
            r32 = this;
            r0 = r32
            char[] r1 = r0.chars
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
            char r3 = r1[r3]
        L21:
            r8 = 44
            if (r2 == 0) goto L3b
            if (r3 != r2) goto L3b
            if (r5 != r4) goto L2c
            r3 = 26
            goto L31
        L2c:
            int r2 = r5 + 1
            char r3 = r1[r5]
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
            char r10 = r1[r5]
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
            char r6 = r1[r5]
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
            char r10 = r1[r5]
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
            char r5 = r1[r5]
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
            char r5 = r1[r5]
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
            char r5 = r1[r5]
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
            char r7 = r1[r7]
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
            char r15 = r1[r7]
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
            char r7 = r1[r7]
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
            char r5 = r1[r5]
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
            char r3 = r1[r5]
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
            char r5 = r1[r5]
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
            char r5 = r1[r5]
            goto L246
        L25e:
            r0.wasNull = r13
            char r1 = (char) r3
            r0.f1814ch = r1
            r0.offset = r5
            return r14
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readHex() {
            r18 = this;
            r0 = r18
            char r1 = r0.f1814ch
            int r2 = r0.offset
            char[] r3 = r0.chars
            r4 = 120(0x78, float:1.68E-43)
            r5 = 26
            if (r1 != r4) goto L1d
            int r1 = r0.end
            if (r2 != r1) goto L14
            r1 = r5
            goto L1d
        L14:
            int r1 = r2 + 1
            char r2 = r3[r2]
            r17 = r2
            r2 = r1
            r1 = r17
        L1d:
            r4 = 39
            if (r1 == r4) goto L2b
            r4 = 34
            if (r1 != r4) goto L26
            goto L2b
        L26:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r2, r1)
            throw r1
        L2b:
            int r4 = r0.end
            if (r2 != r4) goto L32
            r4 = r2
        L30:
            r6 = r5
            goto L36
        L32:
            int r4 = r2 + 1
            char r6 = r3[r2]
        L36:
            r7 = 57
            r8 = 48
            if (r6 < r8) goto L3e
            if (r6 <= r7) goto L46
        L3e:
            r9 = 65
            if (r6 < r9) goto L55
            r9 = 70
            if (r6 > r9) goto L55
        L46:
            int r6 = r0.end
            if (r4 != r6) goto L4b
            goto L30
        L4b:
            int r6 = r4 + 1
            char r4 = r3[r4]
            r17 = r6
            r6 = r4
            r4 = r17
            goto L36
        L55:
            if (r6 != r1) goto Lf6
            int r1 = r0.end
            if (r4 != r1) goto L5e
            r1 = r4
            r4 = r5
            goto L62
        L5e:
            int r1 = r4 + 1
            char r4 = r3[r4]
        L62:
            int r6 = r1 - r2
            int r9 = r6 + (-2)
            r10 = 1
            if (r4 != r5) goto L6b
            int r9 = r6 + (-1)
        L6b:
            int r6 = r9 % 2
            if (r6 != 0) goto Lf1
            int r9 = r9 / 2
            byte[] r6 = new byte[r9]
            r11 = 0
        L74:
            if (r11 >= r9) goto L93
            int r12 = r11 * 2
            int r12 = r12 + r2
            char r13 = r3[r12]
            int r12 = r12 + r10
            char r12 = r3[r12]
            r14 = 55
            if (r13 > r7) goto L84
            r15 = r8
            goto L85
        L84:
            r15 = r14
        L85:
            int r13 = r13 - r15
            if (r12 > r7) goto L89
            r14 = r8
        L89:
            int r12 = r12 - r14
            int r13 = r13 << 4
            r12 = r12 | r13
            byte r12 = (byte) r12
            r6[r11] = r12
            int r11 = r11 + 1
            goto L74
        L93:
            r7 = 0
            r11 = 4294981377(0x100003701, double:2.122002748E-314)
            r13 = 1
            r2 = 32
            if (r4 > r2) goto Lb4
            long r15 = r13 << r4
            long r15 = r15 & r11
            int r9 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r9 == 0) goto Lb4
            int r2 = r0.end
            if (r1 != r2) goto Lad
            r4 = r5
            goto L93
        Lad:
            int r2 = r1 + 1
            char r1 = r3[r1]
            r4 = r1
            r1 = r2
            goto L93
        Lb4:
            r9 = 44
            if (r4 != r9) goto Lec
            int r9 = r0.end
            if (r1 < r9) goto Lbd
            goto Lec
        Lbd:
            r0.comma = r10
            if (r1 != r9) goto Lc4
            r4 = r1
        Lc2:
            r1 = r5
            goto Lc8
        Lc4:
            int r4 = r1 + 1
            char r1 = r3[r1]
        Lc8:
            if (r1 > r2) goto Le0
            long r9 = r13 << r1
            long r9 = r9 & r11
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto Le0
            int r1 = r0.end
            if (r4 != r1) goto Ld6
            goto Lc2
        Ld6:
            int r1 = r4 + 1
            char r4 = r3[r4]
            r17 = r4
            r4 = r1
            r1 = r17
            goto Lc8
        Le0:
            r0.offset = r4
            r0.f1814ch = r1
            r2 = 47
            if (r1 != r2) goto Leb
            r0.skipComment()
        Leb:
            return r6
        Lec:
            r0.offset = r1
            r0.f1814ch = r4
            return r6
        Lf1:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r1, r4)
            throw r1
        Lf6:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.syntaxError(r4, r6)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readIfNull() {
            r18 = this;
            r0 = r18
            char[] r1 = r0.chars
            int r2 = r0.offset
            char r3 = r0.f1814ch
            r4 = 110(0x6e, float:1.54E-43)
            r5 = 0
            if (r3 != r4) goto L86
            char r3 = r1[r2]
            r4 = 117(0x75, float:1.64E-43)
            if (r3 != r4) goto L86
            int r3 = r2 + 1
            char r3 = r1[r3]
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L86
            int r3 = r2 + 2
            char r3 = r1[r3]
            if (r3 != r4) goto L86
            int r3 = r2 + 3
            int r4 = r0.end
            r6 = 26
            if (r3 != r4) goto L2b
            r3 = r6
            goto L2d
        L2b:
            char r3 = r1[r3]
        L2d:
            int r2 = r2 + 4
        L2f:
            r7 = 0
            r9 = 4294981377(0x100003701, double:2.122002748E-314)
            r11 = 1
            r4 = 32
            if (r3 > r4) goto L53
            long r13 = r11 << r3
            long r13 = r13 & r9
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 == 0) goto L53
            int r3 = r0.end
            if (r2 != r3) goto L49
            r3 = r6
            goto L2f
        L49:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r17 = r3
            r3 = r2
            r2 = r17
            goto L2f
        L53:
            r13 = 44
            r14 = 1
            if (r3 != r13) goto L59
            r5 = r14
        L59:
            r0.comma = r5
            if (r5 == 0) goto L81
            int r3 = r0.end
            if (r2 != r3) goto L64
            r3 = r2
            r2 = r6
            goto L68
        L64:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L68:
            r17 = r3
            r3 = r2
            r2 = r17
        L6d:
            if (r3 > r4) goto L81
            long r15 = r11 << r3
            long r15 = r15 & r9
            int r5 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r5 == 0) goto L81
            int r3 = r0.end
            if (r2 != r3) goto L7c
            r3 = r6
            goto L6d
        L7c:
            int r3 = r2 + 1
            char r2 = r1[r2]
            goto L68
        L81:
            r0.f1814ch = r3
            r0.offset = r2
            return r14
        L86:
            return r5
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int readInt32Value() {
            r21 = this;
            r0 = r21
            char r1 = r0.f1814ch
            int r2 = r0.offset
            int r3 = r0.end
            char[] r4 = r0.chars
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
            char r2 = r4[r2]
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
            char r13 = r4[r5]
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
            char r5 = r4[r5]
        L80:
            if (r11 > 0) goto L10c
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 < r11) goto L88
            if (r1 != r8) goto L10c
        L88:
            boolean[] r12 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r13 = r5 & 255(0xff, float:3.57E-43)
            boolean r12 = r12[r13]
            if (r12 == 0) goto L10c
            if (r2 == 0) goto L94
            if (r5 != r2) goto L10c
        L94:
            if (r2 == 0) goto L9f
            if (r9 != r3) goto L9a
            r5 = r7
            goto L9f
        L9a:
            int r2 = r9 + 1
            char r5 = r4[r9]
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
            char r5 = r4[r9]
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
            char r5 = r4[r9]
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
            if (r6 == 0) goto L102
            if (r9 != r3) goto Le8
            r6 = r7
            goto Led
        Le8:
            int r5 = r9 + 1
            char r6 = r4[r9]
            goto L100
        Led:
            r5 = r6
        Lee:
            if (r5 > r2) goto L102
            long r18 = r16 << r5
            long r18 = r18 & r14
            int r6 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r6 == 0) goto L102
            if (r9 != r3) goto Lfc
            r5 = r7
            goto Lee
        Lfc:
            int r5 = r9 + 1
            char r6 = r4[r9]
        L100:
            r9 = r5
            goto Led
        L102:
            char r2 = (char) r5
            r0.f1814ch = r2
            r0.offset = r9
            if (r1 != r8) goto L10a
            return r11
        L10a:
            int r1 = -r11
            return r1
        L10c:
            int r1 = r0.readInt32ValueOverflow()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readInt64Value() {
            r23 = this;
            r0 = r23
            char r1 = r0.f1814ch
            int r2 = r0.offset
            int r3 = r0.end
            char[] r4 = r0.chars
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
            char r2 = r4[r2]
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
            char r8 = r4[r5]
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
            char r5 = r4[r5]
        La2:
            int r8 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r8 > 0) goto L132
            r8 = -9223372036854775808
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto Lae
            if (r1 != r10) goto L132
        Lae:
            boolean[] r8 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r9 = r5 & 255(0xff, float:3.57E-43)
            boolean r8 = r8[r9]
            if (r8 == 0) goto L132
            if (r2 == 0) goto Lba
            if (r5 != r2) goto L132
        Lba:
            if (r2 == 0) goto Lc5
            if (r7 != r3) goto Lc0
            r5 = r6
            goto Lc5
        Lc0:
            int r2 = r7 + 1
            char r5 = r4[r7]
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
            char r5 = r4[r7]
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
            char r5 = r4[r7]
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
            if (r11 == 0) goto L128
            if (r7 != r3) goto L10c
            r5 = r7
            r7 = r6
            goto L110
        L10c:
            int r5 = r7 + 1
            char r7 = r4[r7]
        L110:
            r22 = r7
            r7 = r5
            r5 = r22
        L115:
            if (r5 > r2) goto L128
            long r16 = r18 << r5
            long r16 = r16 & r8
            int r11 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r11 == 0) goto L128
            if (r7 != r3) goto L123
            r5 = r6
            goto L115
        L123:
            int r5 = r7 + 1
            char r7 = r4[r7]
            goto L110
        L128:
            char r2 = (char) r5
            r0.f1814ch = r2
            r0.offset = r7
            if (r1 != r10) goto L130
            return r14
        L130:
            long r1 = -r14
            return r1
        L132:
            long r1 = r0.readInt64ValueOverflow()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate() {
            r15 = this;
            char[] r0 = r15.chars
            char r1 = r15.f1814ch
            r2 = 34
            if (r1 == r2) goto Lc
            r2 = 39
            if (r1 != r2) goto L131
        Lc:
            com.alibaba.fastjson2.JSONReader$Context r2 = r15.context
            java.lang.String r3 = r2.dateFormat
            if (r3 == 0) goto L22
            boolean r3 = r2.formatyyyyMMddhhmmss19
            if (r3 != 0) goto L22
            boolean r3 = r2.formatyyyyMMddhhmmssT19
            if (r3 != 0) goto L22
            boolean r3 = r2.formatyyyyMMdd8
            if (r3 != 0) goto L22
            boolean r2 = r2.formatISO8601
            if (r2 == 0) goto L131
        L22:
            int r2 = r15.offset
            int r3 = r2 + 10
            int r4 = r0.length
            r5 = 0
            r6 = 44
            r7 = 45
            r8 = 1
            r9 = 10
            if (r3 >= r4) goto Ldd
            int r4 = r15.end
            if (r3 >= r4) goto Ldd
            int r3 = r2 + 4
            char r3 = r0[r3]
            if (r3 != r7) goto Ldd
            int r3 = r2 + 7
            char r3 = r0[r3]
            if (r3 != r7) goto Ldd
            int r3 = r2 + 10
            char r3 = r0[r3]
            if (r3 != r1) goto Ldd
            char r1 = r0[r2]
            int r3 = r2 + 1
            char r3 = r0[r3]
            int r4 = r2 + 2
            char r4 = r0[r4]
            int r7 = r2 + 3
            char r7 = r0[r7]
            int r10 = r2 + 5
            char r10 = r0[r10]
            int r11 = r2 + 6
            char r11 = r0[r11]
            int r12 = r2 + 8
            char r12 = r0[r12]
            int r2 = r2 + 9
            char r0 = r0[r2]
            r2 = 48
            if (r1 < r2) goto Ld8
            r13 = 57
            if (r1 > r13) goto Ld8
            if (r3 < r2) goto Ld8
            if (r3 > r13) goto Ld8
            if (r4 < r2) goto Ld8
            if (r4 > r13) goto Ld8
            if (r7 < r2) goto Ld8
            if (r7 > r13) goto Ld8
            int r1 = r1 - r2
            int r1 = r1 * 1000
            r14 = 100
            int r1 = p.a.z(r3, r2, r14, r1)
            int r1 = p.a.z(r4, r2, r9, r1)
            int r7 = r7 - r2
            int r7 = r7 + r1
            if (r10 < r2) goto Ld3
            if (r10 > r13) goto Ld3
            if (r11 < r2) goto Ld3
            if (r11 > r13) goto Ld3
            int r10 = r10 - r2
            int r10 = r10 * r9
            int r11 = r11 - r2
            int r11 = r11 + r10
            if (r12 < r2) goto Lce
            if (r12 > r13) goto Lce
            if (r0 < r2) goto Lce
            if (r0 > r13) goto Lce
            int r12 = r12 - r2
            int r12 = r12 * r9
            int r0 = r0 - r2
            int r0 = r0 + r12
            if (r7 != 0) goto La8
            if (r11 != 0) goto La8
            if (r0 != 0) goto La8
            r0 = 0
            goto Lac
        La8:
            java.time.LocalDate r0 = java.time.LocalDate.of(r7, r11, r0)     // Catch: java.time.DateTimeException -> Lc2
        Lac:
            int r1 = r15.offset
            int r1 = r1 + 11
            r15.offset = r1
            r15.next()
            char r1 = r15.f1814ch
            if (r1 != r6) goto Lba
            r5 = r8
        Lba:
            r15.comma = r5
            if (r5 == 0) goto Lc1
            r15.next()
        Lc1:
            return r0
        Lc2:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r15.info(r1)
            ah.a.x(r1, r0)
            r0 = 0
            return r0
        Lce:
            java.time.LocalDate r0 = super.readLocalDate()
            return r0
        Ld3:
            java.time.LocalDate r0 = super.readLocalDate()
            return r0
        Ld8:
            java.time.LocalDate r0 = super.readLocalDate()
            return r0
        Ldd:
            int r3 = r2 + 17
            int r4 = r15.end
            int r3 = java.lang.Math.min(r3, r4)
            r4 = -1
            r10 = r4
        Le7:
            if (r2 >= r3) goto Lf1
            char r11 = r0[r2]
            if (r11 != r1) goto Lee
            r10 = r2
        Lee:
            int r2 = r2 + 1
            goto Le7
        Lf1:
            if (r10 == r4) goto L131
            int r1 = r15.offset
            int r2 = r10 - r1
            if (r2 <= r9) goto L131
            int r2 = r10 + (-6)
            char r2 = r0[r2]
            if (r2 != r7) goto L131
            int r2 = r10 + (-3)
            char r2 = r0[r2]
            if (r2 != r7) goto L131
            int r2 = r10 - r1
            int r2 = r2 + (-6)
            int r1 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r1, r2)
            int r2 = r10 + (-5)
            r3 = 2
            int r2 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r2, r3)
            int r4 = r10 + (-2)
            int r0 = com.alibaba.fastjson2.util.TypeUtils.parseInt(r0, r4, r3)
            java.time.LocalDate r0 = java.time.LocalDate.of(r1, r2, r0)
            int r10 = r10 + r8
            r15.offset = r10
            r15.next()
            char r1 = r15.f1814ch
            if (r1 != r6) goto L129
            r5 = r8
        L129:
            r15.comma = r5
            if (r5 == 0) goto L130
            r15.next()
        L130:
            return r0
        L131:
            java.time.LocalDate r0 = super.readLocalDate()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate10() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
        L10:
            r0 = 0
            return r0
        L12:
            char[] r0 = r3.chars     // Catch: java.time.DateTimeException -> L38
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L38
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(r0, r1)     // Catch: java.time.DateTimeException -> L38
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 11
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
        L38:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
            goto L10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate11() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
        L12:
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 12
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
    public java.time.LocalDate readLocalDate8() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
        L10:
            r0 = 0
            return r0
        L12:
            char[] r0 = r3.chars     // Catch: java.time.DateTimeException -> L34
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L34
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(r0, r1)     // Catch: java.time.DateTimeException -> L34
            int r1 = r3.offset
            int r1 = r1 + 9
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r3.comma = r1
            if (r1 == 0) goto L33
            r3.next()
        L33:
            return r0
        L34:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
            goto L10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate9() {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r0 = "localDate only support string input"
            ah.a.w(r0)
        L10:
            r0 = 0
            return r0
        L12:
            char[] r0 = r3.chars     // Catch: java.time.DateTimeException -> L34
            int r1 = r3.offset     // Catch: java.time.DateTimeException -> L34
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(r0, r1)     // Catch: java.time.DateTimeException -> L34
            int r1 = r3.offset
            int r1 = r1 + 10
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r3.comma = r1
            if (r1 == 0) goto L33
            r3.next()
        L33:
            return r0
        L34:
            r0 = move-exception
            java.lang.String r1 = "read date error"
            java.lang.String r1 = r3.info(r1)
            ah.a.x(r1, r0)
            goto L10
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDateTime readLocalDateTime12() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 13
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
    public java.time.LocalDateTime readLocalDateTime14() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 15
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
    public java.time.LocalDateTime readLocalDateTime16() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 17
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
    public java.time.LocalDateTime readLocalDateTime17() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 18
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
    public java.time.LocalDateTime readLocalDateTime18() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(r0, r1)
            int r1 = r3.offset
            int r1 = r1 + 19
            r3.offset = r1
            r3.next()
            char r1 = r3.f1814ch
            r2 = 44
            if (r1 != r2) goto L2b
            r1 = 1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r3.comma = r1
            if (r1 == 0) goto L33
            r3.next()
        L33:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDateTime readLocalDateTime19() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 20
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
    public java.time.LocalDateTime readLocalDateTime20() {
            r3 = this;
            char r0 = r3.f1814ch
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 21
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
    public java.time.LocalDateTime readLocalDateTimeX(int r4) {
            r3 = this;
            char r0 = r3.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r4 = "date only support string input"
            ah.a.w(r4)
            r4 = 0
            return r4
        L12:
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(r0, r1, r4)
            if (r0 != 0) goto L1e
            r4 = 0
            return r4
        L1e:
            int r1 = r3.offset
            r2 = 1
            int r4 = r4 + r2
            int r4 = r4 + r1
            r3.offset = r4
            r3.next()
            char r4 = r3.f1814ch
            r1 = 44
            if (r4 != r1) goto L2f
            goto L30
        L2f:
            r2 = 0
        L30:
            r3.comma = r2
            if (r2 == 0) goto L37
            r3.next()
        L37:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalTime readLocalTime10() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 11
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
    public java.time.LocalTime readLocalTime11() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 12
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
    public java.time.LocalTime readLocalTime12() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 13
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
    public final java.time.LocalTime readLocalTime15() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime15(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 16
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
    public java.time.LocalTime readLocalTime18() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 19
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
    public java.time.LocalTime readLocalTime5() {
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
            char[] r0 = r3.chars
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
    public java.time.LocalTime readLocalTime8() {
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
            char[] r0 = r3.chars
            int r1 = r3.offset
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(r0, r1)
            if (r0 != 0) goto L1e
            r0 = 0
            return r0
        L1e:
            int r1 = r3.offset
            int r1 = r1 + 9
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
    public java.time.LocalTime readLocalTime9() {
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
            char[] r0 = r3.chars
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
    public long readMillis19() {
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
            char[] r2 = r7.chars
            com.alibaba.fastjson2.JSONReader$Context r3 = r7.context
            java.time.ZoneId r3 = r3.zoneId
            long r1 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(r2, r1, r3)
            char[] r3 = r7.chars
            int r5 = r7.offset
            int r6 = r5 + 19
            char r3 = r3[r6]
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
            char[] r0 = r14.chars
            int r1 = r14.offset
            char r2 = r0[r1]
            r3 = 97
            if (r2 != r3) goto L77
            int r2 = r1 + 1
            char r2 = r0[r2]
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
            char r2 = r0[r2]
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
            char r1 = r0[r1]
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
            char r1 = r0[r1]
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
            char r1 = r0[r1]
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
    public void readNull() {
            r14 = this;
            char[] r0 = r14.chars
            int r1 = r14.offset
            char r2 = r0[r1]
            r3 = 117(0x75, float:1.64E-43)
            if (r2 != r3) goto L7a
            int r2 = r1 + 1
            char r2 = r0[r2]
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 != r3) goto L7a
            int r2 = r1 + 2
            char r2 = r0[r2]
            if (r2 != r3) goto L7a
            int r2 = r1 + 3
            int r3 = r14.end
            r4 = 26
            if (r2 != r3) goto L22
            r2 = r4
            goto L24
        L22:
            char r2 = r0[r2]
        L24:
            int r1 = r1 + 4
        L26:
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
            if (r1 != r2) goto L40
            r2 = r4
            goto L26
        L40:
            int r2 = r1 + 1
            char r1 = r0[r1]
            r13 = r2
            r2 = r1
            r1 = r13
            goto L26
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
            if (r1 != r2) goto L5a
            r2 = r1
            r1 = r4
            goto L5e
        L5a:
            int r2 = r1 + 1
            char r1 = r0[r1]
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
            if (r1 != r2) goto L70
            r2 = r4
            goto L61
        L70:
            int r2 = r1 + 1
            char r1 = r0[r1]
            goto L5e
        L75:
            r14.f1814ch = r2
            r14.offset = r1
            return
        L7a:
            java.lang.String r0 = "json syntax error, not match null, offset "
            java.lang.String r0 = eh.a.l(r1, r0)
            ah.a.w(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.Date readNullOrNewDate() {
            r19 = this;
            r0 = r19
            char[] r1 = r0.chars
            int r2 = r0.offset
            int r3 = r2 + 2
            int r4 = r0.end
            r5 = 0
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r9 = 1
            r11 = 32
            r12 = 26
            if (r3 >= r4) goto L3a
            char r13 = r1[r2]
            r14 = 117(0x75, float:1.64E-43)
            if (r13 != r14) goto L3a
            int r13 = r2 + 1
            char r13 = r1[r13]
            r14 = 108(0x6c, float:1.51E-43)
            if (r13 != r14) goto L3a
            char r13 = r1[r3]
            if (r13 != r14) goto L3a
            int r3 = r2 + 3
            if (r3 != r4) goto L31
            r3 = r12
            goto L33
        L31:
            char r3 = r1[r3]
        L33:
            int r2 = r2 + 4
            r4 = 0
            r16 = r5
            goto Lf1
        L3a:
            int r13 = r2 + 1
            if (r13 >= r4) goto L157
            char r14 = r1[r2]
            r15 = 101(0x65, float:1.42E-43)
            if (r14 != r15) goto L157
            char r13 = r1[r13]
            r14 = 119(0x77, float:1.67E-43)
            if (r13 != r14) goto L157
            int r2 = r2 + 3
            if (r2 != r4) goto L4f
            goto L5e
        L4f:
            char r3 = r1[r3]
        L51:
            if (r3 > r11) goto L6a
            long r13 = r9 << r3
            long r13 = r13 & r7
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 == 0) goto L6a
            int r3 = r0.end
            if (r2 < r3) goto L60
        L5e:
            r3 = r12
            goto L51
        L60:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto L51
        L6a:
            int r4 = r2 + 4
            int r13 = r0.end
            java.lang.String r14 = "json syntax error, not match new Date"
            if (r4 >= r13) goto L14f
            r16 = r5
            r5 = 68
            if (r3 != r5) goto L14f
            char r3 = r1[r2]
            r5 = 97
            if (r3 != r5) goto L14f
            int r3 = r2 + 1
            char r3 = r1[r3]
            r5 = 116(0x74, float:1.63E-43)
            if (r3 != r5) goto L14f
            int r3 = r2 + 2
            char r3 = r1[r3]
            if (r3 != r15) goto L14f
            int r2 = r2 + 3
            if (r2 != r13) goto L92
        L90:
            r2 = r12
            goto L94
        L92:
            char r2 = r1[r2]
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
            char r3 = r1[r4]
            r4 = r2
            r2 = r3
            goto L94
        La9:
            r3 = 40
            if (r2 != r3) goto L147
            int r2 = r0.end
            if (r4 >= r2) goto L147
            int r2 = r4 + 1
            char r3 = r1[r4]
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
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lb5
        Lce:
            r0.f1814ch = r3
            r0.offset = r2
            long r2 = r0.readInt64Value()
            char r4 = r0.f1814ch
            int r5 = r0.offset
            r6 = 41
            if (r4 != r6) goto L13e
            int r4 = r0.end
            if (r5 != r4) goto Le5
            r4 = r5
            r5 = r12
            goto Le9
        Le5:
            int r4 = r5 + 1
            char r5 = r1[r5]
        Le9:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r2)
            r2 = r4
            r3 = r5
            r4 = r6
        Lf1:
            if (r3 > r11) goto L10a
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L10a
            int r3 = r0.end
            if (r2 != r3) goto L100
            r3 = r12
            goto Lf1
        L100:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r18 = r3
            r3 = r2
            r2 = r18
            goto Lf1
        L10a:
            r5 = 44
            if (r3 != r5) goto L110
            r5 = 1
            goto L111
        L110:
            r5 = 0
        L111:
            r0.comma = r5
            if (r5 == 0) goto L139
            int r3 = r0.end
            if (r2 != r3) goto L11c
            r3 = r2
            r2 = r12
            goto L120
        L11c:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L120:
            r18 = r3
            r3 = r2
            r2 = r18
        L125:
            if (r3 > r11) goto L139
            long r5 = r9 << r3
            long r5 = r5 & r7
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L139
            int r3 = r0.end
            if (r2 != r3) goto L134
            r3 = r12
            goto L125
        L134:
            int r3 = r2 + 1
            char r2 = r1[r2]
            goto L120
        L139:
            r0.f1814ch = r3
            r0.offset = r2
            return r4
        L13e:
            java.lang.String r1 = eh.a.l(r5, r14)
            ah.a.w(r1)
        L145:
            r1 = 0
            return r1
        L147:
            java.lang.String r1 = eh.a.l(r4, r14)
            ah.a.w(r1)
            goto L145
        L14f:
            java.lang.String r1 = eh.a.l(r2, r14)
            ah.a.w(r1)
            goto L145
        L157:
            java.lang.String r1 = "json syntax error, not match null or new Date"
            java.lang.String r1 = eh.a.l(r2, r1)
            ah.a.w(r1)
            goto L145
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readNumber0() {
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
            char[] r3 = r0.chars
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
            goto L72
        L39:
            int r6 = r2 + 1
            char r9 = r3[r2]
            if (r9 != r4) goto L6b
            if (r6 != r5) goto L44
        L41:
            r1 = r16
            goto L48
        L44:
            int r2 = r2 + r15
            char r1 = r3[r6]
            r6 = r2
        L48:
            if (r1 > r14) goto L5c
            long r19 = r12 << r1
            long r19 = r19 & r10
            int r2 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r2 == 0) goto L5c
            if (r6 != r5) goto L55
            goto L41
        L55:
            int r1 = r6 + 1
            char r2 = r3[r6]
            r6 = r1
            r1 = r2
            goto L48
        L5c:
            r0.f1814ch = r1
            r0.offset = r6
            boolean r1 = r0.nextIfComma()
            r0.comma = r1
            r0.wasNull = r8
            r0.valueType = r7
            return
        L6b:
            r19 = r6
            r6 = r4
            r4 = r9
            r9 = r19
            goto L36
        L72:
            r10 = 43
            r11 = 45
            r21 = r12
            java.lang.String r12 = "illegal input"
            if (r4 != r11) goto L8d
            if (r9 == r5) goto L85
            r0.negative = r8
            int r4 = r9 + 1
            char r13 = r3[r9]
            goto La9
        L85:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        L8d:
            if (r4 != r10) goto La3
            if (r9 == r5) goto L9b
            int r4 = r9 + 1
            char r13 = r3[r9]
            r27 = r13
            r13 = r4
            r4 = r27
            goto La4
        L9b:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        La3:
            r13 = r9
        La4:
            r27 = r13
            r13 = r4
            r4 = r27
        La9:
            r0.valueType = r8
            r23 = r1
            r24 = r23
        Laf:
            r14 = 57
            r25 = 10
            r1 = 48
            r7 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            if (r13 < r1) goto Lea
            if (r13 > r14) goto Lea
            if (r23 != 0) goto Ld3
            int r13 = r13 + (-48)
            r26 = r8
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto Lcd
        Lca:
            r23 = r26
            goto Ld5
        Lcd:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto Ld5
            goto Lca
        Ld3:
            r26 = r8
        Ld5:
            if (r4 != r5) goto Lde
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto Lec
        Lde:
            int r1 = r4 + 1
            char r13 = r3[r4]
            r4 = r1
            r8 = r26
            r24 = r8
            r1 = 0
            r7 = 5
            goto Laf
        Lea:
            r26 = r8
        Lec:
            r8 = 46
            if (r13 != r8) goto L132
            r0.valueType = r15
            if (r4 == r5) goto L12a
            int r8 = r4 + 1
            char r4 = r3[r4]
            r13 = r4
        Lf9:
            r4 = r8
            if (r13 < r1) goto L132
            if (r13 > r14) goto L132
            if (r23 != 0) goto L113
            int r13 = r13 + (-48)
            int r8 = r0.mag3
            int r8 = r8 * 10
            r0.mag3 = r8
            if (r8 >= r7) goto L10d
        L10a:
            r23 = r26
            goto L113
        L10d:
            int r8 = r8 - r13
            r0.mag3 = r8
            if (r8 >= r7) goto L113
            goto L10a
        L113:
            short r8 = r0.scale
            int r8 = r8 + 1
            short r8 = (short) r8
            r0.scale = r8
            if (r4 != r5) goto L123
            int r4 = r4 + 1
            r13 = r16
            r24 = r26
            goto L132
        L123:
            int r8 = r4 + 1
            char r13 = r3[r4]
            r24 = r26
            goto Lf9
        L12a:
            java.lang.String r1 = r0.info(r12)
            ah.a.w(r1)
            return
        L132:
            if (r23 == 0) goto L164
            boolean r7 = r0.negative
            if (r7 == 0) goto L13a
            r8 = r9
            goto L13c
        L13a:
            int r8 = r9 + (-1)
        L13c:
            short r12 = r0.scale
            if (r12 <= 0) goto L144
            int r12 = r4 + (-2)
        L142:
            int r12 = r12 - r8
            goto L147
        L144:
            int r12 = r4 + (-1)
            goto L142
        L147:
            r15 = 38
            if (r12 <= r15) goto L15e
            r12 = 8
            r0.valueType = r12
            if (r7 == 0) goto L153
            int r8 = r8 + (-1)
        L153:
            java.lang.String r7 = new java.lang.String
            int r12 = r4 + (-1)
            int r12 = r12 - r8
            r7.<init>(r3, r8, r12)
            r0.stringValue = r7
            goto L169
        L15e:
            int r7 = r4 + (-1)
            r0.bigInt(r3, r8, r7)
            goto L169
        L164:
            int r7 = r0.mag3
            int r7 = -r7
            r0.mag3 = r7
        L169:
            r7 = 101(0x65, float:1.42E-43)
            if (r13 == r7) goto L171
            r8 = 69
            if (r13 != r8) goto L1b9
        L171:
            int r8 = r4 + 1
            char r12 = r3[r4]
            if (r12 != r11) goto L17f
            int r4 = r4 + 2
            char r12 = r3[r8]
            r8 = r26
        L17d:
            r10 = 0
            goto L189
        L17f:
            if (r12 != r10) goto L187
            int r4 = r4 + 2
            char r12 = r3[r8]
        L185:
            r8 = 0
            goto L17d
        L187:
            r4 = r8
            goto L185
        L189:
            if (r12 < r1) goto L1af
            if (r12 > r14) goto L1af
            int r12 = r12 + (-48)
            int r10 = r10 * 10
            int r10 = r10 + r12
            r11 = 2047(0x7ff, float:2.868E-42)
            if (r10 > r11) goto L1a5
            if (r4 != r5) goto L19d
            r13 = r16
            r24 = r26
            goto L1b0
        L19d:
            int r11 = r4 + 1
            char r12 = r3[r4]
            r4 = r11
            r24 = r26
            goto L189
        L1a5:
            java.lang.String r1 = "too large exp value : "
            java.lang.String r1 = eh.a.l(r10, r1)
            ah.a.w(r1)
            return
        L1af:
            r13 = r12
        L1b0:
            if (r8 == 0) goto L1b3
            int r10 = -r10
        L1b3:
            short r1 = (short) r10
            r0.exponent = r1
            r1 = 2
            r0.valueType = r1
        L1b9:
            if (r4 != r9) goto L298
            r1 = 110(0x6e, float:1.54E-43)
            r8 = 117(0x75, float:1.64E-43)
            r10 = 108(0x6c, float:1.51E-43)
            if (r13 != r1) goto L1f1
            char r1 = r3[r4]
            if (r1 != r8) goto L1ed
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r10) goto L1ed
            int r1 = r4 + 2
            char r1 = r3[r1]
            if (r1 != r10) goto L1ed
            int r1 = r4 + 3
            r7 = r26
            r0.wasNull = r7
            r7 = 5
            r0.valueType = r7
            if (r1 != r5) goto L1e2
            r4 = r1
            r13 = r16
            goto L1e7
        L1e2:
            int r4 = r4 + 4
            char r1 = r3[r1]
            r13 = r1
        L1e7:
            r7 = 0
            r8 = 1
            r24 = 1
            goto L29b
        L1ed:
            r7 = 0
            r8 = 1
            goto L29b
        L1f1:
            r1 = 116(0x74, float:1.63E-43)
            r11 = 4
            if (r13 != r1) goto L21f
            char r1 = r3[r4]
            r12 = 114(0x72, float:1.6E-43)
            if (r1 != r12) goto L21f
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r8) goto L21f
            int r1 = r4 + 2
            char r1 = r3[r1]
            if (r1 != r7) goto L21f
            int r1 = r4 + 3
            r8 = 1
            r0.boolValue = r8
            r0.valueType = r11
            if (r1 != r5) goto L215
            r4 = r1
            r13 = r16
            goto L21a
        L215:
            int r4 = r4 + 4
            char r1 = r3[r1]
            r13 = r1
        L21a:
            r24 = r8
        L21c:
            r7 = 0
            goto L29b
        L21f:
            r8 = 1
            r1 = 102(0x66, float:1.43E-43)
            r12 = 97
            if (r13 != r1) goto L253
            char r1 = r3[r4]
            if (r1 != r12) goto L253
            int r1 = r4 + 1
            char r1 = r3[r1]
            if (r1 != r10) goto L253
            int r1 = r4 + 2
            char r1 = r3[r1]
            r10 = 115(0x73, float:1.61E-43)
            if (r1 != r10) goto L253
            int r1 = r4 + 3
            char r1 = r3[r1]
            if (r1 != r7) goto L253
            int r1 = r4 + 4
            r7 = 0
            r0.boolValue = r7
            r0.valueType = r11
            if (r1 != r5) goto L24b
        L247:
            r4 = r1
            r13 = r16
            goto L250
        L24b:
            int r4 = r4 + 5
            char r1 = r3[r1]
        L24f:
            r13 = r1
        L250:
            r24 = r8
            goto L29b
        L253:
            r7 = 0
            r1 = 78
            if (r13 != r1) goto L270
            char r10 = r3[r4]
            if (r10 != r12) goto L270
            int r10 = r4 + 1
            char r10 = r3[r10]
            if (r10 != r1) goto L270
            int r1 = r4 + 2
            r10 = 14
            r0.valueType = r10
            if (r1 != r5) goto L26b
            goto L247
        L26b:
            int r4 = r4 + 3
            char r1 = r3[r1]
            goto L24f
        L270:
            r1 = 123(0x7b, float:1.72E-43)
            if (r13 != r1) goto L284
            if (r6 != 0) goto L284
            r0.offset = r4
            r0.f1814ch = r13
            java.util.Map r1 = r0.readObject()
            r0.complex = r1
            r1 = 6
            r0.valueType = r1
            return
        L284:
            r1 = 91
            if (r13 != r1) goto L29b
            if (r6 != 0) goto L29b
            r0.offset = r4
            r0.f1814ch = r13
            java.util.List r1 = r0.readArray()
            r0.complex = r1
            r1 = 7
            r0.valueType = r1
            return
        L298:
            r8 = r26
            goto L21c
        L29b:
            if (r6 == 0) goto L2b5
            if (r13 == r6) goto L2aa
            r0.offset = r2
            r0.f1814ch = r6
            r0.readString0()
            r1 = 3
            r0.valueType = r1
            return
        L2aa:
            if (r4 != r5) goto L2af
            r13 = r16
            goto L2b5
        L2af:
            int r1 = r4 + 1
            char r2 = r3[r4]
            r4 = r1
            r13 = r2
        L2b5:
            r1 = 76
            if (r13 == r1) goto L2cd
            r1 = 70
            if (r13 == r1) goto L2cd
            r1 = 68
            if (r13 == r1) goto L2cd
            r1 = 66
            if (r13 == r1) goto L2cd
            r1 = 83
            if (r13 != r1) goto L2ca
            goto L2cd
        L2ca:
            r1 = 32
            goto L31f
        L2cd:
            r1 = 66
            if (r13 == r1) goto L308
            r1 = 68
            if (r13 == r1) goto L303
            r1 = 70
            if (r13 == r1) goto L2fe
            r1 = 76
            if (r13 == r1) goto L2ee
            r1 = 83
            if (r13 == r1) goto L2e2
            goto L313
        L2e2:
            if (r23 != 0) goto L313
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L313
            r1 = r25
            r0.valueType = r1
            goto L313
        L2ee:
            r2 = 2
            int r1 = r4 - r9
            r6 = 19
            if (r1 >= r6) goto L313
            byte r1 = r0.valueType
            if (r1 == r2) goto L313
            r1 = 11
            r0.valueType = r1
            goto L313
        L2fe:
            r1 = 12
            r0.valueType = r1
            goto L313
        L303:
            r1 = 13
            r0.valueType = r1
            goto L313
        L308:
            if (r23 != 0) goto L313
            byte r1 = r0.valueType
            r2 = 2
            if (r1 == r2) goto L313
            r1 = 9
            r0.valueType = r1
        L313:
            if (r4 != r5) goto L318
        L315:
            r13 = r16
            goto L2ca
        L318:
            int r1 = r4 + 1
            char r2 = r3[r4]
        L31c:
            r4 = r1
            r13 = r2
            goto L2ca
        L31f:
            if (r13 > r1) goto L331
            long r1 = r21 << r13
            long r1 = r1 & r19
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L331
            if (r4 != r5) goto L32c
            goto L315
        L32c:
            int r1 = r4 + 1
            char r2 = r3[r4]
            goto L31c
        L331:
            r1 = 44
            if (r13 != r1) goto L337
            r1 = r8
            goto L338
        L337:
            r1 = r7
        L338:
            r0.comma = r1
            if (r1 == 0) goto L35f
            if (r4 != r5) goto L341
            r2 = r16
            goto L346
        L341:
            int r1 = r4 + 1
            char r2 = r3[r4]
            r4 = r1
        L346:
            r13 = r2
            r1 = 32
        L349:
            if (r13 > r1) goto L35f
            long r6 = r21 << r13
            long r6 = r6 & r19
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L35f
            if (r4 != r5) goto L358
            r13 = r16
            goto L349
        L358:
            int r2 = r4 + 1
            char r4 = r3[r4]
            r13 = r4
            r4 = r2
            goto L349
        L35f:
            if (r24 == 0) goto L366
            r0.offset = r4
            r0.f1814ch = r13
            return
        L366:
            java.lang.String r1 = "illegal input error"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetDateTime readOffsetDateTime() {
            r28 = this;
            r0 = r28
            char[] r1 = r0.chars
            int r2 = r0.offset
            int r3 = r0.end
            char r4 = r0.f1814ch
            r5 = 0
            r6 = 34
            if (r4 == r6) goto L18
            r7 = 39
            if (r4 != r7) goto L14
            goto L18
        L14:
            r18 = r5
            goto L135
        L18:
            com.alibaba.fastjson2.JSONReader$Context r7 = r0.context
            boolean r7 = r7.formatComplex
            if (r7 != 0) goto L14
            int r7 = r2 + 19
            int r8 = r1.length
            if (r7 >= r8) goto L14
            if (r7 >= r3) goto L14
            int r8 = r2 + 4
            char r8 = r1[r8]
            r9 = 45
            if (r8 != r9) goto L14
            int r8 = r2 + 7
            char r8 = r1[r8]
            if (r8 != r9) goto L14
            int r8 = r2 + 10
            char r8 = r1[r8]
            r9 = 32
            if (r8 == r9) goto L3f
            r10 = 84
            if (r8 != r10) goto L14
        L3f:
            int r8 = r2 + 13
            char r8 = r1[r8]
            r10 = 58
            if (r8 != r10) goto L14
            int r8 = r2 + 16
            char r8 = r1[r8]
            if (r8 != r10) goto L14
            int r11 = com.alibaba.fastjson2.util.IOUtils.digit4(r1, r2)
            int r8 = r2 + 5
            int r12 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 8
            int r13 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 11
            int r14 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 14
            int r15 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            int r8 = r2 + 17
            int r16 = com.alibaba.fastjson2.util.IOUtils.digit2(r1, r8)
            r8 = r11 | r12
            r8 = r8 | r13
            r8 = r8 | r15
            r8 = r8 | r16
            if (r8 >= 0) goto L83
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L7e
            return r5
        L7e:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
        L83:
            int r8 = r2 + 20
            char r7 = r1[r7]
            r10 = 46
            r17 = 0
            if (r7 != r10) goto L92
            int r2 = r2 + 21
            char r7 = r1[r8]
            r8 = r2
        L92:
            r18 = r5
            r2 = r17
            r10 = r2
        L97:
            r5 = 48
            if (r7 < r5) goto Lae
            r5 = 57
            if (r7 > r5) goto Lae
            int r2 = r2 * 10
            int r5 = r7 + (-48)
            int r2 = r2 + r5
            int r10 = r10 + 1
            if (r8 >= r3) goto Lae
            int r5 = r8 + 1
            char r7 = r1[r8]
            r8 = r5
            goto L97
        Lae:
            if (r10 == 0) goto Lb4
            int r2 = com.alibaba.fastjson2.util.DateUtils.nanos(r2, r10)
        Lb4:
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC
            r10 = 90
            r19 = 1
            if (r7 != r10) goto Lc2
            int r6 = r8 + 1
            char r7 = r1[r8]
            r8 = r6
            goto Ld8
        Lc2:
            if (r7 == r4) goto Ld8
            int r6 = com.alibaba.fastjson2.util.IOUtils.indexOfChar(r1, r6, r8, r3)
            r10 = -1
            if (r6 == r10) goto Ld8
            int r5 = r8 + (-1)
            int r7 = r6 - r8
            int r7 = r7 + 1
            java.time.ZoneOffset r5 = com.alibaba.fastjson2.util.DateUtils.zoneOffset(r1, r5, r7)
            int r8 = r6 + 1
            r7 = r4
        Ld8:
            if (r7 != r4) goto L135
            r4 = 26
            if (r8 < r3) goto Le0
        Lde:
            r7 = r4
            goto Le5
        Le0:
            int r6 = r8 + 1
            char r7 = r1[r8]
        Le4:
            r8 = r6
        Le5:
            r20 = 0
            r22 = 4294981377(0x100003701, double:2.122002748E-314)
            r24 = 1
            if (r7 > r9) goto L100
            long r26 = r24 << r7
            long r26 = r26 & r22
            int r6 = (r26 > r20 ? 1 : (r26 == r20 ? 0 : -1))
            if (r6 == 0) goto L100
            if (r8 != r3) goto Lfb
            goto Lde
        Lfb:
            int r6 = r8 + 1
            char r7 = r1[r8]
            goto Le4
        L100:
            r6 = 44
            if (r7 != r6) goto L107
            r6 = r19
            goto L109
        L107:
            r6 = r17
        L109:
            r0.comma = r6
            if (r6 == 0) goto L128
            if (r8 != r3) goto L111
        L10f:
            r7 = r4
            goto L116
        L111:
            int r6 = r8 + 1
            char r7 = r1[r8]
        L115:
            r8 = r6
        L116:
            if (r7 > r9) goto L128
            long r17 = r24 << r7
            long r17 = r17 & r22
            int r6 = (r17 > r20 ? 1 : (r17 == r20 ? 0 : -1))
            if (r6 == 0) goto L128
            if (r8 != r3) goto L123
            goto L10f
        L123:
            int r6 = r8 + 1
            char r7 = r1[r8]
            goto L115
        L128:
            r0.offset = r8
            r0.f1814ch = r7
            r17 = r2
            r18 = r5
            java.time.OffsetDateTime r1 = java.time.OffsetDateTime.of(r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        L135:
            java.time.ZonedDateTime r1 = r0.readZonedDateTime()
            if (r1 != 0) goto L13c
            return r18
        L13c:
            java.time.OffsetDateTime r1 = r1.toOffsetDateTime()
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.OffsetTime readOffsetTime() {
            r15 = this;
            char[] r0 = r15.chars
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
            char r4 = r0[r4]
            r6 = 58
            if (r4 != r6) goto Lf1
            int r4 = r1 + 5
            char r4 = r0[r4]
            if (r4 != r6) goto Lf1
            char r4 = r0[r1]
            int r6 = r1 + 1
            char r6 = r0[r6]
            int r7 = r1 + 3
            char r7 = r0[r7]
            int r8 = r1 + 4
            char r8 = r0[r8]
            int r9 = r1 + 6
            char r9 = r0[r9]
            int r10 = r1 + 7
            char r10 = r0[r10]
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
            char r13 = r0[r7]
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
    public java.lang.String readPattern() {
            r15 = this;
            char r0 = r15.f1814ch
            r1 = 47
            if (r0 != r1) goto L80
            char[] r0 = r15.chars
            int r2 = r15.offset
            r3 = r2
        Lb:
            int r4 = r15.end
            if (r3 >= r4) goto L17
            char r4 = r0[r3]
            if (r4 != r1) goto L14
            goto L17
        L14:
            int r3 = r3 + 1
            goto Lb
        L17:
            java.lang.String r1 = new java.lang.String
            int r4 = r3 - r2
            r1.<init>(r0, r2, r4)
            int r2 = r3 + 1
            int r4 = r15.end
            r5 = 26
            if (r2 != r4) goto L29
            r3 = r2
        L27:
            r2 = r5
            goto L2d
        L29:
            int r3 = r3 + 2
            char r2 = r0[r2]
        L2d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r10 = 1
            r4 = 32
            if (r2 > r4) goto L4e
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L4e
            int r2 = r15.end
            if (r3 != r2) goto L46
            goto L27
        L46:
            int r2 = r3 + 1
            char r3 = r0[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L2d
        L4e:
            r12 = 44
            if (r2 != r12) goto L54
            r12 = 1
            goto L55
        L54:
            r12 = 0
        L55:
            r15.comma = r12
            if (r12 == 0) goto L7b
            int r2 = r15.end
            if (r3 != r2) goto L60
            r2 = r3
            r3 = r5
            goto L64
        L60:
            int r2 = r3 + 1
            char r3 = r0[r3]
        L64:
            r14 = r3
            r3 = r2
            r2 = r14
        L67:
            if (r2 > r4) goto L7b
            long r12 = r10 << r2
            long r12 = r12 & r8
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r2 = r15.end
            if (r3 != r2) goto L76
            r2 = r5
            goto L67
        L76:
            int r2 = r3 + 1
            char r3 = r0[r3]
            goto L64
        L7b:
            r15.offset = r3
            r15.f1814ch = r2
            return r1
        L80:
            java.lang.String r0 = "illegal pattern"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readReference() {
            r15 = this;
            int r0 = r15.referenceBegin
            int r1 = r15.end
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            char[] r1 = r15.chars
            int r2 = r0 + 1
            r15.offset = r2
            char r0 = r1[r0]
            r15.f1814ch = r0
            java.lang.String r0 = r15.readString()
            char r2 = r15.f1814ch
            int r3 = r15.offset
        L1a:
            r4 = 0
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            r8 = 1
            r10 = 32
            r11 = 26
            if (r2 > r10) goto L3e
            long r12 = r8 << r2
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L3e
            int r2 = r15.end
            if (r3 != r2) goto L36
            r2 = r11
            goto L1a
        L36:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L1a
        L3e:
            r12 = 125(0x7d, float:1.75E-43)
            if (r2 != r12) goto L95
            int r2 = r15.end
            if (r3 != r2) goto L49
            r2 = r3
        L47:
            r3 = r11
            goto L4d
        L49:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L4d:
            if (r3 > r10) goto L63
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L63
            int r3 = r15.end
            if (r2 != r3) goto L5b
            goto L47
        L5b:
            int r3 = r2 + 1
            char r2 = r1[r2]
            r14 = r3
            r3 = r2
            r2 = r14
            goto L4d
        L63:
            r12 = 44
            if (r3 != r12) goto L69
            r12 = 1
            goto L6a
        L69:
            r12 = 0
        L6a:
            r15.comma = r12
            if (r12 == 0) goto L90
            int r3 = r15.end
            if (r2 != r3) goto L75
            r3 = r2
            r2 = r11
            goto L79
        L75:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L79:
            r14 = r3
            r3 = r2
            r2 = r14
        L7c:
            if (r3 > r10) goto L90
            long r12 = r8 << r3
            long r12 = r12 & r6
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 == 0) goto L90
            int r3 = r15.end
            if (r2 != r3) goto L8b
            r3 = r11
            goto L7c
        L8b:
            int r3 = r2 + 1
            char r2 = r1[r2]
            goto L79
        L90:
            r15.f1814ch = r3
            r15.offset = r2
            return r0
        L95:
            java.lang.String r1 = "illegal reference : "
            java.lang.String r0 = r1.concat(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
            r19 = this;
            r0 = r19
            char[] r1 = r0.chars
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
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L1a:
            int r9 = r0.end
            if (r6 >= r9) goto L153
            char r9 = r1[r6]
            r10 = 120(0x78, float:1.68E-43)
            r11 = 117(0x75, float:1.64E-43)
            r12 = 92
            r13 = 1
            if (r9 != r12) goto L3c
            int r8 = r6 + 1
            char r9 = r1[r8]
            if (r9 == r11) goto L35
            if (r9 == r10) goto L32
            goto L37
        L32:
            int r8 = r6 + 3
            goto L37
        L35:
            int r8 = r6 + 5
        L37:
            int r8 = r8 + r13
            r6 = r8
            r8 = r13
            goto L14f
        L3c:
            if (r9 != r2) goto L14d
            if (r8 == 0) goto Lb3
            char[] r7 = new char[r7]
            r6 = r5
        L43:
            char r8 = r1[r4]
            if (r8 != r12) goto La5
            int r8 = r4 + 1
            char r9 = r1[r8]
            if (r9 == r3) goto La2
            if (r9 == r12) goto La2
            r14 = 98
            if (r9 == r14) goto L9f
            r14 = 102(0x66, float:1.43E-43)
            if (r9 == r14) goto L9c
            r14 = 110(0x6e, float:1.54E-43)
            if (r9 == r14) goto L99
            r14 = 114(0x72, float:1.6E-43)
            if (r9 == r14) goto L96
            if (r9 == r10) goto L89
            r14 = 116(0x74, float:1.63E-43)
            if (r9 == r14) goto L86
            if (r9 == r11) goto L71
            char r4 = r0.char1(r9)
        L6b:
            r18 = r8
            r8 = r4
            r4 = r18
            goto Lae
        L71:
            int r8 = r4 + 2
            char r8 = r1[r8]
            int r9 = r4 + 3
            char r9 = r1[r9]
            int r14 = r4 + 4
            char r14 = r1[r14]
            int r4 = r4 + 5
            char r15 = r1[r4]
            char r8 = com.alibaba.fastjson2.JSONReader.char4(r8, r9, r14, r15)
            goto Lae
        L86:
            r4 = 9
            goto L6b
        L89:
            int r8 = r4 + 2
            char r8 = r1[r8]
            int r4 = r4 + 3
            char r9 = r1[r4]
            char r8 = com.alibaba.fastjson2.JSONReader.char2(r8, r9)
            goto Lae
        L96:
            r4 = 13
            goto L6b
        L99:
            r4 = 10
            goto L6b
        L9c:
            r4 = 12
            goto L6b
        L9f:
            r4 = 8
            goto L6b
        La2:
            r4 = r8
            r8 = r9
            goto Lae
        La5:
            if (r8 != r2) goto Lae
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7)
            r6 = r4
            goto Lc5
        Lae:
            r7[r6] = r8
            int r4 = r4 + r13
            int r6 = r6 + r13
            goto L43
        Lb3:
            java.lang.String r2 = r0.str
            int r3 = r0.offset
            if (r2 == 0) goto Lbe
            java.lang.String r2 = r2.substring(r3, r6)
            goto Lc5
        Lbe:
            java.lang.String r2 = new java.lang.String
            int r4 = r6 - r3
            r2.<init>(r1, r3, r4)
        Lc5:
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r7 = r7.mask
            long r3 = r3 & r7
            r7 = 0
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto Ld8
            java.lang.String r2 = r2.trim()
        Ld8:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lec
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r9 = r9.mask
            long r3 = r3 & r9
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 == 0) goto Lec
            r2 = 0
        Lec:
            int r3 = r6 + 1
            int r4 = r0.end
            r9 = 26
            if (r3 == r4) goto L146
            int r6 = r6 + 2
            char r3 = r1[r3]
        Lf8:
            r10 = 4294981377(0x100003701, double:2.122002748E-314)
            r14 = 1
            r4 = 32
            if (r3 > r4) goto L118
            long r16 = r14 << r3
            long r16 = r16 & r10
            int r12 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r12 == 0) goto L118
            int r3 = r0.end
            if (r6 != r3) goto L111
            r3 = r6
            goto L146
        L111:
            int r3 = r6 + 1
            char r4 = r1[r6]
            r6 = r3
            r3 = r4
            goto Lf8
        L118:
            r12 = 44
            if (r3 != r12) goto L11d
            r5 = r13
        L11d:
            r0.comma = r5
            if (r5 == 0) goto L140
            int r3 = r0.end
            if (r6 != r3) goto L126
            goto L141
        L126:
            int r3 = r6 + 1
            char r5 = r1[r6]
        L12a:
            r6 = r3
            if (r5 > r4) goto L13e
            long r12 = r14 << r5
            long r12 = r12 & r10
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 == 0) goto L13e
            int r3 = r0.end
            if (r6 != r3) goto L139
            goto L141
        L139:
            int r3 = r6 + 1
            char r5 = r1[r6]
            goto L12a
        L13e:
            r9 = r5
            goto L141
        L140:
            r9 = r3
        L141:
            r0.f1814ch = r9
            r0.offset = r6
            return r2
        L146:
            r0.f1814ch = r9
            r0.comma = r5
            r0.offset = r3
            return r2
        L14d:
            int r6 = r6 + 1
        L14f:
            int r7 = r7 + 1
            goto L1a
        L153:
            java.lang.String r1 = "invalid escape character EOI"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            r1 = 0
            return r1
    }

    public void readString0() {
            r17 = this;
            r0 = r17
            char r1 = r0.f1814ch
            int r2 = r0.offset
            r3 = 0
            r0.valueEscape = r3
            r4 = r2
            r5 = r3
        Lb:
            char[] r6 = r0.chars
            char r7 = r6[r4]
            r8 = 120(0x78, float:1.68E-43)
            r9 = 117(0x75, float:1.64E-43)
            r10 = 92
            r11 = 1
            if (r7 != r10) goto L2c
            r0.valueEscape = r11
            int r7 = r4 + 1
            char r6 = r6[r7]
            if (r6 == r9) goto L26
            if (r6 == r8) goto L23
            goto L28
        L23:
            int r7 = r4 + 3
            goto L28
        L26:
            int r7 = r4 + 5
        L28:
            int r7 = r7 + r11
            r4 = r7
            goto Lf7
        L2c:
            if (r7 != r1) goto Lf5
            boolean r1 = r0.valueEscape
            if (r1 == 0) goto L87
            char[] r1 = new char[r5]
            r4 = r3
        L35:
            char[] r5 = r0.chars
            char r6 = r5[r2]
            r7 = 34
            if (r6 != r10) goto L78
            int r6 = r2 + 1
            char r12 = r5[r6]
            if (r12 == r7) goto L75
            if (r12 == r10) goto L75
            if (r12 == r9) goto L60
            if (r12 == r8) goto L53
            char r2 = r0.char1(r12)
            r16 = r6
            r6 = r2
            r2 = r16
            goto L82
        L53:
            int r6 = r2 + 2
            char r6 = r5[r6]
            int r2 = r2 + 3
            char r5 = r5[r2]
            char r6 = com.alibaba.fastjson2.JSONReader.char2(r6, r5)
            goto L82
        L60:
            int r6 = r2 + 2
            char r6 = r5[r6]
            int r7 = r2 + 3
            char r7 = r5[r7]
            int r12 = r2 + 4
            char r12 = r5[r12]
            int r2 = r2 + 5
            char r5 = r5[r2]
            char r6 = com.alibaba.fastjson2.JSONReader.char4(r6, r7, r12, r5)
            goto L82
        L75:
            r2 = r6
            r6 = r12
            goto L82
        L78:
            if (r6 != r7) goto L82
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            r1 = r4
            r4 = r2
            goto L90
        L82:
            r1[r4] = r6
            int r2 = r2 + r11
            int r4 = r4 + r11
            goto L35
        L87:
            java.lang.String r1 = new java.lang.String
            int r2 = r0.offset
            int r5 = r4 - r2
            r1.<init>(r6, r2, r5)
        L90:
            int r4 = r4 + r11
            int r2 = r0.end
            r5 = 26
            if (r4 != r2) goto L99
            r2 = r5
            goto L9d
        L99:
            char[] r2 = r0.chars
            char r2 = r2[r4]
        L9d:
            r6 = 0
            r8 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r10 = 32
            if (r2 > r10) goto Lb8
            long r14 = r12 << r2
            long r14 = r14 & r8
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 == 0) goto Lb8
            char[] r2 = r0.chars
            int r4 = r4 + 1
            char r2 = r2[r4]
            goto L9d
        Lb8:
            r14 = 44
            if (r2 != r14) goto Lbd
            r3 = r11
        Lbd:
            r0.comma = r3
            if (r3 == 0) goto Lec
            int r2 = r4 + 1
            char[] r3 = r0.chars
            int r4 = r4 + 2
            r0.offset = r4
            char r2 = r3[r2]
            r0.f1814ch = r2
        Lcd:
            char r2 = r0.f1814ch
            if (r2 > r10) goto Lf2
            long r2 = r12 << r2
            long r2 = r2 & r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto Lf2
            int r2 = r0.offset
            int r3 = r0.end
            if (r2 < r3) goto Le1
            r0.f1814ch = r5
            goto Lcd
        Le1:
            char[] r3 = r0.chars
            int r4 = r2 + 1
            r0.offset = r4
            char r2 = r3[r2]
            r0.f1814ch = r2
            goto Lcd
        Lec:
            int r4 = r4 + r11
            r0.offset = r4
            char r2 = (char) r2
            r0.f1814ch = r2
        Lf2:
            r0.stringValue = r1
            return
        Lf5:
            int r4 = r4 + 1
        Lf7:
            int r5 = r5 + 1
            goto Lb
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.UUID readUUID() {
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
            char[] r2 = r0.chars
            int r4 = r0.offset
            int r5 = r4 + 36
            int r6 = r2.length
            r7 = 32
            r8 = 0
            r9 = 0
            r11 = 4
            if (r5 >= r6) goto Lc0
            char r5 = r2[r5]
            if (r5 != r1) goto Lc0
            int r5 = r4 + 8
            char r5 = r2[r5]
            r6 = 45
            if (r5 != r6) goto Lc0
            int r5 = r4 + 13
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 18
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            int r5 = r4 + 23
            char r5 = r2[r5]
            if (r5 != r6) goto Lc0
            r1 = r8
            r5 = r9
        L50:
            r3 = 8
            if (r1 >= r3) goto L64
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
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
            char r12 = r2[r12]
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
            char r12 = r2[r12]
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
            char r14 = r2[r14]
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
            char r14 = r2[r14]
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
            if (r5 >= r6) goto L137
            char r5 = r2[r5]
            if (r5 != r1) goto L137
            r1 = r8
            r5 = r9
        Lcb:
            r3 = 16
            if (r1 >= r3) goto Ldf
            long r5 = r5 << r11
            byte[] r3 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r12 = r4 + r1
            char r12 = r2[r12]
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
            char r14 = r2[r14]
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
            char r4 = r2[r4]
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
            char r1 = r2[r1]
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
            goto L131
        L12f:
            r0.f1814ch = r4
        L131:
            java.util.UUID r1 = new java.util.UUID
            r1.<init>(r5, r12)
            return r1
        L137:
            java.lang.String r1 = r0.readString()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L142
            return r3
        L142:
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
            r22 = this;
            r0 = r22
            char r1 = r0.f1814ch
            r2 = 34
            if (r1 == r2) goto Lf
            r3 = 39
            if (r1 == r3) goto Lf
            r1 = -1
            return r1
        Lf:
            char[] r3 = r0.chars
            r4 = 0
            r0.nameEscape = r4
            int r5 = r0.offset
            r0.nameBegin = r5
            int r6 = r0.end
            r9 = r4
            r10 = 0
        L1d:
            r12 = 120(0x78, float:1.68E-43)
            r13 = 117(0x75, float:1.64E-43)
            r14 = 92
            r4 = 1
            r16 = 0
            if (r5 >= r6) goto L32
            char r7 = r3[r5]
            if (r7 != r1) goto L3d
            if (r9 != 0) goto L36
            int r5 = r0.nameBegin
            r10 = r16
        L32:
            r19 = 32
            goto Ldb
        L36:
            r0.nameLength = r9
            r0.nameEnd = r5
            int r5 = r5 + 1
            goto L32
        L3d:
            if (r7 != r14) goto L52
            r0.nameEscape = r4
            int r7 = r5 + 1
            char r8 = r3[r7]
            if (r8 == r13) goto L62
            if (r8 == r12) goto L55
            char r5 = r0.char1(r8)
            r19 = r7
            r7 = r5
            r5 = r19
        L52:
            r19 = 32
            goto L78
        L55:
            int r7 = r5 + 2
            char r7 = r3[r7]
            int r5 = r5 + 3
            char r8 = r3[r5]
            char r7 = com.alibaba.fastjson2.JSONReader.char2(r7, r8)
            goto L52
        L62:
            int r7 = r5 + 2
            char r7 = r3[r7]
            int r8 = r5 + 3
            char r8 = r3[r8]
            int r18 = r5 + 4
            r19 = 32
            char r15 = r3[r18]
            int r5 = r5 + 5
            char r2 = r3[r5]
            char r7 = com.alibaba.fastjson2.JSONReader.char4(r7, r8, r15, r2)
        L78:
            r2 = 255(0xff, float:3.57E-43)
            if (r7 > r2) goto Ld7
            r2 = 8
            if (r9 >= r2) goto Ld7
            if (r9 != 0) goto L85
            if (r7 != 0) goto L85
            goto Ld7
        L85:
            switch(r9) {
                case 0: goto Lcd;
                case 1: goto Lc6;
                case 2: goto Lbe;
                case 3: goto Lb6;
                case 4: goto Lac;
                case 5: goto La1;
                case 6: goto L96;
                case 7: goto L89;
                default: goto L88;
            }
        L88:
            goto Lcf
        L89:
            byte r2 = (byte) r7
            long r7 = (long) r2
            r2 = 56
            long r7 = r7 << r2
            r12 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L93:
            long r10 = r10 & r12
            long r10 = r10 + r7
            goto Lcf
        L96:
            byte r2 = (byte) r7
            long r7 = (long) r2
            r2 = 48
            long r7 = r7 << r2
            r12 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L93
        La1:
            byte r2 = (byte) r7
            long r7 = (long) r2
            r2 = 40
            long r7 = r7 << r2
            r12 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L93
        Lac:
            byte r2 = (byte) r7
            long r7 = (long) r2
            long r7 = r7 << r19
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L93
        Lb6:
            byte r2 = (byte) r7
            int r2 = r2 << 24
            long r7 = (long) r2
            r12 = 16777215(0xffffff, double:8.2890456E-317)
            goto L93
        Lbe:
            byte r2 = (byte) r7
            int r2 = r2 << 16
            long r7 = (long) r2
            r12 = 65535(0xffff, double:3.23786E-319)
            goto L93
        Lc6:
            byte r7 = (byte) r7
            int r2 = r7 << 8
            long r7 = (long) r2
            r12 = 255(0xff, double:1.26E-321)
            goto L93
        Lcd:
            byte r2 = (byte) r7
            long r10 = (long) r2
        Lcf:
            int r5 = r5 + r4
            int r9 = r9 + 1
            r2 = 34
            r4 = 0
            goto L1d
        Ld7:
            int r5 = r0.nameBegin
            r10 = r16
        Ldb:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 == 0) goto Le3
            r20 = r4
            goto L14b
        Le3:
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r10 = r1
            r1 = 0
        Lea:
            char r2 = r3[r5]
            r7 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            if (r2 != r14) goto L13c
            r0.nameEscape = r4
            int r2 = r5 + 1
            char r9 = r3[r2]
            if (r9 == r13) goto L116
            if (r9 == r12) goto L104
            char r5 = r0.char1(r9)
        L101:
            r20 = r4
            goto L131
        L104:
            int r2 = r5 + 2
            char r2 = r3[r2]
            int r5 = r5 + 3
            char r9 = r3[r5]
            char r2 = com.alibaba.fastjson2.JSONReader.char2(r2, r9)
            r20 = r5
            r5 = r2
            r2 = r20
            goto L101
        L116:
            int r2 = r5 + 2
            char r2 = r3[r2]
            int r9 = r5 + 3
            char r9 = r3[r9]
            int r15 = r5 + 4
            char r15 = r3[r15]
            int r5 = r5 + 5
            r20 = r4
            char r4 = r3[r5]
            char r2 = com.alibaba.fastjson2.JSONReader.char4(r2, r9, r15, r4)
            r21 = r5
            r5 = r2
            r2 = r21
        L131:
            int r2 = r2 + 1
            long r4 = (long) r5
            long r4 = r4 ^ r10
            long r4 = r4 * r7
            r10 = r4
            r9 = r19
            r5 = r2
            goto L1a2
        L13c:
            r20 = r4
            r4 = 34
            if (r2 != r4) goto L198
            r0.nameLength = r1
            r0.nameEnd = r5
            r1 = 0
            r0.stringValue = r1
            int r5 = r5 + 1
        L14b:
            r1 = 26
            if (r5 != r6) goto L151
            r2 = r1
            goto L153
        L151:
            char r2 = r3[r5]
        L153:
            r7 = 4294981377(0x100003701, double:2.122002748E-314)
            r12 = 1
            r4 = r19
            if (r2 > r4) goto L16c
            long r14 = r12 << r2
            long r14 = r14 & r7
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 == 0) goto L16c
            int r5 = r5 + 1
            char r2 = r3[r5]
            r19 = 32
            goto L153
        L16c:
            r4 = 44
            if (r2 != r4) goto L173
            r4 = r20
            goto L174
        L173:
            r4 = 0
        L174:
            r0.comma = r4
            if (r4 == 0) goto L191
            int r5 = r5 + 1
            if (r5 != r6) goto L17f
        L17c:
            r9 = 32
            goto L182
        L17f:
            char r1 = r3[r5]
            goto L17c
        L182:
            if (r1 > r9) goto L190
            long r14 = r12 << r1
            long r14 = r14 & r7
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 == 0) goto L190
            int r5 = r5 + 1
            char r1 = r3[r5]
            goto L182
        L190:
            r2 = r1
        L191:
            int r5 = r5 + 1
            r0.offset = r5
            r0.f1814ch = r2
            return r10
        L198:
            r9 = r19
            int r5 = r5 + 1
            r15 = r5
            long r4 = (long) r2
            long r4 = r4 ^ r10
            long r4 = r4 * r7
            r10 = r4
            r5 = r15
        L1a2:
            int r1 = r1 + 1
            r19 = r9
            r4 = r20
            goto Lea
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.ZonedDateTime readZonedDateTimeX(int r6) {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 34
            if (r0 == r1) goto L12
            r1 = 39
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r6 = "date only support string input"
            ah.a.w(r6)
            r6 = 0
            return r6
        L12:
            r0 = 19
            r1 = 0
            if (r6 >= r0) goto L18
            return r1
        L18:
            r0 = 30
            r2 = 90
            if (r6 != r0) goto L33
            char[] r0 = r5.chars
            int r3 = r5.offset
            int r4 = r3 + 29
            char r4 = r0[r4]
            if (r4 != r2) goto L33
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime29(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L8a
        L33:
            r0 = 29
            if (r6 != r0) goto L4c
            char[] r0 = r5.chars
            int r3 = r5.offset
            int r4 = r3 + 28
            char r4 = r0[r4]
            if (r4 != r2) goto L4c
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime28(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L8a
        L4c:
            r0 = 28
            if (r6 != r0) goto L65
            char[] r0 = r5.chars
            int r3 = r5.offset
            int r4 = r3 + 27
            char r4 = r0[r4]
            if (r4 != r2) goto L65
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime27(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L8a
        L65:
            r0 = 27
            if (r6 != r0) goto L7e
            char[] r0 = r5.chars
            int r3 = r5.offset
            int r4 = r3 + 26
            char r4 = r0[r4]
            if (r4 != r2) goto L7e
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime26(r0, r3)
            java.time.ZoneOffset r2 = java.time.ZoneOffset.UTC
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r2)
            goto L8a
        L7e:
            char[] r0 = r5.chars
            int r2 = r5.offset
            com.alibaba.fastjson2.JSONReader$Context r3 = r5.context
            java.time.ZoneId r3 = r3.zoneId
            java.time.ZonedDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(r0, r2, r6, r3)
        L8a:
            if (r0 != 0) goto L8d
            return r1
        L8d:
            int r1 = r5.offset
            r2 = 1
            int r6 = r6 + r2
            int r6 = r6 + r1
            r5.offset = r6
            r5.next()
            char r6 = r5.f1814ch
            r1 = 44
            if (r6 != r1) goto L9e
            goto L9f
        L9e:
            r2 = 0
        L9f:
            r5.comma = r2
            if (r2 == 0) goto La6
            r5.next()
        La6:
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void skipComment() {
            r13 = this;
            int r0 = r13.offset
            int r1 = r0 + 1
            int r2 = r13.end
            if (r1 >= r2) goto L7d
            char[] r2 = r13.chars
            char r3 = r2[r0]
            r4 = 42
            r5 = 0
            r6 = 47
            r7 = 1
            if (r3 != r4) goto L16
            r3 = r7
            goto L19
        L16:
            if (r3 != r6) goto L73
            r3 = r5
        L19:
            int r0 = r0 + 2
            char r1 = r2[r1]
        L1d:
            if (r3 == 0) goto L2f
            if (r1 != r4) goto L2d
            int r1 = r13.end
            if (r0 > r1) goto L2d
            char r1 = r2[r0]
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
            char r1 = r2[r0]
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
            char r1 = r2[r0]
            goto L3f
        L5c:
            r9 = r1
        L5d:
            int r0 = r0 + r7
            goto L61
        L5f:
            if (r0 < r8) goto L6b
        L61:
            r13.f1814ch = r9
            r13.offset = r0
            if (r9 != r6) goto L6a
            r13.skipComment()
        L6a:
            return
        L6b:
            int r1 = r0 + 1
            char r0 = r2[r0]
            r12 = r1
            r1 = r0
            r0 = r12
            goto L1d
        L73:
            java.lang.String r0 = "parse comment error"
            java.lang.String r0 = r13.info(r0)
            ah.a.w(r0)
            return
        L7d:
            java.lang.String r0 = r13.info()
            ah.a.w(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean skipName() {
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
            char[] r4 = r15.chars
        L3c:
            int r6 = r3 + 1
            char r7 = r4[r3]
            r8 = 92
            if (r7 != r8) goto L55
            char r3 = r4[r6]
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
            if (r7 != r0) goto Lb1
            int r0 = r15.end
            r7 = 26
            if (r6 != r0) goto L5f
        L5d:
            r0 = r7
            goto L64
        L5f:
            int r3 = r3 + 2
            char r0 = r4[r6]
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
            char r3 = r4[r6]
            r6 = r0
            r0 = r3
            goto L64
        L82:
            r12 = 58
            if (r0 != r12) goto Lac
            int r0 = r15.end
            if (r6 != r0) goto L8d
            r0 = r6
        L8b:
            r6 = r7
            goto L91
        L8d:
            int r0 = r6 + 1
            char r6 = r4[r6]
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
            char r0 = r4[r0]
            r14 = r6
            r6 = r0
            r0 = r14
            goto L91
        La7:
            r15.offset = r0
            r15.f1814ch = r6
            return r5
        Lac:
            com.alibaba.fastjson2.JSONException r0 = com.alibaba.fastjson2.JSONReader.syntaxError(r0)
            throw r0
        Lb1:
            r3 = r6
            goto L3c
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void skipValue() {
            r20 = this;
            r0 = r20
            char[] r1 = r0.chars
            char r2 = r0.f1814ch
            int r3 = r0.offset
            r4 = 125(0x7d, float:1.75E-43)
            r5 = 93
            r6 = 101(0x65, float:1.42E-43)
            r9 = 83
            r10 = 46
            r11 = 45
            r12 = 0
            r15 = 43
            r16 = 0
            if (r2 == r15) goto L132
            r7 = 102(0x66, float:1.43E-43)
            r8 = 108(0x6c, float:1.51E-43)
            if (r2 == r7) goto Lff
            r7 = 110(0x6e, float:1.54E-43)
            r13 = 117(0x75, float:1.64E-43)
            if (r2 == r7) goto Ld5
            r7 = 116(0x74, float:1.63E-43)
            if (r2 == r7) goto La6
            if (r2 == r11) goto L132
            if (r2 == r10) goto L132
            switch(r2) {
                case 48: goto L132;
                case 49: goto L132;
                case 50: goto L132;
                case 51: goto L132;
                case 52: goto L132;
                case 53: goto L132;
                case 54: goto L132;
                case 55: goto L132;
                case 56: goto L132;
                case 57: goto L132;
                default: goto L32;
            }
        L32:
            r6 = 34
            r7 = 39
            if (r2 == r6) goto L88
            if (r2 != r7) goto L3b
            goto L88
        L3b:
            r6 = 91
            if (r2 != r6) goto L5f
            r0.next()
            r2 = r12
        L43:
            char r3 = r0.f1814ch
            if (r3 != r5) goto L4b
            r0.next()
            goto La0
        L4b:
            if (r2 == 0) goto L57
            boolean r3 = r0.comma
            if (r3 == 0) goto L52
            goto L57
        L52:
            com.alibaba.fastjson2.JSONException r1 = r0.valueError()
            throw r1
        L57:
            r0.comma = r12
            r0.skipValue()
            int r2 = r2 + 1
            goto L43
        L5f:
            r6 = 123(0x7b, float:1.72E-43)
            if (r2 != r6) goto L77
            r0.next()
        L66:
            char r2 = r0.f1814ch
            if (r2 != r4) goto L70
            r0.comma = r12
            r0.next()
            goto La0
        L70:
            r0.skipName()
            r0.skipValue()
            goto L66
        L77:
            if (r2 != r9) goto L83
            boolean r6 = r0.nextIfSet()
            if (r6 == 0) goto L83
            r0.skipValue()
            goto La0
        L83:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L88:
            if (r2 != r7) goto L9d
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote
            long r6 = r6.mask
            long r2 = r2 & r6
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 != 0) goto L98
            goto L9d
        L98:
            com.alibaba.fastjson2.JSONException r1 = r0.notSupportName()
            throw r1
        L9d:
            r0.skipString()
        La0:
            char r2 = r0.f1814ch
            int r3 = r0.offset
            goto L210
        La6:
            int r7 = r3 + 3
            int r8 = r0.end
            if (r7 > r8) goto Ld0
            char r9 = r1[r3]
            r10 = 114(0x72, float:1.6E-43)
            if (r9 != r10) goto Lcb
            int r9 = r3 + 1
            char r9 = r1[r9]
            if (r9 != r13) goto Lcb
            int r9 = r3 + 2
            char r9 = r1[r9]
            if (r9 != r6) goto Lcb
            if (r7 != r8) goto Lc5
        Lc0:
            r3 = r7
        Lc1:
            r2 = 26
            goto L210
        Lc5:
            int r3 = r3 + 4
            char r2 = r1[r7]
            goto L210
        Lcb:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Ld0:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Ld5:
            int r6 = r3 + 3
            int r7 = r0.end
            if (r6 > r7) goto Lfa
            char r9 = r1[r3]
            if (r9 != r13) goto Lf5
            int r9 = r3 + 1
            char r9 = r1[r9]
            if (r9 != r8) goto Lf5
            int r9 = r3 + 2
            char r9 = r1[r9]
            if (r9 != r8) goto Lf5
            if (r6 != r7) goto Lef
            r3 = r6
            goto Lc1
        Lef:
            int r3 = r3 + 4
            char r2 = r1[r6]
            goto L210
        Lf5:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lfa:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        Lff:
            int r7 = r3 + 4
            int r9 = r0.end
            if (r7 > r9) goto L12d
            char r10 = r1[r3]
            r11 = 97
            if (r10 != r11) goto L128
            int r10 = r3 + 1
            char r10 = r1[r10]
            if (r10 != r8) goto L128
            int r8 = r3 + 2
            char r8 = r1[r8]
            r10 = 115(0x73, float:1.61E-43)
            if (r8 != r10) goto L128
            int r8 = r3 + 3
            char r8 = r1[r8]
            if (r8 != r6) goto L128
            if (r7 != r9) goto L122
            goto Lc0
        L122:
            int r3 = r3 + 5
            char r2 = r1[r7]
            goto L210
        L128:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L12d:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L132:
            if (r2 == r11) goto L136
            if (r2 != r15) goto L143
        L136:
            int r7 = r0.end
            if (r3 >= r7) goto L288
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L143:
            if (r2 != r10) goto L147
            r7 = 1
            goto L148
        L147:
            r7 = r12
        L148:
            r8 = 57
            r13 = 48
            if (r7 != 0) goto L168
            if (r2 < r13) goto L168
            if (r2 > r8) goto L168
        L152:
            int r2 = r0.end
            if (r3 != r2) goto L159
            r2 = 26
            goto L162
        L159:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L162:
            if (r2 < r13) goto L166
            if (r2 <= r8) goto L152
        L166:
            r7 = 1
            goto L169
        L168:
            r7 = r12
        L169:
            r12 = 68
            r5 = 70
            r4 = 76
            if (r7 == 0) goto L186
            if (r2 == r4) goto L17d
            if (r2 == r5) goto L17d
            if (r2 == r12) goto L17d
            r14 = 66
            if (r2 == r14) goto L17d
            if (r2 != r9) goto L186
        L17d:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L186:
            if (r2 != r10) goto L1b2
            int r2 = r0.end
            if (r3 != r2) goto L18f
            r2 = 26
            goto L198
        L18f:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L198:
            if (r2 < r13) goto L1b0
            if (r2 > r8) goto L1b0
        L19c:
            int r2 = r0.end
            if (r3 != r2) goto L1a3
            r2 = 26
            goto L1ac
        L1a3:
            int r2 = r3 + 1
            char r3 = r1[r3]
            r19 = r3
            r3 = r2
            r2 = r19
        L1ac:
            if (r2 < r13) goto L1b0
            if (r2 <= r8) goto L19c
        L1b0:
            r10 = 1
            goto L1b3
        L1b2:
            r10 = 0
        L1b3:
            if (r7 != 0) goto L1bd
            if (r10 == 0) goto L1b8
            goto L1bd
        L1b8:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
        L1bd:
            if (r2 == r6) goto L1c3
            r6 = 69
            if (r2 != r6) goto L1f5
        L1c3:
            int r2 = r3 + 1
            char r6 = r1[r3]
            if (r6 == r15) goto L1cf
            if (r6 != r11) goto L1cc
            goto L1cf
        L1cc:
            r18 = 0
            goto L1da
        L1cf:
            int r7 = r0.end
            if (r2 >= r7) goto L283
            int r3 = r3 + 2
            char r6 = r1[r2]
            r2 = r3
            r18 = 1
        L1da:
            if (r6 < r13) goto L1f1
            if (r6 > r8) goto L1f1
        L1de:
            int r3 = r0.end
            if (r2 != r3) goto L1e6
            r3 = r2
            r2 = 26
            goto L1ea
        L1e6:
            int r3 = r2 + 1
            char r2 = r1[r2]
        L1ea:
            if (r2 < r13) goto L1f5
            if (r2 <= r8) goto L1ef
            goto L1f5
        L1ef:
            r2 = r3
            goto L1de
        L1f1:
            if (r18 != 0) goto L27e
            r3 = r2
            r2 = r6
        L1f5:
            if (r2 == r4) goto L201
            if (r2 == r5) goto L201
            if (r2 == r12) goto L201
            r4 = 66
            if (r2 == r4) goto L201
            if (r2 != r9) goto L210
        L201:
            int r2 = r0.end
            if (r3 != r2) goto L207
        L205:
            goto Lc1
        L207:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L20b:
            r19 = r3
            r3 = r2
            r2 = r19
        L210:
            r4 = 32
            if (r2 > r4) goto L22b
            r4 = 1
            long r4 = r4 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L22b
            int r2 = r0.end
            if (r3 != r2) goto L226
            goto L205
        L226:
            int r2 = r3 + 1
            char r3 = r1[r3]
            goto L20b
        L22b:
            r4 = 44
            if (r2 != r4) goto L260
            r4 = 1
            r0.comma = r4
            int r2 = r0.end
            if (r3 != r2) goto L23a
            r2 = r3
            r3 = 26
            goto L23e
        L23a:
            int r2 = r3 + 1
            char r3 = r1[r3]
        L23e:
            r19 = r3
            r3 = r2
            r2 = r19
        L243:
            r4 = 32
            if (r2 > r4) goto L260
            r4 = 1
            long r4 = r4 << r2
            r6 = 4294981377(0x100003701, double:2.122002748E-314)
            long r4 = r4 & r6
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L260
            int r2 = r0.end
            if (r3 != r2) goto L25b
            r2 = 26
            goto L243
        L25b:
            int r2 = r3 + 1
            char r3 = r1[r3]
            goto L23e
        L260:
            boolean r1 = r0.comma
            if (r1 != 0) goto L278
            r1 = 26
            if (r2 == r1) goto L278
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 == r4) goto L278
            r4 = 93
            if (r2 == r4) goto L278
            if (r2 != r1) goto L273
            goto L278
        L273:
            com.alibaba.fastjson2.JSONException r1 = r0.error(r3, r2)
            throw r1
        L278:
            char r1 = (char) r2
            r0.f1814ch = r1
            r0.offset = r3
            return
        L27e:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r6)
            throw r1
        L283:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r2, r6)
            throw r1
        L288:
            com.alibaba.fastjson2.JSONException r1 = com.alibaba.fastjson2.JSONReader.numberError(r3, r2)
            throw r1
    }
}
