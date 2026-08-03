package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderMapMethodReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReaderMapMethod<T> {
    public FieldReaderMapMethodReadOnly(java.lang.String r16, java.lang.reflect.Type r17, java.lang.Class r18, int r19, long r20, java.lang.String r22, java.lang.reflect.Method r23, java.lang.reflect.Field r24, java.lang.String r25, java.util.function.BiConsumer r26) {
            r15 = this;
            r9 = 0
            r12 = 0
            r8 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r10 = r23
            r11 = r24
            r13 = r25
            r14 = r26
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    private java.util.Map getReadOnlyMap(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> La
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> La
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> La
            return r3
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r3.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r3 = eh.a.r(r3, r0, r1)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L24
        L3:
            java.util.Map r3 = r2.getReadOnlyMap(r3)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            if (r3 == r0) goto L24
            if (r3 != 0) goto Le
            goto L24
        Le:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$UnmodifiableMap"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
            goto L24
        L1f:
            java.util.Map r4 = (java.util.Map) r4
            r3.putAll(r4)
        L24:
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMapMethod, com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T r8, java.lang.Object r9, long r10) {
            r7 = this;
            java.lang.String r0 = r7.arrayToMapKey
            if (r0 == 0) goto L23
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L23
            java.util.Map r1 = r7.getReadOnlyMap(r8)
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r3 = r7.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r4 = r7.namingStrategy
            java.lang.reflect.Type r8 = r7.valueType
            long r5 = r7.features
            long r9 = r5 | r10
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r8, r9)
            java.util.function.BiConsumer r6 = r7.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r1, r2, r3, r4, r5, r6)
            return
        L23:
            super.acceptAny(r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(java.lang.Object r1, java.lang.String r2, java.lang.Object r3) {
            r0 = this;
            java.util.Map r1 = r0.getReadOnlyMap(r1)
            r1.put(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getItemObjectReader(com.alibaba.fastjson2.JSONReader r3) {
            r2 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.itemReader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.itemReader
            return r3
        L7:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReader(r3)
            boolean r1 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMap
            if (r1 == 0) goto L14
            com.alibaba.fastjson2.reader.ObjectReaderImplString r3 = com.alibaba.fastjson2.reader.ObjectReaderImplString.INSTANCE
            r2.itemReader = r3
            return r3
        L14:
            boolean r1 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            if (r1 == 0) goto L23
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r0 = (com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped) r0
            java.lang.reflect.Type r0 = r0.valueType
            com.alibaba.fastjson2.reader.ObjectReader r3 = r3.getObjectReader(r0)
            r2.itemReader = r3
            return r3
        L23:
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r3 = com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(com.alibaba.fastjson2.JSONReader r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r0 = r8.getFieldName()
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.getItemObjectReader(r8)
            java.lang.reflect.Type r3 = r7.getItemType()
            java.lang.String r4 = r7.fieldName
            r5 = 0
            r2 = r8
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
            java.util.Map r9 = r7.getReadOnlyMap(r9)
            r9.put(r0, r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMapMethod, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, T r9) {
            r7 = this;
            java.lang.String r0 = r7.arrayToMapKey
            if (r0 == 0) goto L26
            boolean r0 = r8.isArray()
            if (r0 == 0) goto L26
            java.util.Map r1 = r7.getReadOnlyMap(r9)
            java.lang.reflect.Type r9 = r7.valueType
            java.util.List r2 = r8.readArray(r9)
            java.lang.String r3 = r7.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r4 = r7.namingStrategy
            java.lang.reflect.Type r8 = r7.valueType
            long r5 = r7.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r8, r5)
            java.util.function.BiConsumer r6 = r7.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r1, r2, r3, r4, r5, r6)
            return
        L26:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            if (r0 != 0) goto L36
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.getContext()
            java.lang.reflect.Type r1 = r7.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r1)
            r7.initReader = r0
        L36:
            boolean r0 = r8.jsonb
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            if (r0 == 0) goto L4a
            java.lang.reflect.Type r3 = r7.getItemType()
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            goto L57
        L4a:
            r2 = r8
            java.lang.reflect.Type r3 = r7.getItemType()
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
        L57:
            r7.accept(r9, r8)
            return
    }
}
