package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterProvider {
    static final int ENUM = 16384;
    static final int[] NOT_REFERENCES_TYPE_HASH_CODES = null;
    static final int[] PRIMITIVE_HASH_CODES = null;
    static com.alibaba.fastjson2.writer.ObjectWriterAdapter STACK_TRACE_ELEMENT_WRITER = null;
    static final int TYPE_DATE_MASK = 16;
    static final int TYPE_DECIMAL_MASK = 8;
    static final int TYPE_ENUM_MASK = 32;
    static final int TYPE_INT32_MASK = 2;
    static final int TYPE_INT64_MASK = 4;
    final java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> cache;
    final java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> cacheFieldBased;
    final com.alibaba.fastjson2.writer.ObjectWriterCreator creator;
    final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> mixInCache;
    final com.alibaba.fastjson2.PropertyNamingStrategy namingStrategy;
    volatile long userDefineMask;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class VoidObjectWriter implements com.alibaba.fastjson2.writer.ObjectWriter {
        public static final com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter INSTANCE = null;

        static {
                com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r0 = new com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter
                r0.<init>()
                com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE = r0
                return
        }

        public VoidObjectWriter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.alibaba.fastjson2.writer.ObjectWriter
        public void write(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
                r0 = this;
                return
        }
    }

    static {
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            java.lang.Class r26 = r0.getClass()
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            java.lang.Class r27 = r0.getClass()
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            java.lang.Class r28 = r0.getClass()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            java.lang.Class r4 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Byte> r5 = java.lang.Byte.class
            java.lang.Class r6 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Short> r7 = java.lang.Short.class
            java.lang.Class r8 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            java.lang.Class r10 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Long> r11 = java.lang.Long.class
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
            java.lang.Class r14 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Double> r15 = java.lang.Double.class
            java.lang.Class r16 = java.lang.Double.TYPE
            java.lang.Class<java.math.BigInteger> r17 = java.math.BigInteger.class
            java.lang.Class<java.math.BigDecimal> r18 = java.math.BigDecimal.class
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            java.lang.Class<java.util.Currency> r20 = java.util.Currency.class
            java.lang.Class<java.util.Date> r21 = java.util.Date.class
            java.lang.Class<java.util.UUID> r22 = java.util.UUID.class
            java.lang.Class<java.util.Locale> r23 = java.util.Locale.class
            java.lang.Class<java.lang.String> r24 = java.lang.String.class
            java.lang.Class<java.lang.StackTraceElement> r25 = java.lang.StackTraceElement.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
            r1 = 28
            int[] r2 = new int[r1]
            r3 = 0
        L4d:
            if (r3 >= r1) goto L5a
            r4 = r0[r3]
            int r4 = java.lang.System.identityHashCode(r4)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L4d
        L5a:
            java.util.Arrays.sort(r2)
            com.alibaba.fastjson2.writer.ObjectWriterProvider.PRIMITIVE_HASH_CODES = r2
            r0 = 31
            int[] r0 = java.util.Arrays.copyOf(r2, r0)
            int r1 = r0.length
            int r1 = r1 + (-1)
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            int r2 = java.lang.System.identityHashCode(r2)
            r0[r1] = r2
            int r1 = r0.length
            int r1 = r1 + (-2)
            java.lang.Class<int[]> r2 = int[].class
            int r2 = java.lang.System.identityHashCode(r2)
            r0[r1] = r2
            int r1 = r0.length
            int r1 = r1 + (-3)
            java.lang.Class<long[]> r2 = long[].class
            int r2 = java.lang.System.identityHashCode(r2)
            r0[r1] = r2
            java.util.Arrays.sort(r0)
            com.alibaba.fastjson2.writer.ObjectWriterProvider.NOT_REFERENCES_TYPE_HASH_CODES = r0
            return
    }

    public ObjectWriterProvider() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public ObjectWriterProvider(com.alibaba.fastjson2.PropertyNamingStrategy r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cacheFieldBased = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mixInCache = r0
            r1.namingStrategy = r2
            com.alibaba.fastjson2.writer.ObjectWriterCreator r2 = com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE
            r1.creator = r2
            return
    }

    public ObjectWriterProvider(com.alibaba.fastjson2.writer.ObjectWriterCreator r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cacheFieldBased = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mixInCache = r0
            r1.creator = r2
            r2 = 0
            r1.namingStrategy = r2
            return
    }

    public static /* synthetic */ void a(com.alibaba.fastjson2.writer.ObjectWriterProvider r0, java.lang.annotation.Annotation r1, com.alibaba.fastjson2.codec.FieldInfo r2, java.lang.reflect.Method r3) {
            r0.lambda$processJSONField1x$1(r1, r2, r3)
            return
    }

    private void applyFeatures(com.alibaba.fastjson2.codec.FieldInfo r7, java.lang.Enum[] r8) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L152
            r2 = r8[r1]
            java.lang.String r2 = r2.name()
            r2.getClass()
            int r3 = r2.hashCode()
            r4 = -1
            switch(r3) {
                case -2118604473: goto Lb9;
                case -1937516631: goto Lae;
                case -1779797023: goto La3;
                case -527123134: goto L98;
                case -348914872: goto L8d;
                case -335314544: goto L82;
                case -211922948: goto L77;
                case -102443356: goto L6c;
                case -62964779: goto L5e;
                case 1009181687: goto L50;
                case 1519175029: goto L42;
                case 1808123471: goto L34;
                case 1879776036: goto L26;
                case 2049970061: goto L18;
                default: goto L16;
            }
        L16:
            goto Lc3
        L18:
            java.lang.String r3 = "WriteMapNullValue"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            goto Lc3
        L22:
            r4 = 13
            goto Lc3
        L26:
            java.lang.String r3 = "WriteClassName"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L30
            goto Lc3
        L30:
            r4 = 12
            goto Lc3
        L34:
            java.lang.String r3 = "WriteNullBooleanAsFalse"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
            goto Lc3
        L3e:
            r4 = 11
            goto Lc3
        L42:
            java.lang.String r3 = "WriteNonStringValueAsString"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            goto Lc3
        L4c:
            r4 = 10
            goto Lc3
        L50:
            java.lang.String r3 = "WriteNullListAsEmpty"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5a
            goto Lc3
        L5a:
            r4 = 9
            goto Lc3
        L5e:
            java.lang.String r3 = "NotWriteRootClassName"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L68
            goto Lc3
        L68:
            r4 = 8
            goto Lc3
        L6c:
            java.lang.String r3 = "WriteNullStringAsEmpty"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L75
            goto Lc3
        L75:
            r4 = 7
            goto Lc3
        L77:
            java.lang.String r3 = "BrowserCompatible"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L80
            goto Lc3
        L80:
            r4 = 6
            goto Lc3
        L82:
            java.lang.String r3 = "WriteEnumUsingToString"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8b
            goto Lc3
        L8b:
            r4 = 5
            goto Lc3
        L8d:
            java.lang.String r3 = "WriteBigDecimalAsPlain"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L96
            goto Lc3
        L96:
            r4 = 4
            goto Lc3
        L98:
            java.lang.String r3 = "UseISO8601DateFormat"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La1
            goto Lc3
        La1:
            r4 = 3
            goto Lc3
        La3:
            java.lang.String r3 = "IgnoreErrorGetter"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lac
            goto Lc3
        Lac:
            r4 = 2
            goto Lc3
        Lae:
            java.lang.String r3 = "WriteNullNumberAsZero"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lb7
            goto Lc3
        Lb7:
            r4 = 1
            goto Lc3
        Lb9:
            java.lang.String r3 = "DisableCircularReferenceDetect"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc2
            goto Lc3
        Lc2:
            r4 = r0
        Lc3:
            switch(r4) {
                case 0: goto L147;
                case 1: goto L13d;
                case 2: goto L133;
                case 3: goto L12e;
                case 4: goto L124;
                case 5: goto L11a;
                case 6: goto L110;
                case 7: goto L106;
                case 8: goto Lfc;
                case 9: goto Lf2;
                case 10: goto Le8;
                case 11: goto Lde;
                case 12: goto Ld3;
                case 13: goto Lc8;
                default: goto Lc6;
            }
        Lc6:
            goto L14e
        Lc8:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        Ld3:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        Lde:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        Le8:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        Lf2:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        Lfc:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L106:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L110:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L11a:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L124:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteBigDecimalAsPlain
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L12e:
            java.lang.String r2 = "iso8601"
            r7.format = r2
            goto L14e
        L133:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L13d:
            long r2 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r4 = r4.mask
            long r2 = r2 | r4
            r7.features = r2
            goto L14e
        L147:
            long r2 = r7.features
            r4 = 288230376151711744(0x400000000000000, double:2.0522684006491881E-289)
            long r2 = r2 | r4
            r7.features = r2
        L14e:
            int r1 = r1 + 1
            goto L2
        L152:
            return
    }

    public static /* synthetic */ void b(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            lambda$getBeanInfo$0(r0, r1, r2)
            return
    }

    private com.alibaba.fastjson2.writer.ObjectWriter createEnumWriter(java.lang.Class r10) {
            r9 = this;
            boolean r0 = r10.isEnum()
            if (r0 != 0) goto L12
            java.lang.Class r0 = r10.getSuperclass()
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L12
            r4 = r0
            goto L13
        L12:
            r4 = r10
        L13:
            java.lang.reflect.Member r10 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r4, r9)
            r0 = 0
            if (r10 != 0) goto L34
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r1 = r9.mixInCache
            java.lang.Object r1 = r1.get(r4)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Member r1 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r1, r9)
            boolean r2 = r1 instanceof java.lang.reflect.Field
            if (r2 == 0) goto L36
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Field r10 = r4.getField(r1)     // Catch: java.lang.Throwable -> L34
        L34:
            r5 = r10
            goto L45
        L36:
            boolean r2 = r1 instanceof java.lang.reflect.Method
            if (r2 == 0) goto L34
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = r1.getName()
            java.lang.reflect.Method r10 = r4.getMethod(r1, r0)
            goto L34
        L45:
            com.alibaba.fastjson2.codec.BeanInfo r10 = new com.alibaba.fastjson2.codec.BeanInfo
            r10.<init>()
            r9.getBeanInfo(r10, r4)
            boolean r10 = r10.writeEnumAsJavaBean
            if (r10 == 0) goto L52
            return r0
        L52:
            java.lang.String[] r6 = com.alibaba.fastjson2.util.BeanUtils.getEnumAnnotationNames(r4)
            com.alibaba.fastjson2.writer.ObjectWriterImplEnum r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplEnum
            r3 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public static boolean isNotReferenceDetect(java.lang.Class<?> r2) {
            int[] r0 = com.alibaba.fastjson2.writer.ObjectWriterProvider.NOT_REFERENCES_TYPE_HASH_CODES
            int r1 = java.lang.System.identityHashCode(r2)
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L1f
            int r0 = r2.getModifiers()
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L1d
            java.lang.Class r2 = r2.getSuperclass()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            if (r2 != r0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public static boolean isPrimitiveOrEnum(java.lang.Class<?> r2) {
            int[] r0 = com.alibaba.fastjson2.writer.ObjectWriterProvider.PRIMITIVE_HASH_CODES
            int r1 = java.lang.System.identityHashCode(r2)
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 >= 0) goto L1f
            int r0 = r2.getModifiers()
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L1d
            java.lang.Class r2 = r2.getSuperclass()
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            if (r2 != r0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    private static /* synthetic */ void lambda$getBeanInfo$0(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            com.alibaba.fastjson2.util.BeanUtils.processJSONType1x(r0, r1, r2)
            return
    }

    private /* synthetic */ void lambda$processJSONField1x$1(java.lang.annotation.Annotation r5, com.alibaba.fastjson2.codec.FieldInfo r6, java.lang.reflect.Method r7) {
            r4 = this;
            java.lang.String r0 = r7.getName()
            r1 = 0
            java.lang.Object r5 = r7.invoke(r5, r1)     // Catch: java.lang.Throwable -> Ld6
            int r7 = r0.hashCode()     // Catch: java.lang.Throwable -> Ld6
            switch(r7) {
                case -1371565692: goto Lc2;
                case -1268779017: goto Lb4;
                case -1206994319: goto L9d;
                case -987658292: goto L85;
                case -940893828: goto L77;
                case -659125328: goto L64;
                case -573479200: goto L50;
                case 3373707: goto L3d;
                case 12396273: goto L25;
                case 102727412: goto L12;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> Ld6
        L10:
            goto Ld6
        L12:
            java.lang.String r7 = "label"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r7 != 0) goto Ld6
            r6.label = r5     // Catch: java.lang.Throwable -> Ld6
            return
        L25:
            java.lang.String r7 = "jsonDirect"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld6
            if (r5 == 0) goto Ld6
            long r0 = r6.features     // Catch: java.lang.Throwable -> Ld6
            r2 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r0 = r0 | r2
            r6.features = r0     // Catch: java.lang.Throwable -> Ld6
            return
        L3d:
            java.lang.String r7 = "name"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r7 != 0) goto Ld6
            r6.fieldName = r5     // Catch: java.lang.Throwable -> Ld6
            return
        L50:
            java.lang.String r7 = "serialize"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld6
            if (r5 != 0) goto Ld6
            r5 = 1
            r6.ignore = r5     // Catch: java.lang.Throwable -> Ld6
            return
        L64:
            java.lang.String r7 = "defaultValue"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> Ld6
            if (r7 != 0) goto Ld6
            r6.defaultValue = r5     // Catch: java.lang.Throwable -> Ld6
            return
        L77:
            java.lang.String r7 = "serialzeFeatures"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Enum[] r5 = (java.lang.Enum[]) r5     // Catch: java.lang.Throwable -> Ld6
            r4.applyFeatures(r6, r5)     // Catch: java.lang.Throwable -> Ld6
            return
        L85:
            java.lang.String r7 = "unwrapped"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> Ld6
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> Ld6
            if (r5 == 0) goto Ld6
            long r0 = r6.features     // Catch: java.lang.Throwable -> Ld6
            r2 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r0 = r0 | r2
            r6.features = r0     // Catch: java.lang.Throwable -> Ld6
            return
        L9d:
            java.lang.String r7 = "ordinal"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> Ld6
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld6
            r6.ordinal = r5     // Catch: java.lang.Throwable -> Ld6
            return
        Lb4:
            java.lang.String r7 = "format"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld6
            r4.loadJsonFieldFormat(r6, r5)     // Catch: java.lang.Throwable -> Ld6
            return
        Lc2:
            java.lang.String r7 = "serializeUsing"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> Ld6
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r7 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r7 = r7.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Ld6
            r6.writeUsing = r5     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            return
    }

    private void loadFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r8, com.alibaba.fastjson2.annotation.JSONField r9) {
            r7 = this;
            java.lang.String r0 = r9.name()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lc
            r8.fieldName = r0
        Lc:
            java.lang.String r0 = r9.defaultValue()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L18
            r8.defaultValue = r0
        L18:
            java.lang.String r0 = r9.format()
            r7.loadJsonFieldFormat(r8, r0)
            java.lang.String r0 = r9.label()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2b
            r8.label = r0
        L2b:
            boolean r0 = r8.ignore
            if (r0 != 0) goto L37
            boolean r0 = r9.serialize()
            r0 = r0 ^ 1
            r8.ignore = r0
        L37:
            boolean r0 = r9.unwrapped()
            if (r0 == 0) goto L44
            long r0 = r8.features
            r2 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r0 = r0 | r2
            r8.features = r0
        L44:
            com.alibaba.fastjson2.JSONWriter$Feature[] r0 = r9.serializeFeatures()
            r1 = 0
        L49:
            int r2 = r0.length
            if (r1 >= r2) goto L59
            r2 = r0[r1]
            long r3 = r8.features
            long r5 = r2.mask
            long r2 = r3 | r5
            r8.features = r2
            int r1 = r1 + 1
            goto L49
        L59:
            int r0 = r9.ordinal()
            if (r0 == 0) goto L61
            r8.ordinal = r0
        L61:
            boolean r0 = r9.value()
            if (r0 == 0) goto L6e
            long r0 = r8.features
            r2 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 | r2
            r8.features = r0
        L6e:
            boolean r0 = r9.jsonDirect()
            if (r0 == 0) goto L7b
            long r0 = r8.features
            r2 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r0 = r0 | r2
            r8.features = r0
        L7b:
            java.lang.Class r9 = r9.serializeUsing()
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r0 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 == 0) goto L89
            r8.writeUsing = r9
        L89:
            return
    }

    private void loadJsonFieldFormat(com.alibaba.fastjson2.codec.FieldInfo r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L29
            java.lang.String r4 = r4.trim()
            r0 = 84
            int r0 = r4.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L21
            java.lang.String r0 = "'T'"
            boolean r1 = r4.contains(r0)
            if (r1 != 0) goto L21
            java.lang.String r1 = "T"
            java.lang.String r4 = r4.replaceAll(r1, r0)
        L21:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L29
            r3.format = r4
        L29:
            return
    }

    public static boolean match(java.lang.reflect.Type r5, com.alibaba.fastjson2.writer.ObjectWriter r6, java.lang.ClassLoader r7, java.util.IdentityHashMap<com.alibaba.fastjson2.writer.ObjectWriter, java.lang.Object> r8) {
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            r0 = 1
            if (r5 == 0) goto Le
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto Le
            return r0
        Le:
            boolean r5 = r8.containsKey(r6)
            r1 = 0
            if (r5 == 0) goto L16
            return r1
        L16:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.writer.ObjectWriterImplMap
            if (r5 == 0) goto L3b
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r6 = (com.alibaba.fastjson2.writer.ObjectWriterImplMap) r6
            java.lang.reflect.Type r5 = r6.valueType
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            if (r5 == 0) goto L2b
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L2b
            return r0
        L2b:
            java.lang.reflect.Type r5 = r6.keyType
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            if (r5 == 0) goto L3a
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L3a
            return r0
        L3a:
            return r1
        L3b:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.writer.ObjectWriterImplCollection
            if (r5 == 0) goto L51
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection r6 = (com.alibaba.fastjson2.writer.ObjectWriterImplCollection) r6
            java.lang.reflect.Type r5 = r6.itemType
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            if (r5 == 0) goto L50
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L50
            return r0
        L50:
            return r1
        L51:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r5 == 0) goto L7c
            r5 = 0
            r8.put(r6, r5)
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r6 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r6
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r6 = r6.fieldWriters
            r2 = r1
        L5e:
            int r3 = r6.size()
            if (r2 >= r3) goto L7c
            java.lang.Object r3 = r6.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r3 = (com.alibaba.fastjson2.writer.FieldWriter) r3
            boolean r4 = r3 instanceof com.alibaba.fastjson2.writer.FieldWriterObject
            if (r4 == 0) goto L79
            com.alibaba.fastjson2.writer.FieldWriterObject r3 = (com.alibaba.fastjson2.writer.FieldWriterObject) r3
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.initObjectWriter
            boolean r3 = match(r5, r3, r7, r8)
            if (r3 == 0) goto L79
            return r0
        L79:
            int r2 = r2 + 1
            goto L5e
        L7c:
            return r1
    }

    private void processAnnotations(com.alibaba.fastjson2.codec.FieldInfo r5, java.lang.annotation.Annotation[] r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L39
            r1 = r6[r0]
            java.lang.Class r2 = r1.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r3 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r3 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r1, r3)
            com.alibaba.fastjson2.annotation.JSONField r3 = (com.alibaba.fastjson2.annotation.JSONField) r3
            if (r3 == 0) goto L18
            r4.loadFieldInfo(r5, r3)
            goto L36
        L18:
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "java.beans.Transient"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L31
            java.lang.String r3 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2d
            goto L36
        L2d:
            r4.processJSONField1x(r5, r1)
            goto L36
        L31:
            r1 = 1
            r5.ignore = r1
            r5.isTransient = r1
        L36:
            int r0 = r0 + 1
            goto L1
        L39:
            return
    }

    private void processJSONField1x(com.alibaba.fastjson2.codec.FieldInfo r3, java.lang.annotation.Annotation r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            com.alibaba.fastjson2.reader.k r1 = new com.alibaba.fastjson2.reader.k
            r1.<init>(r2, r4, r3)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r0, r1)
            return
    }

    public void cleanup(java.lang.Class r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.remove(r2)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cache
            r0.remove(r2)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cacheFieldBased
            r0.remove(r2)
            com.alibaba.fastjson2.util.BeanUtils.cleanupCache(r2)
            return
    }

    public void cleanup(java.lang.ClassLoader r5) {
            r4 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r4.mixInCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r5) goto La
            r0.remove()
            goto La
        L26:
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r1 = r4.cache
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            java.lang.Object r2 = r2.getValue()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = (com.alibaba.fastjson2.writer.ObjectWriter) r2
            boolean r2 = match(r3, r2, r5, r0)
            if (r2 == 0) goto L35
            r1.remove()
            goto L35
        L57:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r1 = r4.cacheFieldBased
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            java.lang.Object r2 = r2.getValue()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = (com.alibaba.fastjson2.writer.ObjectWriter) r2
            boolean r2 = match(r3, r2, r5, r0)
            if (r2 == 0) goto L61
            r1.remove()
            goto L61
        L83:
            com.alibaba.fastjson2.util.BeanUtils.cleanupCache(r5)
            return
    }

    public void cleanupMixIn() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.clear()
            return
    }

    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.clear()
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cache
            r0.clear()
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cacheFieldBased
            r0.clear()
            return
    }

    @java.lang.SafeVarargs
    public final void configEnumAsJavaBean(java.lang.Class<? extends java.lang.Enum>... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r5[r1]
            com.alibaba.fastjson2.writer.ObjectWriterCreator r3 = r4.creator
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.createObjectWriter(r2)
            r4.register(r2, r3)
            int r1 = r1 + 1
            goto L2
        L12:
            return
    }

    public void getBeanInfo(com.alibaba.fastjson2.codec.BeanInfo r11, java.lang.Class r12) {
            r10 = this;
            com.alibaba.fastjson2.PropertyNamingStrategy r0 = r10.namingStrategy
            if (r0 == 0) goto Le
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue
            if (r0 == r1) goto Le
            java.lang.String r0 = r0.name()
            r11.namingStrategy = r0
        Le:
            r0 = 0
            if (r12 == 0) goto L49
            java.lang.Class r1 = r12.getSuperclass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 == r2) goto L49
            if (r1 == 0) goto L49
            java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
            if (r1 == r2) goto L49
            r10.getBeanInfo(r11, r1)
            java.lang.Class[] r1 = r11.seeAlso
            if (r1 == 0) goto L49
            java.lang.String[] r1 = r11.seeAlsoNames
            if (r1 == 0) goto L49
            r1 = r0
        L2b:
            java.lang.Class[] r2 = r11.seeAlso
            int r3 = r2.length
            if (r1 >= r3) goto L49
            r2 = r2[r1]
            if (r2 != r12) goto L46
            java.lang.String[] r2 = r11.seeAlsoNames
            int r3 = r2.length
            if (r1 >= r3) goto L46
            r2 = r2[r1]
            if (r2 == 0) goto L46
            int r3 = r2.length()
            if (r3 == 0) goto L46
            r11.typeName = r2
            goto L49
        L46:
            int r1 = r1 + 1
            goto L2b
        L49:
            java.lang.annotation.Annotation[] r1 = r12.getDeclaredAnnotations()
            r2 = 0
            r4 = r0
            r3 = r2
        L50:
            int r5 = r1.length
            java.lang.String r6 = "com.alibaba.fastjson.annotation.JSONType"
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONType> r7 = com.alibaba.fastjson2.annotation.JSONType.class
            if (r4 >= r5) goto L76
            r2 = r1[r4]
            java.lang.Class r5 = r2.annotationType()
            java.lang.annotation.Annotation r7 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r2, r7)
            com.alibaba.fastjson2.annotation.JSONType r7 = (com.alibaba.fastjson2.annotation.JSONType) r7
            if (r7 != r2) goto L66
            goto L72
        L66:
            java.lang.String r5 = r5.getName()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L71
            goto L72
        L71:
            r3 = r2
        L72:
            int r4 = r4 + 1
            r2 = r7
            goto L50
        L76:
            r1 = 1
            if (r2 != 0) goto Lab
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r4 = r10.mixInCache
            java.lang.Object r4 = r4.get(r12)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto Lab
            r11.mixIn = r1
            java.lang.annotation.Annotation[] r4 = r4.getDeclaredAnnotations()
            r5 = r0
        L8a:
            int r8 = r4.length
            if (r5 >= r8) goto Lab
            r2 = r4[r5]
            java.lang.Class r8 = r2.annotationType()
            java.lang.annotation.Annotation r9 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r2, r7)
            com.alibaba.fastjson2.annotation.JSONType r9 = (com.alibaba.fastjson2.annotation.JSONType) r9
            if (r9 != r2) goto L9c
            goto La7
        L9c:
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto La7
            r3 = r2
        La7:
            int r5 = r5 + 1
            r2 = r9
            goto L8a
        Lab:
            if (r2 == 0) goto L169
            java.lang.Class[] r3 = r2.seeAlso()
            int r4 = r3.length
            if (r4 == 0) goto Lb6
            r11.seeAlso = r3
        Lb6:
            java.lang.String r3 = r2.typeKey()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lc2
            r11.typeKey = r3
        Lc2:
            java.lang.String r3 = r2.typeName()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto Lce
            r11.typeName = r3
        Lce:
            com.alibaba.fastjson2.JSONWriter$Feature[] r3 = r2.serializeFeatures()
            r4 = r0
        Ld3:
            int r5 = r3.length
            if (r4 >= r5) goto Le3
            r5 = r3[r4]
            long r6 = r11.writerFeatures
            long r8 = r5.mask
            long r5 = r6 | r8
            r11.writerFeatures = r5
            int r4 = r4 + 1
            goto Ld3
        Le3:
            com.alibaba.fastjson2.PropertyNamingStrategy r3 = r2.naming()
            java.lang.String r3 = r3.name()
            r11.namingStrategy = r3
            java.lang.String[] r3 = r2.ignores()
            int r4 = r3.length
            if (r4 <= 0) goto Lf6
            r11.ignores = r3
        Lf6:
            java.lang.String[] r3 = r2.includes()
            int r4 = r3.length
            if (r4 <= 0) goto Lff
            r11.includes = r3
        Lff:
            java.lang.String[] r3 = r2.orders()
            int r4 = r3.length
            if (r4 <= 0) goto L108
            r11.orders = r3
        L108:
            java.lang.Class r3 = r2.serializer()
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r4 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L118
            r11.serializer = r3
            r11.writeEnumAsJavaBean = r1
        L118:
            java.lang.Class[] r3 = r2.serializeFilters()
            int r4 = r3.length
            if (r4 == 0) goto L121
            r11.serializeFilters = r3
        L121:
            java.lang.String r3 = r2.format()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L12d
            r11.format = r3
        L12d:
            java.lang.String r3 = r2.locale()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L14c
            java.lang.String r4 = "_"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto L14c
            java.util.Locale r4 = new java.util.Locale
            r5 = r3[r0]
            r3 = r3[r1]
            r4.<init>(r5, r3)
            r11.locale = r4
        L14c:
            boolean r3 = r2.alphabetic()
            if (r3 != 0) goto L154
            r11.alphabetic = r0
        L154:
            boolean r3 = r2.writeEnumAsJavaBean()
            if (r3 == 0) goto L15c
            r11.writeEnumAsJavaBean = r1
        L15c:
            java.lang.String r1 = r2.rootName()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L178
            r11.rootName = r1
            goto L178
        L169:
            if (r3 == 0) goto L178
            java.lang.Class r1 = r3.annotationType()
            com.alibaba.fastjson2.reader.g r2 = new com.alibaba.fastjson2.reader.g
            r4 = 4
            r2.<init>(r11, r3, r4)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r1, r2)
        L178:
            java.lang.Class[] r1 = r11.seeAlso
            if (r1 == 0) goto L19c
            int r1 = r1.length
            if (r1 == 0) goto L19c
            java.lang.String r1 = r11.typeName
            if (r1 == 0) goto L189
            int r1 = r1.length()
            if (r1 != 0) goto L19c
        L189:
            java.lang.Class[] r1 = r11.seeAlso
            int r2 = r1.length
        L18c:
            if (r0 >= r2) goto L19c
            r3 = r1[r0]
            if (r3 != r12) goto L199
            java.lang.String r12 = r12.getSimpleName()
            r11.typeName = r12
            return
        L199:
            int r0 = r0 + 1
            goto L18c
        L19c:
            return
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getExternalObjectWriter(java.lang.String r3, java.lang.Class r4) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "java.sql.Time"
            boolean r0 = r3.equals(r0)
            r1 = 0
            if (r0 != 0) goto L29
            java.lang.String r0 = "java.sql.Timestamp"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L23
            java.lang.Class<java.sql.Clob> r3 = java.sql.Clob.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L22
            com.alibaba.fastjson2.util.JdbcSupport$ClobWriter r3 = new com.alibaba.fastjson2.util.JdbcSupport$ClobWriter
            r3.<init>()
            return r3
        L22:
            return r1
        L23:
            com.alibaba.fastjson2.util.JdbcSupport$TimestampWriter r3 = new com.alibaba.fastjson2.util.JdbcSupport$TimestampWriter
            r3.<init>(r1)
            return r3
        L29:
            com.alibaba.fastjson2.util.JdbcSupport$TimeWriter r3 = com.alibaba.fastjson2.util.JdbcSupport.TimeWriter.of(r1)
            return r3
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.BeanInfo r6, com.alibaba.fastjson2.codec.FieldInfo r7, java.lang.Class r8, java.lang.reflect.Field r9) {
            r5 = this;
            r0 = 0
            if (r8 == 0) goto L1e
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r1 = r5.mixInCache
            java.lang.Object r1 = r1.get(r8)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L1e
            if (r1 == r8) goto L1e
            java.lang.String r8 = r9.getName()     // Catch: java.lang.Exception -> L18
            java.lang.reflect.Field r8 = r1.getDeclaredField(r8)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r8 = r0
        L19:
            if (r8 == 0) goto L1e
            r5.getFieldInfo(r6, r7, r1, r8)
        L1e:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r6 = r5.mixInCache
            java.lang.Class r8 = r9.getType()
            java.lang.Object r6 = r6.get(r8)
            java.lang.Class r6 = (java.lang.Class) r6
            r8 = 1
            if (r6 == 0) goto L2f
            r7.fieldClassMixIn = r8
        L2f:
            int r6 = r9.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isTransient(r6)
            if (r6 == 0) goto L3d
            r7.ignore = r8
            r7.isTransient = r8
        L3d:
            java.lang.annotation.Annotation[] r6 = r9.getDeclaredAnnotations()
            r8 = 0
        L42:
            int r1 = r6.length
            if (r8 >= r1) goto L6a
            r1 = r6[r8]
            java.lang.Class r2 = r1.annotationType()
            if (r0 != 0) goto L58
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r0 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r0 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r1, r0)
            com.alibaba.fastjson2.annotation.JSONField r0 = (com.alibaba.fastjson2.annotation.JSONField) r0
            if (r0 != r1) goto L58
            goto L67
        L58:
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L67
            r5.processJSONField1x(r7, r1)
        L67:
            int r8 = r8 + 1
            goto L42
        L6a:
            if (r0 != 0) goto L6d
            goto Lc2
        L6d:
            r5.loadFieldInfo(r7, r0)
            java.lang.Class r6 = r0.writeUsing()
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r8 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r1 = r8.isAssignableFrom(r6)
            if (r1 == 0) goto L7e
            r7.writeUsing = r6
        L7e:
            java.lang.Class r6 = r0.serializeUsing()
            boolean r8 = r8.isAssignableFrom(r6)
            if (r8 == 0) goto L8a
            r7.writeUsing = r6
        L8a:
            boolean r6 = r0.jsonDirect()
            if (r6 == 0) goto L97
            long r1 = r7.features
            r3 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r1 = r1 | r3
            r7.features = r1
        L97:
            long r1 = r7.features
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r3 = r6.mask
            long r1 = r1 & r3
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto Lb8
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class r8 = r9.getType()
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto Lb8
            java.lang.Class<?> r6 = r7.writeUsing
            if (r6 != 0) goto Lb8
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriterImplToString> r6 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.class
            r7.writeUsing = r6
        Lb8:
            java.lang.Class r6 = r0.contentAs()
            java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
            if (r6 == r8) goto Lc2
            r7.contentAs = r6
        Lc2:
            return
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.BeanInfo r8, com.alibaba.fastjson2.codec.FieldInfo r9, java.lang.Class r10, java.lang.reflect.Method r11) {
            r7 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r7.mixInCache
            java.lang.Object r0 = r0.get(r10)
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r1 = r11.getName()
            r2 = 0
            if (r0 == 0) goto L20
            if (r0 == r10) goto L20
            java.lang.Class[] r3 = r11.getParameterTypes()     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            if (r1 == 0) goto L20
            r7.getFieldInfo(r8, r9, r0, r1)
        L20:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r7.mixInCache
            java.lang.Class r1 = r11.getReturnType()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L31
            r0 = 1
            r9.fieldClassMixIn = r0
        L31:
            r0 = 0
            if (r10 == 0) goto L57
            java.lang.Class r1 = r10.getSuperclass()
            java.lang.reflect.Method r3 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r1, r11)
            if (r3 == 0) goto L41
            r7.getFieldInfo(r8, r9, r1, r3)
        L41:
            java.lang.Class[] r3 = r10.getInterfaces()
            r4 = r0
        L46:
            int r5 = r3.length
            if (r4 >= r5) goto L57
            r5 = r3[r4]
            java.lang.reflect.Method r5 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r5, r11)
            if (r5 == 0) goto L54
            r7.getFieldInfo(r8, r9, r1, r5)
        L54:
            int r4 = r4 + 1
            goto L46
        L57:
            java.lang.annotation.Annotation[] r1 = r11.getDeclaredAnnotations()
            r7.processAnnotations(r9, r1)
            java.lang.String r1 = r10.getName()
            java.lang.String r3 = "java.lang"
            boolean r1 = r1.startsWith(r3, r0)
            if (r1 != 0) goto L7a
            java.lang.reflect.Field r1 = com.alibaba.fastjson2.util.BeanUtils.getField(r10, r11)
            if (r1 == 0) goto L7a
            long r3 = r9.features
            r5 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 | r5
            r9.features = r3
            r7.getFieldInfo(r8, r9, r10, r1)
        L7a:
            boolean r10 = r8.kotlin
            if (r10 == 0) goto La9
            java.lang.reflect.Constructor r1 = r8.creatorConstructor
            if (r1 == 0) goto La9
            java.lang.String[] r1 = r8.createParameterNames
            if (r1 == 0) goto La9
            java.lang.String r10 = com.alibaba.fastjson2.util.BeanUtils.getterName(r11, r10, r2)
        L8a:
            java.lang.String[] r11 = r8.createParameterNames
            int r1 = r11.length
            if (r0 >= r1) goto La9
            r11 = r11[r0]
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto La6
            java.lang.reflect.Constructor r11 = r8.creatorConstructor
            java.lang.annotation.Annotation[][] r11 = r11.getParameterAnnotations()
            int r1 = r11.length
            if (r0 >= r1) goto La6
            r8 = r11[r0]
            r7.processAnnotations(r9, r8)
            goto La9
        La6:
            int r0 = r0 + 1
            goto L8a
        La9:
            return
    }

    public java.lang.Class getMixIn(java.lang.Class r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.getObjectWriter(r2, r2, r0)
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r3) {
            r2 = this;
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            r1 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r2.getObjectWriter(r3, r0, r1)
            return r3
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r2, java.lang.Class r3) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.getObjectWriter(r2, r3, r0)
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r4, java.lang.Class r5, boolean r6) {
            r3 = this;
            java.lang.Class r0 = r5.getSuperclass()
            boolean r1 = r5.isEnum()
            if (r1 != 0) goto L17
            if (r0 == 0) goto L17
            boolean r1 = r0.isEnum()
            if (r1 == 0) goto L17
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.getObjectWriter(r0, r0, r6)
            return r4
        L17:
            if (r6 == 0) goto L2c
            if (r0 == 0) goto L2c
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L2c
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.google.protobuf.GeneratedMessageV3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            r6 = 0
        L2c:
            if (r6 == 0) goto L37
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r3.cacheFieldBased
            java.lang.Object r0 = r0.get(r4)
            com.alibaba.fastjson2.writer.ObjectWriter r0 = (com.alibaba.fastjson2.writer.ObjectWriter) r0
            goto L3f
        L37:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r3.cache
            java.lang.Object r0 = r0.get(r4)
            com.alibaba.fastjson2.writer.ObjectWriter r0 = (com.alibaba.fastjson2.writer.ObjectWriter) r0
        L3f:
            if (r0 == 0) goto L42
            return r0
        L42:
            if (r6 == 0) goto L55
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L55
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 != 0) goto L55
            goto L72
        L55:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.getObjectWriterModule(r4, r5)
            if (r0 == 0) goto L72
            if (r6 == 0) goto L66
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r5 = r3.cacheFieldBased
            java.lang.Object r4 = r5.put(r4, r0)
            com.alibaba.fastjson2.writer.ObjectWriter r4 = (com.alibaba.fastjson2.writer.ObjectWriter) r4
            goto L6e
        L66:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r5 = r3.cache
            java.lang.Object r4 = r5.put(r4, r0)
            com.alibaba.fastjson2.writer.ObjectWriter r4 = (com.alibaba.fastjson2.writer.ObjectWriter) r4
        L6e:
            if (r4 == 0) goto L71
            return r4
        L71:
            return r0
        L72:
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "android.net.Uri$HierarchicalUri"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L9c
            java.lang.String r2 = "android.net.Uri$StringUri"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L9c
            java.lang.String r2 = "com.alibaba.fastjson.JSONObject"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L97
            java.lang.String r2 = "android.net.Uri$OpaqueUri"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L9c
            goto L9e
        L97:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r5)
            goto L9e
        L9c:
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r0 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE
        L9e:
            if (r0 != 0) goto Lc6
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = r3.creator
            if (r6 == 0) goto La9
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r1 = r1.mask
            goto Lab
        La9:
            r1 = 0
        Lab:
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r0.createObjectWriter(r5, r1, r3)
            if (r6 == 0) goto Lba
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r6 = r3.cacheFieldBased
            java.lang.Object r4 = r6.put(r4, r5)
            com.alibaba.fastjson2.writer.ObjectWriter r4 = (com.alibaba.fastjson2.writer.ObjectWriter) r4
            goto Lc2
        Lba:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r6 = r3.cache
            java.lang.Object r4 = r6.put(r4, r5)
            com.alibaba.fastjson2.writer.ObjectWriter r4 = (com.alibaba.fastjson2.writer.ObjectWriter) r4
        Lc2:
            if (r4 == 0) goto Lc5
            return r4
        Lc5:
            return r5
        Lc6:
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterFromCache(java.lang.reflect.Type r1, java.lang.Class r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto Lb
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r2 = r0.cacheFieldBased
            java.lang.Object r1 = r2.get(r1)
            com.alibaba.fastjson2.writer.ObjectWriter r1 = (com.alibaba.fastjson2.writer.ObjectWriter) r1
            return r1
        Lb:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r2 = r0.cache
            java.lang.Object r1 = r2.get(r1)
            com.alibaba.fastjson2.writer.ObjectWriter r1 = (com.alibaba.fastjson2.writer.ObjectWriter) r1
            return r1
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterModule(java.lang.reflect.Type r19, java.lang.Class r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r1 != r2) goto Lb
            com.alibaba.fastjson2.writer.ObjectWriterImplString r1 = com.alibaba.fastjson2.writer.ObjectWriterImplString.INSTANCE
            return r1
        Lb:
            if (r20 != 0) goto L1a
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L15
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            goto L1c
        L15:
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r1)
            goto L1c
        L1a:
            r3 = r20
        L1c:
            java.lang.String r4 = r3.getName()
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r0.getExternalObjectWriter(r4, r3)
            if (r5 == 0) goto L27
            return r5
        L27:
            java.lang.String r5 = "java.util.regex.Pattern"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L456
            java.lang.String r5 = "net.sf.json.JSONNull"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L456
            java.lang.String r5 = "java.net.Inet6Address"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L456
            java.lang.String r5 = "java.net.Inet4Address"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L456
            java.lang.String r5 = "java.text.SimpleDateFormat"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L456
            java.lang.String r5 = "java.net.InetSocketAddress"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L456
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            r5 = 0
            r6 = 1
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            java.lang.Class<java.util.List> r9 = java.util.List.class
            if (r4 == 0) goto L88
            r4 = r1
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r10 = r4.getRawType()
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            if (r10 == r9) goto L72
            if (r10 != r8) goto L7d
        L72:
            int r1 = r4.length
            if (r1 != r6) goto L7c
            r1 = r4[r5]
            if (r1 != r2) goto L7c
            com.alibaba.fastjson2.writer.ObjectWriterImplListStr r1 = com.alibaba.fastjson2.writer.ObjectWriterImplListStr.INSTANCE
            return r1
        L7c:
            r1 = r10
        L7d:
            boolean r4 = r7.isAssignableFrom(r3)
            if (r4 == 0) goto L88
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r1, r3)
            return r1
        L88:
            java.lang.Class<java.util.LinkedList> r4 = java.util.LinkedList.class
            if (r1 != r4) goto L8f
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE
            return r1
        L8f:
            if (r1 == r8) goto L453
            if (r1 == r9) goto L453
            boolean r4 = r9.isAssignableFrom(r3)
            if (r4 == 0) goto L9b
            goto L453
        L9b:
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto La6
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.INSTANCE
            return r1
        La6:
            boolean r4 = r7.isAssignableFrom(r3)
            if (r4 == 0) goto Lb1
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r3)
            return r1
        Lb1:
            java.lang.Class<java.util.Map$Entry> r4 = java.util.Map.Entry.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto Lc8
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "java.util"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto Lc8
            com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMapEntry.INSTANCE
            return r1
        Lc8:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r1 != r3) goto Lcf
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32 r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32.INSTANCE
            return r1
        Lcf:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r3 = java.util.concurrent.atomic.AtomicInteger.class
            if (r1 != r3) goto Ld6
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicInteger.INSTANCE
            return r1
        Ld6:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            if (r1 != r3) goto Ldd
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8 r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8.INSTANCE
            return r1
        Ldd:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            if (r1 != r3) goto Le4
            com.alibaba.fastjson2.writer.ObjectWriterImplInt16 r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt16.INSTANCE
            return r1
        Le4:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r1 != r3) goto Leb
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64 r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64.INSTANCE
            return r1
        Leb:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r3 = java.util.concurrent.atomic.AtomicLong.class
            if (r1 != r3) goto Lf2
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLong r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLong.INSTANCE
            return r1
        Lf2:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r3 = java.util.concurrent.atomic.AtomicReference.class
            if (r1 != r3) goto Lf9
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicReference.INSTANCE
            return r1
        Lf9:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r1 != r3) goto L100
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r1 = com.alibaba.fastjson2.writer.ObjectWriterImplFloat.INSTANCE
            return r1
        L100:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r1 != r3) goto L107
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r1 = com.alibaba.fastjson2.writer.ObjectWriterImplDouble.INSTANCE
            return r1
        L107:
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            if (r1 != r3) goto L10e
            com.alibaba.fastjson2.writer.ObjectWriterBigInteger r1 = com.alibaba.fastjson2.writer.ObjectWriterBigInteger.INSTANCE
            return r1
        L10e:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r1 != r3) goto L115
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r1 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            return r1
        L115:
            java.lang.Class<java.util.OptionalInt> r3 = java.util.OptionalInt.class
            if (r1 != r3) goto L11c
            com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptionalInt.INSTANCE
            return r1
        L11c:
            java.lang.Class<java.util.OptionalLong> r3 = java.util.OptionalLong.class
            if (r1 != r3) goto L123
            com.alibaba.fastjson2.writer.ObjectWriterImplOptionalLong r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptionalLong.INSTANCE
            return r1
        L123:
            java.lang.Class<java.util.OptionalDouble> r3 = java.util.OptionalDouble.class
            if (r1 != r3) goto L12a
            com.alibaba.fastjson2.writer.ObjectWriterImplOptionalDouble r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptionalDouble.INSTANCE
            return r1
        L12a:
            java.lang.Class<java.util.Optional> r3 = java.util.Optional.class
            if (r1 != r3) goto L131
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptional.INSTANCE
            return r1
        L131:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r1 != r3) goto L138
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolean r1 = com.alibaba.fastjson2.writer.ObjectWriterImplBoolean.INSTANCE
            return r1
        L138:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r3 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r1 != r3) goto L13f
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicBoolean r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicBoolean.INSTANCE
            return r1
        L13f:
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r3 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r1 != r3) goto L146
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicIntegerArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicIntegerArray.INSTANCE
            return r1
        L146:
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r3 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r1 != r3) goto L14d
            com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplAtomicLongArray.INSTANCE
            return r1
        L14d:
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            if (r1 != r3) goto L154
            com.alibaba.fastjson2.writer.ObjectWriterImplCharacter r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCharacter.INSTANCE
            return r1
        L154:
            boolean r3 = r1 instanceof java.lang.Class
            r4 = 0
            if (r3 == 0) goto L452
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class<java.util.concurrent.TimeUnit> r3 = java.util.concurrent.TimeUnit.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L170
            com.alibaba.fastjson2.writer.ObjectWriterImplEnum r7 = new com.alibaba.fastjson2.writer.ObjectWriterImplEnum
            r11 = 0
            r12 = 0
            r8 = 0
            java.lang.Class<java.util.concurrent.TimeUnit> r9 = java.util.concurrent.TimeUnit.class
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        L170:
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L17f
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r0.createEnumWriter(r1)
            if (r3 == 0) goto L17f
            return r3
        L17f:
            java.lang.Class<com.alibaba.fastjson2.JSONPath> r3 = com.alibaba.fastjson2.JSONPath.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L18a
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r1 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE
            return r1
        L18a:
            java.lang.Class<boolean[]> r3 = boolean[].class
            if (r1 != r3) goto L191
            com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplBoolValueArray.INSTANCE
            return r1
        L191:
            java.lang.Class<char[]> r3 = char[].class
            if (r1 != r3) goto L198
            com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCharValueArray.INSTANCE
            return r1
        L198:
            java.lang.Class<java.lang.StringBuffer> r3 = java.lang.StringBuffer.class
            if (r1 == r3) goto L44f
            java.lang.Class<java.lang.StringBuilder> r3 = java.lang.StringBuilder.class
            if (r1 != r3) goto L1a2
            goto L44f
        L1a2:
            java.lang.Class<byte[]> r3 = byte[].class
            if (r1 != r3) goto L1a9
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8ValueArray.INSTANCE
            return r1
        L1a9:
            java.lang.Class<short[]> r3 = short[].class
            if (r1 != r3) goto L1b0
            com.alibaba.fastjson2.writer.ObjectWriterImplInt16ValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt16ValueArray.INSTANCE
            return r1
        L1b0:
            java.lang.Class<int[]> r3 = int[].class
            if (r1 != r3) goto L1b7
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32ValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32ValueArray.INSTANCE
            return r1
        L1b7:
            java.lang.Class<long[]> r3 = long[].class
            if (r1 != r3) goto L1be
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64ValueArray.INSTANCE
            return r1
        L1be:
            java.lang.Class<float[]> r3 = float[].class
            if (r1 != r3) goto L1c5
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.INSTANCE
            return r1
        L1c5:
            java.lang.Class<double[]> r3 = double[].class
            if (r1 != r3) goto L1cc
            com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray.INSTANCE
            return r1
        L1cc:
            java.lang.Class<java.lang.Byte[]> r3 = java.lang.Byte[].class
            if (r1 != r3) goto L1d3
            com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt8Array.INSTANCE
            return r1
        L1d3:
            java.lang.Class<java.lang.Integer[]> r3 = java.lang.Integer[].class
            if (r1 != r3) goto L1da
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32Array r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32Array.INSTANCE
            return r1
        L1da:
            java.lang.Class<java.lang.Long[]> r3 = java.lang.Long[].class
            if (r1 != r3) goto L1e1
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64Array r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64Array.INSTANCE
            return r1
        L1e1:
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            if (r3 != r1) goto L1e8
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.INSTANCE
            return r1
        L1e8:
            java.lang.Class<java.math.BigDecimal[]> r3 = java.math.BigDecimal[].class
            if (r3 != r1) goto L1ef
            com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray r1 = com.alibaba.fastjson2.writer.ObjectWriterImpDecimalArray.INSTANCE
            return r1
        L1ef:
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            boolean r7 = r3.isAssignableFrom(r1)
            if (r7 == 0) goto L216
            if (r1 != r3) goto L1fc
            com.alibaba.fastjson2.writer.ObjectWriterArray r1 = com.alibaba.fastjson2.writer.ObjectWriterArray.INSTANCE
            return r1
        L1fc:
            java.lang.Class r1 = r1.getComponentType()
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isFinal(r2)
            if (r2 == 0) goto L210
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            r2.<init>(r1, r4)
            return r2
        L210:
            com.alibaba.fastjson2.writer.ObjectWriterArray r2 = new com.alibaba.fastjson2.writer.ObjectWriterArray
            r2.<init>(r1)
            return r2
        L216:
            java.lang.Class<java.util.UUID> r3 = java.util.UUID.class
            if (r1 != r3) goto L21d
            com.alibaba.fastjson2.writer.ObjectWriterImplUUID r1 = com.alibaba.fastjson2.writer.ObjectWriterImplUUID.INSTANCE
            return r1
        L21d:
            java.lang.Class<java.util.Locale> r3 = java.util.Locale.class
            if (r1 != r3) goto L224
            com.alibaba.fastjson2.writer.ObjectWriterImplLocale r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocale.INSTANCE
            return r1
        L224:
            java.lang.Class<java.util.Currency> r3 = java.util.Currency.class
            if (r1 != r3) goto L22b
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.INSTANCE
            return r1
        L22b:
            java.lang.Class<java.util.TimeZone> r3 = java.util.TimeZone.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L236
            com.alibaba.fastjson2.writer.ObjectWriterImplTimeZone r1 = com.alibaba.fastjson2.writer.ObjectWriterImplTimeZone.INSTANCE
            return r1
        L236:
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r1 == r3) goto L44c
            java.lang.Class<java.net.URL> r3 = java.net.URL.class
            if (r1 == r3) goto L44c
            java.lang.Class<java.io.File> r3 = java.io.File.class
            if (r1 == r3) goto L44c
            java.lang.Class<java.time.ZoneId> r3 = java.time.ZoneId.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L44c
            java.lang.Class<java.nio.charset.Charset> r3 = java.nio.charset.Charset.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L254
            goto L44c
        L254:
            java.lang.String r3 = r1.getName()
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r0.getExternalObjectWriter(r3, r1)
            if (r3 == 0) goto L25f
            return r3
        L25f:
            com.alibaba.fastjson2.codec.BeanInfo r3 = new com.alibaba.fastjson2.codec.BeanInfo
            r3.<init>()
            java.lang.Class r7 = r0.getMixIn(r1)
            if (r7 == 0) goto L26d
            r0.getBeanInfo(r3, r7)
        L26d:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            boolean r7 = r7.isAssignableFrom(r1)
            if (r7 == 0) goto L28b
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L281
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L27e
            goto L281
        L27e:
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r1 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE
            return r1
        L281:
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplDate
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L28b:
            java.lang.Class<java.util.Calendar> r7 = java.util.Calendar.class
            boolean r7 = r7.isAssignableFrom(r1)
            if (r7 == 0) goto L2a9
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L29f
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L29c
            goto L29f
        L29c:
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCalendar.INSTANCE
            return r1
        L29f:
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplCalendar
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L2a9:
            java.lang.Class<java.time.ZonedDateTime> r7 = java.time.ZonedDateTime.class
            if (r7 != r1) goto L2c3
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L2b9
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L2b6
            goto L2b9
        L2b6:
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime.INSTANCE
            return r1
        L2b9:
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L2c3:
            java.lang.Class<java.time.OffsetDateTime> r7 = java.time.OffsetDateTime.class
            if (r7 != r1) goto L2d0
            java.lang.String r1 = r3.format
            java.util.Locale r2 = r3.locale
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime.of(r1, r2)
            return r1
        L2d0:
            java.lang.Class<java.time.LocalDateTime> r7 = java.time.LocalDateTime.class
            if (r7 != r1) goto L2ea
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L2e0
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L2dd
            goto L2e0
        L2dd:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime.INSTANCE
            return r1
        L2e0:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L2ea:
            java.lang.Class<java.time.LocalDate> r7 = java.time.LocalDate.class
            if (r7 != r1) goto L2f7
            java.lang.String r1 = r3.format
            java.util.Locale r2 = r3.locale
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate.of(r1, r2)
            return r1
        L2f7:
            java.lang.Class<java.time.LocalTime> r7 = java.time.LocalTime.class
            if (r7 != r1) goto L311
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L307
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L304
            goto L307
        L304:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime.INSTANCE
            return r1
        L307:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L311:
            java.lang.Class<java.time.OffsetTime> r7 = java.time.OffsetTime.class
            if (r7 != r1) goto L32b
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L321
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L31e
            goto L321
        L31e:
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime.INSTANCE
            return r1
        L321:
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplOffsetTime
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L32b:
            java.lang.Class<java.time.Instant> r7 = java.time.Instant.class
            if (r7 != r1) goto L345
            java.lang.String r1 = r3.format
            if (r1 != 0) goto L33b
            java.util.Locale r1 = r3.locale
            if (r1 == 0) goto L338
            goto L33b
        L338:
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInstant.INSTANCE
            return r1
        L33b:
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplInstant
            java.lang.String r2 = r3.format
            java.util.Locale r3 = r3.locale
            r1.<init>(r2, r3)
            return r1
        L345:
            java.lang.Class<java.time.Duration> r3 = java.time.Duration.class
            if (r3 == r1) goto L449
            java.lang.Class<java.time.Period> r3 = java.time.Period.class
            if (r3 != r1) goto L34f
            goto L449
        L34f:
            java.lang.Class<java.lang.StackTraceElement> r3 = java.lang.StackTraceElement.class
            r7 = 4
            if (r3 != r1) goto L39f
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.STACK_TRACE_ELEMENT_WRITER
            if (r1 != 0) goto L39c
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r8 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r3 = 2
            r1.<init>(r3)
            java.lang.String r3 = "fileName"
            com.alibaba.fastjson2.writer.FieldWriter r1 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r3, r2, r1)
            ae.a r3 = new ae.a
            r3.<init>(r7)
            java.lang.String r4 = "lineNumber"
            com.alibaba.fastjson2.writer.FieldWriter r3 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r4, r3)
            com.alibaba.fastjson2.writer.b r4 = new com.alibaba.fastjson2.writer.b
            r5 = 5
            r4.<init>(r5)
            java.lang.String r5 = "className"
            com.alibaba.fastjson2.writer.FieldWriter r4 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r5, r2, r4)
            com.alibaba.fastjson2.writer.b r5 = new com.alibaba.fastjson2.writer.b
            r6 = 6
            r5.<init>(r6)
            java.lang.String r6 = "methodName"
            com.alibaba.fastjson2.writer.FieldWriter r2 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r6, r2, r5)
            com.alibaba.fastjson2.writer.FieldWriter[] r1 = new com.alibaba.fastjson2.writer.FieldWriter[]{r1, r3, r4, r2}
            java.util.List r14 = java.util.Arrays.asList(r1)
            java.lang.Class<java.lang.StackTraceElement> r9 = java.lang.StackTraceElement.class
            r10 = 0
            r11 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r14)
            com.alibaba.fastjson2.writer.ObjectWriterProvider.STACK_TRACE_ELEMENT_WRITER = r8
        L39c:
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.STACK_TRACE_ELEMENT_WRITER
            return r1
        L39f:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            if (r3 != r1) goto L3a6
            com.alibaba.fastjson2.writer.ObjectWriterImplClass r1 = com.alibaba.fastjson2.writer.ObjectWriterImplClass.INSTANCE
            return r1
        L3a6:
            java.lang.Class<java.lang.reflect.Method> r8 = java.lang.reflect.Method.class
            java.lang.String r9 = "name"
            java.lang.String r10 = "declaringClass"
            if (r8 != r1) goto L3e6
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r11 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r4 = 7
            r1.<init>(r4)
            com.alibaba.fastjson2.writer.FieldWriter r1 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r10, r3, r1)
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 8
            r3.<init>(r4)
            com.alibaba.fastjson2.writer.FieldWriter r2 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r9, r2, r3)
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 9
            r3.<init>(r4)
            java.lang.String r4 = "parameterTypes"
            java.lang.Class<java.lang.Class[]> r5 = java.lang.Class[].class
            com.alibaba.fastjson2.writer.FieldWriter r3 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r4, r5, r3)
            com.alibaba.fastjson2.writer.FieldWriter[] r1 = new com.alibaba.fastjson2.writer.FieldWriter[]{r1, r2, r3}
            java.util.List r17 = java.util.Arrays.asList(r1)
            java.lang.Class<java.lang.reflect.Method> r12 = java.lang.reflect.Method.class
            r13 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r17)
            return r11
        L3e6:
            java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
            if (r8 != r1) goto L412
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r11 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            ae.d r1 = new ae.d
            r4 = 29
            r1.<init>(r4)
            com.alibaba.fastjson2.writer.FieldWriter r1 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r10, r3, r1)
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r3.<init>(r5)
            com.alibaba.fastjson2.writer.FieldWriter r2 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r9, r2, r3)
            com.alibaba.fastjson2.writer.FieldWriter[] r1 = new com.alibaba.fastjson2.writer.FieldWriter[]{r1, r2}
            java.util.List r17 = java.util.Arrays.asList(r1)
            java.lang.Class<java.lang.reflect.Method> r12 = java.lang.reflect.Method.class
            r13 = 0
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r17)
            return r11
        L412:
            java.lang.Class<java.lang.reflect.ParameterizedType> r2 = java.lang.reflect.ParameterizedType.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L452
            com.alibaba.fastjson2.writer.b r1 = new com.alibaba.fastjson2.writer.b
            r1.<init>(r6)
            java.lang.String r3 = "actualTypeArguments"
            java.lang.Class<java.lang.reflect.Type[]> r4 = java.lang.reflect.Type[].class
            com.alibaba.fastjson2.writer.FieldWriter r1 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r3, r4, r1)
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 3
            r3.<init>(r4)
            java.lang.String r4 = "ownerType"
            java.lang.Class<java.lang.reflect.Type> r5 = java.lang.reflect.Type.class
            com.alibaba.fastjson2.writer.FieldWriter r3 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r4, r5, r3)
            com.alibaba.fastjson2.writer.b r4 = new com.alibaba.fastjson2.writer.b
            r4.<init>(r7)
            java.lang.String r6 = "rawType"
            com.alibaba.fastjson2.writer.FieldWriter r4 = com.alibaba.fastjson2.writer.ObjectWriters.fieldWriter(r6, r5, r4)
            com.alibaba.fastjson2.writer.FieldWriter[] r1 = new com.alibaba.fastjson2.writer.FieldWriter[]{r1, r3, r4}
            com.alibaba.fastjson2.writer.ObjectWriter r1 = com.alibaba.fastjson2.writer.ObjectWriters.objectWriter(r2, r1)
            return r1
        L449:
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r1 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE
            return r1
        L44c:
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r1 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE
            return r1
        L44f:
            com.alibaba.fastjson2.writer.ObjectWriterImplToString r1 = com.alibaba.fastjson2.writer.ObjectWriterImplToString.INSTANCE
            return r1
        L452:
            return r4
        L453:
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE
            return r1
        L456:
            com.alibaba.fastjson2.writer.ObjectWriterMisc r1 = com.alibaba.fastjson2.writer.ObjectWriterMisc.INSTANCE
            return r1
    }

    public void mixIn(java.lang.Class r2, java.lang.Class r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            if (r3 != 0) goto L8
            r0.remove(r2)
            goto Lb
        L8:
            r0.put(r2, r3)
        Lb:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r3 = r1.cache
            r3.remove(r2)
            return
    }

    public com.alibaba.fastjson2.writer.ObjectWriter register(java.lang.reflect.Type r2, com.alibaba.fastjson2.writer.ObjectWriter r3) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.register(r2, r3, r0)
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter register(java.lang.reflect.Type r5, com.alibaba.fastjson2.writer.ObjectWriter r6, boolean r7) {
            r4 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L1d
            if (r6 == 0) goto L14
            com.alibaba.fastjson2.writer.ObjectWriterImplInt32 r0 = com.alibaba.fastjson2.writer.ObjectWriterImplInt32.INSTANCE
            if (r6 != r0) goto Lb
            goto L14
        Lb:
            long r0 = r4.userDefineMask
            r2 = 2
            long r0 = r0 | r2
            r4.userDefineMask = r0
            goto L86
        L14:
            long r0 = r4.userDefineMask
            r2 = -3
            long r0 = r0 & r2
            r4.userDefineMask = r0
            goto L86
        L1d:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r5 == r0) goto L70
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r5 != r0) goto L26
            goto L70
        L26:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r5 != r0) goto L41
            if (r6 == 0) goto L39
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r0 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            if (r6 != r0) goto L31
            goto L39
        L31:
            long r0 = r4.userDefineMask
            r2 = 8
            long r0 = r0 | r2
            r4.userDefineMask = r0
            goto L86
        L39:
            long r0 = r4.userDefineMask
            r2 = -9
            long r0 = r0 & r2
            r4.userDefineMask = r0
            goto L86
        L41:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r5 != r0) goto L5c
            if (r6 == 0) goto L54
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r0 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE
            if (r6 != r0) goto L4c
            goto L54
        L4c:
            long r0 = r4.userDefineMask
            r2 = 16
            long r0 = r0 | r2
            r4.userDefineMask = r0
            goto L86
        L54:
            long r0 = r4.userDefineMask
            r2 = -17
            long r0 = r0 & r2
            r4.userDefineMask = r0
            goto L86
        L5c:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            if (r5 != r0) goto L86
            long r0 = r4.userDefineMask
            if (r6 != 0) goto L6a
            r2 = -33
            long r0 = r0 & r2
            r4.userDefineMask = r0
            goto L86
        L6a:
            r2 = 32
            long r0 = r0 | r2
            r4.userDefineMask = r0
            goto L86
        L70:
            if (r6 == 0) goto L7f
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64 r0 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64.INSTANCE
            if (r6 != r0) goto L77
            goto L7f
        L77:
            long r0 = r4.userDefineMask
            r2 = 4
            long r0 = r0 | r2
            r4.userDefineMask = r0
            goto L86
        L7f:
            long r0 = r4.userDefineMask
            r2 = -5
            long r0 = r0 & r2
            r4.userDefineMask = r0
        L86:
            if (r6 != 0) goto L9c
            if (r7 == 0) goto L93
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r6 = r4.cacheFieldBased
            java.lang.Object r5 = r6.remove(r5)
            com.alibaba.fastjson2.writer.ObjectWriter r5 = (com.alibaba.fastjson2.writer.ObjectWriter) r5
            return r5
        L93:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r6 = r4.cache
            java.lang.Object r5 = r6.remove(r5)
            com.alibaba.fastjson2.writer.ObjectWriter r5 = (com.alibaba.fastjson2.writer.ObjectWriter) r5
            return r5
        L9c:
            if (r7 == 0) goto La7
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r7 = r4.cacheFieldBased
            java.lang.Object r5 = r7.put(r5, r6)
            com.alibaba.fastjson2.writer.ObjectWriter r5 = (com.alibaba.fastjson2.writer.ObjectWriter) r5
            return r5
        La7:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r7 = r4.cache
            java.lang.Object r5 = r7.put(r5, r6)
            com.alibaba.fastjson2.writer.ObjectWriter r5 = (com.alibaba.fastjson2.writer.ObjectWriter) r5
            return r5
    }

    public com.alibaba.fastjson2.writer.ObjectWriter registerIfAbsent(java.lang.reflect.Type r3, com.alibaba.fastjson2.writer.ObjectWriter r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r2.cache
            java.lang.Object r0 = r0.get(r3)
            com.alibaba.fastjson2.writer.ObjectWriter r0 = (com.alibaba.fastjson2.writer.ObjectWriter) r0
            if (r0 != 0) goto Lf
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r1 = r2.cache
            r1.put(r3, r4)
        Lf:
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter unregister(java.lang.reflect.Type r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cache
            java.lang.Object r2 = r0.remove(r2)
            com.alibaba.fastjson2.writer.ObjectWriter r2 = (com.alibaba.fastjson2.writer.ObjectWriter) r2
            return r2
    }

    public boolean unregister(java.lang.reflect.Type r2, com.alibaba.fastjson2.writer.ObjectWriter r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r0 = r1.cache
            boolean r2 = r0.remove(r2, r3)
            return r2
    }
}
