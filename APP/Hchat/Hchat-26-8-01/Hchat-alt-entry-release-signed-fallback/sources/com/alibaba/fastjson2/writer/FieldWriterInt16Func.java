package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt16Func<T> extends com.alibaba.fastjson2.writer.FieldWriterInt16<T> {
    final java.util.function.Function<T, java.lang.Short> function;

    public FieldWriterInt16Func(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Method r17, java.util.function.Function<T, java.lang.Short> r18) {
            r10 = this;
            java.lang.Class<java.lang.Short> r7 = java.lang.Short.class
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
    public java.lang.Object getFieldValue(T r2) {
            r1 = this;
            java.util.function.Function<T, java.lang.Short> r0 = r1.function
            java.lang.Object r2 = r0.apply(r2)
            return r2
    }
}
