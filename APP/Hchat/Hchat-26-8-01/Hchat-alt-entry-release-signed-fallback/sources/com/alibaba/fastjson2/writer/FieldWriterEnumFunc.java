package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterEnumFunc extends com.alibaba.fastjson2.writer.FieldWriterEnum {
    final java.util.function.Function function;

    public FieldWriterEnumFunc(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Type r18, java.lang.Class r19, java.lang.reflect.Method r20, java.util.function.Function r21) {
            r11 = this;
            r9 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r12 = r21
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
