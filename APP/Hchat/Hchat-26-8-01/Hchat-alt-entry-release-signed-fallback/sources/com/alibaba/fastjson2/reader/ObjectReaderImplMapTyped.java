package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplMapTyped implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.util.function.Function builder;
    final java.lang.reflect.Constructor defaultConstructor;
    final long features;
    final java.lang.Class instanceType;
    com.alibaba.fastjson2.reader.ObjectReader keyObjectReader;
    final java.lang.reflect.Type keyType;
    final java.lang.Class mapType;
    final java.lang.Class valueClass;
    com.alibaba.fastjson2.reader.ObjectReader valueObjectReader;
    final java.lang.reflect.Type valueType;

    public ObjectReaderImplMapTyped(java.lang.Class r3, java.lang.Class r4, java.lang.reflect.Type r5, java.lang.reflect.Type r6, long r7, java.util.function.Function r9) {
            r2 = this;
            r2.<init>()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r1 = 0
            if (r5 != r0) goto L9
            r5 = r1
        L9:
            r2.mapType = r3
            r2.instanceType = r4
            r2.keyType = r5
            r2.valueType = r6
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.getClass(r6)
            r2.valueClass = r3
            r2.features = r7
            r2.builder = r9
            java.lang.reflect.Constructor[] r3 = r4.getDeclaredConstructors()
            int r4 = r3.length
            r5 = 0
        L21:
            if (r5 >= r4) goto L3f
            r6 = r3[r5]
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r7 = r7.length
            if (r7 != 0) goto L3c
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isPublic(r7)
            if (r7 != 0) goto L3c
            r3 = 1
            r6.setAccessible(r3)
            r1 = r6
            goto L3f
        L3c:
            int r5 = r5 + 1
            goto L21
        L3f:
            r2.defaultConstructor = r1
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r1) {
            r0 = this;
            java.lang.Class r1 = r0.instanceType
            if (r1 == 0) goto L24
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L24
            java.lang.reflect.Constructor r1 = r0.defaultConstructor     // Catch: java.lang.Exception -> L14
            if (r1 == 0) goto L16
            r2 = 0
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L14
            return r1
        L14:
            r1 = move-exception
            goto L1d
        L16:
            java.lang.Class r1 = r0.instanceType     // Catch: java.lang.Exception -> L14
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L14
            return r1
        L1d:
            java.lang.String r2 = "create map error"
            ah.a.x(r2, r1)
            r1 = 0
            return r1
        L24:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Map r8, long r9) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r1 = r7.instanceType
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            if (r1 == r2) goto L14
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.Object r1 = r7.createInstance(r9)
            java.util.Map r1 = (java.util.Map) r1
            goto L19
        L14:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L19:
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lfc
            java.lang.Object r2 = r8.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.lang.reflect.Type r4 = r7.keyType
            if (r4 == 0) goto L43
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto L3e
            goto L43
        L3e:
            java.lang.Object r3 = com.alibaba.fastjson2.util.TypeUtils.cast(r3, r4)
            goto L47
        L43:
            java.lang.String r3 = r3.toString()
        L47:
            if (r2 == 0) goto Lf7
            java.lang.Class r4 = r2.getClass()
            java.lang.reflect.Type r5 = r7.valueType
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r5 != r6) goto L55
            goto Lf7
        L55:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r5 = com.alibaba.fastjson2.JSONObject.class
            if (r4 == r5) goto Le2
            java.lang.Class r5 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r4 != r5) goto L61
            goto Le2
        L61:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r5 = com.alibaba.fastjson2.JSONArray.class
            if (r4 == r5) goto L6b
            java.lang.Class r5 = com.alibaba.fastjson2.JSONFactory.getClassJSONArray1x()
            if (r4 != r5) goto L88
        L6b:
            java.lang.Class r5 = r7.valueClass
            java.lang.Class<java.util.List> r6 = java.util.List.class
            if (r5 != r6) goto L88
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader
            if (r4 != 0) goto L7d
            java.lang.reflect.Type r4 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4)
            r7.valueObjectReader = r4
        L7d:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader     // Catch: java.lang.Exception -> Lf7
            r5 = r2
            com.alibaba.fastjson2.JSONArray r5 = (com.alibaba.fastjson2.JSONArray) r5     // Catch: java.lang.Exception -> Lf7
            java.lang.Object r2 = r4.createInstance(r5, r9)     // Catch: java.lang.Exception -> Lf7
            goto Lf7
        L88:
            java.lang.reflect.Type r5 = r7.valueType
            java.util.function.Function r5 = r0.getTypeConvert(r4, r5)
            if (r5 == 0) goto L95
            java.lang.Object r2 = r5.apply(r2)
            goto Lf7
        L95:
            boolean r5 = r2 instanceof java.util.Map
            if (r5 == 0) goto Laf
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4
            com.alibaba.fastjson2.reader.ObjectReader r5 = r7.valueObjectReader
            if (r5 != 0) goto La8
            java.lang.reflect.Type r5 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r5 = r0.getObjectReader(r5)
            r7.valueObjectReader = r5
        La8:
            com.alibaba.fastjson2.reader.ObjectReader r5 = r7.valueObjectReader     // Catch: java.lang.Exception -> Lf7
            java.lang.Object r2 = r5.createInstance(r4, r9)     // Catch: java.lang.Exception -> Lf7
            goto Lf7
        Laf:
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto Lc8
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader
            if (r4 != 0) goto Lbf
            java.lang.reflect.Type r4 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4)
            r7.valueObjectReader = r4
        Lbf:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r2 = r4.createInstance(r2, r9)
            goto Lf7
        Lc8:
            boolean r5 = r4.isInstance(r2)
            if (r5 == 0) goto Lcf
            goto Lf7
        Lcf:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "can not convert from "
            r8.<init>(r9)
            r8.append(r4)
            java.lang.String r9 = " to "
            java.lang.reflect.Type r10 = r7.valueType
            ah.a.s(r8, r9, r10)
            r8 = 0
            return r8
        Le2:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader
            if (r4 != 0) goto Lee
            java.lang.reflect.Type r4 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4)
            r7.valueObjectReader = r4
        Lee:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r7.valueObjectReader     // Catch: java.lang.Exception -> Lf7
            r5 = r2
            com.alibaba.fastjson2.JSONObject r5 = (com.alibaba.fastjson2.JSONObject) r5     // Catch: java.lang.Exception -> Lf7
            java.lang.Object r2 = r4.createInstance(r5, r9)     // Catch: java.lang.Exception -> Lf7
        Lf7:
            r1.put(r3, r2)
            goto L21
        Lfc:
            java.util.function.Function r8 = r7.builder
            if (r8 == 0) goto L105
            java.lang.Object r8 = r8.apply(r1)
            return r8
        L105:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.mapType
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
            r18 = this;
            r0 = r18
            java.util.function.Function r7 = r0.builder
            byte r1 = r19.getType()
            r2 = -110(0xffffffffffffff92, float:NaN)
            r8 = 0
            if (r1 != r2) goto L3d
            java.lang.Class r2 = r0.mapType
            long r3 = r0.features
            long r5 = r3 | r22
            r3 = 0
            r1 = r19
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.checkAutoType(r2, r3, r5)
            if (r2 == 0) goto L39
            if (r2 == r0) goto L39
            java.util.function.Function r7 = r2.getBuildFunction()
            boolean r1 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMap
            if (r1 != 0) goto L39
            boolean r1 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            if (r1 != 0) goto L39
            r3 = r20
            r4 = r21
            r5 = r22
            r1 = r2
            r2 = r19
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)
            return r1
        L39:
            r1 = r2
            r2 = r19
            goto L40
        L3d:
            r2 = r19
            r1 = r8
        L40:
            byte r3 = r2.getType()
            r4 = -81
            if (r3 != r4) goto L4c
            r2.next()
            return r8
        L4c:
            r4 = -90
            if (r3 != r4) goto L53
            r2.next()
        L53:
            com.alibaba.fastjson2.JSONReader$Context r9 = r2.context
            long r3 = r9.features
            long r10 = r22 | r3
            if (r1 == 0) goto L63
            java.lang.Object r1 = r1.createInstance(r10)
            java.util.Map r1 = (java.util.Map) r1
        L61:
            r12 = r1
            goto L76
        L63:
            java.lang.Class r1 = r0.instanceType
            java.lang.Class<java.util.HashMap> r3 = java.util.HashMap.class
            if (r1 != r3) goto L6f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            goto L61
        L6f:
            java.lang.Object r1 = r0.createInstance()
            java.util.Map r1 = (java.util.Map) r1
            goto L61
        L76:
            r13 = 0
            r14 = r13
        L78:
            byte r1 = r2.getType()
            r3 = -91
            if (r1 != r3) goto L9f
            r2.next()
            if (r7 == 0) goto L9e
            java.util.function.Function r1 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.ENUM_MAP_BUILDER
            if (r7 != r1) goto L99
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L99
            java.util.EnumMap r1 = new java.util.EnumMap
            java.lang.reflect.Type r2 = r0.keyType
            java.lang.Class r2 = (java.lang.Class) r2
            r1.<init>(r2)
            return r1
        L99:
            java.lang.Object r1 = r7.apply(r12)
            return r1
        L9e:
            return r12
        L9f:
            java.lang.reflect.Type r1 = r0.keyType
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r1 == r3) goto Le4
            boolean r1 = r2.isString()
            if (r1 == 0) goto Lac
            goto Le4
        Lac:
            boolean r1 = r2.isReference()
            if (r1 == 0) goto Lc4
            java.lang.String r1 = r2.readReference()
            com.alibaba.fastjson2.util.ReferenceKey r3 = new com.alibaba.fastjson2.util.ReferenceKey
            r3.<init>(r14)
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.of(r1)
            r2.addResolveTask(r12, r3, r1)
        Lc2:
            r15 = r3
            goto Le9
        Lc4:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.keyObjectReader
            if (r1 != 0) goto Ld2
            java.lang.reflect.Type r1 = r0.keyType
            if (r1 == 0) goto Ld2
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.getObjectReader(r1)
            r0.keyObjectReader = r1
        Ld2:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.keyObjectReader
            if (r1 != 0) goto Ldb
            java.lang.Object r3 = r2.readAny()
            goto Lc2
        Ldb:
            r3 = 0
            r4 = 0
            r5 = r22
            java.lang.Object r3 = r1.readJSONBObject(r2, r3, r4, r5)
            goto Lc2
        Le4:
            java.lang.String r3 = r2.readFieldName()
            goto Lc2
        Le9:
            boolean r1 = r2.isReference()
            if (r1 == 0) goto L110
            java.lang.String r1 = r2.readReference()
            java.lang.String r3 = ".."
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L100
            r12.put(r15, r12)
            goto L17c
        L100:
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.of(r1)
            r2.addResolveTask(r12, r15, r1)
            boolean r1 = r12 instanceof java.util.concurrent.ConcurrentMap
            if (r1 != 0) goto L17c
            r12.put(r15, r8)
            goto L17c
        L110:
            boolean r1 = r2.nextIfNull()
            if (r1 == 0) goto L11b
            r12.put(r15, r8)
            goto L17c
        L11b:
            java.lang.reflect.Type r1 = r0.valueType
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r16 = 0
            if (r1 != r3) goto L129
            java.lang.Object r1 = r2.readAny()
            r4 = r15
            goto L16d
        L129:
            java.lang.Class r2 = r0.valueClass
            r3 = 0
            r1 = r19
            r5 = r22
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.checkAutoType(r2, r3, r5)
            if (r2 == 0) goto L146
            if (r2 == r0) goto L146
            java.lang.reflect.Type r3 = r0.valueType
            r5 = r22
            r1 = r2
            r4 = r15
            r2 = r19
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)
            goto L16d
        L146:
            r4 = r15
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.valueObjectReader
            if (r1 != 0) goto L161
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r1 = r1.mask
            long r1 = r1 & r10
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 == 0) goto L156
            r1 = 1
            goto L157
        L156:
            r1 = r13
        L157:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r9.provider
            java.lang.reflect.Type r3 = r0.valueType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.getObjectReader(r3, r1)
            r0.valueObjectReader = r1
        L161:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.valueObjectReader
            java.lang.reflect.Type r3 = r0.valueType
            r2 = r19
            r5 = r22
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)
        L16d:
            if (r1 != 0) goto L179
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r2 = r2.mask
            long r2 = r2 & r10
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L179
            goto L17c
        L179:
            r12.put(r4, r1)
        L17c:
            int r14 = r14 + 1
            r2 = r19
            goto L78
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1.nextIfObjectStart()
            r7 = 0
            r9 = 0
            if (r2 != 0) goto L3e
            boolean r2 = r1.isTypeRedirect()
            if (r2 == 0) goto L17
            r1.setTypeRedirect(r9)
            r2 = 1
            goto L3f
        L17:
            boolean r2 = r1.nextIfNullOrEmptyString()
            if (r2 == 0) goto L1e
            return r7
        L1e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "expect '{', but '"
            r2.<init>(r3)
            char r3 = r1.current()
            r2.append(r3)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
        L3c:
            r1 = 0
            return r1
        L3e:
            r2 = r9
        L3f:
            com.alibaba.fastjson2.JSONReader$Context r10 = r1.context
            long r3 = r10.features
            long r11 = r3 | r22
            java.lang.Class r3 = r0.instanceType
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            if (r3 != r4) goto L6c
            java.util.function.Supplier r3 = r10.getObjectSupplier()
            java.lang.Class r4 = r0.mapType
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            if (r4 != r5) goto L62
            if (r3 == 0) goto L62
            java.lang.Object r3 = r3.get()
            java.util.Map r3 = (java.util.Map) r3
            java.util.Map r4 = com.alibaba.fastjson2.util.TypeUtils.getInnerMap(r3)
            goto L68
        L62:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r7
        L68:
            r13 = r2
            r14 = r3
            r15 = r4
            goto L8a
        L6c:
            java.lang.Class<java.util.EnumMap> r4 = java.util.EnumMap.class
            if (r3 != r4) goto L83
            java.lang.reflect.Type r3 = r0.keyType
            boolean r3 = r3 instanceof java.lang.Class
            if (r3 == 0) goto L83
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.reflect.Type r4 = r0.keyType
            java.lang.Class r4 = (java.lang.Class) r4
            r3.<init>(r4)
        L7f:
            r13 = r2
            r14 = r3
            r15 = r7
            goto L8a
        L83:
            java.lang.Object r3 = r0.createInstance(r11)
            java.util.Map r3 = (java.util.Map) r3
            goto L7f
        L8a:
            boolean r2 = r1.nextIfObjectEnd()
            if (r2 != 0) goto L273
            boolean r2 = r1.isEnd()
            if (r2 == 0) goto L98
            goto L273
        L98:
            boolean r2 = r1.nextIfNull()
            java.lang.String r3 = "illegal json"
            r4 = 58
            r16 = 0
            if (r2 == 0) goto Lb7
            boolean r2 = r1.nextIfMatch(r4)
            if (r2 == 0) goto Laf
            r4 = r22
            r3 = r1
            goto L20d
        Laf:
            java.lang.String r1 = r1.info(r3)
            ah.a.w(r1)
            goto L3c
        Lb7:
            java.lang.reflect.Type r2 = r0.keyType
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r2 != r5) goto L11c
            java.lang.String r2 = r1.readFieldName()
            if (r13 != 0) goto L100
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r5 = r5.mask
            long r5 = r5 & r11
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L100
            java.lang.String r5 = r0.getTypeKey()
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L100
            long r2 = r1.readTypeHashCode()
            java.lang.Class r4 = r0.mapType
            r5 = r22
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReaderAutoType(r2, r4, r5)
            if (r2 == 0) goto L26c
            boolean r3 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMap
            if (r3 == 0) goto L26c
            java.lang.Class r3 = r14.getClass()
            r4 = r2
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r4 = (com.alibaba.fastjson2.reader.ObjectReaderImplMap) r4
            java.lang.Class r4 = r4.instanceType
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26c
            java.lang.Object r2 = r2.createInstance(r5)
            java.util.Map r2 = (java.util.Map) r2
            r14 = r2
            goto L26c
        L100:
            r5 = r22
            if (r2 != 0) goto L10e
            java.lang.String r2 = r1.readString()
            boolean r4 = r1.nextIfMatch(r4)
            if (r4 == 0) goto L113
        L10e:
            r3 = r1
            r7 = r2
            r4 = r5
            goto L20d
        L113:
            java.lang.String r1 = r1.info(r3)
            ah.a.w(r1)
            goto L3c
        L11c:
            r5 = r22
            java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
            if (r13 != 0) goto L193
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r4 = r3.mask
            long r3 = r11 & r4
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 != 0) goto L136
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r3 = r10.getContextAutoTypeBeforeHandler()
            if (r3 == 0) goto L133
            goto L136
        L133:
            r3 = r22
            goto L194
        L136:
            char r3 = r1.current()
            r4 = 34
            if (r3 != r4) goto L133
            java.lang.reflect.Type r3 = r0.keyType
            boolean r4 = r3 instanceof java.lang.Class
            if (r4 == 0) goto L14c
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r2.isAssignableFrom(r3)
            if (r3 != 0) goto L133
        L14c:
            java.lang.String r2 = r1.readFieldName()
            java.lang.String r3 = r0.getTypeKey()
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L185
            long r2 = r1.readTypeHashCode()
            java.lang.Class r4 = r0.mapType
            r5 = r22
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReaderAutoType(r2, r4, r5)
            r3 = r5
            if (r2 == 0) goto L26c
            boolean r1 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMap
            if (r1 == 0) goto L26c
            java.lang.Class r1 = r14.getClass()
            r5 = r2
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r5 = (com.alibaba.fastjson2.reader.ObjectReaderImplMap) r5
            java.lang.Class r5 = r5.instanceType
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L26c
            java.lang.Object r1 = r2.createInstance(r3)
            java.util.Map r1 = (java.util.Map) r1
        L182:
            r14 = r1
            goto L26c
        L185:
            r3 = r22
            java.lang.reflect.Type r1 = r0.keyType
            java.lang.Object r2 = com.alibaba.fastjson2.util.TypeUtils.cast(r2, r1)
            r7 = r2
            r4 = r3
            r3 = r19
            goto L20d
        L193:
            r3 = r5
        L194:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.keyObjectReader
            if (r1 == 0) goto L1a6
            r4 = 0
            r5 = 0
            r3 = 0
            r7 = r2
            r8 = 58
            r2 = r19
            java.lang.Object r1 = r1.readObject(r2, r3, r4, r5)
            goto L1b1
        L1a6:
            r7 = r2
            r8 = 58
            r2 = r19
            java.lang.reflect.Type r1 = r0.keyType
            java.lang.Object r1 = r2.read(r1)
        L1b1:
            if (r1 != 0) goto L1c4
            java.lang.reflect.Type r3 = r0.keyType
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r3 = r7.isAssignableFrom(r3)
            if (r3 == 0) goto L1c4
            java.lang.String r1 = r2.getString()
            r2.nextIfMatch(r8)
        L1c4:
            if (r13 != 0) goto L206
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r3 = r3.mask
            long r3 = r3 & r11
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 == 0) goto L206
            java.lang.String r3 = r0.getTypeKey()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L206
            long r2 = r19.readTypeHashCode()
            java.lang.Class r4 = r0.mapType
            r1 = r19
            r5 = r22
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReaderAutoType(r2, r4, r5)
            r3 = r1
            r4 = r5
            if (r2 == 0) goto L26c
            boolean r1 = r2 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMap
            if (r1 == 0) goto L26c
            java.lang.Class r1 = r14.getClass()
            r6 = r2
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r6 = (com.alibaba.fastjson2.reader.ObjectReaderImplMap) r6
            java.lang.Class r6 = r6.instanceType
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L26c
            java.lang.Object r1 = r2.createInstance(r4)
            java.util.Map r1 = (java.util.Map) r1
            goto L182
        L206:
            r4 = r22
            r3 = r2
            r3.nextIfMatch(r8)
            r7 = r1
        L20d:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.valueObjectReader
            if (r1 != 0) goto L227
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r1 = r1.mask
            long r1 = r1 & r11
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 == 0) goto L21c
            r1 = 1
            goto L21d
        L21c:
            r1 = r9
        L21d:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r10.provider
            java.lang.reflect.Type r6 = r0.valueType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r2.getObjectReader(r6, r1)
            r0.valueObjectReader = r1
        L227:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.valueObjectReader
            java.lang.reflect.Type r3 = r0.valueType
            r5 = 0
            r2 = r19
            r4 = r21
            java.lang.Object r1 = r1.readObject(r2, r3, r4, r5)
            if (r1 != 0) goto L241
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r2 = r2.mask
            long r2 = r2 & r11
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 == 0) goto L241
            goto L26c
        L241:
            if (r15 == 0) goto L248
            java.lang.Object r2 = r15.put(r7, r1)
            goto L24c
        L248:
            java.lang.Object r2 = r14.put(r7, r1)
        L24c:
            if (r2 == 0) goto L26c
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r3 = r3.mask
            long r3 = r3 & r11
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 == 0) goto L26c
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L265
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            r3.add(r1)
            r14.put(r7, r2)
            goto L26c
        L265:
            com.alibaba.fastjson2.JSONArray r1 = com.alibaba.fastjson2.JSONArray.of(r2, r1)
            r14.put(r7, r1)
        L26c:
            int r13 = r13 + 1
            r1 = r19
            r7 = 0
            goto L8a
        L273:
            r19.nextIfComma()
            java.util.function.Function r1 = r0.builder
            if (r1 == 0) goto L27f
            java.lang.Object r1 = r1.apply(r14)
            return r1
        L27f:
            return r14
    }
}
