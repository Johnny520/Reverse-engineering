package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCharValFunc extends com.alibaba.fastjson2.writer.FieldWriter {
    final com.alibaba.fastjson2.function.ToCharFunction function;

    public FieldWriterCharValFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, com.alibaba.fastjson2.function.ToCharFunction r19) {
            r11 = this;
            java.lang.Class r7 = java.lang.Character.TYPE
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
            com.alibaba.fastjson2.function.ToCharFunction r0 = r1.function
            char r2 = r0.applyAsChar(r2)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ToCharFunction r0 = r1.function
            char r3 = r0.applyAsChar(r3)
            r1.writeFieldName(r2)
            r2.writeChar(r3)
            r2 = 1
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, java.lang.Object r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ToCharFunction r0 = r1.function
            char r3 = r0.applyAsChar(r3)
            r2.writeChar(r3)
            return
    }
}
