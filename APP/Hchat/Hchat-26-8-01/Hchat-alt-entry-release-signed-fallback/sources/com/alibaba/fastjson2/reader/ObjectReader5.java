package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReader5<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader0;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader1;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader2;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader3;
    protected final com.alibaba.fastjson2.reader.FieldReader fieldReader4;
    final long hashCode0;
    final long hashCode0LCase;
    final long hashCode1;
    final long hashCode1LCase;
    final long hashCode2;
    final long hashCode2LCase;
    final long hashCode3;
    final long hashCode3LCase;
    final long hashCode4;
    final long hashCode4LCase;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader0;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader1;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader2;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader3;
    protected com.alibaba.fastjson2.reader.ObjectReader objectReader4;

    public ObjectReader5(java.lang.Class r13, java.lang.String r14, java.lang.String r15, long r16, java.util.function.Supplier<T> r18, java.util.function.Function r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
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
            r4 = 4
            r4 = r20[r4]
            r12.fieldReader4 = r4
            long r5 = r14.fieldNameHash
            r12.hashCode0 = r5
            long r5 = r1.fieldNameHash
            r12.hashCode1 = r5
            long r5 = r2.fieldNameHash
            r12.hashCode2 = r5
            long r5 = r3.fieldNameHash
            r12.hashCode3 = r5
            long r5 = r4.fieldNameHash
            r12.hashCode4 = r5
            long r5 = r14.fieldNameHashLCase
            r12.hashCode0LCase = r5
            long r5 = r1.fieldNameHashLCase
            r12.hashCode1LCase = r5
            long r5 = r2.fieldNameHashLCase
            r12.hashCode2LCase = r5
            long r5 = r3.fieldNameHashLCase
            r12.hashCode3LCase = r5
            long r5 = r4.fieldNameHashLCase
            r12.hashCode4LCase = r5
            java.lang.Object r14 = r14.defaultValue
            if (r14 != 0) goto L67
            java.lang.Object r14 = r1.defaultValue
            if (r14 != 0) goto L67
            java.lang.Object r14 = r2.defaultValue
            if (r14 != 0) goto L67
            java.lang.Object r14 = r3.defaultValue
            if (r14 != 0) goto L67
            java.lang.Object r14 = r4.defaultValue
            if (r14 == 0) goto L68
        L67:
            r13 = r15
        L68:
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
            long r0 = r2.hashCode4
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L2d
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader4
            return r3
        L2d:
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
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L24
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader3
            return r3
        L24:
            long r0 = r2.hashCode4LCase
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L2d
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.fieldReader4
            return r3
        L2d:
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
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.fieldReader4
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
            if (r11 <= 0) goto L62
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader0
            r12.readFieldValue(r4, r10)
            r12 = 1
            if (r11 <= r12) goto L62
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader1
            r12.readFieldValue(r4, r10)
            r12 = 2
            if (r11 <= r12) goto L62
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader2
            r12.readFieldValue(r4, r10)
            r12 = 3
            if (r11 <= r12) goto L62
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader3
            r12.readFieldValue(r4, r10)
            r12 = 4
            if (r11 <= r12) goto L62
            com.alibaba.fastjson2.reader.FieldReader r12 = r9.fieldReader4
            r12.readFieldValue(r4, r10)
            r12 = 5
        L5a:
            if (r12 >= r11) goto L62
            r4.skipValue()
            int r12 = r12 + 1
            goto L5a
        L62:
            java.util.function.Function r11 = r9.buildFunction
            if (r11 == 0) goto L6a
            java.lang.Object r10 = r11.apply(r10)
        L6a:
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
            boolean r0 = r11.isArray()
            if (r0 == 0) goto L53
            java.util.function.Supplier<T> r12 = r10.creator
            java.lang.Object r12 = r12.get()
            int r13 = r11.startArray()
            if (r13 <= 0) goto L49
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader0
            r0.readFieldValue(r11, r12)
            r0 = 1
            if (r13 <= r0) goto L49
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader1
            r0.readFieldValue(r11, r12)
            r0 = 2
            if (r13 <= r0) goto L49
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader2
            r0.readFieldValue(r11, r12)
            r0 = 3
            if (r13 <= r0) goto L49
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader3
            r0.readFieldValue(r11, r12)
            r0 = 4
            if (r13 <= r0) goto L49
            com.alibaba.fastjson2.reader.FieldReader r0 = r10.fieldReader4
            r0.readFieldValue(r11, r12)
            r0 = 5
        L41:
            if (r0 >= r13) goto L49
            r11.skipValue()
            int r0 = r0 + 1
            goto L41
        L49:
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto L52
            java.lang.Object r11 = r11.apply(r12)
            return r11
        L52:
            return r12
        L53:
            java.lang.Class r2 = r10.objectClass
            long r3 = r10.getTypeNameHash()
            long r0 = r10.features
            long r5 = r0 | r14
            r1 = r11
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.checkAutoType(r2, r3, r5)
            if (r0 == 0) goto L75
            java.lang.Class r1 = r0.getObjectClass()
            java.lang.Class r2 = r10.objectClass
            if (r1 == r2) goto L75
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            java.lang.Object r11 = r0.readJSONBObject(r1, r2, r3, r4)
            return r11
        L75:
            r12 = -90
            boolean r12 = r11.nextIfMatch(r12)
            if (r12 == 0) goto L162
            java.util.function.Supplier<T> r12 = r10.creator
            r2 = 0
            if (r12 == 0) goto L88
            java.lang.Object r12 = r12.get()
            goto Lad
        L88:
            com.alibaba.fastjson2.JSONReader$Context r12 = r11.context
            long r12 = r12.features
            long r12 = r12 | r14
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r6 = r0.mask
            long r12 = r12 & r6
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto Lac
            sun.misc.Unsafe r12 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.InstantiationException -> L9f
            java.lang.Class r13 = r10.objectClass     // Catch: java.lang.InstantiationException -> L9f
            java.lang.Object r12 = r12.allocateInstance(r13)     // Catch: java.lang.InstantiationException -> L9f
            goto Lad
        L9f:
            r0 = move-exception
            r12 = r0
            java.lang.String r13 = "create instance error"
            java.lang.String r11 = r11.info(r13)
            ah.a.x(r11, r12)
            r11 = 0
            return r11
        Lac:
            r12 = 0
        Lad:
            if (r12 == 0) goto Lb6
            boolean r13 = r10.hasDefaultValue
            if (r13 == 0) goto Lb6
            r10.initDefaultValue(r12)
        Lb6:
            r13 = -91
            boolean r13 = r11.nextIfMatch(r13)
            if (r13 == 0) goto Lc8
            java.util.function.Function r11 = r10.buildFunction
            if (r11 == 0) goto Lc7
            java.lang.Object r11 = r11.apply(r12)
            return r11
        Lc7:
            return r12
        Lc8:
            long r6 = r11.readFieldNameHashCode()
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 != 0) goto Ld1
            goto Lb6
        Ld1:
            long r8 = r10.hashCode0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Ldd
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r11, r12)
            goto Lb6
        Ldd:
            long r8 = r10.hashCode1
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Le9
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValue(r11, r12)
            goto Lb6
        Le9:
            long r8 = r10.hashCode2
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto Lf5
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader2
            r13.readFieldValue(r11, r12)
            goto Lb6
        Lf5:
            long r8 = r10.hashCode3
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L101
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader3
            r13.readFieldValue(r11, r12)
            goto Lb6
        L101:
            long r8 = r10.hashCode4
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L10d
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader4
            r13.readFieldValue(r11, r12)
            goto Lb6
        L10d:
            long r6 = r10.features
            long r6 = r6 | r14
            boolean r13 = r11.isSupportSmartMatch(r6)
            if (r13 != 0) goto L11a
            r10.processExtra(r11, r12, r14)
            goto Lb6
        L11a:
            long r6 = r11.getNameHashCodeLCase()
            long r8 = r10.hashCode0LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L12a
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader0
            r13.readFieldValue(r11, r12)
            goto Lb6
        L12a:
            long r8 = r10.hashCode1LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L136
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader1
            r13.readFieldValue(r11, r12)
            goto Lb6
        L136:
            long r8 = r10.hashCode2LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L143
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader2
            r13.readFieldValue(r11, r12)
            goto Lb6
        L143:
            long r8 = r10.hashCode3LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L150
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader3
            r13.readFieldValue(r11, r12)
            goto Lb6
        L150:
            long r8 = r10.hashCode4LCase
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 != 0) goto L15d
            com.alibaba.fastjson2.reader.FieldReader r13 = r10.fieldReader4
            r13.readFieldValue(r11, r12)
            goto Lb6
        L15d:
            r10.processExtra(r11, r12, r14)
            goto Lb6
        L162:
            byte r11 = r11.getType()
            java.lang.String r11 = com.alibaba.fastjson2.JSONB.typeName(r11)
            java.lang.String r12 = "expect object, but "
            ah.a.i(r11, r12)
            r11 = 0
            return r11
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
            if (r0 == 0) goto L87
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r14 = r14.mask
            long r14 = r14 & r5
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L7e
            r11.nextIfArrayStart()
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
            com.alibaba.fastjson2.reader.FieldReader r13 = r1.fieldReader2
            r13.readFieldValue(r11, r12)
            com.alibaba.fastjson2.reader.FieldReader r13 = r1.fieldReader3
            r13.readFieldValue(r11, r12)
            com.alibaba.fastjson2.reader.FieldReader r13 = r1.fieldReader4
            r13.readFieldValue(r11, r12)
            boolean r13 = r11.nextIfArrayEnd()
            if (r13 == 0) goto L73
            r11.nextIfComma()
            java.util.function.Function r11 = r1.buildFunction
            if (r11 == 0) goto L72
            java.lang.Object r11 = r11.apply(r12)
            return r11
        L72:
            return r12
        L73:
            java.lang.String r12 = "array to bean end error"
            java.lang.String r11 = r11.info(r12)
            ah.a.w(r11)
            r11 = 0
            return r11
        L7e:
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.Object r11 = r1.processObjectInputSingleItemArray(r2, r3, r4, r5)
            r12 = r1
            return r11
        L87:
            r8 = r2
            r2 = r12
            r12 = r1
            r0 = r8
            r11.nextIfObjectStart()
            java.util.function.Supplier<T> r3 = r12.creator
            java.lang.Object r7 = r3.get()
            boolean r3 = r12.hasDefaultValue
            if (r3 == 0) goto L9b
            r10.initDefaultValue(r7)
        L9b:
            if (r7 == 0) goto La9
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r3 = r3.mask
            long r3 = r3 & r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto La9
            r10.initStringFieldAsEmpty(r7)
        La9:
            r0 = 0
            r6 = r0
        Lab:
            boolean r0 = r11.nextIfObjectEnd()
            if (r0 == 0) goto Lb2
            goto Leb
        Lb2:
            long r0 = r11.readFieldNameHashCode()
            if (r6 != 0) goto Le5
            r3 = 435678704704(0x6570797440, double:2.15253880619E-312)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Le5
            long r0 = r11.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r3 = r11.context
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReaderAutoType(r0)
            if (r0 != 0) goto Ldb
            java.lang.String r0 = r11.getString()
            java.lang.Class r1 = r12.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReaderAutoType(r0, r1)
            if (r0 != 0) goto Ldb
            goto L187
        Ldb:
            if (r0 == r12) goto L187
            r1 = r11
            r3 = r13
            r4 = r14
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            goto Leb
        Le5:
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Lf8
        Leb:
            r11.nextIfComma()
            java.util.function.Function r11 = r12.buildFunction
            if (r11 == 0) goto Lf7
            java.lang.Object r11 = r11.apply(r7)
            return r11
        Lf7:
            return r7
        Lf8:
            long r3 = r12.hashCode0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L105
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader0
            r0.readFieldValue(r11, r7)
            goto L187
        L105:
            long r3 = r12.hashCode1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L112
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader1
            r0.readFieldValue(r11, r7)
            goto L187
        L112:
            long r3 = r12.hashCode2
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11f
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader2
            r0.readFieldValue(r11, r7)
            goto L187
        L11f:
            long r3 = r12.hashCode3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L12b
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader3
            r0.readFieldValue(r11, r7)
            goto L187
        L12b:
            long r3 = r12.hashCode4
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L137
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader4
            r0.readFieldValue(r11, r7)
            goto L187
        L137:
            long r0 = r12.features
            long r0 = r0 | r14
            boolean r0 = r11.isSupportSmartMatch(r0)
            if (r0 != 0) goto L144
            r10.processExtra(r11, r7, r14)
            goto L187
        L144:
            long r0 = r11.getNameHashCodeLCase()
            long r3 = r12.hashCode0LCase
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L154
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader0
            r0.readFieldValue(r11, r7)
            goto L187
        L154:
            long r3 = r12.hashCode1LCase
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L160
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader1
            r0.readFieldValue(r11, r7)
            goto L187
        L160:
            long r3 = r12.hashCode2LCase
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L16c
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader2
            r0.readFieldValue(r11, r7)
            goto L187
        L16c:
            long r3 = r12.hashCode3LCase
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L178
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader3
            r0.readFieldValue(r11, r7)
            goto L187
        L178:
            long r3 = r12.hashCode4LCase
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L184
            com.alibaba.fastjson2.reader.FieldReader r0 = r12.fieldReader4
            r0.readFieldValue(r11, r7)
            goto L187
        L184:
            r10.processExtra(r11, r7, r14)
        L187:
            int r6 = r6 + 1
            goto Lab
    }
}
