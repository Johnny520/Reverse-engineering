package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderMapField<T> extends com.alibaba.fastjson2.reader.FieldReaderObjectField<T> {
    protected final java.util.function.BiConsumer arrayToMapDuplicateHandler;
    protected final java.lang.String arrayToMapKey;
    protected final com.alibaba.fastjson2.PropertyNamingStrategy namingStrategy;
    protected final java.lang.reflect.Type valueType;

    public FieldReaderMapField(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Field r10, java.lang.String r11, java.util.function.BiConsumer r12) {
            r0 = this;
            r8 = r7
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            java.lang.reflect.Type r2 = com.alibaba.fastjson2.util.TypeUtils.getMapValueType(r3)
            r1.valueType = r2
            r1.arrayToMapKey = r11
            com.alibaba.fastjson2.PropertyNamingStrategy r2 = com.alibaba.fastjson2.PropertyNamingStrategy.of(r8)
            r1.namingStrategy = r2
            r1.arrayToMapDuplicateHandler = r12
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, byte r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, char r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, double r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, float r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, int r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, long r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, short r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r1, boolean r2) {
            r0 = this;
            super.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T r8, java.lang.Object r9, long r10) {
            r7 = this;
            java.lang.String r0 = r7.arrayToMapKey
            if (r0 == 0) goto L30
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L30
            com.alibaba.fastjson2.JSONReader$Context r0 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.getObjectReader(r0)
            java.lang.Object r0 = r0.createInstance(r10)
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r3 = r7.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r4 = r7.namingStrategy
            java.lang.reflect.Type r9 = r7.valueType
            long r5 = r7.features
            long r10 = r10 | r5
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r9, r10)
            java.util.function.BiConsumer r6 = r7.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r1, r2, r3, r4, r5, r6)
            r7.accept(r8, r1)
            return
        L30:
            super.acceptAny(r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, T r9) {
            r7 = this;
            java.lang.String r0 = r7.arrayToMapKey
            if (r0 == 0) goto L32
            boolean r0 = r8.isArray()
            if (r0 == 0) goto L32
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.getObjectReader(r8)
            long r1 = r7.features
            java.lang.Object r0 = r0.createInstance(r1)
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.reflect.Type r0 = r7.valueType
            java.util.List r2 = r8.readArray(r0)
            java.lang.String r3 = r7.arrayToMapKey
            com.alibaba.fastjson2.PropertyNamingStrategy r4 = r7.namingStrategy
            java.lang.reflect.Type r8 = r7.valueType
            long r5 = r7.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.JSONFactory.getObjectReader(r8, r5)
            java.util.function.BiConsumer r6 = r7.arrayToMapDuplicateHandler
            com.alibaba.fastjson2.reader.FieldReaderObject.arrayToMap(r1, r2, r3, r4, r5, r6)
            r7.accept(r9, r1)
            return
        L32:
            super.readFieldValue(r8, r9)
            return
    }
}
