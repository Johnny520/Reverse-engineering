package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface JSONB {

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Constants {
        public static final int ARRAY_FIX_LEN = 15;
        public static final byte BC_ARRAY = -92;
        public static final byte BC_ARRAY_FIX_0 = -108;
        public static final byte BC_ARRAY_FIX_MAX = -93;
        public static final byte BC_ARRAY_FIX_MIN = -108;
        public static final byte BC_BIGINT = -69;
        public static final byte BC_BIGINT_LONG = -70;
        public static final byte BC_BINARY = -111;
        public static final byte BC_CHAR = -112;
        public static final byte BC_DECIMAL = -71;
        public static final byte BC_DECIMAL_LONG = -72;
        public static final byte BC_DOUBLE = -75;
        public static final byte BC_DOUBLE_LONG = -76;
        public static final byte BC_DOUBLE_NUM_0 = -78;
        public static final byte BC_DOUBLE_NUM_1 = -77;
        public static final byte BC_FALSE = -80;
        public static final byte BC_FLOAT = -73;
        public static final byte BC_FLOAT_INT = -74;
        public static final byte BC_INT16 = -68;
        public static final byte BC_INT32 = 72;
        public static final byte BC_INT32_BYTE_MAX = 63;
        public static final byte BC_INT32_BYTE_MIN = 48;
        public static final byte BC_INT32_BYTE_ZERO = 56;
        public static final byte BC_INT32_NUM_0 = 0;
        public static final byte BC_INT32_NUM_1 = 1;
        public static final byte BC_INT32_NUM_16 = 16;
        public static final byte BC_INT32_NUM_MAX = 47;
        public static final byte BC_INT32_NUM_MIN = -16;
        public static final byte BC_INT32_SHORT_MAX = 71;
        public static final byte BC_INT32_SHORT_MIN = 64;
        public static final byte BC_INT32_SHORT_ZERO = 68;
        public static final byte BC_INT64 = -66;
        public static final byte BC_INT64_BYTE_MAX = -41;
        public static final byte BC_INT64_BYTE_MIN = -56;
        public static final byte BC_INT64_BYTE_ZERO = -48;
        public static final byte BC_INT64_INT = -65;
        public static final byte BC_INT64_NUM_MAX = -17;
        public static final byte BC_INT64_NUM_MIN = -40;
        public static final byte BC_INT64_SHORT_MAX = -57;
        public static final byte BC_INT64_SHORT_MIN = -64;
        public static final byte BC_INT64_SHORT_ZERO = -60;
        public static final byte BC_INT8 = -67;
        public static final byte BC_LOCAL_DATE = -87;
        public static final byte BC_LOCAL_DATETIME = -88;
        public static final byte BC_LOCAL_TIME = -89;
        public static final byte BC_NULL = -81;
        public static final byte BC_OBJECT = -90;
        public static final byte BC_OBJECT_END = -91;
        public static final byte BC_REFERENCE = -109;
        public static final byte BC_STR_ASCII = 121;
        public static final byte BC_STR_ASCII_FIX_0 = 73;
        public static final byte BC_STR_ASCII_FIX_1 = 74;
        public static final byte BC_STR_ASCII_FIX_32 = 105;
        public static final byte BC_STR_ASCII_FIX_36 = 109;
        public static final byte BC_STR_ASCII_FIX_4 = 77;
        public static final byte BC_STR_ASCII_FIX_5 = 78;
        public static final byte BC_STR_ASCII_FIX_MAX = 120;
        public static final byte BC_STR_ASCII_FIX_MIN = 73;
        public static final byte BC_STR_GB18030 = 126;
        public static final byte BC_STR_UTF16 = 123;
        public static final byte BC_STR_UTF16BE = 125;
        public static final byte BC_STR_UTF16LE = 124;
        public static final byte BC_STR_UTF8 = 122;
        public static final byte BC_SYMBOL = 127;
        public static final byte BC_TIMESTAMP = -82;
        public static final byte BC_TIMESTAMP_MILLIS = -85;
        public static final byte BC_TIMESTAMP_MINUTES = -83;
        public static final byte BC_TIMESTAMP_SECONDS = -84;
        public static final byte BC_TIMESTAMP_WITH_TIMEZONE = -86;
        public static final byte BC_TRUE = -79;
        public static final byte BC_TYPED_ANY = -110;
        public static final int INT32_BYTE_MAX = 2047;
        public static final int INT32_BYTE_MIN = -2048;
        public static final int INT32_SHORT_MAX = 262143;
        public static final int INT32_SHORT_MIN = -262144;
        public static final int INT64_BYTE_MAX = 2047;
        public static final int INT64_BYTE_MIN = -2048;
        public static final int INT64_NUM_HIGH_VALUE = 15;
        public static final int INT64_NUM_LOW_VALUE = -8;
        public static final int INT64_SHORT_MAX = 262143;
        public static final int INT64_SHORT_MIN = -262144;
        public static final int STR_ASCII_FIX_LEN = 47;
    }

    static <T> T copy(T r0, com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.copy(r0, r1)
            return r0
    }

    static void dump(byte[] r2) {
            java.io.PrintStream r0 = java.lang.System.out
            r1 = 1
            java.lang.String r2 = toJSONString(r2, r1)
            r0.println(r2)
            return
    }

    static void dump(byte[] r2, com.alibaba.fastjson2.SymbolTable r3) {
            com.alibaba.fastjson2.JSONBDump r0 = new com.alibaba.fastjson2.JSONBDump
            r1 = 1
            r0.<init>(r2, r3, r1)
            java.lang.String r2 = r0.toString()
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
            return
    }

    static byte[] fromJSONBytes(byte[] r6) {
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r6)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.getObjectReader(r6)
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r6 = r0.readObject(r1, r2, r3, r4)
            byte[] r6 = toBytes(r6)
            return r6
    }

    static byte[] fromJSONString(java.lang.String r0) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.parse(r0)
            byte[] r0 = toBytes(r0)
            return r0
    }

    static java.lang.Object parse(java.io.InputStream r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.readAny()     // Catch: java.lang.Throwable -> L11
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r2 = r0.resolveTasks     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L13
            r0.handleResolveTasks(r1)     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r1 = move-exception
            goto L17
        L13:
            r0.close()
            return r1
        L17:
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r2 = move-exception
            r1.addSuppressed(r2)
        L1f:
            throw r1
    }

    static java.lang.Object parse(byte[] r3, com.alibaba.fastjson2.JSONReader.Context r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1 = 0
            int r2 = r3.length
            r0.<init>(r4, r3, r1, r2)
            java.lang.Object r3 = r0.readAny()     // Catch: java.lang.Throwable -> L13
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r0.resolveTasks     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L15
            r0.handleResolveTasks(r3)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r3 = move-exception
            goto L19
        L15:
            r0.close()
            return r3
        L19:
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r4 = move-exception
            r3.addSuppressed(r4)
        L21:
            throw r3
    }

    static java.lang.Object parse(byte[] r8, com.alibaba.fastjson2.SymbolTable r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r9, r10)
            long r9 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r9 = r9 & r2
            r2 = 0
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = r10
        L18:
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r2 = r8.length
            r3.<init>(r1, r8, r10, r2)
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r8, r9)     // Catch: java.lang.Throwable -> L34
            r5 = 0
            r6 = 0
            r4 = 0
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L37
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            r8 = r0
            goto L3b
        L37:
            r3.close()
            return r8
        L3b:
            r3.close()     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L44:
            throw r8
    }

    static java.lang.Object parse(byte[] r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r10.mask
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            if (r10 == 0) goto L17
            r10 = 1
            goto L18
        L17:
            r10 = r2
        L18:
            com.alibaba.fastjson2.JSONReaderJSONB r4 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r3 = r9.length
            r4.<init>(r1, r9, r2, r3)
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r9, r10)     // Catch: java.lang.Throwable -> L34
            r6 = 0
            r7 = 0
            r5 = 0
            java.lang.Object r9 = r3.readJSONBObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L34
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r10 = r4.resolveTasks     // Catch: java.lang.Throwable -> L34
            if (r10 == 0) goto L37
            r4.handleResolveTasks(r9)     // Catch: java.lang.Throwable -> L34
            goto L37
        L34:
            r0 = move-exception
            r9 = r0
            goto L3b
        L37:
            r4.close()
            return r9
        L3b:
            r4.close()     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L44:
            throw r9
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.io.InputStream r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r0.<init>(r2, r1)
            java.util.List r1 = r0.readArray()     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONArray r1 = (com.alibaba.fastjson2.JSONArray) r1     // Catch: java.lang.Throwable -> L13
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r2 = r0.resolveTasks     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            r0.handleResolveTasks(r1)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L19
        L15:
            r0.close()
            return r1
        L19:
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r2 = move-exception
            r1.addSuppressed(r2)
        L21:
            throw r1
    }

    static com.alibaba.fastjson2.JSONArray parseArray(byte[] r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2)
            r2 = 0
            int r3 = r4.length
            r0.<init>(r1, r4, r2, r3)
            java.util.List r4 = r0.readArray()     // Catch: java.lang.Throwable -> L1c
            com.alibaba.fastjson2.JSONArray r4 = (com.alibaba.fastjson2.JSONArray) r4     // Catch: java.lang.Throwable -> L1c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r1 = r0.resolveTasks     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            r0.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L22
        L1e:
            r0.close()
            return r4
        L22:
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r0 = move-exception
            r4.addSuppressed(r0)
        L2a:
            throw r4
    }

    static <T> java.util.List<T> parseArray(byte[] r4, java.lang.reflect.Type r5) {
            r0 = 0
            if (r4 == 0) goto L3e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L3e
        L7:
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r1 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r1.<init>(r2, r0, r5)
            com.alibaba.fastjson2.JSONReaderJSONB r5 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r2)
            int r2 = r4.length
            r5.<init>(r0, r4, r3, r2)
            java.lang.Object r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L2f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r5.resolveTasks     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L31
            r5.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = move-exception
            goto L35
        L31:
            r5.close()
            return r4
        L35:
            r5.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r5 = move-exception
            r4.addSuppressed(r5)
        L3d:
            throw r4
        L3e:
            return r0
    }

    static <T> java.util.List<T> parseArray(byte[] r4, java.lang.reflect.Type r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            r0 = 0
            if (r4 == 0) goto L3e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L3e
        L7:
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r1 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r1.<init>(r2, r0, r5)
            com.alibaba.fastjson2.JSONReaderJSONB r5 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r2, r6)
            int r6 = r4.length
            r5.<init>(r0, r4, r3, r6)
            java.lang.Object r4 = r5.read(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L2f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r5.resolveTasks     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L31
            r5.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r4 = move-exception
            goto L35
        L31:
            r5.close()
            return r4
        L35:
            r5.close()     // Catch: java.lang.Throwable -> L39
            goto L3d
        L39:
            r5 = move-exception
            r4.addSuppressed(r5)
        L3d:
            throw r4
        L3e:
            return r0
    }

    static <T> java.util.List<T> parseArray(byte[] r4, java.lang.reflect.Type... r5) {
            if (r4 == 0) goto L2f
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L2f
        L6:
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2)
            r2 = 0
            int r3 = r4.length
            r0.<init>(r1, r4, r2, r3)
            java.util.List r4 = r0.readList(r5)     // Catch: java.lang.Throwable -> L20
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r5 = r0.resolveTasks     // Catch: java.lang.Throwable -> L20
            if (r5 == 0) goto L22
            r0.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r4 = move-exception
            goto L26
        L22:
            r0.close()
            return r4
        L26:
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            r4.addSuppressed(r5)
        L2e:
            throw r4
        L2f:
            r4 = 0
            return r4
    }

    static <T> java.util.List<T> parseArray(byte[] r3, java.lang.reflect.Type[] r4, com.alibaba.fastjson2.JSONReader.Feature... r5) {
            if (r3 == 0) goto L2f
            int r0 = r3.length
            if (r0 != 0) goto L6
            goto L2f
        L6:
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2, r5)
            r5 = 0
            int r2 = r3.length
            r0.<init>(r1, r3, r5, r2)
            java.util.List r3 = r0.readList(r4)     // Catch: java.lang.Throwable -> L20
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r0.resolveTasks     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L22
            r0.handleResolveTasks(r3)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L26
        L22:
            r0.close()
            return r3
        L26:
            r0.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r4 = move-exception
            r3.addSuppressed(r4)
        L2e:
            throw r3
        L2f:
            r3 = 0
            return r3
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.io.InputStream r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r0.<init>(r2, r1)
            java.util.Map r1 = r0.readObject()     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONObject r1 = (com.alibaba.fastjson2.JSONObject) r1     // Catch: java.lang.Throwable -> L13
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r2 = r0.resolveTasks     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L15
            r0.handleResolveTasks(r1)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L19
        L15:
            r0.close()
            return r1
        L19:
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r2 = move-exception
            r1.addSuppressed(r2)
        L21:
            throw r1
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2)
            r2 = 0
            int r3 = r4.length
            r0.<init>(r1, r4, r2, r3)
            java.util.Map r4 = r0.readObject()     // Catch: java.lang.Throwable -> L1c
            com.alibaba.fastjson2.JSONObject r4 = (com.alibaba.fastjson2.JSONObject) r4     // Catch: java.lang.Throwable -> L1c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r1 = r0.resolveTasks     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            r0.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r4 = move-exception
            goto L22
        L1e:
            r0.close()
            return r4
        L22:
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r0 = move-exception
            r4.addSuppressed(r0)
        L2a:
            throw r4
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2, r4)
            r4 = 0
            int r2 = r3.length
            r0.<init>(r1, r3, r4, r2)
            java.util.Map r3 = r0.readObject()     // Catch: java.lang.Throwable -> L1c
            com.alibaba.fastjson2.JSONObject r3 = (com.alibaba.fastjson2.JSONObject) r3     // Catch: java.lang.Throwable -> L1c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r0.resolveTasks     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1e
            r0.handleResolveTasks(r3)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L22
        L1e:
            r0.close()
            return r3
        L22:
            r0.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r4 = move-exception
            r3.addSuppressed(r4)
        L2a:
            throw r3
    }

    static <T> T parseObject(java.io.InputStream r5, int r6, java.lang.reflect.Type r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            java.lang.String r0 = "deserialize failed. expected read length: "
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r1 = java.lang.System.identityHashCode(r1)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r2.length
            int r3 = r3 + (-1)
            r1 = r1 & r3
            r1 = r2[r1]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r2 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r3 = 0
            java.lang.Object r3 = r2.getAndSet(r1, r3)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L21
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]
        L21:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            if (r4 >= r6) goto L29
            byte[] r3 = new byte[r6]     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r5 = move-exception
            goto L52
        L29:
            r4 = 0
            int r5 = r5.read(r3, r4, r6)     // Catch: java.lang.Throwable -> L27
            if (r5 != r6) goto L38
            java.lang.Object r5 = parseObject(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            r2.lazySet(r1, r3)
            return r5
        L38:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r8.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = " but actual read: "
            r8.append(r6)     // Catch: java.lang.Throwable -> L27
            r8.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L27
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L27
            throw r7     // Catch: java.lang.Throwable -> L27
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r6 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r6.lazySet(r1, r3)
            throw r5
    }

    static <T> T parseObject(java.io.InputStream r5, int r6, java.lang.reflect.Type r7, com.alibaba.fastjson2.JSONReader.Feature... r8) {
            java.lang.String r0 = "deserialize failed. expected read length: "
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r1 = java.lang.System.identityHashCode(r1)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r2 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r2.length
            int r3 = r3 + (-1)
            r1 = r1 & r3
            r1 = r2[r1]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r2 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r3 = 0
            java.lang.Object r3 = r2.getAndSet(r1, r3)
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L21
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]
        L21:
            int r4 = r3.length     // Catch: java.lang.Throwable -> L27
            if (r4 >= r6) goto L29
            byte[] r3 = new byte[r6]     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r5 = move-exception
            goto L52
        L29:
            r4 = 0
            int r5 = r5.read(r3, r4, r6)     // Catch: java.lang.Throwable -> L27
            if (r5 != r6) goto L38
            java.lang.Object r5 = parseObject(r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            r2.lazySet(r1, r3)
            return r5
        L38:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r8.append(r6)     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = " but actual read: "
            r8.append(r6)     // Catch: java.lang.Throwable -> L27
            r8.append(r5)     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r8.toString()     // Catch: java.lang.Throwable -> L27
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L27
            throw r7     // Catch: java.lang.Throwable -> L27
        L52:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r6 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r6.lazySet(r1, r3)
            throw r5
    }

    static <T> T parseObject(java.io.InputStream r6, java.lang.Class r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1.<init>(r8, r6)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r7 != r6) goto L11
            java.lang.Object r6 = r1.readAny()     // Catch: java.lang.Throwable -> Le
            goto L1d
        Le:
            r0 = move-exception
            r6 = r0
            goto L28
        L11:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r7)     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r4 = 0
            r2 = r7
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Le
        L1d:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L24
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> Le
        L24:
            r1.close()
            return r6
        L28:
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L31:
            throw r6
    }

    static <T> T parseObject(java.io.InputStream r0, java.lang.Class r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            com.alibaba.fastjson2.JSONReader$Context r2 = com.alibaba.fastjson2.JSONFactory.createReadContext(r2)
            java.lang.Object r0 = parseObject(r0, r1, r2)
            return r0
    }

    static <T> T parseObject(java.io.InputStream r6, java.lang.reflect.Type r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1.<init>(r8, r6)
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r7 != r6) goto L11
            java.lang.Object r6 = r1.readAny()     // Catch: java.lang.Throwable -> Le
            goto L1d
        Le:
            r0 = move-exception
            r6 = r0
            goto L28
        L11:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r7)     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r4 = 0
            r2 = r7
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Le
        L1d:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> Le
            if (r7 == 0) goto L24
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> Le
        L24:
            r1.close()
            return r6
        L28:
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L31:
            throw r6
    }

    static <T> T parseObject(java.io.InputStream r0, java.lang.reflect.Type r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            com.alibaba.fastjson2.JSONReader$Context r2 = com.alibaba.fastjson2.JSONFactory.createReadContext(r2)
            java.lang.Object r0 = parseObject(r0, r1, r2)
            return r0
    }

    static <T> T parseObject(byte[] r8, int r9, int r10, java.lang.Class<T> r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            r3.<init>(r1, r8, r9, r10)
            long r8 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L30
            long r1 = r10.mask     // Catch: java.lang.Throwable -> L30
            long r8 = r8 & r1
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 == 0) goto L1b
            r8 = 1
            goto L1c
        L1b:
            r8 = 0
        L1c:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r11, r8)     // Catch: java.lang.Throwable -> L30
            r5 = 0
            r6 = 0
            r4 = r11
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L33
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L37
        L33:
            r3.close()
            return r8
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L40:
            throw r8
    }

    static <T> T parseObject(byte[] r6, int r7, int r8, java.lang.Class<T> r9, com.alibaba.fastjson2.SymbolTable r10) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r10 = com.alibaba.fastjson2.JSONFactory.createReadContext(r10)
            r1.<init>(r10, r6, r7, r8)
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.getObjectReader(r9)     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r4 = 0
            r2 = r9
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L20
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            r6 = r0
            goto L24
        L20:
            r1.close()
            return r6
        L24:
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L2d:
            throw r6
    }

    static <T> T parseObject(byte[] r6, int r7, int r8, java.lang.Class<T> r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            com.alibaba.fastjson2.JSONReader$Context r10 = com.alibaba.fastjson2.JSONFactory.createReadContext(r10, r11)
            com.alibaba.fastjson2.reader.ObjectReader r0 = r10.getObjectReader(r9)
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1.<init>(r10, r6, r7, r8)
            r3 = 0
            r4 = 0
            r2 = r9
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L20
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            r6 = r0
            goto L24
        L20:
            r1.close()
            return r6
        L24:
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L2d:
            throw r6
    }

    static <T> T parseObject(byte[] r10, int r11, int r12, java.lang.Class<T> r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L9:
            int r4 = r14.length
            if (r3 >= r4) goto L18
            long r4 = r1.features
            r6 = r14[r3]
            long r6 = r6.mask
            long r4 = r4 | r6
            r1.features = r4
            int r3 = r3 + 1
            goto L9
        L18:
            com.alibaba.fastjson2.JSONReaderJSONB r5 = new com.alibaba.fastjson2.JSONReaderJSONB
            r5.<init>(r1, r10, r11, r12)
            long r10 = r1.features     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson2.JSONReader$Feature r12 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L3f
            long r3 = r12.mask     // Catch: java.lang.Throwable -> L3f
            long r10 = r10 & r3
            r3 = 0
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 == 0) goto L2b
            r2 = 1
        L2b:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r13, r2)     // Catch: java.lang.Throwable -> L3f
            r7 = 0
            r8 = 0
            r6 = r13
            java.lang.Object r10 = r4.readJSONBObject(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks     // Catch: java.lang.Throwable -> L3f
            if (r11 == 0) goto L42
            r5.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = move-exception
            r10 = r0
            goto L46
        L42:
            r5.close()
            return r10
        L46:
            r5.close()     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L4f:
            throw r10
    }

    static <T> T parseObject(byte[] r8, int r9, int r10, java.lang.reflect.Type r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            r3.<init>(r1, r8, r9, r10)
            long r8 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L30
            long r1 = r10.mask     // Catch: java.lang.Throwable -> L30
            long r8 = r8 & r1
            r1 = 0
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 == 0) goto L1b
            r8 = 1
            goto L1c
        L1b:
            r8 = 0
        L1c:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r11, r8)     // Catch: java.lang.Throwable -> L30
            r5 = 0
            r6 = 0
            r4 = r11
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L33
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L37
        L33:
            r3.close()
            return r8
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L40:
            throw r8
    }

    static <T> T parseObject(byte[] r6, int r7, int r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.JSONReader.Context r10) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1.<init>(r10, r6, r7, r8)
            long r6 = r10.features     // Catch: java.lang.Throwable -> L2b
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L2b
            long r2 = r8.mask     // Catch: java.lang.Throwable -> L2b
            long r6 = r6 & r2
            r2 = 0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L14
            r6 = 1
            goto L15
        L14:
            r6 = 0
        L15:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r7 = r10.provider     // Catch: java.lang.Throwable -> L2b
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.getObjectReader(r9, r6)     // Catch: java.lang.Throwable -> L2b
            r3 = 0
            r4 = 0
            r2 = r9
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L2e
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            r6 = r0
            goto L32
        L2e:
            r1.close()
            return r6
        L32:
            r1.close()     // Catch: java.lang.Throwable -> L36
            goto L3b
        L36:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L3b:
            throw r6
    }

    static <T> T parseObject(byte[] r6, int r7, int r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.SymbolTable r10) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r10 = com.alibaba.fastjson2.JSONFactory.createReadContext(r10)
            r1.<init>(r10, r6, r7, r8)
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.getObjectReader(r9)     // Catch: java.lang.Throwable -> L1d
            r3 = 0
            r4 = 0
            r2 = r9
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L20
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            r6 = r0
            goto L24
        L20:
            r1.close()
            return r6
        L24:
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L2d:
            throw r6
    }

    static <T> T parseObject(byte[] r6, int r7, int r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            com.alibaba.fastjson2.JSONReader$Context r10 = com.alibaba.fastjson2.JSONFactory.createReadContext(r10, r11)
            com.alibaba.fastjson2.reader.ObjectReader r0 = r10.getObjectReader(r9)
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1.<init>(r10, r6, r7, r8)
            r3 = 0
            r4 = 0
            r2 = r9
            java.lang.Object r6 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r7 = r1.resolveTasks     // Catch: java.lang.Throwable -> L1d
            if (r7 == 0) goto L20
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r0 = move-exception
            r6 = r0
            goto L24
        L20:
            r1.close()
            return r6
        L24:
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r0 = move-exception
            r7 = r0
            r6.addSuppressed(r7)
        L2d:
            throw r6
    }

    static <T> T parseObject(byte[] r8, int r9, int r10, java.lang.reflect.Type r11, com.alibaba.fastjson2.JSONReader.Feature... r12) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r12)
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReader(r11)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            r3.<init>(r1, r8, r9, r10)
            r5 = 0
            r6 = 0
            r4 = r11
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L20
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L20
            if (r9 == 0) goto L23
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r0 = move-exception
            r8 = r0
            goto L27
        L23:
            r3.close()
            return r8
        L27:
            r3.close()     // Catch: java.lang.Throwable -> L2b
            goto L30
        L2b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L30:
            throw r8
    }

    static <T> T parseObject(byte[] r0, com.alibaba.fastjson2.TypeReference r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r0 = parseObject(r0, r1, r2)
            return r0
    }

    static <T> T parseObject(byte[] r10, java.lang.Class<T> r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = r3
        L18:
            com.alibaba.fastjson2.JSONReaderJSONB r5 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r4 = r10.length
            r5.<init>(r1, r10, r3, r4)
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            if (r11 != r10) goto L2a
            java.lang.Object r10 = r5.readAny()     // Catch: java.lang.Throwable -> L27
            goto L36
        L27:
            r0 = move-exception
            r10 = r0
            goto L41
        L2a:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r2)     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r6 = r11
            java.lang.Object r10 = r4.readJSONBObject(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
        L36:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L3d
            r5.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L27
        L3d:
            r5.close()
            return r10
        L41:
            r5.close()     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L4a:
            throw r10
    }

    static <T> T parseObject(byte[] r7, java.lang.Class<T> r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            com.alibaba.fastjson2.JSONReaderJSONB r1 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r0 = r7.length
            r2 = 0
            r1.<init>(r9, r7, r2, r0)
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r8 != r7) goto L2e
            byte r7 = r1.getType()     // Catch: java.lang.Throwable -> L26
            r0 = -110(0xffffffffffffff92, float:NaN)
            if (r7 != r0) goto L29
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            r5 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.checkAutoType(r2, r3, r5)     // Catch: java.lang.Throwable -> L26
            long r4 = r9.features     // Catch: java.lang.Throwable -> L26
            r3 = 0
            r2 = r8
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L69
        L26:
            r0 = move-exception
            r7 = r0
            goto L74
        L29:
            java.lang.Object r7 = r1.readAny()     // Catch: java.lang.Throwable -> L26
            goto L69
        L2e:
            r7 = r8
            long r3 = r9.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L26
            long r5 = r8.mask     // Catch: java.lang.Throwable -> L26
            long r3 = r3 & r5
            r5 = 0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L3d
            r2 = 1
        L3d:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r8 = r9.provider     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r7, r2)     // Catch: java.lang.Throwable -> L26
            long r8 = r9.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> L26
            long r2 = r2.mask     // Catch: java.lang.Throwable -> L26
            long r8 = r8 & r2
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L61
            boolean r8 = r1.isArray()     // Catch: java.lang.Throwable -> L26
            if (r8 == 0) goto L61
            boolean r8 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean     // Catch: java.lang.Throwable -> L26
            if (r8 == 0) goto L61
            r3 = 0
            r4 = 0
            r2 = r7
            java.lang.Object r7 = r0.readArrayMappingJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
            goto L69
        L61:
            r2 = r7
            r3 = 0
            r4 = 0
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L26
        L69:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r1.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r8 == 0) goto L70
            r1.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L26
        L70:
            r1.close()
            return r7
        L74:
            r1.close()     // Catch: java.lang.Throwable -> L78
            goto L7d
        L78:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L7d:
            throw r7
    }

    static <T> T parseObject(byte[] r8, java.lang.Class<T> r9, com.alibaba.fastjson2.filter.Filter r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            r1.config(r10, r11)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r10 = r8.length
            r2 = 0
            r3.<init>(r1, r8, r2, r10)
            r8 = r2
        L12:
            int r10 = r11.length     // Catch: java.lang.Throwable -> L7a
            if (r8 >= r10) goto L25
            long r4 = r1.features     // Catch: java.lang.Throwable -> L21
            r10 = r11[r8]     // Catch: java.lang.Throwable -> L21
            long r6 = r10.mask     // Catch: java.lang.Throwable -> L21
            long r4 = r4 | r6
            r1.features = r4     // Catch: java.lang.Throwable -> L21
            int r8 = r8 + 1
            goto L12
        L21:
            r0 = move-exception
            r8 = r0
            r2 = r3
            goto L7d
        L25:
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            if (r9 != r8) goto L51
            byte r8 = r3.getType()     // Catch: java.lang.Throwable -> L21
            r10 = -110(0xffffffffffffff92, float:NaN)
            if (r8 != r10) goto L4b
            r2 = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r6 = 0
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.checkAutoType(r3, r4, r6)     // Catch: java.lang.Throwable -> L47
            long r6 = r1.features     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r4 = r9
            r3 = r2
            r2 = r8
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L21
            goto L4f
        L47:
            r0 = move-exception
            r3 = r2
        L49:
            r8 = r0
            goto L7d
        L4b:
            java.lang.Object r8 = r3.readAny()     // Catch: java.lang.Throwable -> L21
        L4f:
            r2 = r3
            goto L6c
        L51:
            r4 = r9
            long r8 = r1.features     // Catch: java.lang.Throwable -> L7a
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L7a
            long r10 = r10.mask     // Catch: java.lang.Throwable -> L7a
            long r8 = r8 & r10
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L60
            r2 = 1
        L60:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r4, r2)     // Catch: java.lang.Throwable -> L7a
            r5 = 0
            r6 = 0
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r2 = r3
        L6c:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r2.resolveTasks     // Catch: java.lang.Throwable -> L74
            if (r9 == 0) goto L76
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L74
            goto L76
        L74:
            r0 = move-exception
            goto L49
        L76:
            r2.close()
            return r8
        L7a:
            r0 = move-exception
            r2 = r3
            goto L49
        L7d:
            r2.close()     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L86:
            throw r8
    }

    static <T> T parseObject(byte[] r8, java.lang.Class<T> r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r10 = r8.length
            r2 = 0
            r3.<init>(r1, r8, r2, r10)
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            if (r9 != r8) goto L3b
            byte r8 = r3.getType()     // Catch: java.lang.Throwable -> L30
            r10 = -110(0xffffffffffffff92, float:NaN)
            if (r8 != r10) goto L36
            r2 = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r6 = 0
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.checkAutoType(r3, r4, r6)     // Catch: java.lang.Throwable -> L33
            r3 = r2
            long r6 = r1.features     // Catch: java.lang.Throwable -> L30
            r5 = 0
            r2 = r8
            r4 = r9
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            goto L72
        L30:
            r0 = move-exception
        L31:
            r8 = r0
            goto L7d
        L33:
            r0 = move-exception
            r3 = r2
            goto L31
        L36:
            java.lang.Object r8 = r3.readAny()     // Catch: java.lang.Throwable -> L30
            goto L72
        L3b:
            r4 = r9
            long r8 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L30
            long r5 = r10.mask     // Catch: java.lang.Throwable -> L30
            long r8 = r8 & r5
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L4a
            r2 = 1
        L4a:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r4, r2)     // Catch: java.lang.Throwable -> L30
            long r8 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> L30
            long r0 = r10.mask     // Catch: java.lang.Throwable -> L30
            long r8 = r8 & r0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L6b
            boolean r8 = r3.isArray()     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L6b
            boolean r8 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L6b
            r5 = 0
            r6 = 0
            java.lang.Object r8 = r2.readArrayMappingJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            goto L72
        L6b:
            r5 = 0
            r6 = 0
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
        L72:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L79
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
        L79:
            r3.close()
            return r8
        L7d:
            r3.close()     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L86:
            throw r8
    }

    static <T> T parseObject(byte[] r10, java.lang.reflect.Type r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = r3
        L18:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r2)
            com.alibaba.fastjson2.JSONReaderJSONB r5 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r0 = r10.length
            r5.<init>(r1, r10, r3, r0)
            r7 = 0
            r8 = 0
            r6 = r11
            java.lang.Object r10 = r4.readJSONBObject(r5, r6, r7, r8)
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks
            if (r11 == 0) goto L31
            r5.handleResolveTasks(r10)
        L31:
            return r10
    }

    static <T> T parseObject(byte[] r9, java.lang.reflect.Type r10, com.alibaba.fastjson2.SymbolTable r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r11)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r11.mask
            long r2 = r2 & r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            if (r11 == 0) goto L17
            r11 = 1
            goto L18
        L17:
            r11 = r2
        L18:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r10, r11)
            com.alibaba.fastjson2.JSONReaderJSONB r4 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r11 = r9.length
            r4.<init>(r1, r9, r2, r11)
            r6 = 0
            r7 = 0
            r5 = r10
            java.lang.Object r9 = r3.readJSONBObject(r4, r5, r6, r7)
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r10 = r4.resolveTasks
            if (r10 == 0) goto L31
            r4.handleResolveTasks(r9)
        L31:
            return r9
    }

    static <T> T parseObject(byte[] r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10, r11)
            long r10 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r11 = 0
            if (r10 == 0) goto L17
            r10 = 1
            goto L18
        L17:
            r10 = r11
        L18:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r9, r10)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r10 = r8.length
            r3.<init>(r1, r8, r11, r10)
            r5 = 0
            r6 = 0
            r4 = r9
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L32
            if (r9 == 0) goto L35
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r0 = move-exception
            r8 = r0
            goto L39
        L35:
            r3.close()
            return r8
        L39:
            r3.close()     // Catch: java.lang.Throwable -> L3d
            goto L42
        L3d:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L42:
            throw r8
    }

    static <T> T parseObject(byte[] r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONReader.Feature... r12) {
            if (r8 == 0) goto L8f
            int r0 = r8.length
            if (r0 != 0) goto L7
            goto L8f
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10)
            r1.config(r11, r12)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r10 = r8.length
            r11 = 0
            r3.<init>(r1, r8, r11, r10)
            r8 = r11
        L19:
            int r10 = r12.length     // Catch: java.lang.Throwable -> L50
            if (r8 >= r10) goto L2d
            long r4 = r1.features     // Catch: java.lang.Throwable -> L28
            r10 = r12[r8]     // Catch: java.lang.Throwable -> L28
            long r6 = r10.mask     // Catch: java.lang.Throwable -> L28
            long r4 = r4 | r6
            r1.features = r4     // Catch: java.lang.Throwable -> L28
            int r8 = r8 + 1
            goto L19
        L28:
            r0 = move-exception
            r8 = r0
            r2 = r3
            goto L85
        L2d:
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            if (r9 != r8) goto L5c
            byte r8 = r3.getType()     // Catch: java.lang.Throwable -> L50
            r10 = -110(0xffffffffffffff92, float:NaN)
            if (r8 != r10) goto L56
            r2 = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            r6 = 0
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.checkAutoType(r3, r4, r6)     // Catch: java.lang.Throwable -> L54
            long r6 = r1.features     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r4 = r9
            r3 = r2
            r2 = r8
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L50
            r2 = r3
            goto L7a
        L50:
            r0 = move-exception
            r2 = r3
        L52:
            r8 = r0
            goto L85
        L54:
            r0 = move-exception
            goto L52
        L56:
            r2 = r3
            java.lang.Object r8 = r2.readAny()     // Catch: java.lang.Throwable -> L54
            goto L7a
        L5c:
            r4 = r9
            r2 = r3
            long r8 = r1.features     // Catch: java.lang.Throwable -> L54
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L54
            long r5 = r10.mask     // Catch: java.lang.Throwable -> L54
            long r8 = r8 & r5
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L6c
            r11 = 1
        L6c:
            com.alibaba.fastjson2.reader.ObjectReader r8 = r0.getObjectReader(r4, r11)     // Catch: java.lang.Throwable -> L54
            r5 = 0
            r6 = 0
            r3 = r2
            r2 = r8
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L50
            r2 = r3
        L7a:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r2.resolveTasks     // Catch: java.lang.Throwable -> L54
            if (r9 == 0) goto L81
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L54
        L81:
            r2.close()
            return r8
        L85:
            r2.close()     // Catch: java.lang.Throwable -> L89
            goto L8e
        L89:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L8e:
            throw r8
        L8f:
            r8 = 0
            return r8
    }

    static <T> T parseObject(byte[] r8, java.lang.reflect.Type r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10)
            com.alibaba.fastjson2.JSONReaderJSONB r3 = new com.alibaba.fastjson2.JSONReaderJSONB
            int r10 = r8.length
            r2 = 0
            r3.<init>(r1, r8, r2, r10)
            long r4 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L30
            long r6 = r8.mask     // Catch: java.lang.Throwable -> L30
            long r4 = r4 & r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L1c
            r2 = 1
        L1c:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r9, r2)     // Catch: java.lang.Throwable -> L30
            r5 = 0
            r6 = 0
            r4 = r9
            java.lang.Object r8 = r2.readJSONBObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r3.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L33
            r3.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L37
        L33:
            r3.close()
            return r8
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L40:
            throw r8
    }

    static <T> T parseObject(byte[] r1, java.lang.reflect.Type... r2) {
            com.alibaba.fastjson2.util.MultiType r0 = new com.alibaba.fastjson2.util.MultiType
            r0.<init>(r2)
            java.lang.Object r1 = parseObject(r1, r0)
            return r1
    }

    static com.alibaba.fastjson2.SymbolTable symbolTable(java.lang.String... r1) {
            com.alibaba.fastjson2.SymbolTable r0 = new com.alibaba.fastjson2.SymbolTable
            r0.<init>(r1)
            return r0
    }

    static byte[] toBytes(byte r3) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r0.writeInt8(r3)     // Catch: java.lang.Throwable -> L18
            byte[] r3 = r0.getBytes()     // Catch: java.lang.Throwable -> L18
            r0.close()
            return r3
        L18:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r0 = move-exception
            r3.addSuppressed(r0)
        L21:
            throw r3
    }

    static byte[] toBytes(int r3) {
            r0 = -16
            if (r3 < r0) goto L10
            r0 = 47
            if (r3 > r0) goto L10
            byte r3 = (byte) r3
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r3
            return r0
        L10:
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r0.writeInt32(r3)     // Catch: java.lang.Throwable -> L28
            byte[] r3 = r0.getBytes()     // Catch: java.lang.Throwable -> L28
            r0.close()
            return r3
        L28:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r3.addSuppressed(r0)
        L31:
            throw r3
    }

    static byte[] toBytes(long r3) {
            r0 = -8
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L18
            r0 = 15
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L18
            r0 = 32
            long r3 = r3 - r0
            int r3 = (int) r3
            byte r3 = (byte) r3
            r4 = 1
            byte[] r4 = new byte[r4]
            r0 = 0
            r4[r0] = r3
            return r4
        L18:
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r0.writeInt64(r3)     // Catch: java.lang.Throwable -> L30
            byte[] r3 = r0.getBytes()     // Catch: java.lang.Throwable -> L30
            r0.close()
            return r3
        L30:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            r3.addSuppressed(r4)
        L39:
            throw r3
    }

    static byte[] toBytes(java.lang.Object r9) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONWriterJSONB r3 = new com.alibaba.fastjson2.JSONWriterJSONB
            r2 = 0
            r3.<init>(r1, r2)
            if (r9 != 0) goto L16
            r3.writeNull()     // Catch: java.lang.Throwable -> L13
            goto L36
        L13:
            r0 = move-exception
            r9 = r0
            goto L3e
        L16:
            java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L13
            long r4 = r1.features     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L13
            long r6 = r1.mask     // Catch: java.lang.Throwable -> L13
            long r4 = r4 & r6
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r2, r2, r1)     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.writeJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
        L36:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L13
            r3.close()
            return r9
        L3e:
            r3.close()     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            r9.addSuppressed(r0)
        L46:
            throw r9
    }

    static byte[] toBytes(java.lang.Object r8, com.alibaba.fastjson2.JSONWriter.Context r9) {
            if (r9 != 0) goto L6
            com.alibaba.fastjson2.JSONWriter$Context r9 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
        L6:
            com.alibaba.fastjson2.JSONWriterJSONB r1 = new com.alibaba.fastjson2.JSONWriterJSONB
            r0 = 0
            r1.<init>(r9, r0)
            if (r8 != 0) goto L15
            r1.writeNull()     // Catch: java.lang.Throwable -> L12
            goto L51
        L12:
            r0 = move-exception
            r8 = r0
            goto L59
        L15:
            r1.rootObject = r8     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.JSONWriter$Path r0 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L12
            r1.path = r0     // Catch: java.lang.Throwable -> L12
            long r2 = r9.features     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L12
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L12
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2a
            r0 = 1
            goto L2b
        L2a:
            r0 = 0
        L2b:
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.writer.ObjectWriterProvider r3 = r9.provider     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriter(r2, r2, r0)     // Catch: java.lang.Throwable -> L12
            long r2 = r9.features     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray     // Catch: java.lang.Throwable -> L12
            long r6 = r9.mask     // Catch: java.lang.Throwable -> L12
            long r2 = r2 & r6
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 == 0) goto L49
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r8
            r0.writeArrayMappingJSONB(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L12
            goto L51
        L49:
            r2 = r8
            r4 = 0
            r5 = 0
            r3 = 0
            r0.writeJSONB(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L12
        L51:
            byte[] r8 = r1.getBytes()     // Catch: java.lang.Throwable -> L12
            r1.close()
            return r8
        L59:
            r1.close()     // Catch: java.lang.Throwable -> L5d
            goto L62
        L5d:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L62:
            throw r8
    }

    static byte[] toBytes(java.lang.Object r9, com.alibaba.fastjson2.SymbolTable r10) {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONWriterJSONB r3 = new com.alibaba.fastjson2.JSONWriterJSONB
            r3.<init>(r0, r10)
            if (r9 != 0) goto L15
            r3.writeNull()     // Catch: java.lang.Throwable -> L12
            goto L28
        L12:
            r0 = move-exception
            r9 = r0
            goto L30
        L15:
            r3.setRootObject(r9)     // Catch: java.lang.Throwable -> L12
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r10, r10)     // Catch: java.lang.Throwable -> L12
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.writeJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12
        L28:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L12
            r3.close()
            return r9
        L30:
            r3.close()     // Catch: java.lang.Throwable -> L34
            goto L39
        L34:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L39:
            throw r9
    }

    static byte[] toBytes(java.lang.Object r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            com.alibaba.fastjson2.JSONWriterJSONB r3 = new com.alibaba.fastjson2.JSONWriterJSONB
            r3.<init>(r1, r10)
            if (r9 != 0) goto L15
            r3.writeNull()     // Catch: java.lang.Throwable -> L12
            goto L4c
        L12:
            r0 = move-exception
            r9 = r0
            goto L54
        L15:
            r3.setRootObject(r9)     // Catch: java.lang.Throwable -> L12
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L12
            long r4 = r1.features     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L12
            long r6 = r11.mask     // Catch: java.lang.Throwable -> L12
            long r4 = r4 & r6
            r6 = 0
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L2b
            r11 = 1
            goto L2c
        L2b:
            r11 = 0
        L2c:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r10, r10, r11)     // Catch: java.lang.Throwable -> L12
            long r10 = r1.features     // Catch: java.lang.Throwable -> L12
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray     // Catch: java.lang.Throwable -> L12
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L12
            long r10 = r10 & r0
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 == 0) goto L44
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12
            goto L4c
        L44:
            r4 = r9
            r6 = 0
            r7 = 0
            r5 = 0
            r2.writeJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12
        L4c:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L12
            r3.close()
            return r9
        L54:
            r3.close()     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5d:
            throw r9
    }

    static byte[] toBytes(java.lang.Object r9, com.alibaba.fastjson2.SymbolTable r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONWriter.Feature... r12) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r12)
            r1.configFilter(r11)
            com.alibaba.fastjson2.JSONWriterJSONB r3 = new com.alibaba.fastjson2.JSONWriterJSONB
            r3.<init>(r1, r10)
            if (r9 != 0) goto L18
            r3.writeNull()     // Catch: java.lang.Throwable -> L15
            goto L4f
        L15:
            r0 = move-exception
            r9 = r0
            goto L57
        L18:
            r3.setRootObject(r9)     // Catch: java.lang.Throwable -> L15
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L15
            long r11 = r1.features     // Catch: java.lang.Throwable -> L15
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L15
            long r4 = r2.mask     // Catch: java.lang.Throwable -> L15
            long r11 = r11 & r4
            r4 = 0
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L2e
            r11 = 1
            goto L2f
        L2e:
            r11 = 0
        L2f:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r10, r10, r11)     // Catch: java.lang.Throwable -> L15
            long r10 = r1.features     // Catch: java.lang.Throwable -> L15
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray     // Catch: java.lang.Throwable -> L15
            long r0 = r12.mask     // Catch: java.lang.Throwable -> L15
            long r10 = r10 & r0
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 == 0) goto L47
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15
            goto L4f
        L47:
            r4 = r9
            r6 = 0
            r7 = 0
            r5 = 0
            r2.writeJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L15
        L4f:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L15
            r3.close()
            return r9
        L57:
            r3.close()     // Catch: java.lang.Throwable -> L5b
            goto L60
        L5b:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L60:
            throw r9
    }

    static byte[] toBytes(java.lang.Object r9, com.alibaba.fastjson2.JSONWriter.Feature... r10) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r10)
            com.alibaba.fastjson2.JSONWriterJSONB r3 = new com.alibaba.fastjson2.JSONWriterJSONB
            r10 = 0
            r3.<init>(r1, r10)
            if (r9 != 0) goto L16
            r3.writeNull()     // Catch: java.lang.Throwable -> L13
            goto L50
        L13:
            r0 = move-exception
            r9 = r0
            goto L58
        L16:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONWriter$Path r10 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L13
            r3.path = r10     // Catch: java.lang.Throwable -> L13
            long r4 = r1.features     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L13
            long r6 = r10.mask     // Catch: java.lang.Throwable -> L13
            long r4 = r4 & r6
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L2b
            r10 = 1
            goto L2c
        L2b:
            r10 = 0
        L2c:
            java.lang.Class r2 = r9.getClass()     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r2, r2, r10)     // Catch: java.lang.Throwable -> L13
            long r0 = r1.features     // Catch: java.lang.Throwable -> L13
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray     // Catch: java.lang.Throwable -> L13
            long r4 = r10.mask     // Catch: java.lang.Throwable -> L13
            long r0 = r0 & r4
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 == 0) goto L48
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
            goto L50
        L48:
            r4 = r9
            r6 = 0
            r7 = 0
            r5 = 0
            r2.writeJSONB(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L13
        L50:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L13
            r3.close()
            return r9
        L58:
            r3.close()     // Catch: java.lang.Throwable -> L5c
            goto L61
        L5c:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L61:
            throw r9
    }

    static byte[] toBytes(java.lang.String r3) {
            if (r3 != 0) goto Lb
            r3 = 1
            byte[] r3 = new byte[r3]
            r0 = -81
            r1 = 0
            r3[r1] = r0
            return r3
        Lb:
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r0.writeString(r3)     // Catch: java.lang.Throwable -> L23
            byte[] r3 = r0.getBytes()     // Catch: java.lang.Throwable -> L23
            r0.close()
            return r3
        L23:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r0 = move-exception
            r3.addSuppressed(r0)
        L2c:
            throw r3
    }

    static byte[] toBytes(java.lang.String r6, java.nio.charset.Charset r7) {
            r0 = 1
            r1 = 0
            if (r6 != 0) goto Lb
            byte[] r6 = new byte[r0]
            r7 = -81
            r6[r1] = r7
            return r6
        Lb:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            if (r7 != r2) goto L12
            r2 = 123(0x7b, float:1.72E-43)
            goto L48
        L12:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            if (r7 != r2) goto L19
            r2 = 125(0x7d, float:1.75E-43)
            goto L48
        L19:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            if (r7 != r2) goto L20
            r2 = 124(0x7c, float:1.74E-43)
            goto L48
        L20:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            if (r7 != r2) goto L27
            r2 = 122(0x7a, float:1.71E-43)
            goto L48
        L27:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            if (r7 == r2) goto L46
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r7 != r2) goto L30
            goto L46
        L30:
            if (r7 == 0) goto L41
            java.lang.String r2 = "GB18030"
            java.lang.String r3 = r7.name()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L41
            r2 = 126(0x7e, float:1.77E-43)
            goto L48
        L41:
            byte[] r6 = toBytes(r6)
            return r6
        L46:
            r2 = 121(0x79, float:1.7E-43)
        L48:
            byte[] r6 = r6.getBytes(r7)
            int r7 = r6.length
            int r3 = r7 + 2
            int r4 = r6.length
            r5 = 47
            if (r4 > r5) goto L55
            goto L68
        L55:
            int r3 = r6.length
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r3 > r4) goto L5d
            int r3 = r7 + 3
            goto L68
        L5d:
            int r3 = r6.length
            r4 = 262143(0x3ffff, float:3.6734E-40)
            if (r3 > r4) goto L66
            int r3 = r7 + 4
            goto L68
        L66:
            int r3 = r7 + 6
        L68:
            byte[] r7 = new byte[r3]
            r7[r1] = r2
            int r2 = r6.length
            int r2 = writeInt(r7, r0, r2)
            int r2 = r2 + r0
            int r0 = r6.length
            java.lang.System.arraycopy(r6, r1, r7, r2, r0)
            return r7
    }

    static byte[] toBytes(short r3) {
            com.alibaba.fastjson2.JSONWriterJSONB r0 = new com.alibaba.fastjson2.JSONWriterJSONB
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r1.<init>(r2)
            r2 = 0
            r0.<init>(r1, r2)
            r0.writeInt16(r3)     // Catch: java.lang.Throwable -> L18
            byte[] r3 = r0.getBytes()     // Catch: java.lang.Throwable -> L18
            r0.close()
            return r3
        L18:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r0 = move-exception
            r3.addSuppressed(r0)
        L21:
            throw r3
    }

    static byte[] toBytes(boolean r2) {
            if (r2 == 0) goto L5
            r2 = -79
            goto L7
        L5:
            r2 = -80
        L7:
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r2
            return r0
    }

    static java.lang.String toJSONString(byte[] r2) {
            com.alibaba.fastjson2.JSONBDump r0 = new com.alibaba.fastjson2.JSONBDump
            r1 = 0
            r0.<init>(r2, r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static java.lang.String toJSONString(byte[] r2, com.alibaba.fastjson2.SymbolTable r3) {
            com.alibaba.fastjson2.JSONBDump r0 = new com.alibaba.fastjson2.JSONBDump
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    static java.lang.String toJSONString(byte[] r1, boolean r2) {
            com.alibaba.fastjson2.JSONBDump r0 = new com.alibaba.fastjson2.JSONBDump
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    static java.lang.String typeName(byte r3) {
            r0 = 72
            java.lang.String r1 = "INT32 "
            if (r3 == r0) goto L1fc
            r0 = 127(0x7f, float:1.78E-43)
            if (r3 == r0) goto L1f0
            switch(r3) {
                case -111: goto L1e4;
                case -110: goto L1d8;
                case -109: goto L1cc;
                default: goto Ld;
            }
        Ld:
            java.lang.String r0 = "INT64 "
            switch(r3) {
                case -91: goto L1c0;
                case -90: goto L1b4;
                case -89: goto L1a8;
                case -88: goto L19c;
                case -87: goto L190;
                case -86: goto L184;
                case -85: goto L178;
                case -84: goto L16c;
                case -83: goto L160;
                case -82: goto L154;
                case -81: goto L148;
                case -80: goto L13c;
                case -79: goto L130;
                case -78: goto L124;
                case -77: goto L124;
                case -76: goto L124;
                case -75: goto L124;
                case -74: goto L118;
                case -73: goto L118;
                case -72: goto L10c;
                case -71: goto L10c;
                case -70: goto L100;
                case -69: goto L100;
                case -68: goto Lf4;
                case -67: goto Le8;
                case -66: goto Lde;
                case -65: goto Lde;
                default: goto L12;
            }
        L12:
            switch(r3) {
                case 122: goto Ld2;
                case 123: goto Lc6;
                case 124: goto Lba;
                case 125: goto Lae;
                default: goto L15;
            }
        L15:
            r2 = -108(0xffffffffffffff94, float:NaN)
            if (r3 < r2) goto L29
            r2 = -92
            if (r3 > r2) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ARRAY "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L29:
            r2 = 73
            if (r3 < r2) goto L3d
            r2 = 121(0x79, float:1.7E-43)
            if (r3 > r2) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "STR_ASCII "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L3d:
            r2 = -16
            if (r3 < r2) goto L4f
            r2 = 47
            if (r3 > r2) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L4f:
            r2 = 48
            if (r3 < r2) goto L61
            r2 = 63
            if (r3 > r2) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L61:
            r2 = 64
            if (r3 < r2) goto L73
            r2 = 71
            if (r3 > r2) goto L73
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L73:
            r1 = -40
            if (r3 < r1) goto L85
            r1 = -17
            if (r3 > r1) goto L85
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r3 = bc.e.f(r3, r1)
            return r3
        L85:
            r1 = -56
            if (r3 < r1) goto L97
            r1 = -41
            if (r3 > r1) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r3 = bc.e.f(r3, r1)
            return r3
        L97:
            r1 = -64
            if (r3 < r1) goto La9
            r1 = -57
            if (r3 > r1) goto La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r3 = bc.e.f(r3, r1)
            return r3
        La9:
            java.lang.String r3 = java.lang.Integer.toString(r3)
            return r3
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "STR_UTF16BE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        Lba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "STR_UTF16LE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        Lc6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "STR_UTF16 "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        Ld2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "STR_UTF8 "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        Lde:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r3 = bc.e.f(r3, r1)
            return r3
        Le8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "INT8 "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        Lf4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "INT16 "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L100:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BIGINT "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L10c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DECIMAL "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L118:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FLOAT "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L124:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DOUBLE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L130:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TRUE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L13c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FALSE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NULL "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L154:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TIMESTAMP "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L160:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TIMESTAMP_MINUTES "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L16c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TIMESTAMP_SECONDS "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L178:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TIMESTAMP_MILLIS "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L184:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TIMESTAMP_WITH_TIMEZONE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L190:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LOCAL_DATE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L19c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LOCAL_DATETIME "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1a8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LOCAL_TIME "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OBJECT "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1c0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OBJECT_END "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1cc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "REFERENCE "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1d8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TYPED_ANY "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1e4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BINARY "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1f0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SYMBOL "
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
        L1fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r3 = bc.e.f(r3, r0)
            return r3
    }

    static int writeInt(byte[] r3, int r4, int r5) {
            r0 = -16
            r1 = 1
            if (r5 < r0) goto Ld
            r0 = 47
            if (r5 > r0) goto Ld
            byte r5 = (byte) r5
            r3[r4] = r5
            return r1
        Ld:
            r0 = -2048(0xfffffffffffff800, float:NaN)
            r2 = 2
            if (r5 < r0) goto L22
            r0 = 2047(0x7ff, float:2.868E-42)
            if (r5 > r0) goto L22
            int r0 = r5 >> 8
            int r0 = r0 + 56
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + r1
            byte r5 = (byte) r5
            r3[r4] = r5
            return r2
        L22:
            r0 = -262144(0xfffffffffffc0000, float:NaN)
            if (r5 < r0) goto L3f
            r0 = 262143(0x3ffff, float:3.6734E-40)
            if (r5 > r0) goto L3f
            int r0 = r5 >> 16
            int r0 = r0 + 68
            byte r0 = (byte) r0
            r3[r4] = r0
            int r0 = r4 + 1
            int r1 = r5 >> 8
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + r2
            byte r5 = (byte) r5
            r3[r4] = r5
            r3 = 3
            return r3
        L3f:
            r0 = 72
            r3[r4] = r0
            int r0 = r4 + 1
            int r1 = r5 >>> 24
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 2
            int r1 = r5 >>> 16
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r4 + 3
            int r1 = r5 >>> 8
            byte r1 = (byte) r1
            r3[r0] = r1
            int r4 = r4 + 4
            byte r5 = (byte) r5
            r3[r4] = r5
            r3 = 5
            return r3
    }

    static int writeTo(java.io.OutputStream r7, java.lang.Object r8, com.alibaba.fastjson2.JSONWriter.Feature... r9) {
            com.alibaba.fastjson2.JSONWriterJSONB r1 = new com.alibaba.fastjson2.JSONWriterJSONB     // Catch: java.io.IOException -> L3e
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context     // Catch: java.io.IOException -> L3e
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider     // Catch: java.io.IOException -> L3e
            r0.<init>(r2)     // Catch: java.io.IOException -> L3e
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L3e
            r1.config(r9)     // Catch: java.lang.Throwable -> L16
            if (r8 != 0) goto L19
            r1.writeNull()     // Catch: java.lang.Throwable -> L16
            goto L2c
        L16:
            r0 = move-exception
            r7 = r0
            goto L34
        L19:
            r1.setRootObject(r8)     // Catch: java.lang.Throwable -> L16
            java.lang.Class r9 = r8.getClass()     // Catch: java.lang.Throwable -> L16
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.getObjectWriter(r9, r9)     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r8
            r0.writeJSONB(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L16
        L2c:
            int r7 = r1.flushTo(r7)     // Catch: java.lang.Throwable -> L16
            r1.close()     // Catch: java.io.IOException -> L3e
            return r7
        L34:
            r1.close()     // Catch: java.lang.Throwable -> L38
            goto L3d
        L38:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch: java.io.IOException -> L3e
        L3d:
            throw r7     // Catch: java.io.IOException -> L3e
        L3e:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "writeJSONString error"
            ah.a.x(r8, r7)
            r7 = 0
            return r7
    }
}
