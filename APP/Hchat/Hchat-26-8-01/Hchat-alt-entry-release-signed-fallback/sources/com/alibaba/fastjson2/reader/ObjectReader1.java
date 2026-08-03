package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader1<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    final long hashCode0;
    final long hashCode0LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;

    public ObjectReader1(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
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
            r13 = 0
            r14 = r20[r13]
            r12.fieldReader0 = r14
            long r1 = r14.fieldNameHash
            r12.hashCode0 = r1
            long r1 = r14.fieldNameHashLCase
            r12.hashCode0LCase = r1
            java.lang.Object r14 = r14.defaultValue
            if (r14 == 0) goto L24
            r13 = 1
        L24:
            r12.hasDefaultValue = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReader(long r3) {
            r2 = this;
            long r0 = r2.hashCode0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReaderLCase(long r3) {
            r2 = this;
            long r0 = r2.hashCode0LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader0
            r0.acceptDefaultValue(r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
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
            java.util.function.Supplier<T> r10 = r9.creator
            java.lang.Object r10 = r10.get()
            int r11 = r4.startArray()
            if (r11 <= 0) goto L42
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader0
            r12.readFieldValue(r4, r10)
            r12 = 1
        L3a:
            if (r12 >= r11) goto L42
            r4.skipValue()
            int r12 = r12 + 1
            goto L3a
        L42:
            java.util.function.Function r11 = r9.buildFunction
            if (r11 == 0) goto L4a
            java.lang.Object r10 = r11.apply(r10)
        L4a:
            return r10
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r11, java.lang.reflect.Type r12, java.lang.Object r13, long r14) {
            r10 = this;
            boolean r0 = r10.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r10.objectClass
            r11.errorOnNoneSerializable(r0)
        L9:
            java.lang.Class r0 = r10.objectClass
            long r1 = r10.features
            long r1 = r1 | r14
            com.alibaba.fastjson2.reader.ObjectReader r3 = r10.checkAutoType(r11, r0, r1)
            if (r3 == 0) goto L27
            if (r3 == r10) goto L27
            java.lang.Class r0 = r3.getObjectClass()
            java.lang.Class r1 = r10.objectClass
            if (r0 == r1) goto L27
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            java.lang.Object r11 = r3.readJSONBObject(r4, r5, r6, r7)
            return r11
        L27:
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            boolean r11 = r1.isArray()
            if (r11 == 0) goto L54
            java.util.function.Supplier<T> r11 = r10.creator
            java.lang.Object r11 = r11.get()
            int r12 = r1.startArray()
            if (r12 <= 0) goto L4b
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r1, r11)
            r13 = 1
        L43:
            if (r13 >= r12) goto L4b
            r1.skipValue()
            int r13 = r13 + 1
            goto L43
        L4b:
            java.util.function.Function r12 = r10.buildFunction
            if (r12 == 0) goto L53
            java.lang.Object r11 = r12.apply(r11)
        L53:
            return r11
        L54:
            r11 = -90
            boolean r11 = r1.nextIfMatch(r11)
            r12 = 0
            if (r11 != 0) goto L86
            boolean r11 = r1.isTypeRedirect()
            if (r11 == 0) goto L67
            r1.setTypeRedirect(r12)
            goto L86
        L67:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "expect object, but "
            r11.<init>(r12)
            byte r12 = r1.getType()
            java.lang.String r12 = com.alibaba.fastjson2.JSONB.typeName(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r1.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L86:
            java.util.function.Supplier<T> r11 = r10.creator
            r13 = 0
            r14 = 0
            if (r11 == 0) goto L92
            java.lang.Object r11 = r11.get()
            goto Lb7
        L92:
            com.alibaba.fastjson2.JSONReader$Context r11 = r1.context
            long r6 = r11.features
            long r6 = r6 | r4
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r8 = r11.mask
            long r6 = r6 & r8
            int r11 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r11 == 0) goto Lb6
            sun.misc.Unsafe r11 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.InstantiationException -> La9
            java.lang.Class r0 = r10.objectClass     // Catch: java.lang.InstantiationException -> La9
            java.lang.Object r11 = r11.allocateInstance(r0)     // Catch: java.lang.InstantiationException -> La9
            goto Lb7
        La9:
            r0 = move-exception
            r11 = r0
            java.lang.String r12 = "create instance error"
            java.lang.String r12 = r1.info(r12)
            ah.a.x(r12, r11)
            r11 = 0
            return r11
        Lb6:
            r11 = r13
        Lb7:
            if (r11 == 0) goto Lc0
            boolean r0 = r10.hasDefaultValue
            if (r0 == 0) goto Lc0
            r10.initDefaultValue(r11)
        Lc0:
            r0 = -91
            boolean r0 = r1.nextIfMatch(r0)
            if (r0 == 0) goto Ld1
            java.util.function.Function r12 = r10.buildFunction
            if (r12 == 0) goto Ld0
            java.lang.Object r11 = r12.apply(r11)
        Ld0:
            return r11
        Ld1:
            long r6 = r1.readFieldNameHashCode()
            long r8 = r10.getTypeKeyHash()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L116
            if (r12 != 0) goto L116
            long r6 = r1.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r6 = r10.autoType(r0, r6)
            if (r6 != 0) goto L10d
            java.lang.String r6 = r1.getString()
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReaderAutoType(r6, r13)
            if (r0 == 0) goto Lf6
            goto L10e
        Lf6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "auotype not support : "
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r1.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L10d:
            r0 = r6
        L10e:
            if (r0 != r10) goto L111
            goto L143
        L111:
            java.lang.Object r11 = r0.readJSONBObject(r1, r2, r3, r4)
            return r11
        L116:
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 != 0) goto L11b
            goto L143
        L11b:
            long r8 = r10.hashCode0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L127
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader0
            r0.readFieldValueJSONB(r1, r11)
            goto L143
        L127:
            long r6 = r10.features
            long r6 = r6 | r4
            boolean r0 = r1.isSupportSmartMatch(r6)
            if (r0 == 0) goto L140
            long r6 = r1.getNameHashCodeLCase()
            long r8 = r10.hashCode0LCase
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L140
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader0
            r0.readFieldValue(r1, r11)
            goto L143
        L140:
            r10.processExtra(r1, r11, r4)
        L143:
            int r12 = r12 + 1
            goto Lc0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r7) {
            r6 = this;
            r3 = 0
            long r4 = r6.features
            r2 = 0
            r0 = r6
            r1 = r7
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r11, java.lang.reflect.Type r12, java.lang.Object r13, long r14) {
            r10 = this;
            boolean r0 = r10.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r10.objectClass
            r11.errorOnNoneSerializable(r0)
        L9:
            boolean r0 = r11.jsonb
            if (r0 == 0) goto L19
            r5 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Object r11 = r1.readJSONBObject(r2, r3, r4, r5)
            r0 = r1
            return r11
        L19:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            boolean r11 = r1.nextIfNullOrEmptyString()
            r12 = 0
            if (r11 == 0) goto L25
            return r12
        L25:
            long r4 = r0.features
            long r4 = r4 | r14
            long r4 = r1.features(r4)
            boolean r11 = r1.isArray()
            r6 = 0
            if (r11 == 0) goto L7e
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r11 = r11.mask
            long r11 = r11 & r4
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 == 0) goto L78
            r1.next()
            java.util.function.Supplier<T> r11 = r0.creator
            java.lang.Object r11 = r11.get()
            com.alibaba.fastjson2.reader.FieldReader r12 = r0.fieldReader0
            r12.readFieldValue(r1, r11)
            boolean r12 = r1.nextIfArrayEnd()
            if (r12 == 0) goto L5d
            r1.nextIfComma()
            java.util.function.Function r12 = r0.buildFunction
            if (r12 == 0) goto L5c
            java.lang.Object r11 = r12.apply(r11)
        L5c:
            return r11
        L5d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "array to bean end error, "
            r11.<init>(r12)
            char r12 = r1.current()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r1.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L78:
            java.lang.Object r11 = r0.processObjectInputSingleItemArray(r1, r2, r3, r4)
            r13 = r0
            return r11
        L7e:
            r13 = r0
            r1.nextIfObjectStart()
            java.util.function.Supplier<T> r11 = r13.creator
            if (r11 == 0) goto L8a
            java.lang.Object r12 = r11.get()
        L8a:
            boolean r11 = r13.hasDefaultValue
            if (r11 == 0) goto L91
            r10.initDefaultValue(r12)
        L91:
            if (r12 == 0) goto L9f
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r8 = r11.mask
            long r4 = r4 & r8
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 == 0) goto L9f
            r10.initStringFieldAsEmpty(r12)
        L9f:
            r11 = 0
        La0:
            boolean r0 = r1.nextIfObjectEnd()
            if (r0 == 0) goto La7
            goto Ld7
        La7:
            long r4 = r1.readFieldNameHashCode()
            if (r11 != 0) goto Le4
            r6 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Le4
            long r4 = r1.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReaderAutoType(r4)
            if (r4 != 0) goto Lcf
            java.lang.String r4 = r1.getString()
            java.lang.Class r5 = r13.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReaderAutoType(r4, r5)
            if (r4 != 0) goto Lcf
            goto L10c
        Lcf:
            r0 = r4
            if (r0 == r13) goto L10c
            r4 = r14
            java.lang.Object r12 = r0.readObject(r1, r2, r3, r4)
        Ld7:
            r1.nextIfComma()
            java.util.function.Function r11 = r13.buildFunction
            if (r11 == 0) goto Le3
            java.lang.Object r11 = r11.apply(r12)
            return r11
        Le3:
            return r12
        Le4:
            long r6 = r13.hashCode0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Lf0
            com.alibaba.fastjson2.reader.FieldReader r0 = r13.fieldReader0
            r0.readFieldValue(r1, r12)
            goto L10c
        Lf0:
            long r4 = r13.features
            long r4 = r4 | r14
            boolean r0 = r1.isSupportSmartMatch(r4)
            if (r0 == 0) goto L109
            long r4 = r1.getNameHashCodeLCase()
            long r6 = r13.hashCode0LCase
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L109
            com.alibaba.fastjson2.reader.FieldReader r0 = r13.fieldReader0
            r0.readFieldValue(r1, r12)
            goto L10c
        L109:
            r10.processExtra(r1, r12, r14)
        L10c:
            int r11 = r11 + 1
            goto La0
    }
}
