package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterFloatFunc<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.util.function.Function<T, java.lang.Float> function;

    public FieldWriterFloatFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.lang.Float> r19) {
            r11 = this;
            java.lang.Class<java.lang.Float> r8 = java.lang.Float.class
            r9 = 0
            java.lang.Class<java.lang.Float> r7 = java.lang.Float.class
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
            java.util.function.Function<T, java.lang.Float> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.util.function.Function<T, java.lang.Float> r0 = r1.function     // Catch: java.lang.RuntimeException -> L23
            java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.RuntimeException -> L23
            java.lang.Float r3 = (java.lang.Float) r3     // Catch: java.lang.RuntimeException -> L23
            if (r3 != 0) goto Lf
            boolean r2 = r1.writeFloatNull(r2)
            return r2
        Lf:
            r1.writeFieldName(r2)
            float r3 = r3.floatValue()
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L1e
            r2.writeFloat(r3, r0)
            goto L21
        L1e:
            r2.writeFloat(r3)
        L21:
            r2 = 1
            return r2
        L23:
            r3 = move-exception
            boolean r2 = r2.isIgnoreErrorGetter()
            if (r2 == 0) goto L2c
            r2 = 0
            return r2
        L2c:
            throw r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.util.function.Function<T, java.lang.Float> r0 = r1.function
            java.lang.Object r3 = r0.apply(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 != 0) goto Le
            r2.writeNumberNull()
            return
        Le:
            float r3 = r3.floatValue()
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L1a
            r2.writeFloat(r3, r0)
            return
        L1a:
            r2.writeFloat(r3)
            return
    }
}
