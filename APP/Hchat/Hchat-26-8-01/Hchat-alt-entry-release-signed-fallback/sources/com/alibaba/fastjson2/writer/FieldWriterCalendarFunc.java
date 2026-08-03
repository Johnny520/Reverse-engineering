package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCalendarFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterDate<T> {
    final java.util.function.Function<T, java.util.Calendar> function;

    public FieldWriterCalendarFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function<T, java.util.Calendar> r19) {
            r11 = this;
            java.lang.Class<java.util.Calendar> r8 = java.util.Calendar.class
            r9 = 0
            java.lang.Class<java.util.Calendar> r7 = java.util.Calendar.class
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
            java.util.function.Function<T, java.util.Calendar> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r6, T r7) {
            r5 = this;
            java.util.function.Function<T, java.util.Calendar> r0 = r5.function
            java.lang.Object r7 = r0.apply(r7)
            java.util.Calendar r7 = (java.util.Calendar) r7
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
            long r1 = r7.getTimeInMillis()
            r5.writeDate(r6, r1)
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.Function<T, java.util.Calendar> r0 = r2.function
            java.lang.Object r4 = r0.apply(r4)
            java.util.Calendar r4 = (java.util.Calendar) r4
            if (r4 != 0) goto Le
            r3.writeNull()
            return
        Le:
            long r0 = r4.getTimeInMillis()
            r4 = 0
            r2.writeDate(r3, r4, r0)
            return
    }
}
