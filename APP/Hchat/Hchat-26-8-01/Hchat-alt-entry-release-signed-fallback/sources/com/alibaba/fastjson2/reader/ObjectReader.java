package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectReader<T> {
    public static final long HASH_TYPE = 435678704704L;

    default T accept(T r9, java.util.Map r10, long r11) {
            r8 = this;
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r4 = r1.toString()
            java.lang.Object r1 = r0.getValue()
            com.alibaba.fastjson2.reader.FieldReader r2 = r8.getFieldReader(r4)
            if (r2 != 0) goto L31
            java.lang.Object r5 = r0.getValue()
            r2 = r8
            r3 = r9
            r6 = r11
            r2.acceptExtra(r3, r4, r5, r6)
            goto L8
        L31:
            r3 = r9
            r6 = r11
            r2.acceptAny(r3, r1, r6)
            goto L8
        L37:
            r3 = r9
            java.util.function.Function r9 = r8.getBuildFunction()
            if (r9 == 0) goto L43
            java.lang.Object r9 = r9.apply(r3)
            return r9
        L43:
            return r3
    }

    default void acceptExtra(java.lang.Object r1, java.lang.String r2, java.lang.Object r3, long r4) {
            r0 = this;
            return
    }

    default com.alibaba.fastjson2.reader.ObjectReader autoType(com.alibaba.fastjson2.JSONReader.Context r1, long r2) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReaderAutoType(r2)
            return r1
    }

    default com.alibaba.fastjson2.reader.ObjectReader autoType(com.alibaba.fastjson2.reader.ObjectReaderProvider r1, long r2) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r2)
            return r1
    }

    default T createInstance() {
            r2 = this;
            r0 = 0
            java.lang.Object r0 = r2.createInstance(r0)
            return r0
    }

    default T createInstance(long r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    default T createInstance(java.util.Collection r3) {
            r2 = this;
            r0 = 0
            java.lang.Object r3 = r2.createInstance(r3, r0)
            return r3
    }

    default T createInstance(java.util.Collection r1, long r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            throw r1
    }

    default T createInstance(java.util.Collection r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            r2 = this;
            long r0 = com.alibaba.fastjson2.JSONReader.Feature.of(r4)
            java.lang.Object r3 = r2.createInstance(r3, r0)
            return r3
    }

    default T createInstance(java.util.Map r10, long r11) {
            r9 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.String r1 = r9.getTypeKey()
            java.lang.Object r1 = r10.get(r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L42
            java.lang.String r1 = (java.lang.String) r1
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r7 = r2.mask
            long r7 = r7 & r11
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L26
            boolean r2 = r9 instanceof com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            if (r2 == 0) goto L24
            goto L26
        L24:
            r2 = 0
            goto L2a
        L26:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r9.autoType(r0, r5)
        L2a:
            if (r2 != 0) goto L39
            java.lang.Class r2 = r9.getObjectClass()
            long r5 = r9.getFeatures()
            long r5 = r5 | r11
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r1, r2, r5)
        L39:
            if (r2 == r9) goto L42
            if (r2 == 0) goto L42
            java.lang.Object r10 = r2.createInstance(r10, r11)
            return r10
        L42:
            java.lang.Object r0 = r9.createInstance(r3)
            java.lang.Object r10 = r9.accept(r0, r10, r11)
            return r10
    }

    default T createInstance(java.util.Map r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
            r5 = this;
            r0 = 0
            r2 = 0
        L3:
            int r3 = r7.length
            if (r2 >= r3) goto Le
            r3 = r7[r2]
            long r3 = r3.mask
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L3
        Le:
            java.lang.Object r6 = r5.createInstance(r6, r0)
            return r6
    }

    default T createInstanceNoneDefaultConstructor(java.util.Map<java.lang.Long, java.lang.Object> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    default java.util.function.Function getBuildFunction() {
            r1 = this;
            r0 = 0
            return r0
    }

    default long getFeatures() {
            r2 = this;
            r0 = 0
            return r0
    }

    default com.alibaba.fastjson2.reader.FieldReader getFieldReader(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    default com.alibaba.fastjson2.reader.FieldReader getFieldReader(java.lang.String r6) {
            r5 = this;
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)
            com.alibaba.fastjson2.reader.FieldReader r2 = r5.getFieldReader(r0)
            if (r2 != 0) goto L1d
            com.alibaba.fastjson2.reader.FieldReader r2 = r5.getFieldReaderLCase(r0)
            if (r2 != 0) goto L1d
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r6)
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 == 0) goto L1d
            com.alibaba.fastjson2.reader.FieldReader r6 = r5.getFieldReaderLCase(r3)
            return r6
        L1d:
            return r2
    }

    default com.alibaba.fastjson2.reader.FieldReader getFieldReaderLCase(long r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    default java.lang.Class<T> getObjectClass() {
            r1 = this;
            r0 = 0
            return r0
    }

    default java.lang.String getTypeKey() {
            r1 = this;
            java.lang.String r0 = "@type"
            return r0
    }

    default long getTypeKeyHash() {
            r2 = this;
            r0 = 435678704704(0x6570797440, double:2.15253880619E-312)
            return r0
    }

    default T readArrayMappingJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    default T readArrayMappingObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    default T readJSONBObject(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
            r9 = this;
            boolean r0 = r10.isArray()
            if (r0 == 0) goto L12
            boolean r0 = r10.isSupportBeanArray()
            if (r0 == 0) goto L12
            java.lang.Object r10 = r9.readArrayMappingJSONBObject(r10, r11, r12, r13)
            r11 = r9
            return r10
        L12:
            r2 = r11
            r11 = r9
            r10.nextIfObjectStart()
            r6 = 0
            r0 = 0
            r7 = r0
            r8 = r6
        L1b:
            boolean r0 = r10.nextIfObjectEnd()
            if (r0 == 0) goto L2f
            if (r8 != 0) goto L2e
            com.alibaba.fastjson2.JSONReader$Context r10 = r10.context
            long r0 = r10.features
            long r12 = r0 | r13
            java.lang.Object r10 = r9.createInstance(r12)
            return r10
        L2e:
            return r8
        L2f:
            long r0 = r10.readFieldNameHashCode()
            long r3 = r9.getTypeKeyHash()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L77
            if (r7 != 0) goto L77
            long r0 = r10.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r3 = r10.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r9.autoType(r3, r0)
            if (r0 != 0) goto L6c
            java.lang.String r0 = r10.getString()
            com.alibaba.fastjson2.reader.ObjectReader r1 = r3.getObjectReaderAutoType(r0, r6)
            if (r1 == 0) goto L55
            r0 = r1
            goto L6c
        L55:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "No suitable ObjectReader found for"
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r10 = r10.info(r12)
            ah.a.w(r10)
            r10 = 0
            return r10
        L6c:
            if (r0 != r11) goto L6f
            goto Lab
        L6f:
            r1 = r10
            r3 = r12
            r4 = r13
            java.lang.Object r10 = r0.readJSONBObject(r1, r2, r3, r4)
            return r10
        L77:
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L7e
            goto Lab
        L7e:
            com.alibaba.fastjson2.reader.FieldReader r0 = r9.getFieldReader(r0)
            if (r0 != 0) goto L97
            long r3 = r9.getFeatures()
            long r3 = r3 | r13
            boolean r1 = r10.isSupportSmartMatch(r3)
            if (r1 == 0) goto L97
            long r0 = r10.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r0 = r9.getFieldReaderLCase(r0)
        L97:
            if (r0 != 0) goto L9d
            r10.skipValue()
            goto Lab
        L9d:
            if (r8 != 0) goto La8
            com.alibaba.fastjson2.JSONReader$Context r1 = r10.context
            long r3 = r1.features
            long r3 = r3 | r13
            java.lang.Object r8 = r9.createInstance(r3)
        La8:
            r0.readFieldValue(r10, r8)
        Lab:
            int r7 = r7 + 1
            goto L1b
    }

    default T readObject(com.alibaba.fastjson2.JSONReader r7) {
            r6 = this;
            r3 = 0
            long r4 = r6.getFeatures()
            r2 = 0
            r0 = r6
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    default T readObject(com.alibaba.fastjson2.JSONReader r7, long r8) {
            r6 = this;
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r4 = r8
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    T readObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4);

    default T readObject(java.lang.String r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            r7 = this;
            com.alibaba.fastjson2.JSONReader$Context r9 = com.alibaba.fastjson2.JSONFactory.createReadContext(r9)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r8, r9)
            long r5 = r7.getFeatures()     // Catch: java.lang.Throwable -> L19
            r3 = 0
            r4 = 0
            r1 = r7
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L18
            r2.close()
        L18:
            return r8
        L19:
            r0 = move-exception
            r8 = r0
            if (r2 == 0) goto L26
            r2.close()     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L26:
            throw r8
    }

    default boolean setFieldValue(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            com.alibaba.fastjson2.reader.FieldReader r2 = r0.getFieldReader(r2)
            if (r2 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r2.accept(r1, r3)
            r1 = 1
            return r1
    }
}
