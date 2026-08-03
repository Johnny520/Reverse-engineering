package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderInterface<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    public ObjectReaderInterface(java.lang.Class r1, java.lang.String r2, java.lang.String r3, long r4, java.util.function.Supplier r6, java.util.function.Function r7, com.alibaba.fastjson2.reader.FieldReader[] r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long r1) {
            r0 = this;
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            r1.<init>()
            java.lang.Class r2 = r0.objectClass
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.newProxyInstance(r2, r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(java.util.Map r9, long r10) {
            r8 = this;
            boolean r0 = r9 instanceof com.alibaba.fastjson2.JSONObject
            if (r0 == 0) goto L8
            r0 = r9
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            goto Ld
        L8:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>(r9)
        Ld:
            com.alibaba.fastjson2.reader.FieldReader[] r1 = r8.fieldReaders
            int r2 = r1.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L40
            r4 = r1[r3]
            java.lang.String r5 = r4.fieldName
            java.lang.Object r5 = r0.get(r5)
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L3d
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.reader.ObjectReader r6 = r4.getObjectReader(r6)
            boolean r7 = r6 instanceof com.alibaba.fastjson2.reader.ObjectReaderAdapter
            if (r7 == 0) goto L3d
            if (r0 != r9) goto L32
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>(r9)
        L32:
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r5 = r6.createInstance(r5, r10)
            java.lang.String r4 = r4.fieldName
            r0.put(r4, r5)
        L3d:
            int r3 = r3 + 1
            goto L11
        L40:
            java.lang.Class r9 = r8.objectClass
            java.lang.Object r9 = com.alibaba.fastjson2.util.TypeUtils.newProxyInstance(r9, r0)
            return r9
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r10, java.lang.reflect.Type r11, java.lang.Object r12, long r13) {
            r9 = this;
            boolean r0 = r10.nextIfNull()
            r6 = 0
            if (r0 == 0) goto L8
            return r6
        L8:
            java.lang.Class r1 = r9.objectClass
            long r2 = r9.getTypeNameHash()
            long r4 = r9.features
            long r4 = r4 | r13
            r0 = r10
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            if (r1 == 0) goto L2a
            java.lang.Class r0 = r1.getObjectClass()
            java.lang.Class r2 = r9.objectClass
            if (r0 == r2) goto L2a
            r2 = r11
            r3 = r12
            r4 = r13
            r0 = r1
            r1 = r10
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L2a:
            boolean r0 = r10.isArray()
            if (r0 == 0) goto L5a
            boolean r0 = r10.isSupportBeanArray()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r9.readArrayMappingJSONBObject(r10, r11, r12, r13)
            return r0
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "expect object, but "
            r0.<init>(r2)
            byte r2 = r10.getType()
            java.lang.String r2 = com.alibaba.fastjson2.JSONB.typeName(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        L5a:
            r10.nextIfObjectStart()
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r2 = 0
        L63:
            boolean r3 = r10.nextIfObjectEnd()
            if (r3 == 0) goto L70
            java.lang.Class r1 = r9.objectClass
            java.lang.Object r0 = com.alibaba.fastjson2.util.TypeUtils.newProxyInstance(r1, r0)
            return r0
        L70:
            long r3 = r10.readFieldNameHashCode()
            long r7 = r9.typeKeyHashCode
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto Lbc
            if (r2 != 0) goto Lbc
            long r3 = r10.readValueHashCode()
            com.alibaba.fastjson2.JSONReader$Context r5 = r10.context
            com.alibaba.fastjson2.reader.ObjectReader r3 = r9.autoType(r5, r3)
            if (r3 != 0) goto Lab
            java.lang.String r3 = r10.getString()
            com.alibaba.fastjson2.reader.ObjectReader r4 = r5.getObjectReaderAutoType(r3, r6)
            if (r4 == 0) goto L94
            r3 = r4
            goto Lab
        L94:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "auotype not support : "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lab:
            if (r3 != r9) goto Lae
            goto Lf1
        Lae:
            r0 = 1
            r10.setTypeRedirect(r0)
            r1 = r10
            r2 = r11
            r4 = r13
            r0 = r3
            r3 = r12
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        Lbc:
            r7 = 0
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto Lc3
            goto Lf1
        Lc3:
            com.alibaba.fastjson2.reader.FieldReader r3 = r9.getFieldReader(r3)
            if (r3 != 0) goto Lda
            long r4 = r9.features
            long r4 = r4 | r13
            boolean r4 = r10.isSupportSmartMatch(r4)
            if (r4 == 0) goto Lda
            long r3 = r10.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r3 = r9.getFieldReaderLCase(r3)
        Lda:
            if (r3 != 0) goto Le8
            java.lang.String r3 = r10.getFieldName()
            java.lang.Object r4 = r10.readAny()
            r0.put(r3, r4)
            goto Lf1
        Le8:
            java.lang.Object r4 = r3.readFieldValue(r10)
            java.lang.String r3 = r3.fieldName
            r0.put(r3, r4)
        Lf1:
            int r2 = r2 + 1
            goto L63
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
            r17 = this;
            r0 = r17
            r2 = r18
            boolean r1 = r2.jsonb
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r17.readJSONBObject(r18, r19, r20, r21)
            return r1
        Ld:
            boolean r1 = r2.nextIfNull()
            r3 = 0
            if (r1 == 0) goto L18
            r2.nextIfComma()
            return r3
        L18:
            boolean r1 = r2.isArray()
            if (r1 == 0) goto L2f
            long r4 = r0.getFeatures()
            long r4 = r4 | r21
            boolean r1 = r2.isSupportBeanArray(r4)
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r17.readArrayMappingObject(r18, r19, r20, r21)
            return r1
        L2f:
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            r1.<init>()
            boolean r4 = r2.nextIfObjectStart()
            if (r4 != 0) goto L61
            char r4 = r2.current()
            r5 = 116(0x74, float:1.63E-43)
            if (r4 == r5) goto L5d
            r5 = 102(0x66, float:1.43E-43)
            if (r4 != r5) goto L47
            goto L5d
        L47:
            r5 = 34
            if (r4 == r5) goto L61
            r5 = 39
            if (r4 == r5) goto L61
            r5 = 125(0x7d, float:1.75E-43)
            if (r4 != r5) goto L54
            goto L61
        L54:
            java.lang.String r1 = r2.info()
            ah.a.w(r1)
        L5b:
            r1 = 0
            return r1
        L5d:
            r2.readBoolValue()
            return r3
        L61:
            r4 = 0
        L62:
            boolean r5 = r2.nextIfObjectEnd()
            if (r5 == 0) goto L7c
            r2.nextIfComma()
            java.lang.Class r2 = r0.objectClass
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.newProxyInstance(r2, r1)
            java.util.function.Function r2 = r0.getBuildFunction()
            if (r2 == 0) goto L7b
            java.lang.Object r1 = r2.apply(r1)
        L7b:
            return r1
        L7c:
            com.alibaba.fastjson2.JSONReader$Context r5 = r2.context
            long r6 = r2.readFieldNameHashCode()
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r8 = r5.getContextAutoTypeBeforeHandler()
            if (r4 != 0) goto L11c
            long r9 = r0.getTypeKeyHash()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 != 0) goto L11c
            long r9 = r0.getFeatures()
            long r9 = r21 | r9
            long r11 = r5.features
            long r12 = r9 | r11
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r9 = r9.mask
            long r9 = r9 & r12
            r14 = 0
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r9 != 0) goto La7
            if (r8 == 0) goto L11c
        La7:
            long r9 = r2.readTypeHashCode()
            if (r8 == 0) goto Lc6
            java.lang.Class r11 = r0.objectClass
            java.lang.Class r11 = r8.apply(r9, r11, r12)
            if (r11 != 0) goto Lc6
            java.lang.String r11 = r2.getString()
            java.lang.Class r14 = r0.objectClass
            java.lang.Class r8 = r8.apply(r11, r14, r12)
            if (r8 == 0) goto Lc6
            com.alibaba.fastjson2.reader.ObjectReader r8 = r5.getObjectReader(r8)
            goto Lc7
        Lc6:
            r8 = r3
        Lc7:
            if (r8 != 0) goto Lcd
            com.alibaba.fastjson2.reader.ObjectReader r8 = r0.autoType(r5, r9)
        Lcd:
            if (r8 != 0) goto Lf8
            java.lang.String r8 = r2.getString()
            java.lang.Class r9 = r0.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r5 = r5.getObjectReaderAutoType(r8, r9, r12)
            if (r5 == 0) goto Le1
            r16 = r8
            r8 = r5
            r5 = r16
            goto Lf9
        Le1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No suitable ObjectReader found for"
            r1.<init>(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r2.info(r1)
            ah.a.w(r1)
            goto L5b
        Lf8:
            r5 = r3
        Lf9:
            if (r8 != r0) goto Lfc
            goto L14d
        Lfc:
            com.alibaba.fastjson2.reader.FieldReader r7 = r8.getFieldReader(r6)
            if (r7 == 0) goto L108
            if (r5 != 0) goto L108
            java.lang.String r5 = r2.getString()
        L108:
            r9 = r5
            long r3 = r0.getFeatures()
            long r5 = r21 | r3
            r3 = 0
            r4 = 0
            r1 = r8
            java.lang.Object r1 = r1.readObject(r2, r3, r4, r5)
            if (r7 == 0) goto L11b
            r7.accept(r1, r9)
        L11b:
            return r1
        L11c:
            com.alibaba.fastjson2.reader.FieldReader r5 = r0.getFieldReader(r6)
            if (r5 != 0) goto L136
            long r6 = r0.getFeatures()
            long r6 = r21 | r6
            boolean r6 = r2.isSupportSmartMatch(r6)
            if (r6 == 0) goto L136
            long r5 = r2.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r5 = r0.getFieldReaderLCase(r5)
        L136:
            if (r5 != 0) goto L144
            java.lang.String r5 = r2.getFieldName()
            java.lang.Object r6 = r2.readAny()
            r1.put(r5, r6)
            goto L14d
        L144:
            java.lang.Object r6 = r5.readFieldValue(r2)
            java.lang.String r5 = r5.fieldName
            r1.put(r5, r6)
        L14d:
            int r4 = r4 + 1
            goto L62
    }
}
