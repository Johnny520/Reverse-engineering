package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16 extends com.alibaba.fastjson2.JSONWriter {
    final com.alibaba.fastjson2.JSONFactory.CacheItem cacheItem;
    protected char[] chars;

    public JSONWriterUTF16(com.alibaba.fastjson2.JSONWriter.Context r4) {
            r3 = this;
            r0 = 0
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            int r4 = java.lang.System.identityHashCode(r4)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r0 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r1 = r0.length
            int r1 = r1 + (-1)
            r4 = r4 & r1
            r4 = r0[r4]
            r3.cacheItem = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r0 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            java.lang.Object r4 = r0.getAndSet(r4, r2)
            char[] r4 = (char[]) r4
            if (r4 != 0) goto L27
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]
        L27:
            r3.chars = r4
            return
    }

    private char[] grow(int r1) {
            r0 = this;
            r0.grow0(r1)
            char[] r1 = r0.chars
            return r1
    }

    private void grow0(int r3) {
            r2 = this;
            char[] r0 = r2.chars
            int r1 = r0.length
            int r3 = r2.newCapacity(r3, r1)
            char[] r3 = java.util.Arrays.copyOf(r0, r3)
            r2.chars = r3
            return
    }

    private int indent(char[] r4, int r5) {
            r3 = this;
            r0 = 10
            r4[r5] = r0
            r0 = 1
            int r5 = r5 + r0
            byte r1 = r3.pretty
            int r2 = r3.level
            int r2 = r2 * r1
            int r2 = r2 + r5
            if (r1 != r0) goto L11
            r0 = 9
            goto L13
        L11:
            r0 = 32
        L13:
            java.util.Arrays.fill(r4, r5, r2, r0)
            return r2
    }

    private static int indent(char[] r2, int r3, int r4) {
            int r0 = r3 + 1
            r1 = 10
            r2[r3] = r1
            int r4 = r4 + r0
        L7:
            if (r0 >= r4) goto L11
            int r3 = r0 + 1
            r1 = 9
            r2[r0] = r1
            r0 = r3
            goto L7
        L11:
            return r0
    }

    public static void putIntUnaligned(char[] r5, int r6, int r7) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            long r3 = (long) r6
            r6 = 1
            long r3 = r3 << r6
            long r1 = r1 + r3
            r0.putInt(r5, r1, r7)
            return
    }

    private static void putLong(char[] r12, int r13, long r14) {
            long r0 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r13 = r13 << 1
            long r2 = (long) r13
            long r6 = r0 + r2
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r1 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r14
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r14
            r13 = 8
            long r3 = r3 << r13
            long r1 = r1 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r14
            r10 = 16
            long r3 = r3 << r10
            long r1 = r1 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r14
            r11 = 24
            long r3 = r3 << r11
            long r8 = r1 | r3
            r5 = r12
            r4 = r0
            r4.putLong(r5, r6, r8)
            r1 = r5
            r2 = 8
            long r2 = r2 + r6
            r4 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r4 & r14
            r12 = 32
            long r4 = r4 >> r12
            r6 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r6 = r6 & r14
            long r6 = r6 >> r11
            long r4 = r4 | r6
            r6 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r6 = r6 & r14
            long r6 = r6 >> r10
            long r4 = r4 | r6
            r6 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r14 = r14 & r6
            long r12 = r14 >> r13
            long r4 = r4 | r12
            r0.putLong(r1, r2, r4)
            return
    }

    private static void putLong(char[] r21, int r22, long r23, int r25) {
            long r0 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r2 = r22 << 1
            long r2 = (long) r2
            long r6 = r0 + r2
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r10 = 255(0xff, double:1.26E-321)
            long r1 = r23 & r10
            r12 = 65280(0xff00, double:3.22526E-319)
            long r3 = r23 & r12
            r14 = 8
            long r3 = r3 << r14
            long r1 = r1 | r3
            r15 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r23 & r15
            r17 = 16
            long r3 = r3 << r17
            long r1 = r1 | r3
            r18 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r23 & r18
            r20 = 24
            long r3 = r3 << r20
            long r8 = r1 | r3
            r5 = r21
            r4 = r0
            r4.putLong(r5, r6, r8)
            r1 = 8
            long r2 = r6 + r1
            r4 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r23 & r4
            r1 = 32
            long r4 = r4 >> r1
            r8 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r8 = r23 & r8
            long r8 = r8 >> r20
            long r4 = r4 | r8
            r8 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r8 = r23 & r8
            long r8 = r8 >> r17
            long r4 = r4 | r8
            r8 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r23 & r8
            long r8 = r8 >> r14
            long r4 = r4 | r8
            r1 = r21
            r0.putLong(r1, r2, r4)
            r1 = 16
            long r2 = r6 + r1
            r1 = r25
            long r4 = (long) r1
            long r6 = r4 & r10
            long r8 = r4 & r12
            long r8 = r8 << r14
            long r6 = r6 | r8
            long r8 = r4 & r15
            long r8 = r8 << r17
            long r6 = r6 | r8
            long r4 = r4 & r18
            long r4 = r4 << r20
            long r4 = r4 | r6
            r1 = r21
            r0.putLong(r1, r2, r4)
            return
    }

    private static void putLong(char[] r30, int r31, long r32, long r34) {
            long r0 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_CHAR_BASE_OFFSET
            int r2 = r31 << 1
            long r2 = (long) r2
            long r6 = r0 + r2
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r10 = 255(0xff, double:1.26E-321)
            long r1 = r32 & r10
            r12 = 65280(0xff00, double:3.22526E-319)
            long r3 = r32 & r12
            r14 = 8
            long r3 = r3 << r14
            long r1 = r1 | r3
            r15 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r32 & r15
            r17 = 16
            long r3 = r3 << r17
            long r1 = r1 | r3
            r18 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r32 & r18
            r20 = 24
            long r3 = r3 << r20
            long r8 = r1 | r3
            r5 = r30
            r4 = r0
            r4.putLong(r5, r6, r8)
            r1 = 8
            long r2 = r6 + r1
            r8 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r4 = r32 & r8
            r21 = 32
            long r4 = r4 >> r21
            r22 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r24 = r32 & r22
            long r24 = r24 >> r20
            long r4 = r4 | r24
            r24 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r26 = r32 & r24
            long r26 = r26 >> r17
            long r4 = r4 | r26
            r26 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r28 = r32 & r26
            long r28 = r28 >> r14
            long r4 = r4 | r28
            r1 = r30
            r0.putLong(r1, r2, r4)
            r1 = 16
            long r2 = r6 + r1
            long r4 = r34 & r10
            long r10 = r34 & r12
            long r10 = r10 << r14
            long r4 = r4 | r10
            long r10 = r34 & r15
            long r10 = r10 << r17
            long r4 = r4 | r10
            long r10 = r34 & r18
            long r10 = r10 << r20
            long r4 = r4 | r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r1 = 24
            long r2 = r6 + r1
            long r4 = r34 & r8
            long r4 = r4 >> r21
            long r6 = r34 & r22
            long r6 = r6 >> r20
            long r4 = r4 | r6
            long r6 = r34 & r24
            long r6 = r6 >> r17
            long r4 = r4 | r6
            long r6 = r34 & r26
            long r6 = r6 >> r14
            long r4 = r4 | r6
            r1 = r30
            r0.putLong(r1, r2, r4)
            return
    }

    private void writeQuote() {
            r3 = this;
            int r0 = r3.off
            char[] r1 = r3.chars
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            char[] r0 = r3.chars
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            char r2 = r3.quote
            r0[r1] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            char[] r0 = r3.chars
            int r1 = r0.length
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r1 <= r2) goto L8
            return
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r2 = r3.cacheItem
            r1.lazySet(r2, r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endArray() {
            r5 = this;
            int r0 = r5.level
            int r0 = r0 + (-1)
            r5.level = r0
            int r1 = r5.off
            int r2 = r1 + 1
            byte r3 = r5.pretty
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r4
            goto L14
        L11:
            int r3 = r3 * r0
            int r3 = r3 + 1
        L14:
            int r2 = r2 + r3
            char[] r0 = r5.chars
            int r3 = r0.length
            if (r2 <= r3) goto L1e
            char[] r0 = r5.grow(r2)
        L1e:
            byte r2 = r5.pretty
            if (r2 == 0) goto L26
            int r1 = r5.indent(r0, r1)
        L26:
            r2 = 93
            r0[r1] = r2
            int r1 = r1 + 1
            r5.off = r1
            r5.startObject = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endObject() {
            r5 = this;
            int r0 = r5.level
            int r0 = r0 + (-1)
            r5.level = r0
            int r1 = r5.off
            int r2 = r1 + 1
            byte r3 = r5.pretty
            r4 = 0
            if (r3 != 0) goto L11
            r3 = r4
            goto L14
        L11:
            int r3 = r3 * r0
            int r3 = r3 + 1
        L14:
            int r2 = r2 + r3
            char[] r0 = r5.chars
            int r3 = r0.length
            if (r2 <= r3) goto L1e
            char[] r0 = r5.grow(r2)
        L1e:
            byte r2 = r5.pretty
            if (r2 == 0) goto L26
            int r1 = r5.indent(r0, r1)
        L26:
            r2 = 125(0x7d, float:1.75E-43)
            r0[r1] = r2
            int r1 = r1 + 1
            r5.off = r1
            r5.startObject = r4
            return
    }

    public void ensureCapacity(int r2) {
            r1 = this;
            char[] r0 = r1.chars
            int r0 = r0.length
            if (r2 <= r0) goto L8
            r1.grow0(r2)
        L8:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r7) {
            r6 = this;
            if (r7 == 0) goto L38
            r0 = 0
            r1 = r0
        L4:
            int r2 = r6.off
            if (r1 >= r2) goto L21
            char[] r3 = r6.chars
            char r4 = r3[r1]
            r5 = 128(0x80, float:1.8E-43)
            if (r4 < r5) goto L1e
            int r1 = r2 * 3
            byte[] r1 = new byte[r1]
            int r2 = com.alibaba.fastjson2.util.IOUtils.encodeUTF8(r3, r0, r2, r1, r0)
            r7.write(r1, r0, r2)
            r6.off = r0
            return r2
        L1e:
            int r1 = r1 + 1
            goto L4
        L21:
            byte[] r1 = new byte[r2]
            r3 = r0
        L24:
            int r4 = r6.off
            if (r3 >= r4) goto L32
            char[] r4 = r6.chars
            char r4 = r4[r3]
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L24
        L32:
            r7.write(r1)
            r6.off = r0
            return r2
        L38:
            java.lang.String r7 = "out is nulll"
            ah.a.w(r7)
            r7 = 0
            return r7
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r3, java.nio.charset.Charset r4) {
            r2 = this;
            int r0 = r2.off
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 == 0) goto L13
            byte[] r4 = r2.getBytes(r4)
            r3.write(r4)
            r2.off = r1
            int r3 = r4.length
            return r3
        L13:
            java.lang.String r3 = "out is null"
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void flushTo(java.io.Writer r4) {
            r3 = this;
            int r0 = r3.off     // Catch: java.io.IOException -> Ld
            if (r0 <= 0) goto Lf
            char[] r1 = r3.chars     // Catch: java.io.IOException -> Ld
            r2 = 0
            r4.write(r1, r2, r0)     // Catch: java.io.IOException -> Ld
            r3.off = r2     // Catch: java.io.IOException -> Ld
            return
        Ld:
            r4 = move-exception
            goto L10
        Lf:
            return
        L10:
            java.lang.String r0 = "flushTo error"
            ah.a.x(r0, r4)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.off
            if (r1 >= r2) goto L1e
            char[] r3 = r6.chars
            char r4 = r3[r1]
            r5 = 128(0x80, float:1.8E-43)
            if (r4 < r5) goto L1b
            int r1 = r2 * 3
            byte[] r1 = new byte[r1]
            int r0 = com.alibaba.fastjson2.util.IOUtils.encodeUTF8(r3, r0, r2, r1, r0)
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            return r0
        L1b:
            int r1 = r1 + 1
            goto L2
        L1e:
            byte[] r1 = new byte[r2]
        L20:
            int r2 = r6.off
            if (r0 >= r2) goto L2e
            char[] r2 = r6.chars
            char r2 = r2[r0]
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L20
        L2e:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(java.nio.charset.Charset r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.off
            if (r1 >= r2) goto L12
            char[] r3 = r5.chars
            char r3 = r3[r1]
            r4 = 128(0x80, float:1.8E-43)
            if (r3 < r4) goto Lf
            goto L1f
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            if (r6 == r1) goto L2f
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r6 == r1) goto L2f
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            if (r6 != r1) goto L1f
            goto L2f
        L1f:
            java.lang.String r1 = new java.lang.String
            char[] r3 = r5.chars
            r1.<init>(r3, r0, r2)
            if (r6 != 0) goto L2a
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
        L2a:
            byte[] r6 = r1.getBytes(r6)
            return r6
        L2f:
            byte[] r6 = new byte[r2]
        L31:
            int r1 = r5.off
            if (r0 >= r1) goto L3f
            char[] r1 = r5.chars
            char r1 = r1[r0]
            byte r1 = (byte) r1
            r6[r0] = r1
            int r0 = r0 + 1
            goto L31
        L3f:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int size() {
            r1 = this;
            int r0 = r1.off
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray() {
            r4 = this;
            int r0 = r4.level
            int r0 = r0 + 1
            r4.level = r0
            com.alibaba.fastjson2.JSONWriter$Context r1 = r4.context
            int r1 = r1.maxLevel
            if (r0 <= r1) goto Lf
            r4.overflowLevel()
        Lf:
            int r0 = r4.off
            int r1 = r0 + 3
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L22
            char[] r1 = r4.grow(r2)
        L22:
            int r2 = r0 + 1
            r3 = 91
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L30
            int r2 = r4.indent(r1, r2)
        L30:
            r4.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startObject() {
            r5 = this;
            int r0 = r5.level
            r1 = 1
            int r0 = r0 + r1
            r5.level = r0
            com.alibaba.fastjson2.JSONWriter$Context r2 = r5.context
            int r2 = r2.maxLevel
            if (r0 <= r2) goto Lf
            r5.overflowLevel()
        Lf:
            r5.startObject = r1
            int r0 = r5.off
            char[] r1 = r5.chars
            int r2 = r0 + 3
            byte r3 = r5.pretty
            int r4 = r5.level
            int r3 = r3 * r4
            int r3 = r3 + r2
            int r2 = r1.length
            if (r3 <= r2) goto L24
            char[] r1 = r5.grow(r3)
        L24:
            int r2 = r0 + 1
            r3 = 123(0x7b, float:1.72E-43)
            r1[r0] = r3
            byte r0 = r5.pretty
            if (r0 == 0) goto L32
            int r2 = r5.indent(r1, r2)
        L32:
            r5.off = r2
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.chars
            r2 = 0
            int r3 = r4.off
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(com.alibaba.fastjson2.JSONObject r13) {
            r12 = this;
            byte r0 = r12.pretty
            if (r0 == 0) goto L8
            super.write(r13)
            return
        L8:
            if (r13 != 0) goto Le
            r12.writeNull()
            return
        Le:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r12.context
            long r2 = r0.features
            long r4 = com.alibaba.fastjson2.JSONWriter.NONE_DIRECT_FEATURES
            long r2 = r2 & r4
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L2d
            java.lang.Class r2 = r13.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r0.getObjectWriter(r2)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r12
            r2 = r13
            r0.write(r1, r2, r3, r4, r5)
            return
        L2d:
            r0 = 123(0x7b, float:1.72E-43)
            r12.writeRaw(r0)
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r9 = r0.iterator()
            r0 = 1
        L3b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ldf
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = r2
            java.lang.Object r2 = r3.getValue()
            if (r2 != 0) goto L5c
            com.alibaba.fastjson2.JSONWriter$Context r4 = r12.context
            long r4 = r4.features
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteMapNullValue
            long r10 = r6.mask
            long r4 = r4 & r10
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L5c
            goto L3b
        L5c:
            if (r0 != 0) goto L63
            r0 = 44
            r12.writeRaw(r0)
        L63:
            java.lang.Object r0 = r3.getKey()
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L71
            java.lang.String r0 = (java.lang.String) r0
            r12.writeString(r0)
            goto L74
        L71:
            r12.writeAny(r0)
        L74:
            r0 = 58
            r12.writeRaw(r0)
            if (r2 != 0) goto L7f
            r12.writeNull()
            goto Ldc
        L7f:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r0 != r3) goto L8d
            java.lang.String r2 = (java.lang.String) r2
            r12.writeString(r2)
            goto Ldc
        L8d:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r0 != r3) goto L97
            java.lang.Integer r2 = (java.lang.Integer) r2
            r12.writeInt32(r2)
            goto Ldc
        L97:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r0 != r3) goto La1
            java.lang.Long r2 = (java.lang.Long) r2
            r12.writeInt64(r2)
            goto Ldc
        La1:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r0 != r3) goto Laf
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r12.writeBool(r0)
            goto Ldc
        Laf:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r0 != r3) goto Lba
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0 = 0
            r12.writeDecimal(r2, r7, r0)
            goto Ldc
        Lba:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            if (r0 != r3) goto Lc4
            com.alibaba.fastjson2.JSONArray r2 = (com.alibaba.fastjson2.JSONArray) r2
            r12.write(r2)
            goto Ldc
        Lc4:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r0 != r3) goto Lce
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            r12.write(r2)
            goto Ldc
        Lce:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r12.context
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriter(r0, r0)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r12
            r0.write(r1, r2, r3, r4, r5)
        Ldc:
            r0 = 0
            goto L3b
        Ldf:
            r0 = 125(0x7d, float:1.75E-43)
            r12.writeRaw(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(java.util.List r14) {
            r13 = this;
            if (r14 != 0) goto L6
            r13.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.PrettyFormat
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r4 = r0.mask
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Context r0 = r13.context
            long r4 = r0.features
            long r2 = r2 & r4
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L36
            java.lang.Class r2 = r14.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r0.getObjectWriter(r2)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r2 = r14
            r0.write(r1, r2, r3, r4, r5)
            return
        L36:
            int r0 = r13.off
            char[] r2 = r13.chars
            int r2 = r2.length
            r9 = 1
            if (r0 != r2) goto L42
            int r0 = r0 + r9
            r13.ensureCapacity(r0)
        L42:
            char[] r0 = r13.chars
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 91
            r0[r2] = r3
            int r10 = r14.size()
            r11 = 0
            r0 = r9
            r12 = r11
        L55:
            if (r12 >= r10) goto Ldd
            if (r0 != 0) goto L71
            int r0 = r13.off
            char[] r2 = r13.chars
            int r2 = r2.length
            if (r0 != r2) goto L65
            int r0 = r0 + 1
            r13.ensureCapacity(r0)
        L65:
            char[] r0 = r13.chars
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 44
            r0[r2] = r3
        L71:
            java.lang.Object r2 = r14.get(r12)
            if (r2 != 0) goto L7b
            r13.writeNull()
            goto Ld8
        L7b:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r0 != r3) goto L89
            java.lang.String r2 = (java.lang.String) r2
            r13.writeString(r2)
            goto Ld8
        L89:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r0 != r3) goto L93
            java.lang.Integer r2 = (java.lang.Integer) r2
            r13.writeInt32(r2)
            goto Ld8
        L93:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r0 != r3) goto L9d
            java.lang.Long r2 = (java.lang.Long) r2
            r13.writeInt64(r2)
            goto Ld8
        L9d:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r0 != r3) goto Lab
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            r13.writeBool(r0)
            goto Ld8
        Lab:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r0 != r3) goto Lb6
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0 = 0
            r13.writeDecimal(r2, r7, r0)
            goto Ld8
        Lb6:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            if (r0 != r3) goto Lc0
            com.alibaba.fastjson2.JSONArray r2 = (com.alibaba.fastjson2.JSONArray) r2
            r13.write(r2)
            goto Ld8
        Lc0:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r0 != r3) goto Lca
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            r13.write(r2)
            goto Ld8
        Lca:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r13.context
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriter(r0, r0)
            r4 = 0
            r5 = 0
            r3 = 0
            r1 = r13
            r0.write(r1, r2, r3, r4, r5)
        Ld8:
            int r12 = r12 + 1
            r0 = r11
            goto L55
        Ldd:
            int r0 = r13.off
            char[] r2 = r13.chars
            int r2 = r2.length
            if (r0 != r2) goto Le8
            int r0 = r0 + r9
            r13.ensureCapacity(r0)
        Le8:
            char[] r0 = r13.chars
            int r2 = r13.off
            int r3 = r2 + 1
            r13.off = r3
            r3 = 93
            r0[r2] = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write0(char r3) {
            r2 = this;
            int r0 = r2.off
            char[] r1 = r2.chars
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r1 = r0 + 1
            r2.ensureCapacity(r1)
        Lc:
            char[] r1 = r2.chars
            r1[r0] = r3
            int r0 = r0 + 1
            r2.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeArrayNull()
            return
        L6:
            int r0 = r11.length
            int r0 = r0 + (-1)
            int r0 = r0 / 3
            int r0 = r0 + 1
            r1 = 2
            int r0 = r0 << r1
            int r2 = r10.off
            int r0 = r0 + r2
            int r0 = r0 + r1
            r10.ensureCapacity(r0)
            char[] r0 = r10.chars
            int r3 = r2 + 1
            char r4 = r10.quote
            r0[r2] = r4
            int r2 = r11.length
            int r2 = r2 / 3
            int r2 = r2 * 3
            r4 = 0
            r5 = r4
        L25:
            if (r5 >= r2) goto L68
            int r6 = r5 + 1
            r7 = r11[r5]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            int r8 = r5 + 2
            r6 = r11[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            r7 = r11[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            char[] r7 = com.alibaba.fastjson2.JSONFactory.CA
            int r8 = r6 >>> 18
            r8 = r8 & 63
            char r8 = r7[r8]
            r0[r3] = r8
            int r8 = r3 + 1
            int r9 = r6 >>> 12
            r9 = r9 & 63
            char r9 = r7[r9]
            r0[r8] = r9
            int r8 = r3 + 2
            int r9 = r6 >>> 6
            r9 = r9 & 63
            char r9 = r7[r9]
            r0[r8] = r9
            int r8 = r3 + 3
            r6 = r6 & 63
            char r6 = r7[r6]
            r0[r8] = r6
            int r3 = r3 + 4
            goto L25
        L68:
            int r5 = r11.length
            int r5 = r5 - r2
            if (r5 <= 0) goto La5
            r2 = r11[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 10
            if (r5 != r1) goto L7d
            int r4 = r11.length
            int r4 = r4 + (-1)
            r11 = r11[r4]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r4 = r11 << 2
        L7d:
            r11 = r2 | r4
            char[] r2 = com.alibaba.fastjson2.JSONFactory.CA
            int r4 = r11 >> 12
            char r4 = r2[r4]
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r11 >>> 6
            r6 = r6 & 63
            char r6 = r2[r6]
            r0[r4] = r6
            int r4 = r3 + 2
            r6 = 61
            if (r5 != r1) goto L9c
            r11 = r11 & 63
            char r11 = r2[r11]
            goto L9d
        L9c:
            r11 = r6
        L9d:
            r0[r4] = r11
            int r11 = r3 + 3
            r0[r11] = r6
            int r3 = r3 + 4
        La5:
            char r11 = r10.quote
            r0[r3] = r11
            int r3 = r3 + 1
            r10.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(java.math.BigInteger r11, long r12) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeNumberNull()
            return
        L6:
            r0 = 10
            java.lang.String r0 = r11.toString(r0)
            com.alibaba.fastjson2.JSONWriter$Context r1 = r10.context
            long r1 = r1.features
            long r12 = r12 | r1
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r1 = r1.mask
            long r1 = r1 & r12
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r5 = 1
            if (r1 == 0) goto L30
            java.math.BigInteger r1 = com.alibaba.fastjson2.JSONFactory.LOW_BIGINT
            int r1 = r11.compareTo(r1)
            if (r1 < 0) goto L2e
            java.math.BigInteger r1 = com.alibaba.fastjson2.JSONFactory.HIGH_BIGINT
            int r11 = r11.compareTo(r1)
            if (r11 <= 0) goto L30
        L2e:
            r11 = r5
            goto L31
        L30:
            r11 = r2
        L31:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r6 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r8 = r1.mask
            long r6 = r6 | r8
            long r12 = r12 & r6
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L41
            r12 = r5
            goto L42
        L41:
            r12 = r2
        L42:
            if (r11 != 0) goto L48
            if (r12 == 0) goto L47
            goto L48
        L47:
            r5 = r2
        L48:
            int r11 = r0.length()
            int r12 = r10.off
            int r12 = r12 + r11
            int r12 = r12 + 2
            r10.ensureCapacity(r12)
            char[] r12 = r10.chars
            int r13 = r10.off
            if (r5 == 0) goto L69
            int r1 = r13 + 1
            r3 = 34
            r12[r13] = r3
            r0.getChars(r2, r11, r12, r1)
            int r1 = r1 + r11
            int r11 = r1 + 1
            r12[r1] = r3
            goto L6d
        L69:
            r0.getChars(r2, r11, r12, r13)
            int r11 = r11 + r13
        L6d:
            r10.off = r11
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char r9) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 8
            char[] r2 = r8.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r8.ensureCapacity(r1)
        Lc:
            char[] r1 = r8.chars
            int r2 = r0 + 1
            char r3 = r8.quote
            r1[r0] = r3
            r4 = 34
            r5 = 92
            if (r9 == r4) goto Lcf
            r4 = 39
            if (r9 == r4) goto Lcf
            if (r9 == r5) goto Lc8
            r4 = 49
            r6 = 117(0x75, float:1.64E-43)
            r7 = 48
            switch(r9) {
                case 0: goto Laf;
                case 1: goto Laf;
                case 2: goto Laf;
                case 3: goto Laf;
                case 4: goto Laf;
                case 5: goto Laf;
                case 6: goto Laf;
                case 7: goto Laf;
                case 8: goto La6;
                case 9: goto L9d;
                case 10: goto L94;
                case 11: goto L7a;
                case 12: goto L71;
                case 13: goto L66;
                case 14: goto L7a;
                case 15: goto L7a;
                case 16: goto L4c;
                case 17: goto L4c;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L2f;
                case 27: goto L2f;
                case 28: goto L2f;
                case 29: goto L2f;
                case 30: goto L2f;
                case 31: goto L2f;
                default: goto L29;
            }
        L29:
            int r0 = r0 + 2
            r1[r2] = r9
            goto Lda
        L2f:
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r4
            int r2 = r0 + 6
            int r9 = r9 + 71
            char r9 = (char) r9
            r1[r2] = r9
        L48:
            int r0 = r0 + 7
            goto Lda
        L4c:
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r4
            int r2 = r0 + 6
            int r9 = r9 + 32
            char r9 = (char) r9
            r1[r2] = r9
            goto L48
        L66:
            r1[r2] = r5
            int r9 = r0 + 2
            r2 = 114(0x72, float:1.6E-43)
            r1[r9] = r2
        L6e:
            int r0 = r0 + 3
            goto Lda
        L71:
            r1[r2] = r5
            int r9 = r0 + 2
            r2 = 102(0x66, float:1.43E-43)
            r1[r9] = r2
            goto L6e
        L7a:
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r7
            int r2 = r0 + 6
            int r9 = r9 + 87
            char r9 = (char) r9
            r1[r2] = r9
            goto L48
        L94:
            r1[r2] = r5
            int r9 = r0 + 2
            r2 = 110(0x6e, float:1.54E-43)
            r1[r9] = r2
            goto L6e
        L9d:
            r1[r2] = r5
            int r9 = r0 + 2
            r2 = 116(0x74, float:1.63E-43)
            r1[r9] = r2
            goto L6e
        La6:
            r1[r2] = r5
            int r9 = r0 + 2
            r2 = 98
            r1[r9] = r2
            goto L6e
        Laf:
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r6
            int r2 = r0 + 3
            r1[r2] = r7
            int r2 = r0 + 4
            r1[r2] = r7
            int r2 = r0 + 5
            r1[r2] = r7
            int r2 = r0 + 6
            int r9 = r9 + r7
            char r9 = (char) r9
            r1[r2] = r9
            goto L48
        Lc8:
            r1[r2] = r5
            int r2 = r0 + 2
            r1[r2] = r9
            goto L6e
        Lcf:
            if (r9 != r3) goto Ld6
            int r0 = r0 + 2
            r1[r2] = r5
            r2 = r0
        Ld6:
            int r0 = r2 + 1
            r1[r2] = r9
        Lda:
            r1[r0] = r3
            int r0 = r0 + 1
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
            r3 = this;
            int r0 = r3.off
            char[] r1 = r3.chars
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r1 = r0 + 1
            r3.ensureCapacity(r1)
        Lc:
            char[] r1 = r3.chars
            r2 = 58
            r1[r0] = r2
            int r0 = r0 + 1
            r3.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
            r4 = this;
            r0 = 0
            r4.startObject = r0
            int r0 = r4.off
            int r1 = r0 + 2
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L16
            char[] r1 = r4.grow(r2)
        L16:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L24
            int r2 = r4.indent(r1, r2)
        L24:
            r4.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 16
            char[] r2 = r7.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            char[] r2 = r7.chars
            char r3 = r7.quote
            r2[r0] = r3
            if (r8 < 0) goto L96
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r8 > r4) goto L96
            int r4 = r8 / 1000
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r6 = r4 * 1000
            int r8 = r8 - r6
            r8 = r5[r8]
            int r6 = r0 + 1
            int r4 = r4 + 48
            byte r4 = (byte) r4
            char r4 = (char) r4
            r2[r6] = r4
            int r4 = r0 + 2
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r4] = r6
            int r4 = r0 + 3
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r4] = r6
            int r4 = r0 + 4
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r4] = r8
            r8 = r5[r9]
            int r9 = r0 + 5
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            char r4 = (char) r4
            r2[r9] = r4
            int r9 = r0 + 6
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            r8 = r5[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            r8 = r5[r11]
            int r9 = r0 + 9
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 10
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            r8 = r5[r12]
            int r9 = r0 + 11
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 12
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            r8 = r5[r13]
            int r9 = r0 + 13
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 14
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            int r0 = r0 + 15
            r2[r0] = r3
            r7.off = r1
            return
        L96:
            java.lang.String r9 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r8 = eh.a.l(r8, r9)
            j8.o.t(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            int r0 = r6.off
            int r0 = r0 + 21
            r6.ensureCapacity(r0)
            char[] r0 = r6.chars
            int r1 = r6.off
            char r2 = r6.quote
            r0[r1] = r2
            if (r7 < 0) goto Lb1
            r3 = 9999(0x270f, float:1.4012E-41)
            if (r7 > r3) goto Lb1
            int r3 = r7 / 1000
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r5 = r3 * 1000
            int r7 = r7 - r5
            r7 = r4[r7]
            int r5 = r1 + 1
            int r3 = r3 + 48
            byte r3 = (byte) r3
            char r3 = (char) r3
            r0[r5] = r3
            int r3 = r1 + 2
            int r5 = r7 >> 16
            byte r5 = (byte) r5
            char r5 = (char) r5
            r0[r3] = r5
            int r3 = r1 + 3
            int r5 = r7 >> 8
            byte r5 = (byte) r5
            char r5 = (char) r5
            r0[r3] = r5
            int r3 = r1 + 4
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r3] = r7
            int r7 = r1 + 5
            r3 = 45
            r0[r7] = r3
            r7 = r4[r8]
            int r8 = r1 + 6
            int r5 = r7 >> 8
            byte r5 = (byte) r5
            char r5 = (char) r5
            r0[r8] = r5
            int r8 = r1 + 7
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r8] = r7
            int r7 = r1 + 8
            r0[r7] = r3
            r7 = r4[r9]
            int r8 = r1 + 9
            int r9 = r7 >> 8
            byte r9 = (byte) r9
            char r9 = (char) r9
            r0[r8] = r9
            int r8 = r1 + 10
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r8] = r7
            int r7 = r1 + 11
            r8 = 32
            r0[r7] = r8
            r7 = r4[r10]
            int r8 = r1 + 12
            int r9 = r7 >> 8
            byte r9 = (byte) r9
            char r9 = (char) r9
            r0[r8] = r9
            int r8 = r1 + 13
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r8] = r7
            int r7 = r1 + 14
            r8 = 58
            r0[r7] = r8
            r7 = r4[r11]
            int r9 = r1 + 15
            int r10 = r7 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r0[r9] = r10
            int r9 = r1 + 16
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r9] = r7
            int r7 = r1 + 17
            r0[r7] = r8
            r7 = r4[r12]
            int r8 = r1 + 18
            int r9 = r7 >> 8
            byte r9 = (byte) r9
            char r9 = (char) r9
            r0[r8] = r9
            int r8 = r1 + 19
            byte r7 = (byte) r7
            char r7 = (char) r7
            r0[r8] = r7
            int r7 = r1 + 20
            byte r8 = (byte) r2
            char r8 = (char) r8
            r0[r7] = r8
            int r1 = r1 + 21
            r6.off = r1
            return
        Lb1:
            java.lang.String r8 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r7 = eh.a.l(r7, r8)
            j8.o.t(r7)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, boolean r15) {
            r6 = this;
            r0 = 1
            if (r15 == 0) goto L9
            if (r14 != 0) goto L7
            r1 = r0
            goto La
        L7:
            r1 = 6
            goto La
        L9:
            r1 = 0
        La:
            int r2 = r6.off
            int r3 = r2 + 25
            int r3 = r3 + r1
            int r1 = r2 + r3
            char[] r4 = r6.chars
            int r4 = r4.length
            if (r1 < r4) goto L19
            r6.ensureCapacity(r3)
        L19:
            char[] r1 = r6.chars
            char r3 = r6.quote
            r1[r2] = r3
            int r2 = r2 + r0
            int r7 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r1, r2, r7)
            r2 = 45
            r1[r7] = r2
            int[] r3 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r8 = r3[r8]
            int r4 = r7 + 1
            int r5 = r8 >> 8
            byte r5 = (byte) r5
            char r5 = (char) r5
            r1[r4] = r5
            int r4 = r7 + 2
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r4] = r8
            int r8 = r7 + 3
            r1[r8] = r2
            r8 = r3[r9]
            int r9 = r7 + 4
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            char r4 = (char) r4
            r1[r9] = r4
            int r9 = r7 + 5
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r9] = r8
            int r8 = r7 + 6
            if (r15 == 0) goto L55
            r9 = 84
            goto L57
        L55:
            r9 = 32
        L57:
            byte r9 = (byte) r9
            char r9 = (char) r9
            r1[r8] = r9
            r8 = r3[r10]
            int r9 = r7 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r1[r9] = r10
            int r9 = r7 + 8
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r9] = r8
            int r8 = r7 + 9
            r9 = 58
            r1[r8] = r9
            r8 = r3[r11]
            int r10 = r7 + 10
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            char r11 = (char) r11
            r1[r10] = r11
            int r10 = r7 + 11
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r10] = r8
            int r8 = r7 + 12
            r1[r8] = r9
            r8 = r3[r12]
            int r10 = r7 + 13
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            char r11 = (char) r11
            r1[r10] = r11
            int r10 = r7 + 14
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r10] = r8
            int r8 = r7 + 15
            if (r13 <= 0) goto Le1
            int r10 = r7 + 16
            r11 = 46
            r1[r8] = r11
            int r8 = r13 / 10
            int r11 = r8 / 10
            int r12 = r8 * 10
            int r12 = r13 - r12
            if (r12 == 0) goto Lc2
            r8 = r3[r13]
            int r11 = r8 >> 16
            byte r11 = (byte) r11
            char r11 = (char) r11
            r1[r10] = r11
            int r10 = r7 + 17
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            char r11 = (char) r11
            r1[r10] = r11
            int r10 = r7 + 18
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r10] = r8
            int r8 = r7 + 19
            goto Le1
        Lc2:
            int r12 = r11 * 10
            int r12 = r8 - r12
            if (r12 == 0) goto Ld9
            r8 = r3[r8]
            int r11 = r8 >> 8
            byte r11 = (byte) r11
            char r11 = (char) r11
            r1[r10] = r11
            int r10 = r7 + 17
            byte r8 = (byte) r8
            char r8 = (char) r8
            r1[r10] = r8
            int r8 = r7 + 18
            goto Le1
        Ld9:
            int r8 = r7 + 17
            int r11 = r11 + 48
            byte r7 = (byte) r11
            char r7 = (char) r7
            r1[r10] = r7
        Le1:
            if (r15 == 0) goto L127
            int r7 = r14 / 3600
            if (r14 != 0) goto Lef
            int r7 = r8 + 1
            r9 = 90
            r1[r8] = r9
            r8 = r7
            goto L127
        Lef:
            int r10 = java.lang.Math.abs(r7)
            if (r7 < 0) goto Lf7
            r2 = 43
        Lf7:
            r1[r8] = r2
            r10 = r3[r10]
            int r11 = r8 + 1
            int r12 = r10 >> 8
            byte r12 = (byte) r12
            char r12 = (char) r12
            r1[r11] = r12
            int r11 = r8 + 2
            byte r10 = (byte) r10
            char r10 = (char) r10
            r1[r11] = r10
            int r10 = r8 + 3
            r1[r10] = r9
            int r7 = r7 * 3600
            int r14 = r14 - r7
            int r14 = r14 / 60
            if (r14 >= 0) goto L115
            int r14 = -r14
        L115:
            r7 = r3[r14]
            int r9 = r8 + 4
            int r10 = r7 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r1[r9] = r10
            int r9 = r8 + 5
            byte r7 = (byte) r7
            char r7 = (char) r7
            r1[r9] = r7
            int r8 = r8 + 6
        L127:
            char r7 = r6.quote
            r1[r8] = r7
            int r8 = r8 + r0
            r6.off = r8
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 13
            char[] r2 = r4.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r4.ensureCapacity(r1)
        Lc:
            char[] r1 = r4.chars
            int r2 = r0 + 1
            char r3 = r4.quote
            r1[r0] = r3
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r5, r6, r7)
            char r6 = r4.quote
            r1[r5] = r6
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 10
            char[] r2 = r7.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            char[] r2 = r7.chars
            char r3 = r7.quote
            r2[r0] = r3
            if (r8 < 0) goto L66
            r4 = 9999(0x270f, float:1.4012E-41)
            if (r8 > r4) goto L66
            int r4 = r8 / 1000
            int[] r5 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            int r6 = r4 * 1000
            int r8 = r8 - r6
            r8 = r5[r8]
            int r6 = r0 + 1
            int r4 = r4 + 48
            byte r4 = (byte) r4
            char r4 = (char) r4
            r2[r6] = r4
            int r4 = r0 + 2
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r4] = r6
            int r4 = r0 + 3
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r4] = r6
            int r4 = r0 + 4
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r4] = r8
            r8 = r5[r9]
            int r9 = r0 + 5
            int r4 = r8 >> 8
            byte r4 = (byte) r4
            char r4 = (char) r4
            r2[r9] = r4
            int r9 = r0 + 6
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            r8 = r5[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            int r0 = r0 + 9
            r2[r0] = r3
            r7.off = r1
            return
        L66:
            java.lang.String r9 = "Only 4 digits numbers are supported. Provided: "
            java.lang.String r8 = eh.a.l(r8, r9)
            j8.o.t(r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDecimal(java.math.BigDecimal r9, long r10, java.text.DecimalFormat r12) {
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeDecimalNull()
            return
        L6:
            if (r12 == 0) goto L10
            java.lang.String r9 = r12.format(r9)
            r8.writeRaw(r9)
            return
        L10:
            com.alibaba.fastjson2.JSONWriter$Context r12 = r8.context
            long r0 = r12.features
            long r10 = r10 | r0
            int r12 = r9.precision()
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r0.mask
            long r0 = r0 & r10
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L26
            goto L43
        L26:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r4 = r0.mask
            long r4 = r4 & r10
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L45
            r0 = 16
            if (r12 < r0) goto L45
            java.math.BigDecimal r0 = com.alibaba.fastjson2.JSONFactory.LOW
            int r0 = r9.compareTo(r0)
            if (r0 < 0) goto L43
            java.math.BigDecimal r0 = com.alibaba.fastjson2.JSONFactory.HIGH
            int r0 = r9.compareTo(r0)
            if (r0 <= 0) goto L45
        L43:
            r0 = 1
            goto L46
        L45:
            r0 = r1
        L46:
            int r4 = r8.off
            int r12 = r12 + r4
            int r5 = r9.scale()
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 + r12
            int r5 = r5 + 7
            char[] r12 = r8.chars
            int r12 = r12.length
            if (r5 < r12) goto L5c
            r8.ensureCapacity(r5)
        L5c:
            char[] r12 = r8.chars
            r5 = 34
            if (r0 == 0) goto L67
            int r6 = r4 + 1
            r12[r4] = r5
            r4 = r6
        L67:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain
            long r6 = r6.mask
            long r10 = r10 & r6
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L75
            java.lang.String r9 = r9.toPlainString()
            goto L79
        L75:
            java.lang.String r9 = r9.toString()
        L79:
            int r10 = r9.length()
            r9.getChars(r1, r10, r12, r4)
            int r9 = r9.length()
            int r9 = r9 + r4
            if (r0 == 0) goto L8c
            int r10 = r9 + 1
            r12[r9] = r5
            r9 = r10
        L8c:
            r8.off = r9
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double r7) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            int r2 = r6.off
            int r3 = r2 + 24
            if (r0 == 0) goto L1b
            int r3 = r2 + 26
        L1b:
            char[] r4 = r6.chars
            int r4 = r4.length
            if (r3 < r4) goto L23
            r6.ensureCapacity(r3)
        L23:
            char[] r3 = r6.chars
            r4 = 34
            if (r0 == 0) goto L2e
            int r5 = r2 + 1
            r3[r2] = r4
            r2 = r5
        L2e:
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r7, r3, r2, r1)
            int r7 = r7 + r2
            if (r0 == 0) goto L3a
            int r8 = r7 + 1
            r3[r7] = r4
            r7 = r8
        L3a:
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double[] r9) {
            r8 = this;
            if (r9 != 0) goto L6
            r8.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r8.off
            int r4 = r9.length
            r5 = 27
            int r4 = p.a.g(r4, r5, r3, r2)
            char[] r5 = r8.chars
            int r5 = r5.length
            if (r4 < r5) goto L2b
            r8.ensureCapacity(r4)
        L2b:
            char[] r4 = r8.chars
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L33:
            int r3 = r9.length
            if (r1 >= r3) goto L5a
            if (r1 == 0) goto L3f
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L3f:
            r3 = 34
            if (r0 == 0) goto L48
            int r6 = r5 + 1
            r4[r5] = r3
            r5 = r6
        L48:
            r6 = r9[r1]
            int r6 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r6, r4, r5, r2)
            int r6 = r6 + r5
            if (r0 == 0) goto L56
            int r5 = r6 + 1
            r4[r6] = r3
            goto L57
        L56:
            r5 = r6
        L57:
            int r1 = r1 + 1
            goto L33
        L5a:
            r9 = 93
            r4[r5] = r9
            int r5 = r5 + r2
            r8.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDoubleArray(double r7, double r9) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            int r2 = r6.off
            int r3 = r2 + 51
            if (r0 == 0) goto L1b
            int r3 = r2 + 53
        L1b:
            r6.ensureCapacity(r3)
            char[] r3 = r6.chars
            int r4 = r2 + 1
            r5 = 91
            r3[r2] = r5
            r5 = 34
            if (r0 == 0) goto L2f
            int r2 = r2 + 2
            r3[r4] = r5
            r4 = r2
        L2f:
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r7, r3, r4, r1)
            int r7 = r7 + r4
            if (r0 == 0) goto L3b
            int r8 = r7 + 1
            r3[r7] = r5
            r7 = r8
        L3b:
            int r8 = r7 + 1
            r2 = 44
            r3[r7] = r2
            if (r0 == 0) goto L48
            int r7 = r7 + 2
            r3[r8] = r5
            r8 = r7
        L48:
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r9, r3, r8, r1)
            int r7 = r7 + r8
            if (r0 == 0) goto L54
            int r8 = r7 + 1
            r3[r7] = r5
            r7 = r8
        L54:
            r8 = 93
            r3[r7] = r8
            int r7 = r7 + r1
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float r7) {
            r6 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = 0
        L13:
            int r2 = r6.off
            int r3 = r2 + 15
            if (r0 == 0) goto L1b
            int r3 = r2 + 17
        L1b:
            r6.ensureCapacity(r3)
            char[] r3 = r6.chars
            r4 = 34
            if (r0 == 0) goto L29
            int r5 = r2 + 1
            r3[r2] = r4
            r2 = r5
        L29:
            int r7 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r7, r3, r2, r1)
            int r7 = r7 + r2
            if (r0 == 0) goto L35
            int r0 = r7 + 1
            r3[r7] = r4
            r7 = r0
        L35:
            r6.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeArrayNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r7.off
            int r4 = r8.length
            if (r0 == 0) goto L22
            r5 = 16
            goto L24
        L22:
            r5 = 18
        L24:
            int r4 = p.a.g(r4, r5, r3, r2)
            char[] r5 = r7.chars
            int r5 = r5.length
            if (r4 < r5) goto L30
            r7.ensureCapacity(r4)
        L30:
            char[] r4 = r7.chars
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L38:
            int r3 = r8.length
            if (r1 >= r3) goto L5f
            if (r1 == 0) goto L44
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L44:
            r3 = 34
            if (r0 == 0) goto L4d
            int r6 = r5 + 1
            r4[r5] = r3
            r5 = r6
        L4d:
            r6 = r8[r1]
            int r6 = com.alibaba.fastjson2.util.DoubleToDecimal.toString(r6, r4, r5, r2)
            int r6 = r6 + r5
            if (r0 == 0) goto L5b
            int r5 = r6 + 1
            r4[r6] = r3
            goto L5c
        L5b:
            r5 = r6
        L5c:
            int r1 = r1 + 1
            goto L38
        L5f:
            r8 = 93
            r4[r5] = r8
            int r5 = r5 + r2
            r7.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeHex(byte[] r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeNull()
            return
        L6:
            int r0 = r11.length
            int r0 = r0 * 2
            int r0 = r0 + 3
            int r1 = r10.off
            int r0 = r0 + r1
            int r0 = r0 + 2
            r10.ensureCapacity(r0)
            char[] r0 = r10.chars
            r2 = 120(0x78, float:1.68E-43)
            r0[r1] = r2
            int r2 = r1 + 1
            r3 = 39
            r0[r2] = r3
            int r1 = r1 + 2
            r2 = 0
        L22:
            int r4 = r11.length
            if (r2 >= r4) goto L4a
            r4 = r11[r2]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r5 >> 4
            r4 = r4 & 15
            r6 = 55
            r7 = 48
            r8 = 10
            if (r5 >= r8) goto L37
            r9 = r7
            goto L38
        L37:
            r9 = r6
        L38:
            int r5 = r5 + r9
            char r5 = (char) r5
            r0[r1] = r5
            int r5 = r1 + 1
            if (r4 >= r8) goto L41
            r6 = r7
        L41:
            int r4 = r4 + r6
            char r4 = (char) r4
            r0[r5] = r4
            int r1 = r1 + 2
            int r2 = r2 + 1
            goto L22
        L4a:
            r0[r1] = r3
            int r1 = r1 + 1
            r10.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 7
            char[] r3 = r5.chars
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            char[] r2 = r5.chars
            if (r0 == 0) goto L29
            int r3 = r1 + 1
            char r4 = r5.quote
            r2[r1] = r4
            r1 = r3
        L29:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L36
            int r0 = r6 + 1
            char r1 = r5.quote
            r2[r6] = r1
            r6 = r0
        L36:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 13
            char[] r3 = r5.chars
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            char[] r2 = r5.chars
            if (r0 == 0) goto L29
            int r3 = r1 + 1
            char r4 = r5.quote
            r2[r1] = r4
            r1 = r3
        L29:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L36
            int r0 = r6 + 1
            char r1 = r5.quote
            r2[r6] = r1
            r6 = r0
        L36:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            int r3 = r7.off
            int r4 = r8.length
            r5 = 13
            r6 = 2
            int r4 = p.a.g(r4, r5, r3, r6)
            char[] r5 = r7.chars
            int r5 = r5.length
            if (r4 < r5) goto L2c
            r7.ensureCapacity(r4)
        L2c:
            char[] r4 = r7.chars
            int r5 = r3 + 1
            r6 = 91
            r4[r3] = r6
        L34:
            int r3 = r8.length
            if (r1 >= r3) goto L5c
            if (r1 == 0) goto L40
            int r3 = r5 + 1
            r6 = 44
            r4[r5] = r6
            r5 = r3
        L40:
            if (r0 == 0) goto L49
            int r3 = r5 + 1
            char r6 = r7.quote
            r4[r5] = r6
            r5 = r3
        L49:
            r3 = r8[r1]
            int r3 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r4, r5, r3)
            if (r0 == 0) goto L58
            int r5 = r3 + 1
            char r6 = r7.quote
            r4[r3] = r6
            goto L59
        L58:
            r5 = r3
        L59:
            int r1 = r1 + 1
            goto L34
        L5c:
            r8 = 93
            r4[r5] = r8
            int r5 = r5 + r2
            r7.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long r10) {
            r9 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r4 = r4.mask
            long r2 = r2 | r4
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L32
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r2.mask
            long r2 = r2 & r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L30
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 > 0) goto L32
            r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L30
            goto L32
        L30:
            r2 = 0
            goto L33
        L32:
            r2 = 1
        L33:
            int r3 = r9.off
            int r6 = r3 + 23
            char[] r7 = r9.chars
            int r7 = r7.length
            if (r6 < r7) goto L3f
            r9.ensureCapacity(r6)
        L3f:
            char[] r6 = r9.chars
            if (r2 == 0) goto L4a
            int r7 = r3 + 1
            char r8 = r9.quote
            r6[r3] = r8
            r3 = r7
        L4a:
            int r3 = com.alibaba.fastjson2.util.IOUtils.writeInt64(r6, r3, r10)
            if (r2 == 0) goto L58
            int r10 = r3 + 1
            char r11 = r9.quote
            r6[r3] = r11
        L56:
            r3 = r10
            goto L7f
        L58:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r7 = r2.mask
            long r7 = r7 & r0
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L7f
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteNumberClassName
            long r7 = r2.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L7f
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L7f
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L7f
            int r10 = r3 + 1
            r11 = 76
            r6[r3] = r11
            goto L56
        L7f:
            r9.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long[] r13) {
            r12 = this;
            if (r13 != 0) goto L6
            r12.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r12.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r7 = r7.mask
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteLongAsString
            long r9 = r9.mask
            long r7 = r7 | r9
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            r0 = r6
            goto L2b
        L2a:
            r0 = r3
        L2b:
            int r1 = r12.off
            int r4 = r1 + 2
            int r5 = r13.length
            int r5 = r5 * 23
            int r5 = r5 + r4
            char[] r4 = r12.chars
            int r4 = r4.length
            if (r5 < r4) goto L3b
            r12.ensureCapacity(r5)
        L3b:
            char[] r4 = r12.chars
            int r5 = r1 + 1
            r7 = 91
            r4[r1] = r7
            r1 = r3
        L44:
            int r7 = r13.length
            if (r1 >= r7) goto L85
            if (r1 == 0) goto L50
            int r7 = r5 + 1
            r8 = 44
            r4[r5] = r8
            r5 = r7
        L50:
            r7 = r13[r1]
            if (r0 != 0) goto L6b
            if (r2 == 0) goto L69
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 > 0) goto L69
            r9 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L69
            goto L6b
        L69:
            r9 = r3
            goto L6c
        L6b:
            r9 = r6
        L6c:
            if (r9 == 0) goto L75
            int r10 = r5 + 1
            char r11 = r12.quote
            r4[r5] = r11
            r5 = r10
        L75:
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeInt64(r4, r5, r7)
            if (r9 == 0) goto L82
            int r7 = r5 + 1
            char r8 = r12.quote
            r4[r5] = r8
            r5 = r7
        L82:
            int r1 = r1 + 1
            goto L44
        L85:
            r13 = 93
            r4[r5] = r13
            int r5 = r5 + r6
            r12.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r5.off
            int r2 = r1 + 7
            char[] r3 = r5.chars
            int r3 = r3.length
            if (r2 < r3) goto L1e
            r5.ensureCapacity(r2)
        L1e:
            char[] r2 = r5.chars
            if (r0 == 0) goto L29
            int r3 = r1 + 1
            char r4 = r5.quote
            r2[r1] = r4
            r1 = r3
        L29:
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeInt32(r2, r1, r6)
            if (r0 == 0) goto L36
            int r0 = r6 + 1
            char r1 = r5.quote
            r2[r6] = r1
            r6 = r0
        L36:
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDate(java.time.LocalDate r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            java.lang.String r1 = r0.dateFormat
            if (r1 == 0) goto L13
            boolean r0 = r4.writeLocalDateWithFormat(r5, r0)
            if (r0 == 0) goto L13
            return
        L13:
            int r0 = r4.off
            int r1 = r0 + 18
            char[] r2 = r4.chars
            int r2 = r2.length
            if (r1 < r2) goto L1f
            r4.ensureCapacity(r1)
        L1f:
            char[] r1 = r4.chars
            int r2 = r0 + 1
            char r3 = r4.quote
            r1[r0] = r3
            int r0 = r5.getYear()
            int r3 = r5.getMonthValue()
            int r5 = r5.getDayOfMonth()
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r0, r3, r5)
            char r0 = r4.quote
            r1[r5] = r0
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(java.time.LocalDateTime r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 38
            char[] r2 = r5.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r5.ensureCapacity(r1)
        Lc:
            char[] r1 = r5.chars
            int r2 = r0 + 1
            char r3 = r5.quote
            r1[r0] = r3
            java.time.LocalDate r0 = r6.toLocalDate()
            int r3 = r0.getYear()
            int r4 = r0.getMonthValue()
            int r0 = r0.getDayOfMonth()
            int r0 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r1, r2, r3, r4, r0)
            int r2 = r0 + 1
            r3 = 32
            r1[r0] = r3
            java.time.LocalTime r6 = r6.toLocalTime()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r2, r6)
            char r0 = r5.quote
            r1[r6] = r0
            int r6 = r6 + 1
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeLocalTime(java.time.LocalTime r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 20
            char[] r2 = r4.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r4.ensureCapacity(r1)
        Lc:
            char[] r1 = r4.chars
            int r2 = r0 + 1
            char r3 = r4.quote
            r1[r0] = r3
            int r5 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r1, r2, r5)
            char r0 = r4.quote
            r1[r5] = r0
            int r5 = r5 + 1
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 18
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 13
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 18
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 14
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 18
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 15
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 18
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 16
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 19
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 16
            r9 = 58
            r2[r3] = r9
            int r3 = r0 + 17
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 20
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1f
            r1 = 0
            r8.startObject = r1
        L1b:
            r4 = r9
            r6 = r11
            r3 = r0
            goto L31
        L1f:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2e
            int r0 = r8.indent(r2, r1)
            goto L1b
        L2e:
            r4 = r9
            r6 = r11
            r3 = r1
        L31:
            putLong(r2, r3, r4, r6)
            r0 = r3
            int r3 = r0 + 16
            char r9 = r8.quote
            r2[r3] = r9
            int r3 = r0 + 17
            r9 = 58
            r2[r3] = r9
            int r3 = r0 + 18
            r8.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long r9, long r11) {
            r8 = this;
            int r0 = r8.off
            int r1 = r0 + 21
            byte r2 = r8.pretty
            int r3 = r8.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r8.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r8.grow(r2)
        L13:
            r2 = r1
            boolean r1 = r8.startObject
            if (r1 == 0) goto L1c
            r1 = 0
            r8.startObject = r1
            goto L2c
        L1c:
            int r1 = r0 + 1
            r3 = 44
            r2[r0] = r3
            byte r0 = r8.pretty
            if (r0 == 0) goto L2b
            int r0 = r8.indent(r2, r1)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            int r3 = r0 + 1
            char r1 = r8.quote
            r2[r0] = r1
            r4 = r9
            r6 = r11
            putLong(r2, r3, r4, r6)
            int r9 = r0 + 17
            char r10 = r8.quote
            r2[r9] = r10
            int r9 = r0 + 18
            r10 = 58
            r2[r9] = r10
            int r0 = r0 + 19
            r8.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 10
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r0 = r0 + 5
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeName3Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 10
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r0 = r0 + 6
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 10
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r0 = r0 + 7
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 10
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r0 = r0 + 8
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 11
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r5 = r0 + 8
            r6 = 58
            r1[r5] = r6
            int r0 = r0 + 9
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 12
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5)
            int r5 = r0 + 8
            char r6 = r4.quote
            r1[r5] = r6
            int r5 = r0 + 9
            r6 = 58
            r1[r5] = r6
            int r0 = r0 + 10
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 13
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            int r2 = r0 + 1
            char r3 = r4.quote
            r1[r0] = r3
            putLong(r1, r2, r5)
            int r5 = r0 + 9
            char r6 = r4.quote
            r1[r5] = r6
            int r5 = r0 + 10
            r6 = 58
            r1[r5] = r6
            int r0 = r0 + 11
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long r5, int r7) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 14
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L13
            char[] r1 = r4.grow(r2)
        L13:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1b
            r2 = 0
            r4.startObject = r2
            goto L2b
        L1b:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            byte r0 = r4.pretty
            if (r0 == 0) goto L2a
            int r0 = r4.indent(r1, r2)
            goto L2b
        L2a:
            r0 = r2
        L2b:
            putLong(r1, r0, r5, r7)
            int r0 = r0 + 12
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r6.length
            int r1 = r1 + r0
            int r1 = r1 + 2
            byte r2 = r5.pretty
            int r3 = r5.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r5.chars
            int r3 = r1.length
            if (r2 <= r3) goto L15
            char[] r1 = r5.grow(r2)
        L15:
            boolean r2 = r5.startObject
            r3 = 0
            if (r2 == 0) goto L1d
            r5.startObject = r3
            goto L2d
        L1d:
            int r2 = r0 + 1
            r4 = 44
            r1[r0] = r4
            byte r0 = r5.pretty
            if (r0 == 0) goto L2c
            int r0 = r5.indent(r1, r2)
            goto L2d
        L2c:
            r0 = r2
        L2d:
            int r2 = r6.length
            java.lang.System.arraycopy(r6, r3, r1, r0, r2)
            int r6 = r6.length
            int r0 = r0 + r6
            r5.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r5, int r6, int r7) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + r7
            int r1 = r1 + 2
            byte r2 = r4.pretty
            int r3 = r4.level
            int r2 = r2 * r3
            int r2 = r2 + r1
            char[] r1 = r4.chars
            int r3 = r1.length
            if (r2 <= r3) goto L15
            char[] r1 = r4.grow(r2)
        L15:
            boolean r2 = r4.startObject
            if (r2 == 0) goto L1d
            r2 = 0
            r4.startObject = r2
            goto L24
        L1d:
            int r2 = r0 + 1
            r3 = 44
            r1[r0] = r3
            r0 = r2
        L24:
            java.lang.System.arraycopy(r5, r6, r1, r0, r7)
            int r0 = r0 + r7
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetDateTime(java.time.OffsetDateTime r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            java.time.ZoneOffset r0 = r7.getOffset()
            int r1 = r6.off
            int r2 = r1 + 45
            char[] r3 = r6.chars
            int r3 = r3.length
            if (r2 < r3) goto L16
            r6.ensureCapacity(r2)
        L16:
            char[] r2 = r6.chars
            int r3 = r1 + 1
            char r4 = r6.quote
            r2[r1] = r4
            java.time.LocalDateTime r7 = r7.toLocalDateTime()
            java.time.LocalDate r1 = r7.toLocalDate()
            int r4 = r1.getYear()
            int r5 = r1.getMonthValue()
            int r1 = r1.getDayOfMonth()
            int r1 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r2, r3, r4, r5, r1)
            int r3 = r1 + 1
            r4 = 84
            r2[r1] = r4
            java.time.LocalTime r7 = r7.toLocalTime()
            int r7 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r2, r3, r7)
            int r1 = r0.getTotalSeconds()
            if (r1 != 0) goto L51
            int r0 = r7 + 1
            r1 = 90
            r2[r7] = r1
            goto L62
        L51:
            java.lang.String r0 = r0.getId()
            r1 = 0
            int r3 = r0.length()
            r0.getChars(r1, r3, r2, r7)
            int r0 = r0.length()
            int r0 = r0 + r7
        L62:
            char r7 = r6.quote
            r2[r0] = r7
            int r0 = r0 + 1
            r6.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeOffsetTime(java.time.OffsetTime r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeNull()
            return
        L6:
            java.time.ZoneOffset r0 = r6.getOffset()
            int r1 = r5.off
            int r2 = r1 + 25
            char[] r3 = r5.chars
            int r3 = r3.length
            if (r2 < r3) goto L16
            r5.ensureCapacity(r2)
        L16:
            char[] r2 = r5.chars
            int r3 = r1 + 1
            char r4 = r5.quote
            r2[r1] = r4
            java.time.LocalTime r6 = r6.toLocalTime()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r2, r3, r6)
            int r1 = r0.getTotalSeconds()
            if (r1 != 0) goto L33
            int r0 = r6 + 1
            r1 = 90
            r2[r6] = r1
            goto L44
        L33:
            java.lang.String r0 = r0.getId()
            r1 = 0
            int r3 = r0.length()
            r0.getChars(r1, r3, r2, r6)
            int r0 = r0.length()
            int r0 = r0 + r6
        L44:
            char r6 = r5.quote
            r2[r0] = r6
            int r0 = r0 + 1
            r5.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char r4) {
            r3 = this;
            int r0 = r3.off
            char[] r1 = r3.chars
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            char[] r0 = r3.chars
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r0[r1] = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char r4, char r5) {
            r3 = this;
            int r0 = r3.off
            int r1 = r0 + 1
            char[] r2 = r3.chars
            int r2 = r2.length
            if (r1 < r2) goto Le
            int r2 = r0 + 2
            r3.ensureCapacity(r2)
        Le:
            char[] r2 = r3.chars
            r2[r0] = r4
            r2[r1] = r5
            int r0 = r0 + 2
            r3.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(java.lang.String r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r5.length()
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r0 = r5.length()
            char[] r1 = r4.chars
            int r2 = r4.off
            r3 = 0
            r5.getChars(r3, r0, r1, r2)
            int r0 = r4.off
            int r5 = r5.length()
            int r5 = r5 + r0
            r4.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.off
            int r0 = r0 + r5
            char[] r1 = r2.chars
            int r1 = r1.length
            if (r0 < r1) goto Lb
            r2.ensureCapacity(r0)
        Lb:
            char[] r0 = r2.chars
            int r1 = r2.off
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            int r3 = r2.off
            int r3 = r3 + r5
            r2.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(java.lang.String r6) {
            r5 = this;
            r5.lastReference = r6
            int r0 = r5.off
            char[] r1 = r5.chars
            int r2 = r0 + 9
            int r3 = r1.length
            if (r2 <= r3) goto Lf
            char[] r1 = r5.grow(r2)
        Lf:
            r2 = 123(0x7b, float:1.72E-43)
            r1[r0] = r2
            int r2 = r0 + 1
            r3 = 34
            r1[r2] = r3
            int r2 = r0 + 2
            r4 = 36
            r1[r2] = r4
            int r2 = r0 + 3
            r4 = 114(0x72, float:1.6E-43)
            r1[r2] = r4
            int r2 = r0 + 4
            r4 = 101(0x65, float:1.42E-43)
            r1[r2] = r4
            int r2 = r0 + 5
            r4 = 102(0x66, float:1.43E-43)
            r1[r2] = r4
            int r2 = r0 + 6
            r1[r2] = r3
            int r2 = r0 + 7
            r3 = 58
            r1[r2] = r3
            int r0 = r0 + 8
            r5.off = r0
            r5.writeString(r6)
            int r6 = r5.off
            char[] r0 = r5.chars
            int r1 = r0.length
            if (r6 != r1) goto L4f
            int r0 = r6 + 1
            char[] r0 = r5.grow(r0)
        L4f:
            r1 = 125(0x7d, float:1.75E-43)
            r0[r6] = r1
            int r6 = r6 + 1
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(byte r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt8(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(int r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt32(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(long r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt64(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String r10) {
            r9 = this;
            if (r10 != 0) goto L6
            r9.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r7 = r7.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
            r0 = r6
            goto L26
        L25:
            r0 = r3
        L26:
            char r1 = r9.quote
            int r4 = r10.length()
            int r5 = r9.off
            int r5 = r5 + r4
            int r5 = r5 + 2
            char[] r7 = r9.chars
            int r7 = r7.length
            if (r5 < r7) goto L39
            r9.ensureCapacity(r5)
        L39:
            r5 = r3
        L3a:
            if (r5 >= r4) goto L6a
            char r7 = r10.charAt(r5)
            r8 = 92
            if (r7 == r8) goto L66
            if (r7 == r1) goto L66
            r8 = 32
            if (r7 < r8) goto L66
            if (r0 == 0) goto L5c
            r8 = 60
            if (r7 == r8) goto L66
            r8 = 62
            if (r7 == r8) goto L66
            r8 = 40
            if (r7 == r8) goto L66
            r8 = 41
            if (r7 == r8) goto L66
        L5c:
            if (r2 == 0) goto L63
            r8 = 127(0x7f, float:1.78E-43)
            if (r7 <= r8) goto L63
            goto L66
        L63:
            int r5 = r5 + 1
            goto L3a
        L66:
            r9.writeStringEscape(r10)
            return
        L6a:
            int r0 = r9.off
            char[] r2 = r9.chars
            int r5 = r0 + 1
            r2[r0] = r1
            r10.getChars(r3, r4, r2, r5)
            int r5 = r5 + r4
            r2[r5] = r1
            int r5 = r5 + r6
            r9.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.util.List<java.lang.String> r6) {
            r5 = this;
            byte r0 = r5.pretty
            if (r0 == 0) goto L8
            super.writeString(r6)
            return
        L8:
            int r0 = r5.off
            char[] r1 = r5.chars
            int r1 = r1.length
            if (r0 != r1) goto L14
            int r0 = r0 + 1
            r5.ensureCapacity(r0)
        L14:
            char[] r0 = r5.chars
            int r1 = r5.off
            int r2 = r1 + 1
            r5.off = r2
            r2 = 91
            r0[r1] = r2
            int r0 = r6.size()
            r1 = 0
        L25:
            if (r1 >= r0) goto L4d
            if (r1 == 0) goto L41
            int r2 = r5.off
            char[] r3 = r5.chars
            int r3 = r3.length
            if (r2 != r3) goto L35
            int r2 = r2 + 1
            r5.ensureCapacity(r2)
        L35:
            char[] r2 = r5.chars
            int r3 = r5.off
            int r4 = r3 + 1
            r5.off = r4
            r4 = 44
            r2[r3] = r4
        L41:
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r5.writeString(r2)
            int r1 = r1 + 1
            goto L25
        L4d:
            int r6 = r5.off
            char[] r0 = r5.chars
            int r0 = r0.length
            if (r6 != r0) goto L59
            int r6 = r6 + 1
            r5.ensureCapacity(r6)
        L59:
            char[] r6 = r5.chars
            int r0 = r5.off
            int r1 = r0 + 1
            r5.off = r1
            r1 = 93
            r6[r0] = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeString(short r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r4.writeQuote()
        L17:
            r4.writeInt16(r5)
            if (r0 == 0) goto L1f
            r4.writeQuote()
        L1f:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean r4) {
            r3 = this;
            char[] r0 = r3.chars
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            char r2 = r3.quote
            r0[r1] = r2
            r3.writeBool(r4)
            char[] r4 = r3.chars
            int r0 = r3.off
            int r1 = r0 + 1
            r3.off = r1
            char r1 = r3.quote
            r4[r0] = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r10) {
            r9 = this;
            if (r10 != 0) goto L6
            r9.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r7 = r7.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
            r0 = r6
            goto L26
        L25:
            r0 = r3
        L26:
            r1 = r3
        L27:
            int r4 = r10.length
            if (r1 >= r4) goto L4f
            char r4 = r10[r1]
            r5 = 92
            if (r4 == r5) goto L50
            char r5 = r9.quote
            if (r4 == r5) goto L50
            r5 = 32
            if (r4 >= r5) goto L39
            goto L50
        L39:
            if (r2 == 0) goto L4c
            r5 = 60
            if (r4 == r5) goto L50
            r5 = 62
            if (r4 == r5) goto L50
            r5 = 40
            if (r4 == r5) goto L50
            r5 = 41
            if (r4 != r5) goto L4c
            goto L50
        L4c:
            int r1 = r1 + 1
            goto L27
        L4f:
            r6 = r0
        L50:
            if (r6 != 0) goto L7f
            int r0 = r9.off
            int r1 = r10.length
            int r0 = r0 + r1
            int r0 = r0 + 2
            char[] r1 = r9.chars
            int r1 = r1.length
            if (r0 <= r1) goto L60
            r9.ensureCapacity(r0)
        L60:
            char[] r0 = r9.chars
            int r1 = r9.off
            int r2 = r1 + 1
            r9.off = r2
            char r4 = r9.quote
            r0[r1] = r4
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r3, r0, r2, r1)
            int r0 = r9.off
            int r10 = r10.length
            int r0 = r0 + r10
            char[] r10 = r9.chars
            int r1 = r0 + 1
            r9.off = r1
            char r1 = r9.quote
            r10[r0] = r1
            return
        L7f:
            r9.writeStringEscape(r10)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r6, int r7, int r8) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = 0
        L19:
            r2 = r7
        L1a:
            if (r2 >= r8) goto L2e
            char r3 = r6[r2]
            r4 = 92
            if (r3 == r4) goto L2f
            char r4 = r5.quote
            if (r3 == r4) goto L2f
            r4 = 32
            if (r3 >= r4) goto L2b
            goto L2f
        L2b:
            int r2 = r2 + 1
            goto L1a
        L2e:
            r1 = r0
        L2f:
            if (r1 != 0) goto L5b
            int r0 = r5.off
            int r0 = r0 + r8
            int r0 = r0 + 2
            char[] r1 = r5.chars
            int r1 = r1.length
            if (r0 < r1) goto L3e
            r5.ensureCapacity(r0)
        L3e:
            char[] r0 = r5.chars
            int r1 = r5.off
            int r2 = r1 + 1
            r5.off = r2
            char r3 = r5.quote
            r0[r1] = r3
            java.lang.System.arraycopy(r6, r7, r0, r2, r8)
            int r6 = r5.off
            int r6 = r6 + r8
            char[] r7 = r5.chars
            int r8 = r6 + 1
            r5.off = r8
            char r8 = r5.quote
            r7[r6] = r8
            return
        L5b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r7, r8)
            r5.writeStringEscape(r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r10, int r11, int r12, boolean r13) {
            r9 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            char r1 = r9.quote
            int r2 = r9.off
            if (r13 == 0) goto L1b
            int r3 = r2 + 2
            goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r0 == 0) goto L22
            int r4 = r12 * 6
        L20:
            int r4 = r4 + r3
            goto L25
        L22:
            int r4 = r12 * 2
            goto L20
        L25:
            char[] r3 = r9.chars
            int r3 = r3.length
            int r3 = r4 - r3
            if (r3 <= 0) goto L2f
            r9.ensureCapacity(r4)
        L2f:
            char[] r3 = r9.chars
            if (r13 == 0) goto L38
            int r4 = r2 + 1
            r3[r2] = r1
            r2 = r4
        L38:
            int r12 = r12 + r11
            int r4 = r10.length
            int r12 = java.lang.Math.min(r12, r4)
        L3e:
            if (r11 >= r12) goto L147
            char r4 = r10[r11]
            r5 = 34
            r6 = 92
            if (r4 == r5) goto L136
            r5 = 39
            if (r4 == r5) goto L136
            if (r4 == r6) goto L12f
            r5 = 49
            r7 = 117(0x75, float:1.64E-43)
            r8 = 48
            switch(r4) {
                case 0: goto L114;
                case 1: goto L114;
                case 2: goto L114;
                case 3: goto L114;
                case 4: goto L114;
                case 5: goto L114;
                case 6: goto L114;
                case 7: goto L114;
                case 8: goto L10b;
                case 9: goto L102;
                case 10: goto Lf9;
                case 11: goto Ldf;
                case 12: goto Ld6;
                case 13: goto Lca;
                case 14: goto Ldf;
                case 15: goto Ldf;
                case 16: goto Lb0;
                case 17: goto Lb0;
                case 18: goto Lb0;
                case 19: goto Lb0;
                case 20: goto Lb0;
                case 21: goto Lb0;
                case 22: goto Lb0;
                case 23: goto Lb0;
                case 24: goto Lb0;
                case 25: goto Lb0;
                case 26: goto L96;
                case 27: goto L96;
                case 28: goto L96;
                case 29: goto L96;
                case 30: goto L96;
                case 31: goto L96;
                default: goto L57;
            }
        L57:
            if (r0 == 0) goto L8f
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 <= r5) goto L8f
            r3[r2] = r6
            int r5 = r2 + 1
            r3[r5] = r7
            int r5 = r2 + 2
            char[] r6 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r7 = r4 >>> 12
            r7 = r7 & 15
            char r7 = r6[r7]
            r3[r5] = r7
            int r5 = r2 + 3
            int r7 = r4 >>> 8
            r7 = r7 & 15
            char r7 = r6[r7]
            r3[r5] = r7
            int r5 = r2 + 4
            int r7 = r4 >>> 4
            r7 = r7 & 15
            char r7 = r6[r7]
            r3[r5] = r7
            int r5 = r2 + 5
            r4 = r4 & 15
            char r4 = r6[r4]
            r3[r5] = r4
        L8b:
            int r2 = r2 + 6
            goto L143
        L8f:
            int r5 = r2 + 1
            r3[r2] = r4
        L93:
            r2 = r5
            goto L143
        L96:
            r3[r2] = r6
            int r6 = r2 + 1
            r3[r6] = r7
            int r6 = r2 + 2
            r3[r6] = r8
            int r6 = r2 + 3
            r3[r6] = r8
            int r6 = r2 + 4
            r3[r6] = r5
            int r5 = r2 + 5
            int r4 = r4 + 71
            char r4 = (char) r4
            r3[r5] = r4
            goto L8b
        Lb0:
            r3[r2] = r6
            int r6 = r2 + 1
            r3[r6] = r7
            int r6 = r2 + 2
            r3[r6] = r8
            int r6 = r2 + 3
            r3[r6] = r8
            int r6 = r2 + 4
            r3[r6] = r5
            int r5 = r2 + 5
            int r4 = r4 + 32
            char r4 = (char) r4
            r3[r5] = r4
            goto L8b
        Lca:
            r3[r2] = r6
            int r4 = r2 + 1
            r5 = 114(0x72, float:1.6E-43)
            r3[r4] = r5
        Ld2:
            int r2 = r2 + 2
            goto L143
        Ld6:
            r3[r2] = r6
            int r4 = r2 + 1
            r5 = 102(0x66, float:1.43E-43)
            r3[r4] = r5
            goto Ld2
        Ldf:
            r3[r2] = r6
            int r5 = r2 + 1
            r3[r5] = r7
            int r5 = r2 + 2
            r3[r5] = r8
            int r5 = r2 + 3
            r3[r5] = r8
            int r5 = r2 + 4
            r3[r5] = r8
            int r5 = r2 + 5
            int r4 = r4 + 87
            char r4 = (char) r4
            r3[r5] = r4
            goto L8b
        Lf9:
            r3[r2] = r6
            int r4 = r2 + 1
            r5 = 110(0x6e, float:1.54E-43)
            r3[r4] = r5
            goto Ld2
        L102:
            r3[r2] = r6
            int r4 = r2 + 1
            r5 = 116(0x74, float:1.63E-43)
            r3[r4] = r5
            goto Ld2
        L10b:
            r3[r2] = r6
            int r4 = r2 + 1
            r5 = 98
            r3[r4] = r5
            goto Ld2
        L114:
            r3[r2] = r6
            int r5 = r2 + 1
            r3[r5] = r7
            int r5 = r2 + 2
            r3[r5] = r8
            int r5 = r2 + 3
            r3[r5] = r8
            int r5 = r2 + 4
            r3[r5] = r8
            int r5 = r2 + 5
            int r4 = r4 + 48
            char r4 = (char) r4
            r3[r5] = r4
            goto L8b
        L12f:
            r3[r2] = r6
            int r5 = r2 + 1
            r3[r5] = r4
            goto Ld2
        L136:
            if (r4 != r1) goto L13d
            int r5 = r2 + 1
            r3[r2] = r6
            r2 = r5
        L13d:
            int r5 = r2 + 1
            r3[r2] = r4
            goto L93
        L143:
            int r11 = r11 + 1
            goto L3e
        L147:
            if (r13 == 0) goto L14e
            int r10 = r2 + 1
            r3[r2] = r1
            r2 = r10
        L14e:
            r9.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String[] r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeArrayNull()
            return
        L6:
            r5.startArray()
            r0 = 0
        La:
            int r1 = r6.length
            if (r0 >= r1) goto L35
            if (r0 == 0) goto L12
            r5.writeComma()
        L12:
            r1 = r6[r0]
            if (r1 != 0) goto L2f
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r1 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r3 = r3.mask
            long r1 = r1 | r3
            boolean r1 = r5.isEnabled(r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = ""
            r5.writeString(r1)
            goto L32
        L2b:
            r5.writeNull()
            goto L32
        L2f:
            r5.writeString(r1)
        L32:
            int r0 = r0 + 1
            goto La
        L35:
            r5.endArray()
            return
    }

    public final void writeStringEscape(java.lang.String r14) {
            r13 = this;
            int r0 = r14.length()
            char r1 = r13.quote
            com.alibaba.fastjson2.JSONWriter$Context r2 = r13.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r4 = r4.mask
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L19
            r4 = r8
            goto L1a
        L19:
            r4 = r5
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r9 = r9.mask
            long r2 = r2 & r9
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L25
            r2 = r8
            goto L26
        L25:
            r2 = r5
        L26:
            int r3 = r13.off
            r6 = 6
            r7 = 2
            int r6 = p.a.g(r0, r6, r3, r7)
            r13.ensureCapacity(r6)
            char[] r6 = r13.chars
            int r7 = r3 + 1
            r6[r3] = r1
        L37:
            if (r5 >= r0) goto L175
            char r3 = r14.charAt(r5)
            r9 = 34
            r10 = 92
            if (r3 == r9) goto L164
            r9 = 60
            r11 = 117(0x75, float:1.64E-43)
            r12 = 48
            if (r3 == r9) goto L138
            r9 = 62
            if (r3 == r9) goto L138
            if (r3 == r10) goto L131
            r9 = 49
            switch(r3) {
                case 0: goto L116;
                case 1: goto L116;
                case 2: goto L116;
                case 3: goto L116;
                case 4: goto L116;
                case 5: goto L116;
                case 6: goto L116;
                case 7: goto L116;
                case 8: goto L10d;
                case 9: goto L104;
                case 10: goto Lfb;
                case 11: goto Le1;
                case 12: goto Ld8;
                case 13: goto Lcc;
                case 14: goto Le1;
                case 15: goto Le1;
                case 16: goto Lb2;
                case 17: goto Lb2;
                case 18: goto Lb2;
                case 19: goto Lb2;
                case 20: goto Lb2;
                case 21: goto Lb2;
                case 22: goto Lb2;
                case 23: goto Lb2;
                case 24: goto Lb2;
                case 25: goto Lb2;
                case 26: goto L98;
                case 27: goto L98;
                case 28: goto L98;
                case 29: goto L98;
                case 30: goto L98;
                case 31: goto L98;
                default: goto L56;
            }
        L56:
            switch(r3) {
                case 39: goto L164;
                case 40: goto L138;
                case 41: goto L138;
                default: goto L59;
            }
        L59:
            if (r4 == 0) goto L91
            r9 = 127(0x7f, float:1.78E-43)
            if (r3 <= r9) goto L91
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 12
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 3
            int r11 = r3 >>> 8
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 4
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
        L8d:
            int r7 = r7 + 6
            goto L171
        L91:
            int r9 = r7 + 1
            r6[r7] = r3
        L95:
            r7 = r9
            goto L171
        L98:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 71
            char r3 = (char) r3
            r6[r9] = r3
            goto L8d
        Lb2:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 32
            char r3 = (char) r3
            r6[r9] = r3
            goto L8d
        Lcc:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 114(0x72, float:1.6E-43)
            r6[r3] = r9
        Ld4:
            int r7 = r7 + 2
            goto L171
        Ld8:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 102(0x66, float:1.43E-43)
            r6[r3] = r9
            goto Ld4
        Le1:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 87
            char r3 = (char) r3
            r6[r9] = r3
            goto L8d
        Lfb:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 110(0x6e, float:1.54E-43)
            r6[r3] = r9
            goto Ld4
        L104:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 116(0x74, float:1.63E-43)
            r6[r3] = r9
            goto Ld4
        L10d:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 98
            r6[r3] = r9
            goto Ld4
        L116:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 48
            char r3 = (char) r3
            r6[r9] = r3
            goto L8d
        L131:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r3
            goto Ld4
        L138:
            if (r2 == 0) goto L15e
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
            goto L8d
        L15e:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L95
        L164:
            if (r3 != r1) goto L16b
            int r9 = r7 + 1
            r6[r7] = r10
            r7 = r9
        L16b:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L95
        L171:
            int r5 = r5 + 1
            goto L37
        L175:
            r6[r7] = r1
            int r7 = r7 + r8
            r13.off = r7
            return
    }

    public final void writeStringEscape(byte[] r14) {
            r13 = this;
            int r0 = r14.length
            char r1 = r13.quote
            com.alibaba.fastjson2.JSONWriter$Context r2 = r13.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r4 = r4.mask
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L16
            r4 = r8
            goto L17
        L16:
            r4 = r5
        L17:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r9 = r9.mask
            long r2 = r2 & r9
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L22
            r2 = r8
            goto L23
        L22:
            r2 = r5
        L23:
            int r3 = r13.off
            r6 = 6
            r7 = 2
            int r6 = p.a.g(r0, r6, r3, r7)
            r13.ensureCapacity(r6)
            char[] r6 = r13.chars
            int r7 = r3 + 1
            r6[r3] = r1
        L34:
            if (r5 >= r0) goto L167
            r3 = r14[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            r9 = 34
            r10 = 92
            if (r3 == r9) goto L156
            r9 = 60
            r11 = 117(0x75, float:1.64E-43)
            r12 = 48
            if (r3 == r9) goto L12a
            r9 = 62
            if (r3 == r9) goto L12a
            if (r3 == r10) goto L123
            r9 = 49
            switch(r3) {
                case 0: goto L108;
                case 1: goto L108;
                case 2: goto L108;
                case 3: goto L108;
                case 4: goto L108;
                case 5: goto L108;
                case 6: goto L108;
                case 7: goto L108;
                case 8: goto Lff;
                case 9: goto Lf6;
                case 10: goto Led;
                case 11: goto Ld3;
                case 12: goto Lca;
                case 13: goto Lbe;
                case 14: goto Ld3;
                case 15: goto Ld3;
                case 16: goto La4;
                case 17: goto La4;
                case 18: goto La4;
                case 19: goto La4;
                case 20: goto La4;
                case 21: goto La4;
                case 22: goto La4;
                case 23: goto La4;
                case 24: goto La4;
                case 25: goto La4;
                case 26: goto L8a;
                case 27: goto L8a;
                case 28: goto L8a;
                case 29: goto L8a;
                case 30: goto L8a;
                case 31: goto L8a;
                default: goto L54;
            }
        L54:
            switch(r3) {
                case 39: goto L156;
                case 40: goto L12a;
                case 41: goto L12a;
                default: goto L57;
            }
        L57:
            if (r4 == 0) goto L83
            r9 = 127(0x7f, float:1.78E-43)
            if (r3 <= r9) goto L83
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
        L7f:
            int r7 = r7 + 6
            goto L163
        L83:
            int r9 = r7 + 1
            r6[r7] = r3
        L87:
            r7 = r9
            goto L163
        L8a:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 71
            char r3 = (char) r3
            r6[r9] = r3
            goto L7f
        La4:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 32
            char r3 = (char) r3
            r6[r9] = r3
            goto L7f
        Lbe:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 114(0x72, float:1.6E-43)
            r6[r3] = r9
        Lc6:
            int r7 = r7 + 2
            goto L163
        Lca:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 102(0x66, float:1.43E-43)
            r6[r3] = r9
            goto Lc6
        Ld3:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 87
            char r3 = (char) r3
            r6[r9] = r3
            goto L7f
        Led:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 110(0x6e, float:1.54E-43)
            r6[r3] = r9
            goto Lc6
        Lf6:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 116(0x74, float:1.63E-43)
            r6[r3] = r9
            goto Lc6
        Lff:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 98
            r6[r3] = r9
            goto Lc6
        L108:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 48
            char r3 = (char) r3
            r6[r9] = r3
            goto L7f
        L123:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r3
            goto Lc6
        L12a:
            if (r2 == 0) goto L150
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
            goto L7f
        L150:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L87
        L156:
            if (r3 != r1) goto L15d
            int r9 = r7 + 1
            r6[r7] = r10
            r7 = r9
        L15d:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L87
        L163:
            int r5 = r5 + 1
            goto L34
        L167:
            r6[r7] = r1
            int r7 = r7 + r8
            r13.off = r7
            return
    }

    public final void writeStringEscape(char[] r14) {
            r13 = this;
            int r0 = r14.length
            char r1 = r13.quote
            com.alibaba.fastjson2.JSONWriter$Context r2 = r13.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r4 = r4.mask
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L16
            r4 = r8
            goto L17
        L16:
            r4 = r5
        L17:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r9 = r9.mask
            long r2 = r2 & r9
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L22
            r2 = r8
            goto L23
        L22:
            r2 = r5
        L23:
            int r3 = r13.off
            r6 = 6
            r7 = 2
            int r6 = p.a.g(r0, r6, r3, r7)
            r13.ensureCapacity(r6)
            char[] r6 = r13.chars
            int r7 = r3 + 1
            r6[r3] = r1
        L34:
            if (r5 >= r0) goto L170
            char r3 = r14[r5]
            r9 = 34
            r10 = 92
            if (r3 == r9) goto L15f
            r9 = 60
            r11 = 117(0x75, float:1.64E-43)
            r12 = 48
            if (r3 == r9) goto L133
            r9 = 62
            if (r3 == r9) goto L133
            if (r3 == r10) goto L12c
            r9 = 49
            switch(r3) {
                case 0: goto L111;
                case 1: goto L111;
                case 2: goto L111;
                case 3: goto L111;
                case 4: goto L111;
                case 5: goto L111;
                case 6: goto L111;
                case 7: goto L111;
                case 8: goto L108;
                case 9: goto Lff;
                case 10: goto Lf6;
                case 11: goto Ldc;
                case 12: goto Ld3;
                case 13: goto Lc7;
                case 14: goto Ldc;
                case 15: goto Ldc;
                case 16: goto Lad;
                case 17: goto Lad;
                case 18: goto Lad;
                case 19: goto Lad;
                case 20: goto Lad;
                case 21: goto Lad;
                case 22: goto Lad;
                case 23: goto Lad;
                case 24: goto Lad;
                case 25: goto Lad;
                case 26: goto L93;
                case 27: goto L93;
                case 28: goto L93;
                case 29: goto L93;
                case 30: goto L93;
                case 31: goto L93;
                default: goto L51;
            }
        L51:
            switch(r3) {
                case 39: goto L15f;
                case 40: goto L133;
                case 41: goto L133;
                default: goto L54;
            }
        L54:
            if (r4 == 0) goto L8c
            r9 = 127(0x7f, float:1.78E-43)
            if (r3 <= r9) goto L8c
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 12
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 3
            int r11 = r3 >>> 8
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 4
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
        L88:
            int r7 = r7 + 6
            goto L16c
        L8c:
            int r9 = r7 + 1
            r6[r7] = r3
        L90:
            r7 = r9
            goto L16c
        L93:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 71
            char r3 = (char) r3
            r6[r9] = r3
            goto L88
        Lad:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 32
            char r3 = (char) r3
            r6[r9] = r3
            goto L88
        Lc7:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 114(0x72, float:1.6E-43)
            r6[r3] = r9
        Lcf:
            int r7 = r7 + 2
            goto L16c
        Ld3:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 102(0x66, float:1.43E-43)
            r6[r3] = r9
            goto Lcf
        Ldc:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 87
            char r3 = (char) r3
            r6[r9] = r3
            goto L88
        Lf6:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 110(0x6e, float:1.54E-43)
            r6[r3] = r9
            goto Lcf
        Lff:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 116(0x74, float:1.63E-43)
            r6[r3] = r9
            goto Lcf
        L108:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 98
            r6[r3] = r9
            goto Lcf
        L111:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 48
            char r3 = (char) r3
            r6[r9] = r3
            goto L88
        L12c:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r3
            goto Lcf
        L133:
            if (r2 == 0) goto L159
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
            goto L88
        L159:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L90
        L15f:
            if (r3 != r1) goto L166
            int r9 = r7 + 1
            r6[r7] = r10
            r7 = r9
        L166:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L90
        L16c:
            int r5 = r5 + 1
            goto L34
        L170:
            r6[r7] = r1
            int r7 = r7 + r8
            r13.off = r7
            return
    }

    public final void writeStringEscapeUTF16(byte[] r14) {
            r13 = this;
            int r0 = r14.length
            char r1 = r13.quote
            com.alibaba.fastjson2.JSONWriter$Context r2 = r13.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r4 = r4.mask
            long r4 = r4 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            r8 = 1
            if (r4 == 0) goto L16
            r4 = r8
            goto L17
        L16:
            r4 = r5
        L17:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r9 = r9.mask
            long r2 = r2 & r9
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L22
            r2 = r8
            goto L23
        L22:
            r2 = r5
        L23:
            int r3 = r13.off
            r6 = 6
            r7 = 2
            int r6 = p.a.g(r0, r6, r3, r7)
            r13.ensureCapacity(r6)
            char[] r6 = r13.chars
            int r7 = r3 + 1
            r6[r3] = r1
        L34:
            if (r5 >= r0) goto L179
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            int r9 = sun.misc.Unsafe.ARRAY_CHAR_BASE_OFFSET
            long r9 = (long) r9
            long r11 = (long) r5
            long r9 = r9 + r11
            char r3 = r3.getChar(r14, r9)
            r9 = 34
            r10 = 92
            if (r3 == r9) goto L168
            r9 = 60
            r11 = 117(0x75, float:1.64E-43)
            r12 = 48
            if (r3 == r9) goto L13c
            r9 = 62
            if (r3 == r9) goto L13c
            if (r3 == r10) goto L135
            r9 = 49
            switch(r3) {
                case 0: goto L11a;
                case 1: goto L11a;
                case 2: goto L11a;
                case 3: goto L11a;
                case 4: goto L11a;
                case 5: goto L11a;
                case 6: goto L11a;
                case 7: goto L11a;
                case 8: goto L111;
                case 9: goto L108;
                case 10: goto Lff;
                case 11: goto Le5;
                case 12: goto Ldc;
                case 13: goto Ld0;
                case 14: goto Le5;
                case 15: goto Le5;
                case 16: goto Lb6;
                case 17: goto Lb6;
                case 18: goto Lb6;
                case 19: goto Lb6;
                case 20: goto Lb6;
                case 21: goto Lb6;
                case 22: goto Lb6;
                case 23: goto Lb6;
                case 24: goto Lb6;
                case 25: goto Lb6;
                case 26: goto L9c;
                case 27: goto L9c;
                case 28: goto L9c;
                case 29: goto L9c;
                case 30: goto L9c;
                case 31: goto L9c;
                default: goto L5a;
            }
        L5a:
            switch(r3) {
                case 39: goto L168;
                case 40: goto L13c;
                case 41: goto L13c;
                default: goto L5d;
            }
        L5d:
            if (r4 == 0) goto L95
            r9 = 127(0x7f, float:1.78E-43)
            if (r3 <= r9) goto L95
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 12
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 3
            int r11 = r3 >>> 8
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 4
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
        L91:
            int r7 = r7 + 6
            goto L175
        L95:
            int r9 = r7 + 1
            r6[r7] = r3
        L99:
            r7 = r9
            goto L175
        L9c:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 71
            char r3 = (char) r3
            r6[r9] = r3
            goto L91
        Lb6:
            r6[r7] = r10
            int r10 = r7 + 1
            r6[r10] = r11
            int r10 = r7 + 2
            r6[r10] = r12
            int r10 = r7 + 3
            r6[r10] = r12
            int r10 = r7 + 4
            r6[r10] = r9
            int r9 = r7 + 5
            int r3 = r3 + 32
            char r3 = (char) r3
            r6[r9] = r3
            goto L91
        Ld0:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 114(0x72, float:1.6E-43)
            r6[r3] = r9
        Ld8:
            int r7 = r7 + 2
            goto L175
        Ldc:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 102(0x66, float:1.43E-43)
            r6[r3] = r9
            goto Ld8
        Le5:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 87
            char r3 = (char) r3
            r6[r9] = r3
            goto L91
        Lff:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 110(0x6e, float:1.54E-43)
            r6[r3] = r9
            goto Ld8
        L108:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 116(0x74, float:1.63E-43)
            r6[r3] = r9
            goto Ld8
        L111:
            r6[r7] = r10
            int r3 = r7 + 1
            r9 = 98
            r6[r3] = r9
            goto Ld8
        L11a:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            r6[r9] = r12
            int r9 = r7 + 5
            int r3 = r3 + 48
            char r3 = (char) r3
            r6[r9] = r3
            goto L91
        L135:
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r3
            goto Ld8
        L13c:
            if (r2 == 0) goto L162
            r6[r7] = r10
            int r9 = r7 + 1
            r6[r9] = r11
            int r9 = r7 + 2
            r6[r9] = r12
            int r9 = r7 + 3
            r6[r9] = r12
            int r9 = r7 + 4
            char[] r10 = com.alibaba.fastjson2.JSONWriter.DIGITS
            int r11 = r3 >>> 4
            r11 = r11 & 15
            char r11 = r10[r11]
            r6[r9] = r11
            int r9 = r7 + 5
            r3 = r3 & 15
            char r3 = r10[r3]
            r6[r9] = r3
            goto L91
        L162:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L99
        L168:
            if (r3 != r1) goto L16f
            int r9 = r7 + 1
            r6[r7] = r10
            r7 = r9
        L16f:
            int r9 = r7 + 1
            r6[r7] = r3
            goto L99
        L175:
            int r5 = r5 + 2
            goto L34
        L179:
            r6[r7] = r1
            int r7 = r7 + r8
            r13.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] r8) {
            r7 = this;
            if (r8 != 0) goto L6
            r7.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = r1
        L19:
            int r2 = r7.off
            int r3 = r8.length
            int r3 = r3 + r2
            int r3 = r3 + 2
            char[] r4 = r7.chars
            int r4 = r4.length
            if (r3 < r4) goto L27
            r7.ensureCapacity(r3)
        L27:
            char[] r3 = r7.chars
            int r4 = r2 + 1
            char r5 = r7.quote
            r3[r2] = r5
        L2f:
            int r5 = r8.length
            if (r1 >= r5) goto L63
            r5 = r8[r1]
            r6 = 92
            if (r5 == r6) goto L5d
            char r6 = r7.quote
            if (r5 == r6) goto L5d
            r6 = 32
            if (r5 >= r6) goto L41
            goto L5d
        L41:
            if (r0 == 0) goto L54
            r6 = 60
            if (r5 == r6) goto L5d
            r6 = 62
            if (r5 == r6) goto L5d
            r6 = 40
            if (r5 == r6) goto L5d
            r6 = 41
            if (r5 != r6) goto L54
            goto L5d
        L54:
            int r6 = r4 + 1
            char r5 = (char) r5
            r3[r4] = r5
            int r1 = r1 + 1
            r4 = r6
            goto L2f
        L5d:
            r7.off = r2
            r7.writeStringEscape(r8)
            return
        L63:
            int r8 = r4 + 1
            char r0 = r7.quote
            r3[r4] = r0
            r7.off = r8
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] r12) {
            r11 = this;
            if (r12 != 0) goto L6
            r11.writeStringNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r11.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserSecure
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L19
            r2 = r6
            goto L1a
        L19:
            r2 = r3
        L1a:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.EscapeNoneAscii
            long r7 = r7.mask
            long r0 = r0 & r7
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L25
            r0 = r6
            goto L26
        L25:
            r0 = r3
        L26:
            int r1 = r11.off
            int r4 = r12.length
            int r4 = r4 + r1
            int r4 = r4 + 2
            char[] r5 = r11.chars
            int r5 = r5.length
            if (r4 < r5) goto L34
            r11.ensureCapacity(r4)
        L34:
            char[] r4 = r11.chars
            int r5 = r1 + 1
            char r7 = r11.quote
            r4[r1] = r7
        L3c:
            int r1 = r12.length
            if (r3 >= r1) goto L7b
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            int r7 = sun.misc.Unsafe.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r7
            long r9 = (long) r3
            long r7 = r7 + r9
            char r1 = r1.getChar(r12, r7)
            r7 = 92
            if (r1 == r7) goto L77
            char r7 = r11.quote
            if (r1 == r7) goto L77
            r7 = 32
            if (r1 < r7) goto L77
            if (r2 == 0) goto L68
            r7 = 60
            if (r1 == r7) goto L77
            r7 = 62
            if (r1 == r7) goto L77
            r7 = 40
            if (r1 == r7) goto L77
            r7 = 41
            if (r1 == r7) goto L77
        L68:
            if (r0 == 0) goto L6f
            r7 = 127(0x7f, float:1.78E-43)
            if (r1 <= r7) goto L6f
            goto L77
        L6f:
            int r7 = r5 + 1
            r4[r5] = r1
            int r3 = r3 + 2
            r5 = r7
            goto L3c
        L77:
            r11.writeStringEscapeUTF16(r12)
            return
        L7b:
            char r12 = r11.quote
            r4[r5] = r12
            int r5 = r5 + r6
            r11.off = r5
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int r8, int r9, int r10) {
            r7 = this;
            int r0 = r7.off
            int r1 = r0 + 10
            char[] r2 = r7.chars
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r7.ensureCapacity(r1)
        Lc:
            char[] r2 = r7.chars
            char r3 = r7.quote
            byte r4 = (byte) r3
            char r4 = (char) r4
            r2[r0] = r4
            int[] r4 = com.alibaba.fastjson2.util.IOUtils.DIGITS_K
            r8 = r4[r8]
            int r5 = r0 + 1
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r5] = r6
            int r5 = r0 + 2
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r5] = r8
            int r8 = r0 + 3
            r5 = 58
            r2[r8] = r5
            r8 = r4[r9]
            int r9 = r0 + 4
            int r6 = r8 >> 8
            byte r6 = (byte) r6
            char r6 = (char) r6
            r2[r9] = r6
            int r9 = r0 + 5
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            int r8 = r0 + 6
            r2[r8] = r5
            r8 = r4[r10]
            int r9 = r0 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r2[r9] = r10
            int r9 = r0 + 8
            byte r8 = (byte) r8
            char r8 = (char) r8
            r2[r9] = r8
            int r0 = r0 + 9
            byte r8 = (byte) r3
            char r8 = (char) r8
            r2[r0] = r8
            r7.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeUUID(java.util.UUID r21) {
            r20 = this;
            r0 = r20
            if (r21 != 0) goto L8
            r0.writeNull()
            return
        L8:
            long r1 = r21.getMostSignificantBits()
            long r3 = r21.getLeastSignificantBits()
            int r5 = r0.off
            int r5 = r5 + 38
            char[] r6 = r0.chars
            int r6 = r6.length
            if (r5 < r6) goto L1c
            r0.ensureCapacity(r5)
        L1c:
            char[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_LOOKUP
            char[] r6 = r0.chars
            int r7 = r0.off
            r8 = 34
            r6[r7] = r8
            r9 = 56
            long r10 = r1 >> r9
            int r10 = (int) r10
            r10 = r10 & 255(0xff, float:3.57E-43)
            char r10 = r5[r10]
            r11 = 48
            long r12 = r1 >> r11
            int r12 = (int) r12
            r12 = r12 & 255(0xff, float:3.57E-43)
            char r12 = r5[r12]
            r13 = 40
            long r14 = r1 >> r13
            int r14 = (int) r14
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = r5[r14]
            r15 = 32
            r21 = r8
            r16 = r9
            long r8 = r1 >> r15
            int r8 = (int) r8
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = r5[r8]
            int r1 = (int) r1
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = r5[r2]
            int r9 = r1 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = r5[r9]
            r17 = r11
            int r11 = r1 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            char r11 = r5[r11]
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = r5[r1]
            r18 = r13
            r19 = r14
            long r13 = r3 >> r16
            int r13 = (int) r13
            r13 = r13 & 255(0xff, float:3.57E-43)
            char r13 = r5[r13]
            r14 = r5
            r16 = r6
            long r5 = r3 >> r17
            int r5 = (int) r5
            r5 = r5 & 255(0xff, float:3.57E-43)
            char r5 = r14[r5]
            r17 = r7
            long r6 = r3 >> r18
            int r6 = (int) r6
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = r14[r6]
            r7 = r14
            long r14 = r3 >> r15
            int r14 = (int) r14
            r14 = r14 & 255(0xff, float:3.57E-43)
            char r14 = r7[r14]
            int r3 = (int) r3
            int r4 = r3 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = r7[r4]
            int r15 = r3 >> 16
            r15 = r15 & 255(0xff, float:3.57E-43)
            char r15 = r7[r15]
            r18 = r7
            int r7 = r3 >> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            char r7 = r18[r7]
            r3 = r3 & 255(0xff, float:3.57E-43)
            char r3 = r18[r3]
            int r18 = r17 + 1
            int r0 = r10 >> 8
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r18] = r0
            int r0 = r17 + 2
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 3
            int r10 = r12 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 4
            byte r10 = (byte) r12
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 5
            int r10 = r19 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 6
            r10 = r19
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 7
            int r10 = r8 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 8
            byte r8 = (byte) r8
            char r8 = (char) r8
            r16[r0] = r8
            int r0 = r17 + 9
            r8 = 45
            r16[r0] = r8
            int r0 = r17 + 10
            int r10 = r2 >> 8
            byte r10 = (byte) r10
            char r10 = (char) r10
            r16[r0] = r10
            int r0 = r17 + 11
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 12
            int r2 = r9 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 13
            byte r2 = (byte) r9
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 14
            r16[r0] = r8
            int r0 = r17 + 15
            int r2 = r11 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 16
            byte r2 = (byte) r11
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 17
            int r2 = r1 >> 8
            byte r2 = (byte) r2
            char r2 = (char) r2
            r16[r0] = r2
            int r0 = r17 + 18
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 19
            r16[r0] = r8
            int r0 = r17 + 20
            int r1 = r13 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 21
            byte r1 = (byte) r13
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 22
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 23
            byte r1 = (byte) r5
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 24
            r16[r0] = r8
            int r0 = r17 + 25
            int r1 = r6 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 26
            byte r1 = (byte) r6
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 27
            int r1 = r14 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 28
            byte r1 = (byte) r14
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 29
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 30
            byte r1 = (byte) r4
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 31
            int r1 = r15 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 32
            byte r1 = (byte) r15
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 33
            int r1 = r7 >> 8
            byte r1 = (byte) r1
            char r1 = (char) r1
            r16[r0] = r1
            int r0 = r17 + 34
            byte r1 = (byte) r7
            char r1 = (char) r1
            r16[r0] = r1
            int r7 = r17 + 35
            int r0 = r3 >> 8
            byte r0 = (byte) r0
            char r0 = (char) r0
            r16[r7] = r0
            int r7 = r17 + 36
            byte r0 = (byte) r3
            char r0 = (char) r0
            r16[r7] = r0
            int r7 = r17 + 37
            r16[r7] = r21
            int r7 = r17 + 38
            r0 = r20
            r0.off = r7
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public final void writeZonedDateTime(java.time.ZonedDateTime r14) {
            r13 = this;
            if (r14 != 0) goto L6
            r13.writeNull()
            return
        L6:
            java.time.ZoneId r0 = r14.getZone()
            java.lang.String r1 = r0.getId()
            int r2 = r1.length()
            java.time.ZoneOffset r3 = java.time.ZoneOffset.UTC
            r4 = 45
            r5 = 43
            java.lang.String r6 = "Z"
            r7 = 0
            r8 = 1
            if (r3 == r0) goto L40
            r0 = 3
            if (r2 > r0) goto L30
            java.lang.String r0 = "UTC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L40
            boolean r0 = r6.equals(r1)
            if (r0 == 0) goto L30
            goto L40
        L30:
            if (r2 == 0) goto L3c
            char r0 = r1.charAt(r7)
            if (r0 == r5) goto L3a
            if (r0 != r4) goto L3d
        L3a:
            r3 = r2
            goto L43
        L3c:
            r0 = r7
        L3d:
            int r3 = r2 + 2
            goto L43
        L40:
            r1 = r6
            r0 = r7
            r3 = r8
        L43:
            int r6 = r13.off
            int r9 = r6 + r3
            int r9 = r9 + 38
            char[] r10 = r13.chars
            int r10 = r10.length
            if (r9 < r10) goto L51
            r13.ensureCapacity(r9)
        L51:
            char[] r9 = r13.chars
            int r10 = r6 + 1
            char r11 = r13.quote
            r9[r6] = r11
            java.time.LocalDate r6 = r14.toLocalDate()
            int r11 = r6.getYear()
            int r12 = r6.getMonthValue()
            int r6 = r6.getDayOfMonth()
            int r6 = com.alibaba.fastjson2.util.IOUtils.writeLocalDate(r9, r10, r11, r12, r6)
            int r10 = r6 + 1
            r11 = 84
            r9[r6] = r11
            java.time.LocalTime r14 = r14.toLocalTime()
            int r14 = com.alibaba.fastjson2.util.IOUtils.writeLocalTime(r9, r10, r14)
            if (r3 != r8) goto L84
            int r0 = r14 + 1
            r1 = 90
            r9[r14] = r1
            goto La0
        L84:
            if (r0 == r5) goto L9b
            if (r0 != r4) goto L89
            goto L9b
        L89:
            int r0 = r14 + 1
            r3 = 91
            r9[r14] = r3
            r1.getChars(r7, r2, r9, r0)
            int r0 = r0 + r2
            int r14 = r0 + 1
            r1 = 93
            r9[r0] = r1
            r0 = r14
            goto La0
        L9b:
            r1.getChars(r7, r2, r9, r14)
            int r0 = r14 + r2
        La0:
            char r14 = r13.quote
            r9[r0] = r14
            int r0 = r0 + r8
            r13.off = r0
            return
    }
}
