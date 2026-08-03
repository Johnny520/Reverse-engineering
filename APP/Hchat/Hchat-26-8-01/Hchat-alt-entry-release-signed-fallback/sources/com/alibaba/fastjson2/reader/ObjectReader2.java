package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader2<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader1;
    protected final long hashCode0;
    protected final long hashCode0LCase;
    protected final long hashCode1;
    protected final long hashCode1LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader1;

    public ObjectReader2(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
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
            r15 = 1
            r1 = r20[r15]
            r12.fieldReader1 = r1
            long r2 = r14.fieldNameHash
            r12.hashCode0 = r2
            long r2 = r14.fieldNameHashLCase
            r12.hashCode0LCase = r2
            long r2 = r1.fieldNameHash
            r12.hashCode1 = r2
            long r2 = r1.fieldNameHashLCase
            r12.hashCode1LCase = r2
            java.lang.Object r14 = r14.defaultValue
            if (r14 != 0) goto L34
            java.lang.Object r14 = r1.defaultValue
            if (r14 == 0) goto L35
        L34:
            r13 = r15
        L35:
            r12.hasDefaultValue = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReader(long r3) {
            r2 = this;
            long r0 = r2.hashCode0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            long r0 = r2.hashCode1
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public com.alibaba.fastjson2.reader.FieldReader getFieldReaderLCase(long r3) {
            r2 = this;
            long r0 = r2.hashCode0LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader0
            return r3
        L9:
            long r0 = r2.hashCode1LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader0
            r0.acceptDefaultValue(r2)
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader1
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
            if (r11 <= 0) goto L4a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader0
            r12.readFieldValue(r4, r10)
            r12 = 1
            if (r11 <= r12) goto L4a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader1
            r12.readFieldValue(r4, r10)
            r12 = 2
        L42:
            if (r12 >= r11) goto L4a
            r4.skipValue()
            int r12 = r12 + 1
            goto L42
        L4a:
            java.util.function.Function r11 = r9.buildFunction
            if (r11 == 0) goto L52
            java.lang.Object r10 = r11.apply(r10)
        L52:
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
            java.lang.Class r2 = r10.objectClass
            long r3 = r10.getTypeNameHash()
            long r0 = r10.features
            long r5 = r0 | r14
            r1 = r11
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.checkAutoType(r2, r3, r5)
            if (r0 == 0) goto L2b
            java.lang.Class r1 = r0.getObjectClass()
            java.lang.Class r2 = r10.objectClass
            if (r1 == r2) goto L2b
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            java.lang.Object r11 = r0.readJSONBObject(r1, r2, r3, r4)
            return r11
        L2b:
            boolean r12 = r11.isArray()
            if (r12 == 0) goto L64
            java.util.function.Supplier<T> r12 = r10.creator
            java.lang.Object r12 = r12.get()
            boolean r13 = r10.hasDefaultValue
            if (r13 == 0) goto L3e
            r10.initDefaultValue(r12)
        L3e:
            int r13 = r11.startArray()
            if (r13 <= 0) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader0
            r0.readFieldValue(r11, r12)
            r0 = 1
            if (r13 <= r0) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader1
            r0.readFieldValue(r11, r12)
            r0 = 2
        L52:
            if (r0 >= r13) goto L5a
            r11.skipValue()
            int r0 = r0 + 1
            goto L52
        L5a:
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto L63
            java.lang.Object r11 = r11.apply(r12)
            return r11
        L63:
            return r12
        L64:
            r12 = -90
            boolean r12 = r11.nextIfMatch(r12)
            if (r12 == 0) goto L10c
            java.util.function.Supplier<T> r12 = r10.creator
            r2 = 0
            if (r12 == 0) goto L77
            java.lang.Object r12 = r12.get()
            goto L9c
        L77:
            com.alibaba.fastjson2.JSONReader$Context r12 = r11.context
            long r12 = r12.features
            long r12 = r12 | r14
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r6 = r0.mask
            long r12 = r12 & r6
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L9b
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.InstantiationException -> L8e
            java.lang.Class r13 = r10.objectClass     // Catch: java.lang.InstantiationException -> L8e
            java.lang.Object r12 = r12.allocateInstance(r13)     // Catch: java.lang.InstantiationException -> L8e
            goto L9c
        L8e:
            r0 = move-exception
            r12 = r0
            java.lang.String r13 = "create instance error"
            java.lang.String r11 = r11.info(r13)
            ah.a.x(r11, r12)
            r11 = 0
            return r11
        L9b:
            r12 = 0
        L9c:
            if (r12 == 0) goto La5
            boolean r13 = r10.hasDefaultValue
            if (r13 == 0) goto La5
            r10.initDefaultValue(r12)
        La5:
            if (r12 == 0) goto Lb0
            boolean r13 = r11.isInitStringFieldAsEmpty()
            if (r13 == 0) goto Lb0
            r10.initStringFieldAsEmpty(r12)
        Lb0:
            r13 = -91
            boolean r13 = r11.nextIfMatch(r13)
            if (r13 == 0) goto Lc2
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto Lc1
            java.lang.Object r11 = r11.apply(r12)
            return r11
        Lc1:
            return r12
        Lc2:
            long r6 = r11.readFieldNameHashCode()
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 != 0) goto Lcb
            goto Lb0
        Lcb:
            long r8 = r10.hashCode0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Ld7
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r11, r12)
            goto Lb0
        Ld7:
            long r8 = r10.hashCode1
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Le3
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValueJSONB(r11, r12)
            goto Lb0
        Le3:
            long r6 = r10.features
            long r6 = r6 | r14
            boolean r13 = r11.isSupportSmartMatch(r6)
            if (r13 == 0) goto L108
            long r6 = r11.getNameHashCodeLCase()
            long r8 = r10.hashCode0LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Lfc
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValueJSONB(r11, r12)
            goto Lb0
        Lfc:
            long r8 = r10.hashCode1LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L108
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValueJSONB(r11, r12)
            goto Lb0
        L108:
            r10.processExtra(r11, r12, r14)
            goto Lb0
        L10c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "expect object, but "
            r12.<init>(r13)
            byte r13 = r11.getType()
            java.lang.String r13 = com.alibaba.fastjson2.JSONB.typeName(r13)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r11 = r11.info(r12)
            ah.a.w(r11)
            r11 = 0
            return r11
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
            if (r0 == 0) goto L13
            java.lang.Object r11 = r10.readJSONBObject(r11, r12, r13, r14)
            r1 = r10
            return r11
        L13:
            r1 = r10
            boolean r0 = r11.nextIfNull()
            if (r0 == 0) goto L1f
            r11.nextIfComma()
            r11 = 0
            return r11
        L1f:
            long r2 = r1.features
            long r2 = r2 | r14
            long r5 = r11.features(r2)
            boolean r0 = r11.isArray()
            r2 = 0
            if (r0 == 0) goto L71
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r14 = r14.mask
            long r14 = r14 & r5
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L68
            r11.next()
            java.util.function.Supplier<T> r12 = r1.creator
            java.lang.Object r12 = r12.get()
            boolean r13 = r1.hasDefaultValue
            if (r13 == 0) goto L47
            r10.initDefaultValue(r12)
        L47:
            com.alibaba.fastjson2.reader.FieldReader r13 = r1.fieldReader0
            r13.readFieldValue(r11, r12)
            com.alibaba.fastjson2.reader.FieldReader r13 = r1.fieldReader1
            r13.readFieldValue(r11, r12)
            char r13 = r11.current()
            r14 = 93
            if (r13 != r14) goto L5d
            r11.next()
            return r12
        L5d:
            java.lang.String r12 = "array to bean end error"
            java.lang.String r11 = r11.info(r12)
            ah.a.w(r11)
            r11 = 0
            return r11
        L68:
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Object r11 = r1.processObjectInputSingleItemArray(r2, r3, r4, r5)
            r12 = r1
            return r11
        L71:
            r8 = r2
            r2 = r12
            r12 = r1
            r0 = r8
            r11.nextIfObjectStart()
            java.util.function.Supplier<T> r3 = r12.creator
            java.lang.Object r7 = r3.get()
            boolean r3 = r12.hasDefaultValue
            if (r3 == 0) goto L85
            r10.initDefaultValue(r7)
        L85:
            if (r7 == 0) goto L93
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r3 = r3.mask
            long r3 = r3 & r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L93
            r10.initStringFieldAsEmpty(r7)
        L93:
            r0 = 0
            r6 = r0
        L95:
            boolean r0 = r11.nextIfObjectEnd()
            if (r0 == 0) goto L9c
            goto Lcd
        L9c:
            long r0 = r11.readFieldNameHashCode()
            if (r6 != 0) goto Le7
            r3 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Le7
            long r0 = r11.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r3 = r11.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReaderAutoType(r0)
            if (r0 != 0) goto Lc4
            java.lang.String r0 = r11.getString()
            java.lang.Class r1 = r12.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReaderAutoType(r0, r1)
            if (r0 != 0) goto Lc4
            goto L127
        Lc4:
            if (r0 == r12) goto L127
            r1 = r11
            r3 = r13
            r4 = r14
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
        Lcd:
            r11.nextIfComma()
            java.util.function.Function r13 = r12.buildFunction
            if (r13 == 0) goto Le6
            java.lang.Object r11 = r13.apply(r7)     // Catch: java.lang.IllegalStateException -> Ld9
            return r11
        Ld9:
            r0 = move-exception
            r13 = r0
            java.lang.String r14 = "build object error"
            java.lang.String r11 = r11.info(r14)
            ah.a.x(r11, r13)
            r11 = 0
            return r11
        Le6:
            return r7
        Le7:
            long r3 = r12.hashCode0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lf3
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader0
            r0.readFieldValue(r11, r7)
            goto L127
        Lf3:
            long r3 = r12.hashCode1
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Lff
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader1
            r0.readFieldValue(r11, r7)
            goto L127
        Lff:
            long r0 = r12.features
            long r0 = r0 | r14
            boolean r0 = r11.isSupportSmartMatch(r0)
            if (r0 == 0) goto L124
            long r0 = r11.getNameHashCodeLCase()
            long r3 = r12.hashCode0LCase
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L118
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader0
            r0.readFieldValue(r11, r7)
            goto L127
        L118:
            long r3 = r12.hashCode1LCase
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L124
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader1
            r0.readFieldValue(r11, r7)
            goto L127
        L124:
            r10.processExtra(r11, r7, r14)
        L127:
            int r6 = r6 + 1
            goto L95
    }
}
