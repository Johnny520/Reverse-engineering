package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMillisFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterDate<T> {
    final java.util.function.ToLongFunction function;

    public FieldWriterMillisFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.ToLongFunction r19) {
            r11 = this;
            java.lang.Class r7 = java.lang.Long.TYPE
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
    public java.lang.Object getFieldValue(T r3) {
            r2 = this;
            java.util.function.ToLongFunction r0 = r2.function
            long r0 = r0.applyAsLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.ToLongFunction r0 = r2.function
            long r0 = r0.applyAsLong(r4)
            r2.writeDate(r3, r0)
            r3 = 1
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.ToLongFunction r0 = r2.function
            long r0 = r0.applyAsLong(r4)
            r4 = 0
            r2.writeDate(r3, r4, r0)
            return
    }
}
