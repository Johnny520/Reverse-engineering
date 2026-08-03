package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldReader<T> implements java.lang.Comparable<com.alibaba.fastjson2.reader.FieldReader> {
    public final java.lang.Object defaultValue;
    public final long features;
    public final java.lang.reflect.Field field;
    public final java.lang.Class fieldClass;
    final boolean fieldClassSerializable;
    public final java.lang.String fieldName;
    final long fieldNameHash;
    final long fieldNameHashLCase;
    protected final long fieldOffset;
    public final java.lang.reflect.Type fieldType;
    public final java.lang.String format;
    java.lang.Class itemClass;
    volatile com.alibaba.fastjson2.reader.ObjectReader itemReader;
    java.lang.reflect.Type itemType;
    public final java.util.Locale locale;
    public final java.lang.reflect.Method method;
    final boolean noneStaticMemberClass;
    public final int ordinal;
    final boolean readOnly;
    volatile com.alibaba.fastjson2.reader.ObjectReader reader;
    volatile com.alibaba.fastjson2.JSONPath referenceCache;

    public FieldReader(java.lang.String r18, java.lang.reflect.Type r19, java.lang.Class r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.lang.Object r26, java.lang.reflect.Method r27, java.lang.reflect.Field r28) {
            r17 = this;
            r0 = r17
            r1 = r20
            r2 = r22
            r4 = r27
            r5 = r28
            r0.<init>()
            r6 = r18
            r0.fieldName = r6
            r7 = r19
            r0.fieldType = r7
            r0.fieldClass = r1
            java.lang.Class<java.util.List> r7 = java.util.List.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L3d
            boolean r11 = r1.isPrimitive()
            if (r11 != 0) goto L3b
            if (r1 == r8) goto L3b
            if (r1 == r7) goto L3b
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r11 = r11.isAssignableFrom(r1)
            if (r11 != 0) goto L3b
            int r11 = r1.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isInterface(r11)
            if (r11 == 0) goto L3d
        L3b:
            r11 = r10
            goto L3e
        L3d:
            r11 = r9
        L3e:
            r0.fieldClassSerializable = r11
            r0.features = r2
            long r11 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)
            r0.fieldNameHash = r11
            long r11 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r6)
            r0.fieldNameHashLCase = r11
            r6 = r21
            r0.ordinal = r6
            r6 = r24
            r0.format = r6
            r6 = r25
            r0.locale = r6
            r6 = r26
            r0.defaultValue = r6
            r0.method = r4
            r0.field = r5
            r11 = 0
            if (r5 == 0) goto L70
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isFinal(r6)
            if (r6 != 0) goto L77
        L70:
            r13 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
            long r13 = r13 & r2
            int r6 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r6 == 0) goto L79
        L77:
            r6 = r10
            goto L7a
        L79:
            r6 = r9
        L7a:
            r0.readOnly = r6
            r13 = -1
            if (r5 == 0) goto L8e
            r15 = 36028797018963968(0x80000000000000, double:2.848094538889218E-306)
            long r2 = r2 & r15
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L8e
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            long r2 = r2.objectFieldOffset(r5)
            goto L8f
        L8e:
            r2 = r13
        L8f:
            r0.fieldOffset = r2
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 != 0) goto L9c
            if (r5 == 0) goto L9c
            if (r4 != 0) goto L9c
            r5.setAccessible(r10)     // Catch: java.lang.Throwable -> L9c
        L9c:
            if (r1 == 0) goto Lc6
            boolean r2 = r1.isPrimitive()
            if (r2 != 0) goto Lc6
            if (r1 == r8) goto Lc6
            if (r1 == r7) goto Lc6
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            if (r1 == r2) goto Lc6
            boolean r2 = r1.isEnum()
            if (r2 == 0) goto Lb3
            goto Lc6
        Lb3:
            if (r4 == 0) goto Lba
            java.lang.Class r2 = r4.getDeclaringClass()
            goto Lc2
        Lba:
            if (r5 == 0) goto Lc1
            java.lang.Class r2 = r5.getDeclaringClass()
            goto Lc2
        Lc1:
            r2 = 0
        Lc2:
            boolean r9 = com.alibaba.fastjson2.util.BeanUtils.isNoneStaticMemberClass(r2, r1)
        Lc6:
            r0.noneStaticMemberClass = r9
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReader createFormattedObjectReader(java.lang.reflect.Type r3, java.lang.Class r4, java.lang.String r5, java.util.Locale r6) {
            if (r5 == 0) goto Lc9
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lc9
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -1374008726: goto L44;
                case 2887: goto L39;
                case 1087757882: goto L2e;
                case 1088242009: goto L23;
                case 1252880906: goto L18;
                default: goto L17;
            }
        L17:
            goto L4e
        L18:
            java.lang.String r1 = "java.sql.Timestamp"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L4e
        L21:
            r2 = 4
            goto L4e
        L23:
            java.lang.String r1 = "java.sql.Time"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L4e
        L2c:
            r2 = 3
            goto L4e
        L2e:
            java.lang.String r1 = "java.sql.Date"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L4e
        L37:
            r2 = 2
            goto L4e
        L39:
            java.lang.String r1 = "[B"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L4e
        L42:
            r2 = 1
            goto L4e
        L44:
            java.lang.String r1 = "byte[]"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L4e
        L4d:
            r2 = 0
        L4e:
            switch(r2) {
                case 0: goto Lc3;
                case 1: goto Lc3;
                case 2: goto Lbd;
                case 3: goto Lb7;
                case 4: goto Lb1;
                default: goto L51;
            }
        L51:
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L5e
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar r3 = com.alibaba.fastjson2.reader.ObjectReaderImplCalendar.of(r5, r6)
            return r3
        L5e:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r4 != r0) goto L67
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r3 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.of(r5, r6)
            return r3
        L67:
            java.lang.Class<java.time.ZonedDateTime> r0 = java.time.ZonedDateTime.class
            if (r4 != r0) goto L70
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r3 = com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime.of(r5, r6)
            return r3
        L70:
            java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
            if (r4 != r0) goto L7a
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime r3 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime
            r3.<init>(r5, r6)
            return r3
        L7a:
            java.lang.Class<java.time.LocalDate> r0 = java.time.LocalDate.class
            if (r4 != r0) goto L83
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r3 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate.of(r5, r6)
            return r3
        L83:
            java.lang.Class<java.time.LocalTime> r0 = java.time.LocalTime.class
            if (r4 != r0) goto L8d
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime r3 = new com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime
            r3.<init>(r5, r6)
            return r3
        L8d:
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            if (r4 != r0) goto L96
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r3 = com.alibaba.fastjson2.reader.ObjectReaderImplInstant.of(r5, r6)
            return r3
        L96:
            java.lang.Class<java.time.OffsetTime> r0 = java.time.OffsetTime.class
            if (r4 != r0) goto L9f
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime r3 = com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime.of(r5, r6)
            return r3
        L9f:
            java.lang.Class<java.time.OffsetDateTime> r0 = java.time.OffsetDateTime.class
            if (r4 != r0) goto La8
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetDateTime r3 = com.alibaba.fastjson2.reader.ObjectReaderImplOffsetDateTime.of(r5, r6)
            return r3
        La8:
            java.lang.Class<java.util.Optional> r0 = java.util.Optional.class
            if (r4 != r0) goto Lc9
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r3 = com.alibaba.fastjson2.reader.ObjectReaderImplOptional.of(r3, r5, r6)
            return r3
        Lb1:
            com.alibaba.fastjson2.util.JdbcSupport$TimestampReader r3 = new com.alibaba.fastjson2.util.JdbcSupport$TimestampReader
            r3.<init>(r5, r6)
            return r3
        Lb7:
            com.alibaba.fastjson2.util.JdbcSupport$TimeReader r3 = new com.alibaba.fastjson2.util.JdbcSupport$TimeReader
            r3.<init>(r5, r6)
            return r3
        Lbd:
            com.alibaba.fastjson2.util.JdbcSupport$DateReader r3 = new com.alibaba.fastjson2.util.JdbcSupport$DateReader
            r3.<init>(r5, r6)
            return r3
        Lc3:
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array r3 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array
            r3.<init>(r5)
            return r3
        Lc9:
            r3 = 0
            return r3
    }

    private static boolean needCompareToActualFieldClass(java.lang.Class r1) {
            boolean r0 = r1.isEnum()
            if (r0 != 0) goto Lf
            boolean r1 = r1.isInterface()
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public void accept(T r1, byte r2) {
            r0 = this;
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, char r2) {
            r0 = this;
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, double r2) {
            r0 = this;
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, float r2) {
            r0 = this;
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public abstract void accept(T r1, java.lang.Object r2);

    public void accept(T r1, short r2) {
            r0 = this;
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void accept(T r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    public void acceptAny(T r12, java.lang.Object r13, long r14) {
            r11 = this;
            r5 = r14
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1 = 0
            r3 = 0
            r4 = 1
            if (r13 == 0) goto L5e
            java.lang.Class r7 = r13.getClass()
            boolean r8 = r11.supportAcceptType(r7)
            if (r8 != 0) goto L5e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != r8) goto L20
            java.lang.Class r8 = r11.fieldClass
            java.lang.Class<java.util.Date> r9 = java.util.Date.class
            if (r8 != r9) goto L49
            r8 = r13
            r9 = r3
            goto L4b
        L20:
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            if (r7 != r8) goto L49
            java.lang.Class r8 = r11.fieldClass
            java.lang.Class r9 = java.lang.Boolean.TYPE
            if (r8 == r9) goto L2e
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            if (r8 != r9) goto L49
        L2e:
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.NonZeroNumberCastToBooleanAsTrue
            long r8 = r8.mask
            long r8 = r8 & r5
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 == 0) goto L49
            r8 = r13
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 == 0) goto L42
            r8 = r4
            goto L43
        L42:
            r8 = r3
        L43:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
        L47:
            r9 = r4
            goto L4b
        L49:
            r8 = r13
            goto L47
        L4b:
            java.lang.Class r10 = r11.fieldClass
            if (r7 == r10) goto L5c
            if (r9 == 0) goto L5c
            java.util.function.Function r7 = r0.getTypeConvert(r7, r10)
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r7.apply(r8)
            goto L60
        L5c:
            r7 = r8
            goto L60
        L5e:
            r7 = r13
            r9 = r4
        L60:
            if (r7 == 0) goto Lf1
            java.lang.reflect.Type r8 = r11.fieldType
            java.lang.Class r10 = r7.getClass()
            if (r8 != r10) goto L6c
            goto Lf1
        L6c:
            boolean r8 = r7 instanceof com.alibaba.fastjson2.JSONObject
            if (r8 == 0) goto L8a
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r8 = r0.mask
            long r5 = r5 & r8
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L7e
            com.alibaba.fastjson2.JSONReader$Feature[] r1 = new com.alibaba.fastjson2.JSONReader.Feature[r4]
            r1[r3] = r0
            goto L80
        L7e:
            com.alibaba.fastjson2.JSONReader$Feature[] r1 = new com.alibaba.fastjson2.JSONReader.Feature[r3]
        L80:
            com.alibaba.fastjson2.JSONObject r7 = (com.alibaba.fastjson2.JSONObject) r7
            java.lang.reflect.Type r0 = r11.fieldType
            java.lang.Object r7 = r7.to(r0, r1)
            goto Lf1
        L8a:
            boolean r3 = r7 instanceof com.alibaba.fastjson2.JSONArray
            if (r3 == 0) goto L97
            com.alibaba.fastjson2.JSONArray r7 = (com.alibaba.fastjson2.JSONArray) r7
            java.lang.reflect.Type r0 = r11.fieldType
            java.lang.Object r7 = r7.to(r0, r14)
            goto Lf1
        L97:
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto Lc4
            java.lang.Class r1 = r11.fieldClass
            boolean r1 = r1.isInstance(r7)
            if (r1 != 0) goto Lc4
            java.lang.String r1 = r11.format
            if (r1 != 0) goto Lc4
            com.alibaba.fastjson2.reader.ObjectReader r1 = r11.getInitReader()
            if (r1 == 0) goto Lbd
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r7)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r0)
            r3 = 0
            r4 = 0
            java.lang.Object r0 = r1.readObject(r2, r3, r4, r5)
        Lbb:
            r7 = r0
            goto Lf1
        Lbd:
            java.lang.Class r1 = r11.fieldClass
            java.lang.Object r0 = com.alibaba.fastjson2.util.TypeUtils.cast(r7, r1, r0)
            goto Lbb
        Lc4:
            if (r9 == 0) goto Lf1
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r7)
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext(r14)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r0, r1)
            com.alibaba.fastjson2.reader.ObjectReader r1 = r11.getObjectReader(r2)     // Catch: java.lang.Throwable -> Le4
            java.lang.String r4 = r11.fieldName     // Catch: java.lang.Throwable -> Le4
            r3 = 0
            r5 = r14
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Le4
            if (r2 == 0) goto Lf1
            r2.close()
            goto Lf1
        Le4:
            r0 = move-exception
            r1 = r0
            if (r2 == 0) goto Lf0
            r2.close()     // Catch: java.lang.Throwable -> Lec
            goto Lf0
        Lec:
            r0 = move-exception
            r1.addSuppressed(r0)
        Lf0:
            throw r1
        Lf1:
            r11.accept(r12, r7)
            return
    }

    public void acceptDefaultValue(T r2) {
            r1 = this;
            java.lang.Object r0 = r1.defaultValue
            if (r0 == 0) goto L7
            r1.accept(r2, r0)
        L7:
            return
    }

    public void acceptExtra(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            return
    }

    public void addResolveTask(com.alibaba.fastjson2.JSONReader r2, java.lang.Object r3, java.lang.String r4) {
            r1 = this;
            com.alibaba.fastjson2.JSONPath r0 = r1.referenceCache
            if (r0 == 0) goto L13
            com.alibaba.fastjson2.JSONPath r0 = r1.referenceCache
            java.lang.String r0 = r0.toString()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L13
            com.alibaba.fastjson2.JSONPath r4 = r1.referenceCache
            goto L19
        L13:
            com.alibaba.fastjson2.JSONPath r4 = com.alibaba.fastjson2.JSONPath.of(r4)
            r1.referenceCache = r4
        L19:
            r2.addResolveTask(r1, r3, r4)
            return
    }

    public void addResolveTask(com.alibaba.fastjson2.JSONReader r1, java.util.List r2, int r3, java.lang.String r4) {
            r0 = this;
            com.alibaba.fastjson2.JSONPath r4 = com.alibaba.fastjson2.JSONPath.of(r4)
            r1.addResolveTask(r2, r3, r4)
            return
    }

    public com.alibaba.fastjson2.reader.ObjectReader checkObjectAutoType(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.alibaba.fastjson2.reader.FieldReader r13) {
            r12 = this;
            java.lang.String r0 = r12.fieldName
            java.lang.String r1 = r13.fieldName
            int r0 = r0.compareTo(r1)
            r1 = -1
            r2 = 1
            if (r0 == 0) goto L17
            int r3 = r12.ordinal
            int r13 = r13.ordinal
            if (r3 >= r13) goto L13
            return r1
        L13:
            if (r3 <= r13) goto L16
            return r2
        L16:
            return r0
        L17:
            boolean r0 = r12.isReadOnly()
            boolean r3 = r13.isReadOnly()
            r4 = 0
            if (r0 != r3) goto L24
            r0 = r4
            goto L2d
        L24:
            boolean r0 = r12.isReadOnly()
            if (r0 == 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            if (r0 == 0) goto L31
            goto L1e3
        L31:
            java.lang.reflect.Field r3 = r12.field
            if (r3 == 0) goto L36
            goto L38
        L36:
            java.lang.reflect.Method r3 = r12.method
        L38:
            java.lang.reflect.Field r5 = r13.field
            if (r5 == 0) goto L3d
            goto L3f
        L3d:
            java.lang.reflect.Method r5 = r13.method
        L3f:
            if (r3 == 0) goto L65
            if (r5 == 0) goto L65
            java.lang.Class r6 = r3.getClass()
            java.lang.Class r7 = r5.getClass()
            if (r6 == r7) goto L65
            java.lang.Class r5 = r5.getDeclaringClass()
            java.lang.Class r3 = r3.getDeclaringClass()
            if (r3 == r5) goto L65
            boolean r6 = r3.isAssignableFrom(r5)
            if (r6 == 0) goto L5e
            return r2
        L5e:
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L65
            return r1
        L65:
            java.lang.reflect.Field r3 = r12.field
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r3 == 0) goto L94
            java.lang.reflect.Field r6 = r13.field
            if (r6 == 0) goto L94
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.reflect.Field r6 = r13.field
            java.lang.Class r6 = r6.getDeclaringClass()
            java.lang.Class r7 = r3.getSuperclass()
        L7d:
            if (r7 == 0) goto L89
            if (r7 == r5) goto L89
            if (r7 != r6) goto L84
            return r2
        L84:
            java.lang.Class r7 = r7.getSuperclass()
            goto L7d
        L89:
            java.lang.Class r6 = r6.getSuperclass()
            if (r6 == 0) goto L94
            if (r6 == r5) goto L94
            if (r6 != r3) goto L89
            return r1
        L94:
            java.lang.reflect.Method r3 = r12.method
            if (r3 == 0) goto L19f
            java.lang.reflect.Method r6 = r13.method
            if (r6 == 0) goto L19f
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.reflect.Method r6 = r13.method
            java.lang.Class r6 = r6.getDeclaringClass()
            java.lang.Class r7 = r3.getSuperclass()
        Laa:
            if (r7 == 0) goto Lb6
            if (r7 == r5) goto Lb6
            if (r7 != r6) goto Lb1
            return r1
        Lb1:
            java.lang.Class r7 = r7.getSuperclass()
            goto Laa
        Lb6:
            java.lang.Class r7 = r6.getSuperclass()
        Lba:
            if (r7 == 0) goto Lc6
            if (r7 == r5) goto Lc6
            if (r7 != r3) goto Lc1
            return r2
        Lc1:
            java.lang.Class r7 = r7.getSuperclass()
            goto Lba
        Lc6:
            java.lang.reflect.Method r7 = r12.method
            java.lang.Class[] r7 = r7.getParameterTypes()
            java.lang.reflect.Method r8 = r13.method
            java.lang.Class[] r8 = r8.getParameterTypes()
            int r9 = r7.length
            r10 = 0
            if (r9 != r2) goto L163
            int r9 = r8.length
            if (r9 != r2) goto L163
            r7 = r7[r4]
            r8 = r8[r4]
            if (r7 == r8) goto L163
            boolean r9 = r7.isAssignableFrom(r8)
            if (r9 == 0) goto Le6
            return r2
        Le6:
            boolean r9 = r8.isAssignableFrom(r7)
            if (r9 == 0) goto Led
            return r1
        Led:
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            boolean r11 = r9.isAssignableFrom(r8)
            if (r11 == 0) goto Lfc
            boolean r11 = r9.isAssignableFrom(r7)
            if (r11 != 0) goto Lfc
            return r2
        Lfc:
            boolean r11 = r9.isAssignableFrom(r7)
            if (r11 == 0) goto L109
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 != 0) goto L109
            return r1
        L109:
            boolean r9 = needCompareToActualFieldClass(r7)
            if (r9 != 0) goto L115
            boolean r9 = needCompareToActualFieldClass(r8)
            if (r9 == 0) goto L147
        L115:
            java.lang.String r9 = r12.fieldName     // Catch: java.lang.NoSuchFieldException -> L12c
            java.lang.reflect.Field r3 = r3.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L12c
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.NoSuchFieldException -> L12c
            if (r3 != 0) goto L12d
            java.lang.String r9 = r12.fieldName     // Catch: java.lang.NoSuchFieldException -> L12d
            java.lang.reflect.Field r6 = r6.getDeclaredField(r9)     // Catch: java.lang.NoSuchFieldException -> L12d
            java.lang.Class r3 = r6.getType()     // Catch: java.lang.NoSuchFieldException -> L12d
            goto L12d
        L12c:
            r3 = r10
        L12d:
            if (r3 == 0) goto L147
        L12f:
            if (r7 == 0) goto L13b
            if (r7 == r5) goto L13b
            if (r7 != r3) goto L136
            return r1
        L136:
            java.lang.Class r7 = r7.getSuperclass()
            goto L12f
        L13b:
            if (r8 == 0) goto L147
            if (r8 == r5) goto L147
            if (r8 != r3) goto L142
            return r2
        L142:
            java.lang.Class r8 = r8.getSuperclass()
            goto L13b
        L147:
            java.lang.reflect.Method r3 = r12.method
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r5 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r3 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r3, r5)
            com.alibaba.fastjson2.annotation.JSONField r3 = (com.alibaba.fastjson2.annotation.JSONField) r3
            java.lang.reflect.Method r6 = r13.method
            java.lang.annotation.Annotation r5 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r6, r5)
            com.alibaba.fastjson2.annotation.JSONField r5 = (com.alibaba.fastjson2.annotation.JSONField) r5
            if (r3 == 0) goto L15e
            if (r5 != 0) goto L15e
            return r1
        L15e:
            if (r3 != 0) goto L163
            if (r5 == 0) goto L163
            return r2
        L163:
            java.lang.reflect.Method r3 = r12.method
            java.lang.String r3 = r3.getName()
            java.lang.reflect.Method r5 = r13.method
            java.lang.String r5 = r5.getName()
            boolean r6 = r3.equals(r5)
            if (r6 != 0) goto L19f
            java.lang.String r3 = com.alibaba.fastjson2.util.BeanUtils.setterName(r3, r10)
            java.lang.String r5 = com.alibaba.fastjson2.util.BeanUtils.setterName(r5, r10)
            java.lang.String r6 = r12.fieldName
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L18e
            java.lang.String r6 = r13.fieldName
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L18e
            return r2
        L18e:
            java.lang.String r6 = r13.fieldName
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L19f
            java.lang.String r5 = r12.fieldName
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L19f
            return r1
        L19f:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r12.getInitReader()
            com.alibaba.fastjson2.reader.ObjectReader r5 = r13.getInitReader()
            if (r3 == 0) goto L1ac
            if (r5 != 0) goto L1ac
            return r1
        L1ac:
            if (r3 != 0) goto L1b1
            if (r5 == 0) goto L1b1
            return r2
        L1b1:
            java.lang.Class r3 = r12.fieldClass
            java.lang.Class r13 = r13.fieldClass
            boolean r5 = r3.isPrimitive()
            boolean r6 = r13.isPrimitive()
            if (r5 == 0) goto L1c2
            if (r6 != 0) goto L1c2
            return r1
        L1c2:
            if (r5 != 0) goto L1c7
            if (r6 == 0) goto L1c7
            return r2
        L1c7:
            java.lang.String r3 = r3.getName()
            java.lang.String r5 = "java."
            boolean r3 = r3.startsWith(r5, r4)
            java.lang.String r13 = r13.getName()
            boolean r13 = r13.startsWith(r5, r4)
            if (r3 == 0) goto L1de
            if (r13 != 0) goto L1de
            return r1
        L1de:
            if (r3 != 0) goto L1e3
            if (r13 == 0) goto L1e3
            return r2
        L1e3:
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.alibaba.fastjson2.reader.FieldReader r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.FieldReader r1 = (com.alibaba.fastjson2.reader.FieldReader) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public com.alibaba.fastjson2.reader.ObjectReader getInitReader() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Class getItemClass() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.itemType
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Class r1 = r2.itemClass
            if (r1 != 0) goto L10
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r0)
            r2.itemClass = r0
        L10:
            java.lang.Class r0 = r2.itemClass
            return r0
    }

    public long getItemClassHash() {
            r2 = this;
            java.lang.Class r0 = r2.getItemClass()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.String r0 = r0.getName()
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            return r0
    }

    public com.alibaba.fastjson2.reader.ObjectReader getItemObjectReader(com.alibaba.fastjson2.JSONReader.Context r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.itemReader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.itemReader
            return r2
        L7:
            java.lang.reflect.Type r0 = r1.itemType
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r0)
            r1.itemReader = r2
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader getItemObjectReader(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            com.alibaba.fastjson2.JSONReader$Context r1 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.getItemObjectReader(r1)
            return r1
    }

    public java.lang.reflect.Type getItemType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.itemType
            return r0
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader.Context r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.reader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.reader
            return r2
        L7:
            java.lang.reflect.Type r0 = r1.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r0)
            r1.reader = r2
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.reader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.reader
            return r2
        L7:
            java.lang.reflect.Type r0 = r1.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r0)
            r1.reader = r2
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.reader.ObjectReaderProvider r5) {
            r4 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.reader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r5 = r4.reader
            return r5
        L7:
            long r0 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            java.lang.reflect.Type r1 = r4.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r5 = r5.getObjectReader(r1, r0)
            r4.reader = r5
            return r5
    }

    public boolean isReadOnly() {
            r1 = this;
            boolean r0 = r1.readOnly
            return r0
    }

    public boolean isUnwrapped() {
            r4 = this;
            long r0 = r4.features
            r2 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public void processExtra(com.alibaba.fastjson2.JSONReader r1, java.lang.Object r2) {
            r0 = this;
            r1.skipValue()
            return
    }

    public abstract java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1);

    public abstract void readFieldValue(com.alibaba.fastjson2.JSONReader r1, T r2);

    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            r0.readFieldValue(r1, r2)
            return
    }

    public boolean supportAcceptType(java.lang.Class r2) {
            r1 = this;
            java.lang.Class r0 = r1.fieldClass
            if (r0 != r2) goto L6
            r2 = 1
            return r2
        L6:
            r2 = 0
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.reflect.Field r0 = r1.field
        L7:
            if (r0 == 0) goto Le
            java.lang.String r0 = r0.getName()
            return r0
        Le:
            java.lang.String r0 = r1.fieldName
            return r0
    }
}
