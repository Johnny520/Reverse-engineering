package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMapFunction extends com.alibaba.fastjson2.writer.FieldWriterMap {
    final java.util.function.Function function;

    public FieldWriterMapFunction(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.reflect.Type r19, java.lang.Class r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22, java.util.function.Function r23, java.lang.Class<?> r24) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r24
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            r13 = r23
            r12.function = r13
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
