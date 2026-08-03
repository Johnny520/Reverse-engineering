package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt64ValFunc<T> extends com.alibaba.fastjson2.writer.FieldWriterInt64<T> {
    final java.util.function.ToLongFunction function;

    public FieldWriterInt64ValFunc(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Method r17, java.util.function.ToLongFunction r18) {
            r10 = this;
            java.lang.Class r7 = java.lang.Long.TYPE
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r5 = r15
            r6 = r16
            r9 = r17
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            r11 = r18
            r10.function = r11
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

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt64, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.ToLongFunction r0 = r2.function     // Catch: java.lang.RuntimeException -> Lb
            long r0 = r0.applyAsLong(r4)     // Catch: java.lang.RuntimeException -> Lb
            r2.writeInt64(r3, r0)
            r3 = 1
            return r3
        Lb:
            r4 = move-exception
            boolean r3 = r3.isIgnoreErrorGetter()
            if (r3 == 0) goto L14
            r3 = 0
            return r3
        L14:
            throw r4
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt64, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.util.function.ToLongFunction r0 = r2.function
            long r0 = r0.applyAsLong(r4)
            r3.writeInt64(r0)
            return
    }
}
