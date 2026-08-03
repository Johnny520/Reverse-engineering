package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderAdapter<T> extends com.alibaba.fastjson2.reader.ObjectReaderBean<T> {
    final java.lang.reflect.Constructor constructor;
    protected final com.alibaba.fastjson2.reader.FieldReader[] fieldReaders;
    final long[] hashCodes;
    final long[] hashCodesLCase;
    final short[] mapping;
    final short[] mappingLCase;
    final int parameterCount;
    final java.lang.Class[] seeAlso;
    final java.lang.Class seeAlsoDefault;
    final java.util.Map<java.lang.Long, java.lang.Class> seeAlsoMapping;
    final java.lang.String[] seeAlsoNames;
    protected final java.lang.String typeKey;
    protected final long typeKeyHashCode;

    public ObjectReaderAdapter(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
            r12 = this;
            r9 = 0
            r10 = 0
            r8 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
    }

    public ObjectReaderAdapter(java.lang.Class r16, java.lang.String r17, java.lang.String r18, long r19, java.util.function.Supplier<T> r21, java.util.function.Function r22, java.lang.Class[] r23, java.lang.String[] r24, java.lang.Class r25, com.alibaba.fastjson2.reader.FieldReader... r26) {
            r15 = this;
            r7 = r17
            r8 = r23
            r9 = r24
            r0 = r15
            r1 = r16
            r3 = r18
            r4 = r19
            r2 = r21
            r6 = r22
            r10 = r26
            r0.<init>(r1, r2, r3, r4, r6)
            boolean r3 = r2 instanceof com.alibaba.fastjson2.reader.ConstructorSupplier
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L22
            r1 = r2
            com.alibaba.fastjson2.reader.ConstructorSupplier r1 = (com.alibaba.fastjson2.reader.ConstructorSupplier) r1
            java.lang.reflect.Constructor r1 = r1.constructor
            goto L2f
        L22:
            if (r1 != 0) goto L26
            r1 = r4
            goto L2a
        L26:
            java.lang.reflect.Constructor r1 = com.alibaba.fastjson2.util.BeanUtils.getDefaultConstructor(r1, r5)
        L2a:
            if (r1 == 0) goto L2f
            r1.setAccessible(r5)
        L2f:
            if (r1 == 0) goto L38
            int r2 = r1.getParameterCount()
            r15.parameterCount = r2
            goto L3b
        L38:
            r2 = -1
            r15.parameterCount = r2
        L3b:
            r15.constructor = r1
            if (r7 == 0) goto L4f
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L46
            goto L4f
        L46:
            r15.typeKey = r7
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r7)
            r15.typeKeyHashCode = r1
            goto L5a
        L4f:
            java.lang.String r1 = "@type"
            r15.typeKey = r1
            r1 = 435678704704(0x6570797440, double:2.15253880619E-312)
            r15.typeKeyHashCode = r1
        L5a:
            r15.fieldReaders = r10
            int r1 = r10.length
            long[] r2 = new long[r1]
            int r3 = r10.length
            long[] r6 = new long[r3]
            r7 = 0
            r11 = r7
        L64:
            int r12 = r10.length
            if (r11 >= r12) goto L8a
            r12 = r10[r11]
            long r13 = r12.fieldNameHash
            r2[r11] = r13
            long r13 = r12.fieldNameHashLCase
            r6[r11] = r13
            boolean r13 = r12.isUnwrapped()
            if (r13 == 0) goto L81
            com.alibaba.fastjson2.reader.FieldReader r13 = r15.extraFieldReader
            if (r13 == 0) goto L7f
            boolean r13 = r13 instanceof com.alibaba.fastjson2.reader.FieldReaderAnySetter
            if (r13 != 0) goto L81
        L7f:
            r15.extraFieldReader = r12
        L81:
            java.lang.Object r12 = r12.defaultValue
            if (r12 == 0) goto L87
            r15.hasDefaultValue = r5
        L87:
            int r11 = r11 + 1
            goto L64
        L8a:
            long[] r5 = java.util.Arrays.copyOf(r2, r1)
            r15.hashCodes = r5
            java.util.Arrays.sort(r5)
            int r5 = r5.length
            short[] r5 = new short[r5]
            r15.mapping = r5
            r5 = r7
        L99:
            if (r5 >= r1) goto Lab
            r10 = r2[r5]
            long[] r12 = r15.hashCodes
            int r10 = java.util.Arrays.binarySearch(r12, r10)
            short[] r11 = r15.mapping
            short r12 = (short) r5
            r11[r10] = r12
            int r5 = r5 + 1
            goto L99
        Lab:
            long[] r1 = java.util.Arrays.copyOf(r6, r3)
            r15.hashCodesLCase = r1
            java.util.Arrays.sort(r1)
            int r1 = r1.length
            short[] r1 = new short[r1]
            r15.mappingLCase = r1
            r1 = r7
        Lba:
            if (r1 >= r3) goto Lcc
            r10 = r6[r1]
            long[] r2 = r15.hashCodesLCase
            int r2 = java.util.Arrays.binarySearch(r2, r10)
            short[] r5 = r15.mappingLCase
            short r10 = (short) r1
            r5[r2] = r10
            int r1 = r1 + 1
            goto Lba
        Lcc:
            r15.seeAlso = r8
            if (r8 == 0) goto L110
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r8.length
            r1.<init>(r2)
            r15.seeAlsoMapping = r1
            int r1 = r8.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r15.seeAlsoNames = r1
        Ldd:
            int r1 = r8.length
            if (r7 >= r1) goto L10d
            r1 = r8[r7]
            if (r9 == 0) goto Lec
            int r2 = r9.length
            int r3 = r7 + 1
            if (r2 < r3) goto Lec
            r2 = r9[r7]
            goto Led
        Lec:
            r2 = r4
        Led:
            if (r2 == 0) goto Lf5
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lf9
        Lf5:
            java.lang.String r2 = r1.getSimpleName()
        Lf9:
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r2)
            java.util.Map<java.lang.Long, java.lang.Class> r3 = r15.seeAlsoMapping
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.put(r5, r1)
            java.lang.String[] r1 = r15.seeAlsoNames
            r1[r7] = r2
            int r7 = r7 + 1
            goto Ldd
        L10d:
            r1 = r25
            goto L115
        L110:
            r15.seeAlsoMapping = r4
            r15.seeAlsoNames = r4
            goto L10d
        L115:
            r15.seeAlsoDefault = r1
            return
    }

    public ObjectReaderAdapter(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, java.lang.Class[] r20, java.lang.String[] r21, com.alibaba.fastjson2.reader.FieldReader... r22) {
            r12 = this;
            r10 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
    }

    public ObjectReaderAdapter(java.lang.Class r10, java.util.function.Supplier<T> r11, com.alibaba.fastjson2.reader.FieldReader... r12) {
            r9 = this;
            r4 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r0 = r9
            r1 = r10
            r6 = r11
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.ObjectReader autoType(com.alibaba.fastjson2.JSONReader.Context r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.Long, java.lang.Class> r0 = r1.seeAlsoMapping
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            java.util.Map<java.lang.Long, java.lang.Class> r0 = r1.seeAlsoMapping
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r3)
            return r2
        L1f:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReaderAutoType(r3)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.ObjectReader autoType(com.alibaba.fastjson2.reader.ObjectReaderProvider r2, long r3) {
            r1 = this;
            java.util.Map<java.lang.Long, java.lang.Class> r0 = r1.seeAlsoMapping
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            if (r0 <= 0) goto L1f
            java.util.Map<java.lang.Long, java.lang.Class> r0 = r1.seeAlsoMapping
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r3)
            return r2
        L1f:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r3)
            return r2
    }

    public T autoType(com.alibaba.fastjson2.JSONReader r7) {
            r6 = this;
            long r0 = r7.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r2 = r7.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.autoType(r2, r0)
            if (r0 != 0) goto L30
            java.lang.String r0 = r7.getString()
            r1 = 0
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.getObjectReaderAutoType(r0, r1)
            if (r1 == 0) goto L19
            r0 = r1
            goto L30
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "auotype not support : "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r7 = r7.info(r0)
            ah.a.w(r7)
            r7 = 0
            return r7
        L30:
            r3 = 0
            long r4 = r6.features
            r2 = 0
            r1 = r7
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)
            return r7
    }

    public java.lang.Object autoType(com.alibaba.fastjson2.JSONReader r8, java.lang.Class r9, long r10) {
            r7 = this;
            long r0 = r8.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r2 = r8.context
            boolean r3 = r8.isSupportAutoTypeOrHandler(r10)
            if (r3 == 0) goto L11
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReaderAutoType(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L42
            java.lang.String r0 = r8.getString()
            long r3 = r7.features
            long r3 = r3 | r10
            long r5 = r2.features
            long r3 = r3 | r5
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.getObjectReaderAutoType(r0, r9, r3)
            if (r1 != 0) goto L41
            java.lang.Class r1 = r7.objectClass
            if (r9 != r1) goto L2a
            r0 = r7
            goto L42
        L2a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "auotype not support : "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.w(r8)
            r8 = 0
            return r8
        L41:
            r0 = r1
        L42:
            r2 = 0
            r3 = 0
            r1 = r8
            r4 = r10
            java.lang.Object r8 = r0.readObject(r1, r2, r3, r4)
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long r2) {
            r1 = this;
            java.lang.reflect.Constructor r2 = r1.constructor
            java.lang.String r3 = "create instance error, "
            if (r2 == 0) goto L1c
            int r0 = r1.parameterCount
            if (r0 != 0) goto L1c
            r0 = 0
            java.lang.Object r2 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12 java.lang.InstantiationException -> L14
            goto L24
        L10:
            r2 = move-exception
            goto L15
        L12:
            r2 = move-exception
            goto L15
        L14:
            r2 = move-exception
        L15:
            java.lang.Class r0 = r1.objectClass
            ah.a.o(r3, r0, r2)
        L1a:
            r2 = 0
            return r2
        L1c:
            java.util.function.Supplier<T> r2 = r1.creator
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r2.get()
        L24:
            boolean r3 = r1.hasDefaultValue
            if (r3 == 0) goto L2b
            r1.initDefaultValue(r2)
        L2b:
            return r2
        L2c:
            java.lang.Class r2 = r1.objectClass
            ah.a.i(r2, r3)
            goto L1a
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Collection r4, long r5) {
            r3 = this;
            r5 = 0
            java.lang.Object r5 = r3.createInstance(r5)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r4.next()
            com.alibaba.fastjson2.reader.FieldReader[] r1 = r3.fieldReaders
            int r2 = r1.length
            if (r6 < r2) goto L1b
            goto L23
        L1b:
            r1 = r1[r6]
            r1.accept(r5, r0)
            int r6 = r6 + 1
            goto Lb
        L23:
            return r5
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Map r20, long r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r4 = r21
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            java.lang.String r3 = r0.typeKey
            java.lang.Object r3 = r1.get(r3)
            long r6 = r0.features
            long r6 = r6 | r4
            long r8 = com.alibaba.fastjson2.JSONFactory.getDefaultReaderFeatures()
            long r6 = r6 | r8
            boolean r8 = r3 instanceof java.lang.String
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L4c
            java.lang.String r3 = (java.lang.String) r3
            long r12 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r14 = r8.mask
            long r14 = r14 & r4
            int r8 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r8 != 0) goto L35
            boolean r8 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            if (r8 == 0) goto L33
            goto L35
        L33:
            r8 = r9
            goto L39
        L35:
            com.alibaba.fastjson2.reader.ObjectReader r8 = r0.autoType(r2, r12)
        L39:
            if (r8 != 0) goto L43
            java.lang.Class r8 = r0.getObjectClass()
            com.alibaba.fastjson2.reader.ObjectReader r8 = r2.getObjectReader(r3, r8, r6)
        L43:
            if (r8 == r0) goto L4c
            if (r8 == 0) goto L4c
            java.lang.Object r1 = r8.createInstance(r1, r4)
            return r1
        L4c:
            java.lang.Object r3 = r0.createInstance(r10)
            com.alibaba.fastjson2.reader.FieldReader r8 = r0.extraFieldReader
            if (r8 != 0) goto Lfb
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r12 = r8.mask
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnUnknownProperties
            long r14 = r8.mask
            long r12 = r12 | r14
            long r12 = r12 & r6
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r8 != 0) goto Lfb
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r12 = r8.mask
            long r12 = r12 & r6
            int r8 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            r12 = 0
            if (r8 == 0) goto L6e
            r8 = 1
            goto L6f
        L6e:
            r8 = r12
        L6f:
            com.alibaba.fastjson2.reader.FieldReader[] r13 = r0.fieldReaders
            int r14 = r13.length
            if (r12 >= r14) goto Lf9
            r13 = r13[r12]
            java.lang.String r14 = r13.fieldName
            java.lang.Object r14 = r1.get(r14)
            if (r14 != 0) goto L92
            com.alibaba.fastjson2.JSONReader$Feature r15 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            r16 = r10
            long r10 = r15.mask
            long r10 = r10 & r6
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 != 0) goto Lf3
            java.lang.String r10 = r13.fieldName
            boolean r10 = r1.containsKey(r10)
            if (r10 != 0) goto L94
            goto Lf3
        L92:
            r16 = r10
        L94:
            java.lang.reflect.Field r10 = r13.field
            if (r10 == 0) goto Lb5
            int r10 = r10.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isFinal(r10)
            if (r10 == 0) goto Lb5
            java.lang.reflect.Method r10 = r13.method     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r10 = r10.invoke(r3, r9)     // Catch: java.lang.Exception -> Lb5
            boolean r11 = r10 instanceof java.util.Collection     // Catch: java.lang.Exception -> Lb5
            if (r11 == 0) goto Lb5
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Exception -> Lb5
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Exception -> Lb5
            if (r10 != 0) goto Lb5
            goto Lf3
        Lb5:
            if (r14 == 0) goto Lf0
            java.lang.Class r10 = r14.getClass()
            java.lang.reflect.Type r11 = r13.fieldType
            if (r10 != r11) goto Lc0
            goto Lf0
        Lc0:
            boolean r10 = r13 instanceof com.alibaba.fastjson2.reader.FieldReaderList
            if (r10 == 0) goto Ld6
            boolean r10 = r14 instanceof com.alibaba.fastjson2.JSONArray
            if (r10 == 0) goto Ld6
            com.alibaba.fastjson2.reader.ObjectReader r10 = r13.getObjectReader(r2)
            com.alibaba.fastjson2.JSONArray r14 = (com.alibaba.fastjson2.JSONArray) r14
            java.lang.Object r10 = r10.createInstance(r14, r4)
            r13.accept(r3, r10)
            goto Lf3
        Ld6:
            boolean r10 = r14 instanceof com.alibaba.fastjson2.JSONObject
            if (r10 == 0) goto Lec
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r10 = com.alibaba.fastjson2.JSONObject.class
            if (r11 == r10) goto Lec
            com.alibaba.fastjson2.JSONObject r14 = (com.alibaba.fastjson2.JSONObject) r14
            com.alibaba.fastjson2.reader.ObjectReader r10 = r2.getObjectReader(r11, r8)
            java.lang.Object r10 = r10.createInstance(r14, r4)
            r13.accept(r3, r10)
            goto Lf3
        Lec:
            r13.acceptAny(r3, r14, r4)
            goto Lf3
        Lf0:
            r13.accept(r3, r14)
        Lf3:
            int r12 = r12 + 1
            r10 = r16
            goto L6f
        Lf9:
            r1 = r3
            goto L142
        Lfb:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r6 = r1.iterator()
        L103:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lf9
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = r2.toString()
            java.lang.Object r7 = r1.getValue()
            com.alibaba.fastjson2.reader.FieldReader r8 = r0.getFieldReader(r2)
            if (r8 != 0) goto L12f
            java.lang.Object r1 = r1.getValue()
            r18 = r3
            r3 = r1
            r1 = r18
            r0.acceptExtra(r1, r2, r3, r4)
        L12d:
            r3 = r1
            goto L103
        L12f:
            r1 = r3
            if (r7 == 0) goto L13e
            java.lang.Class r2 = r7.getClass()
            java.lang.reflect.Type r3 = r8.fieldType
            if (r2 != r3) goto L13e
            r8.accept(r1, r7)
            goto L12d
        L13e:
            r8.acceptAny(r1, r7, r4)
            goto L12d
        L142:
            java.util.function.Function r2 = r0.buildFunction
            if (r2 == 0) goto L14b
            java.lang.Object r3 = r2.apply(r1)
            goto L14c
        L14b:
            r3 = r1
        L14c:
            return r3
    }

    public java.lang.Object createInstance0(long r3) {
            r2 = this;
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.UseDefaultConstructorAsPossible
            long r0 = r0.mask
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            java.lang.String r4 = "create instance error, "
            if (r3 == 0) goto L32
            java.lang.reflect.Constructor r3 = r2.constructor
            if (r3 == 0) goto L32
            int r3 = r3.getParameterCount()
            if (r3 != 0) goto L32
            java.lang.reflect.Constructor r3 = r2.constructor     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28 java.lang.InstantiationException -> L2a
            r0 = 0
            java.lang.Object r3 = r3.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L26 java.lang.IllegalAccessException -> L28 java.lang.InstantiationException -> L2a
            boolean r4 = r2.hasDefaultValue
            if (r4 == 0) goto L25
            r2.initDefaultValue(r3)
        L25:
            return r3
        L26:
            r3 = move-exception
            goto L2b
        L28:
            r3 = move-exception
            goto L2b
        L2a:
            r3 = move-exception
        L2b:
            java.lang.Class r0 = r2.objectClass
            ah.a.o(r4, r0, r3)
        L30:
            r3 = 0
            return r3
        L32:
            java.util.function.Supplier<T> r3 = r2.creator
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r3.get()
            return r3
        L3b:
            java.lang.Class r3 = r2.objectClass
            ah.a.i(r3, r4)
            goto L30
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final java.util.function.Function getBuildFunction() {
            r1 = this;
            java.util.function.Function r0 = r1.buildFunction
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getFeatures() {
            r2 = this;
            long r0 = r2.features
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReader(long r2) {
            r1 = this;
            long[] r0 = r1.hashCodes
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto La
            r2 = 0
            return r2
        La:
            short[] r3 = r1.mapping
            short r2 = r3[r2]
            com.alibaba.fastjson2.reader.FieldReader[] r3 = r1.fieldReaders
            r2 = r3[r2]
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReaderLCase(long r2) {
            r1 = this;
            long[] r0 = r1.hashCodesLCase
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto La
            r2 = 0
            return r2
        La:
            short[] r3 = r1.mappingLCase
            short r2 = r3[r2]
            com.alibaba.fastjson2.reader.FieldReader[] r3 = r1.fieldReaders
            r2 = r3[r2]
            return r2
    }

    public com.alibaba.fastjson2.reader.FieldReader[] getFieldReaders() {
            r2 = this;
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r2.fieldReaders
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            com.alibaba.fastjson2.reader.FieldReader[] r0 = (com.alibaba.fastjson2.reader.FieldReader[]) r0
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final java.lang.String getTypeKey() {
            r1 = this;
            java.lang.String r0 = r1.typeKey
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getTypeKeyHash() {
            r2 = this;
            long r0 = r2.typeKeyHashCode
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T r6) {
            r5 = this;
            com.alibaba.fastjson2.reader.FieldReader[] r0 = r5.fieldReaders
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            java.lang.Object r4 = r3.defaultValue
            if (r4 == 0) goto Lf
            r3.accept(r6, r4)
        Lf:
            int r2 = r2 + 1
            goto L4
        L12:
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initStringFieldAsEmpty(java.lang.Object r5) {
            r4 = this;
            r0 = 0
        L1:
            com.alibaba.fastjson2.reader.FieldReader[] r1 = r4.fieldReaders
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r1 = r1[r0]
            java.lang.Class r2 = r1.fieldClass
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L13
            java.lang.String r2 = ""
            r1.accept(r5, r2)
        L13:
            int r0 = r0 + 1
            goto L1
        L16:
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
            r9 = this;
            boolean r0 = r9.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r9.objectClass
            r10.errorOnNoneSerializable(r0)
        L9:
            java.lang.Class r0 = r9.objectClass
            long r1 = r9.features
            long r1 = r1 | r13
            com.alibaba.fastjson2.reader.ObjectReader r3 = r9.checkAutoType(r10, r0, r1)
            if (r3 == 0) goto L27
            if (r3 == r9) goto L27
            java.lang.Class r0 = r3.getObjectClass()
            java.lang.Class r1 = r9.objectClass
            if (r0 == r1) goto L27
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r10 = r3.readArrayMappingJSONBObject(r4, r5, r6, r7)
            return r10
        L27:
            r4 = r10
            int r10 = r4.startArray()
            r11 = 0
            java.lang.Object r11 = r9.createInstance(r11)
            r12 = 0
        L33:
            com.alibaba.fastjson2.reader.FieldReader[] r13 = r9.fieldReaders
            int r14 = r13.length
            if (r12 >= r14) goto L43
            if (r12 < r10) goto L3b
            goto L40
        L3b:
            r13 = r13[r12]
            r13.readFieldValue(r4, r11)
        L40:
            int r12 = r12 + 1
            goto L33
        L43:
            int r12 = r13.length
        L44:
            if (r12 >= r10) goto L4c
            r4.skipValue()
            int r12 = r12 + 1
            goto L44
        L4c:
            java.util.function.Function r10 = r9.buildFunction
            if (r10 == 0) goto L55
            java.lang.Object r10 = r10.apply(r11)
            return r10
        L55:
            return r11
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingObject(com.alibaba.fastjson2.JSONReader r2, java.lang.reflect.Type r3, java.lang.Object r4, long r5) {
            r1 = this;
            boolean r0 = r2.jsonb
            if (r0 == 0) goto La
            java.lang.Object r2 = r1.readArrayMappingJSONBObject(r2, r3, r4, r5)
            r3 = r1
            return r2
        La:
            r3 = r1
            boolean r4 = r3.serializable
            if (r4 != 0) goto L14
            java.lang.Class r4 = r3.objectClass
            r2.errorOnNoneSerializable(r4)
        L14:
            r2.nextIfArrayStart()
            java.util.function.Supplier<T> r4 = r3.creator
            java.lang.Object r4 = r4.get()
            r5 = 0
        L1e:
            com.alibaba.fastjson2.reader.FieldReader[] r6 = r3.fieldReaders
            int r0 = r6.length
            if (r5 >= r0) goto L2b
            r6 = r6[r5]
            r6.readFieldValue(r2, r4)
            int r5 = r5 + 1
            goto L1e
        L2b:
            boolean r5 = r2.nextIfArrayEnd()
            if (r5 == 0) goto L3e
            r2.nextIfComma()
            java.util.function.Function r2 = r3.buildFunction
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r2.apply(r4)
            return r2
        L3d:
            return r4
        L3e:
            java.lang.String r4 = "array to bean end error"
            java.lang.String r2 = r2.info(r4)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public final void readFieldValue(long r4, com.alibaba.fastjson2.JSONReader r6, long r7, java.lang.Object r9) {
            r3 = this;
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.getFieldReader(r4)
            if (r0 != 0) goto L21
            boolean r1 = r3.disableSmartMatch
            if (r1 != 0) goto L21
            long r1 = r3.features
            long r7 = r7 | r1
            boolean r7 = r6.isSupportSmartMatch(r7)
            if (r7 == 0) goto L21
            long r7 = r6.getNameHashCodeLCase()
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L1d
        L1c:
            r4 = r7
        L1d:
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.getFieldReaderLCase(r4)
        L21:
            if (r0 == 0) goto L27
            r0.readFieldValue(r6, r9)
            return
        L27:
            r4 = 0
            r3.processExtra(r6, r9, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r12, java.lang.reflect.Type r13, java.lang.Object r14, long r15) {
            r11 = this;
            boolean r0 = r12.nextIfNull()
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            java.lang.Class r1 = r11.objectClass
            long r2 = r11.getTypeNameHash()
            long r4 = r11.features
            long r4 = r4 | r15
            r0 = r12
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            if (r1 == 0) goto L2a
            java.lang.Class r0 = r1.getObjectClass()
            java.lang.Class r2 = r11.objectClass
            if (r0 == r2) goto L2a
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r1
            r1 = r12
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L2a:
            boolean r0 = r11.serializable
            if (r0 != 0) goto L33
            java.lang.Class r0 = r11.objectClass
            r12.errorOnNoneSerializable(r0)
        L33:
            boolean r0 = r12.isArray()
            if (r0 == 0) goto L63
            boolean r0 = r12.isSupportBeanArray()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r11.readArrayMappingJSONBObject(r12, r13, r14, r15)
            return r0
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "expect object, but "
            r0.<init>(r2)
            byte r2 = r12.getType()
            java.lang.String r2 = com.alibaba.fastjson2.JSONB.typeName(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r12.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L63:
            r12.nextIfObjectStart()
            r0 = 0
            r2 = r6
        L68:
            boolean r3 = r12.nextIfObjectEnd()
            if (r3 == 0) goto L7b
            if (r2 != 0) goto L7a
            com.alibaba.fastjson2.JSONReader$Context r0 = r12.context
            long r0 = r0.features
            long r0 = r0 | r15
            java.lang.Object r0 = r11.createInstance(r0)
            return r0
        L7a:
            return r2
        L7b:
            long r3 = r12.readFieldNameHashCode()
            long r7 = r11.typeKeyHashCode
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto Lc8
            if (r0 != 0) goto Lc8
            long r3 = r12.readValueHashCode()
            com.alibaba.fastjson2.JSONReader$Context r5 = r12.context
            com.alibaba.fastjson2.reader.ObjectReader r3 = r11.autoType(r5, r3)
            if (r3 != 0) goto Lb6
            java.lang.String r3 = r12.getString()
            com.alibaba.fastjson2.reader.ObjectReader r4 = r5.getObjectReaderAutoType(r3, r6)
            if (r4 == 0) goto L9f
            r3 = r4
            goto Lb6
        L9f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "auotype not support : "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r12.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lb6:
            if (r3 != r11) goto Lba
            r7 = r15
            goto Lfb
        Lba:
            r0 = 1
            r12.setTypeRedirect(r0)
            r1 = r12
            r2 = r13
            r4 = r15
            r0 = r3
            r3 = r14
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        Lc8:
            r7 = r15
            r9 = 0
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 != 0) goto Ld0
            goto Lfb
        Ld0:
            com.alibaba.fastjson2.reader.FieldReader r3 = r11.getFieldReader(r3)
            if (r3 != 0) goto Le7
            long r4 = r11.features
            long r4 = r4 | r7
            boolean r4 = r12.isSupportSmartMatch(r4)
            if (r4 == 0) goto Le7
            long r3 = r12.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r3 = r11.getFieldReaderLCase(r3)
        Le7:
            if (r3 != 0) goto Led
            r11.processExtra(r12, r2, r7)
            goto Lfb
        Led:
            if (r2 != 0) goto Lf8
            com.alibaba.fastjson2.JSONReader$Context r2 = r12.context
            long r4 = r2.features
            long r4 = r4 | r7
            java.lang.Object r2 = r11.createInstance(r4)
        Lf8:
            r3.readFieldValue(r12, r2)
        Lfb:
            int r0 = r0 + 1
            goto L68
    }
}
