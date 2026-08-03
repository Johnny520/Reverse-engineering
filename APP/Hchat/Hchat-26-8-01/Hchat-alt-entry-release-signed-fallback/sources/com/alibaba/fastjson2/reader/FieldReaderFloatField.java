package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderFloatField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderFloatField(java.lang.String r13, java.lang.Class r14, int r15, long r16, java.lang.String r18, java.lang.Float r19, java.lang.reflect.Field r20) {
            r12 = this;
            r8 = 0
            r10 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r9 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Float r4 = com.alibaba.fastjson2.util.TypeUtils.toFloat(r4)
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

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Float r1 = r1.readFloat()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            java.lang.Float r0 = r4.readFloat()
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
