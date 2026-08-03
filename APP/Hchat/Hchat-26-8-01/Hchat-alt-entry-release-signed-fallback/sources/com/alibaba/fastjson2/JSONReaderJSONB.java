package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class JSONReaderJSONB extends com.alibaba.fastjson2.JSONReader {
    static final long BASE = 0;
    static final byte[] FIXED_TYPE_SIZE = null;
    static java.nio.charset.Charset GB18030;
    static final byte[] SHANGHAI_ZONE_ID_NAME_BYTES = null;
    protected final byte[] bytes;
    protected final com.alibaba.fastjson2.JSONFactory.CacheItem cacheItem;
    protected char[] charBuf;
    protected final int end;
    protected final int length;
    protected int strBegin;
    protected int strlen;
    protected byte strtype;
    protected int symbol0Begin;
    protected long symbol0Hash;
    protected int symbol0Length;
    protected byte symbol0StrType;
    protected final com.alibaba.fastjson2.SymbolTable symbolTable;
    protected long[] symbols;
    protected byte type;
    protected byte[] valueBytes;

    static {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            java.lang.Class<byte[]> r1 = byte[].class
            int r0 = r0.arrayBaseOffset(r1)
            long r0 = (long) r0
            com.alibaba.fastjson2.JSONReaderJSONB.BASE = r0
            java.lang.String r0 = "Asia/Shanghai"
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.JSONReaderJSONB.SHANGHAI_ZONE_ID_NAME_BYTES = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 0, -1, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 5, 0, 0, 1, 1, 1, 0, 0, 0, 9, 0, 5, 0, 0, 0, 0, 3, 2, 9, 5, 3, 3, 3, 3, 3, 3, 3, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1} // fill-array
            com.alibaba.fastjson2.JSONReaderJSONB.FIXED_TYPE_SIZE = r0
            return
    }

    public JSONReaderJSONB(com.alibaba.fastjson2.JSONReader.Context r6, java.io.InputStream r7) {
            r5 = this;
            r0 = 1
            r5.<init>(r6, r0)
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r1 = java.lang.System.identityHashCode(r1)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r2.length
            int r3 = r3 - r0
            r0 = r1 & r3
            r0 = r2[r0]
            r5.cacheItem = r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r2 = 0
            java.lang.Object r0 = r1.getAndSet(r0, r2)
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L25
            int r0 = r6.bufferSize
            byte[] r0 = new byte[r0]
        L25:
            r1 = 0
            r2 = r1
        L27:
            int r3 = r0.length     // Catch: java.io.IOException -> L4a
            int r3 = r3 - r2
            int r3 = r7.read(r0, r2, r3)     // Catch: java.io.IOException -> L4a
            r4 = -1
            if (r3 != r4) goto L3d
            r5.bytes = r0
            r5.offset = r1
            r5.length = r2
            r5.end = r2
            com.alibaba.fastjson2.SymbolTable r6 = r6.symbolTable
            r5.symbolTable = r6
            return
        L3d:
            int r2 = r2 + r3
            int r3 = r0.length     // Catch: java.io.IOException -> L4a
            if (r2 != r3) goto L27
            int r3 = r0.length     // Catch: java.io.IOException -> L4a
            int r4 = r6.bufferSize     // Catch: java.io.IOException -> L4a
            int r3 = r3 + r4
            byte[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.io.IOException -> L4a
            goto L27
        L4a:
            r6 = move-exception
            java.lang.String r7 = "read error"
            ah.a.x(r7, r6)
            r6 = 0
            throw r6
    }

    public JSONReaderJSONB(com.alibaba.fastjson2.JSONReader.Context r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.bytes = r3
            r1.offset = r4
            r1.length = r5
            int r4 = r4 + r5
            r1.end = r4
            com.alibaba.fastjson2.SymbolTable r2 = r2.symbolTable
            r1.symbolTable = r2
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            int r3 = java.lang.System.identityHashCode(r3)
            int r4 = r2.length
            int r4 = r4 - r0
            r3 = r3 & r4
            r2 = r2[r3]
            r1.cacheItem = r2
            return
    }

    public static int getInt(byte[] r5, int r6) {
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r3 = (long) r6
            long r1 = r1 + r3
            int r5 = r0.getInt(r5, r1)
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto Lf
            return r5
        Lf:
            int r5 = java.lang.Integer.reverseBytes(r5)
            return r5
    }

    public static int getInt3(byte[] r1, int r2, int r3) {
            int r3 = r3 + (-68)
            int r3 = r3 << 16
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            return r3
    }

    private com.alibaba.fastjson2.reader.ObjectReader getObjectReaderContext(com.alibaba.fastjson2.reader.ObjectReader r3, java.lang.Class r4, java.lang.ClassLoader r5) {
            r2 = this;
            java.lang.String r0 = r2.getString()
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r0)
            if (r1 != 0) goto L16
            if (r5 != 0) goto L12
            java.lang.Class<com.alibaba.fastjson2.JSON> r5 = com.alibaba.fastjson2.JSON.class
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L16
        L12:
            java.lang.Class r1 = r5.loadClass(r0)     // Catch: java.lang.ClassNotFoundException -> L16
        L16:
            if (r1 == 0) goto L22
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L22
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.getObjectReader(r1)
        L22:
            return r3
    }

    private com.alibaba.fastjson2.JSONException notSupportString() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "readString not support type "
            r1.<init>(r2)
            byte r2 = r3.strtype
            java.lang.String r2 = com.alibaba.fastjson2.JSONB.typeName(r2)
            r1.append(r2)
            java.lang.String r2 = ", offset "
            r1.append(r2)
            int r2 = r3.offset
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            byte[] r2 = r3.bytes
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static com.alibaba.fastjson2.JSONException notSupportType(byte r3) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "name not support input : "
            r1.<init>(r2)
            java.lang.String r3 = com.alibaba.fastjson2.JSONB.typeName(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    private java.math.BigInteger readBigInteger0(byte r7) {
            r6 = this;
            byte[] r0 = r6.bytes
            r1 = -111(0xffffffffffffff91, float:NaN)
            if (r7 == r1) goto L21c
            r1 = -71
            if (r7 == r1) goto L201
            r1 = 72
            if (r7 == r1) goto L1ef
            r1 = 124(0x7c, float:1.74E-43)
            r2 = -1
            r3 = 46
            if (r7 == r1) goto L1c8
            r1 = 121(0x79, float:1.7E-43)
            if (r7 == r1) goto L1a1
            r1 = 122(0x7a, float:1.71E-43)
            if (r7 == r1) goto L17a
            switch(r7) {
                case -81: goto L178;
                case -80: goto L175;
                case -79: goto L172;
                case -78: goto L175;
                case -77: goto L172;
                case -76: goto L167;
                case -75: goto L142;
                case -74: goto L137;
                case -73: goto L121;
                default: goto L20;
            }
        L20:
            switch(r7) {
                case -68: goto L10a;
                case -67: goto Lfc;
                case -66: goto Ldc;
                case -65: goto L1ef;
                default: goto L23;
            }
        L23:
            r1 = -16
            if (r7 < r1) goto L31
            r1 = 47
            if (r7 > r1) goto L31
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L31:
            r1 = 48
            if (r7 < r1) goto L4e
            r1 = 63
            if (r7 > r1) goto L4e
            int r7 = r7 + (-56)
            int r7 = r7 << 8
            int r1 = r6.offset
            int r2 = r1 + 1
            r6.offset = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r0
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L4e:
            r1 = 64
            if (r7 < r1) goto L68
            r1 = 71
            if (r7 > r1) goto L68
            int r1 = r6.offset
            int r7 = getInt3(r0, r1, r7)
            int r0 = r6.offset
            int r0 = r0 + 2
            r6.offset = r0
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L68:
            r1 = -40
            if (r7 < r1) goto L78
            r1 = -17
            if (r7 > r1) goto L78
            int r7 = r7 + 32
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L78:
            r1 = -56
            if (r7 < r1) goto L95
            r1 = -41
            if (r7 > r1) goto L95
            int r7 = r7 + 48
            int r7 = r7 << 8
            int r1 = r6.offset
            int r2 = r1 + 1
            r6.offset = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r0
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L95:
            r1 = -64
            if (r7 < r1) goto Lbd
            r1 = -57
            if (r7 > r1) goto Lbd
            int r7 = r7 + 60
            int r7 = r7 << 16
            int r1 = r6.offset
            int r2 = r1 + 1
            r6.offset = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r7 = r7 + r3
            int r1 = r1 + 2
            r6.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r0
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        Lbd:
            r0 = 73
            if (r7 < r0) goto Ld7
            r1 = 120(0x78, float:1.68E-43)
            if (r7 > r1) goto Ld7
            int r7 = r7 - r0
            int r0 = r6.offset
            java.lang.String r0 = r6.getLatin1String(r0, r7)
            int r1 = r6.offset
            int r1 = r1 + r7
            r6.offset = r1
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
            return r7
        Ld7:
            com.alibaba.fastjson2.JSONException r7 = notSupportType(r7)
            throw r7
        Ldc:
            sun.misc.Unsafe r7 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r3 = r6.offset
            long r3 = (long) r3
            long r1 = r1 + r3
            long r0 = r7.getLong(r0, r1)
            int r7 = r6.offset
            int r7 = r7 + 8
            r6.offset = r7
            boolean r7 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r7 == 0) goto Lf3
            goto Lf7
        Lf3:
            long r0 = java.lang.Long.reverseBytes(r0)
        Lf7:
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        Lfc:
            int r7 = r6.offset
            int r1 = r7 + 1
            r6.offset = r1
            r7 = r0[r7]
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L10a:
            int r7 = r6.offset
            int r1 = r7 + 1
            r1 = r0[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0 = r0[r7]
            int r0 = r0 << 8
            int r1 = r1 + r0
            int r7 = r7 + 2
            r6.offset = r7
            long r0 = (long) r1
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L121:
            int r7 = r6.offset
            int r7 = getInt(r0, r7)
            int r0 = r6.offset
            int r0 = r0 + 4
            r6.offset = r0
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L137:
            int r7 = r6.readInt32Value()
            float r7 = (float) r7
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L142:
            sun.misc.Unsafe r7 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r3 = r6.offset
            long r3 = (long) r3
            long r1 = r1 + r3
            long r0 = r7.getLong(r0, r1)
            int r7 = r6.offset
            int r7 = r7 + 8
            r6.offset = r7
            boolean r7 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r7 == 0) goto L159
            goto L15d
        L159:
            long r0 = java.lang.Long.reverseBytes(r0)
        L15d:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = (long) r0
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L167:
            long r0 = r6.readInt64Value()
            double r0 = (double) r0
            long r0 = (long) r0
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L172:
            java.math.BigInteger r7 = java.math.BigInteger.ONE
            return r7
        L175:
            java.math.BigInteger r7 = java.math.BigInteger.ZERO
            return r7
        L178:
            r7 = 0
            return r7
        L17a:
            int r7 = r6.readInt32Value()
            java.lang.String r1 = new java.lang.String
            int r4 = r6.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r4, r7, r5)
            int r0 = r6.offset
            int r0 = r0 + r7
            r6.offset = r0
            int r7 = r1.indexOf(r3)
            if (r7 != r2) goto L198
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r1)
            return r7
        L198:
            java.math.BigDecimal r7 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            java.math.BigInteger r7 = r7.toBigInteger()
            return r7
        L1a1:
            int r7 = r6.readInt32Value()
            java.lang.String r1 = new java.lang.String
            int r4 = r6.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.ISO_8859_1
            r1.<init>(r0, r4, r7, r5)
            int r0 = r6.offset
            int r0 = r0 + r7
            r6.offset = r0
            int r7 = r1.indexOf(r3)
            if (r7 != r2) goto L1bf
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r1)
            return r7
        L1bf:
            java.math.BigDecimal r7 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            java.math.BigInteger r7 = r7.toBigInteger()
            return r7
        L1c8:
            int r7 = r6.readInt32Value()
            java.lang.String r1 = new java.lang.String
            int r4 = r6.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16LE
            r1.<init>(r0, r4, r7, r5)
            int r0 = r6.offset
            int r0 = r0 + r7
            r6.offset = r0
            int r7 = r1.indexOf(r3)
            if (r7 != r2) goto L1e6
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r1)
            return r7
        L1e6:
            java.math.BigDecimal r7 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            java.math.BigInteger r7 = r7.toBigInteger()
            return r7
        L1ef:
            int r7 = r6.offset
            int r7 = getInt(r0, r7)
            int r0 = r6.offset
            int r0 = r0 + 4
            r6.offset = r0
            long r0 = (long) r7
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r0)
            return r7
        L201:
            int r7 = r6.readInt32Value()
            java.math.BigInteger r0 = r6.readBigInteger()
            if (r7 != 0) goto L211
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0)
            goto L217
        L211:
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0, r7)
            r7 = r1
        L217:
            java.math.BigInteger r7 = r7.toBigInteger()
            return r7
        L21c:
            int r7 = r6.readInt32Value()
            byte[] r0 = new byte[r7]
            byte[] r1 = r6.bytes
            int r2 = r6.offset
            r3 = 0
            java.lang.System.arraycopy(r1, r2, r0, r3, r7)
            int r1 = r6.offset
            int r1 = r1 + r7
            r6.offset = r1
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
            return r7
    }

    private boolean readBoolValue0(byte r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            byte[] r2 = r0.bytes
            r3 = -81
            r4 = 0
            r5 = 1
            if (r1 == r3) goto L22a
            r3 = 74
            r13 = 102(0x66, float:1.43E-43)
            r14 = 117(0x75, float:1.64E-43)
            r15 = 114(0x72, float:1.6E-43)
            r6 = 116(0x74, float:1.63E-43)
            r7 = 89
            java.lang.String r8 = "not support input "
            r9 = 69
            r10 = 78
            r11 = 101(0x65, float:1.42E-43)
            r16 = 5
            r12 = 4
            if (r1 == r3) goto Lda
            if (r1 == 0) goto Ld9
            if (r1 == r5) goto Ld8
            r3 = 77
            if (r1 == r3) goto Ld5
            if (r1 == r10) goto Ld2
            switch(r1) {
                case 121: goto Lce;
                case 122: goto Lce;
                case 123: goto L37;
                case 124: goto L37;
                case 125: goto L37;
                default: goto L32;
            }
        L32:
            com.alibaba.fastjson2.JSONException r1 = notSupportType(r1)
            throw r1
        L37:
            int r3 = r0.readLength()
            r0.strlen = r3
            byte[] r6 = new byte[r3]
            int r7 = r0.offset
            java.lang.System.arraycopy(r2, r7, r6, r4, r3)
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L4b
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L54
        L4b:
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 != r2) goto L52
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L54
        L52:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
        L54:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6, r1)
            int r1 = r0.offset
            int r3 = r0.strlen
            int r1 = r1 + r3
            r0.offset = r1
            int r1 = r2.hashCode()
            r3 = -1
            switch(r1) {
                case 48: goto Lb7;
                case 49: goto Lac;
                case 78: goto La1;
                case 89: goto L96;
                case 2583950: goto L8d;
                case 3569038: goto L81;
                case 66658563: goto L76;
                case 97196323: goto L6b;
                default: goto L68;
            }
        L68:
            r12 = r3
            goto Lc1
        L6b:
            java.lang.String r1 = "false"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L74
            goto L68
        L74:
            r12 = 7
            goto Lc1
        L76:
            java.lang.String r1 = "FALSE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L7f
            goto L68
        L7f:
            r12 = 6
            goto Lc1
        L81:
            java.lang.String r1 = "true"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L8a
            goto L68
        L8a:
            r12 = r16
            goto Lc1
        L8d:
            java.lang.String r1 = "TRUE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lc1
            goto L68
        L96:
            java.lang.String r1 = "Y"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L9f
            goto L68
        L9f:
            r12 = 3
            goto Lc1
        La1:
            java.lang.String r1 = "N"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Laa
            goto L68
        Laa:
            r12 = 2
            goto Lc1
        Lac:
            java.lang.String r1 = "1"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lb5
            goto L68
        Lb5:
            r12 = r5
            goto Lc1
        Lb7:
            java.lang.String r1 = "0"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lc0
            goto L68
        Lc0:
            r12 = r4
        Lc1:
            switch(r12) {
                case 0: goto Lcd;
                case 1: goto Lcc;
                case 2: goto Lcd;
                case 3: goto Lcc;
                case 4: goto Lcc;
                case 5: goto Lcc;
                case 6: goto Lcd;
                case 7: goto Lcd;
                default: goto Lc4;
            }
        Lc4:
            java.lang.String r1 = r8.concat(r2)
            ah.a.w(r1)
            return r4
        Lcc:
            return r5
        Lcd:
            return r4
        Lce:
            r17 = r4
            goto L17a
        Ld2:
            r17 = r4
            goto L12a
        Ld5:
            r17 = r4
            goto Lf0
        Ld8:
            return r5
        Ld9:
            return r4
        Lda:
            int r1 = r0.offset
            r3 = r2[r1]
            r17 = r4
            r4 = 49
            if (r3 == r4) goto L226
            if (r3 != r7) goto Le8
            goto L226
        Le8:
            r4 = 48
            if (r3 == r4) goto L222
            if (r3 != r10) goto Lf0
            goto L222
        Lf0:
            int r1 = r0.offset
            r3 = r2[r1]
            if (r3 != r6) goto L10c
            int r4 = r1 + 1
            r4 = r2[r4]
            if (r4 != r15) goto L10c
            int r4 = r1 + 2
            r4 = r2[r4]
            if (r4 != r14) goto L10c
            int r4 = r1 + 3
            r4 = r2[r4]
            if (r4 != r11) goto L10c
            int r1 = r1 + r12
            r0.offset = r1
            return r5
        L10c:
            r4 = 84
            if (r3 != r4) goto L12a
            int r3 = r1 + 1
            r3 = r2[r3]
            r4 = 82
            if (r3 != r4) goto L12a
            int r3 = r1 + 2
            r3 = r2[r3]
            r4 = 85
            if (r3 != r4) goto L12a
            int r3 = r1 + 3
            r3 = r2[r3]
            if (r3 != r9) goto L12a
            int r1 = r1 + r12
            r0.offset = r1
            return r5
        L12a:
            int r1 = r0.offset
            r3 = r2[r1]
            if (r3 != r13) goto L153
            int r4 = r1 + 1
            r4 = r2[r4]
            r13 = 97
            if (r4 != r13) goto L153
            int r4 = r1 + 2
            r4 = r2[r4]
            r13 = 108(0x6c, float:1.51E-43)
            if (r4 != r13) goto L153
            int r4 = r1 + 3
            r4 = r2[r4]
            r13 = 115(0x73, float:1.61E-43)
            if (r4 != r13) goto L153
            int r4 = r1 + 4
            r4 = r2[r4]
            if (r4 != r11) goto L153
            int r1 = r1 + 5
            r0.offset = r1
            return r17
        L153:
            r4 = 70
            if (r3 != r4) goto L17a
            int r3 = r1 + 1
            r3 = r2[r3]
            r4 = 65
            if (r3 != r4) goto L17a
            int r3 = r1 + 2
            r3 = r2[r3]
            r4 = 76
            if (r3 != r4) goto L17a
            int r3 = r1 + 3
            r3 = r2[r3]
            r4 = 83
            if (r3 != r4) goto L17a
            int r3 = r1 + 4
            r3 = r2[r3]
            if (r3 != r9) goto L17a
            int r1 = r1 + 5
            r0.offset = r1
            return r17
        L17a:
            int r1 = r0.readLength()
            r0.strlen = r1
            if (r1 != r5) goto L192
            int r3 = r0.offset
            r4 = r2[r3]
            if (r4 != r7) goto L18c
            int r3 = r3 + r5
            r0.offset = r3
            return r5
        L18c:
            if (r4 != r10) goto L20a
            int r3 = r3 + r5
            r0.offset = r3
            return r5
        L192:
            if (r1 != r12) goto L1b0
            int r3 = r0.offset
            r4 = r2[r3]
            if (r4 != r6) goto L1b0
            int r4 = r3 + 1
            r4 = r2[r4]
            if (r4 != r15) goto L1b0
            int r4 = r3 + 2
            r4 = r2[r4]
            if (r4 != r14) goto L1b0
            int r4 = r3 + 3
            r4 = r2[r4]
            if (r4 != r11) goto L1b0
            int r3 = r3 + r12
            r0.offset = r3
            return r5
        L1b0:
            r3 = r16
            if (r1 != r3) goto L20a
            int r3 = r0.offset
            r4 = r2[r3]
            r5 = 102(0x66, float:1.43E-43)
            if (r4 != r5) goto L1e1
            int r5 = r3 + 1
            r5 = r2[r5]
            r13 = 97
            if (r5 != r13) goto L1e1
            int r5 = r3 + 2
            r5 = r2[r5]
            r13 = 108(0x6c, float:1.51E-43)
            if (r5 != r13) goto L1e1
            int r5 = r3 + 3
            r5 = r2[r5]
            r13 = 115(0x73, float:1.61E-43)
            if (r5 != r13) goto L1e1
            int r5 = r3 + 4
            r5 = r2[r5]
            if (r5 != r11) goto L1e1
            r16 = 5
            int r3 = r3 + 5
            r0.offset = r3
            return r17
        L1e1:
            r5 = 70
            if (r4 != r5) goto L20a
            int r4 = r3 + 1
            r4 = r2[r4]
            r5 = 65
            if (r4 != r5) goto L20a
            int r4 = r3 + 2
            r4 = r2[r4]
            r5 = 76
            if (r4 != r5) goto L20a
            int r4 = r3 + 3
            r4 = r2[r4]
            r5 = 83
            if (r4 != r5) goto L20a
            int r4 = r3 + 4
            r4 = r2[r4]
            if (r4 != r9) goto L20a
            r16 = 5
            int r3 = r3 + 5
            r0.offset = r3
            return r17
        L20a:
            java.lang.String r3 = new java.lang.String
            int r4 = r0.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r2, r4, r1, r5)
            int r1 = r0.offset
            int r2 = r0.strlen
            int r1 = r1 + r2
            r0.offset = r1
            java.lang.String r1 = r8.concat(r3)
            ah.a.w(r1)
            return r17
        L222:
            int r1 = r1 + r5
            r0.offset = r1
            return r17
        L226:
            int r1 = r1 + r5
            r0.offset = r1
            return r5
        L22a:
            r17 = r4
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L23e
            r0.wasNull = r5
            return r17
        L23e:
            java.lang.String r1 = "long value not support input null"
            java.lang.String r1 = r0.info(r1)
            ah.a.w(r1)
            return r17
    }

    private java.math.BigDecimal readDecimal0(byte r6) {
            r5 = this;
            r0 = 72
            if (r6 == r0) goto L1d3
            r0 = 124(0x7c, float:1.74E-43)
            if (r6 == r0) goto L1ba
            r0 = 121(0x79, float:1.7E-43)
            if (r6 == r0) goto L1a1
            r0 = 122(0x7a, float:1.71E-43)
            if (r6 == r0) goto L188
            switch(r6) {
                case -81: goto L186;
                case -80: goto L183;
                case -79: goto L180;
                case -78: goto L183;
                case -77: goto L180;
                case -76: goto L175;
                case -75: goto L14e;
                case -74: goto L143;
                case -73: goto L12b;
                default: goto L13;
            }
        L13:
            switch(r6) {
                case -69: goto L121;
                case -68: goto L108;
                case -67: goto Lf8;
                case -66: goto Ld6;
                case -65: goto L1d3;
                default: goto L16;
            }
        L16:
            r0 = -16
            if (r6 < r0) goto L24
            r0 = 47
            if (r6 > r0) goto L24
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L24:
            r0 = 48
            if (r6 < r0) goto L43
            r0 = 63
            if (r6 > r0) goto L43
            int r6 = r6 + (-56)
            int r6 = r6 << 8
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r0
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L43:
            r0 = 64
            if (r6 < r0) goto L5f
            r0 = 71
            if (r6 > r0) goto L5f
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r6 = getInt3(r0, r1, r6)
            int r0 = r5.offset
            int r0 = r0 + 2
            r5.offset = r0
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L5f:
            r0 = -40
            if (r6 < r0) goto L6f
            r0 = -17
            if (r6 > r0) goto L6f
            int r6 = r6 + 32
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L6f:
            r0 = -56
            if (r6 < r0) goto L8e
            r0 = -41
            if (r6 > r0) goto L8e
            int r6 = r6 + 48
            int r6 = r6 << 8
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r0
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L8e:
            r0 = -64
            if (r6 < r0) goto Lb8
            r0 = -57
            if (r6 > r0) goto Lb8
            int r6 = r6 + 60
            int r6 = r6 << 16
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r6 = r6 + r3
            int r1 = r1 + 2
            r5.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r0
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        Lb8:
            r0 = 73
            if (r6 < r0) goto Ld1
            r1 = 120(0x78, float:1.68E-43)
            if (r6 > r1) goto Ld1
            int r6 = r6 - r0
            int r0 = r5.offset
            java.lang.String r0 = r5.getLatin1String(r0, r6)
            int r1 = r5.offset
            int r1 = r1 + r6
            r5.offset = r1
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r6
        Ld1:
            com.alibaba.fastjson2.JSONException r6 = notSupportType(r6)
            throw r6
        Ld6:
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r0 = r5.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r3 = r5.offset
            long r3 = (long) r3
            long r1 = r1 + r3
            long r0 = r6.getLong(r0, r1)
            int r6 = r5.offset
            int r6 = r6 + 8
            r5.offset = r6
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto Lef
            goto Lf3
        Lef:
            long r0 = java.lang.Long.reverseBytes(r0)
        Lf3:
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        Lf8:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r1 = r0 + 1
            r5.offset = r1
            r6 = r6[r0]
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L108:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r1 = r0 + 1
            r1 = r6[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = r6[r0]
            int r6 = r6 << 8
            int r1 = r1 + r6
            int r0 = r0 + 2
            r5.offset = r0
            long r0 = (long) r1
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L121:
            java.math.BigInteger r6 = r5.readBigInteger()
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r6)
            return r0
        L12b:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r6 = getInt(r6, r0)
            int r0 = r5.offset
            int r0 = r0 + 4
            r5.offset = r0
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L143:
            int r6 = r5.readInt32Value()
            float r6 = (float) r6
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L14e:
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r0 = r5.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r3 = r5.offset
            long r3 = (long) r3
            long r1 = r1 + r3
            long r0 = r6.getLong(r0, r1)
            int r6 = r5.offset
            int r6 = r6 + 8
            r5.offset = r6
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto L167
            goto L16b
        L167:
            long r0 = java.lang.Long.reverseBytes(r0)
        L16b:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r0 = (long) r0
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L175:
            long r0 = r5.readInt64Value()
            double r0 = (double) r0
            long r0 = (long) r0
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
        L180:
            java.math.BigDecimal r6 = java.math.BigDecimal.ONE
            return r6
        L183:
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            return r6
        L186:
            r6 = 0
            return r6
        L188:
            int r6 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r5.bytes
            int r2 = r5.offset
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r1, r2, r6, r3)
            int r1 = r5.offset
            int r1 = r1 + r6
            r5.offset = r1
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r6
        L1a1:
            int r6 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r5.bytes
            int r2 = r5.offset
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.ISO_8859_1
            r0.<init>(r1, r2, r6, r3)
            int r1 = r5.offset
            int r1 = r1 + r6
            r5.offset = r1
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r6
        L1ba:
            int r6 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r5.bytes
            int r2 = r5.offset
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_16LE
            r0.<init>(r1, r2, r6, r3)
            int r1 = r5.offset
            int r1 = r1 + r6
            r5.offset = r1
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r6
        L1d3:
            byte[] r6 = r5.bytes
            int r0 = r5.offset
            int r6 = getInt(r6, r0)
            int r0 = r5.offset
            int r0 = r0 + 4
            r5.offset = r0
            long r0 = (long) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            return r6
    }

    private double readDoubleValue0() {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            int r2 = r1 + 1
            r9.offset = r2
            r3 = r0[r1]
            r4 = -74
            if (r3 == r4) goto L21b
            r4 = -73
            if (r3 == r4) goto L1fc
            r4 = -71
            if (r3 == r4) goto L1e0
            r4 = 72
            if (r3 == r4) goto L1c4
            r4 = 124(0x7c, float:1.74E-43)
            r5 = -1
            r6 = 46
            if (r3 == r4) goto L197
            r4 = 121(0x79, float:1.7E-43)
            if (r3 == r4) goto L16a
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L13d
            r7 = 0
            switch(r3) {
                case -81: goto L11e;
                case -80: goto L11d;
                case -79: goto L11a;
                case -78: goto L11d;
                case -77: goto L11a;
                case -76: goto L114;
                default: goto L2e;
            }
        L2e:
            switch(r3) {
                case -68: goto L103;
                case -67: goto Lfb;
                case -66: goto Le0;
                case -65: goto L1c4;
                default: goto L31;
            }
        L31:
            r4 = -16
            if (r3 < r4) goto L3b
            r4 = 47
            if (r3 > r4) goto L3b
            double r0 = (double) r3
            return r0
        L3b:
            r4 = 48
            if (r3 < r4) goto L52
            r4 = 63
            if (r3 > r4) goto L52
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r9.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            double r0 = (double) r3
            return r0
        L52:
            r4 = 64
            if (r3 < r4) goto L66
            r4 = 71
            if (r3 > r4) goto L66
            int r0 = getInt3(r0, r2, r3)
            int r1 = r9.offset
            int r1 = r1 + 2
            r9.offset = r1
            double r0 = (double) r0
            return r0
        L66:
            r4 = -40
            if (r3 < r4) goto L75
            r7 = -17
            if (r3 > r7) goto L75
            int r3 = r3 - r4
            long r0 = (long) r3
            r2 = -8
            long r0 = r0 + r2
            double r0 = (double) r0
            return r0
        L75:
            r4 = -56
            if (r3 < r4) goto L8c
            r4 = -41
            if (r3 > r4) goto L8c
            int r3 = r3 + 48
            int r3 = r3 << 8
            int r1 = r1 + 2
            r9.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            double r0 = (double) r3
            return r0
        L8c:
            r4 = -64
            if (r3 < r4) goto Lae
            r4 = -57
            if (r3 > r4) goto Lae
            int r3 = r3 + 60
            int r3 = r3 << 16
            int r4 = r1 + 2
            r9.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r1 = r1 + 3
            r9.offset = r1
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            double r0 = (double) r3
            return r0
        Lae:
            r0 = 73
            if (r3 < r0) goto Ldb
            r1 = 120(0x78, float:1.68E-43)
            if (r3 > r1) goto Ldb
            int r3 = r3 - r0
            java.lang.String r0 = r9.getLatin1String(r2, r3)
            int r1 = r9.offset
            int r1 = r1 + r3
            r9.offset = r1
            int r1 = r0.indexOf(r6)
            if (r1 != r5) goto Ld1
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            int r0 = r1.intValue()
            double r0 = (double) r0
            return r0
        Ld1:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        Ldb:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r3)
            throw r0
        Le0:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r9.offset
            int r2 = r2 + 8
            r9.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto Lf5
            goto Lf9
        Lf5:
            long r0 = java.lang.Long.reverseBytes(r0)
        Lf9:
            double r0 = (double) r0
            return r0
        Lfb:
            int r1 = r1 + 2
            r9.offset = r1
            r0 = r0[r2]
            double r0 = (double) r0
            return r0
        L103:
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0[r2]
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r1 = r1 + 3
            r9.offset = r1
            double r0 = (double) r3
            return r0
        L114:
            long r0 = r9.readInt64Value()
            double r0 = (double) r0
            return r0
        L11a:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
        L11d:
            return r7
        L11e:
            com.alibaba.fastjson2.JSONReader$Context r0 = r9.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L131
            r0 = 1
            r9.wasNull = r0
            return r7
        L131:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r9.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L13d:
            int r1 = r9.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r9.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r0, r3, r1, r4)
            int r0 = r9.offset
            int r0 = r0 + r1
            r9.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L160
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L160:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L16a:
            int r1 = r9.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r9.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.<init>(r0, r3, r1, r4)
            int r0 = r9.offset
            int r0 = r0 + r1
            r9.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L18d
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L18d:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L197:
            int r1 = r9.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r9.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.<init>(r0, r3, r1, r4)
            int r0 = r9.offset
            int r0 = r0 + r1
            r9.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L1ba
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L1ba:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L1c4:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            int r0 = r1.getInt(r0, r3)
            int r1 = r9.offset
            int r1 = r1 + 4
            r9.offset = r1
            boolean r1 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r1 == 0) goto L1da
            double r0 = (double) r0
            return r0
        L1da:
            int r0 = java.lang.Integer.reverseBytes(r0)
            double r0 = (double) r0
            return r0
        L1e0:
            int r0 = r9.readInt32Value()
            java.math.BigInteger r1 = r9.readBigInteger()
            if (r0 != 0) goto L1f0
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            goto L1f6
        L1f0:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1, r0)
            r0 = r2
        L1f6:
            int r0 = r0.intValue()
            double r0 = (double) r0
            return r0
        L1fc:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            int r0 = r1.getInt(r0, r3)
            int r1 = r9.offset
            int r1 = r1 + 4
            r9.offset = r1
            boolean r1 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r1 == 0) goto L211
            goto L215
        L211:
            int r0 = java.lang.Integer.reverseBytes(r0)
        L215:
            float r0 = java.lang.Float.intBitsToFloat(r0)
            double r0 = (double) r0
            return r0
        L21b:
            int r0 = r9.readInt32Value()
            float r0 = (float) r0
            double r0 = (double) r0
            return r0
    }

    private float readFloat0() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 1
            r7.offset = r2
            r3 = r0[r1]
            r4 = -71
            if (r3 == r4) goto L1e9
            r4 = 72
            if (r3 == r4) goto L1dd
            r4 = 124(0x7c, float:1.74E-43)
            r5 = -1
            r6 = 46
            if (r3 == r4) goto L1b0
            r4 = 121(0x79, float:1.7E-43)
            if (r3 == r4) goto L183
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L156
            r4 = 0
            switch(r3) {
                case -81: goto L138;
                case -80: goto L137;
                case -79: goto L134;
                case -78: goto L137;
                case -77: goto L134;
                case -76: goto L12d;
                case -75: goto L10e;
                case -74: goto L108;
                default: goto L25;
            }
        L25:
            switch(r3) {
                case -68: goto Lf7;
                case -67: goto Lef;
                case -66: goto Ld4;
                case -65: goto L1dd;
                default: goto L28;
            }
        L28:
            r4 = -16
            if (r3 < r4) goto L32
            r4 = 47
            if (r3 > r4) goto L32
            float r0 = (float) r3
            return r0
        L32:
            r4 = 48
            if (r3 < r4) goto L49
            r4 = 63
            if (r3 > r4) goto L49
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            float r0 = (float) r3
            return r0
        L49:
            r4 = 64
            if (r3 < r4) goto L5d
            r4 = 71
            if (r3 > r4) goto L5d
            int r0 = getInt3(r0, r2, r3)
            int r1 = r7.offset
            int r1 = r1 + 2
            r7.offset = r1
            float r0 = (float) r0
            return r0
        L5d:
            r4 = -40
            if (r3 < r4) goto L69
            r4 = -17
            if (r3 > r4) goto L69
            int r3 = r3 + 32
            float r0 = (float) r3
            return r0
        L69:
            r4 = -56
            if (r3 < r4) goto L80
            r4 = -41
            if (r3 > r4) goto L80
            int r3 = r3 + 48
            int r3 = r3 << 8
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            float r0 = (float) r3
            return r0
        L80:
            r4 = -64
            if (r3 < r4) goto La2
            r4 = -57
            if (r3 > r4) goto La2
            int r3 = r3 + 60
            int r3 = r3 << 16
            int r4 = r1 + 2
            r7.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r1 = r1 + 3
            r7.offset = r1
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            float r0 = (float) r3
            return r0
        La2:
            r0 = 73
            if (r3 < r0) goto Lcf
            r1 = 120(0x78, float:1.68E-43)
            if (r3 > r1) goto Lcf
            int r3 = r3 - r0
            java.lang.String r0 = r7.getLatin1String(r2, r3)
            int r1 = r7.offset
            int r1 = r1 + r3
            r7.offset = r1
            int r1 = r0.indexOf(r6)
            if (r1 != r5) goto Lc5
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r0)
            int r0 = r1.intValue()
            float r0 = (float) r0
            return r0
        Lc5:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        Lcf:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r3)
            throw r0
        Ld4:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto Le9
            goto Led
        Le9:
            long r0 = java.lang.Long.reverseBytes(r0)
        Led:
            float r0 = (float) r0
            return r0
        Lef:
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            float r0 = (float) r0
            return r0
        Lf7:
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0[r2]
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r1 = r1 + 3
            r7.offset = r1
            float r0 = (float) r3
            return r0
        L108:
            int r0 = r7.readInt32Value()
            float r0 = (float) r0
            return r0
        L10e:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto L123
            goto L127
        L123:
            long r0 = java.lang.Long.reverseBytes(r0)
        L127:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            float r0 = (float) r0
            return r0
        L12d:
            long r0 = r7.readInt64Value()
            double r0 = (double) r0
            float r0 = (float) r0
            return r0
        L134:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L137:
            return r4
        L138:
            com.alibaba.fastjson2.JSONReader$Context r0 = r7.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L14b
            r0 = 1
            r7.wasNull = r0
            return r4
        L14b:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r7.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L156:
            int r1 = r7.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r7.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r0, r3, r1, r4)
            int r0 = r7.offset
            int r0 = r0 + r1
            r7.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L179
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L179:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L183:
            int r1 = r7.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r7.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.<init>(r0, r3, r1, r4)
            int r0 = r7.offset
            int r0 = r0 + r1
            r7.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L1a6
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L1a6:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L1b0:
            int r1 = r7.readInt32Value()
            java.lang.String r2 = new java.lang.String
            int r3 = r7.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.<init>(r0, r3, r1, r4)
            int r0 = r7.offset
            int r0 = r0 + r1
            r7.offset = r0
            int r0 = r2.indexOf(r6)
            if (r0 != r5) goto L1d3
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L1d3:
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
        L1dd:
            int r0 = getInt(r0, r2)
            int r1 = r7.offset
            int r1 = r1 + 4
            r7.offset = r1
            float r0 = (float) r0
            return r0
        L1e9:
            int r0 = r7.readInt32Value()
            java.math.BigInteger r1 = r7.readBigInteger()
            if (r0 != 0) goto L1f9
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            goto L1ff
        L1f9:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1, r0)
            r0 = r2
        L1ff:
            int r0 = r0.intValue()
            float r0 = (float) r0
            return r0
    }

    private java.lang.String readGB18030() {
            r1 = this;
            int r0 = r1.readLength()
            r1.strlen = r0
            int r0 = r1.offset
            r1.strBegin = r0
            java.nio.charset.Charset r0 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            if (r0 != 0) goto L16
            java.lang.String r0 = "GB18030"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.alibaba.fastjson2.JSONReaderJSONB.GB18030 = r0
        L16:
            r0 = 0
            return r0
    }

    private int readInt32Value0(byte[] r6, byte r7) {
            r5 = this;
            r0 = -40
            if (r7 < r0) goto Lb
            r0 = -17
            if (r7 > r0) goto Lb
            int r7 = r7 + 32
            return r7
        Lb:
            r0 = -56
            if (r7 < r0) goto L23
            r0 = -41
            if (r7 > r0) goto L23
            int r7 = r7 + 48
            int r7 = r7 << 8
            int r0 = r5.offset
            int r1 = r0 + 1
            r5.offset = r1
            r6 = r6[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r6
            return r7
        L23:
            r0 = -64
            if (r7 < r0) goto L46
            r0 = -57
            if (r7 > r0) goto L46
            int r7 = r7 + 60
            int r7 = r7 << 16
            int r0 = r5.offset
            int r1 = r0 + 1
            r5.offset = r1
            r2 = r6[r0]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r7 = r7 + r2
            int r0 = r0 + 2
            r5.offset = r0
            r6 = r6[r1]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r6
            return r7
        L46:
            r0 = -84
            if (r7 == r0) goto L1be
            r0 = -83
            if (r7 == r0) goto L1be
            r0 = -71
            if (r7 == r0) goto L1a3
            r0 = 124(0x7c, float:1.74E-43)
            r1 = -1
            r2 = 46
            if (r7 == r0) goto L178
            r0 = 121(0x79, float:1.7E-43)
            if (r7 == r0) goto L150
            r0 = 122(0x7a, float:1.71E-43)
            if (r7 == r0) goto L125
            r0 = 0
            r3 = 1
            switch(r7) {
                case -81: goto L108;
                case -80: goto L107;
                case -79: goto L106;
                case -78: goto L107;
                case -77: goto L106;
                case -76: goto L100;
                case -75: goto Lf5;
                case -74: goto Lee;
                case -73: goto Ldc;
                default: goto L66;
            }
        L66:
            switch(r7) {
                case -68: goto Lca;
                case -67: goto Lc1;
                case -66: goto La4;
                case -65: goto L1be;
                default: goto L69;
            }
        L69:
            r0 = 73
            if (r7 < r0) goto L96
            r3 = 120(0x78, float:1.68E-43)
            if (r7 > r3) goto L96
            int r7 = r7 - r0
            int r6 = r5.offset
            java.lang.String r6 = r5.getLatin1String(r6, r7)
            int r0 = r5.offset
            int r0 = r0 + r7
            r5.offset = r0
            int r7 = r6.indexOf(r2)
            if (r7 != r1) goto L8d
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r6)
            int r6 = r7.intValue()
            return r6
        L8d:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r6)
            int r6 = r6.intValue()
            return r6
        L96:
            java.lang.String r7 = com.alibaba.fastjson2.JSONB.typeName(r7)
            int r0 = r5.offset
            int r6 = r6.length
            java.lang.String r1 = "readInt32Value not support "
            ah.a.l(r1, r0, r6, r7)
            r6 = 0
            return r6
        La4:
            sun.misc.Unsafe r7 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r0 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r2 = r5.offset
            long r2 = (long) r2
            long r0 = r0 + r2
            long r6 = r7.getLong(r6, r0)
            int r0 = r5.offset
            int r0 = r0 + 8
            r5.offset = r0
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto Lbb
            goto Lbf
        Lbb:
            long r6 = java.lang.Long.reverseBytes(r6)
        Lbf:
            int r6 = (int) r6
            return r6
        Lc1:
            int r7 = r5.offset
            int r0 = r7 + 1
            r5.offset = r0
            r6 = r6[r7]
            return r6
        Lca:
            int r7 = r5.offset
            int r0 = r7 + 1
            r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6[r7]
            int r6 = r6 << 8
            int r0 = r0 + r6
            int r7 = r7 + 2
            r5.offset = r7
            return r0
        Ldc:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            int r7 = r5.offset
            int r7 = r7 + 4
            r5.offset = r7
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r6 = (int) r6
            return r6
        Lee:
            int r6 = r5.readInt32Value()
            float r6 = (float) r6
            int r6 = (int) r6
            return r6
        Lf5:
            int r6 = r5.offset
            int r6 = r6 - r3
            r5.offset = r6
            double r6 = r5.readDoubleValue()
            int r6 = (int) r6
            return r6
        L100:
            long r6 = r5.readInt64Value()
            int r6 = (int) r6
            return r6
        L106:
            return r3
        L107:
            return r0
        L108:
            com.alibaba.fastjson2.JSONReader$Context r6 = r5.context
            long r6 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r1 = r1.mask
            long r6 = r6 & r1
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L11a
            r5.wasNull = r3
            return r0
        L11a:
            java.lang.String r6 = "int value not support input null"
            java.lang.String r6 = r5.info(r6)
            ah.a.w(r6)
            r6 = 0
            return r6
        L125:
            int r7 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            int r3 = r5.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r6, r3, r7, r4)
            int r6 = r5.offset
            int r6 = r6 + r7
            r5.offset = r6
            int r6 = r0.indexOf(r2)
            if (r6 != r1) goto L147
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r0)
            int r6 = r6.intValue()
            return r6
        L147:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r6 = r6.intValue()
            return r6
        L150:
            int r6 = r5.readInt32Value()
            int r7 = r5.offset
            java.lang.String r7 = r5.getLatin1String(r7, r6)
            int r0 = r5.offset
            int r0 = r0 + r6
            r5.offset = r0
            int r6 = r7.indexOf(r2)
            if (r6 != r1) goto L16f
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r7)
            int r6 = r6.intValue()
            return r6
        L16f:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r7)
            int r6 = r6.intValue()
            return r6
        L178:
            int r7 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            int r3 = r5.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE
            r0.<init>(r6, r3, r7, r4)
            int r6 = r5.offset
            int r6 = r6 + r7
            r5.offset = r6
            int r6 = r0.indexOf(r2)
            if (r6 != r1) goto L19a
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r0)
            int r6 = r6.intValue()
            return r6
        L19a:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r6 = r6.intValue()
            return r6
        L1a3:
            int r6 = r5.readInt32Value()
            java.math.BigInteger r7 = r5.readBigInteger()
            if (r6 != 0) goto L1b3
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r7)
            goto L1b9
        L1b3:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7, r6)
            r6 = r0
        L1b9:
            int r6 = r6.intValue()
            return r6
        L1be:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            int r7 = r5.offset
            int r7 = r7 + 4
            r5.offset = r7
            return r6
    }

    private com.alibaba.fastjson2.JSONException readInt32ValueError(byte r4) {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "readInt32Value not support "
            r1.<init>(r2)
            java.lang.String r4 = com.alibaba.fastjson2.JSONB.typeName(r4)
            r1.append(r4)
            java.lang.String r4 = ", offset "
            r1.append(r4)
            int r4 = r3.offset
            r1.append(r4)
            java.lang.String r4 = "/"
            r1.append(r4)
            byte[] r4 = r3.bytes
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private long readInt64Value0(byte[] r6, byte r7) {
            r5 = this;
            r0 = 48
            if (r7 < r0) goto L19
            r0 = 63
            if (r7 > r0) goto L19
            int r7 = r7 + (-56)
            int r7 = r7 << 8
            int r0 = r5.offset
            int r1 = r0 + 1
            r5.offset = r1
            r6 = r6[r0]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r7 + r6
            long r6 = (long) r7
            return r6
        L19:
            r0 = -16
            if (r7 < r0) goto L23
            r0 = 47
            if (r7 > r0) goto L23
            long r6 = (long) r7
            return r6
        L23:
            r0 = 64
            if (r7 < r0) goto L39
            r0 = 71
            if (r7 > r0) goto L39
            int r0 = r5.offset
            int r6 = getInt3(r6, r0, r7)
            int r7 = r5.offset
            int r7 = r7 + 2
            r5.offset = r7
            long r6 = (long) r6
            return r6
        L39:
            r0 = -71
            if (r7 == r0) goto L1d6
            r0 = 72
            if (r7 == r0) goto L1c8
            r0 = 124(0x7c, float:1.74E-43)
            r1 = -1
            r2 = 46
            if (r7 == r0) goto L19b
            r0 = -68
            if (r7 == r0) goto L188
            r0 = -67
            if (r7 == r0) goto L17e
            r0 = 121(0x79, float:1.7E-43)
            if (r7 == r0) goto L154
            r0 = 122(0x7a, float:1.71E-43)
            if (r7 == r0) goto L127
            switch(r7) {
                case -85: goto L10b;
                case -84: goto Lfa;
                case -83: goto Le8;
                default: goto L5b;
            }
        L5b:
            r3 = 0
            r0 = 1
            switch(r7) {
                case -81: goto Lcc;
                case -80: goto Lcb;
                case -79: goto Lc8;
                case -78: goto Lcb;
                case -77: goto Lc8;
                case -76: goto Lc1;
                case -75: goto Lb6;
                case -74: goto Laf;
                case -73: goto L9d;
                default: goto L61;
            }
        L61:
            r0 = 73
            if (r7 < r0) goto L8e
            r3 = 120(0x78, float:1.68E-43)
            if (r7 > r3) goto L8e
            int r7 = r7 - r0
            int r6 = r5.offset
            java.lang.String r6 = r5.getLatin1String(r6, r7)
            int r0 = r5.offset
            int r0 = r0 + r7
            r5.offset = r0
            int r7 = r6.indexOf(r2)
            if (r7 != r1) goto L85
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r6)
            long r6 = r7.longValue()
            return r6
        L85:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r6)
            long r6 = r6.longValue()
            return r6
        L8e:
            java.lang.String r7 = com.alibaba.fastjson2.JSONB.typeName(r7)
            int r0 = r5.offset
            int r6 = r6.length
            java.lang.String r1 = "readInt64Value not support "
            ah.a.l(r1, r0, r6, r7)
            r6 = 0
            return r6
        L9d:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            int r7 = r5.offset
            int r7 = r7 + 4
            r5.offset = r7
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r6 = (long) r6
            return r6
        Laf:
            int r6 = r5.readInt32Value()
            float r6 = (float) r6
            long r6 = (long) r6
            return r6
        Lb6:
            int r6 = r5.offset
            int r6 = r6 - r0
            r5.offset = r6
            double r6 = r5.readDoubleValue()
            long r6 = (long) r6
            return r6
        Lc1:
            long r6 = r5.readInt64Value()
            double r6 = (double) r6
            long r6 = (long) r6
            return r6
        Lc8:
            r6 = 1
            return r6
        Lcb:
            return r3
        Lcc:
            com.alibaba.fastjson2.JSONReader$Context r6 = r5.context
            long r6 = r6.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r1 = r1.mask
            long r6 = r6 & r1
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto Ldc
            r5.wasNull = r0
            return r3
        Ldc:
            java.lang.String r6 = "long value not support input null"
            java.lang.String r6 = r5.info(r6)
            ah.a.w(r6)
            r6 = 0
            return r6
        Le8:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            long r6 = (long) r6
            int r0 = r5.offset
            int r0 = r0 + 4
            r5.offset = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 * r0
            return r6
        Lfa:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            long r6 = (long) r6
            int r0 = r5.offset
            int r0 = r0 + 4
            r5.offset = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            return r6
        L10b:
            sun.misc.Unsafe r7 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r0 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r2 = r5.offset
            long r2 = (long) r2
            long r0 = r0 + r2
            long r6 = r7.getLong(r6, r0)
            int r0 = r5.offset
            int r0 = r0 + 8
            r5.offset = r0
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L122
            return r6
        L122:
            long r6 = java.lang.Long.reverseBytes(r6)
            return r6
        L127:
            int r7 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            int r3 = r5.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r6, r3, r7, r4)
            int r6 = r5.offset
            int r6 = r6 + r7
            r5.offset = r6
            int r6 = r0.indexOf(r2)
            if (r6 != r1) goto L14a
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r0)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L14a:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L154:
            int r6 = r5.readInt32Value()
            int r7 = r5.offset
            java.lang.String r7 = r5.getLatin1String(r7, r6)
            int r0 = r5.offset
            int r0 = r0 + r6
            r5.offset = r0
            int r6 = r7.indexOf(r2)
            if (r6 != r1) goto L174
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r7)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L174:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r7)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L17e:
            int r7 = r5.offset
            int r0 = r7 + 1
            r5.offset = r0
            r6 = r6[r7]
            long r6 = (long) r6
            return r6
        L188:
            int r7 = r5.offset
            int r0 = r7 + 1
            r0 = r6[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6[r7]
            int r6 = r6 << 8
            int r0 = r0 + r6
            int r7 = r7 + 2
            r5.offset = r7
            long r6 = (long) r0
            return r6
        L19b:
            int r7 = r5.readInt32Value()
            java.lang.String r0 = new java.lang.String
            int r3 = r5.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_16LE
            r0.<init>(r6, r3, r7, r4)
            int r6 = r5.offset
            int r6 = r6 + r7
            r5.offset = r6
            int r6 = r0.indexOf(r2)
            if (r6 != r1) goto L1be
            java.math.BigInteger r6 = new java.math.BigInteger
            r6.<init>(r0)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L1be:
            java.math.BigDecimal r6 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            int r6 = r6.intValue()
            long r6 = (long) r6
            return r6
        L1c8:
            int r7 = r5.offset
            int r6 = getInt(r6, r7)
            int r7 = r5.offset
            int r7 = r7 + 4
            r5.offset = r7
            long r6 = (long) r6
            return r6
        L1d6:
            int r6 = r5.readInt32Value()
            java.math.BigInteger r7 = r5.readBigInteger()
            if (r6 != 0) goto L1e6
            java.math.BigDecimal r6 = new java.math.BigDecimal
            r6.<init>(r7)
            goto L1ec
        L1e6:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7, r6)
            r6 = r0
        L1ec:
            long r6 = r6.longValue()
            return r6
    }

    private com.alibaba.fastjson2.JSONException readInt64ValueError(byte r4) {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "readInt64Value not support "
            r1.<init>(r2)
            java.lang.String r4 = com.alibaba.fastjson2.JSONB.typeName(r4)
            r1.append(r4)
            java.lang.String r4 = ", offset "
            r1.append(r4)
            int r4 = r3.offset
            r1.append(r4)
            java.lang.String r4 = "/"
            r1.append(r4)
            byte[] r4 = r3.bytes
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private java.time.LocalDate readLocalDate0(int r3) {
            r2 = this;
            r0 = 73
            if (r3 < r0) goto L34
            r0 = 120(0x78, float:1.68E-43)
            if (r3 > r0) goto L34
            int r3 = r2.getStringLength()
            switch(r3) {
                case 8: goto L2f;
                case 9: goto L2a;
                case 10: goto L25;
                case 11: goto L20;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "TODO : "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            java.lang.String r0 = r2.readString()
            ah.a.r(r3, r0)
            r3 = 0
            return r3
        L20:
            java.time.LocalDate r3 = r2.readLocalDate11()
            return r3
        L25:
            java.time.LocalDate r3 = r2.readLocalDate10()
            return r3
        L2a:
            java.time.LocalDate r3 = r2.readLocalDate9()
            return r3
        L2f:
            java.time.LocalDate r3 = r2.readLocalDate8()
            return r3
        L34:
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L3c
            r0 = 121(0x79, float:1.7E-43)
            if (r3 != r0) goto L4e
        L3c:
            byte r3 = (byte) r3
            r2.strtype = r3
            int r3 = r2.offset
            int r3 = r3 + 1
            r2.offset = r3
            int r3 = r2.readLength()
            r2.strlen = r3
            switch(r3) {
                case 8: goto L63;
                case 9: goto L5e;
                case 10: goto L59;
                case 11: goto L54;
                default: goto L4e;
            }
        L4e:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L54:
            java.time.LocalDate r3 = r2.readLocalDate11()
            return r3
        L59:
            java.time.LocalDate r3 = r2.readLocalDate10()
            return r3
        L5e:
            java.time.LocalDate r3 = r2.readLocalDate9()
            return r3
        L63:
            java.time.LocalDate r3 = r2.readLocalDate8()
            return r3
    }

    private java.time.LocalDateTime readLocalDateTime0(int r3) {
            r2 = this;
            r0 = -87
            r1 = 0
            if (r3 != r0) goto L13
            java.time.LocalDate r3 = r2.readLocalDate()
            if (r3 != 0) goto Lc
            return r1
        Lc:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r0)
            return r3
        L13:
            r0 = -86
            if (r3 != r0) goto L20
            java.time.ZonedDateTime r3 = r2.readZonedDateTime()
            java.time.LocalDateTime r3 = r3.toLocalDateTime()
            return r3
        L20:
            r0 = 73
            if (r3 < r0) goto La4
            r0 = 120(0x78, float:1.68E-43)
            if (r3 > r0) goto La4
            int r3 = r2.getStringLength()
            switch(r3) {
                case 8: goto L96;
                case 9: goto L88;
                case 10: goto L7a;
                case 11: goto L6c;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L2f;
                case 15: goto L2f;
                case 16: goto L67;
                case 17: goto L62;
                case 18: goto L5d;
                case 19: goto L58;
                case 20: goto L53;
                case 21: goto L30;
                case 22: goto L30;
                case 23: goto L30;
                case 24: goto L30;
                case 25: goto L30;
                case 26: goto L30;
                case 27: goto L30;
                case 28: goto L30;
                case 29: goto L30;
                default: goto L2f;
            }
        L2f:
            goto L42
        L30:
            java.time.LocalDateTime r0 = r2.readLocalDateTimeX(r3)
            if (r0 == 0) goto L37
            return r0
        L37:
            java.time.ZonedDateTime r0 = r2.readZonedDateTimeX(r3)
            if (r0 == 0) goto L42
            java.time.LocalDateTime r3 = r0.toLocalDateTime()
            return r3
        L42:
            java.lang.String r0 = "TODO : "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = eh.a.t(r3, r0, r1)
            java.lang.String r0 = r2.readString()
            ah.a.r(r3, r0)
            r3 = 0
            return r3
        L53:
            java.time.LocalDateTime r3 = r2.readLocalDateTime20()
            return r3
        L58:
            java.time.LocalDateTime r3 = r2.readLocalDateTime19()
            return r3
        L5d:
            java.time.LocalDateTime r3 = r2.readLocalDateTime18()
            return r3
        L62:
            java.time.LocalDateTime r3 = r2.readLocalDateTime17()
            return r3
        L67:
            java.time.LocalDateTime r3 = r2.readLocalDateTime16()
            return r3
        L6c:
            java.time.LocalDate r3 = r2.readLocalDate11()
            if (r3 != 0) goto L73
            return r1
        L73:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r0)
            return r3
        L7a:
            java.time.LocalDate r3 = r2.readLocalDate10()
            if (r3 != 0) goto L81
            return r1
        L81:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r0)
            return r3
        L88:
            java.time.LocalDate r3 = r2.readLocalDate9()
            if (r3 != 0) goto L8f
            return r1
        L8f:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r0)
            return r3
        L96:
            java.time.LocalDate r3 = r2.readLocalDate8()
            if (r3 != 0) goto L9d
            return r1
        L9d:
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.LocalDateTime r3 = java.time.LocalDateTime.of(r3, r0)
            return r3
        La4:
            byte r3 = (byte) r3
            java.lang.String r3 = com.alibaba.fastjson2.JSONB.typeName(r3)
            java.lang.String r0 = "not support type : "
            ah.a.i(r3, r0)
            r3 = 0
            return r3
    }

    private com.alibaba.fastjson2.JSONException readStringError() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "string value not support input "
            r1.<init>(r2)
            byte r2 = r3.type
            java.lang.String r2 = com.alibaba.fastjson2.JSONB.typeName(r2)
            r1.append(r2)
            java.lang.String r2 = " offset "
            r1.append(r2)
            int r2 = r3.offset
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            byte[] r2 = r3.bytes
            int r2 = r2.length
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String readStringNonAscii() {
            r8 = this;
            byte r0 = r8.strtype
            r1 = 122(0x7a, float:1.71E-43)
            r2 = 0
            if (r0 != r1) goto L45
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L1c
            r4 = 47
            if (r3 > r4) goto L1c
            r8.strlen = r3
            int r1 = r1 + 1
            r8.offset = r1
            goto L3c
        L1c:
            r4 = 48
            if (r3 < r4) goto L36
            r4 = 63
            if (r3 > r4) goto L36
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r4 = r1 + 1
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            r8.strlen = r3
            int r1 = r1 + 2
            r8.offset = r1
            goto L3c
        L36:
            int r0 = r8.readLength()
            r8.strlen = r0
        L3c:
            int r0 = r8.offset
            r8.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
        L42:
            r1 = r0
            r0 = r2
            goto L79
        L45:
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L56
            int r0 = r8.readLength()
            r8.strlen = r0
            int r0 = r8.offset
            r8.strBegin = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            goto L42
        L56:
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 != r1) goto L61
            java.lang.String r0 = r8.readUTF16LE()
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L79
        L61:
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L6f
            java.lang.String r0 = r8.readUTF16BE()
            if (r0 == 0) goto L6c
            return r0
        L6c:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L79
        L6f:
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 != r1) goto Lcf
            r8.readGB18030()
            java.nio.charset.Charset r0 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            goto L42
        L79:
            r3 = 0
            if (r0 == 0) goto L8f
            com.alibaba.fastjson2.JSONReader$Context r1 = r8.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r5 = r5.mask
            long r1 = r1 & r5
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L8e
            java.lang.String r0 = r0.trim()
        L8e:
            return r0
        L8f:
            int r0 = r8.strlen
            if (r0 >= 0) goto L9b
            com.alibaba.fastjson2.SymbolTable r1 = r8.symbolTable
            int r0 = -r0
            java.lang.String r0 = r1.getName(r0)
            return r0
        L9b:
            java.lang.String r5 = new java.lang.String
            byte[] r6 = r8.bytes
            int r7 = r8.offset
            r5.<init>(r6, r7, r0, r1)
            int r0 = r8.offset
            int r1 = r8.strlen
            int r0 = r0 + r1
            r8.offset = r0
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r6 = r6.mask
            long r0 = r0 & r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lbc
            java.lang.String r5 = r5.trim()
        Lbc:
            int r0 = r8.strlen
            if (r0 != 0) goto Lce
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r6 = r6.mask
            long r0 = r0 & r6
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto Lce
            return r2
        Lce:
            return r5
        Lcf:
            java.lang.String r0 = r8.readStringTypeNotMatch()
            return r0
    }

    private java.lang.String readStringTypeNotMatch() {
            r7 = this;
            byte r0 = r7.strtype
            r1 = -16
            if (r0 < r1) goto Lf
            r1 = 47
            if (r0 > r1) goto Lf
            java.lang.String r0 = java.lang.Byte.toString(r0)
            return r0
        Lf:
            r1 = 48
            if (r0 < r1) goto L2d
            r1 = 63
            if (r0 > r1) goto L2d
            int r0 = r0 + (-56)
            int r0 = r0 << 8
            byte[] r1 = r7.bytes
            int r2 = r7.offset
            int r3 = r2 + 1
            r7.offset = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L2d:
            r1 = 64
            if (r0 < r1) goto L48
            r1 = 71
            if (r0 > r1) goto L48
            byte[] r1 = r7.bytes
            int r2 = r7.offset
            int r0 = getInt3(r1, r2, r0)
            int r1 = r7.offset
            int r1 = r1 + 2
            r7.offset = r1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L48:
            r1 = -40
            if (r0 < r1) goto L57
            r1 = -17
            if (r0 > r1) goto L57
            int r0 = r0 + 32
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L57:
            r1 = -56
            if (r0 < r1) goto L75
            r1 = -41
            if (r0 > r1) goto L75
            int r0 = r0 + 48
            int r0 = r0 << 8
            byte[] r1 = r7.bytes
            int r2 = r7.offset
            int r3 = r2 + 1
            r7.offset = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L75:
            r1 = -64
            if (r0 < r1) goto L9e
            r1 = -57
            if (r0 > r1) goto L9e
            int r0 = r0 + 60
            int r0 = r0 << 16
            byte[] r1 = r7.bytes
            int r2 = r7.offset
            int r3 = r2 + 1
            r7.offset = r3
            r4 = r1[r2]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r0 = r0 + r4
            int r2 = r2 + 2
            r7.offset = r2
            r1 = r1[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r0 + r1
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
        L9e:
            r1 = -110(0xffffffffffffff92, float:NaN)
            r2 = 0
            if (r0 == r1) goto L1e3
            r1 = -81
            if (r0 == r1) goto L1e2
            r1 = 72
            if (r0 == r1) goto L1ce
            r1 = -66
            if (r0 == r1) goto L1ad
            r1 = -65
            if (r0 == r1) goto L1ce
            r1 = 0
            switch(r0) {
                case -85: goto L189;
                case -84: goto L170;
                case -83: goto L156;
                default: goto Lb7;
            }
        Lb7:
            switch(r0) {
                case -78: goto L153;
                case -77: goto L150;
                case -76: goto L146;
                case -75: goto L120;
                case -74: goto L116;
                case -73: goto Lff;
                case -72: goto Lf6;
                case -71: goto Ldb;
                case -70: goto Lf6;
                case -69: goto Lbf;
                default: goto Lba;
            }
        Lba:
            com.alibaba.fastjson2.JSONException r0 = r7.notSupportString()
            throw r0
        Lbf:
            int r0 = r7.readInt32Value()
            byte[] r2 = new byte[r0]
            byte[] r3 = r7.bytes
            int r4 = r7.offset
            java.lang.System.arraycopy(r3, r4, r2, r1, r0)
            int r1 = r7.offset
            int r1 = r1 + r0
            r7.offset = r1
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Ldb:
            int r0 = r7.readInt32Value()
            java.math.BigInteger r1 = r7.readBigInteger()
            if (r0 != 0) goto Leb
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            goto Lf1
        Leb:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1, r0)
            r0 = r2
        Lf1:
            java.lang.String r0 = r0.toString()
            return r0
        Lf6:
            long r0 = r7.readInt64Value()
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
        Lff:
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r0 = getInt(r0, r1)
            int r1 = r7.offset
            int r1 = r1 + 4
            r7.offset = r1
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
        L116:
            int r0 = r7.readInt32Value()
            float r0 = (float) r0
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
        L120:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r1 = r7.bytes
            long r2 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r4 = r7.offset
            long r4 = (long) r4
            long r2 = r2 + r4
            long r0 = r0.getLong(r1, r2)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto L139
            goto L13d
        L139:
            long r0 = java.lang.Long.reverseBytes(r0)
        L13d:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.String r0 = java.lang.Double.toString(r0)
            return r0
        L146:
            long r0 = r7.readInt64Value()
            double r0 = (double) r0
            java.lang.String r0 = java.lang.Double.toString(r0)
            return r0
        L150:
            java.lang.String r0 = "1.0"
            return r0
        L153:
            java.lang.String r0 = "0.0"
            return r0
        L156:
            byte[] r0 = r7.bytes
            int r2 = r7.offset
            int r0 = getInt(r0, r2)
            long r2 = (long) r0
            int r0 = r7.offset
            int r0 = r0 + 4
            r7.offset = r0
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r4
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r0 = com.alibaba.fastjson2.util.DateUtils.toString(r2, r1, r0)
            return r0
        L170:
            byte[] r0 = r7.bytes
            int r2 = r7.offset
            int r0 = getInt(r0, r2)
            long r2 = (long) r0
            int r0 = r7.offset
            int r0 = r0 + 4
            r7.offset = r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r0 = com.alibaba.fastjson2.util.DateUtils.toString(r2, r1, r0)
            return r0
        L189:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r2 = r7.bytes
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r5 = r7.offset
            long r5 = (long) r5
            long r3 = r3 + r5
            long r2 = r0.getLong(r2, r3)
            int r0 = r7.offset
            int r0 = r0 + 8
            r7.offset = r0
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L1a2
            goto L1a6
        L1a2:
            long r2 = java.lang.Long.reverseBytes(r2)
        L1a6:
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r0 = com.alibaba.fastjson2.util.DateUtils.toString(r2, r1, r0)
            return r0
        L1ad:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r1 = r7.bytes
            long r2 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r4 = r7.offset
            long r4 = (long) r4
            long r2 = r2 + r4
            long r0 = r0.getLong(r1, r2)
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 != 0) goto L1c3
            long r0 = java.lang.Long.reverseBytes(r0)
        L1c3:
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
        L1ce:
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r0 = getInt(r0, r1)
            long r0 = (long) r0
            int r2 = r7.offset
            int r2 = r2 + 4
            r7.offset = r2
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
        L1e2:
            return r2
        L1e3:
            int r0 = r7.offset
            int r0 = r0 + (-1)
            r7.offset = r0
            java.lang.Object r0 = r7.readAny()
            if (r0 != 0) goto L1f0
            return r2
        L1f0:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.WriteThrowableClassName
            com.alibaba.fastjson2.JSONWriter$Feature[] r1 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r1}
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r0, r1)
            return r0
    }

    private java.lang.String readStringUTF8() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = -16
            if (r2 < r3) goto L15
            r3 = 47
            if (r2 > r3) goto L15
            int r1 = r1 + 1
            r4.offset = r1
            r4.strlen = r2
            goto L35
        L15:
            r3 = 48
            if (r2 < r3) goto L2f
            r3 = 63
            if (r2 > r3) goto L2f
            int r3 = r1 + 1
            int r2 = r2 + (-56)
            int r2 = r2 << 8
            int r1 = r1 + 2
            r4.offset = r1
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            r4.strlen = r2
            goto L35
        L2f:
            int r0 = r4.readLength()
            r4.strlen = r0
        L35:
            int r0 = r4.offset
            r4.strBegin = r0
            r0 = 0
            return r0
    }

    private java.time.ZonedDateTime readTimestampWithTimeZone() {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 1
            r12.offset = r2
            r3 = r0[r1]
            int r3 = r3 << 8
            int r4 = r1 + 2
            r12.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r3 + r2
            int r2 = r1 + 3
            r12.offset = r2
            r6 = r0[r4]
            int r3 = r1 + 4
            r12.offset = r3
            r7 = r0[r2]
            int r2 = r1 + 5
            r12.offset = r2
            r8 = r0[r3]
            int r3 = r1 + 6
            r12.offset = r3
            r9 = r0[r2]
            int r1 = r1 + 7
            r12.offset = r1
            r10 = r0[r3]
            int r11 = r12.readInt32Value()
            byte[] r1 = com.alibaba.fastjson2.JSONReaderJSONB.SHANGHAI_ZONE_ID_NAME_BYTES
            int r2 = r12.offset
            int r3 = r1.length
            int r2 = r2 + r3
            int r3 = r0.length
            if (r2 >= r3) goto L59
            r2 = 0
        L42:
            int r3 = r1.length
            int r4 = r12.offset
            if (r2 >= r3) goto L52
            int r4 = r4 + r2
            r3 = r0[r4]
            r4 = r1[r2]
            if (r3 == r4) goto L4f
            goto L59
        L4f:
            int r2 = r2 + 1
            goto L42
        L52:
            int r0 = r1.length
            int r4 = r4 + r0
            r12.offset = r4
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            goto L63
        L59:
            java.lang.String r0 = r12.readString()
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.getZoneId(r0, r1)
        L63:
            java.time.LocalDateTime r1 = java.time.LocalDateTime.of(r5, r6, r7, r8, r9, r10, r11)
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r1, r0)
            return r0
    }

    private java.lang.String readUTF16BE() {
            r1 = this;
            int r0 = r1.readLength()
            r1.strlen = r0
            int r0 = r1.offset
            r1.strBegin = r0
            r0 = 0
            return r0
    }

    private java.lang.String readUTF16LE() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = -16
            if (r2 < r3) goto L15
            r3 = 47
            if (r2 > r3) goto L15
            int r1 = r1 + 1
            r4.offset = r1
            r4.strlen = r2
            goto L35
        L15:
            r3 = 48
            if (r2 < r3) goto L2f
            r3 = 63
            if (r2 > r3) goto L2f
            int r3 = r1 + 1
            int r2 = r2 + (-56)
            int r2 = r2 << 8
            int r1 = r1 + 2
            r4.offset = r1
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            r4.strlen = r2
            goto L35
        L2f:
            int r0 = r4.readLength()
            r4.strlen = r0
        L35:
            int r0 = r4.offset
            r4.strBegin = r0
            int r0 = r4.strlen
            if (r0 != 0) goto L40
            java.lang.String r0 = ""
            return r0
        L40:
            r0 = 0
            return r0
    }

    private java.time.ZonedDateTime readZonedDateTime0(int r12) {
            r11 = this;
            r0 = -88
            if (r12 == r0) goto Ld2
            r0 = -87
            if (r12 == r0) goto La4
            r0 = -66
            if (r12 == r0) goto L7c
            switch(r12) {
                case -85: goto L7c;
                case -84: goto L62;
                case -83: goto L45;
                case -82: goto L31;
                case -81: goto L2f;
                default: goto Lf;
            }
        Lf:
            r0 = 73
            if (r12 < r0) goto L23
            r1 = 120(0x78, float:1.68E-43)
            if (r12 > r1) goto L23
            int r1 = r11.offset
            int r1 = r1 + (-1)
            r11.offset = r1
            int r12 = r12 - r0
            java.time.ZonedDateTime r12 = r11.readZonedDateTimeX(r12)
            return r12
        L23:
            byte r12 = (byte) r12
            java.lang.String r12 = com.alibaba.fastjson2.JSONB.typeName(r12)
            java.lang.String r0 = "type not support : "
            ah.a.i(r12, r0)
            r12 = 0
            return r12
        L2f:
            r12 = 0
            return r12
        L31:
            long r0 = r11.readInt64Value()
            int r12 = r11.readInt32Value()
            long r2 = (long) r12
            java.time.Instant r12 = java.time.Instant.ofEpochSecond(r0, r2)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r0)
            return r12
        L45:
            byte[] r12 = r11.bytes
            int r0 = r11.offset
            int r12 = getInt(r12, r0)
            long r0 = (long) r12
            int r12 = r11.offset
            int r12 = r12 + 4
            r11.offset = r12
            r2 = 60
            long r0 = r0 * r2
            java.time.Instant r12 = java.time.Instant.ofEpochSecond(r0)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r0)
            return r12
        L62:
            byte[] r12 = r11.bytes
            int r0 = r11.offset
            int r12 = getInt(r12, r0)
            long r0 = (long) r12
            int r12 = r11.offset
            int r12 = r12 + 4
            r11.offset = r12
            java.time.Instant r12 = java.time.Instant.ofEpochSecond(r0)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r0)
            return r12
        L7c:
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r0 = r11.bytes
            long r1 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r3 = r11.offset
            long r3 = (long) r3
            long r1 = r1 + r3
            long r0 = r12.getLong(r0, r1)
            int r12 = r11.offset
            int r12 = r12 + 8
            r11.offset = r12
            boolean r12 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r12 == 0) goto L95
            goto L99
        L95:
            long r0 = java.lang.Long.reverseBytes(r0)
        L99:
            java.time.Instant r12 = java.time.Instant.ofEpochMilli(r0)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.ofInstant(r12, r0)
            return r12
        La4:
            byte[] r12 = r11.bytes
            int r0 = r11.offset
            int r1 = r0 + 1
            r11.offset = r1
            r2 = r12[r0]
            int r2 = r2 << 8
            int r3 = r0 + 2
            r11.offset = r3
            r1 = r12[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r1
            int r1 = r0 + 3
            r11.offset = r1
            r3 = r12[r3]
            int r0 = r0 + 4
            r11.offset = r0
            r12 = r12[r1]
            java.time.LocalDate r12 = java.time.LocalDate.of(r2, r3, r12)
            java.time.LocalTime r0 = java.time.LocalTime.MIN
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.of(r12, r0, r1)
            return r12
        Ld2:
            byte[] r12 = r11.bytes
            int r0 = r11.offset
            int r1 = r0 + 1
            r11.offset = r1
            r2 = r12[r0]
            int r2 = r2 << 8
            int r3 = r0 + 2
            r11.offset = r3
            r1 = r12[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r2 + r1
            int r1 = r0 + 3
            r11.offset = r1
            r5 = r12[r3]
            int r2 = r0 + 4
            r11.offset = r2
            r6 = r12[r1]
            int r1 = r0 + 5
            r11.offset = r1
            r7 = r12[r2]
            int r2 = r0 + 6
            r11.offset = r2
            r8 = r12[r1]
            int r0 = r0 + 7
            r11.offset = r0
            r9 = r12[r2]
            int r10 = r11.readInt32Value()
            java.time.LocalDateTime r12 = java.time.LocalDateTime.of(r4, r5, r6, r7, r8, r9, r10)
            java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.time.ZonedDateTime r12 = java.time.ZonedDateTime.of(r12, r0)
            return r12
    }

    public static com.alibaba.fastjson2.JSONException typeRefNotFound(int r2) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "type ref not found : "
            java.lang.String r2 = eh.a.l(r2, r1)
            r0.<init>(r2)
            throw r0
    }

    public final void autoTypeError() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "auotype not support : "
            r1.<init>(r2)
            java.lang.String r2 = r3.getString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.reader.ObjectReader checkAutoType(java.lang.Class r11, long r12, long r14) {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            r0 = r0[r1]
            r2 = -110(0xffffffffffffff92, float:NaN)
            r3 = 0
            if (r0 != r2) goto La1
            int r1 = r1 + 1
            r10.offset = r1
            long r5 = r10.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r0.provider
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 != 0) goto L2b
            com.alibaba.fastjson2.reader.ObjectReader r12 = r0.getObjectReader(r11)
            java.lang.Class r13 = r12.getObjectClass()
            if (r13 == 0) goto L2b
            if (r13 != r11) goto L2b
            r1.registerIfAbsent(r5, r12)
            return r12
        L2b:
            com.alibaba.fastjson2.JSONReader$Context r12 = r10.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r4 = r12.autoTypeBeforeHandler
            r7 = r11
            r8 = r14
            if (r4 == 0) goto L4c
            java.lang.Class r11 = r4.apply(r5, r7, r8)
            if (r11 != 0) goto L41
            java.lang.String r11 = r10.getString()
            java.lang.Class r11 = r4.apply(r11, r7, r8)
        L41:
            if (r11 == 0) goto L4c
            com.alibaba.fastjson2.JSONReader$Context r12 = r10.context
            com.alibaba.fastjson2.reader.ObjectReader r11 = r12.getObjectReader(r11)
            if (r11 == 0) goto L4c
            return r11
        L4c:
            com.alibaba.fastjson2.JSONReader$Context r11 = r10.context
            long r11 = r11.features
            long r11 = r11 | r8
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r13 = r13.mask
            long r13 = r13 & r11
            r8 = 0
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L69
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType
            long r13 = r13.mask
            long r13 = r13 & r11
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L66
            return r3
        L66:
            r10.autoTypeError()
        L69:
            com.alibaba.fastjson2.reader.ObjectReader r13 = r1.getObjectReader(r5)
            if (r13 == 0) goto L89
            java.lang.Class r14 = r13.getObjectClass()
            if (r14 == 0) goto L89
            java.lang.ClassLoader r15 = r14.getClassLoader()
            if (r15 == 0) goto L89
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            if (r15 == r0) goto L89
            com.alibaba.fastjson2.reader.ObjectReader r13 = r10.getObjectReaderContext(r13, r14, r0)
        L89:
            if (r13 != 0) goto L98
            java.lang.String r13 = r10.getString()
            com.alibaba.fastjson2.reader.ObjectReader r13 = r1.getObjectReader(r13, r7, r11)
            if (r13 != 0) goto L98
            r10.autoTypeError()
        L98:
            byte[] r11 = r10.bytes
            int r12 = r10.offset
            r11 = r11[r12]
            r10.type = r11
            return r13
        La1:
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r4 = this;
            byte[] r0 = r4.valueBytes
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 == 0) goto L10
            int r2 = r0.length
            if (r2 >= r1) goto L10
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r2 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r3 = r4.cacheItem
            r2.lazySet(r3, r0)
        L10:
            char[] r0 = r4.charBuf
            if (r0 == 0) goto L1e
            int r2 = r0.length
            if (r2 >= r1) goto L1e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r2 = r4.cacheItem
            r1.lazySet(r2, r0)
        L1e:
            return
    }

    public java.lang.String error(byte r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.alibaba.fastjson2.JSONB.typeName(r4)
            r0.append(r4)
            boolean r4 = r3.isString()
            if (r4 == 0) goto L2a
            int r4 = r3.offset
            int r1 = r4 + (-1)
            r3.offset = r1
            java.lang.String r1 = r3.readString()     // Catch: java.lang.Throwable -> L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L28
            r2 = 32
            r0.append(r2)
            r0.append(r1)
        L28:
            r3.offset = r4
        L2a:
            java.lang.String r4 = ", offset "
            r0.append(r4)
            int r4 = r3.offset
            r0.append(r4)
            r4 = 47
            r0.append(r4)
            byte[] r4 = r3.bytes
            int r4 = r4.length
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getFieldName() {
            r1 = this;
            java.lang.String r0 = r1.getString()
            return r0
    }

    public java.lang.String getLatin1String(int r6, int r7) {
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

    public final long getNameHashCode() {
            r11 = this;
            int r0 = r11.strBegin
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        L7:
            int r7 = r11.strlen
            if (r4 >= r7) goto L69
            byte[] r7 = r11.bytes
            r8 = r7[r0]
            if (r8 < 0) goto L66
            r9 = 8
            if (r4 >= r9) goto L66
            if (r4 != 0) goto L1e
            int r9 = r11.strBegin
            r7 = r7[r9]
            if (r7 != 0) goto L1e
            goto L66
        L1e:
            switch(r4) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L53;
                case 3: goto L4c;
                case 4: goto L42;
                case 5: goto L38;
                case 6: goto L2e;
                case 7: goto L22;
                default: goto L21;
            }
        L21:
            goto L61
        L22:
            long r7 = (long) r8
            r9 = 56
            long r7 = r7 << r9
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L2b:
            long r5 = r5 & r9
            long r5 = r5 + r7
            goto L61
        L2e:
            long r7 = (long) r8
            r9 = 48
            long r7 = r7 << r9
            r9 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L2b
        L38:
            long r7 = (long) r8
            r9 = 40
            long r7 = r7 << r9
            r9 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L2b
        L42:
            long r7 = (long) r8
            r9 = 32
            long r7 = r7 << r9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L2b
        L4c:
            int r7 = r8 << 24
            long r7 = (long) r7
            r9 = 16777215(0xffffff, double:8.2890456E-317)
            goto L2b
        L53:
            int r7 = r8 << 16
            long r7 = (long) r7
            r9 = 65535(0xffff, double:3.23786E-319)
            goto L2b
        L5a:
            int r7 = r8 << 8
            long r7 = (long) r7
            r9 = 255(0xff, double:1.26E-321)
            goto L2b
        L60:
            long r5 = (long) r8
        L61:
            int r4 = r4 + 1
            int r0 = r0 + 1
            goto L7
        L66:
            int r0 = r11.strBegin
            r5 = r1
        L69:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L6e
            return r5
        L6e:
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L73:
            int r4 = r11.strlen
            if (r3 >= r4) goto L8b
            byte[] r4 = r11.bytes
            int r5 = r0 + 1
            r0 = r4[r0]
            long r6 = (long) r0
            long r0 = r1 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r1 = r0 * r6
            int r3 = r3 + 1
            r0 = r5
            goto L73
        L8b:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getNameHashCodeLCase() {
            r15 = this;
            int r0 = r15.strBegin
            r1 = 0
            r3 = 0
            r5 = r1
            r4 = r3
        L7:
            int r7 = r15.strlen
            r8 = 90
            r9 = 65
            r10 = 45
            r11 = 95
            r12 = 32
            if (r4 >= r7) goto L85
            byte[] r7 = r15.bytes
            r13 = r7[r0]
            if (r13 < 0) goto L82
            r14 = 8
            if (r4 >= r14) goto L82
            if (r4 != 0) goto L28
            int r14 = r15.strBegin
            r14 = r7[r14]
            if (r14 != 0) goto L28
            goto L82
        L28:
            if (r13 == r11) goto L2e
            if (r13 == r10) goto L2e
            if (r13 != r12) goto L35
        L2e:
            int r10 = r0 + 1
            r7 = r7[r10]
            if (r7 == r13) goto L35
            goto L7f
        L35:
            if (r13 < r9) goto L3c
            if (r13 > r8) goto L3c
            int r13 = r13 + 32
            byte r13 = (byte) r13
        L3c:
            switch(r4) {
                case 0: goto L7c;
                case 1: goto L76;
                case 2: goto L6f;
                case 3: goto L68;
                case 4: goto L60;
                case 5: goto L56;
                case 6: goto L4c;
                case 7: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L7d
        L40:
            long r7 = (long) r13
            r9 = 56
            long r7 = r7 << r9
            r9 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L49:
            long r5 = r5 & r9
            long r5 = r5 + r7
            goto L7d
        L4c:
            long r7 = (long) r13
            r9 = 48
            long r7 = r7 << r9
            r9 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L49
        L56:
            long r7 = (long) r13
            r9 = 40
            long r7 = r7 << r9
            r9 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L49
        L60:
            long r7 = (long) r13
            long r7 = r7 << r12
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L49
        L68:
            int r7 = r13 << 24
            long r7 = (long) r7
            r9 = 16777215(0xffffff, double:8.2890456E-317)
            goto L49
        L6f:
            int r7 = r13 << 16
            long r7 = (long) r7
            r9 = 65535(0xffff, double:3.23786E-319)
            goto L49
        L76:
            int r7 = r13 << 8
            long r7 = (long) r7
            r9 = 255(0xff, double:1.26E-321)
            goto L49
        L7c:
            long r5 = (long) r13
        L7d:
            int r4 = r4 + 1
        L7f:
            int r0 = r0 + 1
            goto L7
        L82:
            int r0 = r15.strBegin
            r5 = r1
        L85:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L8a
            return r5
        L8a:
            r1 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L8f:
            int r4 = r15.strlen
            if (r3 >= r4) goto Lb5
            byte[] r4 = r15.bytes
            int r5 = r0 + 1
            r0 = r4[r0]
            if (r0 < r9) goto La0
            if (r0 > r8) goto La0
            int r0 = r0 + 32
            byte r0 = (byte) r0
        La0:
            if (r0 == r11) goto Lb1
            if (r0 == r10) goto Lb1
            if (r0 != r12) goto La7
            goto Lb1
        La7:
            long r6 = (long) r0
            long r0 = r1 ^ r6
            r6 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r0 = r0 * r6
            r1 = r0
        Lb1:
            int r3 = r3 + 1
            r0 = r5
            goto L8f
        Lb5:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int getRawInt() {
            r7 = this;
            int r0 = r7.offset
            int r1 = r0 + 3
            int r2 = r7.end
            if (r1 >= r2) goto L15
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r2 = r7.bytes
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r3 = r3 + r5
            int r0 = r1.getInt(r2, r3)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long getRawLong() {
            r7 = this;
            int r0 = r7.offset
            int r1 = r0 + 7
            int r2 = r7.end
            if (r1 >= r2) goto L15
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            byte[] r2 = r7.bytes
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r0
            long r3 = r3 + r5
            long r0 = r1.getLong(r2, r3)
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String getString() {
            r6 = this;
            byte r0 = r6.strtype
            r1 = -81
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            int r1 = r6.strlen
            if (r1 >= 0) goto L14
            com.alibaba.fastjson2.SymbolTable r0 = r6.symbolTable
            int r1 = -r1
            java.lang.String r0 = r0.getName(r1)
            return r0
        L14:
            r3 = 121(0x79, float:1.7E-43)
            if (r0 == r3) goto L42
            r3 = 73
            if (r0 < r3) goto L21
            r3 = 120(0x78, float:1.68E-43)
            if (r0 > r3) goto L21
            goto L42
        L21:
            r2 = 122(0x7a, float:1.71E-43)
            if (r0 != r2) goto L28
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            goto L83
        L28:
            r2 = 123(0x7b, float:1.72E-43)
            if (r0 != r2) goto L2f
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            goto L83
        L2f:
            r2 = 124(0x7c, float:1.74E-43)
            if (r0 != r2) goto L36
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L83
        L36:
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 != r2) goto L3d
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L83
        L3d:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r0)
            throw r0
        L42:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            int r3 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r4 = 34
            if (r3 >= r4) goto L83
            int r0 = r6.strBegin
            char[] r1 = r6.charBuf
            if (r1 != 0) goto L5c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r3 = r6.cacheItem
            java.lang.Object r1 = r1.getAndSet(r3, r2)
            char[] r1 = (char[]) r1
            r6.charBuf = r1
        L5c:
            if (r1 == 0) goto L63
            int r2 = r1.length
            int r3 = r6.strlen
            if (r2 >= r3) goto L69
        L63:
            int r1 = r6.strlen
            char[] r1 = new char[r1]
            r6.charBuf = r1
        L69:
            r2 = 0
            r3 = r2
        L6b:
            int r4 = r6.strlen
            if (r3 >= r4) goto L7d
            byte[] r4 = r6.bytes
            int r5 = r0 + r3
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6b
        L7d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r4)
            return r0
        L83:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r6.bytes
            int r4 = r6.strBegin
            r2.<init>(r3, r4, r1, r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final int getStringLength() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r3.type = r0
            r1 = 73
            if (r0 < r1) goto L12
            r2 = 120(0x78, float:1.68E-43)
            if (r0 >= r2) goto L12
            int r0 = r0 - r1
            return r0
        L12:
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r0)
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte getType() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isArray() {
            r4 = this;
            int r0 = r4.offset
            byte[] r1 = r4.bytes
            int r2 = r1.length
            r3 = 0
            if (r0 < r2) goto L9
            return r3
        L9:
            r0 = r1[r0]
            r1 = -108(0xffffffffffffff94, float:NaN)
            if (r0 < r1) goto L15
            r1 = -92
            if (r0 > r1) goto L15
            r0 = 1
            return r0
        L15:
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isBinary() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -111(0xffffffffffffff91, float:NaN)
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isDate() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -89
            if (r0 < r1) goto L10
            r1 = -82
            if (r0 > r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isEnd() {
            r2 = this;
            int r0 = r2.offset
            int r1 = r2.end
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isInt() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -70
            if (r0 < r1) goto Le
            r1 = 72
            if (r0 <= r1) goto L1d
        Le:
            r1 = -84
            if (r0 == r1) goto L1d
            r1 = -83
            if (r0 == r1) goto L1d
            r1 = -85
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNull() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -81
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isNumber() {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            r1 = -78
            if (r0 < r1) goto L10
            r1 = 72
            if (r0 > r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isObject() {
            r2 = this;
            int r0 = r2.offset
            int r1 = r2.end
            if (r0 >= r1) goto L10
            byte[] r1 = r2.bytes
            r0 = r1[r0]
            r1 = -90
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isReference() {
            r3 = this;
            int r0 = r3.offset
            byte[] r1 = r3.bytes
            int r2 = r1.length
            if (r0 >= r2) goto Lf
            r0 = r1[r0]
            r1 = -109(0xffffffffffffff93, float:NaN)
            if (r0 != r1) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean isString() {
            r3 = this;
            int r0 = r3.offset
            byte[] r1 = r3.bytes
            int r2 = r1.length
            if (r0 >= r2) goto L11
            r0 = r1[r0]
            r3.type = r0
            r1 = 73
            if (r0 < r1) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public com.alibaba.fastjson2.JSONReader.SavePoint mark() {
            r3 = this;
            com.alibaba.fastjson2.JSONReader$SavePoint r0 = new com.alibaba.fastjson2.JSONReader$SavePoint
            int r1 = r3.offset
            byte r2 = r3.type
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void next() {
            r1 = this;
            int r0 = r1.offset
            int r0 = r0 + 1
            r1.offset = r0
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayEnd() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfArrayStart() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfComma() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfInfinity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(byte r3) {
            r2 = this;
            byte[] r0 = r2.bytes
            int r1 = r2.offset
            r0 = r0[r1]
            if (r0 != r3) goto Ld
            r3 = 1
            int r1 = r1 + r3
            r2.offset = r1
            return r3
        Ld:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatch(char r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r1, char r2, char r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r1, char r2, char r3, char r4) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r1, char r2, char r3, char r4, char r5) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchIdent(char r1, char r2, char r3, char r4, char r5, char r6) {
            r0 = this;
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = "UnsupportedOperation"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfMatchTypedAny() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r2) goto Lf
            r0 = 1
            int r1 = r1 + r0
            r3.offset = r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match10(long r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 11
            int r2 = r7.end
            if (r1 >= r2) goto L26
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 7
            long r3 = r3 - r5
            long r2 = r2.getLong(r0, r3)
            r4 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r2 = r2 & r4
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L22
            goto L26
        L22:
            r7.offset = r1
            r8 = 1
            return r8
        L26:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match11(long r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 12
            int r2 = r7.end
            if (r1 >= r2) goto L20
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 8
            long r3 = r3 - r5
            long r2 = r2.getLong(r0, r3)
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 == 0) goto L1c
            goto L20
        L1c:
            r7.offset = r1
            r8 = 1
            return r8
        L20:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match12(long r9, byte r11) {
            r8 = this;
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            int r2 = r1 + 13
            int r3 = r8.end
            if (r2 >= r3) goto L26
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r4 = r4 + r6
            r6 = 9
            long r4 = r4 - r6
            long r3 = r3.getLong(r0, r4)
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r9 != 0) goto L26
            int r1 = r1 + 12
            r9 = r0[r1]
            if (r9 == r11) goto L22
            goto L26
        L22:
            r8.offset = r2
            r9 = 1
            return r9
        L26:
            r9 = 0
            return r9
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match13(long r12, int r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r2 = r1 + 14
            int r1 = r1 + 15
            int r3 = r11.end
            if (r1 >= r3) goto L2d
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r2
            long r7 = r3 + r5
            r9 = 10
            long r7 = r7 - r9
            long r7 = r1.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L2d
            long r3 = r3 + r5
            r12 = 2
            long r3 = r3 - r12
            short r12 = r1.getShort(r0, r3)
            if (r12 == r14) goto L29
            goto L2d
        L29:
            r11.offset = r2
            r12 = 1
            return r12
        L2d:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match14(long r12, int r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 15
            int r2 = r11.end
            if (r1 >= r2) goto L2f
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 11
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L2f
            long r3 = r3 + r5
            r12 = 3
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            if (r12 == r14) goto L2b
            goto L2f
        L2b:
            r11.offset = r1
            r12 = 1
            return r12
        L2f:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match15(long r12, int r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 16
            int r2 = r11.end
            if (r1 >= r2) goto L2b
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 12
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L2b
            long r3 = r3 + r5
            r12 = 4
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            if (r12 == r14) goto L27
            goto L2b
        L27:
            r11.offset = r1
            r12 = 1
            return r12
        L2b:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match16(long r13, int r15, byte r16) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 17
            int r3 = r12.end
            if (r2 >= r3) goto L33
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 13
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L33
            long r4 = r4 + r6
            r13 = 5
            long r4 = r4 - r13
            int r13 = r3.getInt(r0, r4)
            if (r13 != r15) goto L33
            int r1 = r1 + 16
            r13 = r0[r1]
            r14 = r16
            if (r13 == r14) goto L2f
            goto L33
        L2f:
            r12.offset = r2
            r13 = 1
            return r13
        L33:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match17(long r12, long r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r2 = r1 + 18
            int r1 = r1 + 19
            int r3 = r11.end
            if (r1 >= r3) goto L35
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r2
            long r7 = r3 + r5
            r9 = 14
            long r7 = r7 - r9
            long r7 = r1.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L35
            long r3 = r3 + r5
            r12 = 6
            long r3 = r3 - r12
            long r12 = r1.getLong(r0, r3)
            r0 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r12 = r12 & r0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L31
            goto L35
        L31:
            r11.offset = r2
            r12 = 1
            return r12
        L35:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match18(long r12, long r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 19
            int r2 = r11.end
            if (r1 >= r2) goto L33
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 15
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L33
            long r3 = r3 + r5
            r12 = 7
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r2 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r2
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L2f
            goto L33
        L2f:
            r11.offset = r1
            r12 = 1
            return r12
        L33:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match19(long r12, long r14) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 20
            int r2 = r11.end
            if (r1 >= r2) goto L2d
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 16
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L2d
            long r3 = r3 + r5
            r12 = 8
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L29
            goto L2d
        L29:
            r11.offset = r1
            r12 = 1
            return r12
        L2d:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match20(long r13, long r15, byte r17) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 21
            int r3 = r12.end
            if (r2 >= r3) goto L35
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 17
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L35
            long r4 = r4 + r6
            r13 = 9
            long r4 = r4 - r13
            long r13 = r3.getLong(r0, r4)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L35
            int r1 = r1 + 20
            r13 = r0[r1]
            r14 = r17
            if (r13 == r14) goto L31
            goto L35
        L31:
            r12.offset = r2
            r13 = 1
            return r13
        L35:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match21(long r12, long r14, int r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 22
            int r2 = r11.end
            if (r1 >= r2) goto L3a
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 18
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r12 = r3 + r5
            r7 = 10
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r3 = r3 + r5
            r12 = 2
            long r3 = r3 - r12
            short r12 = r2.getShort(r0, r3)
            r13 = r16
            if (r12 == r13) goto L36
            goto L3a
        L36:
            r11.offset = r1
            r12 = 1
            return r12
        L3a:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match22(long r12, long r14, int r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 23
            int r2 = r11.end
            if (r1 >= r2) goto L3e
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 19
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L3e
            long r12 = r3 + r5
            r7 = 11
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L3e
            long r3 = r3 + r5
            r12 = 3
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            r13 = r16
            if (r12 == r13) goto L3a
            goto L3e
        L3a:
            r11.offset = r1
            r12 = 1
            return r12
        L3e:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match23(long r12, long r14, int r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 24
            int r2 = r11.end
            if (r1 >= r2) goto L3a
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 20
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r12 = r3 + r5
            r7 = 12
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r3 = r3 + r5
            r12 = 4
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = r16
            if (r12 == r13) goto L36
            goto L3a
        L36:
            r11.offset = r1
            r12 = 1
            return r12
        L3a:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match24(long r13, long r15, int r17, byte r18) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 25
            int r3 = r12.end
            if (r2 >= r3) goto L42
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 21
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L42
            long r13 = r4 + r6
            r8 = 13
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L42
            long r4 = r4 + r6
            r13 = 5
            long r4 = r4 - r13
            int r13 = r3.getInt(r0, r4)
            r14 = r17
            if (r13 != r14) goto L42
            int r1 = r1 + 24
            r13 = r0[r1]
            r14 = r18
            if (r13 == r14) goto L3e
            goto L42
        L3e:
            r12.offset = r2
            r13 = 1
            return r13
        L42:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match25(long r12, long r14, long r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 26
            int r2 = r11.end
            if (r1 >= r2) goto L40
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 22
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L40
            long r12 = r3 + r5
            r7 = 14
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L40
            long r3 = r3 + r5
            r12 = 6
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r12 = r12 & r14
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 == 0) goto L3c
            goto L40
        L3c:
            r11.offset = r1
            r12 = 1
            return r12
        L40:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match26(long r12, long r14, long r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 27
            int r2 = r11.end
            if (r1 >= r2) goto L40
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 23
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L40
            long r12 = r3 + r5
            r7 = 15
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L40
            long r3 = r3 + r5
            r12 = 7
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r14
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 == 0) goto L3c
            goto L40
        L3c:
            r11.offset = r1
            r12 = 1
            return r12
        L40:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match27(long r12, long r14, long r16) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 28
            int r2 = r11.end
            if (r1 >= r2) goto L3a
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 24
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r12 = r3 + r5
            r7 = 16
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L3a
            long r3 = r3 + r5
            r12 = 8
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 == 0) goto L36
            goto L3a
        L36:
            r11.offset = r1
            r12 = 1
            return r12
        L3a:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match28(long r13, long r15, long r17, byte r19) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 29
            int r3 = r12.end
            if (r2 >= r3) goto L42
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 25
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L42
            long r13 = r4 + r6
            r8 = 17
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L42
            long r4 = r4 + r6
            r13 = 9
            long r4 = r4 - r13
            long r13 = r3.getLong(r0, r4)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L42
            int r1 = r1 + 28
            r13 = r0[r1]
            r14 = r19
            if (r13 == r14) goto L3e
            goto L42
        L3e:
            r12.offset = r2
            r13 = 1
            return r13
        L42:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match29(long r12, long r14, long r16, int r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 30
            int r2 = r11.end
            if (r1 >= r2) goto L47
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 26
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r7 = 18
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r14 = 10
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L47
            long r3 = r3 + r5
            r12 = 2
            long r3 = r3 - r12
            short r12 = r2.getShort(r0, r3)
            r13 = r18
            if (r12 == r13) goto L43
            goto L47
        L43:
            r11.offset = r1
            r12 = 1
            return r12
        L47:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match3() {
            r2 = this;
            int r0 = r2.offset
            int r0 = r0 + 4
            int r1 = r2.end
            if (r0 <= r1) goto La
            r0 = 0
            return r0
        La:
            r2.offset = r0
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match30(long r12, long r14, long r16, int r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 31
            int r2 = r11.end
            if (r1 >= r2) goto L4b
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 27
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L4b
            long r12 = r3 + r5
            r7 = 19
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L4b
            long r12 = r3 + r5
            r14 = 11
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L4b
            long r3 = r3 + r5
            r12 = 3
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            r13 = r18
            if (r12 == r13) goto L47
            goto L4b
        L47:
            r11.offset = r1
            r12 = 1
            return r12
        L4b:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match31(long r12, long r14, long r16, int r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 32
            int r2 = r11.end
            if (r1 >= r2) goto L47
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 28
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r7 = 20
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r14 = 12
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L47
            long r3 = r3 + r5
            r12 = 4
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = r18
            if (r12 == r13) goto L43
            goto L47
        L43:
            r11.offset = r1
            r12 = 1
            return r12
        L47:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match32(long r13, long r15, long r17, int r19, byte r20) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 33
            int r3 = r12.end
            if (r2 >= r3) goto L4f
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 29
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r13 = r4 + r6
            r8 = 21
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r13 = r4 + r6
            r8 = 13
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r4 = r4 + r6
            r13 = 5
            long r4 = r4 - r13
            int r13 = r3.getInt(r0, r4)
            r14 = r19
            if (r13 != r14) goto L4f
            int r1 = r1 + 32
            r13 = r0[r1]
            r14 = r20
            if (r13 == r14) goto L4b
            goto L4f
        L4b:
            r12.offset = r2
            r13 = 1
            return r13
        L4f:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match33(long r12, long r14, long r16, long r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 34
            int r2 = r11.end
            if (r1 >= r2) goto L4d
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 30
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r12 = r3 + r5
            r7 = 22
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r12 = r3 + r5
            r14 = 14
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r3 = r3 + r5
            r12 = 6
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r12 = r12 & r14
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 == 0) goto L49
            goto L4d
        L49:
            r11.offset = r1
            r12 = 1
            return r12
        L4d:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match34(long r12, long r14, long r16, long r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 35
            int r2 = r11.end
            if (r1 >= r2) goto L4d
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 31
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r12 = r3 + r5
            r7 = 23
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r12 = r3 + r5
            r14 = 15
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L4d
            long r3 = r3 + r5
            r12 = 7
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r14
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 == 0) goto L49
            goto L4d
        L49:
            r11.offset = r1
            r12 = 1
            return r12
        L4d:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match35(long r12, long r14, long r16, long r18) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 36
            int r2 = r11.end
            if (r1 >= r2) goto L47
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 32
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r7 = 24
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L47
            long r12 = r3 + r5
            r14 = 16
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L47
            long r3 = r3 + r5
            r12 = 8
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 == 0) goto L43
            goto L47
        L43:
            r11.offset = r1
            r12 = 1
            return r12
        L47:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match36(long r13, long r15, long r17, long r19, byte r21) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 37
            int r3 = r12.end
            if (r2 >= r3) goto L4f
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 33
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r13 = r4 + r6
            r8 = 25
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r13 = r4 + r6
            r8 = 17
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L4f
            long r4 = r4 + r6
            r13 = 9
            long r4 = r4 - r13
            long r13 = r3.getLong(r0, r4)
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 != 0) goto L4f
            int r1 = r1 + 36
            r13 = r0[r1]
            r14 = r21
            if (r13 == r14) goto L4b
            goto L4f
        L4b:
            r12.offset = r2
            r13 = 1
            return r13
        L4f:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match37(long r12, long r14, long r16, long r18, int r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 38
            int r2 = r11.end
            if (r1 >= r2) goto L54
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 34
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r7 = 26
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 18
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 10
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L54
            long r3 = r3 + r5
            r12 = 2
            long r3 = r3 - r12
            short r12 = r2.getShort(r0, r3)
            r13 = r20
            if (r12 == r13) goto L50
            goto L54
        L50:
            r11.offset = r1
            r12 = 1
            return r12
        L54:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match38(long r12, long r14, long r16, long r18, int r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 39
            int r2 = r11.end
            if (r1 >= r2) goto L58
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 35
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L58
            long r12 = r3 + r5
            r7 = 27
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L58
            long r12 = r3 + r5
            r14 = 19
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L58
            long r12 = r3 + r5
            r14 = 11
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L58
            long r3 = r3 + r5
            r12 = 3
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r13
            r13 = r20
            if (r12 == r13) goto L54
            goto L58
        L54:
            r11.offset = r1
            r12 = 1
            return r12
        L58:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match39(long r12, long r14, long r16, long r18, int r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 40
            int r2 = r11.end
            if (r1 >= r2) goto L54
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 36
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r7 = 28
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 20
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 12
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L54
            long r3 = r3 + r5
            r12 = 4
            long r3 = r3 - r12
            int r12 = r2.getInt(r0, r3)
            r13 = r20
            if (r12 == r13) goto L50
            goto L54
        L50:
            r11.offset = r1
            r12 = 1
            return r12
        L54:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match4(byte r5) {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            int r2 = r1 + 5
            int r3 = r4.end
            if (r2 > r3) goto L15
            int r1 = r1 + 4
            r0 = r0[r1]
            if (r0 == r5) goto L11
            goto L15
        L11:
            r4.offset = r2
            r5 = 1
            return r5
        L15:
            r5 = 0
            return r5
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match40(long r13, long r15, long r17, long r19, int r21, byte r22) {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 41
            int r3 = r12.end
            if (r2 >= r3) goto L5c
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r8 = r4 + r6
            r10 = 37
            long r8 = r8 - r10
            long r8 = r3.getLong(r0, r8)
            int r13 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r13 != 0) goto L5c
            long r13 = r4 + r6
            r8 = 29
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L5c
            long r13 = r4 + r6
            r8 = 21
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 != 0) goto L5c
            long r13 = r4 + r6
            r8 = 13
            long r13 = r13 - r8
            long r13 = r3.getLong(r0, r13)
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 != 0) goto L5c
            long r4 = r4 + r6
            r13 = 5
            long r4 = r4 - r13
            int r13 = r3.getInt(r0, r4)
            r14 = r21
            if (r13 != r14) goto L5c
            int r1 = r1 + 40
            r13 = r0[r1]
            r14 = r22
            if (r13 == r14) goto L58
            goto L5c
        L58:
            r12.offset = r2
            r13 = 1
            return r13
        L5c:
            r13 = 0
            return r13
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match41(long r12, long r14, long r16, long r18, long r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 42
            int r2 = r11.end
            if (r1 >= r2) goto L5a
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 38
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r7 = 30
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r14 = 22
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r14 = 14
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r3 = r3 + r5
            r12 = 6
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r12 = r12 & r14
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L56
            goto L5a
        L56:
            r11.offset = r1
            r12 = 1
            return r12
        L5a:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match42(long r12, long r14, long r16, long r18, long r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 43
            int r2 = r11.end
            if (r1 >= r2) goto L5a
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 39
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r7 = 31
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r14 = 23
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r12 = r3 + r5
            r14 = 15
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L5a
            long r3 = r3 + r5
            r12 = 7
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            r14 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r12 = r12 & r14
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L56
            goto L5a
        L56:
            r11.offset = r1
            r12 = 1
            return r12
        L5a:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match43(long r12, long r14, long r16, long r18, long r20) {
            r11 = this;
            byte[] r0 = r11.bytes
            int r1 = r11.offset
            int r1 = r1 + 44
            int r2 = r11.end
            if (r1 >= r2) goto L54
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r7 = r3 + r5
            r9 = 40
            long r7 = r7 - r9
            long r7 = r2.getLong(r0, r7)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r7 = 32
            long r12 = r12 - r7
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 24
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L54
            long r12 = r3 + r5
            r14 = 16
            long r12 = r12 - r14
            long r12 = r2.getLong(r0, r12)
            int r12 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r12 != 0) goto L54
            long r3 = r3 + r5
            r12 = 8
            long r3 = r3 - r12
            long r12 = r2.getLong(r0, r3)
            int r12 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r12 == 0) goto L50
            goto L54
        L50:
            r11.offset = r1
            r12 = 1
            return r12
        L54:
            r12 = 0
            return r12
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match5(int r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 6
            int r2 = r7.end
            if (r1 > r2) goto L1e
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 2
            long r3 = r3 - r5
            short r0 = r2.getShort(r0, r3)
            if (r0 == r8) goto L1a
            goto L1e
        L1a:
            r7.offset = r1
            r8 = 1
            return r8
        L1e:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match6(int r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 7
            int r2 = r7.end
            if (r1 > r2) goto L22
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 3
            long r3 = r3 - r5
            int r0 = r2.getInt(r0, r3)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r2
            if (r0 == r8) goto L1e
            goto L22
        L1e:
            r7.offset = r1
            r8 = 1
            return r8
        L22:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match7(int r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r1 = r1 + 8
            int r2 = r7.end
            if (r1 > r2) goto L1e
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 4
            long r3 = r3 - r5
            int r0 = r2.getInt(r0, r3)
            if (r0 == r8) goto L1a
            goto L1e
        L1a:
            r7.offset = r1
            r8 = 1
            return r8
        L1e:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match8(int r9, byte r10) {
            r8 = this;
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            int r2 = r1 + 9
            int r3 = r8.end
            if (r2 >= r3) goto L24
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r6 = (long) r2
            long r4 = r4 + r6
            r6 = 5
            long r4 = r4 - r6
            int r3 = r3.getInt(r0, r4)
            if (r3 != r9) goto L24
            int r1 = r1 + 8
            r9 = r0[r1]
            if (r9 == r10) goto L20
            goto L24
        L20:
            r8.offset = r2
            r9 = 1
            return r9
        L24:
            r9 = 0
            return r9
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfName4Match9(long r8) {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 10
            int r1 = r1 + 11
            int r3 = r7.end
            if (r1 >= r3) goto L28
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r5 = (long) r2
            long r3 = r3 + r5
            r5 = 6
            long r3 = r3 - r5
            long r0 = r1.getLong(r0, r3)
            r3 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r0 = r0 & r3
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 == 0) goto L24
            goto L28
        L24:
            r7.offset = r2
            r8 = 1
            return r8
        L28:
            r8 = 0
            return r8
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNull() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -81
            if (r0 != r2) goto Lf
            r0 = 1
            int r1 = r1 + r0
            r3.offset = r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfNullOrEmptyString() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r0 = r0[r1]
            r2 = -81
            r3 = 1
            if (r0 != r2) goto Lf
            int r1 = r1 + r3
            r4.offset = r1
            return r3
        Lf:
            r2 = 73
            if (r0 == r2) goto L15
            r0 = 0
            return r0
        L15:
            int r1 = r1 + r3
            r4.offset = r1
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectEnd() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -91
            if (r0 == r2) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            int r1 = r1 + r0
            r3.offset = r1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfObjectStart() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -90
            if (r0 == r2) goto Lc
            r0 = 0
            return r0
        Lc:
            r0 = 1
            int r1 = r1 + r0
            r3.offset = r1
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean nextIfSet() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(java.lang.Class<T> r9) {
            r8 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r0.provider
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r9, r1)
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r8
            java.lang.Object r9 = r2.readJSONBObject(r3, r4, r5, r6)
            return r9
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public <T> T read(java.lang.reflect.Type r9) {
            r8 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r0.provider
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r9, r1)
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r8
            java.lang.Object r9 = r2.readJSONBObject(r3, r4, r5, r6)
            return r9
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void read(java.util.Map r6, long r7) {
            r5 = this;
            byte[] r7 = r5.bytes
            int r8 = r5.offset
            r7 = r7[r8]
            r0 = -90
            if (r7 != r0) goto La7
            int r8 = r8 + 1
            r5.offset = r8
        Le:
            byte[] r7 = r5.bytes
            int r8 = r5.offset
            r7 = r7[r8]
            r1 = -91
            if (r7 != r1) goto L1d
            int r8 = r8 + 1
            r5.offset = r8
            return
        L1d:
            r8 = 73
            if (r7 < r8) goto L26
            java.lang.String r7 = r5.readFieldName()
            goto L2a
        L26:
            java.lang.Object r7 = r5.readAny()
        L2a:
            boolean r1 = r5.isReference()
            if (r1 == 0) goto L4c
            java.lang.String r8 = r5.readReference()
            java.lang.String r1 = ".."
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L40
            r6.put(r7, r6)
            goto Le
        L40:
            com.alibaba.fastjson2.JSONPath r8 = com.alibaba.fastjson2.JSONPath.of(r8)
            r5.addResolveTask(r6, r7, r8)
            r8 = 0
            r6.put(r7, r8)
            goto Le
        L4c:
            byte[] r1 = r5.bytes
            int r2 = r5.offset
            r1 = r1[r2]
            if (r1 < r8) goto L5d
            r8 = 126(0x7e, float:1.77E-43)
            if (r1 > r8) goto L5d
            java.lang.String r8 = r5.readString()
            goto L8f
        L5d:
            r8 = -16
            if (r1 < r8) goto L6e
            r8 = 47
            if (r1 > r8) goto L6e
            int r2 = r2 + 1
            r5.offset = r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            goto L8f
        L6e:
            r8 = -79
            if (r1 != r8) goto L79
            int r2 = r2 + 1
            r5.offset = r2
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            goto L8f
        L79:
            r8 = -80
            if (r1 != r8) goto L84
            int r2 = r2 + 1
            r5.offset = r2
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L8f
        L84:
            if (r1 != r0) goto L8b
            java.util.Map r8 = r5.readObject()
            goto L8f
        L8b:
            java.lang.Object r8 = r5.readAny()
        L8f:
            if (r8 != 0) goto La2
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto La2
            goto Le
        La2:
            r6.put(r7, r8)
            goto Le
        La7:
            byte r6 = r5.type
            java.lang.String r6 = r5.error(r6)
            java.lang.String r7 = "object not support input "
            ah.a.i(r6, r7)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.Object readAny() {
            r26 = this;
            r1 = r26
            int r0 = r1.offset
            byte[] r2 = r1.bytes
            int r3 = r2.length
            java.lang.String r4 = "/"
            if (r0 >= r3) goto L671
            int r3 = r0 + 1
            r1.offset = r3
            r5 = r2[r0]
            r1.type = r5
            r6 = 72
            if (r5 == r6) goto L661
            java.lang.String r6 = ", offset "
            r7 = 0
            r8 = 0
            switch(r5) {
                case -112: goto L657;
                case -111: goto L643;
                case -110: goto L58a;
                default: goto L1f;
            }
        L1f:
            java.lang.String r10 = ".."
            r11 = 47
            r12 = -16
            r13 = 0
            r14 = 73
            switch(r5) {
                case -90: goto L433;
                case -89: goto L418;
                case -88: goto L3df;
                case -87: goto L3bd;
                case -86: goto L3b8;
                case -85: goto L399;
                case -84: goto L385;
                case -83: goto L370;
                case -82: goto L362;
                case -81: goto L361;
                case -80: goto L35e;
                case -79: goto L35b;
                case -78: goto L354;
                case -77: goto L34d;
                case -76: goto L343;
                case -75: goto L321;
                case -74: goto L317;
                case -73: goto L304;
                case -72: goto L2fb;
                case -71: goto L2e5;
                case -70: goto L2dc;
                case -69: goto L2c4;
                case -68: goto L2ad;
                case -67: goto L2a2;
                case -66: goto L284;
                case -65: goto L273;
                default: goto L2b;
            }
        L2b:
            switch(r5) {
                case 122: goto L24d;
                case 123: goto L227;
                case 124: goto L201;
                case 125: goto L1db;
                case 126: goto L1a9;
                default: goto L2e;
            }
        L2e:
            if (r5 < r12) goto L37
            if (r5 > r11) goto L37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        L37:
            r4 = 48
            if (r5 < r4) goto L51
            r4 = 63
            if (r5 > r4) goto L51
            int r5 = r5 + (-56)
            int r4 = r5 << 8
            int r0 = r0 + 2
            r1.offset = r0
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L51:
            r4 = 64
            if (r5 < r4) goto L68
            r4 = 71
            if (r5 > r4) goto L68
            int r0 = getInt3(r2, r3, r5)
            int r2 = r1.offset
            int r2 = r2 + 2
            r1.offset = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L68:
            r4 = -40
            if (r5 < r4) goto L7a
            r6 = -17
            if (r5 > r6) goto L7a
            int r5 = r5 - r4
            long r2 = (long) r5
            r4 = -8
            long r2 = r2 + r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        L7a:
            r4 = -56
            if (r5 < r4) goto L96
            r4 = -41
            if (r5 > r4) goto L96
            int r5 = r5 + 48
            int r4 = r5 << 8
            long r4 = (long) r4
            int r0 = r0 + 2
            r1.offset = r0
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r2 = (long) r0
            long r4 = r4 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            return r0
        L96:
            r4 = -64
            if (r5 < r4) goto Lbc
            r4 = -57
            if (r5 > r4) goto Lbc
            int r5 = r5 + 60
            int r4 = r5 << 16
            int r5 = r0 + 2
            r1.offset = r5
            r3 = r2[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            int r4 = r4 + r3
            int r0 = r0 + 3
            r1.offset = r0
            r0 = r2[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r0
            long r2 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        Lbc:
            r0 = -108(0xffffffffffffff94, float:NaN)
            if (r5 < r0) goto L133
            r2 = -92
            if (r5 > r2) goto L133
            if (r5 != r2) goto Lcb
            int r0 = r1.readLength()
            goto Lcd
        Lcb:
            int r0 = r5 + 108
        Lcd:
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            if (r0 != 0) goto Lf1
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r5 = r0.mask
            long r3 = r3 & r5
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto Le2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        Le2:
            java.util.function.Supplier<java.util.List> r0 = r2.arraySupplier
            if (r0 == 0) goto Leb
            java.lang.Object r0 = r0.get()
            return r0
        Leb:
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>()
            return r0
        Lf1:
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L102
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            goto L107
        L102:
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            r2.<init>(r0)
        L107:
            if (r13 >= r0) goto L132
            boolean r3 = r1.isReference()
            if (r3 == 0) goto L128
            java.lang.String r3 = r1.readReference()
            boolean r4 = r10.equals(r3)
            if (r4 == 0) goto L11d
            r2.add(r2)
            goto L12f
        L11d:
            r2.add(r7)
            com.alibaba.fastjson2.JSONPath r3 = com.alibaba.fastjson2.JSONPath.of(r3)
            r1.addResolveTask(r2, r13, r3)
            goto L12f
        L128:
            java.lang.Object r3 = r1.readAny()
            r2.add(r3)
        L12f:
            int r13 = r13 + 1
            goto L107
        L132:
            return r2
        L133:
            if (r5 < r14) goto L17f
            r0 = 121(0x79, float:1.7E-43)
            if (r5 > r0) goto L17f
            if (r5 != r0) goto L140
            int r0 = r1.readLength()
            goto L142
        L140:
            int r0 = r5 + (-73)
        L142:
            r1.strlen = r0
            if (r0 >= 0) goto L14e
            com.alibaba.fastjson2.SymbolTable r2 = r1.symbolTable
            int r0 = -r0
            java.lang.String r0 = r2.getName(r0)
            return r0
        L14e:
            int r2 = r1.offset
            java.lang.String r0 = r1.getLatin1String(r2, r0)
            int r2 = r1.offset
            int r3 = r1.strlen
            int r2 = r2 + r3
            r1.offset = r2
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L16c
            java.lang.String r0 = r0.trim()
        L16c:
            int r2 = r1.strlen
            if (r2 != 0) goto L17e
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 == 0) goto L17e
            return r7
        L17e:
            return r0
        L17f:
            r0 = 127(0x7f, float:1.78E-43)
            if (r5 != r0) goto L19c
            int r0 = r1.readLength()
            r1.strlen = r0
            if (r0 >= 0) goto L193
            com.alibaba.fastjson2.SymbolTable r2 = r1.symbolTable
            int r0 = -r0
            java.lang.String r0 = r2.getName(r0)
            return r0
        L193:
            java.lang.String r0 = "not support symbol : "
            int r2 = r1.strlen
            ah.a.y(r2, r0)
            r0 = 0
            return r0
        L19c:
            byte r0 = r1.type
            java.lang.String r0 = r1.error(r0)
            java.lang.String r2 = "not support type : "
            ah.a.i(r0, r2)
            r0 = 0
            return r0
        L1a9:
            java.nio.charset.Charset r0 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            if (r0 != 0) goto L1b5
            java.lang.String r0 = "GB18030"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.alibaba.fastjson2.JSONReaderJSONB.GB18030 = r0
        L1b5:
            int r0 = r1.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.nio.charset.Charset r5 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            r2.<init>(r3, r4, r0, r5)
            if (r0 != 0) goto L1d4
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L1d4
            goto L1d5
        L1d4:
            r7 = r2
        L1d5:
            int r2 = r1.offset
            int r2 = r2 + r0
            r1.offset = r2
            return r7
        L1db:
            int r0 = r1.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16BE
            r2.<init>(r3, r4, r0, r5)
            if (r0 != 0) goto L1fa
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L1fa
            goto L1fb
        L1fa:
            r7 = r2
        L1fb:
            int r2 = r1.offset
            int r2 = r2 + r0
            r1.offset = r2
            return r7
        L201:
            int r0 = r1.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16LE
            r2.<init>(r3, r4, r0, r5)
            if (r0 != 0) goto L220
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L220
            goto L221
        L220:
            r7 = r2
        L221:
            int r2 = r1.offset
            int r2 = r2 + r0
            r1.offset = r2
            return r7
        L227:
            int r0 = r1.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16
            r2.<init>(r3, r4, r0, r5)
            if (r0 != 0) goto L246
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L246
            goto L247
        L246:
            r7 = r2
        L247:
            int r2 = r1.offset
            int r2 = r2 + r0
            r1.offset = r2
            return r7
        L24d:
            int r0 = r1.readLength()
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r3, r4, r0, r5)
            if (r0 != 0) goto L26c
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L26c
            goto L26d
        L26c:
            r7 = r2
        L26d:
            int r2 = r1.offset
            int r2 = r2 + r0
            r1.offset = r2
            return r7
        L273:
            int r0 = getInt(r2, r3)
            int r2 = r1.offset
            int r2 = r2 + 4
            r1.offset = r2
            java.lang.Long r2 = new java.lang.Long
            long r3 = (long) r0
            r2.<init>(r3)
            return r2
        L284:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r3
            long r4 = r4 + r6
            long r2 = r0.getLong(r2, r4)
            int r0 = r1.offset
            int r0 = r0 + 8
            r1.offset = r0
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L299
            goto L29d
        L299:
            long r2 = java.lang.Long.reverseBytes(r2)
        L29d:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            return r0
        L2a2:
            int r0 = r0 + 2
            r1.offset = r0
            r0 = r2[r3]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L2ad:
            int r4 = r0 + 2
            r1.offset = r4
            r3 = r2[r3]
            int r3 = r3 << 8
            int r0 = r0 + 3
            r1.offset = r0
            r0 = r2[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            short r0 = (short) r3
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L2c4:
            int r0 = r1.readInt32Value()
            byte[] r2 = new byte[r0]
            byte[] r3 = r1.bytes
            int r4 = r1.offset
            java.lang.System.arraycopy(r3, r4, r2, r13, r0)
            int r3 = r1.offset
            int r3 = r3 + r0
            r1.offset = r3
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            return r0
        L2dc:
            long r2 = r1.readInt64Value()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            return r0
        L2e5:
            int r0 = r1.readInt32Value()
            java.math.BigInteger r2 = r1.readBigInteger()
            if (r0 != 0) goto L2f5
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r2)
            return r0
        L2f5:
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r2, r0)
            return r3
        L2fb:
            long r2 = r1.readInt64Value()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
            return r0
        L304:
            int r0 = getInt(r2, r3)
            int r2 = r1.offset
            int r2 = r2 + 4
            r1.offset = r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L317:
            int r0 = r1.readInt32Value()
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L321:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r3
            long r4 = r4 + r6
            long r2 = r0.getLong(r2, r4)
            int r0 = r1.offset
            int r0 = r0 + 8
            r1.offset = r0
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L336
            goto L33a
        L336:
            long r2 = java.lang.Long.reverseBytes(r2)
        L33a:
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
        L343:
            long r2 = r1.readInt64Value()
            double r2 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
        L34d:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
        L354:
            r2 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
        L35b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L35e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L361:
            return r7
        L362:
            long r2 = r1.readInt64Value()
            int r0 = r1.readInt32Value()
            long r4 = (long) r0
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r2, r4)
            return r0
        L370:
            int r0 = getInt(r2, r3)
            long r2 = (long) r0
            int r0 = r1.offset
            int r0 = r0 + 4
            r1.offset = r0
            java.util.Date r0 = new java.util.Date
            r4 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 * r4
            r0.<init>(r2)
            return r0
        L385:
            int r0 = getInt(r2, r3)
            long r2 = (long) r0
            int r0 = r1.offset
            int r0 = r0 + 4
            r1.offset = r0
            java.util.Date r0 = new java.util.Date
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            r0.<init>(r2)
            return r0
        L399:
            sun.misc.Unsafe r0 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r3
            long r4 = r4 + r6
            long r2 = r0.getLong(r2, r4)
            int r0 = r1.offset
            int r0 = r0 + 8
            r1.offset = r0
            java.util.Date r0 = new java.util.Date
            boolean r4 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r4 == 0) goto L3b0
            goto L3b4
        L3b0:
            long r2 = java.lang.Long.reverseBytes(r2)
        L3b4:
            r0.<init>(r2)
            return r0
        L3b8:
            java.time.ZonedDateTime r0 = r1.readTimestampWithTimeZone()
            return r0
        L3bd:
            int r4 = r0 + 2
            r1.offset = r4
            r3 = r2[r3]
            int r3 = r3 << 8
            int r5 = r0 + 3
            r1.offset = r5
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r4
            int r4 = r0 + 4
            r1.offset = r4
            r5 = r2[r5]
            int r0 = r0 + 5
            r1.offset = r0
            r0 = r2[r4]
            java.time.LocalDate r0 = java.time.LocalDate.of(r3, r5, r0)
            return r0
        L3df:
            int r4 = r0 + 2
            r1.offset = r4
            r3 = r2[r3]
            int r3 = r3 << 8
            int r5 = r0 + 3
            r1.offset = r5
            r4 = r2[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r3 + r4
            int r3 = r0 + 4
            r1.offset = r3
            r7 = r2[r5]
            int r4 = r0 + 5
            r1.offset = r4
            r8 = r2[r3]
            int r3 = r0 + 6
            r1.offset = r3
            r9 = r2[r4]
            int r4 = r0 + 7
            r1.offset = r4
            r10 = r2[r3]
            int r0 = r0 + 8
            r1.offset = r0
            r11 = r2[r4]
            int r12 = r1.readInt32Value()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r6, r7, r8, r9, r10, r11, r12)
            return r0
        L418:
            int r4 = r0 + 2
            r1.offset = r4
            r3 = r2[r3]
            int r5 = r0 + 3
            r1.offset = r5
            r4 = r2[r4]
            int r0 = r0 + 4
            r1.offset = r0
            r0 = r2[r5]
            int r2 = r1.readInt32Value()
            java.time.LocalTime r0 = java.time.LocalTime.of(r3, r4, r0, r2)
            return r0
        L433:
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r2 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            r15 = r8
            long r8 = r0.mask
            long r2 = r2 & r8
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L444
            r0 = r2
            goto L445
        L444:
            r0 = r13
        L445:
            r3 = r7
        L446:
            byte[] r5 = r1.bytes
            int r8 = r1.offset
            r5 = r5[r8]
            r9 = -91
            if (r5 != r9) goto L46f
            int r8 = r8 + r2
            r1.offset = r8
            if (r3 != 0) goto L46e
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r2 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r4 = r0.mask
            long r2 = r2 & r4
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 == 0) goto L468
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        L468:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            return r0
        L46e:
            return r3
        L46f:
            if (r0 == 0) goto L4ca
            if (r13 != 0) goto L4ca
            if (r5 < r14) goto L4ca
            long r8 = r1.readFieldNameHashCode()
            r17 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r5 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r5 != 0) goto L4c5
            long r8 = r1.readValueHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReaderAutoType(r8)
            if (r0 != 0) goto L4ba
            java.lang.String r0 = r1.getString()
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r3 = r3.getObjectReaderAutoType(r0, r7)
            if (r3 == 0) goto L49c
            r0 = r3
            goto L4ba
        L49c:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r3 = "auotype not support : "
            java.lang.StringBuilder r0 = bc.e.o(r3, r0, r6)
            int r3 = r1.offset
            r0.append(r3)
            r0.append(r4)
            byte[] r3 = r1.bytes
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L4ba:
            r1.typeRedirect = r2
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L4c5:
            java.lang.String r5 = r1.getString()
            goto L4d5
        L4ca:
            if (r5 < r14) goto L4d1
            java.lang.String r5 = r1.readFieldName()
            goto L4d5
        L4d1:
            java.lang.Object r5 = r1.readAny()
        L4d5:
            if (r3 != 0) goto L4fb
            com.alibaba.fastjson2.JSONReader$Context r3 = r1.context
            long r8 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r11 = r2.mask
            long r8 = r8 & r11
            int r2 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r2 == 0) goto L4ea
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            goto L4fb
        L4ea:
            java.util.function.Supplier<java.util.Map> r2 = r3.objectSupplier
            if (r2 == 0) goto L4f6
            java.lang.Object r2 = r2.get()
            r3 = r2
            java.util.Map r3 = (java.util.Map) r3
            goto L4fb
        L4f6:
            com.alibaba.fastjson2.JSONObject r3 = new com.alibaba.fastjson2.JSONObject
            r3.<init>()
        L4fb:
            boolean r2 = r1.isReference()
            if (r2 == 0) goto L51d
            java.lang.String r2 = r1.readReference()
            boolean r8 = r10.equals(r2)
            if (r8 == 0) goto L512
            r3.put(r5, r3)
        L50e:
            r19 = r10
            goto L57f
        L512:
            com.alibaba.fastjson2.JSONPath r2 = com.alibaba.fastjson2.JSONPath.of(r2)
            r1.addResolveTask(r3, r5, r2)
            r3.put(r5, r7)
            goto L50e
        L51d:
            byte[] r2 = r1.bytes
            int r8 = r1.offset
            r2 = r2[r8]
            if (r2 < r14) goto L532
            r9 = 126(0x7e, float:1.77E-43)
            if (r2 > r9) goto L532
            java.lang.String r2 = r1.readString()
            r9 = -16
            r11 = 47
            goto L566
        L532:
            r9 = -16
            r11 = 47
            if (r2 < r9) goto L543
            if (r2 > r11) goto L543
            int r8 = r8 + 1
            r1.offset = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L566
        L543:
            r12 = -79
            if (r2 != r12) goto L54e
            int r8 = r8 + 1
            r1.offset = r8
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L566
        L54e:
            r12 = -80
            if (r2 != r12) goto L559
            int r8 = r8 + 1
            r1.offset = r8
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L566
        L559:
            r8 = -90
            if (r2 != r8) goto L562
            java.util.Map r2 = r1.readObject()
            goto L566
        L562:
            java.lang.Object r2 = r1.readAny()
        L566:
            if (r2 != 0) goto L57a
            com.alibaba.fastjson2.JSONReader$Context r8 = r1.context
            r12 = r10
            long r9 = r8.features
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            r19 = r12
            long r11 = r8.mask
            long r8 = r9 & r11
            int r8 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r8 == 0) goto L57c
            goto L57f
        L57a:
            r19 = r10
        L57c:
            r3.put(r5, r2)
        L57f:
            int r13 = r13 + 1
            r10 = r19
            r2 = 1
            r11 = 47
            r12 = -16
            goto L446
        L58a:
            r15 = r8
            long r21 = r1.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r2 = r0.autoTypeBeforeHandler
            if (r2 == 0) goto L5c4
            r23 = 0
            long r8 = r0.features
            r20 = r2
            r24 = r8
            java.lang.Class r0 = r20.apply(r21, r23, r24)
            r2 = r21
            if (r0 != 0) goto L5b3
            java.lang.String r0 = r1.getString()
            com.alibaba.fastjson2.JSONReader$Context r5 = r1.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r8 = r5.autoTypeBeforeHandler
            long r9 = r5.features
            java.lang.Class r0 = r8.apply(r0, r7, r9)
        L5b3:
            if (r0 == 0) goto L5c6
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReader(r0)
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L5c4:
            r2 = r21
        L5c6:
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r8 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r10 = r5.mask
            long r8 = r8 & r10
            int r5 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r5 == 0) goto L60e
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReaderAutoType(r2)
            if (r0 != 0) goto L605
            java.lang.String r0 = r1.getString()
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReaderAutoType(r0, r7)
            if (r2 == 0) goto L5e7
            r0 = r2
            goto L605
        L5e7:
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r3 = "autoType not support : "
            java.lang.StringBuilder r0 = bc.e.o(r3, r0, r6)
            int r3 = r1.offset
            r0.append(r3)
            r0.append(r4)
            byte[] r3 = r1.bytes
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L605:
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L60e:
            boolean r0 = r1.isObject()
            if (r0 == 0) goto L619
            java.util.Map r0 = r1.readObject()
            return r0
        L619:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L624
            java.util.List r0 = r1.readArray()
            return r0
        L624:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            int r2 = r1.offset
            byte[] r3 = r1.bytes
            int r3 = r3.length
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "autoType not support , offset "
            r5.<init>(r6)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2)
            throw r0
        L643:
            int r0 = r1.readLength()
            byte[] r2 = r1.bytes
            int r3 = r1.offset
            int r4 = r3 + r0
            byte[] r2 = java.util.Arrays.copyOfRange(r2, r3, r4)
            int r3 = r1.offset
            int r3 = r3 + r0
            r1.offset = r3
            return r2
        L657:
            int r0 = r1.readInt32Value()
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L661:
            int r0 = getInt(r2, r3)
            int r2 = r1.offset
            int r2 = r2 + 4
            r1.offset = r2
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            return r2
        L671:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            int r2 = r1.offset
            byte[] r3 = r1.bytes
            int r3 = r3.length
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "readAny overflow : "
            r5.<init>(r6)
            r5.append(r2)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.List readArray() {
            r15 = this;
            int r0 = r15.startArray()
            com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto L187
            byte[] r4 = r15.bytes
            int r5 = r15.offset
            r6 = r4[r5]
            r7 = 126(0x7e, float:1.77E-43)
            r8 = 73
            if (r6 < r8) goto L21
            if (r6 > r7) goto L21
            java.lang.String r4 = r15.readString()
            goto L180
        L21:
            r9 = -16
            if (r6 < r9) goto L33
            r9 = 47
            if (r6 > r9) goto L33
            int r5 = r5 + 1
            r15.offset = r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            goto L180
        L33:
            r9 = -79
            if (r6 != r9) goto L3f
            int r5 = r5 + 1
            r15.offset = r5
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L180
        L3f:
            r9 = -80
            if (r6 != r9) goto L4b
            int r5 = r5 + 1
            r15.offset = r5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            goto L180
        L4b:
            r9 = -90
            if (r6 != r9) goto L55
            java.util.Map r4 = r15.readObject()
            goto L180
        L55:
            r10 = -66
            if (r6 != r10) goto L7c
            int r5 = r5 + 1
            r15.offset = r5
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r7 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r9 = (long) r5
            long r7 = r7 + r9
            long r4 = r6.getLong(r4, r7)
            int r6 = r15.offset
            int r6 = r6 + 8
            r15.offset = r6
            boolean r6 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r6 == 0) goto L72
            goto L76
        L72:
            long r4 = java.lang.Long.reverseBytes(r4)
        L76:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L180
        L7c:
            java.lang.String r10 = ".."
            r11 = -108(0xffffffffffffff94, float:NaN)
            if (r6 < r11) goto L115
            r11 = -92
            if (r6 > r11) goto L115
            int r5 = r5 + 1
            r15.offset = r5
            if (r6 != r11) goto L91
            int r4 = r15.readLength()
            goto L93
        L91:
            int r4 = r6 + 108
        L93:
            com.alibaba.fastjson2.JSONReader$Context r5 = r15.context
            r11 = 0
            if (r4 != 0) goto Lbc
            long r6 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r8 = r4.mask
            long r6 = r6 & r8
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 == 0) goto Lab
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L180
        Lab:
            java.util.function.Supplier<java.util.List> r4 = r5.arraySupplier
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r4.get()
            goto L180
        Lb5:
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray
            r4.<init>()
            goto L180
        Lbc:
            long r5 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r13 = r13.mask
            long r5 = r5 & r13
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto Lcd
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            goto Ld2
        Lcd:
            com.alibaba.fastjson2.JSONArray r5 = new com.alibaba.fastjson2.JSONArray
            r5.<init>(r4)
        Ld2:
            r6 = r2
        Ld3:
            if (r6 >= r4) goto L14c
            boolean r11 = r15.isReference()
            if (r11 == 0) goto Lf5
            java.lang.String r11 = r15.readReference()
            boolean r12 = r10.equals(r11)
            if (r12 == 0) goto Le9
            r5.add(r5)
            goto L112
        Le9:
            r12 = 0
            r5.add(r12)
            com.alibaba.fastjson2.JSONPath r11 = com.alibaba.fastjson2.JSONPath.of(r11)
            r15.addResolveTask(r5, r6, r11)
            goto L112
        Lf5:
            byte[] r11 = r15.bytes
            int r12 = r15.offset
            r11 = r11[r12]
            if (r11 < r8) goto L104
            if (r11 > r7) goto L104
            java.lang.String r11 = r15.readString()
            goto L10f
        L104:
            if (r11 != r9) goto L10b
            java.util.Map r11 = r15.readObject()
            goto L10f
        L10b:
            java.lang.Object r11 = r15.readAny()
        L10f:
            r5.add(r11)
        L112:
            int r6 = r6 + 1
            goto Ld3
        L115:
            r7 = 48
            if (r6 < r7) goto L133
            r7 = 63
            if (r6 > r7) goto L133
            int r6 = r6 + (-56)
            int r6 = r6 << 8
            int r5 = r5 + 1
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r6 + r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            int r5 = r15.offset
            int r5 = r5 + 2
            r15.offset = r5
            goto L180
        L133:
            r7 = 64
            if (r6 < r7) goto L14e
            r7 = 71
            if (r6 > r7) goto L14e
            int r5 = r5 + 1
            int r4 = getInt3(r4, r5, r6)
            int r5 = r15.offset
            int r5 = r5 + 3
            r15.offset = r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
        L14c:
            r4 = r5
            goto L180
        L14e:
            r7 = 72
            if (r6 != r7) goto L164
            int r5 = r5 + 1
            int r4 = getInt(r4, r5)
            int r5 = r15.offset
            int r5 = r5 + 5
            r15.offset = r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            goto L14c
        L164:
            r4 = -109(0xffffffffffffff93, float:NaN)
            if (r6 != r4) goto L17c
            java.lang.String r4 = r15.readReference()
            boolean r5 = r10.equals(r4)
            if (r5 == 0) goto L174
            r4 = r1
            goto L180
        L174:
            com.alibaba.fastjson2.JSONPath r4 = com.alibaba.fastjson2.JSONPath.of(r4)
            r15.addResolveTask(r1, r3, r4)
            goto L183
        L17c:
            java.lang.Object r4 = r15.readAny()
        L180:
            r1.add(r4)
        L183:
            int r3 = r3 + 1
            goto Lb
        L187:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.List readArray(java.lang.reflect.Type r5) {
            r4 = this;
            boolean r0 = r4.nextIfNull()
            if (r0 == 0) goto L8
            r5 = 0
            return r5
        L8:
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r0 = r0[r1]
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r1) goto L34
            java.lang.Object r5 = r4.readAny()
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L1d
            java.util.List r5 = (java.util.List) r5
            return r5
        L1d:
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L29
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            java.util.Collection r5 = (java.util.Collection) r5
            r0.<init>(r5)
            return r0
        L29:
            java.lang.String r0 = "not support class "
            java.lang.Class r5 = r5.getClass()
            ah.a.i(r5, r0)
            r5 = 0
            return r5
        L34:
            int r0 = r4.startArray()
            com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
            r1.<init>(r0)
            r2 = 0
        L3e:
            if (r2 >= r0) goto L4a
            java.lang.Object r3 = r4.read(r5)
            r1.add(r3)
            int r2 = r2 + 1
            goto L3e
        L4a:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readArray(java.util.Collection r4, java.lang.reflect.Type r5) {
            r3 = this;
            int r0 = r3.startArray()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            java.lang.Object r2 = r3.read(r5)
            r4.add(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.math.BigDecimal readBigDecimal() {
            r8 = this;
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            int r2 = r1 + 1
            r8.offset = r2
            r1 = r0[r1]
            r2 = -71
            if (r1 != r2) goto L74
            int r1 = r8.readInt32Value()
            int r2 = r8.offset
            r3 = r0[r2]
            r4 = -70
            if (r3 != r4) goto L27
            int r2 = r2 + 1
            r8.offset = r2
            long r2 = r8.readInt64Value()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2, r1)
            return r0
        L27:
            r4 = 72
            if (r3 != r4) goto L3d
            int r2 = r2 + 1
            int r0 = getInt(r0, r2)
            long r2 = (long) r0
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2, r1)
            int r1 = r8.offset
            int r1 = r1 + 5
            r8.offset = r1
            return r0
        L3d:
            r4 = -66
            if (r3 != r4) goto L62
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            r6 = 1
            long r4 = r4 + r6
            long r2 = r3.getLong(r0, r4)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 == 0) goto L53
            goto L57
        L53:
            long r2 = java.lang.Long.reverseBytes(r2)
        L57:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2, r1)
            int r1 = r8.offset
            int r1 = r1 + 9
            r8.offset = r1
            return r0
        L62:
            java.math.BigInteger r0 = r8.readBigInteger()
            if (r1 != 0) goto L6e
            java.math.BigDecimal r1 = new java.math.BigDecimal
            r1.<init>(r0)
            return r1
        L6e:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r1)
            return r2
        L74:
            r0 = -72
            if (r1 != r0) goto L81
            long r0 = r8.readInt64Value()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            return r0
        L81:
            java.math.BigDecimal r0 = r8.readDecimal0(r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.math.BigInteger readBigInteger() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r0 = r0[r1]
            r1 = -70
            if (r0 != r1) goto L17
            long r0 = r5.readInt64Value()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L17:
            r1 = -69
            if (r0 != r1) goto L34
            int r0 = r5.readInt32Value()
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.bytes
            int r3 = r5.offset
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            int r2 = r5.offset
            int r2 = r2 + r0
            r5.offset = r2
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
        L34:
            java.math.BigInteger r0 = r5.readBigInteger0(r0)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readBinary() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r0 = r0[r1]
            r1 = -111(0xffffffffffffff91, float:NaN)
            if (r0 != r1) goto L22
            int r0 = r5.readLength()
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.bytes
            int r3 = r5.offset
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            int r2 = r5.offset
            int r2 = r2 + r0
            r5.offset = r2
            return r1
        L22:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r0)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.Boolean readBool() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            int r2 = r1 + 1
            r3.offset = r2
            r0 = r0[r1]
            r1 = -81
            if (r0 != r1) goto L10
            r0 = 0
            return r0
        L10:
            r1 = -79
            if (r0 != r1) goto L17
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L17:
            r1 = -80
            if (r0 != r1) goto L1e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L1e:
            boolean r0 = r3.readBoolValue0(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readBoolValue() {
            r4 = this;
            r0 = 0
            r4.wasNull = r0
            byte[] r1 = r4.bytes
            int r2 = r4.offset
            int r3 = r2 + 1
            r4.offset = r3
            r1 = r1[r2]
            r2 = -79
            if (r1 != r2) goto L13
            r0 = 1
            return r0
        L13:
            r2 = -80
            if (r1 != r2) goto L18
            return r0
        L18:
            boolean r0 = r4.readBoolValue0(r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public char readCharValue() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            r2 = r0[r1]
            r3 = -112(0xffffffffffffff90, float:NaN)
            if (r2 != r3) goto L14
            int r1 = r1 + 1
            r5.offset = r1
            int r0 = r5.readInt32Value()
        L12:
            char r0 = (char) r0
            return r0
        L14:
            r3 = 73
            r4 = 0
            if (r2 != r3) goto L1e
            int r1 = r1 + 1
            r5.offset = r1
            return r4
        L1e:
            if (r2 <= r3) goto L2f
            r3 = 120(0x78, float:1.68E-43)
            if (r2 >= r3) goto L2f
            int r2 = r1 + 1
            int r1 = r1 + 2
            r5.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L12
        L2f:
            java.lang.String r0 = r5.readString()
            if (r0 == 0) goto L41
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3c
            goto L41
        L3c:
            char r0 = r0.charAt(r4)
            return r0
        L41:
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.Date readDate() {
            r9 = this;
            int r0 = r9.offset
            byte[] r1 = r9.bytes
            r2 = r1[r0]
            r3 = 1
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 1
            r8 = 0
            switch(r2) {
                case -89: goto L9b;
                case -88: goto L8c;
                case -87: goto L77;
                case -86: goto L6f;
                case -85: goto L4f;
                case -84: goto L3c;
                case -83: goto L26;
                case -82: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Lb3
        L11:
            int r0 = r0 + r7
            r9.offset = r0
            long r0 = r9.readInt64Value()
            int r2 = r9.readInt32Value()
            long r2 = (long) r2
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0, r2)
            java.util.Date r0 = java.util.Date.from(r0)
            return r0
        L26:
            int r0 = r0 + r7
            int r0 = getInt(r1, r0)
            long r0 = (long) r0
            int r2 = r9.offset
            int r2 = r2 + 5
            r9.offset = r2
            java.util.Date r2 = new java.util.Date
            r3 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 * r3
            r2.<init>(r0)
            return r2
        L3c:
            int r0 = r0 + r7
            int r0 = getInt(r1, r0)
            long r0 = (long) r0
            int r2 = r9.offset
            int r2 = r2 + 5
            r9.offset = r2
            java.util.Date r2 = new java.util.Date
            long r0 = r0 * r5
            r2.<init>(r0)
            return r2
        L4f:
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r5 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r7 = (long) r0
            long r5 = r5 + r7
            long r5 = r5 + r3
            long r0 = r2.getLong(r1, r5)
            int r2 = r9.offset
            int r2 = r2 + 9
            r9.offset = r2
            java.util.Date r2 = new java.util.Date
            boolean r3 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r3 == 0) goto L67
            goto L6b
        L67:
            long r0 = java.lang.Long.reverseBytes(r0)
        L6b:
            r2.<init>(r0)
            return r2
        L6f:
            int r0 = r0 + r7
            r9.offset = r0
            java.time.ZonedDateTime r8 = r9.readTimestampWithTimeZone()
            goto Lb3
        L77:
            java.time.LocalDate r0 = r9.readLocalDate()
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            com.alibaba.fastjson2.JSONReader$Context r1 = r9.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r8 = java.time.ZonedDateTime.ofLocal(r0, r1, r8)
            goto Lb3
        L8c:
            java.time.LocalDateTime r0 = r9.readLocalDateTime()
            com.alibaba.fastjson2.JSONReader$Context r1 = r9.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r8 = java.time.ZonedDateTime.ofLocal(r0, r1, r8)
            goto Lb3
        L9b:
            java.time.LocalTime r0 = r9.readLocalTime()
            r1 = 1970(0x7b2, float:2.76E-42)
            java.time.LocalDate r1 = java.time.LocalDate.of(r1, r7, r7)
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r1, r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r9.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r8 = java.time.ZonedDateTime.ofLocal(r0, r1, r8)
        Lb3:
            if (r8 == 0) goto Ldd
            long r0 = r8.toEpochSecond()
            java.time.LocalTime r2 = r8.toLocalTime()
            int r2 = r2.getNano()
            r7 = 0
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r8 = 1000000(0xf4240, float:1.401298E-39)
            if (r7 >= 0) goto Ld4
            if (r2 <= 0) goto Ld4
            long r0 = r0 + r3
            long r0 = r0 * r5
            int r2 = r2 / r8
            int r2 = r2 + (-1000)
        Ld1:
            long r2 = (long) r2
            long r0 = r0 + r2
            goto Ld7
        Ld4:
            long r0 = r0 * r5
            int r2 = r2 / r8
            goto Ld1
        Ld7:
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
        Ldd:
            java.util.Date r0 = super.readDate()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public double readDoubleValue() {
            r9 = this;
            byte[] r0 = r9.bytes
            int r1 = r9.offset
            r2 = r0[r1]
            r3 = -75
            if (r2 != r3) goto L60
            int r2 = r1 + 8
            r2 = r0[r2]
            long r2 = (long) r2
            r4 = 255(0xff, double:1.26E-321)
            long r2 = r2 & r4
            int r6 = r1 + 7
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 8
            long r6 = r6 << r8
            long r2 = r2 + r6
            int r6 = r1 + 6
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 16
            long r6 = r6 << r8
            long r2 = r2 + r6
            int r6 = r1 + 5
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 24
            long r6 = r6 << r8
            long r2 = r2 + r6
            int r6 = r1 + 4
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 32
            long r6 = r6 << r8
            long r2 = r2 + r6
            int r6 = r1 + 3
            r6 = r0[r6]
            long r6 = (long) r6
            long r6 = r6 & r4
            r8 = 40
            long r6 = r6 << r8
            long r2 = r2 + r6
            int r6 = r1 + 2
            r6 = r0[r6]
            long r6 = (long) r6
            long r4 = r4 & r6
            r6 = 48
            long r4 = r4 << r6
            long r2 = r2 + r4
            int r4 = r1 + 1
            r0 = r0[r4]
            long r4 = (long) r0
            r0 = 56
            long r4 = r4 << r0
            long r2 = r2 + r4
            int r1 = r1 + 9
            r9.offset = r1
            double r0 = java.lang.Double.longBitsToDouble(r2)
            return r0
        L60:
            double r0 = r9.readDoubleValue0()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readFieldName() {
            r24 = this;
            r0 = r24
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            r3 = r1[r2]
            r0.strtype = r3
            r4 = -81
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L14
            int r2 = r2 + r6
            r0.offset = r2
            return r5
        L14:
            int r4 = r2 + 1
            r0.offset = r4
            r7 = 127(0x7f, float:1.78E-43)
            if (r3 != r7) goto L1e
            r3 = r6
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r7 = 32
            r8 = 8
            if (r3 == 0) goto L6d
            r4 = r1[r4]
            r0.strtype = r4
            r9 = -16
            if (r4 < r9) goto L69
            r9 = 72
            if (r4 > r9) goto L69
            int r1 = r0.readInt32Value()
            if (r1 >= 0) goto L3f
            com.alibaba.fastjson2.SymbolTable r2 = r0.symbolTable
            int r1 = -r1
            java.lang.String r1 = r2.getName(r1)
            return r1
        L3f:
            if (r1 != 0) goto L52
            byte r1 = r0.symbol0StrType
            r0.strtype = r1
            int r1 = r0.symbol0Length
            r0.strlen = r1
            int r1 = r0.symbol0Begin
            r0.strBegin = r1
            java.lang.String r1 = r0.getString()
            return r1
        L52:
            int r1 = r1 * 2
            int r1 = r1 + r6
            long[] r2 = r0.symbols
            r1 = r2[r1]
            int r3 = (int) r1
            byte r4 = (byte) r3
            r0.strtype = r4
            int r3 = r3 >> r8
            r0.strlen = r3
            long r1 = r1 >> r7
            int r1 = (int) r1
            r0.strBegin = r1
            java.lang.String r1 = r0.getString()
            return r1
        L69:
            int r2 = r2 + 2
            r0.offset = r2
        L6d:
            int r2 = r0.offset
            r0.strBegin = r2
            byte r4 = r0.strtype
            r9 = 73
            r10 = 56
            r11 = 48
            if (r4 < r9) goto L7e1
            r9 = 121(0x79, float:1.7E-43)
            if (r4 > r9) goto L7e1
            r9 = 121(0x79, float:1.7E-43)
            if (r4 != r9) goto L95
            int r2 = r0.readLength()
            r0.strlen = r2
            int r2 = r0.offset
            r0.strBegin = r2
        L8d:
            r18 = r8
            r21 = 16
            r22 = -1
            goto L2c7
        L95:
            int r4 = r4 + (-73)
            r0.strlen = r4
            boolean r9 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            r15 = 40
            r16 = 255(0xff, double:1.26E-321)
            if (r9 == 0) goto L2be
            switch(r4) {
                case 1: goto L2b1;
                case 2: goto L29f;
                case 3: goto L282;
                case 4: goto L26f;
                case 5: goto L253;
                case 6: goto L22e;
                case 7: goto L1fc;
                case 8: goto L1e7;
                case 9: goto L1cf;
                case 10: goto L1b2;
                case 11: goto L186;
                case 12: goto L166;
                case 13: goto L13b;
                case 14: goto L107;
                case 15: goto Lc6;
                case 16: goto La5;
                default: goto La4;
            }
        La4:
            goto L8d
        La5:
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r9 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            r18 = r8
            r15 = r9
            long r8 = (long) r2
            long r9 = r15 + r8
            long r8 = r4.getLong(r1, r9)
            int r2 = r0.offset
            long r10 = (long) r2
            long r10 = r10 + r15
            r15 = 8
            long r10 = r10 + r15
            long r10 = r4.getLong(r1, r10)
            r12 = r8
            r14 = r10
            r21 = 16
            r22 = -1
            goto L769
        Lc6:
            r18 = r8
            int r4 = r2 + 6
            r4 = r1[r4]
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = (long) r4
            long r8 = r9 << r11
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r15
            long r8 = r8 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            r21 = 16
            r22 = -1
            long r12 = (long) r2
            long r12 = r12 + r10
            int r2 = r4.getInt(r1, r12)
            long r12 = (long) r2
            long r12 = r12 & r19
            long r8 = r8 + r12
            int r2 = r0.offset
            long r12 = (long) r2
            long r10 = r10 + r12
            r12 = 7
            long r10 = r10 + r12
            long r10 = r4.getLong(r1, r10)
        L103:
            r12 = r8
            r14 = r10
            goto L769
        L107:
            r18 = r8
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = 16
            r22 = -1
            int r4 = r2 + 5
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r15
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r12 = r12 + r10
            int r2 = r4.getInt(r1, r12)
            long r12 = (long) r2
            long r12 = r12 & r19
            long r8 = r8 + r12
            int r2 = r0.offset
            long r12 = (long) r2
            long r10 = r10 + r12
            r12 = 6
            long r10 = r10 + r12
            long r10 = r4.getLong(r1, r10)
            goto L103
        L13b:
            r18 = r8
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = 16
            r22 = -1
            int r4 = r2 + 4
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r7
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r12 = r12 + r10
            int r2 = r4.getInt(r1, r12)
            long r12 = (long) r2
            long r12 = r12 & r19
            long r8 = r8 + r12
            int r2 = r0.offset
            long r12 = (long) r2
            long r10 = r10 + r12
            r12 = 5
            long r10 = r10 + r12
            long r10 = r4.getLong(r1, r10)
            goto L103
        L166:
            r18 = r8
            r21 = 16
            r22 = -1
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r10 = (long) r2
            long r10 = r10 + r8
            int r2 = r4.getInt(r1, r10)
            long r10 = (long) r2
            int r2 = r0.offset
            long r12 = (long) r2
            long r8 = r8 + r12
            r12 = 4
            long r8 = r8 + r12
            long r8 = r4.getLong(r1, r8)
        L182:
            r14 = r8
            r12 = r10
            goto L769
        L186:
            r18 = r8
            r21 = 16
            r22 = -1
            r4 = r1[r2]
            int r4 = r4 << 16
            long r8 = (long) r4
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r8 = r8 + r10
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r10 = r10 + r12
            r12 = 3
            long r10 = r10 + r12
            long r10 = r4.getLong(r1, r10)
            goto L103
        L1b2:
            r18 = r8
            r21 = 16
            r22 = -1
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r10 = (long) r2
            long r10 = r10 + r8
            short r2 = r4.getShort(r1, r10)
            long r10 = (long) r2
            int r2 = r0.offset
            long r12 = (long) r2
            long r8 = r8 + r12
            r12 = 2
            long r8 = r8 + r12
            long r8 = r4.getLong(r1, r8)
            goto L182
        L1cf:
            r18 = r8
            r21 = 16
            r22 = -1
            r4 = r1[r2]
            long r8 = (long) r4
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r10 = r10 + r12
            r12 = 1
            long r10 = r10 + r12
            long r10 = r4.getLong(r1, r10)
            goto L103
        L1e7:
            r18 = r8
            r21 = 16
            r22 = -1
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r10 = (long) r2
            long r8 = r8 + r10
            long r8 = r4.getLong(r1, r8)
        L1f7:
            r12 = r8
            r14 = r22
            goto L769
        L1fc:
            r18 = r8
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = 16
            r22 = -1
            int r4 = r2 + 6
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r11
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r15
            long r8 = r8 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r10 = r10 + r12
            int r2 = r4.getInt(r1, r10)
        L229:
            long r10 = (long) r2
            long r10 = r10 & r19
        L22c:
            long r8 = r8 + r10
            goto L1f7
        L22e:
            r18 = r8
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = 16
            r22 = -1
            int r4 = r2 + 5
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r15
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r10 = r10 + r12
            int r2 = r4.getInt(r1, r10)
            goto L229
        L253:
            r18 = r8
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r21 = 16
            r22 = -1
            int r4 = r2 + 4
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r7
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r2
            long r10 = r10 + r12
            int r2 = r4.getInt(r1, r10)
            goto L229
        L26f:
            r18 = r8
            r21 = 16
            r22 = -1
            sun.misc.Unsafe r4 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r8 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r10 = (long) r2
            long r8 = r8 + r10
            int r2 = r4.getInt(r1, r8)
            long r8 = (long) r2
            goto L1f7
        L282:
            r18 = r8
            r21 = 16
            r22 = -1
            int r4 = r2 + 2
            r4 = r1[r4]
            int r4 = r4 << 16
            long r8 = (long) r4
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
        L29b:
            long r10 = (long) r2
            long r10 = r10 & r16
            goto L22c
        L29f:
            r18 = r8
            r21 = 16
            r22 = -1
            int r4 = r2 + 1
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r18
            r2 = r1[r2]
            goto L29b
        L2b1:
            r18 = r8
            r21 = 16
            r22 = -1
            r2 = r1[r2]
            long r8 = (long) r2
            long r8 = r8 & r16
            goto L1f7
        L2be:
            r18 = r8
            r21 = 16
            r22 = -1
            switch(r4) {
                case 3: goto L754;
                case 4: goto L733;
                case 5: goto L709;
                case 6: goto L6d3;
                case 7: goto L694;
                case 8: goto L64b;
                case 9: goto L601;
                case 10: goto L5a9;
                case 11: goto L547;
                case 12: goto L4db;
                case 13: goto L466;
                case 14: goto L3e7;
                case 15: goto L35f;
                case 16: goto L2cc;
                default: goto L2c7;
            }
        L2c7:
            r12 = r22
            r14 = r12
            goto L769
        L2cc:
            int r4 = r2 + 7
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 6
            r4 = r1[r4]
            int r4 = r4 << r11
            r14 = 24
            long r8 = (long) r4
            long r12 = r12 + r8
            int r4 = r2 + 5
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r15
            long r12 = r12 + r8
            int r4 = r2 + 4
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r7
            long r12 = r12 + r8
            int r4 = r2 + 3
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r14
            long r12 = r12 + r8
            int r4 = r2 + 2
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r21
            long r12 = r12 + r8
            int r4 = r2 + 1
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 << r18
            long r12 = r12 + r8
            r4 = r1[r2]
            long r8 = (long) r4
            long r8 = r8 & r16
            long r8 = r8 + r12
            int r4 = r2 + 15
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 14
            r4 = r1[r4]
            r20 = r14
            r19 = r15
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 13
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 12
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 11
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 10
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 8
            r2 = r1[r2]
        L359:
            long r10 = (long) r2
            long r10 = r10 & r16
            long r10 = r10 + r12
            goto L103
        L35f:
            r19 = r15
            r20 = 24
            int r4 = r2 + 6
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r11
            int r4 = r2 + 5
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r19
            long r8 = r8 + r12
            int r4 = r2 + 4
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r7
            long r8 = r8 + r12
            int r4 = r2 + 3
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r20
            long r8 = r8 + r12
            int r4 = r2 + 2
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r21
            long r8 = r8 + r12
            int r4 = r2 + 1
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r18
            long r8 = r8 + r12
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 14
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 13
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 12
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 11
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 10
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 7
            r2 = r1[r2]
            goto L359
        L3e7:
            r19 = r15
            r20 = 24
            int r4 = r2 + 5
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r19
            int r4 = r2 + 4
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r7
            long r8 = r8 + r12
            int r4 = r2 + 3
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r20
            long r8 = r8 + r12
            int r4 = r2 + 2
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r21
            long r8 = r8 + r12
            int r4 = r2 + 1
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r18
            long r8 = r8 + r12
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 13
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 12
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 11
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 10
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 7
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 6
            r2 = r1[r2]
            goto L359
        L466:
            r19 = r15
            r20 = 24
            int r4 = r2 + 4
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r7
            int r4 = r2 + 3
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r20
            long r8 = r8 + r12
            int r4 = r2 + 2
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r21
            long r8 = r8 + r12
            int r4 = r2 + 1
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r18
            long r8 = r8 + r12
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 12
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 11
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 10
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 7
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 5
            r2 = r1[r2]
            goto L359
        L4db:
            r19 = r15
            r20 = 24
            int r4 = r2 + 3
            r4 = r1[r4]
            int r4 = r4 << 24
            long r8 = (long) r4
            int r4 = r2 + 2
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r21
            long r8 = r8 + r12
            int r4 = r2 + 1
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r18
            long r8 = r8 + r12
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 11
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 10
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 7
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 4
            r2 = r1[r2]
            goto L359
        L547:
            r19 = r15
            r20 = 24
            int r4 = r2 + 2
            r4 = r1[r4]
            int r4 = r4 << 16
            long r8 = (long) r4
            int r4 = r2 + 1
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r12 = r12 << r18
            long r8 = r8 + r12
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 10
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 9
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 7
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 3
            r2 = r1[r2]
            goto L359
        L5a9:
            r19 = r15
            r20 = 24
            int r4 = r2 + 1
            r4 = r1[r4]
            int r4 = r4 << 8
            long r8 = (long) r4
            r4 = r1[r2]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r8 = r8 + r12
            int r4 = r2 + 9
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 8
            r4 = r1[r4]
            long r14 = (long) r4
            long r14 = r14 & r16
            long r10 = r14 << r11
            long r12 = r12 + r10
            int r4 = r2 + 7
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L359
        L601:
            r19 = r15
            r20 = 24
            r4 = r1[r2]
            long r8 = (long) r4
            int r4 = r2 + 8
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 << r10
            int r4 = r2 + 7
            r4 = r1[r4]
            int r4 = r4 << r11
            long r10 = (long) r4
            long r12 = r12 + r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r12 = r12 + r10
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r12 = r12 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r12 = r12 + r10
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r12 = r12 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r12 = r12 + r10
            int r2 = r2 + r6
            r2 = r1[r2]
            goto L359
        L64b:
            r19 = r15
            r20 = 24
            int r4 = r2 + 7
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r10
            int r4 = r2 + 6
            r4 = r1[r4]
            long r12 = (long) r4
            long r12 = r12 & r16
            long r10 = r12 << r11
            long r8 = r8 + r10
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r8 = r8 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L694:
            r19 = r15
            r20 = 24
            int r4 = r2 + 6
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r11
            int r4 = r2 + 5
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r19
            long r8 = r8 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L6d3:
            r19 = r15
            r20 = 24
            int r4 = r2 + 5
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r19
            int r4 = r2 + 4
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r7
            long r8 = r8 + r10
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L709:
            r20 = 24
            int r4 = r2 + 4
            r4 = r1[r4]
            long r8 = (long) r4
            long r8 = r8 << r7
            int r4 = r2 + 3
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r20
            long r8 = r8 + r10
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L733:
            r20 = 24
            int r4 = r2 + 3
            r4 = r1[r4]
            int r4 = r4 << 24
            long r8 = (long) r4
            int r4 = r2 + 2
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r21
            long r8 = r8 + r10
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L754:
            int r4 = r2 + 2
            r4 = r1[r4]
            int r4 = r4 << 16
            long r8 = (long) r4
            int r4 = r2 + 1
            r4 = r1[r4]
            long r10 = (long) r4
            long r10 = r10 & r16
            long r10 = r10 << r18
            long r8 = r8 + r10
            r2 = r1[r2]
            goto L29b
        L769:
            int r2 = r0.offset
            int r4 = r0.strlen
            int r8 = r2 + r4
            int r8 = r8 - r6
            r8 = r1[r8]
            if (r8 <= 0) goto L7dc
            int r8 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r8 == 0) goto L7dc
            int r8 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r8 == 0) goto L7b0
            long r8 = r12 ^ r14
            long r10 = r8 >>> r7
            long r8 = r8 ^ r10
            int r8 = (int) r8
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r9 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE2
            int r10 = r9.length
            int r10 = r10 - r6
            r8 = r8 & r10
            r10 = r9[r8]
            if (r10 != 0) goto L79e
            java.lang.String r11 = r0.getLatin1String(r2, r4)
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2 r10 = new com.alibaba.fastjson2.JSONFactory$NameCacheEntry2
            r10.<init>(r11, r12, r14)
            r9[r8] = r10
            int r2 = r0.offset
            int r4 = r0.strlen
            int r2 = r2 + r4
            r0.offset = r2
            goto L7dd
        L79e:
            long r8 = r10.value0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L7dc
            long r8 = r10.value1
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 != 0) goto L7dc
            int r2 = r2 + r4
            r0.offset = r2
            java.lang.String r11 = r10.name
            goto L7dd
        L7b0:
            long r8 = r12 >>> r7
            long r8 = r8 ^ r12
            int r8 = (int) r8
            com.alibaba.fastjson2.util.NameCacheEntry[] r9 = com.alibaba.fastjson2.JSONFactory.NAME_CACHE
            int r10 = r9.length
            int r10 = r10 - r6
            r8 = r8 & r10
            r10 = r9[r8]
            if (r10 != 0) goto L7d0
            java.lang.String r11 = r0.getLatin1String(r2, r4)
            com.alibaba.fastjson2.util.NameCacheEntry r2 = new com.alibaba.fastjson2.util.NameCacheEntry
            r2.<init>(r11, r12)
            r9[r8] = r2
            int r2 = r0.offset
            int r4 = r0.strlen
            int r2 = r2 + r4
            r0.offset = r2
            goto L7dd
        L7d0:
            long r8 = r10.value
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L7dc
            int r2 = r2 + r4
            r0.offset = r2
            java.lang.String r11 = r10.name
            goto L7dd
        L7dc:
            r11 = r5
        L7dd:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            goto L883
        L7e1:
            r18 = r8
            r21 = 16
            r8 = 122(0x7a, float:1.71E-43)
            if (r4 != r8) goto L834
            r4 = r1[r2]
            r8 = -16
            if (r4 < r8) goto L7f9
            r8 = 47
            if (r4 > r8) goto L7f9
            r0.strlen = r4
            int r2 = r2 + r6
            r0.offset = r2
            goto L82c
        L7f9:
            if (r4 < r11) goto L810
            r8 = 63
            if (r4 > r8) goto L810
            int r4 = r4 - r10
            int r4 = r4 << 8
            int r8 = r2 + 1
            r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r8
            r0.strlen = r4
            int r2 = r2 + 2
            r0.offset = r2
            goto L82c
        L810:
            r8 = 64
            if (r4 < r8) goto L826
            r8 = 71
            if (r4 > r8) goto L826
            int r2 = r2 + r6
            int r2 = getInt3(r1, r2, r4)
            r0.strlen = r2
            int r2 = r0.offset
            int r2 = r2 + 3
            r0.offset = r2
            goto L82c
        L826:
            int r2 = r0.readLength()
            r0.strlen = r2
        L82c:
            int r2 = r0.offset
            r0.strBegin = r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
        L832:
            r11 = r5
            goto L883
        L834:
            r2 = 123(0x7b, float:1.72E-43)
            if (r4 != r2) goto L845
            int r2 = r0.readLength()
            r0.strlen = r2
            int r2 = r0.offset
            r0.strBegin = r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            goto L832
        L845:
            r2 = 124(0x7c, float:1.74E-43)
            if (r4 != r2) goto L856
            int r2 = r0.readLength()
            r0.strlen = r2
            int r2 = r0.offset
            r0.strBegin = r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            goto L832
        L856:
            r2 = 125(0x7d, float:1.75E-43)
            if (r4 != r2) goto L867
            int r2 = r0.readLength()
            r0.strlen = r2
            int r2 = r0.offset
            r0.strBegin = r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            goto L832
        L867:
            r2 = 126(0x7e, float:1.77E-43)
            if (r4 != r2) goto L880
            int r2 = r0.readLength()
            r0.strlen = r2
            java.nio.charset.Charset r2 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            if (r2 != 0) goto L87d
            java.lang.String r2 = "GB18030"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            com.alibaba.fastjson2.JSONReaderJSONB.GB18030 = r2
        L87d:
            java.nio.charset.Charset r2 = com.alibaba.fastjson2.JSONReaderJSONB.GB18030
            goto L832
        L880:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            goto L832
        L883:
            int r4 = r0.strlen
            if (r4 >= 0) goto L88e
            com.alibaba.fastjson2.SymbolTable r8 = r0.symbolTable
            int r4 = -r4
            java.lang.String r11 = r8.getName(r4)
        L88e:
            if (r11 != 0) goto L8de
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r2 != r4) goto L8cb
            int r4 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r8 = 34
            if (r4 >= r8) goto L8cb
            char[] r4 = r0.charBuf
            int r8 = r0.strlen
            if (r4 != 0) goto L8ac
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r4 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r9 = r0.cacheItem
            java.lang.Object r4 = r4.getAndSet(r9, r5)
            char[] r4 = (char[]) r4
            r0.charBuf = r4
        L8ac:
            if (r4 == 0) goto L8b1
            int r5 = r4.length
            if (r5 >= r8) goto L8b5
        L8b1:
            char[] r4 = new char[r8]
            r0.charBuf = r4
        L8b5:
            r5 = 0
        L8b6:
            if (r5 >= r8) goto L8c5
            int r9 = r0.offset
            int r9 = r9 + r5
            r9 = r1[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            char r9 = (char) r9
            r4[r5] = r9
            int r5 = r5 + 1
            goto L8b6
        L8c5:
            java.lang.String r11 = new java.lang.String
            r5 = 0
            r11.<init>(r4, r5, r8)
        L8cb:
            if (r11 != 0) goto L8d7
            java.lang.String r4 = new java.lang.String
            int r5 = r0.offset
            int r8 = r0.strlen
            r4.<init>(r1, r5, r8, r2)
            r11 = r4
        L8d7:
            int r1 = r0.offset
            int r2 = r0.strlen
            int r1 = r1 + r2
            r0.offset = r1
        L8de:
            if (r3 == 0) goto L928
            int r1 = r0.readInt32Value()
            if (r1 != 0) goto L8f3
            int r1 = r0.strBegin
            r0.symbol0Begin = r1
            int r1 = r0.strlen
            r0.symbol0Length = r1
            byte r1 = r0.strtype
            r0.symbol0StrType = r1
            return r11
        L8f3:
            long[] r2 = r0.symbols
            if (r2 != 0) goto L903
            int r2 = r1 * 2
            int r2 = r2 + 2
            if (r2 >= r7) goto L8fe
            r2 = r7
        L8fe:
            long[] r2 = new long[r2]
            r0.symbols = r2
            goto L913
        L903:
            int r3 = r2.length
            int r4 = r1 * 2
            int r4 = r4 + 2
            if (r3 >= r4) goto L913
            int r3 = r2.length
            int r3 = r3 + 16
            long[] r2 = java.util.Arrays.copyOf(r2, r3)
            r0.symbols = r2
        L913:
            int r2 = r0.strBegin
            long r2 = (long) r2
            long r2 = r2 << r7
            int r4 = r0.strlen
            long r4 = (long) r4
            long r4 = r4 << r18
            long r2 = r2 + r4
            byte r4 = r0.strtype
            long r4 = (long) r4
            long r2 = r2 + r4
            long[] r4 = r0.symbols
            int r1 = r1 * 2
            int r1 = r1 + r6
            r4[r1] = r2
        L928:
            return r11
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCode() {
            r28 = this;
            r0 = r28
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 1
            r0.offset = r3
            r4 = r1[r2]
            r0.strtype = r4
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 != r5) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = 0
        L15:
            r8 = 47
            r9 = -16
            r10 = 8
            r11 = 0
            r13 = 32
            if (r5 == 0) goto L84
            r4 = r1[r3]
            r0.strtype = r4
            if (r4 < r9) goto L80
            r3 = 72
            if (r4 > r3) goto L80
            if (r4 > r8) goto L32
            int r2 = r2 + 2
            r0.offset = r2
            goto L36
        L32:
            int r4 = r0.readInt32Value()
        L36:
            if (r4 >= 0) goto L40
            com.alibaba.fastjson2.SymbolTable r1 = r0.symbolTable
            int r2 = -r4
            long r1 = r1.getHashCode(r2)
            return r1
        L40:
            if (r4 != 0) goto L5d
            byte r1 = r0.symbol0StrType
            r0.strtype = r1
            int r1 = r0.symbol0Length
            r0.strlen = r1
            int r1 = r0.symbol0Begin
            r0.strBegin = r1
            long r1 = r0.symbol0Hash
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L5a
            long r1 = r0.getNameHashCode()
            r0.symbol0Hash = r1
        L5a:
            long r1 = r0.symbol0Hash
            return r1
        L5d:
            int r4 = r4 * 2
            long[] r1 = r0.symbols
            int r2 = r4 + 1
            r2 = r1[r2]
            int r5 = (int) r2
            byte r6 = (byte) r5
            r0.strtype = r6
            int r5 = r5 >> r10
            r0.strlen = r5
            long r2 = r2 >> r13
            int r2 = (int) r2
            r0.strBegin = r2
            r2 = r1[r4]
            int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r1 != 0) goto L7f
            long r1 = r0.getNameHashCode()
            long[] r3 = r0.symbols
            r3[r4] = r1
            return r1
        L7f:
            return r2
        L80:
            int r2 = r2 + 2
            r0.offset = r2
        L84:
            r2 = 73
            if (r4 < r2) goto L8f
            r2 = 120(0x78, float:1.68E-43)
            if (r4 > r2) goto L8f
            int r2 = r4 + (-73)
            goto La1
        L8f:
            r2 = 121(0x79, float:1.7E-43)
            if (r4 == r2) goto L9d
            r2 = 122(0x7a, float:1.71E-43)
            if (r4 != r2) goto L98
            goto L9d
        L98:
            com.alibaba.fastjson2.JSONException r1 = r0.readFieldNameHashCodeError()
            throw r1
        L9d:
            int r2 = r0.readLength()
        La1:
            r0.strlen = r2
            int r3 = r0.offset
            r0.strBegin = r3
            if (r2 >= 0) goto Lb7
            com.alibaba.fastjson2.SymbolTable r3 = r0.symbolTable
            int r6 = -r2
            long r11 = r3.getHashCode(r6)
            r21 = r10
            r7 = r13
            r18 = 1
            goto L1d5
        Lb7:
            if (r2 > r10) goto L1a4
            int r14 = r3 + r2
            int r15 = r1.length
            if (r14 > r15) goto L1a4
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            switch(r2) {
                case 1: goto L19a;
                case 2: goto L182;
                case 3: goto L166;
                case 4: goto L153;
                case 5: goto L136;
                case 6: goto L10f;
                case 7: goto Lda;
                default: goto Lc6;
            }
        Lc6:
            sun.misc.Unsafe r14 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r15 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            r18 = 1
            long r6 = (long) r3
            long r6 = r6 + r15
            long r6 = r14.getLong(r1, r6)
            r21 = r10
            r22 = r11
        Ld6:
            r11 = r6
            r7 = r13
            goto L1ad
        Lda:
            r18 = 1
            int r6 = r3 + 6
            r6 = r1[r6]
            long r6 = (long) r6
            r14 = 48
            long r6 = r6 << r14
            int r14 = r3 + 5
            r14 = r1[r14]
            long r14 = (long) r14
            r19 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r19
            r21 = 40
            long r14 = r14 << r21
            long r6 = r6 + r14
            int r14 = r3 + 4
            r14 = r1[r14]
            long r14 = (long) r14
            long r14 = r14 & r19
            long r14 = r14 << r13
            long r6 = r6 + r14
            sun.misc.Unsafe r14 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r19 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            r21 = r10
            r22 = r11
            long r10 = (long) r3
            long r10 = r19 + r10
            int r3 = r14.getInt(r1, r10)
            long r10 = (long) r3
            long r10 = r10 & r16
            long r6 = r6 + r10
            goto Ld6
        L10f:
            r21 = r10
            r22 = r11
            r18 = 1
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r14 = (long) r3
            long r19 = r10 + r14
            r24 = 4
            r7 = r13
            r26 = r14
            long r13 = r19 + r24
            short r3 = r6.getShort(r1, r13)
            long r12 = (long) r3
            long r12 = r12 << r7
            long r10 = r10 + r26
            int r3 = r6.getInt(r1, r10)
            long r10 = (long) r3
            long r10 = r10 & r16
            long r12 = r12 + r10
            r11 = r12
            goto L1ad
        L136:
            r21 = r10
            r22 = r11
            r7 = r13
            r18 = 1
            int r6 = r3 + 4
            r6 = r1[r6]
            long r10 = (long) r6
            long r10 = r10 << r7
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r12 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r14 = (long) r3
            long r12 = r12 + r14
            int r3 = r6.getInt(r1, r12)
        L14d:
            long r12 = (long) r3
            long r12 = r12 & r16
            long r10 = r10 + r12
        L151:
            r11 = r10
            goto L1ad
        L153:
            r21 = r10
            r22 = r11
            r7 = r13
            r18 = 1
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r3
            long r10 = r10 + r12
            int r3 = r6.getInt(r1, r10)
        L164:
            long r10 = (long) r3
            goto L151
        L166:
            r21 = r10
            r22 = r11
            r7 = r13
            r18 = 1
            int r6 = r3 + 2
            r6 = r1[r6]
            int r6 = r6 << 16
            long r10 = (long) r6
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r12 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            r16 = 65535(0xffff, double:3.23786E-319)
            long r14 = (long) r3
            long r12 = r12 + r14
            short r3 = r6.getShort(r1, r12)
            goto L14d
        L182:
            r21 = r10
            r22 = r11
            r7 = r13
            r16 = 65535(0xffff, double:3.23786E-319)
            r18 = 1
            sun.misc.Unsafe r6 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.JSONReaderJSONB.BASE
            long r12 = (long) r3
            long r10 = r10 + r12
            short r3 = r6.getShort(r1, r10)
            long r10 = (long) r3
            long r10 = r10 & r16
            goto L151
        L19a:
            r21 = r10
            r22 = r11
            r7 = r13
            r18 = 1
            r3 = r1[r3]
            goto L164
        L1a4:
            r21 = r10
            r22 = r11
            r7 = r13
            r18 = 1
            r11 = r22
        L1ad:
            int r3 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r3 == 0) goto L1b7
            int r3 = r0.offset
            int r3 = r3 + r2
            r0.offset = r3
            goto L1d5
        L1b7:
            r10 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r11 = r10
            r6 = 0
        L1be:
            if (r6 >= r2) goto L1d5
            int r3 = r0.offset
            int r10 = r3 + 1
            r0.offset = r10
            r3 = r1[r3]
            long r13 = (long) r3
            long r10 = r11 ^ r13
            r12 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r11 = r10 * r12
            int r6 = r6 + 1
            goto L1be
        L1d5:
            if (r5 == 0) goto L225
            int r3 = r0.offset
            r1 = r1[r3]
            if (r1 < r9) goto L1e4
            if (r1 > r8) goto L1e4
            int r3 = r3 + 1
            r0.offset = r3
            goto L1e8
        L1e4:
            int r1 = r0.readInt32Value()
        L1e8:
            if (r1 != 0) goto L1f5
            int r1 = r0.strBegin
            r0.symbol0Begin = r1
            r0.symbol0Length = r2
            r0.symbol0StrType = r4
            r0.symbol0Hash = r11
            return r11
        L1f5:
            int r1 = r1 << 1
            int r3 = r1 + 2
            long[] r5 = r0.symbols
            if (r5 != 0) goto L206
            int r3 = java.lang.Math.max(r3, r7)
            long[] r3 = new long[r3]
            r0.symbols = r3
            goto L211
        L206:
            int r6 = r5.length
            if (r6 >= r3) goto L211
            int r3 = r1 + 18
            long[] r3 = java.util.Arrays.copyOf(r5, r3)
            r0.symbols = r3
        L211:
            long[] r3 = r0.symbols
            r3[r1] = r11
            int r1 = r1 + 1
            int r5 = r0.strBegin
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            long r7 = (long) r2
            long r7 = r7 << r21
            long r5 = r5 + r7
            long r7 = (long) r4
            long r5 = r5 + r7
            r3[r1] = r5
        L225:
            return r11
    }

    public com.alibaba.fastjson2.JSONException readFieldNameHashCodeError() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fieldName not support input type "
            r0.<init>(r1)
            byte r1 = r3.strtype
            java.lang.String r1 = com.alibaba.fastjson2.JSONB.typeName(r1)
            r0.append(r1)
            byte r1 = r3.strtype
            r2 = -109(0xffffffffffffff93, float:NaN)
            if (r1 != r2) goto L22
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r3.readString()
            r0.append(r1)
        L22:
            java.lang.String r1 = ", offset "
            r0.append(r1)
            int r1 = r3.offset
            r0.append(r1)
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readFieldNameHashCodeUnquote() {
            r2 = this;
            long r0 = r2.readFieldNameHashCode()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public float readFloatValue() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            r2 = r0[r1]
            r3 = -73
            if (r2 != r3) goto L29
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r1
            long r3 = r3 + r5
            r5 = 1
            long r3 = r3 + r5
            int r0 = r2.getInt(r0, r3)
            int r1 = r1 + 5
            r7.offset = r1
            boolean r1 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r1 == 0) goto L20
            goto L24
        L20:
            int r0 = java.lang.Integer.reverseBytes(r0)
        L24:
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
        L29:
            float r0 = r7.readFloat0()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public byte[] readHex() {
            r10 = this;
            java.lang.String r0 = r10.readString()
            int r1 = r0.length()
            int r1 = r1 / 2
            byte[] r2 = new byte[r1]
            r3 = 0
        Ld:
            if (r3 >= r1) goto L34
            int r4 = r3 * 2
            char r5 = r0.charAt(r4)
            int r4 = r4 + 1
            char r4 = r0.charAt(r4)
            r6 = 55
            r7 = 48
            r8 = 57
            if (r5 > r8) goto L25
            r9 = r7
            goto L26
        L25:
            r9 = r6
        L26:
            int r5 = r5 - r9
            if (r4 > r8) goto L2a
            r6 = r7
        L2a:
            int r4 = r4 - r6
            int r5 = r5 << 4
            r4 = r4 | r5
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto Ld
        L34:
            return r2
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean readIfNull() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -81
            if (r0 != r2) goto Lf
            r0 = 1
            int r1 = r1 + r0
            r3.offset = r1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.Instant readInstant() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 1
            r7.offset = r2
            r1 = r0[r1]
            r3 = -66
            if (r1 == r3) goto L4a
            r3 = 0
            switch(r1) {
                case -85: goto L4a;
                case -84: goto L3a;
                case -83: goto L27;
                case -82: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L19:
            long r0 = r7.readInt64Value()
            int r2 = r7.readInt32Value()
            long r2 = (long) r2
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0, r2)
            return r0
        L27:
            int r0 = getInt(r0, r2)
            long r0 = (long) r0
            int r2 = r7.offset
            int r2 = r2 + 4
            r7.offset = r2
            r5 = 60
            long r0 = r0 * r5
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0, r3)
            return r0
        L3a:
            int r0 = getInt(r0, r2)
            long r0 = (long) r0
            int r2 = r7.offset
            int r2 = r2 + 4
            r7.offset = r2
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r0, r3)
            return r0
        L4a:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto L5f
            goto L63
        L5f:
            long r0 = java.lang.Long.reverseBytes(r0)
        L63:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.Integer readInt32() {
            r8 = this;
            byte[] r0 = r8.bytes
            int r1 = r8.offset
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = -81
            if (r3 != r4) goto L10
            r8.offset = r2
            r0 = 0
            return r0
        L10:
            r4 = -16
            if (r3 < r4) goto L19
            r4 = 47
            if (r3 > r4) goto L19
            goto L63
        L19:
            r4 = 48
            if (r3 < r4) goto L2d
            r4 = 63
            if (r3 > r4) goto L2d
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            int r2 = r1 + 2
            goto L63
        L2d:
            r4 = 64
            if (r3 < r4) goto L4a
            r4 = 71
            if (r3 > r4) goto L4a
            int r3 = r3 + (-68)
            int r3 = r3 << 16
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r2 = r1 + 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            int r2 = r1 + 3
            goto L63
        L4a:
            r4 = 72
            if (r3 != r4) goto L6a
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            int r0 = r3.getInt(r0, r4)
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 != 0) goto L60
            int r0 = java.lang.Integer.reverseBytes(r0)
        L60:
            r3 = r0
            int r2 = r1 + 5
        L63:
            r8.offset = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L6a:
            r8.offset = r2
            int r0 = r8.readInt32Value0(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int readInt32Value() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L11
            r4 = 47
            if (r3 > r4) goto L11
            goto L3e
        L11:
            r4 = 48
            if (r3 < r4) goto L25
            r4 = 63
            if (r3 > r4) goto L25
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            int r2 = r1 + 2
            goto L3e
        L25:
            r4 = 64
            if (r3 < r4) goto L34
            r4 = 71
            if (r3 > r4) goto L34
            int r3 = getInt3(r0, r2, r3)
            int r2 = r1 + 3
            goto L3e
        L34:
            r4 = 72
            if (r3 != r4) goto L41
            int r3 = getInt(r0, r2)
            int r2 = r1 + 5
        L3e:
            r5.offset = r2
            return r3
        L41:
            r5.offset = r2
            int r0 = r5.readInt32Value0(r0, r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.Long readInt64() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = -81
            if (r3 != r4) goto L10
            r10.offset = r2
            r0 = 0
            return r0
        L10:
            r4 = -40
            if (r3 < r4) goto L1d
            r4 = -17
            if (r3 > r4) goto L1d
            int r3 = r3 + 32
            long r0 = (long) r3
            goto L88
        L1d:
            r4 = -56
            if (r3 < r4) goto L35
            r4 = -41
            if (r3 > r4) goto L35
            int r3 = r3 + 48
            int r3 = r3 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            long r2 = (long) r3
            int r0 = r1 + 2
        L31:
            r8 = r2
            r2 = r0
            r0 = r8
            goto L88
        L35:
            r4 = -64
            if (r3 < r4) goto L53
            r4 = -57
            if (r3 > r4) goto L53
            int r3 = r3 + 60
            int r3 = r3 << 16
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r2 = r1 + 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            long r2 = (long) r3
            int r0 = r1 + 3
            goto L31
        L53:
            r4 = -65
            if (r3 != r4) goto L6f
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            int r0 = r3.getInt(r0, r4)
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto L67
        L65:
            long r2 = (long) r0
            goto L6c
        L67:
            int r0 = java.lang.Integer.reverseBytes(r0)
            goto L65
        L6c:
            int r0 = r1 + 5
            goto L31
        L6f:
            r4 = -66
            if (r3 != r4) goto L8f
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            long r2 = r3.getLong(r0, r4)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 != 0) goto L85
            long r2 = java.lang.Long.reverseBytes(r2)
        L85:
            int r0 = r1 + 9
            goto L31
        L88:
            r10.offset = r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L8f:
            r10.offset = r2
            long r0 = r10.readInt64Value0(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readInt64Value() {
            r10 = this;
            r0 = 0
            r10.wasNull = r0
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = -40
            if (r3 < r4) goto L17
            r4 = -17
            if (r3 > r4) goto L17
            int r3 = r3 + 32
            long r0 = (long) r3
            goto L72
        L17:
            r4 = -56
            if (r3 < r4) goto L2f
            r4 = -41
            if (r3 > r4) goto L2f
            int r3 = r3 + 48
            int r3 = r3 << 8
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            long r2 = (long) r3
            int r0 = r1 + 2
        L2b:
            r8 = r2
            r2 = r0
            r0 = r8
            goto L72
        L2f:
            r4 = -64
            if (r3 < r4) goto L4d
            r4 = -57
            if (r3 > r4) goto L4d
            int r3 = r3 + 60
            int r3 = r3 << 16
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r2 = r1 + 2
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            long r2 = (long) r3
            int r0 = r1 + 3
            goto L2b
        L4d:
            r4 = -65
            if (r3 != r4) goto L59
            int r0 = getInt(r0, r2)
            long r2 = (long) r0
            int r0 = r1 + 5
            goto L2b
        L59:
            r4 = -66
            if (r3 != r4) goto L75
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r4 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r6 = (long) r2
            long r4 = r4 + r6
            long r2 = r3.getLong(r0, r4)
            boolean r0 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r0 != 0) goto L6f
            long r2 = java.lang.Long.reverseBytes(r2)
        L6f:
            int r0 = r1 + 9
            goto L2b
        L72:
            r10.offset = r2
            return r0
        L75:
            r10.offset = r2
            long r0 = r10.readInt64Value0(r0, r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long[] readInt64ValueArray() {
            r5 = this;
            r0 = -110(0xffffffffffffff92, float:NaN)
            boolean r0 = r5.nextIfMatch(r0)
            if (r0 == 0) goto L40
            long r0 = r5.readTypeHashCode()
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray.HASH_TYPE
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L40
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array.HASH_TYPE
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L40
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array.HASH_TYPE
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L40
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.HASH_TYPE
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L25
            goto L40
        L25:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "not support "
            r0.<init>(r1)
            java.lang.String r1 = r5.getString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L40:
            int r0 = r5.startArray()
            r1 = -1
            if (r0 != r1) goto L49
            r0 = 0
            return r0
        L49:
            long[] r1 = new long[r0]
            r2 = 0
        L4c:
            if (r2 >= r0) goto L57
            long r3 = r5.readInt64Value()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4c
        L57:
            return r1
    }

    public int readLength() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            int r2 = r1 + 1
            r5.offset = r2
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L13
            r4 = 47
            if (r3 > r4) goto L13
            return r3
        L13:
            r4 = 48
            if (r3 < r4) goto L29
            r4 = 63
            if (r3 > r4) goto L29
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r5.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            return r3
        L29:
            r1 = 64
            if (r3 < r1) goto L3c
            r1 = 71
            if (r3 > r1) goto L3c
            int r0 = getInt3(r0, r2, r3)
            int r1 = r5.offset
            int r1 = r1 + 2
            r5.offset = r1
            return r0
        L3c:
            r1 = 72
            if (r3 != r1) goto L56
            int r0 = getInt(r0, r2)
            int r1 = r5.offset
            int r1 = r1 + 4
            r5.offset = r1
            r1 = 268435456(0x10000000, float:2.524355E-29)
            if (r0 > r1) goto L4f
            return r0
        L4f:
            java.lang.String r0 = "input length overflow"
            ah.a.w(r0)
            r0 = 0
            return r0
        L56:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r3)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.List readList(java.lang.reflect.Type[] r5) {
            r4 = this;
            boolean r0 = r4.nextIfNull()
            if (r0 == 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r4.startArray()
            com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
            r1.<init>(r0)
            r2 = 0
        L12:
            if (r2 >= r0) goto L20
            r3 = r5[r2]
            java.lang.Object r3 = r4.read(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L12
        L20:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            r2 = r0[r1]
            r3 = -87
            if (r2 != r3) goto L2e
            int r2 = r1 + 1
            int r3 = r1 + 2
            r5.offset = r3
            r2 = r0[r2]
            int r2 = r2 << 8
            int r4 = r1 + 3
            r5.offset = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r3
            int r3 = r1 + 4
            r5.offset = r3
            r4 = r0[r4]
            int r1 = r1 + 5
            r5.offset = r1
            r0 = r0[r3]
            java.time.LocalDate r0 = java.time.LocalDate.of(r2, r4, r0)
            return r0
        L2e:
            r0 = -81
            if (r2 != r0) goto L38
            int r1 = r1 + 1
            r5.offset = r1
            r0 = 0
            return r0
        L38:
            java.time.LocalDate r0 = r5.readLocalDate0(r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate10() {
            r4 = this;
            byte r0 = r4.strtype
            r1 = 121(0x79, float:1.7E-43)
            if (r0 == r1) goto La
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 != r1) goto L19
        La:
            int r0 = r4.strlen
            r1 = 10
            if (r0 != r1) goto L19
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(r0, r1)
            goto L2b
        L19:
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 83
            if (r2 != r3) goto L32
            int r1 = r1 + 1
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate10(r0, r1)
            if (r0 == 0) goto L32
        L2b:
            int r1 = r4.offset
            int r1 = r1 + 11
            r4.offset = r1
            return r0
        L32:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDate readLocalDate11() {
            r4 = this;
            byte r0 = r4.strtype
            r1 = 121(0x79, float:1.7E-43)
            if (r0 == r1) goto La
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 != r1) goto L19
        La:
            int r0 = r4.strlen
            r1 = 11
            if (r0 != r1) goto L19
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(r0, r1)
            goto L2b
        L19:
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 84
            if (r2 != r3) goto L32
            int r1 = r1 + 1
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate11(r0, r1)
            if (r0 == 0) goto L32
        L2b:
            int r1 = r4.offset
            int r1 = r1 + 12
            r4.offset = r1
            return r0
        L32:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate8() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 81
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate8(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 9
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDate readLocalDate9() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 82
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDate r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDate9(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 10
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalDateTime readLocalDateTime() {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            r2 = r0[r1]
            r3 = -88
            if (r2 != r3) goto L45
            int r2 = r1 + 1
            int r3 = r1 + 2
            r12.offset = r3
            r2 = r0[r2]
            int r2 = r2 << 8
            int r4 = r1 + 3
            r12.offset = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r2 + r3
            int r2 = r1 + 4
            r12.offset = r2
            r6 = r0[r4]
            int r3 = r1 + 5
            r12.offset = r3
            r7 = r0[r2]
            int r2 = r1 + 6
            r12.offset = r2
            r8 = r0[r3]
            int r3 = r1 + 7
            r12.offset = r3
            r9 = r0[r2]
            int r1 = r1 + 8
            r12.offset = r1
            r10 = r0[r3]
            int r11 = r12.readInt32Value()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r5, r6, r7, r8, r9, r10, r11)
            return r0
        L45:
            r0 = -81
            if (r2 != r0) goto L4f
            int r1 = r1 + 1
            r12.offset = r1
            r0 = 0
            return r0
        L4f:
            java.time.LocalDateTime r0 = r12.readLocalDateTime0(r2)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime12() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 85
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime12(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 13
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime14() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 87
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime14(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 15
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime16() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 89
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime16(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 17
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime17() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 90
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime17(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 18
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime18() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 91
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime18(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 19
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime19() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            r2 = r0[r1]
            r5.type = r2
            r3 = 92
            java.lang.String r4 = "date only support string input"
            if (r2 != r3) goto L22
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime19(r0, r1)
            if (r0 == 0) goto L1d
            int r1 = r5.offset
            int r1 = r1 + 20
            r5.offset = r1
            return r0
        L1d:
            ah.a.w(r4)
            r0 = 0
            return r0
        L22:
            ah.a.w(r4)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTime20() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 93
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTime20(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 21
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalDateTime readLocalDateTimeX(int r5) {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r4.type = r2
            r3 = 73
            if (r2 < r3) goto L33
            r3 = 120(0x78, float:1.68E-43)
            if (r2 > r3) goto L33
            r2 = 21
            if (r5 < r2) goto L28
            r2 = 29
            if (r5 > r2) goto L28
            int r1 = r1 + 1
            java.time.LocalDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalDateTimeX(r0, r1, r5)
            if (r0 == 0) goto L28
            int r1 = r4.offset
            int r5 = r5 + 1
            int r5 = r5 + r1
            r4.offset = r5
            return r0
        L28:
            java.lang.String r5 = "illegal LocalDateTime string : "
            java.lang.String r0 = r4.readString()
            ah.a.i(r0, r5)
        L31:
            r5 = 0
            return r5
        L33:
            java.lang.String r5 = "date only support string input"
            ah.a.w(r5)
            goto L31
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalTime readLocalTime() {
            r5 = this;
            byte[] r0 = r5.bytes
            int r1 = r5.offset
            r2 = r0[r1]
            r3 = -89
            if (r2 != r3) goto L27
            int r2 = r1 + 1
            int r3 = r1 + 2
            r5.offset = r3
            r2 = r0[r2]
            int r4 = r1 + 3
            r5.offset = r4
            r3 = r0[r3]
            int r1 = r1 + 4
            r5.offset = r1
            r0 = r0[r4]
            int r1 = r5.readInt32Value()
            java.time.LocalTime r0 = java.time.LocalTime.of(r2, r3, r0, r1)
            return r0
        L27:
            r0 = 73
            if (r2 < r0) goto L6a
            r0 = 120(0x78, float:1.68E-43)
            if (r2 > r0) goto L6a
            int r0 = r5.getStringLength()
            r1 = 5
            if (r0 == r1) goto L65
            r1 = 8
            if (r0 == r1) goto L60
            r1 = 18
            if (r0 == r1) goto L5b
            switch(r0) {
                case 10: goto L56;
                case 11: goto L51;
                case 12: goto L4c;
                default: goto L41;
            }
        L41:
            java.lang.String r1 = "not support len : "
            java.lang.String r0 = eh.a.l(r0, r1)
            ah.a.w(r0)
            r0 = 0
            return r0
        L4c:
            java.time.LocalTime r0 = r5.readLocalTime12()
            return r0
        L51:
            java.time.LocalTime r0 = r5.readLocalTime11()
            return r0
        L56:
            java.time.LocalTime r0 = r5.readLocalTime10()
            return r0
        L5b:
            java.time.LocalTime r0 = r5.readLocalTime18()
            return r0
        L60:
            java.time.LocalTime r0 = r5.readLocalTime8()
            return r0
        L65:
            java.time.LocalTime r0 = r5.readLocalTime5()
            return r0
        L6a:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalTime readLocalTime10() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 83
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime10(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 11
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime11() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 84
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime11(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 12
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime12() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 85
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime12(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 13
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalTime readLocalTime15() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 88
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime15(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 16
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime18() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 91
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime18(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 19
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime5() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 78
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime5(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 6
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.LocalTime readLocalTime8() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 81
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 9
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.LocalTime readLocalTime9() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 81
            if (r2 != r3) goto L19
            int r1 = r1 + 1
            java.time.LocalTime r0 = com.alibaba.fastjson2.util.DateUtils.parseLocalTime8(r0, r1)
            if (r0 == 0) goto L19
            int r1 = r4.offset
            int r1 = r1 + 10
            r4.offset = r1
            return r0
        L19:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readMillis19() {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r3 = 92
            if (r2 != r3) goto L1b
            int r1 = r1 + 1
            com.alibaba.fastjson2.JSONReader$Context r2 = r4.context
            java.time.ZoneId r2 = r2.zoneId
            long r0 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(r0, r1, r2)
            int r2 = r4.offset
            int r2 = r2 + 20
            r4.offset = r2
            return r0
        L1b:
            java.lang.String r0 = "date only support string input"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readNull() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            int r2 = r1 + 1
            r3.offset = r2
            r0 = r0[r1]
            r3.type = r0
            r1 = -81
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.String r0 = "null not match, "
            byte r1 = r3.type
            ah.a.y(r1, r0)
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.Date readNullOrNewDate() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.Number readNumber() {
            r7 = this;
            byte[] r0 = r7.bytes
            int r1 = r7.offset
            int r2 = r1 + 1
            r7.offset = r2
            r3 = r0[r1]
            r4 = -16
            if (r3 < r4) goto L17
            r4 = 47
            if (r3 > r4) goto L17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L17:
            r4 = 48
            if (r3 < r4) goto L31
            r4 = 63
            if (r3 > r4) goto L31
            int r3 = r3 + (-56)
            int r3 = r3 << 8
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L31:
            r4 = 64
            if (r3 < r4) goto L48
            r4 = 71
            if (r3 > r4) goto L48
            int r0 = getInt3(r0, r2, r3)
            int r1 = r7.offset
            int r1 = r1 + 2
            r7.offset = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L48:
            r4 = -40
            if (r3 < r4) goto L5a
            r5 = -17
            if (r3 > r5) goto L5a
            int r3 = r3 - r4
            long r0 = (long) r3
            r2 = -8
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L5a:
            r4 = -56
            if (r3 < r4) goto L74
            r4 = -41
            if (r3 > r4) goto L74
            int r3 = r3 + 48
            int r3 = r3 << 8
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L74:
            r4 = -64
            if (r3 < r4) goto L99
            r4 = -57
            if (r3 > r4) goto L99
            int r3 = r3 + 60
            int r3 = r3 << 16
            int r4 = r1 + 2
            r7.offset = r4
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r3 + r2
            int r1 = r1 + 3
            r7.offset = r1
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L99:
            r4 = -110(0xffffffffffffff92, float:NaN)
            if (r3 == r4) goto L1ec
            r4 = 72
            if (r3 == r4) goto L1dd
            r4 = 121(0x79, float:1.7E-43)
            if (r3 == r4) goto L1c9
            r4 = 122(0x7a, float:1.71E-43)
            if (r3 == r4) goto L1b0
            switch(r3) {
                case -81: goto L1ae;
                case -80: goto L1a7;
                case -79: goto L1a0;
                case -78: goto L1a7;
                case -77: goto L1a0;
                case -76: goto L196;
                case -75: goto L174;
                case -74: goto L16a;
                case -73: goto L157;
                case -72: goto L14e;
                case -71: goto L138;
                case -70: goto L12f;
                case -69: goto L116;
                case -68: goto L101;
                case -67: goto Lf6;
                case -66: goto Ld8;
                case -65: goto Lc8;
                default: goto Lac;
            }
        Lac:
            r0 = 73
            if (r3 < r0) goto Lc3
            r1 = 120(0x78, float:1.68E-43)
            if (r3 > r1) goto Lc3
            int r3 = r3 - r0
            java.lang.String r0 = r7.getLatin1String(r2, r3)
            int r1 = r7.offset
            int r1 = r1 + r3
            r7.offset = r1
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r0
        Lc3:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r3)
            throw r0
        Lc8:
            int r0 = getInt(r0, r2)
            int r1 = r7.offset
            int r1 = r1 + 4
            r7.offset = r1
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        Ld8:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto Led
            goto Lf1
        Led:
            long r0 = java.lang.Long.reverseBytes(r0)
        Lf1:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        Lf6:
            int r1 = r1 + 2
            r7.offset = r1
            r0 = r0[r2]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
        L101:
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0[r2]
            int r0 = r0 << 8
            int r3 = r3 + r0
            int r1 = r1 + 3
            r7.offset = r1
            short r0 = (short) r3
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
        L116:
            int r0 = r7.readInt32Value()
            byte[] r1 = new byte[r0]
            byte[] r2 = r7.bytes
            int r3 = r7.offset
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            int r2 = r7.offset
            int r2 = r2 + r0
            r7.offset = r2
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1)
            return r0
        L12f:
            long r0 = r7.readInt64Value()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
        L138:
            int r0 = r7.readInt32Value()
            java.math.BigInteger r1 = r7.readBigInteger()
            if (r0 != 0) goto L148
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            return r0
        L148:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r1, r0)
            return r2
        L14e:
            long r0 = r7.readInt64Value()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            return r0
        L157:
            int r0 = getInt(r0, r2)
            int r1 = r7.offset
            int r1 = r1 + 4
            r7.offset = r1
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L16a:
            int r0 = r7.readInt32Value()
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L174:
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r5 = (long) r2
            long r3 = r3 + r5
            long r0 = r1.getLong(r0, r3)
            int r2 = r7.offset
            int r2 = r2 + 8
            r7.offset = r2
            boolean r2 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r2 == 0) goto L189
            goto L18d
        L189:
            long r0 = java.lang.Long.reverseBytes(r0)
        L18d:
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L196:
            long r0 = r7.readInt64Value()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L1a0:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L1a7:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L1ae:
            r0 = 0
            return r0
        L1b0:
            int r0 = r7.readInt32Value()
            java.lang.String r1 = new java.lang.String
            byte[] r2 = r7.bytes
            int r3 = r7.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r3, r0, r4)
            int r2 = r7.offset
            int r2 = r2 + r0
            r7.offset = r2
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            return r0
        L1c9:
            int r0 = r7.readInt32Value()
            int r1 = r7.offset
            java.lang.String r1 = r7.getLatin1String(r1, r0)
            int r2 = r7.offset
            int r2 = r2 + r0
            r7.offset = r2
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            return r0
        L1dd:
            int r0 = getInt(r0, r2)
            int r1 = r7.offset
            int r1 = r1 + 4
            r7.offset = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L1ec:
            java.lang.String r0 = r7.readString()
            java.lang.String r1 = "not support input type : "
            java.lang.String r0 = r1.concat(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void readNumber0() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.Map<java.lang.String, java.lang.Object> readObject() {
            r19 = this;
            r0 = r19
            byte[] r1 = r0.bytes
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r3 = r2.features
            int r5 = r0.offset
            int r6 = r5 + 1
            r0.offset = r6
            r5 = r1[r5]
            r0.type = r5
            r6 = -81
            r7 = 0
            if (r5 != r6) goto L18
            return r7
        L18:
            r6 = -90
            if (r5 < r6) goto L221
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r8 = r5.mask
            long r8 = r8 & r3
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L2d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L3d
        L2d:
            java.util.function.Supplier<java.util.Map> r2 = r2.objectSupplier
            if (r2 == 0) goto L38
            java.lang.Object r2 = r2.get()
            java.util.Map r2 = (java.util.Map) r2
            goto L3d
        L38:
            com.alibaba.fastjson2.JSONObject r2 = new com.alibaba.fastjson2.JSONObject
            r2.<init>()
        L3d:
            int r5 = r0.offset
            r8 = r1[r5]
            r9 = -91
            if (r8 != r9) goto L4a
            int r5 = r5 + 1
            r0.offset = r5
            return r2
        L4a:
            r5 = 73
            if (r8 < r5) goto L53
            java.lang.String r8 = r0.readFieldName()
            goto L57
        L53:
            java.lang.Object r8 = r0.readAny()
        L57:
            int r9 = r0.offset
            r12 = r1[r9]
            java.lang.String r13 = ".."
            r14 = -109(0xffffffffffffff93, float:NaN)
            if (r12 != r14) goto L7d
            java.lang.String r5 = r0.readReference()
            boolean r9 = r13.equals(r5)
            if (r9 == 0) goto L75
            r2.put(r8, r2)
        L6e:
            r18 = r6
            r16 = r10
            r10 = r7
            goto L21a
        L75:
            com.alibaba.fastjson2.JSONPath r5 = com.alibaba.fastjson2.JSONPath.of(r5)
            r0.addResolveTask(r2, r8, r5)
            goto L6e
        L7d:
            r15 = 126(0x7e, float:1.77E-43)
            if (r12 < r5) goto L8e
            if (r12 > r15) goto L8e
            java.lang.String r5 = r0.readString()
            r18 = r6
            r16 = r10
        L8b:
            r10 = r7
            goto L20b
        L8e:
            r16 = r10
            r10 = 47
            r11 = -16
            if (r12 < r11) goto La3
            if (r12 > r10) goto La3
            int r9 = r9 + 1
            r0.offset = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
        La0:
            r18 = r6
            goto L8b
        La3:
            r15 = -79
            if (r12 != r15) goto Lae
            int r9 = r9 + 1
            r0.offset = r9
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto La0
        Lae:
            r15 = -80
            if (r12 != r15) goto Lb9
            int r9 = r9 + 1
            r0.offset = r9
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto La0
        Lb9:
            if (r12 != r6) goto Lc0
            java.util.Map r5 = r0.readObject()
            goto La0
        Lc0:
            r15 = -66
            if (r12 != r15) goto Le6
            int r9 = r9 + 1
            r0.offset = r9
            sun.misc.Unsafe r5 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r10 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            long r12 = (long) r9
            long r10 = r10 + r12
            long r9 = r5.getLong(r1, r10)
            int r5 = r0.offset
            int r5 = r5 + 8
            r0.offset = r5
            boolean r5 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r5 == 0) goto Ldd
            goto Le1
        Ldd:
            long r9 = java.lang.Long.reverseBytes(r9)
        Le1:
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            goto La0
        Le6:
            r15 = 63
            r6 = 48
            r5 = -108(0xffffffffffffff94, float:NaN)
            if (r12 < r5) goto L1b9
            r5 = -92
            if (r12 > r5) goto L1b9
            int r7 = r9 + 1
            r0.offset = r7
            if (r12 != r5) goto L11c
            r5 = r1[r7]
            if (r5 < r11) goto L103
            if (r5 > r10) goto L103
            int r9 = r9 + 2
            r0.offset = r9
            goto L11e
        L103:
            if (r5 < r6) goto L117
            if (r5 > r15) goto L117
            int r5 = r5 + (-56)
            int r5 = r5 << 8
            int r6 = r9 + 2
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r6
            int r9 = r9 + 3
            r0.offset = r9
            goto L11e
        L117:
            int r5 = r0.readLength()
            goto L11e
        L11c:
            int r5 = r12 + 108
        L11e:
            if (r5 != 0) goto L144
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r5 = r5.mask
            long r5 = r5 & r3
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L133
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L12e:
            r10 = 0
            r15 = -90
            goto L1b6
        L133:
            com.alibaba.fastjson2.JSONReader$Context r5 = r0.context
            java.util.function.Supplier<java.util.List> r5 = r5.arraySupplier
            if (r5 == 0) goto L13e
            java.lang.Object r5 = r5.get()
            goto L12e
        L13e:
            com.alibaba.fastjson2.JSONArray r5 = new com.alibaba.fastjson2.JSONArray
            r5.<init>()
            goto L12e
        L144:
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r6 = r6.mask
            long r6 = r6 & r3
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 == 0) goto L153
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            goto L165
        L153:
            com.alibaba.fastjson2.JSONReader$Context r6 = r0.context
            java.util.function.Supplier<java.util.List> r6 = r6.arraySupplier
            if (r6 == 0) goto L160
            java.lang.Object r6 = r6.get()
            java.util.List r6 = (java.util.List) r6
            goto L165
        L160:
            com.alibaba.fastjson2.JSONArray r6 = new com.alibaba.fastjson2.JSONArray
            r6.<init>(r5)
        L165:
            r7 = 0
        L166:
            if (r7 >= r5) goto L1b2
            int r9 = r0.offset
            r9 = r1[r9]
            if (r9 != r14) goto L18f
            java.lang.String r9 = r0.readReference()
            boolean r10 = r13.equals(r9)
            if (r10 == 0) goto L183
            r6.add(r6)
            r10 = 0
        L17c:
            r11 = 73
            r12 = 126(0x7e, float:1.77E-43)
            r15 = -90
            goto L1af
        L183:
            r10 = 0
            r6.add(r10)
            com.alibaba.fastjson2.JSONPath r9 = com.alibaba.fastjson2.JSONPath.of(r9)
            r0.addResolveTask(r6, r7, r9)
            goto L17c
        L18f:
            r10 = 0
            r11 = 73
            r12 = 126(0x7e, float:1.77E-43)
            if (r9 < r11) goto L19f
            if (r9 > r12) goto L19f
            java.lang.String r9 = r0.readString()
            r15 = -90
            goto L1ac
        L19f:
            r15 = -90
            if (r9 != r15) goto L1a8
            java.util.Map r9 = r0.readObject()
            goto L1ac
        L1a8:
            java.lang.Object r9 = r0.readAny()
        L1ac:
            r6.add(r9)
        L1af:
            int r7 = r7 + 1
            goto L166
        L1b2:
            r10 = 0
            r15 = -90
            r5 = r6
        L1b6:
            r18 = r15
            goto L20b
        L1b9:
            r10 = r7
            r18 = -90
            if (r12 < r6) goto L1d6
            if (r12 > r15) goto L1d6
            int r12 = r12 + (-56)
            int r5 = r12 << 8
            int r9 = r9 + 1
            r6 = r1[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r0.offset
            int r6 = r6 + 2
            r0.offset = r6
            goto L20b
        L1d6:
            r5 = 64
            if (r12 < r5) goto L1f1
            r5 = 71
            if (r12 > r5) goto L1f1
            int r9 = r9 + 1
            int r5 = getInt3(r1, r9, r12)
            int r6 = r0.offset
            int r6 = r6 + 3
            r0.offset = r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
        L1ef:
            r5 = r6
            goto L20b
        L1f1:
            r5 = 72
            if (r12 != r5) goto L207
            int r9 = r9 + 1
            int r5 = getInt(r1, r9)
            int r6 = r0.offset
            int r6 = r6 + 5
            r0.offset = r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L1ef
        L207:
            java.lang.Object r5 = r0.readAny()
        L20b:
            if (r5 != 0) goto L217
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r6 = r6.mask
            long r6 = r6 & r3
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 == 0) goto L217
            goto L21a
        L217:
            r2.put(r8, r5)
        L21a:
            r7 = r10
            r10 = r16
            r6 = r18
            goto L3d
        L221:
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r5 != r1) goto L23b
            r2 = 0
            r4 = 0
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            r3 = 0
            r2 = 0
            r0 = r1
            r1 = r19
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L23b:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r5)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.OffsetDateTime readOffsetDateTime() {
            r1 = this;
            java.time.ZonedDateTime r0 = r1.readZonedDateTime()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.time.OffsetDateTime r0 = r0.toOffsetDateTime()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.OffsetTime readOffsetTime() {
            r1 = this;
            java.time.ZonedDateTime r0 = r1.readZonedDateTime()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.time.OffsetDateTime r0 = r0.toOffsetDateTime()
            java.time.OffsetTime r0 = r0.toOffsetTime()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readPattern() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readReference() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            r0 = r0[r1]
            r2 = -109(0xffffffffffffff93, float:NaN)
            if (r0 == r2) goto Lc
            r0 = 0
            return r0
        Lc:
            int r1 = r1 + 1
            r3.offset = r1
            boolean r0 = r3.isString()
            if (r0 == 0) goto L1b
            java.lang.String r0 = r3.readString()
            return r0
        L1b:
            byte r0 = r3.type
            java.lang.String r0 = r3.error(r0)
            java.lang.String r1 = "reference not support input "
            ah.a.i(r0, r1)
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String readString() {
            r10 = this;
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            int r2 = r1 + 1
            r10.offset = r2
            r3 = r0[r1]
            r10.strtype = r3
            r4 = -81
            r5 = 0
            if (r3 != r4) goto L12
            return r5
        L12:
            r10.strBegin = r2
            r4 = 73
            if (r3 < r4) goto Ldd
            r6 = 121(0x79, float:1.7E-43)
            if (r3 > r6) goto Ldd
            if (r3 != r6) goto L63
            r2 = r0[r2]
            r3 = -16
            if (r2 < r3) goto L2d
            r3 = 47
            if (r2 > r3) goto L2d
            int r1 = r1 + 2
            r10.offset = r1
            goto L5e
        L2d:
            r3 = 48
            if (r2 < r3) goto L45
            r3 = 63
            if (r2 > r3) goto L45
            int r2 = r2 + (-56)
            int r2 = r2 << 8
            int r3 = r1 + 2
            r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r0
            int r1 = r1 + 3
            r10.offset = r1
            goto L5e
        L45:
            r3 = 64
            if (r2 < r3) goto L5a
            r3 = 71
            if (r2 > r3) goto L5a
            int r1 = r1 + 2
            int r2 = getInt3(r0, r1, r2)
            int r0 = r10.offset
            int r0 = r0 + 3
            r10.offset = r0
            goto L5e
        L5a:
            int r2 = r10.readLength()
        L5e:
            int r0 = r10.offset
            r10.strBegin = r0
            goto L65
        L63:
            int r2 = r3 + (-73)
        L65:
            if (r2 >= 0) goto L6f
            com.alibaba.fastjson2.SymbolTable r0 = r10.symbolTable
            int r1 = -r2
            java.lang.String r0 = r0.getName(r1)
            return r0
        L6f:
            r10.strlen = r2
            int r0 = com.alibaba.fastjson2.util.JDKUtils.ANDROID_SDK_INT
            r1 = 34
            if (r0 >= r1) goto La9
            char[] r0 = r10.charBuf
            if (r0 != 0) goto L87
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r0 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            com.alibaba.fastjson2.JSONFactory$CacheItem r1 = r10.cacheItem
            java.lang.Object r0 = r0.getAndSet(r1, r5)
            char[] r0 = (char[]) r0
            r10.charBuf = r0
        L87:
            if (r0 == 0) goto L8c
            int r1 = r0.length
            if (r1 >= r2) goto L90
        L8c:
            char[] r0 = new char[r2]
            r10.charBuf = r0
        L90:
            r1 = 0
            r3 = r1
        L92:
            if (r3 >= r2) goto La3
            byte[] r4 = r10.bytes
            int r6 = r10.offset
            int r6 = r6 + r3
            r4 = r4[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            char r4 = (char) r4
            r0[r3] = r4
            int r3 = r3 + 1
            goto L92
        La3:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1, r2)
            goto Lb4
        La9:
            java.lang.String r3 = new java.lang.String
            byte[] r0 = r10.bytes
            int r1 = r10.offset
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r3.<init>(r0, r1, r2, r4)
        Lb4:
            int r0 = r10.offset
            int r0 = r0 + r2
            r10.offset = r0
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r6 = r4.mask
            long r0 = r0 & r6
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto Lcc
            java.lang.String r3 = r3.trim()
        Lcc:
            if (r2 != 0) goto Ldc
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull
            long r8 = r2.mask
            long r0 = r0 & r8
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto Ldc
            return r5
        Ldc:
            return r3
        Ldd:
            java.lang.String r0 = r10.readStringNonAscii()
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.lang.String[] readStringArray() {
            r4 = this;
            r0 = -110(0xffffffffffffff92, float:NaN)
            boolean r0 = r4.nextIfMatch(r0)
            if (r0 == 0) goto L2e
            long r0 = r4.readTypeHashCode()
            long r2 = com.alibaba.fastjson2.reader.ObjectReaderImplStringArray.HASH_TYPE
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L13
            goto L2e
        L13:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "not support type "
            r0.<init>(r1)
            java.lang.String r1 = r4.getString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r4.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L2e:
            int r0 = r4.startArray()
            r1 = -1
            if (r0 != r1) goto L37
            r0 = 0
            return r0
        L37:
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
        L3a:
            if (r2 >= r0) goto L45
            java.lang.String r3 = r4.readString()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L3a
        L45:
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readTypeHashCode() {
            r14 = this;
            byte[] r0 = r14.bytes
            int r1 = r14.offset
            r2 = r0[r1]
            r14.strtype = r2
            r3 = 121(0x79, float:1.7E-43)
            if (r2 != r3) goto L8a
            int r3 = r1 + 1
            r3 = r0[r3]
            r4 = 8
            if (r3 <= r4) goto L8a
            r5 = 63
            if (r3 > r5) goto L8a
            r5 = 47
            if (r3 > r5) goto L1f
            int r1 = r1 + 2
            goto L2b
        L1f:
            int r3 = r3 + (-56)
            int r3 = r3 << r4
            int r6 = r1 + 2
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r6
            int r1 = r1 + 3
        L2b:
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r8 = 0
            r9 = r1
        L32:
            if (r8 >= r3) goto L44
            int r10 = r9 + 1
            r9 = r0[r9]
            long r11 = (long) r9
            long r6 = r6 ^ r11
            r11 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r6 = r6 * r11
            int r8 = r8 + 1
            r9 = r10
            goto L32
        L44:
            r0 = r0[r9]
            if (r0 < 0) goto L8a
            if (r0 > r5) goto L8a
            int r9 = r9 + 1
            if (r0 != 0) goto L57
            r14.symbol0Begin = r1
            r14.symbol0Length = r3
            r14.symbol0StrType = r2
            r14.symbol0Hash = r6
            goto L83
        L57:
            int r0 = r0 * 2
            int r5 = r0 + 2
            long[] r8 = r14.symbols
            r10 = 32
            if (r8 != 0) goto L6a
            int r5 = java.lang.Math.max(r5, r10)
            long[] r5 = new long[r5]
            r14.symbols = r5
            goto L75
        L6a:
            int r11 = r8.length
            if (r11 >= r5) goto L75
            int r5 = r0 + 18
            long[] r5 = java.util.Arrays.copyOf(r8, r5)
            r14.symbols = r5
        L75:
            long[] r5 = r14.symbols
            int r0 = r0 + 1
            long r11 = (long) r1
            long r10 = r11 << r10
            long r12 = (long) r3
            long r12 = r12 << r4
            long r10 = r10 + r12
            long r12 = (long) r2
            long r10 = r10 + r12
            r5[r0] = r10
        L83:
            r14.strBegin = r1
            r14.strlen = r3
            r14.offset = r9
            return r6
        L8a:
            long r0 = r14.readTypeHashCode0()
            return r0
    }

    public long readTypeHashCode0() {
            r25 = this;
            r0 = r25
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            r3 = r1[r2]
            r0.strtype = r3
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 72
            r6 = 47
            r7 = -16
            r8 = 32
            r9 = 0
            r11 = 8
            if (r3 != r4) goto L7b
            int r3 = r2 + 1
            r0.offset = r3
            r3 = r1[r3]
            r0.strtype = r3
            if (r3 < r7) goto L7b
            if (r3 > r5) goto L7b
            if (r3 > r6) goto L2d
            int r2 = r2 + 2
            r0.offset = r2
            goto L31
        L2d:
            int r3 = r0.readInt32Value()
        L31:
            if (r3 >= 0) goto L3b
            com.alibaba.fastjson2.SymbolTable r1 = r0.symbolTable
            int r2 = -r3
            long r1 = r1.getHashCode(r2)
            return r1
        L3b:
            if (r3 != 0) goto L58
            byte r1 = r0.symbol0StrType
            r0.strtype = r1
            int r1 = r0.symbol0Length
            r0.strlen = r1
            int r1 = r0.symbol0Begin
            r0.strBegin = r1
            long r1 = r0.symbol0Hash
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L55
            long r1 = r0.getNameHashCode()
            r0.symbol0Hash = r1
        L55:
            long r1 = r0.symbol0Hash
            return r1
        L58:
            int r3 = r3 * 2
            long[] r1 = r0.symbols
            int r2 = r3 + 1
            r4 = r1[r2]
            int r2 = (int) r4
            byte r6 = (byte) r2
            r0.strtype = r6
            int r2 = r2 >> r11
            r0.strlen = r2
            long r4 = r4 >> r8
            int r2 = (int) r4
            r0.strBegin = r2
            r4 = r1[r3]
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L7a
            long r1 = r0.getNameHashCode()
            long[] r4 = r0.symbols
            r4[r3] = r1
            return r1
        L7a:
            return r4
        L7b:
            r2 = 63
            if (r3 < r7) goto Lff
            if (r3 > r5) goto Lff
            if (r3 > r6) goto L8b
            int r1 = r0.offset
            int r1 = r1 + 1
            r0.offset = r1
            r5 = r3
            goto La2
        L8b:
            if (r3 > r2) goto L9e
            int r2 = r0.offset
            int r4 = r2 + 1
            int r5 = r3 + (-56)
            int r5 = r5 << r11
            int r2 = r2 + 2
            r0.offset = r2
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r1
            goto La2
        L9e:
            int r5 = r0.readInt32Value()
        La2:
            if (r5 != 0) goto Lc3
            byte r1 = r0.symbol0StrType
            r0.strtype = r1
            int r1 = r0.symbol0Length
            r0.strlen = r1
            int r1 = r0.symbol0Begin
            r0.strBegin = r1
            long r1 = r0.symbol0Hash
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto Lc0
            java.lang.String r1 = r0.getString()
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            r0.symbol0Hash = r1
        Lc0:
            long r1 = r0.symbol0Hash
            goto Lf3
        Lc3:
            if (r5 >= 0) goto Lcf
            r0.strlen = r3
            com.alibaba.fastjson2.SymbolTable r1 = r0.symbolTable
            int r2 = -r5
            long r1 = r1.getHashCode(r2)
            goto Lf3
        Lcf:
            long[] r1 = r0.symbols
            int r2 = r5 * 2
            r3 = r1[r2]
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 != 0) goto Lf2
            int r2 = r2 + 1
            r2 = r1[r2]
            int r1 = (int) r2
            byte r4 = (byte) r1
            r0.strtype = r4
            int r1 = r1 >> r11
            r0.strlen = r1
            long r1 = r2 >> r8
            int r1 = (int) r1
            r0.strBegin = r1
            java.lang.String r1 = r0.getString()
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            goto Lf3
        Lf2:
            r1 = r3
        Lf3:
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto Lfa
            return r1
        Lfa:
            com.alibaba.fastjson2.JSONException r1 = typeRefNotFound(r5)
            throw r1
        Lff:
            int r4 = r0.offset
            int r5 = r4 + 1
            r0.offset = r5
            r0.strBegin = r5
            r12 = 48
            r13 = 125(0x7d, float:1.75E-43)
            r14 = 124(0x7c, float:1.74E-43)
            r15 = 123(0x7b, float:1.72E-43)
            r16 = r9
            r9 = 122(0x7a, float:1.71E-43)
            r10 = 73
            r18 = 56
            if (r3 < r10) goto L122
            r10 = 120(0x78, float:1.68E-43)
            if (r3 > r10) goto L122
            int r2 = r3 + (-73)
            r0.strlen = r2
            goto L160
        L122:
            r10 = 121(0x79, float:1.7E-43)
            if (r3 == r10) goto L134
            if (r3 == r9) goto L134
            if (r3 == r15) goto L134
            if (r3 == r14) goto L134
            if (r3 != r13) goto L12f
            goto L134
        L12f:
            com.alibaba.fastjson2.JSONException r1 = r0.readStringError()
            throw r1
        L134:
            r5 = r1[r5]
            if (r5 < r7) goto L141
            if (r5 > r6) goto L141
            int r4 = r4 + 2
            r0.offset = r4
            r0.strlen = r5
            goto L15c
        L141:
            if (r5 < r12) goto L156
            if (r5 > r2) goto L156
            int r2 = r4 + 2
            int r5 = r5 + (-56)
            int r5 = r5 << r11
            int r4 = r4 + 3
            r0.offset = r4
            r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r5 = r5 + r2
            r0.strlen = r5
            goto L15c
        L156:
            int r2 = r0.readLength()
            r0.strlen = r2
        L15c:
            int r2 = r0.offset
            r0.strBegin = r2
        L160:
            int r2 = r0.strlen
            if (r2 >= 0) goto L16d
            com.alibaba.fastjson2.SymbolTable r4 = r0.symbolTable
            int r2 = -r2
            long r4 = r4.getHashCode(r2)
            goto L296
        L16d:
            r4 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            r19 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            if (r3 != r9) goto L1c5
            int r9 = r0.offset
            int r9 = r9 + r2
        L17c:
            int r2 = r0.offset
            if (r2 >= r9) goto L1c1
            r10 = r1[r2]
            if (r10 < 0) goto L189
            int r2 = r2 + 1
            r0.offset = r2
            goto L1bb
        L189:
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r12 = r10 >> 4
            switch(r12) {
                case 12: goto L1ad;
                case 13: goto L1ad;
                case 14: goto L19a;
                default: goto L190;
            }
        L190:
            java.lang.String r1 = "malformed input around byte "
            int r2 = r0.offset
            ah.a.y(r2, r1)
            r1 = 0
            return r1
        L19a:
            int r12 = r2 + 1
            r12 = r1[r12]
            int r13 = r2 + 2
            r13 = r1[r13]
            int r10 = com.alibaba.fastjson2.JSONReaderUTF8.char2_utf8(r10, r12, r13, r2)
            int r2 = r0.offset
            int r2 = r2 + 3
            r0.offset = r2
            goto L1bb
        L1ad:
            int r12 = r2 + 1
            r12 = r1[r12]
            int r10 = com.alibaba.fastjson2.JSONReaderUTF8.char2_utf8(r10, r12, r2)
            int r2 = r0.offset
            int r2 = r2 + 2
            r0.offset = r2
        L1bb:
            long r12 = (long) r10
            long r12 = r19 ^ r12
            long r19 = r12 * r4
            goto L17c
        L1c1:
            r4 = r19
            goto L296
        L1c5:
            r9 = 0
            if (r3 == r15) goto L1ca
            if (r3 != r13) goto L1ce
        L1ca:
            r21 = r4
            goto L277
        L1ce:
            if (r3 != r14) goto L1ee
        L1d0:
            int r2 = r0.strlen
            if (r9 >= r2) goto L1c1
            int r2 = r0.offset
            int r10 = r2 + r9
            r10 = r1[r10]
            int r2 = r2 + r9
            int r2 = r2 + 1
            r2 = r1[r2]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r11
            r2 = r2 | r10
            char r2 = (char) r2
            long r12 = (long) r2
            long r12 = r19 ^ r12
            long r19 = r12 * r4
            int r9 = r9 + 2
            goto L1d0
        L1ee:
            if (r2 > r11) goto L25a
            int r2 = r0.offset
            r10 = r9
            r13 = r16
        L1f5:
            int r15 = r0.strlen
            if (r10 >= r15) goto L256
            int r15 = r0.offset
            r21 = r4
            r4 = r1[r15]
            if (r4 < 0) goto L251
            if (r4 != 0) goto L208
            r5 = r1[r2]
            if (r5 != 0) goto L208
            goto L251
        L208:
            switch(r10) {
                case 0: goto L247;
                case 1: goto L241;
                case 2: goto L23a;
                case 3: goto L233;
                case 4: goto L22b;
                case 5: goto L220;
                case 6: goto L218;
                case 7: goto L20c;
                default: goto L20b;
            }
        L20b:
            goto L248
        L20c:
            long r4 = (long) r4
            long r4 = r4 << r18
            r23 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
        L214:
            long r13 = r13 & r23
            long r13 = r13 + r4
            goto L248
        L218:
            long r4 = (long) r4
            long r4 = r4 << r12
            r23 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            goto L214
        L220:
            long r4 = (long) r4
            r23 = 40
            long r4 = r4 << r23
            r23 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            goto L214
        L22b:
            long r4 = (long) r4
            long r4 = r4 << r8
            r23 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L214
        L233:
            int r4 = r4 << 24
            long r4 = (long) r4
            r23 = 16777215(0xffffff, double:8.2890456E-317)
            goto L214
        L23a:
            int r4 = r4 << 16
            long r4 = (long) r4
            r23 = 65535(0xffff, double:3.23786E-319)
            goto L214
        L241:
            int r4 = r4 << 8
            long r4 = (long) r4
            r23 = 255(0xff, double:1.26E-321)
            goto L214
        L247:
            long r13 = (long) r4
        L248:
            int r15 = r15 + 1
            r0.offset = r15
            int r10 = r10 + 1
            r4 = r21
            goto L1f5
        L251:
            r0.offset = r2
        L253:
            r4 = r16
            goto L25d
        L256:
            r21 = r4
            r4 = r13
            goto L25d
        L25a:
            r21 = r4
            goto L253
        L25d:
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 == 0) goto L262
            goto L296
        L262:
            r4 = r19
        L264:
            int r2 = r0.strlen
            if (r9 >= r2) goto L296
            int r2 = r0.offset
            int r10 = r2 + 1
            r0.offset = r10
            r2 = r1[r2]
            long r12 = (long) r2
            long r4 = r4 ^ r12
            long r4 = r4 * r21
            int r9 = r9 + 1
            goto L264
        L277:
            r4 = r19
        L279:
            int r2 = r0.strlen
            if (r9 >= r2) goto L296
            int r2 = r0.offset
            int r10 = r2 + r9
            r10 = r1[r10]
            int r2 = r2 + r9
            int r2 = r2 + 1
            r2 = r1[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << r11
            r2 = r2 | r10
            char r2 = (char) r2
            long r12 = (long) r2
            long r4 = r4 ^ r12
            long r4 = r4 * r21
            int r9 = r9 + 2
            goto L279
        L296:
            int r2 = r0.offset
            r1 = r1[r2]
            r0.type = r1
            if (r1 < r7) goto L2a5
            if (r1 > r6) goto L2a5
            int r2 = r2 + 1
            r0.offset = r2
            goto L2a9
        L2a5:
            int r1 = r0.readInt32Value()
        L2a9:
            if (r1 != 0) goto L2b8
            int r1 = r0.strBegin
            r0.symbol0Begin = r1
            int r1 = r0.strlen
            r0.symbol0Length = r1
            r0.symbol0StrType = r3
            r0.symbol0Hash = r4
            return r4
        L2b8:
            int r1 = r1 * 2
            int r2 = r1 + 2
            long[] r6 = r0.symbols
            if (r6 != 0) goto L2c9
            int r2 = java.lang.Math.max(r2, r8)
            long[] r2 = new long[r2]
            r0.symbols = r2
            goto L2d4
        L2c9:
            int r7 = r6.length
            if (r7 >= r2) goto L2d4
            int r2 = r1 + 18
            long[] r2 = java.util.Arrays.copyOf(r6, r2)
            r0.symbols = r2
        L2d4:
            int r2 = r0.strBegin
            long r6 = (long) r2
            long r6 = r6 << r8
            int r2 = r0.strlen
            long r8 = (long) r2
            long r8 = r8 << r11
            long r6 = r6 + r8
            long r2 = (long) r3
            long r6 = r6 + r2
            long[] r2 = r0.symbols
            int r1 = r1 + 1
            r2[r1] = r6
            return r4
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.util.UUID readUUID() {
            r21 = this;
            r0 = r21
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 1
            r0.offset = r3
            r4 = r1[r2]
            r5 = -111(0xffffffffffffff91, float:NaN)
            r6 = 16
            if (r4 == r5) goto L20c
            r5 = -81
            if (r4 == r5) goto L20a
            r5 = 105(0x69, float:1.47E-43)
            r8 = 32
            if (r4 == r5) goto L1d4
            r5 = 109(0x6d, float:1.53E-43)
            java.lang.String r12 = "Invalid UUID string:  "
            r15 = 14
            r16 = 9
            r7 = 23
            r17 = 4
            r9 = 18
            r10 = 13
            r11 = 8
            r20 = 24
            r13 = 36
            r14 = 45
            if (r4 == r5) goto L133
            r2 = 121(0x79, float:1.7E-43)
            if (r4 == r2) goto L44
            r2 = 122(0x7a, float:1.71E-43)
            if (r4 != r2) goto L3f
            goto L44
        L3f:
            com.alibaba.fastjson2.JSONException r1 = notSupportType(r4)
            throw r1
        L44:
            int r2 = r0.readLength()
            if (r2 != r8) goto L7f
            r2 = 0
            r7 = 0
        L4d:
            if (r7 >= r6) goto L61
            long r2 = r2 << r17
            byte[] r4 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r5 = r0.offset
            int r5 = r5 + r7
            r5 = r1[r5]
            int r5 = r5 + (-48)
            r4 = r4[r5]
            long r4 = (long) r4
            long r2 = r2 + r4
            int r7 = r7 + 1
            goto L4d
        L61:
            r10 = 0
        L63:
            if (r6 >= r8) goto L78
            long r4 = r10 << r17
            byte[] r7 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r9 = r0.offset
            int r9 = r9 + r6
            r9 = r1[r9]
            int r9 = r9 + (-48)
            r7 = r7[r9]
            long r9 = (long) r7
            long r10 = r4 + r9
            int r6 = r6 + 1
            goto L63
        L78:
            int r1 = r0.offset
            int r1 = r1 + r8
            r0.offset = r1
            goto L242
        L7f:
            int r3 = r0.offset
            if (r2 != r13) goto L11e
            int r2 = r3 + 8
            r2 = r1[r2]
            int r4 = r3 + 13
            r4 = r1[r4]
            int r5 = r3 + 18
            r5 = r1[r5]
            int r3 = r3 + r7
            r3 = r1[r3]
            if (r2 != r14) goto L115
            if (r4 != r14) goto L115
            if (r5 != r14) goto L115
            if (r3 != r14) goto L115
            r2 = 0
            r3 = 0
        L9d:
            if (r2 >= r11) goto Lb1
            long r3 = r3 << r17
            byte[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r6 = r0.offset
            int r6 = r6 + r2
            r6 = r1[r6]
            int r6 = r6 + (-48)
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 + r5
            int r2 = r2 + 1
            goto L9d
        Lb1:
            r2 = r16
        Lb3:
            if (r2 >= r10) goto Lc7
            long r3 = r3 << r17
            byte[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r6 = r0.offset
            int r6 = r6 + r2
            r6 = r1[r6]
            int r6 = r6 + (-48)
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 + r5
            int r2 = r2 + 1
            goto Lb3
        Lc7:
            if (r15 >= r9) goto Ldc
            long r2 = r3 << r17
            byte[] r4 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r5 = r0.offset
            int r5 = r5 + r15
            r5 = r1[r5]
            int r5 = r5 + (-48)
            r4 = r4[r5]
            long r4 = (long) r4
            long r3 = r2 + r4
            int r15 = r15 + 1
            goto Lc7
        Ldc:
            r10 = 0
            r14 = 19
        Le0:
            if (r14 >= r7) goto Lf5
            long r5 = r10 << r17
            byte[] r2 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r8 = r0.offset
            int r8 = r8 + r14
            r8 = r1[r8]
            int r8 = r8 + (-48)
            r2 = r2[r8]
            long r8 = (long) r2
            long r10 = r5 + r8
            int r14 = r14 + 1
            goto Le0
        Lf5:
            r2 = r20
        Lf7:
            if (r2 >= r13) goto L10c
            long r5 = r10 << r17
            byte[] r7 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r8 = r0.offset
            int r8 = r8 + r2
            r8 = r1[r8]
            int r8 = r8 + (-48)
            r7 = r7[r8]
            long r7 = (long) r7
            long r10 = r5 + r7
            int r2 = r2 + 1
            goto Lf7
        L10c:
            int r1 = r0.offset
            int r1 = r1 + r13
            r0.offset = r1
            r18 = r10
            r10 = r3
            goto L119
        L115:
            r10 = 0
            r18 = 0
        L119:
            r2 = r10
            r10 = r18
            goto L242
        L11e:
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r4.<init>(r1, r3, r2, r5)
            int r1 = r0.offset
            int r1 = r1 + r2
            r0.offset = r1
            java.lang.String r1 = r12.concat(r4)
            ah.a.w(r1)
            r1 = 0
            return r1
        L133:
            int r4 = r2 + 9
            r4 = r1[r4]
            int r5 = r2 + 14
            r5 = r1[r5]
            int r6 = r2 + 19
            r6 = r1[r6]
            int r2 = r2 + 24
            r2 = r1[r2]
            if (r4 != r14) goto L1c4
            if (r5 != r14) goto L1c4
            if (r6 != r14) goto L1c4
            if (r2 != r14) goto L1c4
            r2 = 0
            r3 = 0
        L14e:
            if (r2 >= r11) goto L162
            long r3 = r3 << r17
            byte[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r6 = r0.offset
            int r6 = r6 + r2
            r6 = r1[r6]
            int r6 = r6 + (-48)
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 + r5
            int r2 = r2 + 1
            goto L14e
        L162:
            r2 = r16
        L164:
            if (r2 >= r10) goto L178
            long r3 = r3 << r17
            byte[] r5 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r6 = r0.offset
            int r6 = r6 + r2
            r6 = r1[r6]
            int r6 = r6 + (-48)
            r5 = r5[r6]
            long r5 = (long) r5
            long r3 = r3 + r5
            int r2 = r2 + 1
            goto L164
        L178:
            r2 = r3
        L179:
            if (r15 >= r9) goto L18d
            long r2 = r2 << r17
            byte[] r4 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r5 = r0.offset
            int r5 = r5 + r15
            r5 = r1[r5]
            int r5 = r5 + (-48)
            r4 = r4[r5]
            long r4 = (long) r4
            long r2 = r2 + r4
            int r15 = r15 + 1
            goto L179
        L18d:
            r10 = 0
            r14 = 19
        L191:
            if (r14 >= r7) goto L1a6
            long r4 = r10 << r17
            byte[] r6 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r8 = r0.offset
            int r8 = r8 + r14
            r8 = r1[r8]
            int r8 = r8 + (-48)
            r6 = r6[r8]
            long r8 = (long) r6
            long r10 = r4 + r8
            int r14 = r14 + 1
            goto L191
        L1a6:
            r4 = r20
        L1a8:
            if (r4 >= r13) goto L1bd
            long r5 = r10 << r17
            byte[] r7 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r8 = r0.offset
            int r8 = r8 + r4
            r8 = r1[r8]
            int r8 = r8 + (-48)
            r7 = r7[r8]
            long r7 = (long) r7
            long r10 = r5 + r7
            int r4 = r4 + 1
            goto L1a8
        L1bd:
            int r1 = r0.offset
            int r1 = r1 + r13
            r0.offset = r1
            goto L242
        L1c4:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.ISO_8859_1
            r2.<init>(r1, r3, r13, r4)
            java.lang.String r1 = r12.concat(r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L1d4:
            r17 = 4
            r2 = 0
            r7 = 0
        L1d9:
            if (r7 >= r6) goto L1ed
            long r2 = r2 << r17
            byte[] r4 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r5 = r0.offset
            int r5 = r5 + r7
            r5 = r1[r5]
            int r5 = r5 + (-48)
            r4 = r4[r5]
            long r4 = (long) r4
            long r2 = r2 + r4
            int r7 = r7 + 1
            goto L1d9
        L1ed:
            r10 = 0
        L1ef:
            if (r6 >= r8) goto L204
            long r4 = r10 << r17
            byte[] r7 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r9 = r0.offset
            int r9 = r9 + r6
            r9 = r1[r9]
            int r9 = r9 + (-48)
            r7 = r7[r9]
            long r9 = (long) r7
            long r10 = r4 + r9
            int r6 = r6 + 1
            goto L1ef
        L204:
            int r1 = r0.offset
            int r1 = r1 + r8
            r0.offset = r1
            goto L242
        L20a:
            r1 = 0
            return r1
        L20c:
            int r2 = r0.readLength()
            if (r2 != r6) goto L248
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r3 = com.alibaba.fastjson2.util.JDKUtils.ARRAY_BYTE_BASE_OFFSET
            int r5 = r0.offset
            long r7 = (long) r5
            long r7 = r7 + r3
            long r7 = r2.getLong(r1, r7)
            int r5 = r0.offset
            long r9 = (long) r5
            long r3 = r3 + r9
            r9 = 8
            long r3 = r3 + r9
            long r1 = r2.getLong(r1, r3)
            int r3 = r0.offset
            int r3 = r3 + r6
            r0.offset = r3
            boolean r3 = com.alibaba.fastjson2.util.JDKUtils.BIG_ENDIAN
            if (r3 == 0) goto L234
            r4 = r7
            goto L238
        L234:
            long r4 = java.lang.Long.reverseBytes(r7)
        L238:
            if (r3 == 0) goto L23c
        L23a:
            r10 = r1
            goto L241
        L23c:
            long r1 = java.lang.Long.reverseBytes(r1)
            goto L23a
        L241:
            r2 = r4
        L242:
            java.util.UUID r1 = new java.util.UUID
            r1.<init>(r2, r10)
            return r1
        L248:
            java.lang.String r1 = "uuid not support "
            java.lang.String r1 = eh.a.l(r2, r1)
            ah.a.w(r1)
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public long readValueHashCode() {
            r36 = this;
            r0 = r36
            byte[] r1 = r0.bytes
            int r2 = r0.offset
            int r3 = r2 + 1
            r0.offset = r3
            r2 = r1[r2]
            r0.strtype = r2
            r0.strBegin = r3
            r3 = 73
            r4 = 127(0x7f, float:1.78E-43)
            if (r2 < r3) goto L1f
            r3 = 120(0x78, float:1.68E-43)
            if (r2 > r3) goto L1f
            int r3 = r2 + (-73)
            r0.strlen = r3
            goto L50
        L1f:
            r3 = 121(0x79, float:1.7E-43)
            if (r2 == r3) goto L46
            r3 = 122(0x7a, float:1.71E-43)
            if (r2 == r3) goto L46
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L46
            r3 = 124(0x7c, float:1.74E-43)
            if (r2 == r3) goto L46
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 != r3) goto L34
            goto L46
        L34:
            if (r2 != r4) goto L41
            int r3 = r0.readLength()
            r0.strlen = r3
            int r3 = r0.offset
            r0.strBegin = r3
            goto L50
        L41:
            com.alibaba.fastjson2.JSONException r1 = r0.readStringError()
            throw r1
        L46:
            int r3 = r0.readLength()
            r0.strlen = r3
            int r3 = r0.offset
            r0.strBegin = r3
        L50:
            int r3 = r0.strlen
            if (r3 >= 0) goto L5c
            com.alibaba.fastjson2.SymbolTable r1 = r0.symbolTable
            int r2 = -r3
            long r1 = r1.getHashCode(r2)
            return r1
        L5c:
            r5 = 122(0x7a, float:1.71E-43)
            r8 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            r10 = 2
            if (r2 != r5) goto Lb2
            int r2 = r0.offset
            int r2 = r2 + r3
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L6e:
            int r3 = r0.offset
            if (r3 >= r2) goto Lb1
            r4 = r1[r3]
            if (r4 < 0) goto L7b
            int r3 = r3 + 1
            r0.offset = r3
            goto Lac
        L7b:
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r5 = r4 >> 4
            switch(r5) {
                case 12: goto L9f;
                case 13: goto L9f;
                case 14: goto L8c;
                default: goto L82;
            }
        L82:
            java.lang.String r1 = "malformed input around byte "
            int r2 = r0.offset
            ah.a.y(r2, r1)
            r1 = 0
            return r1
        L8c:
            int r5 = r3 + 1
            r5 = r1[r5]
            int r11 = r3 + 2
            r11 = r1[r11]
            int r4 = com.alibaba.fastjson2.JSONReaderUTF8.char2_utf8(r4, r5, r11, r3)
            int r3 = r0.offset
            int r3 = r3 + 3
            r0.offset = r3
            goto Lac
        L9f:
            int r5 = r3 + 1
            r5 = r1[r5]
            int r4 = com.alibaba.fastjson2.JSONReaderUTF8.char2_utf8(r4, r5, r3)
            int r3 = r0.offset
            int r3 = r3 + r10
            r0.offset = r3
        Lac:
            long r3 = (long) r4
            long r3 = r3 ^ r6
            long r6 = r3 * r8
            goto L6e
        Lb1:
            return r6
        Lb2:
            r5 = 123(0x7b, float:1.72E-43)
            r11 = 255(0xff, double:1.26E-321)
            r13 = 65535(0xffff, double:3.23786E-319)
            r15 = 16777215(0xffffff, double:8.2890456E-317)
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r19 = 32
            r20 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
            r22 = 40
            r23 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            r25 = 48
            r26 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            r28 = 56
            r29 = 0
            r6 = 16
            r32 = 0
            r7 = 8
            if (r2 != r5) goto L1bc
            int r2 = r0.offset
            r5 = r1[r2]
            r34 = r8
            r8 = -2
            if (r5 != r8) goto L16e
            int r8 = r2 + 1
            r8 = r1[r8]
            r9 = -1
            if (r8 != r9) goto L16e
            if (r3 > r6) goto L14d
            r3 = r10
            r5 = r32
        Lf7:
            int r8 = r0.strlen
            if (r3 >= r8) goto L148
            int r8 = r2 + r3
            r9 = r1[r8]
            int r8 = r8 + 1
            r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r7
            r8 = r8 | r9
            char r8 = (char) r8
            if (r8 > r4) goto L146
            if (r3 != 0) goto L111
            if (r8 != 0) goto L111
            goto L146
        L111:
            byte r8 = (byte) r8
            int r9 = r3 + (-2)
            int r9 = r9 >> 1
            switch(r9) {
                case 0: goto L142;
                case 1: goto L13d;
                case 2: goto L138;
                case 3: goto L133;
                case 4: goto L12d;
                case 5: goto L127;
                case 6: goto L121;
                case 7: goto L11a;
                default: goto L119;
            }
        L119:
            goto L143
        L11a:
            long r8 = (long) r8
            long r8 = r8 << r28
            long r5 = r5 & r26
        L11f:
            long r5 = r5 + r8
            goto L143
        L121:
            long r8 = (long) r8
            long r8 = r8 << r25
            long r5 = r5 & r23
            goto L11f
        L127:
            long r8 = (long) r8
            long r8 = r8 << r22
            long r5 = r5 & r20
            goto L11f
        L12d:
            long r8 = (long) r8
            long r8 = r8 << r19
            long r5 = r5 & r17
            goto L11f
        L133:
            int r8 = r8 << 24
            long r8 = (long) r8
            long r5 = r5 & r15
            goto L11f
        L138:
            int r8 = r8 << 16
            long r8 = (long) r8
            long r5 = r5 & r13
            goto L11f
        L13d:
            int r8 = r8 << 8
            long r8 = (long) r8
            long r5 = r5 & r11
            goto L11f
        L142:
            long r5 = (long) r8
        L143:
            int r3 = r3 + 2
            goto Lf7
        L146:
            r5 = r32
        L148:
            int r3 = (r5 > r32 ? 1 : (r5 == r32 ? 0 : -1))
            if (r3 == 0) goto L14d
            return r5
        L14d:
            r30 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L152:
            int r3 = r0.strlen
            if (r10 >= r3) goto L16d
            int r3 = r2 + r10
            r4 = r1[r3]
            int r3 = r3 + 1
            r3 = r1[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r3 = r3 | r4
            char r3 = (char) r3
            long r3 = (long) r3
            long r3 = r30 ^ r3
            long r30 = r3 * r34
            int r10 = r10 + 2
            goto L152
        L16d:
            return r30
        L16e:
            r3 = -1
            if (r5 != r3) goto L199
            int r3 = r2 + 1
            r3 = r1[r3]
            r4 = -2
            if (r3 != r4) goto L199
            r30 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L17d:
            int r3 = r0.strlen
            if (r10 >= r3) goto L198
            int r3 = r2 + r10
            r4 = r1[r3]
            int r3 = r3 + 1
            r3 = r1[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r7
            r3 = r3 | r4
            char r3 = (char) r3
            long r3 = (long) r3
            long r3 = r30 ^ r3
            long r30 = r3 * r34
            int r10 = r10 + 2
            goto L17d
        L198:
            return r30
        L199:
            r3 = r29
            r30 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L1a0:
            int r4 = r0.strlen
            if (r3 >= r4) goto L1bb
            int r4 = r2 + r3
            r5 = r1[r4]
            int r4 = r4 + 1
            r4 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r4 = r4 | r5
            char r4 = (char) r4
            long r4 = (long) r4
            long r4 = r30 ^ r4
            long r30 = r4 * r34
            int r3 = r3 + 2
            goto L1a0
        L1bb:
            return r30
        L1bc:
            r34 = r8
            r5 = 125(0x7d, float:1.75E-43)
            if (r2 != r5) goto L241
            int r2 = r0.offset
            if (r3 > r6) goto L21e
            r3 = r29
            r5 = r32
        L1ca:
            int r8 = r0.strlen
            if (r3 >= r8) goto L219
            int r8 = r2 + r3
            r9 = r1[r8]
            int r8 = r8 + 1
            r8 = r1[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << r7
            r8 = r8 | r9
            char r8 = (char) r8
            if (r8 > r4) goto L217
            if (r3 != 0) goto L1e4
            if (r8 != 0) goto L1e4
            goto L217
        L1e4:
            byte r8 = (byte) r8
            int r9 = r3 >> 1
            switch(r9) {
                case 0: goto L213;
                case 1: goto L20e;
                case 2: goto L209;
                case 3: goto L204;
                case 4: goto L1fe;
                case 5: goto L1f8;
                case 6: goto L1f2;
                case 7: goto L1eb;
                default: goto L1ea;
            }
        L1ea:
            goto L214
        L1eb:
            long r8 = (long) r8
            long r8 = r8 << r28
            long r5 = r5 & r26
        L1f0:
            long r5 = r5 + r8
            goto L214
        L1f2:
            long r8 = (long) r8
            long r8 = r8 << r25
            long r5 = r5 & r23
            goto L1f0
        L1f8:
            long r8 = (long) r8
            long r8 = r8 << r22
            long r5 = r5 & r20
            goto L1f0
        L1fe:
            long r8 = (long) r8
            long r8 = r8 << r19
            long r5 = r5 & r17
            goto L1f0
        L204:
            int r8 = r8 << 24
            long r8 = (long) r8
            long r5 = r5 & r15
            goto L1f0
        L209:
            int r8 = r8 << 16
            long r8 = (long) r8
            long r5 = r5 & r13
            goto L1f0
        L20e:
            int r8 = r8 << 8
            long r8 = (long) r8
            long r5 = r5 & r11
            goto L1f0
        L213:
            long r5 = (long) r8
        L214:
            int r3 = r3 + 2
            goto L1ca
        L217:
            r5 = r32
        L219:
            int r3 = (r5 > r32 ? 1 : (r5 == r32 ? 0 : -1))
            if (r3 == 0) goto L21e
            return r5
        L21e:
            r3 = r29
            r30 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L225:
            int r4 = r0.strlen
            if (r3 >= r4) goto L240
            int r4 = r2 + r3
            r5 = r1[r4]
            int r4 = r4 + 1
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << r7
            r4 = r4 | r5
            char r4 = (char) r4
            long r4 = (long) r4
            long r4 = r30 ^ r4
            long r30 = r4 * r34
            int r3 = r3 + 2
            goto L225
        L240:
            return r30
        L241:
            r5 = 124(0x7c, float:1.74E-43)
            if (r2 != r5) goto L2c4
            int r2 = r0.offset
            if (r3 > r6) goto L2a1
            r3 = r29
            r5 = r32
        L24d:
            int r8 = r0.strlen
            if (r3 >= r8) goto L29c
            int r8 = r2 + r3
            r9 = r1[r8]
            int r8 = r8 + 1
            r8 = r1[r8]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r7
            r8 = r8 | r9
            char r8 = (char) r8
            if (r8 > r4) goto L29a
            if (r3 != 0) goto L267
            if (r8 != 0) goto L267
            goto L29a
        L267:
            byte r8 = (byte) r8
            int r9 = r3 >> 1
            switch(r9) {
                case 0: goto L296;
                case 1: goto L291;
                case 2: goto L28c;
                case 3: goto L287;
                case 4: goto L281;
                case 5: goto L27b;
                case 6: goto L275;
                case 7: goto L26e;
                default: goto L26d;
            }
        L26d:
            goto L297
        L26e:
            long r8 = (long) r8
            long r8 = r8 << r28
            long r5 = r5 & r26
        L273:
            long r5 = r5 + r8
            goto L297
        L275:
            long r8 = (long) r8
            long r8 = r8 << r25
            long r5 = r5 & r23
            goto L273
        L27b:
            long r8 = (long) r8
            long r8 = r8 << r22
            long r5 = r5 & r20
            goto L273
        L281:
            long r8 = (long) r8
            long r8 = r8 << r19
            long r5 = r5 & r17
            goto L273
        L287:
            int r8 = r8 << 24
            long r8 = (long) r8
            long r5 = r5 & r15
            goto L273
        L28c:
            int r8 = r8 << 16
            long r8 = (long) r8
            long r5 = r5 & r13
            goto L273
        L291:
            int r8 = r8 << 8
            long r8 = (long) r8
            long r5 = r5 & r11
            goto L273
        L296:
            long r5 = (long) r8
        L297:
            int r3 = r3 + 2
            goto L24d
        L29a:
            r5 = r32
        L29c:
            int r3 = (r5 > r32 ? 1 : (r5 == r32 ? 0 : -1))
            if (r3 == 0) goto L2a1
            return r5
        L2a1:
            r3 = r29
            r30 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L2a8:
            int r4 = r0.strlen
            if (r3 >= r4) goto L2c3
            int r4 = r2 + r3
            r5 = r1[r4]
            int r4 = r4 + 1
            r4 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r7
            r4 = r4 | r5
            char r4 = (char) r4
            long r4 = (long) r4
            long r4 = r30 ^ r4
            long r30 = r4 * r34
            int r3 = r3 + 2
            goto L2a8
        L2c3:
            return r30
        L2c4:
            if (r3 > r7) goto L31a
            int r2 = r0.offset
            r3 = r29
            r4 = r32
        L2cc:
            int r6 = r0.strlen
            if (r3 >= r6) goto L315
            int r6 = r0.offset
            r7 = r1[r6]
            if (r7 < 0) goto L311
            if (r7 != 0) goto L2dd
            r8 = r1[r2]
            if (r8 != 0) goto L2dd
            goto L311
        L2dd:
            switch(r3) {
                case 0: goto L309;
                case 1: goto L304;
                case 2: goto L2ff;
                case 3: goto L2fa;
                case 4: goto L2f4;
                case 5: goto L2ee;
                case 6: goto L2e8;
                case 7: goto L2e1;
                default: goto L2e0;
            }
        L2e0:
            goto L30a
        L2e1:
            long r7 = (long) r7
            long r7 = r7 << r28
            long r4 = r4 & r26
        L2e6:
            long r4 = r4 + r7
            goto L30a
        L2e8:
            long r7 = (long) r7
            long r7 = r7 << r25
            long r4 = r4 & r23
            goto L2e6
        L2ee:
            long r7 = (long) r7
            long r7 = r7 << r22
            long r4 = r4 & r20
            goto L2e6
        L2f4:
            long r7 = (long) r7
            long r7 = r7 << r19
            long r4 = r4 & r17
            goto L2e6
        L2fa:
            int r7 = r7 << 24
            long r7 = (long) r7
            long r4 = r4 & r15
            goto L2e6
        L2ff:
            int r7 = r7 << 16
            long r7 = (long) r7
            long r4 = r4 & r13
            goto L2e6
        L304:
            int r7 = r7 << 8
            long r7 = (long) r7
            long r4 = r4 & r11
            goto L2e6
        L309:
            long r4 = (long) r7
        L30a:
            int r6 = r6 + 1
            r0.offset = r6
            int r3 = r3 + 1
            goto L2cc
        L311:
            r0.offset = r2
            r4 = r32
        L315:
            int r2 = (r4 > r32 ? 1 : (r4 == r32 ? 0 : -1))
            if (r2 == 0) goto L31a
            return r4
        L31a:
            r2 = r29
            r6 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
        L321:
            int r3 = r0.strlen
            if (r2 >= r3) goto L334
            int r3 = r0.offset
            int r4 = r3 + 1
            r0.offset = r4
            r3 = r1[r3]
            long r3 = (long) r3
            long r3 = r3 ^ r6
            long r6 = r3 * r34
            int r2 = r2 + 1
            goto L321
        L334:
            return r6
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public java.time.ZonedDateTime readZonedDateTime() {
            r12 = this;
            byte[] r0 = r12.bytes
            int r1 = r12.offset
            int r2 = r1 + 1
            r12.offset = r2
            r3 = r0[r1]
            r4 = -86
            if (r3 != r4) goto L78
            int r3 = r1 + 2
            r12.offset = r3
            r2 = r0[r2]
            int r2 = r2 << 8
            int r4 = r1 + 3
            r12.offset = r4
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r2 + r3
            int r2 = r1 + 4
            r12.offset = r2
            r6 = r0[r4]
            int r3 = r1 + 5
            r12.offset = r3
            r7 = r0[r2]
            int r2 = r1 + 6
            r12.offset = r2
            r8 = r0[r3]
            int r3 = r1 + 7
            r12.offset = r3
            r9 = r0[r2]
            int r1 = r1 + 8
            r12.offset = r1
            r10 = r0[r3]
            int r11 = r12.readInt32Value()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r5, r6, r7, r8, r9, r10, r11)
            long r1 = r12.readValueHashCode()
            r3 = -4800907791268808639(0xbd5fbfccd6047841, double:-4.511835427849096E-13)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L56
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            goto L72
        L56:
            java.lang.String r1 = r12.getString()
            com.alibaba.fastjson2.JSONReader$Context r2 = r12.context
            java.time.ZoneId r2 = r2.getZoneId()
            java.lang.String r3 = r2.getId()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L6c
            r1 = r2
            goto L72
        L6c:
            java.time.ZoneId r2 = com.alibaba.fastjson2.util.DateUtils.SHANGHAI_ZONE_ID
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.getZoneId(r1, r2)
        L72:
            r2 = 0
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r1, r2)
            return r0
        L78:
            java.time.ZonedDateTime r0 = r12.readZonedDateTime0(r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public final java.time.ZonedDateTime readZonedDateTimeX(int r5) {
            r4 = this;
            byte[] r0 = r4.bytes
            int r1 = r4.offset
            r2 = r0[r1]
            r4.type = r2
            r3 = 73
            if (r2 < r3) goto L33
            r3 = 120(0x78, float:1.68E-43)
            if (r2 > r3) goto L33
            r2 = 19
            if (r5 < r2) goto L28
            int r1 = r1 + 1
            com.alibaba.fastjson2.JSONReader$Context r2 = r4.context
            java.time.ZoneId r2 = r2.zoneId
            java.time.ZonedDateTime r0 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(r0, r1, r5, r2)
            if (r0 == 0) goto L28
            int r1 = r4.offset
            int r5 = r5 + 1
            int r5 = r5 + r1
            r4.offset = r5
            return r0
        L28:
            java.lang.String r5 = "illegal LocalDateTime string : "
            java.lang.String r0 = r4.readString()
            ah.a.i(r0, r5)
        L31:
            r5 = 0
            return r5
        L33:
            java.lang.String r5 = "date only support string input"
            ah.a.w(r5)
            goto L31
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void reset(com.alibaba.fastjson2.JSONReader.SavePoint r2) {
            r1 = this;
            int r0 = r2.offset
            r1.offset = r0
            int r2 = r2.current
            byte r2 = (byte) r2
            r1.type = r2
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void skipComment() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public boolean skipName() {
            r6 = this;
            byte[] r0 = r6.bytes
            int r1 = r6.offset
            int r2 = r1 + 1
            r6.offset = r2
            r1 = r0[r1]
            r6.strtype = r1
            r3 = 1
            r4 = 73
            if (r1 < r4) goto L1a
            r5 = 120(0x78, float:1.68E-43)
            if (r1 > r5) goto L1a
            int r1 = r1 - r4
            int r1 = r1 + r2
            r6.offset = r1
            return r3
        L1a:
            r4 = 121(0x79, float:1.7E-43)
            if (r1 == r4) goto L4d
            r4 = 122(0x7a, float:1.71E-43)
            if (r1 == r4) goto L4d
            r4 = 123(0x7b, float:1.72E-43)
            if (r1 == r4) goto L4d
            r4 = 124(0x7c, float:1.74E-43)
            if (r1 == r4) goto L4d
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 != r4) goto L2f
            goto L4d
        L2f:
            r4 = 127(0x7f, float:1.78E-43)
            if (r1 != r4) goto L48
            r0 = r0[r2]
            r1 = -16
            if (r0 < r1) goto L41
            r1 = 72
            if (r0 > r1) goto L41
            r6.readInt32Value()
            return r3
        L41:
            r6.readString()
            r6.readInt32Value()
            return r3
        L48:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r1)
            throw r0
        L4d:
            int r0 = r6.readLength()
            r6.strlen = r0
            int r1 = r6.offset
            int r1 = r1 + r0
            r6.offset = r1
            return r3
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public void skipValue() {
            r6 = this;
            byte[] r0 = r6.bytes
            int r1 = r6.offset
            int r2 = r1 + 1
            r6.offset = r2
            r0 = r0[r1]
            r3 = 72
            if (r0 == r3) goto L176
            r3 = 73
            if (r0 == r3) goto L175
            switch(r0) {
                case -111: goto L16c;
                case -110: goto L165;
                case -109: goto L151;
                case -108: goto L175;
                default: goto L15;
            }
        L15:
            r4 = -1
            switch(r0) {
                case -90: goto Lff;
                case -89: goto Lf7;
                case -88: goto Lef;
                case -87: goto L176;
                case -86: goto Le4;
                case -85: goto Ldf;
                case -84: goto L176;
                case -83: goto L176;
                default: goto L19;
            }
        L19:
            switch(r0) {
                case -81: goto L175;
                case -80: goto L175;
                case -79: goto L175;
                default: goto L1c;
            }
        L1c:
            switch(r0) {
                case -76: goto Ldb;
                case -75: goto Ldf;
                case -74: goto Ld7;
                case -73: goto L176;
                case -72: goto Ld3;
                case -71: goto Lcc;
                default: goto L1f;
            }
        L1f:
            switch(r0) {
                case -68: goto Lc7;
                case -67: goto Lc2;
                case -66: goto Ldf;
                case -65: goto L176;
                default: goto L22;
            }
        L22:
            switch(r0) {
                case 121: goto Lb8;
                case 122: goto Lb8;
                case 123: goto Lb8;
                case 124: goto Lb8;
                case 125: goto Lb8;
                default: goto L25;
            }
        L25:
            r5 = -16
            if (r0 < r5) goto L2f
            r5 = 47
            if (r0 > r5) goto L2f
            goto L175
        L2f:
            r5 = -40
            if (r0 < r5) goto L39
            r5 = -17
            if (r0 > r5) goto L39
            goto L175
        L39:
            r5 = 48
            if (r0 < r5) goto L46
            r5 = 63
            if (r0 > r5) goto L46
            int r1 = r1 + 2
            r6.offset = r1
            return
        L46:
            r5 = 64
            if (r0 < r5) goto L53
            r5 = 71
            if (r0 > r5) goto L53
            int r1 = r1 + 3
            r6.offset = r1
            return
        L53:
            if (r0 < r3) goto L5e
            r5 = 120(0x78, float:1.68E-43)
            if (r0 > r5) goto L5e
            int r0 = r0 - r3
            int r0 = r0 + r2
            r6.offset = r0
            return
        L5e:
            r2 = -56
            if (r0 < r2) goto L6b
            r2 = -41
            if (r0 > r2) goto L6b
            int r1 = r1 + 2
            r6.offset = r1
            return
        L6b:
            r2 = -64
            if (r0 < r2) goto L78
            r2 = -57
            if (r0 > r2) goto L78
            int r1 = r1 + 3
            r6.offset = r1
            return
        L78:
            r1 = -108(0xffffffffffffff94, float:NaN)
            if (r0 < r1) goto Lb3
            r2 = -92
            if (r0 > r2) goto Lb3
            if (r0 != r2) goto L87
            int r0 = r6.readInt32Value()
            goto L88
        L87:
            int r0 = r0 - r1
        L88:
            r1 = 0
        L89:
            if (r1 >= r0) goto L175
            byte[] r2 = com.alibaba.fastjson2.JSONReaderJSONB.FIXED_TYPE_SIZE
            byte[] r3 = r6.bytes
            int r5 = r6.offset
            r3 = r3[r5]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2[r3]
            if (r2 <= 0) goto L9d
            int r5 = r5 + r2
            r6.offset = r5
            goto Lb0
        L9d:
            if (r2 != r4) goto Lad
            int r5 = r5 + 1
            r6.offset = r5
            int r2 = r6.readInt32Value()
            int r3 = r6.offset
            int r3 = r3 + r2
            r6.offset = r3
            goto Lb0
        Lad:
            r6.skipValue()
        Lb0:
            int r1 = r1 + 1
            goto L89
        Lb3:
            com.alibaba.fastjson2.JSONException r0 = notSupportType(r0)
            throw r0
        Lb8:
            int r0 = r6.readInt32Value()
            int r1 = r6.offset
            int r1 = r1 + r0
            r6.offset = r1
            return
        Lc2:
            int r1 = r1 + 2
            r6.offset = r1
            return
        Lc7:
            int r1 = r1 + 3
            r6.offset = r1
            return
        Lcc:
            r6.readInt32Value()
            r6.readBigInteger()
            return
        Ld3:
            r6.readInt64Value()
            return
        Ld7:
            r6.readInt32Value()
            return
        Ldb:
            r6.readInt64Value()
            return
        Ldf:
            int r1 = r1 + 9
            r6.offset = r1
            return
        Le4:
            int r1 = r1 + 8
            r6.offset = r1
            r6.readInt32Value()
            r6.readString()
            return
        Lef:
            int r1 = r1 + 8
            r6.offset = r1
            r6.readInt32Value()
            return
        Lf7:
            int r1 = r1 + 4
            r6.offset = r1
            r6.readInt32Value()
            return
        Lff:
            byte[] r0 = r6.bytes
            int r1 = r6.offset
            r0 = r0[r1]
            r2 = -91
            if (r0 != r2) goto L10e
            int r1 = r1 + 1
            r6.offset = r1
            return
        L10e:
            byte[] r2 = com.alibaba.fastjson2.JSONReaderJSONB.FIXED_TYPE_SIZE
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r0]
            if (r0 <= 0) goto L11a
            int r1 = r1 + r0
            r6.offset = r1
            goto L12d
        L11a:
            if (r0 != r4) goto L12a
            int r1 = r1 + 1
            r6.offset = r1
            int r0 = r6.readInt32Value()
            int r1 = r6.offset
            int r1 = r1 + r0
            r6.offset = r1
            goto L12d
        L12a:
            r6.skipName()
        L12d:
            byte[] r0 = r6.bytes
            int r1 = r6.offset
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2[r0]
            if (r0 <= 0) goto L13d
            int r1 = r1 + r0
            r6.offset = r1
            goto Lff
        L13d:
            if (r0 != r4) goto L14d
            int r1 = r1 + 1
            r6.offset = r1
            int r0 = r6.readInt32Value()
            int r1 = r6.offset
            int r1 = r1 + r0
            r6.offset = r1
            goto Lff
        L14d:
            r6.skipValue()
            goto Lff
        L151:
            boolean r1 = r6.isString()
            if (r1 == 0) goto L15b
            r6.skipName()
            return
        L15b:
            java.lang.String r1 = "skip not support type "
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r0)
            ah.a.i(r0, r1)
            return
        L165:
            r6.readTypeHashCode()
            r6.skipValue()
            return
        L16c:
            int r0 = r6.readInt32Value()
            int r1 = r6.offset
            int r1 = r1 + r0
            r6.offset = r1
        L175:
            return
        L176:
            int r1 = r1 + 5
            r6.offset = r1
            return
    }

    @Override // com.alibaba.fastjson2.JSONReader
    public int startArray() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.offset
            int r2 = r1 + 1
            r3.offset = r2
            r0 = r0[r1]
            r3.type = r0
            r1 = -81
            if (r0 != r1) goto L12
            r0 = -1
            return r0
        L12:
            r1 = -108(0xffffffffffffff94, float:NaN)
            if (r0 < r1) goto L20
            r2 = -93
            if (r0 > r2) goto L20
            int r2 = -r0
            char r2 = (char) r2
            r3.f1814ch = r2
            int r0 = r0 - r1
            return r0
        L20:
            r1 = -111(0xffffffffffffff91, float:NaN)
            if (r0 != r1) goto L29
            int r0 = r3.readInt32Value()
            return r0
        L29:
            r1 = -92
            if (r0 != r1) goto L32
            int r0 = r3.readInt32Value()
            return r0
        L32:
            java.lang.String r1 = "array not support input "
            java.lang.String r0 = r3.error(r0)
            ah.a.i(r0, r1)
            r0 = 0
            return r0
    }
}
