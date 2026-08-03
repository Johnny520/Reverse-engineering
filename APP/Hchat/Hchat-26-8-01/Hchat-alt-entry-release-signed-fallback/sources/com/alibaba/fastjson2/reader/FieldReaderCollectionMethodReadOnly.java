package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderCollectionMethodReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    public FieldReaderCollectionMethodReadOnly(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.lang.reflect.Method r21, java.lang.reflect.Field r22) {
            r13 = this;
            r9 = 0
            r12 = 0
            r8 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r10 = r21
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            boolean r14 = r15 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L26
            java.lang.reflect.ParameterizedType r15 = (java.lang.reflect.ParameterizedType) r15
            java.lang.reflect.Type[] r14 = r15.getActualTypeArguments()
            int r15 = r14.length
            if (r15 <= 0) goto L26
            r15 = 0
            r14 = r14[r15]
            goto L27
        L26:
            r14 = 0
        L27:
            r13.itemType = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L4
            goto L9b
        L4:
            java.lang.reflect.Method r0 = r4.method     // Catch: java.lang.Exception -> L9c
            r1 = 0
            java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L9c
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Exception -> L9c
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r5 == r0) goto L9b
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r5 == r0) goto L9b
            if (r5 == 0) goto L9b
            boolean r0 = r5.equals(r6)
            if (r0 == 0) goto L1f
            goto L9b
        L1f:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$UnmodifiableRandomAccessList"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9b
            java.lang.String r1 = "java.util.Arrays$ArrayList"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9b
            java.lang.String r1 = "java.util.Collections$SingletonList"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L9b
            java.lang.String r1 = "java.util.ImmutableCollections$"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L9b
            java.lang.String r1 = "java.util.Collections$Unmodifiable"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L50
            goto L9b
        L50:
            if (r6 != r5) goto L53
            goto L9b
        L53:
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r6.next()
            if (r0 != 0) goto L69
            r5.add(r0)
            goto L59
        L69:
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L97
            java.lang.reflect.Type r1 = r4.itemType
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L97
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 != 0) goto L97
            com.alibaba.fastjson2.reader.ObjectReader r1 = r4.itemReader
            if (r1 != 0) goto L8d
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.reflect.Type r2 = r4.itemType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r2)
            r4.itemReader = r1
        L8d:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r4.itemReader
            java.util.Map r0 = (java.util.Map) r0
            r2 = 0
            java.lang.Object r0 = r1.createInstance(r0, r2)
        L97:
            r5.add(r0)
            goto L59
        L9b:
            return
        L9c:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, T r9) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            if (r0 != 0) goto Le
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            java.lang.reflect.Type r1 = r7.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r1)
            r7.initReader = r0
        Le:
            boolean r0 = r8.jsonb
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            if (r0 == 0) goto L20
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            r5 = 0
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            goto L2b
        L20:
            r2 = r8
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            r5 = 0
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
        L2b:
            r7.accept(r9, r8)
            return
    }
}
