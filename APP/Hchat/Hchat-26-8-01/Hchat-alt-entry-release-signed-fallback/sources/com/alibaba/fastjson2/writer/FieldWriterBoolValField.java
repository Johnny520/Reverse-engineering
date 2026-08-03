package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBoolValField extends com.alibaba.fastjson2.writer.FieldWriterBoolVal {
    public FieldWriterBoolValField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18, java.lang.Class r19) {
            r11 = this;
            r10 = 0
            r8 = r19
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r7 = r19
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r0.getFieldValueBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    public boolean getFieldValueBoolean(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "field.get error, "
            if (r6 == 0) goto L25
            long r1 = r5.fieldOffset     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L17
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            boolean r6 = r3.getBoolean(r6, r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r6
        L13:
            r6 = move-exception
            goto L1e
        L15:
            r6 = move-exception
            goto L1e
        L17:
            java.lang.reflect.Field r1 = r5.field     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            boolean r6 = r1.getBoolean(r6)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r6
        L1e:
            java.lang.String r1 = r5.fieldName
            ah.a.o(r0, r1, r6)
        L23:
            r6 = 0
            return r6
        L25:
            java.lang.String r6 = r5.fieldName
            ah.a.i(r6, r0)
            goto L23
    }
}
