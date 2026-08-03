package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterJSONB extends com.alibaba.fastjson2.JSONWriter {
    static final java.math.BigInteger BIGINT_INT32_MAX = null;
    static final java.math.BigInteger BIGINT_INT32_MIN = null;
    static final java.math.BigInteger BIGINT_INT64_MAX = null;
    static final java.math.BigInteger BIGINT_INT64_MIN = null;
    static final byte[] OFFSET_8_ZONE_ID_NAME_BYTES = null;
    static final byte[] SHANGHAI_ZONE_ID_NAME_BYTES = null;
    static final long WRITE_ENUM_USING_STRING_MASK = 0;
    private byte[] bytes;
    private final com.alibaba.fastjson2.JSONFactory.CacheItem cacheItem;
    protected long rootTypeNameHash;
    private int symbolIndex;
    private com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap symbols;

    static {
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT32_MIN = r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT32_MAX = r0
            r0 = -9223372036854775808
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT64_MIN = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT64_MAX = r0
            java.lang.String r0 = "Asia/Shanghai"
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.SHANGHAI_ZONE_ID_NAME_BYTES = r0
            java.lang.String r0 = "+08:00"
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.JSONWriterJSONB.OFFSET_8_ZONE_ID_NAME_BYTES = r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName
            long r2 = r2.mask
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriterJSONB.WRITE_ENUM_USING_STRING_MASK = r0
            return
    }

    public JSONWriterJSONB(com.alibaba.fastjson2.JSONWriter.Context r3, com.alibaba.fastjson2.SymbolTable r4) {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1 = 1
            r2.<init>(r3, r4, r1, r0)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r3 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            int r4 = java.lang.System.identityHashCode(r4)
            int r0 = r3.length
            int r0 = r0 - r1
            r4 = r4 & r0
            r3 = r3[r4]
            r2.cacheItem = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r4 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r0 = 0
            java.lang.Object r3 = r4.getAndSet(r3, r0)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L26
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]
        L26:
            r2.bytes = r3
            return
    }

    private static boolean isInt32(java.math.BigInteger r1) {
            java.math.BigInteger r0 = com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT32_MIN
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L12
            java.math.BigInteger r0 = com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT32_MAX
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static boolean isInt64(java.math.BigInteger r1) {
            java.math.BigInteger r0 = com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT64_MIN
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L12
            java.math.BigInteger r0 = com.alibaba.fastjson2.JSONWriterJSONB.BIGINT_INT64_MAX
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static void putInt(byte[] r2, int r3, int r4) {
            int r0 = r4 >>> 24
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 3
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void putInt3(byte[] r2, int r3, int r4) {
            int r0 = r4 >> 16
            int r0 = r0 + 68
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 2
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    private static void putLong(byte[] r3, int r4, long r5) {
            r0 = 56
            long r0 = r5 >>> r0
            int r0 = (int) r0
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            r1 = 48
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            r1 = 40
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            r1 = 32
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 4
            r1 = 24
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 5
            r1 = 16
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 6
            r1 = 8
            long r1 = r5 >>> r1
            int r1 = (int) r1
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r3[r4] = r5
            return
    }

    public static void putLong3(byte[] r2, int r3, int r4) {
            int r0 = r4 >> 16
            int r0 = r0 + (-60)
            byte r0 = (byte) r0
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 2
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    private static int putStringSizeLarge(byte[] r2, int r3, int r4) {
            r0 = 262143(0x3ffff, float:3.6734E-40)
            r1 = 121(0x79, float:1.7E-43)
            if (r4 > r0) goto L10
            r2[r3] = r1
            int r3 = r3 + 1
            putInt3(r2, r3, r4)
            r2 = 4
            return r2
        L10:
            r2[r3] = r1
            int r0 = r3 + 1
            r1 = 72
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 24
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 3
            int r1 = r4 >>> 16
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 4
            int r1 = r4 >>> 8
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 5
            byte r4 = (byte) r4
            r2[r3] = r4
            r2 = 6
            return r2
    }

    private static void putStringSizeSmall(byte[] r2, int r3, int r4) {
            r0 = 121(0x79, float:1.7E-43)
            r2[r3] = r0
            int r0 = r3 + 1
            int r1 = r4 >> 8
            int r1 = r1 + 56
            byte r1 = (byte) r1
            r2[r0] = r1
            int r3 = r3 + 2
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static int sizeOfInt(int r1) {
            r0 = -16
            if (r1 < r0) goto La
            r0 = 47
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r0 = -2048(0xfffffffffffff800, float:NaN)
            if (r1 < r0) goto L14
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r1 > r0) goto L14
            r1 = 2
            return r1
        L14:
            r0 = -262144(0xfffffffffffc0000, float:NaN)
            if (r1 < r0) goto L1f
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r1 > r0) goto L1f
            r1 = 3
            return r1
        L1f:
            r1 = 5
            return r1
    }

    public static int writeInt32(byte[] r2, int r3, int r4) {
            r0 = -16
            r1 = 1
            if (r4 < r0) goto Ld
            r0 = 47
            if (r4 > r0) goto Ld
            byte r4 = (byte) r4
            r2[r3] = r4
            return r1
        Ld:
            r0 = -2048(0xfffffffffffff800, float:NaN)
            if (r4 < r0) goto L22
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r0) goto L22
            int r0 = r4 >> 8
            int r0 = r0 + 56
            byte r0 = (byte) r0
            r2[r3] = r0
            int r3 = r3 + r1
            byte r4 = (byte) r4
            r2[r3] = r4
            r2 = 2
            return r2
        L22:
            r0 = -262144(0xfffffffffffc0000, float:NaN)
            if (r4 < r0) goto L30
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r4 > r0) goto L30
            putInt3(r2, r3, r4)
            r2 = 3
            return r2
        L30:
            r0 = 72
            r2[r3] = r0
            int r3 = r3 + r1
            putInt(r2, r3, r4)
            r2 = 5
            return r2
    }

    private boolean writeTypeNameSymbol(int r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 2
            byte[] r2 = r4.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r4.ensureCapacity(r1)
        Lc:
            byte[] r1 = r4.bytes
            int r2 = r0 + 1
            r3 = -110(0xffffffffffffff92, float:NaN)
            r1[r0] = r3
            r4.off = r2
            int r5 = -r5
            r4.writeInt32(r5)
            r5 = 0
            return r5
    }

    @Override // com.alibaba.fastjson2.JSONWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r0.length
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r1 >= r2) goto Le
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r2 = r3.cacheItem
            r1.lazySet(r2, r0)
        Le:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endArray() {
            r0 = this;
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void endObject() {
            r3 = this;
            int r0 = r3.level
            int r0 = r0 + (-1)
            r3.level = r0
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto L12
            int r1 = r0 + 1
            r3.ensureCapacity(r1)
        L12:
            byte[] r1 = r3.bytes
            r2 = -91
            r1[r0] = r2
            int r0 = r0 + 1
            r3.off = r0
            return
    }

    public void ensureCapacity(int r4) {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r0.length
            if (r4 < r1) goto L22
            int r1 = r0.length
            int r2 = r1 >> 1
            int r1 = r1 + r2
            int r2 = r1 - r4
            if (r2 >= 0) goto Le
            goto Lf
        Le:
            r4 = r1
        Lf:
            int r1 = r3.maxArraySize
            if (r4 > r1) goto L1a
            byte[] r4 = java.util.Arrays.copyOf(r0, r4)
            r3.bytes = r4
            return
        L1a:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            java.lang.String r0 = "try enabling LargeObject feature instead"
            r4.<init>(r0)
            throw r4
        L22:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r4) {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            r2 = 0
            r4.write(r1, r2, r0)
            r3.off = r2
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int flushTo(java.io.OutputStream r1, java.nio.charset.Charset r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.off
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public byte[] getBytes(java.nio.charset.Charset r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "not support operator"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public int size() {
            r1 = this;
            int r0 = r1.off
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "unsupported operation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray(int r6) {
            r5 = this;
            int r0 = r5.off
            byte[] r1 = r5.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r1 = r0 + 1
            r5.ensureCapacity(r1)
        Lc:
            byte[] r1 = r5.bytes
            r2 = 15
            r3 = 1
            if (r6 > r2) goto L15
            r2 = r3
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L1c
            int r4 = r6 + (-108)
            byte r4 = (byte) r4
            goto L1e
        L1c:
            r4 = -92
        L1e:
            r1[r0] = r4
            int r0 = r0 + r3
            r5.off = r0
            if (r2 != 0) goto L28
            r5.writeInt32(r6)
        L28:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startArray(java.lang.Object r5, int r6) {
            r4 = this;
            boolean r0 = r4.isWriteTypeInfo(r5)
            if (r0 == 0) goto L11
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r4.writeTypeName(r5)
        L11:
            int r5 = r4.off
            byte[] r0 = r4.bytes
            int r0 = r0.length
            if (r5 != r0) goto L1d
            int r0 = r5 + 1
            r4.ensureCapacity(r0)
        L1d:
            byte[] r0 = r4.bytes
            r1 = 15
            r2 = 1
            if (r6 > r1) goto L26
            r1 = r2
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L2d
            int r3 = r6 + (-108)
            byte r3 = (byte) r3
            goto L2f
        L2d:
            r3 = -92
        L2f:
            r0[r5] = r3
            int r5 = r5 + r2
            r4.off = r5
            if (r1 != 0) goto L39
            r4.writeInt32(r6)
        L39:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void startObject() {
            r3 = this;
            int r0 = r3.level
            int r0 = r0 + 1
            r3.level = r0
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto L12
            int r1 = r0 + 1
            r3.ensureCapacity(r1)
        L12:
            byte[] r1 = r3.bytes
            r2 = -90
            r1[r0] = r2
            int r0 = r0 + 1
            r3.off = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r0 = r0.length
            if (r0 != 0) goto L8
            java.lang.String r0 = "<empty>"
            return r0
        L8:
            byte[] r0 = r3.getBytes()
            com.alibaba.fastjson2.JSONReader r0 = com.alibaba.fastjson2.JSONReader.ofJSONB(r0)
            com.alibaba.fastjson2.JSONWriter r1 = com.alibaba.fastjson2.JSONWriter.of()
            java.lang.Object r0 = r0.readAny()     // Catch: java.lang.Exception -> L20
            r1.writeAny(r0)     // Catch: java.lang.Exception -> L20
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L20
            return r0
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r3.bytes
            r2 = 0
            r1 = r1[r2]
            java.lang.String r1 = com.alibaba.fastjson2.JSONB.typeName(r1)
            r0.append(r1)
            java.lang.String r1 = ", bytes length "
            r0.append(r1)
            int r1 = r3.off
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(com.alibaba.fastjson2.JSONObject r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            r2.startObject()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r2.writeAny(r1)
            java.lang.Object r0 = r0.getValue()
            r2.writeAny(r0)
            goto L11
        L2c:
            r2.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(java.util.List r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            int r0 = r4.size()
            r3.startArray(r0)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r4.get(r1)
            r3.writeAny(r2)
            int r1 = r1 + 1
            goto Le
        L1a:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write(java.util.Map r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            r2.startObject()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r2.writeAny(r1)
            java.lang.Object r0 = r0.getValue()
            r2.writeAny(r0)
            goto L11
        L2c:
            r2.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void write0(char r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "unsupported operation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeAny(java.lang.Object r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r10.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Class r1 = r11.getClass()
            com.alibaba.fastjson2.JSONWriter$Context r2 = r10.context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = r2.provider
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r2.getObjectWriter(r1, r1, r0)
            boolean r0 = r10.isBeanToArray()
            if (r0 == 0) goto L34
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            r5 = r11
            r3.writeArrayMappingJSONB(r4, r5, r6, r7, r8)
            return
        L34:
            r5 = r11
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            r3.writeJSONB(r4, r5, r6, r7, r8)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeArrayNull() {
            r6 = this;
            int r0 = r6.off
            byte[] r1 = r6.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r6.ensureCapacity(r0)
        Lc:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            byte[] r1 = r6.bytes
            if (r0 == 0) goto L2d
            int r0 = r6.off
            int r2 = r0 + 1
            r6.off = r2
            r2 = -108(0xffffffffffffff94, float:NaN)
            r1[r0] = r2
            return
        L2d:
            int r0 = r6.off
            int r2 = r0 + 1
            r6.off = r2
            r2 = -81
            r1[r0] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeArrayNull(long r5) {
            r4 = this;
            int r0 = r4.off
            byte[] r1 = r4.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r4.ensureCapacity(r0)
        Lc:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r2 = r2.mask
            long r0 = r0 | r2
            long r5 = r5 & r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            byte[] r6 = r4.bytes
            if (r5 == 0) goto L29
            int r5 = r4.off
            int r0 = r5 + 1
            r4.off = r0
            r0 = -108(0xffffffffffffff94, float:NaN)
            r6[r5] = r0
            return
        L29:
            int r5 = r4.off
            int r0 = r5 + 1
            r4.off = r0
            r0 = -81
            r6[r5] = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBase64(byte[] r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBigInt(java.math.BigInteger r3, long r4) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            boolean r4 = isInt64(r3)
            if (r4 == 0) goto L2c
            int r4 = r2.off
            byte[] r5 = r2.bytes
            int r5 = r5.length
            if (r4 != r5) goto L18
            int r4 = r4 + 1
            r2.ensureCapacity(r4)
        L18:
            byte[] r4 = r2.bytes
            int r5 = r2.off
            int r0 = r5 + 1
            r2.off = r0
            r0 = -70
            r4[r5] = r0
            long r3 = r3.longValue()
            r2.writeInt64(r3)
            return
        L2c:
            byte[] r3 = r3.toByteArray()
            int r4 = r2.off
            int r4 = r4 + 5
            int r5 = r3.length
            int r4 = r4 + r5
            r2.ensureCapacity(r4)
            byte[] r4 = r2.bytes
            int r5 = r2.off
            int r0 = r5 + 1
            r2.off = r0
            r0 = -69
            r4[r5] = r0
            int r4 = r3.length
            r2.writeInt32(r4)
            byte[] r4 = r2.bytes
            int r5 = r2.off
            int r0 = r3.length
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r4, r5, r0)
            int r4 = r2.off
            int r3 = r3.length
            int r4 = r4 + r3
            r2.off = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBinary(byte[] r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r4.writeNull()
            return
        L6:
            int r0 = r4.off
            int r0 = r0 + 6
            int r1 = r5.length
            int r0 = r0 + r1
            r4.ensureCapacity(r0)
            byte[] r0 = r4.bytes
            int r1 = r4.off
            int r2 = r1 + 1
            r4.off = r2
            r2 = -111(0xffffffffffffff91, float:NaN)
            r0[r1] = r2
            int r0 = r5.length
            r4.writeInt32(r0)
            byte[] r0 = r4.bytes
            int r1 = r4.off
            int r2 = r5.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r1, r2)
            int r0 = r4.off
            int r5 = r5.length
            int r0 = r0 + r5
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean r4) {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            if (r4 == 0) goto L19
            r4 = -79
            goto L1b
        L19:
            r4 = -80
        L1b:
            r0[r1] = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            boolean r1 = r3[r0]
            r2.writeBool(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeChar(char r4) {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = -112(0xffffffffffffff90, float:NaN)
            r0[r1] = r2
            r3.writeInt32(r4)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeColon() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeComma() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "unsupported operation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime14(int r6, int r7, int r8, int r9, int r10, int r11) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 8
            r5.ensureCapacity(r1)
            byte[] r2 = r5.bytes
            r3 = -88
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            byte r6 = (byte) r6
            r2[r3] = r6
            int r6 = r0 + 3
            byte r7 = (byte) r7
            r2[r6] = r7
            int r6 = r0 + 4
            byte r7 = (byte) r8
            r2[r6] = r7
            int r6 = r0 + 5
            byte r7 = (byte) r9
            r2[r6] = r7
            int r6 = r0 + 6
            byte r7 = (byte) r10
            r2[r6] = r7
            int r0 = r0 + 7
            byte r6 = (byte) r11
            r2[r0] = r6
            r5.off = r1
            r6 = 0
            r5.writeInt32(r6)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTime19(int r6, int r7, int r8, int r9, int r10, int r11) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 8
            r5.ensureCapacity(r1)
            byte[] r2 = r5.bytes
            r3 = -88
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            byte r6 = (byte) r6
            r2[r3] = r6
            int r6 = r0 + 3
            byte r7 = (byte) r7
            r2[r6] = r7
            int r6 = r0 + 4
            byte r7 = (byte) r8
            r2[r6] = r7
            int r6 = r0 + 5
            byte r7 = (byte) r9
            r2[r6] = r7
            int r6 = r0 + 6
            byte r7 = (byte) r10
            r2[r6] = r7
            int r0 = r0 + 7
            byte r6 = (byte) r11
            r2[r0] = r6
            r5.off = r1
            r6 = 0
            r5.writeInt32(r6)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateTimeISO8601(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, boolean r9) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "unsupported operation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD10(int r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "unsupported operation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDateYYYMMDD8(int r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 5
            r5.ensureCapacity(r1)
            byte[] r2 = r5.bytes
            r3 = -87
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            byte r6 = (byte) r6
            r2[r3] = r6
            int r6 = r0 + 3
            byte r7 = (byte) r7
            r2[r6] = r7
            int r0 = r0 + 4
            byte r6 = (byte) r8
            r2[r0] = r6
            r5.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDecimal(java.math.BigDecimal r2, long r3, java.text.DecimalFormat r5) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            int r3 = r2.scale()
            java.math.BigInteger r2 = r2.unscaledValue()
            if (r3 != 0) goto L31
            boolean r4 = isInt64(r2)
            if (r4 == 0) goto L31
            int r3 = r1.off
            int r3 = r3 + 1
            r1.ensureCapacity(r3)
            byte[] r3 = r1.bytes
            int r4 = r1.off
            int r5 = r4 + 1
            r1.off = r5
            r5 = -72
            r3[r4] = r5
            long r2 = r2.longValue()
            r1.writeInt64(r2)
            return
        L31:
            int r4 = r1.off
            int r4 = r4 + 1
            r1.ensureCapacity(r4)
            byte[] r4 = r1.bytes
            int r5 = r1.off
            int r0 = r5 + 1
            r1.off = r0
            r0 = -71
            r4[r5] = r0
            r1.writeInt32(r3)
            boolean r3 = isInt32(r2)
            if (r3 == 0) goto L55
            int r2 = r2.intValue()
            r1.writeInt32(r2)
            return
        L55:
            boolean r3 = isInt64(r2)
            if (r3 == 0) goto L63
            long r2 = r2.longValue()
            r1.writeInt64(r2)
            return
        L63:
            r3 = 0
            r1.writeBigInt(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double r8) {
            r7 = this;
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            int r8 = r7.off
            int r8 = r8 + 1
            r7.ensureCapacity(r8)
            byte[] r8 = r7.bytes
            int r9 = r7.off
            int r0 = r9 + 1
            r7.off = r0
            r0 = -78
            r8[r9] = r0
            return
        L1a:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L34
            int r8 = r7.off
            int r8 = r8 + 1
            r7.ensureCapacity(r8)
            byte[] r8 = r7.bytes
            int r9 = r7.off
            int r0 = r9 + 1
            r7.off = r0
            r0 = -77
            r8[r9] = r0
            return
        L34:
            r0 = -4476578029606273024(0xc1e0000000000000, double:-2.147483648E9)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L60
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L60
            long r0 = (long) r8
            double r2 = (double) r0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L60
            int r8 = r7.off
            int r8 = r8 + 1
            r7.ensureCapacity(r8)
            byte[] r8 = r7.bytes
            int r9 = r7.off
            int r2 = r9 + 1
            r7.off = r2
            r2 = -76
            r8[r9] = r2
            r7.writeInt64(r0)
            return
        L60:
            int r0 = r7.off
            int r1 = r0 + 9
            r7.ensureCapacity(r1)
            byte[] r2 = r7.bytes
            r3 = -75
            r2[r0] = r3
            long r8 = java.lang.Double.doubleToLongBits(r8)
            int r3 = r0 + 1
            r4 = 56
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            r4 = 48
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 3
            r4 = 40
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 4
            r4 = 32
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 5
            r4 = 24
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 6
            r4 = 16
            long r4 = r8 >>> r4
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 7
            r4 = 8
            long r5 = r8 >>> r4
            int r5 = (int) r5
            byte r5 = (byte) r5
            r2[r3] = r5
            int r0 = r0 + r4
            int r8 = (int) r8
            byte r8 = (byte) r8
            r2[r0] = r8
            r7.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeDouble(double[] r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            int r0 = r4.length
            r3.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            r1 = r4[r0]
            r3.writeDouble(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            r3.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeEnum(java.lang.Enum r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r2 = r2.mask
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L1d
            java.lang.String r7 = r7.toString()
            r6.writeString(r7)
            return
        L1d:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L2e
            java.lang.String r7 = r7.name()
            r6.writeString(r7)
            return
        L2e:
            int r7 = r7.ordinal()
            r0 = 47
            if (r7 > r0) goto L4e
            int r0 = r6.off
            byte[] r1 = r6.bytes
            int r1 = r1.length
            if (r0 != r1) goto L42
            int r0 = r0 + 1
            r6.ensureCapacity(r0)
        L42:
            byte[] r0 = r6.bytes
            int r1 = r6.off
            int r2 = r1 + 1
            r6.off = r2
            byte r7 = (byte) r7
            r0[r1] = r7
            return
        L4e:
            r6.writeInt32(r7)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 5
            byte[] r2 = r5.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r5.ensureCapacity(r1)
        Lc:
            byte[] r2 = r5.bytes
            int r3 = (int) r6
            float r4 = (float) r3
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L30
            r4 = -931135488(0xffffffffc8800000, float:-262144.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L30
            r4 = 1216348096(0x487fffc0, float:262143.0)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 > 0) goto L30
            r6 = -74
            r2[r0] = r6
            int r6 = r0 + 1
            int r6 = writeInt32(r2, r6, r3)
            int r6 = r6 + 1
            int r1 = r6 + r0
            goto L3d
        L30:
            r3 = -73
            r2[r0] = r3
            int r6 = java.lang.Float.floatToIntBits(r6)
            int r0 = r0 + 1
            putInt(r2, r0, r6)
        L3d:
            r5.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeFloat(float[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r1 = r3[r0]
            r2.writeFloat(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeHex(byte[] r1) {
            r0 = this;
            r0.writeBinary(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInstant(java.time.Instant r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            int r0 = r3.off
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = -82
            r0[r1] = r2
            long r0 = r4.getEpochSecond()
            int r4 = r4.getNano()
            r3.writeInt64(r0)
            r3.writeInt32(r4)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r0 + 3
            byte[] r2 = r5.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r5.ensureCapacity(r1)
        Lc:
            byte[] r2 = r5.bytes
            r3 = -68
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 2
            byte r6 = (byte) r6
            r2[r0] = r6
            r5.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt16(short[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            short r1 = r3[r0]
            r2.writeInt32(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int r6) {
            r5 = this;
            int r0 = r5.off
            r1 = 5
            int r0 = r0 + r1
            byte[] r2 = r5.bytes
            int r2 = r2.length
            if (r0 < r2) goto Lc
            r5.ensureCapacity(r0)
        Lc:
            byte[] r0 = r5.bytes
            int r2 = r5.off
            r3 = -16
            r4 = 1
            if (r6 < r3) goto L1e
            r3 = 47
            if (r6 > r3) goto L1e
            byte r6 = (byte) r6
            r0[r2] = r6
            r1 = r4
            goto L49
        L1e:
            r3 = -2048(0xfffffffffffff800, float:NaN)
            if (r6 < r3) goto L33
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r6 > r3) goto L33
            int r1 = r6 >> 8
            int r1 = r1 + 56
            byte r1 = (byte) r1
            r0[r2] = r1
            int r2 = r2 + r4
            byte r6 = (byte) r6
            r0[r2] = r6
            r1 = 2
            goto L49
        L33:
            r3 = -262144(0xfffffffffffc0000, float:NaN)
            if (r6 < r3) goto L41
            r3 = 262143(0x3ffff, float:3.6734E-40)
            if (r6 > r3) goto L41
            putInt3(r0, r2, r6)
            r1 = 3
            goto L49
        L41:
            r3 = 72
            r0[r2] = r3
            int r2 = r2 + r4
            putInt(r0, r2, r6)
        L49:
            int r6 = r5.off
            int r6 = r6 + r1
            r5.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt32(int[] r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeArrayNull()
            return
        L6:
            int r0 = r7.length
            int r1 = r6.off
            byte[] r2 = r6.bytes
            int r2 = r2.length
            if (r1 != r2) goto L13
            int r1 = r1 + 1
            r6.ensureCapacity(r1)
        L13:
            byte[] r1 = r6.bytes
            r2 = 15
            if (r0 > r2) goto L25
            int r2 = r6.off
            int r3 = r2 + 1
            r6.off = r3
            int r0 = r0 + (-108)
            byte r0 = (byte) r0
            r1[r2] = r0
            goto L32
        L25:
            int r2 = r6.off
            int r3 = r2 + 1
            r6.off = r3
            r3 = -92
            r1[r2] = r3
            r6.writeInt32(r0)
        L32:
            int r0 = r6.off
            int r1 = r7.length
            int r1 = r1 * 5
            int r1 = r1 + r0
            byte[] r2 = r6.bytes
            int r2 = r2.length
            int r2 = r1 - r2
            if (r2 <= 0) goto L42
            r6.ensureCapacity(r1)
        L42:
            byte[] r1 = r6.bytes
            r2 = 0
        L45:
            int r3 = r7.length
            if (r2 >= r3) goto L8d
            r3 = r7[r2]
            r4 = -16
            if (r3 < r4) goto L59
            r4 = 47
            if (r3 > r4) goto L59
            int r4 = r0 + 1
            byte r3 = (byte) r3
            r1[r0] = r3
            r0 = r4
            goto L8a
        L59:
            r4 = -2048(0xfffffffffffff800, float:NaN)
            if (r3 < r4) goto L70
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r3 > r4) goto L70
            int r4 = r0 + 1
            int r5 = r3 >> 8
            int r5 = r5 + 56
            byte r5 = (byte) r5
            r1[r0] = r5
            int r0 = r0 + 2
            byte r3 = (byte) r3
            r1[r4] = r3
            goto L8a
        L70:
            r4 = -262144(0xfffffffffffc0000, float:NaN)
            if (r3 < r4) goto L7f
            r4 = 262143(0x3ffff, float:3.6734E-40)
            if (r3 > r4) goto L7f
            putInt3(r1, r0, r3)
            int r0 = r0 + 3
            goto L8a
        L7f:
            r4 = 72
            r1[r0] = r4
            int r4 = r0 + 1
            putInt(r1, r4, r3)
            int r0 = r0 + 5
        L8a:
            int r2 = r2 + 1
            goto L45
        L8d:
            r6.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long r8) {
            r7 = this;
            int r0 = r7.off
            r1 = 9
            int r0 = r0 + r1
            byte[] r2 = r7.bytes
            int r2 = r2.length
            if (r0 <= r2) goto Ld
            r7.ensureCapacity(r0)
        Ld:
            byte[] r0 = r7.bytes
            int r2 = r7.off
            r3 = -8
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L26
            r3 = 15
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L26
            r3 = 32
            long r8 = r8 - r3
            int r8 = (int) r8
            byte r8 = (byte) r8
            r0[r2] = r8
            r1 = 1
            goto L7c
        L26:
            r3 = -2048(0xfffffffffffff800, double:NaN)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L45
            r3 = 2047(0x7ff, double:1.0114E-320)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L45
            r1 = 8
            long r3 = r8 >> r1
            r5 = -48
            long r3 = r3 + r5
            int r1 = (int) r3
            byte r1 = (byte) r1
            r0[r2] = r1
            int r1 = r2 + 1
            int r8 = (int) r8
            byte r8 = (byte) r8
            r0[r1] = r8
            r1 = 2
            goto L7c
        L45:
            r3 = -262144(0xfffffffffffc0000, double:NaN)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L59
            r3 = 262143(0x3ffff, double:1.29516E-318)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L59
            int r8 = (int) r8
            putLong3(r0, r2, r8)
            r1 = 3
            goto L7c
        L59:
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L73
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 > 0) goto L73
            r1 = -65
            r0[r2] = r1
            int r1 = r2 + 1
            int r8 = (int) r8
            putInt(r0, r1, r8)
            r1 = 5
            goto L7c
        L73:
            r3 = -66
            r0[r2] = r3
            int r3 = r2 + 1
            putLong(r0, r3, r8)
        L7c:
            int r2 = r2 + r1
            r7.off = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt64(long[] r11) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeArrayNull()
            return
        L6:
            int r0 = r11.length
            int r1 = r10.off
            int r2 = r11.length
            r3 = 9
            r4 = 5
            int r2 = p.a.g(r2, r3, r1, r4)
            byte[] r3 = r10.bytes
            int r3 = r3.length
            if (r2 < r3) goto L19
            r10.ensureCapacity(r2)
        L19:
            byte[] r2 = r10.bytes
            r3 = 15
            if (r0 > r3) goto L27
            int r3 = r1 + 1
            int r0 = r0 + (-108)
            byte r0 = (byte) r0
            r2[r1] = r0
            goto L35
        L27:
            r3 = -92
            r2[r1] = r3
            int r3 = r1 + 1
            int r0 = writeInt32(r2, r3, r0)
            int r0 = r0 + 1
            int r3 = r0 + r1
        L35:
            r0 = 0
        L36:
            int r1 = r11.length
            if (r0 >= r1) goto Lad
            r4 = r11[r0]
            r6 = -16
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L4f
            r6 = 47
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4f
            int r1 = r3 + 1
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r3] = r4
            r3 = r1
            goto Laa
        L4f:
            r6 = -2048(0xfffffffffffff800, double:NaN)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L6f
            r6 = 2047(0x7ff, double:1.0114E-320)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L6f
            r1 = 8
            long r6 = r4 >> r1
            r8 = -48
            long r6 = r6 + r8
            int r1 = (int) r6
            byte r1 = (byte) r1
            r2[r3] = r1
            int r1 = r3 + 1
            int r4 = (int) r4
            byte r4 = (byte) r4
            r2[r1] = r4
            int r3 = r3 + 2
            goto Laa
        L6f:
            r6 = -262144(0xfffffffffffc0000, double:NaN)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L84
            r6 = 262143(0x3ffff, double:1.29516E-318)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L84
            int r1 = (int) r4
            putLong3(r2, r3, r1)
            int r3 = r3 + 3
            goto Laa
        L84:
            r6 = -2147483648(0xffffffff80000000, double:NaN)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L9f
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L9f
            r1 = -65
            r2[r3] = r1
            int r1 = r3 + 1
            int r4 = (int) r4
            putInt(r2, r1, r4)
            int r3 = r3 + 5
            goto Laa
        L9f:
            r1 = -66
            r2[r3] = r1
            int r1 = r3 + 1
            putLong(r2, r1, r4)
            int r3 = r3 + 9
        Laa:
            int r0 = r0 + 1
            goto L36
        Lad:
            r10.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeInt8(byte r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r0 + 2
            byte[] r2 = r4.bytes
            int r2 = r2.length
            int r2 = r1 - r2
            if (r2 <= 0) goto Le
            r4.ensureCapacity(r1)
        Le:
            byte[] r2 = r4.bytes
            r3 = -67
            r2[r0] = r3
            int r0 = r0 + 1
            r2[r0] = r5
            r4.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDate(java.time.LocalDate r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            int r0 = r6.off
            int r1 = r0 + 5
            r6.ensureCapacity(r1)
            byte[] r2 = r6.bytes
            r3 = -87
            r2[r0] = r3
            int r3 = r7.getYear()
            int r4 = r0 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r0 + 2
            byte r3 = (byte) r3
            r2[r4] = r3
            int r3 = r0 + 3
            int r4 = r7.getMonthValue()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 4
            int r7 = r7.getDayOfMonth()
            byte r7 = (byte) r7
            r2[r0] = r7
            r6.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalDateTime(java.time.LocalDateTime r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            int r0 = r6.off
            int r1 = r0 + 8
            r6.ensureCapacity(r1)
            byte[] r2 = r6.bytes
            r3 = -88
            r2[r0] = r3
            int r3 = r7.getYear()
            int r4 = r0 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r0 + 2
            byte r3 = (byte) r3
            r2[r4] = r3
            int r3 = r0 + 3
            int r4 = r7.getMonthValue()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 4
            int r4 = r7.getDayOfMonth()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 5
            int r4 = r7.getHour()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 6
            int r4 = r7.getMinute()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 7
            int r3 = r7.getSecond()
            byte r3 = (byte) r3
            r2[r0] = r3
            r6.off = r1
            int r7 = r7.getNano()
            r6.writeInt32(r7)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeLocalTime(java.time.LocalTime r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeNull()
            return
        L6:
            int r0 = r5.off
            int r1 = r0 + 4
            r5.ensureCapacity(r1)
            byte[] r2 = r5.bytes
            r3 = -89
            r2[r0] = r3
            int r3 = r0 + 1
            int r4 = r6.getHour()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 2
            int r4 = r6.getMinute()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 3
            int r3 = r6.getSecond()
            byte r3 = (byte) r3
            r2[r0] = r3
            r5.off = r1
            int r6 = r6.getNano()
            r5.writeInt32(r6)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeMillis(long r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            int r3 = r0.off
            int r4 = r3 + 9
            byte[] r5 = r0.bytes
            int r5 = r5.length
            if (r4 < r5) goto L10
            r0.ensureCapacity(r4)
        L10:
            byte[] r5 = r0.bytes
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r1 % r6
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L85
            long r6 = r1 / r6
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r13 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r12 < 0) goto L50
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 > 0) goto L50
            int r1 = (int) r6
            r2 = -84
            r5[r3] = r2
            int r2 = r3 + 1
            int r4 = r1 >>> 24
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 2
            int r4 = r1 >>> 16
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 3
            int r4 = r1 >>> 8
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 4
            byte r1 = (byte) r1
            r5[r2] = r1
            int r3 = r3 + 5
            r0.off = r3
            return
        L50:
            r15 = 60
            long r17 = r6 % r15
            int r10 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r10 != 0) goto L85
            long r6 = r6 / r15
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 < 0) goto L85
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 > 0) goto L85
            int r1 = (int) r6
            r2 = -83
            r5[r3] = r2
            int r2 = r3 + 1
            int r4 = r1 >>> 24
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 2
            int r4 = r1 >>> 16
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 3
            int r4 = r1 >>> 8
            byte r4 = (byte) r4
            r5[r2] = r4
            int r2 = r3 + 4
            byte r1 = (byte) r1
            r5[r2] = r1
            int r3 = r3 + 5
            r0.off = r3
            return
        L85:
            r6 = -85
            r5[r3] = r6
            int r6 = r3 + 1
            r7 = 56
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 2
            r7 = 48
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 3
            r7 = 40
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 4
            r7 = 32
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 5
            r7 = 24
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 6
            r7 = 16
            long r7 = r1 >>> r7
            int r7 = (int) r7
            byte r7 = (byte) r7
            r5[r6] = r7
            int r6 = r3 + 7
            r7 = 8
            long r8 = r1 >>> r7
            int r8 = (int) r8
            byte r8 = (byte) r8
            r5[r6] = r8
            int r3 = r3 + r7
            int r1 = (int) r1
            byte r1 = (byte) r1
            r5[r3] = r1
            r0.off = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName(java.lang.String r1) {
            r0 = this;
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName10Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 10
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName11Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 11
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName12Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 12
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName13Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 13
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName14Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 14
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName15Raw(long r12, long r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 16
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r4 = r11.bytes
            long r1 = r1 + r9
            r12 = 8
            long r5 = r1 + r12
            r7 = r14
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 15
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName16Raw(long r14, long r16) {
            r13 = this;
            int r0 = r13.off
            int r1 = r0 + 16
            byte[] r2 = r13.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r13.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r13.bytes
            long r9 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r11 = (long) r0
            long r5 = r9 + r11
            r7 = r14
            r3.putLong(r4, r5, r7)
            byte[] r4 = r13.bytes
            long r9 = r9 + r11
            r14 = 8
            long r5 = r9 + r14
            r7 = r16
            r3.putLong(r4, r5, r7)
            r13.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName2Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 2
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName3Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 3
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName4Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 4
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName5Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 5
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName6Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 6
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName7Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r5 = r5 + r1
            r7 = r10
            r3.putLong(r4, r5, r7)
            int r0 = r0 + 7
            r9.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName8Raw(long r10) {
            r9 = this;
            int r0 = r9.off
            int r1 = r0 + 8
            byte[] r2 = r9.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r9.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r9.bytes
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r0
            long r5 = r5 + r7
            r7 = r10
            r3.putLong(r4, r5, r7)
            r9.off = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeName9Raw(long r12, int r14) {
            r11 = this;
            int r0 = r11.off
            int r1 = r0 + 12
            byte[] r2 = r11.bytes
            int r2 = r2.length
            if (r1 < r2) goto Lc
            r11.ensureCapacity(r1)
        Lc:
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r4 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r0
            long r5 = r1 + r9
            r7 = r12
            r3.putLong(r4, r5, r7)
            byte[] r12 = r11.bytes
            long r1 = r1 + r9
            r4 = 8
            long r1 = r1 + r4
            r3.putInt(r12, r1, r14)
            int r0 = r0 + 9
            r11.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] r1) {
            r0 = this;
            r0.writeRaw(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(byte[] r11, long r12) {
            r10 = this;
            int r0 = r10.off
            int r1 = r11.length
            int r1 = r1 + r0
            int r1 = r1 + 2
            byte[] r2 = r10.bytes
            int r2 = r2.length
            if (r1 < r2) goto Le
            r10.ensureCapacity(r1)
        Le:
            byte[] r1 = r10.bytes
            com.alibaba.fastjson2.SymbolTable r2 = r10.symbolTable
            r3 = 47
            r4 = -16
            r5 = 127(0x7f, float:1.78E-43)
            if (r2 == 0) goto L21
            int r2 = r2.getOrdinalByHashCode(r12)
            r6 = -1
            if (r2 != r6) goto L80
        L21:
            com.alibaba.fastjson2.JSONWriter$Context r2 = r10.context
            long r6 = r2.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol
            long r8 = r2.mask
            long r6 = r6 & r8
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 0
            if (r2 != 0) goto L3a
            int r12 = r11.length
            java.lang.System.arraycopy(r11, r6, r1, r0, r12)
            int r11 = r11.length
            int r0 = r0 + r11
            r10.off = r0
            return
        L3a:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = r10.symbols
            if (r2 == 0) goto L4f
            int r7 = r10.symbolIndex
            int r12 = r2.putIfAbsent(r12, r7)
            int r13 = r10.symbolIndex
            r2 = 1
            if (r12 == r13) goto L4a
            goto L61
        L4a:
            int r13 = r13 + r2
            r10.symbolIndex = r13
            r2 = r6
            goto L61
        L4f:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = new com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap
            r2.<init>()
            r10.symbols = r2
            int r7 = r10.symbolIndex
            int r8 = r7 + 1
            r10.symbolIndex = r8
            r2.put(r12, r7)
            r2 = r6
            r12 = r7
        L61:
            if (r2 != 0) goto L7f
            int r13 = r0 + 1
            r1[r0] = r5
            int r0 = r11.length
            java.lang.System.arraycopy(r11, r6, r1, r13, r0)
            int r11 = r11.length
            int r13 = r13 + r11
            r10.off = r13
            if (r12 < r4) goto L7b
            if (r12 > r3) goto L7b
            int r11 = r13 + 1
            r10.off = r11
            byte r11 = (byte) r12
            r1[r13] = r11
            return
        L7b:
            r10.writeInt32(r12)
            return
        L7f:
            int r2 = -r12
        L80:
            int r11 = r0 + 1
            r1[r0] = r5
            int r12 = -r2
            if (r12 < r4) goto L91
            if (r12 > r3) goto L91
            byte r12 = (byte) r12
            r1[r11] = r12
            int r0 = r0 + 2
            r10.off = r0
            return
        L91:
            r10.off = r11
            r10.writeInt32(r12)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNameRaw(char[] r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeNull() {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = -81
            r0[r1] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeOffsetDateTime(java.time.OffsetDateTime r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            int r0 = r6.off
            int r1 = r0 + 8
            r6.ensureCapacity(r1)
            byte[] r2 = r6.bytes
            r3 = -86
            r2[r0] = r3
            int r3 = r7.getYear()
            int r4 = r0 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r0 + 2
            byte r3 = (byte) r3
            r2[r4] = r3
            int r3 = r0 + 3
            int r4 = r7.getMonthValue()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 4
            int r4 = r7.getDayOfMonth()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 5
            int r4 = r7.getHour()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 6
            int r4 = r7.getMinute()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 7
            int r3 = r7.getSecond()
            byte r3 = (byte) r3
            r2[r0] = r3
            r6.off = r1
            int r0 = r7.getNano()
            r6.writeInt32(r0)
            java.time.ZoneOffset r7 = r7.getOffset()
            java.lang.String r7 = r7.getId()
            java.lang.String r0 = "+08:00"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L6f
            byte[] r7 = com.alibaba.fastjson2.JSONWriterJSONB.OFFSET_8_ZONE_ID_NAME_BYTES
            r6.writeRaw(r7)
            return
        L6f:
            r6.writeString(r7)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeOffsetTime(java.time.OffsetTime r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeNull()
            return
        L6:
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.LOCAL_DATE_19700101
            java.time.LocalTime r1 = r3.toLocalTime()
            java.time.ZoneOffset r3 = r3.getOffset()
            java.time.OffsetDateTime r3 = java.time.OffsetDateTime.of(r0, r1, r3)
            r2.writeOffsetDateTime(r3)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte r4) {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r0[r1] = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(char r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "unsupported operation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeRaw(byte[] r5) {
            r4 = this;
            int r0 = r4.off
            int r1 = r5.length
            int r0 = r0 + r1
            byte[] r1 = r4.bytes
            int r1 = r1.length
            int r1 = r0 - r1
            if (r1 <= 0) goto Le
            r4.ensureCapacity(r0)
        Le:
            byte[] r0 = r4.bytes
            int r1 = r4.off
            int r2 = r5.length
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r0, r1, r2)
            int r0 = r4.off
            int r5 = r5.length
            int r0 = r0 + r5
            r4.off = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeReference(java.lang.String r4) {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = -109(0xffffffffffffff93, float:NaN)
            r0[r1] = r2
            java.lang.String r0 = r3.lastReference
            if (r4 != r0) goto L22
            java.lang.String r0 = "#-1"
            r3.writeString(r0)
            goto L25
        L22:
            r3.writeString(r4)
        L25:
            r3.lastReference = r4
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(int r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(long r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r0.writeNull()
            return
        L6:
            char[] r1 = r1.toCharArray()
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.util.List<java.lang.String> r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            int r0 = r4.size()
            r3.startArray(r0)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3.writeString(r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(short r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Boolean.toString(r1)
            r0.writeString(r1)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(byte[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r15) {
            r14 = this;
            if (r15 != 0) goto L6
            r14.writeNull()
            return
        L6:
            int r0 = r14.off
            int r1 = r15.length
            int r2 = r15.length
            r3 = 47
            r4 = 255(0xff, float:3.57E-43)
            r5 = 0
            r6 = 1
            if (r2 >= r3) goto L48
            int r2 = r0 + 1
            int r7 = r2 + r1
            byte[] r8 = r14.bytes
            int r8 = r8.length
            int r8 = r7 - r8
            if (r8 <= 0) goto L20
            r14.ensureCapacity(r7)
        L20:
            byte[] r7 = r14.bytes
            int r8 = r1 + 73
            byte r8 = (byte) r8
            r7[r0] = r8
            r0 = r5
        L28:
            int r7 = r15.length
            if (r0 >= r7) goto L3c
            char r7 = r15[r0]
            if (r7 <= r4) goto L31
            r0 = r5
            goto L3d
        L31:
            byte[] r8 = r14.bytes
            int r9 = r2 + 1
            byte r7 = (byte) r7
            r8[r2] = r7
            int r0 = r0 + 1
            r2 = r9
            goto L28
        L3c:
            r0 = r6
        L3d:
            if (r0 == 0) goto L42
            r14.off = r2
            return
        L42:
            int r2 = r14.off
            r13 = r2
            r2 = r0
            r0 = r13
            goto L49
        L48:
            r2 = r6
        L49:
            int r7 = r15.length
            r7 = r7 & (-4)
            r8 = r5
        L4d:
            if (r8 >= r7) goto L6a
            char r9 = r15[r8]
            int r10 = r8 + 1
            char r10 = r15[r10]
            int r11 = r8 + 2
            char r11 = r15[r11]
            int r12 = r8 + 3
            char r12 = r15[r12]
            if (r9 > r4) goto L69
            if (r10 > r4) goto L69
            if (r11 > r4) goto L69
            if (r12 <= r4) goto L66
            goto L69
        L66:
            int r8 = r8 + 4
            goto L4d
        L69:
            r2 = r5
        L6a:
            if (r2 == 0) goto L78
        L6c:
            int r7 = r15.length
            if (r8 >= r7) goto L78
            char r7 = r15[r8]
            if (r7 <= r4) goto L75
            r2 = r5
            goto L78
        L75:
            int r8 = r8 + 1
            goto L6c
        L78:
            if (r2 == 0) goto L7c
            r4 = r1
            goto L7e
        L7c:
            int r4 = r1 * 3
        L7e:
            int r4 = r4 + r0
            int r4 = r4 + 6
            byte[] r7 = r14.bytes
            int r7 = r7.length
            int r7 = r4 - r7
            if (r7 <= 0) goto L8b
            r14.ensureCapacity(r4)
        L8b:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r2 == 0) goto Lbb
            if (r1 > r3) goto L9b
            byte[] r2 = r14.bytes
            int r3 = r0 + 1
            int r1 = r1 + 73
            byte r1 = (byte) r1
            r2[r0] = r1
            goto Lab
        L9b:
            byte[] r2 = r14.bytes
            if (r1 > r4) goto La5
            putStringSizeSmall(r2, r0, r1)
            int r3 = r0 + 3
            goto Lab
        La5:
            int r1 = putStringSizeLarge(r2, r0, r1)
            int r3 = r0 + r1
        Lab:
            int r0 = r15.length
            if (r5 >= r0) goto L112
            byte[] r0 = r14.bytes
            int r1 = r3 + 1
            char r2 = r15[r5]
            byte r2 = (byte) r2
            r0[r3] = r2
            int r5 = r5 + 1
            r3 = r1
            goto Lab
        Lbb:
            int r1 = r15.length
            int r1 = r1 * 3
            int r2 = sizeOfInt(r1)
            int r1 = r1 + r0
            int r1 = r1 + r2
            int r1 = r1 + r6
            r14.ensureCapacity(r1)
            int r1 = r15.length
            byte[] r7 = r14.bytes
            int r8 = r0 + r2
            int r8 = r8 + r6
            int r15 = com.alibaba.fastjson2.util.IOUtils.encodeUTF8(r15, r5, r1, r7, r8)
            int r15 = r15 - r0
            int r15 = r15 - r2
            int r15 = r15 - r6
            int r1 = sizeOfInt(r15)
            if (r2 == r1) goto Le2
            byte[] r2 = r14.bytes
            int r1 = r1 + r0
            int r1 = r1 + r6
            java.lang.System.arraycopy(r2, r8, r2, r1, r15)
        Le2:
            byte[] r1 = r14.bytes
            int r2 = r0 + 1
            r5 = 122(0x7a, float:1.71E-43)
            r1[r0] = r5
            r5 = -16
            if (r15 < r5) goto Lf6
            if (r15 > r3) goto Lf6
            int r0 = r0 + 2
            byte r3 = (byte) r15
            r1[r2] = r3
            goto L110
        Lf6:
            r3 = -2048(0xfffffffffffff800, float:NaN)
            if (r15 < r3) goto L10b
            if (r15 > r4) goto L10b
            int r3 = r15 >> 8
            int r3 = r3 + 56
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r0 + 2
            byte r3 = (byte) r15
            r1[r2] = r3
            int r0 = r0 + 3
            goto L110
        L10b:
            int r0 = writeInt32(r1, r2, r15)
            int r0 = r0 + r2
        L110:
            int r3 = r0 + r15
        L112:
            r14.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r11, int r12, int r13) {
            r10 = this;
            if (r11 != 0) goto L6
            r10.writeNull()
            return
        L6:
            r0 = 47
            r1 = 0
            r2 = 255(0xff, float:3.57E-43)
            r3 = 1
            if (r13 >= r0) goto L49
            int r4 = r10.off
            int r5 = r4 + 1
            int r5 = r5 + r13
            byte[] r6 = r10.bytes
            int r6 = r6.length
            int r6 = r5 - r6
            if (r6 <= 0) goto L1d
            r10.ensureCapacity(r5)
        L1d:
            byte[] r5 = r10.bytes
            int r6 = r10.off
            int r7 = r6 + 1
            r10.off = r7
            int r7 = r13 + 73
            byte r7 = (byte) r7
            r5[r6] = r7
            r5 = r12
        L2b:
            if (r5 >= r13) goto L41
            char r6 = r11[r5]
            if (r6 <= r2) goto L33
            r5 = r1
            goto L42
        L33:
            byte[] r7 = r10.bytes
            int r8 = r10.off
            int r9 = r8 + 1
            r10.off = r9
            byte r6 = (byte) r6
            r7[r8] = r6
            int r5 = r5 + 1
            goto L2b
        L41:
            r5 = r3
        L42:
            if (r5 == 0) goto L46
            goto Le0
        L46:
            r10.off = r4
            goto L4a
        L49:
            r5 = r3
        L4a:
            int r4 = r11.length
            r4 = r4 & (-4)
        L4d:
            if (r12 >= r4) goto L6a
            char r6 = r11[r12]
            int r7 = r12 + 1
            char r7 = r11[r7]
            int r8 = r12 + 2
            char r8 = r11[r8]
            int r9 = r12 + 3
            char r9 = r11[r9]
            if (r6 > r2) goto L69
            if (r7 > r2) goto L69
            if (r8 > r2) goto L69
            if (r9 <= r2) goto L66
            goto L69
        L66:
            int r12 = r12 + 4
            goto L4d
        L69:
            r5 = r1
        L6a:
            if (r5 == 0) goto L78
        L6c:
            int r4 = r11.length
            if (r12 >= r4) goto L78
            char r4 = r11[r12]
            if (r4 <= r2) goto L75
            r5 = r1
            goto L78
        L75:
            int r12 = r12 + 1
            goto L6c
        L78:
            if (r5 == 0) goto L7c
            r12 = r13
            goto L7e
        L7c:
            int r12 = r13 * 3
        L7e:
            int r2 = r10.off
            int r12 = r12 + r2
            int r12 = r12 + 6
            byte[] r2 = r10.bytes
            int r2 = r2.length
            int r2 = r12 - r2
            if (r2 <= 0) goto L8d
            r10.ensureCapacity(r12)
        L8d:
            r12 = 2047(0x7ff, float:2.868E-42)
            if (r5 == 0) goto Le1
            if (r13 > r0) goto La1
            byte[] r12 = r10.bytes
            int r0 = r10.off
            int r2 = r0 + 1
            r10.off = r2
            int r13 = r13 + 73
            byte r13 = (byte) r13
            r12[r0] = r13
            goto Lcd
        La1:
            byte[] r0 = r10.bytes
            r2 = 121(0x79, float:1.7E-43)
            if (r13 > r12) goto Lc2
            int r12 = r10.off
            int r3 = r12 + 1
            r10.off = r3
            r0[r12] = r2
            int r2 = r12 + 2
            r10.off = r2
            int r4 = r13 >> 8
            int r4 = r4 + 56
            byte r4 = (byte) r4
            r0[r3] = r4
            int r12 = r12 + 3
            r10.off = r12
            byte r12 = (byte) r13
            r0[r2] = r12
            goto Lcd
        Lc2:
            int r12 = r10.off
            int r3 = r12 + 1
            r10.off = r3
            r0[r12] = r2
            r10.writeInt32(r13)
        Lcd:
            int r12 = r11.length
            if (r1 >= r12) goto Le0
            byte[] r12 = r10.bytes
            int r13 = r10.off
            int r0 = r13 + 1
            r10.off = r0
            char r0 = r11[r1]
            byte r0 = (byte) r0
            r12[r13] = r0
            int r1 = r1 + 1
            goto Lcd
        Le0:
            return
        Le1:
            int r13 = r11.length
            int r13 = r13 * 3
            int r2 = sizeOfInt(r13)
            int r4 = r10.off
            int r4 = r4 + r13
            int r4 = r4 + r2
            int r4 = r4 + r3
            r10.ensureCapacity(r4)
            int r13 = r11.length
            byte[] r4 = r10.bytes
            int r5 = r10.off
            int r5 = r5 + r2
            int r5 = r5 + r3
            int r11 = com.alibaba.fastjson2.util.IOUtils.encodeUTF8(r11, r1, r13, r4, r5)
            int r13 = r10.off
            int r11 = r11 - r13
            int r11 = r11 - r2
            int r11 = r11 - r3
            int r13 = sizeOfInt(r11)
            if (r2 == r13) goto L111
            byte[] r1 = r10.bytes
            int r4 = r10.off
            int r2 = r2 + r4
            int r2 = r2 + r3
            int r4 = r4 + r13
            int r4 = r4 + r3
            java.lang.System.arraycopy(r1, r2, r1, r4, r11)
        L111:
            byte[] r13 = r10.bytes
            int r1 = r10.off
            int r2 = r1 + 1
            r10.off = r2
            r3 = 122(0x7a, float:1.71E-43)
            r13[r1] = r3
            r3 = -16
            if (r11 < r3) goto L12b
            if (r11 > r0) goto L12b
            int r1 = r1 + 2
            r10.off = r1
            byte r12 = (byte) r11
            r13[r2] = r12
            goto L147
        L12b:
            r0 = -2048(0xfffffffffffff800, float:NaN)
            if (r11 < r0) goto L144
            if (r11 > r12) goto L144
            int r12 = r1 + 2
            r10.off = r12
            int r0 = r11 >> 8
            int r0 = r0 + 56
            byte r0 = (byte) r0
            r13[r2] = r0
            int r1 = r1 + 3
            r10.off = r1
            byte r0 = (byte) r11
            r13[r12] = r0
            goto L147
        L144:
            r10.writeInt32(r11)
        L147:
            int r12 = r10.off
            int r12 = r12 + r11
            r10.off = r12
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(char[] r4, int r5, int r6, boolean r7) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeNull()
            return
        L6:
            r7 = 0
            r0 = r7
        L8:
            if (r0 >= r6) goto L1e
            int r1 = r0 + r5
            char r1 = r4[r1]
            r2 = 255(0xff, float:3.57E-43)
            if (r1 <= r2) goto L1b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r5, r6)
            r3.writeString(r7)
            return
        L1b:
            int r0 = r0 + 1
            goto L8
        L1e:
            byte[] r0 = r3.bytes
            r1 = 47
            if (r6 > r1) goto L30
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            int r2 = r6 + 73
            byte r2 = (byte) r2
            r0[r1] = r2
            goto L3d
        L30:
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = 121(0x79, float:1.7E-43)
            r0[r1] = r2
            r3.writeInt32(r6)
        L3d:
            if (r7 >= r6) goto L51
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            int r2 = r5 + r7
            char r2 = r4[r2]
            byte r2 = (byte) r2
            r0[r1] = r2
            int r7 = r7 + 1
            goto L3d
        L51:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(double[] r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            int r0 = r4.length
            r3.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            r1 = r4[r0]
            r3.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(float[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(int[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(long[] r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r3.writeArrayNull()
            return
        L6:
            int r0 = r4.length
            r3.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L16
            r1 = r4[r0]
            r3.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(java.lang.String[] r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeArrayNull()
            return
        L6:
            int r0 = r6.length
            r5.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r6.length
            if (r0 >= r1) goto L31
            r1 = r6[r0]
            if (r1 != 0) goto L2b
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r1 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r3 = r3.mask
            long r1 = r1 | r3
            boolean r1 = r5.isEnabled(r1)
            if (r1 == 0) goto L27
            java.lang.String r1 = ""
            r5.writeString(r1)
            goto L2e
        L27:
            r5.writeNull()
            goto L2e
        L2b:
            r5.writeString(r1)
        L2e:
            int r0 = r0 + 1
            goto Lb
        L31:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(short[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            short r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeString(boolean[] r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r2.writeArrayNull()
            return
        L6:
            int r0 = r3.length
            r2.startArray(r0)
            r0 = 0
        Lb:
            int r1 = r3.length
            if (r0 >= r1) goto L16
            boolean r1 = r3[r0]
            r2.writeString(r1)
            int r0 = r0 + 1
            goto Lb
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringLatin1(byte[] r6) {
            r5 = this;
            if (r6 != 0) goto L6
            r5.writeStringNull()
            return
        L6:
            int r0 = r5.off
            int r1 = r6.length
            int r2 = r6.length
            int r2 = r2 + r0
            int r2 = r2 + 6
            byte[] r3 = r5.bytes
            int r3 = r3.length
            int r3 = r2 - r3
            if (r3 <= 0) goto L17
            r5.ensureCapacity(r2)
        L17:
            byte[] r2 = r5.bytes
            r3 = 47
            if (r1 > r3) goto L25
            int r3 = r0 + 1
            int r4 = r1 + 73
            byte r4 = (byte) r4
            r2[r0] = r4
            goto L34
        L25:
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r1 > r3) goto L2f
            putStringSizeSmall(r2, r0, r1)
            int r3 = r0 + 3
            goto L34
        L2f:
            int r3 = putStringSizeLarge(r2, r0, r1)
            int r3 = r3 + r0
        L34:
            r0 = 0
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r0, r2, r3, r4)
            int r3 = r3 + r1
            r5.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringNull() {
            r3 = this;
            int r0 = r3.off
            byte[] r1 = r3.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r3.ensureCapacity(r0)
        Lc:
            byte[] r0 = r3.bytes
            int r1 = r3.off
            int r2 = r1 + 1
            r3.off = r2
            r2 = -81
            r0[r1] = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeStringUTF16(byte[] r6) {
            r5 = this;
            int r0 = r5.off
            int r1 = r6.length
            int r2 = r0 + r1
            int r2 = r2 + 6
            byte[] r3 = r5.bytes
            int r3 = r3.length
            if (r2 < r3) goto Lf
            r5.ensureCapacity(r2)
        Lf:
            byte[] r2 = r5.bytes
            int r3 = r0 + 1
            boolean r4 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r4 == 0) goto L1a
            r4 = 125(0x7d, float:1.75E-43)
            goto L1c
        L1a:
            r4 = 124(0x7c, float:1.74E-43)
        L1c:
            r2[r0] = r4
            int r0 = writeInt32(r2, r3, r1)
            int r3 = r3 + r0
            r0 = 0
            java.lang.System.arraycopy(r6, r0, r2, r3, r1)
            int r3 = r3 + r1
            r5.off = r3
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeSymbol(int r6) {
            r5 = this;
            int r0 = r5.off
            int r0 = r0 + 3
            byte[] r1 = r5.bytes
            int r1 = r1.length
            if (r0 < r1) goto Lc
            r5.ensureCapacity(r0)
        Lc:
            byte[] r0 = r5.bytes
            int r1 = r5.off
            int r2 = r1 + 1
            r5.off = r2
            r3 = 127(0x7f, float:1.78E-43)
            r0[r1] = r3
            r3 = -16
            if (r6 < r3) goto L28
            r3 = 47
            if (r6 > r3) goto L28
            int r1 = r1 + 2
            r5.off = r1
            byte r6 = (byte) r6
            r0[r2] = r6
            return
        L28:
            r3 = -2048(0xfffffffffffff800, float:NaN)
            if (r6 < r3) goto L43
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r6 > r3) goto L43
            int r3 = r1 + 2
            r5.off = r3
            int r4 = r6 >> 8
            int r4 = r4 + 56
            byte r4 = (byte) r4
            r0[r2] = r4
            int r1 = r1 + 3
            r5.off = r1
            byte r6 = (byte) r6
            r0[r3] = r6
            return
        L43:
            r5.writeInt32(r6)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeSymbol(java.lang.String r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r1.writeNull()
            return
        L6:
            com.alibaba.fastjson2.SymbolTable r0 = r1.symbolTable
            if (r0 == 0) goto L1a
            int r0 = r0.getOrdinal(r2)
            if (r0 < 0) goto L1a
            r2 = 127(0x7f, float:1.78E-43)
            r1.writeRaw(r2)
            int r2 = -r0
            r1.writeInt32(r2)
            return
        L1a:
            r1.writeString(r2)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTimeHHMMSS8(int r1, int r2, int r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "unsupported operation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeTypeName(java.lang.String r6) {
            r5 = this;
            int r0 = r5.off
            byte[] r1 = r5.bytes
            int r1 = r1.length
            if (r0 != r1) goto Lc
            int r0 = r0 + 1
            r5.ensureCapacity(r0)
        Lc:
            byte[] r0 = r5.bytes
            int r1 = r5.off
            int r2 = r1 + 1
            r5.off = r2
            r2 = -110(0xffffffffffffff92, float:NaN)
            r0[r1] = r2
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)
            com.alibaba.fastjson2.SymbolTable r2 = r5.symbolTable
            r3 = -1
            if (r2 == 0) goto L30
            int r2 = r2.getOrdinalByHashCode(r0)
            if (r2 != r3) goto L3a
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r4 = r5.symbols
            if (r4 == 0) goto L3a
            int r2 = r4.get(r0)
            goto L3a
        L30:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = r5.symbols
            if (r2 == 0) goto L39
            int r2 = r2.get(r0)
            goto L3a
        L39:
            r2 = r3
        L3a:
            if (r2 != r3) goto L59
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = r5.symbols
            if (r2 != 0) goto L47
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = new com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap
            r2.<init>()
            r5.symbols = r2
        L47:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r2 = r5.symbols
            int r3 = r5.symbolIndex
            int r4 = r3 + 1
            r5.symbolIndex = r4
            r2.put(r0, r3)
            r5.writeString(r6)
            r5.writeInt32(r3)
            return
        L59:
            int r6 = r5.off
            byte[] r0 = r5.bytes
            int r0 = r0.length
            if (r6 != r0) goto L65
            int r6 = r6 + 1
            r5.ensureCapacity(r6)
        L65:
            r5.writeInt32(r2)
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public boolean writeTypeName(byte[] r9, long r10) {
            r8 = this;
            com.alibaba.fastjson2.SymbolTable r0 = r8.symbolTable
            if (r0 == 0) goto L10
            int r0 = r0.getOrdinalByHashCode(r10)
            r1 = -1
            if (r0 == r1) goto L10
            boolean r9 = r8.writeTypeNameSymbol(r0)
            return r9
        L10:
            long r0 = r8.rootTypeNameHash
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1b
            r3 = r1
        L19:
            r10 = r2
            goto L50
        L1b:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r0 = r8.symbols
            int r3 = r8.symbolIndex
            if (r0 == 0) goto L2f
            int r3 = r0.putIfAbsent(r10, r3)
            int r10 = r8.symbolIndex
            if (r3 == r10) goto L2a
            goto L19
        L2a:
            int r10 = r10 + r2
            r8.symbolIndex = r10
        L2d:
            r10 = r1
            goto L50
        L2f:
            int r0 = r3 + 1
            r8.symbolIndex = r0
            if (r3 != 0) goto L37
            r8.rootTypeNameHash = r10
        L37:
            if (r3 != 0) goto L48
            com.alibaba.fastjson2.JSONWriter$Context r0 = r8.context
            long r4 = r0.features
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNameAsSymbol
            long r6 = r0.mask
            long r4 = r4 & r6
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L2d
        L48:
            com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap r0 = new com.alibaba.fastjson2.internal.trove.map.hash.TLongIntHashMap
            r0.<init>(r10, r3)
            r8.symbols = r0
            goto L2d
        L50:
            if (r10 == 0) goto L57
            int r9 = -r3
            r8.writeTypeNameSymbol(r9)
            return r1
        L57:
            int r10 = r8.off
            int r11 = r10 + 2
            int r0 = r9.length
            int r11 = r11 + r0
            byte[] r0 = r8.bytes
            int r0 = r0.length
            if (r11 <= r0) goto L65
            r8.ensureCapacity(r11)
        L65:
            byte[] r11 = r8.bytes
            int r0 = r10 + 1
            r4 = -110(0xffffffffffffff92, float:NaN)
            r11[r10] = r4
            int r10 = r9.length
            java.lang.System.arraycopy(r9, r1, r11, r0, r10)
            int r9 = r9.length
            int r0 = r0 + r9
            r9 = -16
            if (r3 < r9) goto L82
            r9 = 47
            if (r3 > r9) goto L82
            byte r9 = (byte) r3
            r11[r0] = r9
            int r0 = r0 + r2
            r8.off = r0
            goto L87
        L82:
            r8.off = r0
            r8.writeInt32(r3)
        L87:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeUUID(java.util.UUID r18) {
            r17 = this;
            r0 = r17
            if (r18 != 0) goto L8
            r0.writeNull()
            return
        L8:
            long r1 = r18.getMostSignificantBits()
            long r3 = r18.getLeastSignificantBits()
            int r5 = r0.off
            int r6 = r5 + 18
            r0.ensureCapacity(r6)
            byte[] r7 = r0.bytes
            r8 = -111(0xffffffffffffff91, float:NaN)
            r7[r5] = r8
            int r8 = r5 + 1
            r9 = 16
            r7[r8] = r9
            int r8 = r5 + 2
            r10 = 56
            long r11 = r1 >>> r10
            int r11 = (int) r11
            byte r11 = (byte) r11
            r7[r8] = r11
            int r8 = r5 + 3
            r11 = 48
            long r12 = r1 >>> r11
            int r12 = (int) r12
            byte r12 = (byte) r12
            r7[r8] = r12
            int r8 = r5 + 4
            r12 = 40
            long r13 = r1 >>> r12
            int r13 = (int) r13
            byte r13 = (byte) r13
            r7[r8] = r13
            int r8 = r5 + 5
            r13 = 32
            long r14 = r1 >>> r13
            int r14 = (int) r14
            byte r14 = (byte) r14
            r7[r8] = r14
            int r8 = r5 + 6
            r14 = 24
            r18 = r9
            r15 = r10
            long r9 = r1 >>> r14
            int r9 = (int) r9
            byte r9 = (byte) r9
            r7[r8] = r9
            int r8 = r5 + 7
            long r9 = r1 >>> r18
            int r9 = (int) r9
            byte r9 = (byte) r9
            r7[r8] = r9
            int r8 = r5 + 8
            r16 = 8
            long r9 = r1 >>> r16
            int r9 = (int) r9
            byte r9 = (byte) r9
            r7[r8] = r9
            int r8 = r5 + 9
            int r1 = (int) r1
            byte r1 = (byte) r1
            r7[r8] = r1
            int r1 = r5 + 10
            long r8 = r3 >>> r15
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 11
            long r8 = r3 >>> r11
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 12
            long r8 = r3 >>> r12
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 13
            long r8 = r3 >>> r13
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 14
            long r8 = r3 >>> r14
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 15
            long r8 = r3 >>> r18
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r1 = r5 + 16
            long r8 = r3 >>> r16
            int r2 = (int) r8
            byte r2 = (byte) r2
            r7[r1] = r2
            int r5 = r5 + 17
            int r1 = (int) r3
            byte r1 = (byte) r1
            r7[r5] = r1
            r0.off = r6
            return
    }

    @Override // com.alibaba.fastjson2.JSONWriter
    public void writeZonedDateTime(java.time.ZonedDateTime r7) {
            r6 = this;
            if (r7 != 0) goto L6
            r6.writeNull()
            return
        L6:
            int r0 = r6.off
            int r1 = r0 + 8
            r6.ensureCapacity(r1)
            byte[] r2 = r6.bytes
            r3 = -86
            r2[r0] = r3
            int r3 = r7.getYear()
            int r4 = r0 + 1
            int r5 = r3 >>> 8
            byte r5 = (byte) r5
            r2[r4] = r5
            int r4 = r0 + 2
            byte r3 = (byte) r3
            r2[r4] = r3
            int r3 = r0 + 3
            int r4 = r7.getMonthValue()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 4
            int r4 = r7.getDayOfMonth()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 5
            int r4 = r7.getHour()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 6
            int r4 = r7.getMinute()
            byte r4 = (byte) r4
            r2[r3] = r4
            int r0 = r0 + 7
            int r3 = r7.getSecond()
            byte r3 = (byte) r3
            r2[r0] = r3
            r6.off = r1
            int r0 = r7.getNano()
            r6.writeInt32(r0)
            java.time.ZoneId r7 = r7.getZone()
            java.lang.String r7 = r7.getId()
            java.lang.String r0 = "Asia/Shanghai"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L6f
            byte[] r7 = com.alibaba.fastjson2.JSONWriterJSONB.SHANGHAI_ZONE_ID_NAME_BYTES
            r6.writeRaw(r7)
            return
        L6f:
            r6.writeString(r7)
            return
    }
}
