package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplMapMultiValueType implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.util.function.Function builder;
    final java.lang.Class instanceType;
    final java.lang.Class mapType;
    final com.alibaba.fastjson2.util.MapMultiValueType multiValueType;

    public ObjectReaderImplMapMultiValueType(com.alibaba.fastjson2.util.MapMultiValueType r3) {
            r2 = this;
            r2.<init>()
            r2.multiValueType = r3
            java.lang.Class<T extends java.util.Map> r3 = r3.mapType
            r2.mapType = r3
            java.lang.String r0 = r3.getName()
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            if (r3 == r1) goto L3e
            java.lang.Class<java.util.AbstractMap> r1 = java.util.AbstractMap.class
            if (r3 == r1) goto L3e
            java.lang.String r1 = "java.util.Collections$SingletonMap"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1e
            goto L3e
        L1e:
            java.lang.String r1 = "java.util.Collections$UnmodifiableMap"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            java.lang.Class<java.util.LinkedHashMap> r3 = java.util.LinkedHashMap.class
            goto L40
        L29:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            if (r3 != r0) goto L30
            java.lang.Class<java.util.TreeMap> r3 = java.util.TreeMap.class
            goto L40
        L30:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            if (r3 != r0) goto L37
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r3 = java.util.concurrent.ConcurrentHashMap.class
            goto L40
        L37:
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r0 = java.util.concurrent.ConcurrentNavigableMap.class
            if (r3 != r0) goto L40
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r3 = java.util.concurrent.ConcurrentSkipListMap.class
            goto L40
        L3e:
            java.lang.Class<java.util.HashMap> r3 = java.util.HashMap.class
        L40:
            r2.instanceType = r3
            r3 = 0
            r2.builder = r3
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r1) {
            r0 = this;
            java.lang.Class r1 = r0.instanceType
            if (r1 == 0) goto L19
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L19
            java.lang.Class r1 = r0.instanceType     // Catch: java.lang.Exception -> L11
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L11
            return r1
        L11:
            r1 = move-exception
            java.lang.String r2 = "create map error"
            ah.a.x(r2, r1)
            r1 = 0
            return r1
        L19:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r14, java.lang.reflect.Type r15, java.lang.Object r16, long r17) {
            r13 = this;
            boolean r0 = r14.nextIfObjectStart()
            r1 = 0
            if (r0 != 0) goto L2e
            boolean r0 = r14.nextIfNullOrEmptyString()
            if (r0 == 0) goto Le
            return r1
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expect '{', but '"
            r0.<init>(r1)
            char r1 = r14.current()
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r14 = r14.info(r0)
            ah.a.w(r14)
        L2c:
            r14 = 0
            return r14
        L2e:
            com.alibaba.fastjson2.JSONReader$Context r0 = r14.getContext()
            long r2 = r0.features
            long r2 = r2 | r17
            java.lang.Class r4 = r13.instanceType
            java.lang.Class<java.util.HashMap> r5 = java.util.HashMap.class
            if (r4 != r5) goto L59
            java.util.function.Supplier r0 = r0.getObjectSupplier()
            java.lang.Class r4 = r13.mapType
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            if (r4 != r5) goto L53
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r4 = com.alibaba.fastjson2.util.TypeUtils.getInnerMap(r0)
            goto L6b
        L53:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            goto L62
        L59:
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r0 = com.alibaba.fastjson2.JSONObject.class
            if (r4 != r0) goto L64
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
        L62:
            r4 = r1
            goto L6b
        L64:
            java.lang.Object r0 = r13.createInstance(r2)
            java.util.Map r0 = (java.util.Map) r0
            goto L62
        L6b:
            r5 = r1
        L6c:
            boolean r6 = r14.nextIfObjectEnd()
            if (r6 != 0) goto Lf0
            boolean r6 = r14.isEnd()
            if (r6 == 0) goto L7a
            goto Lf0
        L7a:
            boolean r6 = r14.nextIfNull()
            if (r6 == 0) goto L95
            r6 = 58
            boolean r6 = r14.nextIfMatch(r6)
            if (r6 == 0) goto L8b
            r9 = r5
            r5 = r1
            goto La0
        L8b:
            java.lang.String r0 = "illegal json"
            java.lang.String r14 = r14.info(r0)
            ah.a.w(r14)
            goto L2c
        L95:
            java.lang.String r5 = r14.readFieldName()
            com.alibaba.fastjson2.util.MapMultiValueType r6 = r13.multiValueType
            java.lang.reflect.Type r6 = r6.getType(r5)
            r9 = r6
        La0:
            if (r9 != 0) goto La7
            java.lang.Object r6 = r14.readAny()
            goto Lb4
        La7:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r14.getObjectReader(r9)
            r11 = 0
            r8 = r14
            r10 = r16
            java.lang.Object r6 = r7.readObject(r8, r9, r10, r11)
        Lb4:
            r7 = 0
            if (r6 != 0) goto Lc2
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNullPropertyValue
            long r10 = r10.mask
            long r10 = r10 & r2
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 == 0) goto Lc2
            goto Led
        Lc2:
            if (r4 == 0) goto Lc9
            java.lang.Object r10 = r4.put(r5, r6)
            goto Lcd
        Lc9:
            java.lang.Object r10 = r0.put(r5, r6)
        Lcd:
            if (r10 == 0) goto Led
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.DuplicateKeyValueAsArray
            long r11 = r11.mask
            long r11 = r11 & r2
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 == 0) goto Led
            boolean r7 = r10 instanceof java.util.Collection
            if (r7 == 0) goto Le6
            r7 = r10
            java.util.Collection r7 = (java.util.Collection) r7
            r7.add(r6)
            r0.put(r5, r10)
            goto Led
        Le6:
            com.alibaba.fastjson2.JSONArray r6 = com.alibaba.fastjson2.JSONArray.of(r10, r6)
            r0.put(r5, r6)
        Led:
            r5 = r9
            goto L6c
        Lf0:
            r14.nextIfComma()
            java.util.function.Function r14 = r13.builder
            if (r14 == 0) goto Lfc
            java.lang.Object r14 = r14.apply(r0)
            return r14
        Lfc:
            return r0
    }
}
