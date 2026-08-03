package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderNoneDefaultConstructor<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    private final java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> creator;
    final java.lang.String[] paramNames;
    final com.alibaba.fastjson2.reader.FieldReader[] setterFieldReaders;

    public ObjectReaderNoneDefaultConstructor(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> r18, java.lang.String[] r19, com.alibaba.fastjson2.reader.FieldReader[] r20, com.alibaba.fastjson2.reader.FieldReader[] r21, java.lang.Class[] r22, java.lang.String[] r23) {
            r12 = this;
            r10 = 0
            com.alibaba.fastjson2.reader.FieldReader[] r11 = concat(r20, r21)
            r6 = 0
            r7 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r8 = r22
            r9 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            r13 = r19
            r12.paramNames = r13
            r13 = r18
            r12.creator = r13
            r13 = r21
            r12.setterFieldReaders = r13
            return
    }

    public static com.alibaba.fastjson2.reader.FieldReader[] concat(com.alibaba.fastjson2.reader.FieldReader[] r3, com.alibaba.fastjson2.reader.FieldReader[] r4) {
            if (r4 != 0) goto L3
            return r3
        L3:
            int r0 = r3.length
            int r1 = r4.length
            int r1 = r1 + r0
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            com.alibaba.fastjson2.reader.FieldReader[] r3 = (com.alibaba.fastjson2.reader.FieldReader[]) r3
            r1 = 0
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r3, r0, r2)
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Collection r8, long r9) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r9 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        Lc:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r8.next()
            com.alibaba.fastjson2.reader.FieldReader[] r2 = r7.fieldReaders
            int r3 = r2.length
            if (r0 < r3) goto L1c
            goto L52
        L1c:
            r2 = r2[r0]
            if (r1 == 0) goto L3d
            java.lang.Class r3 = r1.getClass()
            java.lang.Class r4 = r2.fieldClass
            java.lang.reflect.Type r5 = r2.fieldType
            boolean r6 = r5 instanceof java.lang.Class
            if (r6 != 0) goto L31
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r5, r9)
            goto L3d
        L31:
            if (r3 == r4) goto L3d
            java.util.function.Function r3 = r9.getTypeConvert(r3, r4)
            if (r3 == 0) goto L3d
            java.lang.Object r1 = r3.apply(r1)
        L3d:
            boolean r3 = r2 instanceof com.alibaba.fastjson2.reader.FieldReaderObjectParam
            if (r3 == 0) goto L46
            com.alibaba.fastjson2.reader.FieldReaderObjectParam r2 = (com.alibaba.fastjson2.reader.FieldReaderObjectParam) r2
            long r2 = r2.paramNameHash
            goto L48
        L46:
            long r2 = r2.fieldNameHash
        L48:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r10.put(r2, r1)
            int r0 = r0 + 1
            goto Lc
        L52:
            java.lang.Object r8 = r7.createInstanceNoneDefaultConstructor(r10)
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Map r11, long r12) {
            r10 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.String r1 = r10.getTypeKey()
            java.lang.Object r1 = r11.get(r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L3e
            java.lang.String r1 = (java.lang.String) r1
            long r4 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r6 = r2.mask
            long r6 = r6 & r12
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L25
            com.alibaba.fastjson2.reader.ObjectReader r2 = r10.autoType(r0, r4)
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 != 0) goto L35
            java.lang.Class r2 = r10.getObjectClass()
            long r4 = r10.getFeatures()
            long r4 = r4 | r12
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r1, r2, r4)
        L35:
            if (r2 == r10) goto L3e
            if (r2 == 0) goto L3e
            java.lang.Object r11 = r2.createInstance(r11, r12)
            return r11
        L3e:
            java.util.Set r1 = r11.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r3
        L47:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb1
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = r5.toString()
            java.lang.Object r4 = r4.getValue()
            com.alibaba.fastjson2.reader.FieldReader r5 = r10.getFieldReader(r5)
            if (r5 == 0) goto L47
            if (r4 == 0) goto L97
            java.lang.Class r6 = r4.getClass()
            java.lang.Class r7 = r5.fieldClass
            if (r6 == r7) goto L97
            boolean r8 = r4 instanceof com.alibaba.fastjson2.JSONObject
            if (r8 == 0) goto L80
            java.lang.reflect.Type r6 = r5.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r6)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r6.createInstance(r4, r12)
            goto L97
        L80:
            boolean r8 = r4 instanceof com.alibaba.fastjson2.JSONArray
            if (r8 == 0) goto L8d
            com.alibaba.fastjson2.JSONArray r4 = (com.alibaba.fastjson2.JSONArray) r4
            java.lang.reflect.Type r6 = r5.fieldType
            java.lang.Object r4 = r4.to(r6, r12)
            goto L97
        L8d:
            java.util.function.Function r6 = r0.getTypeConvert(r6, r7)
            if (r6 == 0) goto L97
            java.lang.Object r4 = r6.apply(r4)
        L97:
            if (r2 != 0) goto L9e
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
        L9e:
            boolean r6 = r5 instanceof com.alibaba.fastjson2.reader.FieldReaderObjectParam
            if (r6 == 0) goto La7
            com.alibaba.fastjson2.reader.FieldReaderObjectParam r5 = (com.alibaba.fastjson2.reader.FieldReaderObjectParam) r5
            long r5 = r5.paramNameHash
            goto La9
        La7:
            long r5 = r5.fieldNameHash
        La9:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r2.put(r5, r4)
            goto L47
        Lb1:
            if (r2 != 0) goto Lb5
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
        Lb5:
            java.lang.Object r1 = r10.createInstanceNoneDefaultConstructor(r2)
            r2 = 0
            r4 = r2
        Lbb:
            com.alibaba.fastjson2.reader.FieldReader[] r5 = r10.setterFieldReaders
            int r6 = r5.length
            if (r4 >= r6) goto L127
            r5 = r5[r4]
            java.lang.String r6 = r5.fieldName
            java.lang.Object r6 = r11.get(r6)
            if (r6 != 0) goto Lcb
            goto L124
        Lcb:
            java.lang.reflect.Field r7 = r5.field
            if (r7 == 0) goto Lec
            int r7 = r7.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isFinal(r7)
            if (r7 == 0) goto Lec
            java.lang.reflect.Method r7 = r5.method     // Catch: java.lang.Exception -> Lec
            java.lang.Object r7 = r7.invoke(r1, r3)     // Catch: java.lang.Exception -> Lec
            boolean r8 = r7 instanceof java.util.Collection     // Catch: java.lang.Exception -> Lec
            if (r8 == 0) goto Lec
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Exception -> Lec
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Exception -> Lec
            if (r7 != 0) goto Lec
            goto L124
        Lec:
            java.lang.Class r7 = r6.getClass()
            java.lang.Class r8 = r5.fieldClass
            java.lang.reflect.Type r9 = r5.fieldType
            if (r7 == r8) goto L121
            java.util.function.Function r7 = r0.getTypeConvert(r7, r8)
            boolean r8 = r9 instanceof java.lang.Class
            if (r8 != 0) goto L103
            java.lang.Object r6 = com.alibaba.fastjson2.util.TypeUtils.cast(r6, r9, r0)
            goto L121
        L103:
            if (r7 == 0) goto L10a
            java.lang.Object r6 = r7.apply(r6)
            goto L121
        L10a:
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L121
            com.alibaba.fastjson2.JSONReader$Feature[] r7 = new com.alibaba.fastjson2.JSONReader.Feature[r2]
            com.alibaba.fastjson2.JSONReader$Context r7 = com.alibaba.fastjson2.JSONFactory.createReadContext(r0, r7)
            com.alibaba.fastjson2.reader.ObjectReader r7 = r5.getObjectReader(r7)
            java.util.Map r6 = (java.util.Map) r6
            long r8 = r5.features
            long r8 = r8 | r12
            java.lang.Object r6 = r7.createInstance(r6, r8)
        L121:
            r5.accept(r1, r6)
        L124:
            int r4 = r4 + 1
            goto Lbb
        L127:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstanceNoneDefaultConstructor(java.util.Map<java.lang.Long, java.lang.Object> r2) {
            r1 = this;
            java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> r0 = r1.creator
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r14, java.lang.reflect.Type r15, java.lang.Object r16, long r17) {
            r13 = this;
            boolean r0 = r13.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r13.objectClass
            r14.errorOnNoneSerializable(r0)
        L9:
            byte r0 = r14.getType()
            r1 = -81
            r6 = 0
            if (r0 != r1) goto L16
            r14.next()
            return r6
        L16:
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r1) goto L38
            java.lang.Class r8 = r13.objectClass
            long r9 = r13.getTypeNameHash()
            long r0 = r13.features
            long r11 = r0 | r17
            r7 = r14
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.checkAutoType(r8, r9, r11)
            if (r0 == 0) goto L38
            if (r0 == r13) goto L38
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            java.lang.Object r14 = r0.readJSONBObject(r1, r2, r3, r4)
            return r14
        L38:
            boolean r0 = r14.isArray()
            r2 = 0
            if (r0 == 0) goto L87
            boolean r15 = r14.isSupportBeanArray()
            if (r15 == 0) goto L68
            int r15 = r14.startArray()
            r0 = r2
            r3 = r6
        L4b:
            if (r0 >= r15) goto L94
            com.alibaba.fastjson2.reader.FieldReader[] r4 = r13.fieldReaders
            r4 = r4[r0]
            java.lang.Object r5 = r4.readFieldValue(r14)
            if (r3 != 0) goto L5c
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L5c:
            long r7 = r4.fieldNameHash
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r3.put(r4, r5)
            int r0 = r0 + 1
            goto L4b
        L68:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "expect object, but "
            r15.<init>(r0)
            byte r0 = r14.getType()
            java.lang.String r0 = com.alibaba.fastjson2.JSONB.typeName(r0)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r14 = r14.info(r15)
            ah.a.w(r14)
            r14 = 0
            return r14
        L87:
            r14.nextIfObjectStart()
            r0 = r2
            r3 = r6
            r4 = r3
        L8d:
            boolean r5 = r14.nextIfObjectEnd()
            if (r5 == 0) goto Lf2
            r6 = r4
        L94:
            if (r3 != 0) goto L98
            java.util.Map r3 = java.util.Collections.EMPTY_MAP
        L98:
            java.lang.Object r15 = r13.createInstanceNoneDefaultConstructor(r3)
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r13.setterFieldReaders
            if (r0 == 0) goto Lb7
        La0:
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r13.setterFieldReaders
            int r4 = r0.length
            if (r2 >= r4) goto Lb7
            r0 = r0[r2]
            long r4 = r0.fieldNameHash
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r3.get(r4)
            r0.accept(r15, r4)
            int r2 = r2 + 1
            goto La0
        Lb7:
            if (r6 == 0) goto Lf1
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lc1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf1
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            long r3 = r3.longValue()
            com.alibaba.fastjson2.reader.FieldReader r3 = r13.getFieldReader(r3)
            java.lang.String r4 = ".."
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto Led
            r3.accept(r15, r15)
            goto Lc1
        Led:
            r3.addResolveTask(r14, r15, r2)
            goto Lc1
        Lf1:
            return r15
        Lf2:
            long r7 = r14.readFieldNameHashCode()
            r9 = 0
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L100
            r9 = r17
            goto L18c
        L100:
            r9 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L150
            if (r0 != 0) goto L150
            long r2 = r14.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r14.context
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReaderAutoType(r2)
            if (r2 != 0) goto L141
            java.lang.String r2 = r14.getString()
            java.lang.Class r3 = r13.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReaderAutoType(r2, r3)
            if (r0 == 0) goto L12a
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            goto L148
        L12a:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "auotype not support : "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            java.lang.String r14 = r14.info(r15)
            ah.a.w(r14)
            r14 = 0
            return r14
        L141:
            r0 = r2
            r1 = r14
            r3 = r16
            r4 = r17
            r2 = r15
        L148:
            java.lang.Object r15 = r0.readJSONBObject(r1, r2, r3, r4)
            r14.nextIfComma()
            return r15
        L150:
            r9 = r17
            com.alibaba.fastjson2.reader.FieldReader r5 = r13.getFieldReader(r7)
            if (r5 != 0) goto L15c
            r13.processExtra(r14, r6, r9)
            goto L18c
        L15c:
            boolean r11 = r14.isReference()
            if (r11 == 0) goto L178
            r14.next()
            java.lang.String r5 = r14.readString()
            if (r4 != 0) goto L170
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L170:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4.put(r7, r5)
            goto L18c
        L178:
            java.lang.Object r7 = r5.readFieldValue(r14)
            if (r3 != 0) goto L183
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
        L183:
            long r11 = r5.fieldNameHash
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r3.put(r5, r7)
        L18c:
            int r0 = r0 + 1
            goto L8d
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r6 = r22
            boolean r2 = r0.serializable
            if (r2 != 0) goto Lf
            java.lang.Class r2 = r0.objectClass
            r1.errorOnNoneSerializable(r2)
        Lf:
            boolean r2 = r1.jsonb
            if (r2 == 0) goto L1f
            r4 = 0
            r2 = r20
            r3 = r21
            java.lang.Object r1 = r0.readJSONBObject(r1, r2, r3, r4)
            r8 = r0
            return r1
        L1f:
            r8 = r0
            long r2 = r8.features
            long r2 = r2 | r6
            boolean r0 = r1.isSupportBeanArray(r2)
            r9 = 0
            r10 = 0
            if (r0 == 0) goto L81
            boolean r0 = r1.nextIfArrayStart()
            if (r0 == 0) goto L81
        L31:
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r8.fieldReaders
            int r2 = r0.length
            if (r10 >= r2) goto L54
            r0 = r0[r10]
            java.lang.Object r0 = r0.readFieldValue(r1)
            if (r9 != 0) goto L44
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r9 = r2
        L44:
            com.alibaba.fastjson2.reader.FieldReader[] r2 = r8.fieldReaders
            r2 = r2[r10]
            long r2 = r2.fieldNameHash
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.put(r2, r0)
            int r10 = r10 + 1
            goto L31
        L54:
            boolean r0 = r1.nextIfArrayEnd()
            if (r0 == 0) goto L66
            r1.nextIfComma()
            if (r9 != 0) goto L61
            java.util.Map r9 = java.util.Collections.EMPTY_MAP
        L61:
            java.lang.Object r0 = r8.createInstanceNoneDefaultConstructor(r9)
            return r0
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "array not end, "
            r0.<init>(r2)
            char r2 = r1.current()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L81:
            boolean r0 = r1.nextIfObjectStart()
            if (r0 != 0) goto L98
            boolean r0 = r1.isTypeRedirect()
            if (r0 == 0) goto L91
            r1.setTypeRedirect(r10)
            goto L98
        L91:
            boolean r0 = r1.nextIfNullOrEmptyString()
            if (r0 == 0) goto L98
            return r9
        L98:
            com.alibaba.fastjson2.JSONReader$Context r11 = r1.context
            long r2 = r8.features
            long r2 = r2 | r6
            long r4 = r11.features
            long r12 = r2 | r4
            r15 = r9
            r14 = r10
        La3:
            boolean r0 = r1.nextIfObjectEnd()
            if (r0 == 0) goto L109
            boolean r0 = r8.hasDefaultValue
            if (r0 == 0) goto Lda
            if (r15 != 0) goto Lb4
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
        Lb4:
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r8.fieldReaders
            int r2 = r0.length
            r3 = r10
        Lb8:
            if (r3 >= r2) goto Lda
            r4 = r0[r3]
            java.lang.Object r5 = r4.defaultValue
            if (r5 == 0) goto Ld7
            long r5 = r4.fieldNameHash
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            if (r5 != 0) goto Ld7
            long r5 = r4.fieldNameHash
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.defaultValue
            r15.put(r5, r4)
        Ld7:
            int r3 = r3 + 1
            goto Lb8
        Lda:
            if (r15 != 0) goto Ldf
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto Le0
        Ldf:
            r0 = r15
        Le0:
            java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> r2 = r8.creator
            java.lang.Object r0 = r2.apply(r0)
            com.alibaba.fastjson2.reader.FieldReader[] r2 = r8.setterFieldReaders
            if (r2 == 0) goto L105
            if (r15 == 0) goto L105
        Lec:
            com.alibaba.fastjson2.reader.FieldReader[] r2 = r8.setterFieldReaders
            int r3 = r2.length
            if (r10 >= r3) goto L105
            r2 = r2[r10]
            long r3 = r2.fieldNameHash
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r15.get(r3)
            if (r3 == 0) goto L102
            r2.accept(r0, r3)
        L102:
            int r10 = r10 + 1
            goto Lec
        L105:
            r1.nextIfComma()
            return r0
        L109:
            long r2 = r1.readFieldNameHashCode()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L115
            goto L1d0
        L115:
            r16 = r4
            long r4 = r8.typeKeyHashCode
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L16e
            if (r14 != 0) goto L16e
            long r1 = r19.readTypeHashCode()
            long r3 = r8.getTypeNameHash()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L12f
        L12b:
            r1 = r19
            goto L1d0
        L12f:
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r3 = r0.mask
            long r3 = r3 & r12
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 == 0) goto L143
            java.lang.Class r3 = r8.objectClass
            long r4 = r8.features
            r0 = r19
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.getObjectReaderAutoType(r1, r3, r4)
            goto L14d
        L143:
            java.lang.String r0 = r19.getString()
            java.lang.Class r1 = r8.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r1 = r11.getObjectReaderAutoType(r0, r1)
        L14d:
            if (r1 != 0) goto L15b
            java.lang.String r0 = r19.getString()
            java.lang.Class r1 = r8.objectClass
            long r2 = r8.features
            com.alibaba.fastjson2.reader.ObjectReader r1 = r11.getObjectReaderAutoType(r0, r1, r2)
        L15b:
            r0 = r1
            if (r0 == 0) goto L12b
            r4 = 0
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            r1.nextIfComma()
            return r0
        L16e:
            com.alibaba.fastjson2.reader.FieldReader r0 = r8.getFieldReader(r2)
            if (r0 != 0) goto L1ad
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r2 = r2.mask
            long r2 = r2 & r12
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L1ad
            long r2 = r1.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r0 = r8.getFieldReaderLCase(r2)
            if (r0 != 0) goto L1ad
            java.lang.String r2 = r1.getFieldName()
            java.lang.String r3 = "is"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L1ad
            r3 = 2
            java.lang.String r2 = r2.substring(r3)
            long r2 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r2)
            com.alibaba.fastjson2.reader.FieldReader r2 = r8.getFieldReaderLCase(r2)
            if (r2 == 0) goto L1ad
            java.lang.Class r3 = r2.fieldClass
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r3 == r4) goto L1ac
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r3 != r4) goto L1ad
        L1ac:
            r0 = r2
        L1ad:
            if (r0 != 0) goto L1b3
            r8.processExtra(r1, r9, r6)
            goto L1d0
        L1b3:
            java.lang.Object r2 = r0.readFieldValue(r1)
            if (r15 != 0) goto L1be
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
        L1be:
            boolean r3 = r0 instanceof com.alibaba.fastjson2.reader.FieldReaderObjectParam
            if (r3 == 0) goto L1c7
            com.alibaba.fastjson2.reader.FieldReaderObjectParam r0 = (com.alibaba.fastjson2.reader.FieldReaderObjectParam) r0
            long r3 = r0.paramNameHash
            goto L1c9
        L1c7:
            long r3 = r0.fieldNameHash
        L1c9:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r15.put(r0, r2)
        L1d0:
            int r14 = r14 + 1
            goto La3
    }
}
