package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDateFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterDate<T> {
    final java.util.function.Function<T, java.util.Date> function;

    public FieldWriterDateFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.util.Date> r19) {
            r11 = this;
            java.lang.Class<java.util.Date> r8 = java.util.Date.class
            r9 = 0
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
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
            java.util.function.Function<T, java.util.Date> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r6, T r7) {
            r5 = this;
            java.util.function.Function<T, java.util.Date> r0 = r5.function
            java.lang.Object r7 = r0.apply(r7)
            java.util.Date r7 = (java.util.Date) r7
            r0 = 1
            if (r7 != 0) goto L26
            long r1 = r5.features
            long r3 = r6.getFeatures()
            long r1 = r1 | r3
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r3 = r7.mask
            long r1 = r1 & r3
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L24
            r5.writeFieldName(r6)
            r6.writeNull()
            return r0
        L24:
            r6 = 0
            return r6
        L26:
            long r1 = r7.getTime()
            r5.writeDate(r6, r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r4, T r5) {
            r3 = this;
            java.util.function.Function<T, java.util.Date> r0 = r3.function
            java.lang.Object r5 = r0.apply(r5)
            java.util.Date r5 = (java.util.Date) r5
            if (r5 != 0) goto Le
            r4.writeNull()
            return
        Le:
            r0 = 0
            long r1 = r5.getTime()
            r3.writeDate(r4, r0, r1)
            return
    }
}
