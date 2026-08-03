package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class JSONFactory {
    static final com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONArray> ARRAY_READER = null;
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory.CacheItem, byte[]> BYTES_UPDATER = null;
    static final char[] CA = null;
    static final com.alibaba.fastjson2.JSONFactory.CacheItem[] CACHE_ITEMS = null;
    static final int CACHE_THRESHOLD = 1048576;
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory.CacheItem, char[]> CHARS_UPDATER = null;
    static final int[] DIGITS2 = null;
    static final double[] DOUBLE_10_POW = null;
    static final java.lang.Double DOUBLE_ZERO = null;
    static final float[] FLOAT_10_POW = null;
    static final java.math.BigDecimal HIGH = null;
    static final java.math.BigInteger HIGH_BIGINT = null;
    static java.util.function.Supplier JSON_ARRAY_1x_SUPPLIER = null;
    static java.lang.Class JSON_ARRAY_CLASS_1x = null;
    static java.util.function.Function JSON_OBJECT_1x_BUILDER = null;
    static java.util.function.Function JSON_OBJECT_1x_INNER_MAP = null;
    static java.util.function.Supplier JSON_OBJECT_1x_SUPPLIER = null;
    static java.lang.Class JSON_OBJECT_CLASS_1x = null;
    static volatile boolean JSON_REFLECT_1x_ERROR = false;
    static final java.math.BigDecimal LOW = null;
    static final java.math.BigInteger LOW_BIGINT = null;
    static final com.alibaba.fastjson2.util.NameCacheEntry[] NAME_CACHE = null;
    static final com.alibaba.fastjson2.JSONFactory.NameCacheEntry2[] NAME_CACHE2 = null;
    static final com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONObject> OBJECT_READER = null;
    static final char[] UUID_LOOKUP = null;
    static final byte[] UUID_VALUES = null;
    static java.util.function.Supplier<java.util.List> defaultArraySupplier = null;
    static int defaultDecimalMaxScale = 2048;
    public static final com.alibaba.fastjson2.reader.ObjectReaderProvider defaultObjectReaderProvider = null;
    static java.util.function.Supplier<java.util.Map> defaultObjectSupplier;
    public static final com.alibaba.fastjson2.writer.ObjectWriterProvider defaultObjectWriterProvider = null;
    static long defaultReaderFeatures;
    static java.lang.String defaultReaderFormat;
    static java.time.ZoneId defaultReaderZoneId;
    static long defaultWriterFeatures;
    static java.lang.String defaultWriterFormat;
    static java.time.ZoneId defaultWriterZoneId;

    /* JADX INFO: renamed from: com.alibaba.fastjson2.JSONFactory$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class CacheItem {
        volatile byte[] bytes;
        volatile char[] chars;

        public CacheItem() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FJ1ObjectInnerSupplier implements java.util.function.Function {
        private FJ1ObjectInnerSupplier() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ FJ1ObjectInnerSupplier(com.alibaba.fastjson2.JSONFactory.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Function
        public java.lang.Object apply(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.alibaba.fastjson.JSONObject
                if (r0 == 0) goto Lb
                com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2
                java.util.Map r2 = r2.getInnerMap()
                return r2
            Lb:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class FJ1OjbectBuilder implements java.util.function.Function {
        private FJ1OjbectBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ FJ1OjbectBuilder(com.alibaba.fastjson2.JSONFactory.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Function
        public java.lang.Object apply(java.lang.Object r2) {
                r1 = this;
                com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
                java.util.Map r2 = (java.util.Map) r2
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class NameCacheEntry2 {
        final java.lang.String name;
        final long value0;
        final long value1;

        public NameCacheEntry2(java.lang.String r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.value0 = r2
                r0.value1 = r4
                return
        }
    }

    static {
            r0 = 8192(0x2000, float:1.148E-41)
            com.alibaba.fastjson2.util.NameCacheEntry[] r1 = new com.alibaba.fastjson2.util.NameCacheEntry[r0]
            com.alibaba.fastjson2.JSONFactory.NAME_CACHE = r1
            com.alibaba.fastjson2.JSONFactory$NameCacheEntry2[] r0 = new com.alibaba.fastjson2.JSONFactory.NameCacheEntry2[r0]
            com.alibaba.fastjson2.JSONFactory.NAME_CACHE2 = r0
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            com.alibaba.fastjson2.JSONFactory.LOW = r2
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r2)
            com.alibaba.fastjson2.JSONFactory.HIGH = r4
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            com.alibaba.fastjson2.JSONFactory.LOW_BIGINT = r0
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r2)
            com.alibaba.fastjson2.JSONFactory.HIGH_BIGINT = r0
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {x0100: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            com.alibaba.fastjson2.JSONFactory.CA = r0
            r0 = 103(0x67, float:1.44E-43)
            int[] r0 = new int[r0]
            r0 = {x0144: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15} // fill-array
            com.alibaba.fastjson2.JSONFactory.DIGITS2 = r0
            r0 = 11
            float[] r0 = new float[r0]
            r0 = {x0216: FILL_ARRAY_DATA , data: [1065353216, 1092616192, 1120403456, 1148846080, 1176256512, 1203982336, 1232348160, 1259902592, 1287568416, 1315859240, 1343554297} // fill-array
            com.alibaba.fastjson2.JSONFactory.FLOAT_10_POW = r0
            r0 = 23
            double[] r0 = new double[r0]
            r0 = {x0230: FILL_ARRAY_DATA , data: [4607182418800017408, 4621819117588971520, 4636737291354636288, 4652007308841189376, 4666723172467343360, 4681608360884174848, 4696837146684686336, 4711630319722168320, 4726483295884279808, 4741671816366391296, 4756540486875873280, 4771362005757984768, 4786511204640096256, 4801453603149578240, 4816244402031689728, 4831355200913801216, 4846369599423283200, 4861130398305394688, 4876203697187506176, 4891288408196988160, 4906019910204099648, 4921056587992461136, 4936209963552724370} // fill-array
            com.alibaba.fastjson2.JSONFactory.DOUBLE_10_POW = r0
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            com.alibaba.fastjson2.JSONFactory.DOUBLE_ZERO = r0
            r0 = 16
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = new com.alibaba.fastjson2.JSONFactory.CacheItem[r0]
            r2 = 0
            r3 = r2
        L5e:
            if (r3 >= r0) goto L6a
            com.alibaba.fastjson2.JSONFactory$CacheItem r4 = new com.alibaba.fastjson2.JSONFactory$CacheItem
            r4.<init>()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L5e
        L6a:
            com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS = r1
            java.lang.Class<char[]> r0 = char[].class
            java.lang.String r1 = "chars"
            java.lang.Class<com.alibaba.fastjson2.JSONFactory$CacheItem> r3 = com.alibaba.fastjson2.JSONFactory.CacheItem.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)
            com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER = r0
            java.lang.Class<byte[]> r0 = byte[].class
            java.lang.String r1 = "bytes"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)
            com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER = r0
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = new com.alibaba.fastjson2.writer.ObjectWriterProvider
            r0.<init>()
            com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider = r0
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = new com.alibaba.fastjson2.reader.ObjectReaderProvider
            r0.<init>()
            com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplList r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.JSON_ARRAY_READER
            com.alibaba.fastjson2.JSONFactory.ARRAY_READER = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE_OBJECT
            com.alibaba.fastjson2.JSONFactory.OBJECT_READER = r0
            r0 = 256(0x100, float:3.59E-43)
            char[] r1 = new char[r0]
            com.alibaba.fastjson2.JSONFactory.UUID_LOOKUP = r1
            r1 = 55
            byte[] r1 = new byte[r1]
            com.alibaba.fastjson2.JSONFactory.UUID_VALUES = r1
        La4:
            if (r2 >= r0) goto Lc7
            int r1 = r2 >> 4
            r1 = r1 & 15
            r3 = r2 & 15
            char[] r4 = com.alibaba.fastjson2.JSONFactory.UUID_LOOKUP
            r5 = 10
            if (r1 >= r5) goto Lb5
            int r1 = r1 + 48
            goto Lb7
        Lb5:
            int r1 = r1 + 87
        Lb7:
            int r1 = r1 << 8
            if (r3 >= r5) goto Lbe
            int r3 = r3 + 48
            goto Lc0
        Lbe:
            int r3 = r3 + 87
        Lc0:
            int r1 = r1 + r3
            char r1 = (char) r1
            r4[r2] = r1
            int r2 = r2 + 1
            goto La4
        Lc7:
            r0 = 48
        Lc9:
            r1 = 57
            if (r0 > r1) goto Ld8
            byte[] r1 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r2 = r0 + (-48)
            byte r3 = (byte) r2
            r1[r2] = r3
            int r0 = r0 + 1
            char r0 = (char) r0
            goto Lc9
        Ld8:
            r0 = 97
        Lda:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 > r1) goto Leb
            byte[] r1 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r2 = r0 + (-48)
            int r3 = r0 + (-87)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r0 = r0 + 1
            char r0 = (char) r0
            goto Lda
        Leb:
            r0 = 65
        Led:
            r1 = 70
            if (r0 > r1) goto Lfe
            byte[] r1 = com.alibaba.fastjson2.JSONFactory.UUID_VALUES
            int r2 = r0 + (-48)
            int r3 = r0 + (-55)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r0 = r0 + 1
            char r0 = (char) r0
            goto Led
        Lfe:
            return
    }

    public JSONFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map createJSONObject1(java.util.Map r1) {
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext() {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(long r2) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.SymbolTable r2) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.SymbolTable r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r2)
            r0.config(r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.filter.Filter r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r3)
            r0.config(r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.reader.ObjectReaderProvider r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            if (r1 != 0) goto L4
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
        L4:
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            r0.<init>(r1)
            r0.config(r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(java.util.function.Supplier<java.util.Map> r2, java.util.function.Supplier<java.util.List> r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1)
            r0.setObjectSupplier(r2)
            r0.setArraySupplier(r3)
            r0.config(r4)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(java.util.function.Supplier<java.util.Map> r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1)
            r0.setObjectSupplier(r2)
            r0.config(r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.JSONReader.Feature... r2) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.Context createReadContext(com.alibaba.fastjson2.filter.Filter[] r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1, r3)
            r3 = 0
            com.alibaba.fastjson2.JSONReader$Feature[] r3 = new com.alibaba.fastjson2.JSONReader.Feature[r3]
            r0.config(r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter.Context createWriteContext() {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter.Context createWriteContext(com.alibaba.fastjson2.writer.ObjectWriterProvider r1, com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            r0.<init>(r1)
            r0.config(r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONWriter.Context createWriteContext(com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            com.alibaba.fastjson2.JSONWriter$Context r0 = new com.alibaba.fastjson2.JSONWriter$Context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.function.Function getBuilderJSONObject1x() {
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_BUILDER
            if (r0 != 0) goto L21
            boolean r0 = com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR
            if (r0 != 0) goto L21
            java.lang.Class r0 = getClassJSONObject1x()
            if (r0 == 0) goto L21
            com.alibaba.fastjson2.JSONFactory$FJ1OjbectBuilder r0 = new com.alibaba.fastjson2.JSONFactory$FJ1OjbectBuilder     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_BUILDER = r0     // Catch: java.lang.Throwable -> L17
            goto L21
        L17:
            r0 = 1
            com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR = r0
            java.lang.String r0 = "create JSONObject1 error"
            ah.a.w(r0)
            r0 = 0
            return r0
        L21:
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_BUILDER
            return r0
    }

    public static java.lang.Class getClassJSONArray1x() {
            java.lang.Class r0 = com.alibaba.fastjson2.JSONFactory.JSON_ARRAY_CLASS_1x
            if (r0 != 0) goto L10
            boolean r0 = com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR
            if (r0 != 0) goto L10
            java.lang.Class<com.alibaba.fastjson.JSONArray> r0 = com.alibaba.fastjson.JSONArray.class
            com.alibaba.fastjson2.JSONFactory.JSON_ARRAY_CLASS_1x = r0     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r0 = 1
            com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR = r0
        L10:
            java.lang.Class r0 = com.alibaba.fastjson2.JSONFactory.JSON_ARRAY_CLASS_1x
            return r0
    }

    public static java.lang.Class getClassJSONObject1x() {
            java.lang.Class r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_CLASS_1x
            if (r0 != 0) goto L10
            boolean r0 = com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR
            if (r0 != 0) goto L10
            java.lang.Class<com.alibaba.fastjson.JSONObject> r0 = com.alibaba.fastjson.JSONObject.class
            com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_CLASS_1x = r0     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r0 = 1
            com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR = r0
        L10:
            java.lang.Class r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_CLASS_1x
            return r0
    }

    public static java.util.function.Supplier<java.util.List> getDefaultArraySupplier() {
            java.util.function.Supplier<java.util.List> r0 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
            return r0
    }

    public static com.alibaba.fastjson2.reader.ObjectReaderProvider getDefaultObjectReaderProvider() {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            return r0
    }

    public static java.util.function.Supplier<java.util.Map> getDefaultObjectSupplier() {
            java.util.function.Supplier<java.util.Map> r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
            return r0
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterProvider getDefaultObjectWriterProvider() {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            return r0
    }

    public static long getDefaultReaderFeatures() {
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            return r0
    }

    public static java.util.function.Function getInnerMap() {
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_INNER_MAP
            if (r0 != 0) goto L21
            boolean r0 = com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR
            if (r0 != 0) goto L21
            java.lang.Class r0 = getClassJSONObject1x()
            if (r0 == 0) goto L21
            com.alibaba.fastjson2.JSONFactory$FJ1ObjectInnerSupplier r0 = new com.alibaba.fastjson2.JSONFactory$FJ1ObjectInnerSupplier     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_INNER_MAP = r0     // Catch: java.lang.Throwable -> L17
            goto L21
        L17:
            r0 = 1
            com.alibaba.fastjson2.JSONFactory.JSON_REFLECT_1x_ERROR = r0
            java.lang.String r0 = "create getInnerMap error"
            ah.a.w(r0)
            r0 = 0
            return r0
        L21:
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.JSON_OBJECT_1x_INNER_MAP
            return r0
    }

    public static com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.reflect.Type r2, long r3) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            boolean r3 = r1.isEnabled(r3)
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r2, r3)
            return r2
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r3, long r4) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = getDefaultObjectWriterProvider()
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            boolean r4 = r2.isEnabled(r4)
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r0.getObjectWriter(r3, r1, r4)
            return r3
    }

    public static void setDefaultArraySupplier(java.util.function.Supplier<java.util.List> r0) {
            com.alibaba.fastjson2.JSONFactory.defaultArraySupplier = r0
            return
    }

    public static void setDefaultObjectSupplier(java.util.function.Supplier<java.util.Map> r0) {
            com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier = r0
            return
    }
}
