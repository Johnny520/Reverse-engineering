package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldWriter<T> implements java.lang.Comparable {
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriter, com.alibaba.fastjson2.writer.ObjectWriter> initObjectWriterUpdater = null;
    final boolean backReference;
    public final java.text.DecimalFormat decimalFormat;
    public final long features;
    public final java.lang.reflect.Field field;
    public final java.lang.Class fieldClass;
    final boolean fieldClassSerializable;
    public final java.lang.String fieldName;
    protected final long fieldOffset;
    public final java.lang.reflect.Type fieldType;
    public final java.lang.String format;
    final long hashCode;
    volatile com.alibaba.fastjson2.writer.ObjectWriter initObjectWriter;
    public final java.lang.String label;
    final boolean managedReference;
    public final java.lang.reflect.Method method;
    final byte[] nameJSONB;
    long nameSymbolCache;
    final char[] nameWithColonUTF16;
    final byte[] nameWithColonUTF8;
    public final int ordinal;
    transient com.alibaba.fastjson2.JSONWriter.Path path;
    protected final boolean primitive;
    final boolean raw;
    final com.alibaba.fastjson2.JSONWriter.Path rootParentPath;
    final boolean symbol;
    final boolean trim;

    static {
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r0 = com.alibaba.fastjson2.writer.ObjectWriter.class
            java.lang.String r1 = "initObjectWriter"
            java.lang.Class<com.alibaba.fastjson2.writer.FieldWriter> r2 = com.alibaba.fastjson2.writer.FieldWriter.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            com.alibaba.fastjson2.writer.FieldWriter.initObjectWriterUpdater = r0
            return
    }

    public FieldWriter(java.lang.String r6, int r7, long r8, java.lang.String r10, java.lang.String r11, java.lang.reflect.Type r12, java.lang.Class r13, java.lang.reflect.Field r14, java.lang.reflect.Method r15) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "string"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L14
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r13 == r0) goto L14
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r0.mask
            long r8 = r8 | r0
        L14:
            r5.fieldName = r6
            r5.ordinal = r7
            r5.format = r10
            r5.label = r11
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)
            r5.hashCode = r0
            r5.features = r8
            java.lang.reflect.Type r7 = com.alibaba.fastjson2.util.TypeUtils.intern(r12)
            r5.fieldType = r7
            r5.fieldClass = r13
            r7 = 0
            r11 = 1
            if (r13 == 0) goto L44
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r13)
            if (r12 != 0) goto L42
            int r12 = r13.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isFinal(r12)
            if (r12 != 0) goto L44
        L42:
            r12 = r11
            goto L45
        L44:
            r12 = r7
        L45:
            r5.fieldClassSerializable = r12
            r5.field = r14
            r5.method = r15
            boolean r12 = r13.isPrimitive()
            r5.primitive = r12
            byte[] r12 = com.alibaba.fastjson2.JSONB.toBytes(r6)
            r5.nameJSONB = r12
            if (r10 == 0) goto L87
            java.lang.Class r12 = java.lang.Float.TYPE
            if (r13 == r12) goto L81
            java.lang.Class<float[]> r12 = float[].class
            if (r13 == r12) goto L81
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            if (r13 == r12) goto L81
            java.lang.Class<java.lang.Float[]> r12 = java.lang.Float[].class
            if (r13 == r12) goto L81
            java.lang.Class r12 = java.lang.Double.TYPE
            if (r13 == r12) goto L81
            java.lang.Class<double[]> r12 = double[].class
            if (r13 == r12) goto L81
            java.lang.Class<java.lang.Double> r12 = java.lang.Double.class
            if (r13 == r12) goto L81
            java.lang.Class<java.lang.Double[]> r12 = java.lang.Double[].class
            if (r13 == r12) goto L81
            java.lang.Class<java.math.BigDecimal> r12 = java.math.BigDecimal.class
            if (r13 == r12) goto L81
            java.lang.Class<java.math.BigDecimal[]> r12 = java.math.BigDecimal[].class
            if (r13 != r12) goto L87
        L81:
            java.text.DecimalFormat r12 = new java.text.DecimalFormat
            r12.<init>(r10)
            goto L88
        L87:
            r12 = 0
        L88:
            r5.decimalFormat = r12
            if (r14 == 0) goto L93
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r12 = r12.objectFieldOffset(r14)
            goto L95
        L93:
            r12 = -1
        L95:
            r5.fieldOffset = r12
            java.lang.String r12 = "symbol"
            boolean r12 = r12.equals(r10)
            r5.symbol = r12
            java.lang.String r12 = "trim"
            boolean r10 = r12.equals(r10)
            r5.trim = r10
            r12 = 1125899906842624(0x4000000000000, double:5.562684646268003E-309)
            long r12 = r12 & r8
            r14 = 0
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto Lb2
            r10 = r11
            goto Lb3
        Lb2:
            r10 = r7
        Lb3:
            r5.raw = r10
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r12 = r10.mask
            long r12 = r12 & r8
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto Lc0
            r10 = r11
            goto Lc1
        Lc0:
            r10 = r7
        Lc1:
            r5.managedReference = r10
            r12 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r8 = r8 & r12
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 == 0) goto Lcc
            r8 = r11
            goto Lcd
        Lcc:
            r8 = r7
        Lcd:
            r5.backReference = r8
            com.alibaba.fastjson2.JSONWriter$Path r8 = new com.alibaba.fastjson2.JSONWriter$Path
            com.alibaba.fastjson2.JSONWriter$Path r9 = com.alibaba.fastjson2.JSONWriter.Path.ROOT
            r8.<init>(r9, r6)
            r5.rootParentPath = r8
            int r8 = r6.length()
            int r9 = r8 + 3
            r10 = r7
            r12 = r9
        Le0:
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = 127(0x7f, float:1.78E-43)
            if (r10 >= r8) goto Lf9
            char r15 = r6.charAt(r10)
            if (r15 < r11) goto Lef
            if (r15 > r14) goto Lef
            goto Lf6
        Lef:
            if (r15 <= r13) goto Lf4
            int r12 = r12 + 2
            goto Lf6
        Lf4:
            int r12 = r12 + 1
        Lf6:
            int r10 = r10 + 1
            goto Le0
        Lf9:
            byte[] r10 = new byte[r12]
            r12 = 34
            r10[r7] = r12
            r15 = r7
            r0 = r11
        L101:
            if (r15 >= r8) goto L14b
            char r1 = r6.charAt(r15)
            if (r1 < r11) goto L112
            if (r1 > r14) goto L112
            int r2 = r0 + 1
            byte r1 = (byte) r1
            r10[r0] = r1
            r0 = r2
            goto L148
        L112:
            if (r1 <= r13) goto L134
            int r2 = r0 + 1
            int r3 = r1 >> 12
            r3 = r3 & 15
            r3 = r3 | 224(0xe0, float:3.14E-43)
            byte r3 = (byte) r3
            r10[r0] = r3
            int r3 = r0 + 2
            int r4 = r1 >> 6
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r10[r2] = r4
            int r0 = r0 + 3
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r10[r3] = r1
            goto L148
        L134:
            int r2 = r0 + 1
            int r3 = r1 >> 6
            r3 = r3 & 31
            r3 = r3 | 192(0xc0, float:2.69E-43)
            byte r3 = (byte) r3
            r10[r0] = r3
            int r0 = r0 + 2
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r10[r2] = r1
        L148:
            int r15 = r15 + 1
            goto L101
        L14b:
            int r13 = r0 + 1
            r10[r0] = r12
            r14 = 58
            r10[r13] = r14
            r5.nameWithColonUTF8 = r10
            char[] r9 = new char[r9]
            r9[r7] = r12
            int r10 = r6.length()
            r6.getChars(r7, r10, r9, r11)
            int r6 = r8 + 1
            r9[r6] = r12
            int r8 = r8 + 2
            r9[r8] = r14
            r5.nameWithColonUTF16 = r9
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.String r3, java.util.Locale r4, java.lang.Class r5) {
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L18
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 == 0) goto L13
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r1, r5)
            return r1
        L13:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r5)
            return r1
        L18:
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L32
            if (r3 == 0) goto L2f
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L29
            goto L2f
        L29:
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplCalendar
            r1.<init>(r3, r4)
            return r1
        L2f:
            com.alibaba.fastjson2.writer.ObjectWriterImplCalendar r1 = com.alibaba.fastjson2.writer.ObjectWriterImplCalendar.INSTANCE
            return r1
        L32:
            java.lang.Class<java.time.ZonedDateTime> r1 = java.time.ZonedDateTime.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L4c
            if (r3 == 0) goto L49
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L43
            goto L49
        L43:
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime
            r1.<init>(r3, r4)
            return r1
        L49:
            com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplZonedDateTime.INSTANCE
            return r1
        L4c:
            java.lang.Class<java.time.OffsetDateTime> r1 = java.time.OffsetDateTime.class
            boolean r1 = r1.isAssignableFrom(r5)
            if (r1 == 0) goto L65
            if (r3 == 0) goto L62
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L5d
            goto L62
        L5d:
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime.of(r3, r4)
            return r1
        L62:
            com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOffsetDateTime.INSTANCE
            return r1
        L65:
            java.lang.Class<java.time.LocalDateTime> r1 = java.time.LocalDateTime.class
            boolean r2 = r1.isAssignableFrom(r5)
            if (r2 == 0) goto L8e
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectWriterProvider()
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            if (r1 == 0) goto L7c
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r2 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime.INSTANCE
            if (r1 == r2) goto L7c
            return r1
        L7c:
            if (r3 == 0) goto L8b
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L85
            goto L8b
        L85:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime
            r1.<init>(r3, r4)
            return r1
        L8b:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDateTime.INSTANCE
            return r1
        L8e:
            java.lang.Class<java.time.LocalDate> r1 = java.time.LocalDate.class
            boolean r2 = r1.isAssignableFrom(r5)
            if (r2 == 0) goto Laa
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectWriterProvider()
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            if (r1 == 0) goto La5
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r2 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate.INSTANCE
            if (r1 == r2) goto La5
            return r1
        La5:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalDate.of(r3, r4)
            return r1
        Laa:
            java.lang.Class<java.time.LocalTime> r1 = java.time.LocalTime.class
            boolean r2 = r1.isAssignableFrom(r5)
            if (r2 == 0) goto Ld3
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectWriterProvider()
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            if (r1 == 0) goto Lc1
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r2 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime.INSTANCE
            if (r1 == r2) goto Lc1
            return r1
        Lc1:
            if (r3 == 0) goto Ld0
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lca
            goto Ld0
        Lca:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime
            r1.<init>(r3, r4)
            return r1
        Ld0:
            com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime r1 = com.alibaba.fastjson2.writer.ObjectWriterImplLocalTime.INSTANCE
            return r1
        Ld3:
            java.lang.Class<java.time.Instant> r1 = java.time.Instant.class
            if (r1 != r5) goto Le9
            if (r3 == 0) goto Le6
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Le0
            goto Le6
        Le0:
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplInstant
            r1.<init>(r3, r4)
            return r1
        Le6:
            com.alibaba.fastjson2.writer.ObjectWriterImplInstant r1 = com.alibaba.fastjson2.writer.ObjectWriterImplInstant.INSTANCE
            return r1
        Le9:
            r1 = 0
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            if (r2 != r5) goto L105
            if (r3 == 0) goto L102
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto Lf7
            goto L102
        Lf7:
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            r4.<init>(r3)
            r2.<init>(r4, r1)
            return r2
        L102:
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r1 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            return r1
        L105:
            java.lang.Class<java.math.BigDecimal[]> r0 = java.math.BigDecimal[].class
            if (r0 != r5) goto L123
            if (r3 == 0) goto L11d
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L112
            goto L11d
        L112:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r1 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            r4.<init>(r3)
            r1.<init>(r2, r4)
            return r1
        L11d:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r3 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            r3.<init>(r2, r1)
            return r3
        L123:
            java.lang.Class<java.util.Optional> r2 = java.util.Optional.class
            if (r2 != r5) goto L12c
            com.alibaba.fastjson2.writer.ObjectWriterImplOptional r1 = com.alibaba.fastjson2.writer.ObjectWriterImplOptional.of(r3, r4)
            return r1
        L12c:
            java.lang.String r2 = r5.getName()
            java.lang.String r5 = "java.sql.Date"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L154
            java.lang.String r4 = "java.sql.Time"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L14f
            java.lang.String r4 = "java.sql.Timestamp"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L149
            return r1
        L149:
            com.alibaba.fastjson2.util.JdbcSupport$TimestampWriter r1 = new com.alibaba.fastjson2.util.JdbcSupport$TimestampWriter
            r1.<init>(r3)
            return r1
        L14f:
            com.alibaba.fastjson2.util.JdbcSupport$TimeWriter r1 = com.alibaba.fastjson2.util.JdbcSupport.TimeWriter.of(r3)
            return r1
        L154:
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplDate
            r1.<init>(r3, r4)
            return r1
    }

    private boolean writeFieldNameSymbol(com.alibaba.fastjson2.JSONWriter r6, com.alibaba.fastjson2.SymbolTable r7) {
            r5 = this;
            int r0 = java.lang.System.identityHashCode(r7)
            long r1 = r5.nameSymbolCache
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 32
            if (r3 != 0) goto L1c
            long r1 = r5.hashCode
            int r7 = r7.getOrdinalByHashCode(r1)
            long r1 = (long) r7
            long r1 = r1 << r4
            long r3 = (long) r0
            long r0 = r1 | r3
            r5.nameSymbolCache = r0
            goto L30
        L1c:
            int r3 = (int) r1
            if (r3 != r0) goto L23
            long r0 = r1 >> r4
            int r7 = (int) r0
            goto L30
        L23:
            long r1 = r5.hashCode
            int r7 = r7.getOrdinalByHashCode(r1)
            long r1 = (long) r7
            long r1 = r1 << r4
            long r3 = (long) r0
            long r0 = r1 | r3
            r5.nameSymbolCache = r0
        L30:
            r0 = -1
            if (r7 == r0) goto L39
            int r7 = -r7
            r6.writeSymbol(r7)
            r6 = 1
            return r6
        L39:
            r6 = 0
            return r6
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r15) {
            r14 = this;
            com.alibaba.fastjson2.writer.FieldWriter r15 = (com.alibaba.fastjson2.writer.FieldWriter) r15
            int r0 = r14.ordinal
            int r1 = r15.ordinal
            r2 = -1
            if (r0 >= r1) goto La
            return r2
        La:
            r3 = 1
            if (r0 <= r1) goto Le
            return r3
        Le:
            java.lang.String r0 = r14.fieldName
            java.lang.String r1 = r15.fieldName
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1a
            goto L1ce
        L1a:
            java.lang.reflect.Method r1 = r14.method
            if (r1 == 0) goto L30
            java.lang.reflect.Field r1 = r14.field
            if (r1 == 0) goto L2d
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2d
            goto L30
        L2d:
            java.lang.reflect.Method r1 = r14.method
            goto L32
        L30:
            java.lang.reflect.Field r1 = r14.field
        L32:
            java.lang.reflect.Method r4 = r15.method
            if (r4 == 0) goto L48
            java.lang.reflect.Field r4 = r15.field
            if (r4 == 0) goto L45
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isPublic(r4)
            if (r4 == 0) goto L45
            goto L48
        L45:
            java.lang.reflect.Method r4 = r15.method
            goto L4a
        L48:
            java.lang.reflect.Field r4 = r15.field
        L4a:
            r5 = 0
            if (r1 == 0) goto Lad
            if (r4 == 0) goto Lad
            java.lang.Class r6 = r4.getDeclaringClass()
            java.lang.Class r7 = r1.getDeclaringClass()
            if (r7 == r6) goto L67
            boolean r8 = r7.isAssignableFrom(r6)
            if (r8 == 0) goto L60
            return r3
        L60:
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L67
            return r2
        L67:
            boolean r6 = r1 instanceof java.lang.reflect.Field
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r7 = com.alibaba.fastjson2.annotation.JSONField.class
            if (r6 == 0) goto L77
            r6 = r1
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.annotation.Annotation r6 = r6.getAnnotation(r7)
            com.alibaba.fastjson2.annotation.JSONField r6 = (com.alibaba.fastjson2.annotation.JSONField) r6
            goto L86
        L77:
            boolean r6 = r1 instanceof java.lang.reflect.Method
            if (r6 == 0) goto L85
            r6 = r1
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.annotation.Annotation r6 = r6.getAnnotation(r7)
            com.alibaba.fastjson2.annotation.JSONField r6 = (com.alibaba.fastjson2.annotation.JSONField) r6
            goto L86
        L85:
            r6 = r5
        L86:
            boolean r8 = r4 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L94
            r8 = r4
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.annotation.Annotation r7 = r8.getAnnotation(r7)
            com.alibaba.fastjson2.annotation.JSONField r7 = (com.alibaba.fastjson2.annotation.JSONField) r7
            goto La3
        L94:
            boolean r8 = r1 instanceof java.lang.reflect.Method
            if (r8 == 0) goto La2
            r8 = r4
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.annotation.Annotation r7 = r8.getAnnotation(r7)
            com.alibaba.fastjson2.annotation.JSONField r7 = (com.alibaba.fastjson2.annotation.JSONField) r7
            goto La3
        La2:
            r7 = r5
        La3:
            if (r6 == 0) goto La8
            if (r7 != 0) goto La8
            return r2
        La8:
            if (r6 != 0) goto Lad
            if (r7 == 0) goto Lad
            return r3
        Lad:
            boolean r6 = r1 instanceof java.lang.reflect.Field
            if (r6 == 0) goto Lc6
            boolean r6 = r4 instanceof java.lang.reflect.Method
            if (r6 == 0) goto Lc6
            r6 = r1
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            r7 = r4
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r7 = r7.getReturnType()
            if (r6 != r7) goto Lc6
            return r2
        Lc6:
            boolean r6 = r1 instanceof java.lang.reflect.Method
            if (r6 == 0) goto Ldf
            boolean r7 = r4 instanceof java.lang.reflect.Field
            if (r7 == 0) goto Ldf
            r7 = r1
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r7 = r7.getReturnType()
            r8 = r4
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            java.lang.Class r8 = r8.getType()
            if (r7 != r8) goto Ldf
            return r3
        Ldf:
            java.lang.Class r7 = r15.fieldClass
            java.lang.Class r8 = r14.fieldClass
            if (r8 == r7) goto Lf7
            if (r8 == 0) goto Lf7
            if (r7 == 0) goto Lf7
            boolean r9 = r8.isAssignableFrom(r7)
            if (r9 == 0) goto Lf0
            return r3
        Lf0:
            boolean r9 = r7.isAssignableFrom(r8)
            if (r9 == 0) goto Lf7
            return r2
        Lf7:
            java.lang.Class r9 = java.lang.Boolean.TYPE
            if (r8 != r9) goto Lfe
            if (r7 == r9) goto Lfe
            return r3
        Lfe:
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            if (r8 != r9) goto L136
            if (r7 != r9) goto L136
            if (r6 == 0) goto L136
            boolean r9 = r4 instanceof java.lang.reflect.Method
            if (r9 == 0) goto L136
            r9 = r1
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r9 = r9.getName()
            r10 = r4
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "is"
            boolean r12 = r9.startsWith(r11)
            java.lang.String r13 = "get"
            if (r12 == 0) goto L129
            boolean r12 = r10.startsWith(r13)
            if (r12 == 0) goto L129
            return r3
        L129:
            boolean r9 = r9.startsWith(r13)
            if (r9 == 0) goto L136
            boolean r9 = r10.startsWith(r11)
            if (r9 == 0) goto L136
            return r2
        L136:
            if (r6 == 0) goto L178
            boolean r6 = r4 instanceof java.lang.reflect.Method
            if (r6 == 0) goto L178
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r1 = r1.getName()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = r4.getName()
            boolean r6 = r1.equals(r4)
            if (r6 != 0) goto L178
            java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.getterName(r1, r5)
            java.lang.String r4 = com.alibaba.fastjson2.util.BeanUtils.getterName(r4, r5)
            java.lang.String r5 = r14.fieldName
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L167
            java.lang.String r5 = r15.fieldName
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L167
            return r3
        L167:
            java.lang.String r5 = r14.fieldName
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L178
            java.lang.String r4 = r15.fieldName
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L178
            return r2
        L178:
            boolean r1 = r8.isPrimitive()
            if (r1 == 0) goto L185
            boolean r1 = r7.isPrimitive()
            if (r1 != 0) goto L185
            return r2
        L185:
            boolean r1 = r8.isPrimitive()
            if (r1 != 0) goto L192
            boolean r1 = r7.isPrimitive()
            if (r1 == 0) goto L192
            return r3
        L192:
            java.lang.String r1 = r8.getName()
            java.lang.String r4 = "java."
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L1a9
            java.lang.String r1 = r7.getName()
            boolean r1 = r1.startsWith(r4)
            if (r1 != 0) goto L1a9
            return r2
        L1a9:
            java.lang.String r1 = r8.getName()
            boolean r1 = r1.startsWith(r4)
            if (r1 != 0) goto L1be
            java.lang.String r1 = r7.getName()
            boolean r1 = r1.startsWith(r4)
            if (r1 == 0) goto L1be
            return r3
        L1be:
            java.lang.reflect.Method r1 = r14.method
            if (r1 == 0) goto L1c7
            java.lang.reflect.Method r4 = r15.method
            if (r4 != 0) goto L1c7
            return r2
        L1c7:
            if (r1 != 0) goto L1ce
            java.lang.reflect.Method r15 = r15.method
            if (r15 == 0) goto L1ce
            return r3
        L1ce:
            return r0
    }

    public java.lang.Object getFieldValue(T r7) {
            r6 = this;
            java.lang.String r0 = "field.get error, "
            if (r7 == 0) goto L31
            java.lang.reflect.Field r1 = r6.field
            if (r1 == 0) goto L2b
            long r2 = r6.fieldOffset     // Catch: java.lang.IllegalAccessException -> L1b java.lang.IllegalArgumentException -> L1d
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1f
            boolean r4 = r6.primitive     // Catch: java.lang.IllegalAccessException -> L1b java.lang.IllegalArgumentException -> L1d
            if (r4 != 0) goto L1f
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.IllegalAccessException -> L1b java.lang.IllegalArgumentException -> L1d
            java.lang.Object r7 = r1.getObject(r7, r2)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.IllegalArgumentException -> L1d
            return r7
        L1b:
            r7 = move-exception
            goto L24
        L1d:
            r7 = move-exception
            goto L24
        L1f:
            java.lang.Object r7 = r1.get(r7)     // Catch: java.lang.IllegalAccessException -> L1b java.lang.IllegalArgumentException -> L1d
            return r7
        L24:
            java.lang.String r1 = r6.fieldName
            ah.a.o(r0, r1, r7)
        L29:
            r7 = 0
            return r7
        L2b:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            r7.<init>()
            throw r7
        L31:
            java.lang.String r7 = r6.fieldName
            ah.a.i(r7, r0)
            goto L29
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getInitWriter() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Class getItemClass() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.reflect.Type getItemType() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getItemWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.reflect.Type r3) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3, r0)
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Class<java.lang.Float[]> r0 = java.lang.Float[].class
            if (r3 != r0) goto L15
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L12
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L12:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.FLOAT_ARRAY
            return r2
        L15:
            java.lang.Class<java.lang.Double[]> r0 = java.lang.Double[].class
            if (r3 != r0) goto L2a
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L27
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L27:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DOUBLE_ARRAY
            return r2
        L2a:
            java.lang.Class<java.math.BigDecimal[]> r0 = java.math.BigDecimal[].class
            if (r3 != r0) goto L3f
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L3c
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L3c:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DECIMAL_ARRAY
            return r2
        L3f:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3)
            return r2
    }

    public final com.alibaba.fastjson2.JSONWriter.Path getPath(com.alibaba.fastjson2.JSONWriter.Path r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter$Path r0 = r2.path
            if (r0 != 0) goto Le
            com.alibaba.fastjson2.JSONWriter$Path r0 = new com.alibaba.fastjson2.JSONWriter$Path
            java.lang.String r1 = r2.fieldName
            r0.<init>(r3, r1)
            r2.path = r0
            return r0
        Le:
            com.alibaba.fastjson2.JSONWriter$Path r1 = r0.parent
            if (r1 != r3) goto L13
            return r0
        L13:
            com.alibaba.fastjson2.JSONWriter$Path r0 = new com.alibaba.fastjson2.JSONWriter$Path
            java.lang.String r1 = r2.fieldName
            r0.<init>(r3, r1)
            return r0
    }

    public final com.alibaba.fastjson2.JSONWriter.Path getRootParentPath() {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter$Path r0 = r1.rootParentPath
            return r0
    }

    public boolean isDateFormatISO8601() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isDateFormatMillis() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isFieldClassSerializable() {
            r1 = this;
            boolean r0 = r1.fieldClassSerializable
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.fieldName
            return r0
    }

    public boolean unwrapped() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean write(com.alibaba.fastjson2.JSONWriter r1, T r2);

    public void writeBinary(com.alibaba.fastjson2.JSONWriter r7, byte[] r8) {
            r6 = this;
            if (r8 != 0) goto L10
            boolean r8 = r7.isWriteNulls()
            if (r8 != 0) goto L9
            return
        L9:
            r6.writeFieldName(r7)
            r7.writeArrayNull()
            return
        L10:
            r6.writeFieldName(r7)
            long r0 = r6.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L24
            r7.writeString(r8)
            return
        L24:
            java.lang.String r0 = "base64"
            java.lang.String r1 = r6.format
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La3
            java.lang.String r0 = r6.format
            if (r0 != 0) goto L42
            long r0 = r6.features
            long r0 = r7.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteByteArrayAsBase64
            long r4 = r4.mask
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L42
            goto La3
        L42:
            java.lang.String r0 = "hex"
            java.lang.String r1 = r6.format
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L50
            r7.writeHex(r8)
            return
        L50:
            java.lang.String r0 = "gzip,base64"
            java.lang.String r1 = r6.format
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L69
            java.lang.String r0 = "gzip"
            java.lang.String r1 = r6.format
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L65
            goto L69
        L65:
            r7.writeBinary(r8)
            return
        L69:
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            int r2 = r8.length     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r3 = 512(0x200, float:7.17E-43)
            if (r2 >= r3) goto L80
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            int r3 = r8.length     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
        L7a:
            r0 = r2
            goto L86
        L7c:
            r7 = move-exception
            goto L9f
        L7e:
            r7 = move-exception
            goto L97
        L80:
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            goto L7a
        L86:
            r0.write(r8)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            r0.finish()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            byte[] r8 = r1.toByteArray()     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L7e
            com.alibaba.fastjson2.util.IOUtils.close(r0)
            r7.writeBase64(r8)
            return
        L97:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L7c
            java.lang.String r1 = "write gzipBytes error"
            r8.<init>(r1, r7)     // Catch: java.lang.Throwable -> L7c
            throw r8     // Catch: java.lang.Throwable -> L7c
        L9f:
            com.alibaba.fastjson2.util.IOUtils.close(r0)
            throw r7
        La3:
            r7.writeBase64(r8)
            return
    }

    public void writeBool(com.alibaba.fastjson2.JSONWriter r1, boolean r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeBool(com.alibaba.fastjson2.JSONWriter r2, boolean[] r3) {
            r1 = this;
            if (r3 != 0) goto L9
            boolean r0 = r2.isWriteNulls()
            if (r0 != 0) goto L9
            return
        L9:
            r1.writeFieldName(r2)
            r2.writeBool(r3)
            return
    }

    public void writeDate(com.alibaba.fastjson2.JSONWriter r2, long r3) {
            r1 = this;
            r0 = 1
            r1.writeDate(r2, r0, r3)
            return
    }

    public void writeDate(com.alibaba.fastjson2.JSONWriter r27, boolean r28, long r29) {
            r26 = this;
            r0 = r27
            r1 = r29
            boolean r3 = r0.jsonb
            if (r3 == 0) goto Lc
            r0.writeMillis(r1)
            return
        Lc:
            com.alibaba.fastjson2.JSONWriter$Context r3 = r0.context
            boolean r4 = r26.isDateFormatMillis()
            if (r4 != 0) goto L13d
            boolean r4 = r3.isDateFormatMillis()
            if (r4 == 0) goto L1c
            goto L13d
        L1c:
            java.time.ZoneId r4 = r3.getZoneId()
            java.lang.String r5 = r3.getDateFormat()
            if (r5 != 0) goto Ldf
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            long r2 = r1.getEpochSecond()
            java.time.zone.ZoneRules r4 = r4.getRules()
            java.time.ZoneOffset r1 = r4.getOffset(r1)
            int r1 = r1.getTotalSeconds()
            long r4 = (long) r1
            long r2 = r2 + r4
            r4 = 86400(0x15180, double:4.26873E-319)
            long r6 = java.lang.Math.floorDiv(r2, r4)
            long r1 = java.lang.Math.floorMod(r2, r4)
            int r1 = (int) r1
            r2 = 719468(0xafa6c, double:3.554644E-318)
            long r2 = r2 + r6
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r9 = 1
            r11 = 146097(0x23ab1, double:7.21815E-319)
            r13 = 400(0x190, double:1.976E-321)
            if (r8 >= 0) goto L65
            r15 = 719469(0xafa6d, double:3.55465E-318)
            long r6 = r6 + r15
            long r6 = r6 / r11
            long r6 = r6 - r9
            long r15 = r6 * r13
            long r6 = -r6
            long r6 = r6 * r11
            long r2 = r2 + r6
            goto L66
        L65:
            r15 = r4
        L66:
            long r6 = r2 * r13
            r17 = 591(0x24f, double:2.92E-321)
            long r6 = r6 + r17
            long r6 = r6 / r11
            r11 = 365(0x16d, double:1.803E-321)
            long r17 = r6 * r11
            r19 = 4
            long r21 = r6 / r19
            long r21 = r21 + r17
            r17 = 100
            long r23 = r6 / r17
            long r21 = r21 - r23
            long r23 = r6 / r13
            long r23 = r23 + r21
            long r21 = r2 - r23
            int r4 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r4 >= 0) goto L94
            long r6 = r6 - r9
            long r11 = r11 * r6
            long r4 = r6 / r19
            long r4 = r4 + r11
            long r8 = r6 / r17
            long r4 = r4 - r8
            long r8 = r6 / r13
            long r8 = r8 + r4
            long r21 = r2 - r8
        L94:
            r2 = r21
            long r6 = r6 + r15
            int r2 = (int) r2
            int r3 = r2 * 5
            int r3 = r3 + 2
            int r3 = r3 / 153
            int r4 = r3 + 2
            int r4 = r4 % 12
            int r4 = r4 + 1
            int r5 = r3 * 306
            int r5 = r5 + 5
            int r5 = r5 / 10
            int r2 = r2 - r5
            int r2 = r2 + 1
            int r3 = r3 / 10
            long r8 = (long) r3
            long r6 = r6 + r8
            java.time.temporal.ChronoField r3 = java.time.temporal.ChronoField.YEAR
            int r3 = r3.checkValidIntValue(r6)
            long r5 = (long) r1
            java.time.temporal.ChronoField r1 = java.time.temporal.ChronoField.SECOND_OF_DAY
            r1.checkValidValue(r5)
            r7 = 3600(0xe10, double:1.7786E-320)
            long r7 = r5 / r7
            int r1 = (int) r7
            int r7 = r1 * 3600
            long r7 = (long) r7
            long r5 = r5 - r7
            r7 = 60
            long r7 = r5 / r7
            int r7 = (int) r7
            int r8 = r7 * 60
            long r8 = (long) r8
            long r5 = r5 - r8
            int r6 = (int) r5
            if (r28 == 0) goto Ld5
            r26.writeFieldName(r27)
        Ld5:
            r5 = r4
            r4 = r1
            r1 = r3
            r3 = r2
            r2 = r5
            r5 = r7
            r0.writeDateTime19(r1, r2, r3, r4, r5, r6)
            return
        Ldf:
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZonedDateTime r1 = java.time.ZonedDateTime.ofInstant(r1, r4)
            boolean r2 = r26.isDateFormatISO8601()
            if (r2 != 0) goto Lf3
            boolean r2 = r3.isDateFormatISO8601()
            if (r2 == 0) goto Lf5
        Lf3:
            r2 = r1
            goto L106
        Lf5:
            java.time.format.DateTimeFormatter r2 = r3.getDateFormatter()
            java.lang.String r1 = r2.format(r1)
            if (r28 == 0) goto L102
            r26.writeFieldName(r27)
        L102:
            r0.writeString(r1)
            return
        L106:
            int r1 = r2.getYear()
            r3 = r2
            int r2 = r3.getMonthValue()
            r4 = r3
            int r3 = r4.getDayOfMonth()
            r5 = r4
            int r4 = r5.getHour()
            r6 = r5
            int r5 = r6.getMinute()
            r7 = r6
            int r6 = r7.getSecond()
            int r8 = r7.getNano()
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = r8 / r9
            java.time.ZoneOffset r7 = r7.getOffset()
            int r7 = r7.getTotalSeconds()
            r9 = 1
            r25 = r8
            r8 = r7
            r7 = r25
            r0.writeDateTimeISO8601(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L13d:
            if (r28 == 0) goto L142
            r26.writeFieldName(r27)
        L142:
            r0.writeInt64(r1)
            return
    }

    public void writeDate(com.alibaba.fastjson2.JSONWriter r3, boolean r4, java.util.Date r5) {
            r2 = this;
            if (r5 != 0) goto Lb
            if (r4 == 0) goto L7
            r2.writeFieldName(r3)
        L7:
            r3.writeNull()
            return
        Lb:
            long r0 = r5.getTime()
            r2.writeDate(r3, r4, r0)
            return
    }

    public void writeDouble(com.alibaba.fastjson2.JSONWriter r2, double r3) {
            r1 = this;
            r1.writeFieldName(r2)
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto Lb
            r2.writeDouble(r3, r0)
            return
        Lb:
            r2.writeDouble(r3)
            return
    }

    public void writeDouble(com.alibaba.fastjson2.JSONWriter r7, java.lang.Double r8) {
            r6 = this;
            if (r8 != 0) goto L23
            long r0 = r6.features
            long r0 = r7.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r8.mask
            long r2 = r2 & r0
            r4 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L22
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r2 = r8.mask
            long r0 = r0 & r2
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 != 0) goto L22
            r6.writeFieldName(r7)
            r7.writeNumberNull()
        L22:
            return
        L23:
            r6.writeFieldName(r7)
            double r0 = r8.doubleValue()
            r7.writeDouble(r0)
            return
    }

    public void writeDouble(com.alibaba.fastjson2.JSONWriter r2, double[] r3) {
            r1 = this;
            if (r3 != 0) goto L9
            boolean r0 = r2.isWriteNulls()
            if (r0 != 0) goto L9
            return
        L9:
            r1.writeFieldName(r2)
            r2.writeDouble(r3)
            return
    }

    public void writeEnum(com.alibaba.fastjson2.JSONWriter r1, java.lang.Enum r2) {
            r0 = this;
            r0.writeFieldName(r1)
            r1.writeEnum(r2)
            return
    }

    public void writeEnumJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Enum r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public final void writeFieldName(com.alibaba.fastjson2.JSONWriter r5) {
            r4 = this;
            boolean r0 = r5.jsonb
            if (r0 == 0) goto L17
            com.alibaba.fastjson2.SymbolTable r0 = r5.symbolTable
            if (r0 == 0) goto Lf
            boolean r0 = r4.writeFieldNameSymbol(r5, r0)
            if (r0 == 0) goto Lf
            return
        Lf:
            byte[] r0 = r4.nameJSONB
            long r1 = r4.hashCode
            r5.writeNameRaw(r0, r1)
            return
        L17:
            boolean r0 = r5.useSingleQuote
            if (r0 != 0) goto L40
            com.alibaba.fastjson2.JSONWriter$Context r0 = r5.context
            long r0 = r0.getFeatures()
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.UnquoteFieldName
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
            boolean r0 = r5.utf8
            if (r0 == 0) goto L36
            byte[] r0 = r4.nameWithColonUTF8
            r5.writeNameRaw(r0)
            return
        L36:
            boolean r0 = r5.utf16
            if (r0 == 0) goto L40
            char[] r0 = r4.nameWithColonUTF16
            r5.writeNameRaw(r0)
            return
        L40:
            java.lang.String r0 = r4.fieldName
            r5.writeName(r0)
            r5.writeColon()
            return
    }

    public void writeFloat(com.alibaba.fastjson2.JSONWriter r2, float r3) {
            r1 = this;
            r1.writeFieldName(r2)
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto Lb
            r2.writeFloat(r3, r0)
            return
        Lb:
            r2.writeFloat(r3)
            return
    }

    public void writeFloat(com.alibaba.fastjson2.JSONWriter r2, float[] r3) {
            r1 = this;
            if (r3 != 0) goto L9
            boolean r0 = r2.isWriteNulls()
            if (r0 != 0) goto L9
            return
        L9:
            r1.writeFieldName(r2)
            r2.writeFloat(r3)
            return
    }

    public final boolean writeFloatNull(com.alibaba.fastjson2.JSONWriter r11) {
            r10 = this;
            long r0 = r10.features
            long r0 = r11.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r5 = r4.mask
            long r2 = r2 | r5
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r6 = r5.mask
            long r2 = r2 | r6
            long r2 = r2 & r0
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L1d
            return r3
        L1d:
            r10.writeFieldName(r11)
            long r8 = r4.mask
            long r8 = r8 & r0
            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r2 == 0) goto L2c
            r0 = 0
            r11.writeFloat(r0)
            goto L3a
        L2c:
            long r4 = r5.mask
            long r0 = r0 & r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L37
            r11.writeInt32(r3)
            goto L3a
        L37:
            r11.writeNull()
        L3a:
            r11 = 1
            return r11
    }

    public void writeInt16(com.alibaba.fastjson2.JSONWriter r2, short[] r3) {
            r1 = this;
            if (r3 != 0) goto L9
            boolean r0 = r2.isWriteNulls()
            if (r0 != 0) goto L9
            return
        L9:
            r1.writeFieldName(r2)
            r2.writeInt16(r3)
            return
    }

    public void writeInt32(com.alibaba.fastjson2.JSONWriter r1, int r2) {
            r0 = this;
            r0.writeFieldName(r1)
            r1.writeInt32(r2)
            return
    }

    public void writeInt64(com.alibaba.fastjson2.JSONWriter r5, long r6) {
            r4 = this;
            r4.writeFieldName(r5)
            long r0 = r4.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L18
            java.lang.String r6 = java.lang.Long.toString(r6)
            r5.writeString(r6)
            return
        L18:
            r5.writeInt64(r6)
            return
    }

    public final boolean writeIntNull(com.alibaba.fastjson2.JSONWriter r11) {
            r10 = this;
            long r0 = r10.features
            long r2 = r11.getFeatures()
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r5 = r4.mask
            long r2 = r2 | r5
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r6 = r5.mask
            long r2 = r2 | r6
            long r2 = r2 & r0
            r6 = 0
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L1e
            return r3
        L1e:
            r10.writeFieldName(r11)
            long r8 = r4.mask
            long r4 = r5.mask
            long r4 = r4 | r8
            long r0 = r0 & r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L2f
            r11.writeInt32(r3)
            goto L32
        L2f:
            r11.writeNull()
        L32:
            r11 = 1
            return r11
    }

    public void writeList(com.alibaba.fastjson2.JSONWriter r1, boolean r2, java.util.List r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeListJSONB(com.alibaba.fastjson2.JSONWriter r1, java.util.List r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeListStr(com.alibaba.fastjson2.JSONWriter r1, boolean r2, java.util.List<java.lang.String> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeListValue(com.alibaba.fastjson2.JSONWriter r1, java.util.List r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeListValueJSONB(com.alibaba.fastjson2.JSONWriter r1, java.util.List r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public void writeString(com.alibaba.fastjson2.JSONWriter r7, java.lang.String r8) {
            r6 = this;
            r6.writeFieldName(r7)
            if (r8 != 0) goto L1d
            long r0 = r6.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1d
            java.lang.String r8 = ""
            r7.writeString(r8)
            return
        L1d:
            boolean r0 = r6.trim
            if (r0 == 0) goto L27
            if (r8 == 0) goto L27
            java.lang.String r8 = r8.trim()
        L27:
            boolean r0 = r6.symbol
            if (r0 == 0) goto L33
            boolean r0 = r7.jsonb
            if (r0 == 0) goto L33
            r7.writeSymbol(r8)
            return
        L33:
            boolean r0 = r6.raw
            if (r0 == 0) goto L3b
            r7.writeRaw(r8)
            return
        L3b:
            r7.writeString(r8)
            return
    }

    public void writeString(com.alibaba.fastjson2.JSONWriter r3, char[] r4) {
            r2 = this;
            if (r4 != 0) goto L9
            boolean r0 = r3.isWriteNulls()
            if (r0 != 0) goto L9
            return
        L9:
            r2.writeFieldName(r3)
            if (r4 != 0) goto L12
            r3.writeStringNull()
            return
        L12:
            r0 = 0
            int r1 = r4.length
            r3.writeString(r4, r0, r1)
            return
    }

    public abstract void writeValue(com.alibaba.fastjson2.JSONWriter r1, T r2);
}
