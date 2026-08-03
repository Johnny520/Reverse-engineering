package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplMap implements com.alibaba.fastjson2.reader.ObjectReader {
    static final java.util.function.Function ENUM_MAP_BUILDER = null;
    public static final com.alibaba.fastjson2.reader.ObjectReaderImplMap INSTANCE = null;
    public static final com.alibaba.fastjson2.reader.ObjectReaderImplMap INSTANCE_OBJECT = null;
    final java.util.function.Function builder;
    final boolean fastjson1x;
    final long features;
    final java.lang.reflect.Type fieldType;
    volatile boolean instanceError;
    final java.lang.Class instanceType;
    java.lang.Object mapSingleton;
    final java.lang.Class mapType;
    final long mapTypeHash;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class SingleMapBuilder implements java.util.function.Function<java.util.Map, java.util.Map> {
        public SingleMapBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.function.Function
        public /* bridge */ /* synthetic */ java.util.Map apply(java.util.Map r1) {
                r0 = this;
                java.util.Map r1 = (java.util.Map) r1
                java.util.Map r1 = r0.apply2(r1)
                return r1
        }

        /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
        public java.util.Map apply2(java.util.Map r2) {
                r1 = this;
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
                java.lang.Object r2 = r2.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r0 = r2.getKey()
                java.lang.Object r2 = r2.getValue()
                java.util.Map r2 = java.util.Collections.singletonMap(r0, r2)
                return r2
        }
    }

    static {
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r1 = 22
            r0.<init>(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplMap.ENUM_MAP_BUILDER = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap
            r8 = 0
            r10 = 0
            r3 = 0
            java.lang.Class<java.util.HashMap> r4 = java.util.HashMap.class
            r5 = 77
            java.lang.Class<java.util.HashMap> r7 = java.util.HashMap.class
            r2.<init>(r3, r4, r5, r7, r8, r10)
            com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE = r2
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r3 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap
            r9 = 0
            r11 = 0
            r4 = 0
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r5 = com.alibaba.fastjson2.JSONObject.class
            r6 = -2622135058008237800(0xdb9c4e0eb2521918, double:-2.0090923778290765E133)
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r8 = com.alibaba.fastjson2.JSONObject.class
            r3.<init>(r4, r5, r6, r8, r9, r11)
            com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE_OBJECT = r3
            return
    }

    public ObjectReaderImplMap(java.lang.Class r8, long r9, java.lang.Object r11) {
            r7 = this;
            r6 = 0
            r2 = r8
            r3 = r8
            r0 = r7
            r1 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            r0.mapSingleton = r11
            return
    }

    private ObjectReaderImplMap(java.lang.reflect.Type r1, java.lang.Class r2, long r3, java.lang.Class r5, long r6, java.util.function.Function r8) {
            r0 = this;
            r0.<init>()
            r0.fieldType = r1
            r0.mapType = r2
            r0.mapTypeHash = r3
            r0.instanceType = r5
            r0.features = r6
            r0.builder = r8
            if (r2 == 0) goto L1f
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "com.alibaba.fastjson.JSONObject"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            r0.fastjson1x = r1
            return
    }

    public ObjectReaderImplMap(java.lang.reflect.Type r11, java.lang.Class r12, java.lang.Class r13, long r14, java.util.function.Function r16) {
            r10 = this;
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r12)
            long r4 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r7 = r14
            r9 = r16
            r1.<init>(r2, r3, r4, r6, r7, r9)
            return
    }

    public static /* synthetic */ java.lang.Object a(java.lang.Object r0) {
            java.lang.Object r0 = lambda$static$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object b(java.lang.reflect.Constructor r0, java.lang.Object r1) {
            java.lang.Object r0 = lambda$createObjectSupplier$1(r0, r1)
            return r0
    }

    public static java.util.function.Function createObjectSupplier(java.lang.Class r2) {
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L11
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L11
            bc.j r0 = new bc.j
            r1 = 6
            r0.<init>(r2, r1)
            return r0
        L11:
            java.lang.String r2 = "create JSONObject1 error"
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    private static /* synthetic */ java.lang.Object lambda$createObjectSupplier$1(java.lang.reflect.Constructor r0, java.lang.Object r1) {
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            java.lang.String r0 = "create JSONObject1 error"
            ah.a.w(r0)
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$static$0(java.lang.Object r1) {
            java.util.EnumMap r0 = new java.util.EnumMap
            java.util.Map r1 = (java.util.Map) r1
            r0.<init>(r1)
            return r0
    }

    public static com.alibaba.fastjson2.reader.ObjectReader of(java.lang.reflect.Type r16, java.lang.Class r17, long r18) {
            r1 = r17
            r4 = r18
            java.lang.String r0 = ""
            java.lang.String r2 = r1.getSimpleName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1e
            java.lang.Class r0 = r1.getSuperclass()
            if (r16 != 0) goto L1b
            java.lang.reflect.Type r2 = r1.getGenericSuperclass()
            goto L21
        L1b:
            r2 = r16
            goto L21
        L1e:
            r2 = r16
            r0 = r1
        L21:
            java.lang.String r3 = r1.getName()
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            java.lang.String r7 = "java.util.Collections$UnmodifiableMap"
            java.lang.String r8 = "java.util.Collections$SingletonMap"
            java.lang.Class<java.util.LinkedHashMap> r9 = java.util.LinkedHashMap.class
            java.lang.Class<java.util.HashMap> r10 = java.util.HashMap.class
            r11 = 0
            if (r1 == r6) goto L80
            java.lang.Class<java.util.AbstractMap> r6 = java.util.AbstractMap.class
            if (r1 == r6) goto L80
            boolean r6 = r3.equals(r8)
            if (r6 == 0) goto L3d
            goto L80
        L3d:
            boolean r6 = r3.equals(r7)
            if (r6 == 0) goto L46
            r6 = r9
        L44:
            r0 = r11
            goto L82
        L46:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r6 = java.util.concurrent.ConcurrentMap.class
            if (r1 != r6) goto L4e
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r0 = java.util.concurrent.ConcurrentHashMap.class
        L4c:
            r6 = r0
            goto L44
        L4e:
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r6 = java.util.concurrent.ConcurrentNavigableMap.class
            if (r1 != r6) goto L55
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r0 = java.util.concurrent.ConcurrentSkipListMap.class
            goto L4c
        L55:
            java.lang.String r6 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r1)
            r6.getClass()
            java.lang.String r12 = "java.util.Collections$SynchronizedSortedMap"
            boolean r12 = r6.equals(r12)
            if (r12 != 0) goto L76
            java.lang.String r12 = "java.util.Collections$SynchronizedMap"
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L6d
            goto L4c
        L6d:
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r6 = 19
            r0.<init>(r6)
            r6 = r10
            goto L82
        L76:
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r6 = 20
            r0.<init>(r6)
            java.lang.Class<java.util.TreeMap> r6 = java.util.TreeMap.class
            goto L82
        L80:
            r6 = r10
            goto L44
        L82:
            boolean r12 = r2 instanceof java.lang.reflect.ParameterizedType
            r14 = 2
            r15 = 1
            if (r12 == 0) goto Lbd
            r12 = r2
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()
            r16 = 0
            int r13 = r12.length
            if (r13 != r14) goto Lbf
            java.lang.String r13 = "org.springframework.util.LinkedMultiValueMap"
            java.lang.String r14 = r6.getName()
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto Lbf
            r3 = r12[r16]
            r2 = r12[r15]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r3 != r7) goto Lb2
            if (r2 != r7) goto Lb2
            if (r0 != 0) goto Lb2
            com.alibaba.fastjson2.reader.ObjectReaderImplMapString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapString
            r0.<init>(r1, r6, r4)
            return r0
        Lb2:
            r7 = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            r4 = r2
            r2 = r6
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return r0
        Lbd:
            r16 = 0
        Lbf:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r12 = com.alibaba.fastjson2.JSONObject.class
            if (r2 != 0) goto Ld7
            r13 = 0
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto Ld7
            if (r1 != r10) goto Ld0
            if (r6 != r10) goto Ld0
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE
            return r0
        Ld0:
            if (r1 != r12) goto Ld7
            if (r6 != r12) goto Ld7
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE_OBJECT
            return r0
        Ld7:
            java.lang.String r13 = r6.getName()
            java.lang.String r14 = "com.alibaba.fastjson.JSONObject"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto Le6
            r7 = r0
            goto L14f
        Le6:
            java.lang.String r10 = "java.util.Collections$EmptyMap"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto Lf6
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.<init>(r6, r4, r1)
            return r0
        Lf6:
            java.lang.String r10 = "tf.u"
            boolean r10 = r13.equals(r10)
            if (r10 == 0) goto L128
            java.lang.String r0 = "INSTANCE"
            java.lang.reflect.Field r0 = r6.getField(r0)     // Catch: java.lang.IllegalAccessException -> L10e java.lang.NoSuchFieldException -> L110
            boolean r1 = r0.isAccessible()     // Catch: java.lang.IllegalAccessException -> L10e java.lang.NoSuchFieldException -> L110
            if (r1 != 0) goto L112
            r0.setAccessible(r15)     // Catch: java.lang.IllegalAccessException -> L10e java.lang.NoSuchFieldException -> L110
            goto L112
        L10e:
            r0 = move-exception
            goto L11c
        L110:
            r0 = move-exception
            goto L11c
        L112:
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.IllegalAccessException -> L10e java.lang.NoSuchFieldException -> L110
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r1 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap
            r1.<init>(r6, r4, r0)
            return r1
        L11c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to get singleton of "
            java.lang.String r2 = p.a.k(r6, r2)
            r1.<init>(r2, r0)
            throw r1
        L128:
            java.lang.Class<com.alibaba.fastjson2.util.JSONObject1O> r10 = com.alibaba.fastjson2.util.JSONObject1O.class
            if (r6 != r10) goto L133
            java.util.function.Function r0 = com.alibaba.fastjson2.JSONFactory.getBuilderJSONObject1x()
            r7 = r0
            r10 = r9
            goto L14f
        L133:
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L143
            com.alibaba.fastjson2.reader.f r0 = new com.alibaba.fastjson2.reader.f
            r3 = 21
            r0.<init>(r3)
        L140:
            r7 = r0
            r10 = r6
            goto L14f
        L143:
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L140
            com.alibaba.fastjson2.reader.ObjectReaderImplMap$SingleMapBuilder r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap$SingleMapBuilder
            r0.<init>()
            goto L140
        L14f:
            java.lang.reflect.Type r0 = r10.getGenericSuperclass()
            if (r1 == r12) goto L179
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L179
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r3 = r0.length
            r6 = 2
            if (r3 != r6) goto L179
            r3 = r0[r16]
            r0 = r0[r15]
            boolean r6 = r3 instanceof java.lang.reflect.TypeVariable
            if (r6 != 0) goto L179
            boolean r6 = r0 instanceof java.lang.reflect.TypeVariable
            if (r6 != 0) goto L179
            r4 = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            r5 = 0
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r7)
            return r0
        L179:
            r6 = r10
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r1 != r0) goto L183
            java.util.function.Function r7 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.ENUM_MAP_BUILDER
            r3 = r9
        L181:
            r6 = r7
            goto L185
        L183:
            r3 = r6
            goto L181
        L185:
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMap
            r4 = r2
            r2 = r1
            r1 = r4
            r4 = r18
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r1) {
            r0 = this;
            java.lang.Class r1 = r0.instanceType
            java.lang.Class<java.util.HashMap> r2 = java.util.HashMap.class
            if (r1 != r2) goto Lc
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
        Lc:
            java.lang.Class<java.util.LinkedHashMap> r2 = java.util.LinkedHashMap.class
            if (r1 != r2) goto L16
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            return r1
        L16:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r2 = com.alibaba.fastjson2.JSONObject.class
            if (r1 != r2) goto L20
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            r1.<init>()
            return r1
        L20:
            java.lang.Object r2 = r0.mapSingleton
            if (r2 == 0) goto L25
            return r2
        L25:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "java.util.ImmutableCollections$Map1"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L4f
            java.lang.String r2 = "java.util.ImmutableCollections$MapN"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L49
            java.lang.Class r1 = r0.instanceType     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> L40
            return r1
        L40:
            java.lang.String r1 = "create map error : "
            java.lang.Class r2 = r0.instanceType
            ah.a.i(r2, r1)
            r1 = 0
            return r1
        L49:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            return r1
        L4f:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Map r3, long r4) {
            r2 = this;
            java.lang.Class r0 = r2.mapType
            boolean r0 = r0.isInstance(r3)
            if (r0 == 0) goto L9
            return r3
        L9:
            java.lang.Class r0 = r2.mapType
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            if (r0 != r1) goto L15
            com.alibaba.fastjson2.JSONObject r4 = new com.alibaba.fastjson2.JSONObject
            r4.<init>(r3)
            return r4
        L15:
            java.lang.Object r4 = r2.createInstance(r4)
            java.util.Map r4 = (java.util.Map) r4
            r4.putAll(r3)
            boolean r3 = r2.fastjson1x
            if (r3 == 0) goto L27
            java.util.Map r3 = com.alibaba.fastjson2.JSONFactory.createJSONObject1(r4)
            return r3
        L27:
            java.util.function.Function r3 = r2.builder
            if (r3 == 0) goto L30
            java.lang.Object r3 = r3.apply(r4)
            return r3
        L30:
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.util.function.Function getBuildFunction() {
            r1 = this;
            java.util.function.Function r0 = r1.builder
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.mapType
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
            r17 = this;
            r0 = r17
            java.lang.Class r2 = r0.mapType
            long r3 = r0.mapTypeHash
            long r5 = r0.features
            long r5 = r5 | r21
            r1 = r18
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.checkAutoType(r2, r3, r5)
            if (r2 == 0) goto L22
            if (r2 == r0) goto L22
            r3 = r19
            r4 = r20
            r5 = r21
            r1 = r2
            r2 = r18
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)
            return r1
        L22:
            r1 = r18
            r7 = r21
            boolean r2 = r1.nextIfNull()
            r9 = 0
            if (r2 == 0) goto L2e
            return r9
        L2e:
            r10 = -90
            r1.nextIfMatch(r10)
            long r11 = r1.features(r7)
            com.alibaba.fastjson2.JSONReader$Context r2 = r1.context
            java.util.function.Supplier r2 = r2.getObjectSupplier()
            java.lang.Class r3 = r0.mapType
            if (r3 != 0) goto L4c
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r2.get()
            java.util.Map r2 = (java.util.Map) r2
        L49:
            r13 = r2
            goto Le9
        L4c:
            java.lang.Class r2 = r0.instanceType
            java.lang.Class<java.util.HashMap> r3 = java.util.HashMap.class
            if (r2 != r3) goto L58
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            goto L49
        L58:
            java.lang.Class<java.util.LinkedHashMap> r3 = java.util.LinkedHashMap.class
            if (r2 != r3) goto L62
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            goto L49
        L62:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r2 != r3) goto L6c
            com.alibaba.fastjson2.JSONObject r2 = new com.alibaba.fastjson2.JSONObject
            r2.<init>()
            goto L49
        L6c:
            if (r2 == 0) goto L7d
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "java.util.Collections$EmptyMap"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L7d
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            goto L49
        L7d:
            boolean r2 = r0.instanceError
            java.lang.String r3 = "create map error "
            if (r2 != 0) goto Laa
            java.lang.Class r2 = r0.instanceType     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L8e
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L8e
            r4 = r2
            r2 = r9
            goto Lac
        L8e:
            r2 = 1
            r0.instanceError = r2
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.Class r5 = r0.instanceType
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r1.info(r4)
            r2.<init>(r4)
            r4 = r9
            goto Lac
        Laa:
            r2 = r9
            r4 = r2
        Lac:
            boolean r5 = r0.instanceError
            if (r5 == 0) goto Le6
            java.lang.Class r5 = r0.instanceType
            java.lang.Class r5 = r5.getSuperclass()
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto Le6
            java.lang.Class r5 = r0.instanceType     // Catch: java.lang.Throwable -> Lcd
            java.lang.Class r5 = r5.getSuperclass()     // Catch: java.lang.Throwable -> Lcd
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Throwable -> Lcd
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> Lcd
            r4 = r5
            r2 = r9
            goto Le6
        Lcd:
            if (r2 != 0) goto Le6
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.Class r3 = r0.instanceType
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r3 = r1.info(r3)
            r2.<init>(r3)
        Le6:
            if (r2 != 0) goto L1ec
            r13 = r4
        Le9:
            r2 = 0
            r14 = r2
        Leb:
            byte r2 = r1.getType()
            r3 = -91
            if (r2 != r3) goto L109
            r1.next()
            boolean r1 = r0.fastjson1x
            if (r1 == 0) goto Lff
            java.util.Map r1 = com.alibaba.fastjson2.JSONFactory.createJSONObject1(r13)
            return r1
        Lff:
            java.util.function.Function r1 = r0.builder
            if (r1 == 0) goto L108
            java.lang.Object r1 = r1.apply(r13)
            return r1
        L108:
            return r13
        L109:
            r3 = -109(0xffffffffffffff93, float:NaN)
            r4 = 73
            if (r2 < r4) goto L115
            java.lang.String r2 = r1.readFieldName()
        L113:
            r15 = r2
            goto L132
        L115:
            boolean r2 = r1.nextIfMatch(r3)
            if (r2 == 0) goto L12d
            java.lang.String r2 = r1.readString()
            com.alibaba.fastjson2.util.ReferenceKey r5 = new com.alibaba.fastjson2.util.ReferenceKey
            r5.<init>(r14)
            com.alibaba.fastjson2.JSONPath r2 = com.alibaba.fastjson2.JSONPath.of(r2)
            r1.addResolveTask(r13, r5, r2)
            r15 = r5
            goto L132
        L12d:
            java.lang.Object r2 = r1.readAny()
            goto L113
        L132:
            boolean r2 = r1.isReference()
            java.lang.String r5 = ".."
            if (r2 == 0) goto L155
            java.lang.String r2 = r1.readReference()
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L14a
            r13.put(r15, r13)
        L147:
            r4 = r1
            goto L1e5
        L14a:
            com.alibaba.fastjson2.JSONPath r2 = com.alibaba.fastjson2.JSONPath.of(r2)
            r1.addResolveTask(r13, r15, r2)
            r13.put(r15, r9)
            goto L147
        L155:
            byte r2 = r1.getType()
            if (r2 < r4) goto L167
            r4 = 125(0x7d, float:1.75E-43)
            if (r2 > r4) goto L167
            java.lang.String r2 = r1.readString()
            r4 = r1
            r6 = r15
            goto L1d4
        L167:
            r4 = -110(0xffffffffffffff92, float:NaN)
            if (r2 != r4) goto L18f
            long r2 = r0.features
            long r5 = r2 | r7
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 0
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.checkAutoType(r2, r3, r5)
            if (r2 == 0) goto L187
            r3 = 0
            r1 = r2
            r5 = r7
            r4 = r15
            r2 = r18
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)
            r6 = r4
            r4 = r2
        L185:
            r2 = r1
            goto L1d4
        L187:
            r4 = r18
            r6 = r15
            java.lang.Object r1 = r4.readAny()
            goto L185
        L18f:
            r4 = r1
            r6 = r15
            r1 = -79
            if (r2 != r1) goto L19b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.next()
            goto L1d4
        L19b:
            r1 = -80
            if (r2 != r1) goto L1a5
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4.next()
            goto L1d4
        L1a5:
            if (r2 != r3) goto L1bc
            java.lang.String r1 = r4.readReference()
            boolean r2 = r5.equals(r1)
            if (r2 == 0) goto L1b3
            r2 = r13
            goto L1d4
        L1b3:
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.of(r1)
            r4.addResolveTask(r13, r6, r1)
            r2 = r9
            goto L1d4
        L1bc:
            if (r2 != r10) goto L1c3
            java.util.Map r2 = r4.readObject()
            goto L1d4
        L1c3:
            r1 = -108(0xffffffffffffff94, float:NaN)
            if (r2 < r1) goto L1d0
            r1 = -92
            if (r2 > r1) goto L1d0
            java.util.List r2 = r4.readArray()
            goto L1d4
        L1d0:
            java.lang.Object r2 = r4.readAny()
        L1d4:
            if (r2 != 0) goto L1e2
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r7 = r1.mask
            long r7 = r7 & r11
            r15 = 0
            int r1 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r1 == 0) goto L1e2
            goto L1e5
        L1e2:
            r13.put(r6, r2)
        L1e5:
            int r14 = r14 + 1
            r7 = r21
            r1 = r4
            goto Leb
        L1ec:
            throw r2
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r4, java.lang.reflect.Type r5, java.lang.Object r6, long r7) {
            r3 = this;
            boolean r0 = r4.jsonb
            if (r0 == 0) goto La
            java.lang.Object r4 = r3.readJSONBObject(r4, r5, r6, r7)
            r5 = r3
            return r4
        La:
            r5 = r3
            boolean r6 = r4.nextIfNull()
            if (r6 == 0) goto L13
            r4 = 0
            return r4
        L13:
            com.alibaba.fastjson2.JSONReader$Context r6 = r4.context
            java.util.function.Supplier r0 = r6.getObjectSupplier()
            if (r0 == 0) goto L36
            java.lang.Class r1 = r5.mapType
            if (r1 == 0) goto L2f
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r2 = com.alibaba.fastjson2.JSONObject.class
            if (r1 == r2) goto L2f
            java.lang.String r2 = "com.alibaba.fastjson.JSONObject"
            java.lang.String r1 = r1.getName()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L36
        L2f:
            java.lang.Object r6 = r0.get()
            java.util.Map r6 = (java.util.Map) r6
            goto L3f
        L36:
            long r0 = r6.features
            long r0 = r0 | r7
            java.lang.Object r6 = r3.createInstance(r0)
            java.util.Map r6 = (java.util.Map) r6
        L3f:
            boolean r0 = r4.isString()
            if (r0 == 0) goto L72
            boolean r0 = r4.isTypeRedirect()
            if (r0 != 0) goto L72
            java.lang.String r0 = r4.readString()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L75
            com.alibaba.fastjson2.JSONReader$Context r1 = r4.getContext()
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r0, r1)
            r1.read(r6, r7)     // Catch: java.lang.Throwable -> L64
            r1.close()
            goto L75
        L64:
            r0 = move-exception
            r4 = r0
            if (r1 == 0) goto L71
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L71
        L6c:
            r0 = move-exception
            r6 = r0
            r4.addSuppressed(r6)
        L71:
            throw r4
        L72:
            r4.read(r6, r7)
        L75:
            r4.nextIfComma()
            boolean r4 = r5.fastjson1x
            if (r4 == 0) goto L81
            java.util.Map r4 = com.alibaba.fastjson2.JSONFactory.createJSONObject1(r6)
            return r4
        L81:
            java.util.function.Function r4 = r5.builder
            if (r4 == 0) goto L8a
            java.lang.Object r4 = r4.apply(r6)
            return r4
        L8a:
            return r6
    }
}
