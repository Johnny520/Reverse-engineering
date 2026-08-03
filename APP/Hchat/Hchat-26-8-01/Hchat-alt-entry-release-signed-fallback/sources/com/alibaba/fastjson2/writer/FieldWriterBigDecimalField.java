package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimalField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterBigDecimalField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
            r11 = this;
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            r10 = 0
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
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
    public boolean write(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.lang.Object r5 = r3.getFieldValue(r5)
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            if (r5 != 0) goto Ld
            boolean r4 = r3.writeFloatNull(r4)
            return r4
        Ld:
            r3.writeFieldName(r4)
            long r0 = r3.features
            java.text.DecimalFormat r2 = r3.decimalFormat
            r4.writeDecimal(r5, r0, r2)
            r4 = 1
            return r4
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.lang.Object r5 = r3.getFieldValue(r5)
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            long r0 = r3.features
            java.text.DecimalFormat r2 = r3.decimalFormat
            r4.writeDecimal(r5, r0, r2)
            return
    }
}
