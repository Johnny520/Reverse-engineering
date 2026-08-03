package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBooleanFunc extends com.alibaba.fastjson2.writer.FieldWriterBoolean {
    final java.util.function.Function function;

    public FieldWriterBooleanFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Method r18, java.util.function.Function r19) {
            r11 = this;
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            r9 = 0
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
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
            java.util.function.Function r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }
}
