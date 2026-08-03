package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldWriterFloatMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final boolean writeNonStringValueAsString;

    public FieldWriterFloatMethod(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
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
    public boolean write(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)     // Catch: java.lang.RuntimeException -> L29
            java.lang.Float r3 = (java.lang.Float) r3     // Catch: java.lang.RuntimeException -> L29
            if (r3 != 0) goto Ld
            boolean r2 = r1.writeFloatNull(r2)
            return r2
        Ld:
            r1.writeFieldName(r2)
            float r3 = r3.floatValue()
            java.text.DecimalFormat r0 = r1.decimalFormat
            if (r0 == 0) goto L1c
            r2.writeFloat(r3, r0)
            goto L27
        L1c:
            boolean r0 = r1.writeNonStringValueAsString
            if (r0 == 0) goto L24
            r2.writeString(r3)
            goto L27
        L24:
            r2.writeFloat(r3)
        L27:
            r2 = 1
            return r2
        L29:
            r3 = move-exception
            boolean r2 = r2.isIgnoreErrorGetter()
            if (r2 == 0) goto L32
            r2 = 0
            return r2
        L32:
            throw r3
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
