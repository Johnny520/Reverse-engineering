package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatValueFunc extends com.alibaba.fastjson2.writer.FieldWriter {
    final com.alibaba.fastjson2.function.ToFloatFunction function;

    public FieldWriterFloatValueFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, com.alibaba.fastjson2.function.ToFloatFunction r19) {
            r11 = this;
            java.lang.Class r7 = java.lang.Float.TYPE
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
    public java.lang.Object getFieldValue(java.lang.Object r2) {
            r1 = this;
            com.alibaba.fastjson2.function.ToFloatFunction r0 = r1.function
            float r2 = r0.applyAsFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ToFloatFunction r0 = r1.function     // Catch: java.lang.RuntimeException -> L16
            float r3 = r0.applyAsFloat(r3)     // Catch: java.lang.RuntimeException -> L16
            r1.writeFieldName(r2)
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L11
            r2.writeFloat(r3, r0)
            goto L14
        L11:
            r2.writeFloat(r3)
        L14:
            r2 = 1
            return r2
        L16:
            r3 = move-exception
            boolean r2 = r2.isIgnoreErrorGetter()
            if (r2 == 0) goto L1f
            r2 = 0
            return r2
        L1f:
            throw r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r4, java.lang.Object r5) {
            r3 = this;
            com.alibaba.fastjson2.function.ToFloatFunction r0 = r3.function
            float r5 = r0.applyAsFloat(r5)
            java.text.DecimalFormat r0 = r3.decimalFormat
            if (r0 == 0) goto Lf
            double r1 = (double) r5
            r4.writeDouble(r1, r0)
            return
        Lf:
            double r0 = (double) r5
            r4.writeDouble(r0)
            return
    }
}
