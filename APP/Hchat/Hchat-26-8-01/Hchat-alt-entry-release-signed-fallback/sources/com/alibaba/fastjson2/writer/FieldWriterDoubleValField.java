package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterDoubleValField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    public FieldWriterDoubleValField(java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.reflect.Field r16) {
            r11 = this;
            java.lang.Class r7 = java.lang.Double.TYPE
            r10 = 0
            r3 = 0
            r8 = r7
            r0 = r11
            r1 = r12
            r2 = r13
            r5 = r14
            r6 = r15
            r9 = r16
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r3) {
            r2 = this;
            double r0 = r2.getFieldValueDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
    }

    public double getFieldValueDouble(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "field.get error, "
            if (r6 == 0) goto L26
            long r1 = r5.fieldOffset     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L17
            sun.misc.Unsafe r3 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            double r0 = r3.getDouble(r6, r1)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r0
        L13:
            r6 = move-exception
            goto L1e
        L15:
            r6 = move-exception
            goto L1e
        L17:
            java.lang.reflect.Field r1 = r5.field     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            double r0 = r1.getDouble(r6)     // Catch: java.lang.IllegalAccessException -> L13 java.lang.IllegalArgumentException -> L15
            return r0
        L1e:
            java.lang.String r1 = r5.fieldName
            ah.a.o(r0, r1, r6)
        L23:
            r0 = 0
            return r0
        L26:
            java.lang.String r6 = r5.fieldName
            ah.a.i(r6, r0)
            goto L23
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            double r0 = r2.getFieldValueDouble(r4)
            r2.writeDouble(r3, r0)
            r3 = 1
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r3, T r4) {
            r2 = this;
            double r0 = r2.getFieldValueDouble(r4)
            java.text.DecimalFormat r4 = r2.decimalFormat
            if (r4 == 0) goto Lc
            r3.writeDouble(r0, r4)
            return
        Lc:
            r3.writeDouble(r0)
            return
    }
}
