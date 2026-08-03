package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt32Field<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderInt32Field(java.lang.String r13, java.lang.Class r14, int r15, long r16, java.lang.String r18, java.lang.Integer r19, java.lang.reflect.Field r20) {
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
    public void accept(T r1, double r2) {
            r0 = this;
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, float r2) {
            r0 = this;
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Integer r0 = com.alibaba.fastjson2.util.TypeUtils.toInteger(r7)
            if (r7 != 0) goto L14
            long r1 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r3 = r7.mask
            long r1 = r1 & r3
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L14
            return
        L14:
            java.lang.reflect.Field r7 = r5.field     // Catch: java.lang.Exception -> L1a
            r7.set(r6, r0)     // Catch: java.lang.Exception -> L1a
            return
        L1a:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r7.<init>(r0)
            java.lang.String r0 = r5.fieldName
            java.lang.String r1 = " error"
            java.lang.String r7 = eh.a.r(r7, r0, r1)
            ah.a.x(r7, r6)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            java.lang.Integer r0 = r4.readInt32()
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
