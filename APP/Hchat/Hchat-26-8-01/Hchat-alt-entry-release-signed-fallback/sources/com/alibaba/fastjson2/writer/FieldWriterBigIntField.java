package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigIntField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterBigIntField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
            r11 = this;
            java.lang.Class<java.math.BigInteger> r8 = java.math.BigInteger.class
            r10 = 0
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r7, T r8) {
            r6 = this;
            java.lang.Object r8 = r6.getFieldValue(r8)
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            if (r8 != 0) goto L21
            long r0 = r6.features
            long r2 = r7.getFeatures()
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r2 = r2.mask
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r4 = r4.mask
            long r2 = r2 | r4
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L21
            r7 = 0
            return r7
        L21:
            r6.writeFieldName(r7)
            long r0 = r6.features
            r7.writeBigInt(r8, r0)
            r7 = 1
            return r7
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.math.BigInteger r4 = (java.math.BigInteger) r4
            long r0 = r2.features
            r3.writeBigInt(r4, r0)
            return
    }
}
