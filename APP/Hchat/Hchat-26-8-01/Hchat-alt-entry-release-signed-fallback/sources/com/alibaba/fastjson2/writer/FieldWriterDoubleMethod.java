package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterDoubleMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    public FieldWriterDoubleMethod(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r5 = r2.mask
            long r2 = r3 & r5
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            r1.writeNonStringValueAsString = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r3) {
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
            java.lang.Object r4 = r2.getFieldValue(r4)     // Catch: java.lang.RuntimeException -> L29
            java.lang.Double r4 = (java.lang.Double) r4     // Catch: java.lang.RuntimeException -> L29
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
        L29:
            r4 = move-exception
            boolean r3 = r3.isIgnoreErrorGetter()
            if (r3 == 0) goto L32
            r3 = 0
            return r3
        L32:
            throw r4
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
