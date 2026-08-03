package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt32ValFunc extends com.alibaba.fastjson2.writer.FieldWriterInt32 {
    final java.util.function.ToIntFunction function;

    public FieldWriterInt32ValFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.ToIntFunction r19) {
            r11 = this;
            java.lang.Class r7 = java.lang.Integer.TYPE
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
            java.util.function.ToIntFunction r0 = r1.function
            int r2 = r0.applyAsInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            java.util.function.ToIntFunction r0 = r1.function     // Catch: java.lang.RuntimeException -> Lb
            int r3 = r0.applyAsInt(r3)     // Catch: java.lang.RuntimeException -> Lb
            r1.writeInt32(r2, r3)
            r2 = 1
            return r2
        Lb:
            r3 = move-exception
            boolean r2 = r2.isIgnoreErrorGetter()
            if (r2 == 0) goto L14
            r2 = 0
            return r2
        L14:
            throw r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterInt32, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            java.util.function.ToIntFunction r0 = r1.function
            int r3 = r0.applyAsInt(r3)
            r2.writeInt32(r3)
            return
    }
}
