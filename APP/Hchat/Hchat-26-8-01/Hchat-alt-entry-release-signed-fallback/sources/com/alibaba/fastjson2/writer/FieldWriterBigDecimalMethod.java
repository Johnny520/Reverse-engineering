package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimalMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterBigDecimalMethod(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18, java.lang.reflect.Method r19) {
            r11 = this;
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r10 = r19
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            return r3
        L8:
            r3 = move-exception
            goto Ld
        La:
            r3 = move-exception
            goto Ld
        Lc:
            r3 = move-exception
        Ld:
            java.lang.String r0 = "invoke getter method error, "
            java.lang.String r1 = r2.fieldName
            ah.a.o(r0, r1, r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.lang.Object r5 = r3.getFieldValue(r5)     // Catch: java.lang.RuntimeException -> L19
            java.math.BigDecimal r5 = (java.math.BigDecimal) r5     // Catch: java.lang.RuntimeException -> L19
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
        L19:
            r5 = move-exception
            boolean r4 = r4.isIgnoreErrorGetter()
            if (r4 == 0) goto L22
            r4 = 0
            return r4
        L22:
            throw r5
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
