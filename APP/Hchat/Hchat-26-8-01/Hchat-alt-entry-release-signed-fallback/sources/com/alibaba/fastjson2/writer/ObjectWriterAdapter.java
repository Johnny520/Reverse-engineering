package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterAdapter<T> implements com.alibaba.fastjson2.writer.ObjectWriter<T> {
    static final java.lang.String TYPE = "@type";
    final boolean containsNoneFieldGetter;
    final long features;
    protected final com.alibaba.fastjson2.writer.FieldWriter[] fieldWriterArray;
    final java.util.List<com.alibaba.fastjson2.writer.FieldWriter> fieldWriters;
    final boolean googleCollection;
    boolean hasFilter;
    final boolean hasValueField;
    final long[] hashCodes;
    final short[] mapping;
    com.alibaba.fastjson2.filter.NameFilter nameFilter;
    char[] nameWithColonUTF16;
    byte[] nameWithColonUTF8;
    final java.lang.Class objectClass;
    com.alibaba.fastjson2.filter.PropertyFilter propertyFilter;
    com.alibaba.fastjson2.filter.PropertyPreFilter propertyPreFilter;
    final boolean serializable;
    final java.lang.String typeKey;
    byte[] typeKeyJSONB;
    private java.lang.String typeName;
    protected long typeNameHash;
    protected byte[] typeNameJSONB;
    protected long typeNameSymbolCache;
    com.alibaba.fastjson2.filter.ValueFilter valueFilter;

    public ObjectWriterAdapter(java.lang.Class<T> r7, java.lang.String r8, java.lang.String r9, long r10, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r12) {
            r6 = this;
            r6.<init>()
            r6.objectClass = r7
            r6.typeName = r9
            if (r8 == 0) goto Lf
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L11
        Lf:
            java.lang.String r8 = "@type"
        L11:
            r6.typeKey = r8
            r6.features = r10
            r6.fieldWriters = r12
            r8 = 1
            r10 = 0
            if (r7 == 0) goto L26
            java.lang.Class<java.io.Serializable> r11 = java.io.Serializable.class
            boolean r7 = r11.isAssignableFrom(r7)
            if (r7 == 0) goto L24
            goto L26
        L24:
            r7 = r10
            goto L27
        L26:
            r7 = r8
        L27:
            r6.serializable = r7
            java.lang.String r7 = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L3c
            java.lang.String r7 = "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L3a
            goto L3c
        L3a:
            r7 = r10
            goto L3d
        L3c:
            r7 = r8
        L3d:
            r6.googleCollection = r7
            int r7 = r12.size()
            com.alibaba.fastjson2.writer.FieldWriter[] r7 = new com.alibaba.fastjson2.writer.FieldWriter[r7]
            r6.fieldWriterArray = r7
            r12.toArray(r7)
            int r9 = r7.length
            r11 = 0
            if (r9 != r8) goto L5c
            r9 = r7[r10]
            long r0 = r9.features
            r2 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 & r2
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L5c
            r9 = r8
            goto L5d
        L5c:
            r9 = r10
        L5d:
            r6.hasValueField = r9
            int r7 = r7.length
            long[] r9 = new long[r7]
            r0 = r10
            r1 = r0
        L64:
            com.alibaba.fastjson2.writer.FieldWriter[] r2 = r6.fieldWriterArray
            int r3 = r2.length
            if (r0 >= r3) goto L84
            r2 = r2[r0]
            java.lang.String r3 = r2.fieldName
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r9[r0] = r3
            java.lang.reflect.Method r3 = r2.method
            if (r3 == 0) goto L81
            long r2 = r2.features
            r4 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r2 = r2 & r4
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L81
            r1 = r8
        L81:
            int r0 = r0 + 1
            goto L64
        L84:
            r6.containsNoneFieldGetter = r1
            long[] r8 = java.util.Arrays.copyOf(r9, r7)
            r6.hashCodes = r8
            java.util.Arrays.sort(r8)
            int r8 = r8.length
            short[] r8 = new short[r8]
            r6.mapping = r8
        L94:
            if (r10 >= r7) goto La6
            r11 = r9[r10]
            long[] r8 = r6.hashCodes
            int r8 = java.util.Arrays.binarySearch(r8, r11)
            short[] r11 = r6.mapping
            short r12 = (short) r10
            r11[r8] = r12
            int r10 = r10 + 1
            goto L94
        La6:
            return
    }

    public ObjectWriterAdapter(java.lang.Class<T> r8, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r9) {
            r7 = this;
            r3 = 0
            r4 = 0
            r2 = 0
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            return
    }

    private boolean writeClassInfoSymbol(com.alibaba.fastjson2.JSONWriter r7, com.alibaba.fastjson2.SymbolTable r8) {
            r6 = this;
            int r0 = java.lang.System.identityHashCode(r8)
            long r1 = r6.typeNameSymbolCache
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 32
            r5 = -1
            if (r3 != 0) goto L21
            long r1 = r6.getTypeNameHash()
            int r8 = r8.getOrdinalByHashCode(r1)
            if (r8 == r5) goto L39
            long r1 = (long) r8
            long r1 = r1 << r4
            long r3 = (long) r0
            long r0 = r1 | r3
            r6.typeNameSymbolCache = r0
            goto L39
        L21:
            int r3 = (int) r1
            if (r3 != r0) goto L28
            long r0 = r1 >> r4
            int r8 = (int) r0
            goto L39
        L28:
            long r1 = r6.getTypeNameHash()
            int r8 = r8.getOrdinalByHashCode(r1)
            if (r8 == r5) goto L39
            long r1 = (long) r8
            long r1 = r1 << r4
            long r3 = (long) r0
            long r0 = r1 | r3
            r6.typeNameSymbolCache = r0
        L39:
            if (r8 == r5) goto L46
            r0 = -110(0xffffffffffffff92, float:NaN)
            r7.writeRaw(r0)
            int r8 = -r8
            r7.writeInt32(r8)
            r7 = 1
            return r7
        L46:
            r7 = 0
            return r7
    }

    public void errorOnNoneSerializable() {
            r3 = this;
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.Class r1 = r3.objectClass
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "not support none serializable class "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public long getFeatures() {
            r2 = this;
            long r0 = r2.features
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public com.alibaba.fastjson2.writer.FieldWriter getFieldWriter(long r2) {
            r1 = this;
            long[] r0 = r1.hashCodes
            int r2 = java.util.Arrays.binarySearch(r0, r2)
            if (r2 >= 0) goto La
            r2 = 0
            return r2
        La:
            short[] r3 = r1.mapping
            short r2 = r3[r2]
            com.alibaba.fastjson2.writer.FieldWriter[] r3 = r1.fieldWriterArray
            r2 = r3[r2]
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public java.util.List<com.alibaba.fastjson2.writer.FieldWriter> getFieldWriters() {
            r1 = this;
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r0 = r1.fieldWriters
            return r0
    }

    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.String r0 = r2.typeName
            if (r0 != 0) goto L2d
            java.lang.Class r0 = r2.objectClass
            if (r0 == 0) goto L2d
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L25
            java.lang.Class r0 = r2.objectClass
            boolean r0 = r0.isEnum()
            if (r0 != 0) goto L25
            java.lang.Class r0 = r2.objectClass
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.String r0 = r0.getName()
            r2.typeName = r0
            goto L2d
        L25:
            java.lang.Class r0 = r2.objectClass
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            r2.typeName = r0
        L2d:
            java.lang.String r0 = r2.typeName
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

    public byte[] getTypeNameJSONB() {
            r1 = this;
            byte[] r0 = r1.typeNameJSONB
            if (r0 != 0) goto L10
            java.lang.String r0 = r1.getTypeName()
            if (r0 == 0) goto L10
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            r1.typeNameJSONB = r0
        L10:
            byte[] r0 = r1.typeNameJSONB
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public final boolean hasFilter(com.alibaba.fastjson2.JSONWriter r2) {
            r1 = this;
            boolean r0 = r1.hasFilter
            if (r0 != 0) goto Lf
            boolean r0 = r1.containsNoneFieldGetter
            boolean r2 = r2.hasFilter(r0)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setNameFilter(com.alibaba.fastjson2.filter.NameFilter r1) {
            r0 = this;
            r0.nameFilter = r1
            if (r1 == 0) goto L7
            r1 = 1
            r0.hasFilter = r1
        L7:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyFilter(com.alibaba.fastjson2.filter.PropertyFilter r1) {
            r0 = this;
            r0.propertyFilter = r1
            if (r1 == 0) goto L7
            r1 = 1
            r0.hasFilter = r1
        L7:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setPropertyPreFilter(com.alibaba.fastjson2.filter.PropertyPreFilter r1) {
            r0 = this;
            r0.propertyPreFilter = r1
            if (r1 == 0) goto L7
            r1 = 1
            r0.hasFilter = r1
        L7:
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void setValueFilter(com.alibaba.fastjson2.filter.ValueFilter r1) {
            r0 = this;
            r0.valueFilter = r1
            if (r1 == 0) goto L7
            r1 = 1
            r0.hasFilter = r1
        L7:
            return
    }

    public com.alibaba.fastjson2.JSONObject toJSONObject(T r3) {
            r2 = this;
            r0 = 0
            com.alibaba.fastjson2.JSONObject r3 = r2.toJSONObject(r3, r0)
            return r3
    }

    public com.alibaba.fastjson2.JSONObject toJSONObject(T r12, long r13) {
            r11 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r1 = r11.fieldWriters
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L105
            java.lang.Object r2 = r1.next()
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            java.lang.Object r3 = r2.getFieldValue(r12)
            java.lang.Class r4 = r2.fieldClass
            long r5 = r2.features
            r7 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L5e
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L32
            java.util.Map r3 = (java.util.Map) r3
            r0.putAll(r3)
            goto Lb
        L32:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r2.getInitWriter()
            if (r4 != 0) goto L40
            com.alibaba.fastjson2.writer.ObjectWriterProvider r4 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            java.lang.Class r2 = r2.fieldClass
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r4.getObjectWriter(r2)
        L40:
            java.util.List r2 = r4.getFieldWriters()
            java.util.Iterator r2 = r2.iterator()
        L48:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb
            java.lang.Object r4 = r2.next()
            com.alibaba.fastjson2.writer.FieldWriter r4 = (com.alibaba.fastjson2.writer.FieldWriter) r4
            java.lang.Object r5 = r4.getFieldValue(r3)
            java.lang.String r4 = r4.fieldName
            r0.put(r4, r5)
            goto L48
        L5e:
            if (r3 == 0) goto La6
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto La6
            java.lang.Class r4 = r3.getClass()
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r6 = com.alibaba.fastjson2.JSONObject.class
            if (r4 == r6) goto La6
            java.lang.String r4 = "com.alibaba.fastjson.JSONObject"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto La6
            java.util.Collection r3 = (java.util.Collection) r3
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray
            int r5 = r3.size()
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L8f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto La5
            java.lang.Object r5 = r3.next()
            if (r5 != r12) goto L9d
            r5 = r0
            goto La1
        L9d:
            java.lang.Object r5 = com.alibaba.fastjson2.JSON.toJSON(r5)
        La1:
            r4.add(r5)
            goto L8f
        La5:
            r3 = r4
        La6:
            if (r3 != 0) goto Lb6
            long r4 = r11.features
            long r4 = r4 | r13
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r9 = r6.mask
            long r4 = r4 & r9
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto Lb6
            goto Lb
        Lb6:
            if (r3 != r12) goto Lb9
            r3 = r0
        Lb9:
            boolean r4 = r3 instanceof java.lang.Enum
            if (r4 == 0) goto Lcc
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumsUsingName
            long r4 = r4.mask
            long r4 = r4 & r13
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto Lcc
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.String r3 = r3.name()
        Lcc:
            boolean r4 = r2 instanceof com.alibaba.fastjson2.writer.FieldWriterObject
            if (r4 == 0) goto Lfe
            if (r3 == 0) goto Lfe
            boolean r4 = r3 instanceof java.util.Map
            if (r4 != 0) goto Lfe
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r2.getInitWriter()
            if (r4 != 0) goto Le5
            java.lang.reflect.Type r4 = r2.fieldType
            long r5 = r11.features
            long r5 = r5 | r13
            com.alibaba.fastjson2.writer.ObjectWriter r4 = com.alibaba.fastjson2.JSONFactory.getObjectWriter(r4, r5)
        Le5:
            boolean r5 = r4 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r5 == 0) goto Lfe
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r4 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r4
            java.util.List r5 = r4.getFieldWriters()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lfa
            com.alibaba.fastjson2.JSONObject r3 = r4.toJSONObject(r3)
            goto Lfe
        Lfa:
            java.lang.Object r3 = com.alibaba.fastjson2.JSON.toJSON(r3)
        Lfe:
            java.lang.String r2 = r2.fieldName
            r0.put(r2, r3)
            goto Lb
        L105:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> toMap(java.lang.Object r5) {
            r4 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r1 = r4.fieldWriters
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
        Lc:
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r2 = r4.fieldWriters
            int r2 = r2.size()
            if (r1 >= r2) goto L28
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r2 = r4.fieldWriters
            java.lang.Object r2 = r2.get(r1)
            com.alibaba.fastjson2.writer.FieldWriter r2 = (com.alibaba.fastjson2.writer.FieldWriter) r2
            java.lang.String r3 = r2.fieldName
            java.lang.Object r2 = r2.getFieldValue(r5)
            r0.put(r3, r2)
            int r1 = r1 + 1
            goto Lc
        L28:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.Class r0 = r1.objectClass
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r13, java.lang.Object r14, java.lang.Object r15, java.lang.reflect.Type r16, long r17) {
            r12 = this;
            boolean r0 = r12.hasValueField
            r1 = 0
            if (r0 == 0) goto Ld
            com.alibaba.fastjson2.writer.FieldWriter[] r15 = r12.fieldWriterArray
            r15 = r15[r1]
            r15.writeValue(r13, r14)
            return
        Ld:
            long r2 = r12.features
            long r2 = r17 | r2
            long r4 = r13.getFeatures()
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r4 = r0.mask
            long r4 = r4 & r2
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = r1
        L24:
            boolean r4 = r13.jsonb
            if (r4 == 0) goto L32
            if (r0 == 0) goto L2e
            r12.writeArrayMappingJSONB(r13, r14, r15, r16, r17)
            return
        L2e:
            r12.writeJSONB(r13, r14, r15, r16, r17)
            return
        L32:
            boolean r4 = r12.googleCollection
            if (r4 == 0) goto L45
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            com.alibaba.fastjson2.writer.ObjectWriterImplCollection r0 = com.alibaba.fastjson2.writer.ObjectWriterImplCollection.INSTANCE
            r1 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r0.write(r1, r2, r3, r4, r5)
            return
        L45:
            r8 = r17
            if (r0 == 0) goto L4d
            r12.writeArrayMapping(r13, r14, r15, r16, r17)
            return
        L4d:
            boolean r0 = r12.serializable
            if (r0 != 0) goto L6b
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable
            long r10 = r0.mask
            long r10 = r10 & r2
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L5e
            r12.errorOnNoneSerializable()
            return
        L5e:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r10 = r0.mask
            long r2 = r2 & r10
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L6b
            r13.writeNull()
            return
        L6b:
            boolean r0 = r12.hasFilter(r13)
            if (r0 == 0) goto L75
            r12.writeWithFilter(r13, r14, r15, r16, r17)
            return
        L75:
            r13.startObject()
            long r2 = r12.features
            long r2 = r2 | r8
            com.alibaba.fastjson2.JSONWriter$Feature r15 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r10 = r15.mask
            long r2 = r2 & r10
            int r15 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r15 != 0) goto L8a
            boolean r15 = r13.isWriteTypeInfo(r14, r8)
            if (r15 == 0) goto L8d
        L8a:
            r12.writeTypeInfo(r13)
        L8d:
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r15 = r12.fieldWriters
            int r15 = r15.size()
        L93:
            if (r1 >= r15) goto La3
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r0 = r12.fieldWriters
            java.lang.Object r0 = r0.get(r1)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            r0.write(r13, r14)
            int r1 = r1 + 1
            goto L93
        La3:
            r13.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            boolean r3 = r1.isWriteTypeInfo(r2, r4, r5)
            if (r3 == 0) goto L9
            r0.writeClassInfo(r1)
        L9:
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r3 = r0.fieldWriters
            int r3 = r3.size()
            r1.startArray(r3)
            r4 = 0
        L13:
            if (r4 >= r3) goto L23
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r5 = r0.fieldWriters
            java.lang.Object r5 = r5.get(r4)
            com.alibaba.fastjson2.writer.FieldWriter r5 = (com.alibaba.fastjson2.writer.FieldWriter) r5
            r5.writeValue(r1, r2)
            int r4 = r4 + 1
            goto L13
        L23:
            return
    }

    public final void writeClassInfo(com.alibaba.fastjson2.JSONWriter r4) {
            r3 = this;
            com.alibaba.fastjson2.SymbolTable r0 = r4.symbolTable
            if (r0 == 0) goto Lb
            boolean r0 = r3.writeClassInfoSymbol(r4, r0)
            if (r0 == 0) goto Lb
            return
        Lb:
            byte[] r0 = r3.getTypeNameJSONB()
            long r1 = r3.getTypeNameHash()
            r4.writeTypeName(r0, r1)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r8, java.lang.Object r9, java.lang.Object r10, java.lang.reflect.Type r11, long r12) {
            r7 = this;
            long r0 = r7.features
            long r0 = r0 | r12
            long r2 = r8.getFeatures()
            long r0 = r0 | r2
            boolean r2 = r7.serializable
            r3 = 0
            if (r2 != 0) goto L28
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.ErrorOnNoneSerializable
            long r5 = r2.mask
            long r5 = r5 & r0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L1b
            r7.errorOnNoneSerializable()
            return
        L1b:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r5 = r2.mask
            long r5 = r5 & r0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L28
            r8.writeNull()
            return
        L28:
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNoneSerializable
            long r5 = r2.mask
            long r0 = r0 & r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L36
            r7.writeWithFilter(r8, r9, r10, r11, r12)
            r8 = r7
            return
        L36:
            r10 = r9
            r9 = r8
            r8 = r7
            com.alibaba.fastjson2.writer.FieldWriter[] r0 = r8.fieldWriterArray
            int r0 = r0.length
            boolean r11 = r9.isWriteTypeInfo(r10, r11, r12)
            if (r11 == 0) goto L45
            r7.writeClassInfo(r9)
        L45:
            r9.startObject()
            r11 = 0
        L49:
            if (r11 >= r0) goto L59
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r12 = r8.fieldWriters
            java.lang.Object r12 = r12.get(r11)
            com.alibaba.fastjson2.writer.FieldWriter r12 = (com.alibaba.fastjson2.writer.FieldWriter) r12
            r12.write(r9, r10)
            int r11 = r11 + 1
            goto L49
        L59:
            r9.endObject()
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(com.alibaba.fastjson2.JSONWriter r11) {
            r10 = this;
            java.lang.String r0 = r10.getTypeName()
            boolean r1 = r11.utf8
            r2 = 58
            r3 = 0
            r4 = 1
            r5 = 34
            if (r1 == 0) goto L46
            byte[] r1 = r10.nameWithColonUTF8
            if (r1 != 0) goto L40
            java.lang.String r1 = r10.typeKey
            int r1 = r1.length()
            int r6 = r0.length()
            int r7 = r1 + r6
            int r8 = r7 + 5
            byte[] r8 = new byte[r8]
            r8[r3] = r5
            java.lang.String r9 = r10.typeKey
            r9.getBytes(r3, r1, r8, r4)
            int r9 = r1 + 1
            r8[r9] = r5
            int r9 = r1 + 2
            r8[r9] = r2
            int r2 = r1 + 3
            r8[r2] = r5
            int r1 = r1 + 4
            r0.getBytes(r3, r6, r8, r1)
            int r7 = r7 + 4
            r8[r7] = r5
            r10.nameWithColonUTF8 = r8
        L40:
            byte[] r0 = r10.nameWithColonUTF8
            r11.writeNameRaw(r0)
            return r4
        L46:
            boolean r1 = r11.utf16
            if (r1 == 0) goto L82
            char[] r1 = r10.nameWithColonUTF16
            if (r1 != 0) goto L7c
            java.lang.String r1 = r10.typeKey
            int r1 = r1.length()
            int r6 = r0.length()
            int r7 = r1 + r6
            int r8 = r7 + 5
            char[] r8 = new char[r8]
            r8[r3] = r5
            java.lang.String r9 = r10.typeKey
            r9.getChars(r3, r1, r8, r4)
            int r9 = r1 + 1
            r8[r9] = r5
            int r9 = r1 + 2
            r8[r9] = r2
            int r2 = r1 + 3
            r8[r2] = r5
            int r1 = r1 + 4
            r0.getChars(r3, r6, r8, r1)
            int r7 = r7 + 4
            r8[r7] = r5
            r10.nameWithColonUTF16 = r8
        L7c:
            char[] r0 = r10.nameWithColonUTF16
            r11.writeNameRaw(r0)
            return r4
        L82:
            boolean r1 = r11.jsonb
            if (r1 == 0) goto L9d
            byte[] r0 = r10.typeKeyJSONB
            if (r0 != 0) goto L92
            java.lang.String r0 = r10.typeKey
            byte[] r0 = com.alibaba.fastjson2.JSONB.toBytes(r0)
            r10.typeKeyJSONB = r0
        L92:
            byte[] r0 = r10.typeKeyJSONB
            r11.writeRaw(r0)
            byte[] r0 = r10.typeNameJSONB
            r11.writeRaw(r0)
            return r4
        L9d:
            java.lang.String r1 = r10.typeKey
            r11.writeString(r1)
            r11.writeColon()
            r11.writeString(r0)
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeWithFilter(com.alibaba.fastjson2.JSONWriter r44, java.lang.Object r45, java.lang.Object r46, java.lang.reflect.Type r47, long r48) {
            r43 = this;
            r1 = r43
            r3 = r44
            r9 = r45
            if (r9 != 0) goto Lc
            r3.writeNull()
            return
        Lc:
            long r4 = r1.features
            long r4 = r4 | r48
            r6 = r47
            boolean r0 = r3.isWriteTypeInfo(r9, r6, r4)
            if (r0 == 0) goto L2a
            boolean r0 = r3.jsonb
            if (r0 == 0) goto L23
            r43.writeClassInfo(r44)
            r3.startObject()
            goto L2d
        L23:
            r3.startObject()
            r43.writeTypeInfo(r44)
            goto L2d
        L2a:
            r3.startObject()
        L2d:
            com.alibaba.fastjson2.JSONWriter$Context r10 = r3.context
            long r4 = r10.getFeatures()
            long r4 = r4 | r48
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreNonFieldGetter
            long r7 = r0.mask
            long r4 = r4 & r7
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L42
            r15 = 1
            goto L43
        L42:
            r15 = 0
        L43:
            com.alibaba.fastjson2.filter.BeforeFilter r0 = r10.getBeforeFilter()
            if (r0 == 0) goto L4c
            r0.writeBefore(r3, r9)
        L4c:
            com.alibaba.fastjson2.filter.PropertyPreFilter r0 = r10.getPropertyPreFilter()
            if (r0 != 0) goto L54
            com.alibaba.fastjson2.filter.PropertyPreFilter r0 = r1.propertyPreFilter
        L54:
            r2 = r0
            com.alibaba.fastjson2.filter.NameFilter r0 = r10.getNameFilter()
            com.alibaba.fastjson2.filter.NameFilter r4 = r1.nameFilter
            if (r0 != 0) goto L5e
            goto L65
        L5e:
            if (r4 == 0) goto L64
            com.alibaba.fastjson2.filter.NameFilter r0 = com.alibaba.fastjson2.filter.NameFilter.compose(r4, r0)
        L64:
            r4 = r0
        L65:
            com.alibaba.fastjson2.filter.ContextNameFilter r5 = r10.getContextNameFilter()
            com.alibaba.fastjson2.filter.ValueFilter r0 = r10.getValueFilter()
            com.alibaba.fastjson2.filter.ValueFilter r7 = r1.valueFilter
            if (r0 != 0) goto L72
            goto L79
        L72:
            if (r7 == 0) goto L78
            com.alibaba.fastjson2.filter.ValueFilter r0 = com.alibaba.fastjson2.filter.ValueFilter.compose(r7, r0)
        L78:
            r7 = r0
        L79:
            com.alibaba.fastjson2.filter.ContextValueFilter r8 = r10.getContextValueFilter()
            com.alibaba.fastjson2.filter.PropertyFilter r0 = r10.getPropertyFilter()
            if (r0 != 0) goto L85
            com.alibaba.fastjson2.filter.PropertyFilter r0 = r1.propertyFilter
        L85:
            r16 = r11
            r11 = r0
            com.alibaba.fastjson2.filter.LabelFilter r12 = r10.getLabelFilter()
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r0 = r1.fieldWriters
            int r13 = r0.size()
            r14 = 0
        L93:
            if (r14 >= r13) goto L23e
            java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r0 = r1.fieldWriters
            java.lang.Object r0 = r0.get(r14)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            java.lang.reflect.Field r6 = r0.field
            r21 = r6
            if (r15 == 0) goto Lc0
            java.lang.reflect.Method r6 = r0.method
            r29 = r13
            r30 = r14
            if (r6 == 0) goto Lc4
            long r13 = r0.features
            r18 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r13 = r13 & r18
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 != 0) goto Lc4
        Lb5:
            r31 = r2
        Lb7:
            r1 = r4
            r18 = r5
            r20 = r7
            r21 = r8
            goto L22a
        Lc0:
            r29 = r13
            r30 = r14
        Lc4:
            java.lang.String r6 = r0.fieldName
            if (r2 == 0) goto Lcf
            boolean r13 = r2.process(r3, r9, r6)
            if (r13 != 0) goto Lcf
            goto Lb5
        Lcf:
            if (r12 == 0) goto Le2
            java.lang.String r13 = r0.label
            if (r13 == 0) goto Le2
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto Le2
            boolean r13 = r12.apply(r13)
            if (r13 != 0) goto Le2
            goto Lb5
        Le2:
            if (r4 != 0) goto Lf0
            if (r11 != 0) goto Lf0
            if (r7 != 0) goto Lf0
            if (r8 != 0) goto Lf0
            if (r5 != 0) goto Lf0
            r0.write(r3, r9)
            goto Lb5
        Lf0:
            java.lang.Object r13 = r0.getFieldValue(r9)     // Catch: java.lang.Throwable -> L213
            if (r13 != 0) goto Lfd
            boolean r14 = r3.isWriteNulls()
            if (r14 != 0) goto Lfd
            goto Lb5
        Lfd:
            if (r4 == 0) goto L104
            java.lang.String r14 = r4.process(r9, r6, r13)
            goto L105
        L104:
            r14 = r6
        L105:
            if (r5 == 0) goto L135
            com.alibaba.fastjson2.filter.BeanContext r18 = new com.alibaba.fastjson2.filter.BeanContext
            r31 = r2
            java.lang.Class r2 = r1.objectClass
            r19 = r2
            java.lang.reflect.Method r2 = r0.method
            r20 = r2
            java.lang.String r2 = r0.fieldName
            r22 = r2
            java.lang.String r2 = r0.label
            r23 = r2
            java.lang.Class r2 = r0.fieldClass
            r24 = r2
            java.lang.reflect.Type r2 = r0.fieldType
            r25 = r2
            long r2 = r0.features
            r26 = r2
            java.lang.String r2 = r0.format
            r28 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r2 = r18
            java.lang.String r14 = r5.process(r2, r9, r14, r13)
            goto L139
        L135:
            r31 = r2
            r18 = 0
        L139:
            if (r11 == 0) goto L145
            boolean r2 = r11.apply(r9, r6, r13)
            if (r2 != 0) goto L145
            r3 = r44
            goto Lb7
        L145:
            if (r14 == 0) goto L14b
            if (r14 == r6) goto L14b
            r2 = 1
            goto L14c
        L14b:
            r2 = 0
        L14c:
            if (r7 == 0) goto L153
            java.lang.Object r3 = r7.apply(r9, r6, r13)
            goto L154
        L153:
            r3 = r13
        L154:
            if (r8 == 0) goto L1a0
            if (r18 != 0) goto L197
            if (r21 != 0) goto L16b
            java.lang.reflect.Method r6 = r0.method
            if (r6 == 0) goto L16b
            java.lang.Class r6 = r1.objectClass
            r19 = r2
            java.lang.String r2 = r0.fieldName
            java.lang.reflect.Field r6 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r6, r2)
            r35 = r6
            goto L16f
        L16b:
            r19 = r2
            r35 = r21
        L16f:
            com.alibaba.fastjson2.filter.BeanContext r32 = new com.alibaba.fastjson2.filter.BeanContext
            java.lang.Class r2 = r1.objectClass
            java.lang.reflect.Method r6 = r0.method
            java.lang.String r1 = r0.fieldName
            r36 = r1
            java.lang.String r1 = r0.label
            r37 = r1
            java.lang.Class r1 = r0.fieldClass
            r38 = r1
            java.lang.reflect.Type r1 = r0.fieldType
            r39 = r1
            r33 = r2
            long r1 = r0.features
            r40 = r1
            java.lang.String r1 = r0.format
            r42 = r1
            r34 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40, r42)
            r1 = r32
            goto L19b
        L197:
            r19 = r2
            r1 = r18
        L19b:
            java.lang.Object r3 = r8.process(r1, r9, r14, r3)
            goto L1a2
        L1a0:
            r19 = r2
        L1a2:
            if (r3 == r13) goto L1d8
            if (r19 == 0) goto L1af
            r1 = r44
            r1.writeName(r14)
            r1.writeColon()
            goto L1b4
        L1af:
            r1 = r44
            r0.writeFieldName(r1)
        L1b4:
            if (r3 != 0) goto L1bc
            r1.writeNull()
            r3 = r1
            goto Lb7
        L1bc:
            java.lang.Class r2 = r3.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r1, r2)
            r6 = r3
            r3 = r1
            r1 = r4
            r4 = r6
            r6 = r47
            r18 = r5
            r20 = r7
            r21 = r8
            r5 = r46
            r7 = r48
            r2.write(r3, r4, r5, r6, r7)
            goto L22a
        L1d8:
            r3 = r44
            r1 = r4
            r18 = r5
            r20 = r7
            r21 = r8
            if (r19 != 0) goto L1e7
            r0.write(r3, r9)
            goto L22a
        L1e7:
            r3.writeName(r14)
            r3.writeColon()
            if (r13 != 0) goto L200
            java.lang.Class r2 = r0.fieldClass
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r3, r2)
            r4 = 0
            r5 = r46
            r6 = r47
            r7 = r48
            r2.write(r3, r4, r5, r6, r7)
            goto L22a
        L200:
            java.lang.Class r2 = r13.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r3, r2)
            r5 = r46
            r6 = r47
            r7 = r48
            r4 = r13
            r2.write(r3, r4, r5, r6, r7)
            goto L22a
        L213:
            r0 = move-exception
            r31 = r2
            r1 = r4
            r18 = r5
            r20 = r7
            r21 = r8
            long r4 = r10.getFeatures()
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter
            long r6 = r2.mask
            long r4 = r4 & r6
            int r2 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r2 == 0) goto L23d
        L22a:
            int r14 = r30 + 1
            r6 = r47
            r4 = r1
            r5 = r18
            r7 = r20
            r8 = r21
            r13 = r29
            r2 = r31
            r1 = r43
            goto L93
        L23d:
            throw r0
        L23e:
            com.alibaba.fastjson2.filter.AfterFilter r0 = r10.getAfterFilter()
            if (r0 == 0) goto L247
            r0.writeAfter(r3, r9)
        L247:
            r3.endObject()
            return
    }
}
