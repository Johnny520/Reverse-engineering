package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JSONReader implements java.io.Closeable {
    static final char EOI = 26;
    static final boolean[] INT_VALUE_END = null;
    static final byte JSON_TYPE_ARRAY = 7;
    static final byte JSON_TYPE_BIG_DEC = 8;
    static final byte JSON_TYPE_BOOL = 4;
    static final byte JSON_TYPE_DEC = 2;
    static final byte JSON_TYPE_DOUBLE = 13;
    static final byte JSON_TYPE_FLOAT = 12;
    static final byte JSON_TYPE_INT = 1;
    static final byte JSON_TYPE_INT16 = 10;
    static final byte JSON_TYPE_INT64 = 11;
    static final byte JSON_TYPE_INT8 = 9;
    static final byte JSON_TYPE_NULL = 5;
    static final byte JSON_TYPE_NaN = 14;
    static final byte JSON_TYPE_OBJECT = 6;
    static final byte JSON_TYPE_STRING = 3;
    protected static final long MASK_DISABLE_REFERENCE_DETECT = 8589934592L;
    static final int MAX_EXP = 2047;
    static final long SPACE = 4294981377L;
    protected boolean boolValue;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    protected char f1814ch;
    protected boolean comma;
    protected java.lang.Object complex;
    public final com.alibaba.fastjson2.JSONReader.Context context;
    protected char[] doubleChars;
    protected short exponent;
    public final boolean jsonb;
    protected int level;
    protected int mag0;
    protected int mag1;
    protected int mag2;
    protected int mag3;
    protected boolean nameEscape;
    protected boolean negative;
    protected int offset;
    java.util.List<com.alibaba.fastjson2.JSONReader.ResolveTask> resolveTasks;
    protected short scale;
    protected java.lang.String stringValue;
    protected boolean typeRedirect;
    protected boolean valueEscape;
    protected byte valueType;
    protected boolean wasNull;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface AutoTypeBeforeHandler extends com.alibaba.fastjson2.filter.Filter {
        default java.lang.Class<?> apply(long r1, java.lang.Class<?> r3, long r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        java.lang.Class<?> apply(java.lang.String r1, java.lang.Class<?> r2, long r3);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class BigIntegerCreator implements java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> {
        static final java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> BIG_INTEGER_CREATOR = null;

        static {
                com.alibaba.fastjson2.JSONReader$BigIntegerCreator r0 = new com.alibaba.fastjson2.JSONReader$BigIntegerCreator
                r0.<init>()
                com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR = r0
                return
        }

        public BigIntegerCreator() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.BiFunction
        public /* bridge */ /* synthetic */ java.math.BigInteger apply(java.lang.Integer r1, int[] r2) {
                r0 = this;
                java.lang.Integer r1 = (java.lang.Integer) r1
                int[] r2 = (int[]) r2
                java.math.BigInteger r1 = r0.apply2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public java.math.BigInteger apply2(java.lang.Integer r12, int[] r13) {
                r11 = this;
                int r12 = r12.intValue()
                int r0 = r13.length
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lb
                r3 = r1
                goto L39
            Lb:
                r0 = r13[r1]
                int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
                int r0 = 32 - r0
                int r3 = r13.length
                int r3 = r3 - r2
                int r3 = r3 << 5
                int r3 = r3 + r0
                if (r12 >= 0) goto L39
                r0 = r13[r1]
                int r0 = java.lang.Integer.bitCount(r0)
                if (r0 != r2) goto L24
                r0 = r2
                goto L25
            L24:
                r0 = r1
            L25:
                r4 = r2
            L26:
                int r5 = r13.length
                if (r4 >= r5) goto L35
                if (r0 == 0) goto L35
                r0 = r13[r4]
                if (r0 != 0) goto L31
                r0 = r2
                goto L32
            L31:
                r0 = r1
            L32:
                int r4 = r4 + 1
                goto L26
            L35:
                if (r0 == 0) goto L39
                int r3 = r3 + (-1)
            L39:
                int r3 = r3 / 8
                int r0 = r3 + 1
                byte[] r0 = new byte[r0]
                r4 = 4
                r6 = r1
                r7 = r6
                r5 = r4
            L43:
                if (r3 < 0) goto L7c
                if (r5 != r4) goto L72
                int r5 = r7 + 1
                if (r7 >= 0) goto L4d
            L4b:
                r6 = r1
                goto L6f
            L4d:
                int r6 = r13.length
                if (r7 < r6) goto L54
                if (r12 >= 0) goto L4b
                r6 = -1
                goto L6f
            L54:
                int r6 = r13.length
                int r6 = r6 - r7
                int r6 = r6 - r2
                r6 = r13[r6]
                if (r12 < 0) goto L5c
                goto L6f
            L5c:
                int r8 = r13.length
                int r9 = r8 + (-1)
            L5f:
                if (r9 < 0) goto L68
                r10 = r13[r9]
                if (r10 != 0) goto L68
                int r9 = r9 + (-1)
                goto L5f
            L68:
                int r8 = r8 - r9
                int r8 = r8 - r2
                if (r7 > r8) goto L6e
                int r6 = -r6
                goto L6f
            L6e:
                int r6 = ~r6
            L6f:
                r7 = r5
                r5 = r2
                goto L76
            L72:
                int r6 = r6 >>> 8
                int r5 = r5 + 1
            L76:
                byte r8 = (byte) r6
                r0[r3] = r8
                int r3 = r3 + (-1)
                goto L43
            L7c:
                java.math.BigInteger r12 = new java.math.BigInteger
                r12.<init>(r0)
                return r12
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Context {
        java.util.function.Supplier<java.util.List> arraySupplier;
        com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
        int bufferSize;
        java.lang.String dateFormat;
        java.time.format.DateTimeFormatter dateFormatter;
        public com.alibaba.fastjson2.filter.ExtraProcessor extraProcessor;
        public long features;
        boolean formatComplex;
        boolean formatHasDay;
        boolean formatHasHour;
        boolean formatISO8601;
        boolean formatMillis;
        boolean formatUnixTime;
        boolean formatyyyyMMdd8;
        boolean formatyyyyMMddhhmmss19;
        boolean formatyyyyMMddhhmmssT19;
        java.util.Locale locale;
        int maxLevel;
        java.util.function.Supplier<java.util.Map> objectSupplier;
        public final com.alibaba.fastjson2.reader.ObjectReaderProvider provider;
        protected final com.alibaba.fastjson2.SymbolTable symbolTable;
        java.util.TimeZone timeZone;
        boolean useSimpleFormatter;
        boolean yyyyMMddhhmm16;
        java.time.ZoneId zoneId;

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r3) {
                r2 = this;
                r2.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r2.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r2.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r2.features = r0
                r2.provider = r3
                java.util.function.Supplier<java.util.Map> r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
                r2.objectSupplier = r3
                java.util.function.Supplier<java.util.List> r3 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
                r2.arraySupplier = r3
                r3 = 0
                r2.symbolTable = r3
                java.time.ZoneId r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r2.zoneId = r3
                java.lang.String r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r3 == 0) goto L27
                r2.setDateFormat(r3)
            L27:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r2, long r3) {
                r1 = this;
                r1.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r1.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r1.bufferSize = r0
                r1.features = r3
                r1.provider = r2
                java.util.function.Supplier<java.util.Map> r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
                r1.objectSupplier = r2
                java.util.function.Supplier<java.util.List> r2 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
                r1.arraySupplier = r2
                r2 = 0
                r1.symbolTable = r2
                java.time.ZoneId r2 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r1.zoneId = r2
                java.lang.String r2 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r2 == 0) goto L25
                r1.setDateFormat(r2)
            L25:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r3, com.alibaba.fastjson2.SymbolTable r4) {
                r2 = this;
                r2.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r2.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r2.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r2.features = r0
                r2.provider = r3
                r2.symbolTable = r4
                java.time.ZoneId r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r2.zoneId = r3
                java.lang.String r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r3 == 0) goto L1e
                r2.setDateFormat(r3)
            L1e:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r3, com.alibaba.fastjson2.SymbolTable r4, com.alibaba.fastjson2.filter.Filter r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r2 = this;
                r2.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r2.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r2.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r2.features = r0
                r2.provider = r3
                r2.symbolTable = r4
                java.time.ZoneId r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r2.zoneId = r3
                java.lang.String r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r3 == 0) goto L1e
                r2.setDateFormat(r3)
            L1e:
                r2.config(r5)
                r3 = 0
            L22:
                int r4 = r6.length
                if (r3 >= r4) goto L31
                long r4 = r2.features
                r0 = r6[r3]
                long r0 = r0.mask
                long r4 = r4 | r0
                r2.features = r4
                int r3 = r3 + 1
                goto L22
            L31:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r5, com.alibaba.fastjson2.SymbolTable r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
                r4 = this;
                r4.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r4.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r4.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r4.features = r0
                r4.provider = r5
                r4.symbolTable = r6
                java.time.ZoneId r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r4.zoneId = r5
                java.lang.String r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r5 == 0) goto L1e
                r4.setDateFormat(r5)
            L1e:
                r5 = 0
            L1f:
                int r6 = r7.length
                if (r5 >= r6) goto L2e
                long r0 = r4.features
                r6 = r7[r5]
                long r2 = r6.mask
                long r0 = r0 | r2
                r4.features = r0
                int r5 = r5 + 1
                goto L1f
            L2e:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r3, com.alibaba.fastjson2.SymbolTable r4, com.alibaba.fastjson2.filter.Filter[] r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r2 = this;
                r2.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r2.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r2.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r2.features = r0
                r2.provider = r3
                r2.symbolTable = r4
                java.time.ZoneId r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r2.zoneId = r3
                java.lang.String r3 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r3 == 0) goto L1e
                r2.setDateFormat(r3)
            L1e:
                r3 = 0
                com.alibaba.fastjson2.JSONReader$Feature[] r4 = new com.alibaba.fastjson2.JSONReader.Feature[r3]
                r2.config(r5, r4)
            L24:
                int r4 = r6.length
                if (r3 >= r4) goto L33
                long r4 = r2.features
                r0 = r6[r3]
                long r0 = r0.mask
                long r4 = r4 | r0
                r2.features = r4
                int r3 = r3 + 1
                goto L24
            L33:
                return
        }

        public Context(com.alibaba.fastjson2.reader.ObjectReaderProvider r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r4 = this;
                r4.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r4.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r4.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r4.features = r0
                r4.provider = r5
                java.util.function.Supplier<java.util.Map> r5 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
                r4.objectSupplier = r5
                java.util.function.Supplier<java.util.List> r5 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
                r4.arraySupplier = r5
                r5 = 0
                r4.symbolTable = r5
                java.time.ZoneId r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r4.zoneId = r5
                java.lang.String r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r5 == 0) goto L27
                r4.setDateFormat(r5)
            L27:
                r5 = 0
            L28:
                int r0 = r6.length
                if (r5 >= r0) goto L37
                long r0 = r4.features
                r2 = r6[r5]
                long r2 = r2.mask
                long r0 = r0 | r2
                r4.features = r0
                int r5 = r5 + 1
                goto L28
            L37:
                return
        }

        public Context(java.lang.String r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
                r5 = this;
                r5.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r5.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r5.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r5.features = r0
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
                r5.provider = r0
                java.util.function.Supplier<java.util.Map> r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
                r5.objectSupplier = r0
                java.util.function.Supplier<java.util.List> r0 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
                r5.arraySupplier = r0
                r0 = 0
                r5.symbolTable = r0
                java.time.ZoneId r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r5.zoneId = r0
                java.lang.String r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r0 == 0) goto L29
                r5.setDateFormat(r0)
            L29:
                r0 = 0
            L2a:
                int r1 = r7.length
                if (r0 >= r1) goto L39
                long r1 = r5.features
                r3 = r7[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L2a
            L39:
                r5.setDateFormat(r6)
                return
        }

        public Context(com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r5 = this;
                r5.<init>()
                r0 = 2048(0x800, float:2.87E-42)
                r5.maxLevel = r0
                r0 = 524288(0x80000, float:7.34684E-40)
                r5.bufferSize = r0
                long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
                r5.features = r0
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
                r5.provider = r0
                java.util.function.Supplier<java.util.Map> r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectSupplier
                r5.objectSupplier = r0
                java.util.function.Supplier<java.util.List> r0 = com.alibaba.fastjson2.JSONFactory.defaultArraySupplier
                r5.arraySupplier = r0
                r0 = 0
                r5.symbolTable = r0
                java.time.ZoneId r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId
                r5.zoneId = r0
                java.lang.String r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFormat
                if (r0 == 0) goto L29
                r5.setDateFormat(r0)
            L29:
                r0 = 0
            L2a:
                int r1 = r6.length
                if (r0 >= r1) goto L39
                long r1 = r5.features
                r3 = r6[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L2a
            L39:
                return
        }

        public void config(com.alibaba.fastjson2.JSONReader.Feature r3, boolean r4) {
                r2 = this;
                long r0 = r2.features
                if (r4 == 0) goto La
                long r3 = r3.mask
                long r3 = r3 | r0
                r2.features = r3
                return
            La:
                long r3 = r3.mask
                long r3 = ~r3
                long r3 = r3 & r0
                r2.features = r3
                return
        }

        public void config(com.alibaba.fastjson2.filter.Filter r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
                if (r0 == 0) goto L9
                r0 = r2
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = (com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler) r0
                r1.autoTypeBeforeHandler = r0
            L9:
                boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.ExtraProcessor
                if (r0 == 0) goto L11
                com.alibaba.fastjson2.filter.ExtraProcessor r2 = (com.alibaba.fastjson2.filter.ExtraProcessor) r2
                r1.extraProcessor = r2
            L11:
                return
        }

        public void config(com.alibaba.fastjson2.filter.Filter r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r4 = this;
                boolean r0 = r5 instanceof com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
                if (r0 == 0) goto L9
                r0 = r5
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = (com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler) r0
                r4.autoTypeBeforeHandler = r0
            L9:
                boolean r0 = r5 instanceof com.alibaba.fastjson2.filter.ExtraProcessor
                if (r0 == 0) goto L11
                com.alibaba.fastjson2.filter.ExtraProcessor r5 = (com.alibaba.fastjson2.filter.ExtraProcessor) r5
                r4.extraProcessor = r5
            L11:
                r5 = 0
            L12:
                int r0 = r6.length
                if (r5 >= r0) goto L21
                long r0 = r4.features
                r2 = r6[r5]
                long r2 = r2.mask
                long r0 = r0 | r2
                r4.features = r0
                int r5 = r5 + 1
                goto L12
            L21:
                return
        }

        public void config(com.alibaba.fastjson2.JSONReader.Feature... r6) {
                r5 = this;
                r0 = 0
            L1:
                int r1 = r6.length
                if (r0 >= r1) goto L10
                long r1 = r5.features
                r3 = r6[r0]
                long r3 = r3.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L1
            L10:
                return
        }

        public void config(com.alibaba.fastjson2.filter.Filter[] r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
                r5 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r6.length
                if (r1 >= r2) goto L1b
                r2 = r6[r1]
                boolean r3 = r2 instanceof com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler
                if (r3 == 0) goto L10
                r3 = r2
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r3 = (com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler) r3
                r5.autoTypeBeforeHandler = r3
            L10:
                boolean r3 = r2 instanceof com.alibaba.fastjson2.filter.ExtraProcessor
                if (r3 == 0) goto L18
                com.alibaba.fastjson2.filter.ExtraProcessor r2 = (com.alibaba.fastjson2.filter.ExtraProcessor) r2
                r5.extraProcessor = r2
            L18:
                int r1 = r1 + 1
                goto L2
            L1b:
                int r6 = r7.length
                if (r0 >= r6) goto L2a
                long r1 = r5.features
                r6 = r7[r0]
                long r3 = r6.mask
                long r1 = r1 | r3
                r5.features = r1
                int r0 = r0 + 1
                goto L1b
            L2a:
                return
        }

        public java.util.function.Supplier<java.util.List> getArraySupplier() {
                r1 = this;
                java.util.function.Supplier<java.util.List> r0 = r1.arraySupplier
                return r0
        }

        public int getBufferSize() {
                r1 = this;
                int r0 = r1.bufferSize
                return r0
        }

        public com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler getContextAutoTypeBeforeHandler() {
                r1 = this;
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r1.autoTypeBeforeHandler
                return r0
        }

        public java.lang.String getDateFormat() {
                r1 = this;
                java.lang.String r0 = r1.dateFormat
                return r0
        }

        public java.time.format.DateTimeFormatter getDateFormatter() {
                r2 = this;
                java.time.format.DateTimeFormatter r0 = r2.dateFormatter
                if (r0 != 0) goto L23
                java.lang.String r0 = r2.dateFormat
                if (r0 == 0) goto L23
                boolean r1 = r2.formatMillis
                if (r1 != 0) goto L23
                boolean r1 = r2.formatISO8601
                if (r1 != 0) goto L23
                boolean r1 = r2.formatUnixTime
                if (r1 != 0) goto L23
                java.util.Locale r1 = r2.locale
                if (r1 != 0) goto L1d
                java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0)
                goto L21
            L1d:
                java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0, r1)
            L21:
                r2.dateFormatter = r0
            L23:
                java.time.format.DateTimeFormatter r0 = r2.dateFormatter
                return r0
        }

        public com.alibaba.fastjson2.filter.ExtraProcessor getExtraProcessor() {
                r1 = this;
                com.alibaba.fastjson2.filter.ExtraProcessor r0 = r1.extraProcessor
                return r0
        }

        public long getFeatures() {
                r2 = this;
                long r0 = r2.features
                return r0
        }

        public java.util.Locale getLocale() {
                r1 = this;
                java.util.Locale r0 = r1.locale
                return r0
        }

        public int getMaxLevel() {
                r1 = this;
                int r0 = r1.maxLevel
                return r0
        }

        public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.reflect.Type r5) {
                r4 = this;
                long r0 = r4.features
                com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
                long r2 = r2.mask
                long r0 = r0 & r2
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r4.provider
                com.alibaba.fastjson2.reader.ObjectReader r5 = r1.getObjectReader(r5, r0)
                return r5
        }

        public com.alibaba.fastjson2.reader.ObjectReader getObjectReaderAutoType(long r2) {
                r1 = this;
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r1.provider
                com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r2)
                return r2
        }

        public com.alibaba.fastjson2.reader.ObjectReader getObjectReaderAutoType(java.lang.String r4, java.lang.Class r5) {
                r3 = this;
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r3.autoTypeBeforeHandler
                if (r0 == 0) goto L23
                long r1 = r3.features
                java.lang.Class r0 = r0.apply(r4, r5, r1)
                if (r0 == 0) goto L23
                long r4 = r3.features
                com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
                long r1 = r1.mask
                long r4 = r4 & r1
                r1 = 0
                int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r4 == 0) goto L1b
                r4 = 1
                goto L1c
            L1b:
                r4 = 0
            L1c:
                com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = r3.provider
                com.alibaba.fastjson2.reader.ObjectReader r4 = r5.getObjectReader(r0, r4)
                return r4
            L23:
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r3.provider
                long r1 = r3.features
                com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4, r5, r1)
                return r4
        }

        public com.alibaba.fastjson2.reader.ObjectReader getObjectReaderAutoType(java.lang.String r4, java.lang.Class r5, long r6) {
                r3 = this;
                com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r3.autoTypeBeforeHandler
                if (r0 == 0) goto L1f
                java.lang.Class r0 = r0.apply(r4, r5, r6)
                if (r0 == 0) goto L1f
                com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
                long r4 = r4.mask
                long r4 = r4 & r6
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L17
                r4 = 1
                goto L18
            L17:
                r4 = 0
            L18:
                com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = r3.provider
                com.alibaba.fastjson2.reader.ObjectReader r4 = r5.getObjectReader(r0, r4)
                return r4
            L1f:
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r3.provider
                long r1 = r3.features
                long r6 = r6 | r1
                com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4, r5, r6)
                return r4
        }

        public java.util.function.Supplier<java.util.Map> getObjectSupplier() {
                r1 = this;
                java.util.function.Supplier<java.util.Map> r0 = r1.objectSupplier
                return r0
        }

        public com.alibaba.fastjson2.reader.ObjectReaderProvider getProvider() {
                r1 = this;
                com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r1.provider
                return r0
        }

        public java.util.TimeZone getTimeZone() {
                r1 = this;
                java.util.TimeZone r0 = r1.timeZone
                return r0
        }

        public java.time.ZoneId getZoneId() {
                r1 = this;
                java.time.ZoneId r0 = r1.zoneId
                if (r0 != 0) goto L8
                java.time.ZoneId r0 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
                r1.zoneId = r0
            L8:
                java.time.ZoneId r0 = r1.zoneId
                return r0
        }

        public boolean isEnabled(com.alibaba.fastjson2.JSONReader.Feature r5) {
                r4 = this;
                long r0 = r4.features
                long r2 = r5.mask
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto Ld
                r5 = 1
                return r5
            Ld:
                r5 = 0
                return r5
        }

        public boolean isFormatHasHour() {
                r1 = this;
                boolean r0 = r1.formatHasHour
                return r0
        }

        public boolean isFormatISO8601() {
                r1 = this;
                boolean r0 = r1.formatISO8601
                return r0
        }

        public boolean isFormatMillis() {
                r1 = this;
                boolean r0 = r1.formatMillis
                return r0
        }

        public boolean isFormatUnixTime() {
                r1 = this;
                boolean r0 = r1.formatUnixTime
                return r0
        }

        public boolean isFormatyyyyMMdd8() {
                r1 = this;
                boolean r0 = r1.formatyyyyMMdd8
                return r0
        }

        public boolean isFormatyyyyMMddhhmmss19() {
                r1 = this;
                boolean r0 = r1.formatyyyyMMddhhmmss19
                return r0
        }

        public boolean isFormatyyyyMMddhhmmssT19() {
                r1 = this;
                boolean r0 = r1.formatyyyyMMddhhmmssT19
                return r0
        }

        public void setArraySupplier(java.util.function.Supplier<java.util.List> r1) {
                r0 = this;
                r0.arraySupplier = r1
                return
        }

        public void setBufferSize(int r1) {
                r0 = this;
                r0.bufferSize = r1
                return
        }

        public void setDateFormat(java.lang.String r12) {
                r11 = this;
                r0 = 0
                if (r12 == 0) goto La
                boolean r1 = r12.isEmpty()
                if (r1 == 0) goto La
                r12 = r0
            La:
                r1 = 0
                if (r12 == 0) goto L106
                int r2 = r12.hashCode()
                r3 = -1
                r4 = 1
                switch(r2) {
                    case -1172057030: goto L80;
                    case -1074095546: goto L75;
                    case -347789785: goto L6a;
                    case -288020395: goto L5f;
                    case -276306848: goto L54;
                    case -159776256: goto L49;
                    case 1333195168: goto L3e;
                    case 1798231098: goto L33;
                    case 1834843604: goto L26;
                    case 2095190916: goto L19;
                    default: goto L16;
                }
            L16:
                r2 = r3
                goto L8a
            L19:
                java.lang.String r2 = "iso8601"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L22
                goto L16
            L22:
                r2 = 9
                goto L8a
            L26:
                java.lang.String r2 = "yyyy-MM-ddTHH:mm:ss"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L2f
                goto L16
            L2f:
                r2 = 8
                goto L8a
            L33:
                java.lang.String r2 = "yyyy-MM-dd'T'HH:mm:ss"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L3c
                goto L16
            L3c:
                r2 = 7
                goto L8a
            L3e:
                java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L47
                goto L16
            L47:
                r2 = 6
                goto L8a
            L49:
                java.lang.String r2 = "yyyy-MM-dd"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L52
                goto L16
            L52:
                r2 = 5
                goto L8a
            L54:
                java.lang.String r2 = "yyyyMMdd"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L5d
                goto L16
            L5d:
                r2 = 4
                goto L8a
            L5f:
                java.lang.String r2 = "unixtime"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L68
                goto L16
            L68:
                r2 = 3
                goto L8a
            L6a:
                java.lang.String r2 = "yyyyMMddHHmmssSSSZ"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L73
                goto L16
            L73:
                r2 = 2
                goto L8a
            L75:
                java.lang.String r2 = "millis"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L7e
                goto L16
            L7e:
                r2 = r4
                goto L8a
            L80:
                java.lang.String r2 = "yyyy-MM-dd HH:mm"
                boolean r2 = r12.equals(r2)
                if (r2 != 0) goto L89
                goto L16
            L89:
                r2 = r1
            L8a:
                switch(r2) {
                    case 0: goto Lef;
                    case 1: goto Le9;
                    case 2: goto Le3;
                    case 3: goto Ldd;
                    case 4: goto Ld5;
                    case 5: goto Ld5;
                    case 6: goto Ld2;
                    case 7: goto Lca;
                    case 8: goto Ld2;
                    case 9: goto Lc3;
                    default: goto L8d;
                }
            L8d:
                r2 = 100
                int r2 = r12.indexOf(r2)
                if (r2 == r3) goto L97
                r2 = r4
                goto L98
            L97:
                r2 = r1
            L98:
                r5 = 72
                int r5 = r12.indexOf(r5)
                if (r5 != r3) goto Lbb
                r5 = 104(0x68, float:1.46E-43)
                int r5 = r12.indexOf(r5)
                if (r5 != r3) goto Lbb
                r5 = 75
                int r5 = r12.indexOf(r5)
                if (r5 != r3) goto Lbb
                r5 = 107(0x6b, float:1.5E-43)
                int r5 = r12.indexOf(r5)
                if (r5 == r3) goto Lb9
                goto Lbb
            Lb9:
                r3 = r1
                goto Lbc
            Lbb:
                r3 = r4
            Lbc:
                r7 = r1
                r5 = r2
                r6 = r3
                r2 = r7
                r3 = r2
                goto Lf6
            Lc3:
                r2 = r1
                r3 = r2
                r5 = r3
                r6 = r5
                r7 = r6
                r1 = r4
                goto Lf6
            Lca:
                r11.formatyyyyMMddhhmmssT19 = r4
            Lcc:
                r2 = r1
                r3 = r2
                r7 = r3
                r5 = r4
                r6 = r5
                goto Lf6
            Ld2:
                r11.formatyyyyMMddhhmmss19 = r4
                goto Lcc
            Ld5:
                r11.formatyyyyMMdd8 = r4
                r2 = r1
                r3 = r2
                r6 = r3
                r7 = r6
                r5 = r4
                goto Lf6
            Ldd:
                r3 = r1
                r5 = r3
                r6 = r5
                r7 = r6
                r2 = r4
                goto Lf6
            Le3:
                r2 = r1
                r3 = r2
                r5 = r3
                r6 = r5
                r7 = r4
                goto Lf6
            Le9:
                r2 = r1
                r5 = r2
                r6 = r5
                r7 = r6
                r3 = r4
                goto Lf6
            Lef:
                r11.yyyyMMddhhmm16 = r4
                r2 = r1
                r3 = r2
                r5 = r3
                r6 = r5
                r7 = r6
            Lf6:
                boolean r8 = r11.formatyyyyMMddhhmmss19
                boolean r9 = r11.formatyyyyMMddhhmmssT19
                r8 = r8 | r9
                boolean r9 = r11.formatyyyyMMdd8
                r8 = r8 | r9
                r8 = r8 | r1
                r4 = r4 ^ r8
                r11.formatComplex = r4
                r10 = r2
                r2 = r1
                r1 = r10
                goto L10b
            L106:
                r2 = r1
                r3 = r2
                r5 = r3
                r6 = r5
                r7 = r6
            L10b:
                java.lang.String r4 = r11.dateFormat
                if (r4 == 0) goto L117
                boolean r4 = r4.equals(r12)
                if (r4 != 0) goto L117
                r11.dateFormatter = r0
            L117:
                r11.dateFormat = r12
                r11.formatUnixTime = r1
                r11.formatMillis = r3
                r11.formatISO8601 = r2
                r11.formatHasDay = r5
                r11.formatHasHour = r6
                r11.useSimpleFormatter = r7
                return
        }

        public void setDateFormatter(java.time.format.DateTimeFormatter r1) {
                r0 = this;
                r0.dateFormatter = r1
                return
        }

        public void setExtraProcessor(com.alibaba.fastjson2.filter.ExtraProcessor r1) {
                r0 = this;
                r0.extraProcessor = r1
                return
        }

        public void setFeatures(long r1) {
                r0 = this;
                r0.features = r1
                return
        }

        public void setLocale(java.util.Locale r1) {
                r0 = this;
                r0.locale = r1
                return
        }

        public void setMaxLevel(int r1) {
                r0 = this;
                r0.maxLevel = r1
                return
        }

        public void setObjectSupplier(java.util.function.Supplier<java.util.Map> r1) {
                r0 = this;
                r0.objectSupplier = r1
                return
        }

        public void setTimeZone(java.util.TimeZone r1) {
                r0 = this;
                r0.timeZone = r1
                return
        }

        public void setZoneId(java.time.ZoneId r1) {
                r0 = this;
                r0.zoneId = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Feature extends java.lang.Enum<com.alibaba.fastjson2.JSONReader.Feature> {
        private static final /* synthetic */ com.alibaba.fastjson2.JSONReader.Feature[] $VALUES = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature AllowUnQuotedFieldNames = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature Base64StringAsByteArray = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature DisableReferenceDetect = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature DisableSingleQuote = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature DisableStringArrayUnwrapping = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature DuplicateKeyValueAsArray = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature EmptyStringAsNull = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature ErrorOnEnumNotMatch = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature ErrorOnNoneSerializable = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature ErrorOnNotSupportAutoType = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature ErrorOnNullForPrimitives = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature ErrorOnUnknownProperties = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature FieldBased = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature IgnoreAutoTypeNotMatch = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature IgnoreCheckClose = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature IgnoreNoneSerializable = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature IgnoreNullPropertyValue = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature IgnoreSetNullValue = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature InitStringFieldAsEmpty = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature NonErrorOnNumberOverflow = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature NonStringKeyAsString = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature NonZeroNumberCastToBooleanAsTrue = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature NullOnError = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature SupportArrayToBean = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature SupportAutoType = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature SupportClassForName = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature SupportSmartMatch = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature TrimString = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseBigDecimalForDoubles = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseBigDecimalForFloats = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseBigIntegerForInts = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseDefaultConstructorAsPossible = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseDoubleForDecimals = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseLongForInts = null;
        public static final com.alibaba.fastjson2.JSONReader.Feature UseNativeObject = null;
        public final long mask;

        static {
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 0
                r2 = 1
                java.lang.String r4 = "FieldBased"
                r1.<init>(r4, r0, r2)
                com.alibaba.fastjson2.JSONReader.Feature.FieldBased = r1
                com.alibaba.fastjson2.JSONReader$Feature r2 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 1
                r3 = 2
                java.lang.String r5 = "IgnoreNoneSerializable"
                r2.<init>(r5, r0, r3)
                com.alibaba.fastjson2.JSONReader.Feature.IgnoreNoneSerializable = r2
                com.alibaba.fastjson2.JSONReader$Feature r3 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 2
                r4 = 4
                java.lang.String r6 = "ErrorOnNoneSerializable"
                r3.<init>(r6, r0, r4)
                com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNoneSerializable = r3
                com.alibaba.fastjson2.JSONReader$Feature r4 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 3
                r5 = 8
                java.lang.String r7 = "SupportArrayToBean"
                r4.<init>(r7, r0, r5)
                com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean = r4
                com.alibaba.fastjson2.JSONReader$Feature r5 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 4
                r6 = 16
                java.lang.String r8 = "InitStringFieldAsEmpty"
                r5.<init>(r8, r0, r6)
                com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty = r5
                com.alibaba.fastjson2.JSONReader$Feature r6 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 5
                r7 = 32
                java.lang.String r9 = "SupportAutoType"
                r6.<init>(r9, r0, r7)
                com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType = r6
                com.alibaba.fastjson2.JSONReader$Feature r7 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 6
                r8 = 64
                java.lang.String r10 = "SupportSmartMatch"
                r7.<init>(r10, r0, r8)
                com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch = r7
                com.alibaba.fastjson2.JSONReader$Feature r8 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 7
                r9 = 128(0x80, double:6.3E-322)
                java.lang.String r11 = "UseNativeObject"
                r8.<init>(r11, r0, r9)
                com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject = r8
                com.alibaba.fastjson2.JSONReader$Feature r9 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 8
                r10 = 256(0x100, double:1.265E-321)
                java.lang.String r12 = "SupportClassForName"
                r9.<init>(r12, r0, r10)
                com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName = r9
                com.alibaba.fastjson2.JSONReader$Feature r10 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 9
                r11 = 512(0x200, double:2.53E-321)
                java.lang.String r13 = "IgnoreSetNullValue"
                r10.<init>(r13, r0, r11)
                com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue = r10
                com.alibaba.fastjson2.JSONReader$Feature r11 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 10
                r12 = 1024(0x400, double:5.06E-321)
                java.lang.String r14 = "UseDefaultConstructorAsPossible"
                r11.<init>(r14, r0, r12)
                com.alibaba.fastjson2.JSONReader.Feature.UseDefaultConstructorAsPossible = r11
                com.alibaba.fastjson2.JSONReader$Feature r12 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 11
                r13 = 2048(0x800, double:1.012E-320)
                java.lang.String r15 = "UseBigDecimalForFloats"
                r12.<init>(r15, r0, r13)
                com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForFloats = r12
                com.alibaba.fastjson2.JSONReader$Feature r13 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 12
                r14 = 4096(0x1000, double:2.0237E-320)
                r16 = r1
                java.lang.String r1 = "UseBigDecimalForDoubles"
                r13.<init>(r1, r0, r14)
                com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForDoubles = r13
                com.alibaba.fastjson2.JSONReader$Feature r14 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 13
                r15 = r2
                r1 = 8192(0x2000, double:4.0474E-320)
                r17 = r3
                java.lang.String r3 = "ErrorOnEnumNotMatch"
                r14.<init>(r3, r0, r1)
                com.alibaba.fastjson2.JSONReader.Feature.ErrorOnEnumNotMatch = r14
                r2 = r15
                com.alibaba.fastjson2.JSONReader$Feature r15 = new com.alibaba.fastjson2.JSONReader$Feature
                r0 = 14
                r3 = r2
                r1 = 16384(0x4000, double:8.095E-320)
                r18 = r3
                java.lang.String r3 = "TrimString"
                r15.<init>(r3, r0, r1)
                com.alibaba.fastjson2.JSONReader.Feature.TrimString = r15
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r1 = 15
                r2 = 32768(0x8000, double:1.61895E-319)
                r19 = r4
                java.lang.String r4 = "ErrorOnNotSupportAutoType"
                r0.<init>(r4, r1, r2)
                com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 16
                r3 = 65536(0x10000, double:3.2379E-319)
                r20 = r0
                java.lang.String r0 = "DuplicateKeyValueAsArray"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 17
                r3 = 131072(0x20000, double:6.4758E-319)
                r21 = r1
                java.lang.String r1 = "AllowUnQuotedFieldNames"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 18
                r3 = 262144(0x40000, double:1.295163E-318)
                r22 = r0
                java.lang.String r0 = "NonStringKeyAsString"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.NonStringKeyAsString = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 19
                r3 = 524288(0x80000, double:2.590327E-318)
                r23 = r1
                java.lang.String r1 = "Base64StringAsByteArray"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.Base64StringAsByteArray = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 20
                r3 = 1048576(0x100000, double:5.180654E-318)
                r24 = r0
                java.lang.String r0 = "IgnoreCheckClose"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 21
                r3 = 2097152(0x200000, double:1.036131E-317)
                r25 = r1
                java.lang.String r1 = "ErrorOnNullForPrimitives"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 22
                r3 = 4194304(0x400000, double:2.0722615E-317)
                r26 = r0
                java.lang.String r0 = "NullOnError"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.NullOnError = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 23
                r3 = 8388608(0x800000, double:4.144523E-317)
                r27 = r1
                java.lang.String r1 = "IgnoreAutoTypeNotMatch"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.IgnoreAutoTypeNotMatch = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 24
                r3 = 16777216(0x1000000, double:8.289046E-317)
                r28 = r0
                java.lang.String r0 = "NonZeroNumberCastToBooleanAsTrue"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 25
                r3 = 33554432(0x2000000, double:1.6578092E-316)
                r29 = r1
                java.lang.String r1 = "IgnoreNullPropertyValue"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 26
                r3 = 67108864(0x4000000, double:3.3156184E-316)
                r30 = r0
                java.lang.String r0 = "ErrorOnUnknownProperties"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.ErrorOnUnknownProperties = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 27
                r3 = 134217728(0x8000000, double:6.63123685E-316)
                r31 = r1
                java.lang.String r1 = "EmptyStringAsNull"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.EmptyStringAsNull = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 28
                r3 = 268435456(0x10000000, double:1.32624737E-315)
                r32 = r0
                java.lang.String r0 = "NonErrorOnNumberOverflow"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.NonErrorOnNumberOverflow = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 29
                r3 = 536870912(0x20000000, double:2.65249474E-315)
                r33 = r1
                java.lang.String r1 = "UseBigIntegerForInts"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.UseBigIntegerForInts = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 30
                r3 = 1073741824(0x40000000, double:5.304989477E-315)
                r34 = r0
                java.lang.String r0 = "UseLongForInts"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.UseLongForInts = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 31
                r3 = 2147483648(0x80000000, double:1.0609978955E-314)
                r35 = r1
                java.lang.String r1 = "DisableSingleQuote"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.DisableSingleQuote = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 32
                r3 = 4294967296(0x100000000, double:2.121995791E-314)
                r36 = r0
                java.lang.String r0 = "UseDoubleForDecimals"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.UseDoubleForDecimals = r1
                com.alibaba.fastjson2.JSONReader$Feature r0 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 33
                r3 = 8589934592(0x200000000, double:4.243991582E-314)
                r37 = r1
                java.lang.String r1 = "DisableReferenceDetect"
                r0.<init>(r1, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.DisableReferenceDetect = r0
                com.alibaba.fastjson2.JSONReader$Feature r1 = new com.alibaba.fastjson2.JSONReader$Feature
                r2 = 34
                r3 = 17179869184(0x400000000, double:8.487983164E-314)
                r38 = r0
                java.lang.String r0 = "DisableStringArrayUnwrapping"
                r1.<init>(r0, r2, r3)
                com.alibaba.fastjson2.JSONReader.Feature.DisableStringArrayUnwrapping = r1
                r3 = r17
                r2 = r18
                r4 = r19
                r17 = r21
                r18 = r22
                r19 = r23
                r21 = r25
                r22 = r26
                r23 = r27
                r25 = r29
                r26 = r30
                r27 = r31
                r29 = r33
                r30 = r34
                r31 = r35
                r33 = r37
                r34 = r38
                r35 = r1
                r1 = r16
                r16 = r20
                r20 = r24
                r24 = r28
                r28 = r32
                r32 = r36
                com.alibaba.fastjson2.JSONReader$Feature[] r0 = new com.alibaba.fastjson2.JSONReader.Feature[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35}
                com.alibaba.fastjson2.JSONReader.Feature.$VALUES = r0
                return
        }

        Feature(java.lang.String r1, int r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mask = r3
                return
        }

        public static boolean isEnabled(long r2, com.alibaba.fastjson2.JSONReader.Feature r4) {
                long r0 = r4.mask
                long r2 = r2 & r0
                r0 = 0
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 == 0) goto Lb
                r2 = 1
                return r2
            Lb:
                r2 = 0
                return r2
        }

        public static long of(com.alibaba.fastjson2.JSONReader.Feature[] r5) {
                r0 = 0
                if (r5 != 0) goto L5
                return r0
            L5:
                r2 = 0
            L6:
                int r3 = r5.length
                if (r2 >= r3) goto L11
                r3 = r5[r2]
                long r3 = r3.mask
                long r0 = r0 | r3
                int r2 = r2 + 1
                goto L6
            L11:
                return r0
        }

        public static com.alibaba.fastjson2.JSONReader.Feature valueOf(java.lang.String r1) {
                java.lang.Class<com.alibaba.fastjson2.JSONReader$Feature> r0 = com.alibaba.fastjson2.JSONReader.Feature.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.alibaba.fastjson2.JSONReader$Feature r1 = (com.alibaba.fastjson2.JSONReader.Feature) r1
                return r1
        }

        public static com.alibaba.fastjson2.JSONReader.Feature[] values() {
                com.alibaba.fastjson2.JSONReader$Feature[] r0 = com.alibaba.fastjson2.JSONReader.Feature.$VALUES
                java.lang.Object r0 = r0.clone()
                com.alibaba.fastjson2.JSONReader$Feature[] r0 = (com.alibaba.fastjson2.JSONReader.Feature[]) r0
                return r0
        }

        public boolean isEnabled(long r3) {
                r2 = this;
                long r0 = r2.mask
                long r3 = r3 & r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto Lb
                r3 = 1
                return r3
            Lb:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ResolveTask {
        final com.alibaba.fastjson2.reader.FieldReader fieldReader;
        final java.lang.Object name;
        final java.lang.Object object;
        final com.alibaba.fastjson2.JSONPath reference;

        public ResolveTask(com.alibaba.fastjson2.reader.FieldReader r1, java.lang.Object r2, java.lang.Object r3, com.alibaba.fastjson2.JSONPath r4) {
                r0 = this;
                r0.<init>()
                r0.fieldReader = r1
                r0.object = r2
                r0.name = r3
                r0.reference = r4
                return
        }

        public java.lang.String toString() {
                r1 = this;
                com.alibaba.fastjson2.JSONPath r0 = r1.reference
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class SavePoint {
        protected final int current;
        protected final int offset;

        public SavePoint(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.offset = r1
                r0.current = r2
                return
        }
    }

    static {
            r0 = 256(0x100, float:3.59E-43)
            boolean[] r0 = new boolean[r0]
            com.alibaba.fastjson2.JSONReader.INT_VALUE_END = r0
            r1 = 1
            java.util.Arrays.fill(r0, r1)
            r0 = 19
            char[] r1 = new char[r0]
            r1 = {x0020: FILL_ARRAY_DATA , data: [46, 101, 69, 116, 102, 110, 123, 91, 48, 49, 50, 50, 51, 52, 53, 54, 55, 56, 57} // fill-array
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r0) goto L1e
            char r4 = r1[r3]
            boolean[] r5 = com.alibaba.fastjson2.JSONReader.INT_VALUE_END
            r5[r4] = r2
            int r3 = r3 + 1
            goto L13
        L1e:
            return
    }

    public JSONReader(com.alibaba.fastjson2.JSONReader.Context r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.jsonb = r2
            return
    }

    private void add(java.util.List<java.lang.Object> r2, int r3, java.lang.Object r4) {
            r1 = this;
            boolean r0 = r4 instanceof com.alibaba.fastjson2.JSONPath
            if (r0 == 0) goto Le
            com.alibaba.fastjson2.JSONPath r4 = (com.alibaba.fastjson2.JSONPath) r4
            r1.addResolveTask(r2, r3, r4)
            r3 = 0
            r2.add(r3)
            return
        Le:
            r2.add(r4)
            return
    }

    public static com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeFilter(boolean r1, java.lang.Class... r2) {
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler r0 = new com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeFilter(boolean r1, java.lang.String... r2) {
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler r0 = new com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeFilter(java.lang.Class... r1) {
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler r0 = new com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeFilter(java.lang.String... r1) {
            com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler r0 = new com.alibaba.fastjson2.filter.ContextAutoTypeBeforeHandler
            r0.<init>(r1)
            return r0
    }

    public static char char2(int r1, int r2) {
            int[] r0 = com.alibaba.fastjson2.JSONFactory.DIGITS2
            r1 = r0[r1]
            int r1 = r1 << 4
            r2 = r0[r2]
            int r1 = r1 + r2
            char r1 = (char) r1
            return r1
    }

    public static char char4(int r1, int r2, int r3, int r4) {
            int[] r0 = com.alibaba.fastjson2.JSONFactory.DIGITS2
            r1 = r0[r1]
            int r1 = r1 << 12
            r2 = r0[r2]
            int r2 = r2 << 8
            int r1 = r1 + r2
            r2 = r0[r3]
            int r2 = r2 << 4
            int r1 = r1 + r2
            r2 = r0[r4]
            int r1 = r1 + r2
            char r1 = (char) r1
            return r1
    }

    public static boolean isFirstIdentifier(int r1) {
            r0 = 65
            if (r1 < r0) goto L8
            r0 = 90
            if (r1 <= r0) goto L27
        L8:
            r0 = 97
            if (r1 < r0) goto L10
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L27
        L10:
            r0 = 95
            if (r1 == r0) goto L27
            r0 = 36
            if (r1 == r0) goto L27
            r0 = 48
            if (r1 < r0) goto L20
            r0 = 57
            if (r1 <= r0) goto L27
        L20:
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 <= r0) goto L25
            goto L27
        L25:
            r1 = 0
            return r1
        L27:
            r1 = 1
            return r1
    }

    public static com.alibaba.fastjson2.JSONException numberError(int r3, int r4) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "illegal number, offset "
            java.lang.String r2 = ", char "
            java.lang.StringBuilder r3 = eh.a.t(r3, r1, r2)
            char r4 = (char) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            return r0
    }

    @java.lang.Deprecated
    public static com.alibaba.fastjson2.JSONReader of(com.alibaba.fastjson2.JSONReader.Context r0, java.lang.String r1) {
            com.alibaba.fastjson2.JSONReader r0 = of(r1, r0)
            return r0
    }

    @java.lang.Deprecated
    public static com.alibaba.fastjson2.JSONReader of(com.alibaba.fastjson2.JSONReader.Context r6, byte[] r7) {
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            r4 = 0
            int r5 = r7.length
            r2 = 0
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @java.lang.Deprecated
    public static com.alibaba.fastjson2.JSONReader of(com.alibaba.fastjson2.JSONReader.Context r6, char[] r7) {
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r4 = 0
            int r5 = r7.length
            r2 = 0
            r1 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(java.io.InputStream r2, java.nio.charset.Charset r3) {
            com.alibaba.fastjson2.JSONReader$Context r0 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.<init>(r1)
            com.alibaba.fastjson2.JSONReader r2 = of(r2, r3, r0)
            return r2
    }

    public static com.alibaba.fastjson2.JSONReader of(java.io.InputStream r1, java.nio.charset.Charset r2, com.alibaba.fastjson2.JSONReader.Context r3) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r2 == r0) goto L22
            if (r2 != 0) goto L7
            goto L22
        L7:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            if (r2 != r0) goto L11
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2.<init>(r3, r1)
            return r2
        L11:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            if (r2 != r0) goto L1b
            com.alibaba.fastjson2.JSONReaderASCII r2 = new com.alibaba.fastjson2.JSONReaderASCII
            r2.<init>(r3, r1)
            return r2
        L1b:
            java.lang.String r1 = "not support charset "
            ah.a.v(r2, r1)
            r1 = 0
            return r1
        L22:
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r2.<init>(r3, r1)
            return r2
    }

    public static com.alibaba.fastjson2.JSONReader of(java.io.Reader r2) {
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r0.<init>(r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(java.io.Reader r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r0.<init>(r2, r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(java.lang.String r4) {
            r4.getClass()
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2)
            r2 = 0
            int r3 = r4.length()
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(java.lang.String r6, int r7, int r8) {
            r6.getClass()
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            char[] r3 = r6.toCharArray()
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(java.lang.String r6, int r7, int r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            if (r6 == 0) goto L12
            if (r9 == 0) goto L12
            char[] r3 = r6.toCharArray()
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = r6
            r4 = r7
            r5 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L12:
            r6 = 0
            throw r6
    }

    public static com.alibaba.fastjson2.JSONReader of(java.lang.String r3, com.alibaba.fastjson2.JSONReader.Context r4) {
            if (r3 == 0) goto Lf
            if (r4 == 0) goto Lf
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r1 = 0
            int r2 = r3.length()
            r0.<init>(r4, r3, r1, r2)
            return r0
        Lf:
            r3 = 0
            throw r3
    }

    public static com.alibaba.fastjson2.JSONReader of(java.net.URL r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            java.io.InputStream r1 = r1.openStream()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            com.alibaba.fastjson2.JSONReader r2 = of(r1, r0, r2)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Lf
            r1.close()
        Lf:
            return r2
        L10:
            r2 = move-exception
            if (r1 == 0) goto L1b
            r1.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r1 = move-exception
            r2.addSuppressed(r1)
        L1b:
            throw r2
    }

    public static com.alibaba.fastjson2.JSONReader of(java.nio.ByteBuffer r1, com.alibaba.fastjson2.JSONReader.Context r2, java.nio.charset.Charset r3) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r3 == r0) goto Le
            if (r3 != 0) goto L7
            goto Le
        L7:
            java.lang.String r1 = "not support charset "
            ah.a.v(r3, r1)
            r1 = 0
            return r1
        Le:
            com.alibaba.fastjson2.JSONReaderUTF8 r3 = new com.alibaba.fastjson2.JSONReaderUTF8
            r3.<init>(r2, r1)
            return r3
    }

    public static com.alibaba.fastjson2.JSONReader of(java.nio.ByteBuffer r1, java.nio.charset.Charset r2) {
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReader r1 = of(r1, r0, r2)
            return r1
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r6) {
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r4 = 0
            int r5 = r6.length
            r2 = 0
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r6, int r7, int r8) {
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r2 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r6, int r7, int r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            r2 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r6, int r7, int r8, java.nio.charset.Charset r9) {
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r9 != r0) goto L12
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            r2 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L12:
            r3 = r6
            r4 = r7
            r5 = r8
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_16
            if (r9 != r6) goto L1f
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            r6.<init>(r1, r3, r4, r5)
            return r6
        L1f:
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.US_ASCII
            if (r9 == r6) goto L32
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r9 != r6) goto L28
            goto L32
        L28:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3, r4, r5, r9)
            com.alibaba.fastjson2.JSONReader r6 = of(r6, r1)
            return r6
        L32:
            com.alibaba.fastjson2.JSONReaderASCII r0 = new com.alibaba.fastjson2.JSONReaderASCII
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r8, int r9, int r10, java.nio.charset.Charset r11, com.alibaba.fastjson2.JSONReader.Context r12) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            if (r11 != r0) goto Lf
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r3 = 0
            r4 = r8
            r5 = r9
            r6 = r10
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        Lf:
            r4 = r8
            r5 = r9
            r6 = r10
            r2 = r12
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_16
            if (r11 != r8) goto L1d
            com.alibaba.fastjson2.JSONReaderUTF16 r8 = new com.alibaba.fastjson2.JSONReaderUTF16
            r8.<init>(r2, r4, r5, r6)
            return r8
        L1d:
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.US_ASCII
            if (r11 == r8) goto L25
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.ISO_8859_1
            if (r11 != r8) goto L27
        L25:
            r3 = r2
            goto L31
        L27:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r4, r5, r6, r11)
            com.alibaba.fastjson2.JSONReader r8 = of(r8, r2)
            return r8
        L31:
            com.alibaba.fastjson2.JSONReaderASCII r2 = new com.alibaba.fastjson2.JSONReaderASCII
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public static com.alibaba.fastjson2.JSONReader of(byte[] r6, com.alibaba.fastjson2.JSONReader.Context r7) {
            com.alibaba.fastjson2.JSONReaderUTF8 r0 = new com.alibaba.fastjson2.JSONReaderUTF8
            r4 = 0
            int r5 = r6.length
            r2 = 0
            r3 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(char[] r6) {
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r4 = 0
            int r5 = r6.length
            r2 = 0
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(char[] r6, int r7, int r8) {
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(char[] r6, int r7, int r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            r3 = r6
            r4 = r7
            r5 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader of(char[] r6, com.alibaba.fastjson2.JSONReader.Context r7) {
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r4 = 0
            int r5 = r6.length
            r2 = 0
            r3 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @java.lang.Deprecated
    public static com.alibaba.fastjson2.JSONReader ofJSONB(com.alibaba.fastjson2.JSONReader.Context r3, byte[] r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1 = 0
            int r2 = r4.length
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(java.io.InputStream r1, com.alibaba.fastjson2.JSONReader.Context r2) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r0.<init>(r2, r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r2 = 0
            int r3 = r4.length
            r0.<init>(r1, r4, r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r2, int r3, int r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r1, int r2, int r3, com.alibaba.fastjson2.JSONReader.Context r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r1, int r2, int r3, com.alibaba.fastjson2.SymbolTable r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            com.alibaba.fastjson2.JSONReader$Context r4 = com.alibaba.fastjson2.JSONFactory.createReadContext(r4)
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r3, com.alibaba.fastjson2.JSONReader.Context r4) {
            com.alibaba.fastjson2.JSONReaderJSONB r0 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1 = 0
            int r2 = r3.length
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    public static com.alibaba.fastjson2.JSONReader ofJSONB(byte[] r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            r0.config(r4)
            com.alibaba.fastjson2.JSONReaderJSONB r4 = new com.alibaba.fastjson2.JSONReaderJSONB
            r1 = 0
            int r2 = r3.length
            r4.<init>(r0, r3, r1, r2)
            return r4
    }

    public static com.alibaba.fastjson2.JSONException syntaxError(int r3) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "syntax error, expect ',', but '"
            r1.<init>(r2)
            char r3 = (char) r3
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONException syntaxError(int r3, int r4) {
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "syntax error, offset "
            java.lang.String r2 = ", char "
            java.lang.StringBuilder r3 = eh.a.t(r3, r1, r2)
            char r4 = (char) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            return r0
    }

    public final void addResolveTask(com.alibaba.fastjson2.reader.FieldReader r4, java.lang.Object r5, com.alibaba.fastjson2.JSONPath r6) {
            r3 = this;
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.resolveTasks = r0
        Lb:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            com.alibaba.fastjson2.JSONReader$ResolveTask r1 = new com.alibaba.fastjson2.JSONReader$ResolveTask
            java.lang.String r2 = r4.fieldName
            r1.<init>(r4, r5, r2, r6)
            r0.add(r1)
            return
    }

    public final void addResolveTask(java.util.Collection r4, int r5, com.alibaba.fastjson2.JSONPath r6) {
            r3 = this;
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.resolveTasks = r0
        Lb:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            com.alibaba.fastjson2.JSONReader$ResolveTask r1 = new com.alibaba.fastjson2.JSONReader$ResolveTask
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.<init>(r2, r4, r5, r6)
            r0.add(r1)
            return
    }

    public final void addResolveTask(java.util.Map r4, java.lang.Object r5, com.alibaba.fastjson2.JSONPath r6) {
            r3 = this;
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.resolveTasks = r0
        Lb:
            boolean r0 = r4 instanceof java.util.LinkedHashMap
            r1 = 0
            if (r0 == 0) goto L13
            r4.put(r5, r1)
        L13:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            com.alibaba.fastjson2.JSONReader$ResolveTask r2 = new com.alibaba.fastjson2.JSONReader$ResolveTask
            r2.<init>(r1, r4, r5, r6)
            r0.add(r2)
            return
    }

    public final void addResolveTask(java.lang.Object[] r4, int r5, com.alibaba.fastjson2.JSONPath r6) {
            r3 = this;
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.resolveTasks = r0
        Lb:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks
            com.alibaba.fastjson2.JSONReader$ResolveTask r1 = new com.alibaba.fastjson2.JSONReader$ResolveTask
            r2 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1.<init>(r2, r4, r5, r6)
            r0.add(r1)
            return
    }

    public final void bigInt(byte[] r23, int r24, int r25) {
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            int r4 = r3 - r2
            short r5 = r0.scale
            if (r5 <= 0) goto L10
            int r4 = r4 + (-1)
        L10:
            r5 = 38
            if (r4 > r5) goto L130
            r5 = 9
            int r4 = r4 % r5
            if (r4 != 0) goto L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r4 = r2 + r5
            int r5 = r2 + 1
            r6 = r1[r2]
            char r6 = (char) r6
            r7 = 46
            r8 = 2
            if (r6 != r7) goto L33
            int r2 = r2 + r8
            r5 = r1[r5]
            char r6 = (char) r5
            int r5 = r4 + 1
            r21 = r5
            r5 = r2
            r2 = r21
            goto L34
        L33:
            r2 = r4
        L34:
            int r6 = r6 + (-48)
        L36:
            r9 = 1
            if (r5 >= r4) goto L50
            r10 = r1[r5]
            char r10 = (char) r10
            if (r10 != r7) goto L49
            int r5 = r5 + 1
            r10 = r1[r5]
            char r10 = (char) r10
            int r2 = r2 + 1
            if (r4 >= r3) goto L49
            int r4 = r4 + 1
        L49:
            int r10 = r10 + (-48)
            int r6 = r6 * 10
            int r6 = r6 + r10
            int r5 = r5 + r9
            goto L36
        L50:
            r0.mag3 = r6
        L52:
            if (r2 >= r3) goto L12f
            int r4 = r2 + 9
            int r5 = r2 + 1
            r6 = r1[r2]
            char r6 = (char) r6
            if (r6 != r7) goto L67
            int r4 = r2 + 2
            r5 = r1[r5]
            char r6 = (char) r5
            int r2 = r2 + 10
            r5 = r4
            r4 = r2
            goto L68
        L67:
            r2 = r4
        L68:
            int r6 = r6 + (-48)
        L6a:
            if (r5 >= r4) goto L81
            r10 = r1[r5]
            char r10 = (char) r10
            if (r10 != r7) goto L7a
            int r5 = r5 + 1
            r10 = r1[r5]
            char r10 = (char) r10
            int r2 = r2 + 1
            int r4 = r4 + 1
        L7a:
            int r10 = r10 + (-48)
            int r6 = r6 * 10
            int r6 = r6 + r10
            int r5 = r5 + r9
            goto L6a
        L81:
            long r4 = (long) r6
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r10
            r6 = 3
            r12 = 0
            r14 = r6
        L8c:
            java.lang.String r15 = "BigInteger would overflow supported range"
            r16 = 32
            if (r14 < 0) goto Le5
            r17 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            if (r14 == 0) goto Ld0
            if (r14 == r9) goto Lc1
            if (r14 == r8) goto Lb2
            if (r14 != r6) goto Lac
            int r15 = r0.mag3
            r19 = r10
            long r10 = (long) r15
            long r10 = r10 & r19
            long r17 = r17 * r10
            long r10 = r17 + r12
            int r12 = (int) r10
            r0.mag3 = r12
            goto Lde
        Lac:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r15)
            throw r1
        Lb2:
            r19 = r10
            int r10 = r0.mag2
            long r10 = (long) r10
            long r10 = r10 & r19
            long r17 = r17 * r10
            long r10 = r17 + r12
            int r12 = (int) r10
            r0.mag2 = r12
            goto Lde
        Lc1:
            r19 = r10
            int r10 = r0.mag1
            long r10 = (long) r10
            long r10 = r10 & r19
            long r17 = r17 * r10
            long r10 = r17 + r12
            int r12 = (int) r10
            r0.mag1 = r12
            goto Lde
        Ld0:
            r19 = r10
            int r10 = r0.mag0
            long r10 = (long) r10
            long r10 = r10 & r19
            long r17 = r17 * r10
            long r10 = r17 + r12
            int r12 = (int) r10
            r0.mag0 = r12
        Lde:
            long r12 = r10 >>> r16
            int r14 = r14 + (-1)
            r10 = r19
            goto L8c
        Le5:
            r19 = r10
            int r10 = r0.mag3
            long r10 = (long) r10
            long r10 = r10 & r19
            long r10 = r10 + r4
            int r4 = (int) r10
            r0.mag3 = r4
            long r4 = r10 >>> r16
            r10 = r8
        Lf3:
            if (r10 < 0) goto L52
            if (r10 == 0) goto L121
            if (r10 == r9) goto L117
            if (r10 == r8) goto L10d
            if (r10 != r6) goto L107
            int r11 = r0.mag3
            long r11 = (long) r11
            long r11 = r11 & r19
            long r11 = r11 + r4
            int r4 = (int) r11
            r0.mag3 = r4
            goto L12a
        L107:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r15)
            throw r1
        L10d:
            int r11 = r0.mag2
            long r11 = (long) r11
            long r11 = r11 & r19
            long r11 = r11 + r4
            int r4 = (int) r11
            r0.mag2 = r4
            goto L12a
        L117:
            int r11 = r0.mag1
            long r11 = (long) r11
            long r11 = r11 & r19
            long r11 = r11 + r4
            int r4 = (int) r11
            r0.mag1 = r4
            goto L12a
        L121:
            int r11 = r0.mag0
            long r11 = (long) r11
            long r11 = r11 & r19
            long r11 = r11 + r4
            int r4 = (int) r11
            r0.mag0 = r4
        L12a:
            long r4 = r11 >>> r16
            int r10 = r10 + (-1)
            goto Lf3
        L12f:
            return
        L130:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r4)
            java.lang.String r1 = "number too large : "
            java.lang.String r1 = r1.concat(r3)
            ah.a.w(r1)
            return
    }

    public final void bigInt(char[] r21, int r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            int r4 = r3 - r2
            short r5 = r0.scale
            if (r5 <= 0) goto L10
            int r4 = r4 + (-1)
        L10:
            r5 = 38
            if (r4 > r5) goto L131
            r5 = 9
            int r4 = r4 % r5
            if (r4 != 0) goto L1a
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r4 = r2 + r5
            int r5 = r2 + 1
            char r6 = r1[r2]
            r7 = 46
            r8 = 2
            if (r6 != r7) goto L31
            int r2 = r2 + r8
            char r6 = r1[r5]
            int r5 = r4 + 1
            r19 = r5
            r5 = r2
            r2 = r19
            goto L32
        L31:
            r2 = r4
        L32:
            int r6 = r6 + (-48)
        L34:
            r9 = 1
            if (r5 >= r4) goto L4c
            char r10 = r1[r5]
            if (r10 != r7) goto L45
            int r5 = r5 + 1
            char r10 = r1[r5]
            int r2 = r2 + 1
            if (r4 >= r3) goto L45
            int r4 = r4 + 1
        L45:
            int r10 = r10 + (-48)
            int r6 = r6 * 10
            int r6 = r6 + r10
            int r5 = r5 + r9
            goto L34
        L4c:
            r0.mag3 = r6
        L4e:
            if (r2 >= r3) goto L130
            int r4 = r2 + 9
            int r5 = r2 + 1
            char r6 = r1[r2]
            if (r6 != r7) goto L61
            int r4 = r2 + 2
            char r6 = r1[r5]
            int r2 = r2 + 10
            r5 = r4
            r4 = r2
            goto L62
        L61:
            r2 = r4
        L62:
            int r6 = r6 + (-48)
        L64:
            if (r5 >= r4) goto L79
            char r10 = r1[r5]
            if (r10 != r7) goto L72
            int r5 = r5 + 1
            char r10 = r1[r5]
            int r2 = r2 + 1
            int r4 = r4 + 1
        L72:
            int r10 = r10 + (-48)
            int r6 = r6 * 10
            int r6 = r6 + r10
            int r5 = r5 + r9
            goto L64
        L79:
            r4 = 3
            r10 = 0
            r5 = r4
        L7d:
            java.lang.String r12 = "BigInteger would overflow supported range"
            if (r5 < 0) goto Lde
            r15 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            if (r5 == 0) goto Lc8
            if (r5 == r9) goto Lb6
            if (r5 == r8) goto La4
            if (r5 != r4) goto L9e
            int r12 = r0.mag3
            r22 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = (long) r12
            long r12 = r13 & r17
            long r15 = r15 * r12
            long r10 = r10 + r15
            int r12 = (int) r10
            r0.mag3 = r12
            goto Ld9
        L9e:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r12)
            throw r1
        La4:
            r22 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r12 = r0.mag2
            long r12 = (long) r12
            long r12 = r12 & r17
            long r15 = r15 * r12
            long r10 = r10 + r15
            int r12 = (int) r10
            r0.mag2 = r12
            goto Ld9
        Lb6:
            r22 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r12 = r0.mag1
            long r12 = (long) r12
            long r12 = r12 & r17
            long r15 = r15 * r12
            long r10 = r10 + r15
            int r12 = (int) r10
            r0.mag1 = r12
            goto Ld9
        Lc8:
            r22 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r12 = r0.mag0
            long r12 = (long) r12
            long r12 = r12 & r17
            long r15 = r15 * r12
            long r10 = r10 + r15
            int r12 = (int) r10
            r0.mag0 = r12
        Ld9:
            long r10 = r10 >>> r22
            int r5 = r5 + (-1)
            goto L7d
        Lde:
            r22 = 32
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = (long) r6
            long r5 = r5 & r17
            int r10 = r0.mag3
            long r10 = (long) r10
            long r10 = r10 & r17
            long r10 = r10 + r5
            int r5 = (int) r10
            r0.mag3 = r5
            long r5 = r10 >>> r22
            r10 = r8
        Lf4:
            if (r10 < 0) goto L4e
            if (r10 == 0) goto L122
            if (r10 == r9) goto L118
            if (r10 == r8) goto L10e
            if (r10 != r4) goto L108
            int r11 = r0.mag3
            long r13 = (long) r11
            long r13 = r13 & r17
            long r13 = r13 + r5
            int r5 = (int) r13
            r0.mag3 = r5
            goto L12b
        L108:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r12)
            throw r1
        L10e:
            int r11 = r0.mag2
            long r13 = (long) r11
            long r13 = r13 & r17
            long r13 = r13 + r5
            int r5 = (int) r13
            r0.mag2 = r5
            goto L12b
        L118:
            int r11 = r0.mag1
            long r13 = (long) r11
            long r13 = r13 & r17
            long r13 = r13 + r5
            int r5 = (int) r13
            r0.mag1 = r5
            goto L12b
        L122:
            int r11 = r0.mag0
            long r13 = (long) r11
            long r13 = r13 & r17
            long r13 = r13 + r5
            int r5 = (int) r13
            r0.mag0 = r5
        L12b:
            long r5 = r13 >>> r22
            int r10 = r10 + (-1)
            goto Lf4
        L130:
            return
        L131:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r4)
            java.lang.String r1 = "number too large : "
            java.lang.String r1 = r1.concat(r3)
            ah.a.w(r1)
            return
    }

    public final char char1(int r3) {
            r2 = this;
            r0 = 34
            if (r3 == r0) goto L6f
            r0 = 35
            if (r3 == r0) goto L6f
            r0 = 64
            if (r3 == r0) goto L6f
            r0 = 70
            if (r3 == r0) goto L6c
            r0 = 95
            if (r3 == r0) goto L6f
            r0 = 98
            if (r3 == r0) goto L69
            r0 = 102(0x66, float:1.43E-43)
            if (r3 == r0) goto L6c
            r0 = 110(0x6e, float:1.54E-43)
            if (r3 == r0) goto L66
            r0 = 114(0x72, float:1.6E-43)
            if (r3 == r0) goto L63
            r0 = 116(0x74, float:1.63E-43)
            if (r3 == r0) goto L60
            r0 = 118(0x76, float:1.65E-43)
            if (r3 == r0) goto L5d
            switch(r3) {
                case 38: goto L6f;
                case 39: goto L6f;
                case 40: goto L6f;
                case 41: goto L6f;
                default: goto L2f;
            }
        L2f:
            switch(r3) {
                case 46: goto L6f;
                case 47: goto L6f;
                case 48: goto L5b;
                case 49: goto L59;
                case 50: goto L57;
                case 51: goto L55;
                case 52: goto L53;
                case 53: goto L51;
                case 54: goto L4f;
                case 55: goto L4d;
                default: goto L32;
            }
        L32:
            switch(r3) {
                case 91: goto L6f;
                case 92: goto L6f;
                case 93: goto L6f;
                default: goto L35;
            }
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unclosed.str '\\"
            r0.<init>(r1)
            char r3 = (char) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r2.info(r3)
            ah.a.w(r3)
            r3 = 0
            return r3
        L4d:
            r3 = 7
            return r3
        L4f:
            r3 = 6
            return r3
        L51:
            r3 = 5
            return r3
        L53:
            r3 = 4
            return r3
        L55:
            r3 = 3
            return r3
        L57:
            r3 = 2
            return r3
        L59:
            r3 = 1
            return r3
        L5b:
            r3 = 0
            return r3
        L5d:
            r3 = 11
            return r3
        L60:
            r3 = 9
            return r3
        L63:
            r3 = 13
            return r3
        L66:
            r3 = 10
            return r3
        L69:
            r3 = 8
            return r3
        L6c:
            r3 = 12
            return r3
        L6f:
            char r3 = (char) r3
            return r3
    }

    public com.alibaba.fastjson2.reader.ObjectReader checkAutoType(java.lang.Class r1, long r2, long r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final char current() {
            r1 = this;
            char r0 = r1.f1814ch
            return r0
    }

    public final java.math.BigDecimal decimal(com.alibaba.fastjson2.JSONObject r2) {
            r1 = this;
            java.lang.String r0 = "value"
            java.math.BigDecimal r0 = r2.getBigDecimal(r0)
            if (r0 != 0) goto Le
            java.lang.String r0 = "$numberDecimal"
            java.math.BigDecimal r0 = r2.getBigDecimal(r0)
        Le:
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.String r0 = "can not cast to decimal "
            ah.a.v(r2, r0)
            r2 = 0
            return r2
    }

    public void endArray() {
            r0 = this;
            r0.next()
            return
    }

    public com.alibaba.fastjson2.JSONException error() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal ch "
            r1.<init>(r2)
            char r2 = r3.f1814ch
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r3.info(r1)
            r0.<init>(r1)
            return r0
    }

    public final com.alibaba.fastjson2.JSONException error(int r4, int r5) {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "error, offset "
            java.lang.String r2 = ", char "
            java.lang.StringBuilder r4 = eh.a.t(r4, r1, r2)
            char r5 = (char) r5
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final com.alibaba.fastjson2.JSONException error(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = r1.info(r2)
            r0.<init>(r2)
            return r0
    }

    public final com.alibaba.fastjson2.JSONException error(java.lang.String r2, java.lang.Exception r3) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r2 = r1.info(r2)
            r0.<init>(r2, r3)
            return r0
    }

    public final void errorOnNoneSerializable(java.lang.Class r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNoneSerializable
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L25
            java.lang.Class<java.io.Serializable> r0 = java.io.Serializable.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L18
            goto L25
        L18:
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = "not support none-Serializable, class "
            java.lang.String r5 = r0.concat(r5)
            ah.a.w(r5)
        L25:
            return
    }

    public final long features(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 | r0
            return r3
    }

    public final java.math.BigDecimal getBigDecimal() {
            r16 = this;
            r1 = r16
            boolean r0 = r1.wasNull
            r2 = 0
            if (r0 == 0) goto L8
            return r2
        L8:
            byte r0 = r1.valueType
            r4 = 32
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r7 = 4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r10 = 3
            r11 = 0
            r12 = 2
            r13 = 1
            if (r0 == r13) goto L138
            if (r0 == r12) goto L7f
            if (r0 == r10) goto L5e
            if (r0 == r7) goto L54
            r2 = 6
            java.lang.String r3 = "TODO : "
            if (r0 == r2) goto L38
            r2 = 8
            if (r0 != r2) goto L31
            java.lang.String r0 = r1.stringValue
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r0
        L31:
            byte r0 = r1.valueType
            ah.a.y(r0, r3)
            r0 = 0
            return r0
        L38:
            java.lang.Object r0 = r1.complex
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            java.lang.String r2 = "value"
            java.math.BigDecimal r2 = r0.getBigDecimal(r2)
            if (r2 != 0) goto L4a
            java.lang.String r2 = "$numberDecimal"
            java.math.BigDecimal r2 = r0.getBigDecimal(r2)
        L4a:
            if (r2 == 0) goto L4d
            return r2
        L4d:
            byte r0 = r1.valueType
            ah.a.y(r0, r3)
            r0 = 0
            return r0
        L54:
            boolean r0 = r1.boolValue
            if (r0 == 0) goto L5b
            java.math.BigDecimal r0 = java.math.BigDecimal.ONE
            return r0
        L5b:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
            return r0
        L5e:
            java.lang.String r0 = r1.stringValue     // Catch: java.lang.NumberFormatException -> L65
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)     // Catch: java.lang.NumberFormatException -> L65
            return r0
        L65:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "read decimal error, value "
            r2.<init>(r3)
            java.lang.String r3 = r1.stringValue
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r1.info(r2)
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        L7f:
            short r0 = r1.exponent
            if (r0 != 0) goto Lb8
            int r0 = r1.mag0
            if (r0 != 0) goto Lb8
            int r0 = r1.mag1
            if (r0 != 0) goto Lb8
            int r0 = r1.mag2
            if (r0 != 0) goto La0
            int r14 = r1.mag3
            if (r14 < 0) goto La0
            boolean r0 = r1.negative
            if (r0 == 0) goto L98
            int r14 = -r14
        L98:
            long r4 = (long) r14
            short r0 = r1.scale
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r4, r0)
            goto Lb9
        La0:
            int r14 = r1.mag3
            long r14 = (long) r14
            long r14 = r14 & r8
            long r2 = (long) r0
            long r2 = r2 & r8
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb8
            long r2 = r2 << r4
            long r2 = r2 + r14
            boolean r0 = r1.negative
            if (r0 == 0) goto Lb1
            long r2 = -r2
        Lb1:
            short r0 = r1.scale
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r2, r0)
            goto Lb9
        Lb8:
            r2 = 0
        Lb9:
            if (r2 != 0) goto L110
            int r0 = r1.mag0
            if (r0 != 0) goto Le5
            int r0 = r1.mag1
            if (r0 != 0) goto Ld8
            int r0 = r1.mag2
            if (r0 != 0) goto Lce
            int[] r0 = new int[r13]
            int r2 = r1.mag3
            r0[r11] = r2
            goto Lf6
        Lce:
            int[] r2 = new int[r12]
            r2[r11] = r0
            int r0 = r1.mag3
            r2[r13] = r0
        Ld6:
            r0 = r2
            goto Lf6
        Ld8:
            int[] r2 = new int[r10]
            r2[r11] = r0
            int r0 = r1.mag2
            r2[r13] = r0
            int r0 = r1.mag3
            r2[r12] = r0
            goto Ld6
        Le5:
            int[] r2 = new int[r7]
            r2[r11] = r0
            int r0 = r1.mag1
            r2[r13] = r0
            int r0 = r1.mag2
            r2[r12] = r0
            int r0 = r1.mag3
            r2[r10] = r0
            goto Ld6
        Lf6:
            boolean r2 = r1.negative
            if (r2 == 0) goto Lfc
            r3 = -1
            goto Lfd
        Lfc:
            r3 = r13
        Lfd:
            java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> r2 = com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r2.apply(r3, r0)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.math.BigDecimal r2 = new java.math.BigDecimal
            short r3 = r1.scale
            r2.<init>(r0, r3)
        L110:
            short r0 = r1.exponent
            if (r0 == 0) goto L137
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.toPlainString()
            r0.append(r2)
            java.lang.String r2 = "E"
            r0.append(r2)
            short r2 = r1.exponent
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            double r2 = java.lang.Double.parseDouble(r0)
            java.math.BigDecimal r0 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r2)
            return r0
        L137:
            return r2
        L138:
            int r0 = r1.mag1
            if (r0 != 0) goto L151
            int r2 = r1.mag2
            if (r2 != 0) goto L151
            int r2 = r1.mag3
            if (r2 < 0) goto L151
            boolean r0 = r1.negative
            if (r0 == 0) goto L14b
            int r0 = -r2
            long r2 = (long) r0
            goto L14c
        L14b:
            long r2 = (long) r2
        L14c:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r2)
            return r0
        L151:
            int r2 = r1.mag0
            if (r2 != 0) goto L184
            if (r0 != 0) goto L177
            int r0 = r1.mag3
            long r2 = (long) r0
            long r2 = r2 & r8
            int r7 = r1.mag2
            long r14 = (long) r7
            long r8 = r8 & r14
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L170
            long r4 = r8 << r4
            long r4 = r4 + r2
            boolean r0 = r1.negative
            if (r0 == 0) goto L16b
            long r4 = -r4
        L16b:
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r4)
            return r0
        L170:
            int[] r2 = new int[r12]
            r2[r11] = r7
            r2[r13] = r0
            goto L193
        L177:
            int[] r2 = new int[r10]
            r2[r11] = r0
            int r0 = r1.mag2
            r2[r13] = r0
            int r0 = r1.mag3
            r2[r12] = r0
            goto L193
        L184:
            int[] r3 = new int[r7]
            r3[r11] = r2
            r3[r13] = r0
            int r0 = r1.mag2
            r3[r12] = r0
            int r0 = r1.mag3
            r3[r10] = r0
            r2 = r3
        L193:
            boolean r0 = r1.negative
            if (r0 == 0) goto L199
            r3 = -1
            goto L19a
        L199:
            r3 = r13
        L19a:
            java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> r0 = com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.apply(r3, r2)
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0)
            return r2
    }

    public final java.math.BigInteger getBigInteger() {
            r2 = this;
            java.lang.Number r0 = r2.getNumber()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto Lf
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        Lf:
            long r0 = r0.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            return r0
    }

    public final com.alibaba.fastjson2.JSONReader.Context getContext() {
            r1 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            return r0
    }

    public final double getDoubleValue() {
            r10 = this;
            byte r0 = r10.valueType
            r1 = 0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 1: goto L92;
                case 2: goto L89;
                case 3: goto L73;
                case 4: goto L6b;
                case 5: goto L51;
                case 6: goto L3c;
                case 7: goto L25;
                case 8: goto L17;
                case 9: goto L92;
                case 10: goto L92;
                case 11: goto L89;
                case 12: goto L89;
                case 13: goto L89;
                case 14: goto L14;
                default: goto La;
            }
        La:
            java.lang.String r0 = "TODO : "
            byte r1 = r10.valueType
            ah.a.y(r1, r0)
            r0 = 0
            return r0
        L14:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            return r0
        L17:
            java.math.BigDecimal r0 = r10.getBigDecimal()     // Catch: java.lang.ArithmeticException -> L20
            double r0 = r0.doubleValue()     // Catch: java.lang.ArithmeticException -> L20
            return r0
        L20:
            com.alibaba.fastjson2.JSONException r0 = r10.numberError()
            throw r0
        L25:
            java.lang.Object r0 = r10.complex
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L32
            goto L39
        L32:
            java.lang.Object r0 = r10.complex
            double r0 = com.alibaba.fastjson2.util.TypeUtils.toDoubleValue(r0)
            return r0
        L39:
            r10.wasNull = r3
            return r4
        L3c:
            java.lang.Object r0 = r10.complex
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L4e
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L49
            goto L4e
        L49:
            double r0 = com.alibaba.fastjson2.util.TypeUtils.toDoubleValue(r0)
            return r0
        L4e:
            r10.wasNull = r3
            return r4
        L51:
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r6 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r8 = r0.mask
            long r6 = r6 & r8
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L5f
            goto L72
        L5f:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L6b:
            boolean r0 = r10.boolValue
            if (r0 == 0) goto L72
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
        L72:
            return r4
        L73:
            java.lang.String r0 = r10.stringValue     // Catch: java.lang.NumberFormatException -> L7a
            double r0 = com.alibaba.fastjson2.util.TypeUtils.toDoubleValue(r0)     // Catch: java.lang.NumberFormatException -> L7a
            return r0
        L7a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L89:
            java.lang.Number r0 = r10.getNumber()
            double r0 = r0.doubleValue()
            return r0
        L92:
            int r0 = r10.mag1
            if (r0 != 0) goto La9
            int r0 = r10.mag2
            if (r0 != 0) goto La9
            int r0 = r10.mag3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto La9
            boolean r1 = r10.negative
            if (r1 == 0) goto La7
            int r0 = -r0
            double r0 = (double) r0
            return r0
        La7:
            double r0 = (double) r0
            return r0
        La9:
            java.lang.Number r0 = r10.getNumber()
            boolean r3 = r0 instanceof java.math.BigInteger
            if (r3 == 0) goto Ld1
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            com.alibaba.fastjson2.JSONReader$Context r3 = r10.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.NonErrorOnNumberOverflow
            long r5 = r5.mask
            long r3 = r3 & r5
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto Lc6
            long r0 = r0.longValue()
            double r0 = (double) r0
            return r0
        Lc6:
            long r0 = a1.c.d(r0)     // Catch: java.lang.ArithmeticException -> Lcc
            double r0 = (double) r0
            return r0
        Lcc:
            com.alibaba.fastjson2.JSONException r0 = r10.numberError()
            throw r0
        Ld1:
            double r0 = r0.doubleValue()
            return r0
    }

    public abstract java.lang.String getFieldName();

    public final float getFloatValue() {
            r2 = this;
            double r0 = r2.getDoubleValue()
            float r0 = (float) r0
            return r0
    }

    public final int getInt32Value() {
            r10 = this;
            byte r0 = r10.valueType
            java.lang.String r1 = "integer overflow "
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            r6 = 0
            switch(r0) {
                case 1: goto L9f;
                case 2: goto L96;
                case 3: goto L8f;
                case 4: goto L8c;
                case 5: goto L72;
                case 6: goto L63;
                case 7: goto L5a;
                case 8: goto L4c;
                case 9: goto L9f;
                case 10: goto L9f;
                case 11: goto L18;
                case 12: goto L18;
                case 13: goto L18;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "TODO : "
            byte r1 = r10.valueType
            ah.a.y(r1, r0)
            r0 = 0
            return r0
        L18:
            java.lang.Number r0 = r10.getNumber()
            long r8 = r0.longValue()
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L35
        L28:
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r2 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.NonErrorOnNumberOverflow
            long r4 = r0.mask
            long r2 = r2 & r4
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L37
        L35:
            int r0 = (int) r8
            return r0
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L4c:
            java.math.BigDecimal r0 = r10.getBigDecimal()     // Catch: java.lang.ArithmeticException -> L55
            int r0 = r0.intValueExact()     // Catch: java.lang.ArithmeticException -> L55
            return r0
        L55:
            com.alibaba.fastjson2.JSONException r0 = r10.numberError()
            throw r0
        L5a:
            java.lang.Object r0 = r10.complex
            java.util.List r0 = (java.util.List) r0
            int r0 = r10.toInt(r0)
            return r0
        L63:
            java.lang.Object r0 = r10.complex
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Number r0 = r10.toNumber(r0)
            if (r0 == 0) goto L7f
            int r0 = r0.intValue()
            return r0
        L72:
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r2 = r2.mask
            long r0 = r0 & r2
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L81
        L7f:
            r0 = 0
            return r0
        L81:
            java.lang.String r0 = "int value not support input null"
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L8c:
            boolean r0 = r10.boolValue
            return r0
        L8f:
            java.lang.String r0 = r10.stringValue
            int r0 = r10.toInt32(r0)
            return r0
        L96:
            java.lang.Number r0 = r10.getNumber()
            int r0 = r0.intValue()
            return r0
        L9f:
            int r0 = r10.mag1
            if (r0 != 0) goto Lb3
            int r0 = r10.mag2
            if (r0 != 0) goto Lb3
            int r0 = r10.mag3
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r8) goto Lb3
            boolean r1 = r10.negative
            if (r1 == 0) goto Lb2
            int r0 = -r0
        Lb2:
            return r0
        Lb3:
            java.lang.Number r0 = r10.getNumber()
            boolean r8 = r0 instanceof java.lang.Long
            if (r8 == 0) goto Lde
            long r6 = r0.longValue()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto Lc9
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto Lc9
            int r0 = (int) r6
            return r0
        Lc9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lde:
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L100
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            com.alibaba.fastjson2.JSONReader$Context r1 = r10.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.NonErrorOnNumberOverflow
            long r3 = r3.mask
            long r1 = r1 & r3
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto Lf6
            int r0 = r0.intValue()
            return r0
        Lf6:
            int r0 = a1.c.c(r0)     // Catch: java.lang.ArithmeticException -> Lfb
            return r0
        Lfb:
            com.alibaba.fastjson2.JSONException r0 = r10.numberError()
            throw r0
        L100:
            int r0 = r0.intValue()
            return r0
    }

    public final long getInt64Value() {
            r7 = this;
            byte r0 = r7.valueType
            r1 = 0
            switch(r0) {
                case 1: goto L6d;
                case 2: goto L64;
                case 3: goto L5d;
                case 4: goto L55;
                case 5: goto L3b;
                case 6: goto L32;
                case 7: goto L28;
                case 8: goto L1a;
                case 9: goto L6d;
                case 10: goto L6d;
                case 11: goto L11;
                case 12: goto L11;
                case 13: goto L11;
                default: goto L7;
            }
        L7:
            java.lang.String r0 = "TODO : "
            byte r1 = r7.valueType
            ah.a.y(r1, r0)
            r0 = 0
            return r0
        L11:
            java.lang.Number r0 = r7.getNumber()
            long r0 = r0.longValue()
            return r0
        L1a:
            java.math.BigDecimal r0 = r7.getBigDecimal()     // Catch: java.lang.ArithmeticException -> L23
            long r0 = r0.longValueExact()     // Catch: java.lang.ArithmeticException -> L23
            return r0
        L23:
            com.alibaba.fastjson2.JSONException r0 = r7.numberError()
            throw r0
        L28:
            java.lang.Object r0 = r7.complex
            java.util.List r0 = (java.util.List) r0
            int r0 = r7.toInt(r0)
            long r0 = (long) r0
            return r0
        L32:
            java.lang.Object r0 = r7.complex
            java.util.Map r0 = (java.util.Map) r0
            long r0 = r7.toLong(r0)
            return r0
        L3b:
            com.alibaba.fastjson2.JSONReader$Context r0 = r7.context
            long r3 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNullForPrimitives
            long r5 = r0.mask
            long r3 = r3 & r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            goto L5c
        L49:
            java.lang.String r0 = "long value not support input null"
            java.lang.String r0 = r7.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L55:
            boolean r0 = r7.boolValue
            if (r0 == 0) goto L5c
            r0 = 1
            return r0
        L5c:
            return r1
        L5d:
            java.lang.String r0 = r7.stringValue
            long r0 = r7.toInt64(r0)
            return r0
        L64:
            java.lang.Number r0 = r7.getNumber()
            long r0 = r0.longValue()
            return r0
        L6d:
            int r0 = r7.mag1
            if (r0 != 0) goto L84
            int r0 = r7.mag2
            if (r0 != 0) goto L84
            int r0 = r7.mag3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r3) goto L84
            boolean r1 = r7.negative
            if (r1 == 0) goto L82
            int r0 = -r0
            long r0 = (long) r0
            return r0
        L82:
            long r0 = (long) r0
            return r0
        L84:
            java.lang.Number r0 = r7.getNumber()
            boolean r3 = r0 instanceof java.math.BigInteger
            if (r3 == 0) goto Laa
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            com.alibaba.fastjson2.JSONReader$Context r3 = r7.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.NonErrorOnNumberOverflow
            long r5 = r5.mask
            long r3 = r3 & r5
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto La0
            long r0 = r0.longValue()
            return r0
        La0:
            long r0 = a1.c.d(r0)     // Catch: java.lang.ArithmeticException -> La5
            return r0
        La5:
            com.alibaba.fastjson2.JSONException r0 = r7.numberError()
            throw r0
        Laa:
            long r0 = r0.longValue()
            return r0
    }

    public final java.util.Locale getLocale() {
            r1 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            java.util.Locale r0 = r0.getLocale()
            return r0
    }

    public abstract long getNameHashCodeLCase();

    public final java.lang.Number getNumber() {
            r22 = this;
            r0 = r22
            boolean r1 = r0.wasNull
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            byte r1 = r0.valueType
            java.lang.String r6 = "shortValue overflow"
            r7 = -1
            r8 = 4
            java.lang.String r9 = "E"
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r12 = 3
            r13 = 0
            r15 = 2
            r16 = 0
            r17 = r2
            r2 = 1
            switch(r1) {
                case 1: goto L27b;
                case 2: goto L163;
                case 3: goto L158;
                case 4: goto L151;
                case 5: goto L150;
                case 6: goto L147;
                case 7: goto L13e;
                case 8: goto L11e;
                case 9: goto Lfa;
                case 10: goto Ld6;
                case 11: goto L27b;
                case 12: goto L2a;
                case 13: goto L2a;
                default: goto L21;
            }
        L21:
            java.lang.String r1 = "TODO : "
            byte r2 = r0.valueType
            ah.a.y(r2, r1)
            r1 = 0
            return r1
        L2a:
            int r1 = r0.mag0
            if (r1 != 0) goto L54
            int r1 = r0.mag1
            if (r1 != 0) goto L47
            int r1 = r0.mag2
            if (r1 != 0) goto L3d
            int[] r1 = new int[r2]
            int r3 = r0.mag3
            r1[r16] = r3
            goto L65
        L3d:
            int[] r3 = new int[r15]
            r3[r16] = r1
            int r1 = r0.mag3
            r3[r2] = r1
        L45:
            r1 = r3
            goto L65
        L47:
            int[] r3 = new int[r12]
            r3[r16] = r1
            int r1 = r0.mag2
            r3[r2] = r1
            int r1 = r0.mag3
            r3[r15] = r1
            goto L45
        L54:
            int[] r3 = new int[r8]
            r3[r16] = r1
            int r1 = r0.mag1
            r3[r2] = r1
            int r1 = r0.mag2
            r3[r15] = r1
            int r1 = r0.mag3
            r3[r12] = r1
            goto L45
        L65:
            boolean r3 = r0.negative
            if (r3 == 0) goto L6a
            goto L6b
        L6a:
            r7 = r2
        L6b:
            java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> r2 = com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r2.apply(r3, r1)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            java.math.BigDecimal r2 = new java.math.BigDecimal
            short r3 = r0.scale
            r2.<init>(r1, r3)
            byte r1 = r0.valueType
            short r3 = r0.exponent
            r4 = 12
            if (r1 != r4) goto Lae
            if (r3 == 0) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            short r2 = r0.exponent
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            float r1 = java.lang.Float.parseFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        La5:
            float r1 = r2.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        Lae:
            if (r3 == 0) goto Lcd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            short r2 = r0.exponent
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        Lcd:
            double r1 = r2.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        Ld6:
            int r1 = r0.mag0
            if (r1 != 0) goto Lf1
            int r1 = r0.mag1
            if (r1 != 0) goto Lf1
            int r1 = r0.mag2
            if (r1 != 0) goto Lf1
            int r1 = r0.mag3
            if (r1 < 0) goto Lf1
            boolean r2 = r0.negative
            if (r2 == 0) goto Leb
            int r1 = -r1
        Leb:
            short r1 = (short) r1
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        Lf1:
            java.lang.String r1 = r0.info(r6)
            ah.a.w(r1)
            r1 = 0
            return r1
        Lfa:
            int r1 = r0.mag0
            if (r1 != 0) goto L115
            int r1 = r0.mag1
            if (r1 != 0) goto L115
            int r1 = r0.mag2
            if (r1 != 0) goto L115
            int r1 = r0.mag3
            if (r1 < 0) goto L115
            boolean r2 = r0.negative
            if (r2 == 0) goto L10f
            int r1 = -r1
        L10f:
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
        L115:
            java.lang.String r1 = r0.info(r6)
            ah.a.w(r1)
            r1 = 0
            return r1
        L11e:
            short r1 = r0.scale
            if (r1 <= 0) goto L136
            int r2 = com.alibaba.fastjson2.JSONFactory.defaultDecimalMaxScale
            if (r1 > r2) goto L12d
            java.lang.String r1 = r0.stringValue
            java.math.BigDecimal r1 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r1)
            return r1
        L12d:
            java.lang.String r1 = "scale overflow : "
            short r2 = r0.scale
            ah.a.y(r2, r1)
            r1 = 0
            return r1
        L136:
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r2 = r0.stringValue
            r1.<init>(r2)
            return r1
        L13e:
            java.lang.Object r1 = r0.complex
            java.util.List r1 = (java.util.List) r1
            java.lang.Number r1 = r0.toNumber(r1)
            return r1
        L147:
            java.lang.Object r1 = r0.complex
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Number r1 = r0.toNumber(r1)
            return r1
        L150:
            return r17
        L151:
            boolean r1 = r0.boolValue
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L158:
            java.lang.String r1 = r0.stringValue
            long r1 = r0.toInt64(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L163:
            int r1 = r0.mag0
            if (r1 != 0) goto L1a3
            int r1 = r0.mag1
            if (r1 != 0) goto L1a3
            int r1 = r0.mag2
            if (r1 != 0) goto L183
            int r6 = r0.mag3
            if (r6 < 0) goto L183
            boolean r1 = r0.negative
            if (r1 == 0) goto L178
            int r6 = -r6
        L178:
            long r3 = (long) r6
            short r1 = r0.scale
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r3, r1)
            r18 = r2
            r2 = r1
            goto L1a7
        L183:
            int r6 = r0.mag3
            r18 = r2
            r19 = 32
            long r2 = (long) r6
            long r2 = r2 & r10
            r20 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r4 = (long) r1
            long r4 = r4 & r10
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 > 0) goto L1a5
            long r4 = r4 << r19
            long r4 = r4 + r2
            boolean r1 = r0.negative
            if (r1 == 0) goto L19c
            long r4 = -r4
        L19c:
            short r1 = r0.scale
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r4, r1)
            goto L1a7
        L1a3:
            r18 = r2
        L1a5:
            r2 = r17
        L1a7:
            if (r2 != 0) goto L218
            int r1 = r0.mag0
            if (r1 != 0) goto L1ca
            int r1 = r0.mag1
            if (r1 != 0) goto L1bc
            int[] r1 = new int[r15]
            int r2 = r0.mag2
            r1[r16] = r2
            int r2 = r0.mag3
            r1[r18] = r2
            goto L1db
        L1bc:
            int[] r2 = new int[r12]
            r2[r16] = r1
            int r1 = r0.mag2
            r2[r18] = r1
            int r1 = r0.mag3
            r2[r15] = r1
        L1c8:
            r1 = r2
            goto L1db
        L1ca:
            int[] r2 = new int[r8]
            r2[r16] = r1
            int r1 = r0.mag1
            r2[r18] = r1
            int r1 = r0.mag2
            r2[r15] = r1
            int r1 = r0.mag3
            r2[r12] = r1
            goto L1c8
        L1db:
            boolean r2 = r0.negative
            if (r2 == 0) goto L1e0
            goto L1e2
        L1e0:
            r7 = r18
        L1e2:
            java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> r2 = com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r2.apply(r3, r1)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            short r2 = r0.scale
            short r3 = r0.exponent
            int r2 = r2 - r3
            java.math.BigDecimal r3 = new java.math.BigDecimal
            r3.<init>(r1, r2)
            short r1 = r0.exponent
            if (r1 == 0) goto L217
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForDoubles
            long r4 = r4.mask
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForFloats
            long r6 = r6.mask
            long r4 = r4 | r6
            long r1 = r1 & r4
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 != 0) goto L217
            double r1 = r3.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L217:
            r2 = r3
        L218:
            short r1 = r0.exponent
            if (r1 == 0) goto L264
            java.lang.String r1 = r2.toPlainString()
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForDoubles
            long r5 = r5.mask
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.UseBigDecimalForFloats
            long r7 = r7.mask
            long r5 = r5 | r7
            long r3 = r3 & r5
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L248
            java.lang.StringBuilder r1 = bc.e.n(r1, r9)
            short r2 = r0.exponent
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L248:
            int r2 = r2.signum()
            if (r2 != 0) goto L251
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            return r1
        L251:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.StringBuilder r1 = bc.e.n(r1, r9)
            short r3 = r0.exponent
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            return r2
        L264:
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r3 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.UseDoubleForDecimals
            long r5 = r1.mask
            long r3 = r3 & r5
            int r1 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r1 == 0) goto L27a
            double r1 = r2.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L27a:
            return r2
        L27b:
            r18 = r2
            r19 = 32
            r20 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = r0.mag0
            if (r2 != 0) goto L302
            int r3 = r0.mag1
            if (r3 != 0) goto L302
            int r3 = r0.mag2
            if (r3 != 0) goto L302
            int r3 = r0.mag3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L302
            boolean r2 = r0.negative
            if (r2 == 0) goto L2b6
            if (r3 >= 0) goto L2b4
            long r1 = (long) r3
            long r1 = r1 & r10
            long r1 = -r1
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.UseBigIntegerForInts
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L2af
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            return r1
        L2af:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L2b4:
            int r3 = -r3
            goto L2d1
        L2b6:
            if (r3 >= 0) goto L2d1
            long r1 = (long) r3
            long r1 = r1 & r10
            com.alibaba.fastjson2.JSONReader$Context r3 = r0.context
            long r3 = r3.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.UseBigIntegerForInts
            long r5 = r5.mask
            long r3 = r3 & r5
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 == 0) goto L2cc
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            return r1
        L2cc:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L2d1:
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r4 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.UseBigIntegerForInts
            long r6 = r2.mask
            long r6 = r6 & r4
            int r2 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r2 == 0) goto L2e4
            long r1 = (long) r3
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            return r1
        L2e4:
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.UseLongForInts
            long r6 = r2.mask
            long r4 = r4 & r6
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 == 0) goto L2f3
            long r1 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L2f3:
            r2 = 11
            if (r1 != r2) goto L2fd
            long r1 = (long) r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L2fd:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            return r1
        L302:
            if (r2 != 0) goto L347
            int r1 = r0.mag1
            if (r1 != 0) goto L33a
            int r1 = r0.mag3
            long r2 = (long) r1
            long r2 = r2 & r10
            int r4 = r0.mag2
            long r5 = (long) r4
            long r5 = r5 & r10
            int r8 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r8 > 0) goto L333
            long r4 = r5 << r19
            long r4 = r4 + r2
            boolean r1 = r0.negative
            if (r1 == 0) goto L31c
            long r4 = -r4
        L31c:
            com.alibaba.fastjson2.JSONReader$Context r1 = r0.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.UseBigIntegerForInts
            long r6 = r3.mask
            long r1 = r1 & r6
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 == 0) goto L32e
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r4)
            return r1
        L32e:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            return r1
        L333:
            int[] r2 = new int[r15]
            r2[r16] = r4
            r2[r18] = r1
            goto L358
        L33a:
            int[] r2 = new int[r12]
            r2[r16] = r1
            int r1 = r0.mag2
            r2[r18] = r1
            int r1 = r0.mag3
            r2[r15] = r1
            goto L358
        L347:
            int[] r1 = new int[r8]
            r1[r16] = r2
            int r2 = r0.mag1
            r1[r18] = r2
            int r2 = r0.mag2
            r1[r15] = r2
            int r2 = r0.mag3
            r1[r12] = r2
            r2 = r1
        L358:
            boolean r1 = r0.negative
            if (r1 == 0) goto L35d
            goto L35f
        L35d:
            r7 = r18
        L35f:
            java.util.function.BiFunction<java.lang.Integer, int[], java.math.BigInteger> r1 = com.alibaba.fastjson2.JSONReader.BigIntegerCreator.BIG_INTEGER_CREATOR
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.apply(r3, r2)
            java.math.BigInteger r1 = (java.math.BigInteger) r1
            com.alibaba.fastjson2.JSONReader$Context r2 = r0.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.UseLongForInts
            long r4 = r4.mask
            long r2 = r2 & r4
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L380
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L380:
            return r1
    }

    public final com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.reflect.Type r6) {
            r5 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r5.context
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
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r6, r1)
            return r6
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReaderAutoType(long r4, java.lang.Class r6, long r7) {
            r3 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r3.context
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReaderAutoType(r4)
            if (r4 == 0) goto L9
            return r4
        L9:
            java.lang.String r4 = r3.getString()
            com.alibaba.fastjson2.JSONReader$Context r5 = r3.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r5 = r5.autoTypeBeforeHandler
            if (r5 == 0) goto L31
            java.lang.Class r5 = r5.apply(r4, r6, r7)
            if (r5 == 0) goto L31
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r0 = r4.mask
            long r6 = r7 & r0
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 == 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            com.alibaba.fastjson2.JSONReader$Context r6 = r3.context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = r6.provider
            com.alibaba.fastjson2.reader.ObjectReader r4 = r6.getObjectReader(r5, r4)
            return r4
        L31:
            com.alibaba.fastjson2.JSONReader$Context r5 = r3.context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r5.provider
            long r1 = r5.features
            long r7 = r7 | r1
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4, r6, r7)
            return r4
    }

    public final int getOffset() {
            r1 = this;
            int r0 = r1.offset
            return r0
    }

    public abstract int getRawInt();

    public abstract long getRawLong();

    public abstract java.lang.String getString();

    public abstract int getStringLength();

    public byte getType() {
            r1 = this;
            r0 = -128(0xffffffffffffff80, float:NaN)
            return r0
    }

    public final java.time.ZoneId getZoneId() {
            r1 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            java.time.ZoneId r0 = r0.getZoneId()
            return r0
    }

    public final void handleResolveTasks(java.lang.Object r13) {
            r12 = this;
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r12.resolveTasks
            if (r0 != 0) goto L6
            goto Lfa
        L6:
            r0 = 0
            r1 = 0
            r2 = r0
        L9:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r12.resolveTasks
            int r3 = r3.size()
            if (r2 >= r3) goto Lfa
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r12.resolveTasks
            java.lang.Object r3 = r3.get(r2)
            com.alibaba.fastjson2.JSONReader$ResolveTask r3 = (com.alibaba.fastjson2.JSONReader.ResolveTask) r3
            com.alibaba.fastjson2.JSONPath r4 = r3.reference
            com.alibaba.fastjson2.reader.FieldReader r5 = r3.fieldReader
            boolean r6 = r4.previous
            if (r6 == 0) goto L22
            goto L46
        L22:
            com.alibaba.fastjson2.JSONReader$Context r1 = r12.context
            r4.readerContext = r1
            long r6 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r8 = r1.mask
            long r6 = r6 & r8
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L42
            com.alibaba.fastjson2.JSONWriter$Context r1 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
            long r6 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r8 = r8.mask
            long r6 = r6 | r8
            r1.features = r6
            r4.writerContext = r1
        L42:
            java.lang.Object r1 = r4.eval(r13)
        L46:
            java.lang.Object r4 = r3.name
            java.lang.Object r3 = r3.object
            if (r4 == 0) goto Lf3
            boolean r6 = r3 instanceof java.util.Map
            if (r6 == 0) goto Lac
            java.util.Map r3 = (java.util.Map) r3
            boolean r5 = r4 instanceof com.alibaba.fastjson2.util.ReferenceKey
            if (r5 == 0) goto La8
            boolean r5 = r3 instanceof java.util.LinkedHashMap
            if (r5 == 0) goto La0
            int r5 = r3.size()
            if (r5 != 0) goto L62
            goto Lf6
        L62:
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.util.Set r8 = r3.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L6f:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L90
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            if (r4 != r11) goto L84
            r6[r9] = r1
            goto L86
        L84:
            r6[r9] = r11
        L86:
            int r11 = r9 + 1
            java.lang.Object r10 = r10.getValue()
            r7[r9] = r10
            r9 = r11
            goto L6f
        L90:
            r3.clear()
            r4 = r0
        L94:
            if (r4 >= r5) goto Lf6
            r8 = r6[r4]
            r9 = r7[r4]
            r3.put(r8, r9)
            int r4 = r4 + 1
            goto L94
        La0:
            java.lang.Object r4 = r3.remove(r4)
            r3.put(r1, r4)
            goto Lf6
        La8:
            r3.put(r4, r1)
            goto Lf6
        Lac:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto Lf3
            boolean r6 = r3 instanceof java.util.List
            if (r6 == 0) goto Lda
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.List r3 = (java.util.List) r3
            int r5 = r3.size()
            if (r4 != r5) goto Lc6
            r3.add(r1)
            goto Lf6
        Lc6:
            int r5 = r3.size()
            if (r4 >= r5) goto Ld6
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto Ld6
            r3.set(r4, r1)
            goto Lf6
        Ld6:
            r3.add(r4, r1)
            goto Lf6
        Lda:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto Le9
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r3[r4] = r1
            goto Lf6
        Le9:
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto Lf3
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
            goto Lf6
        Lf3:
            r5.accept(r3, r1)
        Lf6:
            int r2 = r2 + 1
            goto L9
        Lfa:
            return
    }

    public final boolean hasComma() {
            r1 = this;
            boolean r0 = r1.comma
            return r0
    }

    public final java.lang.String info() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.info(r0)
            return r0
    }

    public java.lang.String info(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L19
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L19
        L9:
            java.lang.String r0 = ", offset "
            java.lang.StringBuilder r2 = bc.e.n(r2, r0)
            int r0 = r1.offset
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L19:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "offset "
            r2.<init>(r0)
            int r0 = r1.offset
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public abstract boolean isArray();

    public boolean isBinary() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isDate() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isEnabled(com.alibaba.fastjson2.JSONReader.Feature r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            long r0 = r0.features
            long r2 = r5.mask
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            r5 = 0
            return r5
    }

    public boolean isEnd() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 26
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean isInitStringFieldAsEmpty() {
            r4 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public boolean isInt() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 45
            if (r0 == r1) goto L15
            r1 = 43
            if (r0 == r1) goto L15
            r1 = 48
            if (r0 < r1) goto L13
            r1 = 57
            if (r0 > r1) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public final boolean isJSONB() {
            r1 = this;
            boolean r0 = r1.jsonb
            return r0
    }

    public abstract boolean isNull();

    public boolean isNumber() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 43
            if (r0 == r1) goto Lf
            r1 = 45
            if (r0 == r1) goto Lf
            switch(r0) {
                case 48: goto Lf;
                case 49: goto Lf;
                case 50: goto Lf;
                case 51: goto Lf;
                case 52: goto Lf;
                case 53: goto Lf;
                case 54: goto Lf;
                case 55: goto Lf;
                case 56: goto Lf;
                case 57: goto Lf;
                default: goto Ld;
            }
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    public boolean isObject() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public abstract boolean isReference();

    public boolean isString() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 34
            if (r0 == r1) goto Ld
            r1 = 39
            if (r0 != r1) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public final boolean isSupportAutoType(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 | r0
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public final boolean isSupportAutoTypeOrHandler(long r4) {
            r3 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r3.context
            long r1 = r0.features
            long r4 = r4 | r1
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r1 = r1.mask
            long r4 = r4 & r1
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L17
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r4 = r0.autoTypeBeforeHandler
            if (r4 == 0) goto L15
            goto L17
        L15:
            r4 = 0
            return r4
        L17:
            r4 = 1
            return r4
    }

    public final boolean isSupportBeanArray() {
            r4 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isSupportBeanArray(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 | r0
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public final boolean isSupportSmartMatch() {
            r4 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            long r0 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    public final boolean isSupportSmartMatch(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context
            long r0 = r0.features
            long r3 = r3 | r0
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public final boolean isTypeRedirect() {
            r1 = this;
            boolean r0 = r1.typeRedirect
            return r0
    }

    public com.alibaba.fastjson2.JSONReader.SavePoint mark() {
            r3 = this;
            com.alibaba.fastjson2.JSONReader$SavePoint r0 = new com.alibaba.fastjson2.JSONReader$SavePoint
            int r1 = r3.offset
            char r2 = r3.f1814ch
            r0.<init>(r1, r2)
            return r0
    }

    public abstract void next();

    public abstract boolean nextIfArrayEnd();

    public abstract boolean nextIfArrayStart();

    public abstract boolean nextIfComma();

    public abstract boolean nextIfInfinity();

    public boolean nextIfMatch(byte r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.String r0 = "UnsupportedOperation"
            r2.<init>(r0)
            throw r2
    }

    public abstract boolean nextIfMatch(char r1);

    public abstract boolean nextIfMatchIdent(char r1, char r2, char r3);

    public abstract boolean nextIfMatchIdent(char r1, char r2, char r3, char r4);

    public abstract boolean nextIfMatchIdent(char r1, char r2, char r3, char r4, char r5);

    public abstract boolean nextIfMatchIdent(char r1, char r2, char r3, char r4, char r5, char r6);

    public boolean nextIfMatchTypedAny() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "UnsupportedOperation"
            r0.<init>(r1)
            throw r0
    }

    public abstract boolean nextIfName4Match10(long r1);

    public abstract boolean nextIfName4Match11(long r1);

    public abstract boolean nextIfName4Match12(long r1, byte r3);

    public abstract boolean nextIfName4Match13(long r1, int r3);

    public boolean nextIfName4Match14(long r1, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfName4Match15(long r1, int r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract boolean nextIfName4Match16(long r1, int r3, byte r4);

    public abstract boolean nextIfName4Match17(long r1, long r3);

    public abstract boolean nextIfName4Match18(long r1, long r3);

    public boolean nextIfName4Match19(long r1, long r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract boolean nextIfName4Match2();

    public abstract boolean nextIfName4Match20(long r1, long r3, byte r5);

    public boolean nextIfName4Match21(long r1, long r3, int r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    public abstract boolean nextIfName4Match22(long r1, long r3, int r5);

    public abstract boolean nextIfName4Match23(long r1, long r3, int r5);

    public abstract boolean nextIfName4Match24(long r1, long r3, int r5, byte r6);

    public abstract boolean nextIfName4Match25(long r1, long r3, long r5);

    public abstract boolean nextIfName4Match26(long r1, long r3, long r5);

    public abstract boolean nextIfName4Match27(long r1, long r3, long r5);

    public abstract boolean nextIfName4Match28(long r1, long r3, long r5, byte r7);

    public abstract boolean nextIfName4Match29(long r1, long r3, long r5, int r7);

    public abstract boolean nextIfName4Match3();

    public abstract boolean nextIfName4Match30(long r1, long r3, long r5, int r7);

    public abstract boolean nextIfName4Match31(long r1, long r3, long r5, int r7);

    public abstract boolean nextIfName4Match32(long r1, long r3, long r5, int r7, byte r8);

    public abstract boolean nextIfName4Match33(long r1, long r3, long r5, long r7);

    public abstract boolean nextIfName4Match34(long r1, long r3, long r5, long r7);

    public abstract boolean nextIfName4Match35(long r1, long r3, long r5, long r7);

    public abstract boolean nextIfName4Match36(long r1, long r3, long r5, long r7, byte r9);

    public abstract boolean nextIfName4Match37(long r1, long r3, long r5, long r7, int r9);

    public abstract boolean nextIfName4Match38(long r1, long r3, long r5, long r7, int r9);

    public abstract boolean nextIfName4Match39(long r1, long r3, long r5, long r7, int r9);

    public abstract boolean nextIfName4Match4(byte r1);

    public abstract boolean nextIfName4Match40(long r1, long r3, long r5, long r7, int r9, byte r10);

    public abstract boolean nextIfName4Match41(long r1, long r3, long r5, long r7, long r9);

    public abstract boolean nextIfName4Match42(long r1, long r3, long r5, long r7, long r9);

    public abstract boolean nextIfName4Match43(long r1, long r3, long r5, long r7, long r9);

    public abstract boolean nextIfName4Match5(int r1);

    public abstract boolean nextIfName4Match6(int r1);

    public abstract boolean nextIfName4Match7(int r1);

    public abstract boolean nextIfName4Match8(int r1, byte r2);

    public abstract boolean nextIfName4Match9(long r1);

    public boolean nextIfName8Match0() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean nextIfName8Match1() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean nextIfName8Match2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean nextIfNull();

    public abstract boolean nextIfNullOrEmptyString();

    public abstract boolean nextIfObjectEnd();

    public abstract boolean nextIfObjectStart();

    public abstract boolean nextIfSet();

    public boolean nextIfValue4Match10(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match11(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match2() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean nextIfValue4Match3() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean nextIfValue4Match4(byte r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match5(byte r1, byte r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match6(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match7(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match8(int r1, byte r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean nextIfValue4Match9(int r1, byte r2, byte r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void nextWithoutComment() {
            r0 = this;
            r0.next()
            return
    }

    public final com.alibaba.fastjson2.JSONException notSupportName() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "not support unquoted name"
            java.lang.String r1 = r2.info(r1)
            r0.<init>(r1)
            return r0
    }

    public com.alibaba.fastjson2.JSONException numberError() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal number, offset "
            r1.<init>(r2)
            int r2 = r3.offset
            r1.append(r2)
            java.lang.String r2 = ", char "
            r1.append(r2)
            char r2 = r3.f1814ch
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            return r0
    }

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
            java.lang.Object r9 = r2.readObject(r3, r4, r5, r6)
            return r9
    }

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
            java.lang.Object r9 = r2.readObject(r3, r4, r5, r6)
            return r9
    }

    public final void read(java.util.Collection r3) {
            r2 = this;
            boolean r0 = r2.nextIfArrayStart()
            if (r0 == 0) goto L35
            int r0 = r2.level
            int r0 = r0 + 1
            r2.level = r0
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            int r1 = r1.maxLevel
            if (r0 >= r1) goto L2d
        L12:
            boolean r0 = r2.nextIfArrayEnd()
            if (r0 == 0) goto L22
            int r3 = r2.level
            int r3 = r3 + (-1)
            r2.level = r3
            r2.nextIfComma()
            return
        L22:
            java.lang.Object r0 = r2.readAny()
            r3.add(r0)
            r2.nextIfComma()
            goto L12
        L2d:
            java.lang.String r3 = "level too large : "
            int r0 = r2.level
            ah.a.y(r0, r3)
            return
        L35:
            int r3 = r2.offset
            char r0 = r2.f1814ch
            java.lang.String r1 = "illegal input, offset "
            ah.a.e(r3, r0, r1)
            return
    }

    public final void read(java.util.List r7) {
            r6 = this;
            boolean r0 = r6.nextIfArrayStart()
            if (r0 == 0) goto L3d
            int r0 = r6.level
            int r0 = r0 + 1
            r6.level = r0
            com.alibaba.fastjson2.JSONReader$Context r1 = r6.context
            int r1 = r1.maxLevel
            if (r0 >= r1) goto L34
        L12:
            boolean r0 = r6.nextIfArrayEnd()
            if (r0 == 0) goto L22
            int r7 = r6.level
            int r7 = r7 + (-1)
            r6.level = r7
            r6.nextIfComma()
            return
        L22:
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r0 = com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE
            r3 = 0
            r4 = 0
            r2 = 0
            r1 = r6
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            r7.add(r0)
            r6.nextIfComma()
            goto L12
        L34:
            r1 = r6
            java.lang.String r7 = "level too large : "
            int r0 = r1.level
            ah.a.y(r0, r7)
            return
        L3d:
            r1 = r6
            int r7 = r1.offset
            char r0 = r1.f1814ch
            java.lang.String r2 = "illegal input, offset "
            ah.a.e(r7, r0, r2)
            return
    }

    public void read(java.util.Map r16, long r17) {
            r15 = this;
            r6 = r16
            boolean r0 = r15.nextIfObjectStart()
            r7 = 0
            if (r0 != 0) goto L2f
            boolean r2 = r15.isTypeRedirect()
            if (r2 == 0) goto L14
            r15.setTypeRedirect(r7)
            r8 = r2
            goto L30
        L14:
            boolean r0 = r15.isString()
            if (r0 == 0) goto L25
            java.lang.String r0 = r15.readString()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            return
        L25:
            int r0 = r15.offset
            char r2 = r15.f1814ch
            java.lang.String r3 = "illegal input， offset "
            ah.a.e(r0, r2, r3)
            return
        L2f:
            r8 = r7
        L30:
            com.alibaba.fastjson2.JSONReader$Context r2 = r15.context
            long r2 = r2.features
            long r9 = r17 | r2
            r11 = r7
        L37:
            char r2 = r15.f1814ch
            r3 = 47
            if (r2 != r3) goto L40
            r15.skipComment()
        L40:
            boolean r2 = r15.nextIfObjectEnd()
            if (r2 == 0) goto L4a
            r15.nextIfComma()
            return
        L4a:
            if (r11 == 0) goto L59
            boolean r2 = r15.comma
            if (r2 == 0) goto L51
            goto L59
        L51:
            java.lang.String r0 = r15.info()
            ah.a.w(r0)
            return
        L59:
            if (r0 != 0) goto L65
            if (r8 == 0) goto L5e
            goto L65
        L5e:
            java.lang.String r0 = r15.getFieldName()
            r2 = 1
            r12 = r2
            goto L7c
        L65:
            char r2 = r15.f1814ch
            r3 = 48
            if (r2 < r3) goto L6f
            r3 = 57
            if (r2 <= r3) goto L73
        L6f:
            r3 = 45
            if (r2 != r3) goto L77
        L73:
            r2 = 0
        L74:
            r12 = r0
            r0 = r2
            goto L7c
        L77:
            java.lang.String r2 = r15.readFieldName()
            goto L74
        L7c:
            r13 = 0
            if (r0 != 0) goto Lbc
            boolean r0 = r15.isNumber()
            if (r0 == 0) goto La6
            java.lang.Number r0 = r15.readNumber()
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.NonStringKeyAsString
            long r2 = r2.mask
            long r2 = r2 & r9
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 == 0) goto L97
            java.lang.String r0 = r0.toString()
        L97:
            boolean r2 = r15.comma
            if (r2 != 0) goto L9c
            goto Lb3
        L9c:
            java.lang.String r0 = "syntax error, illegal key-value"
            java.lang.String r0 = r15.info(r0)
            ah.a.w(r0)
            return
        La6:
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.AllowUnQuotedFieldNames
            long r2 = r0.mask
            long r2 = r2 & r9
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r15.readFieldNameUnquote()
        Lb3:
            char r2 = r15.f1814ch
            r3 = 58
            if (r2 != r3) goto Lbc
            r15.next()
        Lbc:
            r3 = r0
            goto Lc8
        Lbe:
            java.lang.String r0 = "not allow unquoted fieldName"
            java.lang.String r0 = r15.info(r0)
            ah.a.w(r0)
            return
        Lc8:
            r15.comma = r7
            char r0 = r15.f1814ch
            java.lang.String r2 = "FASTJSON2.0.60error, offset "
            switch(r0) {
                case 34: goto L13a;
                case 39: goto L13a;
                case 43: goto L135;
                case 73: goto L120;
                case 83: goto L10b;
                case 91: goto L106;
                case 102: goto Lfd;
                case 110: goto Lf8;
                case 116: goto Lfd;
                case 120: goto Lf3;
                case 123: goto Le1;
                default: goto Ld1;
            }
        Ld1:
            switch(r0) {
                case 45: goto L135;
                case 46: goto L135;
                case 47: goto Ldc;
                case 48: goto L135;
                case 49: goto L135;
                case 50: goto L135;
                case 51: goto L135;
                case 52: goto L135;
                case 53: goto L135;
                case 54: goto L135;
                case 55: goto L135;
                case 56: goto L135;
                case 57: goto L135;
                default: goto Ld4;
            }
        Ld4:
            int r0 = r15.offset
            char r3 = r15.f1814ch
            ah.a.e(r0, r3, r2)
            return
        Ldc:
            r15.skipComment()
            goto L18e
        Le1:
            if (r8 == 0) goto Lee
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r0 = com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE
            r2 = 0
            r1 = r15
            r4 = r17
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            goto L13e
        Lee:
            java.util.Map r0 = r15.readObject()
            goto L13e
        Lf3:
            byte[] r0 = r15.readBinary()
            goto L13e
        Lf8:
            java.util.Date r0 = r15.readNullOrNewDate()
            goto L13e
        Lfd:
            boolean r0 = r15.readBoolValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L13e
        L106:
            java.util.List r0 = r15.readArray()
            goto L13e
        L10b:
            boolean r0 = r15.nextIfSet()
            if (r0 == 0) goto L118
            java.lang.Class<java.util.HashSet> r0 = java.util.HashSet.class
            java.lang.Object r0 = r15.read(r0)
            goto L13e
        L118:
            int r0 = r15.offset
            char r3 = r15.f1814ch
            ah.a.e(r0, r3, r2)
            return
        L120:
            boolean r0 = r15.nextIfInfinity()
            if (r0 == 0) goto L12d
            r4 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            goto L13e
        L12d:
            int r0 = r15.offset
            char r3 = r15.f1814ch
            ah.a.e(r0, r3, r2)
            return
        L135:
            java.lang.Number r0 = r15.readNumber()
            goto L13e
        L13a:
            java.lang.String r0 = r15.readString()
        L13e:
            if (r0 != 0) goto L14a
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r4 = r2.mask
            long r4 = r4 & r9
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 == 0) goto L14a
            goto L18e
        L14a:
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r4 = r2.mask
            long r4 = r4 & r9
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 == 0) goto L16a
            java.lang.String r2 = "@type"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L16a
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16a
            goto L18e
        L16a:
            java.lang.Object r2 = r6.put(r3, r0)
            if (r2 == 0) goto L18e
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r4 = r4.mask
            long r4 = r4 & r9
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 == 0) goto L18e
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L187
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            r4.add(r0)
            r6.put(r3, r2)
            goto L18e
        L187:
            com.alibaba.fastjson2.JSONArray r0 = com.alibaba.fastjson2.JSONArray.of(r2, r0)
            r6.put(r3, r0)
        L18e:
            int r11 = r11 + 1
            r0 = r12
            goto L37
    }

    public void read(java.util.Map r12, com.alibaba.fastjson2.reader.ObjectReader r13, long r14) {
            r11 = this;
            r11.nextIfObjectStart()
            com.alibaba.fastjson2.JSONReader$Context r0 = r11.context
            long r0 = r0.features
            long r0 = r0 | r14
            r2 = 0
        L9:
            char r3 = r11.f1814ch
            r4 = 47
            if (r3 != r4) goto L12
            r11.skipComment()
        L12:
            boolean r3 = r11.nextIfObjectEnd()
            if (r3 == 0) goto L1c
            r11.nextIfComma()
            return
        L1c:
            if (r2 == 0) goto L2b
            boolean r3 = r11.comma
            if (r3 == 0) goto L23
            goto L2b
        L23:
            java.lang.String r12 = r11.info()
            ah.a.w(r12)
            return
        L2b:
            java.lang.String r6 = r11.readFieldName()
            java.lang.Class r5 = r13.getObjectClass()
            r4 = r11
            r3 = r13
            r7 = r14
            java.lang.Object r13 = r3.readObject(r4, r5, r6, r7)
            r14 = 0
            if (r13 != 0) goto L48
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r4 = r4.mask
            long r4 = r4 & r0
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L48
            goto L6c
        L48:
            java.lang.Object r4 = r12.put(r6, r13)
            if (r4 == 0) goto L6c
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r9 = r5.mask
            long r9 = r9 & r0
            int r14 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r14 == 0) goto L6c
            boolean r14 = r4 instanceof java.util.Collection
            if (r14 == 0) goto L65
            r14 = r4
            java.util.Collection r14 = (java.util.Collection) r14
            r14.add(r13)
            r12.put(r6, r4)
            goto L6c
        L65:
            com.alibaba.fastjson2.JSONArray r13 = com.alibaba.fastjson2.JSONArray.of(r4, r13)
            r12.put(r6, r13)
        L6c:
            int r2 = r2 + 1
            r13 = r3
            r14 = r7
            goto L9
    }

    public final void read(java.util.Map r17, java.lang.reflect.Type r18, java.lang.reflect.Type r19, long r20) {
            r16 = this;
            r1 = r16
            r6 = r17
            r7 = r18
            boolean r0 = r1.nextIfObjectStart()
            if (r0 == 0) goto La0
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r7)
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            r3 = r19
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.getObjectReader(r3)
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            long r2 = r2.features
            long r9 = r20 | r2
            r2 = 0
            r11 = r2
        L22:
            char r2 = r1.f1814ch
            r3 = 47
            if (r2 != r3) goto L2b
            r1.skipComment()
        L2b:
            r2 = 125(0x7d, float:1.75E-43)
            boolean r2 = r1.nextIfMatch(r2)
            if (r2 == 0) goto L37
            r1.nextIfComma()
            return
        L37:
            if (r11 == 0) goto L46
            boolean r2 = r1.comma
            if (r2 == 0) goto L3e
            goto L46
        L3e:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
            return
        L46:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r7 != r2) goto L51
            java.lang.String r2 = r1.readFieldName()
            r12 = r0
        L4f:
            r13 = r2
            goto L60
        L51:
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r2 = r0.readObject(r1, r2, r3, r4)
            r12 = r0
            r0 = 58
            r1.nextIfMatch(r0)
            goto L4f
        L60:
            r3 = 0
            r4 = 0
            r2 = 0
            r0 = r8
            java.lang.Object r2 = r0.readObject(r1, r2, r3, r4)
            r3 = 0
            if (r2 != 0) goto L77
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r14 = r5.mask
            long r14 = r14 & r9
            int r5 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r5 == 0) goto L77
            goto L9b
        L77:
            java.lang.Object r5 = r6.put(r13, r2)
            if (r5 == 0) goto L9b
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r14 = r8.mask
            long r14 = r14 & r9
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 == 0) goto L9b
            boolean r3 = r5 instanceof java.util.Collection
            if (r3 == 0) goto L94
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r2)
            r6.put(r13, r5)
            goto L9b
        L94:
            com.alibaba.fastjson2.JSONArray r2 = com.alibaba.fastjson2.JSONArray.of(r5, r2)
            r6.put(r13, r2)
        L9b:
            int r11 = r11 + 1
            r8 = r0
            r0 = r12
            goto L22
        La0:
            int r0 = r1.offset
            char r2 = r1.f1814ch
            java.lang.String r3 = "illegal input， offset "
            ah.a.e(r0, r2, r3)
            return
    }

    public java.lang.Object readAny() {
            r1 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object r0 = r1.read(r0)
            return r0
    }

    public java.util.List readArray() {
            r15 = this;
            r15.next()
            int r0 = r15.level
            r1 = 1
            int r0 = r0 + r1
            r15.level = r0
            com.alibaba.fastjson2.JSONReader$Context r2 = r15.context
            int r2 = r2.maxLevel
            if (r0 >= r2) goto L13e
            r0 = 0
            r2 = 0
            r4 = r0
            r5 = r4
            r6 = r5
            r3 = r2
        L15:
            char r7 = r15.f1814ch
            r8 = 2
            switch(r7) {
                case 34: goto L10d;
                case 39: goto L10d;
                case 43: goto L27;
                case 45: goto L27;
                case 78: goto Lfb;
                case 83: goto Le4;
                case 91: goto Lde;
                case 93: goto L7b;
                case 102: goto L70;
                case 110: goto L69;
                case 116: goto L70;
                case 123: goto L32;
                default: goto L1b;
            }
        L1b:
            switch(r7) {
                case 47: goto L2a;
                case 48: goto L27;
                case 49: goto L27;
                case 50: goto L27;
                case 51: goto L27;
                case 52: goto L27;
                case 53: goto L27;
                case 54: goto L27;
                case 55: goto L27;
                case 56: goto L27;
                case 57: goto L27;
                default: goto L1e;
            }
        L1e:
            java.lang.String r0 = "TODO : "
            char r1 = r15.f1814ch
            ah.a.t(r1, r0)
        L25:
            r0 = 0
            return r0
        L27:
            r10 = r15
            goto L105
        L2a:
            r15.skipComment()
            int r3 = r3 + (-1)
            r10 = r15
            goto L13b
        L32:
            com.alibaba.fastjson2.JSONReader$Context r7 = r15.context
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r9 = r7.autoTypeBeforeHandler
            if (r9 != 0) goto L5c
            long r9 = r7.features
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r11 = r7.mask
            long r9 = r9 & r11
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 == 0) goto L46
            goto L5c
        L46:
            boolean r7 = r15.isReference()
            if (r7 == 0) goto L57
            java.lang.String r7 = r15.readReference()
            com.alibaba.fastjson2.JSONPath r7 = com.alibaba.fastjson2.JSONPath.of(r7)
        L54:
            r10 = r15
            goto L112
        L57:
            java.util.Map r7 = r15.readObject()
            goto L54
        L5c:
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r9 = com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE
            r12 = 0
            r13 = 0
            r11 = 0
            r10 = r15
            java.lang.Object r7 = r9.readObject(r10, r11, r12, r13)
            goto L112
        L69:
            r10 = r15
            r15.readNull()
            r7 = r0
            goto L112
        L70:
            r10 = r15
            boolean r7 = r15.readBoolValue()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L112
        L7b:
            r10 = r15
            r15.next()
            if (r4 != 0) goto Lca
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            java.util.function.Supplier<java.util.List> r4 = r0.arraySupplier
            if (r4 == 0) goto L8f
            java.lang.Object r0 = r4.get()
            java.util.List r0 = (java.util.List) r0
        L8d:
            r4 = r0
            goto Lbc
        L8f:
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            boolean r0 = r0.isEnabled(r4)
            if (r0 == 0) goto La3
            java.util.ArrayList r0 = new java.util.ArrayList
            if (r3 != r8) goto L9f
            r0.<init>(r8)
            goto L8d
        L9f:
            r0.<init>(r1)
            goto L8d
        La3:
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            java.util.function.Supplier<java.util.List> r0 = r0.arraySupplier
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            goto L8d
        Lb0:
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            if (r3 != r8) goto Lb8
            r0.<init>(r8)
            goto L8d
        Lb8:
            r0.<init>(r1)
            goto L8d
        Lbc:
            if (r3 != r1) goto Lc2
            r15.add(r4, r2, r5)
            goto Lca
        Lc2:
            if (r3 != r8) goto Lca
            r15.add(r4, r2, r5)
            r15.add(r4, r1, r6)
        Lca:
            char r0 = r10.f1814ch
            r3 = 44
            if (r0 != r3) goto Ld1
            r2 = r1
        Ld1:
            r10.comma = r2
            if (r2 == 0) goto Ld8
            r15.next()
        Ld8:
            int r0 = r10.level
            int r0 = r0 - r1
            r10.level = r0
            return r4
        Lde:
            r10 = r15
            java.util.List r7 = r15.readArray()
            goto L112
        Le4:
            r10 = r15
            boolean r7 = r15.nextIfSet()
            if (r7 == 0) goto Lf2
            java.lang.Class<java.util.Set> r7 = java.util.Set.class
            java.lang.Object r7 = r15.read(r7)
            goto L112
        Lf2:
            java.lang.String r0 = r15.info()
            ah.a.w(r0)
            goto L25
        Lfb:
            r10 = r15
            double r11 = r15.readNaN()
            java.lang.Double r7 = java.lang.Double.valueOf(r11)
            goto L112
        L105:
            r15.readNumber0()
            java.lang.Number r7 = r15.getNumber()
            goto L112
        L10d:
            r10 = r15
            java.lang.String r7 = r15.readString()
        L112:
            if (r3 != 0) goto L116
            r5 = r7
            goto L13b
        L116:
            if (r3 != r1) goto L11a
            r6 = r7
            goto L13b
        L11a:
            if (r3 != r8) goto L138
            com.alibaba.fastjson2.JSONReader$Context r4 = r10.context
            java.util.function.Supplier<java.util.List> r4 = r4.arraySupplier
            if (r4 == 0) goto L129
            java.lang.Object r4 = r4.get()
            java.util.List r4 = (java.util.List) r4
            goto L12e
        L129:
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray
            r4.<init>()
        L12e:
            r15.add(r4, r2, r5)
            r15.add(r4, r1, r6)
            r15.add(r4, r3, r7)
            goto L13b
        L138:
            r15.add(r4, r3, r7)
        L13b:
            int r3 = r3 + r1
            goto L15
        L13e:
            r10 = r15
            java.lang.String r0 = "level too large : "
            int r1 = r10.level
            ah.a.y(r1, r0)
            goto L25
    }

    public java.util.List readArray(java.lang.reflect.Type r11) {
            r10 = this;
            boolean r0 = r10.nextIfNull()
            if (r0 == 0) goto L8
            r11 = 0
            return r11
        L8:
            boolean r0 = r10.nextIfArrayStart()
            if (r0 == 0) goto L82
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r1 = r0.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            r1 = r3
            goto L22
        L21:
            r1 = r2
        L22:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r0.provider
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L2d:
            boolean r0 = r10.nextIfArrayEnd()
            if (r0 != 0) goto L72
            int r0 = r10.offset
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = r10
            java.lang.Object r1 = r4.readObject(r5, r6, r7, r8)
            int r6 = r5.offset
            if (r0 == r6) goto L50
            char r0 = r5.f1814ch
            r6 = 125(0x7d, float:1.75E-43)
            if (r0 == r6) goto L50
            r6 = 26
            if (r0 == r6) goto L50
            r11.add(r1)
            goto L2d
        L50:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException
            char r0 = r5.f1814ch
            int r1 = r10.getOffset()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "illegal input : "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", offset "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r11.<init>(r0)
            throw r11
        L72:
            r5 = r10
            char r0 = r5.f1814ch
            r1 = 44
            if (r0 != r1) goto L7a
            r2 = r3
        L7a:
            r5.comma = r2
            if (r2 == 0) goto L81
            r10.next()
        L81:
            return r11
        L82:
            r5 = r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "syntax error : "
            r11.<init>(r0)
            char r0 = r5.f1814ch
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r10.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
    }

    public void readArray(java.util.Collection r8, java.lang.reflect.Type r9) {
            r7 = this;
            boolean r0 = r7.nextIfArrayStart()
            r1 = 0
            r2 = 1
            r3 = 44
            if (r0 == 0) goto L37
        La:
            boolean r0 = r7.nextIfArrayEnd()
            if (r0 == 0) goto L1d
            char r8 = r7.f1814ch
            if (r8 != r3) goto L15
            r1 = r2
        L15:
            r7.comma = r1
            if (r1 == 0) goto La1
            r7.next()
            return
        L1d:
            java.lang.Object r0 = r7.read(r9)
            r8.add(r0)
            char r0 = r7.f1814ch
            r4 = 125(0x7d, float:1.75E-43)
            if (r0 == r4) goto L2f
            r4 = 26
            if (r0 == r4) goto L2f
            goto La
        L2f:
            java.lang.String r8 = r7.info()
            ah.a.w(r8)
            return
        L37:
            boolean r0 = r7.isString()
            if (r0 == 0) goto L8e
            java.lang.String r0 = r7.readString()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r9 != r4) goto L49
            r8.add(r0)
            goto L95
        L49:
            com.alibaba.fastjson2.JSONReader$Context r5 = r7.context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = r5.provider
            java.util.function.Function r9 = r5.getTypeConvert(r4, r9)
            if (r9 == 0) goto L78
            int r4 = r0.indexOf(r3)
            r5 = -1
            if (r4 == r5) goto L70
            java.lang.String r4 = ","
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            r5 = r1
        L62:
            if (r5 >= r4) goto L95
            r6 = r0[r5]
            java.lang.Object r6 = r9.apply(r6)
            r8.add(r6)
            int r5 = r5 + 1
            goto L62
        L70:
            java.lang.Object r9 = r9.apply(r0)
            r8.add(r9)
            goto L95
        L78:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "not support input "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r7.info(r8)
            ah.a.w(r8)
            return
        L8e:
            java.lang.Object r9 = r7.read(r9)
            r8.add(r9)
        L95:
            char r8 = r7.f1814ch
            if (r8 != r3) goto L9a
            r1 = r2
        L9a:
            r7.comma = r1
            if (r1 == 0) goto La1
            r7.next()
        La1:
            return
    }

    public final void readArray(java.util.List r1, java.lang.reflect.Type r2) {
            r0 = this;
            r0.readArray(r1, r2)
            return
    }

    public final java.lang.Object[] readArray(java.lang.reflect.Type[] r7) {
            r6 = this;
            boolean r0 = r6.nextIfNull()
            if (r0 == 0) goto L8
            r7 = 0
            return r7
        L8:
            boolean r0 = r6.nextIfArrayStart()
            java.lang.String r1 = "syntax error"
            if (r0 == 0) goto L46
            int r0 = r7.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L15:
            int r4 = r7.length
            if (r2 >= r4) goto L3a
            r4 = 1
            if (r2 == 0) goto L2a
            boolean r5 = r6.nextIfArrayEnd()
            if (r5 == 0) goto L23
            r3 = r4
            goto L3a
        L23:
            boolean r5 = r6.isEnd()
            if (r5 == 0) goto L2a
            goto L3a
        L2a:
            r5 = r7[r2]
            java.lang.Object r5 = r6.read(r5)
            r0[r2] = r5
            int r5 = r7.length
            int r5 = r5 - r4
            if (r2 != r5) goto L37
            r3 = r4
        L37:
            int r2 = r2 + 1
            goto L15
        L3a:
            if (r3 == 0) goto L3d
            return r0
        L3d:
            java.lang.String r7 = r6.info(r1)
            ah.a.w(r7)
        L44:
            r7 = 0
            return r7
        L46:
            java.lang.String r7 = r6.info(r1)
            ah.a.w(r7)
            goto L44
    }

    public byte[] readBase64() {
            r6 = this;
            java.lang.String r0 = r6.readString()
            r1 = 0
            if (r0 == 0) goto L33
            java.lang.String r2 = "data:image/"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L33
            r2 = 59
            r3 = 12
            int r2 = r0.indexOf(r2, r3)
            r3 = -1
            if (r2 == r3) goto L33
            int r2 = r2 + 1
            r4 = 44
            int r4 = r0.indexOf(r4, r2)
            if (r4 == r3) goto L33
            r3 = 6
            java.lang.String r5 = "base64"
            boolean r2 = r0.regionMatches(r2, r5, r1, r3)
            if (r2 == 0) goto L33
            int r4 = r4 + 1
            java.lang.String r0 = r0.substring(r4)
        L33:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L3c
            byte[] r0 = new byte[r1]
            return r0
        L3c:
            java.util.Base64$Decoder r1 = java.util.Base64.getDecoder()
            byte[] r0 = r1.decode(r0)
            return r0
    }

    public abstract java.math.BigDecimal readBigDecimal();

    public java.math.BigInteger readBigInteger() {
            r1 = this;
            r1.readNumber0()
            java.math.BigInteger r0 = r1.getBigInteger()
            return r0
    }

    public byte[] readBinary() {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 120(0x78, float:1.68E-43)
            if (r0 != r1) goto Lb
            byte[] r0 = r5.readHex()
            return r0
        Lb:
            boolean r0 = r5.isString()
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.readString()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1d
            r0 = 0
            return r0
        L1d:
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            long r1 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.Base64StringAsByteArray
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L31
            byte[] r0 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r0)
            return r0
        L31:
            java.lang.String r1 = "not support input "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L40:
            boolean r0 = r5.nextIfArrayStart()
            if (r0 == 0) goto L72
            r0 = 64
            byte[] r0 = new byte[r0]
            r1 = 0
        L4b:
            char r2 = r5.f1814ch
            r3 = 93
            if (r2 != r3) goto L5c
            r5.next()
            r5.nextIfComma()
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        L5c:
            int r2 = r0.length
            if (r1 != r2) goto L67
            int r2 = r0.length
            int r3 = r2 >> 1
            int r2 = r2 + r3
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
        L67:
            int r2 = r1 + 1
            int r3 = r5.readInt32Value()
            byte r3 = (byte) r3
            r0[r1] = r3
            r1 = r2
            goto L4b
        L72:
            java.lang.String r0 = "not support read binary"
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    public java.lang.Boolean readBool() {
            r3 = this;
            boolean r0 = r3.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            r3.wasNull = r0
            boolean r0 = r3.readBoolValue()
            if (r0 != 0) goto L16
            boolean r2 = r3.wasNull
            if (r2 == 0) goto L16
            return r1
        L16:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public abstract boolean readBoolValue();

    public java.util.Calendar readCalendar() {
            r2 = this;
            java.util.Date r0 = r2.readDate()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            java.util.TimeZone r1 = r1.getTimeZone()
            java.util.Calendar r1 = java.util.Calendar.getInstance(r1)
            r1.setTime(r0)
            return r1
    }

    public char readCharValue() {
            r3 = this;
            java.lang.String r0 = r3.readString()
            r1 = 0
            if (r0 == 0) goto L13
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            goto L13
        Le:
            char r0 = r0.charAt(r1)
            return r0
        L13:
            r0 = 1
            r3.wasNull = r0
            return r1
    }

    public java.lang.Character readCharacter() {
            r3 = this;
            java.lang.String r0 = r3.readString()
            r1 = 0
            if (r0 == 0) goto L17
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            goto L17
        Le:
            char r0 = r0.charAt(r1)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            return r0
        L17:
            r0 = 1
            r3.wasNull = r0
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            return r0
    }

    public java.util.Date readDate() {
            r8 = this;
            boolean r0 = r8.isInt()
            if (r0 == 0) goto L10
            long r0 = r8.readInt64Value()
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            return r2
        L10:
            boolean r0 = r8.readIfNull()
            r1 = 0
            if (r0 == 0) goto L18
            return r1
        L18:
            boolean r0 = r8.nextIfNullOrEmptyString()
            if (r0 == 0) goto L1f
            return r1
        L1f:
            char r0 = r8.current()
            r2 = 110(0x6e, float:1.54E-43)
            if (r0 != r2) goto L2c
            java.util.Date r0 = r8.readNullOrNewDate()
            return r0
        L2c:
            boolean r0 = r8.isTypeRedirect()
            if (r0 == 0) goto L54
            r6 = 108(0x6c, float:1.51E-43)
            r7 = 34
            r3 = 34
            r4 = 118(0x76, float:1.65E-43)
            r5 = 97
            r2 = r8
            boolean r0 = r2.nextIfMatchIdent(r3, r4, r5, r6, r7)
            if (r0 == 0) goto L55
            r0 = 58
            r8.nextIfMatch(r0)
            long r3 = r8.readInt64Value()
            r8.nextIfObjectEnd()
            r0 = 0
            r8.setTypeRedirect(r0)
            goto L59
        L54:
            r2 = r8
        L55:
            long r3 = r8.readMillisFromString()
        L59:
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L64
            boolean r0 = r2.wasNull
            if (r0 == 0) goto L64
            return r1
        L64:
            java.util.Date r0 = new java.util.Date
            r0.<init>(r3)
            return r0
    }

    public final java.lang.Double readDouble() {
            r4 = this;
            boolean r0 = r4.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            r4.wasNull = r0
            double r2 = r4.readDoubleValue()
            boolean r0 = r4.wasNull
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            return r0
    }

    public abstract double readDoubleValue();

    public abstract java.lang.String readFieldName();

    public abstract long readFieldNameHashCode();

    public abstract long readFieldNameHashCodeUnquote();

    public final java.lang.String readFieldNameUnquote() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 47
            if (r0 != r1) goto L9
            r2.skipComment()
        L9:
            r2.readFieldNameHashCodeUnquote()
            java.lang.String r0 = r2.getFieldName()
            if (r0 == 0) goto L1b
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = "illegal input"
            java.lang.String r0 = r2.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    public final java.lang.Float readFloat() {
            r3 = this;
            boolean r0 = r3.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            r3.wasNull = r0
            float r0 = r3.readFloatValue()
            boolean r2 = r3.wasNull
            if (r2 == 0) goto L14
            return r1
        L14:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public abstract float readFloatValue();

    public abstract byte[] readHex();

    public abstract boolean readIfNull();

    public java.time.Instant readInstant() {
            r5 = this;
            boolean r0 = r5.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5.isNumber()
            if (r0 == 0) goto L20
            long r0 = r5.readInt64Value()
            com.alibaba.fastjson2.JSONReader$Context r2 = r5.context
            boolean r2 = r2.formatUnixTime
            if (r2 == 0) goto L1b
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L1b:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            return r0
        L20:
            boolean r0 = r5.isObject()
            if (r0 == 0) goto L39
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            com.alibaba.fastjson2.reader.ObjectReader r0 = r5.getObjectReader(r0)
            java.util.Map r1 = r5.readObject()
            r2 = 0
            java.lang.Object r0 = r0.createInstance(r1, r2)
            java.time.Instant r0 = (java.time.Instant) r0
            return r0
        L39:
            java.time.ZonedDateTime r0 = r5.readZonedDateTime()
            if (r0 != 0) goto L40
            return r1
        L40:
            long r1 = r0.toEpochSecond()
            java.time.LocalTime r0 = r0.toLocalTime()
            int r0 = r0.getNano()
            long r3 = (long) r0
            java.time.Instant r0 = java.time.Instant.ofEpochSecond(r1, r3)
            return r0
    }

    public java.lang.Short readInt16() {
            r1 = this;
            java.lang.Integer r0 = r1.readInt32()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            short r0 = r0.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    public short readInt16Value() {
            r1 = this;
            int r0 = r1.readInt32Value()
            short r0 = (short) r0
            return r0
    }

    public java.lang.Integer readInt32() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 34
            if (r0 == r1) goto Le
            r1 = 39
            if (r0 == r1) goto Le
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L16
        Le:
            boolean r0 = r2.nextIfNullOrEmptyString()
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        L16:
            int r0 = r2.readInt32Value()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public abstract int readInt32Value();

    public final int readInt32ValueOverflow() {
            r1 = this;
            r1.readNumber0()
            int r0 = r1.getInt32Value()
            return r0
    }

    public java.lang.Long readInt64() {
            r2 = this;
            char r0 = r2.f1814ch
            r1 = 34
            if (r0 == r1) goto Le
            r1 = 39
            if (r0 == r1) goto Le
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L16
        Le:
            boolean r0 = r2.nextIfNullOrEmptyString()
            if (r0 == 0) goto L16
            r0 = 0
            return r0
        L16:
            long r0 = r2.readInt64Value()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public abstract long readInt64Value();

    public long[] readInt64ValueArray() {
            r5 = this;
            boolean r0 = r5.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5.nextIfArrayStart()
            if (r0 == 0) goto L47
            r0 = 8
            long[] r0 = new long[r0]
            r1 = 0
        L13:
            boolean r2 = r5.nextIfArrayEnd()
            if (r2 == 0) goto L22
            int r2 = r0.length
            if (r1 != r2) goto L1d
            return r0
        L1d:
            long[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        L22:
            boolean r2 = r5.isEnd()
            if (r2 != 0) goto L3c
            int r2 = r0.length
            if (r1 != r2) goto L32
            int r2 = r0.length
            int r2 = r2 << 1
            long[] r0 = java.util.Arrays.copyOf(r0, r2)
        L32:
            int r2 = r1 + 1
            long r3 = r5.readInt64Value()
            r0[r1] = r3
            r1 = r2
            goto L13
        L3c:
            java.lang.String r0 = "input end"
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
        L45:
            r0 = 0
            return r0
        L47:
            boolean r0 = r5.isString()
            if (r0 == 0) goto L63
            java.lang.String r0 = r5.readString()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L58
            return r1
        L58:
            java.lang.String r1 = "not support input "
            java.lang.String r0 = r1.concat(r0)
            com.alibaba.fastjson2.JSONException r0 = r5.error(r0)
            throw r0
        L63:
            java.lang.String r0 = "TODO"
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            goto L45
    }

    public final long readInt64ValueOverflow() {
            r2 = this;
            r2.readNumber0()
            long r0 = r2.getInt64Value()
            return r0
    }

    public java.lang.Byte readInt8() {
            r1 = this;
            java.lang.Integer r0 = r1.readInt32()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            byte r0 = r0.byteValue()
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            return r0
    }

    public byte readInt8Value() {
            r1 = this;
            int r0 = r1.readInt32Value()
            byte r0 = (byte) r0
            return r0
    }

    public final com.alibaba.fastjson2.JSONArray readJSONArray() {
            r1 = this;
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>()
            r1.read(r0)
            return r0
    }

    public final com.alibaba.fastjson2.JSONObject readJSONObject() {
            r3 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r1 = 0
            r3.read(r0, r1)
            return r0
    }

    public java.util.List readList(java.lang.reflect.Type[] r8) {
            r7 = this;
            boolean r0 = r7.nextIfNull()
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            boolean r0 = r7.nextIfArrayStart()
            if (r0 == 0) goto L79
            int r0 = r8.length
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L16:
            boolean r4 = r7.nextIfArrayEnd()
            if (r4 != 0) goto L5d
            if (r3 >= r0) goto L5d
            int r4 = r7.offset
            int r5 = r3 + 1
            r3 = r8[r3]
            java.lang.Object r3 = r7.read(r3)
            int r6 = r7.offset
            if (r4 == r6) goto L3b
            char r4 = r7.f1814ch
            r6 = 125(0x7d, float:1.75E-43)
            if (r4 == r6) goto L3b
            r6 = 26
            if (r4 == r6) goto L3b
            r1.add(r3)
            r3 = r5
            goto L16
        L3b:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException
            char r0 = r7.f1814ch
            int r1 = r7.getOffset()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "illegal input : "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", offset "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
        L5d:
            if (r3 != r0) goto L6e
            char r8 = r7.f1814ch
            r0 = 44
            if (r8 != r0) goto L66
            r2 = 1
        L66:
            r7.comma = r2
            if (r2 == 0) goto L6d
            r7.next()
        L6d:
            return r1
        L6e:
            java.lang.String r8 = "element length mismatch"
            java.lang.String r8 = r7.info(r8)
            ah.a.w(r8)
        L77:
            r8 = 0
            return r8
        L79:
            java.lang.String r8 = "syntax error : "
            char r0 = r7.f1814ch
            ah.a.t(r0, r8)
            goto L77
    }

    public java.time.LocalDate readLocalDate() {
            r4 = this;
            boolean r0 = r4.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4.isInt()
            if (r0 == 0) goto L2e
            long r0 = r4.readInt64Value()
            com.alibaba.fastjson2.JSONReader$Context r2 = r4.context
            boolean r2 = r2.formatUnixTime
            if (r2 == 0) goto L1b
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L1b:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r4.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalDate r0 = r0.toLocalDate()
            return r0
        L2e:
            com.alibaba.fastjson2.JSONReader$Context r0 = r4.context
            java.lang.String r2 = r0.dateFormat
            if (r2 == 0) goto L44
            boolean r2 = r0.formatyyyyMMddhhmmss19
            if (r2 != 0) goto L44
            boolean r2 = r0.formatyyyyMMddhhmmssT19
            if (r2 != 0) goto L44
            boolean r2 = r0.formatyyyyMMdd8
            if (r2 != 0) goto L44
            boolean r0 = r0.formatISO8601
            if (r0 == 0) goto La4
        L44:
            int r0 = r4.getStringLength()
            r2 = 19
            if (r0 == r2) goto L99
            r2 = 20
            if (r0 == r2) goto L94
            switch(r0) {
                case 8: goto L86;
                case 9: goto L78;
                case 10: goto L6a;
                case 11: goto L5c;
                default: goto L53;
            }
        L53:
            if (r0 <= r2) goto L5a
            java.time.LocalDateTime r0 = r4.readLocalDateTimeX(r0)
            goto L9d
        L5a:
            r0 = r1
            goto L9d
        L5c:
            java.time.LocalDate r0 = r4.readLocalDate11()
            if (r0 != 0) goto L63
            goto L5a
        L63:
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r2)
            goto L9d
        L6a:
            java.time.LocalDate r0 = r4.readLocalDate10()
            if (r0 != 0) goto L71
            goto L5a
        L71:
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r2)
            goto L9d
        L78:
            java.time.LocalDate r0 = r4.readLocalDate9()
            if (r0 != 0) goto L7f
            goto L5a
        L7f:
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r2)
            goto L9d
        L86:
            java.time.LocalDate r0 = r4.readLocalDate8()
            if (r0 != 0) goto L8d
            goto L5a
        L8d:
            java.time.LocalTime r2 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r2)
            goto L9d
        L94:
            java.time.LocalDateTime r0 = r4.readLocalDateTime20()
            goto L9d
        L99:
            java.time.LocalDateTime r0 = r4.readLocalDateTime19()
        L9d:
            if (r0 == 0) goto La4
            java.time.LocalDate r0 = r0.toLocalDate()
            return r0
        La4:
            java.lang.String r0 = r4.readString()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lfb
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lb7
            goto Lfb
        Lb7:
            com.alibaba.fastjson2.JSONReader$Context r1 = r4.context
            java.time.format.DateTimeFormatter r1 = r1.getDateFormatter()
            if (r1 == 0) goto Ld3
            com.alibaba.fastjson2.JSONReader$Context r2 = r4.context
            boolean r2 = r2.formatHasHour
            if (r2 == 0) goto Lce
            java.time.LocalDateTime r0 = java.time.LocalDateTime.parse(r0, r1)
            java.time.LocalDate r0 = r0.toLocalDate()
            return r0
        Lce:
            java.time.LocalDate r0 = java.time.LocalDate.parse(r0, r1)
            return r0
        Ld3:
            boolean r1 = com.alibaba.fastjson2.util.IOUtils.isNumber(r0)
            if (r1 == 0) goto Lf0
            long r0 = java.lang.Long.parseLong(r0)
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r4.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalDate r0 = r0.toLocalDate()
            return r0
        Lf0:
            java.lang.String r1 = "not support input : "
            java.lang.String r0 = r1.concat(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lfb:
            return r1
    }

    public abstract java.time.LocalDate readLocalDate10();

    public abstract java.time.LocalDate readLocalDate11();

    public abstract java.time.LocalDate readLocalDate8();

    public abstract java.time.LocalDate readLocalDate9();

    public java.time.LocalDateTime readLocalDateTime() {
            r8 = this;
            boolean r0 = r8.isInt()
            if (r0 == 0) goto L1d
            long r0 = r8.readInt64Value()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r8.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalDateTime r0 = r0.toLocalDateTime()
            return r0
        L1d:
            boolean r0 = r8.isTypeRedirect()
            r1 = 0
            if (r0 == 0) goto L45
            r6 = 108(0x6c, float:1.51E-43)
            r7 = 34
            r3 = 34
            r4 = 118(0x76, float:1.65E-43)
            r5 = 97
            r2 = r8
            boolean r0 = r2.nextIfMatchIdent(r3, r4, r5, r6, r7)
            if (r0 == 0) goto L46
            r0 = 58
            r8.nextIfMatch(r0)
            java.time.LocalDateTime r0 = r8.readLocalDateTime()
            r8.nextIfObjectEnd()
            r8.setTypeRedirect(r1)
            return r0
        L45:
            r2 = r8
        L46:
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context
            java.lang.String r3 = r0.dateFormat
            r4 = 0
            if (r3 == 0) goto L5d
            boolean r3 = r0.formatyyyyMMddhhmmss19
            if (r3 != 0) goto L5d
            boolean r3 = r0.formatyyyyMMddhhmmssT19
            if (r3 != 0) goto L5d
            boolean r3 = r0.formatyyyyMMdd8
            if (r3 != 0) goto L5d
            boolean r0 = r0.formatISO8601
            if (r0 == 0) goto Lbb
        L5d:
            int r0 = r8.getStringLength()
            switch(r0) {
                case 8: goto L19a;
                case 9: goto L18c;
                case 10: goto L17e;
                case 11: goto L170;
                case 12: goto L64;
                case 13: goto L64;
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L16b;
                case 17: goto Lb4;
                case 18: goto Lad;
                case 19: goto La6;
                case 20: goto L94;
                case 21: goto L65;
                case 22: goto L65;
                case 23: goto L65;
                case 24: goto L65;
                case 25: goto L65;
                case 26: goto L65;
                case 27: goto L65;
                case 28: goto L65;
                case 29: goto L65;
                default: goto L64;
            }
        L64:
            goto Lbb
        L65:
            java.time.LocalDateTime r3 = r8.readLocalDateTimeX(r0)
            if (r3 == 0) goto L6c
            return r3
        L6c:
            java.time.ZonedDateTime r0 = r8.readZonedDateTimeX(r0)
            if (r0 == 0) goto Lbb
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZoneId r3 = r0.getZone()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L8f
            java.time.Instant r0 = r0.toInstant()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalDateTime r0 = r0.toLocalDateTime()
            return r0
        L8f:
            java.time.LocalDateTime r0 = r0.toLocalDateTime()
            return r0
        L94:
            java.time.LocalDateTime r3 = r8.readLocalDateTime20()
            if (r3 == 0) goto L9b
            return r3
        L9b:
            java.time.ZonedDateTime r0 = r8.readZonedDateTimeX(r0)
            if (r0 == 0) goto Lbb
            java.time.LocalDateTime r0 = r0.toLocalDateTime()
            return r0
        La6:
            java.time.LocalDateTime r0 = r8.readLocalDateTime19()
            if (r0 == 0) goto Lbb
            return r0
        Lad:
            java.time.LocalDateTime r0 = r8.readLocalDateTime18()
            if (r0 == 0) goto Lbb
            return r0
        Lb4:
            java.time.LocalDateTime r0 = r8.readLocalDateTime17()
            if (r0 == 0) goto Lbb
            return r0
        Lbb:
            java.lang.String r0 = r8.readString()
            boolean r3 = r0.isEmpty()
            r5 = 1
            if (r3 != 0) goto L168
            java.lang.String r3 = "null"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto Ld0
            goto L168
        Ld0:
            com.alibaba.fastjson2.JSONReader$Context r3 = r2.context
            java.time.format.DateTimeFormatter r3 = r3.getDateFormatter()
            if (r3 == 0) goto Lee
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            boolean r1 = r1.formatHasHour
            if (r1 != 0) goto Le9
            java.time.LocalDate r0 = java.time.LocalDate.parse(r0, r3)
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            return r0
        Le9:
            java.time.LocalDateTime r0 = java.time.LocalDateTime.parse(r0, r3)
            return r0
        Lee:
            boolean r3 = com.alibaba.fastjson2.util.IOUtils.isNumber(r0)
            if (r3 == 0) goto L110
            long r0 = java.lang.Long.parseLong(r0)
            com.alibaba.fastjson2.JSONReader$Context r3 = r2.context
            boolean r3 = r3.formatUnixTime
            if (r3 == 0) goto L101
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r3
        L101:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            return r0
        L110:
            java.lang.String r3 = "/Date("
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L14e
            java.lang.String r3 = ")/"
            boolean r3 = r0.endsWith(r3)
            if (r3 == 0) goto L14e
            r3 = 6
            r4 = 2
            java.lang.String r0 = wb.en.f(r4, r3, r0)
            r3 = 43
            int r3 = r0.indexOf(r3)
            r4 = -1
            if (r3 != r4) goto L135
            r3 = 45
            int r3 = r0.indexOf(r3)
        L135:
            if (r3 == r4) goto L13b
            java.lang.String r0 = r0.substring(r1, r3)
        L13b:
            long r0 = java.lang.Long.parseLong(r0)
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r2.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            return r0
        L14e:
            java.lang.String r1 = "0000-00-00 00:00:00"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L159
            r2.wasNull = r5
            return r4
        L159:
            java.lang.String r1 = "read LocalDateTime error "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r0 = r8.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L168:
            r2.wasNull = r5
            return r4
        L16b:
            java.time.LocalDateTime r0 = r8.readLocalDateTime16()
            return r0
        L170:
            java.time.LocalDate r0 = r8.readLocalDate11()
            if (r0 != 0) goto L177
            return r4
        L177:
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            return r0
        L17e:
            java.time.LocalDate r0 = r8.readLocalDate10()
            if (r0 != 0) goto L185
            return r4
        L185:
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            return r0
        L18c:
            java.time.LocalDate r0 = r8.readLocalDate9()
            if (r0 != 0) goto L193
            return r4
        L193:
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            return r0
        L19a:
            java.time.LocalDate r0 = r8.readLocalDate8()
            if (r0 != 0) goto L1a1
            return r4
        L1a1:
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r1)
            return r0
    }

    public abstract java.time.LocalDateTime readLocalDateTime12();

    public abstract java.time.LocalDateTime readLocalDateTime14();

    public abstract java.time.LocalDateTime readLocalDateTime16();

    public abstract java.time.LocalDateTime readLocalDateTime17();

    public abstract java.time.LocalDateTime readLocalDateTime18();

    public abstract java.time.LocalDateTime readLocalDateTime19();

    public abstract java.time.LocalDateTime readLocalDateTime20();

    public abstract java.time.LocalDateTime readLocalDateTimeX(int r1);

    public java.time.LocalTime readLocalTime() {
            r3 = this;
            boolean r0 = r3.nextIfNull()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.isInt()
            if (r0 == 0) goto L25
            long r0 = r3.readInt64Value()
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r3.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalTime r0 = r0.toLocalTime()
            return r0
        L25:
            int r0 = r3.getStringLength()
            r2 = 5
            if (r0 == r2) goto La7
            r2 = 15
            if (r0 == r2) goto La2
            switch(r0) {
                case 8: goto L9d;
                case 9: goto L98;
                case 10: goto L93;
                case 11: goto L8e;
                case 12: goto L89;
                default: goto L33;
            }
        L33:
            switch(r0) {
                case 18: goto L84;
                case 19: goto L7b;
                case 20: goto L72;
                default: goto L36;
            }
        L36:
            java.lang.String r0 = r3.readString()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L71
            java.lang.String r2 = "null"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L49
            goto L71
        L49:
            boolean r1 = com.alibaba.fastjson2.util.IOUtils.isNumber(r0)
            if (r1 == 0) goto L66
            long r0 = java.lang.Long.parseLong(r0)
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r0)
            com.alibaba.fastjson2.JSONReader$Context r1 = r3.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            java.time.LocalTime r0 = r0.toLocalTime()
            return r0
        L66:
            java.lang.String r1 = "not support len : "
            java.lang.String r0 = r1.concat(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L71:
            return r1
        L72:
            java.time.LocalDateTime r0 = r3.readLocalDateTime20()
            java.time.LocalTime r0 = r0.toLocalTime()
            return r0
        L7b:
            java.time.LocalDateTime r0 = r3.readLocalDateTime19()
            java.time.LocalTime r0 = r0.toLocalTime()
            return r0
        L84:
            java.time.LocalTime r0 = r3.readLocalTime18()
            return r0
        L89:
            java.time.LocalTime r0 = r3.readLocalTime12()
            return r0
        L8e:
            java.time.LocalTime r0 = r3.readLocalTime11()
            return r0
        L93:
            java.time.LocalTime r0 = r3.readLocalTime10()
            return r0
        L98:
            java.time.LocalTime r0 = r3.readLocalTime9()
            return r0
        L9d:
            java.time.LocalTime r0 = r3.readLocalTime8()
            return r0
        La2:
            java.time.LocalTime r0 = r3.readLocalTime15()
            return r0
        La7:
            java.time.LocalTime r0 = r3.readLocalTime5()
            return r0
    }

    public abstract java.time.LocalTime readLocalTime10();

    public abstract java.time.LocalTime readLocalTime11();

    public abstract java.time.LocalTime readLocalTime12();

    public abstract java.time.LocalTime readLocalTime15();

    public abstract java.time.LocalTime readLocalTime18();

    public abstract java.time.LocalTime readLocalTime5();

    public abstract java.time.LocalTime readLocalTime8();

    public abstract java.time.LocalTime readLocalTime9();

    public abstract long readMillis19();

    public final long readMillisFromString() {
            r12 = this;
            r0 = 0
            r12.wasNull = r0
            com.alibaba.fastjson2.JSONReader$Context r1 = r12.context
            java.lang.String r2 = r1.dateFormat
            r3 = 1
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            r8 = 0
            if (r2 == 0) goto L1f
            boolean r9 = r1.formatyyyyMMddhhmmss19
            if (r9 != 0) goto L1f
            boolean r9 = r1.formatyyyyMMddhhmmssT19
            if (r9 != 0) goto L1f
            boolean r9 = r1.formatyyyyMMdd8
            if (r9 != 0) goto L1f
            boolean r1 = r1.formatISO8601
            if (r1 == 0) goto L107
        L1f:
            int r1 = r12.getStringLength()
            java.lang.String r9 = "TODO : "
            switch(r1) {
                case 8: goto Lac;
                case 9: goto L9d;
                case 10: goto L6c;
                case 11: goto L5f;
                case 12: goto L5a;
                case 13: goto L28;
                case 14: goto L55;
                case 15: goto L28;
                case 16: goto L50;
                case 17: goto L4a;
                case 18: goto L44;
                case 19: goto L30;
                case 20: goto L2a;
                default: goto L28;
            }
        L28:
            goto Laa
        L2a:
            java.time.LocalDateTime r9 = r12.readLocalDateTime20()
            goto Lb8
        L30:
            long r9 = r12.readMillis19()
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 != 0) goto L43
            boolean r11 = r12.wasNull
            if (r11 != 0) goto L3d
            goto L43
        L3d:
            java.time.LocalDateTime r9 = r12.readLocalDateTime19()
            goto Lb8
        L43:
            return r9
        L44:
            java.time.LocalDateTime r9 = r12.readLocalDateTime18()
            goto Lb8
        L4a:
            java.time.LocalDateTime r9 = r12.readLocalDateTime17()
            goto Lb8
        L50:
            java.time.LocalDateTime r9 = r12.readLocalDateTime16()
            goto Lb8
        L55:
            java.time.LocalDateTime r9 = r12.readLocalDateTime14()
            goto Lb8
        L5a:
            java.time.LocalDateTime r9 = r12.readLocalDateTime12()
            goto Lb8
        L5f:
            java.time.LocalDate r9 = r12.readLocalDate11()
            if (r9 == 0) goto Laa
            java.time.LocalTime r10 = java.time.LocalTime.MIN
            java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r9, r10)
            goto Lb8
        L6c:
            java.time.LocalDate r10 = r12.readLocalDate10()
            if (r10 != 0) goto L96
            java.lang.String r0 = r12.readString()
            java.lang.String r1 = "0000-00-00"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L81
            r12.wasNull = r3
            return r6
        L81:
            boolean r1 = com.alibaba.fastjson2.util.IOUtils.isNumber(r0)
            if (r1 == 0) goto L8c
            long r0 = java.lang.Long.parseLong(r0)
            return r0
        L8c:
            java.lang.String r0 = wb.en.g(r9, r0)
            ah.a.w(r0)
        L93:
            r0 = 0
            return r0
        L96:
            java.time.LocalTime r9 = java.time.LocalTime.MIN
            java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r10, r9)
            goto Lb8
        L9d:
            java.time.LocalDate r9 = r12.readLocalDate9()
            if (r9 == 0) goto Laa
            java.time.LocalTime r10 = java.time.LocalTime.MIN
            java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r9, r10)
            goto Lb8
        Laa:
            r9 = r8
            goto Lb8
        Lac:
            java.time.LocalDate r10 = r12.readLocalDate8()
            if (r10 == 0) goto L1ee
            java.time.LocalTime r9 = java.time.LocalTime.MIN
            java.time.LocalDateTime r9 = java.time.LocalDateTime.of(r10, r9)
        Lb8:
            if (r9 == 0) goto Lc5
            com.alibaba.fastjson2.JSONReader$Context r1 = r12.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofLocal(r9, r1, r8)
            goto Le3
        Lc5:
            r9 = 20
            if (r1 < r9) goto Le2
            java.time.ZonedDateTime r9 = r12.readZonedDateTimeX(r1)
            if (r9 != 0) goto Le0
            r10 = 32
            if (r1 < r10) goto Le0
            r10 = 35
            if (r1 > r10) goto Le0
            java.lang.String r1 = r12.readString()
            java.time.ZonedDateTime r1 = com.alibaba.fastjson2.util.DateUtils.parseZonedDateTime(r1, r8)
            goto Le3
        Le0:
            r1 = r9
            goto Le3
        Le2:
            r1 = r8
        Le3:
            if (r1 == 0) goto L107
            long r2 = r1.toEpochSecond()
            java.time.LocalTime r0 = r1.toLocalTime()
            int r0 = r0.getNano()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r6 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 >= 0) goto L104
            if (r0 <= 0) goto L104
            r7 = 1
            long r2 = r2 + r7
            long r2 = r2 * r4
            int r0 = r0 / r6
            int r0 = r0 + (-1000)
        L101:
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        L104:
            long r2 = r2 * r4
            int r0 = r0 / r6
            goto L101
        L107:
            java.lang.String r1 = r12.readString()
            boolean r9 = r1.isEmpty()
            if (r9 != 0) goto L1eb
            java.lang.String r9 = "null"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L11b
            goto L1eb
        L11b:
            com.alibaba.fastjson2.JSONReader$Context r3 = r12.context
            boolean r9 = r3.formatMillis
            if (r9 != 0) goto L1df
            boolean r3 = r3.formatUnixTime
            if (r3 == 0) goto L127
            goto L1df
        L127:
            r3 = 45
            if (r2 == 0) goto L175
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L175
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L156
            int r0 = r1.length()
            r2 = 4
            if (r0 < r2) goto L146
            char r0 = r1.charAt(r2)
            if (r0 == r3) goto L151
        L146:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r1)
            if (r0 == 0) goto L151
            long r0 = java.lang.Long.parseLong(r1)
            return r0
        L151:
            long r0 = com.alibaba.fastjson2.util.DateUtils.parseMillis19(r1, r8)
            return r0
        L156:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            r0.<init>(r2)
            java.util.Date r2 = r0.parse(r1)     // Catch: java.text.ParseException -> L164
            long r0 = r2.getTime()     // Catch: java.text.ParseException -> L164
            return r0
        L164:
            java.lang.String r2 = "parse date error, "
            java.lang.String r3 = ", expect format "
            java.lang.StringBuilder r1 = bc.e.o(r2, r1, r3)
            java.lang.String r0 = r0.toPattern()
            ah.a.r(r1, r0)
            goto L93
        L175:
            java.lang.String r4 = "0000-00-00T00:00:00"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1de
            java.lang.String r4 = "0001-01-01T00:00:00+08:00"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L186
            goto L1de
        L186:
            java.lang.String r4 = "/Date("
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L1b4
            java.lang.String r4 = ")/"
            boolean r4 = r1.endsWith(r4)
            if (r4 == 0) goto L1b4
            r2 = 6
            r4 = 2
            java.lang.String r1 = wb.en.f(r4, r2, r1)
            r2 = 43
            int r2 = r1.indexOf(r2)
            r4 = -1
            if (r2 != r4) goto L1a9
            int r2 = r1.indexOf(r3)
        L1a9:
            if (r2 == r4) goto L1af
            java.lang.String r1 = r1.substring(r0, r2)
        L1af:
            long r0 = java.lang.Long.parseLong(r1)
            return r0
        L1b4:
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r1)
            if (r0 == 0) goto L1bf
            long r0 = java.lang.Long.parseLong(r1)
            return r0
        L1bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "format "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = " not support, input "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r12.info(r0)
            ah.a.w(r0)
            goto L93
        L1de:
            return r6
        L1df:
            long r0 = java.lang.Long.parseLong(r1)
            com.alibaba.fastjson2.JSONReader$Context r2 = r12.context
            boolean r2 = r2.formatUnixTime
            if (r2 == 0) goto L1ea
            long r0 = r0 * r4
        L1ea:
            return r0
        L1eb:
            r12.wasNull = r3
            return r6
        L1ee:
            java.lang.String r0 = r12.readString()
            ah.a.i(r0, r9)
            goto L93
    }

    public double readNaN() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "not support"
            r0.<init>(r1)
            throw r0
    }

    public abstract void readNull();

    public abstract java.util.Date readNullOrNewDate();

    public java.lang.Number readNumber() {
            r1 = this;
            r1.readNumber0()
            java.lang.Number r0 = r1.getNumber()
            return r0
    }

    public abstract void readNumber0();

    public java.util.Map<java.lang.String, java.lang.Object> readObject() {
            r14 = this;
            r14.nextIfObjectStart()
            int r0 = r14.level
            r1 = 1
            int r0 = r0 + r1
            r14.level = r0
            com.alibaba.fastjson2.JSONReader$Context r2 = r14.context
            int r3 = r2.maxLevel
            if (r0 >= r3) goto L18c
            java.util.function.Supplier<java.util.Map> r0 = r2.objectSupplier
            r3 = 0
            r5 = 0
            if (r0 != 0) goto L2e
            long r6 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject
            long r8 = r0.mask
            long r6 = r6 & r8
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L28
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L26:
            r2 = r5
            goto L38
        L28:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            goto L26
        L2e:
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r2 = com.alibaba.fastjson2.util.TypeUtils.getInnerMap(r0)
        L38:
            r6 = 0
            r7 = r6
        L3a:
            char r8 = r14.f1814ch
            r9 = 47
            if (r8 != r9) goto L43
            r14.skipComment()
        L43:
            char r8 = r14.f1814ch
            r9 = 125(0x7d, float:1.75E-43)
            if (r8 != r9) goto L60
            r14.next()
            char r2 = r14.f1814ch
            r3 = 44
            if (r2 != r3) goto L53
            r6 = r1
        L53:
            r14.comma = r6
            if (r6 == 0) goto L5a
            r14.next()
        L5a:
            int r2 = r14.level
            int r2 = r2 - r1
            r14.level = r2
            return r0
        L60:
            java.lang.String r8 = r14.readFieldName()
            if (r8 != 0) goto La4
            char r8 = r14.f1814ch
            r9 = 26
            if (r8 == r9) goto L9d
            r9 = 45
            if (r8 == r9) goto L90
            r9 = 48
            if (r8 < r9) goto L79
            r9 = 57
            if (r8 > r9) goto L79
            goto L90
        L79:
            r9 = 123(0x7b, float:1.72E-43)
            if (r8 != r9) goto L82
            java.util.Map r8 = r14.readObject()
            goto L97
        L82:
            r9 = 91
            if (r8 != r9) goto L8b
            java.util.List r8 = r14.readArray()
            goto L97
        L8b:
            java.lang.String r8 = r14.readFieldNameUnquote()
            goto L97
        L90:
            r14.readNumber0()
            java.lang.Number r8 = r14.getNumber()
        L97:
            r9 = 58
            r14.nextIfMatch(r9)
            goto La4
        L9d:
            java.lang.String r0 = "input end"
            ah.a.w(r0)
            r0 = 0
            return r0
        La4:
            if (r7 != 0) goto Lcb
            com.alibaba.fastjson2.JSONReader$Context r9 = r14.context
            long r9 = r9.features
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType
            long r11 = r11.mask
            long r9 = r9 & r11
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 == 0) goto Lcb
            java.lang.String r9 = "@type"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto Lbc
            goto Lcb
        Lbc:
            java.lang.String r0 = r14.readString()
            java.lang.String r1 = "autoType not support : "
            java.lang.String r0 = wb.en.g(r1, r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lcb:
            char r9 = r14.f1814ch
            java.lang.String r10 = "illegal input "
            switch(r9) {
                case 34: goto L16b;
                case 39: goto L16b;
                case 43: goto L163;
                case 45: goto L163;
                case 73: goto L13f;
                case 83: goto L11b;
                case 91: goto L116;
                case 102: goto L10d;
                case 110: goto L109;
                case 116: goto L10d;
                case 123: goto Lf1;
                default: goto Ld2;
            }
        Ld2:
            switch(r9) {
                case 47: goto Lec;
                case 48: goto L163;
                case 49: goto L163;
                case 50: goto L163;
                case 51: goto L163;
                case 52: goto L163;
                case 53: goto L163;
                case 54: goto L163;
                case 55: goto L163;
                case 56: goto L163;
                case 57: goto L163;
                default: goto Ld5;
            }
        Ld5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            char r1 = r14.f1814ch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r14.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lec:
            r14.skipComment()
            goto L188
        Lf1:
            boolean r9 = r14.isReference()
            if (r9 == 0) goto L104
            java.lang.String r9 = r14.readReference()
            com.alibaba.fastjson2.JSONPath r9 = com.alibaba.fastjson2.JSONPath.of(r9)
            r14.addResolveTask(r0, r8, r9)
        L102:
            r9 = r5
            goto L16f
        L104:
            java.util.Map r9 = r14.readObject()
            goto L16f
        L109:
            r14.readNull()
            goto L102
        L10d:
            boolean r9 = r14.readBoolValue()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            goto L16f
        L116:
            java.util.List r9 = r14.readArray()
            goto L16f
        L11b:
            boolean r9 = r14.nextIfSet()
            if (r9 == 0) goto L128
            java.lang.Class<java.util.Set> r9 = java.util.Set.class
            java.lang.Object r9 = r14.read(r9)
            goto L16f
        L128:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            char r1 = r14.f1814ch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r14.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L13f:
            boolean r9 = r14.nextIfInfinity()
            if (r9 == 0) goto L14c
            r9 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            goto L16f
        L14c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            char r1 = r14.f1814ch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r14.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L163:
            r14.readNumber0()
            java.lang.Number r9 = r14.getNumber()
            goto L16f
        L16b:
            java.lang.String r9 = r14.readString()
        L16f:
            if (r9 != 0) goto L17f
            com.alibaba.fastjson2.JSONReader$Context r10 = r14.context
            long r10 = r10.features
            com.alibaba.fastjson2.JSONReader$Feature r12 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r12 = r12.mask
            long r10 = r10 & r12
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 == 0) goto L17f
            goto L188
        L17f:
            if (r2 == 0) goto L185
            r2.put(r8, r9)
            goto L188
        L185:
            r0.put(r8, r9)
        L188:
            int r7 = r7 + 1
            goto L3a
        L18c:
            java.lang.String r0 = "level too large : "
            int r1 = r14.level
            ah.a.y(r1, r0)
            r0 = 0
            return r0
    }

    public final void readObject(java.lang.Object r7, long r8) {
            r6 = this;
            if (r7 == 0) goto L39
            java.lang.Class r0 = r7.getClass()
            com.alibaba.fastjson2.JSONReader$Context r1 = r6.context
            long r2 = r1.features
            long r2 = r2 | r8
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r1.provider
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.getObjectReader(r0, r2)
            boolean r1 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r1 == 0) goto L29
            com.alibaba.fastjson2.reader.ObjectReaderBean r0 = (com.alibaba.fastjson2.reader.ObjectReaderBean) r0
            r0.readObject(r6, r7, r8)
            return
        L29:
            boolean r0 = r7 instanceof java.util.Map
            if (r0 == 0) goto L33
            java.util.Map r7 = (java.util.Map) r7
            r6.read(r7, r8)
            return
        L33:
            java.lang.String r7 = "read object not support"
            ah.a.w(r7)
            return
        L39:
            java.lang.String r7 = "object is null"
            ah.a.w(r7)
            return
    }

    public final void readObject(java.lang.Object r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
            r5 = this;
            r0 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r2 >= r3) goto Le
            r3 = r7[r2]
            long r3 = r3.mask
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L3
        Le:
            r5.readObject(r6, r0)
            return
    }

    public abstract java.time.OffsetDateTime readOffsetDateTime();

    public java.time.OffsetTime readOffsetTime() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "TODO"
            r0.<init>(r1)
            throw r0
    }

    public abstract java.lang.String readPattern();

    public abstract java.lang.String readReference();

    public abstract java.lang.String readString();

    public java.lang.String[] readStringArray() {
            r5 = this;
            char r0 = r5.f1814ch
            r1 = 110(0x6e, float:1.54E-43)
            r2 = 0
            if (r0 != r1) goto Le
            boolean r0 = r5.nextIfNull()
            if (r0 == 0) goto Le
            return r2
        Le:
            boolean r0 = r5.nextIfArrayStart()
            if (r0 == 0) goto L59
            r0 = 0
            r1 = r0
        L16:
            boolean r3 = r5.nextIfArrayEnd()
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L20
            java.lang.String[] r2 = new java.lang.String[r0]
        L20:
            int r0 = r2.length
            if (r0 != r1) goto L24
            return r2
        L24:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
        L2b:
            boolean r3 = r5.isEnd()
            if (r3 != 0) goto L4e
            if (r2 != 0) goto L38
            r2 = 16
            java.lang.String[] r2 = new java.lang.String[r2]
            goto L44
        L38:
            int r3 = r2.length
            if (r1 != r3) goto L44
            int r3 = r2.length
            int r3 = r3 << 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
        L44:
            int r3 = r1 + 1
            java.lang.String r4 = r5.readString()
            r2[r1] = r4
            r1 = r3
            goto L16
        L4e:
            java.lang.String r0 = "input end"
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L59:
            char r0 = r5.f1814ch
            r1 = 34
            if (r0 == r1) goto L6f
            r1 = 39
            if (r0 != r1) goto L64
            goto L6f
        L64:
            java.lang.String r0 = "not support input"
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L6f:
            java.lang.String r0 = r5.readString()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7a
            return r2
        L7a:
            java.lang.String r1 = "not support input "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r0 = r5.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String readStringNotMatch() {
            r6 = this;
            char r0 = r6.f1814ch
            r1 = 43
            if (r0 == r1) goto L86
            r1 = 45
            if (r0 == r1) goto L86
            r1 = 91
            r2 = 0
            if (r0 == r1) goto L56
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L48
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L44
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L48
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L3b
            switch(r0) {
                case 48: goto L86;
                case 49: goto L86;
                case 50: goto L86;
                case 51: goto L86;
                case 52: goto L86;
                case 53: goto L86;
                case 54: goto L86;
                case 55: goto L86;
                case 56: goto L86;
                case 57: goto L86;
                default: goto L22;
            }
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "illegal input : "
            r0.<init>(r1)
            char r1 = r6.f1814ch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r6.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L3b:
            java.util.Map r0 = r6.readObject()
            java.lang.String r0 = r6.toString(r0)
            return r0
        L44:
            r6.readNull()
            return r2
        L48:
            boolean r0 = r6.readBoolValue()
            r6.boolValue = r0
            if (r0 == 0) goto L53
            java.lang.String r0 = "true"
            return r0
        L53:
            java.lang.String r0 = "false"
            return r0
        L56:
            java.util.List r0 = r6.readArray()
            int r1 = r0.size()
            r3 = 1
            if (r1 != r3) goto L81
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L69
            return r2
        L69:
            com.alibaba.fastjson2.JSONReader$Context r2 = r6.context
            long r2 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.DisableStringArrayUnwrapping
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L81
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L81
            java.lang.String r0 = r1.toString()
            return r0
        L81:
            java.lang.String r0 = r6.toString(r0)
            return r0
        L86:
            r6.readNumber0()
            java.lang.Number r0 = r6.getNumber()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public long readTypeHashCode() {
            r2 = this;
            long r0 = r2.readValueHashCode()
            return r0
    }

    public abstract java.util.UUID readUUID();

    public abstract long readValueHashCode();

    public java.time.ZonedDateTime readZonedDateTime() {
            r5 = this;
            boolean r0 = r5.isInt()
            r1 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L22
            long r3 = r5.readInt64Value()
            com.alibaba.fastjson2.JSONReader$Context r0 = r5.context
            boolean r0 = r0.formatUnixTime
            if (r0 == 0) goto L13
            long r3 = r3 * r1
        L13:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r3)
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            return r0
        L22:
            boolean r0 = r5.isString()
            r3 = 0
            if (r0 == 0) goto L110
            com.alibaba.fastjson2.JSONReader$Context r0 = r5.context
            java.lang.String r4 = r0.dateFormat
            if (r4 == 0) goto L3f
            boolean r4 = r0.formatyyyyMMddhhmmss19
            if (r4 != 0) goto L3f
            boolean r4 = r0.formatyyyyMMddhhmmssT19
            if (r4 != 0) goto L3f
            boolean r4 = r0.formatyyyyMMdd8
            if (r4 != 0) goto L3f
            boolean r0 = r0.formatISO8601
            if (r0 == 0) goto La9
        L3f:
            int r0 = r5.getStringLength()
            switch(r0) {
                case 8: goto L8f;
                case 9: goto L81;
                case 10: goto L73;
                case 11: goto L68;
                case 12: goto L46;
                case 13: goto L46;
                case 14: goto L46;
                case 15: goto L46;
                case 16: goto L63;
                case 17: goto L5e;
                case 18: goto L59;
                case 19: goto L54;
                case 20: goto L4f;
                default: goto L46;
            }
        L46:
            java.time.ZonedDateTime r0 = r5.readZonedDateTimeX(r0)
            if (r0 == 0) goto L4d
            return r0
        L4d:
            r0 = r3
            goto L9c
        L4f:
            java.time.LocalDateTime r0 = r5.readLocalDateTime20()
            goto L9c
        L54:
            java.time.LocalDateTime r0 = r5.readLocalDateTime19()
            goto L9c
        L59:
            java.time.LocalDateTime r0 = r5.readLocalDateTime18()
            goto L9c
        L5e:
            java.time.LocalDateTime r0 = r5.readLocalDateTime17()
            goto L9c
        L63:
            java.time.LocalDateTime r0 = r5.readLocalDateTime16()
            goto L9c
        L68:
            java.time.LocalDate r0 = r5.readLocalDate11()
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r4)
            goto L9c
        L73:
            java.time.LocalDate r0 = r5.readLocalDate10()
            if (r0 != 0) goto L7a
            goto L4d
        L7a:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r4)
            goto L9c
        L81:
            java.time.LocalDate r0 = r5.readLocalDate9()
            if (r0 != 0) goto L88
            goto L4d
        L88:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r4)
            goto L9c
        L8f:
            java.time.LocalDate r0 = r5.readLocalDate8()
            if (r0 != 0) goto L96
            goto L4d
        L96:
            java.time.LocalTime r4 = java.time.LocalTime.MIN
            java.time.LocalDateTime r0 = java.time.LocalDateTime.of(r0, r4)
        L9c:
            if (r0 == 0) goto La9
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.ofLocal(r0, r1, r3)
            return r0
        La9:
            java.lang.String r0 = r5.readString()
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L10f
            java.lang.String r4 = "null"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto Lbc
            goto L10f
        Lbc:
            com.alibaba.fastjson2.JSONReader$Context r3 = r5.context
            java.time.format.DateTimeFormatter r3 = r3.getDateFormatter()
            if (r3 == 0) goto Lea
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            boolean r1 = r1.formatHasHour
            if (r1 != 0) goto Ldb
            java.time.LocalDate r0 = java.time.LocalDate.parse(r0, r3)
            java.time.LocalTime r1 = java.time.LocalTime.MIN
            com.alibaba.fastjson2.JSONReader$Context r2 = r5.context
            java.time.ZoneId r2 = r2.getZoneId()
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r1, r2)
            return r0
        Ldb:
            java.time.LocalDateTime r0 = java.time.LocalDateTime.parse(r0, r3)
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.of(r0, r1)
            return r0
        Lea:
            boolean r3 = com.alibaba.fastjson2.util.IOUtils.isNumber(r0)
            if (r3 == 0) goto L10a
            long r3 = java.lang.Long.parseLong(r0)
            com.alibaba.fastjson2.JSONReader$Context r0 = r5.context
            boolean r0 = r0.formatUnixTime
            if (r0 == 0) goto Lfb
            long r3 = r3 * r1
        Lfb:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r3)
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            java.time.ZoneId r1 = r1.getZoneId()
            java.time.ZonedDateTime r0 = r0.atZone(r1)
            return r0
        L10a:
            java.time.ZonedDateTime r0 = java.time.ZonedDateTime.parse(r0)
            return r0
        L10f:
            return r3
        L110:
            boolean r0 = r5.nextIfNull()
            if (r0 == 0) goto L117
            return r3
        L117:
            java.lang.String r0 = "TODO : "
            char r1 = r5.f1814ch
            ah.a.t(r1, r0)
            r0 = 0
            return r0
    }

    public abstract java.time.ZonedDateTime readZonedDateTimeX(int r1);

    public void reset(com.alibaba.fastjson2.JSONReader.SavePoint r2) {
            r1 = this;
            int r0 = r2.offset
            r1.offset = r0
            int r2 = r2.current
            char r2 = (char) r2
            r1.f1814ch = r2
            return
    }

    public final void setTypeRedirect(boolean r1) {
            r0 = this;
            r0.typeRedirect = r1
            return
    }

    public abstract void skipComment();

    public abstract boolean skipName();

    public abstract void skipValue();

    public int startArray() {
            r2 = this;
            boolean r0 = r2.nextIfArrayStart()
            if (r0 == 0) goto La
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "illegal input, expect '[', but "
            r0.<init>(r1)
            char r1 = r2.f1814ch
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r2.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    public final int toInt(java.util.List r3) {
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L22
            r0 = 0
            java.lang.Object r0 = r3.get(r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L17
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            return r3
        L17:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L22
            java.lang.String r0 = (java.lang.String) r0
            int r3 = java.lang.Integer.parseInt(r0)
            return r3
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parseLong error, field : value "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r2.info(r3)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public final int toInt32(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r3)
            if (r0 != 0) goto L24
            r0 = 44
            int r0 = r3.lastIndexOf(r0)
            int r1 = r3.length()
            int r1 = r1 + (-4)
            if (r0 != r1) goto L15
            goto L24
        L15:
            java.lang.String r0 = "parseInt error, value : "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r3 = r2.info(r3)
            ah.a.w(r3)
            r3 = 0
            return r3
        L24:
            int r3 = com.alibaba.fastjson2.util.TypeUtils.toIntValue(r3)
            return r3
    }

    public final long toInt64(java.lang.String r3) {
            r2 = this;
            boolean r0 = com.alibaba.fastjson2.util.IOUtils.isNumber(r3)
            if (r0 != 0) goto L3e
            r0 = 44
            int r0 = r3.lastIndexOf(r0)
            int r1 = r3.length()
            int r1 = r1 + (-4)
            if (r0 != r1) goto L15
            goto L3e
        L15:
            int r0 = r3.length()
            r1 = 10
            if (r0 <= r1) goto L2e
            int r0 = r3.length()
            r1 = 40
            if (r0 >= r1) goto L2e
            com.alibaba.fastjson2.JSONReader$Context r0 = r2.context     // Catch: java.lang.Throwable -> L2e
            java.time.ZoneId r0 = r0.zoneId     // Catch: java.lang.Throwable -> L2e
            long r0 = com.alibaba.fastjson2.util.DateUtils.parseMillis(r3, r0)     // Catch: java.lang.Throwable -> L2e
            return r0
        L2e:
            java.lang.String r0 = "parseLong error, value : "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r3 = r2.info(r3)
            ah.a.w(r3)
            r0 = 0
            return r0
        L3e:
            long r0 = com.alibaba.fastjson2.util.TypeUtils.toLongValue(r3)
            return r0
    }

    public final long toLong(java.util.Map r3) {
            r2 = this;
            java.lang.String r0 = "val"
            java.lang.Object r0 = r3.get(r0)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L12
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            long r0 = (long) r3
            return r0
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "parseLong error, value : "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r2.info(r3)
            ah.a.w(r3)
            r0 = 0
            return r0
    }

    public final java.lang.Number toNumber(java.util.List r3) {
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L1e
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            return r3
        L13:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L1e
            java.lang.String r3 = (java.lang.String) r3
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r3)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public final java.lang.Number toNumber(java.util.Map r2) {
            r1 = this;
            java.lang.String r0 = "val"
            java.lang.Object r2 = r2.get(r0)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Ld
            java.lang.Number r2 = (java.lang.Number) r2
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public final java.lang.String toString(java.util.List r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r0 = com.alibaba.fastjson2.JSONWriter.of()
            r0.setRootObject(r2)
            r0.write(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final java.lang.String toString(java.util.Map r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r0 = com.alibaba.fastjson2.JSONWriter.of()
            r0.setRootObject(r2)
            r0.write(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final com.alibaba.fastjson2.JSONException valueError() {
            r2 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.String r1 = "illegal value"
            java.lang.String r1 = r2.info(r1)
            r0.<init>(r1)
            return r0
    }

    public boolean wasNull() {
            r1 = this;
            boolean r0 = r1.wasNull
            return r0
    }
}
