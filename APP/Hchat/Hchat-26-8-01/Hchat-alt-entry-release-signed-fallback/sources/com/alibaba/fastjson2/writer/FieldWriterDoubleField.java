package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDoubleField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    public FieldWriterDoubleField(java.lang.String r12, int r13, long r14, java.lang.String r16, java.lang.String r17, java.lang.reflect.Field r18) {
            r11 = this;
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            r10 = 0
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r12 = r12.mask
            long r12 = r12 & r14
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L1f
            r12 = 1
            goto L20
        L1f:
            r12 = 0
        L20:
            r11.writeNonStringValueAsString = r12
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
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            if (r4 != 0) goto Ld
            boolean r3 = r2.writeFloatNull(r3)
            return r3
        Ld:
            r2.writeFieldName(r3)
            double r0 = r4.doubleValue()
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto L1c
            r3.writeDouble(r0, r4)
            goto L27
        L1c:
            boolean r4 = r2.writeNonStringValueAsString
            if (r4 == 0) goto L24
            r3.writeString(r0)
            goto L27
        L24:
            r3.writeDouble(r0)
        L27:
            r3 = 1
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            java.lang.Object r4 = r2.getFieldValue(r4)
            java.lang.Double r4 = (java.lang.Double) r4
            if (r4 != 0) goto Lc
            r3.writeNumberNull()
            return
        Lc:
            double r0 = r4.doubleValue()
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto L18
            r3.writeDouble(r0, r4)
            return
        L18:
            r3.writeDouble(r0)
            return
    }
}
