package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderStringArray extends com.alibaba.fastjson2.reader.FieldReaderObject {
    public FieldReaderStringArray(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.reflect.Field r11, java.util.function.BiConsumer r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r1 = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplStringArray r2 = com.alibaba.fastjson2.reader.ObjectReaderImplStringArray.INSTANCE
            r1.initReader = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader.Context r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.initReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.initReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String[] r1 = r1.readStringArray()
            r0.accept(r2, r1)
            return
    }
}
