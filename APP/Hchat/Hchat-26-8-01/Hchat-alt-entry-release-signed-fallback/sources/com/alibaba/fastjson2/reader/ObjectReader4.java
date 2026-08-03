package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader4<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader1;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader2;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader3;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader1;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader2;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader3;

    public ObjectReader4(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
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
            r2 = 2
            r2 = r20[r2]
            r12.fieldReader2 = r2
            r3 = 3
            r3 = r20[r3]
            r12.fieldReader3 = r3
            long r4 = r14.fieldNameHash
            r12.hashCode0 = r4
            long r4 = r1.fieldNameHash
            r12.hashCode1 = r4
            long r4 = r2.fieldNameHash
            r12.hashCode2 = r4
            long r4 = r3.fieldNameHash
            r12.hashCode3 = r4
            long r4 = r14.fieldNameHashLCase
            r12.hashCode0LCase = r4
            long r4 = r1.fieldNameHashLCase
            r12.hashCode1LCase = r4
            long r4 = r2.fieldNameHashLCase
            r12.hashCode2LCase = r4
            long r4 = r3.fieldNameHashLCase
            r12.hashCode3LCase = r4
            java.lang.Object r14 = r14.defaultValue
            if (r14 != 0) goto L56
            java.lang.Object r14 = r1.defaultValue
            if (r14 != 0) goto L56
            java.lang.Object r14 = r2.defaultValue
            if (r14 != 0) goto L56
            java.lang.Object r14 = r3.defaultValue
            if (r14 == 0) goto L57
        L56:
            r13 = r15
        L57:
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            long r0 = r2.hashCode2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader2
            return r3
        L1b:
            long r0 = r2.hashCode3
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader1
            return r3
        L12:
            long r0 = r2.hashCode2LCase
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader2
            return r3
        L1b:
            long r0 = r2.hashCode3LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
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
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader2
            r0.acceptDefaultValue(r2)
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader3
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
            int r10 = r4.startArray()
            java.util.function.Supplier<T> r11 = r9.creator
            java.lang.Object r11 = r11.get()
            if (r10 <= 0) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader0
            r12.readFieldValue(r4, r11)
            r12 = 1
            if (r10 <= r12) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader1
            r12.readFieldValue(r4, r11)
            r12 = 2
            if (r10 <= r12) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader2
            r12.readFieldValue(r4, r11)
            r12 = 3
            if (r10 <= r12) goto L5a
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader3
            r12.readFieldValue(r4, r11)
            r12 = 4
        L52:
            if (r12 >= r10) goto L5a
            r4.skipValue()
            int r12 = r12 + 1
            goto L52
        L5a:
            java.util.function.Function r10 = r9.buildFunction
            if (r10 == 0) goto L63
            java.lang.Object r10 = r10.apply(r11)
            return r10
        L63:
            return r11
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r11, java.lang.reflect.Type r12, java.lang.Object r13, long r14) {
            r10 = this;
            boolean r0 = r10.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r10.objectClass
            r11.errorOnNoneSerializable(r0)
        L9:
            boolean r0 = r11.isArray()
            if (r0 == 0) goto L4b
            java.util.function.Supplier<T> r12 = r10.creator
            java.lang.Object r12 = r12.get()
            int r13 = r11.startArray()
            if (r13 <= 0) goto L41
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader0
            r0.readFieldValue(r11, r12)
            r0 = 1
            if (r13 <= r0) goto L41
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader1
            r0.readFieldValue(r11, r12)
            r0 = 2
            if (r13 <= r0) goto L41
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader2
            r0.readFieldValue(r11, r12)
            r0 = 3
            if (r13 <= r0) goto L41
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader3
            r0.readFieldValue(r11, r12)
            r0 = 4
        L39:
            if (r0 >= r13) goto L41
            r11.skipValue()
            int r0 = r0 + 1
            goto L39
        L41:
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto L4a
            java.lang.Object r11 = r11.apply(r12)
            return r11
        L4a:
            return r12
        L4b:
            java.lang.Class r2 = r10.objectClass
            long r3 = r10.getTypeNameHash()
            long r0 = r10.features
            long r5 = r0 | r14
            r1 = r11
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.checkAutoType(r2, r3, r5)
            if (r0 == 0) goto L6d
            java.lang.Class r1 = r0.getObjectClass()
            java.lang.Class r2 = r10.objectClass
            if (r1 == r2) goto L6d
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            java.lang.Object r11 = r0.readJSONBObject(r1, r2, r3, r4)
            return r11
        L6d:
            r12 = -90
            boolean r12 = r11.nextIfMatch(r12)
            if (r12 == 0) goto L140
            java.util.function.Supplier<T> r12 = r10.creator
            r2 = 0
            if (r12 == 0) goto L80
            java.lang.Object r12 = r12.get()
            goto La5
        L80:
            com.alibaba.fastjson2.JSONReader$Context r12 = r11.context
            long r12 = r12.features
            long r12 = r12 | r14
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r6 = r0.mask
            long r12 = r12 & r6
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto La4
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.InstantiationException -> L97
            java.lang.Class r13 = r10.objectClass     // Catch: java.lang.InstantiationException -> L97
            java.lang.Object r12 = r12.allocateInstance(r13)     // Catch: java.lang.InstantiationException -> L97
            goto La5
        L97:
            r0 = move-exception
            r12 = r0
            java.lang.String r13 = "create instance error"
            java.lang.String r11 = r11.info(r13)
            ah.a.x(r11, r12)
            r11 = 0
            return r11
        La4:
            r12 = 0
        La5:
            if (r12 == 0) goto Lae
            boolean r13 = r10.hasDefaultValue
            if (r13 == 0) goto Lae
            r10.initDefaultValue(r12)
        Lae:
            r13 = -91
            boolean r13 = r11.nextIfMatch(r13)
            if (r13 == 0) goto Lc0
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto Lbf
            java.lang.Object r11 = r11.apply(r12)
            return r11
        Lbf:
            return r12
        Lc0:
            long r6 = r11.readFieldNameHashCode()
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 != 0) goto Lc9
            goto Lae
        Lc9:
            long r8 = r10.hashCode0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Ld5
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r11, r12)
            goto Lae
        Ld5:
            long r8 = r10.hashCode1
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Le1
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValue(r11, r12)
            goto Lae
        Le1:
            long r8 = r10.hashCode2
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Led
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader2
            r13.readFieldValue(r11, r12)
            goto Lae
        Led:
            long r8 = r10.hashCode3
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Lf9
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader3
            r13.readFieldValue(r11, r12)
            goto Lae
        Lf9:
            long r6 = r10.features
            long r6 = r6 | r14
            boolean r13 = r11.isSupportSmartMatch(r6)
            if (r13 != 0) goto L106
            r10.processExtra(r11, r12, r14)
            goto Lae
        L106:
            long r6 = r11.getNameHashCodeLCase()
            long r8 = r10.hashCode0LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L116
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r11, r12)
            goto Lae
        L116:
            long r8 = r10.hashCode1LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L122
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValue(r11, r12)
            goto Lae
        L122:
            long r8 = r10.hashCode2LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L12e
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader2
            r13.readFieldValue(r11, r12)
            goto Lae
        L12e:
            long r8 = r10.hashCode3LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L13b
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader3
            r13.readFieldValue(r11, r12)
            goto Lae
        L13b:
            r10.processExtra(r11, r12, r14)
            goto Lae
        L140:
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

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r12, java.lang.reflect.Type r13, java.lang.Object r14, long r15) {
            r11 = this;
            boolean r0 = r11.serializable
            if (r0 != 0) goto L9
            java.lang.Class r0 = r11.objectClass
            r12.errorOnNoneSerializable(r0)
        L9:
            boolean r0 = r12.jsonb
            if (r0 == 0) goto L12
            java.lang.Object r12 = r11.readJSONBObject(r12, r13, r14, r15)
            return r12
        L12:
            boolean r0 = r12.nextIfNull()
            if (r0 == 0) goto L1d
            r12.nextIfComma()
            r12 = 0
            return r12
        L1d:
            long r0 = r11.features
            long r0 = r0 | r15
            long r6 = r12.features(r0)
            boolean r0 = r12.isArray()
            r1 = 0
            if (r0 == 0) goto L43
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r3 = r0.mask
            long r3 = r3 & r6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L3a
            java.lang.Object r12 = r11.readArrayMappingObject(r12, r13, r14, r15)
            return r12
        L3a:
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.Object r12 = r2.processObjectInputSingleItemArray(r3, r4, r5, r6)
            return r12
        L43:
            r4 = r6
            r12.nextIfObjectStart()
            java.util.function.Supplier<T> r0 = r11.creator
            java.lang.Object r7 = r0.get()
            boolean r0 = r11.hasDefaultValue
            if (r0 == 0) goto L54
            r11.initDefaultValue(r7)
        L54:
            if (r7 == 0) goto L62
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r8 = r0.mask
            long r4 = r4 & r8
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L62
            r11.initStringFieldAsEmpty(r7)
        L62:
            r0 = 0
            r8 = r0
        L64:
            boolean r0 = r12.nextIfObjectEnd()
            if (r0 == 0) goto L6b
            goto L9f
        L6b:
            long r0 = r12.readFieldNameHashCode()
            if (r8 != 0) goto Lac
            r4 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Lac
            long r0 = r12.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r2 = r12.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReaderAutoType(r0)
            if (r0 != 0) goto L95
            java.lang.String r0 = r12.getString()
            java.lang.Class r1 = r11.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r0 = r2.getObjectReaderAutoType(r0, r1)
            if (r0 != 0) goto L95
        L92:
            r4 = r15
            goto L122
        L95:
            if (r0 == r11) goto L92
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
        L9f:
            r12.nextIfComma()
            java.util.function.Function r12 = r11.buildFunction
            if (r12 == 0) goto Lab
            java.lang.Object r12 = r12.apply(r7)
            return r12
        Lab:
            return r7
        Lac:
            r4 = r15
            long r9 = r11.hashCode0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto Lba
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader0
            r0.readFieldValue(r12, r7)
            goto L122
        Lba:
            long r9 = r11.hashCode1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto Lc6
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader1
            r0.readFieldValue(r12, r7)
            goto L122
        Lc6:
            long r9 = r11.hashCode2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto Ld2
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader2
            r0.readFieldValue(r12, r7)
            goto L122
        Ld2:
            long r9 = r11.hashCode3
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto Lde
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader3
            r0.readFieldValue(r12, r7)
            goto L122
        Lde:
            long r0 = r11.features
            long r0 = r0 | r4
            boolean r0 = r12.isSupportSmartMatch(r0)
            if (r0 != 0) goto Leb
            r11.processExtra(r12, r7, r4)
            goto L122
        Leb:
            long r0 = r12.getNameHashCodeLCase()
            long r9 = r11.hashCode0LCase
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto Lfb
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader0
            r0.readFieldValue(r12, r7)
            goto L122
        Lfb:
            long r9 = r11.hashCode1LCase
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L107
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader1
            r0.readFieldValue(r12, r7)
            goto L122
        L107:
            long r9 = r11.hashCode2LCase
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 != 0) goto L113
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader2
            r0.readFieldValue(r12, r7)
            goto L122
        L113:
            long r9 = r11.hashCode3LCase
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L11f
            com.alibaba.fastjson2.reader.FieldReader r0 = r11.fieldReader3
            r0.readFieldValue(r12, r7)
            goto L122
        L11f:
            r11.processExtra(r12, r7, r4)
        L122:
            int r8 = r8 + 1
            goto L64
    }
}
