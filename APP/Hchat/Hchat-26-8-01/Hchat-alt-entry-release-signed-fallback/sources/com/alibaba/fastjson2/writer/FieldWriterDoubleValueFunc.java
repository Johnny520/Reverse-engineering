package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleValueFunc extends com.alibaba.fastjson2.writer.FieldWriter {
    final java.util.function.ToDoubleFunction function;

    public FieldWriterDoubleValueFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.ToDoubleFunction r19) {
            r11 = this;
            java.lang.Class r7 = java.lang.Double.TYPE
            r9 = 0
            r8 = r7
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
    public java.lang.Object getFieldValue(java.lang.Object r3) {
            r2 = this;
            java.util.function.ToDoubleFunction r0 = r2.function
            double r0 = r0.applyAsDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4) {
            r2 = this;
            java.util.function.ToDoubleFunction r0 = r2.function     // Catch: java.lang.RuntimeException -> L16
            double r0 = r0.applyAsDouble(r4)     // Catch: java.lang.RuntimeException -> L16
            r2.writeFieldName(r3)
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto L11
            r3.writeDouble(r0, r4)
            goto L14
        L11:
            r3.writeDouble(r0)
        L14:
            r3 = 1
            return r3
        L16:
            r4 = move-exception
            boolean r3 = r3.isIgnoreErrorGetter()
            if (r3 == 0) goto L1f
            r3 = 0
            return r3
        L1f:
            throw r4
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, java.lang.Object r4) {
            r2 = this;
            java.util.function.ToDoubleFunction r0 = r2.function
            double r0 = r0.applyAsDouble(r4)
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto Le
            r3.writeDouble(r0, r4)
            return
        Le:
            r3.writeDouble(r0)
            return
    }
}
