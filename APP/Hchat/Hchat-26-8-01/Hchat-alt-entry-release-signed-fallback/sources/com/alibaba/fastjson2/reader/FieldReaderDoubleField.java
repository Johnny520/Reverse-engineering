package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderDoubleField<T> extends com.alibaba.fastjson2.reader.FieldReaderObjectField<T> {
    public FieldReaderDoubleField(java.lang.String r11, java.lang.Class r12, int r13, long r14, java.lang.String r16, java.lang.Double r17, java.lang.reflect.Field r18) {
            r10 = this;
            r3 = r12
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Double r4 = com.alibaba.fastjson2.util.TypeUtils.toDouble(r4)
            java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.Exception -> La
            r0.set(r3, r4)     // Catch: java.lang.Exception -> La
            return
        La:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Double r1 = r1.readDouble()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            java.lang.Double r0 = r4.readDouble()
            java.lang.reflect.Field r1 = r3.field     // Catch: java.lang.Exception -> La
            r1.set(r5, r0)     // Catch: java.lang.Exception -> La
            return
        La:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.lang.String r1 = r3.fieldName
            java.lang.String r2 = " error"
            java.lang.String r4 = bc.e.m(r0, r1, r2, r4)
            ah.a.x(r4, r5)
            return
    }
}
