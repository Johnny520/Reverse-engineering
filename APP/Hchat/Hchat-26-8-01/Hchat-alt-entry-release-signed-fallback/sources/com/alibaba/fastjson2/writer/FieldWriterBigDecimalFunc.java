package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimalFunc<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.util.function.Function<T, java.math.BigDecimal> function;

    public FieldWriterBigDecimalFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.math.BigDecimal> r19) {
            r11 = this;
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            r9 = 0
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r10 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r12 = r19
            r11.function = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r2) {
            r1 = this;
            java.util.function.Function<T, java.math.BigDecimal> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.util.function.Function<T, java.math.BigDecimal> r0 = r3.function     // Catch: java.lang.RuntimeException -> L1b
            java.lang.Object r5 = r0.apply(r5)     // Catch: java.lang.RuntimeException -> L1b
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5     // Catch: java.lang.RuntimeException -> L1b
            if (r5 != 0) goto Lf
            boolean r4 = r3.writeFloatNull(r4)
            return r4
        Lf:
            r3.writeFieldName(r4)
            long r0 = r3.features
            java.text.DecimalFormat r2 = r3.decimalFormat
            r4.writeDecimal(r5, r0, r2)
            r4 = 1
            return r4
        L1b:
            r5 = move-exception
            boolean r4 = r4.isIgnoreErrorGetter()
            if (r4 == 0) goto L24
            r4 = 0
            return r4
        L24:
            throw r5
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.util.function.Function<T, java.math.BigDecimal> r0 = r3.function
            java.lang.Object r5 = r0.apply(r5)
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5
            long r0 = r3.features
            java.text.DecimalFormat r2 = r3.decimalFormat
            r4.writeDecimal(r5, r0, r2)
            return
    }
}
