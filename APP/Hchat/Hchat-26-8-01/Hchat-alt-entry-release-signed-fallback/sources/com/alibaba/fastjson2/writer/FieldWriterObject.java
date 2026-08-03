package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldWriterObject<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriterObject, java.lang.Class> initValueClassUpdater = null;
    final boolean array;
    volatile java.lang.Class initValueClass;
    final boolean number;
    final boolean unwrapped;
    protected boolean writeUsing;

    static {
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "initValueClass"
            java.lang.Class<com.alibaba.fastjson2.writer.FieldWriterObject> r2 = com.alibaba.fastjson2.writer.FieldWriterObject.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            com.alibaba.fastjson2.writer.FieldWriterObject.initValueClassUpdater = r0
            return
    }

    public FieldWriterObject(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            r5 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r2 = r3 & r5
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            r1.unwrapped = r2
            java.lang.Class<java.util.Currency> r2 = java.util.Currency.class
            if (r8 != r2) goto L1f
            r1.initValueClass = r8
            com.alibaba.fastjson2.writer.ObjectWriterImplCurrency r2 = com.alibaba.fastjson2.writer.ObjectWriterImplCurrency.INSTANCE_FOR_FIELD
            r1.initObjectWriter = r2
        L1f:
            boolean r2 = r8.isArray()
            if (r2 != 0) goto L35
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = r2.isAssignableFrom(r8)
            if (r2 != 0) goto L35
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r2 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r8 == r2) goto L35
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r2 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r8 != r2) goto L36
        L35:
            r3 = r4
        L36:
            r1.array = r3
            java.lang.Class<java.lang.Number> r2 = java.lang.Number.class
            boolean r2 = r2.isAssignableFrom(r8)
            r1.number = r2
            return
    }

    private com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterTypeMatch(com.alibaba.fastjson2.JSONWriter r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L1c
            java.lang.Class r2 = r1.fieldClass
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L17
            java.lang.reflect.Type r2 = r1.fieldType
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r2 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r2, r3)
            goto L20
        L17:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r2 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r3)
            goto L20
        L1c:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3)
        L20:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriter, com.alibaba.fastjson2.writer.ObjectWriter> r3 = com.alibaba.fastjson2.writer.FieldWriter.initObjectWriterUpdater
        L22:
            r0 = 0
            boolean r0 = r3.compareAndSet(r1, r0, r2)
            if (r0 == 0) goto L2a
            return r2
        L2a:
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L22
            return r2
    }

    private com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterTypeNotMatch(com.alibaba.fastjson2.JSONWriter r5, java.lang.Class r6) {
            r4 = this;
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 == 0) goto L1c
            java.lang.Class r5 = r4.fieldClass
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L17
            java.lang.reflect.Type r5 = r4.fieldType
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r5 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r5, r6)
            return r5
        L17:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r5 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r6)
            return r5
        L1c:
            java.lang.String r0 = r4.format
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.reflect.Type r2 = r4.fieldType
            java.lang.Class r3 = r4.fieldClass
            com.alibaba.fastjson2.writer.ObjectWriter r1 = com.alibaba.fastjson2.writer.FieldWriter.getObjectWriter(r2, r3, r0, r1, r6)
        L29:
            if (r1 != 0) goto L30
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r5.getObjectWriter(r6)
            return r5
        L30:
            return r1
    }

    private com.alibaba.fastjson2.writer.ObjectWriter getObjectWriterVoid(com.alibaba.fastjson2.JSONWriter r9, java.lang.Class r10) {
            r8 = this;
            java.lang.String r0 = r8.format
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L25
            com.alibaba.fastjson2.JSONWriter$Context r0 = r9.context
            long r4 = r8.features
            long r6 = r0.getFeatures()
            long r4 = r4 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r6 = r6.mask
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L1d
            r4 = r2
            goto L1e
        L1d:
            r4 = r1
        L1e:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = r0.provider
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r0.getObjectWriterFromCache(r10, r10, r4)
            goto L26
        L25:
            r0 = r3
        L26:
            java.text.DecimalFormat r4 = r8.decimalFormat
            java.lang.Class<java.lang.Float[]> r5 = java.lang.Float[].class
            if (r10 != r5) goto L39
            if (r4 == 0) goto L36
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            r0.<init>(r5, r4)
            goto L67
        L36:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.FLOAT_ARRAY
            goto L67
        L39:
            java.lang.Class<java.lang.Double[]> r5 = java.lang.Double[].class
            if (r10 != r5) goto L4a
            if (r4 == 0) goto L47
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
            r0.<init>(r5, r4)
            goto L67
        L47:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r0 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DOUBLE_ARRAY
            goto L67
        L4a:
            java.lang.Class<float[]> r5 = float[].class
            if (r10 != r5) goto L59
            if (r4 == 0) goto L56
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray
            r0.<init>(r4)
            goto L67
        L56:
            com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray r0 = com.alibaba.fastjson2.writer.ObjectWriterImplFloatValueArray.INSTANCE
            goto L67
        L59:
            java.lang.Class<double[]> r5 = double[].class
            if (r10 != r5) goto L67
            if (r4 == 0) goto L65
            com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray
            r0.<init>(r4)
            goto L67
        L65:
            com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray r0 = com.alibaba.fastjson2.writer.ObjectWriterImplDoubleValueArray.INSTANCE
        L67:
            if (r0 != 0) goto L73
            java.lang.reflect.Type r0 = r8.fieldType
            java.lang.Class r4 = r8.fieldClass
            java.lang.String r5 = r8.format
            com.alibaba.fastjson2.writer.ObjectWriter r0 = com.alibaba.fastjson2.writer.FieldWriter.getObjectWriter(r0, r4, r5, r3, r10)
        L73:
            if (r0 != 0) goto L9b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriterObject, java.lang.Class> r4 = com.alibaba.fastjson2.writer.FieldWriterObject.initValueClassUpdater
        L77:
            boolean r0 = r4.compareAndSet(r8, r3, r10)
            if (r0 == 0) goto L7f
            r1 = r2
            goto L85
        L7f:
            java.lang.Object r0 = r4.get(r8)
            if (r0 == 0) goto L77
        L85:
            com.alibaba.fastjson2.writer.ObjectWriter r9 = r9.getObjectWriter(r10)
            if (r1 == 0) goto L9a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriter, com.alibaba.fastjson2.writer.ObjectWriter> r10 = com.alibaba.fastjson2.writer.FieldWriter.initObjectWriterUpdater
        L8d:
            boolean r0 = r10.compareAndSet(r8, r3, r9)
            if (r0 == 0) goto L94
            return r9
        L94:
            java.lang.Object r0 = r10.get(r8)
            if (r0 == 0) goto L8d
        L9a:
            return r9
        L9b:
            com.alibaba.fastjson2.writer.ObjectWriter r9 = r8.initObjectWriter
            if (r9 != 0) goto Lbd
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriterObject, java.lang.Class> r9 = com.alibaba.fastjson2.writer.FieldWriterObject.initValueClassUpdater
        La1:
            boolean r1 = r9.compareAndSet(r8, r3, r10)
            if (r1 == 0) goto Lb7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriter, com.alibaba.fastjson2.writer.ObjectWriter> r1 = com.alibaba.fastjson2.writer.FieldWriter.initObjectWriterUpdater
        La9:
            boolean r9 = r1.compareAndSet(r8, r3, r0)
            if (r9 == 0) goto Lb0
            return r0
        Lb0:
            java.lang.Object r9 = r1.get(r8)
            if (r9 == 0) goto La9
            return r0
        Lb7:
            java.lang.Object r1 = r9.get(r8)
            if (r1 == 0) goto La1
        Lbd:
            return r0
    }

    public static boolean typeMatch(java.lang.Class r1, java.lang.Class r2) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L8
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L40
        L8:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L10
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 == r0) goto L40
        L10:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L18
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 == r0) goto L40
        L18:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L20
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r2 == r0) goto L40
        L20:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto L28
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r2 == r0) goto L40
        L28:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L30
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r2 == r0) goto L40
        L30:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L38
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 == r0) goto L40
        L38:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L42
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            if (r2 != r1) goto L42
        L40:
            r1 = 1
            return r1
        L42:
            r1 = 0
            return r1
    }

    private boolean writeInternal(com.alibaba.fastjson2.JSONWriter r15, T r16) {
            r14 = this;
            r0 = r16
            long r2 = r14.features
            long r4 = r15.getFeatures()
            long r4 = r4 | r2
            boolean r2 = r14.fieldClassSerializable
            r8 = 0
            r3 = 0
            if (r2 != 0) goto L1a
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r6 = r2.mask
            long r6 = r6 & r4
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L1a
            return r3
        L1a:
            boolean r2 = r14.backReference
            if (r2 == 0) goto L25
            boolean r2 = r15.containsReference(r16)
            if (r2 == 0) goto L25
            return r3
        L25:
            java.lang.Object r2 = r14.getFieldValue(r0)     // Catch: java.lang.RuntimeException -> L17f
            r10 = 1
            if (r2 != 0) goto Laa
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r6 = r0.mask
            long r6 = r6 & r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L42
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r0.mask
            long r6 = r6 & r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L75
            boolean r0 = r14.number
            if (r0 != 0) goto L75
        L42:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteDefaultValue
            long r6 = r0.mask
            long r6 = r6 & r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L75
            r14.writeFieldName(r15)
            boolean r0 = r14.array
            if (r0 == 0) goto L56
            r15.writeArrayNull()
            goto L74
        L56:
            boolean r0 = r14.number
            if (r0 == 0) goto L5e
            r15.writeNumberNull()
            goto L74
        L5e:
            java.lang.Class r0 = r14.fieldClass
            java.lang.Class<java.lang.Appendable> r2 = java.lang.Appendable.class
            if (r0 == r2) goto L71
            java.lang.Class<java.lang.StringBuffer> r2 = java.lang.StringBuffer.class
            if (r0 == r2) goto L71
            java.lang.Class<java.lang.StringBuilder> r2 = java.lang.StringBuilder.class
            if (r0 != r2) goto L6d
            goto L71
        L6d:
            r15.writeObjectNull(r0)
            goto L74
        L71:
            r15.writeStringNull()
        L74:
            return r10
        L75:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero
            long r6 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r11 = r0.mask
            long r6 = r6 | r11
            long r6 = r6 & r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L8e
            boolean r0 = r14.number
            if (r0 == 0) goto L8e
            r14.writeFieldName(r15)
            r15.writeInt32(r3)
            return r10
        L8e:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse
            long r6 = r0.mask
            long r6 = r6 | r11
            long r4 = r4 & r6
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 == 0) goto La9
            java.lang.Class r0 = r14.fieldClass
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r0 == r2) goto La2
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r2 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r0 != r2) goto La9
        La2:
            r14.writeFieldName(r15)
            r15.writeBool(r3)
            return r10
        La9:
            return r3
        Laa:
            if (r2 != r0) goto Lbd
            java.lang.Class r6 = r14.fieldClass
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            if (r6 != r7) goto Lbd
            java.lang.reflect.Field r6 = r14.field
            if (r6 == 0) goto Lbd
            java.lang.Class r6 = r6.getDeclaringClass()
            if (r6 != r7) goto Lbd
            return r3
        Lbd:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r6 = r6.mask
            long r6 = r6 & r4
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto Lcb
            boolean r6 = r2 instanceof java.io.Serializable
            if (r6 != 0) goto Lcb
            return r3
        Lcb:
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreEmpty
            long r6 = r6.mask
            long r6 = r6 & r4
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto Lf0
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto Le2
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Le2
            return r3
        Le2:
            boolean r6 = r2 instanceof java.util.Map
            if (r6 == 0) goto Lf0
            r6 = r2
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lf0
            return r3
        Lf0:
            boolean r6 = r15.isRefDetect(r2)
            if (r6 == 0) goto L111
            if (r2 != r0) goto L101
            r14.writeFieldName(r15)
            java.lang.String r0 = ".."
            r15.writeReference(r0)
            return r10
        L101:
            java.lang.String r0 = r15.setPath(r14, r2)
            if (r0 == 0) goto L111
            r14.writeFieldName(r15)
            r15.writeReference(r0)
            r15.popPath(r2)
            return r10
        L111:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<byte[]> r3 = byte[].class
            if (r0 != r3) goto L11f
            byte[] r2 = (byte[]) r2
            r14.writeBinary(r15, r2)
            return r10
        L11f:
            com.alibaba.fastjson2.writer.ObjectWriter r7 = r14.getObjectWriter(r15, r0)
            if (r7 == 0) goto L174
            boolean r0 = r14.unwrapped
            if (r0 == 0) goto L137
            r1 = r14
            r3 = r2
            r2 = r15
            boolean r0 = r1.writeWithUnwrapped(r2, r3, r4, r6, r7)
            r2 = r3
            r11 = r6
            r3 = r0
            r0 = r7
            if (r3 == 0) goto L139
            return r10
        L137:
            r11 = r6
            r0 = r7
        L139:
            r14.writeFieldName(r15)
            boolean r3 = r15.jsonb
            long r5 = r14.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r12 = r4.mask
            long r12 = r12 & r5
            int r4 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r4 == 0) goto L15c
            r4 = r3
            java.lang.String r3 = r14.fieldName
            if (r4 == 0) goto L155
            java.lang.reflect.Type r4 = r14.fieldType
            r1 = r15
            r0.writeArrayMappingJSONB(r1, r2, r3, r4, r5)
            goto L16e
        L155:
            java.lang.reflect.Type r4 = r14.fieldType
            r1 = r15
            r0.writeArrayMapping(r1, r2, r3, r4, r5)
            goto L16e
        L15c:
            r4 = r3
            java.lang.String r3 = r14.fieldName
            if (r4 == 0) goto L168
            java.lang.reflect.Type r4 = r14.fieldType
            r1 = r15
            r0.writeJSONB(r1, r2, r3, r4, r5)
            goto L16e
        L168:
            java.lang.reflect.Type r4 = r14.fieldType
            r1 = r15
            r0.write(r1, r2, r3, r4, r5)
        L16e:
            if (r11 == 0) goto L173
            r15.popPath(r2)
        L173:
            return r10
        L174:
            java.lang.String r1 = "get objectWriter error : "
            java.lang.String r0 = p.a.k(r0, r1)
            ah.a.w(r0)
            r0 = 0
            return r0
        L17f:
            r0 = move-exception
            boolean r1 = r15.isIgnoreErrorGetter()
            if (r1 == 0) goto L187
            return r3
        L187:
            throw r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getInitWriter() {
            r1 = this;
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.initObjectWriter
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r4, java.lang.Class r5) {
            r3 = this;
            java.lang.Class r0 = r3.initValueClass
            if (r0 == 0) goto L4e
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r3.initObjectWriter
            com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE
            if (r1 != r2) goto Lb
            goto L4e
        Lb:
            if (r0 == r5) goto L2e
            boolean r1 = r3.writeUsing
            if (r1 == 0) goto L17
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L2e
        L17:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            if (r0 != r1) goto L21
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L2e
        L21:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 != r1) goto L2c
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L2c
            goto L2e
        L2c:
            r1 = 0
            goto L2f
        L2e:
            r1 = 1
        L2f:
            if (r1 != 0) goto L3b
            boolean r2 = r0.isPrimitive()
            if (r2 == 0) goto L3b
            boolean r1 = typeMatch(r0, r5)
        L3b:
            if (r1 == 0) goto L49
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r3.initObjectWriter
            if (r0 != 0) goto L46
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.getObjectWriterTypeMatch(r4, r5)
            return r4
        L46:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.initObjectWriter
            return r4
        L49:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.getObjectWriterTypeNotMatch(r4, r5)
            return r4
        L4e:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.getObjectWriterVoid(r4, r5)
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean unwrapped() {
            r1 = this;
            boolean r0 = r1.unwrapped
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r6, T r7) {
            r5 = this;
            com.alibaba.fastjson2.JSONWriter$Context r0 = r6.context
            long r1 = r0.getFeatures()
            long r3 = r5.features
            long r3 = r3 | r1
            r0.setFeatures(r3)
            boolean r6 = r5.writeInternal(r6, r7)
            r0.setFeatures(r1)
            return r6
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r9, T r10) {
            r8 = this;
            java.lang.Object r2 = r8.getFieldValue(r10)
            if (r2 != 0) goto La
            r9.writeNull()
            return
        La:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r8.initValueClass
            if (r1 != 0) goto L29
            r8.initValueClass = r0
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r8.getObjectWriter(r9, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.writer.FieldWriter, com.alibaba.fastjson2.writer.ObjectWriter> r3 = com.alibaba.fastjson2.writer.FieldWriter.initObjectWriterUpdater
        L1a:
            r4 = 0
            boolean r4 = r3.compareAndSet(r8, r4, r1)
            if (r4 == 0) goto L22
            goto L34
        L22:
            java.lang.Object r4 = r3.get(r8)
            if (r4 == 0) goto L1a
            goto L34
        L29:
            java.lang.Class r1 = r8.initValueClass
            if (r1 != r0) goto L30
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r8.initObjectWriter
            goto L34
        L30:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r9.getObjectWriter(r0)
        L34:
            if (r1 == 0) goto L91
            boolean r3 = r9.isRefDetect()
            if (r3 == 0) goto L45
            boolean r0 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r0)
            if (r0 != 0) goto L45
            r0 = 1
        L43:
            r7 = r0
            goto L47
        L45:
            r0 = 0
            goto L43
        L47:
            if (r7 == 0) goto L60
            if (r2 != r10) goto L51
            java.lang.String r10 = ".."
            r9.writeReference(r10)
            return
        L51:
            java.lang.String r10 = r8.fieldName
            java.lang.String r10 = r9.setPath(r10, r2)
            if (r10 == 0) goto L60
            r9.writeReference(r10)
            r9.popPath(r2)
            return
        L60:
            boolean r10 = r9.jsonb
            if (r10 == 0) goto L80
            boolean r10 = r9.isBeanToArray()
            java.lang.String r3 = r8.fieldName
            if (r10 == 0) goto L76
            java.lang.Class r4 = r8.fieldClass
            long r5 = r8.features
            r0 = r1
            r1 = r9
            r0.writeArrayMappingJSONB(r1, r2, r3, r4, r5)
            goto L8b
        L76:
            r0 = r1
            r1 = r9
            java.lang.Class r4 = r8.fieldClass
            long r5 = r8.features
            r0.writeJSONB(r1, r2, r3, r4, r5)
            goto L8b
        L80:
            r0 = r1
            r1 = r9
            java.lang.String r3 = r8.fieldName
            java.lang.Class r4 = r8.fieldClass
            long r5 = r8.features
            r0.write(r1, r2, r3, r4, r5)
        L8b:
            if (r7 == 0) goto L90
            r1.popPath(r2)
        L90:
            return
        L91:
            java.lang.String r9 = "get value writer error, valueType : "
            java.lang.String r9 = p.a.k(r0, r9)
            ah.a.w(r9)
            return
    }

    public final boolean writeWithUnwrapped(com.alibaba.fastjson2.JSONWriter r9, java.lang.Object r10, long r11, boolean r13, com.alibaba.fastjson2.writer.ObjectWriter r14) {
            r8 = this;
            boolean r0 = r10 instanceof java.util.Map
            r1 = 1
            if (r0 == 0) goto L58
            boolean r14 = r9.jsonb
            r0 = r10
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L38
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r4.mask
            long r4 = r4 & r11
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L38
            goto L12
        L38:
            r9.writeName(r3)
            if (r14 != 0) goto L40
            r9.writeColon()
        L40:
            if (r2 != 0) goto L46
            r9.writeNull()
            goto L12
        L46:
            java.lang.Class r3 = r2.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r9.getObjectWriter(r3)
            r3.write(r9, r2)
            goto L12
        L52:
            if (r13 == 0) goto L57
            r9.popPath(r10)
        L57:
            return r1
        L58:
            boolean r11 = r14 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r11 == 0) goto L75
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r14 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r14
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r11 = r14.fieldWriters
            java.util.Iterator r11 = r11.iterator()
        L64:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L74
            java.lang.Object r12 = r11.next()
            com.alibaba.fastjson2.writer.FieldWriter r12 = (com.alibaba.fastjson2.writer.FieldWriter) r12
            r12.write(r9, r10)
            goto L64
        L74:
            return r1
        L75:
            r9 = 0
            return r9
    }
}
