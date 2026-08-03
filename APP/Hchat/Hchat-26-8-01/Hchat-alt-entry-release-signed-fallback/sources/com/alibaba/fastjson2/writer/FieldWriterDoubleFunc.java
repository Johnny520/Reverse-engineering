package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleFunc<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.util.function.Function<T, java.lang.Double> function;

    public FieldWriterDoubleFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.lang.Double> r19) {
            r11 = this;
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            r9 = 0
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
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
            java.util.function.Function<T, java.lang.Double> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.Function<T, java.lang.Double> r0 = r2.function     // Catch: java.lang.RuntimeException -> L23
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.RuntimeException -> L23
            java.lang.Double r4 = (java.lang.Double) r4     // Catch: java.lang.RuntimeException -> L23
            if (r4 != 0) goto Lf
            boolean r3 = r2.writeFloatNull(r3)
            return r3
        Lf:
            r2.writeFieldName(r3)
            double r0 = r4.doubleValue()
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto L1e
            r3.writeDouble(r0, r4)
            goto L21
        L1e:
            r3.writeDouble(r0)
        L21:
            r3 = 1
            return r3
        L23:
            r4 = move-exception
            boolean r3 = r3.isIgnoreErrorGetter()
            if (r3 == 0) goto L2c
            r3 = 0
            return r3
        L2c:
            throw r4
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.Function<T, java.lang.Double> r0 = r2.function
            java.lang.Object r4 = r0.apply(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            if (r4 != 0) goto Le
            r3.writeNumberNull()
            return
        Le:
            double r0 = r4.doubleValue()
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto L1a
            r3.writeDouble(r0, r4)
            return
        L1a:
            r3.writeDouble(r0)
            return
    }
}
