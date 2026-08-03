package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderMapFieldReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReaderMapField<T> {
    public FieldReaderMapFieldReadOnly(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.lang.reflect.Field r21, java.lang.String r22, java.util.function.BiConsumer r23) {
            r13 = this;
            r8 = 0
            r9 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L28
        L3:
            java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.Exception -> L29
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L29
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Exception -> L29
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            if (r3 == r0) goto L28
            if (r3 != 0) goto L12
            goto L28
        L12:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$UnmodifiableMap"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L23
            goto L28
        L23:
            java.util.Map r4 = (java.util.Map) r4
            r3.putAll(r4)
        L28:
            return
        L29:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T r7, java.lang.Object r8, long r9) {
            r6 = this;
            java.lang.String r0 = r6.arrayToMapKey
            if (r0 == 0) goto L3b
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L3b
            java.lang.reflect.Field r0 = r6.field     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Exception -> L28
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L28
            r1 = r8
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String r2 = r6.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r3 = r6.namingStrategy
            java.lang.reflect.Type r7 = r6.valueType
            long r4 = r6.features
            long r8 = r4 | r9
            com.alibaba.fastjson2.reader.ObjectReader r4 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r7, r8)
            java.util.function.BiConsumer r5 = r6.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r0, r1, r2, r3, r4, r5)
            return
        L28:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "set "
            r7.<init>(r8)
            java.lang.String r8 = r6.fieldName
            java.lang.String r9 = " error"
            java.lang.String r7 = eh.a.r(r7, r8, r9)
            ah.a.w(r7)
            return
        L3b:
            super.acceptAny(r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            java.lang.reflect.Field r0 = r1.field     // Catch: java.lang.Exception -> Lc
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Exception -> Lc
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Lc
            r2.put(r3, r4)
            return
        Lc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "set "
            r2.<init>(r3)
            java.lang.String r3 = r1.fieldName
            java.lang.String r4 = " error"
            java.lang.String r2 = eh.a.r(r2, r3, r4)
            ah.a.w(r2)
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
    public void processExtra(com.alibaba.fastjson2.JSONReader r7, java.lang.Object r8) {
            r6 = this;
            java.lang.reflect.Field r0 = r6.field     // Catch: java.lang.Exception -> L1c
            java.lang.Object r8 = r0.get(r8)     // Catch: java.lang.Exception -> L1c
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Exception -> L1c
            java.lang.String r3 = r7.getFieldName()
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.getItemObjectReader(r7)
            r2 = 0
            r4 = 0
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            r8.put(r3, r7)
            return
        L1c:
            r0 = move-exception
            r1 = r7
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r8.<init>(r0)
            java.lang.String r0 = r6.fieldName
            java.lang.String r2 = " error"
            java.lang.String r8 = bc.e.m(r8, r0, r2, r1)
            ah.a.x(r8, r7)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, T r9) {
            r7 = this;
            java.lang.String r0 = r7.arrayToMapKey
            if (r0 == 0) goto L3e
            boolean r0 = r8.isArray()
            if (r0 == 0) goto L3e
            java.lang.reflect.Field r0 = r7.field     // Catch: java.lang.Exception -> L2b
            java.lang.Object r9 = r0.get(r9)     // Catch: java.lang.Exception -> L2b
            r0 = r9
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Type r9 = r7.valueType
            java.util.List r1 = r8.readArray(r9)
            java.lang.String r2 = r7.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r3 = r7.namingStrategy
            java.lang.reflect.Type r8 = r7.valueType
            long r4 = r7.features
            com.alibaba.fastjson2.reader.ObjectReader r4 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r8, r4)
            java.util.function.BiConsumer r5 = r7.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r0, r1, r2, r3, r4, r5)
            return
        L2b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "set "
            r8.<init>(r9)
            java.lang.String r9 = r7.fieldName
            java.lang.String r0 = " error"
            java.lang.String r8 = eh.a.r(r8, r9, r0)
            ah.a.w(r8)
            return
        L3e:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            if (r0 != 0) goto L4e
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.getContext()
            java.lang.reflect.Type r1 = r7.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r1)
            r7.initReader = r0
        L4e:
            boolean r0 = r8.jsonb
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            if (r0 == 0) goto L60
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            goto L6b
        L60:
            r2 = r8
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
        L6b:
            r7.accept(r9, r8)
            return
    }
}
