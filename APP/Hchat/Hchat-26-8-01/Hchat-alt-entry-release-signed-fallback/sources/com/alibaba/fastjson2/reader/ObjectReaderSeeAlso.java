package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderSeeAlso<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    public ObjectReaderSeeAlso(java.lang.Class r14, java.util.function.Supplier<T> r15, java.lang.String r16, java.lang.Class[] r17, java.lang.String[] r18, java.lang.Class r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
            r13 = this;
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r5 = r0.mask
            r8 = 0
            r4 = 0
            r1 = r13
            r2 = r14
            r7 = r15
            r3 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
    }

    public com.alibaba.fastjson2.reader.ObjectReaderSeeAlso addSubType(java.lang.Class r10, java.lang.String r11) {
            r9 = this;
            java.lang.Class[] r0 = r9.seeAlso
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            if (r3 != r10) goto Lb
            return r9
        Lb:
            int r2 = r2 + 1
            goto L4
        Le:
            java.lang.Class[] r0 = r9.seeAlso
            int r1 = r0.length
            int r1 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r5 = r0
            java.lang.Class[] r5 = (java.lang.Class[]) r5
            java.lang.String[] r0 = r9.seeAlsoNames
            int r1 = r0.length
            int r1 = r1 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r6 = r0
            java.lang.String[] r6 = (java.lang.String[]) r6
            int r0 = r5.length
            int r0 = r0 + (-1)
            r5[r0] = r10
            if (r11 != 0) goto L3b
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONType> r0 = com.alibaba.fastjson2.annotation.JSONType.class
            java.lang.annotation.Annotation r10 = r10.getAnnotation(r0)
            com.alibaba.fastjson2.annotation.JSONType r10 = (com.alibaba.fastjson2.annotation.JSONType) r10
            if (r10 == 0) goto L3b
            java.lang.String r11 = r10.typeName()
        L3b:
            if (r11 == 0) goto L42
            int r10 = r6.length
            int r10 = r10 + (-1)
            r6[r10] = r11
        L42:
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r1 = new com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            java.lang.Class r2 = r9.objectClass
            java.util.function.Supplier<T> r3 = r9.creator
            java.lang.String r4 = r9.typeKey
            java.lang.Class r7 = r9.seeAlsoDefault
            com.alibaba.fastjson2.reader.FieldReader[] r8 = r9.fieldReaders
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long r1) {
            r0 = this;
            java.util.function.Supplier<T> r1 = r0.creator
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Object r1 = r1.get()
            return r1
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
            long r2 = r9.typeNameHash
            long r4 = r9.features
            long r4 = r4 | r13
            r0 = r10
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            if (r1 == 0) goto L28
            java.lang.Class r0 = r1.getObjectClass()
            java.lang.Class r2 = r9.objectClass
            if (r0 == r2) goto L28
            r2 = r11
            r3 = r12
            r4 = r13
            r0 = r1
            r1 = r10
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L28:
            boolean r0 = r9.serializable
            if (r0 != 0) goto L31
            java.lang.Class r0 = r9.objectClass
            r10.errorOnNoneSerializable(r0)
        L31:
            boolean r0 = r10.isArray()
            if (r0 == 0) goto L61
            boolean r0 = r10.isSupportBeanArray()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r9.readArrayMappingJSONBObject(r10, r11, r12, r13)
            return r0
        L42:
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
        L61:
            com.alibaba.fastjson2.JSONReader$SavePoint r0 = r10.mark()
            r10.nextIfObjectStart()
            r2 = 0
            r3 = r6
        L6a:
            boolean r4 = r10.nextIfObjectEnd()
            if (r4 == 0) goto L81
            if (r3 != 0) goto L80
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.getContext()
            long r0 = r0.getFeatures()
            long r0 = r0 | r13
            java.lang.Object r0 = r9.createInstance(r0)
            return r0
        L80:
            return r3
        L81:
            long r4 = r10.readFieldNameHashCode()
            long r7 = r9.typeKeyHashCode
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto Ld2
            long r4 = r10.readValueHashCode()
            com.alibaba.fastjson2.JSONReader$Context r7 = r10.getContext()
            com.alibaba.fastjson2.reader.ObjectReader r4 = r9.autoType(r7, r4)
            if (r4 != 0) goto Lbc
            java.lang.String r4 = r10.getString()
            com.alibaba.fastjson2.reader.ObjectReader r5 = r7.getObjectReaderAutoType(r4, r6)
            if (r5 == 0) goto La5
            r4 = r5
            goto Lbc
        La5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "autoType not support : "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r10.info(r0)
            ah.a.w(r0)
            r0 = 0
            return r0
        Lbc:
            if (r4 != r9) goto Lbf
            goto L108
        Lbf:
            if (r2 == 0) goto Lc4
            r10.reset(r0)
        Lc4:
            r0 = 1
            r10.setTypeRedirect(r0)
            r1 = r10
            r2 = r11
            r3 = r12
            r0 = r4
            r4 = r13
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        Ld2:
            r7 = 0
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto Ld9
            goto L108
        Ld9:
            com.alibaba.fastjson2.reader.FieldReader r4 = r9.getFieldReader(r4)
            if (r4 != 0) goto Lf0
            long r7 = r9.features
            long r7 = r7 | r13
            boolean r5 = r10.isSupportSmartMatch(r7)
            if (r5 == 0) goto Lf0
            long r4 = r10.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r4 = r9.getFieldReaderLCase(r4)
        Lf0:
            if (r4 != 0) goto Lf6
            r9.processExtra(r10, r3)
            goto L108
        Lf6:
            if (r3 != 0) goto L105
            com.alibaba.fastjson2.JSONReader$Context r3 = r10.getContext()
            long r7 = r3.getFeatures()
            long r7 = r7 | r13
            java.lang.Object r3 = r9.createInstance(r7)
        L105:
            r4.readFieldValue(r10, r3)
        L108:
            int r2 = r2 + 1
            goto L6a
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r25, java.lang.reflect.Type r26, java.lang.Object r27, long r28) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r28
            boolean r4 = r1.jsonb
            if (r4 == 0) goto Lf
            java.lang.Object r1 = r24.readJSONBObject(r25, r26, r27, r28)
            return r1
        Lf:
            boolean r4 = r0.serializable
            if (r4 != 0) goto L18
            java.lang.Class r4 = r0.objectClass
            r1.errorOnNoneSerializable(r4)
        L18:
            boolean r4 = r1.nextIfNull()
            r5 = 0
            if (r4 == 0) goto L23
            r1.nextIfComma()
            return r5
        L23:
            boolean r4 = r1.isString()
            r6 = 0
            if (r4 == 0) goto L6e
            long r2 = r1.readValueHashCode()
            java.lang.Class[] r4 = r0.seeAlso
            int r7 = r4.length
        L31:
            if (r6 >= r7) goto L53
            r8 = r4[r6]
            java.lang.Class<java.lang.Enum> r9 = java.lang.Enum.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 == 0) goto L50
            com.alibaba.fastjson2.reader.ObjectReader r8 = r1.getObjectReader(r8)
            boolean r9 = r8 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r9 == 0) goto L4c
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r8 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r8
            java.lang.Enum r8 = r8.getEnumByHashCode(r2)
            goto L4d
        L4c:
            r8 = r5
        L4d:
            if (r8 == 0) goto L50
            return r8
        L50:
            int r6 = r6 + 1
            goto L31
        L53:
            java.lang.String r2 = r1.getString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "not support input "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
            r1 = 0
            return r1
        L6e:
            com.alibaba.fastjson2.JSONReader$SavePoint r4 = r1.mark()
            long r7 = r0.getFeatures()
            long r7 = r7 | r2
            long r7 = r1.features(r7)
            boolean r9 = r1.isArray()
            r10 = 0
            if (r9 == 0) goto L9c
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r4 = r4.mask
            long r4 = r4 & r7
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L91
            java.lang.Object r1 = r24.readArrayMappingObject(r25, r26, r27, r28)
            return r1
        L91:
            r2 = r26
            r3 = r27
            r4 = r7
            java.lang.Object r1 = r0.processObjectInputSingleItemArray(r1, r2, r3, r4)
            r7 = r0
            return r1
        L9c:
            r7 = r0
            boolean r0 = r1.nextIfObjectStart()
            if (r0 != 0) goto Lca
            char r0 = r1.current()
            r8 = 116(0x74, float:1.63E-43)
            if (r0 == r8) goto Lc6
            r8 = 102(0x66, float:1.43E-43)
            if (r0 != r8) goto Lb0
            goto Lc6
        Lb0:
            r8 = 34
            if (r0 == r8) goto Lca
            r8 = 39
            if (r0 == r8) goto Lca
            r8 = 125(0x7d, float:1.75E-43)
            if (r0 != r8) goto Lbd
            goto Lca
        Lbd:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
        Lc4:
            r0 = 0
            return r0
        Lc6:
            r1.readBoolValue()
            return r5
        Lca:
            r0 = r5
            r8 = r0
        Lcc:
            boolean r9 = r1.nextIfObjectEnd()
            if (r9 == 0) goto L117
            if (r0 != 0) goto Ldd
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r4 = r0.features
            long r2 = r2 | r4
            java.lang.Object r0 = r7.createInstance(r2)
        Ldd:
            if (r8 == 0) goto L109
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Le7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L109
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            com.alibaba.fastjson2.reader.FieldReader r4 = r7.getFieldReader(r4)
            java.lang.Object r3 = r3.getValue()
            r4.accept(r0, r3)
            goto Le7
        L109:
            r1.nextIfComma()
            java.util.function.Function r1 = r7.getBuildFunction()
            if (r1 == 0) goto L116
            java.lang.Object r0 = r1.apply(r0)
        L116:
            return r0
        L117:
            com.alibaba.fastjson2.JSONReader$Context r9 = r1.context
            long r12 = r1.readFieldNameHashCode()
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r14 = r9.getContextAutoTypeBeforeHandler()
            long r15 = r7.getTypeKeyHash()
            int r15 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r15 == 0) goto L135
            java.lang.Class r15 = r7.seeAlsoDefault
            if (r15 == 0) goto L132
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            if (r15 == r5) goto L132
            goto L135
        L132:
            r20 = r10
            goto L14d
        L135:
            long r15 = r7.getFeatures()
            long r15 = r15 | r2
            r20 = r10
            long r10 = r9.features
            long r18 = r15 | r10
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r10 = r5.mask
            long r10 = r18 & r10
            int r5 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r5 != 0) goto L192
            if (r14 == 0) goto L14d
            goto L192
        L14d:
            com.alibaba.fastjson2.reader.FieldReader r5 = r7.getFieldReader(r12)
            if (r5 != 0) goto L166
            long r9 = r7.getFeatures()
            long r9 = r9 | r2
            boolean r9 = r1.isSupportSmartMatch(r9)
            if (r9 == 0) goto L166
            long r9 = r1.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r5 = r7.getFieldReaderLCase(r9)
        L166:
            if (r0 != 0) goto L171
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r9 = r0.features
            long r9 = r9 | r2
            java.lang.Object r0 = r7.createInstance(r9)
        L171:
            if (r5 != 0) goto L177
            r7.processExtra(r1, r0, r2)
            goto L18b
        L177:
            if (r0 != 0) goto L18e
            java.lang.Object r5 = r5.readFieldValue(r1)
            if (r8 != 0) goto L184
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
        L184:
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
            r8.put(r9, r5)
        L18b:
            r15 = r6
            goto L22e
        L18e:
            r5.readFieldValue(r1, r0)
            goto L18b
        L192:
            long r10 = r1.readTypeHashCode()
            r15 = -1
            int r5 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r5 != 0) goto L1b4
            boolean r5 = r1.isNumber()
            if (r5 == 0) goto L1b4
            java.lang.Number r5 = r1.readNumber()
            java.lang.String r10 = r5.toString()
            long r15 = com.alibaba.fastjson2.util.Fnv.hashCode64(r10)
            r22 = r10
            r10 = r5
            r5 = r22
            goto L1b7
        L1b4:
            r15 = r10
            r5 = 0
            r10 = 0
        L1b7:
            if (r14 == 0) goto L1e2
            java.lang.Class r11 = r7.objectClass
            r17 = r11
            java.lang.Class r11 = r14.apply(r15, r17, r18)
            r2 = r18
            r22 = r15
            r16 = r5
            r15 = r6
            r5 = r22
            if (r11 != 0) goto L1df
            java.lang.String r11 = r1.getString()
            r17 = r0
            java.lang.Class r0 = r7.objectClass
            java.lang.Class r0 = r14.apply(r11, r0, r2)
            if (r0 == 0) goto L1ed
            com.alibaba.fastjson2.reader.ObjectReader r0 = r9.getObjectReader(r0)
            goto L1ee
        L1df:
            r17 = r0
            goto L1ed
        L1e2:
            r17 = r0
            r2 = r18
            r22 = r15
            r16 = r5
            r15 = r6
            r5 = r22
        L1ed:
            r0 = 0
        L1ee:
            if (r0 != 0) goto L1f4
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.autoType(r9, r5)
        L1f4:
            if (r0 != 0) goto L229
            java.lang.String r0 = r1.getString()
            java.lang.Class r5 = r7.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r2 = r9.getObjectReaderAutoType(r0, r5, r2)
            if (r2 != 0) goto L20a
            java.lang.Class r3 = r7.seeAlsoDefault
            if (r3 == 0) goto L20a
            com.alibaba.fastjson2.reader.ObjectReader r2 = r9.getObjectReader(r3)
        L20a:
            if (r2 == 0) goto L212
            r22 = r2
            r2 = r0
            r0 = r22
            goto L22a
        L212:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No suitable ObjectReader found for"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            goto Lc4
        L229:
            r2 = 0
        L22a:
            if (r0 != r7) goto L237
            r0 = r17
        L22e:
            int r6 = r15 + 1
            r2 = r28
            r10 = r20
            r5 = 0
            goto Lcc
        L237:
            com.alibaba.fastjson2.reader.FieldReader r6 = r0.getFieldReader(r12)
            if (r6 == 0) goto L24a
            if (r2 != 0) goto L24a
            if (r16 == 0) goto L244
            r8 = r16
            goto L24b
        L244:
            java.lang.String r5 = r1.getString()
            r8 = r5
            goto L24b
        L24a:
            r8 = r2
        L24b:
            if (r15 != 0) goto L24f
            if (r6 == 0) goto L252
        L24f:
            r1.reset(r4)
        L252:
            long r2 = r7.getFeatures()
            long r4 = r28 | r2
            r2 = r26
            r3 = r27
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            if (r6 == 0) goto L26b
            if (r10 == 0) goto L268
            r6.accept(r0, r10)
            return r0
        L268:
            r6.accept(r0, r8)
        L26b:
            return r0
    }
}
