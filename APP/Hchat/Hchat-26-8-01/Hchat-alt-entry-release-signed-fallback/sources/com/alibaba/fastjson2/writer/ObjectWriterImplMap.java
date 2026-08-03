package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterImplMap extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    static final com.alibaba.fastjson2.writer.ObjectWriterImplMap INSTANCE = null;
    static com.alibaba.fastjson2.writer.ObjectWriterImplMap INSTANCE_1x;
    static final long TYPE_HASH_JSONObject1O = 0;
    static final byte[] TYPE_NAME_JSONObject1O = null;
    final boolean contentAs;
    final long features;
    final java.lang.String format;
    final boolean jsonObject1;
    final java.lang.reflect.Field jsonObject1InnerMap;
    long jsonObject1InnerMapOffset;
    final byte[] jsonbTypeInfo;
    final java.lang.reflect.Type keyType;
    volatile com.alibaba.fastjson2.writer.ObjectWriter keyWriter;
    final java.lang.Class objectClass;
    final java.lang.reflect.Type objectType;
    final char[] typeInfoUTF16;
    final byte[] typeInfoUTF8;
    final long typeNameHash;
    final java.lang.reflect.Type valueType;
    final boolean valueTypeRefDetect;
    volatile com.alibaba.fastjson2.writer.ObjectWriter valueWriter;

    static {
            java.lang.String r0 = "JO10"
            byte[] r1 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplMap.TYPE_NAME_JSONObject1O = r1
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.writer.ObjectWriterImplMap.TYPE_HASH_JSONObject1O = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r6 = com.alibaba.fastjson2.JSONObject.class
            r7 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r5 = com.alibaba.fastjson2.JSONObject.class
            r2.<init>(r3, r4, r5, r6, r7)
            com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE = r2
            return
    }

    public ObjectWriterImplMap(java.lang.Class r8, long r9) {
            r7 = this;
            r1 = 0
            r2 = 0
            r4 = r8
            r0 = r7
            r3 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ObjectWriterImplMap(java.lang.reflect.Type r9, java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, long r13) {
            r8 = this;
            r3 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ObjectWriterImplMap(java.lang.reflect.Type r3, java.lang.reflect.Type r4, java.lang.String r5, java.lang.Class r6, java.lang.reflect.Type r7, long r8) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.jsonObject1InnerMapOffset = r0
            r2.keyType = r3
            r2.valueType = r4
            r2.format = r5
            r2.objectClass = r6
            r2.objectType = r7
            r2.features = r8
            r3 = 1
            if (r4 != 0) goto L19
            r2.valueTypeRefDetect = r3
            goto L24
        L19:
            java.lang.Class r4 = com.alibaba.fastjson2.util.TypeUtils.getClass(r4)
            boolean r4 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r4)
            r4 = r4 ^ r3
            r2.valueTypeRefDetect = r4
        L24:
            r4 = -9223372036854775808
            long r4 = r4 & r8
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L2f
            r4 = r3
            goto L30
        L2f:
            r4 = 0
        L30:
            r2.contentAs = r4
            java.lang.String r4 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "\"@type\":\""
            r5.<init>(r7)
            java.lang.String r7 = r6.getName()
            r5.append(r7)
            java.lang.String r7 = "\""
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            char[] r7 = r5.toCharArray()
            r2.typeInfoUTF16 = r7
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r7)
            r2.typeInfoUTF8 = r5
            java.lang.String r5 = "JO1"
            boolean r5 = r5.equals(r4)
            r2.jsonObject1 = r5
            byte[] r7 = com.alibaba.fastjson2.JSONB.toBytes(r4)
            r2.jsonbTypeInfo = r7
            long r7 = com.alibaba.fastjson2.util.Fnv.hashCode64(r4)
            r2.typeNameHash = r7
            if (r5 == 0) goto L84
            java.lang.String r4 = "map"
            java.lang.reflect.Field r4 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r6, r4)
            r2.jsonObject1InnerMap = r4
            if (r4 == 0) goto L83
            r4.setAccessible(r3)
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r3.objectFieldOffset(r4)
        L83:
            return
        L84:
            r3 = 0
            r2.jsonObject1InnerMap = r3
            return
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplMap getINSTANCE1() {
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE_1x
            if (r0 != 0) goto L1c
            java.lang.Class r4 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r4 != 0) goto Le
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE_1x = r0
            goto L1c
        Le:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r6 = 0
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r5 = r4
            r1.<init>(r2, r3, r4, r5, r6)
            com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE_1x = r1
        L1c:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE_1x
            return r0
    }

    public static boolean isWriteAsString(java.lang.Object r4, long r5) {
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringKeyAsString
            long r0 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible
            long r2 = r2.mask
            long r0 = r0 | r2
            long r5 = r5 & r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L24
            java.lang.Class r5 = r4.getClass()
            boolean r5 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isPrimitiveOrEnum(r5)
            if (r5 == 0) goto L24
            boolean r5 = r4 instanceof java.time.temporal.Temporal
            if (r5 != 0) goto L24
            boolean r4 = r4 instanceof java.util.Date
            if (r4 != 0) goto L24
            r4 = 1
            return r4
        L24:
            r4 = 0
            return r4
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplMap of(java.lang.Class r7) {
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r0 = com.alibaba.fastjson2.JSONObject.class
            if (r7 != r0) goto L7
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r7 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE
            return r7
        L7:
            java.lang.Class r0 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r7 != r0) goto L12
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r7 = getINSTANCE1()
            return r7
        L12:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            r2 = 0
            r5 = 0
            r1 = 0
            r4 = r7
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplMap of(java.lang.reflect.Type r3) {
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            r1 = 0
            r0.<init>(r3, r1)
            return r0
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplMap of(java.lang.reflect.Type r1, java.lang.Class r2) {
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = of(r1, r0, r2)
            return r1
    }

    public static com.alibaba.fastjson2.writer.ObjectWriterImplMap of(java.lang.reflect.Type r10, java.lang.String r11, java.lang.Class r12) {
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1b
            r0 = r10
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r0.getRawType()
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L1b
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            r4 = r0
            r3 = r1
            goto L1e
        L1b:
            r1 = 0
            r3 = r1
            r4 = r3
        L1e:
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplMap
            r8 = 0
            r7 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    public java.lang.String mapKeyToString(java.lang.Object r2, com.alibaba.fastjson2.JSONWriter r3, long r4) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L4c
            boolean r0 = r2 instanceof java.lang.Long
            if (r0 == 0) goto L14
            goto L4c
        L14:
            boolean r4 = isWriteAsString(r2, r4)
            if (r4 == 0) goto L1f
            java.lang.String r2 = r2.toString()
            return r2
        L1f:
            com.alibaba.fastjson2.JSONWriter$Context r4 = r3.getContext()
            java.lang.String r2 = com.alibaba.fastjson2.JSON.toJSONString(r2, r4)
            if (r2 == 0) goto L4b
            int r4 = r2.length()
            r5 = 1
            if (r4 <= r5) goto L4b
            boolean r3 = r3.useSingleQuote
            if (r3 == 0) goto L37
            r3 = 39
            goto L39
        L37:
            r3 = 34
        L39:
            r0 = 0
            char r0 = r2.charAt(r0)
            if (r0 != r3) goto L4b
            int r4 = r4 - r5
            char r0 = r2.charAt(r4)
            if (r0 != r3) goto L4b
            java.lang.String r2 = r2.substring(r5, r4)
        L4b:
            return r2
        L4c:
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r24, java.lang.Object r25, java.lang.Object r26, java.lang.reflect.Type r27, long r28) {
            r23 = this;
            r0 = r23
            r2 = r24
            r8 = r25
            r1 = r27
            r3 = r28
            boolean r5 = r2.jsonb
            if (r5 == 0) goto L12
            r23.writeJSONB(r24, r25, r26, r27, r28)
            return
        L12:
            boolean r5 = r23.hasFilter(r24)
            if (r5 == 0) goto L1c
            r23.writeWithFilter(r24, r25, r26, r27, r28)
            return
        L1c:
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5
            boolean r9 = r2.isRefDetect()
            java.lang.reflect.Type r6 = r0.objectType
            if (r1 != r6) goto L2f
            java.lang.Class r6 = r0.objectClass
            boolean r6 = r2.isWriteMapTypeInfo(r8, r6, r3)
            if (r6 != 0) goto L35
        L2f:
            boolean r1 = r2.isWriteTypeInfo(r8, r1, r3)
            if (r1 == 0) goto L37
        L35:
            r1 = 1
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L48
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L48
            r1 = 123(0x7b, float:1.72E-43)
            r3 = 125(0x7d, float:1.75E-43)
            r2.writeRaw(r1, r3)
            return
        L48:
            r2.startObject()
            if (r1 == 0) goto L50
            r23.writeTypeInfo(r24)
        L50:
            long r6 = r2.getFeatures()
            long r12 = r3 | r6
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.MapSortField
            long r3 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.SortMapEntriesByKeys
            long r6 = r1.mask
            long r3 = r3 | r6
            long r3 = r3 & r12
            r14 = 0
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L7f
            boolean r3 = r5 instanceof java.util.SortedMap
            if (r3 != 0) goto L7f
            java.lang.Class r3 = r5.getClass()
            java.lang.Class<java.util.LinkedHashMap> r4 = java.util.LinkedHashMap.class
            if (r3 != r4) goto L79
            long r3 = r1.mask
            long r3 = r3 & r12
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 == 0) goto L7f
        L79:
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>(r5)
            r5 = r1
        L7f:
            com.alibaba.fastjson2.JSONWriter$Context r1 = r2.context
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = r1.provider
            java.util.Set r3 = r5.entrySet()
            java.util.Iterator r16 = r3.iterator()
        L8b:
            boolean r3 = r16.hasNext()
            if (r3 == 0) goto L1e6
            java.lang.Object r3 = r16.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            if (r4 != 0) goto Lb4
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r4.mask
            long r4 = r4 & r12
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L8b
            r0.writeMapKey(r3, r2, r12)
            r2.writeColon()
            r2.writeNull()
            goto L8b
        Lb4:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r5 = r5.mask
            long r5 = r5 & r12
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto Ldc
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto Lcb
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Lcb
            goto L8b
        Lcb:
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r5.isArray()
            if (r5 == 0) goto Ldc
            int r5 = java.lang.reflect.Array.getLength(r4)
            if (r5 != 0) goto Ldc
            goto L8b
        Ldc:
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r0.keyWriter
            r6 = 0
            if (r5 == 0) goto Lf9
            r5 = r1
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.keyWriter
            r7 = r5
            r5 = 0
            r18 = r6
            r17 = r7
            r6 = 0
            r19 = r4
            r4 = 0
            r11 = r17
            r10 = r18
            r1.write(r2, r3, r4, r5, r6)
            r4 = r3
            r6 = r10
            goto L102
        Lf9:
            r11 = r1
            r19 = r4
            r10 = r6
            r4 = r3
            java.lang.String r6 = r0.writeMapKey(r4, r2, r12)
        L102:
            r2.writeColon()
            boolean r1 = r0.contentAs
            if (r1 == 0) goto L10e
            java.lang.reflect.Type r1 = r0.valueType
            java.lang.Class r1 = (java.lang.Class) r1
            goto L112
        L10e:
            java.lang.Class r1 = r19.getClass()
        L112:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 != r3) goto L120
            r4 = r19
            java.lang.String r4 = (java.lang.String) r4
            r2.writeString(r4)
        L11d:
            r1 = r11
            goto L8b
        L120:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r1 != r3) goto L12c
            r4 = r19
            java.lang.Integer r4 = (java.lang.Integer) r4
            r2.writeInt32(r4)
            goto L11d
        L12c:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r1 != r3) goto L150
            long r3 = r11.userDefineMask
            r20 = 4
            long r3 = r3 & r20
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 != 0) goto L142
            r4 = r19
            java.lang.Long r4 = (java.lang.Long) r4
            r2.writeInt64(r4)
            goto L11d
        L142:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            r4 = r6
            r6 = r12
            r3 = r19
            r1.write(r2, r3, r4, r5, r6)
            goto L11d
        L150:
            r3 = r19
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r1 != r5) goto L161
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            r2.writeBool(r1)
            goto L11d
        L161:
            java.lang.Class<java.math.BigDecimal> r5 = java.math.BigDecimal.class
            if (r1 != r5) goto L182
            long r5 = r11.userDefineMask
            r18 = 8
            long r5 = r5 & r18
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 != 0) goto L176
            r4 = r3
            java.math.BigDecimal r4 = (java.math.BigDecimal) r4
            r2.writeDecimal(r4, r12, r10)
            goto L11d
        L176:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
            java.lang.reflect.Type r5 = r0.valueType
            long r6 = r0.features
            r1.write(r2, r3, r4, r5, r6)
            goto L11d
        L182:
            java.lang.reflect.Type r5 = r0.valueType
            if (r1 != r5) goto L19a
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r0.valueWriter
            if (r5 == 0) goto L18d
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.valueWriter
            goto L191
        L18d:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r2.getObjectWriter(r1)
        L191:
            java.lang.Class r5 = r3.getClass()
            boolean r5 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isPrimitiveOrEnum(r5)
            goto L1b6
        L19a:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r5 = com.alibaba.fastjson2.JSONObject.class
            if (r1 != r5) goto L1a2
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE
        L1a0:
            r5 = 0
            goto L1b6
        L1a2:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r5 = com.alibaba.fastjson2.JSONArray.class
            if (r1 != r5) goto L1a9
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE
            goto L1a0
        L1a9:
            com.alibaba.fastjson2.writer.ObjectWriter r5 = r2.getObjectWriter(r1)
            boolean r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isPrimitiveOrEnum(r1)
            r22 = r5
            r5 = r1
            r1 = r22
        L1b6:
            if (r9 == 0) goto L1be
            if (r6 == 0) goto L1be
            if (r5 != 0) goto L1be
            r10 = 1
            goto L1bf
        L1be:
            r10 = 0
        L1bf:
            if (r10 == 0) goto L1d8
            if (r3 != r8) goto L1ca
            java.lang.String r1 = ".."
            r2.writeReference(r1)
            goto L11d
        L1ca:
            java.lang.String r5 = r2.setPath(r6, r3)
            if (r5 == 0) goto L1d8
            r2.writeReference(r5)
            r2.popPath(r3)
            goto L11d
        L1d8:
            java.lang.reflect.Type r5 = r0.valueType
            long r6 = r0.features
            r1.write(r2, r3, r4, r5, r6)
            if (r10 == 0) goto L11d
            r2.popPath(r3)
            goto L11d
        L1e6:
            r2.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            java.util.Map r9 = (java.util.Map) r9
            r8.startObject()
            boolean r10 = r8.isWriteNulls()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L11:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L53
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            r3 = r12
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r11.getValue()
            if (r2 != 0) goto L33
            if (r10 == 0) goto L11
            r8.writeString(r3)
            r8.writeNull()
            goto L11
        L33:
            r8.writeString(r3)
            java.lang.Class r11 = r2.getClass()
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            if (r11 != r12) goto L45
            java.lang.String r2 = (java.lang.String) r2
            r8.writeString(r2)
            r1 = r8
            goto L51
        L45:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r8.getObjectWriter(r11)
            java.lang.reflect.Type r4 = r7.valueType
            long r5 = r7.features
            r1 = r8
            r0.writeJSONB(r1, r2, r3, r4, r5)
        L51:
            r8 = r1
            goto L11
        L53:
            r1 = r8
            r1.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r28, java.lang.Object r29, java.lang.Object r30, java.lang.reflect.Type r31, long r32) {
            r27 = this;
            r0 = r27
            r2 = r28
            r8 = r29
            r1 = r31
            r3 = r32
            java.lang.reflect.Type r5 = r0.objectType
            if (r1 != r5) goto L16
            java.lang.Class r5 = r0.objectClass
            boolean r5 = r2.isWriteMapTypeInfo(r8, r5, r3)
            if (r5 != 0) goto L1c
        L16:
            boolean r3 = r2.isWriteTypeInfo(r8, r1, r3)
            if (r3 == 0) goto L4a
        L1c:
            java.lang.reflect.Field r3 = r0.jsonObject1InnerMap
            if (r3 == 0) goto L38
            long r4 = r0.jsonObject1InnerMapOffset
            r6 = -1
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L31
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            java.lang.Object r3 = r3.getObject(r8, r4)
            boolean r3 = r3 instanceof java.util.LinkedHashMap
            goto L39
        L31:
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.IllegalAccessException -> L38
            boolean r3 = r3 instanceof java.util.LinkedHashMap     // Catch: java.lang.IllegalAccessException -> L38
            goto L39
        L38:
            r3 = 0
        L39:
            if (r3 == 0) goto L43
            byte[] r3 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.TYPE_NAME_JSONObject1O
            long r4 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.TYPE_HASH_JSONObject1O
            r2.writeTypeName(r3, r4)
            goto L4a
        L43:
            byte[] r3 = r0.jsonbTypeInfo
            long r4 = r0.typeNameHash
            r2.writeTypeName(r3, r4)
        L4a:
            r10 = r8
            java.util.Map r10 = (java.util.Map) r10
            com.alibaba.fastjson2.JSONWriter$Context r3 = r2.context
            r2.startObject()
            java.lang.reflect.Type r4 = r0.valueType
            java.lang.reflect.Type r5 = r0.objectType
            r11 = 1
            if (r1 != r5) goto L5b
        L59:
            r12 = r4
            goto L6c
        L5b:
            boolean r5 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L59
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            int r5 = r1.length
            r6 = 2
            if (r5 != r6) goto L59
            r4 = r1[r11]
            goto L59
        L6c:
            long r13 = r3.getFeatures()
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r1.mask
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r1.mask
            long r4 = r4 | r6
            long r4 = r4 & r13
            r15 = 0
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 == 0) goto L83
            r17 = r11
            goto L85
        L83:
            r17 = 0
        L85:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r1.mask
            long r4 = r4 & r13
            int r1 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r1 == 0) goto L90
            r1 = r11
            goto L91
        L90:
            r1 = 0
        L91:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r3 = r3.provider
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r4 = r4.mask
            long r4 = r4 & r13
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 == 0) goto L9f
            r18 = r11
            goto La1
        L9f:
            r18 = 0
        La1:
            java.util.Set r4 = r10.entrySet()
            java.util.Iterator r19 = r4.iterator()
            r20 = 0
            r5 = r20
            r21 = r5
            r4 = 0
        Lb0:
            boolean r6 = r19.hasNext()
            if (r6 == 0) goto L2bc
            java.lang.Object r6 = r19.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            r30 = r15
            java.lang.Object r15 = r6.getValue()
            if (r15 != 0) goto L142
            if (r17 == 0) goto L139
            boolean r15 = r7 instanceof java.lang.String
            if (r15 == 0) goto Lda
            java.lang.String r7 = (java.lang.String) r7
            r2.writeString(r7)
            r15 = r1
            r25 = r3
            r26 = r4
            r11 = r5
            goto L12c
        Lda:
            java.lang.Class r15 = r7.getClass()
            if (r18 == 0) goto Le9
            boolean r16 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r15)
            if (r16 != 0) goto Le9
            r16 = r11
            goto Leb
        Le9:
            r16 = 0
        Leb:
            if (r16 == 0) goto Lf7
            r2.setPath(r4, r6)
            java.lang.String r11 = "key"
            java.lang.String r11 = r2.setPath(r11, r7)
            goto Lf9
        Lf7:
            r11 = r20
        Lf9:
            if (r11 == 0) goto L107
            r2.writeReference(r11)
            r15 = r1
            r25 = r3
            r26 = r4
            r11 = r5
            r9 = r6
            r3 = r7
            goto L124
        L107:
            com.alibaba.fastjson2.writer.ObjectWriter r11 = r3.getObjectWriter(r15, r15, r1)
            r15 = r5
            r5 = 0
            r23 = r3
            r22 = r6
            r3 = r7
            r6 = 0
            r24 = r4
            r4 = 0
            r9 = r15
            r15 = r1
            r1 = r11
            r11 = r9
            r9 = r22
            r25 = r23
            r26 = r24
            r1.writeJSONB(r2, r3, r4, r5, r6)
        L124:
            if (r16 == 0) goto L12c
            r2.popPath(r9)
            r2.popPath(r3)
        L12c:
            r2.writeNull()
            r33 = r12
            r9 = r15
            r12 = r25
        L134:
            r6 = r26
            r4 = 0
            goto L253
        L139:
            r11 = r5
            r9 = r1
            r6 = r4
            r33 = r12
            r4 = 0
            r12 = r3
            goto L253
        L142:
            r9 = r1
            r25 = r3
            r26 = r4
            r11 = r5
            r3 = r7
            boolean r1 = r3 instanceof java.lang.String
            if (r1 != 0) goto L156
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r4 = r4.mask
            long r4 = r4 & r13
            int r4 = (r4 > r30 ? 1 : (r4 == r30 ? 0 : -1))
            if (r4 != 0) goto L15d
        L156:
            r16 = r1
            r33 = r12
            r12 = r25
            goto L192
        L15d:
            if (r3 != 0) goto L169
            r2.writeNull()
            r16 = r1
            r33 = r12
            r12 = r25
            goto L1b0
        L169:
            if (r18 == 0) goto L171
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            r5 = 0
            r2.config(r4, r5)
        L171:
            java.lang.Class r4 = r3.getClass()
            r5 = r25
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r5.getObjectWriter(r4, r4, r9)
            r5 = 0
            r6 = 0
            r16 = r1
            r1 = r4
            r4 = 0
            r33 = r12
            r12 = r25
            r1.writeJSONB(r2, r3, r4, r5, r6)
            if (r18 == 0) goto L1b0
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            r4 = 1
            r2.config(r1, r4)
            goto L1b0
        L192:
            if (r16 == 0) goto L198
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L19c
        L198:
            java.lang.String r7 = r3.toString()
        L19c:
            com.alibaba.fastjson2.SymbolTable r1 = r2.symbolTable
            if (r1 == 0) goto L1ad
            r2.writeSymbol(r7)
            boolean r1 = r15 instanceof java.lang.String
            if (r1 == 0) goto L1b0
            java.lang.String r15 = (java.lang.String) r15
            r2.writeSymbol(r15)
            goto L134
        L1ad:
            r2.writeString(r7)
        L1b0:
            boolean r1 = r0.contentAs
            if (r1 == 0) goto L1ba
            java.lang.reflect.Type r1 = r0.valueType
            java.lang.Class r1 = (java.lang.Class) r1
        L1b8:
            r5 = r1
            goto L1bf
        L1ba:
            java.lang.Class r1 = r15.getClass()
            goto L1b8
        L1bf:
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            if (r5 != r1) goto L1ca
            java.lang.String r15 = (java.lang.String) r15
            r2.writeString(r15)
            goto L134
        L1ca:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            if (r5 != r1) goto L1d5
            java.lang.Integer r15 = (java.lang.Integer) r15
            r2.writeInt32(r15)
            goto L134
        L1d5:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            if (r5 != r1) goto L1e0
            java.lang.Long r15 = (java.lang.Long) r15
            r2.writeInt64(r15)
            goto L134
        L1e0:
            java.lang.reflect.Type r1 = r0.valueType
            if (r5 != r1) goto L1ee
            if (r18 == 0) goto L1ec
            boolean r1 = r0.valueTypeRefDetect
            if (r1 == 0) goto L1ec
        L1ea:
            r1 = 1
            goto L1f7
        L1ec:
            r1 = 0
            goto L1f7
        L1ee:
            if (r18 == 0) goto L1ec
            boolean r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r5)
            if (r1 != 0) goto L1ec
            goto L1ea
        L1f7:
            if (r1 == 0) goto L25e
            if (r15 != r8) goto L202
            java.lang.String r1 = ".."
            r2.writeReference(r1)
            goto L134
        L202:
            if (r16 == 0) goto L212
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r2.setPath(r7, r15)
        L20b:
            r7 = r4
            r6 = r26
            r4 = 0
            r22 = 0
            goto L24b
        L212:
            java.lang.Class r4 = r3.getClass()
            boolean r4 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isPrimitiveOrEnum(r4)
            if (r4 == 0) goto L225
            java.lang.String r4 = r3.toString()
            java.lang.String r4 = r2.setPath(r4, r15)
            goto L20b
        L225:
            int r4 = r10.size()
            r6 = 1
            if (r4 == r6) goto L242
            boolean r4 = r10 instanceof java.util.SortedMap
            if (r4 != 0) goto L242
            boolean r4 = r10 instanceof java.util.LinkedHashMap
            if (r4 != 0) goto L242
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            r4 = 0
            r2.config(r1, r4)
            r1 = r4
            r7 = r20
            r6 = r26
            r22 = 1
            goto L24b
        L242:
            r4 = 0
            r6 = r26
            java.lang.String r7 = r2.setPath(r6, r15)
            r22 = r4
        L24b:
            if (r7 == 0) goto L25b
            r2.writeReference(r7)
            r2.popPath(r15)
        L253:
            r5 = r33
            r15 = r4
            r26 = r6
            r4 = 1
            goto L2b0
        L25b:
            r16 = r1
            goto L264
        L25e:
            r6 = r26
            r4 = 0
            r22 = r4
            goto L25b
        L264:
            java.lang.reflect.Type r1 = r0.valueType
            if (r5 != r1) goto L271
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.valueWriter
            if (r1 == 0) goto L271
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.valueWriter
        L26e:
            r26 = r6
            goto L296
        L271:
            if (r11 != r5) goto L278
            r26 = r6
            r1 = r21
            goto L296
        L278:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            if (r5 != r1) goto L27f
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r1 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.INSTANCE
            goto L28a
        L27f:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r1 = com.alibaba.fastjson2.JSONArray.class
            if (r5 != r1) goto L286
            com.alibaba.fastjson2.writer.ObjectWriterImplList r1 = com.alibaba.fastjson2.writer.ObjectWriterImplList.INSTANCE
            goto L28a
        L286:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r12.getObjectWriter(r5, r5, r9)
        L28a:
            if (r21 != 0) goto L28f
            r21 = r1
            r11 = r5
        L28f:
            java.lang.reflect.Type r7 = r0.valueType
            if (r5 != r7) goto L26e
            r0.valueWriter = r1
            goto L26e
        L296:
            long r6 = r0.features
            r5 = r4
            r4 = r3
            r3 = r15
            r15 = r5
            r5 = r33
            r1.writeJSONB(r2, r3, r4, r5, r6)
            if (r22 == 0) goto L2aa
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            r4 = 1
            r2.config(r1, r4)
            goto L2b0
        L2aa:
            r4 = 1
            if (r16 == 0) goto L2b0
            r2.popPath(r3)
        L2b0:
            int r1 = r26 + 1
            r15 = r30
            r3 = r12
            r12 = r5
            r5 = r11
            r11 = r4
            r4 = r1
            r1 = r9
            goto Lb0
        L2bc:
            r2.endObject()
            return
    }

    public java.lang.String writeMapKey(java.lang.Object r3, com.alibaba.fastjson2.JSONWriter r4, long r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L9
            java.lang.String r3 = "null"
            r4.writeName(r3)
            return r0
        L9:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L13
            java.lang.String r3 = (java.lang.String) r3
            r4.writeName(r3)
            return r3
        L13:
            boolean r5 = isWriteAsString(r3, r5)
            if (r5 == 0) goto L21
            java.lang.String r3 = r3.toString()
            r4.writeName(r3)
            return r3
        L21:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L2f
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4.writeName(r3)
            return r0
        L2f:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L3d
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            r4.writeName(r5)
            return r0
        L3d:
            r4.writeNameAny(r3)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(com.alibaba.fastjson2.JSONWriter r2) {
            r1 = this;
            boolean r0 = r2.utf8
            if (r0 == 0) goto La
            byte[] r0 = r1.typeInfoUTF8
            r2.writeNameRaw(r0)
            goto Lf
        La:
            char[] r0 = r1.typeInfoUTF16
            r2.writeNameRaw(r0)
        Lf:
            r2 = 1
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeWithFilter(com.alibaba.fastjson2.JSONWriter r20, java.lang.Object r21, java.lang.Object r22, java.lang.reflect.Type r23, long r24) {
            r19 = this;
            r1 = r19
            r3 = r20
            r0 = r21
            if (r0 != 0) goto Lc
            r3.writeNull()
            return
        Lc:
            r3.startObject()
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            long r4 = r3.getFeatures()
            long r9 = r24 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.MapSortField
            long r4 = r4.mask
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.SortMapEntriesByKeys
            long r7 = r6.mask
            long r4 = r4 | r7
            long r4 = r4 & r9
            r11 = 0
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L41
            boolean r4 = r2 instanceof java.util.SortedMap
            if (r4 != 0) goto L41
            java.lang.Class r4 = r2.getClass()
            java.lang.Class<java.util.LinkedHashMap> r5 = java.util.LinkedHashMap.class
            if (r4 != r5) goto L3b
            long r4 = r6.mask
            long r4 = r4 & r9
            int r4 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r4 == 0) goto L41
        L3b:
            java.util.TreeMap r4 = new java.util.TreeMap
            r4.<init>(r2)
            r2 = r4
        L41:
            com.alibaba.fastjson2.JSONWriter$Context r4 = r3.context
            com.alibaba.fastjson2.filter.BeforeFilter r5 = r4.getBeforeFilter()
            if (r5 == 0) goto L4c
            r5.writeBefore(r3, r0)
        L4c:
            com.alibaba.fastjson2.filter.PropertyPreFilter r13 = r4.getPropertyPreFilter()
            com.alibaba.fastjson2.filter.NameFilter r14 = r4.getNameFilter()
            com.alibaba.fastjson2.filter.ValueFilter r15 = r4.getValueFilter()
            com.alibaba.fastjson2.filter.PropertyFilter r5 = r4.getPropertyFilter()
            com.alibaba.fastjson2.filter.AfterFilter r6 = r4.getAfterFilter()
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r7 = r7.mask
            boolean r16 = r4.isEnabled(r7)
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r7 = r7.mask
            boolean r17 = r4.isEnabled(r7)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r18 = r2.iterator()
        L78:
            boolean r2 = r18.hasNext()
            if (r2 == 0) goto L125
            java.lang.Object r2 = r18.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getValue()
            if (r4 != 0) goto L8d
            if (r16 != 0) goto L8d
            goto L78
        L8d:
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = r1.mapKeyToString(r2, r3, r9)
            if (r17 == 0) goto Laa
            java.lang.String r7 = r3.setPath(r2, r4)
            if (r7 == 0) goto Laa
            r3.writeName(r2)
            r3.writeColon()
            r3.writeReference(r7)
            r3.popPath(r4)
            goto L78
        Laa:
            if (r13 == 0) goto Lbb
            boolean r7 = r13.process(r3, r0, r2)     // Catch: java.lang.Throwable -> Lb8
            if (r7 != 0) goto Lbb
            if (r17 == 0) goto L78
        Lb4:
            r3.popPath(r4)
            goto L78
        Lb8:
            r0 = move-exception
            goto L11f
        Lbb:
            if (r14 == 0) goto Lc1
            java.lang.String r2 = r14.process(r0, r2, r4)     // Catch: java.lang.Throwable -> Lb8
        Lc1:
            if (r5 == 0) goto Lcc
            boolean r7 = r5.apply(r0, r2, r4)     // Catch: java.lang.Throwable -> Lb8
            if (r7 != 0) goto Lcc
            if (r17 == 0) goto L78
            goto Lb4
        Lcc:
            if (r15 == 0) goto Ld2
            java.lang.Object r4 = r15.apply(r0, r2, r4)     // Catch: java.lang.Throwable -> Lb8
        Ld2:
            if (r4 != 0) goto Leb
            long r7 = r3.getFeatures(r9)     // Catch: java.lang.Throwable -> Lb8
            r24 = r11
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls     // Catch: java.lang.Throwable -> Lb8
            long r11 = r11.mask     // Catch: java.lang.Throwable -> Lb8
            long r7 = r7 & r11
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 != 0) goto Led
            if (r17 == 0) goto Le8
            r3.popPath(r4)
        Le8:
            r11 = r24
            goto L78
        Leb:
            r24 = r11
        Led:
            r3.writeName(r2)     // Catch: java.lang.Throwable -> Lb8
            r3.writeColon()     // Catch: java.lang.Throwable -> Lb8
            if (r4 != 0) goto Lfb
            r3.writeNull()     // Catch: java.lang.Throwable -> Lb8
            r11 = r5
            r12 = r6
            goto L117
        Lfb:
            boolean r2 = r1.contentAs     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L104
            java.lang.reflect.Type r2 = r1.valueType     // Catch: java.lang.Throwable -> Lb8
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> Lb8
            goto L108
        L104:
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> Lb8
        L108:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r3.getObjectWriter(r2)     // Catch: java.lang.Throwable -> Lb8
            long r7 = r1.features     // Catch: java.lang.Throwable -> Lb8
            r11 = r5
            r12 = r6
            r5 = r22
            r6 = r23
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb8
        L117:
            if (r17 == 0) goto L11c
            r3.popPath(r4)
        L11c:
            r5 = r11
            r6 = r12
            goto Le8
        L11f:
            if (r17 == 0) goto L124
            r3.popPath(r4)
        L124:
            throw r0
        L125:
            r12 = r6
            if (r12 == 0) goto L12b
            r12.writeAfter(r3, r0)
        L12b:
            r3.endObject()
            return
    }
}
