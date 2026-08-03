package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterMillisMethod<T> extends com.alibaba.fastjson2.writer.FieldWriterDate<T> {
    public FieldWriterMillisMethod(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.Class r18, java.lang.reflect.Field r19, java.lang.reflect.Method r20) {
            r11 = this;
            r8 = r18
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(T r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            return r3
        L8:
            r3 = move-exception
            goto Ld
        La:
            r3 = move-exception
            goto Ld
        Lc:
            r3 = move-exception
        Ld:
            java.lang.String r0 = "invoke getter method error, "
            java.lang.String r1 = r2.fieldName
            ah.a.o(r0, r1, r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2.writeDate(r3, r0)
            r3 = 1
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r4 = 0
            r2.writeDate(r3, r4, r0)
            return
    }
}
