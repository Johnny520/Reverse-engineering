package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterFloatField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterFloatField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
            r11 = this;
            java.lang.Class<java.lang.Float> r8 = java.lang.Float.class
            r10 = 0
            java.lang.Class<java.lang.Float> r7 = java.lang.Float.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "field.get error, "
            if (r6 == 0) goto L2f
            long r1 = r5.fieldOffset     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L21
            java.lang.Class r1 = r5.fieldClass     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            boolean r1 = r1.isPrimitive()     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            if (r1 != 0) goto L21
            sun.misc.Unsafe r1 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            long r2 = r5.fieldOffset     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            java.lang.Object r6 = r1.getObject(r6, r2)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            return r6
        L1d:
            r6 = move-exception
            goto L28
        L1f:
            r6 = move-exception
            goto L28
        L21:
            java.lang.reflect.Field r1 = r5.field     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.IllegalAccessException -> L1d java.lang.IllegalArgumentException -> L1f
            return r6
        L28:
            java.lang.String r1 = r5.fieldName
            ah.a.o(r0, r1, r6)
        L2d:
            r6 = 0
            return r6
        L2f:
            java.lang.String r6 = r5.fieldName
            ah.a.i(r6, r0)
            goto L2d
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 != 0) goto Ld
            boolean r2 = r1.writeFloatNull(r2)
            return r2
        Ld:
            r1.writeFieldName(r2)
            float r3 = r3.floatValue()
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L1c
            r2.writeFloat(r3, r0)
            goto L1f
        L1c:
            r2.writeFloat(r3)
        L1f:
            r2 = 1
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 != 0) goto Lc
            r2.writeNumberNull()
            return
        Lc:
            float r3 = r3.floatValue()
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L18
            r2.writeFloat(r3, r0)
            return
        L18:
            r2.writeFloat(r3)
            return
    }
}
