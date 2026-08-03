package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBoolField extends com.alibaba.fastjson2.writer.FieldWriterBoolean {
    public FieldWriterBoolField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18, java.lang.reflect.Method r19, java.lang.Class r20) {
            r11 = this;
            r8 = r20
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r10 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r3) {
            r2 = this;
            java.lang.String r0 = "field.get error, "
            if (r3 == 0) goto L15
            java.lang.reflect.Field r1 = r2.field     // Catch: java.lang.IllegalAccessException -> Lb java.lang.IllegalArgumentException -> Ld
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.IllegalAccessException -> Lb java.lang.IllegalArgumentException -> Ld
            return r3
        Lb:
            r3 = move-exception
            goto Le
        Ld:
            r3 = move-exception
        Le:
            java.lang.String r1 = r2.fieldName
            ah.a.o(r0, r1, r3)
        L13:
            r3 = 0
            return r3
        L15:
            java.lang.String r3 = r2.fieldName
            ah.a.i(r3, r0)
            goto L13
    }
}
