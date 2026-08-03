package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ObjectReaderBean<T> implements com.alibaba.fastjson2.reader.ObjectReader<T> {
    protected com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    protected final java.util.function.Function buildFunction;
    protected final java.util.function.Supplier<T> creator;
    protected final boolean disableSmartMatch;
    protected com.alibaba.fastjson2.reader.FieldReader extraFieldReader;
    protected final long features;
    protected boolean hasDefaultValue;
    protected final java.lang.Class objectClass;
    protected final boolean serializable;
    protected java.lang.String typeName;
    protected long typeNameHash;

    public ObjectReaderBean(java.lang.Class r5, java.util.function.Supplier<T> r6, java.lang.String r7, long r8, java.util.function.Function r10) {
            r4 = this;
            r4.<init>()
            r4.objectClass = r5
            r4.creator = r6
            r4.buildFunction = r10
            r4.features = r8
            r4.typeName = r7
            r0 = 0
            if (r7 == 0) goto L16
            long r6 = com.alibaba.fastjson2.util.Fnv.hashCode64(r7)
            goto L17
        L16:
            r6 = r0
        L17:
            r4.typeNameHash = r6
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L27
            java.lang.Class<java.io.Serializable> r10 = java.io.Serializable.class
            boolean r5 = r10.isAssignableFrom(r5)
            if (r5 == 0) goto L27
            r5 = r7
            goto L28
        L27:
            r5 = r6
        L28:
            r4.serializable = r5
            r2 = 144115188075855872(0x200000000000000, double:4.778309726736481E-299)
            long r8 = r8 & r2
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L32
            r6 = r7
        L32:
            r4.disableSmartMatch = r6
            return
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public void acceptExtra(java.lang.Object r4, java.lang.String r5, java.lang.Object r6, long r7) {
            r3 = this;
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.extraFieldReader
            if (r0 == 0) goto Lb
            if (r4 != 0) goto L7
            goto Lb
        L7:
            r0.acceptExtra(r4, r5, r6)
            return
        Lb:
            java.lang.String r0 = "is"
            boolean r0 = r5.startsWith(r0)
            if (r0 == 0) goto L30
            r0 = 2
            java.lang.String r0 = r5.substring(r0)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r0)
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.getFieldReaderLCase(r0)
            if (r0 == 0) goto L30
            java.lang.Class r1 = r0.fieldClass
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L2c
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 != r2) goto L30
        L2c:
            r0.accept(r4, r6)
            return
        L30:
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnUnknownProperties
            long r0 = r4.mask
            long r6 = r7 & r0
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L3d
            return
        L3d:
            java.lang.String r4 = "Unknown Property "
            java.lang.String r4 = r4.concat(r5)
            ah.a.w(r4)
            return
    }

    public final com.alibaba.fastjson2.reader.ObjectReader checkAutoType(com.alibaba.fastjson2.JSONReader r17, java.lang.Class r18, long r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1.nextIfMatchTypedAny()
            r8 = 0
            if (r2 == 0) goto Lb3
            long r2 = r1.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r9 = r1.context
            long r4 = r0.features
            long r4 = r19 | r4
            long r10 = r1.features(r4)
            r3 = r2
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r2 = r9.getContextAutoTypeBeforeHandler()
            java.lang.String r12 = " -> "
            java.lang.String r13 = "type not match. "
            r14 = 0
            if (r2 == 0) goto L64
            r5 = r18
            r6 = r19
            java.lang.Class r3 = r2.apply(r3, r5, r6)
            r4 = r5
            r5 = r6
            if (r3 != 0) goto L5e
            java.lang.String r3 = r1.getString()
            java.lang.Class r2 = r2.apply(r3, r4, r5)
            if (r2 == 0) goto L5f
            boolean r7 = r4.isAssignableFrom(r2)
            if (r7 != 0) goto L5f
            long r1 = r1.features(r5)
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreAutoTypeNotMatch
            long r5 = r5.mask
            long r1 = r1 & r5
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L51
            r2 = r4
            goto L5f
        L51:
            java.lang.StringBuilder r1 = bc.e.o(r13, r3, r12)
            java.lang.String r2 = r4.getName()
            ah.a.r(r1, r2)
        L5c:
            r1 = 0
            return r1
        L5e:
            r2 = r3
        L5f:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r2)
            return r1
        L64:
            r5 = r19
            r2 = r3
            r4 = r18
            com.alibaba.fastjson2.reader.ObjectReader r5 = r1.getObjectReaderAutoType(r2, r4, r5)
            if (r5 == 0) goto La9
            java.lang.Class r1 = r5.getObjectClass()
            if (r4 == 0) goto L95
            if (r1 == 0) goto L95
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 != 0) goto L95
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreAutoTypeNotMatch
            long r1 = r1.mask
            long r1 = r1 & r10
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 == 0) goto L8b
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r4)
            return r1
        L8b:
            java.lang.String r1 = r0.typeName
            java.lang.String r2 = r4.getName()
            ah.a.m(r13, r1, r12, r2)
            goto L5c
        L95:
            long r6 = r0.getTypeNameHash()
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L9e
            return r0
        L9e:
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r1 = r1.mask
            long r1 = r1 & r10
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto La8
            return r8
        La8:
            return r5
        La9:
            java.lang.String r2 = "auotype not support"
            java.lang.String r1 = r1.info(r2)
            ah.a.w(r1)
            goto L5c
        Lb3:
            return r8
    }

    public com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
            r1 = this;
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r1.autoTypeBeforeHandler
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class<T> getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.objectClass
            return r0
    }

    public java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            if (r0 != 0) goto Le
            java.lang.Class r0 = r1.objectClass
            if (r0 == 0) goto Le
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            r1.typeName = r0
        Le:
            java.lang.String r0 = r1.typeName
            return r0
    }

    public long getTypeNameHash() {
            r4 = this;
            long r0 = r4.typeNameHash
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L14
            java.lang.String r0 = r4.getTypeName()
            if (r0 == 0) goto L14
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            r4.typeNameHash = r0
        L14:
            long r0 = r4.typeNameHash
            return r0
    }

    public void initDefaultValue(T r1) {
            r0 = this;
            return
    }

    public void initStringFieldAsEmpty(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void processExtra(com.alibaba.fastjson2.JSONReader r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            r2.processExtra(r3, r4, r0)
            return
    }

    public void processExtra(com.alibaba.fastjson2.JSONReader r6, java.lang.Object r7, long r8) {
            r5 = this;
            com.alibaba.fastjson2.reader.FieldReader r0 = r5.extraFieldReader
            if (r0 == 0) goto La
            if (r7 == 0) goto La
            r0.processExtra(r6, r7)
            return
        La:
            long r0 = r5.features
            long r0 = r0 | r8
            long r0 = r6.features(r0)
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L47
            java.lang.String r0 = r6.getFieldName()
            java.lang.String r1 = "is"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L47
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r0)
            com.alibaba.fastjson2.reader.FieldReader r0 = r5.getFieldReaderLCase(r0)
            if (r0 == 0) goto L47
            if (r7 == 0) goto L47
            java.lang.Class r1 = r0.fieldClass
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r1 == r4) goto L43
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r1 != r4) goto L47
        L43:
            r0.readFieldValue(r6, r7)
            return
        L47:
            com.alibaba.fastjson2.JSONReader$Context r0 = r6.context
            com.alibaba.fastjson2.filter.ExtraProcessor r0 = r0.extraProcessor
            if (r0 == 0) goto L5d
            java.lang.String r8 = r6.getFieldName()
            java.lang.reflect.Type r9 = r0.getType(r8)
            java.lang.Object r6 = r6.read(r9)
            r0.processExtra(r7, r8, r6)
            return
        L5d:
            long r7 = r6.features(r8)
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnUnknownProperties
            long r0 = r9.mask
            long r7 = r7 & r0
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 != 0) goto L6e
            r6.skipValue()
            return
        L6e:
            java.lang.String r7 = "Unknown Property "
            java.lang.String r6 = r6.getFieldName()
            ah.a.i(r6, r7)
            return
    }

    public T processObjectInputSingleItemArray(com.alibaba.fastjson2.JSONReader r3, java.lang.reflect.Type r4, java.lang.Object r5, long r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "expect {, but [, class "
            r0.<init>(r1)
            java.lang.String r1 = r2.typeName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r5 == 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ", parent fieldName "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L26:
            java.lang.String r5 = r3.info(r0)
            long r6 = r3.features(r6)
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r0 = r0.mask
            long r6 = r6 & r0
            r0 = 0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L58
            if (r4 != 0) goto L3d
            java.lang.Class r4 = r2.objectClass
        L3d:
            java.util.List r3 = r3.readArray(r4)
            if (r3 == 0) goto L58
            int r4 = r3.size()
            if (r4 != 0) goto L4b
            r3 = 0
            return r3
        L4b:
            int r4 = r3.size()
            r6 = 1
            if (r4 != r6) goto L58
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            return r3
        L58:
            ah.a.w(r5)
            r3 = 0
            return r3
    }

    public boolean readFieldValueWithLCase(com.alibaba.fastjson2.JSONReader r1, java.lang.Object r2, long r3, long r5) {
            r0 = this;
            boolean r5 = r1.isSupportSmartMatch(r5)
            if (r5 == 0) goto L19
            long r5 = r1.getNameHashCodeLCase()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L19
            com.alibaba.fastjson2.reader.FieldReader r3 = r0.getFieldReaderLCase(r5)
            if (r3 == 0) goto L19
            r3.readFieldValue(r1, r2)
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r25, java.lang.reflect.Type r26, java.lang.Object r27, long r28) {
            r24 = this;
            r1 = r25
            r2 = r28
            boolean r0 = r1.jsonb
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r24.readJSONBObject(r25, r26, r27, r28)
            return r0
        Ld:
            boolean r0 = r1.nextIfNullOrEmptyString()
            r4 = 0
            if (r0 == 0) goto L18
            r1.nextIfComma()
            return r4
        L18:
            long r5 = r24.getFeatures()
            long r5 = r5 | r2
            long r5 = r1.features(r5)
            boolean r0 = r1.isArray()
            r7 = 0
            if (r0 == 0) goto L44
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean
            long r9 = r0.mask
            long r9 = r9 & r5
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L37
            java.lang.Object r0 = r24.readArrayMappingObject(r25, r26, r27, r28)
            return r0
        L37:
            r0 = r24
            r2 = r26
            r3 = r27
            r4 = r5
            java.lang.Object r1 = r0.processObjectInputSingleItemArray(r1, r2, r3, r4)
            r6 = r0
            return r1
        L44:
            r9 = r5
            r6 = r24
            boolean r0 = r1.nextIfObjectStart()
            if (r0 != 0) goto L74
            char r0 = r1.current()
            r5 = 116(0x74, float:1.63E-43)
            if (r0 == r5) goto L70
            r5 = 102(0x66, float:1.43E-43)
            if (r0 != r5) goto L5a
            goto L70
        L5a:
            r5 = 34
            if (r0 == r5) goto L74
            r5 = 39
            if (r0 == r5) goto L74
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto L67
            goto L74
        L67:
            java.lang.String r0 = r1.info()
            ah.a.w(r0)
        L6e:
            r0 = 0
            return r0
        L70:
            r1.readBoolValue()
            return r4
        L74:
            r0 = 0
            r5 = r4
        L76:
            boolean r11 = r1.nextIfObjectEnd()
            if (r11 == 0) goto La4
            if (r5 != 0) goto L95
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context
            long r4 = r0.features
            long r2 = r2 | r4
            java.lang.Object r5 = r6.createInstance(r2)
            if (r5 == 0) goto L95
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty
            long r2 = r0.mask
            long r2 = r2 & r9
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L95
            r6.initStringFieldAsEmpty(r5)
        L95:
            r1.nextIfComma()
            java.util.function.Function r0 = r6.getBuildFunction()
            if (r0 == 0) goto La3
            java.lang.Object r0 = r0.apply(r5)
            return r0
        La3:
            return r5
        La4:
            com.alibaba.fastjson2.JSONReader$Context r11 = r1.context
            long r12 = r1.readFieldNameHashCode()
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r14 = r6.autoTypeBeforeHandler
            if (r14 != 0) goto Lb2
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r14 = r11.getContextAutoTypeBeforeHandler()
        Lb2:
            r15 = r14
            if (r0 != 0) goto L158
            long r16 = r6.getTypeKeyHash()
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 != 0) goto L158
            long r16 = r6.getFeatures()
            long r16 = r2 | r16
            r26 = r5
            long r4 = r11.features
            long r19 = r16 | r4
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r4 = r4.mask
            long r4 = r19 & r4
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto Ld5
            if (r15 == 0) goto L15a
        Ld5:
            long r16 = r1.readTypeHashCode()
            if (r15 == 0) goto Lfa
            java.lang.Class r4 = r6.objectClass
            r18 = r4
            java.lang.Class r4 = r15.apply(r16, r18, r19)
            r21 = r16
            r7 = r19
            if (r4 != 0) goto Lfe
            java.lang.String r4 = r1.getString()
            java.lang.Class r5 = r6.objectClass
            java.lang.Class r4 = r15.apply(r4, r5, r7)
            if (r4 == 0) goto Lfe
            com.alibaba.fastjson2.reader.ObjectReader r4 = r11.getObjectReader(r4)
            goto Lff
        Lfa:
            r21 = r16
            r7 = r19
        Lfe:
            r4 = 0
        Lff:
            if (r4 != 0) goto L107
            r14 = r21
            com.alibaba.fastjson2.reader.ObjectReader r4 = r6.autoType(r11, r14)
        L107:
            if (r4 != 0) goto L132
            java.lang.String r4 = r1.getString()
            java.lang.Class r5 = r6.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r5 = r11.getObjectReaderAutoType(r4, r5, r7)
            if (r5 == 0) goto L11b
            r23 = r5
            r5 = r4
            r4 = r23
            goto L133
        L11b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "No suitable ObjectReader found for"
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.info(r0)
            ah.a.w(r0)
            goto L6e
        L132:
            r5 = 0
        L133:
            if (r4 != r6) goto L138
            r5 = r26
            goto L18a
        L138:
            com.alibaba.fastjson2.reader.FieldReader r7 = r4.getFieldReader(r12)
            if (r7 == 0) goto L144
            if (r5 != 0) goto L144
            java.lang.String r5 = r1.getString()
        L144:
            r8 = r5
            long r9 = r6.getFeatures()
            long r2 = r2 | r9
            r0 = r4
            r4 = r2
            r2 = 0
            r3 = 0
            java.lang.Object r0 = r0.readObject(r1, r2, r3, r4)
            if (r7 == 0) goto L157
            r7.accept(r0, r8)
        L157:
            return r0
        L158:
            r26 = r5
        L15a:
            com.alibaba.fastjson2.reader.FieldReader r4 = r6.getFieldReader(r12)
            if (r4 != 0) goto L173
            long r7 = r6.getFeatures()
            long r7 = r7 | r2
            boolean r5 = r1.isSupportSmartMatch(r7)
            if (r5 == 0) goto L173
            long r4 = r1.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r4 = r6.getFieldReaderLCase(r4)
        L173:
            if (r26 != 0) goto L17f
            com.alibaba.fastjson2.JSONReader$Context r5 = r1.context
            long r7 = r5.features
            long r7 = r7 | r2
            java.lang.Object r5 = r6.createInstance(r7)
            goto L181
        L17f:
            r5 = r26
        L181:
            if (r4 != 0) goto L187
            r6.processExtra(r1, r5, r2)
            goto L18a
        L187:
            r4.readFieldValue(r1, r5)
        L18a:
            int r0 = r0 + 1
            r4 = 0
            r7 = 0
            goto L76
    }

    public void readObject(com.alibaba.fastjson2.JSONReader r4, java.lang.Object r5, long r6) {
            r3 = this;
            boolean r0 = r4.nextIfNull()
            if (r0 == 0) goto La
            r4.nextIfComma()
            return
        La:
            boolean r0 = r4.nextIfObjectStart()
            if (r0 == 0) goto L41
        L10:
            boolean r0 = r4.nextIfObjectEnd()
            if (r0 == 0) goto L1a
            r4.nextIfComma()
            return
        L1a:
            long r0 = r4.readFieldNameHashCode()
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.getFieldReader(r0)
            if (r0 != 0) goto L37
            long r1 = r3.getFeatures()
            long r1 = r1 | r6
            boolean r1 = r4.isSupportSmartMatch(r1)
            if (r1 == 0) goto L37
            long r0 = r4.getNameHashCodeLCase()
            com.alibaba.fastjson2.reader.FieldReader r0 = r3.getFieldReaderLCase(r0)
        L37:
            if (r0 != 0) goto L3d
            r3.processExtra(r4, r5, r6)
            goto L10
        L3d:
            r0.readFieldValue(r4, r5)
            goto L10
        L41:
            java.lang.String r4 = r4.info()
            ah.a.w(r4)
            return
    }

    public void setAutoTypeBeforeHandler(com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler r1) {
            r0 = this;
            r0.autoTypeBeforeHandler = r1
            return
    }
}
